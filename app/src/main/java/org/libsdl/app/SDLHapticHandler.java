package org.libsdl.app;

/* JADX INFO: compiled from: SDLControllerManager.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLHapticHandler {
    private final java.util.ArrayList<org.libsdl.app.SDLHapticHandler.SDLHaptic> mHaptics;

    /* JADX INFO: compiled from: SDLControllerManager.java */
    static class SDLHaptic {
        public int device_id;
        public java.lang.String name;
        public android.os.Vibrator vib;

        SDLHaptic() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public SDLHapticHandler() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mHaptics = r0
            return
    }

    protected org.libsdl.app.SDLHapticHandler.SDLHaptic getHaptic(int r4) {
            r3 = this;
            java.util.ArrayList<org.libsdl.app.SDLHapticHandler$SDLHaptic> r0 = r3.mHaptics
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            org.libsdl.app.SDLHapticHandler$SDLHaptic r1 = (org.libsdl.app.SDLHapticHandler.SDLHaptic) r1
            int r2 = r1.device_id
            if (r2 != r4) goto L6
            return r1
        L17:
            r4 = 0
            return r4
    }

    public void pollHapticDevices() {
            r6 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.Context r0 = org.libsdl.app.SDL.getContext()
            java.lang.String r1 = "vibrator"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r1 = 0
            r2 = 999999(0xf423f, float:1.401297E-39)
            if (r0 == 0) goto L3f
            boolean r3 = r0.hasVibrator()
            if (r3 == 0) goto L40
            org.libsdl.app.SDLHapticHandler$SDLHaptic r4 = r6.getHaptic(r2)
            if (r4 != 0) goto L40
            org.libsdl.app.SDLHapticHandler$SDLHaptic r4 = new org.libsdl.app.SDLHapticHandler$SDLHaptic
            r4.<init>()
            r4.device_id = r2
            java.lang.String r5 = "VIBRATOR_SERVICE"
            r4.name = r5
            r4.vib = r0
            java.util.ArrayList<org.libsdl.app.SDLHapticHandler$SDLHaptic> r0 = r6.mHaptics
            r0.add(r4)
            int r0 = r4.device_id
            java.lang.String r4 = r4.name
            org.libsdl.app.SDLControllerManager.nativeAddHaptic(r0, r4)
            goto L40
        L3f:
            r3 = r1
        L40:
            java.util.ArrayList<org.libsdl.app.SDLHapticHandler$SDLHaptic> r0 = r6.mHaptics
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L47:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r0.next()
            org.libsdl.app.SDLHapticHandler$SDLHaptic r5 = (org.libsdl.app.SDLHapticHandler.SDLHaptic) r5
            int r5 = r5.device_id
            if (r5 != r2) goto L59
            if (r3 != 0) goto L47
        L59:
            if (r4 != 0) goto L60
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L60:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            goto L47
        L68:
            if (r4 == 0) goto L9f
            java.util.Iterator r0 = r4.iterator()
        L6e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            org.libsdl.app.SDLControllerManager.nativeRemoveHaptic(r2)
            r3 = r1
        L82:
            java.util.ArrayList<org.libsdl.app.SDLHapticHandler$SDLHaptic> r4 = r6.mHaptics
            int r4 = r4.size()
            if (r3 >= r4) goto L6e
            java.util.ArrayList<org.libsdl.app.SDLHapticHandler$SDLHaptic> r4 = r6.mHaptics
            java.lang.Object r4 = r4.get(r3)
            org.libsdl.app.SDLHapticHandler$SDLHaptic r4 = (org.libsdl.app.SDLHapticHandler.SDLHaptic) r4
            int r4 = r4.device_id
            if (r4 != r2) goto L9c
            java.util.ArrayList<org.libsdl.app.SDLHapticHandler$SDLHaptic> r2 = r6.mHaptics
            r2.remove(r3)
            goto L6e
        L9c:
            int r3 = r3 + 1
            goto L82
        L9f:
            return
    }

    public void rumble(int r1, float r2, float r3, int r4) {
            r0 = this;
            return
    }

    public void run(int r1, float r2, int r3) {
            r0 = this;
            org.libsdl.app.SDLHapticHandler$SDLHaptic r1 = r0.getHaptic(r1)
            if (r1 == 0) goto Lc
            android.os.Vibrator r1 = r1.vib
            long r2 = (long) r3
            r1.vibrate(r2)
        Lc:
            return
    }

    public void stop(int r1) {
            r0 = this;
            org.libsdl.app.SDLHapticHandler$SDLHaptic r1 = r0.getHaptic(r1)
            if (r1 == 0) goto Lb
            android.os.Vibrator r1 = r1.vib
            r1.cancel()
        Lb:
            return
    }
}
