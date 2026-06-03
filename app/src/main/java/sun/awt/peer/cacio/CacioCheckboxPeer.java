package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxPeer.class */
class CacioCheckboxPeer extends sun.awt.peer.cacio.CacioComponentPeer<java.awt.Checkbox, javax.swing.JPanel> implements java.awt.peer.CheckboxPeer {
    private javax.swing.JToggleButton toggleButton;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxPeer$SwingCheckboxListener.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxPeer$SwingCheckboxListener.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxPeer$SwingCheckboxListener.class */
    class SwingCheckboxListener implements java.awt.event.ItemListener {
        final /* synthetic */ sun.awt.peer.cacio.CacioCheckboxPeer this$0;

        SwingCheckboxListener(sun.awt.peer.cacio.CacioCheckboxPeer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        public void itemStateChanged(java.awt.event.ItemEvent r8) {
                r7 = this;
                r0 = r7
                sun.awt.peer.cacio.CacioCheckboxPeer r0 = r0.this$0
                java.awt.Component r0 = r0.getAWTComponent()
                java.awt.Checkbox r0 = (java.awt.Checkbox) r0
                r9 = r0
                r0 = r8
                int r0 = r0.getStateChange()
                r1 = 2
                if (r0 != r1) goto L1b
                r0 = r9
                java.awt.CheckboxGroup r0 = r0.getCheckboxGroup()
                if (r0 == 0) goto L1b
                return
            L1b:
                r0 = r9
                r1 = r8
                int r1 = r1.getStateChange()
                r2 = 1
                if (r1 != r2) goto L28
                r1 = 1
                goto L29
            L28:
                r1 = 0
            L29:
                r0.setState(r1)
                r0 = r9
                java.awt.event.ItemListener[] r0 = r0.getItemListeners()
                r10 = r0
                r0 = r10
                int r0 = r0.length
                if (r0 != 0) goto L37
                return
            L37:
                java.awt.event.ItemEvent r0 = new java.awt.event.ItemEvent
                r1 = r0
                r2 = r9
                r3 = 701(0x2bd, float:9.82E-43)
                r4 = r9
                java.lang.String r4 = r4.getLabel()
                r5 = r8
                int r5 = r5.getStateChange()
                r1.<init>(r2, r3, r4, r5)
                r11 = r0
                r0 = 0
                r12 = r0
            L4f:
                r0 = r12
                r1 = r10
                int r1 = r1.length
                if (r0 >= r1) goto L67
                r0 = r10
                r1 = r12
                r0 = r0[r1]
                r1 = r11
                r0.itemStateChanged(r1)
                int r12 = r12 + 1
                goto L4f
            L67:
                return
        }
    }

    public CacioCheckboxPeer(java.awt.Checkbox r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public javax.swing.JPanel initSwingComponent() {
            r4 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.awt.BorderLayout r1 = new java.awt.BorderLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            r0 = r4
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Checkbox r0 = (java.awt.Checkbox) r0
            java.awt.CheckboxGroup r0 = r0.getCheckboxGroup()
            if (r0 != 0) goto L2e
            r0 = r4
            javax.swing.JCheckBox r1 = new javax.swing.JCheckBox
            r2 = r1
            r2.<init>()
            r0.toggleButton = r1
            goto L39
        L2e:
            r0 = r4
            javax.swing.JRadioButton r1 = new javax.swing.JRadioButton
            r2 = r1
            r2.<init>()
            r0.toggleButton = r1
        L39:
            r0 = r5
            r1 = r4
            javax.swing.JToggleButton r1 = r1.toggleButton
            java.awt.Component r0 = r0.add(r1)
            r0 = r5
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
            r5 = this;
            r0 = r5
            super.postInitSwingComponent()
            r0 = r5
            javax.swing.JToggleButton r0 = r0.toggleButton
            sun.awt.peer.cacio.CacioCheckboxPeer$SwingCheckboxListener r1 = new sun.awt.peer.cacio.CacioCheckboxPeer$SwingCheckboxListener
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.addItemListener(r1)
            r0 = r5
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Checkbox r0 = (java.awt.Checkbox) r0
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.getLabel()
            r0.setLabel(r1)
            r0 = r5
            r1 = r6
            boolean r1 = r1.getState()
            r0.setState(r1)
            return
    }

    public void setCheckboxGroup(java.awt.CheckboxGroup r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L12
            r0 = r4
            javax.swing.JCheckBox r1 = new javax.swing.JCheckBox
            r2 = r1
            r2.<init>()
            r0.toggleButton = r1
            goto L1d
        L12:
            r0 = r4
            javax.swing.JRadioButton r1 = new javax.swing.JRadioButton
            r2 = r1
            r2.<init>()
            r0.toggleButton = r1
        L1d:
            r0 = r4
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPanel r0 = (javax.swing.JPanel) r0
            r0.removeAll()
            r0 = r4
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JPanel r0 = (javax.swing.JPanel) r0
            r1 = r4
            javax.swing.JToggleButton r1 = r1.toggleButton
            java.awt.Component r0 = r0.add(r1)
            r0 = r4
            r0.postInitSwingComponent()
            return
    }

    public void setLabel(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javax.swing.JToggleButton r0 = r0.toggleButton
            r1 = r4
            r0.setText(r1)
            return
    }

    public void setState(boolean r4) {
            r3 = this;
            r0 = r3
            javax.swing.JToggleButton r0 = r0.toggleButton
            r1 = r4
            r0.setSelected(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void setEnabledImpl(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setEnabledImpl(r1)
            r0 = r3
            javax.swing.JToggleButton r0 = r0.toggleButton
            r1 = r4
            r0.setEnabled(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    public /* bridge */ /* synthetic */ javax.swing.JComponent mo7633initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JPanel r0 = r0.initSwingComponent()
            return r0
    }
}
