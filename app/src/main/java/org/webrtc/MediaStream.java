package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaStream.class */
public class MediaStream {
    private static final java.lang.String TAG = "MediaStream";
    public final java.util.List<org.webrtc.AudioTrack> audioTracks;
    public final java.util.List<org.webrtc.VideoTrack> videoTracks;
    public final java.util.List<org.webrtc.VideoTrack> preservedVideoTracks;
    private long nativeStream;

    @org.webrtc.CalledByNative
    public MediaStream(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.audioTracks = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.videoTracks = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.preservedVideoTracks = r1
            r0 = r4
            r1 = r5
            r0.nativeStream = r1
            return
    }

    public boolean addTrack(org.webrtc.AudioTrack r6) {
            r5 = this;
            r0 = r5
            r0.checkMediaStreamExists()
            r0 = r5
            long r0 = r0.nativeStream
            r1 = r6
            long r1 = r1.getNativeAudioTrack()
            boolean r0 = nativeAddAudioTrackToNativeStream(r0, r1)
            if (r0 == 0) goto L1f
            r0 = r5
            java.util.List<org.webrtc.AudioTrack> r0 = r0.audioTracks
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public boolean addTrack(org.webrtc.VideoTrack r6) {
            r5 = this;
            r0 = r5
            r0.checkMediaStreamExists()
            r0 = r5
            long r0 = r0.nativeStream
            r1 = r6
            long r1 = r1.getNativeVideoTrack()
            boolean r0 = nativeAddVideoTrackToNativeStream(r0, r1)
            if (r0 == 0) goto L1f
            r0 = r5
            java.util.List<org.webrtc.VideoTrack> r0 = r0.videoTracks
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public boolean addPreservedTrack(org.webrtc.VideoTrack r6) {
            r5 = this;
            r0 = r5
            r0.checkMediaStreamExists()
            r0 = r5
            long r0 = r0.nativeStream
            r1 = r6
            long r1 = r1.getNativeVideoTrack()
            boolean r0 = nativeAddVideoTrackToNativeStream(r0, r1)
            if (r0 == 0) goto L1f
            r0 = r5
            java.util.List<org.webrtc.VideoTrack> r0 = r0.preservedVideoTracks
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public boolean removeTrack(org.webrtc.AudioTrack r6) {
            r5 = this;
            r0 = r5
            r0.checkMediaStreamExists()
            r0 = r5
            java.util.List<org.webrtc.AudioTrack> r0 = r0.audioTracks
            r1 = r6
            boolean r0 = r0.remove(r1)
            r0 = r5
            long r0 = r0.nativeStream
            r1 = r6
            long r1 = r1.getNativeAudioTrack()
            boolean r0 = nativeRemoveAudioTrack(r0, r1)
            return r0
    }

    public boolean removeTrack(org.webrtc.VideoTrack r6) {
            r5 = this;
            r0 = r5
            r0.checkMediaStreamExists()
            r0 = r5
            java.util.List<org.webrtc.VideoTrack> r0 = r0.videoTracks
            r1 = r6
            boolean r0 = r0.remove(r1)
            r0 = r5
            java.util.List<org.webrtc.VideoTrack> r0 = r0.preservedVideoTracks
            r1 = r6
            boolean r0 = r0.remove(r1)
            r0 = r5
            long r0 = r0.nativeStream
            r1 = r6
            long r1 = r1.getNativeVideoTrack()
            boolean r0 = nativeRemoveVideoTrack(r0, r1)
            return r0
    }

    @org.webrtc.CalledByNative
    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkMediaStreamExists()
        L4:
            r0 = r4
            java.util.List<org.webrtc.AudioTrack> r0 = r0.audioTracks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            r0 = r4
            java.util.List<org.webrtc.AudioTrack> r0 = r0.audioTracks
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.webrtc.AudioTrack r0 = (org.webrtc.AudioTrack) r0
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.removeTrack(r1)
            r0 = r5
            r0.dispose()
            goto L4
        L2b:
            r0 = r4
            java.util.List<org.webrtc.VideoTrack> r0 = r0.videoTracks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L52
            r0 = r4
            java.util.List<org.webrtc.VideoTrack> r0 = r0.videoTracks
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.webrtc.VideoTrack r0 = (org.webrtc.VideoTrack) r0
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.removeTrack(r1)
            r0 = r5
            r0.dispose()
            goto L2b
        L52:
            r0 = r4
            java.util.List<org.webrtc.VideoTrack> r0 = r0.preservedVideoTracks
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L73
            r0 = r4
            r1 = r4
            java.util.List<org.webrtc.VideoTrack> r1 = r1.preservedVideoTracks
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            org.webrtc.VideoTrack r1 = (org.webrtc.VideoTrack) r1
            boolean r0 = r0.removeTrack(r1)
            goto L52
        L73:
            r0 = r4
            long r0 = r0.nativeStream
            org.webrtc.JniCommon.nativeReleaseRef(r0)
            r0 = r4
            r1 = 0
            r0.nativeStream = r1
            return
    }

    public java.lang.String getId() {
            r3 = this;
            r0 = r3
            r0.checkMediaStreamExists()
            r0 = r3
            long r0 = r0.nativeStream
            java.lang.String r0 = nativeGetId(r0)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.getId()
            r1 = r4
            java.util.List<org.webrtc.AudioTrack> r1 = r1.audioTracks
            int r1 = r1.size()
            r2 = r4
            java.util.List<org.webrtc.VideoTrack> r2 = r2.videoTracks
            int r2 = r2.size()
            java.lang.String r0 = "[" + r0 + ":A=" + r1 + ":V=" + r2 + "]"
            return r0
    }

    @org.webrtc.CalledByNative
    void addNativeAudioTrack(long r7) {
            r6 = this;
            r0 = r6
            java.util.List<org.webrtc.AudioTrack> r0 = r0.audioTracks
            org.webrtc.AudioTrack r1 = new org.webrtc.AudioTrack
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            return
    }

    @org.webrtc.CalledByNative
    void addNativeVideoTrack(long r7) {
            r6 = this;
            r0 = r6
            java.util.List<org.webrtc.VideoTrack> r0 = r0.videoTracks
            org.webrtc.VideoTrack r1 = new org.webrtc.VideoTrack
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            return
    }

    @org.webrtc.CalledByNative
    void removeAudioTrack(long r5) {
            r4 = this;
            r0 = r4
            java.util.List<org.webrtc.AudioTrack> r0 = r0.audioTracks
            r1 = r5
            removeMediaStreamTrack(r0, r1)
            return
    }

    @org.webrtc.CalledByNative
    void removeVideoTrack(long r5) {
            r4 = this;
            r0 = r4
            java.util.List<org.webrtc.VideoTrack> r0 = r0.videoTracks
            r1 = r5
            removeMediaStreamTrack(r0, r1)
            return
    }

    long getNativeMediaStream() {
            r3 = this;
            r0 = r3
            r0.checkMediaStreamExists()
            r0 = r3
            long r0 = r0.nativeStream
            return r0
    }

    private void checkMediaStreamExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeStream
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "MediaStream has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private static void removeMediaStreamTrack(java.util.List<? extends org.webrtc.MediaStreamTrack> r5, long r6) {
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L7:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L34
            r0 = r8
            java.lang.Object r0 = r0.next()
            org.webrtc.MediaStreamTrack r0 = (org.webrtc.MediaStreamTrack) r0
            r9 = r0
            r0 = r9
            long r0 = r0.getNativeMediaStreamTrack()
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L31
            r0 = r9
            r0.dispose()
            r0 = r8
            r0.remove()
            return
        L31:
            goto L7
        L34:
            java.lang.String r0 = "MediaStream"
            java.lang.String r1 = "Couldn't not find track"
            org.webrtc.Logging.e(r0, r1)
            return
    }

    private static native boolean nativeAddAudioTrackToNativeStream(long r0, long r2);

    private static native boolean nativeAddVideoTrackToNativeStream(long r0, long r2);

    private static native boolean nativeRemoveAudioTrack(long r0, long r2);

    private static native boolean nativeRemoveVideoTrack(long r0, long r2);

    private static native java.lang.String nativeGetId(long r0);
}
