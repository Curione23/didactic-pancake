package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoTrack.class */
public class VideoTrack extends org.webrtc.MediaStreamTrack {
    private final java.util.IdentityHashMap<org.webrtc.VideoSink, java.lang.Long> sinks;

    public VideoTrack(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r2 = r1
            r2.<init>()
            r0.sinks = r1
            return
    }

    public void addSink(org.webrtc.VideoSink r6) {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto Le
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The VideoSink is not allowed to be null"
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r5
            java.util.IdentityHashMap<org.webrtc.VideoSink, java.lang.Long> r0 = r0.sinks
            r1 = r6
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L33
            r0 = r6
            long r0 = nativeWrapSink(r0)
            r7 = r0
            r0 = r5
            java.util.IdentityHashMap<org.webrtc.VideoSink, java.lang.Long> r0 = r0.sinks
            r1 = r6
            r2 = r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            long r0 = r0.getNativeMediaStreamTrack()
            r1 = r7
            nativeAddSink(r0, r1)
        L33:
            return
    }

    public void removeSink(org.webrtc.VideoSink r6) {
            r5 = this;
            r0 = r5
            java.util.IdentityHashMap<org.webrtc.VideoSink, java.lang.Long> r0 = r0.sinks
            r1 = r6
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L22
            r0 = r5
            long r0 = r0.getNativeMediaStreamTrack()
            r1 = r7
            long r1 = r1.longValue()
            nativeRemoveSink(r0, r1)
            r0 = r7
            long r0 = r0.longValue()
            nativeFreeSink(r0)
        L22:
            return
    }

    @Override // org.webrtc.MediaStreamTrack
    public void dispose() {
            r5 = this;
            r0 = r5
            java.util.IdentityHashMap<org.webrtc.VideoSink, java.lang.Long> r0 = r0.sinks
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        Ld:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L32
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r7 = r0
            r0 = r5
            long r0 = r0.getNativeMediaStreamTrack()
            r1 = r7
            nativeRemoveSink(r0, r1)
            r0 = r7
            nativeFreeSink(r0)
            goto Ld
        L32:
            r0 = r5
            java.util.IdentityHashMap<org.webrtc.VideoSink, java.lang.Long> r0 = r0.sinks
            r0.clear()
            r0 = r5
            super.dispose()
            return
    }

    public long getNativeVideoTrack() {
            r3 = this;
            r0 = r3
            long r0 = r0.getNativeMediaStreamTrack()
            return r0
    }

    private static native void nativeAddSink(long r0, long r2);

    private static native void nativeRemoveSink(long r0, long r2);

    private static native long nativeWrapSink(org.webrtc.VideoSink r0);

    private static native void nativeFreeSink(long r0);
}
