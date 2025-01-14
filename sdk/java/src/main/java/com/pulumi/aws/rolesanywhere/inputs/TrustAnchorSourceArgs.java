// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rolesanywhere.inputs;

import com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceSourceDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TrustAnchorSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrustAnchorSourceArgs Empty = new TrustAnchorSourceArgs();

    /**
     * The data denoting the source of trust, documented below
     * 
     */
    @Import(name="sourceData", required=true)
    private Output<TrustAnchorSourceSourceDataArgs> sourceData;

    /**
     * @return The data denoting the source of trust, documented below
     * 
     */
    public Output<TrustAnchorSourceSourceDataArgs> sourceData() {
        return this.sourceData;
    }

    /**
     * The type of the source of trust. Must be either `AWS_ACM_PCA` or `CERTIFICATE_BUNDLE`.
     * 
     */
    @Import(name="sourceType", required=true)
    private Output<String> sourceType;

    /**
     * @return The type of the source of trust. Must be either `AWS_ACM_PCA` or `CERTIFICATE_BUNDLE`.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }

    private TrustAnchorSourceArgs() {}

    private TrustAnchorSourceArgs(TrustAnchorSourceArgs $) {
        this.sourceData = $.sourceData;
        this.sourceType = $.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrustAnchorSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrustAnchorSourceArgs $;

        public Builder() {
            $ = new TrustAnchorSourceArgs();
        }

        public Builder(TrustAnchorSourceArgs defaults) {
            $ = new TrustAnchorSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceData The data denoting the source of trust, documented below
         * 
         * @return builder
         * 
         */
        public Builder sourceData(Output<TrustAnchorSourceSourceDataArgs> sourceData) {
            $.sourceData = sourceData;
            return this;
        }

        /**
         * @param sourceData The data denoting the source of trust, documented below
         * 
         * @return builder
         * 
         */
        public Builder sourceData(TrustAnchorSourceSourceDataArgs sourceData) {
            return sourceData(Output.of(sourceData));
        }

        /**
         * @param sourceType The type of the source of trust. Must be either `AWS_ACM_PCA` or `CERTIFICATE_BUNDLE`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The type of the source of trust. Must be either `AWS_ACM_PCA` or `CERTIFICATE_BUNDLE`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public TrustAnchorSourceArgs build() {
            $.sourceData = Objects.requireNonNull($.sourceData, "expected parameter 'sourceData' to be non-null");
            $.sourceType = Objects.requireNonNull($.sourceType, "expected parameter 'sourceType' to be non-null");
            return $;
        }
    }

}
