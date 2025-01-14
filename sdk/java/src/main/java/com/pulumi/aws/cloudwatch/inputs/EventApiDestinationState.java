// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventApiDestinationState extends com.pulumi.resources.ResourceArgs {

    public static final EventApiDestinationState Empty = new EventApiDestinationState();

    /**
     * The Amazon Resource Name (ARN) of the event API Destination.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the event API Destination.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * ARN of the EventBridge Connection to use for the API Destination.
     * 
     */
    @Import(name="connectionArn")
    private @Nullable Output<String> connectionArn;

    /**
     * @return ARN of the EventBridge Connection to use for the API Destination.
     * 
     */
    public Optional<Output<String>> connectionArn() {
        return Optional.ofNullable(this.connectionArn);
    }

    /**
     * The description of the new API Destination. Maximum of 512 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the new API Destination. Maximum of 512 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Select the HTTP method used for the invocation endpoint, such as GET, POST, PUT, etc.
     * 
     */
    @Import(name="httpMethod")
    private @Nullable Output<String> httpMethod;

    /**
     * @return Select the HTTP method used for the invocation endpoint, such as GET, POST, PUT, etc.
     * 
     */
    public Optional<Output<String>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * URL endpoint to invoke as a target. This could be a valid endpoint generated by a partner service. You can include &#34;*&#34; as path parameters wildcards to be set from the Target HttpParameters.
     * 
     */
    @Import(name="invocationEndpoint")
    private @Nullable Output<String> invocationEndpoint;

    /**
     * @return URL endpoint to invoke as a target. This could be a valid endpoint generated by a partner service. You can include &#34;*&#34; as path parameters wildcards to be set from the Target HttpParameters.
     * 
     */
    public Optional<Output<String>> invocationEndpoint() {
        return Optional.ofNullable(this.invocationEndpoint);
    }

    /**
     * Enter the maximum number of invocations per second to allow for this destination. Enter a value greater than 0 (default 300).
     * 
     */
    @Import(name="invocationRateLimitPerSecond")
    private @Nullable Output<Integer> invocationRateLimitPerSecond;

    /**
     * @return Enter the maximum number of invocations per second to allow for this destination. Enter a value greater than 0 (default 300).
     * 
     */
    public Optional<Output<Integer>> invocationRateLimitPerSecond() {
        return Optional.ofNullable(this.invocationRateLimitPerSecond);
    }

    /**
     * The name of the new API Destination. The name must be unique for your account. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the new API Destination. The name must be unique for your account. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private EventApiDestinationState() {}

    private EventApiDestinationState(EventApiDestinationState $) {
        this.arn = $.arn;
        this.connectionArn = $.connectionArn;
        this.description = $.description;
        this.httpMethod = $.httpMethod;
        this.invocationEndpoint = $.invocationEndpoint;
        this.invocationRateLimitPerSecond = $.invocationRateLimitPerSecond;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventApiDestinationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventApiDestinationState $;

        public Builder() {
            $ = new EventApiDestinationState();
        }

        public Builder(EventApiDestinationState defaults) {
            $ = new EventApiDestinationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the event API Destination.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the event API Destination.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param connectionArn ARN of the EventBridge Connection to use for the API Destination.
         * 
         * @return builder
         * 
         */
        public Builder connectionArn(@Nullable Output<String> connectionArn) {
            $.connectionArn = connectionArn;
            return this;
        }

        /**
         * @param connectionArn ARN of the EventBridge Connection to use for the API Destination.
         * 
         * @return builder
         * 
         */
        public Builder connectionArn(String connectionArn) {
            return connectionArn(Output.of(connectionArn));
        }

        /**
         * @param description The description of the new API Destination. Maximum of 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the new API Destination. Maximum of 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param httpMethod Select the HTTP method used for the invocation endpoint, such as GET, POST, PUT, etc.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod Select the HTTP method used for the invocation endpoint, such as GET, POST, PUT, etc.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param invocationEndpoint URL endpoint to invoke as a target. This could be a valid endpoint generated by a partner service. You can include &#34;*&#34; as path parameters wildcards to be set from the Target HttpParameters.
         * 
         * @return builder
         * 
         */
        public Builder invocationEndpoint(@Nullable Output<String> invocationEndpoint) {
            $.invocationEndpoint = invocationEndpoint;
            return this;
        }

        /**
         * @param invocationEndpoint URL endpoint to invoke as a target. This could be a valid endpoint generated by a partner service. You can include &#34;*&#34; as path parameters wildcards to be set from the Target HttpParameters.
         * 
         * @return builder
         * 
         */
        public Builder invocationEndpoint(String invocationEndpoint) {
            return invocationEndpoint(Output.of(invocationEndpoint));
        }

        /**
         * @param invocationRateLimitPerSecond Enter the maximum number of invocations per second to allow for this destination. Enter a value greater than 0 (default 300).
         * 
         * @return builder
         * 
         */
        public Builder invocationRateLimitPerSecond(@Nullable Output<Integer> invocationRateLimitPerSecond) {
            $.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
            return this;
        }

        /**
         * @param invocationRateLimitPerSecond Enter the maximum number of invocations per second to allow for this destination. Enter a value greater than 0 (default 300).
         * 
         * @return builder
         * 
         */
        public Builder invocationRateLimitPerSecond(Integer invocationRateLimitPerSecond) {
            return invocationRateLimitPerSecond(Output.of(invocationRateLimitPerSecond));
        }

        /**
         * @param name The name of the new API Destination. The name must be unique for your account. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the new API Destination. The name must be unique for your account. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public EventApiDestinationState build() {
            return $;
        }
    }

}
