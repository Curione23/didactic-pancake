package org.libsdl.app;

/* JADX INFO: compiled from: SDLControllerManager.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLGenericMotionListener_API14 implements android.view.View.OnGenericMotionListener {
    SDLGenericMotionListener_API14() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean checkRelativeEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = r0.inRelativeMode()
            return r1
    }

    public float getEventX(android.view.MotionEvent r1, int r2) {
            r0 = this;
            float r1 = r1.getX(r2)
            return r1
    }

    public float getEventY(android.view.MotionEvent r1, int r2) {
            r0 = this;
            float r1 = r1.getY(r2)
            return r1
    }

    public boolean inRelativeMode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(android.view.View r13, android.view.MotionEvent r14) {
            r12 = this;
            int r13 = r14.getSource()
            r0 = 16777232(0x1000010, float:2.3509932E-38)
            if (r13 != r0) goto Le
            boolean r13 = org.libsdl.app.SDLControllerManager.handleJoystickMotionEvent(r14)
            return r13
        Le:
            int r13 = r14.getActionMasked()
            int r6 = r14.getPointerCount()
            r7 = 0
            r0 = r7
            r8 = r0
        L19:
            if (r8 >= r6) goto L87
            int r1 = r14.getToolType(r8)
            r2 = 3
            r3 = 10
            r4 = 9
            r5 = 7
            r9 = 1
            if (r1 != r2) goto L4c
            if (r13 == r5) goto L3b
            r1 = 8
            if (r13 == r1) goto L2f
            goto L84
        L2f:
            float r0 = r14.getAxisValue(r3, r8)
            float r1 = r14.getAxisValue(r4, r8)
            org.libsdl.app.SDLActivity.onNativeMouse(r7, r13, r0, r1, r7)
            goto L4a
        L3b:
            float r0 = r12.getEventX(r14, r8)
            float r1 = r12.getEventY(r14, r8)
            boolean r2 = r12.checkRelativeEvent(r14)
            org.libsdl.app.SDLActivity.onNativeMouse(r7, r13, r0, r1, r2)
        L4a:
            r0 = r9
            goto L84
        L4c:
            r2 = 4
            r10 = 2
            if (r1 == r10) goto L52
            if (r1 != r2) goto L84
        L52:
            if (r13 == r5) goto L59
            if (r13 == r4) goto L59
            if (r13 == r3) goto L59
            goto L84
        L59:
            float r3 = r14.getX(r8)
            float r4 = r14.getY(r8)
            float r0 = r14.getPressure(r8)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 <= 0) goto L6c
            goto L6d
        L6c:
            r5 = r0
        L6d:
            int r0 = r14.getButtonState()
            int r0 = r0 >> r2
            if (r1 != r10) goto L76
            r1 = r7
            goto L78
        L76:
            r1 = 30
        L78:
            int r1 = r9 << r1
            r1 = r1 | r0
            int r0 = r14.getPointerId(r8)
            r2 = r13
            org.libsdl.app.SDLActivity.onNativePen(r0, r1, r2, r3, r4, r5)
            goto L4a
        L84:
            int r8 = r8 + 1
            goto L19
        L87:
            return r0
    }

    public void reclaimRelativeMouseModeIfNeeded() {
            r0 = this;
            return
    }

    public boolean setRelativeMouseEnabled(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean supportsRelativeMouse() {
            r1 = this;
            r0 = 0
            return r0
    }
}
