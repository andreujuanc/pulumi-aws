// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm.Outputs
{

    [OutputType]
    public sealed class ResourceDataSyncS3Destination
    {
        public readonly string BucketName;
        public readonly string? KmsKeyArn;
        public readonly string? Prefix;
        public readonly string Region;
        public readonly string? SyncFormat;

        [OutputConstructor]
        private ResourceDataSyncS3Destination(
            string bucketName,

            string? kmsKeyArn,

            string? prefix,

            string region,

            string? syncFormat)
        {
            BucketName = bucketName;
            KmsKeyArn = kmsKeyArn;
            Prefix = prefix;
            Region = region;
            SyncFormat = syncFormat;
        }
    }
}