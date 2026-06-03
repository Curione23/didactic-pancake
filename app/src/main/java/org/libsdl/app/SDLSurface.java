package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
public class SDLSurface extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, android.view.View.OnApplyWindowInsetsListener, android.view.View.OnKeyListener, android.view.View.OnTouchListener, android.hardware.SensorEventListener {
    protected android.view.Display mDisplay;
    protected float mHeight;
    public boolean mIsSurfaceReady;
    protected android.hardware.SensorManager mSensorManager;
    protected float mWidth;

    public SDLSurface(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.view.SurfaceHolder r0 = r1.getHolder()
            r0.addCallback(r1)
            r0 = 1
            r1.setFocusable(r0)
            r1.setFocusableInTouchMode(r0)
            r1.requestFocus()
            r1.setOnApplyWindowInsetsListener(r1)
            r1.setOnKeyListener(r1)
            r1.setOnTouchListener(r1)
            java.lang.String r0 = "window"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            r1.mDisplay = r0
            java.lang.String r0 = "sensor"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2
            r1.mSensorManager = r2
            org.libsdl.app.SDLGenericMotionListener_API14 r2 = org.libsdl.app.SDLActivity.getMotionListener()
            r1.setOnGenericMotionListener(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.mWidth = r2
            r1.mHeight = r2
            r2 = 0
            r1.mIsSurfaceReady = r2
            return
    }

    private float getNormalizedX(float r4) {
            r3 = this;
            float r0 = r3.mWidth
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto Lb
            r4 = 1056964608(0x3f000000, float:0.5)
            return r4
        Lb:
            float r0 = r0 - r1
            float r4 = r4 / r0
            return r4
    }

    private float getNormalizedY(float r4) {
            r3 = this;
            float r0 = r3.mHeight
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto Lb
            r4 = 1056964608(0x3f000000, float:0.5)
            return r4
        Lb:
            float r0 = r0 - r1
            float r4 = r4 / r0
            return r4
    }

    public void enableSensor(int r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto Le
            android.hardware.SensorManager r4 = r2.mSensorManager
            android.hardware.Sensor r3 = r4.getDefaultSensor(r3)
            r0 = 1
            r1 = 0
            r4.registerListener(r2, r3, r0, r1)
            goto L17
        Le:
            android.hardware.SensorManager r4 = r2.mSensorManager
            android.hardware.Sensor r3 = r4.getDefaultSensor(r3)
            r4.unregisterListener(r2, r3)
        L17:
            return
    }

    public android.view.Surface getNativeSurface() {
            r1 = this;
            android.view.SurfaceHolder r0 = r1.getHolder()
            android.view.Surface r0 = r0.getSurface()
            return r0
    }

    public void handlePause() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.enableSensor(r0, r1)
            return
    }

    public void handleResume() {
            r1 = this;
            r0 = 1
            r1.setFocusable(r0)
            r1.setFocusableInTouchMode(r0)
            r1.requestFocus()
            r1.setOnApplyWindowInsetsListener(r1)
            r1.setOnKeyListener(r1)
            r1.setOnTouchListener(r1)
            r1.enableSensor(r0, r0)
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View r4, android.view.WindowInsets r5) {
            r3 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r4 < r0) goto L2d
            int r4 = android.view.WindowInsets.Type.systemBars()
            int r0 = android.view.WindowInsets.Type.systemGestures()
            r4 = r4 | r0
            int r0 = android.view.WindowInsets.Type.mandatorySystemGestures()
            r4 = r4 | r0
            int r0 = android.view.WindowInsets.Type.tappableElement()
            r4 = r4 | r0
            int r0 = android.view.WindowInsets.Type.displayCutout()
            r4 = r4 | r0
            android.graphics.Insets r4 = r5.getInsets(r4)
            int r0 = r4.left
            int r1 = r4.right
            int r2 = r4.top
            int r4 = r4.bottom
            org.libsdl.app.SDLActivity.onNativeInsetsChanged(r0, r1, r2, r4)
        L2d:
            return r5
    }

    @Override // android.view.View
    public boolean onCapturedPointerEvent(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = r8.getActionMasked()
            int r1 = r8.getPointerCount()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L52
            r4 = 2
            r5 = 1
            if (r0 == r4) goto L46
            r4 = 7
            if (r0 == r4) goto L46
            r4 = 8
            if (r0 == r4) goto L36
            r4 = 11
            if (r0 == r4) goto L22
            r6 = 12
            if (r0 == r6) goto L22
            int r3 = r3 + 1
            goto La
        L22:
            if (r0 != r4) goto L25
            goto L26
        L25:
            r2 = r5
        L26:
            float r0 = r8.getX(r3)
            float r1 = r8.getY(r3)
            int r8 = r8.getButtonState()
            org.libsdl.app.SDLActivity.onNativeMouse(r8, r2, r0, r1, r5)
            return r5
        L36:
            r1 = 10
            float r1 = r8.getAxisValue(r1, r3)
            r4 = 9
            float r8 = r8.getAxisValue(r4, r3)
            org.libsdl.app.SDLActivity.onNativeMouse(r2, r0, r1, r8, r2)
            return r5
        L46:
            float r1 = r8.getX(r3)
            float r8 = r8.getY(r3)
            org.libsdl.app.SDLActivity.onNativeMouse(r2, r0, r1, r8, r5)
            return r5
        L52:
            return r2
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            r0 = 0
            boolean r2 = org.libsdl.app.SDLActivity.handleKeyEvent(r2, r3, r4, r0)
            return r2
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent r6) {
            r5 = this;
            android.hardware.Sensor r0 = r6.sensor
            int r0 = r0.getType()
            r1 = 1
            if (r0 != r1) goto L5c
            android.view.Display r0 = r5.mDisplay
            int r0 = r0.getRotation()
            r2 = 2
            r3 = 0
            if (r0 == r1) goto L3a
            if (r0 == r2) goto L2d
            r4 = 3
            if (r0 == r4) goto L21
            float[] r0 = r6.values
            r0 = r0[r3]
            float[] r4 = r6.values
            r1 = r4[r1]
            goto L45
        L21:
            float[] r0 = r6.values
            r0 = r0[r1]
            float[] r1 = r6.values
            r1 = r1[r3]
            float r1 = -r1
            r3 = 270(0x10e, float:3.78E-43)
            goto L45
        L2d:
            float[] r0 = r6.values
            r0 = r0[r3]
            float r0 = -r0
            float[] r3 = r6.values
            r1 = r3[r1]
            float r1 = -r1
            r3 = 180(0xb4, float:2.52E-43)
            goto L45
        L3a:
            float[] r0 = r6.values
            r0 = r0[r1]
            float r0 = -r0
            float[] r1 = r6.values
            r1 = r1[r3]
            r3 = 90
        L45:
            int r4 = org.libsdl.app.SDLActivity.mCurrentRotation
            if (r3 == r4) goto L4e
            org.libsdl.app.SDLActivity.mCurrentRotation = r3
            org.libsdl.app.SDLActivity.onNativeRotationChanged(r3)
        L4e:
            float r0 = -r0
            r3 = 1092413450(0x411ce80a, float:9.80665)
            float r0 = r0 / r3
            float r1 = r1 / r3
            float[] r6 = r6.values
            r6 = r6[r2]
            float r6 = r6 / r3
            org.libsdl.app.SDLActivity.onNativeAccel(r0, r1, r6)
        L5c:
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
            r19 = this;
            r0 = r19
            r1 = r21
            int r8 = r21.getDeviceId()
            int r9 = r21.getPointerCount()
            int r10 = r21.getActionMasked()
            r11 = 5
            r12 = 0
            r13 = 6
            if (r10 == r13) goto L1a
            if (r10 != r11) goto L18
            goto L1a
        L18:
            r14 = r12
            goto L1f
        L1a:
            int r2 = r21.getActionIndex()
            r14 = r2
        L1f:
            int r2 = r1.getToolType(r14)
            r3 = 3
            r15 = 1
            if (r2 != r3) goto L40
            int r2 = r21.getButtonState()
            org.libsdl.app.SDLGenericMotionListener_API14 r3 = org.libsdl.app.SDLActivity.getMotionListener()
            float r4 = r3.getEventX(r1, r14)
            float r5 = r3.getEventY(r1, r14)
            boolean r3 = r3.inRelativeMode()
            org.libsdl.app.SDLActivity.onNativeMouse(r2, r10, r4, r5, r3)
            goto La3
        L40:
            r3 = 4
            r4 = 2
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r2 == r4) goto L74
            if (r2 != r3) goto L49
            goto L74
        L49:
            int r3 = r1.getPointerId(r14)
            float r2 = r1.getX(r14)
            float r6 = r0.getNormalizedX(r2)
            float r2 = r1.getY(r14)
            float r7 = r0.getNormalizedY(r2)
            float r2 = r1.getPressure(r14)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L68
            r16 = r5
            goto L6a
        L68:
            r16 = r2
        L6a:
            r2 = r8
            r4 = r10
            r5 = r6
            r6 = r7
            r7 = r16
            org.libsdl.app.SDLActivity.onNativeTouch(r2, r3, r4, r5, r6, r7)
            goto La3
        L74:
            int r6 = r1.getPointerId(r14)
            float r7 = r1.getX(r14)
            float r16 = r1.getY(r14)
            float r17 = r1.getPressure(r14)
            int r18 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r18 <= 0) goto L8a
            r17 = r5
        L8a:
            int r5 = r21.getButtonState()
            int r3 = r5 >> 4
            if (r2 != r4) goto L94
            r2 = r12
            goto L96
        L94:
            r2 = 30
        L96:
            int r2 = r15 << r2
            r3 = r3 | r2
            r2 = r6
            r4 = r10
            r5 = r7
            r6 = r16
            r7 = r17
            org.libsdl.app.SDLActivity.onNativePen(r2, r3, r4, r5, r6, r7)
        La3:
            if (r10 == r13) goto Lac
            if (r10 != r11) goto La8
            goto Lac
        La8:
            int r14 = r14 + 1
            if (r14 < r9) goto L1f
        Lac:
            return r15
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r8, int r9, int r10, int r11) {
            r7 = this;
            java.lang.String r8 = "SDL"
            java.lang.String r9 = "surfaceChanged()"
            android.util.Log.v(r8, r9)
            org.libsdl.app.SDLActivity r8 = org.libsdl.app.SDLActivity.mSingleton
            if (r8 != 0) goto Lc
            return
        Lc:
            float r8 = (float) r10
            r7.mWidth = r8
            float r8 = (float) r11
            r7.mHeight = r8
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch: java.lang.Exception -> L27
            r8.<init>()     // Catch: java.lang.Exception -> L27
            android.view.Display r9 = r7.mDisplay     // Catch: java.lang.Exception -> L27
            r9.getRealMetrics(r8)     // Catch: java.lang.Exception -> L27
            int r9 = r8.widthPixels     // Catch: java.lang.Exception -> L27
            int r0 = r8.heightPixels     // Catch: java.lang.Exception -> L28
            int r8 = r8.densityDpi     // Catch: java.lang.Exception -> L29
            float r8 = (float) r8
            r1 = 1126170624(0x43200000, float:160.0)
            float r8 = r8 / r1
            goto L2b
        L27:
            r9 = r10
        L28:
            r0 = r11
        L29:
            r8 = 1065353216(0x3f800000, float:1.0)
        L2b:
            r5 = r8
            r3 = r9
            r4 = r0
            android.content.Context r8 = org.libsdl.app.SDLActivity.getContext()
            monitor-enter(r8)
            android.content.Context r9 = org.libsdl.app.SDLActivity.getContext()     // Catch: java.lang.Throwable -> Lee
            r9.notifyAll()     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r8 = "SDL"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Window size: "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r0 = "x"
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r8, r9)
            java.lang.String r8 = "SDL"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Device size: "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r0 = "x"
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r8, r9)
            android.view.Display r8 = r7.mDisplay
            float r6 = r8.getRefreshRate()
            r1 = r10
            r2 = r11
            org.libsdl.app.SDLActivity.nativeSetScreenResolution(r1, r2, r3, r4, r5, r6)
            org.libsdl.app.SDLActivity.onNativeResize()
            org.libsdl.app.SDLActivity r8 = org.libsdl.app.SDLActivity.mSingleton
            int r8 = r8.getRequestedOrientation()
            r9 = 1
            r10 = 0
            if (r8 == r9) goto La1
            r11 = 7
            if (r8 != r11) goto L93
            goto La1
        L93:
            if (r8 == 0) goto L98
            r11 = 6
            if (r8 != r11) goto Lab
        L98:
            float r8 = r7.mWidth
            float r11 = r7.mHeight
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 >= 0) goto Lab
            goto La9
        La1:
            float r8 = r7.mWidth
            float r11 = r7.mHeight
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 <= 0) goto Lab
        La9:
            r8 = r9
            goto Lac
        Lab:
            r8 = r10
        Lac:
            if (r8 == 0) goto Ld2
            float r11 = r7.mWidth
            float r0 = r7.mHeight
            float r11 = java.lang.Math.min(r11, r0)
            double r0 = (double) r11
            float r11 = r7.mWidth
            float r2 = r7.mHeight
            float r11 = java.lang.Math.max(r11, r2)
            double r2 = (double) r11
            double r2 = r2 / r0
            r0 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 >= 0) goto Ld2
            java.lang.String r8 = "SDL"
            java.lang.String r11 = "Don't skip on such aspect-ratio. Could be a square resolution."
            android.util.Log.v(r8, r11)
            r8 = r10
        Ld2:
            if (r8 == 0) goto Ld5
            r8 = r10
        Ld5:
            if (r8 == 0) goto Le1
            java.lang.String r8 = "SDL"
            java.lang.String r9 = "Skip .. Surface is not ready."
            android.util.Log.v(r8, r9)
            r7.mIsSurfaceReady = r10
            return
        Le1:
            org.libsdl.app.SDLActivity.onNativeSurfaceChanged()
            r7.mIsSurfaceReady = r9
            org.libsdl.app.SDLActivity$NativeState r8 = org.libsdl.app.SDLActivity.NativeState.RESUMED
            org.libsdl.app.SDLActivity.mNextNativeState = r8
            org.libsdl.app.SDLActivity.handleNativeState()
            return
        Lee:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lee
            throw r9
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r2) {
            r1 = this;
            java.lang.String r2 = "SDL"
            java.lang.String r0 = "surfaceCreated()"
            android.util.Log.v(r2, r0)
            org.libsdl.app.SDLActivity.onNativeSurfaceCreated()
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r2) {
            r1 = this;
            java.lang.String r2 = "SDL"
            java.lang.String r0 = "surfaceDestroyed()"
            android.util.Log.v(r2, r0)
            org.libsdl.app.SDLActivity$NativeState r2 = org.libsdl.app.SDLActivity.NativeState.PAUSED
            org.libsdl.app.SDLActivity.mNextNativeState = r2
            org.libsdl.app.SDLActivity.handleNativeState()
            r2 = 0
            r1.mIsSurfaceReady = r2
            org.libsdl.app.SDLActivity.onNativeSurfaceDestroyed()
            return
    }
}
