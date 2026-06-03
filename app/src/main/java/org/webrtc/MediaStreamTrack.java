package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaStreamTrack.class */
public class MediaStreamTrack {
    public static final java.lang.String AUDIO_TRACK_KIND = "audio";
    public static final java.lang.String VIDEO_TRACK_KIND = "video";
    private long nativeTrack;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaStreamTrack$MediaType.class */
    public enum MediaType extends java.lang.Enum<org.webrtc.MediaStreamTrack.MediaType> {
        public static final org.webrtc.MediaStreamTrack.MediaType MEDIA_TYPE_AUDIO = null;
        public static final org.webrtc.MediaStreamTrack.MediaType MEDIA_TYPE_VIDEO = null;
        private final int nativeIndex;
        private static final /* synthetic */ org.webrtc.MediaStreamTrack.MediaType[] $VALUES = null;

        public static org.webrtc.MediaStreamTrack.MediaType[] values() {
                org.webrtc.MediaStreamTrack$MediaType[] r0 = org.webrtc.MediaStreamTrack.MediaType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.MediaStreamTrack$MediaType[] r0 = (org.webrtc.MediaStreamTrack.MediaType[]) r0
                return r0
        }

        public static org.webrtc.MediaStreamTrack.MediaType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.MediaStreamTrack$MediaType> r0 = org.webrtc.MediaStreamTrack.MediaType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.MediaStreamTrack$MediaType r0 = (org.webrtc.MediaStreamTrack.MediaType) r0
                return r0
        }

        MediaType(java.lang.String r5, int r6, int r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.nativeIndex = r1
                return
        }

        @org.webrtc.CalledByNative("MediaType")
        int getNative() {
                r2 = this;
                r0 = r2
                int r0 = r0.nativeIndex
                return r0
        }

        @org.webrtc.CalledByNative("MediaType")
        static org.webrtc.MediaStreamTrack.MediaType fromNativeIndex(int r4) {
                org.webrtc.MediaStreamTrack$MediaType[] r0 = values()
                r5 = r0
                r0 = r5
                int r0 = r0.length
                r6 = r0
                r0 = 0
                r7 = r0
            L9:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L25
                r0 = r5
                r1 = r7
                r0 = r0[r1]
                r8 = r0
                r0 = r8
                int r0 = r0.getNative()
                r1 = r4
                if (r0 != r1) goto L1f
                r0 = r8
                return r0
            L1f:
                int r7 = r7 + 1
                goto L9
            L25:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                r2 = r4
                java.lang.String r2 = "Unknown native media type: " + r2
                r1.<init>(r2)
                throw r0
        }

        private static /* synthetic */ org.webrtc.MediaStreamTrack.MediaType[] $values() {
                r0 = 2
                org.webrtc.MediaStreamTrack$MediaType[] r0 = new org.webrtc.MediaStreamTrack.MediaType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.MediaStreamTrack$MediaType r3 = org.webrtc.MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.MediaStreamTrack$MediaType r3 = org.webrtc.MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.MediaStreamTrack$MediaType r0 = new org.webrtc.MediaStreamTrack$MediaType
                r1 = r0
                java.lang.String r2 = "MEDIA_TYPE_AUDIO"
                r3 = 0
                r4 = 0
                r1.<init>(r2, r3, r4)
                org.webrtc.MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO = r0
                org.webrtc.MediaStreamTrack$MediaType r0 = new org.webrtc.MediaStreamTrack$MediaType
                r1 = r0
                java.lang.String r2 = "MEDIA_TYPE_VIDEO"
                r3 = 1
                r4 = 1
                r1.<init>(r2, r3, r4)
                org.webrtc.MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO = r0
                org.webrtc.MediaStreamTrack$MediaType[] r0 = $values()
                org.webrtc.MediaStreamTrack.MediaType.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaStreamTrack$State.class */
    public enum State extends java.lang.Enum<org.webrtc.MediaStreamTrack.State> {
        public static final org.webrtc.MediaStreamTrack.State LIVE = null;
        public static final org.webrtc.MediaStreamTrack.State ENDED = null;
        private static final /* synthetic */ org.webrtc.MediaStreamTrack.State[] $VALUES = null;

        public static org.webrtc.MediaStreamTrack.State[] values() {
                org.webrtc.MediaStreamTrack$State[] r0 = org.webrtc.MediaStreamTrack.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.MediaStreamTrack$State[] r0 = (org.webrtc.MediaStreamTrack.State[]) r0
                return r0
        }

        public static org.webrtc.MediaStreamTrack.State valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.MediaStreamTrack$State> r0 = org.webrtc.MediaStreamTrack.State.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.MediaStreamTrack$State r0 = (org.webrtc.MediaStreamTrack.State) r0
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
        static org.webrtc.MediaStreamTrack.State fromNativeIndex(int r3) {
                org.webrtc.MediaStreamTrack$State[] r0 = values()
                r1 = r3
                r0 = r0[r1]
                return r0
        }

        private static /* synthetic */ org.webrtc.MediaStreamTrack.State[] $values() {
                r0 = 2
                org.webrtc.MediaStreamTrack$State[] r0 = new org.webrtc.MediaStreamTrack.State[r0]
                r1 = r0
                r2 = 0
                org.webrtc.MediaStreamTrack$State r3 = org.webrtc.MediaStreamTrack.State.LIVE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.MediaStreamTrack$State r3 = org.webrtc.MediaStreamTrack.State.ENDED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.MediaStreamTrack$State r0 = new org.webrtc.MediaStreamTrack$State
                r1 = r0
                java.lang.String r2 = "LIVE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.MediaStreamTrack.State.LIVE = r0
                org.webrtc.MediaStreamTrack$State r0 = new org.webrtc.MediaStreamTrack$State
                r1 = r0
                java.lang.String r2 = "ENDED"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.MediaStreamTrack.State.ENDED = r0
                org.webrtc.MediaStreamTrack$State[] r0 = $values()
                org.webrtc.MediaStreamTrack.State.$VALUES = r0
                return
        }
    }

    @androidx.annotation.Nullable
    static org.webrtc.MediaStreamTrack createMediaStreamTrack(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = r5
            java.lang.String r0 = nativeGetKind(r0)
            r7 = r0
            r0 = r7
            java.lang.String r1 = "audio"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            org.webrtc.AudioTrack r0 = new org.webrtc.AudioTrack
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L1f:
            r0 = r7
            java.lang.String r1 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            org.webrtc.VideoTrack r0 = new org.webrtc.VideoTrack
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L31:
            r0 = 0
            return r0
    }

    public MediaStreamTrack(long r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "nativeTrack may not be null"
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r5
            r1 = r6
            r0.nativeTrack = r1
            return
    }

    public java.lang.String id() {
            r3 = this;
            r0 = r3
            r0.checkMediaStreamTrackExists()
            r0 = r3
            long r0 = r0.nativeTrack
            java.lang.String r0 = nativeGetId(r0)
            return r0
    }

    public java.lang.String kind() {
            r3 = this;
            r0 = r3
            r0.checkMediaStreamTrackExists()
            r0 = r3
            long r0 = r0.nativeTrack
            java.lang.String r0 = nativeGetKind(r0)
            return r0
    }

    public boolean enabled() {
            r3 = this;
            r0 = r3
            r0.checkMediaStreamTrackExists()
            r0 = r3
            long r0 = r0.nativeTrack
            boolean r0 = nativeGetEnabled(r0)
            return r0
    }

    public boolean setEnabled(boolean r5) {
            r4 = this;
            r0 = r4
            r0.checkMediaStreamTrackExists()
            r0 = r4
            long r0 = r0.nativeTrack
            r1 = r5
            boolean r0 = nativeSetEnabled(r0, r1)
            return r0
    }

    public org.webrtc.MediaStreamTrack.State state() {
            r3 = this;
            r0 = r3
            r0.checkMediaStreamTrackExists()
            r0 = r3
            long r0 = r0.nativeTrack
            org.webrtc.MediaStreamTrack$State r0 = nativeGetState(r0)
            return r0
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkMediaStreamTrackExists()
            r0 = r4
            long r0 = r0.nativeTrack
            org.webrtc.JniCommon.nativeReleaseRef(r0)
            r0 = r4
            r1 = 0
            r0.nativeTrack = r1
            return
    }

    long getNativeMediaStreamTrack() {
            r3 = this;
            r0 = r3
            r0.checkMediaStreamTrackExists()
            r0 = r3
            long r0 = r0.nativeTrack
            return r0
    }

    private void checkMediaStreamTrackExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeTrack
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "MediaStreamTrack has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private static native java.lang.String nativeGetId(long r0);

    private static native java.lang.String nativeGetKind(long r0);

    private static native boolean nativeGetEnabled(long r0);

    private static native boolean nativeSetEnabled(long r0, boolean r2);

    private static native org.webrtc.MediaStreamTrack.State nativeGetState(long r0);
}
