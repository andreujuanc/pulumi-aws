// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecArgs Empty = new VirtualGatewaySpecArgs();

    /**
     * The defaults for backends.
     * 
     */
    @Import(name="backendDefaults")
    private @Nullable Output<VirtualGatewaySpecBackendDefaultsArgs> backendDefaults;

    /**
     * @return The defaults for backends.
     * 
     */
    public Optional<Output<VirtualGatewaySpecBackendDefaultsArgs>> backendDefaults() {
        return Optional.ofNullable(this.backendDefaults);
    }

    /**
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * 
     */
    @Import(name="listener", required=true)
    private Output<VirtualGatewaySpecListenerArgs> listener;

    /**
     * @return The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * 
     */
    public Output<VirtualGatewaySpecListenerArgs> listener() {
        return this.listener;
    }

    /**
     * The inbound and outbound access logging information for the virtual gateway.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<VirtualGatewaySpecLoggingArgs> logging;

    /**
     * @return The inbound and outbound access logging information for the virtual gateway.
     * 
     */
    public Optional<Output<VirtualGatewaySpecLoggingArgs>> logging() {
        return Optional.ofNullable(this.logging);
    }

    private VirtualGatewaySpecArgs() {}

    private VirtualGatewaySpecArgs(VirtualGatewaySpecArgs $) {
        this.backendDefaults = $.backendDefaults;
        this.listener = $.listener;
        this.logging = $.logging;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecArgs();
        }

        public Builder(VirtualGatewaySpecArgs defaults) {
            $ = new VirtualGatewaySpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendDefaults The defaults for backends.
         * 
         * @return builder
         * 
         */
        public Builder backendDefaults(@Nullable Output<VirtualGatewaySpecBackendDefaultsArgs> backendDefaults) {
            $.backendDefaults = backendDefaults;
            return this;
        }

        /**
         * @param backendDefaults The defaults for backends.
         * 
         * @return builder
         * 
         */
        public Builder backendDefaults(VirtualGatewaySpecBackendDefaultsArgs backendDefaults) {
            return backendDefaults(Output.of(backendDefaults));
        }

        /**
         * @param listener The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
         * 
         * @return builder
         * 
         */
        public Builder listener(Output<VirtualGatewaySpecListenerArgs> listener) {
            $.listener = listener;
            return this;
        }

        /**
         * @param listener The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
         * 
         * @return builder
         * 
         */
        public Builder listener(VirtualGatewaySpecListenerArgs listener) {
            return listener(Output.of(listener));
        }

        /**
         * @param logging The inbound and outbound access logging information for the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<VirtualGatewaySpecLoggingArgs> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging The inbound and outbound access logging information for the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder logging(VirtualGatewaySpecLoggingArgs logging) {
            return logging(Output.of(logging));
        }

        public VirtualGatewaySpecArgs build() {
            $.listener = Objects.requireNonNull($.listener, "expected parameter 'listener' to be non-null");
            return $;
        }
    }

}