// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FsxOpenZfsFileSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final FsxOpenZfsFileSystemArgs Empty = new FsxOpenZfsFileSystemArgs();

    /**
     * The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
     * 
     */
    @Import(name="fsxFilesystemArn", required=true)
    private Output<String> fsxFilesystemArn;

    /**
     * @return The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
     * 
     */
    public Output<String> fsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }

    /**
     * The type of protocol that DataSync uses to access your file system. See below.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<FsxOpenZfsFileSystemProtocolArgs> protocol;

    /**
     * @return The type of protocol that DataSync uses to access your file system. See below.
     * 
     */
    public Output<FsxOpenZfsFileSystemProtocolArgs> protocol() {
        return this.protocol;
    }

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
     * 
     */
    @Import(name="securityGroupArns", required=true)
    private Output<List<String>> securityGroupArns;

    /**
     * @return The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
     * 
     */
    public Output<List<String>> securityGroupArns() {
        return this.securityGroupArns;
    }

    /**
     * Subdirectory to perform actions as source or destination. Must start with `/fsx`.
     * 
     */
    @Import(name="subdirectory")
    private @Nullable Output<String> subdirectory;

    /**
     * @return Subdirectory to perform actions as source or destination. Must start with `/fsx`.
     * 
     */
    public Optional<Output<String>> subdirectory() {
        return Optional.ofNullable(this.subdirectory);
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FsxOpenZfsFileSystemArgs() {}

    private FsxOpenZfsFileSystemArgs(FsxOpenZfsFileSystemArgs $) {
        this.fsxFilesystemArn = $.fsxFilesystemArn;
        this.protocol = $.protocol;
        this.securityGroupArns = $.securityGroupArns;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FsxOpenZfsFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FsxOpenZfsFileSystemArgs $;

        public Builder() {
            $ = new FsxOpenZfsFileSystemArgs();
        }

        public Builder(FsxOpenZfsFileSystemArgs defaults) {
            $ = new FsxOpenZfsFileSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
         * 
         * @return builder
         * 
         */
        public Builder fsxFilesystemArn(Output<String> fsxFilesystemArn) {
            $.fsxFilesystemArn = fsxFilesystemArn;
            return this;
        }

        /**
         * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for OpenZfs file system.
         * 
         * @return builder
         * 
         */
        public Builder fsxFilesystemArn(String fsxFilesystemArn) {
            return fsxFilesystemArn(Output.of(fsxFilesystemArn));
        }

        /**
         * @param protocol The type of protocol that DataSync uses to access your file system. See below.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<FsxOpenZfsFileSystemProtocolArgs> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The type of protocol that DataSync uses to access your file system. See below.
         * 
         * @return builder
         * 
         */
        public Builder protocol(FsxOpenZfsFileSystemProtocolArgs protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(Output<List<String>> securityGroupArns) {
            $.securityGroupArns = securityGroupArns;
            return this;
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(List<String> securityGroupArns) {
            return securityGroupArns(Output.of(securityGroupArns));
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for openzfs file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination. Must start with `/fsx`.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination. Must start with `/fsx`.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public FsxOpenZfsFileSystemArgs build() {
            $.fsxFilesystemArn = Objects.requireNonNull($.fsxFilesystemArn, "expected parameter 'fsxFilesystemArn' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.securityGroupArns = Objects.requireNonNull($.securityGroupArns, "expected parameter 'securityGroupArns' to be non-null");
            return $;
        }
    }

}