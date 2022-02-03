// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MskConnect.Outputs
{

    [OutputType]
    public sealed class CustomPluginLocation
    {
        /// <summary>
        /// Information of the plugin file stored in Amazon S3. See below.
        /// </summary>
        public readonly Outputs.CustomPluginLocationS3 S3;

        [OutputConstructor]
        private CustomPluginLocation(Outputs.CustomPluginLocationS3 s3)
        {
            S3 = s3;
        }
    }
}