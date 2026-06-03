package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioLabelPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioLabelPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioLabelPeer.class */
class CacioLabelPeer extends sun.awt.peer.cacio.CacioComponentPeer<java.awt.Label, javax.swing.JLabel> implements java.awt.peer.LabelPeer {
    public CacioLabelPeer(java.awt.Label r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    javax.swing.JLabel initSwingComponent() {
            r3 = this;
            r0 = r3
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Label r0 = (java.awt.Label) r0
            r4 = r0
            javax.swing.JLabel r0 = new javax.swing.JLabel
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.getText()
            r0.setText(r1)
            r0 = r5
            r1 = 1
            r0.setOpaque(r1)
            r0 = r5
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
            r3 = this;
            r0 = r3
            super.postInitSwingComponent()
            r0 = r3
            r1 = r3
            java.awt.Component r1 = r1.getAWTComponent()
            java.awt.Label r1 = (java.awt.Label) r1
            int r1 = r1.getAlignment()
            r0.setAlignment(r1)
            return
    }

    public void setText(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JLabel r0 = (javax.swing.JLabel) r0
            r1 = r4
            r0.setText(r1)
            return
    }

    public void setAlignment(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JLabel r0 = (javax.swing.JLabel) r0
            r5 = r0
            r0 = r4
            switch(r0) {
                case 0: goto L34;
                case 1: goto L2c;
                case 2: goto L24;
                default: goto L34;
            }
        L24:
            r0 = r5
            r1 = 4
            r0.setHorizontalAlignment(r1)
            goto L39
        L2c:
            r0 = r5
            r1 = 0
            r0.setHorizontalAlignment(r1)
            goto L39
        L34:
            r0 = r5
            r1 = 2
            r0.setHorizontalAlignment(r1)
        L39:
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer, sun.awt.peer.cacio.CacioComponent
    public boolean isFocusable() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo7633initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JLabel r0 = r0.initSwingComponent()
            return r0
    }
}
