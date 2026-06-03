package git.artdeell.installer_agent;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:git/artdeell/installer_agent/MainWindowFilter.class */
public class MainWindowFilter implements git.artdeell.installer_agent.ComponentFilter {
    public MainWindowFilter() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // git.artdeell.installer_agent.ComponentFilter
    public boolean checkComponent(java.awt.Component r3) {
            r2 = this;
            r0 = r3
            boolean r0 = r0 instanceof javax.swing.JRadioButton
            if (r0 != 0) goto L15
            r0 = r3
            boolean r0 = r0 instanceof javax.swing.JTextField
            if (r0 != 0) goto L15
            r0 = r3
            boolean r0 = r0 instanceof javax.swing.JButton
            if (r0 == 0) goto L19
        L15:
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }
}
