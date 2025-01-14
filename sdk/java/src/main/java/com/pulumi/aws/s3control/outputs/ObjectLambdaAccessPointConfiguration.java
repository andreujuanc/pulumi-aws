// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.aws.s3control.outputs.ObjectLambdaAccessPointConfigurationTransformationConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectLambdaAccessPointConfiguration {
    /**
     * @return Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
     * 
     */
    private @Nullable List<String> allowedFeatures;
    /**
     * @return Whether or not the CloudWatch metrics configuration is enabled.
     * 
     */
    private @Nullable Boolean cloudWatchMetricsEnabled;
    /**
     * @return Standard access point associated with the Object Lambda Access Point.
     * 
     */
    private String supportingAccessPoint;
    /**
     * @return List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
     * 
     */
    private List<ObjectLambdaAccessPointConfigurationTransformationConfiguration> transformationConfigurations;

    private ObjectLambdaAccessPointConfiguration() {}
    /**
     * @return Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
     * 
     */
    public List<String> allowedFeatures() {
        return this.allowedFeatures == null ? List.of() : this.allowedFeatures;
    }
    /**
     * @return Whether or not the CloudWatch metrics configuration is enabled.
     * 
     */
    public Optional<Boolean> cloudWatchMetricsEnabled() {
        return Optional.ofNullable(this.cloudWatchMetricsEnabled);
    }
    /**
     * @return Standard access point associated with the Object Lambda Access Point.
     * 
     */
    public String supportingAccessPoint() {
        return this.supportingAccessPoint;
    }
    /**
     * @return List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
     * 
     */
    public List<ObjectLambdaAccessPointConfigurationTransformationConfiguration> transformationConfigurations() {
        return this.transformationConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedFeatures;
        private @Nullable Boolean cloudWatchMetricsEnabled;
        private String supportingAccessPoint;
        private List<ObjectLambdaAccessPointConfigurationTransformationConfiguration> transformationConfigurations;
        public Builder() {}
        public Builder(ObjectLambdaAccessPointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedFeatures = defaults.allowedFeatures;
    	      this.cloudWatchMetricsEnabled = defaults.cloudWatchMetricsEnabled;
    	      this.supportingAccessPoint = defaults.supportingAccessPoint;
    	      this.transformationConfigurations = defaults.transformationConfigurations;
        }

        @CustomType.Setter
        public Builder allowedFeatures(@Nullable List<String> allowedFeatures) {
            this.allowedFeatures = allowedFeatures;
            return this;
        }
        public Builder allowedFeatures(String... allowedFeatures) {
            return allowedFeatures(List.of(allowedFeatures));
        }
        @CustomType.Setter
        public Builder cloudWatchMetricsEnabled(@Nullable Boolean cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder supportingAccessPoint(String supportingAccessPoint) {
            this.supportingAccessPoint = Objects.requireNonNull(supportingAccessPoint);
            return this;
        }
        @CustomType.Setter
        public Builder transformationConfigurations(List<ObjectLambdaAccessPointConfigurationTransformationConfiguration> transformationConfigurations) {
            this.transformationConfigurations = Objects.requireNonNull(transformationConfigurations);
            return this;
        }
        public Builder transformationConfigurations(ObjectLambdaAccessPointConfigurationTransformationConfiguration... transformationConfigurations) {
            return transformationConfigurations(List.of(transformationConfigurations));
        }
        public ObjectLambdaAccessPointConfiguration build() {
            final var o = new ObjectLambdaAccessPointConfiguration();
            o.allowedFeatures = allowedFeatures;
            o.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
            o.supportingAccessPoint = supportingAccessPoint;
            o.transformationConfigurations = transformationConfigurations;
            return o;
        }
    }
}
