// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.GetFirewallFirewallStatusCapacityUsageSummaryCidrIpSetReference;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirewallFirewallStatusCapacityUsageSummaryCidr {
    /**
     * @return Available number of CIDR blocks available for use by the IP set references in a firewall.
     * 
     */
    private Integer availableCidrCount;
    /**
     * @return The list of IP set references used by a firewall.
     * 
     */
    private List<GetFirewallFirewallStatusCapacityUsageSummaryCidrIpSetReference> ipSetReferences;
    /**
     * @return Number of CIDR blocks used by the IP set references in a firewall.
     * 
     */
    private Integer utilizedCidrCount;

    private GetFirewallFirewallStatusCapacityUsageSummaryCidr() {}
    /**
     * @return Available number of CIDR blocks available for use by the IP set references in a firewall.
     * 
     */
    public Integer availableCidrCount() {
        return this.availableCidrCount;
    }
    /**
     * @return The list of IP set references used by a firewall.
     * 
     */
    public List<GetFirewallFirewallStatusCapacityUsageSummaryCidrIpSetReference> ipSetReferences() {
        return this.ipSetReferences;
    }
    /**
     * @return Number of CIDR blocks used by the IP set references in a firewall.
     * 
     */
    public Integer utilizedCidrCount() {
        return this.utilizedCidrCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallFirewallStatusCapacityUsageSummaryCidr defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer availableCidrCount;
        private List<GetFirewallFirewallStatusCapacityUsageSummaryCidrIpSetReference> ipSetReferences;
        private Integer utilizedCidrCount;
        public Builder() {}
        public Builder(GetFirewallFirewallStatusCapacityUsageSummaryCidr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableCidrCount = defaults.availableCidrCount;
    	      this.ipSetReferences = defaults.ipSetReferences;
    	      this.utilizedCidrCount = defaults.utilizedCidrCount;
        }

        @CustomType.Setter
        public Builder availableCidrCount(Integer availableCidrCount) {
            this.availableCidrCount = Objects.requireNonNull(availableCidrCount);
            return this;
        }
        @CustomType.Setter
        public Builder ipSetReferences(List<GetFirewallFirewallStatusCapacityUsageSummaryCidrIpSetReference> ipSetReferences) {
            this.ipSetReferences = Objects.requireNonNull(ipSetReferences);
            return this;
        }
        public Builder ipSetReferences(GetFirewallFirewallStatusCapacityUsageSummaryCidrIpSetReference... ipSetReferences) {
            return ipSetReferences(List.of(ipSetReferences));
        }
        @CustomType.Setter
        public Builder utilizedCidrCount(Integer utilizedCidrCount) {
            this.utilizedCidrCount = Objects.requireNonNull(utilizedCidrCount);
            return this;
        }
        public GetFirewallFirewallStatusCapacityUsageSummaryCidr build() {
            final var o = new GetFirewallFirewallStatusCapacityUsageSummaryCidr();
            o.availableCidrCount = availableCidrCount;
            o.ipSetReferences = ipSetReferences;
            o.utilizedCidrCount = utilizedCidrCount;
            return o;
        }
    }
}
