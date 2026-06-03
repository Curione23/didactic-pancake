package sun.awt.peer.cacio;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFileDialogPeer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFileDialogPeer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFileDialogPeer.class */
class CacioFileDialogPeer extends sun.awt.peer.cacio.CacioDialogPeer implements java.awt.peer.FileDialogPeer {
    private javax.swing.JFileChooser fileChooser;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFileDialogPeer$ProxyFilter.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFileDialogPeer$ProxyFilter.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFileDialogPeer$ProxyFilter.class */
    private static class ProxyFilter extends javax.swing.filechooser.FileFilter {
        private java.io.FilenameFilter target;

        ProxyFilter(java.io.FilenameFilter r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.target = r1
                return
        }

        public boolean accept(java.io.File r5) {
                r4 = this;
                r0 = r4
                java.io.FilenameFilter r0 = r0.target
                r1 = r5
                java.io.File r1 = r1.getAbsoluteFile()
                java.io.File r1 = r1.getParentFile()
                r2 = r5
                java.lang.String r2 = r2.getName()
                boolean r0 = r0.accept(r1, r2)
                return r0
        }

        public java.lang.String getDescription() {
                r2 = this;
                java.lang.String r0 = "No description"
                return r0
        }
    }

    CacioFileDialogPeer(java.awt.FileDialog r5, sun.awt.peer.cacio.PlatformWindowFactory r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer, sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
            r4 = this;
            r0 = r4
            super.postInitSwingComponent()
            r0 = r4
            javax.swing.JFileChooser r1 = new javax.swing.JFileChooser
            r2 = r1
            r2.<init>()
            r0.fileChooser = r1
            r0 = r4
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JRootPane r0 = (javax.swing.JRootPane) r0
            java.awt.Container r0 = r0.getContentPane()
            r1 = r4
            javax.swing.JFileChooser r1 = r1.fileChooser
            java.awt.Component r0 = r0.add(r1)
            r0 = r4
            javax.swing.JComponent r0 = r0.getSwingComponent()
            javax.swing.JRootPane r0 = (javax.swing.JRootPane) r0
            r0.layout()
            r0 = r4
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.FileDialog r0 = (java.awt.FileDialog) r0
            r5 = r0
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getFile()
            r0.setFile(r1)
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getDirectory()
            r0.setDirectory(r1)
            r0 = r4
            r1 = r5
            java.io.FilenameFilter r1 = r1.getFilenameFilter()
            r0.setFilenameFilter(r1)
            return
    }

    public void setFile(java.lang.String r6) {
            r5 = this;
            r0 = r5
            javax.swing.JFileChooser r0 = r0.fileChooser
            java.io.File r1 = new java.io.File
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.setSelectedFile(r1)
            return
    }

    public void setDirectory(java.lang.String r6) {
            r5 = this;
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "setting dir: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            javax.swing.JFileChooser r0 = r0.fileChooser
            java.io.File r1 = new java.io.File
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.setCurrentDirectory(r1)
            return
    }

    public void setFilenameFilter(java.io.FilenameFilter r6) {
            r5 = this;
            r0 = r5
            javax.swing.JFileChooser r0 = r0.fileChooser
            sun.awt.peer.cacio.CacioFileDialogPeer$ProxyFilter r1 = new sun.awt.peer.cacio.CacioFileDialogPeer$ProxyFilter
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.setFileFilter(r1)
            return
    }
}
