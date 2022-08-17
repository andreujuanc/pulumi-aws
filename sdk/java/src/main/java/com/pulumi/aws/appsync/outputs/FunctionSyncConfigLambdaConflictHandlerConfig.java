// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionSyncConfigLambdaConflictHandlerConfig {
    /**
     * @return The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
     * 
     */
    private final @Nullable String lambdaConflictHandlerArn;

    @CustomType.Constructor
    private FunctionSyncConfigLambdaConflictHandlerConfig(@CustomType.Parameter("lambdaConflictHandlerArn") @Nullable String lambdaConflictHandlerArn) {
        this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
    }

    /**
     * @return The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
     * 
     */
    public Optional<String> lambdaConflictHandlerArn() {
        return Optional.ofNullable(this.lambdaConflictHandlerArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionSyncConfigLambdaConflictHandlerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lambdaConflictHandlerArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionSyncConfigLambdaConflictHandlerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaConflictHandlerArn = defaults.lambdaConflictHandlerArn;
        }

        public Builder lambdaConflictHandlerArn(@Nullable String lambdaConflictHandlerArn) {
            this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
            return this;
        }        public FunctionSyncConfigLambdaConflictHandlerConfig build() {
            return new FunctionSyncConfigLambdaConflictHandlerConfig(lambdaConflictHandlerArn);
        }
    }
}