package org.libsdl.app;

/* JADX INFO: compiled from: SDLControllerManager.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLGenericMotionListener_API26 extends org.libsdl.app.SDLGenericMotionListener_API24 {
    private boolean mRelativeModeEnabled;

    SDLGenericMotionListener_API26() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    public boolean checkRelativeEvent(android.view.MotionEvent r2) {
            r1 = this;
            int r2 = r2.getSource()
            r0 = 131076(0x20004, float:1.83677E-40)
            if (r2 != r0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    public float getEventX(android.view.MotionEvent r1, int r2) {
            r0 = this;
            float r1 = r1.getX(r2)
            return r1
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    public float getEventY(android.view.MotionEvent r1, int r2) {
            r0 = this;
            float r1 = r1.getY(r2)
            return r1
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    public boolean inRelativeMode() {
            r1 = this;
            boolean r0 = r1.mRelativeModeEnabled
            return r0
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    public void reclaimRelativeMouseModeIfNeeded() {
            r1 = this;
            boolean r0 = r1.mRelativeModeEnabled
            if (r0 == 0) goto L11
            boolean r0 = org.libsdl.app.SDLActivity.isDeXMode()
            if (r0 != 0) goto L11
            android.view.View r0 = org.libsdl.app.SDLActivity.getContentView()
            r0.requestPointerCapture()
        L11:
            return
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    public boolean setRelativeMouseEnabled(boolean r3) {
            r2 = this;
            boolean r0 = org.libsdl.app.SDLActivity.isDeXMode()
            if (r0 == 0) goto Lf
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Ld
            goto Lf
        Ld:
            r3 = 0
            return r3
        Lf:
            if (r3 == 0) goto L19
            android.view.View r0 = org.libsdl.app.SDLActivity.getContentView()
            r0.requestPointerCapture()
            goto L20
        L19:
            android.view.View r0 = org.libsdl.app.SDLActivity.getContentView()
            r0.releasePointerCapture()
        L20:
            r2.mRelativeModeEnabled = r3
            r3 = 1
            return r3
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API24, org.libsdl.app.SDLGenericMotionListener_API14
    public boolean supportsRelativeMouse() {
            r2 = this;
            boolean r0 = org.libsdl.app.SDLActivity.isDeXMode()
            if (r0 == 0) goto Lf
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }
}
