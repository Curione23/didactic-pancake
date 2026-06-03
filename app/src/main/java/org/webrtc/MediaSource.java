package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaSource.class */
public class MediaSource {
    private final org.webrtc.RefCountDelegate refCountDelegate;
    private long nativeSource;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaSource$State.class */
    public enum State extends java.lang.Enum<org.webrtc.MediaSource.State> {
        public static final org.webrtc.MediaSource.State INITIALIZING = null;
        public static final org.webrtc.MediaSource.State LIVE = null;
        public static final org.webrtc.MediaSource.State ENDED = null;
        public static final org.webrtc.MediaSource.State MUTED = null;
        private static final /* synthetic */ org.webrtc.MediaSource.State[] $VALUES = null;

        public static org.webrtc.MediaSource.State[] values() {
                org.webrtc.MediaSource$State[] r0 = org.webrtc.MediaSource.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.MediaSource$State[] r0 = (org.webrtc.MediaSource.State[]) r0
                return r0
        }

        public static org.webrtc.MediaSource.State valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.MediaSource$State> r0 = org.webrtc.MediaSource.State.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.MediaSource$State r0 = (org.webrtc.MediaSource.State) r0
                return r0
        }

        State(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @org.webrtc.CalledByNative("State")
        static org.webrtc.MediaSource.State fromNativeIndex(int r3) {
                org.webrtc.MediaSource$State[] r0 = values()
                r1 = r3
                r0 = r0[r1]
                return r0
        }

        private static /* synthetic */ org.webrtc.MediaSource.State[] $values() {
                r0 = 4
                org.webrtc.MediaSource$State[] r0 = new org.webrtc.MediaSource.State[r0]
                r1 = r0
                r2 = 0
                org.webrtc.MediaSource$State r3 = org.webrtc.MediaSource.State.INITIALIZING
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.MediaSource$State r3 = org.webrtc.MediaSource.State.LIVE
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.MediaSource$State r3 = org.webrtc.MediaSource.State.ENDED
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.MediaSource$State r3 = org.webrtc.MediaSource.State.MUTED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.MediaSource$State r0 = new org.webrtc.MediaSource$State
                r1 = r0
                java.lang.String r2 = "INITIALIZING"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.MediaSource.State.INITIALIZING = r0
                org.webrtc.MediaSource$State r0 = new org.webrtc.MediaSource$State
                r1 = r0
                java.lang.String r2 = "LIVE"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.MediaSource.State.LIVE = r0
                org.webrtc.MediaSource$State r0 = new org.webrtc.MediaSource$State
                r1 = r0
                java.lang.String r2 = "ENDED"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.MediaSource.State.ENDED = r0
                org.webrtc.MediaSource$State r0 = new org.webrtc.MediaSource$State
                r1 = r0
                java.lang.String r2 = "MUTED"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.MediaSource.State.MUTED = r0
                org.webrtc.MediaSource$State[] r0 = $values()
                org.webrtc.MediaSource.State.$VALUES = r0
                return
        }
    }

    public MediaSource(long r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
            r2 = r1
            r3 = r7
            void r3 = () -> { // java.lang.Runnable.run():void
                lambda$new$0(r3);
            }
            r2.<init>(r3)
            r0.refCountDelegate = r1
            r0 = r6
            r1 = r7
            r0.nativeSource = r1
            return
    }

    public org.webrtc.MediaSource.State state() {
            r3 = this;
            r0 = r3
            r0.checkMediaSourceExists()
            r0 = r3
            long r0 = r0.nativeSource
            org.webrtc.MediaSource$State r0 = nativeGetState(r0)
            return r0
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkMediaSourceExists()
            r0 = r4
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.release()
            r0 = r4
            r1 = 0
            r0.nativeSource = r1
            return
    }

    protected long getNativeMediaSource() {
            r3 = this;
            r0 = r3
            r0.checkMediaSourceExists()
            r0 = r3
            long r0 = r0.nativeSource
            return r0
    }

    void runWithReference(java.lang.Runnable r3) {
            r2 = this;
            r0 = r2
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            boolean r0 = r0.safeRetain()
            if (r0 == 0) goto L24
            r0 = r3
            r0.run()     // Catch: java.lang.Throwable -> L1a
            r0 = r2
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.release()
            goto L24
        L1a:
            r4 = move-exception
            r0 = r2
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.release()
            r0 = r4
            throw r0
        L24:
            return
    }

    private void checkMediaSourceExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeSource
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "MediaSource has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private static native org.webrtc.MediaSource.State nativeGetState(long r0);

    private static /* synthetic */ void lambda$new$0(long r3) {
            r0 = r3
            org.webrtc.JniCommon.nativeReleaseRef(r0)
            return
    }
}
