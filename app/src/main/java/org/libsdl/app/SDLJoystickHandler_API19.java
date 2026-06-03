package org.libsdl.app;

/* JADX INFO: compiled from: SDLControllerManager.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLJoystickHandler_API19 extends org.libsdl.app.SDLJoystickHandler_API16 {
    SDLJoystickHandler_API19() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.libsdl.app.SDLJoystickHandler_API16
    public int getAxisMask(java.util.List<android.view.InputDevice.MotionRange> r7) {
            r6 = this;
            int r0 = r7.size()
            r1 = 2
            r2 = 0
            if (r0 < r1) goto La
            r0 = 3
            goto Lb
        La:
            r0 = r2
        Lb:
            int r1 = r7.size()
            r3 = 4
            if (r1 < r3) goto L14
            r0 = r0 | 12
        L14:
            int r1 = r7.size()
            r3 = 6
            if (r1 < r3) goto L1d
            r0 = r0 | 48
        L1d:
            java.util.Iterator r7 = r7.iterator()
            r1 = r2
        L22:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r7.next()
            android.view.InputDevice$MotionRange r3 = (android.view.InputDevice.MotionRange) r3
            int r3 = r3.getAxis()
            r4 = 1
            r5 = 11
            if (r3 != r5) goto L39
            r2 = r4
            goto L22
        L39:
            if (r3 <= r5) goto L22
            r5 = 14
            if (r3 >= r5) goto L22
            r1 = r4
            goto L22
        L41:
            if (r2 == 0) goto L49
            if (r1 == 0) goto L49
            r7 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r7
        L49:
            return r0
    }

    @Override // org.libsdl.app.SDLJoystickHandler_API16
    public int getButtonMask(android.view.InputDevice r6) {
            r5 = this;
            r0 = 38
            int[] r1 = new int[r0]
            r1 = {x0020: FILL_ARRAY_DATA , data: [96, 97, 99, 100, 4, 82, 110, 108, 106, 107, 102, 103, 19, 20, 21, 22, 109, 23, 104, 105, 98, 101, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203} // fill-array
            int[] r2 = new int[r0]
            r2 = {x0070: FILL_ARRAY_DATA , data: [1, 2, 4, 8, 16, 64, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 16, 1, 32768, 65536, 131072, 262144, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, -2147483648, -1, -1, -1, -1} // fill-array
            boolean[] r6 = r6.hasKeys(r1)
            r1 = 0
            r3 = r1
        L12:
            if (r1 >= r0) goto L1e
            boolean r4 = r6[r1]
            if (r4 == 0) goto L1b
            r4 = r2[r1]
            r3 = r3 | r4
        L1b:
            int r1 = r1 + 1
            goto L12
        L1e:
            return r3
    }

    @Override // org.libsdl.app.SDLJoystickHandler_API16
    public int getProductId(android.view.InputDevice r1) {
            r0 = this;
            int r1 = r1.getProductId()
            return r1
    }

    @Override // org.libsdl.app.SDLJoystickHandler_API16
    public int getVendorId(android.view.InputDevice r1) {
            r0 = this;
            int r1 = r1.getVendorId()
            return r1
    }
}
