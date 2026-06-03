package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTEfx.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTEfx.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTEfx.class */
public class EXTEfx {
    public static final int ALC_EFX_MAJOR_VERSION = 131073;
    public static final int ALC_EFX_MINOR_VERSION = 131074;
    public static final int ALC_MAX_AUXILIARY_SENDS = 131075;
    public static final int AL_METERS_PER_UNIT = 131076;
    public static final int AL_DIRECT_FILTER = 131077;
    public static final int AL_AUXILIARY_SEND_FILTER = 131078;
    public static final int AL_AIR_ABSORPTION_FACTOR = 131079;
    public static final int AL_ROOM_ROLLOFF_FACTOR = 131080;
    public static final int AL_CONE_OUTER_GAINHF = 131081;
    public static final int AL_DIRECT_FILTER_GAINHF_AUTO = 131082;
    public static final int AL_AUXILIARY_SEND_FILTER_GAIN_AUTO = 131083;
    public static final int AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 131084;
    public static final int AL_EFFECTSLOT_NULL = 0;
    public static final int AL_EFFECTSLOT_EFFECT = 1;
    public static final int AL_EFFECTSLOT_GAIN = 2;
    public static final int AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = 3;
    public static final int AL_REVERB_DENSITY = 1;
    public static final int AL_REVERB_DIFFUSION = 2;
    public static final int AL_REVERB_GAIN = 3;
    public static final int AL_REVERB_GAINHF = 4;
    public static final int AL_REVERB_DECAY_TIME = 5;
    public static final int AL_REVERB_DECAY_HFRATIO = 6;
    public static final int AL_REVERB_REFLECTIONS_GAIN = 7;
    public static final int AL_REVERB_REFLECTIONS_DELAY = 8;
    public static final int AL_REVERB_LATE_REVERB_GAIN = 9;
    public static final int AL_REVERB_LATE_REVERB_DELAY = 10;
    public static final int AL_REVERB_AIR_ABSORPTION_GAINHF = 11;
    public static final int AL_REVERB_ROOM_ROLLOFF_FACTOR = 12;
    public static final int AL_REVERB_DECAY_HFLIMIT = 13;
    public static final int AL_EAXREVERB_DENSITY = 1;
    public static final int AL_EAXREVERB_DIFFUSION = 2;
    public static final int AL_EAXREVERB_GAIN = 3;
    public static final int AL_EAXREVERB_GAINHF = 4;
    public static final int AL_EAXREVERB_GAINLF = 5;
    public static final int AL_EAXREVERB_DECAY_TIME = 6;
    public static final int AL_EAXREVERB_DECAY_HFRATIO = 7;
    public static final int AL_EAXREVERB_DECAY_LFRATIO = 8;
    public static final int AL_EAXREVERB_REFLECTIONS_GAIN = 9;
    public static final int AL_EAXREVERB_REFLECTIONS_DELAY = 10;
    public static final int AL_EAXREVERB_REFLECTIONS_PAN = 11;
    public static final int AL_EAXREVERB_LATE_REVERB_GAIN = 12;
    public static final int AL_EAXREVERB_LATE_REVERB_DELAY = 13;
    public static final int AL_EAXREVERB_LATE_REVERB_PAN = 14;
    public static final int AL_EAXREVERB_ECHO_TIME = 15;
    public static final int AL_EAXREVERB_ECHO_DEPTH = 16;
    public static final int AL_EAXREVERB_MODULATION_TIME = 17;
    public static final int AL_EAXREVERB_MODULATION_DEPTH = 18;
    public static final int AL_EAXREVERB_AIR_ABSORPTION_GAINHF = 19;
    public static final int AL_EAXREVERB_HFREFERENCE = 20;
    public static final int AL_EAXREVERB_LFREFERENCE = 21;
    public static final int AL_EAXREVERB_ROOM_ROLLOFF_FACTOR = 22;
    public static final int AL_EAXREVERB_DECAY_HFLIMIT = 23;
    public static final int AL_CHORUS_WAVEFORM = 1;
    public static final int AL_CHORUS_PHASE = 2;
    public static final int AL_CHORUS_RATE = 3;
    public static final int AL_CHORUS_DEPTH = 4;
    public static final int AL_CHORUS_FEEDBACK = 5;
    public static final int AL_CHORUS_DELAY = 6;
    public static final int AL_DISTORTION_EDGE = 1;
    public static final int AL_DISTORTION_GAIN = 2;
    public static final int AL_DISTORTION_LOWPASS_CUTOFF = 3;
    public static final int AL_DISTORTION_EQCENTER = 4;
    public static final int AL_DISTORTION_EQBANDWIDTH = 5;
    public static final int AL_ECHO_DELAY = 1;
    public static final int AL_ECHO_LRDELAY = 2;
    public static final int AL_ECHO_DAMPING = 3;
    public static final int AL_ECHO_FEEDBACK = 4;
    public static final int AL_ECHO_SPREAD = 5;
    public static final int AL_FLANGER_WAVEFORM = 1;
    public static final int AL_FLANGER_PHASE = 2;
    public static final int AL_FLANGER_RATE = 3;
    public static final int AL_FLANGER_DEPTH = 4;
    public static final int AL_FLANGER_FEEDBACK = 5;
    public static final int AL_FLANGER_DELAY = 6;
    public static final int AL_FREQUENCY_SHIFTER_FREQUENCY = 1;
    public static final int AL_FREQUENCY_SHIFTER_LEFT_DIRECTION = 2;
    public static final int AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION = 3;
    public static final int AL_VOCMORPHER_PHONEMEA = 1;
    public static final int AL_VOCMORPHER_PHONEMEA_COARSE_TUNING = 2;
    public static final int AL_VOCMORPHER_PHONEMEB = 3;
    public static final int AL_VOCMORPHER_PHONEMEB_COARSE_TUNING = 4;
    public static final int AL_VOCMORPHER_WAVEFORM = 5;
    public static final int AL_VOCMORPHER_RATE = 6;
    public static final int AL_PITCH_SHIFTER_COARSE_TUNE = 1;
    public static final int AL_PITCH_SHIFTER_FINE_TUNE = 2;
    public static final int AL_RING_MODULATOR_FREQUENCY = 1;
    public static final int AL_RING_MODULATOR_HIGHPASS_CUTOFF = 2;
    public static final int AL_RING_MODULATOR_WAVEFORM = 3;
    public static final int AL_AUTOWAH_ATTACK_TIME = 1;
    public static final int AL_AUTOWAH_RELEASE_TIME = 2;
    public static final int AL_AUTOWAH_RESONANCE = 3;
    public static final int AL_AUTOWAH_PEAK_GAIN = 4;
    public static final int AL_COMPRESSOR_ONOFF = 1;
    public static final int AL_EQUALIZER_LOW_GAIN = 1;
    public static final int AL_EQUALIZER_LOW_CUTOFF = 2;
    public static final int AL_EQUALIZER_MID1_GAIN = 3;
    public static final int AL_EQUALIZER_MID1_CENTER = 4;
    public static final int AL_EQUALIZER_MID1_WIDTH = 5;
    public static final int AL_EQUALIZER_MID2_GAIN = 6;
    public static final int AL_EQUALIZER_MID2_CENTER = 7;
    public static final int AL_EQUALIZER_MID2_WIDTH = 8;
    public static final int AL_EQUALIZER_HIGH_GAIN = 9;
    public static final int AL_EQUALIZER_HIGH_CUTOFF = 10;
    public static final int AL_EFFECT_FIRST_PARAMETER = 0;
    public static final int AL_EFFECT_LAST_PARAMETER = 32768;
    public static final int AL_EFFECT_TYPE = 32769;
    public static final int AL_EFFECT_NULL = 0;
    public static final int AL_EFFECT_REVERB = 1;
    public static final int AL_EFFECT_CHORUS = 2;
    public static final int AL_EFFECT_DISTORTION = 3;
    public static final int AL_EFFECT_ECHO = 4;
    public static final int AL_EFFECT_FLANGER = 5;
    public static final int AL_EFFECT_FREQUENCY_SHIFTER = 6;
    public static final int AL_EFFECT_VOCAL_MORPHER = 7;
    public static final int AL_EFFECT_PITCH_SHIFTER = 8;
    public static final int AL_EFFECT_RING_MODULATOR = 9;
    public static final int AL_EFFECT_AUTOWAH = 10;
    public static final int AL_EFFECT_COMPRESSOR = 11;
    public static final int AL_EFFECT_EQUALIZER = 12;
    public static final int AL_EFFECT_EAXREVERB = 32768;
    public static final int AL_LOWPASS_GAIN = 1;
    public static final int AL_LOWPASS_GAINHF = 2;
    public static final int AL_HIGHPASS_GAIN = 1;
    public static final int AL_HIGHPASS_GAINLF = 2;
    public static final int AL_BANDPASS_GAIN = 1;
    public static final int AL_BANDPASS_GAINLF = 2;
    public static final int AL_BANDPASS_GAINHF = 3;
    public static final int AL_FILTER_FIRST_PARAMETER = 0;
    public static final int AL_FILTER_LAST_PARAMETER = 32768;
    public static final int AL_FILTER_TYPE = 32769;
    public static final int AL_FILTER_NULL = 0;
    public static final int AL_FILTER_LOWPASS = 1;
    public static final int AL_FILTER_HIGHPASS = 2;
    public static final int AL_FILTER_BANDPASS = 3;
    public static final float AL_MIN_AIR_ABSORPTION_FACTOR = 0.0f;
    public static final float AL_MAX_AIR_ABSORPTION_FACTOR = 10.0f;
    public static final float AL_DEFAULT_AIR_ABSORPTION_FACTOR = 0.0f;
    public static final float AL_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_MIN_CONE_OUTER_GAINHF = 0.0f;
    public static final float AL_MAX_CONE_OUTER_GAINHF = 1.0f;
    public static final float AL_DEFAULT_CONE_OUTER_GAINHF = 1.0f;
    public static final int AL_MIN_DIRECT_FILTER_GAINHF_AUTO = 0;
    public static final int AL_MAX_DIRECT_FILTER_GAINHF_AUTO = 1;
    public static final int AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO = 1;
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO = 0;
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO = 1;
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO = 1;
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0;
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 1;
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 1;
    public static final float AL_MIN_METERS_PER_UNIT = Float.MIN_VALUE;
    public static final float AL_MAX_METERS_PER_UNIT = Float.MAX_VALUE;
    public static final float AL_DEFAULT_METERS_PER_UNIT = 1.0f;
    public static final float AL_REVERB_MIN_DENSITY = 0.0f;
    public static final float AL_REVERB_MAX_DENSITY = 1.0f;
    public static final float AL_REVERB_DEFAULT_DENSITY = 1.0f;
    public static final float AL_REVERB_MIN_DIFFUSION = 0.0f;
    public static final float AL_REVERB_MAX_DIFFUSION = 1.0f;
    public static final float AL_REVERB_DEFAULT_DIFFUSION = 1.0f;
    public static final float AL_REVERB_MIN_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_GAIN = 1.0f;
    public static final float AL_REVERB_DEFAULT_GAIN = 0.32f;
    public static final float AL_REVERB_MIN_GAINHF = 0.0f;
    public static final float AL_REVERB_MAX_GAINHF = 1.0f;
    public static final float AL_REVERB_DEFAULT_GAINHF = 0.89f;
    public static final float AL_REVERB_MIN_DECAY_TIME = 0.1f;
    public static final float AL_REVERB_MAX_DECAY_TIME = 20.0f;
    public static final float AL_REVERB_DEFAULT_DECAY_TIME = 1.49f;
    public static final float AL_REVERB_MIN_DECAY_HFRATIO = 0.1f;
    public static final float AL_REVERB_MAX_DECAY_HFRATIO = 2.0f;
    public static final float AL_REVERB_DEFAULT_DECAY_HFRATIO = 0.83f;
    public static final float AL_REVERB_MIN_REFLECTIONS_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_REFLECTIONS_GAIN = 3.16f;
    public static final float AL_REVERB_DEFAULT_REFLECTIONS_GAIN = 0.05f;
    public static final float AL_REVERB_MIN_REFLECTIONS_DELAY = 0.0f;
    public static final float AL_REVERB_MAX_REFLECTIONS_DELAY = 0.3f;
    public static final float AL_REVERB_DEFAULT_REFLECTIONS_DELAY = 0.007f;
    public static final float AL_REVERB_MIN_LATE_REVERB_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_LATE_REVERB_GAIN = 10.0f;
    public static final float AL_REVERB_DEFAULT_LATE_REVERB_GAIN = 1.26f;
    public static final float AL_REVERB_MIN_LATE_REVERB_DELAY = 0.0f;
    public static final float AL_REVERB_MAX_LATE_REVERB_DELAY = 0.1f;
    public static final float AL_REVERB_DEFAULT_LATE_REVERB_DELAY = 0.011f;
    public static final float AL_REVERB_MIN_AIR_ABSORPTION_GAINHF = 0.892f;
    public static final float AL_REVERB_MAX_AIR_ABSORPTION_GAINHF = 1.0f;
    public static final float AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f;
    public static final float AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final int AL_REVERB_MIN_DECAY_HFLIMIT = 0;
    public static final int AL_REVERB_MAX_DECAY_HFLIMIT = 1;
    public static final int AL_REVERB_DEFAULT_DECAY_HFLIMIT = 1;
    public static final float AL_EAXREVERB_MIN_DENSITY = 0.0f;
    public static final float AL_EAXREVERB_MAX_DENSITY = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_DENSITY = 1.0f;
    public static final float AL_EAXREVERB_MIN_DIFFUSION = 0.0f;
    public static final float AL_EAXREVERB_MAX_DIFFUSION = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_DIFFUSION = 1.0f;
    public static final float AL_EAXREVERB_MIN_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAIN = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAIN = 0.32f;
    public static final float AL_EAXREVERB_MIN_GAINHF = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAINHF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAINHF = 0.89f;
    public static final float AL_EAXREVERB_MIN_GAINLF = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAINLF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAINLF = 1.0f;
    public static final float AL_EAXREVERB_MIN_DECAY_TIME = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_TIME = 20.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_TIME = 1.49f;
    public static final float AL_EAXREVERB_MIN_DECAY_HFRATIO = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_HFRATIO = 2.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_HFRATIO = 0.83f;
    public static final float AL_EAXREVERB_MIN_DECAY_LFRATIO = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_LFRATIO = 2.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_LFRATIO = 1.0f;
    public static final float AL_EAXREVERB_MIN_REFLECTIONS_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_REFLECTIONS_GAIN = 3.16f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN = 0.05f;
    public static final float AL_EAXREVERB_MIN_REFLECTIONS_DELAY = 0.0f;
    public static final float AL_EAXREVERB_MAX_REFLECTIONS_DELAY = 0.3f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY = 0.007f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ = 0.0f;
    public static final float AL_EAXREVERB_MIN_LATE_REVERB_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_LATE_REVERB_GAIN = 10.0f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN = 1.26f;
    public static final float AL_EAXREVERB_MIN_LATE_REVERB_DELAY = 0.0f;
    public static final float AL_EAXREVERB_MAX_LATE_REVERB_DELAY = 0.1f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY = 0.011f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ = 0.0f;
    public static final float AL_EAXREVERB_MIN_ECHO_TIME = 0.075f;
    public static final float AL_EAXREVERB_MAX_ECHO_TIME = 0.25f;
    public static final float AL_EAXREVERB_DEFAULT_ECHO_TIME = 0.25f;
    public static final float AL_EAXREVERB_MIN_ECHO_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MAX_ECHO_DEPTH = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_ECHO_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MIN_MODULATION_TIME = 0.04f;
    public static final float AL_EAXREVERB_MAX_MODULATION_TIME = 4.0f;
    public static final float AL_EAXREVERB_DEFAULT_MODULATION_TIME = 0.25f;
    public static final float AL_EAXREVERB_MIN_MODULATION_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MAX_MODULATION_DEPTH = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_MODULATION_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF = 0.892f;
    public static final float AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f;
    public static final float AL_EAXREVERB_MIN_HFREFERENCE = 1000.0f;
    public static final float AL_EAXREVERB_MAX_HFREFERENCE = 20000.0f;
    public static final float AL_EAXREVERB_DEFAULT_HFREFERENCE = 5000.0f;
    public static final float AL_EAXREVERB_MIN_LFREFERENCE = 20.0f;
    public static final float AL_EAXREVERB_MAX_LFREFERENCE = 1000.0f;
    public static final float AL_EAXREVERB_DEFAULT_LFREFERENCE = 250.0f;
    public static final float AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final int AL_EAXREVERB_MIN_DECAY_HFLIMIT = 0;
    public static final int AL_EAXREVERB_MAX_DECAY_HFLIMIT = 1;
    public static final int AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT = 1;
    public static final int AL_CHORUS_WAVEFORM_SINUSOID = 0;
    public static final int AL_CHORUS_WAVEFORM_TRIANGLE = 1;
    public static final int AL_CHORUS_MIN_WAVEFORM = 0;
    public static final int AL_CHORUS_MAX_WAVEFORM = 1;
    public static final int AL_CHORUS_DEFAULT_WAVEFORM = 1;
    public static final int AL_CHORUS_MIN_PHASE = -180;
    public static final int AL_CHORUS_MAX_PHASE = 180;
    public static final int AL_CHORUS_DEFAULT_PHASE = 90;
    public static final float AL_CHORUS_MIN_RATE = 0.0f;
    public static final float AL_CHORUS_MAX_RATE = 10.0f;
    public static final float AL_CHORUS_DEFAULT_RATE = 1.1f;
    public static final float AL_CHORUS_MIN_DEPTH = 0.0f;
    public static final float AL_CHORUS_MAX_DEPTH = 1.0f;
    public static final float AL_CHORUS_DEFAULT_DEPTH = 0.1f;
    public static final float AL_CHORUS_MIN_FEEDBACK = -1.0f;
    public static final float AL_CHORUS_MAX_FEEDBACK = 1.0f;
    public static final float AL_CHORUS_DEFAULT_FEEDBACK = 0.25f;
    public static final float AL_CHORUS_MIN_DELAY = 0.0f;
    public static final float AL_CHORUS_MAX_DELAY = 0.016f;
    public static final float AL_CHORUS_DEFAULT_DELAY = 0.016f;
    public static final float AL_DISTORTION_MIN_EDGE = 0.0f;
    public static final float AL_DISTORTION_MAX_EDGE = 1.0f;
    public static final float AL_DISTORTION_DEFAULT_EDGE = 0.2f;
    public static final float AL_DISTORTION_MIN_GAIN = 0.01f;
    public static final float AL_DISTORTION_MAX_GAIN = 1.0f;
    public static final float AL_DISTORTION_DEFAULT_GAIN = 0.05f;
    public static final float AL_DISTORTION_MIN_LOWPASS_CUTOFF = 80.0f;
    public static final float AL_DISTORTION_MAX_LOWPASS_CUTOFF = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF = 8000.0f;
    public static final float AL_DISTORTION_MIN_EQCENTER = 80.0f;
    public static final float AL_DISTORTION_MAX_EQCENTER = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_EQCENTER = 3600.0f;
    public static final float AL_DISTORTION_MIN_EQBANDWIDTH = 80.0f;
    public static final float AL_DISTORTION_MAX_EQBANDWIDTH = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_EQBANDWIDTH = 3600.0f;
    public static final float AL_ECHO_MIN_DELAY = 0.0f;
    public static final float AL_ECHO_MAX_DELAY = 0.207f;
    public static final float AL_ECHO_DEFAULT_DELAY = 0.1f;
    public static final float AL_ECHO_MIN_LRDELAY = 0.0f;
    public static final float AL_ECHO_MAX_LRDELAY = 0.404f;
    public static final float AL_ECHO_DEFAULT_LRDELAY = 0.1f;
    public static final float AL_ECHO_MIN_DAMPING = 0.0f;
    public static final float AL_ECHO_MAX_DAMPING = 0.99f;
    public static final float AL_ECHO_DEFAULT_DAMPING = 0.5f;
    public static final float AL_ECHO_MIN_FEEDBACK = 0.0f;
    public static final float AL_ECHO_MAX_FEEDBACK = 1.0f;
    public static final float AL_ECHO_DEFAULT_FEEDBACK = 0.5f;
    public static final float AL_ECHO_MIN_SPREAD = -1.0f;
    public static final float AL_ECHO_MAX_SPREAD = 1.0f;
    public static final float AL_ECHO_DEFAULT_SPREAD = -1.0f;
    public static final int AL_FLANGER_WAVEFORM_SINUSOID = 0;
    public static final int AL_FLANGER_WAVEFORM_TRIANGLE = 1;
    public static final int AL_FLANGER_MIN_WAVEFORM = 0;
    public static final int AL_FLANGER_MAX_WAVEFORM = 1;
    public static final int AL_FLANGER_DEFAULT_WAVEFORM = 1;
    public static final int AL_FLANGER_MIN_PHASE = -180;
    public static final int AL_FLANGER_MAX_PHASE = 180;
    public static final int AL_FLANGER_DEFAULT_PHASE = 0;
    public static final float AL_FLANGER_MIN_RATE = 0.0f;
    public static final float AL_FLANGER_MAX_RATE = 10.0f;
    public static final float AL_FLANGER_DEFAULT_RATE = 0.27f;
    public static final float AL_FLANGER_MIN_DEPTH = 0.0f;
    public static final float AL_FLANGER_MAX_DEPTH = 1.0f;
    public static final float AL_FLANGER_DEFAULT_DEPTH = 1.0f;
    public static final float AL_FLANGER_MIN_FEEDBACK = -1.0f;
    public static final float AL_FLANGER_MAX_FEEDBACK = 1.0f;
    public static final float AL_FLANGER_DEFAULT_FEEDBACK = -0.5f;
    public static final float AL_FLANGER_MIN_DELAY = 0.0f;
    public static final float AL_FLANGER_MAX_DELAY = 0.004f;
    public static final float AL_FLANGER_DEFAULT_DELAY = 0.002f;
    public static final float AL_FREQUENCY_SHIFTER_MIN_FREQUENCY = 0.0f;
    public static final float AL_FREQUENCY_SHIFTER_MAX_FREQUENCY = 24000.0f;
    public static final float AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY = 0.0f;
    public static final int AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION = 0;
    public static final int AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION = 2;
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION = 0;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_DOWN = 0;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_UP = 1;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_OFF = 2;
    public static final int AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION = 0;
    public static final int AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION = 2;
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION = 0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA = 0;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA = 29;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA = 0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING = -24;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING = 24;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING = 0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB = 0;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB = 29;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB = 10;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING = -24;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING = 24;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING = 0;
    public static final int AL_VOCAL_MORPHER_PHONEME_A = 0;
    public static final int AL_VOCAL_MORPHER_PHONEME_E = 1;
    public static final int AL_VOCAL_MORPHER_PHONEME_I = 2;
    public static final int AL_VOCAL_MORPHER_PHONEME_O = 3;
    public static final int AL_VOCAL_MORPHER_PHONEME_U = 4;
    public static final int AL_VOCAL_MORPHER_PHONEME_AA = 5;
    public static final int AL_VOCAL_MORPHER_PHONEME_AE = 6;
    public static final int AL_VOCAL_MORPHER_PHONEME_AH = 7;
    public static final int AL_VOCAL_MORPHER_PHONEME_AO = 8;
    public static final int AL_VOCAL_MORPHER_PHONEME_EH = 9;
    public static final int AL_VOCAL_MORPHER_PHONEME_ER = 10;
    public static final int AL_VOCAL_MORPHER_PHONEME_IH = 11;
    public static final int AL_VOCAL_MORPHER_PHONEME_IY = 12;
    public static final int AL_VOCAL_MORPHER_PHONEME_UH = 13;
    public static final int AL_VOCAL_MORPHER_PHONEME_UW = 14;
    public static final int AL_VOCAL_MORPHER_PHONEME_B = 15;
    public static final int AL_VOCAL_MORPHER_PHONEME_D = 16;
    public static final int AL_VOCAL_MORPHER_PHONEME_F = 17;
    public static final int AL_VOCAL_MORPHER_PHONEME_G = 18;
    public static final int AL_VOCAL_MORPHER_PHONEME_J = 19;
    public static final int AL_VOCAL_MORPHER_PHONEME_K = 20;
    public static final int AL_VOCAL_MORPHER_PHONEME_L = 21;
    public static final int AL_VOCAL_MORPHER_PHONEME_M = 22;
    public static final int AL_VOCAL_MORPHER_PHONEME_N = 23;
    public static final int AL_VOCAL_MORPHER_PHONEME_P = 24;
    public static final int AL_VOCAL_MORPHER_PHONEME_R = 25;
    public static final int AL_VOCAL_MORPHER_PHONEME_S = 26;
    public static final int AL_VOCAL_MORPHER_PHONEME_T = 27;
    public static final int AL_VOCAL_MORPHER_PHONEME_V = 28;
    public static final int AL_VOCAL_MORPHER_PHONEME_Z = 29;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SINUSOID = 0;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE = 1;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH = 2;
    public static final int AL_VOCAL_MORPHER_MIN_WAVEFORM = 0;
    public static final int AL_VOCAL_MORPHER_MAX_WAVEFORM = 2;
    public static final int AL_VOCAL_MORPHER_DEFAULT_WAVEFORM = 0;
    public static final float AL_VOCAL_MORPHER_MIN_RATE = 0.0f;
    public static final float AL_VOCAL_MORPHER_MAX_RATE = 10.0f;
    public static final float AL_VOCAL_MORPHER_DEFAULT_RATE = 1.41f;
    public static final int AL_PITCH_SHIFTER_MIN_COARSE_TUNE = -12;
    public static final int AL_PITCH_SHIFTER_MAX_COARSE_TUNE = 12;
    public static final int AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE = 12;
    public static final int AL_PITCH_SHIFTER_MIN_FINE_TUNE = -50;
    public static final int AL_PITCH_SHIFTER_MAX_FINE_TUNE = 50;
    public static final int AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE = 0;
    public static final float AL_RING_MODULATOR_MIN_FREQUENCY = 0.0f;
    public static final float AL_RING_MODULATOR_MAX_FREQUENCY = 8000.0f;
    public static final float AL_RING_MODULATOR_DEFAULT_FREQUENCY = 440.0f;
    public static final float AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF = 0.0f;
    public static final float AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF = 24000.0f;
    public static final float AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF = 800.0f;
    public static final int AL_RING_MODULATOR_SINUSOID = 0;
    public static final int AL_RING_MODULATOR_SAWTOOTH = 1;
    public static final int AL_RING_MODULATOR_SQUARE = 2;
    public static final int AL_RING_MODULATOR_MIN_WAVEFORM = 0;
    public static final int AL_RING_MODULATOR_MAX_WAVEFORM = 2;
    public static final int AL_RING_MODULATOR_DEFAULT_WAVEFORM = 0;
    public static final float AL_AUTOWAH_MIN_ATTACK_TIME = 1.0E-4f;
    public static final float AL_AUTOWAH_MAX_ATTACK_TIME = 1.0f;
    public static final float AL_AUTOWAH_DEFAULT_ATTACK_TIME = 0.06f;
    public static final float AL_AUTOWAH_MIN_RELEASE_TIME = 1.0E-4f;
    public static final float AL_AUTOWAH_MAX_RELEASE_TIME = 1.0f;
    public static final float AL_AUTOWAH_DEFAULT_RELEASE_TIME = 0.06f;
    public static final float AL_AUTOWAH_MIN_RESONANCE = 2.0f;
    public static final float AL_AUTOWAH_MAX_RESONANCE = 1000.0f;
    public static final float AL_AUTOWAH_DEFAULT_RESONANCE = 1000.0f;
    public static final float AL_AUTOWAH_MIN_PEAK_GAIN = 3.0E-5f;
    public static final float AL_AUTOWAH_MAX_PEAK_GAIN = 31621.0f;
    public static final float AL_AUTOWAH_DEFAULT_PEAK_GAIN = 11.22f;
    public static final int AL_COMPRESSOR_MIN_ONOFF = 0;
    public static final int AL_COMPRESSOR_MAX_ONOFF = 1;
    public static final int AL_COMPRESSOR_DEFAULT_ONOFF = 1;
    public static final float AL_EQUALIZER_MIN_LOW_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_LOW_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_LOW_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_LOW_CUTOFF = 50.0f;
    public static final float AL_EQUALIZER_MAX_LOW_CUTOFF = 800.0f;
    public static final float AL_EQUALIZER_DEFAULT_LOW_CUTOFF = 200.0f;
    public static final float AL_EQUALIZER_MIN_MID1_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_MID1_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID1_CENTER = 200.0f;
    public static final float AL_EQUALIZER_MAX_MID1_CENTER = 3000.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_CENTER = 500.0f;
    public static final float AL_EQUALIZER_MIN_MID1_WIDTH = 0.01f;
    public static final float AL_EQUALIZER_MAX_MID1_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID2_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_MID2_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID2_CENTER = 1000.0f;
    public static final float AL_EQUALIZER_MAX_MID2_CENTER = 8000.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_CENTER = 3000.0f;
    public static final float AL_EQUALIZER_MIN_MID2_WIDTH = 0.01f;
    public static final float AL_EQUALIZER_MAX_MID2_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_MIN_HIGH_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_HIGH_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_HIGH_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_HIGH_CUTOFF = 4000.0f;
    public static final float AL_EQUALIZER_MAX_HIGH_CUTOFF = 16000.0f;
    public static final float AL_EQUALIZER_DEFAULT_HIGH_CUTOFF = 6000.0f;
    public static final float AL_LOWPASS_MIN_GAIN = 0.0f;
    public static final float AL_LOWPASS_MAX_GAIN = 1.0f;
    public static final float AL_LOWPASS_DEFAULT_GAIN = 1.0f;
    public static final float AL_LOWPASS_MIN_GAINHF = 0.0f;
    public static final float AL_LOWPASS_MAX_GAINHF = 1.0f;
    public static final float AL_LOWPASS_DEFAULT_GAINHF = 1.0f;
    public static final float AL_HIGHPASS_MIN_GAIN = 0.0f;
    public static final float AL_HIGHPASS_MAX_GAIN = 1.0f;
    public static final float AL_HIGHPASS_DEFAULT_GAIN = 1.0f;
    public static final float AL_HIGHPASS_MIN_GAINLF = 0.0f;
    public static final float AL_HIGHPASS_MAX_GAINLF = 1.0f;
    public static final float AL_HIGHPASS_DEFAULT_GAINLF = 1.0f;
    public static final float AL_BANDPASS_MIN_GAIN = 0.0f;
    public static final float AL_BANDPASS_MAX_GAIN = 1.0f;
    public static final float AL_BANDPASS_DEFAULT_GAIN = 1.0f;
    public static final float AL_BANDPASS_MIN_GAINHF = 0.0f;
    public static final float AL_BANDPASS_MAX_GAINHF = 1.0f;
    public static final float AL_BANDPASS_DEFAULT_GAINHF = 1.0f;
    public static final float AL_BANDPASS_MIN_GAINLF = 0.0f;
    public static final float AL_BANDPASS_MAX_GAINLF = 1.0f;
    public static final float AL_BANDPASS_DEFAULT_GAINLF = 1.0f;

    protected EXTEfx() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nalGenEffects(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenEffects
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenEffects(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGenEffects(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGenEffects() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nalGenEffects(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    public static void nalDeleteEffects(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteEffects
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteEffects(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalDeleteEffects(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteEffects(@org.lwjgl.system.NativeType("ALuint *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nalDeleteEffects(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    @org.lwjgl.system.NativeType("ALboolean")
    public static boolean alIsEffect(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alIsEffect
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r4
            r1 = r5
            boolean r0 = org.lwjgl.system.JNI.invokeZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alEffecti(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint") int r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEffecti
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    public static void nalEffectiv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEffectiv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alEffectiv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalEffectiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alEffectf(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat") float r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEffectf
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    public static void nalEffectfv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEffectfv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alEffectfv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalEffectfv(r0, r1, r2)
            return
    }

    public static void nalGetEffecti(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEffecti
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetEffecti(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetEffecti(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGetEffecti(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetEffecti(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetEffectiv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEffectiv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetEffectiv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetEffectiv(r0, r1, r2)
            return
    }

    public static void nalGetEffectf(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEffectf
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetEffectf(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetEffectf(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static float alGetEffectf(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetEffectf(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetEffectfv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEffectfv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetEffectfv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetEffectfv(r0, r1, r2)
            return
    }

    public static void nalGenFilters(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenFilters
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenFilters(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGenFilters(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGenFilters() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nalGenFilters(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    public static void nalDeleteFilters(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteFilters
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteFilters(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalDeleteFilters(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteFilters(@org.lwjgl.system.NativeType("ALuint *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nalDeleteFilters(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    @org.lwjgl.system.NativeType("ALboolean")
    public static boolean alIsFilter(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alIsFilter
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r4
            r1 = r5
            boolean r0 = org.lwjgl.system.JNI.invokeZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alFilteri(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint") int r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alFilteri
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    public static void nalFilteriv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alFilteriv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alFilteriv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalFilteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alFilterf(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat") float r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alFilterf
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    public static void nalFilterfv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alFilterfv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alFilterfv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalFilterfv(r0, r1, r2)
            return
    }

    public static void nalGetFilteri(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFilteri
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFilteri(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetFilteri(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGetFilteri(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetFilteri(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetFilteriv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFilteriv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFilteriv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetFilteriv(r0, r1, r2)
            return
    }

    public static void nalGetFilterf(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFilterf
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFilterf(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetFilterf(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static float alGetFilterf(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetFilterf(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetFilterfv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFilterfv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFilterfv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetFilterfv(r0, r1, r2)
            return
    }

    public static void nalGenAuxiliaryEffectSlots(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenAuxiliaryEffectSlots
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlots(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGenAuxiliaryEffectSlots(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGenAuxiliaryEffectSlots() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nalGenAuxiliaryEffectSlots(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    public static void nalDeleteAuxiliaryEffectSlots(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteAuxiliaryEffectSlots
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalDeleteAuxiliaryEffectSlots(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@org.lwjgl.system.NativeType("ALuint *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nalDeleteAuxiliaryEffectSlots(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    @org.lwjgl.system.NativeType("ALboolean")
    public static boolean alIsAuxiliaryEffectSlot(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alIsAuxiliaryEffectSlot
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r4
            r1 = r5
            boolean r0 = org.lwjgl.system.JNI.invokeZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alAuxiliaryEffectSloti(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint") int r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alAuxiliaryEffectSloti
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    public static void nalAuxiliaryEffectSlotiv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alAuxiliaryEffectSlotiv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotiv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalAuxiliaryEffectSlotiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotf(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat") float r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alAuxiliaryEffectSlotf
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    public static void nalAuxiliaryEffectSlotfv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alAuxiliaryEffectSlotfv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat const *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalAuxiliaryEffectSlotfv(r0, r1, r2)
            return
    }

    public static void nalGetAuxiliaryEffectSloti(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetAuxiliaryEffectSloti
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSloti(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetAuxiliaryEffectSloti(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGetAuxiliaryEffectSloti(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetAuxiliaryEffectSloti(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetAuxiliaryEffectSlotiv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetAuxiliaryEffectSlotiv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetAuxiliaryEffectSlotiv(r0, r1, r2)
            return
    }

    public static void nalGetAuxiliaryEffectSlotf(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetAuxiliaryEffectSlotf
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotf(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetAuxiliaryEffectSlotf(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static float alGetAuxiliaryEffectSlotf(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetAuxiliaryEffectSlotf(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetAuxiliaryEffectSlotfv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetAuxiliaryEffectSlotfv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetAuxiliaryEffectSlotfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenEffects(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenEffects
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteEffects(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteEffects
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alEffectiv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint const *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEffectiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alEffectfv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat const *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEffectfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetEffecti(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEffecti
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetEffectiv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEffectiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetEffectf(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEffectf
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetEffectfv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEffectfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenFilters(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenFilters
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteFilters(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteFilters
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alFilteriv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint const *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alFilteriv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alFilterfv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat const *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alFilterfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFilteri(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFilteri
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFilteriv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFilteriv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFilterf(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFilterf
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFilterfv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFilterfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenAuxiliaryEffectSlots(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenAuxiliaryEffectSlots
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteAuxiliaryEffectSlots(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteAuxiliaryEffectSlots
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotiv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint const *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alAuxiliaryEffectSlotiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alAuxiliaryEffectSlotfv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat const *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alAuxiliaryEffectSlotfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSloti(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetAuxiliaryEffectSloti
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotiv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetAuxiliaryEffectSlotiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotf(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetAuxiliaryEffectSlotf
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetAuxiliaryEffectSlotfv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetAuxiliaryEffectSlotfv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }
}
