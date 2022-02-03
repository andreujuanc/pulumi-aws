// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketReplicationConfigRuleSourceSelectionCriteriaArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn't replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
        /// </summary>
        [Input("replicaModifications")]
        public Input<Inputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs>? ReplicaModifications { get; set; }

        /// <summary>
        /// A configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replica_kms_key_id` in `destination` `encryption_configuration` must be specified as well.
        /// </summary>
        [Input("sseKmsEncryptedObjects")]
        public Input<Inputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs>? SseKmsEncryptedObjects { get; set; }

        public BucketReplicationConfigRuleSourceSelectionCriteriaArgs()
        {
        }
    }
}