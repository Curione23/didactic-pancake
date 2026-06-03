package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
public class SDL {
    protected static android.content.Context mContext;

    public SDL() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = org.libsdl.app.SDL.mContext
            return r0
    }

    public static void initialize() {
            r0 = 0
            setContext(r0)
            org.libsdl.app.SDLActivity.initialize()
            org.libsdl.app.SDLAudioManager.initialize()
            org.libsdl.app.SDLControllerManager.initialize()
            return
    }

    public static void loadLibrary(java.lang.String r1) throws java.lang.UnsatisfiedLinkError, java.lang.SecurityException, java.lang.NullPointerException {
            android.content.Context r0 = org.libsdl.app.SDL.mContext
            loadLibrary(r1, r0)
            return
    }

    public static void loadLibrary(java.lang.String r9, android.content.Context r10) throws java.lang.UnsatisfiedLinkError, java.lang.SecurityException, java.lang.NullPointerException {
            if (r9 == 0) goto L5e
            java.lang.ClassLoader r0 = r10.getClassLoader()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "com.getkeepsafe.relinker.ReLinker"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.ClassLoader r1 = r10.getClassLoader()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "com.getkeepsafe.relinker.ReLinker$LoadListener"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.ClassLoader r2 = r10.getClassLoader()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "android.content.Context"
            java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.ClassLoader r3 = r10.getClassLoader()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "java.lang.String"
            java.lang.Class r3 = r3.loadClass(r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "force"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L5a
            r6 = 0
            java.lang.Object r0 = r0.invoke(r6, r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "loadLibrary"
            r8 = 4
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L5a
            r8[r5] = r2     // Catch: java.lang.Throwable -> L5a
            r2 = 1
            r8[r2] = r3     // Catch: java.lang.Throwable -> L5a
            r2 = 2
            r8[r2] = r3     // Catch: java.lang.Throwable -> L5a
            r2 = 3
            r8[r2] = r1     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Method r1 = r4.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r9, r6, r6}     // Catch: java.lang.Throwable -> L5a
            r1.invoke(r0, r10)     // Catch: java.lang.Throwable -> L5a
            goto L5d
        L5a:
            java.lang.System.loadLibrary(r9)
        L5d:
            return
        L5e:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "No library name provided."
            r9.<init>(r10)
            throw r9
    }

    public static void setContext(android.content.Context r0) {
            org.libsdl.app.SDLAudioManager.setContext(r0)
            org.libsdl.app.SDL.mContext = r0
            return
    }

    public static void setupJNI() {
            org.libsdl.app.SDLActivity.nativeSetupJNI()
            org.libsdl.app.SDLAudioManager.nativeSetupJNI()
            org.libsdl.app.SDLControllerManager.nativeSetupJNI()
            return
    }
}
