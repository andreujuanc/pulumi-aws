// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSigningJobSourceS3 {
    private final String bucket;
    private final String key;
    private final String version;

    @CustomType.Constructor
    private GetSigningJobSourceS3(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("version") String version) {
        this.bucket = bucket;
        this.key = key;
        this.version = version;
    }

    public String bucket() {
        return this.bucket;
    }
    public String key() {
        return this.key;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningJobSourceS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String key;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningJobSourceS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
    	      this.version = defaults.version;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetSigningJobSourceS3 build() {
            return new GetSigningJobSourceS3(bucket, key, version);
        }
    }
}