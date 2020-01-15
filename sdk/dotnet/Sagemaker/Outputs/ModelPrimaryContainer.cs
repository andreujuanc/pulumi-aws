// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Outputs
{

    [OutputType]
    public sealed class ModelPrimaryContainer
    {
        public readonly string? ContainerHostname;
        public readonly ImmutableDictionary<string, object>? Environment;
        public readonly string Image;
        public readonly string? ModelDataUrl;

        [OutputConstructor]
        private ModelPrimaryContainer(
            string? containerHostname,

            ImmutableDictionary<string, object>? environment,

            string image,

            string? modelDataUrl)
        {
            ContainerHostname = containerHostname;
            Environment = environment;
            Image = image;
            ModelDataUrl = modelDataUrl;
        }
    }
}