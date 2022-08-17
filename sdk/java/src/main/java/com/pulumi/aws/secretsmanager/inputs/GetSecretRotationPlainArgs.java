// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecretRotationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretRotationPlainArgs Empty = new GetSecretRotationPlainArgs();

    /**
     * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
     * 
     */
    @Import(name="secretId", required=true)
    private String secretId;

    /**
     * @return Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
     * 
     */
    public String secretId() {
        return this.secretId;
    }

    private GetSecretRotationPlainArgs() {}

    private GetSecretRotationPlainArgs(GetSecretRotationPlainArgs $) {
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretRotationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretRotationPlainArgs $;

        public Builder() {
            $ = new GetSecretRotationPlainArgs();
        }

        public Builder(GetSecretRotationPlainArgs defaults) {
            $ = new GetSecretRotationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretId Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            $.secretId = secretId;
            return this;
        }

        public GetSecretRotationPlainArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            return $;
        }
    }

}