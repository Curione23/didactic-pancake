package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
public class SDLAudioManager {
    protected static final java.lang.String TAG = "SDLAudio";
    private static android.media.AudioDeviceCallback mAudioDeviceCallback;
    protected static android.content.Context mContext;


    public SDLAudioManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native void addAudioDevice(boolean r0, java.lang.String r1, int r2);

    public static void audioSetThreadPriority(boolean r2, int r3) {
            java.lang.String r0 = "SDLAudioC"
            java.lang.String r1 = "SDLAudioP"
            if (r2 == 0) goto L1b
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L35
            r1.<init>(r0)     // Catch: java.lang.Exception -> L35
            java.lang.StringBuilder r3 = r1.append(r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L35
            r2.setName(r3)     // Catch: java.lang.Exception -> L35
            goto L2f
        L1b:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L35
            r0.<init>(r1)     // Catch: java.lang.Exception -> L35
            java.lang.StringBuilder r3 = r0.append(r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L35
            r2.setName(r3)     // Catch: java.lang.Exception -> L35
        L2f:
            r2 = -16
            android.os.Process.setThreadPriority(r2)     // Catch: java.lang.Exception -> L35
            goto L4e
        L35:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "modify thread properties failed "
            r3.<init>(r0)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "SDLAudio"
            android.util.Log.v(r3, r2)
        L4e:
            return
    }

    private static android.media.AudioDeviceInfo getInputAudioDeviceInfo(int r5) {
            android.content.Context r0 = org.libsdl.app.SDLAudioManager.mContext
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 1
            android.media.AudioDeviceInfo[] r0 = r0.getDevices(r1)
            int r1 = r0.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            int r4 = r3.getId()
            if (r4 != r5) goto L1c
            return r3
        L1c:
            int r2 = r2 + 1
            goto L11
        L1f:
            r5 = 0
            return r5
    }

    private static android.media.AudioDeviceInfo getPlaybackAudioDeviceInfo(int r5) {
            android.content.Context r0 = org.libsdl.app.SDLAudioManager.mContext
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 2
            android.media.AudioDeviceInfo[] r0 = r0.getDevices(r1)
            int r1 = r0.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            int r4 = r3.getId()
            if (r4 != r5) goto L1c
            return r3
        L1c:
            int r2 = r2 + 1
            goto L11
        L1f:
            r5 = 0
            return r5
    }

    public static void initialize() {
            r0 = 0
            org.libsdl.app.SDLAudioManager.mAudioDeviceCallback = r0
            org.libsdl.app.SDLAudioManager$1 r0 = new org.libsdl.app.SDLAudioManager$1
            r0.<init>()
            org.libsdl.app.SDLAudioManager.mAudioDeviceCallback = r0
            return
    }

    public static native int nativeSetupJNI();

    public static void registerAudioDeviceCallback() {
            android.content.Context r0 = org.libsdl.app.SDLAudioManager.mContext
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 2
            android.media.AudioDeviceInfo[] r1 = r0.getDevices(r1)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto L35
            r5 = r1[r4]
            int r6 = r5.getType()
            r7 = 18
            if (r6 != r7) goto L1f
            goto L32
        L1f:
            boolean r6 = r5.isSink()
            java.lang.CharSequence r7 = r5.getProductName()
            java.lang.String r7 = r7.toString()
            int r5 = r5.getId()
            addAudioDevice(r6, r7, r5)
        L32:
            int r4 = r4 + 1
            goto L12
        L35:
            r1 = 1
            android.media.AudioDeviceInfo[] r1 = r0.getDevices(r1)
            int r2 = r1.length
        L3b:
            if (r3 >= r2) goto L55
            r4 = r1[r3]
            boolean r5 = r4.isSink()
            java.lang.CharSequence r6 = r4.getProductName()
            java.lang.String r6 = r6.toString()
            int r4 = r4.getId()
            addAudioDevice(r5, r6, r4)
            int r3 = r3 + 1
            goto L3b
        L55:
            android.media.AudioDeviceCallback r1 = org.libsdl.app.SDLAudioManager.mAudioDeviceCallback
            r2 = 0
            r0.registerAudioDeviceCallback(r1, r2)
            return
    }

    public static void release(android.content.Context r0) {
            return
    }

    public static native void removeAudioDevice(boolean r0, int r1);

    public static void setContext(android.content.Context r0) {
            org.libsdl.app.SDLAudioManager.mContext = r0
            return
    }

    public static void unregisterAudioDeviceCallback() {
            android.content.Context r0 = org.libsdl.app.SDLAudioManager.mContext
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            android.media.AudioDeviceCallback r1 = org.libsdl.app.SDLAudioManager.mAudioDeviceCallback
            r0.unregisterAudioDeviceCallback(r1)
            return
    }
}
