package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextFieldPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextFieldPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextFieldPeer.class */
class CacioTextFieldPeer extends com.github.caciocavallosilano.cacio.peer.CacioComponentPeer<java.awt.TextField, javax.swing.JPasswordField> implements java.awt.peer.TextFieldPeer {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextFieldPeer$SwingTextFieldListener.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextFieldPeer$SwingTextFieldListener.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextFieldPeer$SwingTextFieldListener.class */
    class SwingTextFieldListener implements java.awt.event.ActionListener {
        final /* synthetic */ com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer this$0;

        SwingTextFieldListener(com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        public void actionPerformed(java.awt.event.ActionEvent r7) {
                r6 = this;
                r0 = r6
                com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer r0 = r0.this$0
                java.awt.Component r0 = r0.getAWTComponent()
                java.awt.TextField r0 = (java.awt.TextField) r0
                r8 = r0
                r0 = r8
                java.awt.event.ActionListener[] r0 = r0.getActionListeners()
                r9 = r0
                r0 = r9
                int r0 = r0.length
                if (r0 != 0) goto L16
                return
            L16:
                java.awt.event.ActionEvent r0 = new java.awt.event.ActionEvent
                r1 = r0
                r2 = r8
                r3 = 1001(0x3e9, float:1.403E-42)
                r4 = r7
                java.lang.String r4 = r4.getActionCommand()
                r1.<init>(r2, r3, r4)
                r10 = r0
                r0 = r9
                r11 = r0
                r0 = r11
                int r0 = r0.length
                r12 = r0
                r0 = 0
                r13 = r0
            L32:
                r0 = r13
                r1 = r12
                if (r0 >= r1) goto L4f
                r0 = r11
                r1 = r13
                r0 = r0[r1]
                r14 = r0
                r0 = r14
                r1 = r10
                r0.actionPerformed(r1)
                int r13 = r13 + 1
                goto L32
            L4f:
                return
        }
    }

    CacioTextFieldPeer(java.awt.TextField r5, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    javax.swing.JPasswordField initSwingComponent() {
            r5 = this;
            r0 = r5
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.TextField r0 = (java.awt.TextField) r0
            r6 = r0
            javax.swing.JPasswordField r0 = new javax.swing.JPasswordField
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.getText()
            r0.setText(r1)
            r0 = r7
            r1 = r6
            int r1 = r1.getColumns()
            r0.setColumns(r1)
            r0 = r7
            r1 = r6
            char r1 = r1.getEchoChar()
            r0.setEchoChar(r1)
            r0 = r7
            r1 = r6
            boolean r1 = r1.isEditable()
            r0.setEditable(r1)
            r0 = r7
            r1 = r6
            int r1 = r1.getSelectionStart()
            r2 = r6
            int r2 = r2.getSelectionEnd()
            r0.select(r1, r2)
            r0 = r7
            com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer$SwingTextFieldListener r1 = new com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer$SwingTextFieldListener
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r7
            return r0
    }

    public java.awt.Dimension getMinimumSize(int r3) {
            r2 = this;
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            java.awt.Dimension r0 = r0.getMinimumSize()
            return r0
    }

    public java.awt.Dimension getPreferredSize(int r3) {
            r2 = this;
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            java.awt.Dimension r0 = r0.getPreferredSize()
            return r0
    }

    public void setEchoChar(char r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            r1 = r4
            r0.setEchoChar(r1)
            return
    }

    public int getCaretPosition() {
            r2 = this;
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            int r0 = r0.getCaretPosition()
            return r0
    }

    public java.awt.im.InputMethodRequests getInputMethodRequests() {
            r2 = this;
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            java.awt.im.InputMethodRequests r0 = r0.getInputMethodRequests()
            return r0
    }

    public int getSelectionEnd() {
            r2 = this;
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            int r0 = r0.getSelectionEnd()
            return r0
    }

    public int getSelectionStart() {
            r2 = this;
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            int r0 = r0.getSelectionStart()
            return r0
    }

    public java.lang.String getText() {
            r2 = this;
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            java.lang.String r0 = r0.getText()
            return r0
    }

    public void select(int r5, int r6) {
            r4 = this;
            r0 = r4
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            r1 = r5
            r2 = r6
            r0.select(r1, r2)
            return
    }

    public void setCaretPosition(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            r1 = r4
            r0.setCaretPosition(r1)
            return
    }

    public void setEditable(boolean r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            r1 = r4
            r0.setEditable(r1)
            return
    }

    public void setText(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            r1 = r4
            r0.setText(r1)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo596initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JPasswordField r0 = r0.initSwingComponent()
            return r0
    }
}
