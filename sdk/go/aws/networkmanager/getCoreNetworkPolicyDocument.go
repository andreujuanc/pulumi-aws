// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
// ### Basic Example
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/networkmanager"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := networkmanager.GetCoreNetworkPolicyDocument(ctx, &networkmanager.GetCoreNetworkPolicyDocumentArgs{
// 			AttachmentPolicies: []networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicy{
// 				networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicy{
// 					Action: networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicyAction{
// 						AssociationMethod: "constant",
// 						Segment:           pulumi.StringRef("shared"),
// 					},
// 					ConditionLogic: pulumi.StringRef("or"),
// 					Conditions: []networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicyCondition{
// 						networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicyCondition{
// 							Key:      pulumi.StringRef("segment"),
// 							Operator: pulumi.StringRef("equals"),
// 							Type:     "tag-value",
// 							Value:    pulumi.StringRef("shared"),
// 						},
// 					},
// 					RuleNumber: 100,
// 				},
// 				networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicy{
// 					Action: networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicyAction{
// 						AssociationMethod: "constant",
// 						Segment:           pulumi.StringRef("prod"),
// 					},
// 					ConditionLogic: pulumi.StringRef("or"),
// 					Conditions: []networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicyCondition{
// 						networkmanager.GetCoreNetworkPolicyDocumentAttachmentPolicyCondition{
// 							Key:      pulumi.StringRef("segment"),
// 							Operator: pulumi.StringRef("equals"),
// 							Type:     "tag-value",
// 							Value:    pulumi.StringRef("prod"),
// 						},
// 					},
// 					RuleNumber: 200,
// 				},
// 			},
// 			CoreNetworkConfigurations: []networkmanager.GetCoreNetworkPolicyDocumentCoreNetworkConfiguration{
// 				networkmanager.GetCoreNetworkPolicyDocumentCoreNetworkConfiguration{
// 					AsnRanges: []string{
// 						"64512-64555",
// 					},
// 					EdgeLocations: []networkmanager.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation{
// 						networkmanager.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation{
// 							Asn:      pulumi.IntRef(64512),
// 							Location: "us-east-1",
// 						},
// 						networkmanager.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation{
// 							Asn:      pulumi.IntRef(64513),
// 							Location: "eu-central-1",
// 						},
// 					},
// 					VpnEcmpSupport: pulumi.BoolRef(false),
// 				},
// 			},
// 			SegmentActions: []networkmanager.GetCoreNetworkPolicyDocumentSegmentAction{
// 				networkmanager.GetCoreNetworkPolicyDocumentSegmentAction{
// 					Action:  "share",
// 					Mode:    pulumi.StringRef("attachment-route"),
// 					Segment: "shared",
// 					ShareWiths: []string{
// 						"*",
// 					},
// 				},
// 			},
// 			Segments: []networkmanager.GetCoreNetworkPolicyDocumentSegment{
// 				networkmanager.GetCoreNetworkPolicyDocumentSegment{
// 					Description:                 pulumi.StringRef("Segment for shared services"),
// 					Name:                        "shared",
// 					RequireAttachmentAcceptance: pulumi.BoolRef(true),
// 				},
// 				networkmanager.GetCoreNetworkPolicyDocumentSegment{
// 					Description:                 pulumi.StringRef("Segment for prod services"),
// 					Name:                        "prod",
// 					RequireAttachmentAcceptance: pulumi.BoolRef(true),
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// `data.aws_networkmanager_core_network_policy_document.test.json` will evaluate to:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		return nil
// 	})
// }
// ```
func GetCoreNetworkPolicyDocument(ctx *pulumi.Context, args *GetCoreNetworkPolicyDocumentArgs, opts ...pulumi.InvokeOption) (*GetCoreNetworkPolicyDocumentResult, error) {
	var rv GetCoreNetworkPolicyDocumentResult
	err := ctx.Invoke("aws:networkmanager/getCoreNetworkPolicyDocument:getCoreNetworkPolicyDocument", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCoreNetworkPolicyDocument.
type GetCoreNetworkPolicyDocumentArgs struct {
	// In a core network, all attachments use the block argument `attachmentPolicies` section to map an attachment to a segment. Instead of manually associating a segment to each attachment, attachments use tags, and then the tags are used to associate the attachment to the specified segment. Detailed below.
	AttachmentPolicies []GetCoreNetworkPolicyDocumentAttachmentPolicy `pulumi:"attachmentPolicies"`
	// The core network configuration section defines the Regions where a core network should operate. For AWS Regions that are defined in the policy, the core network creates a Core Network Edge where you can connect attachments. After it's created, each Core Network Edge is peered with every other defined Region and is configured with consistent segment and routing across all Regions. Regions cannot be removed until the associated attachments are deleted. Detailed below.
	CoreNetworkConfigurations []GetCoreNetworkPolicyDocumentCoreNetworkConfiguration `pulumi:"coreNetworkConfigurations"`
	// A block argument, `segmentActions` define how routing works between segments. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
	SegmentActions []GetCoreNetworkPolicyDocumentSegmentAction `pulumi:"segmentActions"`
	// A block argument that defines the different segments in the network. Here you can provide descriptions, change defaults, and provide explicit Regional operational and route filters. The names defined for each segment are used in the `segmentActions` and `attachmentPolicies` section. Each segment is created, and operates, as a completely separated routing domain. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
	Segments []GetCoreNetworkPolicyDocumentSegment `pulumi:"segments"`
	Version  *string                               `pulumi:"version"`
}

// A collection of values returned by getCoreNetworkPolicyDocument.
type GetCoreNetworkPolicyDocumentResult struct {
	AttachmentPolicies        []GetCoreNetworkPolicyDocumentAttachmentPolicy         `pulumi:"attachmentPolicies"`
	CoreNetworkConfigurations []GetCoreNetworkPolicyDocumentCoreNetworkConfiguration `pulumi:"coreNetworkConfigurations"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Standard JSON policy document rendered based on the arguments above.
	Json           string                                      `pulumi:"json"`
	SegmentActions []GetCoreNetworkPolicyDocumentSegmentAction `pulumi:"segmentActions"`
	Segments       []GetCoreNetworkPolicyDocumentSegment       `pulumi:"segments"`
	Version        *string                                     `pulumi:"version"`
}

func GetCoreNetworkPolicyDocumentOutput(ctx *pulumi.Context, args GetCoreNetworkPolicyDocumentOutputArgs, opts ...pulumi.InvokeOption) GetCoreNetworkPolicyDocumentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCoreNetworkPolicyDocumentResult, error) {
			args := v.(GetCoreNetworkPolicyDocumentArgs)
			r, err := GetCoreNetworkPolicyDocument(ctx, &args, opts...)
			var s GetCoreNetworkPolicyDocumentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCoreNetworkPolicyDocumentResultOutput)
}

// A collection of arguments for invoking getCoreNetworkPolicyDocument.
type GetCoreNetworkPolicyDocumentOutputArgs struct {
	// In a core network, all attachments use the block argument `attachmentPolicies` section to map an attachment to a segment. Instead of manually associating a segment to each attachment, attachments use tags, and then the tags are used to associate the attachment to the specified segment. Detailed below.
	AttachmentPolicies GetCoreNetworkPolicyDocumentAttachmentPolicyArrayInput `pulumi:"attachmentPolicies"`
	// The core network configuration section defines the Regions where a core network should operate. For AWS Regions that are defined in the policy, the core network creates a Core Network Edge where you can connect attachments. After it's created, each Core Network Edge is peered with every other defined Region and is configured with consistent segment and routing across all Regions. Regions cannot be removed until the associated attachments are deleted. Detailed below.
	CoreNetworkConfigurations GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArrayInput `pulumi:"coreNetworkConfigurations"`
	// A block argument, `segmentActions` define how routing works between segments. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
	SegmentActions GetCoreNetworkPolicyDocumentSegmentActionArrayInput `pulumi:"segmentActions"`
	// A block argument that defines the different segments in the network. Here you can provide descriptions, change defaults, and provide explicit Regional operational and route filters. The names defined for each segment are used in the `segmentActions` and `attachmentPolicies` section. Each segment is created, and operates, as a completely separated routing domain. By default, attachments can only communicate with other attachments in the same segment. Detailed below.
	Segments GetCoreNetworkPolicyDocumentSegmentArrayInput `pulumi:"segments"`
	Version  pulumi.StringPtrInput                         `pulumi:"version"`
}

func (GetCoreNetworkPolicyDocumentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCoreNetworkPolicyDocumentArgs)(nil)).Elem()
}

// A collection of values returned by getCoreNetworkPolicyDocument.
type GetCoreNetworkPolicyDocumentResultOutput struct{ *pulumi.OutputState }

func (GetCoreNetworkPolicyDocumentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCoreNetworkPolicyDocumentResult)(nil)).Elem()
}

func (o GetCoreNetworkPolicyDocumentResultOutput) ToGetCoreNetworkPolicyDocumentResultOutput() GetCoreNetworkPolicyDocumentResultOutput {
	return o
}

func (o GetCoreNetworkPolicyDocumentResultOutput) ToGetCoreNetworkPolicyDocumentResultOutputWithContext(ctx context.Context) GetCoreNetworkPolicyDocumentResultOutput {
	return o
}

func (o GetCoreNetworkPolicyDocumentResultOutput) AttachmentPolicies() GetCoreNetworkPolicyDocumentAttachmentPolicyArrayOutput {
	return o.ApplyT(func(v GetCoreNetworkPolicyDocumentResult) []GetCoreNetworkPolicyDocumentAttachmentPolicy {
		return v.AttachmentPolicies
	}).(GetCoreNetworkPolicyDocumentAttachmentPolicyArrayOutput)
}

func (o GetCoreNetworkPolicyDocumentResultOutput) CoreNetworkConfigurations() GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArrayOutput {
	return o.ApplyT(func(v GetCoreNetworkPolicyDocumentResult) []GetCoreNetworkPolicyDocumentCoreNetworkConfiguration {
		return v.CoreNetworkConfigurations
	}).(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCoreNetworkPolicyDocumentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCoreNetworkPolicyDocumentResult) string { return v.Id }).(pulumi.StringOutput)
}

// Standard JSON policy document rendered based on the arguments above.
func (o GetCoreNetworkPolicyDocumentResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetCoreNetworkPolicyDocumentResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetCoreNetworkPolicyDocumentResultOutput) SegmentActions() GetCoreNetworkPolicyDocumentSegmentActionArrayOutput {
	return o.ApplyT(func(v GetCoreNetworkPolicyDocumentResult) []GetCoreNetworkPolicyDocumentSegmentAction {
		return v.SegmentActions
	}).(GetCoreNetworkPolicyDocumentSegmentActionArrayOutput)
}

func (o GetCoreNetworkPolicyDocumentResultOutput) Segments() GetCoreNetworkPolicyDocumentSegmentArrayOutput {
	return o.ApplyT(func(v GetCoreNetworkPolicyDocumentResult) []GetCoreNetworkPolicyDocumentSegment { return v.Segments }).(GetCoreNetworkPolicyDocumentSegmentArrayOutput)
}

func (o GetCoreNetworkPolicyDocumentResultOutput) Version() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCoreNetworkPolicyDocumentResult) *string { return v.Version }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCoreNetworkPolicyDocumentResultOutput{})
}