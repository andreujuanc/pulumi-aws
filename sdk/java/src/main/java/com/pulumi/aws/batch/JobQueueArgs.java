// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobQueueArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobQueueArgs Empty = new JobQueueArgs();

    /**
     * Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     * 
     */
    @Import(name="computeEnvironments", required=true)
    private Output<List<String>> computeEnvironments;

    /**
     * @return Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     * 
     */
    public Output<List<String>> computeEnvironments() {
        return this.computeEnvironments;
    }

    /**
     * Specifies the name of the job queue.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the job queue.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn&#39;t specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can&#39;t remove the fair share scheduling policy.
     * 
     */
    @Import(name="schedulingPolicyArn")
    private @Nullable Output<String> schedulingPolicyArn;

    /**
     * @return The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn&#39;t specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can&#39;t remove the fair share scheduling policy.
     * 
     */
    public Optional<Output<String>> schedulingPolicyArn() {
        return Optional.ofNullable(this.schedulingPolicyArn);
    }

    /**
     * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     * 
     */
    @Import(name="state", required=true)
    private Output<String> state;

    /**
     * @return The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private JobQueueArgs() {}

    private JobQueueArgs(JobQueueArgs $) {
        this.computeEnvironments = $.computeEnvironments;
        this.name = $.name;
        this.priority = $.priority;
        this.schedulingPolicyArn = $.schedulingPolicyArn;
        this.state = $.state;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobQueueArgs $;

        public Builder() {
            $ = new JobQueueArgs();
        }

        public Builder(JobQueueArgs defaults) {
            $ = new JobQueueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeEnvironments Specifies the set of compute environments
         * mapped to a job queue and their order.  The position of the compute environments
         * in the list will dictate the order.
         * 
         * @return builder
         * 
         */
        public Builder computeEnvironments(Output<List<String>> computeEnvironments) {
            $.computeEnvironments = computeEnvironments;
            return this;
        }

        /**
         * @param computeEnvironments Specifies the set of compute environments
         * mapped to a job queue and their order.  The position of the compute environments
         * in the list will dictate the order.
         * 
         * @return builder
         * 
         */
        public Builder computeEnvironments(List<String> computeEnvironments) {
            return computeEnvironments(Output.of(computeEnvironments));
        }

        /**
         * @param computeEnvironments Specifies the set of compute environments
         * mapped to a job queue and their order.  The position of the compute environments
         * in the list will dictate the order.
         * 
         * @return builder
         * 
         */
        public Builder computeEnvironments(String... computeEnvironments) {
            return computeEnvironments(List.of(computeEnvironments));
        }

        /**
         * @param name Specifies the name of the job queue.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the job queue.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority The priority of the job queue. Job queues with a higher priority
         * are evaluated first when associated with the same compute environment.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the job queue. Job queues with a higher priority
         * are evaluated first when associated with the same compute environment.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param schedulingPolicyArn The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn&#39;t specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can&#39;t remove the fair share scheduling policy.
         * 
         * @return builder
         * 
         */
        public Builder schedulingPolicyArn(@Nullable Output<String> schedulingPolicyArn) {
            $.schedulingPolicyArn = schedulingPolicyArn;
            return this;
        }

        /**
         * @param schedulingPolicyArn The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn&#39;t specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can&#39;t remove the fair share scheduling policy.
         * 
         * @return builder
         * 
         */
        public Builder schedulingPolicyArn(String schedulingPolicyArn) {
            return schedulingPolicyArn(Output.of(schedulingPolicyArn));
        }

        /**
         * @param state The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
         * 
         * @return builder
         * 
         */
        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public JobQueueArgs build() {
            $.computeEnvironments = Objects.requireNonNull($.computeEnvironments, "expected parameter 'computeEnvironments' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}