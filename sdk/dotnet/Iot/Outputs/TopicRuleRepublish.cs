// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iot.Outputs
{

    [OutputType]
    public sealed class TopicRuleRepublish
    {
        /// <summary>
        /// The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0. 
        /// </summary>
        public readonly int? Qos;
        /// <summary>
        /// The ARN of the IAM role that grants access.
        /// </summary>
        public readonly string RoleArn;
        /// <summary>
        /// The name of the MQTT topic the message should be republished to.
        /// </summary>
        public readonly string Topic;

        [OutputConstructor]
        private TopicRuleRepublish(
            int? qos,

            string roleArn,

            string topic)
        {
            Qos = qos;
            RoleArn = roleArn;
            Topic = topic;
        }
    }
}