// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualGatewaySpecListenerConnectionPoolGrpcArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerConnectionPoolGrpcArgs Empty = new VirtualGatewaySpecListenerConnectionPoolGrpcArgs();

    /**
     * Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxRequests", required=true)
    private Output<Integer> maxRequests;

    /**
     * @return Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    public Output<Integer> maxRequests() {
        return this.maxRequests;
    }

    private VirtualGatewaySpecListenerConnectionPoolGrpcArgs() {}

    private VirtualGatewaySpecListenerConnectionPoolGrpcArgs(VirtualGatewaySpecListenerConnectionPoolGrpcArgs $) {
        this.maxRequests = $.maxRequests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolGrpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecListenerConnectionPoolGrpcArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecListenerConnectionPoolGrpcArgs();
        }

        public Builder(VirtualGatewaySpecListenerConnectionPoolGrpcArgs defaults) {
            $ = new VirtualGatewaySpecListenerConnectionPoolGrpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxRequests Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxRequests(Output<Integer> maxRequests) {
            $.maxRequests = maxRequests;
            return this;
        }

        /**
         * @param maxRequests Maximum number of inflight requests Envoy can concurrently support across hosts in upstream cluster. Minimum value of `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxRequests(Integer maxRequests) {
            return maxRequests(Output.of(maxRequests));
        }

        public VirtualGatewaySpecListenerConnectionPoolGrpcArgs build() {
            $.maxRequests = Objects.requireNonNull($.maxRequests, "expected parameter 'maxRequests' to be non-null");
            return $;
        }
    }

}