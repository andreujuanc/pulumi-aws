// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeDeploy.Inputs
{

    public sealed class DeploymentGroupDeploymentStyleGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`.
        /// </summary>
        [Input("deploymentOption")]
        public Input<string>? DeploymentOption { get; set; }

        /// <summary>
        /// Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`.
        /// </summary>
        [Input("deploymentType")]
        public Input<string>? DeploymentType { get; set; }

        public DeploymentGroupDeploymentStyleGetArgs()
        {
        }
    }
}