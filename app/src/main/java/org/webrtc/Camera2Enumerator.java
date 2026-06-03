package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera2Enumerator.class */
public class Camera2Enumerator implements org.webrtc.CameraEnumerator {
    private static final java.lang.String TAG = "Camera2Enumerator";
    private static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    private static final java.util.Map<java.lang.String, java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = null;
    final android.content.Context context;

    @androidx.annotation.Nullable
    final android.hardware.camera2.CameraManager cameraManager;

    public Camera2Enumerator(android.content.Context r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.context = r1
            r0 = r4
            r1 = r5
            java.lang.String r2 = "camera"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.hardware.camera2.CameraManager r1 = (android.hardware.camera2.CameraManager) r1
            r0.cameraManager = r1
            return
    }

    @Override // org.webrtc.CameraEnumerator
    public java.lang.String[] getDeviceNames() {
            r4 = this;
            r0 = r4
            android.hardware.camera2.CameraManager r0 = r0.cameraManager     // Catch: android.hardware.camera2.CameraAccessException -> L8
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch: android.hardware.camera2.CameraAccessException -> L8
            return r0
        L8:
            r5 = move-exception
            java.lang.String r0 = "Camera2Enumerator"
            java.lang.String r1 = "Camera access exception"
            r2 = r5
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            android.hardware.camera2.CameraCharacteristics r0 = r0.getCameraCharacteristics(r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1e
            r0 = r5
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            android.hardware.camera2.CameraCharacteristics r0 = r0.getCameraCharacteristics(r1)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1f
            r0 = r5
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    @Override // org.webrtc.CameraEnumerator
    @androidx.annotation.Nullable
    public java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(java.lang.String r4) {
            r3 = this;
            r0 = r3
            android.content.Context r0 = r0.context
            r1 = r4
            java.util.List r0 = getSupportedFormats(r0, r1)
            return r0
    }

    @Override // org.webrtc.CameraEnumerator
    public org.webrtc.CameraVideoCapturer createCapturer(java.lang.String r7, org.webrtc.CameraVideoCapturer.CameraEventsHandler r8) {
            r6 = this;
            org.webrtc.Camera2Capturer r0 = new org.webrtc.Camera2Capturer
            r1 = r0
            r2 = r6
            android.content.Context r2 = r2.context
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    @androidx.annotation.Nullable
    private android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String r5) {
            r4 = this;
            r0 = r4
            android.hardware.camera2.CameraManager r0 = r0.cameraManager     // Catch: java.lang.Throwable -> L9
            r1 = r5
            android.hardware.camera2.CameraCharacteristics r0 = r0.getCameraCharacteristics(r1)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r6 = move-exception
            java.lang.String r0 = "Camera2Enumerator"
            java.lang.String r1 = "Camera access exception"
            r2 = r6
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = 0
            return r0
    }

    public static boolean isSupported(android.content.Context r4) {
            r0 = r4
            java.lang.String r1 = "camera"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0
            r5 = r0
            r0 = r5
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r7
            int r0 = r0.length     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            r8 = r0
            r0 = 0
            r9 = r0
        L18:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L47
            r0 = r7
            r1 = r9
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            r10 = r0
            r0 = r5
            r1 = r10
            android.hardware.camera2.CameraCharacteristics r0 = r0.getCameraCharacteristics(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            r11 = r0
            r0 = r11
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            r1 = 2
            if (r0 != r1) goto L41
            r0 = 0
            return r0
        L41:
            int r9 = r9 + 1
            goto L18
        L47:
            goto L55
        L4a:
            r6 = move-exception
            java.lang.String r0 = "Camera2Enumerator"
            java.lang.String r1 = "Failed to check if camera2 is supported"
            r2 = r6
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = 0
            return r0
        L55:
            r0 = 1
            return r0
    }

    static int getFpsUnitFactor(android.util.Range<java.lang.Integer>[] r3) {
            r0 = r3
            int r0 = r0.length
            if (r0 != 0) goto L9
            r0 = 1000(0x3e8, float:1.401E-42)
            return r0
        L9:
            r0 = r3
            r1 = 0
            r0 = r0[r1]
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 >= r1) goto L21
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L22
        L21:
            r0 = 1
        L22:
            return r0
    }

    static java.util.List<org.webrtc.Size> getSupportedSizes(android.hardware.camera2.CameraCharacteristics r4) {
            r0 = r4
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r0 = r0.get(r1)
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            r5 = r0
            r0 = r4
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6 = r0
            r0 = r5
            java.lang.Class<android.graphics.SurfaceTexture> r1 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r0.getOutputSizes(r1)
            r7 = r0
            r0 = r7
            java.util.List r0 = convertSizes(r0)
            r8 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 >= r1) goto L8e
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L8e
            r0 = r4
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r9 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L51:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L8b
            r0 = r11
            java.lang.Object r0 = r0.next()
            org.webrtc.Size r0 = (org.webrtc.Size) r0
            r12 = r0
            r0 = r9
            int r0 = r0.width()
            r1 = r12
            int r1 = r1.height
            int r0 = r0 * r1
            r1 = r9
            int r1 = r1.height()
            r2 = r12
            int r2 = r2.width
            int r1 = r1 * r2
            if (r0 != r1) goto L88
            r0 = r10
            r1 = r12
            boolean r0 = r0.add(r1)
        L88:
            goto L51
        L8b:
            r0 = r10
            return r0
        L8e:
            r0 = r8
            return r0
    }

    @androidx.annotation.Nullable
    static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(android.content.Context r3, java.lang.String r4) {
            r0 = r3
            java.lang.String r1 = "camera"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0
            r1 = r4
            java.util.List r0 = getSupportedFormats(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(android.hardware.camera2.CameraManager r8, java.lang.String r9) {
            java.util.Map<java.lang.String, java.util.List<org.webrtc.CameraEnumerationAndroid$CaptureFormat>> r0 = org.webrtc.Camera2Enumerator.cachedSupportedFormats
            r1 = r0
            r10 = r1
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<org.webrtc.CameraEnumerationAndroid$CaptureFormat>> r0 = org.webrtc.Camera2Enumerator.cachedSupportedFormats     // Catch: java.lang.Throwable -> L16e
            r1 = r9
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L16e
            if (r0 == 0) goto L21
            java.util.Map<java.lang.String, java.util.List<org.webrtc.CameraEnumerationAndroid$CaptureFormat>> r0 = org.webrtc.Camera2Enumerator.cachedSupportedFormats     // Catch: java.lang.Throwable -> L16e
            r1 = r9
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L16e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L16e
            r1 = r10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16e
            return r0
        L21:
            java.lang.String r0 = "Camera2Enumerator"
            r1 = r9
            java.lang.String r1 = "Get supported formats for camera index " + r1 + "."     // Catch: java.lang.Throwable -> L16e
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L16e
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L16e
            r11 = r0
            r0 = r8
            r1 = r9
            android.hardware.camera2.CameraCharacteristics r0 = r0.getCameraCharacteristics(r1)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L16e
            r13 = r0
            goto L4f
        L3a:
            r14 = move-exception
            java.lang.String r0 = "Camera2Enumerator"
            java.lang.String r1 = "getCameraCharacteristics()"
            r2 = r14
            org.webrtc.Logging.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L16e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16e
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L16e
            r1 = r10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16e
            return r0
        L4f:
            r0 = r13
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch: java.lang.Throwable -> L16e
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L16e
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0     // Catch: java.lang.Throwable -> L16e
            r14 = r0
            r0 = r13
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES     // Catch: java.lang.Throwable -> L16e
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L16e
            android.util.Range[] r0 = (android.util.Range[]) r0     // Catch: java.lang.Throwable -> L16e
            r15 = r0
            r0 = r15
            r1 = r15
            int r1 = getFpsUnitFactor(r1)     // Catch: java.lang.Throwable -> L16e
            java.util.List r0 = convertFramerates(r0, r1)     // Catch: java.lang.Throwable -> L16e
            r16 = r0
            r0 = r13
            java.util.List r0 = getSupportedSizes(r0)     // Catch: java.lang.Throwable -> L16e
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L16e
            r19 = r0
        L88:
            r0 = r19
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L16e
            if (r0 == 0) goto Lad
            r0 = r19
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L16e
            org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r0 = (org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange) r0     // Catch: java.lang.Throwable -> L16e
            r20 = r0
            r0 = r18
            r1 = r20
            int r1 = r1.max     // Catch: java.lang.Throwable -> L16e
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L16e
            r18 = r0
            goto L88
        Lad:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16e
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L16e
            r19 = r0
            r0 = r17
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L16e
            r20 = r0
        Lbf:
            r0 = r20
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L16e
            if (r0 == 0) goto L149
            r0 = r20
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L16e
            org.webrtc.Size r0 = (org.webrtc.Size) r0     // Catch: java.lang.Throwable -> L16e
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = r14
            java.lang.Class<android.graphics.SurfaceTexture> r1 = android.graphics.SurfaceTexture.class
            android.util.Size r2 = new android.util.Size     // Catch: java.lang.Exception -> Lf5 java.lang.Throwable -> L16e
            r3 = r2
            r4 = r21
            int r4 = r4.width     // Catch: java.lang.Exception -> Lf5 java.lang.Throwable -> L16e
            r5 = r21
            int r5 = r5.height     // Catch: java.lang.Exception -> Lf5 java.lang.Throwable -> L16e
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> Lf5 java.lang.Throwable -> L16e
            long r0 = r0.getOutputMinFrameDuration(r1, r2)     // Catch: java.lang.Exception -> Lf5 java.lang.Throwable -> L16e
            r22 = r0
            goto Lf7
        Lf5:
            r24 = move-exception
        Lf7:
            r0 = r22
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L103
            r0 = r18
            goto L112
        L103:
            r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            r1 = r22
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L16e
            double r0 = r0 / r1
            long r0 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L16e
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L16e
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0 * r1
        L112:
            r24 = r0
            r0 = r19
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r1 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat     // Catch: java.lang.Throwable -> L16e
            r2 = r1
            r3 = r21
            int r3 = r3.width     // Catch: java.lang.Throwable -> L16e
            r4 = r21
            int r4 = r4.height     // Catch: java.lang.Throwable -> L16e
            r5 = 0
            r6 = r24
            r2.<init>(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L16e
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L16e
            java.lang.String r0 = "Camera2Enumerator"
            r1 = r21
            int r1 = r1.width     // Catch: java.lang.Throwable -> L16e
            r2 = r21
            int r2 = r2.height     // Catch: java.lang.Throwable -> L16e
            r3 = r24
            java.lang.String r1 = "Format: " + r1 + "x" + r2 + "@" + r3     // Catch: java.lang.Throwable -> L16e
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L16e
            goto Lbf
        L149:
            java.util.Map<java.lang.String, java.util.List<org.webrtc.CameraEnumerationAndroid$CaptureFormat>> r0 = org.webrtc.Camera2Enumerator.cachedSupportedFormats     // Catch: java.lang.Throwable -> L16e
            r1 = r9
            r2 = r19
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L16e
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L16e
            r20 = r0
            java.lang.String r0 = "Camera2Enumerator"
            r1 = r9
            r2 = r20
            r3 = r11
            long r2 = r2 - r3
            java.lang.String r1 = "Get supported formats for camera index " + r1 + " done. Time spent: " + r2 + " ms."     // Catch: java.lang.Throwable -> L16e
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L16e
            r0 = r19
            r1 = r10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16e
            return r0
        L16e:
            r25 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16e
            r0 = r25
            throw r0
    }

    private static java.util.List<org.webrtc.Size> convertSizes(android.util.Size[] r6) {
            r0 = r6
            if (r0 == 0) goto L9
            r0 = r6
            int r0 = r0.length
            if (r0 != 0) goto Ld
        L9:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r6
            int r2 = r2.length
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L1f:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L49
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r7
            org.webrtc.Size r1 = new org.webrtc.Size
            r2 = r1
            r3 = r11
            int r3 = r3.getWidth()
            r4 = r11
            int r4 = r4.getHeight()
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            int r10 = r10 + 1
            goto L1f
        L49:
            r0 = r7
            return r0
    }

    static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(android.util.Range<java.lang.Integer>[] r7, int r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r7
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L11:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L4c
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r9
            org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r1 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange
            r2 = r1
            r3 = r13
            java.lang.Comparable r3 = r3.getLower()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r8
            int r3 = r3 * r4
            r4 = r13
            java.lang.Comparable r4 = r4.getUpper()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r8
            int r4 = r4 * r5
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            int r12 = r12 + 1
            goto L11
        L4c:
            r0 = r9
            return r0
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            org.webrtc.Camera2Enumerator.cachedSupportedFormats = r0
            return
    }
}
