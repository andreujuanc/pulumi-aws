// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra
{
    /// <summary>
    /// Provides an Amazon Kendra Index resource.
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Kendra.Index("example", new()
    ///     {
    ///         Description = "example",
    ///         Edition = "DEVELOPER_EDITION",
    ///         RoleArn = aws_iam_role.This.Arn,
    ///         Tags = 
    ///         {
    ///             { "Key1", "Value1" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With capacity units
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Kendra.Index("example", new()
    ///     {
    ///         Edition = "DEVELOPER_EDITION",
    ///         RoleArn = aws_iam_role.This.Arn,
    ///         CapacityUnits = new Aws.Kendra.Inputs.IndexCapacityUnitsArgs
    ///         {
    ///             QueryCapacityUnits = 2,
    ///             StorageCapacityUnits = 2,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With server side encryption configuration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Kendra.Index("example", new()
    ///     {
    ///         RoleArn = aws_iam_role.This.Arn,
    ///         ServerSideEncryptionConfiguration = new Aws.Kendra.Inputs.IndexServerSideEncryptionConfigurationArgs
    ///         {
    ///             KmsKeyId = data.Aws_kms_key.This.Arn,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With JSON token type configuration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Kendra.Index("example", new()
    ///     {
    ///         RoleArn = aws_iam_role.This.Arn,
    ///         UserTokenConfigurations = new Aws.Kendra.Inputs.IndexUserTokenConfigurationsArgs
    ///         {
    ///             JsonTokenTypeConfiguration = new Aws.Kendra.Inputs.IndexUserTokenConfigurationsJsonTokenTypeConfigurationArgs
    ///             {
    ///                 GroupAttributeField = "groups",
    ///                 UserNameAttributeField = "username",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Amazon Kendra Indexes can be imported using its `id`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:kendra/index:Index example 12345678-1234-5678-9123-123456789123
    /// ```
    /// </summary>
    [AwsResourceType("aws:kendra/index:Index")]
    public partial class Index : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Index.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// A block that sets the number of additional document storage and query capacity units that should be used by the index.
        /// </summary>
        [Output("capacityUnits")]
        public Output<Outputs.IndexCapacityUnits> CapacityUnits { get; private set; } = null!;

        /// <summary>
        /// The Unix datetime that the index was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The description of the Index.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// One or more blocks that specify the configuration settings for any metadata applied to the documents in the index. Documented below.
        /// </summary>
        [Output("documentMetadataConfigurationUpdates")]
        public Output<ImmutableArray<Outputs.IndexDocumentMetadataConfigurationUpdate>> DocumentMetadataConfigurationUpdates { get; private set; } = null!;

        /// <summary>
        /// The Amazon Kendra edition to use for the index. Choose `DEVELOPER_EDITION` for indexes intended for development, testing, or proof of concept. Use `ENTERPRISE_EDITION` for your production databases. Once you set the edition for an index, it can't be changed. Defaults to `ENTERPRISE_EDITION`
        /// </summary>
        [Output("edition")]
        public Output<string?> Edition { get; private set; } = null!;

        /// <summary>
        /// When the Status field value is `FAILED`, this contains a message that explains why.
        /// </summary>
        [Output("errorMessage")]
        public Output<string> ErrorMessage { get; private set; } = null!;

        /// <summary>
        /// A block that provides information about the number of FAQ questions and answers and the number of text documents indexed. Documented below.
        /// </summary>
        [Output("indexStatistics")]
        public Output<ImmutableArray<Outputs.IndexIndexStatistic>> IndexStatistics { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Index.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role you use when you call the `BatchPutDocument` API to index documents from an Amazon S3 bucket.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// A block that specifies the identifier of the AWS KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs. Documented below.
        /// </summary>
        [Output("serverSideEncryptionConfiguration")]
        public Output<Outputs.IndexServerSideEncryptionConfiguration?> ServerSideEncryptionConfiguration { get; private set; } = null!;

        /// <summary>
        /// The current status of the index. When the value is `ACTIVE`, the index is ready for use. If the Status field value is `FAILED`, the `error_message` field contains a message that explains why.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The Unix datetime that the index was last updated.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// The user context policy. Valid values are `ATTRIBUTE_FILTER` or `USER_TOKEN`. For more information, refer to [UserContextPolicy](https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html#Kendra-CreateIndex-request-UserContextPolicy). Defaults to `ATTRIBUTE_FILTER`.
        /// </summary>
        [Output("userContextPolicy")]
        public Output<string?> UserContextPolicy { get; private set; } = null!;

        /// <summary>
        /// A block that enables fetching access levels of groups and users from an AWS Single Sign-On identity source. To configure this, see [UserGroupResolutionConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html). Documented below.
        /// </summary>
        [Output("userGroupResolutionConfiguration")]
        public Output<Outputs.IndexUserGroupResolutionConfiguration?> UserGroupResolutionConfiguration { get; private set; } = null!;

        /// <summary>
        /// A block that specifies the user token configuration. Documented below.
        /// </summary>
        [Output("userTokenConfigurations")]
        public Output<Outputs.IndexUserTokenConfigurations?> UserTokenConfigurations { get; private set; } = null!;


        /// <summary>
        /// Create a Index resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Index(string name, IndexArgs args, CustomResourceOptions? options = null)
            : base("aws:kendra/index:Index", name, args ?? new IndexArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Index(string name, Input<string> id, IndexState? state = null, CustomResourceOptions? options = null)
            : base("aws:kendra/index:Index", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Index resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Index Get(string name, Input<string> id, IndexState? state = null, CustomResourceOptions? options = null)
        {
            return new Index(name, id, state, options);
        }
    }

    public sealed class IndexArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A block that sets the number of additional document storage and query capacity units that should be used by the index.
        /// </summary>
        [Input("capacityUnits")]
        public Input<Inputs.IndexCapacityUnitsArgs>? CapacityUnits { get; set; }

        /// <summary>
        /// The description of the Index.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Amazon Kendra edition to use for the index. Choose `DEVELOPER_EDITION` for indexes intended for development, testing, or proof of concept. Use `ENTERPRISE_EDITION` for your production databases. Once you set the edition for an index, it can't be changed. Defaults to `ENTERPRISE_EDITION`
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        /// <summary>
        /// Specifies the name of the Index.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role you use when you call the `BatchPutDocument` API to index documents from an Amazon S3 bucket.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        /// <summary>
        /// A block that specifies the identifier of the AWS KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs. Documented below.
        /// </summary>
        [Input("serverSideEncryptionConfiguration")]
        public Input<Inputs.IndexServerSideEncryptionConfigurationArgs>? ServerSideEncryptionConfiguration { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The user context policy. Valid values are `ATTRIBUTE_FILTER` or `USER_TOKEN`. For more information, refer to [UserContextPolicy](https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html#Kendra-CreateIndex-request-UserContextPolicy). Defaults to `ATTRIBUTE_FILTER`.
        /// </summary>
        [Input("userContextPolicy")]
        public Input<string>? UserContextPolicy { get; set; }

        /// <summary>
        /// A block that enables fetching access levels of groups and users from an AWS Single Sign-On identity source. To configure this, see [UserGroupResolutionConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html). Documented below.
        /// </summary>
        [Input("userGroupResolutionConfiguration")]
        public Input<Inputs.IndexUserGroupResolutionConfigurationArgs>? UserGroupResolutionConfiguration { get; set; }

        /// <summary>
        /// A block that specifies the user token configuration. Documented below.
        /// </summary>
        [Input("userTokenConfigurations")]
        public Input<Inputs.IndexUserTokenConfigurationsArgs>? UserTokenConfigurations { get; set; }

        public IndexArgs()
        {
        }
        public static new IndexArgs Empty => new IndexArgs();
    }

    public sealed class IndexState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Index.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// A block that sets the number of additional document storage and query capacity units that should be used by the index.
        /// </summary>
        [Input("capacityUnits")]
        public Input<Inputs.IndexCapacityUnitsGetArgs>? CapacityUnits { get; set; }

        /// <summary>
        /// The Unix datetime that the index was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The description of the Index.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("documentMetadataConfigurationUpdates")]
        private InputList<Inputs.IndexDocumentMetadataConfigurationUpdateGetArgs>? _documentMetadataConfigurationUpdates;

        /// <summary>
        /// One or more blocks that specify the configuration settings for any metadata applied to the documents in the index. Documented below.
        /// </summary>
        public InputList<Inputs.IndexDocumentMetadataConfigurationUpdateGetArgs> DocumentMetadataConfigurationUpdates
        {
            get => _documentMetadataConfigurationUpdates ?? (_documentMetadataConfigurationUpdates = new InputList<Inputs.IndexDocumentMetadataConfigurationUpdateGetArgs>());
            set => _documentMetadataConfigurationUpdates = value;
        }

        /// <summary>
        /// The Amazon Kendra edition to use for the index. Choose `DEVELOPER_EDITION` for indexes intended for development, testing, or proof of concept. Use `ENTERPRISE_EDITION` for your production databases. Once you set the edition for an index, it can't be changed. Defaults to `ENTERPRISE_EDITION`
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        /// <summary>
        /// When the Status field value is `FAILED`, this contains a message that explains why.
        /// </summary>
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        [Input("indexStatistics")]
        private InputList<Inputs.IndexIndexStatisticGetArgs>? _indexStatistics;

        /// <summary>
        /// A block that provides information about the number of FAQ questions and answers and the number of text documents indexed. Documented below.
        /// </summary>
        public InputList<Inputs.IndexIndexStatisticGetArgs> IndexStatistics
        {
            get => _indexStatistics ?? (_indexStatistics = new InputList<Inputs.IndexIndexStatisticGetArgs>());
            set => _indexStatistics = value;
        }

        /// <summary>
        /// Specifies the name of the Index.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role you use when you call the `BatchPutDocument` API to index documents from an Amazon S3 bucket.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        /// <summary>
        /// A block that specifies the identifier of the AWS KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs. Documented below.
        /// </summary>
        [Input("serverSideEncryptionConfiguration")]
        public Input<Inputs.IndexServerSideEncryptionConfigurationGetArgs>? ServerSideEncryptionConfiguration { get; set; }

        /// <summary>
        /// The current status of the index. When the value is `ACTIVE`, the index is ready for use. If the Status field value is `FAILED`, the `error_message` field contains a message that explains why.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The Unix datetime that the index was last updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// The user context policy. Valid values are `ATTRIBUTE_FILTER` or `USER_TOKEN`. For more information, refer to [UserContextPolicy](https://docs.aws.amazon.com/kendra/latest/dg/API_CreateIndex.html#Kendra-CreateIndex-request-UserContextPolicy). Defaults to `ATTRIBUTE_FILTER`.
        /// </summary>
        [Input("userContextPolicy")]
        public Input<string>? UserContextPolicy { get; set; }

        /// <summary>
        /// A block that enables fetching access levels of groups and users from an AWS Single Sign-On identity source. To configure this, see [UserGroupResolutionConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html). Documented below.
        /// </summary>
        [Input("userGroupResolutionConfiguration")]
        public Input<Inputs.IndexUserGroupResolutionConfigurationGetArgs>? UserGroupResolutionConfiguration { get; set; }

        /// <summary>
        /// A block that specifies the user token configuration. Documented below.
        /// </summary>
        [Input("userTokenConfigurations")]
        public Input<Inputs.IndexUserTokenConfigurationsGetArgs>? UserTokenConfigurations { get; set; }

        public IndexState()
        {
        }
        public static new IndexState Empty => new IndexState();
    }
}