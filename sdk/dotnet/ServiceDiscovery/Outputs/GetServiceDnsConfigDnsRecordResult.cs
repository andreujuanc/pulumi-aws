// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ServiceDiscovery.Outputs
{

    [OutputType]
    public sealed class GetServiceDnsConfigDnsRecordResult
    {
        /// <summary>
        /// The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
        /// </summary>
        public readonly int Ttl;
        /// <summary>
        /// The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetServiceDnsConfigDnsRecordResult(
            int ttl,

            string type)
        {
            Ttl = ttl;
            Type = type;
        }
    }
}