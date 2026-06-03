package ca.dnamobile.javalauncher;

/* JADX INFO: loaded from: classes.dex */
public class SplashActivity extends androidx.appcompat.app.AppCompatActivity {
    private volatile boolean finished;
    private android.widget.TextView statusText;
    private android.widget.TextView titleText;

    private static final class TaskEntry {
        final java.lang.String name;
        final ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask task;

        TaskEntry(java.lang.String r1, ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.task = r2
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$DlASBJoP5JFamz9_ZXenRcoTY_w(ca.dnamobile.javalauncher.SplashActivity r0, java.lang.String r1) {
            r0.lambda$setStatus$2(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$n9MxgeuqnFhLI89Gs-yzghF4T3c, reason: not valid java name */
    public static /* synthetic */ void m405$r8$lambda$n9MxgeuqnFhLI89GsyzghF4T3c(ca.dnamobile.javalauncher.SplashActivity r0) {
            r0.lambda$openMainActivity$1()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$t7kFuyNAOagKgC4Y3O-rFaNmHd4, reason: not valid java name */
    public static /* synthetic */ void m406$r8$lambda$t7kFuyNAOagKgC4Y3OrFaNmHd4(ca.dnamobile.javalauncher.SplashActivity r0) {
            r0.lambda$startInstallThread$0()
            return
    }

    public SplashActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.List<ca.dnamobile.javalauncher.SplashActivity.TaskEntry> buildTasks() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ca.dnamobile.javalauncher.feature.unpack.Components[] r1 = ca.dnamobile.javalauncher.feature.unpack.Components.values()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L28
            r5 = r1[r4]
            ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask r6 = new ca.dnamobile.javalauncher.feature.unpack.UnpackComponentsTask
            r6.<init>(r8, r5)
            boolean r7 = r6.isCheckFailed()
            if (r7 != 0) goto L25
            ca.dnamobile.javalauncher.SplashActivity$TaskEntry r7 = new ca.dnamobile.javalauncher.SplashActivity$TaskEntry
            java.lang.String r5 = r5.displayName
            r7.<init>(r5, r6)
            r0.add(r7)
        L25:
            int r4 = r4 + 1
            goto Lc
        L28:
            ca.dnamobile.javalauncher.feature.unpack.Jre[] r1 = ca.dnamobile.javalauncher.feature.unpack.Jre.values()
            int r2 = r1.length
        L2d:
            if (r3 >= r2) goto L49
            r4 = r1[r3]
            ca.dnamobile.javalauncher.feature.unpack.UnpackJreTask r5 = new ca.dnamobile.javalauncher.feature.unpack.UnpackJreTask
            r5.<init>(r8, r4)
            boolean r6 = r5.isCheckFailed()
            if (r6 != 0) goto L46
            ca.dnamobile.javalauncher.SplashActivity$TaskEntry r6 = new ca.dnamobile.javalauncher.SplashActivity$TaskEntry
            java.lang.String r4 = r4.jreName
            r6.<init>(r4, r5)
            r0.add(r6)
        L46:
            int r3 = r3 + 1
            goto L2d
        L49:
            return r0
    }

    private /* synthetic */ void lambda$openMainActivity$1() {
            r2 = this;
            boolean r0 = r2.finished
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = ca.dnamobile.javalauncher.R.string.splash_screen_done
            java.lang.String r0 = r2.getString(r0)
            r2.setStatus(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.launcher.JavaLaunch> r1 = ca.dnamobile.javalauncher.launcher.JavaLaunch.class
            r0.<init>(r2, r1)
            r2.startActivity(r0)
            r2.finish()
            return
    }

    private /* synthetic */ void lambda$setStatus$2(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto Lb
            android.widget.TextView r0 = r1.statusText
            if (r0 == 0) goto Lb
            r0.setText(r2)
        Lb:
            return
    }

    private /* synthetic */ void lambda$startInstallThread$0() {
            r3 = this;
            r3.runInstallFlow()     // Catch: java.lang.Throwable -> L7
            r3.openMainActivity()     // Catch: java.lang.Throwable -> L7
            goto L2f
        L7:
            r0 = move-exception
            java.lang.String r1 = "SplashActivity"
            java.lang.String r2 = "Launcher preparation failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r2, r0)
            int r1 = ca.dnamobile.javalauncher.R.string.splash_screen_failed
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L1c
            java.lang.String r0 = r0.getMessage()
            goto L24
        L1c:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L24:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r3.getString(r1, r0)
            r3.setStatus(r0)
        L2f:
            return
    }

    private void openMainActivity() {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.SplashActivity$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.SplashActivity$$ExternalSyntheticLambda1
            r0.<init>(r1)
            r1.runOnUiThread(r0)
            return
    }

    private void runInstallFlow() {
            r8 = this;
            int r0 = ca.dnamobile.javalauncher.R.string.splash_screen_checking
            java.lang.String r0 = r8.getString(r0)
            r8.setStatus(r0)
            java.util.List r0 = r8.buildTasks()
            int r1 = r0.size()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L16:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r0.next()
            ca.dnamobile.javalauncher.SplashActivity$TaskEntry r3 = (ca.dnamobile.javalauncher.SplashActivity.TaskEntry) r3
            int r2 = r2 + 1
            int r4 = ca.dnamobile.javalauncher.R.string.splash_screen_checking_item
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.String r7 = r3.name
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7}
            java.lang.String r4 = r8.getString(r4, r5)
            r8.setStatus(r4)
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask r4 = r3.task
            boolean r4 = r4.isNeedUnpack()
            if (r4 != 0) goto L44
            goto L16
        L44:
            int r4 = ca.dnamobile.javalauncher.R.string.splash_screen_installing_item
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.String r7 = r3.name
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7}
            java.lang.String r4 = r8.getString(r4, r5)
            r8.setStatus(r4)
            ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask r3 = r3.task
            r3.run()
            goto L16
        L61:
            int r0 = ca.dnamobile.javalauncher.R.string.splash_screen_finalizing
            java.lang.String r0 = r8.getString(r0)
            r8.setStatus(r0)
            ca.dnamobile.javalauncher.feature.unpack.UnpackSingleFilesTask r0 = new ca.dnamobile.javalauncher.feature.unpack.UnpackSingleFilesTask
            r0.<init>(r8)
            r0.run()
            return
    }

    private void setStatus(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 == 0) goto L5
            return
        L5:
            ca.dnamobile.javalauncher.SplashActivity$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.SplashActivity$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            r1.runOnUiThread(r0)
            return
    }

    private void startInstallThread() {
            r3 = this;
            java.lang.Thread r0 = new java.lang.Thread
            ca.dnamobile.javalauncher.SplashActivity$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.SplashActivity$$ExternalSyntheticLambda2
            r1.<init>(r3)
            java.lang.String r2 = "JavaLauncher Unpack"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            int r2 = ca.dnamobile.javalauncher.R.layout.activity_splash
            r1.setContentView(r2)
            int r2 = ca.dnamobile.javalauncher.R.id.textTitle
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.titleText = r2
            int r2 = ca.dnamobile.javalauncher.R.id.textStatus
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.statusText = r2
            android.widget.TextView r2 = r1.titleText
            int r0 = ca.dnamobile.javalauncher.R.string.app_name
            r2.setText(r0)
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
            boolean r2 = net.kdt.pojavlaunch.Tools.checkStorageRoot()
            if (r2 != 0) goto L36
            int r2 = ca.dnamobile.javalauncher.R.string.splash_screen_storage_unavailable
            java.lang.String r2 = r1.getString(r2)
            r1.setStatus(r2)
            return
        L36:
            r1.startInstallThread()
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
            r1 = this;
            r0 = 1
            r1.finished = r0
            super.onDestroy()
            return
    }
}
