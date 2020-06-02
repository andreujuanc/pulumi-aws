// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DocDB
{
    /// <summary>
    /// Manages a DocDB Cluster.
    /// 
    /// Changes to a DocDB Cluster can occur when you manually change a
    /// parameter, such as `port`, and are reflected in the next maintenance
    /// window. Because of this, this provider may report a difference in its planning
    /// phase because a modification has not yet taken place. You can use the
    /// `apply_immediately` flag to instruct the service to apply the change immediately
    /// (see documentation below).
    /// 
    /// &gt; **Note:** using `apply_immediately` can result in a brief downtime as the server reboots.
    /// &gt; **Note:** All arguments including the username and password will be stored in the raw state as plain-text.
    /// [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var docdb = new Aws.DocDB.Cluster("docdb", new Aws.DocDB.ClusterArgs
    ///         {
    ///             BackupRetentionPeriod = 5,
    ///             ClusterIdentifier = "my-docdb-cluster",
    ///             Engine = "docdb",
    ///             MasterPassword = "mustbeeightchars",
    ///             MasterUsername = "foo",
    ///             PreferredBackupWindow = "07:00-09:00",
    ///             SkipFinalSnapshot = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Cluster : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether any cluster modifications
        /// are applied immediately, or during the next maintenance window. Default is
        /// `false`.
        /// </summary>
        [Output("applyImmediately")]
        public Output<bool> ApplyImmediately { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of cluster
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// A list of EC2 Availability Zones that
        /// instances in the DB cluster can be created in.
        /// </summary>
        [Output("availabilityZones")]
        public Output<ImmutableArray<string>> AvailabilityZones { get; private set; } = null!;

        /// <summary>
        /// The days to retain backups for. Default `1`
        /// </summary>
        [Output("backupRetentionPeriod")]
        public Output<int?> BackupRetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// The cluster identifier. If omitted, this provider will assign a random, unique identifier.
        /// </summary>
        [Output("clusterIdentifier")]
        public Output<string> ClusterIdentifier { get; private set; } = null!;

        /// <summary>
        /// Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
        /// </summary>
        [Output("clusterIdentifierPrefix")]
        public Output<string> ClusterIdentifierPrefix { get; private set; } = null!;

        /// <summary>
        /// List of DocDB Instances that are a part of this cluster
        /// </summary>
        [Output("clusterMembers")]
        public Output<ImmutableArray<string>> ClusterMembers { get; private set; } = null!;

        /// <summary>
        /// The DocDB Cluster Resource ID
        /// </summary>
        [Output("clusterResourceId")]
        public Output<string> ClusterResourceId { get; private set; } = null!;

        /// <summary>
        /// A cluster parameter group to associate with the cluster.
        /// </summary>
        [Output("dbClusterParameterGroupName")]
        public Output<string> DbClusterParameterGroupName { get; private set; } = null!;

        /// <summary>
        /// A DB subnet group to associate with this DB instance.
        /// </summary>
        [Output("dbSubnetGroupName")]
        public Output<string> DbSubnetGroupName { get; private set; } = null!;

        /// <summary>
        /// A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
        /// </summary>
        [Output("deletionProtection")]
        public Output<bool?> DeletionProtection { get; private set; } = null!;

        /// <summary>
        /// List of log types to export to cloudwatch. If omitted, no logs will be exported.
        /// The following log types are supported: `audit`, `profiler`.
        /// </summary>
        [Output("enabledCloudwatchLogsExports")]
        public Output<ImmutableArray<string>> EnabledCloudwatchLogsExports { get; private set; } = null!;

        /// <summary>
        /// The DNS address of the DocDB instance
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
        /// </summary>
        [Output("engine")]
        public Output<string?> Engine { get; private set; } = null!;

        /// <summary>
        /// The database engine version. Updating this argument results in an outage.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// The name of your final DB snapshot
        /// when this DB cluster is deleted. If omitted, no final snapshot will be
        /// made.
        /// </summary>
        [Output("finalSnapshotIdentifier")]
        public Output<string?> FinalSnapshotIdentifier { get; private set; } = null!;

        /// <summary>
        /// The Route53 Hosted Zone ID of the endpoint
        /// </summary>
        [Output("hostedZoneId")]
        public Output<string> HostedZoneId { get; private set; } = null!;

        /// <summary>
        /// The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Password for the master DB user. Note that this may
        /// show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
        /// </summary>
        [Output("masterPassword")]
        public Output<string?> MasterPassword { get; private set; } = null!;

        /// <summary>
        /// Username for the master DB user. 
        /// </summary>
        [Output("masterUsername")]
        public Output<string> MasterUsername { get; private set; } = null!;

        /// <summary>
        /// The port on which the DB accepts connections
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
        /// Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
        /// </summary>
        [Output("preferredBackupWindow")]
        public Output<string> PreferredBackupWindow { get; private set; } = null!;

        [Output("preferredMaintenanceWindow")]
        public Output<string> PreferredMaintenanceWindow { get; private set; } = null!;

        /// <summary>
        /// A read-only endpoint for the DocDB cluster, automatically load-balanced across replicas
        /// </summary>
        [Output("readerEndpoint")]
        public Output<string> ReaderEndpoint { get; private set; } = null!;

        /// <summary>
        /// Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
        /// </summary>
        [Output("skipFinalSnapshot")]
        public Output<bool?> SkipFinalSnapshot { get; private set; } = null!;

        /// <summary>
        /// Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
        /// </summary>
        [Output("snapshotIdentifier")]
        public Output<string?> SnapshotIdentifier { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the DB cluster is encrypted. The default is `false`.
        /// </summary>
        [Output("storageEncrypted")]
        public Output<bool?> StorageEncrypted { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the DB cluster.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// List of VPC security groups to associate
        /// with the Cluster
        /// </summary>
        [Output("vpcSecurityGroupIds")]
        public Output<ImmutableArray<string>> VpcSecurityGroupIds { get; private set; } = null!;


        /// <summary>
        /// Create a Cluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Cluster(string name, ClusterArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:docdb/cluster:Cluster", name, args ?? new ClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Cluster(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
            : base("aws:docdb/cluster:Cluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Cluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Cluster Get(string name, Input<string> id, ClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new Cluster(name, id, state, options);
        }
    }

    public sealed class ClusterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether any cluster modifications
        /// are applied immediately, or during the next maintenance window. Default is
        /// `false`.
        /// </summary>
        [Input("applyImmediately")]
        public Input<bool>? ApplyImmediately { get; set; }

        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// A list of EC2 Availability Zones that
        /// instances in the DB cluster can be created in.
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// The days to retain backups for. Default `1`
        /// </summary>
        [Input("backupRetentionPeriod")]
        public Input<int>? BackupRetentionPeriod { get; set; }

        /// <summary>
        /// The cluster identifier. If omitted, this provider will assign a random, unique identifier.
        /// </summary>
        [Input("clusterIdentifier")]
        public Input<string>? ClusterIdentifier { get; set; }

        /// <summary>
        /// Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
        /// </summary>
        [Input("clusterIdentifierPrefix")]
        public Input<string>? ClusterIdentifierPrefix { get; set; }

        [Input("clusterMembers")]
        private InputList<string>? _clusterMembers;

        /// <summary>
        /// List of DocDB Instances that are a part of this cluster
        /// </summary>
        public InputList<string> ClusterMembers
        {
            get => _clusterMembers ?? (_clusterMembers = new InputList<string>());
            set => _clusterMembers = value;
        }

        /// <summary>
        /// A cluster parameter group to associate with the cluster.
        /// </summary>
        [Input("dbClusterParameterGroupName")]
        public Input<string>? DbClusterParameterGroupName { get; set; }

        /// <summary>
        /// A DB subnet group to associate with this DB instance.
        /// </summary>
        [Input("dbSubnetGroupName")]
        public Input<string>? DbSubnetGroupName { get; set; }

        /// <summary>
        /// A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
        /// </summary>
        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        [Input("enabledCloudwatchLogsExports")]
        private InputList<string>? _enabledCloudwatchLogsExports;

        /// <summary>
        /// List of log types to export to cloudwatch. If omitted, no logs will be exported.
        /// The following log types are supported: `audit`, `profiler`.
        /// </summary>
        public InputList<string> EnabledCloudwatchLogsExports
        {
            get => _enabledCloudwatchLogsExports ?? (_enabledCloudwatchLogsExports = new InputList<string>());
            set => _enabledCloudwatchLogsExports = value;
        }

        /// <summary>
        /// The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// The database engine version. Updating this argument results in an outage.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// The name of your final DB snapshot
        /// when this DB cluster is deleted. If omitted, no final snapshot will be
        /// made.
        /// </summary>
        [Input("finalSnapshotIdentifier")]
        public Input<string>? FinalSnapshotIdentifier { get; set; }

        /// <summary>
        /// The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Password for the master DB user. Note that this may
        /// show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
        /// </summary>
        [Input("masterPassword")]
        public Input<string>? MasterPassword { get; set; }

        /// <summary>
        /// Username for the master DB user. 
        /// </summary>
        [Input("masterUsername")]
        public Input<string>? MasterUsername { get; set; }

        /// <summary>
        /// The port on which the DB accepts connections
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
        /// Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
        /// </summary>
        [Input("preferredBackupWindow")]
        public Input<string>? PreferredBackupWindow { get; set; }

        [Input("preferredMaintenanceWindow")]
        public Input<string>? PreferredMaintenanceWindow { get; set; }

        /// <summary>
        /// Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
        /// </summary>
        [Input("skipFinalSnapshot")]
        public Input<bool>? SkipFinalSnapshot { get; set; }

        /// <summary>
        /// Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
        /// </summary>
        [Input("snapshotIdentifier")]
        public Input<string>? SnapshotIdentifier { get; set; }

        /// <summary>
        /// Specifies whether the DB cluster is encrypted. The default is `false`.
        /// </summary>
        [Input("storageEncrypted")]
        public Input<bool>? StorageEncrypted { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A map of tags to assign to the DB cluster.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("vpcSecurityGroupIds")]
        private InputList<string>? _vpcSecurityGroupIds;

        /// <summary>
        /// List of VPC security groups to associate
        /// with the Cluster
        /// </summary>
        public InputList<string> VpcSecurityGroupIds
        {
            get => _vpcSecurityGroupIds ?? (_vpcSecurityGroupIds = new InputList<string>());
            set => _vpcSecurityGroupIds = value;
        }

        public ClusterArgs()
        {
        }
    }

    public sealed class ClusterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether any cluster modifications
        /// are applied immediately, or during the next maintenance window. Default is
        /// `false`.
        /// </summary>
        [Input("applyImmediately")]
        public Input<bool>? ApplyImmediately { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of cluster
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// A list of EC2 Availability Zones that
        /// instances in the DB cluster can be created in.
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// The days to retain backups for. Default `1`
        /// </summary>
        [Input("backupRetentionPeriod")]
        public Input<int>? BackupRetentionPeriod { get; set; }

        /// <summary>
        /// The cluster identifier. If omitted, this provider will assign a random, unique identifier.
        /// </summary>
        [Input("clusterIdentifier")]
        public Input<string>? ClusterIdentifier { get; set; }

        /// <summary>
        /// Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
        /// </summary>
        [Input("clusterIdentifierPrefix")]
        public Input<string>? ClusterIdentifierPrefix { get; set; }

        [Input("clusterMembers")]
        private InputList<string>? _clusterMembers;

        /// <summary>
        /// List of DocDB Instances that are a part of this cluster
        /// </summary>
        public InputList<string> ClusterMembers
        {
            get => _clusterMembers ?? (_clusterMembers = new InputList<string>());
            set => _clusterMembers = value;
        }

        /// <summary>
        /// The DocDB Cluster Resource ID
        /// </summary>
        [Input("clusterResourceId")]
        public Input<string>? ClusterResourceId { get; set; }

        /// <summary>
        /// A cluster parameter group to associate with the cluster.
        /// </summary>
        [Input("dbClusterParameterGroupName")]
        public Input<string>? DbClusterParameterGroupName { get; set; }

        /// <summary>
        /// A DB subnet group to associate with this DB instance.
        /// </summary>
        [Input("dbSubnetGroupName")]
        public Input<string>? DbSubnetGroupName { get; set; }

        /// <summary>
        /// A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
        /// </summary>
        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        [Input("enabledCloudwatchLogsExports")]
        private InputList<string>? _enabledCloudwatchLogsExports;

        /// <summary>
        /// List of log types to export to cloudwatch. If omitted, no logs will be exported.
        /// The following log types are supported: `audit`, `profiler`.
        /// </summary>
        public InputList<string> EnabledCloudwatchLogsExports
        {
            get => _enabledCloudwatchLogsExports ?? (_enabledCloudwatchLogsExports = new InputList<string>());
            set => _enabledCloudwatchLogsExports = value;
        }

        /// <summary>
        /// The DNS address of the DocDB instance
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// The database engine version. Updating this argument results in an outage.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// The name of your final DB snapshot
        /// when this DB cluster is deleted. If omitted, no final snapshot will be
        /// made.
        /// </summary>
        [Input("finalSnapshotIdentifier")]
        public Input<string>? FinalSnapshotIdentifier { get; set; }

        /// <summary>
        /// The Route53 Hosted Zone ID of the endpoint
        /// </summary>
        [Input("hostedZoneId")]
        public Input<string>? HostedZoneId { get; set; }

        /// <summary>
        /// The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Password for the master DB user. Note that this may
        /// show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
        /// </summary>
        [Input("masterPassword")]
        public Input<string>? MasterPassword { get; set; }

        /// <summary>
        /// Username for the master DB user. 
        /// </summary>
        [Input("masterUsername")]
        public Input<string>? MasterUsername { get; set; }

        /// <summary>
        /// The port on which the DB accepts connections
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
        /// Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
        /// </summary>
        [Input("preferredBackupWindow")]
        public Input<string>? PreferredBackupWindow { get; set; }

        [Input("preferredMaintenanceWindow")]
        public Input<string>? PreferredMaintenanceWindow { get; set; }

        /// <summary>
        /// A read-only endpoint for the DocDB cluster, automatically load-balanced across replicas
        /// </summary>
        [Input("readerEndpoint")]
        public Input<string>? ReaderEndpoint { get; set; }

        /// <summary>
        /// Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
        /// </summary>
        [Input("skipFinalSnapshot")]
        public Input<bool>? SkipFinalSnapshot { get; set; }

        /// <summary>
        /// Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
        /// </summary>
        [Input("snapshotIdentifier")]
        public Input<string>? SnapshotIdentifier { get; set; }

        /// <summary>
        /// Specifies whether the DB cluster is encrypted. The default is `false`.
        /// </summary>
        [Input("storageEncrypted")]
        public Input<bool>? StorageEncrypted { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A map of tags to assign to the DB cluster.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("vpcSecurityGroupIds")]
        private InputList<string>? _vpcSecurityGroupIds;

        /// <summary>
        /// List of VPC security groups to associate
        /// with the Cluster
        /// </summary>
        public InputList<string> VpcSecurityGroupIds
        {
            get => _vpcSecurityGroupIds ?? (_vpcSecurityGroupIds = new InputList<string>());
            set => _vpcSecurityGroupIds = value;
        }

        public ClusterState()
        {
        }
    }
}