// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCodeSigningConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCodeSigningConfigArgs Empty = new GetCodeSigningConfigArgs();

    /**
     * The Amazon Resource Name (ARN) of the code signing configuration.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the code signing configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetCodeSigningConfigArgs() {}

    private GetCodeSigningConfigArgs(GetCodeSigningConfigArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCodeSigningConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCodeSigningConfigArgs $;

        public Builder() {
            $ = new GetCodeSigningConfigArgs();
        }

        public Builder(GetCodeSigningConfigArgs defaults) {
            $ = new GetCodeSigningConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the code signing configuration.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the code signing configuration.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetCodeSigningConfigArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}