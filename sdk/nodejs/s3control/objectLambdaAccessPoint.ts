// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage an S3 Object Lambda Access Point.
 * An Object Lambda access point is associated with exactly one standard access point and thus one Amazon S3 bucket.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleBucket = new aws.s3.Bucket("exampleBucket", {});
 * const exampleAccessPoint = new aws.s3.AccessPoint("exampleAccessPoint", {bucket: exampleBucket.id});
 * const exampleObjectLambdaAccessPoint = new aws.s3control.ObjectLambdaAccessPoint("exampleObjectLambdaAccessPoint", {configuration: {
 *     supportingAccessPoint: exampleAccessPoint.arn,
 *     transformationConfigurations: [{
 *         actions: ["GetObject"],
 *         contentTransformation: {
 *             awsLambda: {
 *                 functionArn: aws_lambda_function.example.arn,
 *             },
 *         },
 *     }],
 * }});
 * ```
 *
 * ## Import
 *
 * Object Lambda Access Points can be imported using the `account_id` and `name`, separated by a colon (`:`), e.g.
 *
 * ```sh
 *  $ pulumi import aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint example 123456789012:example
 * ```
 */
export class ObjectLambdaAccessPoint extends pulumi.CustomResource {
    /**
     * Get an existing ObjectLambdaAccessPoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObjectLambdaAccessPointState, opts?: pulumi.CustomResourceOptions): ObjectLambdaAccessPoint {
        return new ObjectLambdaAccessPoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:s3control/objectLambdaAccessPoint:ObjectLambdaAccessPoint';

    /**
     * Returns true if the given object is an instance of ObjectLambdaAccessPoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObjectLambdaAccessPoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObjectLambdaAccessPoint.__pulumiType;
    }

    public readonly accountId!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the Object Lambda Access Point.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     */
    public readonly configuration!: pulumi.Output<outputs.s3control.ObjectLambdaAccessPointConfiguration>;
    /**
     * The name for this Object Lambda Access Point.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ObjectLambdaAccessPoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObjectLambdaAccessPointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObjectLambdaAccessPointArgs | ObjectLambdaAccessPointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObjectLambdaAccessPointState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ObjectLambdaAccessPointArgs | undefined;
            if ((!args || args.configuration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configuration'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObjectLambdaAccessPoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObjectLambdaAccessPoint resources.
 */
export interface ObjectLambdaAccessPointState {
    accountId?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the Object Lambda Access Point.
     */
    arn?: pulumi.Input<string>;
    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     */
    configuration?: pulumi.Input<inputs.s3control.ObjectLambdaAccessPointConfiguration>;
    /**
     * The name for this Object Lambda Access Point.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ObjectLambdaAccessPoint resource.
 */
export interface ObjectLambdaAccessPointArgs {
    accountId?: pulumi.Input<string>;
    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     */
    configuration: pulumi.Input<inputs.s3control.ObjectLambdaAccessPointConfiguration>;
    /**
     * The name for this Object Lambda Access Point.
     */
    name?: pulumi.Input<string>;
}