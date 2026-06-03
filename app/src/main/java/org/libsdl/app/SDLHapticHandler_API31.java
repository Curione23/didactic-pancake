package org.libsdl.app;

/* JADX INFO: compiled from: SDLControllerManager.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLHapticHandler_API31 extends org.libsdl.app.SDLHapticHandler {
    SDLHapticHandler_API31() {
            r0 = this;
            r0.<init>()
            return
    }

    private void vibrate(android.os.Vibrator r3, float r4, int r5) {
            r2 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            r3.cancel()
            return
        L9:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            r0 = 255(0xff, float:3.57E-43)
            if (r4 <= r0) goto L15
            r4 = r0
        L15:
            r0 = 1
            if (r4 >= r0) goto L1c
            r3.cancel()
            return
        L1c:
            long r0 = (long) r5
            android.os.VibrationEffect r4 = android.os.VibrationEffect.createOneShot(r0, r4)     // Catch: java.lang.Exception -> L25
            r3.vibrate(r4)     // Catch: java.lang.Exception -> L25
            goto L28
        L25:
            r3.vibrate(r0)
        L28:
            return
    }

    @Override // org.libsdl.app.SDLHapticHandler
    public void rumble(int r6, float r7, float r8, int r9) {
            r5 = this;
            android.view.InputDevice r6 = android.view.InputDevice.getDevice(r6)
            if (r6 != 0) goto L7
            return
        L7:
            android.os.VibratorManager r6 = r6.getVibratorManager()
            int[] r0 = r6.getVibratorIds()
            int r1 = r0.length
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 < r2) goto L28
            r1 = r0[r3]
            android.os.Vibrator r1 = r6.getVibrator(r1)
            r5.vibrate(r1, r7, r9)
            r7 = r0[r4]
            android.os.Vibrator r6 = r6.getVibrator(r7)
            r5.vibrate(r6, r8, r9)
            goto L3d
        L28:
            int r1 = r0.length
            if (r1 != r4) goto L3d
            r1 = 1058642330(0x3f19999a, float:0.6)
            float r7 = r7 * r1
            r1 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r1
            float r7 = r7 + r8
            r8 = r0[r3]
            android.os.Vibrator r6 = r6.getVibrator(r8)
            r5.vibrate(r6, r7, r9)
        L3d:
            return
    }

    @Override // org.libsdl.app.SDLHapticHandler
    public void run(int r1, float r2, int r3) {
            r0 = this;
            org.libsdl.app.SDLHapticHandler$SDLHaptic r1 = r0.getHaptic(r1)
            if (r1 == 0) goto Lb
            android.os.Vibrator r1 = r1.vib
            r0.vibrate(r1, r2, r3)
        Lb:
            return
    }
}
