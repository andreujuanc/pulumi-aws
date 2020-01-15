// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class FleetLaunchTemplateConfigOverride
    {
        /// <summary>
        /// Availability Zone in which to launch the instances.
        /// </summary>
        public readonly string? AvailabilityZone;
        /// <summary>
        /// Instance type.
        /// </summary>
        public readonly string? InstanceType;
        /// <summary>
        /// Maximum price per unit hour that you are willing to pay for a Spot Instance.
        /// </summary>
        public readonly string? MaxPrice;
        /// <summary>
        /// Priority for the launch template override. If `on_demand_options` `allocation_strategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
        /// </summary>
        public readonly double? Priority;
        /// <summary>
        /// ID of the subnet in which to launch the instances.
        /// </summary>
        public readonly string? SubnetId;
        /// <summary>
        /// Number of units provided by the specified instance type.
        /// </summary>
        public readonly double? WeightedCapacity;

        [OutputConstructor]
        private FleetLaunchTemplateConfigOverride(
            string? availabilityZone,

            string? instanceType,

            string? maxPrice,

            double? priority,

            string? subnetId,

            double? weightedCapacity)
        {
            AvailabilityZone = availabilityZone;
            InstanceType = instanceType;
            MaxPrice = maxPrice;
            Priority = priority;
            SubnetId = subnetId;
            WeightedCapacity = weightedCapacity;
        }
    }
}