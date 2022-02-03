// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpsWorks.Inputs
{

    public sealed class GangliaLayerCloudwatchConfigurationGetArgs : Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("logStreams")]
        private InputList<Inputs.GangliaLayerCloudwatchConfigurationLogStreamGetArgs>? _logStreams;
        public InputList<Inputs.GangliaLayerCloudwatchConfigurationLogStreamGetArgs> LogStreams
        {
            get => _logStreams ?? (_logStreams = new InputList<Inputs.GangliaLayerCloudwatchConfigurationLogStreamGetArgs>());
            set => _logStreams = value;
        }

        public GangliaLayerCloudwatchConfigurationGetArgs()
        {
        }
    }
}