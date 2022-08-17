// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outputs;

import com.pulumi.aws.outputs.GetAvailabilityZonesFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAvailabilityZonesResult {
    private final @Nullable Boolean allAvailabilityZones;
    private final @Nullable List<String> excludeNames;
    private final @Nullable List<String> excludeZoneIds;
    private final @Nullable List<GetAvailabilityZonesFilter> filters;
    private final List<String> groupNames;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of the Availability Zone names available to the account.
     * 
     */
    private final List<String> names;
    private final @Nullable String state;
    /**
     * @return A list of the Availability Zone IDs available to the account.
     * 
     */
    private final List<String> zoneIds;

    @CustomType.Constructor
    private GetAvailabilityZonesResult(
        @CustomType.Parameter("allAvailabilityZones") @Nullable Boolean allAvailabilityZones,
        @CustomType.Parameter("excludeNames") @Nullable List<String> excludeNames,
        @CustomType.Parameter("excludeZoneIds") @Nullable List<String> excludeZoneIds,
        @CustomType.Parameter("filters") @Nullable List<GetAvailabilityZonesFilter> filters,
        @CustomType.Parameter("groupNames") List<String> groupNames,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("zoneIds") List<String> zoneIds) {
        this.allAvailabilityZones = allAvailabilityZones;
        this.excludeNames = excludeNames;
        this.excludeZoneIds = excludeZoneIds;
        this.filters = filters;
        this.groupNames = groupNames;
        this.id = id;
        this.names = names;
        this.state = state;
        this.zoneIds = zoneIds;
    }

    public Optional<Boolean> allAvailabilityZones() {
        return Optional.ofNullable(this.allAvailabilityZones);
    }
    public List<String> excludeNames() {
        return this.excludeNames == null ? List.of() : this.excludeNames;
    }
    public List<String> excludeZoneIds() {
        return this.excludeZoneIds == null ? List.of() : this.excludeZoneIds;
    }
    public List<GetAvailabilityZonesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public List<String> groupNames() {
        return this.groupNames;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of the Availability Zone names available to the account.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return A list of the Availability Zone IDs available to the account.
     * 
     */
    public List<String> zoneIds() {
        return this.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityZonesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allAvailabilityZones;
        private @Nullable List<String> excludeNames;
        private @Nullable List<String> excludeZoneIds;
        private @Nullable List<GetAvailabilityZonesFilter> filters;
        private List<String> groupNames;
        private String id;
        private List<String> names;
        private @Nullable String state;
        private List<String> zoneIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityZonesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAvailabilityZones = defaults.allAvailabilityZones;
    	      this.excludeNames = defaults.excludeNames;
    	      this.excludeZoneIds = defaults.excludeZoneIds;
    	      this.filters = defaults.filters;
    	      this.groupNames = defaults.groupNames;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.state = defaults.state;
    	      this.zoneIds = defaults.zoneIds;
        }

        public Builder allAvailabilityZones(@Nullable Boolean allAvailabilityZones) {
            this.allAvailabilityZones = allAvailabilityZones;
            return this;
        }
        public Builder excludeNames(@Nullable List<String> excludeNames) {
            this.excludeNames = excludeNames;
            return this;
        }
        public Builder excludeNames(String... excludeNames) {
            return excludeNames(List.of(excludeNames));
        }
        public Builder excludeZoneIds(@Nullable List<String> excludeZoneIds) {
            this.excludeZoneIds = excludeZoneIds;
            return this;
        }
        public Builder excludeZoneIds(String... excludeZoneIds) {
            return excludeZoneIds(List.of(excludeZoneIds));
        }
        public Builder filters(@Nullable List<GetAvailabilityZonesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAvailabilityZonesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder groupNames(List<String> groupNames) {
            this.groupNames = Objects.requireNonNull(groupNames);
            return this;
        }
        public Builder groupNames(String... groupNames) {
            return groupNames(List.of(groupNames));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder zoneIds(List<String> zoneIds) {
            this.zoneIds = Objects.requireNonNull(zoneIds);
            return this;
        }
        public Builder zoneIds(String... zoneIds) {
            return zoneIds(List.of(zoneIds));
        }        public GetAvailabilityZonesResult build() {
            return new GetAvailabilityZonesResult(allAvailabilityZones, excludeNames, excludeZoneIds, filters, groupNames, id, names, state, zoneIds);
        }
    }
}