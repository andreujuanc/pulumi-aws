// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGateway
{
    /// <summary>
    /// Connects a custom domain name registered via `aws.apigateway.DomainName`
    /// with a deployed API so that its methods can be called via the
    /// custom domain name.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using System.IO;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleDeployment = new Aws.ApiGateway.Deployment("exampleDeployment", new Aws.ApiGateway.DeploymentArgs
    ///         {
    ///             RestApi = aws_api_gateway_rest_api.MyDemoAPI.Id,
    ///             StageName = "live",
    ///         });
    ///         var exampleDomainName = new Aws.ApiGateway.DomainName("exampleDomainName", new Aws.ApiGateway.DomainNameArgs
    ///         {
    ///             CertificateBody = File.ReadAllText($"{path.Module}/example.com/example.crt"),
    ///             CertificateChain = File.ReadAllText($"{path.Module}/example.com/ca.crt"),
    ///             CertificateName = "example-api",
    ///             CertificatePrivateKey = File.ReadAllText($"{path.Module}/example.com/example.key"),
    ///             DomainName = "example.com",
    ///         });
    ///         var test = new Aws.ApiGateway.BasePathMapping("test", new Aws.ApiGateway.BasePathMappingArgs
    ///         {
    ///             RestApi = aws_api_gateway_rest_api.MyDemoAPI.Id,
    ///             DomainName = exampleDomainName.Domain,
    ///             StageName = exampleDeployment.StageName,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class BasePathMapping : Pulumi.CustomResource
    {
        /// <summary>
        /// Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        /// </summary>
        [Output("basePath")]
        public Output<string?> BasePath { get; private set; } = null!;

        /// <summary>
        /// The already-registered domain name to connect the API to.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// The id of the API to connect.
        /// </summary>
        [Output("restApi")]
        public Output<string> RestApi { get; private set; } = null!;

        /// <summary>
        /// The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        /// </summary>
        [Output("stageName")]
        public Output<string?> StageName { get; private set; } = null!;


        /// <summary>
        /// Create a BasePathMapping resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BasePathMapping(string name, BasePathMappingArgs args, CustomResourceOptions? options = null)
            : base("aws:apigateway/basePathMapping:BasePathMapping", name, args ?? new BasePathMappingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BasePathMapping(string name, Input<string> id, BasePathMappingState? state = null, CustomResourceOptions? options = null)
            : base("aws:apigateway/basePathMapping:BasePathMapping", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing BasePathMapping resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BasePathMapping Get(string name, Input<string> id, BasePathMappingState? state = null, CustomResourceOptions? options = null)
        {
            return new BasePathMapping(name, id, state, options);
        }
    }

    public sealed class BasePathMappingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        /// </summary>
        [Input("basePath")]
        public Input<string>? BasePath { get; set; }

        /// <summary>
        /// The already-registered domain name to connect the API to.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// The id of the API to connect.
        /// </summary>
        [Input("restApi", required: true)]
        public Input<string> RestApi { get; set; } = null!;

        /// <summary>
        /// The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        /// </summary>
        [Input("stageName")]
        public Input<string>? StageName { get; set; }

        public BasePathMappingArgs()
        {
        }
    }

    public sealed class BasePathMappingState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
        /// </summary>
        [Input("basePath")]
        public Input<string>? BasePath { get; set; }

        /// <summary>
        /// The already-registered domain name to connect the API to.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// The id of the API to connect.
        /// </summary>
        [Input("restApi")]
        public Input<string>? RestApi { get; set; }

        /// <summary>
        /// The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
        /// </summary>
        [Input("stageName")]
        public Input<string>? StageName { get; set; }

        public BasePathMappingState()
        {
        }
    }
}