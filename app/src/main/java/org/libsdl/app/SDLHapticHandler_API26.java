package org.libsdl.app;

/* JADX INFO: compiled from: SDLControllerManager.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLHapticHandler_API26 extends org.libsdl.app.SDLHapticHandler {
    SDLHapticHandler_API26() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.libsdl.app.SDLHapticHandler
    public void run(int r4, float r5, int r6) {
            r3 = this;
            org.libsdl.app.SDLHapticHandler$SDLHaptic r0 = r3.getHaptic(r4)
            if (r0 == 0) goto L33
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto Lf
            r3.stop(r4)
            return
        Lf:
            r1 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 * r1
            int r5 = java.lang.Math.round(r5)
            r1 = 255(0xff, float:3.57E-43)
            if (r5 <= r1) goto L1b
            r5 = r1
        L1b:
            r1 = 1
            if (r5 >= r1) goto L22
            r3.stop(r4)
            return
        L22:
            android.os.Vibrator r4 = r0.vib     // Catch: java.lang.Exception -> L2d
            long r1 = (long) r6     // Catch: java.lang.Exception -> L2d
            android.os.VibrationEffect r5 = android.os.VibrationEffect.createOneShot(r1, r5)     // Catch: java.lang.Exception -> L2d
            r4.vibrate(r5)     // Catch: java.lang.Exception -> L2d
            goto L33
        L2d:
            android.os.Vibrator r4 = r0.vib
            long r5 = (long) r6
            r4.vibrate(r5)
        L33:
            return
    }
}
