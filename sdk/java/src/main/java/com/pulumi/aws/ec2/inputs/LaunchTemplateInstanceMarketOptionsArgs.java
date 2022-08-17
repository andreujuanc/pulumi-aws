// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.LaunchTemplateInstanceMarketOptionsSpotOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchTemplateInstanceMarketOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateInstanceMarketOptionsArgs Empty = new LaunchTemplateInstanceMarketOptionsArgs();

    /**
     * The market type. Can be `spot`.
     * 
     */
    @Import(name="marketType")
    private @Nullable Output<String> marketType;

    /**
     * @return The market type. Can be `spot`.
     * 
     */
    public Optional<Output<String>> marketType() {
        return Optional.ofNullable(this.marketType);
    }

    /**
     * The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
     * 
     */
    @Import(name="spotOptions")
    private @Nullable Output<LaunchTemplateInstanceMarketOptionsSpotOptionsArgs> spotOptions;

    /**
     * @return The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
     * 
     */
    public Optional<Output<LaunchTemplateInstanceMarketOptionsSpotOptionsArgs>> spotOptions() {
        return Optional.ofNullable(this.spotOptions);
    }

    private LaunchTemplateInstanceMarketOptionsArgs() {}

    private LaunchTemplateInstanceMarketOptionsArgs(LaunchTemplateInstanceMarketOptionsArgs $) {
        this.marketType = $.marketType;
        this.spotOptions = $.spotOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchTemplateInstanceMarketOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchTemplateInstanceMarketOptionsArgs $;

        public Builder() {
            $ = new LaunchTemplateInstanceMarketOptionsArgs();
        }

        public Builder(LaunchTemplateInstanceMarketOptionsArgs defaults) {
            $ = new LaunchTemplateInstanceMarketOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param marketType The market type. Can be `spot`.
         * 
         * @return builder
         * 
         */
        public Builder marketType(@Nullable Output<String> marketType) {
            $.marketType = marketType;
            return this;
        }

        /**
         * @param marketType The market type. Can be `spot`.
         * 
         * @return builder
         * 
         */
        public Builder marketType(String marketType) {
            return marketType(Output.of(marketType));
        }

        /**
         * @param spotOptions The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
         * 
         * @return builder
         * 
         */
        public Builder spotOptions(@Nullable Output<LaunchTemplateInstanceMarketOptionsSpotOptionsArgs> spotOptions) {
            $.spotOptions = spotOptions;
            return this;
        }

        /**
         * @param spotOptions The options for [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
         * 
         * @return builder
         * 
         */
        public Builder spotOptions(LaunchTemplateInstanceMarketOptionsSpotOptionsArgs spotOptions) {
            return spotOptions(Output.of(spotOptions));
        }

        public LaunchTemplateInstanceMarketOptionsArgs build() {
            return $;
        }
    }

}