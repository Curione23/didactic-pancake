package ca.dnamobile.javalauncher.ui;

/* JADX INFO: loaded from: classes.dex */
public final class ModpackInstallProgressDialog {
    private final android.app.Activity activity;
    private android.widget.TextView detailView;
    private androidx.appcompat.app.AlertDialog dialog;
    private android.widget.ProgressBar progressBar;
    private android.widget.TextView statusView;

    /* JADX INFO: renamed from: $r8$lambda$Xya0Kva-mws07zDpq6qxrCW-mdM, reason: not valid java name */
    public static /* synthetic */ void m569$r8$lambda$Xya0Kvamws07zDpq6qxrCWmdM(ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog r0, android.content.DialogInterface r1) {
            r0.lambda$show$0(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$nj1Z2IhM-ls7p0JzoqA-ofRt4c4, reason: not valid java name */
    public static /* synthetic */ void m570$r8$lambda$nj1Z2IhMls7p0JzoqAofRt4c4(ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog r0, android.content.DialogInterface r1) {
            r0.lambda$show$1(r1)
            return
    }

    public ModpackInstallProgressDialog(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.activity = r1
            return
    }

    private static java.lang.String cleanTitle(java.lang.String r1) {
            java.lang.String r1 = r1.trim()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            java.lang.String r1 = "Modpack"
        Lc:
            return r1
    }

    private /* synthetic */ void lambda$show$0(android.content.DialogInterface r2) {
            r1 = this;
            android.app.Activity r2 = r1.activity
            androidx.appcompat.app.AlertDialog r0 = r1.dialog
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.styleDialogChrome(r2, r0)
            android.app.Activity r2 = r1.activity
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r2)
            return
    }

    private /* synthetic */ void lambda$show$1(android.content.DialogInterface r2) {
            r1 = this;
            android.app.Activity r2 = r1.activity
            android.view.Window r2 = r2.getWindow()
            r0 = 128(0x80, float:1.8E-43)
            r2.clearFlags(r0)
            r2 = 0
            r1.statusView = r2
            r1.detailView = r2
            r1.progressBar = r2
            android.app.Activity r2 = r1.activity
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r2)
            return
    }

    private static void tintProgressBar(android.widget.ProgressBar r1) {
            int r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_ACCENT
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setProgressTintList(r0)
            int r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_ACCENT
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setIndeterminateTintList(r0)
            int r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_STROKE
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setProgressBackgroundTintList(r0)
            return
    }

    public void dismiss() {
            r3 = this;
            androidx.appcompat.app.AlertDialog r0 = r3.dialog
            r1 = 0
            r3.dialog = r1
            if (r0 == 0) goto Lb
            r0.dismiss()
            goto L16
        Lb:
            android.app.Activity r0 = r3.activity
            android.view.Window r0 = r0.getWindow()
            r2 = 128(0x80, float:1.8E-43)
            r0.clearFlags(r2)
        L16:
            r3.statusView = r1
            r3.detailView = r1
            r3.progressBar = r1
            return
    }

    public boolean isShowing() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.dialog
            if (r0 == 0) goto Lc
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void setProgress(int r4, int r5) {
            r3 = this;
            android.widget.ProgressBar r0 = r3.progressBar
            android.widget.TextView r1 = r3.detailView
            if (r0 != 0) goto L7
            return
        L7:
            if (r5 <= 0) goto L3a
            int r4 = java.lang.Math.min(r4, r5)
            r2 = 0
            int r4 = java.lang.Math.max(r2, r4)
            r0.setIndeterminate(r2)
            r0.setMax(r5)
            r0.setProgress(r4)
            if (r1 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Installing "
            r0.<init>(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " / "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.setText(r4)
            goto L47
        L3a:
            if (r4 >= 0) goto L47
            r4 = 1
            r0.setIndeterminate(r4)
            if (r1 == 0) goto L47
            java.lang.String r4 = "Working… this can take a moment for larger packs."
            r1.setText(r4)
        L47:
            return
    }

    public void setStatus(java.lang.String r3) {
            r2 = this;
            android.widget.TextView r0 = r2.statusView
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r3 = r3.trim()
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L10
            return
        L10:
            r0.setText(r3)
            return
    }

    public void show(java.lang.String r14) {
            r13 = this;
            r13.dismiss()
            android.app.Activity r0 = r13.activity
            android.view.Window r0 = r0.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            android.app.Activity r0 = r13.activity
            r1 = 18
            int r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r0, r1)
            android.app.Activity r2 = r13.activity
            r3 = 14
            int r2 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r2, r3)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.app.Activity r5 = r13.activity
            r4.<init>(r5)
            r5 = 1
            r4.setOrientation(r5)
            android.app.Activity r6 = r13.activity
            r7 = 10
            int r6 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r6, r7)
            r4.setPadding(r0, r0, r0, r6)
            int r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_DIALOG_BG
            r4.setBackgroundColor(r0)
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r6 = r13.activity
            r0.<init>(r6)
            java.lang.String r6 = "Installing modpack"
            r0.setText(r6)
            r6 = 1102577664(0x41b80000, float:23.0)
            r0.setTextSize(r6)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r6)
            int r6 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_PRIMARY
            r0.setTextColor(r6)
            android.app.Activity r6 = r13.activity
            r7 = 2
            int r6 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r6, r7)
            android.app.Activity r8 = r13.activity
            int r8 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r8, r7)
            android.app.Activity r9 = r13.activity
            r10 = 6
            int r9 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r9, r10)
            r11 = 0
            r0.setPadding(r6, r11, r8, r9)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r6.<init>(r8, r9)
            r4.addView(r0, r6)
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r6 = r13.activity
            r0.<init>(r6)
            java.lang.String r14 = cleanTitle(r14)
            r0.setText(r14)
            r14 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r14)
            int r14 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_SECONDARY
            r0.setTextColor(r14)
            r0.setMaxLines(r7)
            android.app.Activity r14 = r13.activity
            int r14 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r14, r7)
            android.app.Activity r6 = r13.activity
            int r6 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r6, r7)
            android.app.Activity r7 = r13.activity
            r12 = 12
            int r7 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r7, r12)
            r0.setPadding(r14, r11, r6, r7)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r8, r9)
            r4.addView(r0, r14)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.app.Activity r0 = r13.activity
            r14.<init>(r0)
            r14.setOrientation(r5)
            r14.setPadding(r2, r2, r2, r2)
            android.app.Activity r0 = r13.activity
            int r2 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_BG
            int r6 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_STROKE
            android.graphics.drawable.GradientDrawable r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.roundedDrawable(r0, r2, r6, r1)
            r14.setBackground(r0)
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r1 = r13.activity
            r0.<init>(r1)
            r13.statusView = r0
            java.lang.String r1 = "Preparing modpack install…"
            r0.setText(r1)
            android.widget.TextView r0 = r13.statusView
            r1 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r1)
            android.widget.TextView r0 = r13.statusView
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r1)
            android.widget.TextView r0 = r13.statusView
            int r1 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_PRIMARY
            r0.setTextColor(r1)
            android.widget.TextView r0 = r13.statusView
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r8, r9)
            r14.addView(r0, r1)
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r1 = r13.activity
            r0.<init>(r1)
            r13.detailView = r0
            java.lang.String r1 = "Keep JavaLauncher open while files are downloaded and imported."
            r0.setText(r1)
            android.widget.TextView r0 = r13.detailView
            r1 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r1)
            android.widget.TextView r0 = r13.detailView
            int r1 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_MUTED
            r0.setTextColor(r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r8, r9)
            android.app.Activity r1 = r13.activity
            int r1 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r1, r10)
            r0.topMargin = r1
            android.widget.TextView r1 = r13.detailView
            r14.addView(r1, r0)
            android.widget.ProgressBar r0 = new android.widget.ProgressBar
            android.app.Activity r1 = r13.activity
            r2 = 0
            r6 = 16842872(0x1010078, float:2.3693894E-38)
            r0.<init>(r1, r2, r6)
            r13.progressBar = r0
            r0.setIndeterminate(r5)
            android.widget.ProgressBar r0 = r13.progressBar
            r1 = 100
            r0.setMax(r1)
            android.widget.ProgressBar r0 = r13.progressBar
            r0.setProgress(r11)
            android.widget.ProgressBar r0 = r13.progressBar
            tintProgressBar(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r8, r9)
            android.app.Activity r1 = r13.activity
            int r1 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r1, r3)
            r0.topMargin = r1
            android.widget.ProgressBar r1 = r13.progressBar
            r14.addView(r1, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r8, r9)
            r4.addView(r14, r0)
            android.widget.TextView r14 = new android.widget.TextView
            android.app.Activity r0 = r13.activity
            r14.<init>(r0)
            java.lang.String r0 = "The screen will stay awake until this install finishes."
            r14.setText(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r14.setTextSize(r0)
            int r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_MUTED
            r14.setTextColor(r0)
            r0 = 16
            r14.setGravity(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r8, r9)
            android.app.Activity r1 = r13.activity
            int r1 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.dp(r1, r12)
            r0.topMargin = r1
            r4.addView(r14, r0)
            androidx.appcompat.app.AlertDialog$Builder r14 = new androidx.appcompat.app.AlertDialog$Builder
            android.app.Activity r0 = r13.activity
            r14.<init>(r0)
            androidx.appcompat.app.AlertDialog$Builder r14 = r14.setView(r4)
            androidx.appcompat.app.AlertDialog$Builder r14 = r14.setCancelable(r11)
            androidx.appcompat.app.AlertDialog r14 = r14.create()
            r13.dialog = r14
            r14.setCanceledOnTouchOutside(r11)
            androidx.appcompat.app.AlertDialog r14 = r13.dialog
            ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog$$ExternalSyntheticLambda0
            r0.<init>(r13)
            r14.setOnShowListener(r0)
            androidx.appcompat.app.AlertDialog r14 = r13.dialog
            ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.ui.ModpackInstallProgressDialog$$ExternalSyntheticLambda1
            r0.<init>(r13)
            r14.setOnDismissListener(r0)
            androidx.appcompat.app.AlertDialog r14 = r13.dialog
            r14.show()
            android.app.Activity r14 = r13.activity
            androidx.appcompat.app.AlertDialog r0 = r13.dialog
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.styleDialogChrome(r14, r0)
            android.app.Activity r14 = r13.activity
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r14)
            return
    }
}
