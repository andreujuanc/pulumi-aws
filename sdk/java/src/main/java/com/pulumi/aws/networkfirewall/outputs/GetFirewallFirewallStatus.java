// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.GetFirewallFirewallStatusSyncState;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirewallFirewallStatus {
    /**
     * @return Set of subnets configured for use by the firewall.
     * 
     */
    private final List<GetFirewallFirewallStatusSyncState> syncStates;

    @CustomType.Constructor
    private GetFirewallFirewallStatus(@CustomType.Parameter("syncStates") List<GetFirewallFirewallStatusSyncState> syncStates) {
        this.syncStates = syncStates;
    }

    /**
     * @return Set of subnets configured for use by the firewall.
     * 
     */
    public List<GetFirewallFirewallStatusSyncState> syncStates() {
        return this.syncStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallFirewallStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetFirewallFirewallStatusSyncState> syncStates;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallFirewallStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.syncStates = defaults.syncStates;
        }

        public Builder syncStates(List<GetFirewallFirewallStatusSyncState> syncStates) {
            this.syncStates = Objects.requireNonNull(syncStates);
            return this;
        }
        public Builder syncStates(GetFirewallFirewallStatusSyncState... syncStates) {
            return syncStates(List.of(syncStates));
        }        public GetFirewallFirewallStatus build() {
            return new GetFirewallFirewallStatus(syncStates);
        }
    }
}