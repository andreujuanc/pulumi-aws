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

__all__ = [
    'EntityRecognizerInputDataConfig',
    'EntityRecognizerInputDataConfigAnnotations',
    'EntityRecognizerInputDataConfigAugmentedManifest',
    'EntityRecognizerInputDataConfigDocuments',
    'EntityRecognizerInputDataConfigEntityList',
    'EntityRecognizerInputDataConfigEntityType',
    'EntityRecognizerVpcConfig',
]

@pulumi.output_type
class EntityRecognizerInputDataConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "entityTypes":
            suggest = "entity_types"
        elif key == "augmentedManifests":
            suggest = "augmented_manifests"
        elif key == "dataFormat":
            suggest = "data_format"
        elif key == "entityList":
            suggest = "entity_list"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EntityRecognizerInputDataConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EntityRecognizerInputDataConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EntityRecognizerInputDataConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 entity_types: Sequence['outputs.EntityRecognizerInputDataConfigEntityType'],
                 annotations: Optional['outputs.EntityRecognizerInputDataConfigAnnotations'] = None,
                 augmented_manifests: Optional[Sequence['outputs.EntityRecognizerInputDataConfigAugmentedManifest']] = None,
                 data_format: Optional[str] = None,
                 documents: Optional['outputs.EntityRecognizerInputDataConfigDocuments'] = None,
                 entity_list: Optional['outputs.EntityRecognizerInputDataConfigEntityList'] = None):
        """
        :param Sequence['EntityRecognizerInputDataConfigEntityTypeArgs'] entity_types: Set of entity types to be recognized.
               Has a maximum of 25 items.
               See the `entity_types` Configuration Block section below.
        :param 'EntityRecognizerInputDataConfigAnnotationsArgs' annotations: Specifies location of the document annotation data.
               See the `annotations` Configuration Block section below.
               One of `annotations` or `entity_list` is required.
        :param Sequence['EntityRecognizerInputDataConfigAugmentedManifestArgs'] augmented_manifests: List of training datasets produced by Amazon SageMaker Ground Truth.
               Used if `data_format` is `AUGMENTED_MANIFEST`.
               See the `augmented_manifests` Configuration Block section below.
        :param str data_format: The format for the training data.
               One of `COMPREHEND_CSV` or `AUGMENTED_MANIFEST`.
        :param 'EntityRecognizerInputDataConfigDocumentsArgs' documents: Specifies a collection of training documents.
               Used if `data_format` is `COMPREHEND_CSV`.
               See the `documents` Configuration Block section below.
        :param 'EntityRecognizerInputDataConfigEntityListArgs' entity_list: Specifies location of the entity list data.
               See the `entity_list` Configuration Block section below.
               One of `entity_list` or `annotations` is required.
        """
        pulumi.set(__self__, "entity_types", entity_types)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if augmented_manifests is not None:
            pulumi.set(__self__, "augmented_manifests", augmented_manifests)
        if data_format is not None:
            pulumi.set(__self__, "data_format", data_format)
        if documents is not None:
            pulumi.set(__self__, "documents", documents)
        if entity_list is not None:
            pulumi.set(__self__, "entity_list", entity_list)

    @property
    @pulumi.getter(name="entityTypes")
    def entity_types(self) -> Sequence['outputs.EntityRecognizerInputDataConfigEntityType']:
        """
        Set of entity types to be recognized.
        Has a maximum of 25 items.
        See the `entity_types` Configuration Block section below.
        """
        return pulumi.get(self, "entity_types")

    @property
    @pulumi.getter
    def annotations(self) -> Optional['outputs.EntityRecognizerInputDataConfigAnnotations']:
        """
        Specifies location of the document annotation data.
        See the `annotations` Configuration Block section below.
        One of `annotations` or `entity_list` is required.
        """
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="augmentedManifests")
    def augmented_manifests(self) -> Optional[Sequence['outputs.EntityRecognizerInputDataConfigAugmentedManifest']]:
        """
        List of training datasets produced by Amazon SageMaker Ground Truth.
        Used if `data_format` is `AUGMENTED_MANIFEST`.
        See the `augmented_manifests` Configuration Block section below.
        """
        return pulumi.get(self, "augmented_manifests")

    @property
    @pulumi.getter(name="dataFormat")
    def data_format(self) -> Optional[str]:
        """
        The format for the training data.
        One of `COMPREHEND_CSV` or `AUGMENTED_MANIFEST`.
        """
        return pulumi.get(self, "data_format")

    @property
    @pulumi.getter
    def documents(self) -> Optional['outputs.EntityRecognizerInputDataConfigDocuments']:
        """
        Specifies a collection of training documents.
        Used if `data_format` is `COMPREHEND_CSV`.
        See the `documents` Configuration Block section below.
        """
        return pulumi.get(self, "documents")

    @property
    @pulumi.getter(name="entityList")
    def entity_list(self) -> Optional['outputs.EntityRecognizerInputDataConfigEntityList']:
        """
        Specifies location of the entity list data.
        See the `entity_list` Configuration Block section below.
        One of `entity_list` or `annotations` is required.
        """
        return pulumi.get(self, "entity_list")


@pulumi.output_type
class EntityRecognizerInputDataConfigAnnotations(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "s3Uri":
            suggest = "s3_uri"
        elif key == "testS3Uri":
            suggest = "test_s3_uri"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EntityRecognizerInputDataConfigAnnotations. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EntityRecognizerInputDataConfigAnnotations.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EntityRecognizerInputDataConfigAnnotations.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 s3_uri: str,
                 test_s3_uri: Optional[str] = None):
        """
        :param str s3_uri: Location of entity list.
        """
        pulumi.set(__self__, "s3_uri", s3_uri)
        if test_s3_uri is not None:
            pulumi.set(__self__, "test_s3_uri", test_s3_uri)

    @property
    @pulumi.getter(name="s3Uri")
    def s3_uri(self) -> str:
        """
        Location of entity list.
        """
        return pulumi.get(self, "s3_uri")

    @property
    @pulumi.getter(name="testS3Uri")
    def test_s3_uri(self) -> Optional[str]:
        return pulumi.get(self, "test_s3_uri")


@pulumi.output_type
class EntityRecognizerInputDataConfigAugmentedManifest(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "attributeNames":
            suggest = "attribute_names"
        elif key == "s3Uri":
            suggest = "s3_uri"
        elif key == "annotationDataS3Uri":
            suggest = "annotation_data_s3_uri"
        elif key == "documentType":
            suggest = "document_type"
        elif key == "sourceDocumentsS3Uri":
            suggest = "source_documents_s3_uri"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EntityRecognizerInputDataConfigAugmentedManifest. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EntityRecognizerInputDataConfigAugmentedManifest.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EntityRecognizerInputDataConfigAugmentedManifest.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 attribute_names: Sequence[str],
                 s3_uri: str,
                 annotation_data_s3_uri: Optional[str] = None,
                 document_type: Optional[str] = None,
                 source_documents_s3_uri: Optional[str] = None,
                 split: Optional[str] = None):
        """
        :param Sequence[str] attribute_names: The JSON attribute that contains the annotations for the training documents.
        :param str s3_uri: Location of entity list.
        :param str annotation_data_s3_uri: Location of annotation files.
        :param str document_type: Type of augmented manifest.
               One of `PLAIN_TEXT_DOCUMENT` or `SEMI_STRUCTURED_DOCUMENT`.
        :param str source_documents_s3_uri: Location of source PDF files.
        :param str split: Purpose of data in augmented manifest.
               One of `TRAIN` or `TEST`.
        """
        pulumi.set(__self__, "attribute_names", attribute_names)
        pulumi.set(__self__, "s3_uri", s3_uri)
        if annotation_data_s3_uri is not None:
            pulumi.set(__self__, "annotation_data_s3_uri", annotation_data_s3_uri)
        if document_type is not None:
            pulumi.set(__self__, "document_type", document_type)
        if source_documents_s3_uri is not None:
            pulumi.set(__self__, "source_documents_s3_uri", source_documents_s3_uri)
        if split is not None:
            pulumi.set(__self__, "split", split)

    @property
    @pulumi.getter(name="attributeNames")
    def attribute_names(self) -> Sequence[str]:
        """
        The JSON attribute that contains the annotations for the training documents.
        """
        return pulumi.get(self, "attribute_names")

    @property
    @pulumi.getter(name="s3Uri")
    def s3_uri(self) -> str:
        """
        Location of entity list.
        """
        return pulumi.get(self, "s3_uri")

    @property
    @pulumi.getter(name="annotationDataS3Uri")
    def annotation_data_s3_uri(self) -> Optional[str]:
        """
        Location of annotation files.
        """
        return pulumi.get(self, "annotation_data_s3_uri")

    @property
    @pulumi.getter(name="documentType")
    def document_type(self) -> Optional[str]:
        """
        Type of augmented manifest.
        One of `PLAIN_TEXT_DOCUMENT` or `SEMI_STRUCTURED_DOCUMENT`.
        """
        return pulumi.get(self, "document_type")

    @property
    @pulumi.getter(name="sourceDocumentsS3Uri")
    def source_documents_s3_uri(self) -> Optional[str]:
        """
        Location of source PDF files.
        """
        return pulumi.get(self, "source_documents_s3_uri")

    @property
    @pulumi.getter
    def split(self) -> Optional[str]:
        """
        Purpose of data in augmented manifest.
        One of `TRAIN` or `TEST`.
        """
        return pulumi.get(self, "split")


@pulumi.output_type
class EntityRecognizerInputDataConfigDocuments(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "s3Uri":
            suggest = "s3_uri"
        elif key == "inputFormat":
            suggest = "input_format"
        elif key == "testS3Uri":
            suggest = "test_s3_uri"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EntityRecognizerInputDataConfigDocuments. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EntityRecognizerInputDataConfigDocuments.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EntityRecognizerInputDataConfigDocuments.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 s3_uri: str,
                 input_format: Optional[str] = None,
                 test_s3_uri: Optional[str] = None):
        """
        :param str s3_uri: Location of entity list.
        :param str input_format: Specifies how the input files should be processed.
               One of `ONE_DOC_PER_LINE` or `ONE_DOC_PER_FILE`.
        """
        pulumi.set(__self__, "s3_uri", s3_uri)
        if input_format is not None:
            pulumi.set(__self__, "input_format", input_format)
        if test_s3_uri is not None:
            pulumi.set(__self__, "test_s3_uri", test_s3_uri)

    @property
    @pulumi.getter(name="s3Uri")
    def s3_uri(self) -> str:
        """
        Location of entity list.
        """
        return pulumi.get(self, "s3_uri")

    @property
    @pulumi.getter(name="inputFormat")
    def input_format(self) -> Optional[str]:
        """
        Specifies how the input files should be processed.
        One of `ONE_DOC_PER_LINE` or `ONE_DOC_PER_FILE`.
        """
        return pulumi.get(self, "input_format")

    @property
    @pulumi.getter(name="testS3Uri")
    def test_s3_uri(self) -> Optional[str]:
        return pulumi.get(self, "test_s3_uri")


@pulumi.output_type
class EntityRecognizerInputDataConfigEntityList(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "s3Uri":
            suggest = "s3_uri"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EntityRecognizerInputDataConfigEntityList. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EntityRecognizerInputDataConfigEntityList.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EntityRecognizerInputDataConfigEntityList.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 s3_uri: str):
        """
        :param str s3_uri: Location of entity list.
        """
        pulumi.set(__self__, "s3_uri", s3_uri)

    @property
    @pulumi.getter(name="s3Uri")
    def s3_uri(self) -> str:
        """
        Location of entity list.
        """
        return pulumi.get(self, "s3_uri")


@pulumi.output_type
class EntityRecognizerInputDataConfigEntityType(dict):
    def __init__(__self__, *,
                 type: str):
        """
        :param str type: An entity type to be matched by the Entity Recognizer.
               Cannot contain a newline (`\\n`), carriage return (`\\r`), or tab (`\\t`).
        """
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        An entity type to be matched by the Entity Recognizer.
        Cannot contain a newline (`\\n`), carriage return (`\\r`), or tab (`\\t`).
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class EntityRecognizerVpcConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "securityGroupIds":
            suggest = "security_group_ids"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EntityRecognizerVpcConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EntityRecognizerVpcConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EntityRecognizerVpcConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 security_group_ids: Sequence[str],
                 subnets: Sequence[str]):
        """
        :param Sequence[str] security_group_ids: List of security group IDs.
        :param Sequence[str] subnets: List of VPC subnets.
        """
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        pulumi.set(__self__, "subnets", subnets)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Sequence[str]:
        """
        List of security group IDs.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter
    def subnets(self) -> Sequence[str]:
        """
        List of VPC subnets.
        """
        return pulumi.get(self, "subnets")

