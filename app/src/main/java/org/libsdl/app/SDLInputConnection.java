package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
public class SDLInputConnection extends android.view.inputmethod.BaseInputConnection {
    protected java.lang.String mCommittedText;
    protected android.widget.EditText mEditText;

    public SDLInputConnection(android.view.View r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = ""
            r0.mCommittedText = r1
            android.widget.EditText r1 = new android.widget.EditText
            android.content.Context r2 = org.libsdl.app.SDL.getContext()
            r1.<init>(r2)
            r0.mEditText = r1
            return
    }

    public static native void nativeCommitText(java.lang.String r0, int r1);

    public static native void nativeGenerateScancodeForUnichar(char r0);

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence r1, int r2) {
            r0 = this;
            boolean r1 = super.commitText(r1, r2)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0.updateText()
            r1 = 1
            return r1
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int r4, int r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            if (r0 > r1) goto L17
            if (r4 <= 0) goto L17
            if (r5 != 0) goto L17
        Lb:
            int r5 = r4 + (-1)
            if (r4 <= 0) goto L16
            r4 = 8
            nativeGenerateScancodeForUnichar(r4)
            r4 = r5
            goto Lb
        L16:
            return r2
        L17:
            boolean r4 = super.deleteSurroundingText(r4, r5)
            if (r4 != 0) goto L1f
            r4 = 0
            return r4
        L1f:
            r3.updateText()
            return r2
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public android.text.Editable getEditable() {
            r1 = this;
            android.widget.EditText r0 = r1.mEditText
            android.text.Editable r0 = r0.getEditableText()
            return r0
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            int r0 = r3.getKeyCode()
            r1 = 66
            if (r0 != r1) goto L10
            boolean r0 = org.libsdl.app.SDLActivity.onNativeSoftReturnKey()
            if (r0 == 0) goto L10
            r3 = 1
            return r3
        L10:
            boolean r3 = super.sendKeyEvent(r3)
            return r3
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(java.lang.CharSequence r1, int r2) {
            r0 = this;
            boolean r1 = super.setComposingText(r1, r2)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0.updateText()
            r1 = 1
            return r1
    }

    protected void updateText() {
            r6 = this;
            android.text.Editable r0 = r6.getEditable()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            java.lang.String r2 = r6.mCommittedText
            int r2 = r2.length()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = r2
        L1b:
            if (r3 >= r1) goto L30
            java.lang.String r4 = r6.mCommittedText
            int r4 = r4.codePointAt(r3)
            int r5 = r0.codePointAt(r3)
            if (r4 == r5) goto L2a
            goto L30
        L2a:
            int r4 = java.lang.Character.charCount(r4)
            int r3 = r3 + r4
            goto L1b
        L30:
            r1 = r3
        L31:
            java.lang.String r4 = r6.mCommittedText
            int r4 = r4.length()
            if (r1 >= r4) goto L4a
            java.lang.String r4 = r6.mCommittedText
            int r4 = r4.codePointAt(r1)
            r5 = 8
            nativeGenerateScancodeForUnichar(r5)
            int r4 = java.lang.Character.charCount(r4)
            int r1 = r1 + r4
            goto L31
        L4a:
            int r1 = r0.length()
            if (r3 >= r1) goto L8b
            int r1 = r0.length()
            java.lang.CharSequence r1 = r0.subSequence(r3, r1)
            java.lang.String r1 = r1.toString()
            boolean r3 = org.libsdl.app.SDLActivity.dispatchingKeyEvent()
            if (r3 != 0) goto L88
            r3 = r2
        L63:
            int r4 = r1.length()
            if (r3 >= r4) goto L88
            int r4 = r1.codePointAt(r3)
            r5 = 10
            if (r4 != r5) goto L78
            boolean r5 = org.libsdl.app.SDLActivity.onNativeSoftReturnKey()
            if (r5 == 0) goto L78
            return
        L78:
            if (r4 <= 0) goto L82
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L82
            char r5 = (char) r4
            nativeGenerateScancodeForUnichar(r5)
        L82:
            int r4 = java.lang.Character.charCount(r4)
            int r3 = r3 + r4
            goto L63
        L88:
            nativeCommitText(r1, r2)
        L8b:
            r6.mCommittedText = r0
            return
    }
}
