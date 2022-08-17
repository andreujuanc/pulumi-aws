// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserPoolSigningCertificateResult {
    /**
     * @return The certificate string
     * 
     */
    private final String certificate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String userPoolId;

    @CustomType.Constructor
    private GetUserPoolSigningCertificateResult(
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("userPoolId") String userPoolId) {
        this.certificate = certificate;
        this.id = id;
        this.userPoolId = userPoolId;
    }

    /**
     * @return The certificate string
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String userPoolId() {
        return this.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolSigningCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String id;
        private String userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolSigningCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.id = defaults.id;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }        public GetUserPoolSigningCertificateResult build() {
            return new GetUserPoolSigningCertificateResult(certificate, id, userPoolId);
        }
    }
}