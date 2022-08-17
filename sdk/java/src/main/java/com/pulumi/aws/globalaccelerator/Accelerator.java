// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.globalaccelerator.AcceleratorArgs;
import com.pulumi.aws.globalaccelerator.inputs.AcceleratorState;
import com.pulumi.aws.globalaccelerator.outputs.AcceleratorAttributes;
import com.pulumi.aws.globalaccelerator.outputs.AcceleratorIpSet;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a Global Accelerator accelerator.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.globalaccelerator.Accelerator;
 * import com.pulumi.aws.globalaccelerator.AcceleratorArgs;
 * import com.pulumi.aws.globalaccelerator.inputs.AcceleratorAttributesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Accelerator(&#34;example&#34;, AcceleratorArgs.builder()        
 *             .attributes(AcceleratorAttributesArgs.builder()
 *                 .flowLogsEnabled(true)
 *                 .flowLogsS3Bucket(&#34;example-bucket&#34;)
 *                 .flowLogsS3Prefix(&#34;flow-logs/&#34;)
 *                 .build())
 *             .enabled(true)
 *             .ipAddressType(&#34;IPV4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Accelerator accelerators can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:globalaccelerator/accelerator:Accelerator example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:globalaccelerator/accelerator:Accelerator")
public class Accelerator extends com.pulumi.resources.CustomResource {
    /**
     * The attributes of the accelerator. Fields documented below.
     * 
     */
    @Export(name="attributes", type=AcceleratorAttributes.class, parameters={})
    private Output</* @Nullable */ AcceleratorAttributes> attributes;

    /**
     * @return The attributes of the accelerator. Fields documented below.
     * 
     */
    public Output<Optional<AcceleratorAttributes>> attributes() {
        return Codegen.optional(this.attributes);
    }
    /**
     * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
     * * `hosted_zone_id` --  The Global Accelerator Route 53 zone ID that can be used to
     *   route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
     *   is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
     * * `hosted_zone_id` --  The Global Accelerator Route 53 zone ID that can be used to
     *   route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
     *   is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Indicates whether the accelerator is enabled. Defaults to `true`. Valid values: `true`, `false`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    @Export(name="hostedZoneId", type=String.class, parameters={})
    private Output<String> hostedZoneId;

    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * The value for the address type. Defaults to `IPV4`. Valid values: `IPV4`, `DUAL_STACK`.
     * 
     */
    @Export(name="ipAddressType", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipAddressType;

    /**
     * @return The value for the address type. Defaults to `IPV4`. Valid values: `IPV4`, `DUAL_STACK`.
     * 
     */
    public Output<Optional<String>> ipAddressType() {
        return Codegen.optional(this.ipAddressType);
    }
    /**
     * IP address set associated with the accelerator.
     * 
     */
    @Export(name="ipSets", type=List.class, parameters={AcceleratorIpSet.class})
    private Output<List<AcceleratorIpSet>> ipSets;

    /**
     * @return IP address set associated with the accelerator.
     * 
     */
    public Output<List<AcceleratorIpSet>> ipSets() {
        return this.ipSets;
    }
    /**
     * The name of the accelerator.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the accelerator.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Accelerator(String name) {
        this(name, AcceleratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Accelerator(String name, @Nullable AcceleratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Accelerator(String name, @Nullable AcceleratorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/accelerator:Accelerator", name, args == null ? AcceleratorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Accelerator(String name, Output<String> id, @Nullable AcceleratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/accelerator:Accelerator", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Accelerator get(String name, Output<String> id, @Nullable AcceleratorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Accelerator(name, id, state, options);
    }
}