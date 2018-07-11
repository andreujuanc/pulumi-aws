// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Generates an IAM policy document in JSON format.
// 
// This is a data source which can be used to construct a JSON representation of
// an IAM policy document, for use with resources which expect policy documents,
// such as the `aws_iam_policy` resource.
// 
// ```hcl
// data "aws_iam_policy_document" "example" {
//   statement {
//     sid = "1"
// 
//     actions = [
//       "s3:ListAllMyBuckets",
//       "s3:GetBucketLocation",
//     ]
// 
//     resources = [
//       "arn:aws:s3:::*",
//     ]
//   }
// 
//   statement {
//     actions = [
//       "s3:ListBucket",
//     ]
// 
//     resources = [
//       "arn:aws:s3:::${var.s3_bucket_name}",
//     ]
// 
//     condition {
//       test     = "StringLike"
//       variable = "s3:prefix"
// 
//       values = [
//         "",
//         "home/",
//         "home/&{aws:username}/",
//       ]
//     }
//   }
// 
//   statement {
//     actions = [
//       "s3:*",
//     ]
// 
//     resources = [
//       "arn:aws:s3:::${var.s3_bucket_name}/home/&{aws:username}",
//       "arn:aws:s3:::${var.s3_bucket_name}/home/&{aws:username}/*",
//     ]
//   }
// }
// 
// resource "aws_iam_policy" "example" {
//   name   = "example_policy"
//   path   = "/"
//   policy = "${data.aws_iam_policy_document.example.json}"
// }
// ```
// 
// Using this data source to generate policy documents is *optional*. It is also
// valid to use literal JSON strings within your configuration, or to use the
// `file` interpolation function to read a raw JSON policy document from a file.
func LookupPolicyDocument(ctx *pulumi.Context, args *GetPolicyDocumentArgs) (*GetPolicyDocumentResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["overrideJson"] = args.OverrideJson
		inputs["policyId"] = args.PolicyId
		inputs["sourceJson"] = args.SourceJson
		inputs["statements"] = args.Statements
	}
	outputs, err := ctx.Invoke("aws:iam/getPolicyDocument:getPolicyDocument", inputs)
	if err != nil {
		return nil, err
	}
	return &GetPolicyDocumentResult{
		Json: outputs["json"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getPolicyDocument.
type GetPolicyDocumentArgs struct {
	// An IAM policy document to import and override the
	// current policy document.  Statements with non-blank `sid`s in the override
	// document will overwrite statements with the same `sid` in the current document.
	// Statements without an `sid` cannot be overwritten.
	OverrideJson interface{}
	// An ID for the policy document.
	PolicyId interface{}
	// An IAM policy document to import as a base for the
	// current policy document.  Statements with non-blank `sid`s in the current
	// policy document will overwrite statements with the same `sid` in the source
	// json.  Statements without an `sid` cannot be overwritten.
	SourceJson interface{}
	// A nested configuration block (described below)
	// configuring one *statement* to be included in the policy document.
	Statements interface{}
}

// A collection of values returned by getPolicyDocument.
type GetPolicyDocumentResult struct {
	// The above arguments serialized as a standard JSON policy document.
	Json interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}