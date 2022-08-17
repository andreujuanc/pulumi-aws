// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryExternalConnectionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryExternalConnectionsArgs Empty = new RepositoryExternalConnectionsArgs();

    /**
     * The name of the external connection associated with a repository.
     * 
     */
    @Import(name="externalConnectionName", required=true)
    private Output<String> externalConnectionName;

    /**
     * @return The name of the external connection associated with a repository.
     * 
     */
    public Output<String> externalConnectionName() {
        return this.externalConnectionName;
    }

    @Import(name="packageFormat")
    private @Nullable Output<String> packageFormat;

    public Optional<Output<String>> packageFormat() {
        return Optional.ofNullable(this.packageFormat);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private RepositoryExternalConnectionsArgs() {}

    private RepositoryExternalConnectionsArgs(RepositoryExternalConnectionsArgs $) {
        this.externalConnectionName = $.externalConnectionName;
        this.packageFormat = $.packageFormat;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryExternalConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryExternalConnectionsArgs $;

        public Builder() {
            $ = new RepositoryExternalConnectionsArgs();
        }

        public Builder(RepositoryExternalConnectionsArgs defaults) {
            $ = new RepositoryExternalConnectionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalConnectionName The name of the external connection associated with a repository.
         * 
         * @return builder
         * 
         */
        public Builder externalConnectionName(Output<String> externalConnectionName) {
            $.externalConnectionName = externalConnectionName;
            return this;
        }

        /**
         * @param externalConnectionName The name of the external connection associated with a repository.
         * 
         * @return builder
         * 
         */
        public Builder externalConnectionName(String externalConnectionName) {
            return externalConnectionName(Output.of(externalConnectionName));
        }

        public Builder packageFormat(@Nullable Output<String> packageFormat) {
            $.packageFormat = packageFormat;
            return this;
        }

        public Builder packageFormat(String packageFormat) {
            return packageFormat(Output.of(packageFormat));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public RepositoryExternalConnectionsArgs build() {
            $.externalConnectionName = Objects.requireNonNull($.externalConnectionName, "expected parameter 'externalConnectionName' to be non-null");
            return $;
        }
    }

}