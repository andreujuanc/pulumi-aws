// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudWatch
{
    /// <summary>
    /// Provides a CloudWatch Metric Alarm resource.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foobar = new Aws.CloudWatch.MetricAlarm("foobar", new Aws.CloudWatch.MetricAlarmArgs
    ///         {
    ///             AlarmDescription = "This metric monitors ec2 cpu utilization",
    ///             ComparisonOperator = "GreaterThanOrEqualToThreshold",
    ///             EvaluationPeriods = "2",
    ///             InsufficientDataActions = {},
    ///             MetricName = "CPUUtilization",
    ///             Namespace = "AWS/EC2",
    ///             Period = "120",
    ///             Statistic = "Average",
    ///             Threshold = "80",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Example in Conjunction with Scaling Policies
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var batPolicy = new Aws.AutoScaling.Policy("batPolicy", new Aws.AutoScaling.PolicyArgs
    ///         {
    ///             AdjustmentType = "ChangeInCapacity",
    ///             AutoscalingGroupName = aws_autoscaling_group.Bar.Name,
    ///             Cooldown = 300,
    ///             ScalingAdjustment = 4,
    ///         });
    ///         var batMetricAlarm = new Aws.CloudWatch.MetricAlarm("batMetricAlarm", new Aws.CloudWatch.MetricAlarmArgs
    ///         {
    ///             AlarmActions = 
    ///             {
    ///                 batPolicy.Arn,
    ///             },
    ///             AlarmDescription = "This metric monitors ec2 cpu utilization",
    ///             ComparisonOperator = "GreaterThanOrEqualToThreshold",
    ///             Dimensions = 
    ///             {
    ///                 { "AutoScalingGroupName", aws_autoscaling_group.Bar.Name },
    ///             },
    ///             EvaluationPeriods = "2",
    ///             MetricName = "CPUUtilization",
    ///             Namespace = "AWS/EC2",
    ///             Period = "120",
    ///             Statistic = "Average",
    ///             Threshold = "80",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Example with an Expression
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foobar = new Aws.CloudWatch.MetricAlarm("foobar", new Aws.CloudWatch.MetricAlarmArgs
    ///         {
    ///             AlarmDescription = "Request error rate has exceeded 10%",
    ///             ComparisonOperator = "GreaterThanOrEqualToThreshold",
    ///             EvaluationPeriods = "2",
    ///             InsufficientDataActions = {},
    ///             MetricQueries = 
    ///             {
    ///                 new Aws.CloudWatch.Inputs.MetricAlarmMetricQueryArgs
    ///                 {
    ///                     Expression = "m2/m1*100",
    ///                     Id = "e1",
    ///                     Label = "Error Rate",
    ///                     ReturnData = "true",
    ///                 },
    ///                 new Aws.CloudWatch.Inputs.MetricAlarmMetricQueryArgs
    ///                 {
    ///                     Id = "m1",
    ///                     Metric = new Aws.CloudWatch.Inputs.MetricAlarmMetricQueryMetricArgs
    ///                     {
    ///                         Dimensions = 
    ///                         {
    ///                             { "LoadBalancer", "app/web" },
    ///                         },
    ///                         MetricName = "RequestCount",
    ///                         Namespace = "AWS/ApplicationELB",
    ///                         Period = "120",
    ///                         Stat = "Sum",
    ///                         Unit = "Count",
    ///                     },
    ///                 },
    ///                 new Aws.CloudWatch.Inputs.MetricAlarmMetricQueryArgs
    ///                 {
    ///                     Id = "m2",
    ///                     Metric = new Aws.CloudWatch.Inputs.MetricAlarmMetricQueryMetricArgs
    ///                     {
    ///                         Dimensions = 
    ///                         {
    ///                             { "LoadBalancer", "app/web" },
    ///                         },
    ///                         MetricName = "HTTPCode_ELB_5XX_Count",
    ///                         Namespace = "AWS/ApplicationELB",
    ///                         Period = "120",
    ///                         Stat = "Sum",
    ///                         Unit = "Count",
    ///                     },
    ///                 },
    ///             },
    ///             Threshold = "10",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var xxAnomalyDetection = new Aws.CloudWatch.MetricAlarm("xxAnomalyDetection", new Aws.CloudWatch.MetricAlarmArgs
    ///         {
    ///             AlarmDescription = "This metric monitors ec2 cpu utilization",
    ///             ComparisonOperator = "GreaterThanUpperThreshold",
    ///             EvaluationPeriods = "2",
    ///             InsufficientDataActions = {},
    ///             MetricQueries = 
    ///             {
    ///                 new Aws.CloudWatch.Inputs.MetricAlarmMetricQueryArgs
    ///                 {
    ///                     Expression = "ANOMALY_DETECTION_BAND(m1)",
    ///                     Id = "e1",
    ///                     Label = "CPUUtilization (Expected)",
    ///                     ReturnData = "true",
    ///                 },
    ///                 new Aws.CloudWatch.Inputs.MetricAlarmMetricQueryArgs
    ///                 {
    ///                     Id = "m1",
    ///                     Metric = new Aws.CloudWatch.Inputs.MetricAlarmMetricQueryMetricArgs
    ///                     {
    ///                         Dimensions = 
    ///                         {
    ///                             { "InstanceId", "i-abc123" },
    ///                         },
    ///                         MetricName = "CPUUtilization",
    ///                         Namespace = "AWS/EC2",
    ///                         Period = "120",
    ///                         Stat = "Average",
    ///                         Unit = "Count",
    ///                     },
    ///                     ReturnData = "true",
    ///                 },
    ///             },
    ///             ThresholdMetricId = "e1",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Example of monitoring Healthy Hosts on NLB using Target Group and NLB
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var xxxNlbHealthyhosts = new Aws.CloudWatch.MetricAlarm("xxxNlbHealthyhosts", new Aws.CloudWatch.MetricAlarmArgs
    ///         {
    ///             ComparisonOperator = "LessThanThreshold",
    ///             EvaluationPeriods = "1",
    ///             MetricName = "HealthyHostCount",
    ///             Namespace = "AWS/NetworkELB",
    ///             Period = "60",
    ///             Statistic = "Average",
    ///             Threshold = @var.Logstash_servers_count,
    ///             AlarmDescription = "Number of XXXX nodes healthy in Target Group",
    ///             ActionsEnabled = "true",
    ///             AlarmActions = 
    ///             {
    ///                 aws_sns_topic.Sns.Arn,
    ///             },
    ///             OkActions = 
    ///             {
    ///                 aws_sns_topic.Sns.Arn,
    ///             },
    ///             Dimensions = 
    ///             {
    ///                 { "TargetGroup", aws_lb_target_group.Lb_tg.Arn_suffix },
    ///                 { "LoadBalancer", aws_lb.Lb.Arn_suffix },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// &gt; **NOTE:**  You cannot create a metric alarm consisting of both `statistic` and `extended_statistic` parameters.
    /// You must choose one or the other
    /// </summary>
    public partial class MetricAlarm : Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
        /// </summary>
        [Output("actionsEnabled")]
        public Output<bool?> ActionsEnabled { get; private set; } = null!;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        [Output("alarmActions")]
        public Output<ImmutableArray<string>> AlarmActions { get; private set; } = null!;

        /// <summary>
        /// The description for the alarm.
        /// </summary>
        [Output("alarmDescription")]
        public Output<string?> AlarmDescription { get; private set; } = null!;

        /// <summary>
        /// The ARN of the cloudwatch metric alarm.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
        /// </summary>
        [Output("comparisonOperator")]
        public Output<string> ComparisonOperator { get; private set; } = null!;

        /// <summary>
        /// The number of datapoints that must be breaching to trigger the alarm.
        /// </summary>
        [Output("datapointsToAlarm")]
        public Output<int?> DatapointsToAlarm { get; private set; } = null!;

        /// <summary>
        /// The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        [Output("dimensions")]
        public Output<ImmutableDictionary<string, object>?> Dimensions { get; private set; } = null!;

        /// <summary>
        /// Used only for alarms
        /// based on percentiles. If you specify `ignore`, the alarm state will not
        /// change during periods with too few data points to be statistically significant.
        /// If you specify `evaluate` or omit this parameter, the alarm will always be
        /// evaluated and possibly change state no matter how many data points are available.
        /// The following values are supported: `ignore`, and `evaluate`.
        /// </summary>
        [Output("evaluateLowSampleCountPercentiles")]
        public Output<string> EvaluateLowSampleCountPercentiles { get; private set; } = null!;

        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        [Output("evaluationPeriods")]
        public Output<int> EvaluationPeriods { get; private set; } = null!;

        /// <summary>
        /// The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
        /// </summary>
        [Output("extendedStatistic")]
        public Output<string?> ExtendedStatistic { get; private set; } = null!;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        [Output("insufficientDataActions")]
        public Output<ImmutableArray<string>> InsufficientDataActions { get; private set; } = null!;

        /// <summary>
        /// The name for this metric.
        /// See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        [Output("metricName")]
        public Output<string?> MetricName { get; private set; } = null!;

        /// <summary>
        /// Enables you to create an alarm based on a metric math expression. You may specify at most 20.
        /// </summary>
        [Output("metricQueries")]
        public Output<ImmutableArray<Outputs.MetricAlarmMetricQuery>> MetricQueries { get; private set; } = null!;

        /// <summary>
        /// The descriptive name for the alarm. This name must be unique within the user's AWS account
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
        /// See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        [Output("okActions")]
        public Output<ImmutableArray<string>> OkActions { get; private set; } = null!;

        /// <summary>
        /// The period in seconds over which the specified `stat` is applied.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The statistic to apply to the alarm's associated metric.
        /// Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
        /// </summary>
        [Output("statistic")]
        public Output<string?> Statistic { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
        /// </summary>
        [Output("threshold")]
        public Output<double?> Threshold { get; private set; } = null!;

        /// <summary>
        /// If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
        /// </summary>
        [Output("thresholdMetricId")]
        public Output<string?> ThresholdMetricId { get; private set; } = null!;

        /// <summary>
        /// Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
        /// </summary>
        [Output("treatMissingData")]
        public Output<string?> TreatMissingData { get; private set; } = null!;

        /// <summary>
        /// The unit for this metric.
        /// </summary>
        [Output("unit")]
        public Output<string?> Unit { get; private set; } = null!;


        /// <summary>
        /// Create a MetricAlarm resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetricAlarm(string name, MetricAlarmArgs args, CustomResourceOptions? options = null)
            : base("aws:cloudwatch/metricAlarm:MetricAlarm", name, args ?? new MetricAlarmArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetricAlarm(string name, Input<string> id, MetricAlarmState? state = null, CustomResourceOptions? options = null)
            : base("aws:cloudwatch/metricAlarm:MetricAlarm", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MetricAlarm resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetricAlarm Get(string name, Input<string> id, MetricAlarmState? state = null, CustomResourceOptions? options = null)
        {
            return new MetricAlarm(name, id, state, options);
        }
    }

    public sealed class MetricAlarmArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
        /// </summary>
        [Input("actionsEnabled")]
        public Input<bool>? ActionsEnabled { get; set; }

        [Input("alarmActions")]
        private InputList<string>? _alarmActions;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        public InputList<string> AlarmActions
        {
            get => _alarmActions ?? (_alarmActions = new InputList<string>());
            set => _alarmActions = value;
        }

        /// <summary>
        /// The description for the alarm.
        /// </summary>
        [Input("alarmDescription")]
        public Input<string>? AlarmDescription { get; set; }

        /// <summary>
        /// The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
        /// </summary>
        [Input("comparisonOperator", required: true)]
        public Input<string> ComparisonOperator { get; set; } = null!;

        /// <summary>
        /// The number of datapoints that must be breaching to trigger the alarm.
        /// </summary>
        [Input("datapointsToAlarm")]
        public Input<int>? DatapointsToAlarm { get; set; }

        [Input("dimensions")]
        private InputMap<object>? _dimensions;

        /// <summary>
        /// The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        public InputMap<object> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputMap<object>());
            set => _dimensions = value;
        }

        /// <summary>
        /// Used only for alarms
        /// based on percentiles. If you specify `ignore`, the alarm state will not
        /// change during periods with too few data points to be statistically significant.
        /// If you specify `evaluate` or omit this parameter, the alarm will always be
        /// evaluated and possibly change state no matter how many data points are available.
        /// The following values are supported: `ignore`, and `evaluate`.
        /// </summary>
        [Input("evaluateLowSampleCountPercentiles")]
        public Input<string>? EvaluateLowSampleCountPercentiles { get; set; }

        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        [Input("evaluationPeriods", required: true)]
        public Input<int> EvaluationPeriods { get; set; } = null!;

        /// <summary>
        /// The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
        /// </summary>
        [Input("extendedStatistic")]
        public Input<string>? ExtendedStatistic { get; set; }

        [Input("insufficientDataActions")]
        private InputList<string>? _insufficientDataActions;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        public InputList<string> InsufficientDataActions
        {
            get => _insufficientDataActions ?? (_insufficientDataActions = new InputList<string>());
            set => _insufficientDataActions = value;
        }

        /// <summary>
        /// The name for this metric.
        /// See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        [Input("metricQueries")]
        private InputList<Inputs.MetricAlarmMetricQueryArgs>? _metricQueries;

        /// <summary>
        /// Enables you to create an alarm based on a metric math expression. You may specify at most 20.
        /// </summary>
        public InputList<Inputs.MetricAlarmMetricQueryArgs> MetricQueries
        {
            get => _metricQueries ?? (_metricQueries = new InputList<Inputs.MetricAlarmMetricQueryArgs>());
            set => _metricQueries = value;
        }

        /// <summary>
        /// The descriptive name for the alarm. This name must be unique within the user's AWS account
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
        /// See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("okActions")]
        private InputList<string>? _okActions;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        public InputList<string> OkActions
        {
            get => _okActions ?? (_okActions = new InputList<string>());
            set => _okActions = value;
        }

        /// <summary>
        /// The period in seconds over which the specified `stat` is applied.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The statistic to apply to the alarm's associated metric.
        /// Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
        /// </summary>
        [Input("threshold")]
        public Input<double>? Threshold { get; set; }

        /// <summary>
        /// If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
        /// </summary>
        [Input("thresholdMetricId")]
        public Input<string>? ThresholdMetricId { get; set; }

        /// <summary>
        /// Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
        /// </summary>
        [Input("treatMissingData")]
        public Input<string>? TreatMissingData { get; set; }

        /// <summary>
        /// The unit for this metric.
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public MetricAlarmArgs()
        {
        }
    }

    public sealed class MetricAlarmState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
        /// </summary>
        [Input("actionsEnabled")]
        public Input<bool>? ActionsEnabled { get; set; }

        [Input("alarmActions")]
        private InputList<string>? _alarmActions;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        public InputList<string> AlarmActions
        {
            get => _alarmActions ?? (_alarmActions = new InputList<string>());
            set => _alarmActions = value;
        }

        /// <summary>
        /// The description for the alarm.
        /// </summary>
        [Input("alarmDescription")]
        public Input<string>? AlarmDescription { get; set; }

        /// <summary>
        /// The ARN of the cloudwatch metric alarm.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
        /// </summary>
        [Input("comparisonOperator")]
        public Input<string>? ComparisonOperator { get; set; }

        /// <summary>
        /// The number of datapoints that must be breaching to trigger the alarm.
        /// </summary>
        [Input("datapointsToAlarm")]
        public Input<int>? DatapointsToAlarm { get; set; }

        [Input("dimensions")]
        private InputMap<object>? _dimensions;

        /// <summary>
        /// The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        public InputMap<object> Dimensions
        {
            get => _dimensions ?? (_dimensions = new InputMap<object>());
            set => _dimensions = value;
        }

        /// <summary>
        /// Used only for alarms
        /// based on percentiles. If you specify `ignore`, the alarm state will not
        /// change during periods with too few data points to be statistically significant.
        /// If you specify `evaluate` or omit this parameter, the alarm will always be
        /// evaluated and possibly change state no matter how many data points are available.
        /// The following values are supported: `ignore`, and `evaluate`.
        /// </summary>
        [Input("evaluateLowSampleCountPercentiles")]
        public Input<string>? EvaluateLowSampleCountPercentiles { get; set; }

        /// <summary>
        /// The number of periods over which data is compared to the specified threshold.
        /// </summary>
        [Input("evaluationPeriods")]
        public Input<int>? EvaluationPeriods { get; set; }

        /// <summary>
        /// The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
        /// </summary>
        [Input("extendedStatistic")]
        public Input<string>? ExtendedStatistic { get; set; }

        [Input("insufficientDataActions")]
        private InputList<string>? _insufficientDataActions;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        public InputList<string> InsufficientDataActions
        {
            get => _insufficientDataActions ?? (_insufficientDataActions = new InputList<string>());
            set => _insufficientDataActions = value;
        }

        /// <summary>
        /// The name for this metric.
        /// See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        [Input("metricQueries")]
        private InputList<Inputs.MetricAlarmMetricQueryGetArgs>? _metricQueries;

        /// <summary>
        /// Enables you to create an alarm based on a metric math expression. You may specify at most 20.
        /// </summary>
        public InputList<Inputs.MetricAlarmMetricQueryGetArgs> MetricQueries
        {
            get => _metricQueries ?? (_metricQueries = new InputList<Inputs.MetricAlarmMetricQueryGetArgs>());
            set => _metricQueries = value;
        }

        /// <summary>
        /// The descriptive name for the alarm. This name must be unique within the user's AWS account
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
        /// See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("okActions")]
        private InputList<string>? _okActions;

        /// <summary>
        /// The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
        /// </summary>
        public InputList<string> OkActions
        {
            get => _okActions ?? (_okActions = new InputList<string>());
            set => _okActions = value;
        }

        /// <summary>
        /// The period in seconds over which the specified `stat` is applied.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The statistic to apply to the alarm's associated metric.
        /// Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
        /// </summary>
        [Input("statistic")]
        public Input<string>? Statistic { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
        /// </summary>
        [Input("threshold")]
        public Input<double>? Threshold { get; set; }

        /// <summary>
        /// If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
        /// </summary>
        [Input("thresholdMetricId")]
        public Input<string>? ThresholdMetricId { get; set; }

        /// <summary>
        /// Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
        /// </summary>
        [Input("treatMissingData")]
        public Input<string>? TreatMissingData { get; set; }

        /// <summary>
        /// The unit for this metric.
        /// </summary>
        [Input("unit")]
        public Input<string>? Unit { get; set; }

        public MetricAlarmState()
        {
        }
    }
}