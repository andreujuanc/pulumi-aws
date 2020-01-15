// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeBuild.Outputs
{

    [OutputType]
    public sealed class ProjectCache
    {
        /// <summary>
        /// The location of the source code from git or s3.
        /// </summary>
        public readonly string? Location;
        /// <summary>
        /// Specifies settings that AWS CodeBuild uses to store and reuse build dependencies. Valid values:  `LOCAL_SOURCE_CACHE`, `LOCAL_DOCKER_LAYER_CACHE`, and `LOCAL_CUSTOM_CACHE`
        /// </summary>
        public readonly ImmutableArray<string> Modes;
        /// <summary>
        /// The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ProjectCache(
            string? location,

            ImmutableArray<string> modes,

            string? type)
        {
            Location = location;
            Modes = modes;
            Type = type;
        }
    }
}