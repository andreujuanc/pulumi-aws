// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.StorageGateway.Inputs
{

    public sealed class NfsFileShareNfsFileShareDefaultsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Unix directory mode in the string form "nnnn". Defaults to `"0777"`.
        /// </summary>
        [Input("directoryMode")]
        public Input<string>? DirectoryMode { get; set; }

        /// <summary>
        /// The Unix file mode in the string form "nnnn". Defaults to `"0666"`.
        /// </summary>
        [Input("fileMode")]
        public Input<string>? FileMode { get; set; }

        /// <summary>
        /// The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
        /// </summary>
        [Input("groupId")]
        public Input<int>? GroupId { get; set; }

        /// <summary>
        /// The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
        /// </summary>
        [Input("ownerId")]
        public Input<int>? OwnerId { get; set; }

        public NfsFileShareNfsFileShareDefaultsGetArgs()
        {
        }
    }
}