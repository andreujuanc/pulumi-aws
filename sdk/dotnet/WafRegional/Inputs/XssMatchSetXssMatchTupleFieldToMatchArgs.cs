// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafRegional.Inputs
{

    public sealed class XssMatchSetXssMatchTupleFieldToMatchArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
        /// </summary>
        [Input("data")]
        public Input<string>? Data { get; set; }

        /// <summary>
        /// The part of the web request that you want AWS WAF to search for a specified string. e.g. `HEADER` or `METHOD`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public XssMatchSetXssMatchTupleFieldToMatchArgs()
        {
        }
    }
}