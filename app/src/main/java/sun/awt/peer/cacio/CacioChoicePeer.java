package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer.class */
class CacioChoicePeer extends sun.awt.peer.cacio.CacioComponentPeer<java.awt.Choice, javax.swing.JComboBox> implements java.awt.peer.ChoicePeer {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer$1.class
     */
    /* JADX INFO: renamed from: sun.awt.peer.cacio.CacioChoicePeer$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer$TrampolineListener.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer$TrampolineListener.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer$TrampolineListener.class */
    private class TrampolineListener implements java.awt.event.ItemListener {
        final /* synthetic */ sun.awt.peer.cacio.CacioChoicePeer this$0;

        private TrampolineListener(sun.awt.peer.cacio.CacioChoicePeer r4) {
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
                r0 = r8
                int r0 = r0.getStateChange()
                r1 = 2
                if (r0 != r1) goto L9
                return
            L9:
                r0 = r7
                sun.awt.peer.cacio.CacioChoicePeer r0 = r0.this$0
                java.awt.Component r0 = r0.getAWTComponent()
                java.awt.Choice r0 = (java.awt.Choice) r0
                java.awt.event.ItemListener[] r0 = r0.getItemListeners()
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L69
                r0 = r9
                int r0 = r0.length
                if (r0 <= 0) goto L69
                r0 = r7
                sun.awt.peer.cacio.CacioChoicePeer r0 = r0.this$0
                javax.swing.JComponent r0 = r0.getSwingComponent()
                javax.swing.JComboBox r0 = (javax.swing.JComboBox) r0
                r10 = r0
                r0 = r7
                sun.awt.peer.cacio.CacioChoicePeer r0 = r0.this$0
                java.awt.Component r0 = r0.getAWTComponent()
                java.awt.Choice r0 = (java.awt.Choice) r0
                r11 = r0
                r0 = 0
                r12 = r0
            L3a:
                r0 = r12
                r1 = r9
                int r1 = r1.length
                if (r0 >= r1) goto L69
                java.awt.event.ItemEvent r0 = new java.awt.event.ItemEvent
                r1 = r0
                r2 = r11
                r3 = r8
                int r3 = r3.getID()
                r4 = r10
                java.lang.Object r4 = r4.getSelectedItem()
                r5 = r8
                int r5 = r5.getStateChange()
                r1.<init>(r2, r3, r4, r5)
                r13 = r0
                r0 = r9
                r1 = r12
                r0 = r0[r1]
                r1 = r13
                r0.itemStateChanged(r1)
                int r12 = r12 + 1
                goto L3a
            L69:
                return
        }

        /* synthetic */ TrampolineListener(sun.awt.peer.cacio.CacioChoicePeer r4, sun.awt.peer.cacio.CacioChoicePeer.AnonymousClass1 r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    CacioChoicePeer(java.awt.Choice r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    javax.swing.JComboBox initSwingComponent() {
            r3 = this;
            javax.swing.JComboBox r0 = new javax.swing.JComboBox
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            return r0
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
            r6 = this;
            r0 = r6
            super.postInitSwingComponent()
            r0 = r6
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Choice r0 = (java.awt.Choice) r0
            r7 = r0
            r0 = r7
            int r0 = r0.getItemCount()
            r8 = r0
            r0 = 0
            r9 = r0
        L13:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L2c
            r0 = r6
            javax.swing.MutableComboBoxModel r0 = r0.getModel()
            r1 = r7
            r2 = r9
            java.lang.String r1 = r1.getItem(r2)
            r0.addElement(r1)
            int r9 = r9 + 1
            goto L13
        L2c:
            r0 = r6
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JComboBox r0 = (javax.swing.JComboBox) r0
            sun.awt.peer.cacio.CacioChoicePeer$TrampolineListener r1 = new sun.awt.peer.cacio.CacioChoicePeer$TrampolineListener
            r2 = r1
            r3 = r6
            r4 = 0
            r2.<init>(r3, r4)
            r0.addItemListener(r1)
            return
    }

    private javax.swing.MutableComboBoxModel getModel() {
            r2 = this;
            r0 = r2
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JComboBox r0 = (javax.swing.JComboBox) r0
            javax.swing.ComboBoxModel r0 = r0.getModel()
            r3 = r0
            r0 = r3
            javax.swing.MutableComboBoxModel r0 = (javax.swing.MutableComboBoxModel) r0
            r4 = r0
            r0 = r4
            return r0
    }

    public void add(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            javax.swing.MutableComboBoxModel r0 = r0.getModel()
            r1 = r5
            r2 = r6
            r0.insertElementAt(r1, r2)
            return
    }

    public void remove(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.MutableComboBoxModel r0 = r0.getModel()
            r1 = r4
            r0.removeElementAt(r1)
            return
    }

    public void removeAll() {
            r3 = this;
            r0 = r3
            javax.swing.MutableComboBoxModel r0 = r0.getModel()
            r4 = r0
            r0 = r4
            int r0 = r0.getSize()
            r5 = r0
            r0 = r5
            r1 = 1
            int r0 = r0 - r1
            r6 = r0
        L10:
            r0 = r6
            if (r0 < 0) goto L21
            r0 = r4
            r1 = r6
            r0.removeElementAt(r1)
            int r6 = r6 + (-1)
            goto L10
        L21:
            return
    }

    public void select(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JComboBox r0 = (javax.swing.JComboBox) r0
            r1 = r4
            r0.setSelectedIndex(r1)
            return
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* JADX INFO: renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo7633initSwingComponent() {
            r2 = this;
            r0 = r2
            javax.swing.JComboBox r0 = r0.initSwingComponent()
            return r0
    }
}
