// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupInitialLifecycleHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupInitialLifecycleHookArgs Empty = new GroupInitialLifecycleHookArgs();

    @Import(name="defaultResult")
    private @Nullable Output<String> defaultResult;

    public Optional<Output<String>> defaultResult() {
        return Optional.ofNullable(this.defaultResult);
    }

    @Import(name="heartbeatTimeout")
    private @Nullable Output<Integer> heartbeatTimeout;

    public Optional<Output<Integer>> heartbeatTimeout() {
        return Optional.ofNullable(this.heartbeatTimeout);
    }

    @Import(name="lifecycleTransition", required=true)
    private Output<String> lifecycleTransition;

    public Output<String> lifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="notificationMetadata")
    private @Nullable Output<String> notificationMetadata;

    public Optional<Output<String>> notificationMetadata() {
        return Optional.ofNullable(this.notificationMetadata);
    }

    @Import(name="notificationTargetArn")
    private @Nullable Output<String> notificationTargetArn;

    public Optional<Output<String>> notificationTargetArn() {
        return Optional.ofNullable(this.notificationTargetArn);
    }

    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    private GroupInitialLifecycleHookArgs() {}

    private GroupInitialLifecycleHookArgs(GroupInitialLifecycleHookArgs $) {
        this.defaultResult = $.defaultResult;
        this.heartbeatTimeout = $.heartbeatTimeout;
        this.lifecycleTransition = $.lifecycleTransition;
        this.name = $.name;
        this.notificationMetadata = $.notificationMetadata;
        this.notificationTargetArn = $.notificationTargetArn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupInitialLifecycleHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupInitialLifecycleHookArgs $;

        public Builder() {
            $ = new GroupInitialLifecycleHookArgs();
        }

        public Builder(GroupInitialLifecycleHookArgs defaults) {
            $ = new GroupInitialLifecycleHookArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultResult(@Nullable Output<String> defaultResult) {
            $.defaultResult = defaultResult;
            return this;
        }

        public Builder defaultResult(String defaultResult) {
            return defaultResult(Output.of(defaultResult));
        }

        public Builder heartbeatTimeout(@Nullable Output<Integer> heartbeatTimeout) {
            $.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            return heartbeatTimeout(Output.of(heartbeatTimeout));
        }

        public Builder lifecycleTransition(Output<String> lifecycleTransition) {
            $.lifecycleTransition = lifecycleTransition;
            return this;
        }

        public Builder lifecycleTransition(String lifecycleTransition) {
            return lifecycleTransition(Output.of(lifecycleTransition));
        }

        /**
         * @param name The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder notificationMetadata(@Nullable Output<String> notificationMetadata) {
            $.notificationMetadata = notificationMetadata;
            return this;
        }

        public Builder notificationMetadata(String notificationMetadata) {
            return notificationMetadata(Output.of(notificationMetadata));
        }

        public Builder notificationTargetArn(@Nullable Output<String> notificationTargetArn) {
            $.notificationTargetArn = notificationTargetArn;
            return this;
        }

        public Builder notificationTargetArn(String notificationTargetArn) {
            return notificationTargetArn(Output.of(notificationTargetArn));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public GroupInitialLifecycleHookArgs build() {
            $.lifecycleTransition = Objects.requireNonNull($.lifecycleTransition, "expected parameter 'lifecycleTransition' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}