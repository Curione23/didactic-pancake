package ca.dnamobile.javalauncher.settings;

/* JADX INFO: loaded from: classes.dex */
public class SimpleVoiceChatPermissionActivity extends android.app.Activity {
    private android.widget.TextView statusText;

    public static /* synthetic */ void $r8$lambda$PMXUjEFlqoIRXetDM7zIIV9uzZI(ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity r0, android.view.View r1) {
            r0.lambda$onCreate$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$VxyUxz4h59VKnmx28ayBeDRiCWA(ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity r0, android.view.View r1) {
            r0.lambda$onCreate$2(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$dUOytx5NuAiTxdVkjQaCn4RYN-s, reason: not valid java name */
    public static /* synthetic */ void m559$r8$lambda$dUOytx5NuAiTxdVkjQaCn4RYNs(ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity r0, android.view.View r1) {
            r0.lambda$onCreate$0(r1)
            return
    }

    public SimpleVoiceChatPermissionActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private int dp(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    private /* synthetic */ void lambda$onCreate$0(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.showRequestDialog(r0)
            return
    }

    private /* synthetic */ void lambda$onCreate$1(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.openAppSettings(r0)
            return
    }

    private /* synthetic */ void lambda$onCreate$2(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    public static void open(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity> r1 = ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity.class
            r0.<init>(r2, r1)
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 != 0) goto L10
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
        L10:
            r2.startActivity(r0)
            return
    }

    private void updateStatus() {
            r2 = this;
            android.widget.TextView r0 = r2.statusText
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = ca.dnamobile.javalauncher.modcompat.AndroidMicrophonePermission.isGranted(r2)
            android.widget.TextView r1 = r2.statusText
            if (r0 == 0) goto L10
            java.lang.String r0 = "Status: microphone permission granted"
            goto L12
        L10:
            java.lang.String r0 = "Status: microphone permission not granted"
        L12:
            r1.setText(r0)
            return
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r8) {
            r7 = this;
            super.onCreate(r8)
            r8 = 20
            int r8 = r7.dp(r8)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 16
            r0.setGravity(r1)
            r0.setPadding(r8, r8, r8, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r8.<init>(r1, r1)
            r0.setLayoutParams(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r7)
            java.lang.String r2 = "Simple Voice Chat"
            r8.setText(r2)
            r2 = 1103101952(0x41c00000, float:24.0)
            r8.setTextSize(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r8.setTypeface(r2)
            r2 = 10
            int r2 = r7.dp(r2)
            r3 = 0
            r8.setPadding(r3, r3, r3, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r2.<init>(r1, r4)
            r0.addView(r8, r2)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r7)
            java.lang.String r2 = "Enable microphone permission so Minecraft mods like Simple Voice Chat can access your device microphone while the game is running."
            r8.setText(r2)
            r2 = 1098907648(0x41800000, float:16.0)
            r8.setTextSize(r2)
            r5 = 18
            int r6 = r7.dp(r5)
            r8.setPadding(r3, r3, r3, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r1, r4)
            r0.addView(r8, r6)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r7)
            r7.statusText = r8
            r8.setTextSize(r2)
            android.widget.TextView r8 = r7.statusText
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r8.setTypeface(r2)
            android.widget.TextView r8 = r7.statusText
            int r2 = r7.dp(r5)
            r8.setPadding(r3, r3, r3, r2)
            android.widget.TextView r8 = r7.statusText
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r4)
            r0.addView(r8, r2)
            android.widget.Button r8 = new android.widget.Button
            r8.<init>(r7)
            java.lang.String r2 = "Enable microphone permission"
            r8.setText(r2)
            ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity$$ExternalSyntheticLambda0 r2 = new ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity$$ExternalSyntheticLambda0
            r2.<init>(r7)
            r8.setOnClickListener(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r4)
            r0.addView(r8, r2)
            android.widget.Button r8 = new android.widget.Button
            r8.<init>(r7)
            java.lang.String r2 = "Open Android app settings"
            r8.setText(r2)
            ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity$$ExternalSyntheticLambda1
            r2.<init>(r7)
            r8.setOnClickListener(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r4)
            r0.addView(r8, r2)
            android.widget.Button r8 = new android.widget.Button
            r8.<init>(r7)
            java.lang.String r2 = "Close"
            r8.setText(r2)
            ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity$$ExternalSyntheticLambda2 r2 = new ca.dnamobile.javalauncher.settings.SimpleVoiceChatPermissionActivity$$ExternalSyntheticLambda2
            r2.<init>(r7)
            r8.setOnClickListener(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r4)
            r0.addView(r8, r2)
            r7.setContentView(r0)
            r7.updateStatus()
            return
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            super.onRequestPermissionsResult(r1, r2, r3)
            r0.updateStatus()
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r0 = this;
            super.onResume()
            r0.updateStatus()
            return
    }
}
