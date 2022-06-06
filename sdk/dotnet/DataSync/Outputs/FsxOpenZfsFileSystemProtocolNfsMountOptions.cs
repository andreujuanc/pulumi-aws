// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DataSync.Outputs
{

    [OutputType]
    public sealed class FsxOpenZfsFileSystemProtocolNfsMountOptions
    {
        /// <summary>
        /// The specific NFS version that you want DataSync to use for mounting your NFS share. Valid values: `AUTOMATIC`, `NFS3`, `NFS4_0` and `NFS4_1`. Default: `AUTOMATIC`
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private FsxOpenZfsFileSystemProtocolNfsMountOptions(string? version)
        {
            Version = version;
        }
    }
}