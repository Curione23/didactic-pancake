package ca.dnamobile.javalauncher.ui;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherDialogStyle {
    public static final int COLOR_ACCENT = 0;
    public static final int COLOR_ACCENT_MUTED = 0;
    public static final int COLOR_CARD_BG = 0;
    public static final int COLOR_CARD_BG_PRESSED = 0;
    public static final int COLOR_CARD_STROKE = 0;
    public static final int COLOR_DIALOG_BG = 0;
    public static final int COLOR_TEXT_MUTED = 0;
    public static final int COLOR_TEXT_PRIMARY = 0;
    public static final int COLOR_TEXT_SECONDARY = 0;
    public static final float DIALOG_DIM_NORMAL = 0.58f;

    static {
            r0 = 34
            r1 = 42
            r2 = 30
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_DIALOG_BG = r0
            r0 = 53
            r1 = 38
            r2 = 43
            int r0 = android.graphics.Color.rgb(r1, r2, r0)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_BG = r0
            r0 = 49
            r1 = 60
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_BG_PRESSED = r0
            r0 = 61
            r1 = 74
            r2 = 54
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_STROKE = r0
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 248(0xf8, float:3.48E-43)
            r2 = 238(0xee, float:3.34E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_PRIMARY = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 216(0xd8, float:3.03E-43)
            r2 = 198(0xc6, float:2.77E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_SECONDARY = r0
            r0 = 159(0x9f, float:2.23E-43)
            r1 = 176(0xb0, float:2.47E-43)
            r2 = 150(0x96, float:2.1E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_MUTED = r0
            r0 = 211(0xd3, float:2.96E-43)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 37
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_ACCENT = r0
            r0 = 135(0x87, float:1.89E-43)
            r1 = 110(0x6e, float:1.54E-43)
            r2 = 86
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_ACCENT_MUTED = r0
            return
    }

    private LauncherDialogStyle() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.widget.LinearLayout createDialogRoot(android.app.Activity r7, java.lang.CharSequence r8, java.lang.CharSequence r9) {
            r0 = 18
            int r0 = dp(r7, r0)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r7)
            r2 = 1
            r1.setOrientation(r2)
            r3 = 8
            int r3 = dp(r7, r3)
            r1.setPadding(r0, r0, r0, r3)
            int r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_DIALOG_BG
            r1.setBackgroundColor(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            r0.setText(r8)
            r8 = 1102577664(0x41b80000, float:23.0)
            r0.setTextSize(r8)
            android.graphics.Typeface r8 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r8)
            int r8 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_PRIMARY
            r0.setTextColor(r8)
            r8 = 2
            int r3 = dp(r7, r8)
            int r4 = dp(r7, r8)
            r5 = 6
            int r5 = dp(r7, r5)
            r6 = 0
            r0.setPadding(r3, r6, r4, r5)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r1.addView(r0, r3)
            if (r9 == 0) goto L8d
            int r0 = r9.length()
            if (r0 <= 0) goto L8d
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            r0.setText(r9)
            r9 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r9)
            int r9 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_SECONDARY
            r0.setTextColor(r9)
            int r9 = dp(r7, r2)
            float r9 = (float) r9
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setLineSpacing(r9, r2)
            int r9 = dp(r7, r8)
            int r8 = dp(r7, r8)
            r2 = 10
            int r7 = dp(r7, r2)
            r0.setPadding(r9, r6, r8, r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r4, r5)
            r1.addView(r0, r7)
        L8d:
            return r1
    }

    public static int dp(android.content.Context r0, int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    static /* synthetic */ void lambda$showStyledMessageDialog$0(android.app.Activity r0, androidx.appcompat.app.AlertDialog r1, android.content.DialogInterface r2) {
            styleDialogChrome(r0, r1)
            return
    }

    public static android.graphics.drawable.GradientDrawable roundedDrawable(android.content.Context r1, int r2, int r3, int r4) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setColor(r2)
            int r2 = dp(r1, r4)
            float r2 = (float) r2
            r0.setCornerRadius(r2)
            r2 = 1
            int r1 = dp(r1, r2)
            r0.setStroke(r1, r3)
            return r0
    }

    public static androidx.appcompat.app.AlertDialog showStyledMessageDialog(android.app.Activity r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.CharSequence r9, android.content.DialogInterface.OnClickListener r10, java.lang.CharSequence r11) {
            r0 = 14
            int r0 = dp(r6, r0)
            r1 = 0
            android.widget.LinearLayout r7 = createDialogRoot(r6, r7, r1)
            android.widget.ScrollView r2 = new android.widget.ScrollView
            r2.<init>(r6)
            r3 = 0
            r2.setFillViewport(r3)
            r2.setClipToPadding(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r6)
            r3.setText(r8)
            r8 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r8)
            int r8 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_TEXT_SECONDARY
            r3.setTextColor(r8)
            r8 = 2
            int r4 = dp(r6, r8)
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.setLineSpacing(r4, r5)
            r3.setPadding(r0, r0, r0, r0)
            int r0 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_BG
            int r4 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_CARD_STROKE
            r5 = 18
            android.graphics.drawable.GradientDrawable r0 = roundedDrawable(r6, r0, r4, r5)
            r3.setBackground(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r5 = -2
            r0.<init>(r4, r5)
            r2.addView(r3, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r5)
            int r8 = dp(r6, r8)
            r0.topMargin = r8
            r7.addView(r2, r0)
            androidx.appcompat.app.AlertDialog$Builder r8 = new androidx.appcompat.app.AlertDialog$Builder
            r8.<init>(r6)
            androidx.appcompat.app.AlertDialog$Builder r7 = r8.setView(r7)
            androidx.appcompat.app.AlertDialog$Builder r7 = r7.setNegativeButton(r11, r1)
            androidx.appcompat.app.AlertDialog$Builder r7 = r7.setPositiveButton(r9, r10)
            androidx.appcompat.app.AlertDialog r7 = r7.create()
            ca.dnamobile.javalauncher.ui.LauncherDialogStyle$$ExternalSyntheticLambda0 r8 = new ca.dnamobile.javalauncher.ui.LauncherDialogStyle$$ExternalSyntheticLambda0
            r8.<init>(r6, r7)
            r7.setOnShowListener(r8)
            r7.show()
            styleDialogChrome(r6, r7)
            return r7
    }

    public static void styleDialogChrome(android.app.Activity r3, androidx.appcompat.app.AlertDialog r4) {
            if (r4 != 0) goto L3
            return
        L3:
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L1a
            int r1 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_DIALOG_BG
            r2 = 22
            android.graphics.drawable.GradientDrawable r3 = roundedDrawable(r3, r1, r1, r2)
            r0.setBackgroundDrawable(r3)
            r3 = 1058306785(0x3f147ae1, float:0.58)
            r0.setDimAmount(r3)
        L1a:
            r3 = -1
            tintDialogButton(r4, r3)
            r3 = -2
            tintDialogButton(r4, r3)
            r3 = -3
            tintDialogButton(r4, r3)
            return
    }

    public static void tintDialogButton(androidx.appcompat.app.AlertDialog r0, int r1) {
            android.widget.Button r0 = r0.getButton(r1)
            if (r0 == 0) goto L10
            int r1 = ca.dnamobile.javalauncher.ui.LauncherDialogStyle.COLOR_ACCENT
            r0.setTextColor(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r1)
        L10:
            return
    }
}
