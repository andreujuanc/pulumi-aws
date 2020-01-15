// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Inputs
{

    public sealed class WindowsFileSystemSelfManagedActiveDirectoryArgs : Pulumi.ResourceArgs
    {
        [Input("dnsIps", required: true)]
        private InputList<string>? _dnsIps;

        /// <summary>
        /// A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
        /// </summary>
        public InputList<string> DnsIps
        {
            get => _dnsIps ?? (_dnsIps = new InputList<string>());
            set => _dnsIps = value;
        }

        /// <summary>
        /// The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
        /// </summary>
        [Input("fileSystemAdministratorsGroup")]
        public Input<string>? FileSystemAdministratorsGroup { get; set; }

        /// <summary>
        /// The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
        /// </summary>
        [Input("organizationalUnitDistinguishedName")]
        public Input<string>? OrganizationalUnitDistinguishedName { get; set; }

        /// <summary>
        /// The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public WindowsFileSystemSelfManagedActiveDirectoryArgs()
        {
        }
    }
}