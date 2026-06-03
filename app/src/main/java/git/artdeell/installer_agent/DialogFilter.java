package git.artdeell.installer_agent;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:git/artdeell/installer_agent/DialogFilter.class */
public class DialogFilter implements git.artdeell.installer_agent.ComponentFilter {
    public DialogFilter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // git.artdeell.installer_agent.ComponentFilter
    public boolean checkComponent(java.awt.Component r3) {
            r2 = this;
            r0 = r3
            boolean r0 = r0 instanceof javax.swing.JOptionPane
            if (r0 != 0) goto Le
            r0 = r3
            boolean r0 = r0 instanceof javax.swing.JProgressBar
            if (r0 == 0) goto L12
        Le:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }
}
