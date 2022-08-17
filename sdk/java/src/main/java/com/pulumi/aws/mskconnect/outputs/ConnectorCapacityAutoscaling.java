// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.aws.mskconnect.outputs.ConnectorCapacityAutoscalingScaleInPolicy;
import com.pulumi.aws.mskconnect.outputs.ConnectorCapacityAutoscalingScaleOutPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorCapacityAutoscaling {
    /**
     * @return The maximum number of workers allocated to the connector.
     * 
     */
    private final Integer maxWorkerCount;
    /**
     * @return The number of microcontroller units (MCUs) allocated to each connector worker. Valid values: `1`, `2`, `4`, `8`. The default value is `1`.
     * 
     */
    private final @Nullable Integer mcuCount;
    /**
     * @return The minimum number of workers allocated to the connector.
     * 
     */
    private final Integer minWorkerCount;
    /**
     * @return The scale-in policy for the connector. See below.
     * 
     */
    private final @Nullable ConnectorCapacityAutoscalingScaleInPolicy scaleInPolicy;
    /**
     * @return The scale-out policy for the connector. See below.
     * 
     */
    private final @Nullable ConnectorCapacityAutoscalingScaleOutPolicy scaleOutPolicy;

    @CustomType.Constructor
    private ConnectorCapacityAutoscaling(
        @CustomType.Parameter("maxWorkerCount") Integer maxWorkerCount,
        @CustomType.Parameter("mcuCount") @Nullable Integer mcuCount,
        @CustomType.Parameter("minWorkerCount") Integer minWorkerCount,
        @CustomType.Parameter("scaleInPolicy") @Nullable ConnectorCapacityAutoscalingScaleInPolicy scaleInPolicy,
        @CustomType.Parameter("scaleOutPolicy") @Nullable ConnectorCapacityAutoscalingScaleOutPolicy scaleOutPolicy) {
        this.maxWorkerCount = maxWorkerCount;
        this.mcuCount = mcuCount;
        this.minWorkerCount = minWorkerCount;
        this.scaleInPolicy = scaleInPolicy;
        this.scaleOutPolicy = scaleOutPolicy;
    }

    /**
     * @return The maximum number of workers allocated to the connector.
     * 
     */
    public Integer maxWorkerCount() {
        return this.maxWorkerCount;
    }
    /**
     * @return The number of microcontroller units (MCUs) allocated to each connector worker. Valid values: `1`, `2`, `4`, `8`. The default value is `1`.
     * 
     */
    public Optional<Integer> mcuCount() {
        return Optional.ofNullable(this.mcuCount);
    }
    /**
     * @return The minimum number of workers allocated to the connector.
     * 
     */
    public Integer minWorkerCount() {
        return this.minWorkerCount;
    }
    /**
     * @return The scale-in policy for the connector. See below.
     * 
     */
    public Optional<ConnectorCapacityAutoscalingScaleInPolicy> scaleInPolicy() {
        return Optional.ofNullable(this.scaleInPolicy);
    }
    /**
     * @return The scale-out policy for the connector. See below.
     * 
     */
    public Optional<ConnectorCapacityAutoscalingScaleOutPolicy> scaleOutPolicy() {
        return Optional.ofNullable(this.scaleOutPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCapacityAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxWorkerCount;
        private @Nullable Integer mcuCount;
        private Integer minWorkerCount;
        private @Nullable ConnectorCapacityAutoscalingScaleInPolicy scaleInPolicy;
        private @Nullable ConnectorCapacityAutoscalingScaleOutPolicy scaleOutPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCapacityAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxWorkerCount = defaults.maxWorkerCount;
    	      this.mcuCount = defaults.mcuCount;
    	      this.minWorkerCount = defaults.minWorkerCount;
    	      this.scaleInPolicy = defaults.scaleInPolicy;
    	      this.scaleOutPolicy = defaults.scaleOutPolicy;
        }

        public Builder maxWorkerCount(Integer maxWorkerCount) {
            this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount);
            return this;
        }
        public Builder mcuCount(@Nullable Integer mcuCount) {
            this.mcuCount = mcuCount;
            return this;
        }
        public Builder minWorkerCount(Integer minWorkerCount) {
            this.minWorkerCount = Objects.requireNonNull(minWorkerCount);
            return this;
        }
        public Builder scaleInPolicy(@Nullable ConnectorCapacityAutoscalingScaleInPolicy scaleInPolicy) {
            this.scaleInPolicy = scaleInPolicy;
            return this;
        }
        public Builder scaleOutPolicy(@Nullable ConnectorCapacityAutoscalingScaleOutPolicy scaleOutPolicy) {
            this.scaleOutPolicy = scaleOutPolicy;
            return this;
        }        public ConnectorCapacityAutoscaling build() {
            return new ConnectorCapacityAutoscaling(maxWorkerCount, mcuCount, minWorkerCount, scaleInPolicy, scaleOutPolicy);
        }
    }
}