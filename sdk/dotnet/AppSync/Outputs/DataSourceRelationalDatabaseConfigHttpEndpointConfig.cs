// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync.Outputs
{

    [OutputType]
    public sealed class DataSourceRelationalDatabaseConfigHttpEndpointConfig
    {
        /// <summary>
        /// AWS secret store ARN for database credentials.
        /// </summary>
        public readonly string AwsSecretStoreArn;
        /// <summary>
        /// Logical database name.
        /// </summary>
        public readonly string? DatabaseName;
        /// <summary>
        /// Amazon RDS cluster identifier.
        /// </summary>
        public readonly string DbClusterIdentifier;
        /// <summary>
        /// AWS Region for RDS HTTP endpoint. Defaults to current region.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// Logical schema name.
        /// </summary>
        public readonly string? Schema;

        [OutputConstructor]
        private DataSourceRelationalDatabaseConfigHttpEndpointConfig(
            string awsSecretStoreArn,

            string? databaseName,

            string dbClusterIdentifier,

            string? region,

            string? schema)
        {
            AwsSecretStoreArn = awsSecretStoreArn;
            DatabaseName = databaseName;
            DbClusterIdentifier = dbClusterIdentifier;
            Region = region;
            Schema = schema;
        }
    }
}