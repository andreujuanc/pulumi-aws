# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ClassificationExportConfigurationArgs', 'ClassificationExportConfiguration']

@pulumi.input_type
class ClassificationExportConfigurationArgs:
    def __init__(__self__, *,
                 s3_destination: Optional[pulumi.Input['ClassificationExportConfigurationS3DestinationArgs']] = None):
        """
        The set of arguments for constructing a ClassificationExportConfiguration resource.
        :param pulumi.Input['ClassificationExportConfigurationS3DestinationArgs'] s3_destination: Configuration block for a S3 Destination. Defined below
        """
        if s3_destination is not None:
            pulumi.set(__self__, "s3_destination", s3_destination)

    @property
    @pulumi.getter(name="s3Destination")
    def s3_destination(self) -> Optional[pulumi.Input['ClassificationExportConfigurationS3DestinationArgs']]:
        """
        Configuration block for a S3 Destination. Defined below
        """
        return pulumi.get(self, "s3_destination")

    @s3_destination.setter
    def s3_destination(self, value: Optional[pulumi.Input['ClassificationExportConfigurationS3DestinationArgs']]):
        pulumi.set(self, "s3_destination", value)


@pulumi.input_type
class _ClassificationExportConfigurationState:
    def __init__(__self__, *,
                 s3_destination: Optional[pulumi.Input['ClassificationExportConfigurationS3DestinationArgs']] = None):
        """
        Input properties used for looking up and filtering ClassificationExportConfiguration resources.
        :param pulumi.Input['ClassificationExportConfigurationS3DestinationArgs'] s3_destination: Configuration block for a S3 Destination. Defined below
        """
        if s3_destination is not None:
            pulumi.set(__self__, "s3_destination", s3_destination)

    @property
    @pulumi.getter(name="s3Destination")
    def s3_destination(self) -> Optional[pulumi.Input['ClassificationExportConfigurationS3DestinationArgs']]:
        """
        Configuration block for a S3 Destination. Defined below
        """
        return pulumi.get(self, "s3_destination")

    @s3_destination.setter
    def s3_destination(self, value: Optional[pulumi.Input['ClassificationExportConfigurationS3DestinationArgs']]):
        pulumi.set(self, "s3_destination", value)


class ClassificationExportConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 s3_destination: Optional[pulumi.Input[pulumi.InputType['ClassificationExportConfigurationS3DestinationArgs']]] = None,
                 __props__=None):
        """
        Provides a resource to manage an [Amazon Macie Classification Export Configuration](https://docs.aws.amazon.com/macie/latest/APIReference/classification-export-configuration.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_account = aws.macie2.Account("exampleAccount")
        example_classification_export_configuration = aws.macie2.ClassificationExportConfiguration("exampleClassificationExportConfiguration", s3_destination=aws.macie2.ClassificationExportConfigurationS3DestinationArgs(
            bucket_name=aws_s3_bucket["example"]["bucket"],
            key_prefix="exampleprefix/",
            kms_key_arn=aws_kms_key["example"]["arn"],
        ),
        opts=pulumi.ResourceOptions(depends_on=[example_account]))
        ```

        ## Import

        `aws_macie2_classification_export_configuration` can be imported using the account ID and region, e.g.,

        ```sh
         $ pulumi import aws:macie2/classificationExportConfiguration:ClassificationExportConfiguration example 123456789012:us-west-2
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ClassificationExportConfigurationS3DestinationArgs']] s3_destination: Configuration block for a S3 Destination. Defined below
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ClassificationExportConfigurationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage an [Amazon Macie Classification Export Configuration](https://docs.aws.amazon.com/macie/latest/APIReference/classification-export-configuration.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_account = aws.macie2.Account("exampleAccount")
        example_classification_export_configuration = aws.macie2.ClassificationExportConfiguration("exampleClassificationExportConfiguration", s3_destination=aws.macie2.ClassificationExportConfigurationS3DestinationArgs(
            bucket_name=aws_s3_bucket["example"]["bucket"],
            key_prefix="exampleprefix/",
            kms_key_arn=aws_kms_key["example"]["arn"],
        ),
        opts=pulumi.ResourceOptions(depends_on=[example_account]))
        ```

        ## Import

        `aws_macie2_classification_export_configuration` can be imported using the account ID and region, e.g.,

        ```sh
         $ pulumi import aws:macie2/classificationExportConfiguration:ClassificationExportConfiguration example 123456789012:us-west-2
        ```

        :param str resource_name: The name of the resource.
        :param ClassificationExportConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClassificationExportConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 s3_destination: Optional[pulumi.Input[pulumi.InputType['ClassificationExportConfigurationS3DestinationArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClassificationExportConfigurationArgs.__new__(ClassificationExportConfigurationArgs)

            __props__.__dict__["s3_destination"] = s3_destination
        super(ClassificationExportConfiguration, __self__).__init__(
            'aws:macie2/classificationExportConfiguration:ClassificationExportConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            s3_destination: Optional[pulumi.Input[pulumi.InputType['ClassificationExportConfigurationS3DestinationArgs']]] = None) -> 'ClassificationExportConfiguration':
        """
        Get an existing ClassificationExportConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ClassificationExportConfigurationS3DestinationArgs']] s3_destination: Configuration block for a S3 Destination. Defined below
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClassificationExportConfigurationState.__new__(_ClassificationExportConfigurationState)

        __props__.__dict__["s3_destination"] = s3_destination
        return ClassificationExportConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="s3Destination")
    def s3_destination(self) -> pulumi.Output[Optional['outputs.ClassificationExportConfigurationS3Destination']]:
        """
        Configuration block for a S3 Destination. Defined below
        """
        return pulumi.get(self, "s3_destination")
