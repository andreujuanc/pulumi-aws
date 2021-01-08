// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DataSync
{
    /// <summary>
    /// Manages an AWS DataSync FSx Windows Location.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.DataSync.LocationFsxWindows("example", new Aws.DataSync.LocationFsxWindowsArgs
    ///         {
    ///             FsxFilesystemArn = aws_fsx_windows_file_system.Example.Arn,
    ///             User = "SomeUser",
    ///             Password = "SuperSecretPassw0rd",
    ///             SecurityGroupArns = 
    ///             {
    ///                 aws_security_group.Example.Arn,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// `aws_datasync_location_fsx_windows_file_system` can be imported by using the `DataSync-ARN#FSx-Windows-ARN`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:datasync/locationFsxWindows:LocationFsxWindows example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:476956259333:file-system/fs-08e04cd442c1bb94a
    /// ```
    /// </summary>
    [AwsResourceType("aws:datasync/locationFsxWindows:LocationFsxWindows")]
    public partial class LocationFsxWindows : Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the DataSync Location.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The time that the FSx for Windows location was created.
        /// </summary>
        [Output("creationTime")]
        public Output<string> CreationTime { get; private set; } = null!;

        /// <summary>
        /// The name of the Windows domain that the FSx for Windows server belongs to.
        /// </summary>
        [Output("domain")]
        public Output<string?> Domain { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) for the FSx for Windows file system.
        /// </summary>
        [Output("fsxFilesystemArn")]
        public Output<string> FsxFilesystemArn { get; private set; } = null!;

        /// <summary>
        /// The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        /// </summary>
        [Output("securityGroupArns")]
        public Output<ImmutableArray<string>> SecurityGroupArns { get; private set; } = null!;

        /// <summary>
        /// Subdirectory to perform actions as source or destination.
        /// </summary>
        [Output("subdirectory")]
        public Output<string> Subdirectory { get; private set; } = null!;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The URL of the FSx for Windows location that was described.
        /// </summary>
        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;

        /// <summary>
        /// The user who has the permissions to access files and folders in the FSx for Windows file system.
        /// </summary>
        [Output("user")]
        public Output<string> User { get; private set; } = null!;


        /// <summary>
        /// Create a LocationFsxWindows resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LocationFsxWindows(string name, LocationFsxWindowsArgs args, CustomResourceOptions? options = null)
            : base("aws:datasync/locationFsxWindows:LocationFsxWindows", name, args ?? new LocationFsxWindowsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LocationFsxWindows(string name, Input<string> id, LocationFsxWindowsState? state = null, CustomResourceOptions? options = null)
            : base("aws:datasync/locationFsxWindows:LocationFsxWindows", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LocationFsxWindows resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LocationFsxWindows Get(string name, Input<string> id, LocationFsxWindowsState? state = null, CustomResourceOptions? options = null)
        {
            return new LocationFsxWindows(name, id, state, options);
        }
    }

    public sealed class LocationFsxWindowsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Windows domain that the FSx for Windows server belongs to.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) for the FSx for Windows file system.
        /// </summary>
        [Input("fsxFilesystemArn", required: true)]
        public Input<string> FsxFilesystemArn { get; set; } = null!;

        /// <summary>
        /// The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        [Input("securityGroupArns", required: true)]
        private InputList<string>? _securityGroupArns;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        /// </summary>
        public InputList<string> SecurityGroupArns
        {
            get => _securityGroupArns ?? (_securityGroupArns = new InputList<string>());
            set => _securityGroupArns = value;
        }

        /// <summary>
        /// Subdirectory to perform actions as source or destination.
        /// </summary>
        [Input("subdirectory")]
        public Input<string>? Subdirectory { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The user who has the permissions to access files and folders in the FSx for Windows file system.
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public LocationFsxWindowsArgs()
        {
        }
    }

    public sealed class LocationFsxWindowsState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the DataSync Location.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The time that the FSx for Windows location was created.
        /// </summary>
        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// The name of the Windows domain that the FSx for Windows server belongs to.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) for the FSx for Windows file system.
        /// </summary>
        [Input("fsxFilesystemArn")]
        public Input<string>? FsxFilesystemArn { get; set; }

        /// <summary>
        /// The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("securityGroupArns")]
        private InputList<string>? _securityGroupArns;

        /// <summary>
        /// The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
        /// </summary>
        public InputList<string> SecurityGroupArns
        {
            get => _securityGroupArns ?? (_securityGroupArns = new InputList<string>());
            set => _securityGroupArns = value;
        }

        /// <summary>
        /// Subdirectory to perform actions as source or destination.
        /// </summary>
        [Input("subdirectory")]
        public Input<string>? Subdirectory { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The URL of the FSx for Windows location that was described.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        /// <summary>
        /// The user who has the permissions to access files and folders in the FSx for Windows file system.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public LocationFsxWindowsState()
        {
        }
    }
}