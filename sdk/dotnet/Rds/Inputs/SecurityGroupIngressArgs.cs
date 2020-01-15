// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds.Inputs
{

    public sealed class SecurityGroupIngressArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CIDR block to accept
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// The ID of the security group to authorize
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The name of the security group to authorize
        /// </summary>
        [Input("securityGroupName")]
        public Input<string>? SecurityGroupName { get; set; }

        /// <summary>
        /// The owner Id of the security group provided
        /// by `security_group_name`.
        /// </summary>
        [Input("securityGroupOwnerId")]
        public Input<string>? SecurityGroupOwnerId { get; set; }

        public SecurityGroupIngressArgs()
        {
        }
    }
}