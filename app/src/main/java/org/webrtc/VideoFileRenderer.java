package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFileRenderer.class */
public class VideoFileRenderer implements org.webrtc.VideoSink {
    private static final java.lang.String TAG = "VideoFileRenderer";
    private final android.os.HandlerThread renderThread;
    private final android.os.Handler renderThreadHandler;
    private final android.os.HandlerThread fileThread;
    private final android.os.Handler fileThreadHandler;
    private final java.io.FileOutputStream videoOutFile;
    private final java.lang.String outputFileName;
    private final int outputFileWidth;
    private final int outputFileHeight;
    private final int outputFrameSize;
    private final java.nio.ByteBuffer outputFrameBuffer;
    private org.webrtc.EglBase eglBase;
    private org.webrtc.YuvConverter yuvConverter;
    private int frameCount;


    public VideoFileRenderer(java.lang.String r7, int r8, int r9, org.webrtc.EglBase.Context r10) throws java.io.IOException {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r8
            r1 = 2
            int r0 = r0 % r1
            r1 = 1
            if (r0 == r1) goto L12
            r0 = r9
            r1 = 2
            int r0 = r0 % r1
            r1 = 1
            if (r0 != r1) goto L1c
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Does not support uneven width or height"
            r1.<init>(r2)
            throw r0
        L1c:
            r0 = r6
            r1 = r7
            r0.outputFileName = r1
            r0 = r6
            r1 = r8
            r0.outputFileWidth = r1
            r0 = r6
            r1 = r9
            r0.outputFileHeight = r1
            r0 = r6
            r1 = r8
            r2 = r9
            int r1 = r1 * r2
            r2 = 3
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 / r2
            r0.outputFrameSize = r1
            r0 = r6
            r1 = r6
            int r1 = r1.outputFrameSize
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            r0.outputFrameBuffer = r1
            r0 = r6
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.videoOutFile = r1
            r0 = r6
            java.io.FileOutputStream r0 = r0.videoOutFile
            r1 = r8
            r2 = r9
            java.lang.String r1 = "YUV4MPEG2 C420 W" + r1 + " H" + r2 + " Ip F30:1 A1:1\n"
            java.lang.String r2 = "US-ASCII"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            byte[] r1 = r1.getBytes(r2)
            r0.write(r1)
            r0 = r6
            android.os.HandlerThread r1 = new android.os.HandlerThread
            r2 = r1
            java.lang.String r3 = "VideoFileRendererRenderThread"
            r2.<init>(r3)
            r0.renderThread = r1
            r0 = r6
            android.os.HandlerThread r0 = r0.renderThread
            r0.start()
            r0 = r6
            android.os.Handler r1 = new android.os.Handler
            r2 = r1
            r3 = r6
            android.os.HandlerThread r3 = r3.renderThread
            android.os.Looper r3 = r3.getLooper()
            r2.<init>(r3)
            r0.renderThreadHandler = r1
            r0 = r6
            android.os.HandlerThread r1 = new android.os.HandlerThread
            r2 = r1
            java.lang.String r3 = "VideoFileRendererFileThread"
            r2.<init>(r3)
            r0.fileThread = r1
            r0 = r6
            android.os.HandlerThread r0 = r0.fileThread
            r0.start()
            r0 = r6
            android.os.Handler r1 = new android.os.Handler
            r2 = r1
            r3 = r6
            android.os.HandlerThread r3 = r3.fileThread
            android.os.Looper r3 = r3.getLooper()
            r2.<init>(r3)
            r0.fileThreadHandler = r1
            r0 = r6
            android.os.Handler r0 = r0.renderThreadHandler
            org.webrtc.VideoFileRenderer$1 r1 = new org.webrtc.VideoFileRenderer$1
            r2 = r1
            r3 = r6
            r4 = r10
            r2.<init>(r3, r4)
            org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)
            return
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame r5) {
            r4 = this;
            r0 = r5
            r0.retain()
            r0 = r4
            android.os.Handler r0 = r0.renderThreadHandler
            r1 = r4
            r2 = r5
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$onFrame$0(r2);
            }
            boolean r0 = r0.post(r1)
            return
    }

    private void renderFrameOnRenderThread(org.webrtc.VideoFrame r9) {
            r8 = this;
            r0 = r9
            org.webrtc.VideoFrame$Buffer r0 = r0.getBuffer()
            r10 = r0
            r0 = r9
            int r0 = r0.getRotation()
            r1 = 180(0xb4, float:2.52E-43)
            int r0 = r0 % r1
            if (r0 != 0) goto L17
            r0 = r8
            int r0 = r0.outputFileWidth
            goto L1b
        L17:
            r0 = r8
            int r0 = r0.outputFileHeight
        L1b:
            r11 = r0
            r0 = r9
            int r0 = r0.getRotation()
            r1 = 180(0xb4, float:2.52E-43)
            int r0 = r0 % r1
            if (r0 != 0) goto L2e
            r0 = r8
            int r0 = r0.outputFileHeight
            goto L32
        L2e:
            r0 = r8
            int r0 = r0.outputFileWidth
        L32:
            r12 = r0
            r0 = r10
            int r0 = r0.getWidth()
            float r0 = (float) r0
            r1 = r10
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            r13 = r0
            r0 = r11
            float r0 = (float) r0
            r1 = r12
            float r1 = (float) r1
            float r0 = r0 / r1
            r14 = r0
            r0 = r10
            int r0 = r0.getWidth()
            r15 = r0
            r0 = r10
            int r0 = r0.getHeight()
            r16 = r0
            r0 = r14
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L74
            r0 = r16
            float r0 = (float) r0
            r1 = r13
            r2 = r14
            float r1 = r1 / r2
            float r0 = r0 * r1
            int r0 = (int) r0
            r16 = r0
            goto L80
        L74:
            r0 = r15
            float r0 = (float) r0
            r1 = r14
            r2 = r13
            float r1 = r1 / r2
            float r0 = r0 * r1
            int r0 = (int) r0
            r15 = r0
        L80:
            r0 = r10
            int r0 = r0.getWidth()
            r1 = r15
            int r0 = r0 - r1
            r1 = 2
            int r0 = r0 / r1
            r17 = r0
            r0 = r10
            int r0 = r0.getHeight()
            r1 = r16
            int r0 = r0 - r1
            r1 = 2
            int r0 = r0 / r1
            r18 = r0
            r0 = r10
            r1 = r17
            r2 = r18
            r3 = r15
            r4 = r16
            r5 = r11
            r6 = r12
            org.webrtc.VideoFrame$Buffer r0 = r0.cropAndScale(r1, r2, r3, r4, r5, r6)
            r19 = r0
            r0 = r9
            r0.release()
            r0 = r19
            org.webrtc.VideoFrame$I420Buffer r0 = r0.toI420()
            r20 = r0
            r0 = r19
            r0.release()
            r0 = r8
            android.os.Handler r0 = r0.fileThreadHandler
            r1 = r8
            r2 = r20
            r3 = r9
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$renderFrameOnRenderThread$1(r2, r3);
            }
            boolean r0 = r0.post(r1)
            return
    }

    public void release() {
            r4 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            android.os.Handler r0 = r0.renderThreadHandler
            r1 = r4
            r2 = r5
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$release$2(r2);
            }
            boolean r0 = r0.post(r1)
            r0 = r5
            org.webrtc.ThreadUtils.awaitUninterruptibly(r0)
            r0 = r4
            android.os.Handler r0 = r0.fileThreadHandler
            r1 = r4
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$release$3();
            }
            boolean r0 = r0.post(r1)
            r0 = r4
            android.os.HandlerThread r0 = r0.fileThread     // Catch: java.lang.InterruptedException -> L34
            r0.join()     // Catch: java.lang.InterruptedException -> L34
            goto L43
        L34:
            r6 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.lang.String r0 = "VideoFileRenderer"
            java.lang.String r1 = "Interrupted while waiting for the write to disk to complete."
            r2 = r6
            org.webrtc.Logging.e(r0, r1, r2)
        L43:
            return
    }

    private /* synthetic */ void lambda$release$3() {
            r6 = this;
            r0 = r6
            java.io.FileOutputStream r0 = r0.videoOutFile     // Catch: java.io.IOException -> L24
            r0.close()     // Catch: java.io.IOException -> L24
            java.lang.String r0 = "VideoFileRenderer"
            r1 = r6
            java.lang.String r1 = r1.outputFileName     // Catch: java.io.IOException -> L24
            r2 = r6
            int r2 = r2.frameCount     // Catch: java.io.IOException -> L24
            r3 = r6
            int r3 = r3.outputFileWidth     // Catch: java.io.IOException -> L24
            r4 = r6
            int r4 = r4.outputFileHeight     // Catch: java.io.IOException -> L24
            java.lang.String r1 = "Video written to disk as " + r1 + ". The number of frames is " + r2 + " and the dimensions of the frames are " + r3 + "x" + r4 + "."     // Catch: java.io.IOException -> L24
            org.webrtc.Logging.d(r0, r1)     // Catch: java.io.IOException -> L24
            goto L30
        L24:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Error closing output file"
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
        L30:
            r0 = r6
            android.os.HandlerThread r0 = r0.fileThread
            boolean r0 = r0.quit()
            return
    }

    private /* synthetic */ void lambda$release$2(java.util.concurrent.CountDownLatch r3) {
            r2 = this;
            r0 = r2
            org.webrtc.YuvConverter r0 = r0.yuvConverter
            r0.release()
            r0 = r2
            org.webrtc.EglBase r0 = r0.eglBase
            r0.release()
            r0 = r2
            android.os.HandlerThread r0 = r0.renderThread
            boolean r0 = r0.quit()
            r0 = r3
            r0.countDown()
            return
    }

    private /* synthetic */ void lambda$renderFrameOnRenderThread$1(org.webrtc.VideoFrame.I420Buffer r12, org.webrtc.VideoFrame r13) {
            r11 = this;
            r0 = r12
            java.nio.ByteBuffer r0 = r0.getDataY()
            r1 = r12
            int r1 = r1.getStrideY()
            r2 = r12
            java.nio.ByteBuffer r2 = r2.getDataU()
            r3 = r12
            int r3 = r3.getStrideU()
            r4 = r12
            java.nio.ByteBuffer r4 = r4.getDataV()
            r5 = r12
            int r5 = r5.getStrideV()
            r6 = r11
            java.nio.ByteBuffer r6 = r6.outputFrameBuffer
            r7 = r12
            int r7 = r7.getWidth()
            r8 = r12
            int r8 = r8.getHeight()
            r9 = r13
            int r9 = r9.getRotation()
            org.webrtc.YuvHelper.I420Rotate(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r12
            r0.release()
            r0 = r11
            java.io.FileOutputStream r0 = r0.videoOutFile     // Catch: java.io.IOException -> L6f
            java.lang.String r1 = "FRAME\n"
            java.lang.String r2 = "US-ASCII"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch: java.io.IOException -> L6f
            byte[] r1 = r1.getBytes(r2)     // Catch: java.io.IOException -> L6f
            r0.write(r1)     // Catch: java.io.IOException -> L6f
            r0 = r11
            java.io.FileOutputStream r0 = r0.videoOutFile     // Catch: java.io.IOException -> L6f
            r1 = r11
            java.nio.ByteBuffer r1 = r1.outputFrameBuffer     // Catch: java.io.IOException -> L6f
            byte[] r1 = r1.array()     // Catch: java.io.IOException -> L6f
            r2 = r11
            java.nio.ByteBuffer r2 = r2.outputFrameBuffer     // Catch: java.io.IOException -> L6f
            int r2 = r2.arrayOffset()     // Catch: java.io.IOException -> L6f
            r3 = r11
            int r3 = r3.outputFrameSize     // Catch: java.io.IOException -> L6f
            r0.write(r1, r2, r3)     // Catch: java.io.IOException -> L6f
            goto L7c
        L6f:
            r14 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Error writing video to disk"
            r3 = r14
            r1.<init>(r2, r3)
            throw r0
        L7c:
            r0 = r11
            r1 = r0
            int r1 = r1.frameCount
            r2 = 1
            int r1 = r1 + r2
            r0.frameCount = r1
            return
    }

    private /* synthetic */ void lambda$onFrame$0(org.webrtc.VideoFrame r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.renderFrameOnRenderThread(r1)
            return
    }
}
