package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EFX10.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/EFX10.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EFX10.class */
public class EFX10 {
    public static final int AL_EFFECT_TYPE = 32769;
    public static final int AL_EFFECTSLOT_EFFECT = 1;
    public static final int AL_EFFECT_ECHO = 4;
    public static final float AL_ECHO_MIN_DAMPING = 0.0f;
    public static final int AL_ECHO_DAMPING = 3;
    public static final float AL_ECHO_MAX_DAMPING = 0.99f;
    public static final float AL_ECHO_MIN_DELAY = 0.0f;
    public static final int AL_ECHO_DELAY = 1;
    public static final float AL_ECHO_MAX_DELAY = 0.207f;
    public static final float AL_ECHO_MIN_FEEDBACK = 0.0f;
    public static final int AL_ECHO_FEEDBACK = 4;
    public static final float AL_ECHO_MAX_FEEDBACK = 1.0f;
    public static final float AL_ECHO_MIN_LRDELAY = 0.0f;
    public static final int AL_ECHO_LRDELAY = 2;
    public static final float AL_ECHO_MAX_LRDELAY = 0.404f;
    public static final float AL_ECHO_MIN_SPREAD = -1.0f;
    public static final int AL_ECHO_SPREAD = 5;
    public static final float AL_ECHO_MAX_SPREAD = 1.0f;
    public static final int AL_EFFECT_REVERB = 1;
    public static final int AL_RING_MODULATOR_SINUSOID = 0;
    public static final int AL_RING_MODULATOR_SAWTOOTH = 1;
    public static final int AL_RING_MODULATOR_SQUARE = 2;
    public static final int AL_EFFECT_RING_MODULATOR = 9;
    public static final float AL_RING_MODULATOR_MAX_FREQUENCY = 8000.0f;
    public static final int AL_RING_MODULATOR_FREQUENCY = 1;
    public static final float AL_RING_MODULATOR_MIN_FREQUENCY = 0.0f;
    public static final float AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF = 24000.0f;
    public static final int AL_RING_MODULATOR_HIGHPASS_CUTOFF = 2;
    public static final float AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF = 0.0f;
    public static final int AL_RING_MODULATOR_WAVEFORM = 3;
    public static final int AL_FILTER_TYPE = 32769;
    public static final int AL_FILTER_LOWPASS = 1;
    public static final int AL_LOWPASS_GAIN = 1;
    public static final int AL_LOWPASS_GAINHF = 2;
    public static final int AL_EFFECTSLOT_NULL = 0;
    public static final int AL_FILTER_NULL = 0;
    public static final int AL_AUXILIARY_SEND_FILTER = 131078;
    public static final int AL_DIRECT_FILTER = 131077;
    public static final int ALC_MAX_AUXILIARY_SENDS = 131075;
    public static final int ALC_EFX_MAJOR_VERSION = 131073;
    public static final int AL_REVERB_DECAY_TIME = 5;
    public static final int AL_FILTER_HIGHPASS = 2;
    public static final int AL_FILTER_BANDPASS = 3;
    public static final int AL_EFFECT_NULL = 0;
    public static final int AL_EFFECT_EAXREVERB = 32768;
    public static final int AL_EFFECT_CHORUS = 2;
    public static final int AL_EFFECT_DISTORTION = 3;
    public static final int AL_EFFECT_FLANGER = 5;
    public static final int AL_EFFECT_FREQUENCY_SHIFTER = 6;
    public static final int AL_EFFECT_VOCAL_MORPHER = 7;
    public static final int AL_EFFECT_PITCH_SHIFTER = 8;
    public static final int AL_EFFECT_AUTOWAH = 10;
    public static final int AL_EFFECT_COMPRESSOR = 11;
    public static final int AL_EFFECT_EQUALIZER = 12;

    public EFX10() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int alGenAuxiliaryEffectSlots() {
            int r0 = org.lwjgl.openal.EXTEfx.alGenAuxiliaryEffectSlots()
            return r0
    }

    public static int alGenFilters() {
            int r0 = org.lwjgl.openal.EXTEfx.alGenFilters()
            return r0
    }

    public static void alDeleteFilters(int r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alDeleteFilters(r0)
            return
    }

    public static void alFilteri(int r4, int r5, int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alFilteri(r0, r1, r2)
            return
    }

    public static void alFilterf(int r4, int r5, float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alFilterf(r0, r1, r2)
            return
    }

    public static float alGetFilterf(int r3, int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.openal.EXTEfx.alGetFilterf(r0, r1)
            return r0
    }

    public static int alGenEffects() {
            int r0 = org.lwjgl.openal.EXTEfx.alGenEffects()
            return r0
    }

    public static void alDeleteEffects(int r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alDeleteAuxiliaryEffectSlots(r0)
            return
    }

    public static void alDeleteAuxiliaryEffectSlots(int r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alDeleteAuxiliaryEffectSlots(r0)
            return
    }

    public static void alEffecti(int r4, int r5, int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alEffecti(r0, r1, r2)
            return
    }

    public static float alGetEffectf(int r3, int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.openal.EXTEfx.alGetEffectf(r0, r1)
            return r0
    }

    public static int alGetEffecti(int r3, int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.openal.EXTEfx.alGetEffecti(r0, r1)
            return r0
    }

    public static void alEffectf(int r4, int r5, float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alEffectf(r0, r1, r2)
            return
    }

    public static void alAuxiliaryEffectSloti(int r4, int r5, int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSloti(r0, r1, r2)
            return
    }

    public static void alGenAuxiliaryEffectSlots(java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alGenAuxiliaryEffectSlots(r0)
            return
    }

    public static void alGenEffects(java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alGenEffects(r0)
            return
    }

    public static void alDeleteEffects(java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alDeleteEffects(r0)
            return
    }

    public static void alDeleteAuxiliaryEffectSlots(java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alDeleteAuxiliaryEffectSlots(r0)
            return
    }

    public static void alGenFilters(java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alGenFilters(r0)
            return
    }

    public static void alDeleteFilters(java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.openal.EXTEfx.alDeleteFilters(r0)
            return
    }

    public static void alGetAuxiliaryEffectSlot(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alGetAuxiliaryEffectSlotfv(r0, r1, r2)
            return
    }

    public static void alGetAuxiliaryEffectSlot(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alGetAuxiliaryEffectSlotiv(r0, r1, r2)
            return
    }

    public static float alGetAuxiliaryEffectSlotf(int r3, int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.openal.EXTEfx.alGetAuxiliaryEffectSlotf(r0, r1)
            return r0
    }

    public static int alGetAuxiliaryEffectSloti(int r3, int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.openal.EXTEfx.alGetAuxiliaryEffectSloti(r0, r1)
            return r0
    }

    public static void alEffect(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alEffectfv(r0, r1, r2)
            return
    }

    public static void alEffect(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alEffectiv(r0, r1, r2)
            return
    }

    public static void alFilter(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alFilterfv(r0, r1, r2)
            return
    }

    public static void alFilter(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alFilteriv(r0, r1, r2)
            return
    }

    public static void alAuxiliaryEffectSlot(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSlotfv(r0, r1, r2)
            return
    }

    public static void alAuxiliaryEffectSlot(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSlotiv(r0, r1, r2)
            return
    }

    public static void alAuxiliaryEffectSlotf(int r4, int r5, float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSlotf(r0, r1, r2)
            return
    }

    public static void alGetEffect(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alGetEffectfv(r0, r1, r2)
            return
    }

    public static void alGetEffect(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alGetEffectiv(r0, r1, r2)
            return
    }

    public static void alGetFilter(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alGetFilterfv(r0, r1, r2)
            return
    }

    public static void alGetFilter(int r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.openal.EXTEfx.alGetFilteriv(r0, r1, r2)
            return
    }

    public static int alGetFilteri(int r3, int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.openal.EXTEfx.alGetFilteri(r0, r1)
            return r0
    }

    public static boolean alIsAuxiliaryEffectSlot(int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.openal.EXTEfx.alIsAuxiliaryEffectSlot(r0)
            return r0
    }

    public static boolean alIsEffect(int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.openal.EXTEfx.alIsEffect(r0)
            return r0
    }

    public static boolean alIsFilter(int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.openal.EXTEfx.alIsFilter(r0)
            return r0
    }
}
