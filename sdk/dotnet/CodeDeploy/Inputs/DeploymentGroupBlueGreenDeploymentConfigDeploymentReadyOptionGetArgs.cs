// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeDeploy.Inputs
{

    public sealed class DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When to reroute traffic from an original environment to a replacement environment in a blue/green deployment.
        /// </summary>
        [Input("actionOnTimeout")]
        public Input<string>? ActionOnTimeout { get; set; }

        /// <summary>
        /// The number of minutes to wait before the status of a blue/green deployment changed to Stopped if rerouting is not started manually. Applies only to the `STOP_DEPLOYMENT` option for `action_on_timeout`.
        /// </summary>
        [Input("waitTimeInMinutes")]
        public Input<int>? WaitTimeInMinutes { get; set; }

        public DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs()
        {
        }
        public static new DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs Empty => new DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionGetArgs();
    }
}
