// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MethodResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodResponseArgs Empty = new MethodResponseArgs();

    /**
     * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @Import(name="httpMethod", required=true)
    private Output<String> httpMethod;

    /**
     * @return The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    public Output<String> httpMethod() {
        return this.httpMethod;
    }

    /**
     * The API resource ID
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return The API resource ID
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * A map of the API models used for the response&#39;s content type
     * 
     */
    @Import(name="responseModels")
    private @Nullable Output<Map<String,String>> responseModels;

    /**
     * @return A map of the API models used for the response&#39;s content type
     * 
     */
    public Optional<Output<Map<String,String>>> responseModels() {
        return Optional.ofNullable(this.responseModels);
    }

    /**
     * A map of response parameters that can be sent to the caller.
     * For example: `response_parameters = { &#34;method.response.header.X-Some-Header&#34; = true }`
     * would define that the header `X-Some-Header` can be provided on the response.
     * 
     */
    @Import(name="responseParameters")
    private @Nullable Output<Map<String,Boolean>> responseParameters;

    /**
     * @return A map of response parameters that can be sent to the caller.
     * For example: `response_parameters = { &#34;method.response.header.X-Some-Header&#34; = true }`
     * would define that the header `X-Some-Header` can be provided on the response.
     * 
     */
    public Optional<Output<Map<String,Boolean>>> responseParameters() {
        return Optional.ofNullable(this.responseParameters);
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi", required=true)
    private Output<String> restApi;

    /**
     * @return The ID of the associated REST API
     * 
     */
    public Output<String> restApi() {
        return this.restApi;
    }

    /**
     * The HTTP status code
     * 
     */
    @Import(name="statusCode", required=true)
    private Output<String> statusCode;

    /**
     * @return The HTTP status code
     * 
     */
    public Output<String> statusCode() {
        return this.statusCode;
    }

    private MethodResponseArgs() {}

    private MethodResponseArgs(MethodResponseArgs $) {
        this.httpMethod = $.httpMethod;
        this.resourceId = $.resourceId;
        this.responseModels = $.responseModels;
        this.responseParameters = $.responseParameters;
        this.restApi = $.restApi;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodResponseArgs $;

        public Builder() {
            $ = new MethodResponseArgs();
        }

        public Builder(MethodResponseArgs defaults) {
            $ = new MethodResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpMethod The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param resourceId The API resource ID
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The API resource ID
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param responseModels A map of the API models used for the response&#39;s content type
         * 
         * @return builder
         * 
         */
        public Builder responseModels(@Nullable Output<Map<String,String>> responseModels) {
            $.responseModels = responseModels;
            return this;
        }

        /**
         * @param responseModels A map of the API models used for the response&#39;s content type
         * 
         * @return builder
         * 
         */
        public Builder responseModels(Map<String,String> responseModels) {
            return responseModels(Output.of(responseModels));
        }

        /**
         * @param responseParameters A map of response parameters that can be sent to the caller.
         * For example: `response_parameters = { &#34;method.response.header.X-Some-Header&#34; = true }`
         * would define that the header `X-Some-Header` can be provided on the response.
         * 
         * @return builder
         * 
         */
        public Builder responseParameters(@Nullable Output<Map<String,Boolean>> responseParameters) {
            $.responseParameters = responseParameters;
            return this;
        }

        /**
         * @param responseParameters A map of response parameters that can be sent to the caller.
         * For example: `response_parameters = { &#34;method.response.header.X-Some-Header&#34; = true }`
         * would define that the header `X-Some-Header` can be provided on the response.
         * 
         * @return builder
         * 
         */
        public Builder responseParameters(Map<String,Boolean> responseParameters) {
            return responseParameters(Output.of(responseParameters));
        }

        /**
         * @param restApi The ID of the associated REST API
         * 
         * @return builder
         * 
         */
        public Builder restApi(Output<String> restApi) {
            $.restApi = restApi;
            return this;
        }

        /**
         * @param restApi The ID of the associated REST API
         * 
         * @return builder
         * 
         */
        public Builder restApi(String restApi) {
            return restApi(Output.of(restApi));
        }

        /**
         * @param statusCode The HTTP status code
         * 
         * @return builder
         * 
         */
        public Builder statusCode(Output<String> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode The HTTP status code
         * 
         * @return builder
         * 
         */
        public Builder statusCode(String statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public MethodResponseArgs build() {
            $.httpMethod = Objects.requireNonNull($.httpMethod, "expected parameter 'httpMethod' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.restApi = Objects.requireNonNull($.restApi, "expected parameter 'restApi' to be non-null");
            $.statusCode = Objects.requireNonNull($.statusCode, "expected parameter 'statusCode' to be non-null");
            return $;
        }
    }

}