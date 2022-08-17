// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ServiceDeploymentCircuitBreaker {
    /**
     * @return Whether to enable the deployment circuit breaker logic for the service.
     * 
     */
    private final Boolean enable;
    /**
     * @return Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
     */
    private final Boolean rollback;

    @CustomType.Constructor
    private ServiceDeploymentCircuitBreaker(
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("rollback") Boolean rollback) {
        this.enable = enable;
        this.rollback = rollback;
    }

    /**
     * @return Whether to enable the deployment circuit breaker logic for the service.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
     */
    public Boolean rollback() {
        return this.rollback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentCircuitBreaker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private Boolean rollback;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.rollback = defaults.rollback;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder rollback(Boolean rollback) {
            this.rollback = Objects.requireNonNull(rollback);
            return this;
        }        public ServiceDeploymentCircuitBreaker build() {
            return new ServiceDeploymentCircuitBreaker(enable, rollback);
        }
    }
}