// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement {
    /**
     * @return The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    private final String comparisonOperator;
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
    /**
     * @return The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    private final Integer size;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement(
        @CustomType.Parameter("comparisonOperator") String comparisonOperator,
        @CustomType.Parameter("fieldToMatch") @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("textTransformations") List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
        this.comparisonOperator = comparisonOperator;
        this.fieldToMatch = fieldToMatch;
        this.size = size;
        this.textTransformations = textTransformations;
    }

    /**
     * @return The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    public String comparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparisonOperator;
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
        private Integer size;
        private List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }
        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder textTransformations(List<RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement build() {
            return new RuleGroupRuleStatementNotStatementStatementAndStatementStatementSizeConstraintStatement(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}