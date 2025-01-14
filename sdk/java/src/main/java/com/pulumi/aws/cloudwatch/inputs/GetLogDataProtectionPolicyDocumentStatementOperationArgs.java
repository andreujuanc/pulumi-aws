// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs;
import com.pulumi.aws.cloudwatch.inputs.GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogDataProtectionPolicyDocumentStatementOperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetLogDataProtectionPolicyDocumentStatementOperationArgs Empty = new GetLogDataProtectionPolicyDocumentStatementOperationArgs();

    /**
     * Configures the detection of sensitive data.
     * 
     */
    @Import(name="audit")
    private @Nullable Output<GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs> audit;

    /**
     * @return Configures the detection of sensitive data.
     * 
     */
    public Optional<Output<GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs>> audit() {
        return Optional.ofNullable(this.audit);
    }

    /**
     * Configures the masking of sensitive data.
     * 
     */
    @Import(name="deidentify")
    private @Nullable Output<GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs> deidentify;

    /**
     * @return Configures the masking of sensitive data.
     * 
     */
    public Optional<Output<GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs>> deidentify() {
        return Optional.ofNullable(this.deidentify);
    }

    private GetLogDataProtectionPolicyDocumentStatementOperationArgs() {}

    private GetLogDataProtectionPolicyDocumentStatementOperationArgs(GetLogDataProtectionPolicyDocumentStatementOperationArgs $) {
        this.audit = $.audit;
        this.deidentify = $.deidentify;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogDataProtectionPolicyDocumentStatementOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogDataProtectionPolicyDocumentStatementOperationArgs $;

        public Builder() {
            $ = new GetLogDataProtectionPolicyDocumentStatementOperationArgs();
        }

        public Builder(GetLogDataProtectionPolicyDocumentStatementOperationArgs defaults) {
            $ = new GetLogDataProtectionPolicyDocumentStatementOperationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audit Configures the detection of sensitive data.
         * 
         * @return builder
         * 
         */
        public Builder audit(@Nullable Output<GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs> audit) {
            $.audit = audit;
            return this;
        }

        /**
         * @param audit Configures the detection of sensitive data.
         * 
         * @return builder
         * 
         */
        public Builder audit(GetLogDataProtectionPolicyDocumentStatementOperationAuditArgs audit) {
            return audit(Output.of(audit));
        }

        /**
         * @param deidentify Configures the masking of sensitive data.
         * 
         * @return builder
         * 
         */
        public Builder deidentify(@Nullable Output<GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs> deidentify) {
            $.deidentify = deidentify;
            return this;
        }

        /**
         * @param deidentify Configures the masking of sensitive data.
         * 
         * @return builder
         * 
         */
        public Builder deidentify(GetLogDataProtectionPolicyDocumentStatementOperationDeidentifyArgs deidentify) {
            return deidentify(Output.of(deidentify));
        }

        public GetLogDataProtectionPolicyDocumentStatementOperationArgs build() {
            return $;
        }
    }

}
