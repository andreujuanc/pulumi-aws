// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.aws.mskconnect.outputs.CustomPluginLocationS3;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class CustomPluginLocation {
    /**
     * @return Information of the plugin file stored in Amazon S3. See below.
     * 
     */
    private final CustomPluginLocationS3 s3;

    @CustomType.Constructor
    private CustomPluginLocation(@CustomType.Parameter("s3") CustomPluginLocationS3 s3) {
        this.s3 = s3;
    }

    /**
     * @return Information of the plugin file stored in Amazon S3. See below.
     * 
     */
    public CustomPluginLocationS3 s3() {
        return this.s3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomPluginLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomPluginLocationS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomPluginLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3 = defaults.s3;
        }

        public Builder s3(CustomPluginLocationS3 s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }        public CustomPluginLocation build() {
            return new CustomPluginLocation(s3);
        }
    }
}