// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Macie2.Inputs
{

    public sealed class ClassificationJobS3JobDefinitionBucketDefinitionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier for the AWS account that owns the buckets.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("buckets", required: true)]
        private InputList<string>? _buckets;

        /// <summary>
        /// An array that lists the names of the buckets.
        /// </summary>
        public InputList<string> Buckets
        {
            get => _buckets ?? (_buckets = new InputList<string>());
            set => _buckets = value;
        }

        public ClassificationJobS3JobDefinitionBucketDefinitionGetArgs()
        {
        }
    }
}