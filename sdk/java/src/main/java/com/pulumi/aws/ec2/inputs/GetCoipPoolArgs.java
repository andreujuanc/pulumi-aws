// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetCoipPoolFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCoipPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCoipPoolArgs Empty = new GetCoipPoolArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetCoipPoolFilterArgs>> filters;

    public Optional<Output<List<GetCoipPoolFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Local Gateway Route Table Id assigned to desired COIP Pool
     * 
     */
    @Import(name="localGatewayRouteTableId")
    private @Nullable Output<String> localGatewayRouteTableId;

    /**
     * @return Local Gateway Route Table Id assigned to desired COIP Pool
     * 
     */
    public Optional<Output<String>> localGatewayRouteTableId() {
        return Optional.ofNullable(this.localGatewayRouteTableId);
    }

    /**
     * The id of the specific COIP Pool to retrieve.
     * 
     */
    @Import(name="poolId")
    private @Nullable Output<String> poolId;

    /**
     * @return The id of the specific COIP Pool to retrieve.
     * 
     */
    public Optional<Output<String>> poolId() {
        return Optional.ofNullable(this.poolId);
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired COIP Pool.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags, each pair of which must exactly match
     * a pair on the desired COIP Pool.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetCoipPoolArgs() {}

    private GetCoipPoolArgs(GetCoipPoolArgs $) {
        this.filters = $.filters;
        this.localGatewayRouteTableId = $.localGatewayRouteTableId;
        this.poolId = $.poolId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCoipPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCoipPoolArgs $;

        public Builder() {
            $ = new GetCoipPoolArgs();
        }

        public Builder(GetCoipPoolArgs defaults) {
            $ = new GetCoipPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetCoipPoolFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetCoipPoolFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetCoipPoolFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param localGatewayRouteTableId Local Gateway Route Table Id assigned to desired COIP Pool
         * 
         * @return builder
         * 
         */
        public Builder localGatewayRouteTableId(@Nullable Output<String> localGatewayRouteTableId) {
            $.localGatewayRouteTableId = localGatewayRouteTableId;
            return this;
        }

        /**
         * @param localGatewayRouteTableId Local Gateway Route Table Id assigned to desired COIP Pool
         * 
         * @return builder
         * 
         */
        public Builder localGatewayRouteTableId(String localGatewayRouteTableId) {
            return localGatewayRouteTableId(Output.of(localGatewayRouteTableId));
        }

        /**
         * @param poolId The id of the specific COIP Pool to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder poolId(@Nullable Output<String> poolId) {
            $.poolId = poolId;
            return this;
        }

        /**
         * @param poolId The id of the specific COIP Pool to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder poolId(String poolId) {
            return poolId(Output.of(poolId));
        }

        /**
         * @param tags A mapping of tags, each pair of which must exactly match
         * a pair on the desired COIP Pool.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags, each pair of which must exactly match
         * a pair on the desired COIP Pool.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetCoipPoolArgs build() {
            return $;
        }
    }

}