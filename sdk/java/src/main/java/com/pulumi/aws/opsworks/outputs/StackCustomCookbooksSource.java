// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StackCustomCookbooksSource {
    /**
     * @return Password to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String password;
    /**
     * @return For sources that are version-aware, the revision to use.
     * 
     */
    private final @Nullable String revision;
    /**
     * @return SSH key to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
     */
    private final @Nullable String sshKey;
    /**
     * @return The type of source to use. For example, &#34;archive&#34;.
     * 
     */
    private final String type;
    /**
     * @return The URL where the cookbooks resource can be found.
     * 
     */
    private final String url;
    /**
     * @return Username to use when authenticating to the source.
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private StackCustomCookbooksSource(
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("revision") @Nullable String revision,
        @CustomType.Parameter("sshKey") @Nullable String sshKey,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("url") String url,
        @CustomType.Parameter("username") @Nullable String username) {
        this.password = password;
        this.revision = revision;
        this.sshKey = sshKey;
        this.type = type;
        this.url = url;
        this.username = username;
    }

    /**
     * @return Password to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return For sources that are version-aware, the revision to use.
     * 
     */
    public Optional<String> revision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * @return SSH key to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<String> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    /**
     * @return The type of source to use. For example, &#34;archive&#34;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The URL where the cookbooks resource can be found.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Username to use when authenticating to the source.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackCustomCookbooksSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable String revision;
        private @Nullable String sshKey;
        private String type;
        private String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(StackCustomCookbooksSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.revision = defaults.revision;
    	      this.sshKey = defaults.sshKey;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder revision(@Nullable String revision) {
            this.revision = revision;
            return this;
        }
        public Builder sshKey(@Nullable String sshKey) {
            this.sshKey = sshKey;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public StackCustomCookbooksSource build() {
            return new StackCustomCookbooksSource(password, revision, sshKey, type, url, username);
        }
    }
}