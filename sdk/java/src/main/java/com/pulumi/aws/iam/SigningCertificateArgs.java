// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final SigningCertificateArgs Empty = new SigningCertificateArgs();

    /**
     * The contents of the signing certificate in PEM-encoded format.
     * 
     */
    @Import(name="certificateBody", required=true)
    private Output<String> certificateBody;

    /**
     * @return The contents of the signing certificate in PEM-encoded format.
     * 
     */
    public Output<String> certificateBody() {
        return this.certificateBody;
    }

    /**
     * The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The name of the user the signing certificate is for.
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return The name of the user the signing certificate is for.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private SigningCertificateArgs() {}

    private SigningCertificateArgs(SigningCertificateArgs $) {
        this.certificateBody = $.certificateBody;
        this.status = $.status;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningCertificateArgs $;

        public Builder() {
            $ = new SigningCertificateArgs();
        }

        public Builder(SigningCertificateArgs defaults) {
            $ = new SigningCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateBody The contents of the signing certificate in PEM-encoded format.
         * 
         * @return builder
         * 
         */
        public Builder certificateBody(Output<String> certificateBody) {
            $.certificateBody = certificateBody;
            return this;
        }

        /**
         * @param certificateBody The contents of the signing certificate in PEM-encoded format.
         * 
         * @return builder
         * 
         */
        public Builder certificateBody(String certificateBody) {
            return certificateBody(Output.of(certificateBody));
        }

        /**
         * @param status The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param userName The name of the user the signing certificate is for.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The name of the user the signing certificate is for.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public SigningCertificateArgs build() {
            $.certificateBody = Objects.requireNonNull($.certificateBody, "expected parameter 'certificateBody' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}