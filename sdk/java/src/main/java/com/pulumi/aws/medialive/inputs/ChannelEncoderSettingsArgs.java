// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAudioDescriptionArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsAvailBlankingArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsTimecodeConfigArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsVideoDescriptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsArgs Empty = new ChannelEncoderSettingsArgs();

    /**
     * Audio descriptions for the channel. See Audio Descriptions for more details.
     * 
     */
    @Import(name="audioDescriptions")
    private @Nullable Output<List<ChannelEncoderSettingsAudioDescriptionArgs>> audioDescriptions;

    /**
     * @return Audio descriptions for the channel. See Audio Descriptions for more details.
     * 
     */
    public Optional<Output<List<ChannelEncoderSettingsAudioDescriptionArgs>>> audioDescriptions() {
        return Optional.ofNullable(this.audioDescriptions);
    }

    /**
     * Settings for ad avail blanking. See Avail Blanking for more details.
     * 
     */
    @Import(name="availBlanking")
    private @Nullable Output<ChannelEncoderSettingsAvailBlankingArgs> availBlanking;

    /**
     * @return Settings for ad avail blanking. See Avail Blanking for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsAvailBlankingArgs>> availBlanking() {
        return Optional.ofNullable(this.availBlanking);
    }

    /**
     * Output groups for the channel. See Output Groups for more details.
     * 
     */
    @Import(name="outputGroups", required=true)
    private Output<List<ChannelEncoderSettingsOutputGroupArgs>> outputGroups;

    /**
     * @return Output groups for the channel. See Output Groups for more details.
     * 
     */
    public Output<List<ChannelEncoderSettingsOutputGroupArgs>> outputGroups() {
        return this.outputGroups;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from inputs. See Timecode Config for more details.
     * 
     */
    @Import(name="timecodeConfig", required=true)
    private Output<ChannelEncoderSettingsTimecodeConfigArgs> timecodeConfig;

    /**
     * @return Contains settings used to acquire and adjust timecode information from inputs. See Timecode Config for more details.
     * 
     */
    public Output<ChannelEncoderSettingsTimecodeConfigArgs> timecodeConfig() {
        return this.timecodeConfig;
    }

    /**
     * Video Descriptions. See Video Descriptions for more details.
     * 
     */
    @Import(name="videoDescriptions")
    private @Nullable Output<List<ChannelEncoderSettingsVideoDescriptionArgs>> videoDescriptions;

    /**
     * @return Video Descriptions. See Video Descriptions for more details.
     * 
     */
    public Optional<Output<List<ChannelEncoderSettingsVideoDescriptionArgs>>> videoDescriptions() {
        return Optional.ofNullable(this.videoDescriptions);
    }

    private ChannelEncoderSettingsArgs() {}

    private ChannelEncoderSettingsArgs(ChannelEncoderSettingsArgs $) {
        this.audioDescriptions = $.audioDescriptions;
        this.availBlanking = $.availBlanking;
        this.outputGroups = $.outputGroups;
        this.timecodeConfig = $.timecodeConfig;
        this.videoDescriptions = $.videoDescriptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioDescriptions Audio descriptions for the channel. See Audio Descriptions for more details.
         * 
         * @return builder
         * 
         */
        public Builder audioDescriptions(@Nullable Output<List<ChannelEncoderSettingsAudioDescriptionArgs>> audioDescriptions) {
            $.audioDescriptions = audioDescriptions;
            return this;
        }

        /**
         * @param audioDescriptions Audio descriptions for the channel. See Audio Descriptions for more details.
         * 
         * @return builder
         * 
         */
        public Builder audioDescriptions(List<ChannelEncoderSettingsAudioDescriptionArgs> audioDescriptions) {
            return audioDescriptions(Output.of(audioDescriptions));
        }

        /**
         * @param audioDescriptions Audio descriptions for the channel. See Audio Descriptions for more details.
         * 
         * @return builder
         * 
         */
        public Builder audioDescriptions(ChannelEncoderSettingsAudioDescriptionArgs... audioDescriptions) {
            return audioDescriptions(List.of(audioDescriptions));
        }

        /**
         * @param availBlanking Settings for ad avail blanking. See Avail Blanking for more details.
         * 
         * @return builder
         * 
         */
        public Builder availBlanking(@Nullable Output<ChannelEncoderSettingsAvailBlankingArgs> availBlanking) {
            $.availBlanking = availBlanking;
            return this;
        }

        /**
         * @param availBlanking Settings for ad avail blanking. See Avail Blanking for more details.
         * 
         * @return builder
         * 
         */
        public Builder availBlanking(ChannelEncoderSettingsAvailBlankingArgs availBlanking) {
            return availBlanking(Output.of(availBlanking));
        }

        /**
         * @param outputGroups Output groups for the channel. See Output Groups for more details.
         * 
         * @return builder
         * 
         */
        public Builder outputGroups(Output<List<ChannelEncoderSettingsOutputGroupArgs>> outputGroups) {
            $.outputGroups = outputGroups;
            return this;
        }

        /**
         * @param outputGroups Output groups for the channel. See Output Groups for more details.
         * 
         * @return builder
         * 
         */
        public Builder outputGroups(List<ChannelEncoderSettingsOutputGroupArgs> outputGroups) {
            return outputGroups(Output.of(outputGroups));
        }

        /**
         * @param outputGroups Output groups for the channel. See Output Groups for more details.
         * 
         * @return builder
         * 
         */
        public Builder outputGroups(ChannelEncoderSettingsOutputGroupArgs... outputGroups) {
            return outputGroups(List.of(outputGroups));
        }

        /**
         * @param timecodeConfig Contains settings used to acquire and adjust timecode information from inputs. See Timecode Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder timecodeConfig(Output<ChannelEncoderSettingsTimecodeConfigArgs> timecodeConfig) {
            $.timecodeConfig = timecodeConfig;
            return this;
        }

        /**
         * @param timecodeConfig Contains settings used to acquire and adjust timecode information from inputs. See Timecode Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder timecodeConfig(ChannelEncoderSettingsTimecodeConfigArgs timecodeConfig) {
            return timecodeConfig(Output.of(timecodeConfig));
        }

        /**
         * @param videoDescriptions Video Descriptions. See Video Descriptions for more details.
         * 
         * @return builder
         * 
         */
        public Builder videoDescriptions(@Nullable Output<List<ChannelEncoderSettingsVideoDescriptionArgs>> videoDescriptions) {
            $.videoDescriptions = videoDescriptions;
            return this;
        }

        /**
         * @param videoDescriptions Video Descriptions. See Video Descriptions for more details.
         * 
         * @return builder
         * 
         */
        public Builder videoDescriptions(List<ChannelEncoderSettingsVideoDescriptionArgs> videoDescriptions) {
            return videoDescriptions(Output.of(videoDescriptions));
        }

        /**
         * @param videoDescriptions Video Descriptions. See Video Descriptions for more details.
         * 
         * @return builder
         * 
         */
        public Builder videoDescriptions(ChannelEncoderSettingsVideoDescriptionArgs... videoDescriptions) {
            return videoDescriptions(List.of(videoDescriptions));
        }

        public ChannelEncoderSettingsArgs build() {
            $.outputGroups = Objects.requireNonNull($.outputGroups, "expected parameter 'outputGroups' to be non-null");
            $.timecodeConfig = Objects.requireNonNull($.timecodeConfig, "expected parameter 'timecodeConfig' to be non-null");
            return $;
        }
    }

}
