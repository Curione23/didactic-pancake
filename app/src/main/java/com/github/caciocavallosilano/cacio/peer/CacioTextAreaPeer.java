package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextAreaPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextAreaPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextAreaPeer.class */
class CacioTextAreaPeer extends com.github.caciocavallosilano.cacio.peer.CacioComponentPeer<java.awt.TextArea, javax.swing.JScrollPane> implements java.awt.peer.TextAreaPeer {
    private javax.swing.JTextArea textArea;

    public CacioTextAreaPeer(java.awt.TextArea r5, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    javax.swing.JScrollPane initSwingComponent() {
            r6 = this;
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.TextArea r0 = (java.awt.TextArea) r0
            r7 = r0
            r0 = r6
            javax.swing.JTextArea r1 = new javax.swing.JTextArea
            r2 = r1
            r2.<init>()
            r0.textArea = r1
            r0 = r7
            int r0 = r0.getScrollbarVisibility()
            r8 = r0
            r0 = r8
            r1 = 3
            if (r0 != r1) goto L27
            r0 = 31
            r9 = r0
            r0 = 21
            r10 = r0
            goto L4c
        L27:
            r0 = r8
            r1 = 2
            if (r0 != r1) goto L36
            r0 = 32
            r9 = r0
            r0 = 21
            r10 = r0
            goto L4c
        L36:
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L45
            r0 = 31
            r9 = r0
            r0 = 22
            r10 = r0
            goto L4c
        L45:
            r0 = 32
            r9 = r0
            r0 = 22
            r10 = r0
        L4c:
            javax.swing.JScrollPane r0 = new javax.swing.JScrollPane
            r1 = r0
            r2 = r6
            javax.swing.JTextArea r2 = r2.textArea
            r3 = r10
            r4 = r9
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r11
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void postInitSwingComponent() {
            r3 = this;
            r0 = r3
            super.postInitSwingComponent()
            r0 = r3
            r1 = r3
            java.awt.Component r1 = r1.getAWTComponent()
            java.awt.TextArea r1 = (java.awt.TextArea) r1
            java.lang.String r1 = r1.getText()
            r0.setText(r1)
            return
    }

    public java.awt.Dimension getMinimumSize(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.awt.Dimension r0 = r0.getPreferredSize(r1, r2)
            return r0
    }

    public java.awt.Dimension getPreferredSize(int r5, int r6) {
            r4 = this;
            r0 = r4
            javax.swing.JTextArea r0 = r0.textArea
            java.awt.Font r0 = r0.getFont()
            r7 = r0
            r0 = r4
            javax.swing.JTextArea r0 = r0.textArea
            r1 = r7
            java.awt.FontMetrics r0 = r0.getFontMetrics(r1)
            r8 = r0
            r0 = r8
            r1 = 109(0x6d, float:1.53E-43)
            int r0 = r0.charWidth(r1)
            r1 = r6
            int r0 = r0 * r1
            r9 = r0
            r0 = r8
            int r0 = r0.getHeight()
            r1 = r5
            int r0 = r0 * r1
            r10 = r0
            r0 = r4
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JScrollPane r0 = (javax.swing.JScrollPane) r0
            java.awt.Dimension r0 = r0.getMinimumSize()
            r11 = r0
            r0 = r11
            r1 = r0
            int r1 = r1.width
            r2 = r9
            int r1 = r1 + r2
            r0.width = r1
            r0 = r11
            r1 = r0
            int r1 = r1.height
            r2 = r10
            int r1 = r1 + r2
            r0.height = r1
            r0 = r11
            return r0
    }

    public void insert(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            javax.swing.JTextArea r0 = r0.getTextArea()
            r1 = r5
            r2 = r6
            r0.insert(r1, r2)
            return
    }

    public void replaceRange(java.lang.String r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            javax.swing.JTextArea r0 = r0.getTextArea()
            r1 = r6
            r2 = r7
            r3 = r8
            r0.replaceRange(r1, r2, r3)
            return
    }

    public int getCaretPosition() {
            r2 = this;
            r0 = r2
            javax.swing.JTextArea r0 = r0.getTextArea()
            int r0 = r0.getCaretPosition()
            return r0
    }

    public java.awt.im.InputMethodRequests getInputMethodRequests() {
            r2 = this;
            r0 = 0
            return r0
    }

    public int getSelectionEnd() {
            r2 = this;
            r0 = r2
            javax.swing.JTextArea r0 = r0.getTextArea()
            int r0 = r0.getSelectionEnd()
            return r0
    }

    public int getSelectionStart() {
            r2 = this;
            r0 = r2
            javax.swing.JTextArea r0 = r0.getTextArea()
            int r0 = r0.getSelectionStart()
            return r0
    }

    public java.lang.String getText() {
            r2 = this;
            r0 = r2
            javax.swing.JTextArea r0 = r0.getTextArea()
            java.lang.String r0 = r0.getText()
            return r0
    }

    public void select(int r5, int r6) {
            r4 = this;
            r0 = r4
            javax.swing.JTextArea r0 = r0.getTextArea()
            r1 = r5
            r2 = r6
            r0.select(r1, r2)
            return
    }

    public void setCaretPosition(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JTextArea r0 = r0.getTextArea()
            r1 = r4
            r0.setCaretPosition(r1)
            return
    }

    public void setEditable(boolean r4) {
            r3 = this;
            r0 = r3
            javax.swing.JTextArea r0 = r0.getTextArea()
            r1 = r4
            r0.setEditable(r1)
            return
    }

    public void setText(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javax.swing.JTextArea r0 = r0.getTextArea()
            r1 = r4
            r0.setText(r1)
            return
    }

    private javax.swing.JTextArea getTextArea() {
            r2 = this;
            r0 = r2
            javax.swing.JTextArea r0 = r0.textArea
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void setEnabledImpl(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setEnabledImpl(r1)
            r0 = r3
            javax.swing.JTextArea r0 = r0.getTextArea()
            r1 = r4
            r0.setEnabled(r1)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo596initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JScrollPane r0 = r0.initSwingComponent()
            return r0
    }
}
