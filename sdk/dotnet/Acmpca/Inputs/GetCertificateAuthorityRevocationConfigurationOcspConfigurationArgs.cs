// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Acmpca.Inputs
{

    public sealed class GetCertificateAuthorityRevocationConfigurationOcspConfigurationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("ocspCustomCname", required: true)]
        public Input<string> OcspCustomCname { get; set; } = null!;

        public GetCertificateAuthorityRevocationConfigurationOcspConfigurationInputArgs()
        {
        }
        public static new GetCertificateAuthorityRevocationConfigurationOcspConfigurationInputArgs Empty => new GetCertificateAuthorityRevocationConfigurationOcspConfigurationInputArgs();
    }
}