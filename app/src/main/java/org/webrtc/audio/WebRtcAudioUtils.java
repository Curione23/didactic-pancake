package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/WebRtcAudioUtils.class */
final class WebRtcAudioUtils {
    private static final java.lang.String TAG = "WebRtcAudioUtilsExternal";

    WebRtcAudioUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String getThreadInfo() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            java.lang.String r0 = "@[name=" + r0 + ", id=" + r1 + "]"
            return r0
    }

    public static boolean runningOnEmulator() {
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "goldfish"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "generic_"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    static void logDeviceInfo(java.lang.String r11) {
            r0 = r11
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r4 = android.os.Build.DEVICE
            java.lang.String r5 = android.os.Build.ID
            java.lang.String r6 = android.os.Build.HARDWARE
            java.lang.String r7 = android.os.Build.MANUFACTURER
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r9 = android.os.Build.PRODUCT
            java.lang.String r1 = "Android SDK: " + r1 + ", Release: " + r2 + ", Brand: " + r3 + ", Device: " + r4 + ", Id: " + r5 + ", Hardware: " + r6 + ", Manufacturer: " + r7 + ", Model: " + r8 + ", Product: " + r9
            org.webrtc.Logging.d(r0, r1)
            return
    }

    static void logAudioState(java.lang.String r4, android.content.Context r5, android.media.AudioManager r6) {
            r0 = r4
            logDeviceInfo(r0)
            r0 = r4
            r1 = r5
            r2 = r6
            logAudioStateBasic(r0, r1, r2)
            r0 = r4
            r1 = r6
            logAudioStateVolume(r0, r1)
            r0 = r4
            r1 = r6
            logAudioDeviceInfo(r0, r1)
            return
    }

    static java.lang.String deviceTypeToString(int r2) {
            r0 = r2
            switch(r0) {
                case 0: goto L6c;
                case 1: goto L6f;
                case 2: goto L72;
                case 3: goto L75;
                case 4: goto L78;
                case 5: goto L7b;
                case 6: goto L7e;
                case 7: goto L81;
                case 8: goto L84;
                case 9: goto L87;
                case 10: goto L8a;
                case 11: goto L8d;
                case 12: goto L90;
                case 13: goto L93;
                case 14: goto L96;
                case 15: goto L99;
                case 16: goto L9c;
                case 17: goto L9f;
                case 18: goto La2;
                case 19: goto La5;
                case 20: goto La8;
                case 21: goto Lab;
                case 22: goto Lae;
                default: goto Lb1;
            }
        L6c:
            java.lang.String r0 = "TYPE_UNKNOWN"
            return r0
        L6f:
            java.lang.String r0 = "TYPE_BUILTIN_EARPIECE"
            return r0
        L72:
            java.lang.String r0 = "TYPE_BUILTIN_SPEAKER"
            return r0
        L75:
            java.lang.String r0 = "TYPE_WIRED_HEADSET"
            return r0
        L78:
            java.lang.String r0 = "TYPE_WIRED_HEADPHONES"
            return r0
        L7b:
            java.lang.String r0 = "TYPE_LINE_ANALOG"
            return r0
        L7e:
            java.lang.String r0 = "TYPE_LINE_DIGITAL"
            return r0
        L81:
            java.lang.String r0 = "TYPE_BLUETOOTH_SCO"
            return r0
        L84:
            java.lang.String r0 = "TYPE_BLUETOOTH_A2DP"
            return r0
        L87:
            java.lang.String r0 = "TYPE_HDMI"
            return r0
        L8a:
            java.lang.String r0 = "TYPE_HDMI_ARC"
            return r0
        L8d:
            java.lang.String r0 = "TYPE_USB_DEVICE"
            return r0
        L90:
            java.lang.String r0 = "TYPE_USB_ACCESSORY"
            return r0
        L93:
            java.lang.String r0 = "TYPE_DOCK"
            return r0
        L96:
            java.lang.String r0 = "TYPE_FM"
            return r0
        L99:
            java.lang.String r0 = "TYPE_BUILTIN_MIC"
            return r0
        L9c:
            java.lang.String r0 = "TYPE_FM_TUNER"
            return r0
        L9f:
            java.lang.String r0 = "TYPE_TV_TUNER"
            return r0
        La2:
            java.lang.String r0 = "TYPE_TELEPHONY"
            return r0
        La5:
            java.lang.String r0 = "TYPE_AUX_LINE"
            return r0
        La8:
            java.lang.String r0 = "TYPE_IP"
            return r0
        Lab:
            java.lang.String r0 = "TYPE_BUS"
            return r0
        Lae:
            java.lang.String r0 = "TYPE_USB_HEADSET"
            return r0
        Lb1:
            java.lang.String r0 = "TYPE_UNKNOWN"
            return r0
    }

    @android.annotation.TargetApi(24)
    public static java.lang.String audioSourceToString(int r2) {
            r0 = 10
            r3 = r0
            r0 = r2
            switch(r0) {
                case 0: goto L40;
                case 1: goto L43;
                case 2: goto L46;
                case 3: goto L49;
                case 4: goto L4c;
                case 5: goto L4f;
                case 6: goto L52;
                case 7: goto L55;
                case 8: goto L5e;
                case 9: goto L58;
                case 10: goto L5b;
                default: goto L5e;
            }
        L40:
            java.lang.String r0 = "DEFAULT"
            return r0
        L43:
            java.lang.String r0 = "MIC"
            return r0
        L46:
            java.lang.String r0 = "VOICE_UPLINK"
            return r0
        L49:
            java.lang.String r0 = "VOICE_DOWNLINK"
            return r0
        L4c:
            java.lang.String r0 = "VOICE_CALL"
            return r0
        L4f:
            java.lang.String r0 = "CAMCORDER"
            return r0
        L52:
            java.lang.String r0 = "VOICE_RECOGNITION"
            return r0
        L55:
            java.lang.String r0 = "VOICE_COMMUNICATION"
            return r0
        L58:
            java.lang.String r0 = "UNPROCESSED"
            return r0
        L5b:
            java.lang.String r0 = "VOICE_PERFORMANCE"
            return r0
        L5e:
            java.lang.String r0 = "INVALID"
            return r0
    }

    public static java.lang.String channelMaskToString(int r2) {
            r0 = r2
            switch(r0) {
                case 12: goto L1c;
                case 16: goto L1f;
                default: goto L22;
            }
        L1c:
            java.lang.String r0 = "IN_STEREO"
            return r0
        L1f:
            java.lang.String r0 = "IN_MONO"
            return r0
        L22:
            java.lang.String r0 = "INVALID"
            return r0
    }

    @android.annotation.TargetApi(24)
    public static java.lang.String audioEncodingToString(int r2) {
            r0 = r2
            switch(r0) {
                case 0: goto L38;
                case 1: goto L53;
                case 2: goto L3b;
                case 3: goto L3e;
                case 4: goto L41;
                case 5: goto L44;
                case 6: goto L47;
                case 7: goto L4a;
                case 8: goto L4d;
                case 9: goto L50;
                default: goto L53;
            }
        L38:
            java.lang.String r0 = "INVALID"
            return r0
        L3b:
            java.lang.String r0 = "PCM_16BIT"
            return r0
        L3e:
            java.lang.String r0 = "PCM_8BIT"
            return r0
        L41:
            java.lang.String r0 = "PCM_FLOAT"
            return r0
        L44:
            java.lang.String r0 = "AC3"
            return r0
        L47:
            java.lang.String r0 = "AC3"
            return r0
        L4a:
            java.lang.String r0 = "DTS"
            return r0
        L4d:
            java.lang.String r0 = "DTS_HD"
            return r0
        L50:
            java.lang.String r0 = "MP3"
            return r0
        L53:
            r0 = r2
            java.lang.String r0 = "Invalid encoding: " + r0
            return r0
    }

    private static void logAudioStateBasic(java.lang.String r8, android.content.Context r9, android.media.AudioManager r10) {
            r0 = r8
            r1 = r10
            int r1 = r1.getMode()
            java.lang.String r1 = modeToString(r1)
            r2 = r9
            boolean r2 = hasMicrophone(r2)
            r3 = r10
            boolean r3 = r3.isMicrophoneMute()
            r4 = r10
            boolean r4 = r4.isMusicActive()
            r5 = r10
            boolean r5 = r5.isSpeakerphoneOn()
            r6 = r10
            boolean r6 = r6.isBluetoothScoOn()
            java.lang.String r1 = "Audio State: audio mode: " + r1 + ", has mic: " + r2 + ", mic muted: " + r3 + ", music active: " + r4 + ", speakerphone: " + r5 + ", BT SCO: " + r6
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private static void logAudioStateVolume(java.lang.String r5, android.media.AudioManager r6) {
            r0 = 6
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 5
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            r1[r2] = r3
            r7 = r0
            r0 = r5
            java.lang.String r1 = "Audio State: "
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            boolean r0 = r0.isVolumeFixed()
            r8 = r0
            r0 = r5
            r1 = r8
            java.lang.String r1 = "  fixed volume=" + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r8
            if (r0 != 0) goto La2
            r0 = r7
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L41:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto La2
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r13
            r1 = r12
            java.lang.String r1 = streamTypeToString(r1)
            java.lang.String r1 = "  " + r1 + ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            java.lang.String r1 = "volume="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r12
            int r1 = r1.getStreamVolume(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            java.lang.String r1 = ", max="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r12
            int r1 = r1.getStreamMaxVolume(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r6
            r2 = r12
            r3 = r13
            logIsStreamMute(r0, r1, r2, r3)
            r0 = r5
            r1 = r13
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.d(r0, r1)
            int r11 = r11 + 1
            goto L41
        La2:
            return
    }

    private static void logIsStreamMute(java.lang.String r4, android.media.AudioManager r5, int r6, java.lang.StringBuilder r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L18
            r0 = r7
            java.lang.String r1 = ", muted="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            r2 = r6
            boolean r1 = r1.isStreamMute(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
        L18:
            return
    }

    private static void logAudioDeviceInfo(java.lang.String r3, android.media.AudioManager r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L9
            return
        L9:
            r0 = r4
            r1 = 3
            android.media.AudioDeviceInfo[] r0 = r0.getDevices(r1)
            r5 = r0
            r0 = r5
            int r0 = r0.length
            if (r0 != 0) goto L15
            return
        L15:
            r0 = r3
            java.lang.String r1 = "Audio Devices: "
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L25:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto Lf8
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "  "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getType()
            java.lang.String r1 = deviceTypeToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r9
            boolean r1 = r1.isSource()
            if (r1 == 0) goto L5f
            java.lang.String r1 = "(in): "
            goto L62
        L5f:
            java.lang.String r1 = "(out): "
        L62:
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            int[] r0 = r0.getChannelCounts()
            int r0 = r0.length
            if (r0 <= 0) goto L8c
            r0 = r10
            java.lang.String r1 = "channels="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int[] r1 = r1.getChannelCounts()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L8c:
            r0 = r9
            int[] r0 = r0.getEncodings()
            int r0 = r0.length
            if (r0 <= 0) goto Lb2
            r0 = r10
            java.lang.String r1 = "encodings="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int[] r1 = r1.getEncodings()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb2:
            r0 = r9
            int[] r0 = r0.getSampleRates()
            int r0 = r0.length
            if (r0 <= 0) goto Ld8
            r0 = r10
            java.lang.String r1 = "sample rates="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int[] r1 = r1.getSampleRates()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        Ld8:
            r0 = r10
            java.lang.String r1 = "id="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getId()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = r10
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.d(r0, r1)
            int r8 = r8 + 1
            goto L25
        Lf8:
            return
    }

    static java.lang.String modeToString(int r2) {
            r0 = r2
            switch(r0) {
                case 0: goto L28;
                case 1: goto L2c;
                case 2: goto L20;
                case 3: goto L24;
                default: goto L30;
            }
        L20:
            java.lang.String r0 = "MODE_IN_CALL"
            return r0
        L24:
            java.lang.String r0 = "MODE_IN_COMMUNICATION"
            return r0
        L28:
            java.lang.String r0 = "MODE_NORMAL"
            return r0
        L2c:
            java.lang.String r0 = "MODE_RINGTONE"
            return r0
        L30:
            java.lang.String r0 = "MODE_INVALID"
            return r0
    }

    private static java.lang.String streamTypeToString(int r2) {
            r0 = r2
            switch(r0) {
                case 0: goto L28;
                case 1: goto L3c;
                case 2: goto L30;
                case 3: goto L2c;
                case 4: goto L34;
                case 5: goto L38;
                default: goto L40;
            }
        L28:
            java.lang.String r0 = "STREAM_VOICE_CALL"
            return r0
        L2c:
            java.lang.String r0 = "STREAM_MUSIC"
            return r0
        L30:
            java.lang.String r0 = "STREAM_RING"
            return r0
        L34:
            java.lang.String r0 = "STREAM_ALARM"
            return r0
        L38:
            java.lang.String r0 = "STREAM_NOTIFICATION"
            return r0
        L3c:
            java.lang.String r0 = "STREAM_SYSTEM"
            return r0
        L40:
            java.lang.String r0 = "STREAM_INVALID"
            return r0
    }

    private static boolean hasMicrophone(android.content.Context r3) {
            r0 = r3
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.microphone"
            boolean r0 = r0.hasSystemFeature(r1)
            return r0
    }
}
