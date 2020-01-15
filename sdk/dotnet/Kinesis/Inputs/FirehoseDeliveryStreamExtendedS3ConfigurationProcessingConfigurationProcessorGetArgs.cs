// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Inputs
{

    public sealed class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs : Pulumi.ResourceArgs
    {
        [Input("parameters")]
        private InputList<Inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs>? _parameters;

        /// <summary>
        /// Array of processor parameters. More details are given below
        /// </summary>
        public InputList<Inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The type of processor. Valid Values: `Lambda`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs()
        {
        }
    }
}