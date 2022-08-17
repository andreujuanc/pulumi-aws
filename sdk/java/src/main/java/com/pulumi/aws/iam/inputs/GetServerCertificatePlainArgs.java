// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerCertificatePlainArgs Empty = new GetServerCertificatePlainArgs();

    /**
     * sort results by expiration date. returns the certificate with expiration date in furthest in the future.
     * 
     */
    @Import(name="latest")
    private @Nullable Boolean latest;

    /**
     * @return sort results by expiration date. returns the certificate with expiration date in furthest in the future.
     * 
     */
    public Optional<Boolean> latest() {
        return Optional.ofNullable(this.latest);
    }

    /**
     * exact name of the cert to lookup
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return exact name of the cert to lookup
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * prefix of cert to filter by
     * 
     */
    @Import(name="namePrefix")
    private @Nullable String namePrefix;

    /**
     * @return prefix of cert to filter by
     * 
     */
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * prefix of path to filter by
     * 
     */
    @Import(name="pathPrefix")
    private @Nullable String pathPrefix;

    /**
     * @return prefix of path to filter by
     * 
     */
    public Optional<String> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }

    private GetServerCertificatePlainArgs() {}

    private GetServerCertificatePlainArgs(GetServerCertificatePlainArgs $) {
        this.latest = $.latest;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.pathPrefix = $.pathPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerCertificatePlainArgs $;

        public Builder() {
            $ = new GetServerCertificatePlainArgs();
        }

        public Builder(GetServerCertificatePlainArgs defaults) {
            $ = new GetServerCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param latest sort results by expiration date. returns the certificate with expiration date in furthest in the future.
         * 
         * @return builder
         * 
         */
        public Builder latest(@Nullable Boolean latest) {
            $.latest = latest;
            return this;
        }

        /**
         * @param name exact name of the cert to lookup
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namePrefix prefix of cert to filter by
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable String namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param pathPrefix prefix of path to filter by
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(@Nullable String pathPrefix) {
            $.pathPrefix = pathPrefix;
            return this;
        }

        public GetServerCertificatePlainArgs build() {
            return $;
        }
    }

}