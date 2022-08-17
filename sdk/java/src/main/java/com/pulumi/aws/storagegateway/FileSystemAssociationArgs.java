// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.aws.storagegateway.inputs.FileSystemAssociationCacheAttributesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemAssociationArgs Empty = new FileSystemAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * 
     */
    @Import(name="auditDestinationArn")
    private @Nullable Output<String> auditDestinationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * 
     */
    public Optional<Output<String>> auditDestinationArn() {
        return Optional.ofNullable(this.auditDestinationArn);
    }

    /**
     * Refresh cache information. see Cache Attributes for more details.
     * 
     */
    @Import(name="cacheAttributes")
    private @Nullable Output<FileSystemAssociationCacheAttributesArgs> cacheAttributes;

    /**
     * @return Refresh cache information. see Cache Attributes for more details.
     * 
     */
    public Optional<Output<FileSystemAssociationCacheAttributesArgs>> cacheAttributes() {
        return Optional.ofNullable(this.cacheAttributes);
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Import(name="gatewayArn", required=true)
    private Output<String> gatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    public Output<String> gatewayArn() {
        return this.gatewayArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * 
     */
    @Import(name="locationArn", required=true)
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
     * 
     */
    public Output<String> locationArn() {
        return this.locationArn;
    }

    /**
     * The password of the user credential.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password of the user credential.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private FileSystemAssociationArgs() {}

    private FileSystemAssociationArgs(FileSystemAssociationArgs $) {
        this.auditDestinationArn = $.auditDestinationArn;
        this.cacheAttributes = $.cacheAttributes;
        this.gatewayArn = $.gatewayArn;
        this.locationArn = $.locationArn;
        this.password = $.password;
        this.tags = $.tags;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemAssociationArgs $;

        public Builder() {
            $ = new FileSystemAssociationArgs();
        }

        public Builder(FileSystemAssociationArgs defaults) {
            $ = new FileSystemAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditDestinationArn The Amazon Resource Name (ARN) of the storage used for the audit logs.
         * 
         * @return builder
         * 
         */
        public Builder auditDestinationArn(@Nullable Output<String> auditDestinationArn) {
            $.auditDestinationArn = auditDestinationArn;
            return this;
        }

        /**
         * @param auditDestinationArn The Amazon Resource Name (ARN) of the storage used for the audit logs.
         * 
         * @return builder
         * 
         */
        public Builder auditDestinationArn(String auditDestinationArn) {
            return auditDestinationArn(Output.of(auditDestinationArn));
        }

        /**
         * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
         * 
         * @return builder
         * 
         */
        public Builder cacheAttributes(@Nullable Output<FileSystemAssociationCacheAttributesArgs> cacheAttributes) {
            $.cacheAttributes = cacheAttributes;
            return this;
        }

        /**
         * @param cacheAttributes Refresh cache information. see Cache Attributes for more details.
         * 
         * @return builder
         * 
         */
        public Builder cacheAttributes(FileSystemAssociationCacheAttributesArgs cacheAttributes) {
            return cacheAttributes(Output.of(cacheAttributes));
        }

        /**
         * @param gatewayArn The Amazon Resource Name (ARN) of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayArn(Output<String> gatewayArn) {
            $.gatewayArn = gatewayArn;
            return this;
        }

        /**
         * @param gatewayArn The Amazon Resource Name (ARN) of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayArn(String gatewayArn) {
            return gatewayArn(Output.of(gatewayArn));
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(Output<String> locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            return locationArn(Output.of(locationArn));
        }

        /**
         * @param password The password of the user credential.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the user credential.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param username The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public FileSystemAssociationArgs build() {
            $.gatewayArn = Objects.requireNonNull($.gatewayArn, "expected parameter 'gatewayArn' to be non-null");
            $.locationArn = Objects.requireNonNull($.locationArn, "expected parameter 'locationArn' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}