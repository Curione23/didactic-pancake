package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/FileVideoCapturer.class */
public class FileVideoCapturer implements org.webrtc.VideoCapturer {
    private static final java.lang.String TAG = "FileVideoCapturer";
    private final org.webrtc.FileVideoCapturer.VideoReader videoReader;
    private org.webrtc.CapturerObserver capturerObserver;
    private final java.util.Timer timer;
    private final java.util.TimerTask tickTask;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/FileVideoCapturer$VideoReader.class */
    private interface VideoReader {
        org.webrtc.VideoFrame getNextFrame();

        void close();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/FileVideoCapturer$VideoReaderY4M.class */
    private static class VideoReaderY4M implements org.webrtc.FileVideoCapturer.VideoReader {
        private static final java.lang.String TAG = "VideoReaderY4M";
        private static final java.lang.String Y4M_FRAME_DELIMETER = "FRAME";
        private static final int FRAME_DELIMETER_LENGTH = 0;
        private final int frameWidth;
        private final int frameHeight;
        private final long videoStart;
        private final java.io.RandomAccessFile mediaFile;
        private final java.nio.channels.FileChannel mediaFileChannel;

        public VideoReaderY4M(java.lang.String r7) throws java.io.IOException {
                r6 = this;
                r0 = r6
                r0.<init>()
                r0 = r6
                java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
                r2 = r1
                r3 = r7
                java.lang.String r4 = "r"
                r2.<init>(r3, r4)
                r0.mediaFile = r1
                r0 = r6
                r1 = r6
                java.io.RandomAccessFile r1 = r1.mediaFile
                java.nio.channels.FileChannel r1 = r1.getChannel()
                r0.mediaFileChannel = r1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r8 = r0
            L25:
                r0 = r6
                java.io.RandomAccessFile r0 = r0.mediaFile
                int r0 = r0.read()
                r9 = r0
                r0 = r9
                r1 = -1
                if (r0 != r1) goto L40
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                r2 = r7
                java.lang.String r2 = "Found end of file before end of header for file: " + r2
                r1.<init>(r2)
                throw r0
            L40:
                r0 = r9
                r1 = 10
                if (r0 != r1) goto L49
                goto L53
            L49:
                r0 = r8
                r1 = r9
                char r1 = (char) r1
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L25
            L53:
                r0 = r6
                r1 = r6
                java.nio.channels.FileChannel r1 = r1.mediaFileChannel
                long r1 = r1.position()
                r0.videoStart = r1
                r0 = r8
                java.lang.String r0 = r0.toString()
                r9 = r0
                r0 = r9
                java.lang.String r1 = "[ ]"
                java.lang.String[] r0 = r0.split(r1)
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = 0
                r12 = r0
                java.lang.String r0 = ""
                r13 = r0
                r0 = r10
                r14 = r0
                r0 = r14
                int r0 = r0.length
                r15 = r0
                r0 = 0
                r16 = r0
            L81:
                r0 = r16
                r1 = r15
                if (r0 >= r1) goto Le6
                r0 = r14
                r1 = r16
                r0 = r0[r1]
                r17 = r0
                r0 = r17
                r1 = 0
                char r0 = r0.charAt(r1)
                r18 = r0
                r0 = r18
                switch(r0) {
                    case 67: goto Ld8;
                    case 72: goto Lca;
                    case 87: goto Lbc;
                    default: goto Le0;
                }
            Lbc:
                r0 = r17
                r1 = 1
                java.lang.String r0 = r0.substring(r1)
                int r0 = java.lang.Integer.parseInt(r0)
                r11 = r0
                goto Le0
            Lca:
                r0 = r17
                r1 = 1
                java.lang.String r0 = r0.substring(r1)
                int r0 = java.lang.Integer.parseInt(r0)
                r12 = r0
                goto Le0
            Ld8:
                r0 = r17
                r1 = 1
                java.lang.String r0 = r0.substring(r1)
                r13 = r0
            Le0:
                int r16 = r16 + 1
                goto L81
            Le6:
                java.lang.String r0 = "VideoReaderY4M"
                r1 = r13
                java.lang.String r1 = "Color space: " + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r13
                java.lang.String r1 = "420"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L110
                r0 = r13
                java.lang.String r1 = "420mpeg2"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L110
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "Does not support any other color space than I420 or I420mpeg2"
                r1.<init>(r2)
                throw r0
            L110:
                r0 = r11
                r1 = 2
                int r0 = r0 % r1
                r1 = 1
                if (r0 == r1) goto L120
                r0 = r12
                r1 = 2
                int r0 = r0 % r1
                r1 = 1
                if (r0 != r1) goto L12a
            L120:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "Does not support odd width or height"
                r1.<init>(r2)
                throw r0
            L12a:
                r0 = r6
                r1 = r11
                r0.frameWidth = r1
                r0 = r6
                r1 = r12
                r0.frameHeight = r1
                java.lang.String r0 = "VideoReaderY4M"
                r1 = r11
                r2 = r12
                java.lang.String r1 = "frame dim: (" + r1 + ", " + r2 + ")"
                org.webrtc.Logging.d(r0, r1)
                return
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public org.webrtc.VideoFrame getNextFrame() {
                r7 = this;
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r1 = android.os.SystemClock.elapsedRealtime()
                long r0 = r0.toNanos(r1)
                r8 = r0
                r0 = r7
                int r0 = r0.frameWidth
                r1 = r7
                int r1 = r1.frameHeight
                org.webrtc.JavaI420Buffer r0 = org.webrtc.JavaI420Buffer.allocate(r0, r1)
                r10 = r0
                r0 = r10
                java.nio.ByteBuffer r0 = r0.getDataY()
                r11 = r0
                r0 = r10
                java.nio.ByteBuffer r0 = r0.getDataU()
                r12 = r0
                r0 = r10
                java.nio.ByteBuffer r0 = r0.getDataV()
                r13 = r0
                r0 = r7
                int r0 = r0.frameHeight
                r1 = 1
                int r0 = r0 + r1
                r1 = 2
                int r0 = r0 / r1
                r14 = r0
                r0 = r7
                int r0 = r0.frameHeight
                r1 = r10
                int r1 = r1.getStrideY()
                int r0 = r0 * r1
                r15 = r0
                r0 = r14
                r1 = r10
                int r1 = r1.getStrideU()
                int r0 = r0 * r1
                r16 = r0
                r0 = r14
                r1 = r10
                int r1 = r1.getStrideV()
                int r0 = r0 * r1
                r17 = r0
                int r0 = org.webrtc.FileVideoCapturer.VideoReaderY4M.FRAME_DELIMETER_LENGTH     // Catch: java.io.IOException -> Ld8
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.io.IOException -> Ld8
                r18 = r0
                r0 = r7
                java.nio.channels.FileChannel r0 = r0.mediaFileChannel     // Catch: java.io.IOException -> Ld8
                r1 = r18
                int r0 = r0.read(r1)     // Catch: java.io.IOException -> Ld8
                int r1 = org.webrtc.FileVideoCapturer.VideoReaderY4M.FRAME_DELIMETER_LENGTH     // Catch: java.io.IOException -> Ld8
                if (r0 >= r1) goto L8b
                r0 = r7
                java.nio.channels.FileChannel r0 = r0.mediaFileChannel     // Catch: java.io.IOException -> Ld8
                r1 = r7
                long r1 = r1.videoStart     // Catch: java.io.IOException -> Ld8
                java.nio.channels.FileChannel r0 = r0.position(r1)     // Catch: java.io.IOException -> Ld8
                r0 = r7
                java.nio.channels.FileChannel r0 = r0.mediaFileChannel     // Catch: java.io.IOException -> Ld8
                r1 = r18
                int r0 = r0.read(r1)     // Catch: java.io.IOException -> Ld8
                int r1 = org.webrtc.FileVideoCapturer.VideoReaderY4M.FRAME_DELIMETER_LENGTH     // Catch: java.io.IOException -> Ld8
                if (r0 >= r1) goto L8b
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.io.IOException -> Ld8
                r1 = r0
                java.lang.String r2 = "Error looping video"
                r1.<init>(r2)     // Catch: java.io.IOException -> Ld8
                throw r0     // Catch: java.io.IOException -> Ld8
            L8b:
                java.lang.String r0 = new java.lang.String     // Catch: java.io.IOException -> Ld8
                r1 = r0
                r2 = r18
                byte[] r2 = r2.array()     // Catch: java.io.IOException -> Ld8
                java.lang.String r3 = "US-ASCII"
                java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.io.IOException -> Ld8
                r1.<init>(r2, r3)     // Catch: java.io.IOException -> Ld8
                r19 = r0
                r0 = r19
                java.lang.String r1 = "FRAME\n"
                boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> Ld8
                if (r0 != 0) goto Lb7
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.io.IOException -> Ld8
                r1 = r0
                r2 = r19
                java.lang.String r2 = "Frames should be delimited by FRAME plus newline, found delimter was: '" + r2 + "'"     // Catch: java.io.IOException -> Ld8
                r1.<init>(r2)     // Catch: java.io.IOException -> Ld8
                throw r0     // Catch: java.io.IOException -> Ld8
            Lb7:
                r0 = r7
                java.nio.channels.FileChannel r0 = r0.mediaFileChannel     // Catch: java.io.IOException -> Ld8
                r1 = r11
                int r0 = r0.read(r1)     // Catch: java.io.IOException -> Ld8
                r0 = r7
                java.nio.channels.FileChannel r0 = r0.mediaFileChannel     // Catch: java.io.IOException -> Ld8
                r1 = r12
                int r0 = r0.read(r1)     // Catch: java.io.IOException -> Ld8
                r0 = r7
                java.nio.channels.FileChannel r0 = r0.mediaFileChannel     // Catch: java.io.IOException -> Ld8
                r1 = r13
                int r0 = r0.read(r1)     // Catch: java.io.IOException -> Ld8
                goto Le4
            Ld8:
                r18 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                r2 = r18
                r1.<init>(r2)
                throw r0
            Le4:
                org.webrtc.VideoFrame r0 = new org.webrtc.VideoFrame
                r1 = r0
                r2 = r10
                r3 = 0
                r4 = r8
                r1.<init>(r2, r3, r4)
                return r0
        }

        @Override // org.webrtc.FileVideoCapturer.VideoReader
        public void close() {
                r4 = this;
                r0 = r4
                java.io.RandomAccessFile r0 = r0.mediaFile     // Catch: java.io.IOException -> La
                r0.close()     // Catch: java.io.IOException -> La
                goto L13
            La:
                r5 = move-exception
                java.lang.String r0 = "VideoReaderY4M"
                java.lang.String r1 = "Problem closing file"
                r2 = r5
                org.webrtc.Logging.e(r0, r1, r2)
            L13:
                return
        }

        static {
                java.lang.String r0 = "FRAME"
                int r0 = r0.length()
                r1 = 1
                int r0 = r0 + r1
                org.webrtc.FileVideoCapturer.VideoReaderY4M.FRAME_DELIMETER_LENGTH = r0
                return
        }
    }

    public FileVideoCapturer(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.util.Timer r1 = new java.util.Timer
            r2 = r1
            r2.<init>()
            r0.timer = r1
            r0 = r5
            org.webrtc.FileVideoCapturer$1 r1 = new org.webrtc.FileVideoCapturer$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.tickTask = r1
            r0 = r5
            org.webrtc.FileVideoCapturer$VideoReaderY4M r1 = new org.webrtc.FileVideoCapturer$VideoReaderY4M     // Catch: java.io.IOException -> L2a
            r2 = r1
            r3 = r6
            r2.<init>(r3)     // Catch: java.io.IOException -> L2a
            r0.videoReader = r1     // Catch: java.io.IOException -> L2a
            goto L38
        L2a:
            r7 = move-exception
            java.lang.String r0 = "FileVideoCapturer"
            r1 = r6
            java.lang.String r1 = "Could not open video file: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r7
            throw r0
        L38:
            return
    }

    public void tick() {
            r3 = this;
            r0 = r3
            org.webrtc.FileVideoCapturer$VideoReader r0 = r0.videoReader
            org.webrtc.VideoFrame r0 = r0.getNextFrame()
            r4 = r0
            r0 = r3
            org.webrtc.CapturerObserver r0 = r0.capturerObserver
            r1 = r4
            r0.onFrameCaptured(r1)
            r0 = r4
            r0.release()
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(org.webrtc.SurfaceTextureHelper r4, android.content.Context r5, org.webrtc.CapturerObserver r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            r0.capturerObserver = r1
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int r8, int r9, int r10) {
            r7 = this;
            r0 = r7
            java.util.Timer r0 = r0.timer
            r1 = r7
            java.util.TimerTask r1 = r1.tickTask
            r2 = 0
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = r10
            int r3 = r3 / r4
            long r3 = (long) r3
            r0.schedule(r1, r2, r3)
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws java.lang.InterruptedException {
            r2 = this;
            r0 = r2
            java.util.Timer r0 = r0.timer
            r0.cancel()
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int r2, int r3, int r4) {
            r1 = this;
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
            r2 = this;
            r0 = r2
            org.webrtc.FileVideoCapturer$VideoReader r0 = r0.videoReader
            r0.close()
            return
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
            r2 = this;
            r0 = 0
            return r0
    }
}
