// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoverycontrol;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53recoverycontrol.RoutingControlArgs;
import com.pulumi.aws.route53recoverycontrol.inputs.RoutingControlState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AWS Route 53 Recovery Control Config Routing Control.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53recoverycontrol.RoutingControl;
 * import com.pulumi.aws.route53recoverycontrol.RoutingControlArgs;
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
 *         var example = new RoutingControl(&#34;example&#34;, RoutingControlArgs.builder()        
 *             .clusterArn(&#34;arn:aws:route53-recovery-control::881188118811:cluster/8d47920e-d789-437d-803a-2dcc4b204393&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53recoverycontrol.RoutingControl;
 * import com.pulumi.aws.route53recoverycontrol.RoutingControlArgs;
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
 *         var example = new RoutingControl(&#34;example&#34;, RoutingControlArgs.builder()        
 *             .clusterArn(&#34;arn:aws:route53-recovery-control::881188118811:cluster/8d47920e-d789-437d-803a-2dcc4b204393&#34;)
 *             .controlPanelArn(&#34;arn:aws:route53-recovery-control::428113431245:controlpanel/abd5fbfc052d4844a082dbf400f61da8&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Route53 Recovery Control Config Routing Control can be imported via the routing control arn, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53recoverycontrol/routingControl:RoutingControl mycontrol arn:aws:route53-recovery-control::313517334327:controlpanel/abd5fbfc052d4844a082dbf400f61da8/routingcontrol/d5d90e587870494b
 * ```
 * 
 */
@ResourceType(type="aws:route53recoverycontrol/routingControl:RoutingControl")
public class RoutingControl extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the routing control.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the routing control.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN of the cluster in which this routing control will reside.
     * 
     */
    @Export(name="clusterArn", type=String.class, parameters={})
    private Output<String> clusterArn;

    /**
     * @return ARN of the cluster in which this routing control will reside.
     * 
     */
    public Output<String> clusterArn() {
        return this.clusterArn;
    }
    /**
     * ARN of the control panel in which this routing control will reside.
     * 
     */
    @Export(name="controlPanelArn", type=String.class, parameters={})
    private Output<String> controlPanelArn;

    /**
     * @return ARN of the control panel in which this routing control will reside.
     * 
     */
    public Output<String> controlPanelArn() {
        return this.controlPanelArn;
    }
    /**
     * The name describing the routing control.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name describing the routing control.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Status of routing control. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of routing control. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoutingControl(String name) {
        this(name, RoutingControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoutingControl(String name, RoutingControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoutingControl(String name, RoutingControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoverycontrol/routingControl:RoutingControl", name, args == null ? RoutingControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoutingControl(String name, Output<String> id, @Nullable RoutingControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53recoverycontrol/routingControl:RoutingControl", name, state, makeResourceOptions(options, id));
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
    public static RoutingControl get(String name, Output<String> id, @Nullable RoutingControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoutingControl(name, id, state, options);
    }
}