package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/WebRtcAudioEffects.class */
class WebRtcAudioEffects {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WebRtcAudioEffectsExternal";
    private static final java.util.UUID AOSP_ACOUSTIC_ECHO_CANCELER = null;
    private static final java.util.UUID AOSP_NOISE_SUPPRESSOR = null;

    @androidx.annotation.Nullable
    private static android.media.audiofx.AudioEffect.Descriptor[] cachedEffects;

    @androidx.annotation.Nullable
    private android.media.audiofx.AcousticEchoCanceler aec;

    @androidx.annotation.Nullable
    private android.media.audiofx.NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public static boolean isAcousticEchoCancelerSupported() {
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC
            java.util.UUID r1 = org.webrtc.audio.WebRtcAudioEffects.AOSP_ACOUSTIC_ECHO_CANCELER
            boolean r0 = isEffectTypeAvailable(r0, r1)
            return r0
    }

    public static boolean isNoiseSuppressorSupported() {
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_NS
            java.util.UUID r1 = org.webrtc.audio.WebRtcAudioEffects.AOSP_NOISE_SUPPRESSOR
            boolean r0 = isEffectTypeAvailable(r0, r1)
            return r0
    }

    public WebRtcAudioEffects() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.getThreadInfo()
            java.lang.String r1 = "ctor" + r1
            org.webrtc.Logging.d(r0, r1)
            return
    }

    public boolean setAEC(boolean r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            r1 = r4
            java.lang.String r1 = "setAEC(" + r1 + ")"
            org.webrtc.Logging.d(r0, r1)
            boolean r0 = isAcousticEchoCancelerSupported()
            if (r0 != 0) goto L1f
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Platform AEC is not supported"
            org.webrtc.Logging.w(r0, r1)
            r0 = r3
            r1 = 0
            r0.shouldEnableAec = r1
            r0 = 0
            return r0
        L1f:
            r0 = r3
            android.media.audiofx.AcousticEchoCanceler r0 = r0.aec
            if (r0 == 0) goto L37
            r0 = r4
            r1 = r3
            boolean r1 = r1.shouldEnableAec
            if (r0 == r1) goto L37
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Platform AEC state can't be modified while recording"
            org.webrtc.Logging.e(r0, r1)
            r0 = 0
            return r0
        L37:
            r0 = r3
            r1 = r4
            r0.shouldEnableAec = r1
            r0 = 1
            return r0
    }

    public boolean setNS(boolean r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            r1 = r4
            java.lang.String r1 = "setNS(" + r1 + ")"
            org.webrtc.Logging.d(r0, r1)
            boolean r0 = isNoiseSuppressorSupported()
            if (r0 != 0) goto L1f
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Platform NS is not supported"
            org.webrtc.Logging.w(r0, r1)
            r0 = r3
            r1 = 0
            r0.shouldEnableNs = r1
            r0 = 0
            return r0
        L1f:
            r0 = r3
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            if (r0 == 0) goto L37
            r0 = r4
            r1 = r3
            boolean r1 = r1.shouldEnableNs
            if (r0 == r1) goto L37
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Platform NS state can't be modified while recording"
            org.webrtc.Logging.e(r0, r1)
            r0 = 0
            return r0
        L37:
            r0 = r3
            r1 = r4
            r0.shouldEnableNs = r1
            r0 = 1
            return r0
    }

    public boolean toggleNS(boolean r4) {
            r3 = this;
            r0 = r3
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            if (r0 != 0) goto L10
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Attempting to enable or disable nonexistent NoiseSuppressor."
            org.webrtc.Logging.e(r0, r1)
            r0 = 0
            return r0
        L10:
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            r1 = r4
            java.lang.String r1 = "toggleNS(" + r1 + ")"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            r1 = r4
            int r0 = r0.setEnabled(r1)
            if (r0 != 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            r5 = r0
            r0 = r5
            return r0
    }

    public void enable(int r6) {
            r5 = this;
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            r1 = r6
            java.lang.String r1 = "enable(audioSession=" + r1 + ")"
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            android.media.audiofx.AcousticEchoCanceler r0 = r0.aec
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            assertTrue(r0)
            r0 = r5
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            assertTrue(r0)
            boolean r0 = isAcousticEchoCancelerSupported()
            if (r0 == 0) goto L9c
            r0 = r5
            r1 = r6
            android.media.audiofx.AcousticEchoCanceler r1 = android.media.audiofx.AcousticEchoCanceler.create(r1)
            r0.aec = r1
            r0 = r5
            android.media.audiofx.AcousticEchoCanceler r0 = r0.aec
            if (r0 == 0) goto L95
            r0 = r5
            android.media.audiofx.AcousticEchoCanceler r0 = r0.aec
            boolean r0 = r0.getEnabled()
            r7 = r0
            r0 = r5
            boolean r0 = r0.shouldEnableAec
            if (r0 == 0) goto L57
            boolean r0 = isAcousticEchoCancelerSupported()
            if (r0 == 0) goto L57
            r0 = 1
            goto L58
        L57:
            r0 = 0
        L58:
            r8 = r0
            r0 = r5
            android.media.audiofx.AcousticEchoCanceler r0 = r0.aec
            r1 = r8
            int r0 = r0.setEnabled(r1)
            if (r0 == 0) goto L6b
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Failed to set the AcousticEchoCanceler state"
            org.webrtc.Logging.e(r0, r1)
        L6b:
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            r1 = r7
            if (r1 == 0) goto L76
            java.lang.String r1 = "enabled"
            goto L78
        L76:
            java.lang.String r1 = "disabled"
        L78:
            r2 = r8
            r3 = r5
            android.media.audiofx.AcousticEchoCanceler r3 = r3.aec
            boolean r3 = r3.getEnabled()
            if (r3 == 0) goto L88
            java.lang.String r3 = "enabled"
            goto L8a
        L88:
            java.lang.String r3 = "disabled"
        L8a:
            java.lang.String r1 = "AcousticEchoCanceler: was " + r1 + ", enable: " + r2 + ", is now: " + r3
            org.webrtc.Logging.d(r0, r1)
            goto L9c
        L95:
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Failed to create the AcousticEchoCanceler instance"
            org.webrtc.Logging.e(r0, r1)
        L9c:
            boolean r0 = isNoiseSuppressorSupported()
            if (r0 == 0) goto L10f
            r0 = r5
            r1 = r6
            android.media.audiofx.NoiseSuppressor r1 = android.media.audiofx.NoiseSuppressor.create(r1)
            r0.ns = r1
            r0 = r5
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            if (r0 == 0) goto L108
            r0 = r5
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            boolean r0 = r0.getEnabled()
            r7 = r0
            r0 = r5
            boolean r0 = r0.shouldEnableNs
            if (r0 == 0) goto Lca
            boolean r0 = isNoiseSuppressorSupported()
            if (r0 == 0) goto Lca
            r0 = 1
            goto Lcb
        Lca:
            r0 = 0
        Lcb:
            r8 = r0
            r0 = r5
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            r1 = r8
            int r0 = r0.setEnabled(r1)
            if (r0 == 0) goto Lde
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Failed to set the NoiseSuppressor state"
            org.webrtc.Logging.e(r0, r1)
        Lde:
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            r1 = r7
            if (r1 == 0) goto Le9
            java.lang.String r1 = "enabled"
            goto Leb
        Le9:
            java.lang.String r1 = "disabled"
        Leb:
            r2 = r8
            r3 = r5
            android.media.audiofx.NoiseSuppressor r3 = r3.ns
            boolean r3 = r3.getEnabled()
            if (r3 == 0) goto Lfb
            java.lang.String r3 = "enabled"
            goto Lfd
        Lfb:
            java.lang.String r3 = "disabled"
        Lfd:
            java.lang.String r1 = "NoiseSuppressor: was " + r1 + ", enable: " + r2 + ", is now: " + r3
            org.webrtc.Logging.d(r0, r1)
            goto L10f
        L108:
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "Failed to create the NoiseSuppressor instance"
            org.webrtc.Logging.e(r0, r1)
        L10f:
            return
    }

    public void release() {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioEffectsExternal"
            java.lang.String r1 = "release"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            android.media.audiofx.AcousticEchoCanceler r0 = r0.aec
            if (r0 == 0) goto L1a
            r0 = r3
            android.media.audiofx.AcousticEchoCanceler r0 = r0.aec
            r0.release()
            r0 = r3
            r1 = 0
            r0.aec = r1
        L1a:
            r0 = r3
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            if (r0 == 0) goto L2d
            r0 = r3
            android.media.audiofx.NoiseSuppressor r0 = r0.ns
            r0.release()
            r0 = r3
            r1 = 0
            r0.ns = r1
        L2d:
            return
    }

    private boolean effectTypeIsVoIP(java.util.UUID r4) {
            r3 = this;
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10
            boolean r0 = isAcousticEchoCancelerSupported()
            if (r0 != 0) goto L20
        L10:
            java.util.UUID r0 = android.media.audiofx.AudioEffect.EFFECT_TYPE_NS
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            boolean r0 = isNoiseSuppressorSupported()
            if (r0 == 0) goto L24
        L20:
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    private static void assertTrue(boolean r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Expected condition to be true"
            r1.<init>(r2)
            throw r0
        Le:
            return
    }

    @androidx.annotation.Nullable
    private static android.media.audiofx.AudioEffect.Descriptor[] getAvailableEffects() {
            android.media.audiofx.AudioEffect$Descriptor[] r0 = org.webrtc.audio.WebRtcAudioEffects.cachedEffects
            if (r0 == 0) goto La
            android.media.audiofx.AudioEffect$Descriptor[] r0 = org.webrtc.audio.WebRtcAudioEffects.cachedEffects
            return r0
        La:
            android.media.audiofx.AudioEffect$Descriptor[] r0 = android.media.audiofx.AudioEffect.queryEffects()
            org.webrtc.audio.WebRtcAudioEffects.cachedEffects = r0
            android.media.audiofx.AudioEffect$Descriptor[] r0 = org.webrtc.audio.WebRtcAudioEffects.cachedEffects
            return r0
    }

    private static boolean isEffectTypeAvailable(java.util.UUID r3, java.util.UUID r4) {
            android.media.audiofx.AudioEffect$Descriptor[] r0 = getAvailableEffects()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L13:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L44
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            java.util.UUID r0 = r0.type
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            r0 = r9
            java.util.UUID r0 = r0.uuid
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            return r0
        L3e:
            int r8 = r8 + 1
            goto L13
        L44:
            r0 = 0
            return r0
    }

    static {
            java.lang.String r0 = "bb392ec0-8d4d-11e0-a896-0002a5d5c51b"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            org.webrtc.audio.WebRtcAudioEffects.AOSP_ACOUSTIC_ECHO_CANCELER = r0
            java.lang.String r0 = "c06c8400-8e06-11e0-9cb6-0002a5d5c51b"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            org.webrtc.audio.WebRtcAudioEffects.AOSP_NOISE_SUPPRESSOR = r0
            return
    }
}
