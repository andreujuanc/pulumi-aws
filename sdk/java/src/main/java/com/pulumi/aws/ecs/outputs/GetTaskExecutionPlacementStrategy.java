// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTaskExecutionPlacementStrategy {
    /**
     * @return The field to apply the placement strategy against.
     * 
     */
    private @Nullable String field;
    /**
     * @return The type of placement strategy. Valid values are `random`, `spread`, and `binpack`.
     * 
     */
    private String type;

    private GetTaskExecutionPlacementStrategy() {}
    /**
     * @return The field to apply the placement strategy against.
     * 
     */
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }
    /**
     * @return The type of placement strategy. Valid values are `random`, `spread`, and `binpack`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskExecutionPlacementStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String field;
        private String type;
        public Builder() {}
        public Builder(GetTaskExecutionPlacementStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder field(@Nullable String field) {
            this.field = field;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTaskExecutionPlacementStrategy build() {
            final var o = new GetTaskExecutionPlacementStrategy();
            o.field = field;
            o.type = type;
            return o;
        }
    }
}
