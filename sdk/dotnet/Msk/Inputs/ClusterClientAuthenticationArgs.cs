// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Msk.Inputs
{

    public sealed class ClusterClientAuthenticationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration block for specifying TLS client authentication. See below.
        /// </summary>
        [Input("tls")]
        public Input<Inputs.ClusterClientAuthenticationTlsArgs>? Tls { get; set; }

        public ClusterClientAuthenticationArgs()
        {
        }
    }
}