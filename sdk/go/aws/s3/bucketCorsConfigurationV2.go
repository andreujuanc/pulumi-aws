// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package s3

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an S3 bucket CORS configuration resource. For more information about CORS, go to [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/userguide/cors.html) in the Amazon S3 User Guide.
//
// > **NOTE:** S3 Buckets only support a single CORS configuration. Declaring multiple `s3.BucketCorsConfigurationV2` resources to the same S3 Bucket will cause a perpetual difference in configuration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/s3"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleBucketV2, err := s3.NewBucketV2(ctx, "exampleBucketV2", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = s3.NewBucketCorsConfigurationV2(ctx, "exampleBucketCorsConfigurationV2", &s3.BucketCorsConfigurationV2Args{
// 			Bucket: exampleBucketV2.Bucket,
// 			CorsRules: s3.BucketCorsConfigurationV2CorsRuleArray{
// 				&s3.BucketCorsConfigurationV2CorsRuleArgs{
// 					AllowedHeaders: pulumi.StringArray{
// 						pulumi.String("*"),
// 					},
// 					AllowedMethods: pulumi.StringArray{
// 						pulumi.String("PUT"),
// 						pulumi.String("POST"),
// 					},
// 					AllowedOrigins: pulumi.StringArray{
// 						pulumi.String("https://s3-website-test.hashicorp.com"),
// 					},
// 					ExposeHeaders: pulumi.StringArray{
// 						pulumi.String("ETag"),
// 					},
// 					MaxAgeSeconds: pulumi.Int(3000),
// 				},
// 				&s3.BucketCorsConfigurationV2CorsRuleArgs{
// 					AllowedMethods: pulumi.StringArray{
// 						pulumi.String("GET"),
// 					},
// 					AllowedOrigins: pulumi.StringArray{
// 						pulumi.String("*"),
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// S3 bucket CORS configuration can be imported in one of two ways. If the owner (account ID) of the source bucket is the same account used to configure the Terraform AWS Provider, the S3 bucket CORS configuration resource should be imported using the `bucket` e.g.,
//
// ```sh
//  $ pulumi import aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2 example bucket-name
// ```
//
//  If the owner (account ID) of the source bucket differs from the account used to configure the Terraform AWS Provider, the S3 bucket CORS configuration resource should be imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`) e.g.,
//
// ```sh
//  $ pulumi import aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2 example bucket-name,123456789012
// ```
type BucketCorsConfigurationV2 struct {
	pulumi.CustomResourceState

	// The name of the bucket.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Set of origins and methods (cross-origin access that you want to allow) documented below. You can configure up to 100 rules.
	CorsRules BucketCorsConfigurationV2CorsRuleArrayOutput `pulumi:"corsRules"`
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrOutput `pulumi:"expectedBucketOwner"`
}

// NewBucketCorsConfigurationV2 registers a new resource with the given unique name, arguments, and options.
func NewBucketCorsConfigurationV2(ctx *pulumi.Context,
	name string, args *BucketCorsConfigurationV2Args, opts ...pulumi.ResourceOption) (*BucketCorsConfigurationV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.CorsRules == nil {
		return nil, errors.New("invalid value for required argument 'CorsRules'")
	}
	var resource BucketCorsConfigurationV2
	err := ctx.RegisterResource("aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketCorsConfigurationV2 gets an existing BucketCorsConfigurationV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketCorsConfigurationV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketCorsConfigurationV2State, opts ...pulumi.ResourceOption) (*BucketCorsConfigurationV2, error) {
	var resource BucketCorsConfigurationV2
	err := ctx.ReadResource("aws:s3/bucketCorsConfigurationV2:BucketCorsConfigurationV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketCorsConfigurationV2 resources.
type bucketCorsConfigurationV2State struct {
	// The name of the bucket.
	Bucket *string `pulumi:"bucket"`
	// Set of origins and methods (cross-origin access that you want to allow) documented below. You can configure up to 100 rules.
	CorsRules []BucketCorsConfigurationV2CorsRule `pulumi:"corsRules"`
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner *string `pulumi:"expectedBucketOwner"`
}

type BucketCorsConfigurationV2State struct {
	// The name of the bucket.
	Bucket pulumi.StringPtrInput
	// Set of origins and methods (cross-origin access that you want to allow) documented below. You can configure up to 100 rules.
	CorsRules BucketCorsConfigurationV2CorsRuleArrayInput
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrInput
}

func (BucketCorsConfigurationV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketCorsConfigurationV2State)(nil)).Elem()
}

type bucketCorsConfigurationV2Args struct {
	// The name of the bucket.
	Bucket string `pulumi:"bucket"`
	// Set of origins and methods (cross-origin access that you want to allow) documented below. You can configure up to 100 rules.
	CorsRules []BucketCorsConfigurationV2CorsRule `pulumi:"corsRules"`
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner *string `pulumi:"expectedBucketOwner"`
}

// The set of arguments for constructing a BucketCorsConfigurationV2 resource.
type BucketCorsConfigurationV2Args struct {
	// The name of the bucket.
	Bucket pulumi.StringInput
	// Set of origins and methods (cross-origin access that you want to allow) documented below. You can configure up to 100 rules.
	CorsRules BucketCorsConfigurationV2CorsRuleArrayInput
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrInput
}

func (BucketCorsConfigurationV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketCorsConfigurationV2Args)(nil)).Elem()
}

type BucketCorsConfigurationV2Input interface {
	pulumi.Input

	ToBucketCorsConfigurationV2Output() BucketCorsConfigurationV2Output
	ToBucketCorsConfigurationV2OutputWithContext(ctx context.Context) BucketCorsConfigurationV2Output
}

func (*BucketCorsConfigurationV2) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketCorsConfigurationV2)(nil)).Elem()
}

func (i *BucketCorsConfigurationV2) ToBucketCorsConfigurationV2Output() BucketCorsConfigurationV2Output {
	return i.ToBucketCorsConfigurationV2OutputWithContext(context.Background())
}

func (i *BucketCorsConfigurationV2) ToBucketCorsConfigurationV2OutputWithContext(ctx context.Context) BucketCorsConfigurationV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(BucketCorsConfigurationV2Output)
}

// BucketCorsConfigurationV2ArrayInput is an input type that accepts BucketCorsConfigurationV2Array and BucketCorsConfigurationV2ArrayOutput values.
// You can construct a concrete instance of `BucketCorsConfigurationV2ArrayInput` via:
//
//          BucketCorsConfigurationV2Array{ BucketCorsConfigurationV2Args{...} }
type BucketCorsConfigurationV2ArrayInput interface {
	pulumi.Input

	ToBucketCorsConfigurationV2ArrayOutput() BucketCorsConfigurationV2ArrayOutput
	ToBucketCorsConfigurationV2ArrayOutputWithContext(context.Context) BucketCorsConfigurationV2ArrayOutput
}

type BucketCorsConfigurationV2Array []BucketCorsConfigurationV2Input

func (BucketCorsConfigurationV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketCorsConfigurationV2)(nil)).Elem()
}

func (i BucketCorsConfigurationV2Array) ToBucketCorsConfigurationV2ArrayOutput() BucketCorsConfigurationV2ArrayOutput {
	return i.ToBucketCorsConfigurationV2ArrayOutputWithContext(context.Background())
}

func (i BucketCorsConfigurationV2Array) ToBucketCorsConfigurationV2ArrayOutputWithContext(ctx context.Context) BucketCorsConfigurationV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketCorsConfigurationV2ArrayOutput)
}

// BucketCorsConfigurationV2MapInput is an input type that accepts BucketCorsConfigurationV2Map and BucketCorsConfigurationV2MapOutput values.
// You can construct a concrete instance of `BucketCorsConfigurationV2MapInput` via:
//
//          BucketCorsConfigurationV2Map{ "key": BucketCorsConfigurationV2Args{...} }
type BucketCorsConfigurationV2MapInput interface {
	pulumi.Input

	ToBucketCorsConfigurationV2MapOutput() BucketCorsConfigurationV2MapOutput
	ToBucketCorsConfigurationV2MapOutputWithContext(context.Context) BucketCorsConfigurationV2MapOutput
}

type BucketCorsConfigurationV2Map map[string]BucketCorsConfigurationV2Input

func (BucketCorsConfigurationV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketCorsConfigurationV2)(nil)).Elem()
}

func (i BucketCorsConfigurationV2Map) ToBucketCorsConfigurationV2MapOutput() BucketCorsConfigurationV2MapOutput {
	return i.ToBucketCorsConfigurationV2MapOutputWithContext(context.Background())
}

func (i BucketCorsConfigurationV2Map) ToBucketCorsConfigurationV2MapOutputWithContext(ctx context.Context) BucketCorsConfigurationV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketCorsConfigurationV2MapOutput)
}

type BucketCorsConfigurationV2Output struct{ *pulumi.OutputState }

func (BucketCorsConfigurationV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketCorsConfigurationV2)(nil)).Elem()
}

func (o BucketCorsConfigurationV2Output) ToBucketCorsConfigurationV2Output() BucketCorsConfigurationV2Output {
	return o
}

func (o BucketCorsConfigurationV2Output) ToBucketCorsConfigurationV2OutputWithContext(ctx context.Context) BucketCorsConfigurationV2Output {
	return o
}

// The name of the bucket.
func (o BucketCorsConfigurationV2Output) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketCorsConfigurationV2) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Set of origins and methods (cross-origin access that you want to allow) documented below. You can configure up to 100 rules.
func (o BucketCorsConfigurationV2Output) CorsRules() BucketCorsConfigurationV2CorsRuleArrayOutput {
	return o.ApplyT(func(v *BucketCorsConfigurationV2) BucketCorsConfigurationV2CorsRuleArrayOutput { return v.CorsRules }).(BucketCorsConfigurationV2CorsRuleArrayOutput)
}

// The account ID of the expected bucket owner.
func (o BucketCorsConfigurationV2Output) ExpectedBucketOwner() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BucketCorsConfigurationV2) pulumi.StringPtrOutput { return v.ExpectedBucketOwner }).(pulumi.StringPtrOutput)
}

type BucketCorsConfigurationV2ArrayOutput struct{ *pulumi.OutputState }

func (BucketCorsConfigurationV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketCorsConfigurationV2)(nil)).Elem()
}

func (o BucketCorsConfigurationV2ArrayOutput) ToBucketCorsConfigurationV2ArrayOutput() BucketCorsConfigurationV2ArrayOutput {
	return o
}

func (o BucketCorsConfigurationV2ArrayOutput) ToBucketCorsConfigurationV2ArrayOutputWithContext(ctx context.Context) BucketCorsConfigurationV2ArrayOutput {
	return o
}

func (o BucketCorsConfigurationV2ArrayOutput) Index(i pulumi.IntInput) BucketCorsConfigurationV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketCorsConfigurationV2 {
		return vs[0].([]*BucketCorsConfigurationV2)[vs[1].(int)]
	}).(BucketCorsConfigurationV2Output)
}

type BucketCorsConfigurationV2MapOutput struct{ *pulumi.OutputState }

func (BucketCorsConfigurationV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketCorsConfigurationV2)(nil)).Elem()
}

func (o BucketCorsConfigurationV2MapOutput) ToBucketCorsConfigurationV2MapOutput() BucketCorsConfigurationV2MapOutput {
	return o
}

func (o BucketCorsConfigurationV2MapOutput) ToBucketCorsConfigurationV2MapOutputWithContext(ctx context.Context) BucketCorsConfigurationV2MapOutput {
	return o
}

func (o BucketCorsConfigurationV2MapOutput) MapIndex(k pulumi.StringInput) BucketCorsConfigurationV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketCorsConfigurationV2 {
		return vs[0].(map[string]*BucketCorsConfigurationV2)[vs[1].(string)]
	}).(BucketCorsConfigurationV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketCorsConfigurationV2Input)(nil)).Elem(), &BucketCorsConfigurationV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketCorsConfigurationV2ArrayInput)(nil)).Elem(), BucketCorsConfigurationV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketCorsConfigurationV2MapInput)(nil)).Elem(), BucketCorsConfigurationV2Map{})
	pulumi.RegisterOutputType(BucketCorsConfigurationV2Output{})
	pulumi.RegisterOutputType(BucketCorsConfigurationV2ArrayOutput{})
	pulumi.RegisterOutputType(BucketCorsConfigurationV2MapOutput{})
}