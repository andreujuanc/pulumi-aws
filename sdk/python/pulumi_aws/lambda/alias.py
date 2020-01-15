# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Alias(pulumi.CustomResource):
    arn: pulumi.Output[str]
    """
    The Amazon Resource Name (ARN) identifying your Lambda function alias.
    """
    description: pulumi.Output[str]
    """
    Description of the alias.
    """
    function_name: pulumi.Output[str]
    """
    The function ARN of the Lambda function for which you want to create an alias.
    """
    function_version: pulumi.Output[str]
    """
    Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
    """
    invoke_arn: pulumi.Output[str]
    """
    The ARN to be used for invoking Lambda Function from API Gateway - to be used in [`apigateway.Integration`](https://www.terraform.io/docs/providers/aws/r/api_gateway_integration.html)'s `uri`
    """
    name: pulumi.Output[str]
    """
    Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
    """
    routing_config: pulumi.Output[dict]
    """
    The Lambda alias' route configuration settings. Fields documented below

      * `additional_version_weights` (`dict`) - A map that defines the proportion of events that should be sent to different versions of a lambda function.
    """
    def __init__(__self__, resource_name, opts=None, description=None, function_name=None, function_version=None, name=None, routing_config=None, __props__=None, __name__=None, __opts__=None):
        """
        Creates a Lambda function alias. Creates an alias that points to the specified Lambda function version.

        For information about Lambda and how to use it, see [What is AWS Lambda?][1]
        For information about function aliases, see [CreateAlias][2] and [AliasRoutingConfiguration][3] in the API docs.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/lambda_alias.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the alias.
        :param pulumi.Input[str] function_name: The function ARN of the Lambda function for which you want to create an alias.
        :param pulumi.Input[str] function_version: Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
        :param pulumi.Input[str] name: Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
        :param pulumi.Input[dict] routing_config: The Lambda alias' route configuration settings. Fields documented below

        The **routing_config** object supports the following:

          * `additional_version_weights` (`pulumi.Input[dict]`) - A map that defines the proportion of events that should be sent to different versions of a lambda function.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            if function_name is None:
                raise TypeError("Missing required property 'function_name'")
            __props__['function_name'] = function_name
            if function_version is None:
                raise TypeError("Missing required property 'function_version'")
            __props__['function_version'] = function_version
            __props__['name'] = name
            __props__['routing_config'] = routing_config
            __props__['arn'] = None
            __props__['invoke_arn'] = None
        super(Alias, __self__).__init__(
            'aws:lambda/alias:Alias',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, arn=None, description=None, function_name=None, function_version=None, invoke_arn=None, name=None, routing_config=None):
        """
        Get an existing Alias resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) identifying your Lambda function alias.
        :param pulumi.Input[str] description: Description of the alias.
        :param pulumi.Input[str] function_name: The function ARN of the Lambda function for which you want to create an alias.
        :param pulumi.Input[str] function_version: Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
        :param pulumi.Input[str] invoke_arn: The ARN to be used for invoking Lambda Function from API Gateway - to be used in [`apigateway.Integration`](https://www.terraform.io/docs/providers/aws/r/api_gateway_integration.html)'s `uri`
        :param pulumi.Input[str] name: Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
        :param pulumi.Input[dict] routing_config: The Lambda alias' route configuration settings. Fields documented below

        The **routing_config** object supports the following:

          * `additional_version_weights` (`pulumi.Input[dict]`) - A map that defines the proportion of events that should be sent to different versions of a lambda function.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["arn"] = arn
        __props__["description"] = description
        __props__["function_name"] = function_name
        __props__["function_version"] = function_version
        __props__["invoke_arn"] = invoke_arn
        __props__["name"] = name
        __props__["routing_config"] = routing_config
        return Alias(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
