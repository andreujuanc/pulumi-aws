// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction {
    /**
     * @return The event action. Valid values are `BLOCK` or `NO_ACTION`.
     * 
     */
    private final String eventAction;
    /**
     * @return Whether to send a notification.
     * 
     */
    private final Boolean notify;

    @CustomType.Constructor
    private RiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction(
        @CustomType.Parameter("eventAction") String eventAction,
        @CustomType.Parameter("notify") Boolean notify) {
        this.eventAction = eventAction;
        this.notify = notify;
    }

    /**
     * @return The event action. Valid values are `BLOCK` or `NO_ACTION`.
     * 
     */
    public String eventAction() {
        return this.eventAction;
    }
    /**
     * @return Whether to send a notification.
     * 
     */
    public Boolean notify_() {
        return this.notify;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventAction;
        private Boolean notify;

        public Builder() {
    	      // Empty
        }

        public Builder(RiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventAction = defaults.eventAction;
    	      this.notify = defaults.notify;
        }

        public Builder eventAction(String eventAction) {
            this.eventAction = Objects.requireNonNull(eventAction);
            return this;
        }
        public Builder notify_(Boolean notify) {
            this.notify = Objects.requireNonNull(notify);
            return this;
        }        public RiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction build() {
            return new RiskConfigurationAccountTakeoverRiskConfigurationActionsHighAction(eventAction, notify);
        }
    }
}