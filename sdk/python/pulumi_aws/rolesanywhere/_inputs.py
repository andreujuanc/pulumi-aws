# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'TrustAnchorSourceArgs',
    'TrustAnchorSourceSourceDataArgs',
]

@pulumi.input_type
class TrustAnchorSourceArgs:
    def __init__(__self__, *,
                 source_data: pulumi.Input['TrustAnchorSourceSourceDataArgs'],
                 source_type: pulumi.Input[str]):
        """
        :param pulumi.Input['TrustAnchorSourceSourceDataArgs'] source_data: The data denoting the source of trust, documented below
        :param pulumi.Input[str] source_type: The type of the source of trust. Must be either `AWS_ACM_PCA` or `CERTIFICATE_BUNDLE`.
        """
        pulumi.set(__self__, "source_data", source_data)
        pulumi.set(__self__, "source_type", source_type)

    @property
    @pulumi.getter(name="sourceData")
    def source_data(self) -> pulumi.Input['TrustAnchorSourceSourceDataArgs']:
        """
        The data denoting the source of trust, documented below
        """
        return pulumi.get(self, "source_data")

    @source_data.setter
    def source_data(self, value: pulumi.Input['TrustAnchorSourceSourceDataArgs']):
        pulumi.set(self, "source_data", value)

    @property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> pulumi.Input[str]:
        """
        The type of the source of trust. Must be either `AWS_ACM_PCA` or `CERTIFICATE_BUNDLE`.
        """
        return pulumi.get(self, "source_type")

    @source_type.setter
    def source_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_type", value)


@pulumi.input_type
class TrustAnchorSourceSourceDataArgs:
    def __init__(__self__, *,
                 acm_pca_arn: Optional[pulumi.Input[str]] = None,
                 x509_certificate_data: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] acm_pca_arn: The ARN of an ACM Private Certificate Authority.
        """
        if acm_pca_arn is not None:
            pulumi.set(__self__, "acm_pca_arn", acm_pca_arn)
        if x509_certificate_data is not None:
            pulumi.set(__self__, "x509_certificate_data", x509_certificate_data)

    @property
    @pulumi.getter(name="acmPcaArn")
    def acm_pca_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of an ACM Private Certificate Authority.
        """
        return pulumi.get(self, "acm_pca_arn")

    @acm_pca_arn.setter
    def acm_pca_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acm_pca_arn", value)

    @property
    @pulumi.getter(name="x509CertificateData")
    def x509_certificate_data(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "x509_certificate_data")

    @x509_certificate_data.setter
    def x509_certificate_data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "x509_certificate_data", value)

