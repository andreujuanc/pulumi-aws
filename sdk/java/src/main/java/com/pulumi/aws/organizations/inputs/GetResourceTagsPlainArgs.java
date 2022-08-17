// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourceTagsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceTagsPlainArgs Empty = new GetResourceTagsPlainArgs();

    /**
     * The ID of the resource with the tags to list. See details below.
     * 
     */
    @Import(name="resourceId", required=true)
    private String resourceId;

    /**
     * @return The ID of the resource with the tags to list. See details below.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Map of key=value pairs for each tag set on the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Map of key=value pairs for each tag set on the resource.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetResourceTagsPlainArgs() {}

    private GetResourceTagsPlainArgs(GetResourceTagsPlainArgs $) {
        this.resourceId = $.resourceId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceTagsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceTagsPlainArgs $;

        public Builder() {
            $ = new GetResourceTagsPlainArgs();
        }

        public Builder(GetResourceTagsPlainArgs defaults) {
            $ = new GetResourceTagsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId The ID of the resource with the tags to list. See details below.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param tags Map of key=value pairs for each tag set on the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetResourceTagsPlainArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}