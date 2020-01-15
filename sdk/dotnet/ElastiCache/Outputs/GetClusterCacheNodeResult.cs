// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ElastiCache.Outputs
{

    [OutputType]
    public sealed class GetClusterCacheNodeResult
    {
        public readonly string Address;
        /// <summary>
        /// The Availability Zone for the cache cluster.
        /// </summary>
        public readonly string AvailabilityZone;
        public readonly string Id;
        /// <summary>
        /// The port number on which each of the cache nodes will
        /// accept connections.
        /// </summary>
        public readonly int Port;

        [OutputConstructor]
        private GetClusterCacheNodeResult(
            string address,

            string availabilityZone,

            string id,

            int port)
        {
            Address = address;
            AvailabilityZone = availabilityZone;
            Id = id;
            Port = port;
        }
    }
}