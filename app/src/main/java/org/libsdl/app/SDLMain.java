package org.libsdl.app;

/* JADX INFO: compiled from: SDLActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLMain implements java.lang.Runnable {
    SDLMain() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            r0 = -4
            android.os.Process.setThreadPriority(r0)     // Catch: java.lang.Exception -> L5
            goto L1e
        L5:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "modify thread properties failed "
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SDL"
            android.util.Log.v(r1, r0)
        L1e:
            org.libsdl.app.SDLActivity.nativeInitMainThread()
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            r0.main()
            org.libsdl.app.SDLActivity.nativeCleanupMainThread()
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            if (r0 == 0) goto L40
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L40
            r0 = 0
            org.libsdl.app.SDLActivity.mSDLThread = r0
            r0 = 1
            org.libsdl.app.SDLActivity.mSDLMainFinished = r0
            org.libsdl.app.SDLActivity r0 = org.libsdl.app.SDLActivity.mSingleton
            r0.finish()
        L40:
            return
    }
}
