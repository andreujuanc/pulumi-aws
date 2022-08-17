// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Accepts a shared directory in a consumer account.
 *
 * > **NOTE:** Destroying this resource removes the shared directory from the consumer account only.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleSharedDirectory = new aws.directoryservice.SharedDirectory("exampleSharedDirectory", {
 *     directoryId: aws_directory_service_directory.example.id,
 *     notes: "example",
 *     target: {
 *         id: data.aws_caller_identity.receiver.account_id,
 *     },
 * });
 * const exampleSharedDirectoryAccepter = new aws.directoryservice.SharedDirectoryAccepter("exampleSharedDirectoryAccepter", {sharedDirectoryId: exampleSharedDirectory.sharedDirectoryId}, {
 *     provider: "awsalternate",
 * });
 * ```
 *
 * ## Import
 *
 * Directory Service Shared Directories can be imported using the shared directory ID, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter example d-9267633ece
 * ```
 */
export class SharedDirectoryAccepter extends pulumi.CustomResource {
    /**
     * Get an existing SharedDirectoryAccepter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SharedDirectoryAccepterState, opts?: pulumi.CustomResourceOptions): SharedDirectoryAccepter {
        return new SharedDirectoryAccepter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter';

    /**
     * Returns true if the given object is an instance of SharedDirectoryAccepter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SharedDirectoryAccepter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SharedDirectoryAccepter.__pulumiType;
    }

    /**
     * Method used when sharing a directory (i.e., `ORGANIZATIONS` or `HANDSHAKE`).
     */
    public /*out*/ readonly method!: pulumi.Output<string>;
    /**
     * Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
     */
    public /*out*/ readonly notes!: pulumi.Output<string>;
    /**
     * Account identifier of the directory owner.
     */
    public /*out*/ readonly ownerAccountId!: pulumi.Output<string>;
    /**
     * Identifier of the Managed Microsoft AD directory from the perspective of the directory owner.
     */
    public /*out*/ readonly ownerDirectoryId!: pulumi.Output<string>;
    /**
     * Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     */
    public readonly sharedDirectoryId!: pulumi.Output<string>;

    /**
     * Create a SharedDirectoryAccepter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SharedDirectoryAccepterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SharedDirectoryAccepterArgs | SharedDirectoryAccepterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SharedDirectoryAccepterState | undefined;
            resourceInputs["method"] = state ? state.method : undefined;
            resourceInputs["notes"] = state ? state.notes : undefined;
            resourceInputs["ownerAccountId"] = state ? state.ownerAccountId : undefined;
            resourceInputs["ownerDirectoryId"] = state ? state.ownerDirectoryId : undefined;
            resourceInputs["sharedDirectoryId"] = state ? state.sharedDirectoryId : undefined;
        } else {
            const args = argsOrState as SharedDirectoryAccepterArgs | undefined;
            if ((!args || args.sharedDirectoryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sharedDirectoryId'");
            }
            resourceInputs["sharedDirectoryId"] = args ? args.sharedDirectoryId : undefined;
            resourceInputs["method"] = undefined /*out*/;
            resourceInputs["notes"] = undefined /*out*/;
            resourceInputs["ownerAccountId"] = undefined /*out*/;
            resourceInputs["ownerDirectoryId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SharedDirectoryAccepter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SharedDirectoryAccepter resources.
 */
export interface SharedDirectoryAccepterState {
    /**
     * Method used when sharing a directory (i.e., `ORGANIZATIONS` or `HANDSHAKE`).
     */
    method?: pulumi.Input<string>;
    /**
     * Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
     */
    notes?: pulumi.Input<string>;
    /**
     * Account identifier of the directory owner.
     */
    ownerAccountId?: pulumi.Input<string>;
    /**
     * Identifier of the Managed Microsoft AD directory from the perspective of the directory owner.
     */
    ownerDirectoryId?: pulumi.Input<string>;
    /**
     * Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     */
    sharedDirectoryId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SharedDirectoryAccepter resource.
 */
export interface SharedDirectoryAccepterArgs {
    /**
     * Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     */
    sharedDirectoryId: pulumi.Input<string>;
}