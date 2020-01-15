// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class InstanceRootBlockDeviceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the volume should be destroyed
        /// on instance termination (Default: `true`).
        /// </summary>
        [Input("deleteOnTermination")]
        public Input<bool>? DeleteOnTermination { get; set; }

        /// <summary>
        /// Enables [EBS
        /// encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
        /// on the volume (Default: `false`). Cannot be used with `snapshot_id`. Must be configured to perform drift detection.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// The amount of provisioned
        /// [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
        /// This must be set with a `volume_type` of `"io1"`.
        /// </summary>
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        /// <summary>
        /// The size of the volume in gibibytes (GiB).
        /// </summary>
        [Input("volumeSize")]
        public Input<int>? VolumeSize { get; set; }

        /// <summary>
        /// The type of volume. Can be `"standard"`, `"gp2"`,
        /// or `"io1"`. (Default: `"standard"`).
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public InstanceRootBlockDeviceArgs()
        {
        }
    }
}