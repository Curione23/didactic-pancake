package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALCapabilities.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALCapabilities.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALCapabilities.class */
public final class ALCapabilities {
    public final long alGetError;
    public final long alEnable;
    public final long alDisable;
    public final long alIsEnabled;
    public final long alGetBoolean;
    public final long alGetInteger;
    public final long alGetFloat;
    public final long alGetDouble;
    public final long alGetBooleanv;
    public final long alGetIntegerv;
    public final long alGetFloatv;
    public final long alGetDoublev;
    public final long alGetString;
    public final long alDistanceModel;
    public final long alDopplerFactor;
    public final long alDopplerVelocity;
    public final long alListenerf;
    public final long alListeneri;
    public final long alListener3f;
    public final long alListenerfv;
    public final long alGetListenerf;
    public final long alGetListeneri;
    public final long alGetListener3f;
    public final long alGetListenerfv;
    public final long alGenSources;
    public final long alDeleteSources;
    public final long alIsSource;
    public final long alSourcef;
    public final long alSource3f;
    public final long alSourcefv;
    public final long alSourcei;
    public final long alGetSourcef;
    public final long alGetSource3f;
    public final long alGetSourcefv;
    public final long alGetSourcei;
    public final long alGetSourceiv;
    public final long alSourceQueueBuffers;
    public final long alSourceUnqueueBuffers;
    public final long alSourcePlay;
    public final long alSourcePause;
    public final long alSourceStop;
    public final long alSourceRewind;
    public final long alSourcePlayv;
    public final long alSourcePausev;
    public final long alSourceStopv;
    public final long alSourceRewindv;
    public final long alGenBuffers;
    public final long alDeleteBuffers;
    public final long alIsBuffer;
    public final long alGetBufferf;
    public final long alGetBufferi;
    public final long alBufferData;
    public final long alGetEnumValue;
    public final long alGetProcAddress;
    public final long alIsExtensionPresent;
    public final long alListener3i;
    public final long alGetListeneriv;
    public final long alSource3i;
    public final long alListeneriv;
    public final long alSourceiv;
    public final long alBufferf;
    public final long alBuffer3f;
    public final long alBufferfv;
    public final long alBufferi;
    public final long alBuffer3i;
    public final long alBufferiv;
    public final long alGetBufferiv;
    public final long alGetBufferfv;
    public final long alSpeedOfSound;
    public final long alGenEffects;
    public final long alDeleteEffects;
    public final long alIsEffect;
    public final long alEffecti;
    public final long alEffectiv;
    public final long alEffectf;
    public final long alEffectfv;
    public final long alGetEffecti;
    public final long alGetEffectiv;
    public final long alGetEffectf;
    public final long alGetEffectfv;
    public final long alGenFilters;
    public final long alDeleteFilters;
    public final long alIsFilter;
    public final long alFilteri;
    public final long alFilteriv;
    public final long alFilterf;
    public final long alFilterfv;
    public final long alGetFilteri;
    public final long alGetFilteriv;
    public final long alGetFilterf;
    public final long alGetFilterfv;
    public final long alGenAuxiliaryEffectSlots;
    public final long alDeleteAuxiliaryEffectSlots;
    public final long alIsAuxiliaryEffectSlot;
    public final long alAuxiliaryEffectSloti;
    public final long alAuxiliaryEffectSlotiv;
    public final long alAuxiliaryEffectSlotf;
    public final long alAuxiliaryEffectSlotfv;
    public final long alGetAuxiliaryEffectSloti;
    public final long alGetAuxiliaryEffectSlotiv;
    public final long alGetAuxiliaryEffectSlotf;
    public final long alGetAuxiliaryEffectSlotfv;
    public final long alBufferDataStatic;
    public final long alBufferSamplesSOFT;
    public final long alBufferSubSamplesSOFT;
    public final long alGetBufferSamplesSOFT;
    public final long alIsBufferFormatSupportedSOFT;
    public final long alBufferSubDataSOFT;
    public final long alBufferCallbackSOFT;
    public final long alGetBufferPtrSOFT;
    public final long alGetBuffer3PtrSOFT;
    public final long alGetBufferPtrvSOFT;
    public final long alDeferUpdatesSOFT;
    public final long alProcessUpdatesSOFT;
    public final long alEventControlSOFT;
    public final long alEventCallbackSOFT;
    public final long alGetPointerSOFT;
    public final long alGetPointervSOFT;
    public final long alSourcedSOFT;
    public final long alSource3dSOFT;
    public final long alSourcedvSOFT;
    public final long alGetSourcedSOFT;
    public final long alGetSource3dSOFT;
    public final long alGetSourcedvSOFT;
    public final long alSourcei64SOFT;
    public final long alSource3i64SOFT;
    public final long alSourcei64vSOFT;
    public final long alGetSourcei64SOFT;
    public final long alGetSource3i64SOFT;
    public final long alGetSourcei64vSOFT;
    public final long alGetStringiSOFT;
    public final long alSourcePlayAtTimeSOFT;
    public final long alSourcePlayAtTimevSOFT;
    public final boolean OpenAL10;
    public final boolean OpenAL11;
    public final boolean AL_EXT_ALAW;
    public final boolean AL_EXT_BFORMAT;
    public final boolean AL_EXT_DOUBLE;
    public final boolean ALC_EXT_EFX;
    public final boolean AL_EXT_EXPONENT_DISTANCE;
    public final boolean AL_EXT_FLOAT32;
    public final boolean AL_EXT_IMA4;
    public final boolean AL_EXT_LINEAR_DISTANCE;
    public final boolean AL_EXT_MCFORMATS;
    public final boolean AL_EXT_MULAW;
    public final boolean AL_EXT_MULAW_BFORMAT;
    public final boolean AL_EXT_MULAW_MCFORMATS;
    public final boolean AL_EXT_OFFSET;
    public final boolean AL_EXT_source_distance_model;
    public final boolean AL_EXT_SOURCE_RADIUS;
    public final boolean AL_EXT_STATIC_BUFFER;
    public final boolean AL_EXT_STEREO_ANGLES;
    public final boolean AL_EXT_vorbis;
    public final boolean AL_LOKI_IMA_ADPCM;
    public final boolean AL_LOKI_quadriphonic;
    public final boolean AL_LOKI_WAVE_format;
    public final boolean AL_SOFT_bformat_ex;
    public final boolean AL_SOFT_block_alignment;
    public final boolean AL_SOFT_buffer_length_query;
    public final boolean AL_SOFT_buffer_samples;
    public final boolean AL_SOFT_buffer_sub_data;
    public final boolean AL_SOFT_callback_buffer;
    public final boolean AL_SOFT_deferred_updates;
    public final boolean AL_SOFT_direct_channels;
    public final boolean AL_SOFT_direct_channels_remix;
    public final boolean AL_SOFT_effect_target;
    public final boolean AL_SOFT_events;
    public final boolean AL_SOFT_gain_clamp_ex;
    public final boolean AL_SOFT_loop_points;
    public final boolean AL_SOFT_MSADPCM;
    public final boolean AL_SOFT_source_latency;
    public final boolean AL_SOFT_source_length;
    public final boolean AL_SOFT_source_resampler;
    public final boolean AL_SOFT_source_spatialize;
    public final boolean AL_SOFT_source_start_delay;
    public final boolean AL_SOFT_UHJ;
    public final boolean AL_SOFT_UHJ_ex;
    public final boolean AL_SOFTX_hold_on_disconnect;
    final org.lwjgl.PointerBuffer addresses;

    ALCapabilities(org.lwjgl.system.FunctionProvider r6, java.util.Set<java.lang.String> r7, java.util.function.IntFunction<org.lwjgl.PointerBuffer> r8) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r8
            r1 = 133(0x85, float:1.86E-43)
            java.lang.Object r0 = r0.apply(r1)
            org.lwjgl.PointerBuffer r0 = (org.lwjgl.PointerBuffer) r0
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_AL10(r1, r2, r3)
            r0.OpenAL10 = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_AL11(r1, r2, r3)
            r0.OpenAL11 = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_ALAW"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_ALAW = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_BFORMAT"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_BFORMAT = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_DOUBLE"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_DOUBLE = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_EXT_EFX(r1, r2, r3)
            r0.ALC_EXT_EFX = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_EXPONENT_DISTANCE"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_EXPONENT_DISTANCE = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_FLOAT32"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_FLOAT32 = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_IMA4"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_IMA4 = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_LINEAR_DISTANCE"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_LINEAR_DISTANCE = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_MCFORMATS"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_MCFORMATS = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_MULAW"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_MULAW = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_MULAW_BFORMAT"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_MULAW_BFORMAT = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_MULAW_MCFORMATS"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_MULAW_MCFORMATS = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_OFFSET"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_OFFSET = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_source_distance_model"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_source_distance_model = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_SOURCE_RADIUS"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_SOURCE_RADIUS = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_EXT_STATIC_BUFFER(r1, r2, r3)
            r0.AL_EXT_STATIC_BUFFER = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_STEREO_ANGLES"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_STEREO_ANGLES = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_EXT_vorbis"
            boolean r1 = r1.contains(r2)
            r0.AL_EXT_vorbis = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_LOKI_IMA_ADPCM"
            boolean r1 = r1.contains(r2)
            r0.AL_LOKI_IMA_ADPCM = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_LOKI_quadriphonic"
            boolean r1 = r1.contains(r2)
            r0.AL_LOKI_quadriphonic = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_LOKI_WAVE_format"
            boolean r1 = r1.contains(r2)
            r0.AL_LOKI_WAVE_format = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_bformat_ex"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_bformat_ex = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_block_alignment"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_block_alignment = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_buffer_length_query"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_buffer_length_query = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_SOFT_buffer_samples(r1, r2, r3)
            r0.AL_SOFT_buffer_samples = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_SOFT_buffer_sub_data(r1, r2, r3)
            r0.AL_SOFT_buffer_sub_data = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_SOFT_callback_buffer(r1, r2, r3)
            r0.AL_SOFT_callback_buffer = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_SOFT_deferred_updates(r1, r2, r3)
            r0.AL_SOFT_deferred_updates = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_direct_channels"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_direct_channels = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_direct_channels_remix"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_direct_channels_remix = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_effect_target"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_effect_target = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_SOFT_events(r1, r2, r3)
            r0.AL_SOFT_events = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_gain_clamp_ex"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_gain_clamp_ex = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_loop_points"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_loop_points = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_MSADPCM"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_MSADPCM = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_SOFT_source_latency(r1, r2, r3)
            r0.AL_SOFT_source_latency = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_source_length"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_source_length = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_SOFT_source_resampler(r1, r2, r3)
            r0.AL_SOFT_source_resampler = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_source_spatialize"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_source_spatialize = r1
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r7
            boolean r1 = check_SOFT_source_start_delay(r1, r2, r3)
            r0.AL_SOFT_source_start_delay = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_UHJ"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_UHJ = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFT_UHJ_ex"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFT_UHJ_ex = r1
            r0 = r5
            r1 = r7
            java.lang.String r2 = "AL_SOFTX_hold_on_disconnect"
            boolean r1 = r1.contains(r2)
            r0.AL_SOFTX_hold_on_disconnect = r1
            r0 = r5
            r1 = r9
            r2 = 0
            long r1 = r1.get(r2)
            r0.alGetError = r1
            r0 = r5
            r1 = r9
            r2 = 1
            long r1 = r1.get(r2)
            r0.alEnable = r1
            r0 = r5
            r1 = r9
            r2 = 2
            long r1 = r1.get(r2)
            r0.alDisable = r1
            r0 = r5
            r1 = r9
            r2 = 3
            long r1 = r1.get(r2)
            r0.alIsEnabled = r1
            r0 = r5
            r1 = r9
            r2 = 4
            long r1 = r1.get(r2)
            r0.alGetBoolean = r1
            r0 = r5
            r1 = r9
            r2 = 5
            long r1 = r1.get(r2)
            r0.alGetInteger = r1
            r0 = r5
            r1 = r9
            r2 = 6
            long r1 = r1.get(r2)
            r0.alGetFloat = r1
            r0 = r5
            r1 = r9
            r2 = 7
            long r1 = r1.get(r2)
            r0.alGetDouble = r1
            r0 = r5
            r1 = r9
            r2 = 8
            long r1 = r1.get(r2)
            r0.alGetBooleanv = r1
            r0 = r5
            r1 = r9
            r2 = 9
            long r1 = r1.get(r2)
            r0.alGetIntegerv = r1
            r0 = r5
            r1 = r9
            r2 = 10
            long r1 = r1.get(r2)
            r0.alGetFloatv = r1
            r0 = r5
            r1 = r9
            r2 = 11
            long r1 = r1.get(r2)
            r0.alGetDoublev = r1
            r0 = r5
            r1 = r9
            r2 = 12
            long r1 = r1.get(r2)
            r0.alGetString = r1
            r0 = r5
            r1 = r9
            r2 = 13
            long r1 = r1.get(r2)
            r0.alDistanceModel = r1
            r0 = r5
            r1 = r9
            r2 = 14
            long r1 = r1.get(r2)
            r0.alDopplerFactor = r1
            r0 = r5
            r1 = r9
            r2 = 15
            long r1 = r1.get(r2)
            r0.alDopplerVelocity = r1
            r0 = r5
            r1 = r9
            r2 = 16
            long r1 = r1.get(r2)
            r0.alListenerf = r1
            r0 = r5
            r1 = r9
            r2 = 17
            long r1 = r1.get(r2)
            r0.alListeneri = r1
            r0 = r5
            r1 = r9
            r2 = 18
            long r1 = r1.get(r2)
            r0.alListener3f = r1
            r0 = r5
            r1 = r9
            r2 = 19
            long r1 = r1.get(r2)
            r0.alListenerfv = r1
            r0 = r5
            r1 = r9
            r2 = 20
            long r1 = r1.get(r2)
            r0.alGetListenerf = r1
            r0 = r5
            r1 = r9
            r2 = 21
            long r1 = r1.get(r2)
            r0.alGetListeneri = r1
            r0 = r5
            r1 = r9
            r2 = 22
            long r1 = r1.get(r2)
            r0.alGetListener3f = r1
            r0 = r5
            r1 = r9
            r2 = 23
            long r1 = r1.get(r2)
            r0.alGetListenerfv = r1
            r0 = r5
            r1 = r9
            r2 = 24
            long r1 = r1.get(r2)
            r0.alGenSources = r1
            r0 = r5
            r1 = r9
            r2 = 25
            long r1 = r1.get(r2)
            r0.alDeleteSources = r1
            r0 = r5
            r1 = r9
            r2 = 26
            long r1 = r1.get(r2)
            r0.alIsSource = r1
            r0 = r5
            r1 = r9
            r2 = 27
            long r1 = r1.get(r2)
            r0.alSourcef = r1
            r0 = r5
            r1 = r9
            r2 = 28
            long r1 = r1.get(r2)
            r0.alSource3f = r1
            r0 = r5
            r1 = r9
            r2 = 29
            long r1 = r1.get(r2)
            r0.alSourcefv = r1
            r0 = r5
            r1 = r9
            r2 = 30
            long r1 = r1.get(r2)
            r0.alSourcei = r1
            r0 = r5
            r1 = r9
            r2 = 31
            long r1 = r1.get(r2)
            r0.alGetSourcef = r1
            r0 = r5
            r1 = r9
            r2 = 32
            long r1 = r1.get(r2)
            r0.alGetSource3f = r1
            r0 = r5
            r1 = r9
            r2 = 33
            long r1 = r1.get(r2)
            r0.alGetSourcefv = r1
            r0 = r5
            r1 = r9
            r2 = 34
            long r1 = r1.get(r2)
            r0.alGetSourcei = r1
            r0 = r5
            r1 = r9
            r2 = 35
            long r1 = r1.get(r2)
            r0.alGetSourceiv = r1
            r0 = r5
            r1 = r9
            r2 = 36
            long r1 = r1.get(r2)
            r0.alSourceQueueBuffers = r1
            r0 = r5
            r1 = r9
            r2 = 37
            long r1 = r1.get(r2)
            r0.alSourceUnqueueBuffers = r1
            r0 = r5
            r1 = r9
            r2 = 38
            long r1 = r1.get(r2)
            r0.alSourcePlay = r1
            r0 = r5
            r1 = r9
            r2 = 39
            long r1 = r1.get(r2)
            r0.alSourcePause = r1
            r0 = r5
            r1 = r9
            r2 = 40
            long r1 = r1.get(r2)
            r0.alSourceStop = r1
            r0 = r5
            r1 = r9
            r2 = 41
            long r1 = r1.get(r2)
            r0.alSourceRewind = r1
            r0 = r5
            r1 = r9
            r2 = 42
            long r1 = r1.get(r2)
            r0.alSourcePlayv = r1
            r0 = r5
            r1 = r9
            r2 = 43
            long r1 = r1.get(r2)
            r0.alSourcePausev = r1
            r0 = r5
            r1 = r9
            r2 = 44
            long r1 = r1.get(r2)
            r0.alSourceStopv = r1
            r0 = r5
            r1 = r9
            r2 = 45
            long r1 = r1.get(r2)
            r0.alSourceRewindv = r1
            r0 = r5
            r1 = r9
            r2 = 46
            long r1 = r1.get(r2)
            r0.alGenBuffers = r1
            r0 = r5
            r1 = r9
            r2 = 47
            long r1 = r1.get(r2)
            r0.alDeleteBuffers = r1
            r0 = r5
            r1 = r9
            r2 = 48
            long r1 = r1.get(r2)
            r0.alIsBuffer = r1
            r0 = r5
            r1 = r9
            r2 = 49
            long r1 = r1.get(r2)
            r0.alGetBufferf = r1
            r0 = r5
            r1 = r9
            r2 = 50
            long r1 = r1.get(r2)
            r0.alGetBufferi = r1
            r0 = r5
            r1 = r9
            r2 = 51
            long r1 = r1.get(r2)
            r0.alBufferData = r1
            r0 = r5
            r1 = r9
            r2 = 52
            long r1 = r1.get(r2)
            r0.alGetEnumValue = r1
            r0 = r5
            r1 = r9
            r2 = 53
            long r1 = r1.get(r2)
            r0.alGetProcAddress = r1
            r0 = r5
            r1 = r9
            r2 = 54
            long r1 = r1.get(r2)
            r0.alIsExtensionPresent = r1
            r0 = r5
            r1 = r9
            r2 = 55
            long r1 = r1.get(r2)
            r0.alListener3i = r1
            r0 = r5
            r1 = r9
            r2 = 56
            long r1 = r1.get(r2)
            r0.alGetListeneriv = r1
            r0 = r5
            r1 = r9
            r2 = 57
            long r1 = r1.get(r2)
            r0.alSource3i = r1
            r0 = r5
            r1 = r9
            r2 = 58
            long r1 = r1.get(r2)
            r0.alListeneriv = r1
            r0 = r5
            r1 = r9
            r2 = 59
            long r1 = r1.get(r2)
            r0.alSourceiv = r1
            r0 = r5
            r1 = r9
            r2 = 60
            long r1 = r1.get(r2)
            r0.alBufferf = r1
            r0 = r5
            r1 = r9
            r2 = 61
            long r1 = r1.get(r2)
            r0.alBuffer3f = r1
            r0 = r5
            r1 = r9
            r2 = 62
            long r1 = r1.get(r2)
            r0.alBufferfv = r1
            r0 = r5
            r1 = r9
            r2 = 63
            long r1 = r1.get(r2)
            r0.alBufferi = r1
            r0 = r5
            r1 = r9
            r2 = 64
            long r1 = r1.get(r2)
            r0.alBuffer3i = r1
            r0 = r5
            r1 = r9
            r2 = 65
            long r1 = r1.get(r2)
            r0.alBufferiv = r1
            r0 = r5
            r1 = r9
            r2 = 66
            long r1 = r1.get(r2)
            r0.alGetBufferiv = r1
            r0 = r5
            r1 = r9
            r2 = 67
            long r1 = r1.get(r2)
            r0.alGetBufferfv = r1
            r0 = r5
            r1 = r9
            r2 = 68
            long r1 = r1.get(r2)
            r0.alSpeedOfSound = r1
            r0 = r5
            r1 = r9
            r2 = 69
            long r1 = r1.get(r2)
            r0.alGenEffects = r1
            r0 = r5
            r1 = r9
            r2 = 70
            long r1 = r1.get(r2)
            r0.alDeleteEffects = r1
            r0 = r5
            r1 = r9
            r2 = 71
            long r1 = r1.get(r2)
            r0.alIsEffect = r1
            r0 = r5
            r1 = r9
            r2 = 72
            long r1 = r1.get(r2)
            r0.alEffecti = r1
            r0 = r5
            r1 = r9
            r2 = 73
            long r1 = r1.get(r2)
            r0.alEffectiv = r1
            r0 = r5
            r1 = r9
            r2 = 74
            long r1 = r1.get(r2)
            r0.alEffectf = r1
            r0 = r5
            r1 = r9
            r2 = 75
            long r1 = r1.get(r2)
            r0.alEffectfv = r1
            r0 = r5
            r1 = r9
            r2 = 76
            long r1 = r1.get(r2)
            r0.alGetEffecti = r1
            r0 = r5
            r1 = r9
            r2 = 77
            long r1 = r1.get(r2)
            r0.alGetEffectiv = r1
            r0 = r5
            r1 = r9
            r2 = 78
            long r1 = r1.get(r2)
            r0.alGetEffectf = r1
            r0 = r5
            r1 = r9
            r2 = 79
            long r1 = r1.get(r2)
            r0.alGetEffectfv = r1
            r0 = r5
            r1 = r9
            r2 = 80
            long r1 = r1.get(r2)
            r0.alGenFilters = r1
            r0 = r5
            r1 = r9
            r2 = 81
            long r1 = r1.get(r2)
            r0.alDeleteFilters = r1
            r0 = r5
            r1 = r9
            r2 = 82
            long r1 = r1.get(r2)
            r0.alIsFilter = r1
            r0 = r5
            r1 = r9
            r2 = 83
            long r1 = r1.get(r2)
            r0.alFilteri = r1
            r0 = r5
            r1 = r9
            r2 = 84
            long r1 = r1.get(r2)
            r0.alFilteriv = r1
            r0 = r5
            r1 = r9
            r2 = 85
            long r1 = r1.get(r2)
            r0.alFilterf = r1
            r0 = r5
            r1 = r9
            r2 = 86
            long r1 = r1.get(r2)
            r0.alFilterfv = r1
            r0 = r5
            r1 = r9
            r2 = 87
            long r1 = r1.get(r2)
            r0.alGetFilteri = r1
            r0 = r5
            r1 = r9
            r2 = 88
            long r1 = r1.get(r2)
            r0.alGetFilteriv = r1
            r0 = r5
            r1 = r9
            r2 = 89
            long r1 = r1.get(r2)
            r0.alGetFilterf = r1
            r0 = r5
            r1 = r9
            r2 = 90
            long r1 = r1.get(r2)
            r0.alGetFilterfv = r1
            r0 = r5
            r1 = r9
            r2 = 91
            long r1 = r1.get(r2)
            r0.alGenAuxiliaryEffectSlots = r1
            r0 = r5
            r1 = r9
            r2 = 92
            long r1 = r1.get(r2)
            r0.alDeleteAuxiliaryEffectSlots = r1
            r0 = r5
            r1 = r9
            r2 = 93
            long r1 = r1.get(r2)
            r0.alIsAuxiliaryEffectSlot = r1
            r0 = r5
            r1 = r9
            r2 = 94
            long r1 = r1.get(r2)
            r0.alAuxiliaryEffectSloti = r1
            r0 = r5
            r1 = r9
            r2 = 95
            long r1 = r1.get(r2)
            r0.alAuxiliaryEffectSlotiv = r1
            r0 = r5
            r1 = r9
            r2 = 96
            long r1 = r1.get(r2)
            r0.alAuxiliaryEffectSlotf = r1
            r0 = r5
            r1 = r9
            r2 = 97
            long r1 = r1.get(r2)
            r0.alAuxiliaryEffectSlotfv = r1
            r0 = r5
            r1 = r9
            r2 = 98
            long r1 = r1.get(r2)
            r0.alGetAuxiliaryEffectSloti = r1
            r0 = r5
            r1 = r9
            r2 = 99
            long r1 = r1.get(r2)
            r0.alGetAuxiliaryEffectSlotiv = r1
            r0 = r5
            r1 = r9
            r2 = 100
            long r1 = r1.get(r2)
            r0.alGetAuxiliaryEffectSlotf = r1
            r0 = r5
            r1 = r9
            r2 = 101(0x65, float:1.42E-43)
            long r1 = r1.get(r2)
            r0.alGetAuxiliaryEffectSlotfv = r1
            r0 = r5
            r1 = r9
            r2 = 102(0x66, float:1.43E-43)
            long r1 = r1.get(r2)
            r0.alBufferDataStatic = r1
            r0 = r5
            r1 = r9
            r2 = 103(0x67, float:1.44E-43)
            long r1 = r1.get(r2)
            r0.alBufferSamplesSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 104(0x68, float:1.46E-43)
            long r1 = r1.get(r2)
            r0.alBufferSubSamplesSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 105(0x69, float:1.47E-43)
            long r1 = r1.get(r2)
            r0.alGetBufferSamplesSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 106(0x6a, float:1.49E-43)
            long r1 = r1.get(r2)
            r0.alIsBufferFormatSupportedSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 107(0x6b, float:1.5E-43)
            long r1 = r1.get(r2)
            r0.alBufferSubDataSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 108(0x6c, float:1.51E-43)
            long r1 = r1.get(r2)
            r0.alBufferCallbackSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 109(0x6d, float:1.53E-43)
            long r1 = r1.get(r2)
            r0.alGetBufferPtrSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 110(0x6e, float:1.54E-43)
            long r1 = r1.get(r2)
            r0.alGetBuffer3PtrSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 111(0x6f, float:1.56E-43)
            long r1 = r1.get(r2)
            r0.alGetBufferPtrvSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 112(0x70, float:1.57E-43)
            long r1 = r1.get(r2)
            r0.alDeferUpdatesSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 113(0x71, float:1.58E-43)
            long r1 = r1.get(r2)
            r0.alProcessUpdatesSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 114(0x72, float:1.6E-43)
            long r1 = r1.get(r2)
            r0.alEventControlSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 115(0x73, float:1.61E-43)
            long r1 = r1.get(r2)
            r0.alEventCallbackSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 116(0x74, float:1.63E-43)
            long r1 = r1.get(r2)
            r0.alGetPointerSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 117(0x75, float:1.64E-43)
            long r1 = r1.get(r2)
            r0.alGetPointervSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 118(0x76, float:1.65E-43)
            long r1 = r1.get(r2)
            r0.alSourcedSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 119(0x77, float:1.67E-43)
            long r1 = r1.get(r2)
            r0.alSource3dSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 120(0x78, float:1.68E-43)
            long r1 = r1.get(r2)
            r0.alSourcedvSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 121(0x79, float:1.7E-43)
            long r1 = r1.get(r2)
            r0.alGetSourcedSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 122(0x7a, float:1.71E-43)
            long r1 = r1.get(r2)
            r0.alGetSource3dSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 123(0x7b, float:1.72E-43)
            long r1 = r1.get(r2)
            r0.alGetSourcedvSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 124(0x7c, float:1.74E-43)
            long r1 = r1.get(r2)
            r0.alSourcei64SOFT = r1
            r0 = r5
            r1 = r9
            r2 = 125(0x7d, float:1.75E-43)
            long r1 = r1.get(r2)
            r0.alSource3i64SOFT = r1
            r0 = r5
            r1 = r9
            r2 = 126(0x7e, float:1.77E-43)
            long r1 = r1.get(r2)
            r0.alSourcei64vSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 127(0x7f, float:1.78E-43)
            long r1 = r1.get(r2)
            r0.alGetSourcei64SOFT = r1
            r0 = r5
            r1 = r9
            r2 = 128(0x80, float:1.8E-43)
            long r1 = r1.get(r2)
            r0.alGetSource3i64SOFT = r1
            r0 = r5
            r1 = r9
            r2 = 129(0x81, float:1.81E-43)
            long r1 = r1.get(r2)
            r0.alGetSourcei64vSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 130(0x82, float:1.82E-43)
            long r1 = r1.get(r2)
            r0.alGetStringiSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 131(0x83, float:1.84E-43)
            long r1 = r1.get(r2)
            r0.alSourcePlayAtTimeSOFT = r1
            r0 = r5
            r1 = r9
            r2 = 132(0x84, float:1.85E-43)
            long r1 = r1.get(r2)
            r0.alSourcePlayAtTimevSOFT = r1
            r0 = r5
            r1 = r9
            org.lwjgl.PointerBuffer r1 = org.lwjgl.system.ThreadLocalUtil.setupAddressBuffer(r1)
            r0.addresses = r1
            return
    }

    public org.lwjgl.PointerBuffer getAddressBuffer() {
            r2 = this;
            r0 = r2
            org.lwjgl.PointerBuffer r0 = r0.addresses
            return r0
    }

    private static boolean check_AL10(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "OpenAL10"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r8
            r1 = r9
            r2 = 55
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 0
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 1
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 2
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 3
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 4
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 5
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 6
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 7
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 8
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 9
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 10
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 11
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 12
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 13
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 14
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 15
            r3[r4] = r5
            r3 = r2
            r4 = 16
            r5 = 16
            r3[r4] = r5
            r3 = r2
            r4 = 17
            r5 = 17
            r3[r4] = r5
            r3 = r2
            r4 = 18
            r5 = 18
            r3[r4] = r5
            r3 = r2
            r4 = 19
            r5 = 19
            r3[r4] = r5
            r3 = r2
            r4 = 20
            r5 = 20
            r3[r4] = r5
            r3 = r2
            r4 = 21
            r5 = 21
            r3[r4] = r5
            r3 = r2
            r4 = 22
            r5 = 22
            r3[r4] = r5
            r3 = r2
            r4 = 23
            r5 = 23
            r3[r4] = r5
            r3 = r2
            r4 = 24
            r5 = 24
            r3[r4] = r5
            r3 = r2
            r4 = 25
            r5 = 25
            r3[r4] = r5
            r3 = r2
            r4 = 26
            r5 = 26
            r3[r4] = r5
            r3 = r2
            r4 = 27
            r5 = 27
            r3[r4] = r5
            r3 = r2
            r4 = 28
            r5 = 28
            r3[r4] = r5
            r3 = r2
            r4 = 29
            r5 = 29
            r3[r4] = r5
            r3 = r2
            r4 = 30
            r5 = 30
            r3[r4] = r5
            r3 = r2
            r4 = 31
            r5 = 31
            r3[r4] = r5
            r3 = r2
            r4 = 32
            r5 = 32
            r3[r4] = r5
            r3 = r2
            r4 = 33
            r5 = 33
            r3[r4] = r5
            r3 = r2
            r4 = 34
            r5 = 34
            r3[r4] = r5
            r3 = r2
            r4 = 35
            r5 = 35
            r3[r4] = r5
            r3 = r2
            r4 = 36
            r5 = 36
            r3[r4] = r5
            r3 = r2
            r4 = 37
            r5 = 37
            r3[r4] = r5
            r3 = r2
            r4 = 38
            r5 = 38
            r3[r4] = r5
            r3 = r2
            r4 = 39
            r5 = 39
            r3[r4] = r5
            r3 = r2
            r4 = 40
            r5 = 40
            r3[r4] = r5
            r3 = r2
            r4 = 41
            r5 = 41
            r3[r4] = r5
            r3 = r2
            r4 = 42
            r5 = 42
            r3[r4] = r5
            r3 = r2
            r4 = 43
            r5 = 43
            r3[r4] = r5
            r3 = r2
            r4 = 44
            r5 = 44
            r3[r4] = r5
            r3 = r2
            r4 = 45
            r5 = 45
            r3[r4] = r5
            r3 = r2
            r4 = 46
            r5 = 46
            r3[r4] = r5
            r3 = r2
            r4 = 47
            r5 = 47
            r3[r4] = r5
            r3 = r2
            r4 = 48
            r5 = 48
            r3[r4] = r5
            r3 = r2
            r4 = 49
            r5 = 49
            r3[r4] = r5
            r3 = r2
            r4 = 50
            r5 = 50
            r3[r4] = r5
            r3 = r2
            r4 = 51
            r5 = 51
            r3[r4] = r5
            r3 = r2
            r4 = 52
            r5 = 52
            r3[r4] = r5
            r3 = r2
            r4 = 53
            r5 = 53
            r3[r4] = r5
            r3 = r2
            r4 = 54
            r5 = 54
            r3[r4] = r5
            r3 = 55
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alGetError"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alEnable"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "alDisable"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "alIsEnabled"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "alGetBoolean"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "alGetInteger"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "alGetFloat"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "alGetDouble"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "alGetBooleanv"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "alGetIntegerv"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "alGetFloatv"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "alGetDoublev"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "alGetString"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "alDistanceModel"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "alDopplerFactor"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "alDopplerVelocity"
            r4[r5] = r6
            r4 = r3
            r5 = 16
            java.lang.String r6 = "alListenerf"
            r4[r5] = r6
            r4 = r3
            r5 = 17
            java.lang.String r6 = "alListeneri"
            r4[r5] = r6
            r4 = r3
            r5 = 18
            java.lang.String r6 = "alListener3f"
            r4[r5] = r6
            r4 = r3
            r5 = 19
            java.lang.String r6 = "alListenerfv"
            r4[r5] = r6
            r4 = r3
            r5 = 20
            java.lang.String r6 = "alGetListenerf"
            r4[r5] = r6
            r4 = r3
            r5 = 21
            java.lang.String r6 = "alGetListeneri"
            r4[r5] = r6
            r4 = r3
            r5 = 22
            java.lang.String r6 = "alGetListener3f"
            r4[r5] = r6
            r4 = r3
            r5 = 23
            java.lang.String r6 = "alGetListenerfv"
            r4[r5] = r6
            r4 = r3
            r5 = 24
            java.lang.String r6 = "alGenSources"
            r4[r5] = r6
            r4 = r3
            r5 = 25
            java.lang.String r6 = "alDeleteSources"
            r4[r5] = r6
            r4 = r3
            r5 = 26
            java.lang.String r6 = "alIsSource"
            r4[r5] = r6
            r4 = r3
            r5 = 27
            java.lang.String r6 = "alSourcef"
            r4[r5] = r6
            r4 = r3
            r5 = 28
            java.lang.String r6 = "alSource3f"
            r4[r5] = r6
            r4 = r3
            r5 = 29
            java.lang.String r6 = "alSourcefv"
            r4[r5] = r6
            r4 = r3
            r5 = 30
            java.lang.String r6 = "alSourcei"
            r4[r5] = r6
            r4 = r3
            r5 = 31
            java.lang.String r6 = "alGetSourcef"
            r4[r5] = r6
            r4 = r3
            r5 = 32
            java.lang.String r6 = "alGetSource3f"
            r4[r5] = r6
            r4 = r3
            r5 = 33
            java.lang.String r6 = "alGetSourcefv"
            r4[r5] = r6
            r4 = r3
            r5 = 34
            java.lang.String r6 = "alGetSourcei"
            r4[r5] = r6
            r4 = r3
            r5 = 35
            java.lang.String r6 = "alGetSourceiv"
            r4[r5] = r6
            r4 = r3
            r5 = 36
            java.lang.String r6 = "alSourceQueueBuffers"
            r4[r5] = r6
            r4 = r3
            r5 = 37
            java.lang.String r6 = "alSourceUnqueueBuffers"
            r4[r5] = r6
            r4 = r3
            r5 = 38
            java.lang.String r6 = "alSourcePlay"
            r4[r5] = r6
            r4 = r3
            r5 = 39
            java.lang.String r6 = "alSourcePause"
            r4[r5] = r6
            r4 = r3
            r5 = 40
            java.lang.String r6 = "alSourceStop"
            r4[r5] = r6
            r4 = r3
            r5 = 41
            java.lang.String r6 = "alSourceRewind"
            r4[r5] = r6
            r4 = r3
            r5 = 42
            java.lang.String r6 = "alSourcePlayv"
            r4[r5] = r6
            r4 = r3
            r5 = 43
            java.lang.String r6 = "alSourcePausev"
            r4[r5] = r6
            r4 = r3
            r5 = 44
            java.lang.String r6 = "alSourceStopv"
            r4[r5] = r6
            r4 = r3
            r5 = 45
            java.lang.String r6 = "alSourceRewindv"
            r4[r5] = r6
            r4 = r3
            r5 = 46
            java.lang.String r6 = "alGenBuffers"
            r4[r5] = r6
            r4 = r3
            r5 = 47
            java.lang.String r6 = "alDeleteBuffers"
            r4[r5] = r6
            r4 = r3
            r5 = 48
            java.lang.String r6 = "alIsBuffer"
            r4[r5] = r6
            r4 = r3
            r5 = 49
            java.lang.String r6 = "alGetBufferf"
            r4[r5] = r6
            r4 = r3
            r5 = 50
            java.lang.String r6 = "alGetBufferi"
            r4[r5] = r6
            r4 = r3
            r5 = 51
            java.lang.String r6 = "alBufferData"
            r4[r5] = r6
            r4 = r3
            r5 = 52
            java.lang.String r6 = "alGetEnumValue"
            r4[r5] = r6
            r4 = r3
            r5 = 53
            java.lang.String r6 = "alGetProcAddress"
            r4[r5] = r6
            r4 = r3
            r5 = 54
            java.lang.String r6 = "alIsExtensionPresent"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L2cb
            java.lang.String r0 = "AL"
            java.lang.String r1 = "OpenAL10"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L2cf
        L2cb:
            r0 = 1
            goto L2d0
        L2cf:
            r0 = 0
        L2d0:
            return r0
    }

    private static boolean check_AL11(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "OpenAL11"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 14
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 55
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 56
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 57
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 58
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 59
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 60
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 61
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 62
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 63
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 64
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 65
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 66
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 67
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 68
            r3[r4] = r5
            r3 = 14
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alListener3i"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alGetListeneriv"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "alSource3i"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "alListeneriv"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "alSourceiv"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "alBufferf"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "alBuffer3f"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "alBufferfv"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "alBufferi"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "alBuffer3i"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "alBufferiv"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "alGetBufferiv"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "alGetBufferfv"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "alSpeedOfSound"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Ld5
            java.lang.String r0 = "AL"
            java.lang.String r1 = "OpenAL11"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Ld9
        Ld5:
            r0 = 1
            goto Lda
        Ld9:
            r0 = 0
        Lda:
            return r0
    }

    private static boolean check_EXT_EFX(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "ALC_EXT_EFX"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 33
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 69
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 70
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 71
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 72
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 73
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 74
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 75
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 76
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 77
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 78
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 79
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 80
            r3[r4] = r5
            r3 = r2
            r4 = 12
            r5 = 81
            r3[r4] = r5
            r3 = r2
            r4 = 13
            r5 = 82
            r3[r4] = r5
            r3 = r2
            r4 = 14
            r5 = 83
            r3[r4] = r5
            r3 = r2
            r4 = 15
            r5 = 84
            r3[r4] = r5
            r3 = r2
            r4 = 16
            r5 = 85
            r3[r4] = r5
            r3 = r2
            r4 = 17
            r5 = 86
            r3[r4] = r5
            r3 = r2
            r4 = 18
            r5 = 87
            r3[r4] = r5
            r3 = r2
            r4 = 19
            r5 = 88
            r3[r4] = r5
            r3 = r2
            r4 = 20
            r5 = 89
            r3[r4] = r5
            r3 = r2
            r4 = 21
            r5 = 90
            r3[r4] = r5
            r3 = r2
            r4 = 22
            r5 = 91
            r3[r4] = r5
            r3 = r2
            r4 = 23
            r5 = 92
            r3[r4] = r5
            r3 = r2
            r4 = 24
            r5 = 93
            r3[r4] = r5
            r3 = r2
            r4 = 25
            r5 = 94
            r3[r4] = r5
            r3 = r2
            r4 = 26
            r5 = 95
            r3[r4] = r5
            r3 = r2
            r4 = 27
            r5 = 96
            r3[r4] = r5
            r3 = r2
            r4 = 28
            r5 = 97
            r3[r4] = r5
            r3 = r2
            r4 = 29
            r5 = 98
            r3[r4] = r5
            r3 = r2
            r4 = 30
            r5 = 99
            r3[r4] = r5
            r3 = r2
            r4 = 31
            r5 = 100
            r3[r4] = r5
            r3 = r2
            r4 = 32
            r5 = 101(0x65, float:1.42E-43)
            r3[r4] = r5
            r3 = 33
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alGenEffects"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alDeleteEffects"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "alIsEffect"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "alEffecti"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "alEffectiv"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "alEffectf"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "alEffectfv"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "alGetEffecti"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "alGetEffectiv"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "alGetEffectf"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "alGetEffectfv"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "alGenFilters"
            r4[r5] = r6
            r4 = r3
            r5 = 12
            java.lang.String r6 = "alDeleteFilters"
            r4[r5] = r6
            r4 = r3
            r5 = 13
            java.lang.String r6 = "alIsFilter"
            r4[r5] = r6
            r4 = r3
            r5 = 14
            java.lang.String r6 = "alFilteri"
            r4[r5] = r6
            r4 = r3
            r5 = 15
            java.lang.String r6 = "alFilteriv"
            r4[r5] = r6
            r4 = r3
            r5 = 16
            java.lang.String r6 = "alFilterf"
            r4[r5] = r6
            r4 = r3
            r5 = 17
            java.lang.String r6 = "alFilterfv"
            r4[r5] = r6
            r4 = r3
            r5 = 18
            java.lang.String r6 = "alGetFilteri"
            r4[r5] = r6
            r4 = r3
            r5 = 19
            java.lang.String r6 = "alGetFilteriv"
            r4[r5] = r6
            r4 = r3
            r5 = 20
            java.lang.String r6 = "alGetFilterf"
            r4[r5] = r6
            r4 = r3
            r5 = 21
            java.lang.String r6 = "alGetFilterfv"
            r4[r5] = r6
            r4 = r3
            r5 = 22
            java.lang.String r6 = "alGenAuxiliaryEffectSlots"
            r4[r5] = r6
            r4 = r3
            r5 = 23
            java.lang.String r6 = "alDeleteAuxiliaryEffectSlots"
            r4[r5] = r6
            r4 = r3
            r5 = 24
            java.lang.String r6 = "alIsAuxiliaryEffectSlot"
            r4[r5] = r6
            r4 = r3
            r5 = 25
            java.lang.String r6 = "alAuxiliaryEffectSloti"
            r4[r5] = r6
            r4 = r3
            r5 = 26
            java.lang.String r6 = "alAuxiliaryEffectSlotiv"
            r4[r5] = r6
            r4 = r3
            r5 = 27
            java.lang.String r6 = "alAuxiliaryEffectSlotf"
            r4[r5] = r6
            r4 = r3
            r5 = 28
            java.lang.String r6 = "alAuxiliaryEffectSlotfv"
            r4[r5] = r6
            r4 = r3
            r5 = 29
            java.lang.String r6 = "alGetAuxiliaryEffectSloti"
            r4[r5] = r6
            r4 = r3
            r5 = 30
            java.lang.String r6 = "alGetAuxiliaryEffectSlotiv"
            r4[r5] = r6
            r4 = r3
            r5 = 31
            java.lang.String r6 = "alGetAuxiliaryEffectSlotf"
            r4[r5] = r6
            r4 = r3
            r5 = 32
            java.lang.String r6 = "alGetAuxiliaryEffectSlotfv"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L1cc
            java.lang.String r0 = "AL"
            java.lang.String r1 = "ALC_EXT_EFX"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L1d0
        L1cc:
            r0 = 1
            goto L1d1
        L1d0:
            r0 = 0
        L1d1:
            return r0
    }

    private static boolean check_EXT_STATIC_BUFFER(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_EXT_STATIC_BUFFER"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 102(0x66, float:1.43E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alBufferDataStatic"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L34
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_EXT_STATIC_BUFFER"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L38
        L34:
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            return r0
    }

    private static boolean check_SOFT_buffer_samples(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_SOFT_buffer_samples"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 103(0x67, float:1.44E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 104(0x68, float:1.46E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 105(0x69, float:1.47E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 106(0x6a, float:1.49E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alBufferSamplesSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alBufferSubSamplesSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "alGetBufferSamplesSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "alIsBufferFormatSupportedSOFT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L55
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_SOFT_buffer_samples"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L59
        L55:
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            return r0
    }

    private static boolean check_SOFT_buffer_sub_data(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_SOFT_buffer_sub_data"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 107(0x6b, float:1.5E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alBufferSubDataSOFT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L34
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_SOFT_buffer_sub_data"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L38
        L34:
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            return r0
    }

    private static boolean check_SOFT_callback_buffer(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_SOFT_callback_buffer"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 108(0x6c, float:1.51E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 109(0x6d, float:1.53E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 110(0x6e, float:1.54E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 111(0x6f, float:1.56E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alBufferCallbackSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alGetBufferPtrSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "alGetBuffer3PtrSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "alGetBufferPtrvSOFT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L55
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_SOFT_callback_buffer"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L59
        L55:
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            return r0
    }

    private static boolean check_SOFT_deferred_updates(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_SOFT_deferred_updates"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 112(0x70, float:1.57E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 113(0x71, float:1.58E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alDeferUpdatesSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alProcessUpdatesSOFT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L3f
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_SOFT_deferred_updates"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L43
        L3f:
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
    }

    private static boolean check_SOFT_events(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_SOFT_events"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 4
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 114(0x72, float:1.6E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 115(0x73, float:1.61E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 116(0x74, float:1.63E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 117(0x75, float:1.64E-43)
            r3[r4] = r5
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alEventControlSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alEventCallbackSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "alGetPointerSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "alGetPointervSOFT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L55
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_SOFT_events"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L59
        L55:
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            return r0
    }

    private static boolean check_SOFT_source_latency(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_SOFT_source_latency"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 12
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 118(0x76, float:1.65E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 119(0x77, float:1.67E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = 120(0x78, float:1.68E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = 121(0x79, float:1.7E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = 122(0x7a, float:1.71E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 5
            r5 = 123(0x7b, float:1.72E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 6
            r5 = 124(0x7c, float:1.74E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 7
            r5 = 125(0x7d, float:1.75E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 8
            r5 = 126(0x7e, float:1.77E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 9
            r5 = 127(0x7f, float:1.78E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 10
            r5 = 128(0x80, float:1.8E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 11
            r5 = 129(0x81, float:1.81E-43)
            r3[r4] = r5
            r3 = 12
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alSourcedSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alSource3dSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "alSourcedvSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 3
            java.lang.String r6 = "alGetSourcedSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 4
            java.lang.String r6 = "alGetSource3dSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 5
            java.lang.String r6 = "alGetSourcedvSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 6
            java.lang.String r6 = "alSourcei64SOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 7
            java.lang.String r6 = "alSource3i64SOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 8
            java.lang.String r6 = "alSourcei64vSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 9
            java.lang.String r6 = "alGetSourcei64SOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 10
            java.lang.String r6 = "alGetSource3i64SOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 11
            java.lang.String r6 = "alGetSourcei64vSOFT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto Lbd
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_SOFT_source_latency"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto Lc1
        Lbd:
            r0 = 1
            goto Lc2
        Lc1:
            r0 = 0
        Lc2:
            return r0
    }

    private static boolean check_SOFT_source_resampler(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_SOFT_source_resampler"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 130(0x82, float:1.82E-43)
            r3[r4] = r5
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alGetStringiSOFT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L35
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_SOFT_source_resampler"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L39
        L35:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    private static boolean check_SOFT_source_start_delay(org.lwjgl.system.FunctionProvider r8, org.lwjgl.PointerBuffer r9, java.util.Set<java.lang.String> r10) {
            r0 = r10
            java.lang.String r1 = "AL_SOFT_source_start_delay"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = r9
            r2 = 2
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            r5 = 131(0x83, float:1.84E-43)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = 132(0x84, float:1.85E-43)
            r3[r4] = r5
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "alSourcePlayAtTimeSOFT"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "alSourcePlayAtTimevSOFT"
            r4[r5] = r6
            boolean r0 = org.lwjgl.system.Checks.checkFunctions(r0, r1, r2, r3)
            if (r0 != 0) goto L41
            java.lang.String r0 = "AL"
            java.lang.String r1 = "AL_SOFT_source_start_delay"
            boolean r0 = org.lwjgl.system.Checks.reportMissing(r0, r1)
            if (r0 == 0) goto L45
        L41:
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            return r0
    }
}
