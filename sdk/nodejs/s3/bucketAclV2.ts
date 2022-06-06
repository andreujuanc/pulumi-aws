// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### With ACL
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.s3.BucketV2("example", {});
 * const exampleBucketAcl = new aws.s3.BucketAclV2("exampleBucketAcl", {
 *     bucket: example.id,
 *     acl: "private",
 * });
 * ```
 * ### With Grants
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.s3.getCanonicalUserId({});
 * const exampleBucketV2 = new aws.s3.BucketV2("exampleBucketV2", {});
 * const exampleBucketAclV2 = new aws.s3.BucketAclV2("exampleBucketAclV2", {
 *     bucket: exampleBucketV2.id,
 *     accessControlPolicy: {
 *         grants: [
 *             {
 *                 grantee: {
 *                     id: current.then(current => current.id),
 *                     type: "CanonicalUser",
 *                 },
 *                 permission: "READ",
 *             },
 *             {
 *                 grantee: {
 *                     type: "Group",
 *                     uri: "http://acs.amazonaws.com/groups/s3/LogDelivery",
 *                 },
 *                 permission: "READ_ACP",
 *             },
 *         ],
 *         owner: {
 *             id: current.then(current => current.id),
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * S3 bucket ACL can be imported in one of four ways. If the owner (account ID) of the source bucket is the _same_ account used to configure the Terraform AWS Provider, and the source bucket is **not configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` e.g.,
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name
 * ```
 *
 *  If the owner (account ID) of the source bucket is the _same_ account used to configure the Terraform AWS Provider, and the source bucket is **configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` and `acl` separated by a comma (`,`), e.g.
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,private
 * ```
 *
 *  If the owner (account ID) of the source bucket _differs_ from the account used to configure the Terraform AWS Provider, and the source bucket is **not configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`) e.g.,
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012
 * ```
 *
 *  If the owner (account ID) of the source bucket _differs_ from the account used to configure the Terraform AWS Provider, and the source bucket is **configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`), e.g.,
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012,private
 * ```
 *
 *  [1]https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl
 */
export class BucketAclV2 extends pulumi.CustomResource {
    /**
     * Get an existing BucketAclV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketAclV2State, opts?: pulumi.CustomResourceOptions): BucketAclV2 {
        return new BucketAclV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:s3/bucketAclV2:BucketAclV2';

    /**
     * Returns true if the given object is an instance of BucketAclV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketAclV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketAclV2.__pulumiType;
    }

    /**
     * A configuration block that sets the ACL permissions for an object per grantee documented below.
     */
    public readonly accessControlPolicy!: pulumi.Output<outputs.s3.BucketAclV2AccessControlPolicy>;
    /**
     * The canned ACL to apply to the bucket.
     */
    public readonly acl!: pulumi.Output<string | undefined>;
    /**
     * The name of the bucket.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * The account ID of the expected bucket owner.
     */
    public readonly expectedBucketOwner!: pulumi.Output<string | undefined>;

    /**
     * Create a BucketAclV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketAclV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketAclV2Args | BucketAclV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketAclV2State | undefined;
            resourceInputs["accessControlPolicy"] = state ? state.accessControlPolicy : undefined;
            resourceInputs["acl"] = state ? state.acl : undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["expectedBucketOwner"] = state ? state.expectedBucketOwner : undefined;
        } else {
            const args = argsOrState as BucketAclV2Args | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            resourceInputs["accessControlPolicy"] = args ? args.accessControlPolicy : undefined;
            resourceInputs["acl"] = args ? args.acl : undefined;
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["expectedBucketOwner"] = args ? args.expectedBucketOwner : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BucketAclV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketAclV2 resources.
 */
export interface BucketAclV2State {
    /**
     * A configuration block that sets the ACL permissions for an object per grantee documented below.
     */
    accessControlPolicy?: pulumi.Input<inputs.s3.BucketAclV2AccessControlPolicy>;
    /**
     * The canned ACL to apply to the bucket.
     */
    acl?: pulumi.Input<string>;
    /**
     * The name of the bucket.
     */
    bucket?: pulumi.Input<string>;
    /**
     * The account ID of the expected bucket owner.
     */
    expectedBucketOwner?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BucketAclV2 resource.
 */
export interface BucketAclV2Args {
    /**
     * A configuration block that sets the ACL permissions for an object per grantee documented below.
     */
    accessControlPolicy?: pulumi.Input<inputs.s3.BucketAclV2AccessControlPolicy>;
    /**
     * The canned ACL to apply to the bucket.
     */
    acl?: pulumi.Input<string>;
    /**
     * The name of the bucket.
     */
    bucket: pulumi.Input<string>;
    /**
     * The account ID of the expected bucket owner.
     */
    expectedBucketOwner?: pulumi.Input<string>;
}