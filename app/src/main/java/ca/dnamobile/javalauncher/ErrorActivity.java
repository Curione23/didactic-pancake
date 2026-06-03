package ca.dnamobile.javalauncher;

/* JADX INFO: loaded from: classes.dex */
public class ErrorActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final java.lang.String EXTRA_MESSAGE = "message";

    public static /* synthetic */ void $r8$lambda$qYCT2gUz9GISU4AW9eRLkhdODxs(ca.dnamobile.javalauncher.ErrorActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$onCreate$0(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$zcTgMVKQaBPkW-3GdT5HkBTtu_E, reason: not valid java name */
    public static /* synthetic */ void m147$r8$lambda$zcTgMVKQaBPkW3GdT5HkBTtu_E(ca.dnamobile.javalauncher.ErrorActivity r0, android.content.DialogInterface r1, int r2) {
            r0.lambda$onCreate$1(r1, r2)
            return
    }

    public ErrorActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private /* synthetic */ void lambda$onCreate$0(android.content.DialogInterface r1, int r2) {
            r0 = this;
            ca.dnamobile.javalauncher.logs.LauncherLogManager.shareLatestLog(r0)
            return
    }

    private /* synthetic */ void lambda$onCreate$1(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r0.finish()
            return
    }

    public static void showExitMessage(android.content.Context r1, int r2, boolean r3) {
            if (r3 == 0) goto L12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Minecraft stopped from signal "
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            goto L21
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Minecraft exited with code "
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
        L21:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.ErrorActivity> r0 = ca.dnamobile.javalauncher.ErrorActivity.class
            r3.<init>(r1, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r0)
            java.lang.String r0 = "message"
            r3.putExtra(r0, r2)
            r1.startActivity(r3)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "message"
            java.lang.String r4 = r4.getStringExtra(r0)
            if (r4 == 0) goto L19
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
        L19:
            java.lang.String r4 = "Minecraft exited."
        L1b:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            android.content.res.Resources r1 = r3.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1103101952(0x41c00000, float:24.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.setPadding(r1, r1, r1, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = "\n\nUse Share latestlog.txt so the crash can be checked."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r1)
            r3.setContentView(r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r3)
            java.lang.String r1 = "Game exited"
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "\n\nShare latestlog.txt so the crash can be checked?"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            androidx.appcompat.app.AlertDialog$Builder r4 = r0.setMessage(r4)
            int r0 = ca.dnamobile.javalauncher.R.string.button_share_latest_log
            ca.dnamobile.javalauncher.ErrorActivity$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ErrorActivity$$ExternalSyntheticLambda0
            r1.<init>(r3)
            androidx.appcompat.app.AlertDialog$Builder r4 = r4.setPositiveButton(r0, r1)
            ca.dnamobile.javalauncher.ErrorActivity$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.ErrorActivity$$ExternalSyntheticLambda1
            r0.<init>(r3)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            androidx.appcompat.app.AlertDialog$Builder r4 = r4.setNegativeButton(r1, r0)
            r4.show()
            return
    }
}
