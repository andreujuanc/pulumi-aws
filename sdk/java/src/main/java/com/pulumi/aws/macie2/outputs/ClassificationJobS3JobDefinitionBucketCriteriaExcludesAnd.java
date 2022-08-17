// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion;
import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterion;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionBucketCriteriaExcludesAnd {
    /**
     * @return A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion simpleCriterion;
    /**
     * @return A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterion tagCriterion;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinitionBucketCriteriaExcludesAnd(
        @CustomType.Parameter("simpleCriterion") @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion simpleCriterion,
        @CustomType.Parameter("tagCriterion") @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterion tagCriterion) {
        this.simpleCriterion = simpleCriterion;
        this.tagCriterion = tagCriterion;
    }

    /**
     * @return A property-based condition that defines a property, operator, and one or more values for including or excluding an S3 buckets from the job. (documented below)
     * 
     */
    public Optional<ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion> simpleCriterion() {
        return Optional.ofNullable(this.simpleCriterion);
    }
    /**
     * @return A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an S3 buckets from the job. (documented below)
     * 
     */
    public Optional<ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterion> tagCriterion() {
        return Optional.ofNullable(this.tagCriterion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionBucketCriteriaExcludesAnd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion simpleCriterion;
        private @Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterion tagCriterion;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionBucketCriteriaExcludesAnd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleCriterion = defaults.simpleCriterion;
    	      this.tagCriterion = defaults.tagCriterion;
        }

        public Builder simpleCriterion(@Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion simpleCriterion) {
            this.simpleCriterion = simpleCriterion;
            return this;
        }
        public Builder tagCriterion(@Nullable ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndTagCriterion tagCriterion) {
            this.tagCriterion = tagCriterion;
            return this;
        }        public ClassificationJobS3JobDefinitionBucketCriteriaExcludesAnd build() {
            return new ClassificationJobS3JobDefinitionBucketCriteriaExcludesAnd(simpleCriterion, tagCriterion);
        }
    }
}