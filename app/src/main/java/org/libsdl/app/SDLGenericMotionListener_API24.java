package org.libsdl.app;

/* JADX INFO: compiled from: SDLControllerManager.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLGenericMotionListener_API24 extends org.libsdl.app.SDLGenericMotionListener_API14 {
    private boolean mRelativeModeEnabled;

    SDLGenericMotionListener_API24() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    public float getEventX(android.view.MotionEvent r3, int r4) {
            r2 = this;
            boolean r0 = r2.mRelativeModeEnabled
            if (r0 == 0) goto L12
            int r0 = r3.getToolType(r4)
            r1 = 3
            if (r0 != r1) goto L12
            r0 = 27
            float r3 = r3.getAxisValue(r0, r4)
            return r3
        L12:
            float r3 = r3.getX(r4)
            return r3
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    public float getEventY(android.view.MotionEvent r3, int r4) {
            r2 = this;
            boolean r0 = r2.mRelativeModeEnabled
            if (r0 == 0) goto L12
            int r0 = r3.getToolType(r4)
            r1 = 3
            if (r0 != r1) goto L12
            r0 = 28
            float r3 = r3.getAxisValue(r0, r4)
            return r3
        L12:
            float r3 = r3.getY(r4)
            return r3
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    public boolean inRelativeMode() {
            r1 = this;
            boolean r0 = r1.mRelativeModeEnabled
            return r0
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    public boolean setRelativeMouseEnabled(boolean r1) {
            r0 = this;
            r0.mRelativeModeEnabled = r1
            r1 = 1
            return r1
    }

    @Override // org.libsdl.app.SDLGenericMotionListener_API14
    public boolean supportsRelativeMouse() {
            r1 = this;
            r0 = 1
            return r0
    }
}
