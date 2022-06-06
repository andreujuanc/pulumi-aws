// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.EmrContainers.Inputs
{

    public sealed class VirtualClusterContainerProviderInfoEksInfoGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The namespace where the EMR Containers cluster is running
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        public VirtualClusterContainerProviderInfoEksInfoGetArgs()
        {
        }
    }
}