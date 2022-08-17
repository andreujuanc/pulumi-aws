// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscribedRuleGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscribedRuleGroupPlainArgs Empty = new GetSubscribedRuleGroupPlainArgs();

    /**
     * The name of the WAF rule group.
     * 
     */
    @Import(name="metricName")
    private @Nullable String metricName;

    /**
     * @return The name of the WAF rule group.
     * 
     */
    public Optional<String> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    /**
     * The name of the WAF rule group.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the WAF rule group.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetSubscribedRuleGroupPlainArgs() {}

    private GetSubscribedRuleGroupPlainArgs(GetSubscribedRuleGroupPlainArgs $) {
        this.metricName = $.metricName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscribedRuleGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscribedRuleGroupPlainArgs $;

        public Builder() {
            $ = new GetSubscribedRuleGroupPlainArgs();
        }

        public Builder(GetSubscribedRuleGroupPlainArgs defaults) {
            $ = new GetSubscribedRuleGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricName The name of the WAF rule group.
         * 
         * @return builder
         * 
         */
        public Builder metricName(@Nullable String metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param name The name of the WAF rule group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetSubscribedRuleGroupPlainArgs build() {
            return $;
        }
    }

}