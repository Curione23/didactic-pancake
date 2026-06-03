package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
public class SDLDummyEdit extends android.view.View implements android.view.View.OnKeyListener {
    android.view.inputmethod.InputConnection ic;
    int input_type;

    public SDLDummyEdit(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.setFocusableInTouchMode(r1)
            r0.setFocusable(r1)
            r0.setOnKeyListener(r0)
            return
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            org.libsdl.app.SDLInputConnection r0 = new org.libsdl.app.SDLInputConnection
            r1 = 1
            r0.<init>(r2, r1)
            r2.ic = r0
            int r0 = r2.input_type
            r3.inputType = r0
            r0 = 301989888(0x12000000, float:4.038968E-28)
            r3.imeOptions = r0
            android.view.inputmethod.InputConnection r3 = r2.ic
            return r3
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = r1.ic
            boolean r2 = org.libsdl.app.SDLActivity.handleKeyEvent(r2, r3, r4, r0)
            return r2
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
            r2 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != r1) goto L19
            r0 = 4
            if (r3 != r0) goto L19
            org.libsdl.app.SDLDummyEdit r0 = org.libsdl.app.SDLActivity.mTextEdit
            if (r0 == 0) goto L19
            org.libsdl.app.SDLDummyEdit r0 = org.libsdl.app.SDLActivity.mTextEdit
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L19
            org.libsdl.app.SDLActivity.onNativeKeyboardFocusLost()
        L19:
            boolean r3 = super.onKeyPreIme(r3, r4)
            return r3
    }

    public void setInputType(int r1) {
            r0 = this;
            r0.input_type = r1
            return
    }
}
