// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Macie2.Inputs
{

    public sealed class ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
        /// </summary>
        [Input("simpleCriterion")]
        public Input<Inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterionGetArgs>? SimpleCriterion { get; set; }

        /// <summary>
        /// A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
        /// </summary>
        [Input("tagCriterion")]
        public Input<Inputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterionGetArgs>? TagCriterion { get; set; }

        public ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndGetArgs()
        {
        }
        public static new ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndGetArgs Empty => new ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndGetArgs();
    }
}