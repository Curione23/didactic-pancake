package git.artdeell.installer_agent;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:git/artdeell/installer_agent/Agent.class */
public class Agent implements java.awt.event.AWTEventListener {
    private boolean forgeWindowHandled;
    private final boolean suppressProfileCreation;
    private final boolean optiFineInstallation;
    private final java.lang.String modpackFixupId;
    private final java.util.Timer componentTimer;

    public Agent(boolean r5, boolean r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.forgeWindowHandled = r1
            r0 = r4
            java.util.Timer r1 = new java.util.Timer
            r2 = r1
            r2.<init>()
            r0.componentTimer = r1
            r0 = r4
            r1 = r5
            if (r1 != 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0.suppressProfileCreation = r1
            r0 = r4
            r1 = r6
            r0.optiFineInstallation = r1
            r0 = r4
            r1 = r7
            r0.modpackFixupId = r1
            return
    }

    public void eventDispatched(java.awt.AWTEvent r5) {
            r4 = this;
            r0 = r5
            java.awt.event.WindowEvent r0 = (java.awt.event.WindowEvent) r0
            r6 = r0
            r0 = r6
            java.awt.Window r0 = r0.getWindow()
            r7 = r0
            r0 = r6
            int r0 = r0.getID()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L15
            return
        L15:
            r0 = r4
            boolean r0 = r0.forgeWindowHandled
            if (r0 == 0) goto L29
            r0 = r7
            boolean r0 = r0 instanceof javax.swing.JDialog
            if (r0 == 0) goto L29
            r0 = r4
            r1 = r7
            r0.handleDialog(r1)
            return
        L29:
            r0 = r4
            boolean r0 = r0.forgeWindowHandled
            if (r0 != 0) goto L3d
            r0 = r4
            r1 = r4
            r2 = r7
            boolean r1 = r1.handleMainWindow(r2)
            r0.forgeWindowHandled = r1
            r0 = r4
            r0.checkComponentTimer()
        L3d:
            return
    }

    public void checkComponentTimer() {
            r5 = this;
            r0 = r5
            boolean r0 = r0.forgeWindowHandled
            if (r0 == 0) goto L17
            r0 = r5
            java.util.Timer r0 = r0.componentTimer
            r0.cancel()
            r0 = r5
            java.util.Timer r0 = r0.componentTimer
            int r0 = r0.purge()
            return
        L17:
            r0 = r5
            java.util.Timer r0 = r0.componentTimer
            git.artdeell.installer_agent.ComponentTimeoutTask r1 = new git.artdeell.installer_agent.ComponentTimeoutTask
            r2 = r1
            r2.<init>()
            r2 = 30000(0x7530, double:1.4822E-319)
            r0.schedule(r1, r2)
            return
    }

    public boolean handleMainWindow(java.awt.Window r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = r7
            git.artdeell.installer_agent.MainWindowFilter r3 = new git.artdeell.installer_agent.MainWindowFilter
            r4 = r3
            r4.<init>()
            r0.insertAllComponents(r1, r2, r3)
            r0 = 0
            r9 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L1f:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L67
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.awt.Component r0 = (java.awt.Component) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof javax.swing.AbstractButton
            if (r0 == 0) goto L64
            r0 = r11
            javax.swing.AbstractButton r0 = (javax.swing.AbstractButton) r0
            r12 = r0
            r0 = r6
            boolean r0 = r0.optiFineInstallation
            if (r0 == 0) goto L54
            r0 = r6
            r1 = r12
            javax.swing.AbstractButton r0 = r0.handleOptiFineButton(r1)
            goto L5a
        L54:
            r0 = r6
            r1 = r12
            javax.swing.AbstractButton r0 = r0.handleForgeButton(r1)
        L5a:
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L64
            r0 = r12
            r9 = r0
        L64:
            goto L1f
        L67:
            r0 = r9
            if (r0 != 0) goto L75
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Failed to set all the UI components, wil try again in the next window"
            r0.println(r1)
            r0 = 0
            return r0
        L75:
            r0 = r6
            boolean r0 = r0.optiFineInstallation
            if (r0 == 0) goto L81
            java.lang.String r0 = "OptiFine"
            goto L83
        L81:
            java.lang.String r0 = "forge"
        L83:
            git.artdeell.installer_agent.ProfileFixer.storeProfile(r0)
            r0 = r9
            r1 = r0
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            boolean r0 = r0::doClick
            java.awt.EventQueue.invokeLater(r0)
            r0 = 1
            return r0
    }

    public javax.swing.AbstractButton handleForgeButton(javax.swing.AbstractButton r4) {
            r3 = this;
            r0 = r4
            java.lang.String r0 = r0.getText()
            r5 = r0
            r0 = -1
            r6 = r0
            r0 = r5
            int r0 = r0.hashCode()
            switch(r0) {
                case 2524: goto L24;
                case 210079248: goto L32;
                default: goto L3d;
            }
        L24:
            r0 = r5
            java.lang.String r1 = "OK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            r0 = 0
            r6 = r0
            goto L3d
        L32:
            r0 = r5
            java.lang.String r1 = "Install client"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            r0 = 1
            r6 = r0
        L3d:
            r0 = r6
            switch(r0) {
                case 0: goto L58;
                case 1: goto L5a;
                default: goto L5e;
            }
        L58:
            r0 = r4
            return r0
        L5a:
            r0 = r4
            r0.doClick()
        L5e:
            r0 = 0
            return r0
    }

    public javax.swing.AbstractButton handleOptiFineButton(javax.swing.AbstractButton r4) {
            r3 = this;
            java.lang.String r0 = "Install"
            r1 = r4
            java.lang.String r1 = r1.getText()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            r0 = r4
            return r0
        Le:
            r0 = 0
            return r0
    }

    public void handleDialog(java.awt.Window r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = r7
            git.artdeell.installer_agent.DialogFilter r3 = new git.artdeell.installer_agent.DialogFilter
            r4 = r3
            r4.<init>()
            r0.insertAllComponents(r1, r2, r3)
            r0 = r8
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r8
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            javax.swing.JOptionPane r0 = (javax.swing.JOptionPane) r0
            r9 = r0
            r0 = r9
            int r0 = r0.getMessageType()
            r1 = 1
            if (r0 != r1) goto L57
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "The install was successful!"
            r0.println(r1)
            r0 = r6
            boolean r0 = r0.optiFineInstallation
            if (r0 == 0) goto L46
            java.lang.String r0 = "OptiFine"
            goto L48
        L46:
            java.lang.String r0 = "forge"
        L48:
            r1 = r6
            java.lang.String r1 = r1.modpackFixupId
            r2 = r6
            boolean r2 = r2.suppressProfileCreation
            git.artdeell.installer_agent.ProfileFixer.reinsertProfile(r0, r1, r2)
            r0 = 0
            java.lang.System.exit(r0)
        L57:
            return
    }

    public void insertAllComponents(java.util.List<java.awt.Component> r6, java.awt.Container r7, git.artdeell.installer_agent.ComponentFilter r8) {
            r5 = this;
            r0 = r7
            int r0 = r0.getComponentCount()
            r9 = r0
            r0 = 0
            r10 = r0
        L9:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L45
            r0 = r7
            r1 = r10
            java.awt.Component r0 = r0.getComponent(r1)
            r11 = r0
            r0 = r8
            r1 = r11
            boolean r0 = r0.checkComponent(r1)
            if (r0 == 0) goto L2c
            r0 = r6
            r1 = r11
            boolean r0 = r0.add(r1)
        L2c:
            r0 = r11
            boolean r0 = r0 instanceof java.awt.Container
            if (r0 == 0) goto L3f
            r0 = r5
            r1 = r6
            r2 = r11
            java.awt.Container r2 = (java.awt.Container) r2
            r3 = r8
            r0.insertAllComponents(r1, r2, r3)
        L3f:
            int r10 = r10 + 1
            goto L9
        L45:
            return
    }

    public static void premain(java.lang.String r6, java.lang.instrument.Instrumentation r7) {
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r6
            if (r0 == 0) goto L59
            r0 = r6
            java.lang.String r0 = findQuotedString(r0)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L4b
            r0 = r6
            java.lang.String r1 = "NPS"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2d
            r0 = r10
            java.lang.String r1 = "NPS"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            r8 = r0
            r0 = r6
            java.lang.String r1 = "OF"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L46
            r0 = r10
            java.lang.String r1 = "OF"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            r9 = r0
            goto L59
        L4b:
            r0 = r6
            java.lang.String r1 = "NPS"
            boolean r0 = r0.contains(r1)
            r8 = r0
            r0 = r6
            java.lang.String r1 = "OF"
            boolean r0 = r0.contains(r1)
            r9 = r0
        L59:
            git.artdeell.installer_agent.Agent r0 = new git.artdeell.installer_agent.Agent
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            r11 = r0
            java.awt.Toolkit r0 = java.awt.Toolkit.getDefaultToolkit()
            r1 = r11
            r2 = 64
            r0.addAWTEventListener(r1, r2)
            return
    }

    private static java.lang.String findQuotedString(java.lang.String r5) {
            r0 = r5
            r1 = 34
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 != r1) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r5
            r1 = 34
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            int r0 = r0.indexOf(r1, r2)
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L1f
            r0 = 0
            return r0
        L1f:
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }
}
