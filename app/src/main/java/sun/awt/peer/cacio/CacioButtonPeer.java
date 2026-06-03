package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioButtonPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioButtonPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioButtonPeer.class */
class CacioButtonPeer extends sun.awt.peer.cacio.CacioComponentPeer<java.awt.Button, javax.swing.JButton> implements java.awt.peer.ButtonPeer {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioButtonPeer$SwingButtonListener.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioButtonPeer$SwingButtonListener.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioButtonPeer$SwingButtonListener.class */
    class SwingButtonListener implements java.awt.event.ActionListener {
        final /* synthetic */ sun.awt.peer.cacio.CacioButtonPeer this$0;

        SwingButtonListener(sun.awt.peer.cacio.CacioButtonPeer r4) {
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
                sun.awt.peer.cacio.CacioButtonPeer r0 = r0.this$0
                java.awt.Component r0 = r0.getAWTComponent()
                java.awt.Button r0 = (java.awt.Button) r0
                r8 = r0
                r0 = r8
                java.awt.event.ActionListener[] r0 = r0.getActionListeners()
                r9 = r0
                java.awt.event.ActionEvent r0 = new java.awt.event.ActionEvent
                r1 = r0
                r2 = r8
                r3 = 1001(0x3e9, float:1.403E-42)
                r4 = r8
                java.lang.String r4 = r4.getActionCommand()
                r1.<init>(r2, r3, r4)
                r10 = r0
                r0 = r6
                sun.awt.peer.cacio.CacioButtonPeer r0 = r0.this$0
                r1 = r10
                r0.handlePeerEvent(r1)
                return
        }
    }

    public CacioButtonPeer(java.awt.Button r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    javax.swing.JButton initSwingComponent() {
            r8 = this;
            javax.swing.JButton r0 = new javax.swing.JButton
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r8
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Button r0 = (java.awt.Button) r0
            r10 = r0
            r0 = r9
            r1 = r10
            java.lang.String r1 = r1.getLabel()
            r0.setText(r1)
            r0 = r9
            sun.awt.peer.cacio.CacioButtonPeer$SwingButtonListener r1 = new sun.awt.peer.cacio.CacioButtonPeer$SwingButtonListener
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.addActionListener(r1)
            r0 = r9
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r0.setMargin(r1)
            r0 = r9
            return r0
    }

    public void setLabel(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JButton r0 = (javax.swing.JButton) r0
            r1 = r4
            r0.setText(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent, reason: collision with other method in class */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo7633initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JButton r0 = r0.initSwingComponent()
            return r0
    }
}
