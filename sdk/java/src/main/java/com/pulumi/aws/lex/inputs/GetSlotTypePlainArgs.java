// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSlotTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSlotTypePlainArgs Empty = new GetSlotTypePlainArgs();

    /**
     * The name of the slot type. The name is case sensitive.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the slot type. The name is case sensitive.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The version of the slot type.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return The version of the slot type.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private GetSlotTypePlainArgs() {}

    private GetSlotTypePlainArgs(GetSlotTypePlainArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSlotTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSlotTypePlainArgs $;

        public Builder() {
            $ = new GetSlotTypePlainArgs();
        }

        public Builder(GetSlotTypePlainArgs defaults) {
            $ = new GetSlotTypePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the slot type. The name is case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param version The version of the slot type.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public GetSlotTypePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}