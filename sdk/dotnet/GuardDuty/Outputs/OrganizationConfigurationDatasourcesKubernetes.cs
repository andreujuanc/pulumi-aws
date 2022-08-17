// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.GuardDuty.Outputs
{

    [OutputType]
    public sealed class OrganizationConfigurationDatasourcesKubernetes
    {
        /// <summary>
        /// Enable Kubernetes Audit Logs Monitoring automatically for new member accounts. [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
        /// See Kubernetes Audit Logs below for more details.
        /// </summary>
        public readonly Outputs.OrganizationConfigurationDatasourcesKubernetesAuditLogs AuditLogs;

        [OutputConstructor]
        private OrganizationConfigurationDatasourcesKubernetes(Outputs.OrganizationConfigurationDatasourcesKubernetesAuditLogs auditLogs)
        {
            AuditLogs = auditLogs;
        }
    }
}