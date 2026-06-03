package git.artdeell.installer_agent;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/forge_installer.jar:git/artdeell/installer_agent/ComponentTimeoutTask.class */
public class ComponentTimeoutTask extends java.util.TimerTask {
    public ComponentTimeoutTask() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
            r3 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Initialization timed out!"
            r0.println(r1)
            r0 = 17
            java.lang.System.exit(r0)
            return
    }
}
