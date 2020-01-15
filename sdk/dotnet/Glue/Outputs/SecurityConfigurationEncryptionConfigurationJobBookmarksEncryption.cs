// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glue.Outputs
{

    [OutputType]
    public sealed class SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption
    {
        /// <summary>
        /// Encryption mode to use for job bookmarks data. Valid values: `CSE-KMS`, `DISABLED`. Default value: `DISABLED`.
        /// </summary>
        public readonly string? JobBookmarksEncryptionMode;
        /// <summary>
        /// Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
        /// </summary>
        public readonly string? KmsKeyArn;

        [OutputConstructor]
        private SecurityConfigurationEncryptionConfigurationJobBookmarksEncryption(
            string? jobBookmarksEncryptionMode,

            string? kmsKeyArn)
        {
            JobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
            KmsKeyArn = kmsKeyArn;
        }
    }
}