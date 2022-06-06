// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Outputs
{

    [OutputType]
    public sealed class LifecyclePolicyPolicyDetailsActionCrossRegionCopy
    {
        /// <summary>
        /// The encryption settings for the copied snapshot. See the `encryption_configuration` block. Max of 1 per action.
        /// </summary>
        public readonly Outputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration EncryptionConfiguration;
        /// <summary>
        /// The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
        /// </summary>
        public readonly Outputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule? RetainRule;
        /// <summary>
        /// The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
        /// </summary>
        public readonly string Target;

        [OutputConstructor]
        private LifecyclePolicyPolicyDetailsActionCrossRegionCopy(
            Outputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyEncryptionConfiguration encryptionConfiguration,

            Outputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyRetainRule? retainRule,

            string target)
        {
            EncryptionConfiguration = encryptionConfiguration;
            RetainRule = retainRule;
            Target = target;
        }
    }
}