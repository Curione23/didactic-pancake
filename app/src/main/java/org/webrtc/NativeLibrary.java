package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NativeLibrary.class */
class NativeLibrary {
    private static java.lang.String TAG;
    private static java.lang.Object lock;
    private static boolean libraryLoaded;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NativeLibrary$DefaultLoader.class */
    static class DefaultLoader implements org.webrtc.NativeLibraryLoader {
        DefaultLoader() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = org.webrtc.NativeLibrary.TAG
                r1 = r4
                java.lang.String r1 = "Loading library: " + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r4
                java.lang.System.loadLibrary(r0)
                r0 = 1
                return r0
        }
    }

    NativeLibrary() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void initialize(org.webrtc.NativeLibraryLoader r3, java.lang.String r4) {
            java.lang.Object r0 = org.webrtc.NativeLibrary.lock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            boolean r0 = org.webrtc.NativeLibrary.libraryLoaded     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L17
            java.lang.String r0 = org.webrtc.NativeLibrary.TAG     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Native library has already been loaded."
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L32
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L17:
            java.lang.String r0 = org.webrtc.NativeLibrary.TAG     // Catch: java.lang.Throwable -> L32
            r1 = r4
            java.lang.String r1 = "Loading native library: " + r1     // Catch: java.lang.Throwable -> L32
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L32
            r0 = r3
            r1 = r4
            boolean r0 = r0.load(r1)     // Catch: java.lang.Throwable -> L32
            org.webrtc.NativeLibrary.libraryLoaded = r0     // Catch: java.lang.Throwable -> L32
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r0 = r6
            throw r0
        L37:
            return
    }

    static boolean isLoaded() {
            java.lang.Object r0 = org.webrtc.NativeLibrary.lock
            r1 = r0
            r3 = r1
            monitor-enter(r0)
            boolean r0 = org.webrtc.NativeLibrary.libraryLoaded     // Catch: java.lang.Throwable -> Lc
            r1 = r3
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            r4 = move-exception
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            r0 = r4
            throw r0
    }

    static {
            java.lang.String r0 = "NativeLibrary"
            org.webrtc.NativeLibrary.TAG = r0
            java.lang.Object r0 = new java.lang.Object
            r1 = r0
            r1.<init>()
            org.webrtc.NativeLibrary.lock = r0
            return
    }
}
