// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.inputs;

import com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceRegionState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceRegionState Empty = new ServiceRegionState();

    /**
     * The number of domain controllers desired in the replicated directory. Minimum value of `2`.
     * 
     */
    @Import(name="desiredNumberOfDomainControllers")
    private @Nullable Output<Integer> desiredNumberOfDomainControllers;

    /**
     * @return The number of domain controllers desired in the replicated directory. Minimum value of `2`.
     * 
     */
    public Optional<Output<Integer>> desiredNumberOfDomainControllers() {
        return Optional.ofNullable(this.desiredNumberOfDomainControllers);
    }

    /**
     * The identifier of the directory to which you want to add Region replication.
     * 
     */
    @Import(name="directoryId")
    private @Nullable Output<String> directoryId;

    /**
     * @return The identifier of the directory to which you want to add Region replication.
     * 
     */
    public Optional<Output<String>> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    /**
     * The name of the Region where you want to add domain controllers for replication.
     * 
     */
    @Import(name="regionName")
    private @Nullable Output<String> regionName;

    /**
     * @return The name of the Region where you want to add domain controllers for replication.
     * 
     */
    public Optional<Output<String>> regionName() {
        return Optional.ofNullable(this.regionName);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * VPC information in the replicated Region. Detailed below.
     * 
     */
    @Import(name="vpcSettings")
    private @Nullable Output<ServiceRegionVpcSettingsArgs> vpcSettings;

    /**
     * @return VPC information in the replicated Region. Detailed below.
     * 
     */
    public Optional<Output<ServiceRegionVpcSettingsArgs>> vpcSettings() {
        return Optional.ofNullable(this.vpcSettings);
    }

    private ServiceRegionState() {}

    private ServiceRegionState(ServiceRegionState $) {
        this.desiredNumberOfDomainControllers = $.desiredNumberOfDomainControllers;
        this.directoryId = $.directoryId;
        this.regionName = $.regionName;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcSettings = $.vpcSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRegionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRegionState $;

        public Builder() {
            $ = new ServiceRegionState();
        }

        public Builder(ServiceRegionState defaults) {
            $ = new ServiceRegionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param desiredNumberOfDomainControllers The number of domain controllers desired in the replicated directory. Minimum value of `2`.
         * 
         * @return builder
         * 
         */
        public Builder desiredNumberOfDomainControllers(@Nullable Output<Integer> desiredNumberOfDomainControllers) {
            $.desiredNumberOfDomainControllers = desiredNumberOfDomainControllers;
            return this;
        }

        /**
         * @param desiredNumberOfDomainControllers The number of domain controllers desired in the replicated directory. Minimum value of `2`.
         * 
         * @return builder
         * 
         */
        public Builder desiredNumberOfDomainControllers(Integer desiredNumberOfDomainControllers) {
            return desiredNumberOfDomainControllers(Output.of(desiredNumberOfDomainControllers));
        }

        /**
         * @param directoryId The identifier of the directory to which you want to add Region replication.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(@Nullable Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The identifier of the directory to which you want to add Region replication.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param regionName The name of the Region where you want to add domain controllers for replication.
         * 
         * @return builder
         * 
         */
        public Builder regionName(@Nullable Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        /**
         * @param regionName The name of the Region where you want to add domain controllers for replication.
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcSettings VPC information in the replicated Region. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcSettings(@Nullable Output<ServiceRegionVpcSettingsArgs> vpcSettings) {
            $.vpcSettings = vpcSettings;
            return this;
        }

        /**
         * @param vpcSettings VPC information in the replicated Region. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcSettings(ServiceRegionVpcSettingsArgs vpcSettings) {
            return vpcSettings(Output.of(vpcSettings));
        }

        public ServiceRegionState build() {
            return $;
        }
    }

}