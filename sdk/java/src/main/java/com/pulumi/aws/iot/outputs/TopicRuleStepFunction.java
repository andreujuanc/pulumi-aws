// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleStepFunction {
    /**
     * @return The prefix used to generate, along with a UUID, the unique state machine execution name.
     * 
     */
    private final @Nullable String executionNamePrefix;
    /**
     * @return The ARN of the IAM role that grants access to start execution of the state machine.
     * 
     */
    private final String roleArn;
    /**
     * @return The name of the Step Functions state machine whose execution will be started.
     * 
     */
    private final String stateMachineName;

    @CustomType.Constructor
    private TopicRuleStepFunction(
        @CustomType.Parameter("executionNamePrefix") @Nullable String executionNamePrefix,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("stateMachineName") String stateMachineName) {
        this.executionNamePrefix = executionNamePrefix;
        this.roleArn = roleArn;
        this.stateMachineName = stateMachineName;
    }

    /**
     * @return The prefix used to generate, along with a UUID, the unique state machine execution name.
     * 
     */
    public Optional<String> executionNamePrefix() {
        return Optional.ofNullable(this.executionNamePrefix);
    }
    /**
     * @return The ARN of the IAM role that grants access to start execution of the state machine.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The name of the Step Functions state machine whose execution will be started.
     * 
     */
    public String stateMachineName() {
        return this.stateMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleStepFunction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String executionNamePrefix;
        private String roleArn;
        private String stateMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleStepFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionNamePrefix = defaults.executionNamePrefix;
    	      this.roleArn = defaults.roleArn;
    	      this.stateMachineName = defaults.stateMachineName;
        }

        public Builder executionNamePrefix(@Nullable String executionNamePrefix) {
            this.executionNamePrefix = executionNamePrefix;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder stateMachineName(String stateMachineName) {
            this.stateMachineName = Objects.requireNonNull(stateMachineName);
            return this;
        }        public TopicRuleStepFunction build() {
            return new TopicRuleStepFunction(executionNamePrefix, roleArn, stateMachineName);
        }
    }
}