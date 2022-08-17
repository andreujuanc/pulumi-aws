// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AccountAliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountAliasArgs Empty = new AccountAliasArgs();

    /**
     * The account alias
     * 
     */
    @Import(name="accountAlias", required=true)
    private Output<String> accountAlias;

    /**
     * @return The account alias
     * 
     */
    public Output<String> accountAlias() {
        return this.accountAlias;
    }

    private AccountAliasArgs() {}

    private AccountAliasArgs(AccountAliasArgs $) {
        this.accountAlias = $.accountAlias;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountAliasArgs $;

        public Builder() {
            $ = new AccountAliasArgs();
        }

        public Builder(AccountAliasArgs defaults) {
            $ = new AccountAliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountAlias The account alias
         * 
         * @return builder
         * 
         */
        public Builder accountAlias(Output<String> accountAlias) {
            $.accountAlias = accountAlias;
            return this;
        }

        /**
         * @param accountAlias The account alias
         * 
         * @return builder
         * 
         */
        public Builder accountAlias(String accountAlias) {
            return accountAlias(Output.of(accountAlias));
        }

        public AccountAliasArgs build() {
            $.accountAlias = Objects.requireNonNull($.accountAlias, "expected parameter 'accountAlias' to be non-null");
            return $;
        }
    }

}