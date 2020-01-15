// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Athena.Inputs
{

    public sealed class WorkgroupConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
        /// </summary>
        [Input("bytesScannedCutoffPerQuery")]
        public Input<int>? BytesScannedCutoffPerQuery { get; set; }

        /// <summary>
        /// Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
        /// </summary>
        [Input("enforceWorkgroupConfiguration")]
        public Input<bool>? EnforceWorkgroupConfiguration { get; set; }

        /// <summary>
        /// Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
        /// </summary>
        [Input("publishCloudwatchMetricsEnabled")]
        public Input<bool>? PublishCloudwatchMetricsEnabled { get; set; }

        /// <summary>
        /// Configuration block with result settings. Documented below.
        /// </summary>
        [Input("resultConfiguration")]
        public Input<Inputs.WorkgroupConfigurationResultConfigurationArgs>? ResultConfiguration { get; set; }

        public WorkgroupConfigurationArgs()
        {
        }
    }
}