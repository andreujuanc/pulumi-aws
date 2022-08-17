// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceConfigurationS3ConfigurationDocumentsMetadataConfiguration {
    /**
     * @return A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain multiple metadata files. Use `s3_prefix` to include only the desired metadata files.
     * 
     */
    private final @Nullable String s3Prefix;

    @CustomType.Constructor
    private DataSourceConfigurationS3ConfigurationDocumentsMetadataConfiguration(@CustomType.Parameter("s3Prefix") @Nullable String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * @return A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain multiple metadata files. Use `s3_prefix` to include only the desired metadata files.
     * 
     */
    public Optional<String> s3Prefix() {
        return Optional.ofNullable(this.s3Prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfigurationS3ConfigurationDocumentsMetadataConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String s3Prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfigurationS3ConfigurationDocumentsMetadataConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Prefix = defaults.s3Prefix;
        }

        public Builder s3Prefix(@Nullable String s3Prefix) {
            this.s3Prefix = s3Prefix;
            return this;
        }        public DataSourceConfigurationS3ConfigurationDocumentsMetadataConfiguration build() {
            return new DataSourceConfigurationS3ConfigurationDocumentsMetadataConfiguration(s3Prefix);
        }
    }
}