// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOriginCustomOriginConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOriginCustomOriginConfigArgs Empty = new DistributionOriginCustomOriginConfigArgs();

    /**
     * The HTTP port the custom origin listens on.
     * 
     */
    @Import(name="httpPort", required=true)
    private Output<Integer> httpPort;

    /**
     * @return The HTTP port the custom origin listens on.
     * 
     */
    public Output<Integer> httpPort() {
        return this.httpPort;
    }

    /**
     * The HTTPS port the custom origin listens on.
     * 
     */
    @Import(name="httpsPort", required=true)
    private Output<Integer> httpsPort;

    /**
     * @return The HTTPS port the custom origin listens on.
     * 
     */
    public Output<Integer> httpsPort() {
        return this.httpsPort;
    }

    /**
     * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    @Import(name="originKeepaliveTimeout")
    private @Nullable Output<Integer> originKeepaliveTimeout;

    /**
     * @return The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    public Optional<Output<Integer>> originKeepaliveTimeout() {
        return Optional.ofNullable(this.originKeepaliveTimeout);
    }

    /**
     * The origin protocol policy to apply to
     * your origin. One of `http-only`, `https-only`, or `match-viewer`.
     * 
     */
    @Import(name="originProtocolPolicy", required=true)
    private Output<String> originProtocolPolicy;

    /**
     * @return The origin protocol policy to apply to
     * your origin. One of `http-only`, `https-only`, or `match-viewer`.
     * 
     */
    public Output<String> originProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    /**
     * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    @Import(name="originReadTimeout")
    private @Nullable Output<Integer> originReadTimeout;

    /**
     * @return The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    public Optional<Output<Integer>> originReadTimeout() {
        return Optional.ofNullable(this.originReadTimeout);
    }

    /**
     * The SSL/TLS protocols that you want
     * CloudFront to use when communicating with your origin over HTTPS. A list of
     * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
     * 
     */
    @Import(name="originSslProtocols", required=true)
    private Output<List<String>> originSslProtocols;

    /**
     * @return The SSL/TLS protocols that you want
     * CloudFront to use when communicating with your origin over HTTPS. A list of
     * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
     * 
     */
    public Output<List<String>> originSslProtocols() {
        return this.originSslProtocols;
    }

    private DistributionOriginCustomOriginConfigArgs() {}

    private DistributionOriginCustomOriginConfigArgs(DistributionOriginCustomOriginConfigArgs $) {
        this.httpPort = $.httpPort;
        this.httpsPort = $.httpsPort;
        this.originKeepaliveTimeout = $.originKeepaliveTimeout;
        this.originProtocolPolicy = $.originProtocolPolicy;
        this.originReadTimeout = $.originReadTimeout;
        this.originSslProtocols = $.originSslProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginCustomOriginConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginCustomOriginConfigArgs $;

        public Builder() {
            $ = new DistributionOriginCustomOriginConfigArgs();
        }

        public Builder(DistributionOriginCustomOriginConfigArgs defaults) {
            $ = new DistributionOriginCustomOriginConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpPort The HTTP port the custom origin listens on.
         * 
         * @return builder
         * 
         */
        public Builder httpPort(Output<Integer> httpPort) {
            $.httpPort = httpPort;
            return this;
        }

        /**
         * @param httpPort The HTTP port the custom origin listens on.
         * 
         * @return builder
         * 
         */
        public Builder httpPort(Integer httpPort) {
            return httpPort(Output.of(httpPort));
        }

        /**
         * @param httpsPort The HTTPS port the custom origin listens on.
         * 
         * @return builder
         * 
         */
        public Builder httpsPort(Output<Integer> httpsPort) {
            $.httpsPort = httpsPort;
            return this;
        }

        /**
         * @param httpsPort The HTTPS port the custom origin listens on.
         * 
         * @return builder
         * 
         */
        public Builder httpsPort(Integer httpsPort) {
            return httpsPort(Output.of(httpsPort));
        }

        /**
         * @param originKeepaliveTimeout The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
         * 
         * @return builder
         * 
         */
        public Builder originKeepaliveTimeout(@Nullable Output<Integer> originKeepaliveTimeout) {
            $.originKeepaliveTimeout = originKeepaliveTimeout;
            return this;
        }

        /**
         * @param originKeepaliveTimeout The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
         * 
         * @return builder
         * 
         */
        public Builder originKeepaliveTimeout(Integer originKeepaliveTimeout) {
            return originKeepaliveTimeout(Output.of(originKeepaliveTimeout));
        }

        /**
         * @param originProtocolPolicy The origin protocol policy to apply to
         * your origin. One of `http-only`, `https-only`, or `match-viewer`.
         * 
         * @return builder
         * 
         */
        public Builder originProtocolPolicy(Output<String> originProtocolPolicy) {
            $.originProtocolPolicy = originProtocolPolicy;
            return this;
        }

        /**
         * @param originProtocolPolicy The origin protocol policy to apply to
         * your origin. One of `http-only`, `https-only`, or `match-viewer`.
         * 
         * @return builder
         * 
         */
        public Builder originProtocolPolicy(String originProtocolPolicy) {
            return originProtocolPolicy(Output.of(originProtocolPolicy));
        }

        /**
         * @param originReadTimeout The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
         * 
         * @return builder
         * 
         */
        public Builder originReadTimeout(@Nullable Output<Integer> originReadTimeout) {
            $.originReadTimeout = originReadTimeout;
            return this;
        }

        /**
         * @param originReadTimeout The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
         * 
         * @return builder
         * 
         */
        public Builder originReadTimeout(Integer originReadTimeout) {
            return originReadTimeout(Output.of(originReadTimeout));
        }

        /**
         * @param originSslProtocols The SSL/TLS protocols that you want
         * CloudFront to use when communicating with your origin over HTTPS. A list of
         * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
         * 
         * @return builder
         * 
         */
        public Builder originSslProtocols(Output<List<String>> originSslProtocols) {
            $.originSslProtocols = originSslProtocols;
            return this;
        }

        /**
         * @param originSslProtocols The SSL/TLS protocols that you want
         * CloudFront to use when communicating with your origin over HTTPS. A list of
         * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
         * 
         * @return builder
         * 
         */
        public Builder originSslProtocols(List<String> originSslProtocols) {
            return originSslProtocols(Output.of(originSslProtocols));
        }

        /**
         * @param originSslProtocols The SSL/TLS protocols that you want
         * CloudFront to use when communicating with your origin over HTTPS. A list of
         * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
         * 
         * @return builder
         * 
         */
        public Builder originSslProtocols(String... originSslProtocols) {
            return originSslProtocols(List.of(originSslProtocols));
        }

        public DistributionOriginCustomOriginConfigArgs build() {
            $.httpPort = Objects.requireNonNull($.httpPort, "expected parameter 'httpPort' to be non-null");
            $.httpsPort = Objects.requireNonNull($.httpsPort, "expected parameter 'httpsPort' to be non-null");
            $.originProtocolPolicy = Objects.requireNonNull($.originProtocolPolicy, "expected parameter 'originProtocolPolicy' to be non-null");
            $.originSslProtocols = Objects.requireNonNull($.originSslProtocols, "expected parameter 'originSslProtocols' to be non-null");
            return $;
        }
    }

}