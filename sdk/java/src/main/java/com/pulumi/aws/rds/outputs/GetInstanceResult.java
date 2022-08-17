// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * @return The hostname of the RDS instance. See also `endpoint` and `port`.
     * 
     */
    private final String address;
    /**
     * @return Specifies the allocated storage size specified in gigabytes.
     * 
     */
    private final Integer allocatedStorage;
    /**
     * @return Indicates that minor version patches are applied automatically.
     * 
     */
    private final Boolean autoMinorVersionUpgrade;
    /**
     * @return Specifies the name of the Availability Zone the DB instance is located in.
     * 
     */
    private final String availabilityZone;
    /**
     * @return Specifies the number of days for which automatic DB snapshots are retained.
     * 
     */
    private final Integer backupRetentionPeriod;
    /**
     * @return Specifies the identifier of the CA certificate for the DB instance.
     * 
     */
    private final String caCertIdentifier;
    /**
     * @return If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
     * 
     */
    private final String dbClusterIdentifier;
    /**
     * @return The Amazon Resource Name (ARN) for the DB instance.
     * 
     */
    private final String dbInstanceArn;
    /**
     * @return Contains the name of the compute and memory capacity class of the DB instance.
     * 
     */
    private final String dbInstanceClass;
    private final String dbInstanceIdentifier;
    /**
     * @return Specifies the port that the DB instance listens on.
     * 
     */
    private final Integer dbInstancePort;
    /**
     * @return Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.
     * 
     */
    private final String dbName;
    /**
     * @return Provides the list of DB parameter groups applied to this DB instance.
     * 
     */
    private final List<String> dbParameterGroups;
    /**
     * @return Provides List of DB security groups associated to this DB instance.
     * 
     */
    private final List<String> dbSecurityGroups;
    /**
     * @return Specifies the name of the subnet group associated with the DB instance.
     * 
     */
    private final String dbSubnetGroup;
    /**
     * @return List of log types to export to cloudwatch.
     * 
     */
    private final List<String> enabledCloudwatchLogsExports;
    /**
     * @return The connection endpoint in `address:port` format.
     * 
     */
    private final String endpoint;
    /**
     * @return Provides the name of the database engine to be used for this DB instance.
     * 
     */
    private final String engine;
    /**
     * @return Indicates the database engine version.
     * 
     */
    private final String engineVersion;
    /**
     * @return The canonical hosted zone ID of the DB instance (to be used in a Route 53 Alias record).
     * 
     */
    private final String hostedZoneId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Specifies the Provisioned IOPS (I/O operations per second) value.
     * 
     */
    private final Integer iops;
    /**
     * @return If StorageEncrypted is true, the KMS key identifier for the encrypted DB instance.
     * 
     */
    private final String kmsKeyId;
    /**
     * @return License model information for this DB instance.
     * 
     */
    private final String licenseModel;
    /**
     * @return Contains the master username for the DB instance.
     * 
     */
    private final String masterUsername;
    /**
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
     * 
     */
    private final Integer monitoringInterval;
    /**
     * @return The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to CloudWatch Logs.
     * 
     */
    private final String monitoringRoleArn;
    /**
     * @return Specifies if the DB instance is a Multi-AZ deployment.
     * 
     */
    private final Boolean multiAz;
    /**
     * @return Provides the list of option group memberships for this DB instance.
     * 
     */
    private final List<String> optionGroupMemberships;
    /**
     * @return The database port.
     * 
     */
    private final Integer port;
    /**
     * @return Specifies the daily time range during which automated backups are created.
     * 
     */
    private final String preferredBackupWindow;
    /**
     * @return Specifies the weekly time range during which system maintenance can occur in UTC.
     * 
     */
    private final String preferredMaintenanceWindow;
    /**
     * @return Specifies the accessibility options for the DB instance.
     * 
     */
    private final Boolean publiclyAccessible;
    /**
     * @return The identifier of the source DB that this is a replica of.
     * 
     */
    private final String replicateSourceDb;
    /**
     * @return The RDS Resource ID of this instance.
     * 
     */
    private final String resourceId;
    /**
     * @return Specifies whether the DB instance is encrypted.
     * 
     */
    private final Boolean storageEncrypted;
    /**
     * @return Specifies the storage type associated with DB instance.
     * 
     */
    private final String storageType;
    private final Map<String,String> tags;
    /**
     * @return The time zone of the DB instance.
     * 
     */
    private final String timezone;
    /**
     * @return Provides a list of VPC security group elements that the DB instance belongs to.
     * 
     */
    private final List<String> vpcSecurityGroups;

    @CustomType.Constructor
    private GetInstanceResult(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("allocatedStorage") Integer allocatedStorage,
        @CustomType.Parameter("autoMinorVersionUpgrade") Boolean autoMinorVersionUpgrade,
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("backupRetentionPeriod") Integer backupRetentionPeriod,
        @CustomType.Parameter("caCertIdentifier") String caCertIdentifier,
        @CustomType.Parameter("dbClusterIdentifier") String dbClusterIdentifier,
        @CustomType.Parameter("dbInstanceArn") String dbInstanceArn,
        @CustomType.Parameter("dbInstanceClass") String dbInstanceClass,
        @CustomType.Parameter("dbInstanceIdentifier") String dbInstanceIdentifier,
        @CustomType.Parameter("dbInstancePort") Integer dbInstancePort,
        @CustomType.Parameter("dbName") String dbName,
        @CustomType.Parameter("dbParameterGroups") List<String> dbParameterGroups,
        @CustomType.Parameter("dbSecurityGroups") List<String> dbSecurityGroups,
        @CustomType.Parameter("dbSubnetGroup") String dbSubnetGroup,
        @CustomType.Parameter("enabledCloudwatchLogsExports") List<String> enabledCloudwatchLogsExports,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("engineVersion") String engineVersion,
        @CustomType.Parameter("hostedZoneId") String hostedZoneId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("iops") Integer iops,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("licenseModel") String licenseModel,
        @CustomType.Parameter("masterUsername") String masterUsername,
        @CustomType.Parameter("monitoringInterval") Integer monitoringInterval,
        @CustomType.Parameter("monitoringRoleArn") String monitoringRoleArn,
        @CustomType.Parameter("multiAz") Boolean multiAz,
        @CustomType.Parameter("optionGroupMemberships") List<String> optionGroupMemberships,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("preferredBackupWindow") String preferredBackupWindow,
        @CustomType.Parameter("preferredMaintenanceWindow") String preferredMaintenanceWindow,
        @CustomType.Parameter("publiclyAccessible") Boolean publiclyAccessible,
        @CustomType.Parameter("replicateSourceDb") String replicateSourceDb,
        @CustomType.Parameter("resourceId") String resourceId,
        @CustomType.Parameter("storageEncrypted") Boolean storageEncrypted,
        @CustomType.Parameter("storageType") String storageType,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("timezone") String timezone,
        @CustomType.Parameter("vpcSecurityGroups") List<String> vpcSecurityGroups) {
        this.address = address;
        this.allocatedStorage = allocatedStorage;
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.availabilityZone = availabilityZone;
        this.backupRetentionPeriod = backupRetentionPeriod;
        this.caCertIdentifier = caCertIdentifier;
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.dbInstanceArn = dbInstanceArn;
        this.dbInstanceClass = dbInstanceClass;
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        this.dbInstancePort = dbInstancePort;
        this.dbName = dbName;
        this.dbParameterGroups = dbParameterGroups;
        this.dbSecurityGroups = dbSecurityGroups;
        this.dbSubnetGroup = dbSubnetGroup;
        this.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
        this.endpoint = endpoint;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.hostedZoneId = hostedZoneId;
        this.id = id;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.licenseModel = licenseModel;
        this.masterUsername = masterUsername;
        this.monitoringInterval = monitoringInterval;
        this.monitoringRoleArn = monitoringRoleArn;
        this.multiAz = multiAz;
        this.optionGroupMemberships = optionGroupMemberships;
        this.port = port;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.publiclyAccessible = publiclyAccessible;
        this.replicateSourceDb = replicateSourceDb;
        this.resourceId = resourceId;
        this.storageEncrypted = storageEncrypted;
        this.storageType = storageType;
        this.tags = tags;
        this.timezone = timezone;
        this.vpcSecurityGroups = vpcSecurityGroups;
    }

    /**
     * @return The hostname of the RDS instance. See also `endpoint` and `port`.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Specifies the allocated storage size specified in gigabytes.
     * 
     */
    public Integer allocatedStorage() {
        return this.allocatedStorage;
    }
    /**
     * @return Indicates that minor version patches are applied automatically.
     * 
     */
    public Boolean autoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    /**
     * @return Specifies the name of the Availability Zone the DB instance is located in.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * @return Specifies the number of days for which automatic DB snapshots are retained.
     * 
     */
    public Integer backupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }
    /**
     * @return Specifies the identifier of the CA certificate for the DB instance.
     * 
     */
    public String caCertIdentifier() {
        return this.caCertIdentifier;
    }
    /**
     * @return If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
     * 
     */
    public String dbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }
    /**
     * @return The Amazon Resource Name (ARN) for the DB instance.
     * 
     */
    public String dbInstanceArn() {
        return this.dbInstanceArn;
    }
    /**
     * @return Contains the name of the compute and memory capacity class of the DB instance.
     * 
     */
    public String dbInstanceClass() {
        return this.dbInstanceClass;
    }
    public String dbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }
    /**
     * @return Specifies the port that the DB instance listens on.
     * 
     */
    public Integer dbInstancePort() {
        return this.dbInstancePort;
    }
    /**
     * @return Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.
     * 
     */
    public String dbName() {
        return this.dbName;
    }
    /**
     * @return Provides the list of DB parameter groups applied to this DB instance.
     * 
     */
    public List<String> dbParameterGroups() {
        return this.dbParameterGroups;
    }
    /**
     * @return Provides List of DB security groups associated to this DB instance.
     * 
     */
    public List<String> dbSecurityGroups() {
        return this.dbSecurityGroups;
    }
    /**
     * @return Specifies the name of the subnet group associated with the DB instance.
     * 
     */
    public String dbSubnetGroup() {
        return this.dbSubnetGroup;
    }
    /**
     * @return List of log types to export to cloudwatch.
     * 
     */
    public List<String> enabledCloudwatchLogsExports() {
        return this.enabledCloudwatchLogsExports;
    }
    /**
     * @return The connection endpoint in `address:port` format.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Provides the name of the database engine to be used for this DB instance.
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return Indicates the database engine version.
     * 
     */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return The canonical hosted zone ID of the DB instance (to be used in a Route 53 Alias record).
     * 
     */
    public String hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies the Provisioned IOPS (I/O operations per second) value.
     * 
     */
    public Integer iops() {
        return this.iops;
    }
    /**
     * @return If StorageEncrypted is true, the KMS key identifier for the encrypted DB instance.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return License model information for this DB instance.
     * 
     */
    public String licenseModel() {
        return this.licenseModel;
    }
    /**
     * @return Contains the master username for the DB instance.
     * 
     */
    public String masterUsername() {
        return this.masterUsername;
    }
    /**
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
     * 
     */
    public Integer monitoringInterval() {
        return this.monitoringInterval;
    }
    /**
     * @return The ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to CloudWatch Logs.
     * 
     */
    public String monitoringRoleArn() {
        return this.monitoringRoleArn;
    }
    /**
     * @return Specifies if the DB instance is a Multi-AZ deployment.
     * 
     */
    public Boolean multiAz() {
        return this.multiAz;
    }
    /**
     * @return Provides the list of option group memberships for this DB instance.
     * 
     */
    public List<String> optionGroupMemberships() {
        return this.optionGroupMemberships;
    }
    /**
     * @return The database port.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Specifies the daily time range during which automated backups are created.
     * 
     */
    public String preferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * @return Specifies the weekly time range during which system maintenance can occur in UTC.
     * 
     */
    public String preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * @return Specifies the accessibility options for the DB instance.
     * 
     */
    public Boolean publiclyAccessible() {
        return this.publiclyAccessible;
    }
    /**
     * @return The identifier of the source DB that this is a replica of.
     * 
     */
    public String replicateSourceDb() {
        return this.replicateSourceDb;
    }
    /**
     * @return The RDS Resource ID of this instance.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return Specifies whether the DB instance is encrypted.
     * 
     */
    public Boolean storageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * @return Specifies the storage type associated with DB instance.
     * 
     */
    public String storageType() {
        return this.storageType;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The time zone of the DB instance.
     * 
     */
    public String timezone() {
        return this.timezone;
    }
    /**
     * @return Provides a list of VPC security group elements that the DB instance belongs to.
     * 
     */
    public List<String> vpcSecurityGroups() {
        return this.vpcSecurityGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private Integer allocatedStorage;
        private Boolean autoMinorVersionUpgrade;
        private String availabilityZone;
        private Integer backupRetentionPeriod;
        private String caCertIdentifier;
        private String dbClusterIdentifier;
        private String dbInstanceArn;
        private String dbInstanceClass;
        private String dbInstanceIdentifier;
        private Integer dbInstancePort;
        private String dbName;
        private List<String> dbParameterGroups;
        private List<String> dbSecurityGroups;
        private String dbSubnetGroup;
        private List<String> enabledCloudwatchLogsExports;
        private String endpoint;
        private String engine;
        private String engineVersion;
        private String hostedZoneId;
        private String id;
        private Integer iops;
        private String kmsKeyId;
        private String licenseModel;
        private String masterUsername;
        private Integer monitoringInterval;
        private String monitoringRoleArn;
        private Boolean multiAz;
        private List<String> optionGroupMemberships;
        private Integer port;
        private String preferredBackupWindow;
        private String preferredMaintenanceWindow;
        private Boolean publiclyAccessible;
        private String replicateSourceDb;
        private String resourceId;
        private Boolean storageEncrypted;
        private String storageType;
        private Map<String,String> tags;
        private String timezone;
        private List<String> vpcSecurityGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.allocatedStorage = defaults.allocatedStorage;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.backupRetentionPeriod = defaults.backupRetentionPeriod;
    	      this.caCertIdentifier = defaults.caCertIdentifier;
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbInstanceArn = defaults.dbInstanceArn;
    	      this.dbInstanceClass = defaults.dbInstanceClass;
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.dbInstancePort = defaults.dbInstancePort;
    	      this.dbName = defaults.dbName;
    	      this.dbParameterGroups = defaults.dbParameterGroups;
    	      this.dbSecurityGroups = defaults.dbSecurityGroups;
    	      this.dbSubnetGroup = defaults.dbSubnetGroup;
    	      this.enabledCloudwatchLogsExports = defaults.enabledCloudwatchLogsExports;
    	      this.endpoint = defaults.endpoint;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.id = defaults.id;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.licenseModel = defaults.licenseModel;
    	      this.masterUsername = defaults.masterUsername;
    	      this.monitoringInterval = defaults.monitoringInterval;
    	      this.monitoringRoleArn = defaults.monitoringRoleArn;
    	      this.multiAz = defaults.multiAz;
    	      this.optionGroupMemberships = defaults.optionGroupMemberships;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.replicateSourceDb = defaults.replicateSourceDb;
    	      this.resourceId = defaults.resourceId;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.storageType = defaults.storageType;
    	      this.tags = defaults.tags;
    	      this.timezone = defaults.timezone;
    	      this.vpcSecurityGroups = defaults.vpcSecurityGroups;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder allocatedStorage(Integer allocatedStorage) {
            this.allocatedStorage = Objects.requireNonNull(allocatedStorage);
            return this;
        }
        public Builder autoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Objects.requireNonNull(autoMinorVersionUpgrade);
            return this;
        }
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = Objects.requireNonNull(backupRetentionPeriod);
            return this;
        }
        public Builder caCertIdentifier(String caCertIdentifier) {
            this.caCertIdentifier = Objects.requireNonNull(caCertIdentifier);
            return this;
        }
        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier);
            return this;
        }
        public Builder dbInstanceArn(String dbInstanceArn) {
            this.dbInstanceArn = Objects.requireNonNull(dbInstanceArn);
            return this;
        }
        public Builder dbInstanceClass(String dbInstanceClass) {
            this.dbInstanceClass = Objects.requireNonNull(dbInstanceClass);
            return this;
        }
        public Builder dbInstanceIdentifier(String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = Objects.requireNonNull(dbInstanceIdentifier);
            return this;
        }
        public Builder dbInstancePort(Integer dbInstancePort) {
            this.dbInstancePort = Objects.requireNonNull(dbInstancePort);
            return this;
        }
        public Builder dbName(String dbName) {
            this.dbName = Objects.requireNonNull(dbName);
            return this;
        }
        public Builder dbParameterGroups(List<String> dbParameterGroups) {
            this.dbParameterGroups = Objects.requireNonNull(dbParameterGroups);
            return this;
        }
        public Builder dbParameterGroups(String... dbParameterGroups) {
            return dbParameterGroups(List.of(dbParameterGroups));
        }
        public Builder dbSecurityGroups(List<String> dbSecurityGroups) {
            this.dbSecurityGroups = Objects.requireNonNull(dbSecurityGroups);
            return this;
        }
        public Builder dbSecurityGroups(String... dbSecurityGroups) {
            return dbSecurityGroups(List.of(dbSecurityGroups));
        }
        public Builder dbSubnetGroup(String dbSubnetGroup) {
            this.dbSubnetGroup = Objects.requireNonNull(dbSubnetGroup);
            return this;
        }
        public Builder enabledCloudwatchLogsExports(List<String> enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports = Objects.requireNonNull(enabledCloudwatchLogsExports);
            return this;
        }
        public Builder enabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
            return enabledCloudwatchLogsExports(List.of(enabledCloudwatchLogsExports));
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        public Builder hostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder licenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }
        public Builder masterUsername(String masterUsername) {
            this.masterUsername = Objects.requireNonNull(masterUsername);
            return this;
        }
        public Builder monitoringInterval(Integer monitoringInterval) {
            this.monitoringInterval = Objects.requireNonNull(monitoringInterval);
            return this;
        }
        public Builder monitoringRoleArn(String monitoringRoleArn) {
            this.monitoringRoleArn = Objects.requireNonNull(monitoringRoleArn);
            return this;
        }
        public Builder multiAz(Boolean multiAz) {
            this.multiAz = Objects.requireNonNull(multiAz);
            return this;
        }
        public Builder optionGroupMemberships(List<String> optionGroupMemberships) {
            this.optionGroupMemberships = Objects.requireNonNull(optionGroupMemberships);
            return this;
        }
        public Builder optionGroupMemberships(String... optionGroupMemberships) {
            return optionGroupMemberships(List.of(optionGroupMemberships));
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder preferredBackupWindow(String preferredBackupWindow) {
            this.preferredBackupWindow = Objects.requireNonNull(preferredBackupWindow);
            return this;
        }
        public Builder preferredMaintenanceWindow(String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Objects.requireNonNull(preferredMaintenanceWindow);
            return this;
        }
        public Builder publiclyAccessible(Boolean publiclyAccessible) {
            this.publiclyAccessible = Objects.requireNonNull(publiclyAccessible);
            return this;
        }
        public Builder replicateSourceDb(String replicateSourceDb) {
            this.replicateSourceDb = Objects.requireNonNull(replicateSourceDb);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder storageEncrypted(Boolean storageEncrypted) {
            this.storageEncrypted = Objects.requireNonNull(storageEncrypted);
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder timezone(String timezone) {
            this.timezone = Objects.requireNonNull(timezone);
            return this;
        }
        public Builder vpcSecurityGroups(List<String> vpcSecurityGroups) {
            this.vpcSecurityGroups = Objects.requireNonNull(vpcSecurityGroups);
            return this;
        }
        public Builder vpcSecurityGroups(String... vpcSecurityGroups) {
            return vpcSecurityGroups(List.of(vpcSecurityGroups));
        }        public GetInstanceResult build() {
            return new GetInstanceResult(address, allocatedStorage, autoMinorVersionUpgrade, availabilityZone, backupRetentionPeriod, caCertIdentifier, dbClusterIdentifier, dbInstanceArn, dbInstanceClass, dbInstanceIdentifier, dbInstancePort, dbName, dbParameterGroups, dbSecurityGroups, dbSubnetGroup, enabledCloudwatchLogsExports, endpoint, engine, engineVersion, hostedZoneId, id, iops, kmsKeyId, licenseModel, masterUsername, monitoringInterval, monitoringRoleArn, multiAz, optionGroupMemberships, port, preferredBackupWindow, preferredMaintenanceWindow, publiclyAccessible, replicateSourceDb, resourceId, storageEncrypted, storageType, tags, timezone, vpcSecurityGroups);
        }
    }
}