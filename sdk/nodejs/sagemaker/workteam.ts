// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Sagemaker Workteam resource.
 *
 * ## Example Usage
 * ### Cognito Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sagemaker.Workteam("example", {
 *     workteamName: "example",
 *     workforceName: aws_sagemaker_workforce.example.id,
 *     description: "example",
 *     memberDefinitions: [{
 *         cognitoMemberDefinition: {
 *             clientId: aws_cognito_user_pool_client.example.id,
 *             userPool: aws_cognito_user_pool_domain.example.user_pool_id,
 *             userGroup: aws_cognito_user_group.example.id,
 *         },
 *     }],
 * });
 * ```
 * ### Oidc Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sagemaker.Workteam("example", {
 *     workteamName: "example",
 *     workforceName: aws_sagemaker_workforce.example.id,
 *     description: "example",
 *     memberDefinitions: [{
 *         oidcMemberDefinition: {
 *             groups: ["example"],
 *         },
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Sagemaker Workteams can be imported using the `workteam_name`, e.g.
 *
 * ```sh
 *  $ pulumi import aws:sagemaker/workteam:Workteam example example
 * ```
 */
export class Workteam extends pulumi.CustomResource {
    /**
     * Get an existing Workteam resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkteamState, opts?: pulumi.CustomResourceOptions): Workteam {
        return new Workteam(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sagemaker/workteam:Workteam';

    /**
     * Returns true if the given object is an instance of Workteam.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Workteam {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Workteam.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A description of the work team.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     */
    public readonly memberDefinitions!: pulumi.Output<outputs.sagemaker.WorkteamMemberDefinition[]>;
    /**
     * Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     */
    public readonly notificationConfiguration!: pulumi.Output<outputs.sagemaker.WorkteamNotificationConfiguration | undefined>;
    /**
     * The subdomain for your OIDC Identity Provider.
     */
    public /*out*/ readonly subdomain!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    public readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The name of the Workteam (must be unique).
     */
    public readonly workforceName!: pulumi.Output<string>;
    /**
     * The name of the workforce.
     */
    public readonly workteamName!: pulumi.Output<string>;

    /**
     * Create a Workteam resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkteamArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkteamArgs | WorkteamState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkteamState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["memberDefinitions"] = state ? state.memberDefinitions : undefined;
            inputs["notificationConfiguration"] = state ? state.notificationConfiguration : undefined;
            inputs["subdomain"] = state ? state.subdomain : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
            inputs["workforceName"] = state ? state.workforceName : undefined;
            inputs["workteamName"] = state ? state.workteamName : undefined;
        } else {
            const args = argsOrState as WorkteamArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.memberDefinitions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'memberDefinitions'");
            }
            if ((!args || args.workforceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workforceName'");
            }
            if ((!args || args.workteamName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workteamName'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["memberDefinitions"] = args ? args.memberDefinitions : undefined;
            inputs["notificationConfiguration"] = args ? args.notificationConfiguration : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["tagsAll"] = args ? args.tagsAll : undefined;
            inputs["workforceName"] = args ? args.workforceName : undefined;
            inputs["workteamName"] = args ? args.workteamName : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["subdomain"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Workteam.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Workteam resources.
 */
export interface WorkteamState {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
     */
    arn?: pulumi.Input<string>;
    /**
     * A description of the work team.
     */
    description?: pulumi.Input<string>;
    /**
     * A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     */
    memberDefinitions?: pulumi.Input<pulumi.Input<inputs.sagemaker.WorkteamMemberDefinition>[]>;
    /**
     * Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     */
    notificationConfiguration?: pulumi.Input<inputs.sagemaker.WorkteamNotificationConfiguration>;
    /**
     * The subdomain for your OIDC Identity Provider.
     */
    subdomain?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Workteam (must be unique).
     */
    workforceName?: pulumi.Input<string>;
    /**
     * The name of the workforce.
     */
    workteamName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Workteam resource.
 */
export interface WorkteamArgs {
    /**
     * A description of the work team.
     */
    description: pulumi.Input<string>;
    /**
     * A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognitoMemberDefinition`. For workforces created using your own OIDC identity provider (IdP) use `oidcMemberDefinition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     */
    memberDefinitions: pulumi.Input<pulumi.Input<inputs.sagemaker.WorkteamMemberDefinition>[]>;
    /**
     * Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     */
    notificationConfiguration?: pulumi.Input<inputs.sagemaker.WorkteamNotificationConfiguration>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Workteam (must be unique).
     */
    workforceName: pulumi.Input<string>;
    /**
     * The name of the workforce.
     */
    workteamName: pulumi.Input<string>;
}