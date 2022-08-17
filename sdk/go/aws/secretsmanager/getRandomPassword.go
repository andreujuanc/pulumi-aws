// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package secretsmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Generate a random password.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/secretsmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := secretsmanager.GetRandomPassword(ctx, &secretsmanager.GetRandomPasswordArgs{
//				ExcludeNumbers: pulumi.BoolRef(true),
//				PasswordLength: pulumi.IntRef(50),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetRandomPassword(ctx *pulumi.Context, args *GetRandomPasswordArgs, opts ...pulumi.InvokeOption) (*GetRandomPasswordResult, error) {
	var rv GetRandomPasswordResult
	err := ctx.Invoke("aws:secretsmanager/getRandomPassword:getRandomPassword", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRandomPassword.
type GetRandomPasswordArgs struct {
	// A string of the characters that you don't want in the password.
	ExcludeCharacters *string `pulumi:"excludeCharacters"`
	// Specifies whether to exclude lowercase letters from the password.
	ExcludeLowercase *bool `pulumi:"excludeLowercase"`
	// Specifies whether to exclude numbers from the password.
	ExcludeNumbers *bool `pulumi:"excludeNumbers"`
	// Specifies whether to exclude the following punctuation characters from the password: ``! " # $ % & ' ( ) * + , - . / : ; < = > ? @ [ \ ] ^ _ ` { | } ~ .``
	ExcludePunctuation *bool `pulumi:"excludePunctuation"`
	// Specifies whether to exclude uppercase letters from the password.
	ExcludeUppercase *bool `pulumi:"excludeUppercase"`
	// Specifies whether to include the space character.
	IncludeSpace *bool `pulumi:"includeSpace"`
	// The length of the password.
	PasswordLength *int `pulumi:"passwordLength"`
	// The random password.
	RandomPassword *string `pulumi:"randomPassword"`
	// Specifies whether to include at least one upper and lowercase letter, one number, and one punctuation.
	RequireEachIncludedType *bool `pulumi:"requireEachIncludedType"`
}

// A collection of values returned by getRandomPassword.
type GetRandomPasswordResult struct {
	ExcludeCharacters  *string `pulumi:"excludeCharacters"`
	ExcludeLowercase   *bool   `pulumi:"excludeLowercase"`
	ExcludeNumbers     *bool   `pulumi:"excludeNumbers"`
	ExcludePunctuation *bool   `pulumi:"excludePunctuation"`
	ExcludeUppercase   *bool   `pulumi:"excludeUppercase"`
	// The provider-assigned unique ID for this managed resource.
	Id             string `pulumi:"id"`
	IncludeSpace   *bool  `pulumi:"includeSpace"`
	PasswordLength *int   `pulumi:"passwordLength"`
	// The random password.
	RandomPassword          string `pulumi:"randomPassword"`
	RequireEachIncludedType *bool  `pulumi:"requireEachIncludedType"`
}

func GetRandomPasswordOutput(ctx *pulumi.Context, args GetRandomPasswordOutputArgs, opts ...pulumi.InvokeOption) GetRandomPasswordResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRandomPasswordResult, error) {
			args := v.(GetRandomPasswordArgs)
			r, err := GetRandomPassword(ctx, &args, opts...)
			var s GetRandomPasswordResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetRandomPasswordResultOutput)
}

// A collection of arguments for invoking getRandomPassword.
type GetRandomPasswordOutputArgs struct {
	// A string of the characters that you don't want in the password.
	ExcludeCharacters pulumi.StringPtrInput `pulumi:"excludeCharacters"`
	// Specifies whether to exclude lowercase letters from the password.
	ExcludeLowercase pulumi.BoolPtrInput `pulumi:"excludeLowercase"`
	// Specifies whether to exclude numbers from the password.
	ExcludeNumbers pulumi.BoolPtrInput `pulumi:"excludeNumbers"`
	// Specifies whether to exclude the following punctuation characters from the password: ``! " # $ % & ' ( ) * + , - . / : ; < = > ? @ [ \ ] ^ _ ` { | } ~ .``
	ExcludePunctuation pulumi.BoolPtrInput `pulumi:"excludePunctuation"`
	// Specifies whether to exclude uppercase letters from the password.
	ExcludeUppercase pulumi.BoolPtrInput `pulumi:"excludeUppercase"`
	// Specifies whether to include the space character.
	IncludeSpace pulumi.BoolPtrInput `pulumi:"includeSpace"`
	// The length of the password.
	PasswordLength pulumi.IntPtrInput `pulumi:"passwordLength"`
	// The random password.
	RandomPassword pulumi.StringPtrInput `pulumi:"randomPassword"`
	// Specifies whether to include at least one upper and lowercase letter, one number, and one punctuation.
	RequireEachIncludedType pulumi.BoolPtrInput `pulumi:"requireEachIncludedType"`
}

func (GetRandomPasswordOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRandomPasswordArgs)(nil)).Elem()
}

// A collection of values returned by getRandomPassword.
type GetRandomPasswordResultOutput struct{ *pulumi.OutputState }

func (GetRandomPasswordResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRandomPasswordResult)(nil)).Elem()
}

func (o GetRandomPasswordResultOutput) ToGetRandomPasswordResultOutput() GetRandomPasswordResultOutput {
	return o
}

func (o GetRandomPasswordResultOutput) ToGetRandomPasswordResultOutputWithContext(ctx context.Context) GetRandomPasswordResultOutput {
	return o
}

func (o GetRandomPasswordResultOutput) ExcludeCharacters() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) *string { return v.ExcludeCharacters }).(pulumi.StringPtrOutput)
}

func (o GetRandomPasswordResultOutput) ExcludeLowercase() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) *bool { return v.ExcludeLowercase }).(pulumi.BoolPtrOutput)
}

func (o GetRandomPasswordResultOutput) ExcludeNumbers() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) *bool { return v.ExcludeNumbers }).(pulumi.BoolPtrOutput)
}

func (o GetRandomPasswordResultOutput) ExcludePunctuation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) *bool { return v.ExcludePunctuation }).(pulumi.BoolPtrOutput)
}

func (o GetRandomPasswordResultOutput) ExcludeUppercase() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) *bool { return v.ExcludeUppercase }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRandomPasswordResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRandomPasswordResultOutput) IncludeSpace() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) *bool { return v.IncludeSpace }).(pulumi.BoolPtrOutput)
}

func (o GetRandomPasswordResultOutput) PasswordLength() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) *int { return v.PasswordLength }).(pulumi.IntPtrOutput)
}

// The random password.
func (o GetRandomPasswordResultOutput) RandomPassword() pulumi.StringOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) string { return v.RandomPassword }).(pulumi.StringOutput)
}

func (o GetRandomPasswordResultOutput) RequireEachIncludedType() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetRandomPasswordResult) *bool { return v.RequireEachIncludedType }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRandomPasswordResultOutput{})
}