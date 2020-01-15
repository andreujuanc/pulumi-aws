// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito.Outputs
{

    [OutputType]
    public sealed class IdentityPoolCognitoIdentityProvider
    {
        /// <summary>
        /// The client ID for the Amazon Cognito Identity User Pool.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The provider name for an Amazon Cognito Identity User Pool.
        /// </summary>
        public readonly string? ProviderName;
        /// <summary>
        /// Whether server-side token validation is enabled for the identity provider’s token or not.
        /// </summary>
        public readonly bool? ServerSideTokenCheck;

        [OutputConstructor]
        private IdentityPoolCognitoIdentityProvider(
            string? clientId,

            string? providerName,

            bool? serverSideTokenCheck)
        {
            ClientId = clientId;
            ProviderName = providerName;
            ServerSideTokenCheck = serverSideTokenCheck;
        }
    }
}