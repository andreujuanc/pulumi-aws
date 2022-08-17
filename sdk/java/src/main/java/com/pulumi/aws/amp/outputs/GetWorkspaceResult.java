// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWorkspaceResult {
    /**
     * @return The Prometheus workspace alias.
     * 
     */
    private final String alias;
    /**
     * @return The Amazon Resource Name (ARN) of the Prometheus workspace.
     * 
     */
    private final String arn;
    /**
     * @return The creation date of the Prometheus workspace.
     * 
     */
    private final String createdDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The endpoint of the Prometheus workspace.
     * 
     */
    private final String prometheusEndpoint;
    /**
     * @return The status of the Prometheus workspace.
     * 
     */
    private final String status;
    /**
     * @return The tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;
    private final String workspaceId;

    @CustomType.Constructor
    private GetWorkspaceResult(
        @CustomType.Parameter("alias") String alias,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("prometheusEndpoint") String prometheusEndpoint,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("workspaceId") String workspaceId) {
        this.alias = alias;
        this.arn = arn;
        this.createdDate = createdDate;
        this.id = id;
        this.prometheusEndpoint = prometheusEndpoint;
        this.status = status;
        this.tags = tags;
        this.workspaceId = workspaceId;
    }

    /**
     * @return The Prometheus workspace alias.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Prometheus workspace.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The creation date of the Prometheus workspace.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The endpoint of the Prometheus workspace.
     * 
     */
    public String prometheusEndpoint() {
        return this.prometheusEndpoint;
    }
    /**
     * @return The status of the Prometheus workspace.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    public String workspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private String arn;
        private String createdDate;
        private String id;
        private String prometheusEndpoint;
        private String status;
        private Map<String,String> tags;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.prometheusEndpoint = defaults.prometheusEndpoint;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder prometheusEndpoint(String prometheusEndpoint) {
            this.prometheusEndpoint = Objects.requireNonNull(prometheusEndpoint);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(alias, arn, createdDate, id, prometheusEndpoint, status, tags, workspaceId);
        }
    }
}