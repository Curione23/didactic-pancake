package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleVoiceChatCompat {
    private static final java.lang.String TAG = "SimpleVoiceChatCompat";

    private SimpleVoiceChatCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean containsVoiceChatJar(java.io.File r6) {
            r0 = 0
            if (r6 == 0) goto L4d
            boolean r1 = r6.isDirectory()
            if (r1 != 0) goto La
            goto L4d
        La:
            java.io.File[] r6 = r6.listFiles()
            if (r6 != 0) goto L11
            return r0
        L11:
            int r1 = r6.length
            r2 = r0
        L13:
            if (r2 >= r1) goto L4d
            r3 = r6[r2]
            java.lang.String r4 = r3.getName()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L4a
            java.lang.String r3 = ".jar"
            boolean r3 = r4.endsWith(r3)
            if (r3 != 0) goto L30
            goto L4a
        L30:
            java.lang.String r3 = "voicechat-"
            boolean r3 = r4.startsWith(r3)
            if (r3 != 0) goto L48
            java.lang.String r3 = "simple-voice-chat"
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L48
            java.lang.String r3 = "simplevoicechat"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L4a
        L48:
            r6 = 1
            return r6
        L4a:
            int r2 = r2 + 1
            goto L13
        L4d:
            return r0
    }

    public static boolean ensureMicrophoneReadyBeforeLaunch(android.app.Activity r2, java.io.File r3) {
            boolean r3 = isInstalledForInstance(r3)
            r0 = 1
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r3 = ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.isGranted(r2)
            java.lang.String r1 = "SimpleVoiceChatCompat"
            if (r3 == 0) goto L16
            java.lang.String r2 = "Simple Voice Chat detected and microphone permission is granted"
            android.util.Log.i(r1, r2)
            return r0
        L16:
            java.lang.String r3 = "Simple Voice Chat detected but microphone permission is missing"
            android.util.Log.i(r1, r3)
            ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.showRequestDialog(r2)
            r2 = 0
            return r2
    }

    public static boolean isInstalledForInstance(java.io.File r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "mods"
            r1.<init>(r6, r2)
            boolean r1 = containsVoiceChatJar(r1)
            r3 = 1
            if (r1 == 0) goto L13
            return r3
        L13:
            java.io.File r1 = r6.getParentFile()
            if (r1 == 0) goto L25
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r2)
            boolean r1 = containsVoiceChatJar(r4)
            if (r1 == 0) goto L25
            return r3
        L25:
            r1 = r0
        L26:
            r4 = 5
            if (r1 >= r4) goto L4a
            if (r6 == 0) goto L4a
            java.lang.String r4 = ".minecraft"
            java.lang.String r5 = r6.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L43
            java.io.File r4 = new java.io.File
            r4.<init>(r6, r2)
            boolean r4 = containsVoiceChatJar(r4)
            if (r4 == 0) goto L43
            return r3
        L43:
            java.io.File r6 = r6.getParentFile()
            int r1 = r1 + 1
            goto L26
        L4a:
            return r0
    }

    public static boolean isMicrophoneReady(android.content.Context r0) {
            boolean r0 = ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.isGranted(r0)
            return r0
    }
}
