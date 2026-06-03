package org.libsdl.app;

/* JADX INFO: compiled from: SDLControllerManager.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLJoystickHandler_API16 extends org.libsdl.app.SDLJoystickHandler {
    private static boolean firstPollDone = false;
    private final java.util.ArrayList<org.libsdl.app.SDLJoystickHandler_API16.SDLJoystick> mJoysticks;

    /* JADX INFO: compiled from: SDLControllerManager.java */
    static class RangeComparator implements java.util.Comparator<android.view.InputDevice.MotionRange> {
        RangeComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(android.view.InputDevice.MotionRange r4, android.view.InputDevice.MotionRange r5) {
                r3 = this;
                int r4 = r4.getAxis()
                int r5 = r5.getAxis()
                r0 = 23
                r1 = 22
                if (r4 != r1) goto L10
                r4 = r0
                goto L13
            L10:
                if (r4 != r0) goto L13
                r4 = r1
            L13:
                if (r5 != r1) goto L17
                r5 = r0
                goto L1a
            L17:
                if (r5 != r0) goto L1a
                r5 = r1
            L1a:
                r0 = 14
                r1 = 13
                r2 = 11
                if (r4 != r2) goto L24
                r4 = r1
                goto L2a
            L24:
                if (r4 <= r2) goto L2a
                if (r4 >= r0) goto L2a
                int r4 = r4 + (-1)
            L2a:
                if (r5 != r2) goto L2e
                r5 = r1
                goto L34
            L2e:
                if (r5 <= r2) goto L34
                if (r5 >= r0) goto L34
                int r5 = r5 + (-1)
            L34:
                int r4 = r4 - r5
                return r4
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.view.InputDevice.MotionRange r1, android.view.InputDevice.MotionRange r2) {
                r0 = this;
                android.view.InputDevice$MotionRange r1 = (android.view.InputDevice.MotionRange) r1
                android.view.InputDevice$MotionRange r2 = (android.view.InputDevice.MotionRange) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: SDLControllerManager.java */
    static class SDLJoystick {
        public java.util.ArrayList<android.view.InputDevice.MotionRange> axes;
        public java.lang.String desc;
        public int device_id;
        public java.util.ArrayList<android.view.InputDevice.MotionRange> hats;
        public java.lang.String name;

        SDLJoystick() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    public SDLJoystickHandler_API16() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mJoysticks = r0
            return
    }

    static /* synthetic */ void lambda$pollInputDevices$0(int r0, java.lang.String r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9) {
            org.libsdl.app.SDLControllerManager.nativeAddJoystick(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    static /* synthetic */ void lambda$pollInputDevices$1(int r0) {
            org.libsdl.app.SDLControllerManager.nativeRemoveJoystick(r0)
            return
    }

    public int getAxisMask(java.util.List<android.view.InputDevice.MotionRange> r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    public int getButtonMask(android.view.InputDevice r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    protected org.libsdl.app.SDLJoystickHandler_API16.SDLJoystick getJoystick(int r4) {
            r3 = this;
            java.util.ArrayList<org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick> r0 = r3.mJoysticks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick r1 = (org.libsdl.app.SDLJoystickHandler_API16.SDLJoystick) r1
            int r2 = r1.device_id
            if (r2 != r4) goto L6
            return r1
        L17:
            r4 = 0
            return r4
    }

    public java.lang.String getJoystickDescriptor(android.view.InputDevice r3) {
            r2 = this;
            java.lang.String r0 = r3.getDescriptor()
            if (r0 == 0) goto Ld
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r3 = r3.getName()
            return r3
    }

    public int getProductId(android.view.InputDevice r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int getVendorId(android.view.InputDevice r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.libsdl.app.SDLJoystickHandler
    public boolean handleMotionEvent(android.view.MotionEvent r10) {
            r9 = this;
            int r0 = r10.getActionIndex()
            int r1 = r10.getActionMasked()
            r2 = 1
            r3 = 2
            if (r1 != r3) goto L84
            int r1 = r10.getDeviceId()
            org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick r1 = r9.getJoystick(r1)
            if (r1 == 0) goto L84
            r4 = 0
            r5 = r4
        L18:
            java.util.ArrayList<android.view.InputDevice$MotionRange> r6 = r1.axes
            int r6 = r6.size()
            if (r5 >= r6) goto L48
            java.util.ArrayList<android.view.InputDevice$MotionRange> r6 = r1.axes
            java.lang.Object r6 = r6.get(r5)
            android.view.InputDevice$MotionRange r6 = (android.view.InputDevice.MotionRange) r6
            int r7 = r6.getAxis()
            float r7 = r10.getAxisValue(r7, r0)
            float r8 = r6.getMin()
            float r7 = r7 - r8
            float r6 = r6.getRange()
            float r7 = r7 / r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r6
            int r6 = r1.device_id
            org.libsdl.app.SDLControllerManager.onNativeJoy(r6, r5, r7)
            int r5 = r5 + 1
            goto L18
        L48:
            java.util.ArrayList<android.view.InputDevice$MotionRange> r5 = r1.hats
            int r5 = r5.size()
            int r5 = r5 / r3
            if (r4 >= r5) goto L84
            java.util.ArrayList<android.view.InputDevice$MotionRange> r5 = r1.hats
            int r6 = r4 * 2
            java.lang.Object r5 = r5.get(r6)
            android.view.InputDevice$MotionRange r5 = (android.view.InputDevice.MotionRange) r5
            int r5 = r5.getAxis()
            float r5 = r10.getAxisValue(r5, r0)
            int r5 = java.lang.Math.round(r5)
            java.util.ArrayList<android.view.InputDevice$MotionRange> r7 = r1.hats
            int r6 = r6 + r2
            java.lang.Object r6 = r7.get(r6)
            android.view.InputDevice$MotionRange r6 = (android.view.InputDevice.MotionRange) r6
            int r6 = r6.getAxis()
            float r6 = r10.getAxisValue(r6, r0)
            int r6 = java.lang.Math.round(r6)
            int r7 = r1.device_id
            org.libsdl.app.SDLControllerManager.onNativeHat(r7, r4, r5, r6)
            int r4 = r4 + 1
            goto L48
        L84:
            return r2
    }

    @Override // org.libsdl.app.SDLJoystickHandler
    public void pollInputDevices() {
            r21 = this;
            r0 = r21
            boolean r1 = org.libsdl.app.SDLJoystickHandler_API16.firstPollDone
            r2 = 1
            if (r1 != 0) goto L10
            java.lang.String r1 = "SDL"
            java.lang.String r3 = "SDL input device poll started"
            android.util.Log.i(r1, r3)
            org.libsdl.app.SDLJoystickHandler_API16.firstPollDone = r2
        L10:
            android.os.Looper r1 = android.os.Looper.myLooper()
            r3 = 0
            if (r1 == 0) goto L19
            r1 = r2
            goto L1a
        L19:
            r1 = r3
        L1a:
            int[] r4 = android.view.InputDevice.getDeviceIds()
            int r5 = r4.length
            r6 = r3
        L20:
            if (r6 >= r5) goto L101
            r7 = r4[r6]
            boolean r8 = org.libsdl.app.SDLControllerManager.isDeviceSDLJoystick(r7)
            if (r8 == 0) goto Lfd
            org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick r8 = r0.getJoystick(r7)
            if (r8 != 0) goto Lfd
            android.view.InputDevice r8 = android.view.InputDevice.getDevice(r7)
            org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick r9 = new org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick
            r9.<init>()
            r9.device_id = r7
            java.lang.String r7 = r8.getName()
            r9.name = r7
            java.lang.String r7 = r0.getJoystickDescriptor(r8)
            r9.desc = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r9.axes = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r9.hats = r7
            java.util.List r7 = r8.getMotionRanges()
            org.libsdl.app.SDLJoystickHandler_API16$RangeComparator r10 = new org.libsdl.app.SDLJoystickHandler_API16$RangeComparator
            r10.<init>()
            java.util.Collections.sort(r7, r10)
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L95
            java.lang.Object r10 = r7.next()
            android.view.InputDevice$MotionRange r10 = (android.view.InputDevice.MotionRange) r10
            int r11 = r10.getSource()
            r12 = 16
            r11 = r11 & r12
            if (r11 == 0) goto L65
            int r11 = r10.getAxis()
            r13 = 15
            if (r11 == r13) goto L8f
            int r11 = r10.getAxis()
            if (r11 != r12) goto L89
            goto L8f
        L89:
            java.util.ArrayList<android.view.InputDevice$MotionRange> r11 = r9.axes
            r11.add(r10)
            goto L65
        L8f:
            java.util.ArrayList<android.view.InputDevice$MotionRange> r11 = r9.hats
            r11.add(r10)
            goto L65
        L95:
            int r7 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r7 < r10) goto La9
            android.os.VibratorManager r7 = r8.getVibratorManager()
            int[] r7 = r7.getVibratorIds()
            int r7 = r7.length
            if (r7 <= 0) goto La9
            r20 = r2
            goto Lab
        La9:
            r20 = r3
        Lab:
            java.util.ArrayList<org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick> r7 = r0.mJoysticks
            r7.add(r9)
            int r11 = r9.device_id
            java.lang.String r12 = r9.name
            java.lang.String r13 = r9.desc
            int r14 = r0.getVendorId(r8)
            int r15 = r0.getProductId(r8)
            int r16 = r0.getButtonMask(r8)
            java.util.ArrayList<android.view.InputDevice$MotionRange> r7 = r9.axes
            int r17 = r7.size()
            java.util.ArrayList<android.view.InputDevice$MotionRange> r7 = r9.axes
            int r18 = r0.getAxisMask(r7)
            java.util.ArrayList<android.view.InputDevice$MotionRange> r7 = r9.hats
            int r7 = r7.size()
            int r19 = r7 / 2
            if (r1 == 0) goto Leb
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            org.libsdl.app.SDLControllerManager.nativeAddJoystick(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto Lfd
        Leb:
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>(r8)
            org.libsdl.app.SDLJoystickHandler_API16$$ExternalSyntheticLambda0 r8 = new org.libsdl.app.SDLJoystickHandler_API16$$ExternalSyntheticLambda0
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r7.post(r8)
        Lfd:
            int r6 = r6 + 1
            goto L20
        L101:
            java.util.ArrayList<org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick> r2 = r0.mJoysticks
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L108:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L134
            java.lang.Object r6 = r2.next()
            org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick r6 = (org.libsdl.app.SDLJoystickHandler_API16.SDLJoystick) r6
            int r6 = r6.device_id
            r7 = r3
        L117:
            int r8 = r4.length
            if (r7 >= r8) goto L122
            r8 = r4[r7]
            if (r6 != r8) goto L11f
            goto L122
        L11f:
            int r7 = r7 + 1
            goto L117
        L122:
            int r8 = r4.length
            if (r7 != r8) goto L108
            if (r5 != 0) goto L12c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L12c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L108
        L134:
            if (r5 == 0) goto L180
            java.util.Iterator r2 = r5.iterator()
        L13a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L180
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r3
        L14b:
            java.util.ArrayList<org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick> r6 = r0.mJoysticks
            int r6 = r6.size()
            if (r5 >= r6) goto L168
            java.util.ArrayList<org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick> r6 = r0.mJoysticks
            java.lang.Object r6 = r6.get(r5)
            org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick r6 = (org.libsdl.app.SDLJoystickHandler_API16.SDLJoystick) r6
            int r6 = r6.device_id
            if (r6 != r4) goto L165
            java.util.ArrayList<org.libsdl.app.SDLJoystickHandler_API16$SDLJoystick> r6 = r0.mJoysticks
            r6.remove(r5)
            goto L168
        L165:
            int r5 = r5 + 1
            goto L14b
        L168:
            if (r1 == 0) goto L16e
            org.libsdl.app.SDLControllerManager.nativeRemoveJoystick(r4)
            goto L13a
        L16e:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            org.libsdl.app.SDLJoystickHandler_API16$$ExternalSyntheticLambda1 r6 = new org.libsdl.app.SDLJoystickHandler_API16$$ExternalSyntheticLambda1
            r6.<init>(r4)
            r5.post(r6)
            goto L13a
        L180:
            return
    }
}
