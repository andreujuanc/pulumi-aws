// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LightSail.Outputs
{

    [OutputType]
    public sealed class ContainerServicePublicDomainNamesCertificate
    {
        public readonly string CertificateName;
        public readonly ImmutableArray<string> DomainNames;

        [OutputConstructor]
        private ContainerServicePublicDomainNamesCertificate(
            string certificateName,

            ImmutableArray<string> domainNames)
        {
            CertificateName = certificateName;
            DomainNames = domainNames;
        }
    }
}