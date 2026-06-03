package com.github.caciocavallosilano.cacio.peer;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioListPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioListPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioListPeer.class */
final class CacioListPeer extends com.github.caciocavallosilano.cacio.peer.CacioComponentPeer<java.awt.List, javax.swing.JScrollPane> implements java.awt.peer.ListPeer {
    private javax.swing.JList list;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioListPeer$SelectionListener.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioListPeer$SelectionListener.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioListPeer$SelectionListener.class */
    class SelectionListener implements javax.swing.event.ListSelectionListener {
        final /* synthetic */ com.github.caciocavallosilano.cacio.peer.CacioListPeer this$0;

        SelectionListener(com.github.caciocavallosilano.cacio.peer.CacioListPeer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        public void valueChanged(javax.swing.event.ListSelectionEvent r10) {
                r9 = this;
                r0 = r10
                int r0 = r0.getFirstIndex()
                r11 = r0
            L5:
                r0 = r11
                r1 = r10
                int r1 = r1.getLastIndex()
                if (r0 >= r1) goto L52
                r0 = r9
                com.github.caciocavallosilano.cacio.peer.CacioListPeer r0 = r0.this$0
                java.awt.Toolkit r0 = r0.getToolkit()
                java.awt.EventQueue r0 = r0.getSystemEventQueue()
                java.awt.event.ItemEvent r1 = new java.awt.event.ItemEvent
                r2 = r1
                r3 = r9
                com.github.caciocavallosilano.cacio.peer.CacioListPeer r3 = r3.this$0
                java.awt.Component r3 = r3.getAWTComponent()
                java.awt.ItemSelectable r3 = (java.awt.ItemSelectable) r3
                r4 = 701(0x2bd, float:9.82E-43)
                r5 = r9
                com.github.caciocavallosilano.cacio.peer.CacioListPeer r5 = r5.this$0
                javax.swing.DefaultListModel r5 = com.github.caciocavallosilano.cacio.peer.CacioListPeer.access$000(r5)
                r6 = r11
                java.lang.Object r5 = r5.getElementAt(r6)
                r6 = r9
                com.github.caciocavallosilano.cacio.peer.CacioListPeer r6 = r6.this$0
                javax.swing.JList r6 = com.github.caciocavallosilano.cacio.peer.CacioListPeer.access$100(r6)
                r7 = r11
                boolean r6 = r6.isSelectedIndex(r7)
                if (r6 == 0) goto L45
                r6 = 1
                goto L46
            L45:
                r6 = 2
            L46:
                r2.<init>(r3, r4, r5, r6)
                r0.postEvent(r1)
                int r11 = r11 + 1
                goto L5
            L52:
                return
        }
    }

    public CacioListPeer(java.awt.List r5, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory r6) {
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
            javax.swing.JList r1 = new javax.swing.JList
            r2 = r1
            javax.swing.DefaultListModel r3 = new javax.swing.DefaultListModel
            r4 = r3
            r4.<init>()
            r2.<init>(r3)
            r0.list = r1
            javax.swing.JScrollPane r0 = new javax.swing.JScrollPane
            r1 = r0
            r2 = r6
            javax.swing.JList r2 = r2.list
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void postInitSwingComponent() {
            r5 = this;
            r0 = r5
            super.postInitSwingComponent()
            r0 = r5
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.List r0 = (java.awt.List) r0
            r6 = r0
            r0 = r6
            int r0 = r0.getItemCount()
            r7 = r0
            r0 = 0
            r8 = r0
        L13:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L28
            r0 = r5
            r1 = r6
            r2 = r8
            java.lang.String r1 = r1.getItem(r2)
            r2 = r8
            r0.add(r1, r2)
            int r8 = r8 + 1
            goto L13
        L28:
            r0 = r5
            r1 = r6
            boolean r1 = r1.isMultipleMode()
            r0.setMultipleMode(r1)
            r0 = r5
            javax.swing.JList r0 = r0.list
            com.github.caciocavallosilano.cacio.peer.CacioListPeer$SelectionListener r1 = new com.github.caciocavallosilano.cacio.peer.CacioListPeer$SelectionListener
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.addListSelectionListener(r1)
            return
    }

    private javax.swing.DefaultListModel getModel() {
            r2 = this;
            r0 = r2
            javax.swing.JList r0 = r0.list
            javax.swing.ListModel r0 = r0.getModel()
            javax.swing.DefaultListModel r0 = (javax.swing.DefaultListModel) r0
            r3 = r0
            r0 = r3
            return r0
    }

    public void add(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r6
            if (r0 >= 0) goto Lf
            r0 = r4
            javax.swing.DefaultListModel r0 = r0.getModel()
            r1 = r5
            r0.addElement(r1)
            goto L18
        Lf:
            r0 = r4
            javax.swing.DefaultListModel r0 = r0.getModel()
            r1 = r6
            r2 = r5
            r0.add(r1, r2)
        L18:
            return
    }

    public void delItems(int r5, int r6) {
            r4 = this;
            r0 = r4
            javax.swing.DefaultListModel r0 = r0.getModel()
            r1 = r5
            r2 = r6
            r0.removeRange(r1, r2)
            return
    }

    public java.awt.Dimension getMinimumSize(int r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            java.awt.Component r1 = r1.getAWTComponent()
            java.awt.List r1 = (java.awt.List) r1
            java.awt.Font r1 = r1.getFont()
            java.awt.FontMetrics r0 = r0.getFontMetrics(r1)
            r8 = r0
            java.awt.Dimension r0 = new java.awt.Dimension
            r1 = r0
            r2 = 20
            r3 = r8
            java.lang.String r4 = "0123456789abcde"
            int r3 = r3.stringWidth(r4)
            int r2 = r2 + r3
            r3 = r8
            int r3 = r3.getHeight()
            r4 = r7
            int r3 = r3 * r4
            r1.<init>(r2, r3)
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public java.awt.Dimension getMinimumSize() {
            r3 = this;
            r0 = r3
            r1 = 5
            java.awt.Dimension r0 = r0.getMinimumSize(r1)
            return r0
    }

    public java.awt.Dimension getPreferredSize(int r4) {
            r3 = this;
            r0 = r3
            r1 = 5
            java.awt.Dimension r0 = r0.getMinimumSize(r1)
            r5 = r0
            r0 = r3
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JScrollPane r0 = (javax.swing.JScrollPane) r0
            java.awt.Dimension r0 = r0.getPreferredSize()
            r6 = r0
            r0 = r6
            int r0 = r0.width
            r1 = r5
            int r1 = r1.width
            if (r0 >= r1) goto L24
            r0 = r6
            r1 = r5
            int r1 = r1.width
            r0.width = r1
        L24:
            r0 = r6
            int r0 = r0.height
            r1 = r6
            int r1 = r1.height
            if (r0 >= r1) goto L37
            r0 = r6
            r1 = r5
            int r1 = r1.height
            r0.height = r1
        L37:
            r0 = r6
            return r0
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public java.awt.Dimension getPreferredSize() {
            r4 = this;
            r0 = r4
            javax.swing.DefaultListModel r0 = r0.getModel()
            int r0 = r0.getSize()
            r5 = r0
            r0 = r4
            r1 = r5
            r2 = 5
            if (r1 >= r2) goto L12
            r1 = 5
            goto L13
        L12:
            r1 = r5
        L13:
            java.awt.Dimension r0 = r0.getPreferredSize(r1)
            return r0
    }

    public void makeVisible(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JList r0 = r0.list
            r1 = r4
            r0.ensureIndexIsVisible(r1)
            return
    }

    public void select(int r4) {
            r3 = this;
            r0 = r3
            javax.swing.JList r0 = r0.list
            r1 = r4
            r0.setSelectedIndex(r1)
            return
    }

    public void deselect(int r5) {
            r4 = this;
            r0 = r4
            javax.swing.JList r0 = r0.list
            r1 = r5
            r2 = r5
            r0.removeSelectionInterval(r1, r2)
            return
    }

    public void removeAll() {
            r2 = this;
            r0 = r2
            javax.swing.JList r0 = r0.list
            javax.swing.ListSelectionModel r0 = r0.getSelectionModel()
            r3 = r0
            r0 = r3
            r0.clearSelection()
            return
    }

    public int[] getSelectedIndexes() {
            r2 = this;
            r0 = r2
            javax.swing.JList r0 = r0.list
            int[] r0 = r0.getSelectedIndices()
            return r0
    }

    public void setMultipleMode(boolean r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L9
            r0 = 2
            r5 = r0
            goto Lb
        L9:
            r0 = 0
            r5 = r0
        Lb:
            r0 = r3
            javax.swing.JList r0 = r0.list
            r1 = r5
            r0.setSelectionMode(r1)
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    protected void handleMouseEvent(java.awt.event.MouseEvent r10) {
            r9 = this;
            r0 = r9
            r1 = r10
            super.handleMouseEvent(r1)
            r0 = r10
            int r0 = r0.getID()
            r1 = 502(0x1f6, float:7.03E-43)
            if (r0 != r1) goto L49
            r0 = r10
            int r0 = r0.getClickCount()
            r1 = 2
            if (r0 != r1) goto L49
            r0 = r9
            java.awt.Toolkit r0 = r0.getToolkit()
            java.awt.EventQueue r0 = r0.getSystemEventQueue()
            java.awt.event.ActionEvent r1 = new java.awt.event.ActionEvent
            r2 = r1
            r3 = r9
            java.awt.Component r3 = r3.getAWTComponent()
            r4 = 1001(0x3e9, float:1.403E-42)
            r5 = r9
            javax.swing.DefaultListModel r5 = r5.getModel()
            r6 = r9
            javax.swing.JList r6 = r6.list
            r7 = r10
            java.awt.Point r7 = r7.getPoint()
            int r6 = r6.locationToIndex(r7)
            java.lang.Object r5 = r5.getElementAt(r6)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r5
            r2.<init>(r3, r4, r5)
            r0.postEvent(r1)
        L49:
            return
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void setEnabled(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setEnabled(r1)
            r0 = r3
            javax.swing.JList r0 = r0.list
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

    static /* synthetic */ javax.swing.DefaultListModel access$000(com.github.caciocavallosilano.cacio.peer.CacioListPeer r2) {
            r0 = r2
            javax.swing.DefaultListModel r0 = r0.getModel()
            return r0
    }

    static /* synthetic */ javax.swing.JList access$100(com.github.caciocavallosilano.cacio.peer.CacioListPeer r2) {
            r0 = r2
            javax.swing.JList r0 = r0.list
            return r0
    }
}
