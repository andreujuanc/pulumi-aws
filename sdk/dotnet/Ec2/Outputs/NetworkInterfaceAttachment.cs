// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class NetworkInterfaceAttachment
    {
        public readonly string? AttachmentId;
        public readonly int DeviceIndex;
        public readonly string Instance;

        [OutputConstructor]
        private NetworkInterfaceAttachment(
            string? attachmentId,

            int deviceIndex,

            string instance)
        {
            AttachmentId = attachmentId;
            DeviceIndex = deviceIndex;
            Instance = instance;
        }
    }
}