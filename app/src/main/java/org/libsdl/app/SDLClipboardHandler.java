package org.libsdl.app;

/* JADX INFO: compiled from: SDLActivity.java */
/* JADX INFO: loaded from: classes2.dex */
class SDLClipboardHandler implements android.content.ClipboardManager.OnPrimaryClipChangedListener {
    protected android.content.ClipboardManager mClipMgr;

    SDLClipboardHandler() {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = org.libsdl.app.SDL.getContext()
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            r2.mClipMgr = r0
            r0.addPrimaryClipChangedListener(r2)
            return
    }

    public java.lang.String clipboardGetText() {
            r2 = this;
            android.content.ClipboardManager r0 = r2.mClipMgr
            android.content.ClipData r0 = r0.getPrimaryClip()
            if (r0 == 0) goto L1a
            r1 = 0
            android.content.ClipData$Item r0 = r0.getItemAt(r1)
            if (r0 == 0) goto L1a
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.toString()
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public boolean clipboardHasText() {
            r1 = this;
            android.content.ClipboardManager r0 = r1.mClipMgr
            boolean r0 = r0.hasPrimaryClip()
            return r0
    }

    public void clipboardSetText(java.lang.String r2) {
            r1 = this;
            android.content.ClipboardManager r0 = r1.mClipMgr
            r0.removePrimaryClipChangedListener(r1)
            r0 = 0
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r0, r2)
            android.content.ClipboardManager r0 = r1.mClipMgr
            r0.setPrimaryClip(r2)
            android.content.ClipboardManager r2 = r1.mClipMgr
            r2.addPrimaryClipChangedListener(r1)
            return
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public void onPrimaryClipChanged() {
            r0 = this;
            org.libsdl.app.SDLActivity.onNativeClipboardChanged()
            return
    }
}
