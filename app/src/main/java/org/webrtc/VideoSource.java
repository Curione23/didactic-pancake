package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoSource.class */
public class VideoSource extends org.webrtc.MediaSource {
    private final org.webrtc.NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private final java.lang.Object videoProcessorLock;

    @androidx.annotation.Nullable
    private org.webrtc.VideoProcessor videoProcessor;
    private boolean isCapturerRunning;
    private final org.webrtc.CapturerObserver capturerObserver;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoSource$AspectRatio.class */
    public static class AspectRatio {
        public static final org.webrtc.VideoSource.AspectRatio UNDEFINED = null;
        public final int width;
        public final int height;

        public AspectRatio(int r4, int r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.width = r1
                r0 = r3
                r1 = r5
                r0.height = r1
                return
        }

        static {
                org.webrtc.VideoSource$AspectRatio r0 = new org.webrtc.VideoSource$AspectRatio
                r1 = r0
                r2 = 0
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.VideoSource.AspectRatio.UNDEFINED = r0
                return
        }
    }

    public VideoSource(long r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            r0.<init>(r1)
            r0 = r6
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.videoProcessorLock = r1
            r0 = r6
            org.webrtc.VideoSource$1 r1 = new org.webrtc.VideoSource$1
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.capturerObserver = r1
            r0 = r6
            org.webrtc.NativeAndroidVideoTrackSource r1 = new org.webrtc.NativeAndroidVideoTrackSource
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.nativeAndroidVideoTrackSource = r1
            return
    }

    public void adaptOutputFormat(int r8, int r9, int r10) {
            r7 = this;
            r0 = r8
            r1 = r9
            int r0 = java.lang.Math.max(r0, r1)
            r11 = r0
            r0 = r8
            r1 = r9
            int r0 = java.lang.Math.min(r0, r1)
            r12 = r0
            r0 = r7
            r1 = r11
            r2 = r12
            r3 = r12
            r4 = r11
            r5 = r10
            r0.adaptOutputFormat(r1, r2, r3, r4, r5)
            return
    }

    public void adaptOutputFormat(int r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            r0 = r8
            org.webrtc.VideoSource$AspectRatio r1 = new org.webrtc.VideoSource$AspectRatio
            r2 = r1
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4)
            r2 = r9
            r3 = r10
            int r2 = r2 * r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.webrtc.VideoSource$AspectRatio r3 = new org.webrtc.VideoSource$AspectRatio
            r4 = r3
            r5 = r11
            r6 = r12
            r4.<init>(r5, r6)
            r4 = r11
            r5 = r12
            int r4 = r4 * r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.adaptOutputFormat(r1, r2, r3, r4, r5)
            return
    }

    public void adaptOutputFormat(org.webrtc.VideoSource.AspectRatio r8, @androidx.annotation.Nullable java.lang.Integer r9, org.webrtc.VideoSource.AspectRatio r10, @androidx.annotation.Nullable java.lang.Integer r11, @androidx.annotation.Nullable java.lang.Integer r12) {
            r7 = this;
            r0 = r7
            org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.adaptOutputFormat(r1, r2, r3, r4, r5)
            return
    }

    public void setIsScreencast(boolean r4) {
            r3 = this;
            r0 = r3
            org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
            r1 = r4
            r0.setIsScreencast(r1)
            return
    }

    public void setVideoProcessor(@androidx.annotation.Nullable org.webrtc.VideoProcessor r4) {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.videoProcessorLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            org.webrtc.VideoProcessor r0 = r0.videoProcessor     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L28
            r0 = r3
            org.webrtc.VideoProcessor r0 = r0.videoProcessor     // Catch: java.lang.Throwable -> L50
            r1 = 0
            r0.setSink(r1)     // Catch: java.lang.Throwable -> L50
            r0 = r3
            boolean r0 = r0.isCapturerRunning     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L28
            r0 = r3
            org.webrtc.VideoProcessor r0 = r0.videoProcessor     // Catch: java.lang.Throwable -> L50
            r0.onCapturerStopped()     // Catch: java.lang.Throwable -> L50
        L28:
            r0 = r3
            r1 = r4
            r0.videoProcessor = r1     // Catch: java.lang.Throwable -> L50
            r0 = r4
            if (r0 == 0) goto L4b
            r0 = r4
            r1 = r3
            void r1 = (v1) -> { // org.webrtc.VideoSink.onFrame(org.webrtc.VideoFrame):void
                r1.lambda$setVideoProcessor$1(v1);
            }     // Catch: java.lang.Throwable -> L50
            r0.setSink(r1)     // Catch: java.lang.Throwable -> L50
            r0 = r3
            boolean r0 = r0.isCapturerRunning     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L4b
            r0 = r4
            r1 = 1
            r0.onCapturerStarted(r1)     // Catch: java.lang.Throwable -> L50
        L4b:
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            r0 = r6
            throw r0
        L55:
            return
    }

    public org.webrtc.CapturerObserver getCapturerObserver() {
            r2 = this;
            r0 = r2
            org.webrtc.CapturerObserver r0 = r0.capturerObserver
            return r0
    }

    long getNativeVideoTrackSource() {
            r3 = this;
            r0 = r3
            long r0 = r0.getNativeMediaSource()
            return r0
    }

    @Override // org.webrtc.MediaSource
    public void dispose() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.setVideoProcessor(r1)
            r0 = r3
            super.dispose()
            return
    }

    private /* synthetic */ void lambda$setVideoProcessor$1(org.webrtc.VideoFrame r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            r2 = r5
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$setVideoProcessor$0(r2);
            }
            r0.runWithReference(r1)
            return
    }

    private /* synthetic */ void lambda$setVideoProcessor$0(org.webrtc.VideoFrame r4) {
            r3 = this;
            r0 = r3
            org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
            r1 = r4
            r0.onFrameCaptured(r1)
            return
    }
}
