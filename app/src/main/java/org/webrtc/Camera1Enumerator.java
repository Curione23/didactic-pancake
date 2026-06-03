package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera1Enumerator.class */
public class Camera1Enumerator implements org.webrtc.CameraEnumerator {
    private static final java.lang.String TAG = "Camera1Enumerator";
    private static java.util.List<java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    public Camera1Enumerator(boolean r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.captureToTexture = r1
            return
    }

    @Override // org.webrtc.CameraEnumerator
    public java.lang.String[] getDeviceNames() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = 0
            r6 = r0
        La:
            r0 = r6
            int r1 = android.hardware.Camera.getNumberOfCameras()
            if (r0 >= r1) goto L40
            r0 = r6
            java.lang.String r0 = getDeviceName(r0)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2f
            r0 = r5
            r1 = r7
            boolean r0 = r0.add(r1)
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r6
            r2 = r7
            java.lang.String r1 = "Index: " + r1 + ". " + r2
            org.webrtc.Logging.d(r0, r1)
            goto L3a
        L2f:
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r6
            java.lang.String r1 = "Index: " + r1 + ". Failed to query camera name."
            org.webrtc.Logging.e(r0, r1)
        L3a:
            int r6 = r6 + 1
            goto La
        L40:
            r0 = r5
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(java.lang.String r4) {
            r3 = this;
            r0 = r4
            int r0 = getCameraIndex(r0)
            android.hardware.Camera$CameraInfo r0 = getCameraInfo(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L18
            r0 = r5
            int r0 = r0.facing
            r1 = 1
            if (r0 != r1) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(java.lang.String r3) {
            r2 = this;
            r0 = r3
            int r0 = getCameraIndex(r0)
            android.hardware.Camera$CameraInfo r0 = getCameraInfo(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L17
            r0 = r4
            int r0 = r0.facing
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    @Override // org.webrtc.CameraEnumerator
    public java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(java.lang.String r3) {
            r2 = this;
            r0 = r3
            int r0 = getCameraIndex(r0)
            java.util.List r0 = getSupportedFormats(r0)
            return r0
    }

    @Override // org.webrtc.CameraEnumerator
    public org.webrtc.CameraVideoCapturer createCapturer(java.lang.String r7, org.webrtc.CameraVideoCapturer.CameraEventsHandler r8) {
            r6 = this;
            org.webrtc.Camera1Capturer r0 = new org.webrtc.Camera1Capturer
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r6
            boolean r4 = r4.captureToTexture
            r1.<init>(r2, r3, r4)
            return r0
    }

    @androidx.annotation.Nullable
    private static android.hardware.Camera.CameraInfo getCameraInfo(int r4) {
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r4
            r1 = r5
            android.hardware.Camera.getCameraInfo(r0, r1)     // Catch: java.lang.Exception -> L10
            goto L1f
        L10:
            r6 = move-exception
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r4
            java.lang.String r1 = "getCameraInfo failed on index " + r1
            r2 = r6
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = 0
            return r0
        L1f:
            r0 = r5
            return r0
    }

    static synchronized java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int r3) {
            java.util.List<java.util.List<org.webrtc.CameraEnumerationAndroid$CaptureFormat>> r0 = org.webrtc.Camera1Enumerator.cachedSupportedFormats
            if (r0 != 0) goto L2c
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            org.webrtc.Camera1Enumerator.cachedSupportedFormats = r0
            r0 = 0
            r4 = r0
        L12:
            r0 = r4
            int r1 = android.hardware.Camera.getNumberOfCameras()
            if (r0 >= r1) goto L2c
            java.util.List<java.util.List<org.webrtc.CameraEnumerationAndroid$CaptureFormat>> r0 = org.webrtc.Camera1Enumerator.cachedSupportedFormats
            r1 = r4
            java.util.List r1 = enumerateFormats(r1)
            boolean r0 = r0.add(r1)
            int r4 = r4 + 1
            goto L12
        L2c:
            java.util.List<java.util.List<org.webrtc.CameraEnumerationAndroid$CaptureFormat>> r0 = org.webrtc.Camera1Enumerator.cachedSupportedFormats
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int r8) {
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r8
            java.lang.String r1 = "Get supported formats for camera index " + r1 + "."
            org.webrtc.Logging.d(r0, r1)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r9 = r0
            r0 = 0
            r12 = r0
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r8
            java.lang.String r1 = "Opening camera with index " + r1     // Catch: java.lang.RuntimeException -> L36 java.lang.Throwable -> L5b
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.RuntimeException -> L36 java.lang.Throwable -> L5b
            r0 = r8
            android.hardware.Camera r0 = android.hardware.Camera.open(r0)     // Catch: java.lang.RuntimeException -> L36 java.lang.Throwable -> L5b
            r12 = r0
            r0 = r12
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.RuntimeException -> L36 java.lang.Throwable -> L5b
            r11 = r0
            r0 = r12
            if (r0 == 0) goto L6a
            r0 = r12
            r0.release()
            goto L6a
        L36:
            r13 = move-exception
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r8
            java.lang.String r1 = "Open camera failed on camera index " + r1     // Catch: java.lang.Throwable -> L5b
            r2 = r13
            org.webrtc.Logging.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L5b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            r14 = r0
            r0 = r12
            if (r0 == 0) goto L58
            r0 = r12
            r0.release()
        L58:
            r0 = r14
            return r0
        L5b:
            r15 = move-exception
            r0 = r12
            if (r0 == 0) goto L67
            r0 = r12
            r0.release()
        L67:
            r0 = r15
            throw r0
        L6a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r11
            java.util.List r0 = r0.getSupportedPreviewFpsRange()     // Catch: java.lang.Exception -> Le9
            r16 = r0
            r0 = r16
            if (r0 == 0) goto La5
            r0 = r16
            r1 = r16
            int r1 = r1.size()     // Catch: java.lang.Exception -> Le9
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Le9
            int[] r0 = (int[]) r0     // Catch: java.lang.Exception -> Le9
            r17 = r0
            r0 = r17
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Exception -> Le9
            r14 = r0
            r0 = r17
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Exception -> Le9
            r15 = r0
        La5:
            r0 = r11
            java.util.List r0 = r0.getSupportedPreviewSizes()     // Catch: java.lang.Exception -> Le9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Le9
            r17 = r0
        Lb0:
            r0 = r17
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> Le9
            if (r0 == 0) goto Le6
            r0 = r17
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> Le9
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch: java.lang.Exception -> Le9
            r18 = r0
            r0 = r13
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r1 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat     // Catch: java.lang.Exception -> Le9
            r2 = r1
            r3 = r18
            int r3 = r3.width     // Catch: java.lang.Exception -> Le9
            r4 = r18
            int r4 = r4.height     // Catch: java.lang.Exception -> Le9
            r5 = r14
            r6 = r15
            r2.<init>(r3, r4, r5, r6)     // Catch: java.lang.Exception -> Le9
            boolean r0 = r0.add(r1)     // Catch: java.lang.Exception -> Le9
            goto Lb0
        Le6:
            goto Lf8
        Le9:
            r14 = move-exception
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r8
            java.lang.String r1 = "getSupportedFormats() failed on camera index " + r1
            r2 = r14
            org.webrtc.Logging.e(r0, r1, r2)
        Lf8:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r14 = r0
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r8
            r2 = r14
            r3 = r9
            long r2 = r2 - r3
            java.lang.String r1 = "Get supported formats for camera index " + r1 + " done. Time spent: " + r2 + " ms."
            org.webrtc.Logging.d(r0, r1)
            r0 = r13
            return r0
    }

    static java.util.List<org.webrtc.Size> convertSizes(java.util.List<android.hardware.Camera.Size> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        Lf:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3b
            r0 = r8
            java.lang.Object r0 = r0.next()
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0
            r9 = r0
            r0 = r7
            org.webrtc.Size r1 = new org.webrtc.Size
            r2 = r1
            r3 = r9
            int r3 = r3.width
            r4 = r9
            int r4 = r4.height
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto Lf
        L3b:
            r0 = r7
            return r0
    }

    static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(java.util.List<int[]> r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        Lf:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L39
            r0 = r9
            java.lang.Object r0 = r0.next()
            int[] r0 = (int[]) r0
            r10 = r0
            r0 = r8
            org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r1 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange
            r2 = r1
            r3 = r10
            r4 = 0
            r3 = r3[r4]
            r4 = r10
            r5 = 1
            r4 = r4[r5]
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto Lf
        L39:
            r0 = r8
            return r0
    }

    static int getCameraIndex(java.lang.String r4) {
            java.lang.String r0 = "Camera1Enumerator"
            r1 = r4
            java.lang.String r1 = "getCameraIndex: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = 0
            r5 = r0
        Ld:
            r0 = r5
            int r1 = android.hardware.Camera.getNumberOfCameras()
            if (r0 >= r1) goto L27
            r0 = r4
            r1 = r5
            java.lang.String r1 = getDeviceName(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            r0 = r5
            return r0
        L21:
            int r5 = r5 + 1
            goto Ld
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r4
            java.lang.String r2 = "No such camera: " + r2
            r1.<init>(r2)
            throw r0
    }

    @androidx.annotation.Nullable
    static java.lang.String getDeviceName(int r4) {
            r0 = r4
            android.hardware.Camera$CameraInfo r0 = getCameraInfo(r0)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r5
            int r0 = r0.facing
            r1 = 1
            if (r0 != r1) goto L18
            java.lang.String r0 = "front"
            goto L1a
        L18:
            java.lang.String r0 = "back"
        L1a:
            r6 = r0
            r0 = r4
            r1 = r6
            r2 = r5
            int r2 = r2.orientation
            java.lang.String r0 = "Camera " + r0 + ", Facing " + r1 + ", Orientation " + r2
            return r0
    }
}
