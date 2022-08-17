// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devicefarm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TestGridProjectVpcConfig {
    /**
     * @return A list of VPC security group IDs in your Amazon VPC.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * @return A list of VPC subnet IDs in your Amazon VPC.
     * 
     */
    private final List<String> subnetIds;
    /**
     * @return The ID of the Amazon VPC.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private TestGridProjectVpcConfig(
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * @return A list of VPC security group IDs in your Amazon VPC.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return A list of VPC subnet IDs in your Amazon VPC.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return The ID of the Amazon VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestGridProjectVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TestGridProjectVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public TestGridProjectVpcConfig build() {
            return new TestGridProjectVpcConfig(securityGroupIds, subnetIds, vpcId);
        }
    }
}