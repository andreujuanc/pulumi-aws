// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterArgs;
import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationState Empty = new WebAclLoggingConfigurationState();

    /**
     * The Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) that you want to associate with the web ACL.
     * 
     */
    @Import(name="logDestinationConfigs")
    private @Nullable Output<List<String>> logDestinationConfigs;

    /**
     * @return The Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) that you want to associate with the web ACL.
     * 
     */
    public Optional<Output<List<String>>> logDestinationConfigs() {
        return Optional.ofNullable(this.logDestinationConfigs);
    }

    /**
     * A configuration block that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation. See Logging Filter below for more details.
     * 
     */
    @Import(name="loggingFilter")
    private @Nullable Output<WebAclLoggingConfigurationLoggingFilterArgs> loggingFilter;

    /**
     * @return A configuration block that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation. See Logging Filter below for more details.
     * 
     */
    public Optional<Output<WebAclLoggingConfigurationLoggingFilterArgs>> loggingFilter() {
        return Optional.ofNullable(this.loggingFilter);
    }

    /**
     * The parts of the request that you want to keep out of the logs. Up to 100 `redacted_fields` blocks are supported. See Redacted Fields below for more details.
     * 
     */
    @Import(name="redactedFields")
    private @Nullable Output<List<WebAclLoggingConfigurationRedactedFieldArgs>> redactedFields;

    /**
     * @return The parts of the request that you want to keep out of the logs. Up to 100 `redacted_fields` blocks are supported. See Redacted Fields below for more details.
     * 
     */
    public Optional<Output<List<WebAclLoggingConfigurationRedactedFieldArgs>>> redactedFields() {
        return Optional.ofNullable(this.redactedFields);
    }

    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with `log_destination_configs`.
     * 
     */
    @Import(name="resourceArn")
    private @Nullable Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the web ACL that you want to associate with `log_destination_configs`.
     * 
     */
    public Optional<Output<String>> resourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }

    private WebAclLoggingConfigurationState() {}

    private WebAclLoggingConfigurationState(WebAclLoggingConfigurationState $) {
        this.logDestinationConfigs = $.logDestinationConfigs;
        this.loggingFilter = $.loggingFilter;
        this.redactedFields = $.redactedFields;
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclLoggingConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclLoggingConfigurationState $;

        public Builder() {
            $ = new WebAclLoggingConfigurationState();
        }

        public Builder(WebAclLoggingConfigurationState defaults) {
            $ = new WebAclLoggingConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param logDestinationConfigs The Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) that you want to associate with the web ACL.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationConfigs(@Nullable Output<List<String>> logDestinationConfigs) {
            $.logDestinationConfigs = logDestinationConfigs;
            return this;
        }

        /**
         * @param logDestinationConfigs The Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) that you want to associate with the web ACL.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationConfigs(List<String> logDestinationConfigs) {
            return logDestinationConfigs(Output.of(logDestinationConfigs));
        }

        /**
         * @param logDestinationConfigs The Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) that you want to associate with the web ACL.
         * 
         * @return builder
         * 
         */
        public Builder logDestinationConfigs(String... logDestinationConfigs) {
            return logDestinationConfigs(List.of(logDestinationConfigs));
        }

        /**
         * @param loggingFilter A configuration block that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation. See Logging Filter below for more details.
         * 
         * @return builder
         * 
         */
        public Builder loggingFilter(@Nullable Output<WebAclLoggingConfigurationLoggingFilterArgs> loggingFilter) {
            $.loggingFilter = loggingFilter;
            return this;
        }

        /**
         * @param loggingFilter A configuration block that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation. See Logging Filter below for more details.
         * 
         * @return builder
         * 
         */
        public Builder loggingFilter(WebAclLoggingConfigurationLoggingFilterArgs loggingFilter) {
            return loggingFilter(Output.of(loggingFilter));
        }

        /**
         * @param redactedFields The parts of the request that you want to keep out of the logs. Up to 100 `redacted_fields` blocks are supported. See Redacted Fields below for more details.
         * 
         * @return builder
         * 
         */
        public Builder redactedFields(@Nullable Output<List<WebAclLoggingConfigurationRedactedFieldArgs>> redactedFields) {
            $.redactedFields = redactedFields;
            return this;
        }

        /**
         * @param redactedFields The parts of the request that you want to keep out of the logs. Up to 100 `redacted_fields` blocks are supported. See Redacted Fields below for more details.
         * 
         * @return builder
         * 
         */
        public Builder redactedFields(List<WebAclLoggingConfigurationRedactedFieldArgs> redactedFields) {
            return redactedFields(Output.of(redactedFields));
        }

        /**
         * @param redactedFields The parts of the request that you want to keep out of the logs. Up to 100 `redacted_fields` blocks are supported. See Redacted Fields below for more details.
         * 
         * @return builder
         * 
         */
        public Builder redactedFields(WebAclLoggingConfigurationRedactedFieldArgs... redactedFields) {
            return redactedFields(List.of(redactedFields));
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the web ACL that you want to associate with `log_destination_configs`.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the web ACL that you want to associate with `log_destination_configs`.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public WebAclLoggingConfigurationState build() {
            return $;
        }
    }

}