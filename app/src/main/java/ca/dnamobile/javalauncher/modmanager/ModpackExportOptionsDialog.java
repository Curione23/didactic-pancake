package ca.dnamobile.javalauncher.modmanager;

/* JADX INFO: loaded from: classes.dex */
public final class ModpackExportOptionsDialog {
    private static final int COLOR_ACCENT = 0;
    private static final int COLOR_CARD_BG = 0;
    private static final int COLOR_CARD_BG_PRESSED = 0;
    private static final int COLOR_CARD_STROKE = 0;
    private static final int COLOR_DIALOG_BG = 0;
    private static final int COLOR_TEXT_MUTED = 0;
    private static final int COLOR_TEXT_PRIMARY = 0;
    private static final int COLOR_TEXT_SECONDARY = 0;
    private static final float DIALOG_DIM_NORMAL = 0.58f;

    public interface Listener {
        void onExport(ca.dnamobile.javalauncher.modmanager.ModpackExportManager.ExportOptions r1);
    }

    static {
            r0 = 34
            r1 = 42
            r2 = 30
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_DIALOG_BG = r0
            r0 = 53
            r1 = 38
            r2 = 43
            int r0 = android.graphics.Color.rgb(r1, r2, r0)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_CARD_BG = r0
            r0 = 49
            r1 = 60
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_CARD_BG_PRESSED = r0
            r0 = 61
            r1 = 74
            r2 = 54
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_CARD_STROKE = r0
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 248(0xf8, float:3.48E-43)
            r2 = 238(0xee, float:3.34E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_PRIMARY = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 216(0xd8, float:3.03E-43)
            r2 = 198(0xc6, float:2.77E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_SECONDARY = r0
            r0 = 159(0x9f, float:2.23E-43)
            r1 = 176(0xb0, float:2.47E-43)
            r2 = 150(0x96, float:2.1E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_MUTED = r0
            r0 = 152(0x98, float:2.13E-43)
            r1 = 31
            r2 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_ACCENT = r0
            return
    }

    private ModpackExportOptionsDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.widget.LinearLayout addCard(android.app.Activity r4, android.widget.LinearLayout r5) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 14
            int r2 = dp(r4, r2)
            r0.setPadding(r2, r2, r2, r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r3 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_CARD_BG
            r2.setColor(r3)
            r3 = 18
            int r3 = dp(r4, r3)
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            int r1 = dp(r4, r1)
            int r3 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_CARD_STROKE
            r2.setStroke(r1, r3)
            r0.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r2 = 12
            int r4 = dp(r4, r2)
            r2 = 0
            r1.setMargins(r2, r2, r2, r4)
            r5.addView(r0, r1)
            return r0
    }

    private static void addCardTitle(android.app.Activity r2, android.widget.LinearLayout r3, java.lang.String r4) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r4)
            r4 = 2
            r1 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r4, r1)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r4)
            int r4 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_PRIMARY
            r0.setTextColor(r4)
            r4 = 8
            int r2 = dp(r2, r4)
            r4 = 0
            r0.setPadding(r4, r4, r4, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r1 = -2
            r2.<init>(r4, r1)
            r3.addView(r0, r2)
            return
    }

    private static android.widget.CheckBox addCheckRow(android.app.Activity r4, android.widget.LinearLayout r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) {
            android.widget.LinearLayout r0 = buildBaseRow(r4, r9)
            r0.setClickable(r9)
            r0.setFocusable(r9)
            android.widget.LinearLayout r6 = buildTextColumn(r4, r6, r7, r9)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = -2
            r7.<init>(r2, r3, r1)
            r0.addView(r6, r7)
            android.widget.CheckBox r6 = new android.widget.CheckBox
            r6.<init>(r4)
            if (r9 == 0) goto L24
            if (r8 == 0) goto L24
            r2 = 1
        L24:
            r6.setChecked(r2)
            r6.setEnabled(r9)
            android.content.res.ColorStateList r7 = buildCheckboxTint()
            r6.setButtonTintList(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r3, r3)
            r0.addView(r6, r7)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda4 r7 = new ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda4
            r7.<init>(r6)
            r0.setOnClickListener(r7)
            addRow(r5, r0, r4)
            return r6
    }

    private static android.widget.TextView addInfoText(android.app.Activity r2, android.widget.LinearLayout r3, java.lang.String r4) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r4)
            r4 = 2
            r1 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r4, r1)
            int r4 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_SECONDARY
            r0.setTextColor(r4)
            r4 = 8
            int r2 = dp(r2, r4)
            r4 = 0
            r0.setPadding(r4, r4, r4, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r1 = -2
            r2.<init>(r4, r1)
            r3.addView(r0, r2)
            return r0
    }

    private static void addLockedRow(android.app.Activity r7, android.widget.LinearLayout r8, java.lang.String r9, java.lang.String r10) {
            r0 = 1
            android.widget.LinearLayout r1 = buildBaseRow(r7, r0)
            android.widget.LinearLayout r9 = buildTextColumn(r7, r9, r10, r0)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = -2
            r10.<init>(r3, r4, r2)
            r1.addView(r9, r10)
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r7)
            java.lang.String r10 = "Locked"
            r9.setText(r10)
            r10 = 2
            r2 = 1094713344(0x41400000, float:12.0)
            r9.setTextSize(r10, r2)
            android.graphics.Typeface r10 = android.graphics.Typeface.DEFAULT_BOLD
            r9.setTypeface(r10)
            int r10 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_SECONDARY
            r9.setTextColor(r10)
            r10 = 8
            int r2 = dp(r7, r10)
            r5 = 4
            int r6 = dp(r7, r5)
            int r10 = dp(r7, r10)
            int r5 = dp(r7, r5)
            r9.setPadding(r2, r6, r10, r5)
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r10.setColor(r3)
            int r0 = dp(r7, r0)
            int r2 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_CARD_STROKE
            r10.setStroke(r0, r2)
            r0 = 20
            int r0 = dp(r7, r0)
            float r0 = (float) r0
            r10.setCornerRadius(r0)
            r9.setBackground(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r4, r4)
            r1.addView(r9, r10)
            addRow(r8, r1, r7)
            return
    }

    private static void addRow(android.widget.LinearLayout r3, android.view.View r4, android.app.Activity r5) {
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r1 = 8
            int r5 = dp(r5, r1)
            r0.topMargin = r5
            r3.addView(r4, r0)
            return
    }

    private static android.widget.LinearLayout buildBaseRow(android.app.Activity r5, boolean r6) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r5)
            r1 = 0
            r0.setOrientation(r1)
            r1 = 16
            r0.setGravity(r1)
            r1 = 62
            int r1 = dp(r5, r1)
            r0.setMinimumHeight(r1)
            r1 = 14
            int r1 = dp(r5, r1)
            r2 = 9
            int r3 = dp(r5, r2)
            r4 = 10
            int r4 = dp(r5, r4)
            int r2 = dp(r5, r2)
            r0.setPadding(r1, r3, r4, r2)
            r0.setEnabled(r6)
            if (r6 == 0) goto L38
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L3b
        L38:
            r6 = 1056293519(0x3ef5c28f, float:0.48)
        L3b:
            r0.setAlpha(r6)
            android.graphics.drawable.GradientDrawable r5 = rowBackground(r5)
            r0.setBackground(r5)
            return r0
    }

    private static android.content.res.ColorStateList buildCheckboxTint() {
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r2 = 16842910(0x101009e, float:2.3694E-38)
            int[] r1 = new int[]{r1, r2}
            int[] r2 = new int[]{r2}
            r3 = 0
            int[] r3 = new int[r3]
            int[][] r1 = new int[][]{r1, r2, r3}
            int r2 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_ACCENT
            int r3 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_MUTED
            int[] r2 = new int[]{r2, r3, r3}
            r0.<init>(r1, r2)
            return r0
    }

    private static android.widget.LinearLayout buildTextColumn(android.app.Activity r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r5)
            r1 = 1
            r0.setOrientation(r1)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r5)
            r2.setText(r6)
            r6 = 1097859072(0x41700000, float:15.0)
            r3 = 2
            r2.setTextSize(r3, r6)
            if (r8 == 0) goto L1c
            int r6 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_PRIMARY
            goto L1e
        L1c:
            int r6 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_MUTED
        L1e:
            r2.setTextColor(r6)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r2.setTypeface(r6)
            r2.setSingleLine(r1)
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r4 = -2
            r6.<init>(r1, r4)
            r0.addView(r2, r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r5)
            r6.setText(r7)
            r7 = 1094713344(0x41400000, float:12.0)
            r6.setTextSize(r3, r7)
            if (r8 == 0) goto L4a
            int r7 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_SECONDARY
            goto L4c
        L4a:
            int r7 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_MUTED
        L4c:
            r6.setTextColor(r7)
            r7 = 0
            r6.setSingleLine(r7)
            r6.setMaxLines(r3)
            android.text.TextUtils$TruncateAt r7 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r1, r4)
            int r5 = dp(r5, r3)
            r7.topMargin = r5
            r0.addView(r6, r7)
            return r0
    }

    private static int countChildren(java.io.File r0) {
            java.io.File[] r0 = r0.listFiles()
            if (r0 != 0) goto L8
            r0 = 0
            goto L9
        L8:
            int r0 = r0.length
        L9:
            return r0
    }

    private static java.lang.String describeAnyFolder(java.io.File r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto Le
            java.lang.String r1 = "Missing from this instance"
            return r1
        Le:
            int r1 = countChildren(r0)
            if (r1 > 0) goto L17
            java.lang.String r1 = "Folder is empty"
            goto L3c
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r0 = " item"
            java.lang.StringBuilder r2 = r2.append(r0)
            r0 = 1
            if (r1 != r0) goto L2c
            java.lang.String r1 = ""
            goto L2e
        L2c:
            java.lang.String r1 = "s"
        L2e:
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " found"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L3c:
            return r1
    }

    private static java.lang.String describeFolder(java.io.File r7, java.lang.String r8, java.lang.String... r9) {
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r8)
            boolean r7 = r0.isDirectory()
            if (r7 != 0) goto Le
            java.lang.String r7 = "Missing from this instance"
            return r7
        Le:
            java.io.File[] r7 = r0.listFiles()
            r8 = 0
            if (r7 == 0) goto L49
            int r0 = r7.length
            r1 = r8
            r2 = r1
        L18:
            if (r1 >= r0) goto L48
            r3 = r7[r1]
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L45
            boolean r4 = r3.isHidden()
            if (r4 == 0) goto L29
            goto L45
        L29:
            java.lang.String r3 = r3.getName()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r4)
            int r4 = r9.length
            r5 = r8
        L35:
            if (r5 >= r4) goto L45
            r6 = r9[r5]
            boolean r6 = r3.endsWith(r6)
            if (r6 == 0) goto L42
            int r2 = r2 + 1
            goto L45
        L42:
            int r5 = r5 + 1
            goto L35
        L45:
            int r1 = r1 + 1
            goto L18
        L48:
            r8 = r2
        L49:
            if (r8 != 0) goto L4e
            java.lang.String r7 = "Folder exists, but no matching files were found"
            return r7
        L4e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r9 = " file"
            java.lang.StringBuilder r7 = r7.append(r9)
            r9 = 1
            if (r8 != r9) goto L63
            java.lang.String r8 = ""
            goto L65
        L63:
            java.lang.String r8 = "s"
        L65:
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " found"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private static java.lang.String describeWorldsFolder(java.io.File r6) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "saves"
            r0.<init>(r6, r1)
            boolean r6 = r0.isDirectory()
            if (r6 != 0) goto L10
            java.lang.String r6 = "Missing from this instance"
            return r6
        L10:
            java.io.File[] r6 = r0.listFiles()
            r0 = 0
            if (r6 == 0) goto L36
            int r1 = r6.length
            r2 = r0
        L19:
            if (r0 >= r1) goto L35
            r3 = r6[r0]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L32
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "level.dat"
            r4.<init>(r3, r5)
            boolean r3 = r4.isFile()
            if (r3 == 0) goto L32
            int r2 = r2 + 1
        L32:
            int r0 = r0 + 1
            goto L19
        L35:
            r0 = r2
        L36:
            if (r0 > 0) goto L3b
            java.lang.String r6 = "Folder exists, but no worlds were found"
            return r6
        L3b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r1 = " world"
            java.lang.StringBuilder r6 = r6.append(r1)
            r1 = 1
            if (r0 != r1) goto L50
            java.lang.String r0 = ""
            goto L52
        L50:
            java.lang.String r0 = "s"
        L52:
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " found; off by default for privacy"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private static int dp(android.app.Activity r1, int r2) {
            float r2 = (float) r2
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = java.lang.Math.round(r1)
            return r1
    }

    private static boolean folderExists(java.io.File r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            boolean r1 = r0.isDirectory()
            return r1
    }

    static /* synthetic */ void lambda$addCheckRow$4(android.widget.CheckBox r0, android.view.View r1) {
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto Lf
            boolean r1 = r0.isChecked()
            r1 = r1 ^ 1
            r0.setChecked(r1)
        Lf:
            return
    }

    static /* synthetic */ void lambda$show$0(ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.Listener r12, android.widget.CheckBox r13, android.widget.CheckBox r14, android.widget.CheckBox r15, android.widget.CheckBox r16, android.widget.CheckBox r17, android.widget.CheckBox r18, android.widget.CheckBox r19, android.widget.CheckBox r20, android.widget.CheckBox r21, android.widget.CheckBox r22, androidx.appcompat.app.AlertDialog r23, android.view.View r24) {
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions r11 = new ca.dnamobile.javalauncher.modmanager.ModpackExportManager$ExportOptions
            boolean r1 = r13.isChecked()
            boolean r2 = r14.isChecked()
            boolean r3 = r15.isChecked()
            boolean r4 = r16.isChecked()
            boolean r5 = r17.isChecked()
            boolean r6 = r18.isChecked()
            boolean r7 = r19.isChecked()
            boolean r8 = r20.isChecked()
            boolean r9 = r21.isChecked()
            boolean r10 = r22.isChecked()
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r12
            r12.onExport(r11)
            r23.dismiss()
            return
    }

    static /* synthetic */ void lambda$show$1(androidx.appcompat.app.AppCompatActivity r15, androidx.appcompat.app.AlertDialog r16, ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.Listener r17, android.widget.CheckBox r18, android.widget.CheckBox r19, android.widget.CheckBox r20, android.widget.CheckBox r21, android.widget.CheckBox r22, android.widget.CheckBox r23, android.widget.CheckBox r24, android.widget.CheckBox r25, android.widget.CheckBox r26, android.widget.CheckBox r27, android.content.DialogInterface r28) {
            styleDialogChrome(r15, r16)
            r0 = -1
            r13 = r16
            android.widget.Button r0 = r13.getButton(r0)
            if (r0 == 0) goto L2d
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda0 r14 = new ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda0
            r1 = r14
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.setOnClickListener(r14)
        L2d:
            return
    }

    static /* synthetic */ void lambda$show$2(androidx.appcompat.app.AppCompatActivity r1) {
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            int r0 = r1.getSystemUiVisibility()
            r0 = r0 | 4102(0x1006, float:5.748E-42)
            r1.setSystemUiVisibility(r0)
            return
    }

    static /* synthetic */ void lambda$show$3(androidx.appcompat.app.AppCompatActivity r3, android.content.DialogInterface r4) {
            android.view.Window r4 = r3.getWindow()
            android.view.View r4 = r4.getDecorView()
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda3 r0 = new ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda3
            r0.<init>(r3)
            r1 = 80
            r4.postDelayed(r0, r1)
            return
    }

    private static android.graphics.drawable.GradientDrawable roundedDrawable(android.app.Activity r1, int r2, int r3, int r4) {
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

    private static android.graphics.drawable.GradientDrawable rowBackground(android.app.Activity r3) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_CARD_BG_PRESSED
            r0.setColor(r1)
            r1 = 1
            int r1 = dp(r3, r1)
            int r2 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_CARD_STROKE
            r0.setStroke(r1, r2)
            r1 = 14
            int r3 = dp(r3, r1)
            float r3 = (float) r3
            r0.setCornerRadius(r3)
            return r0
    }

    public static void show(androidx.appcompat.app.AppCompatActivity r1, java.io.File r2, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r3, ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.Listener r4) {
            r0 = 0
            show(r1, r2, r0, r3, r4)
            return
    }

    public static void show(androidx.appcompat.app.AppCompatActivity r21, java.io.File r22, java.io.File r23, ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform r24, ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.Listener r25) {
            r14 = r21
            r6 = r22
            r0 = r24
            android.widget.ScrollView r7 = new android.widget.ScrollView
            r7.<init>(r14)
            r8 = 0
            r7.setFillViewport(r8)
            r9 = 1
            r7.setOverScrollMode(r9)
            int r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_DIALOG_BG
            r7.setBackgroundColor(r1)
            r2 = 4
            int r2 = dp(r14, r2)
            r7.setPadding(r8, r8, r8, r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r14)
            r2.setOrientation(r9)
            r2.setBackgroundColor(r1)
            r1 = 18
            int r1 = dp(r14, r1)
            r3 = 8
            int r3 = dp(r14, r3)
            r2.setPadding(r1, r1, r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r10 = -1
            r3 = -2
            r1.<init>(r10, r3)
            r7.addView(r2, r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r14)
            java.lang.String r4 = "Export Options"
            r1.setText(r4)
            r4 = 1103101952(0x41c00000, float:24.0)
            r11 = 2
            r1.setTextSize(r11, r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r4)
            int r4 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_PRIMARY
            r1.setTextColor(r4)
            int r4 = dp(r14, r11)
            int r5 = dp(r14, r11)
            r12 = 6
            int r12 = dp(r14, r12)
            r1.setPadding(r4, r8, r5, r12)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r10, r3)
            r2.addView(r1, r4)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r14)
            java.lang.String r4 = "Choose which instance content goes into the export. Required manifest and Minecraft loader metadata are locked so Modrinth, CurseForge, and MultiMC exports stay importable."
            r1.setText(r4)
            r4 = 1096810496(0x41600000, float:14.0)
            r1.setTextSize(r11, r4)
            int r4 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_TEXT_SECONDARY
            r1.setTextColor(r4)
            r4 = 0
            r5 = 1066024305(0x3f8a3d71, float:1.08)
            r1.setLineSpacing(r4, r5)
            int r4 = dp(r14, r11)
            int r5 = dp(r14, r11)
            r12 = 12
            int r12 = dp(r14, r12)
            r1.setPadding(r4, r8, r5, r12)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r10, r3)
            r2.addView(r1, r4)
            android.widget.LinearLayout r1 = addCard(r14, r2)
            java.lang.String r3 = "Required export metadata"
            addCardTitle(r14, r1, r3)
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r3 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.MODRINTH
            if (r0 != r3) goto Lba
            java.lang.String r0 = "modrinth.index.json and dependency metadata"
            goto Lc3
        Lba:
            ca.dnamobile.javalauncher.modmanager.ModpackExportManager$Platform r3 = ca.dnamobile.javalauncher.modmanager.ModpackExportManager.Platform.CURSEFORGE
            if (r0 != r3) goto Lc1
            java.lang.String r0 = "manifest.json, modlist.html, and dependency metadata"
            goto Lc3
        Lc1:
            java.lang.String r0 = "instance.cfg and mmc-pack.json"
        Lc3:
            java.lang.String r3 = "Platform manifest"
            addLockedRow(r14, r1, r3, r0)
            java.lang.String r0 = "Minecraft + loader"
            java.lang.String r3 = "Minecraft version and selected loader are always included"
            addLockedRow(r14, r1, r0, r3)
            android.widget.LinearLayout r12 = addCard(r14, r2)
            java.lang.String r0 = "Content to include"
            addCardTitle(r14, r12, r0)
            java.lang.String r0 = "Defaults match the old exporter. Saves are available for private sharing, but stay off by default."
            addInfoText(r14, r12, r0)
            if (r23 == 0) goto Lf1
            boolean r0 = r23.isFile()
            if (r0 == 0) goto Lf1
            long r0 = r23.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lf1
            r5 = r9
            goto Lf2
        Lf1:
            r5 = r8
        Lf2:
            if (r5 == 0) goto Lf7
            java.lang.String r0 = "Custom pack icon found"
            goto Lf9
        Lf7:
            java.lang.String r0 = "No custom instance icon was found"
        Lf9:
            r3 = r0
            r4 = 1
            java.lang.String r2 = "Instance icon"
            r0 = r21
            r1 = r12
            android.widget.CheckBox r13 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.lang.String[] r0 = new java.lang.String[r11]
            java.lang.String r1 = ".jar"
            r0[r8] = r1
            java.lang.String r11 = ".zip"
            r0[r9] = r11
            java.lang.String r1 = "mods"
            java.lang.String r3 = describeFolder(r6, r1, r0)
            boolean r5 = folderExists(r6, r1)
            java.lang.String r2 = "Mods"
            r0 = r21
            r1 = r12
            android.widget.CheckBox r15 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.lang.String[] r0 = new java.lang.String[r9]
            r0[r8] = r11
            java.lang.String r1 = "resourcepacks"
            java.lang.String r3 = describeFolder(r6, r1, r0)
            boolean r5 = folderExists(r6, r1)
            java.lang.String r2 = "Resource packs"
            r0 = r21
            r1 = r12
            android.widget.CheckBox r16 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.lang.String[] r0 = new java.lang.String[r9]
            r0[r8] = r11
            java.lang.String r1 = "shaderpacks"
            java.lang.String r3 = describeFolder(r6, r1, r0)
            boolean r5 = folderExists(r6, r1)
            java.lang.String r2 = "Shader packs"
            r0 = r21
            r1 = r12
            android.widget.CheckBox r8 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "config"
            java.lang.String r3 = describeAnyFolder(r6, r0)
            boolean r5 = folderExists(r6, r0)
            java.lang.String r2 = "Config folder"
            r0 = r21
            android.widget.CheckBox r9 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "defaultconfigs"
            java.lang.String r3 = describeAnyFolder(r6, r0)
            boolean r5 = folderExists(r6, r0)
            java.lang.String r2 = "Default configs"
            r0 = r21
            android.widget.CheckBox r11 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "kubejs"
            java.lang.String r3 = describeAnyFolder(r6, r0)
            boolean r5 = folderExists(r6, r0)
            java.lang.String r2 = "KubeJS"
            r0 = r21
            android.widget.CheckBox r17 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "scripts"
            java.lang.String r3 = describeAnyFolder(r6, r0)
            boolean r5 = folderExists(r6, r0)
            java.lang.String r2 = "Scripts"
            r0 = r21
            android.widget.CheckBox r18 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "options.txt"
            r0.<init>(r6, r1)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L1a7
            java.lang.String r0 = "Personal game settings; included by default to match the old exporter"
            goto L1a9
        L1a7:
            java.lang.String r0 = "Missing from this instance"
        L1a9:
            r3 = r0
            java.io.File r0 = new java.io.File
            r0.<init>(r6, r1)
            boolean r5 = r0.isFile()
            java.lang.String r2 = "options.txt"
            r4 = 1
            r0 = r21
            r1 = r12
            android.widget.CheckBox r19 = addCheckRow(r0, r1, r2, r3, r4, r5)
            java.lang.String r3 = describeWorldsFolder(r22)
            java.lang.String r0 = "saves"
            boolean r5 = folderExists(r6, r0)
            java.lang.String r2 = "Saves / worlds"
            r4 = 0
            r0 = r21
            android.widget.CheckBox r20 = addCheckRow(r0, r1, r2, r3, r4, r5)
            r0 = 560(0x230, float:7.85E-43)
            int r0 = dp(r14, r0)
            r1 = 260(0x104, float:3.64E-43)
            int r1 = dp(r14, r1)
            android.content.res.Resources r2 = r21.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            r3 = 180(0xb4, float:2.52E-43)
            int r3 = dp(r14, r3)
            int r2 = r2 - r3
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.min(r0, r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r10, r0)
            r7.setLayoutParams(r1)
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r14)
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setView(r7)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            r2 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            java.lang.String r1 = "Export"
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            androidx.appcompat.app.AlertDialog r12 = r0.create()
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda1 r10 = new ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda1
            r0 = r10
            r1 = r21
            r2 = r12
            r3 = r25
            r4 = r13
            r5 = r15
            r6 = r16
            r7 = r8
            r8 = r9
            r9 = r11
            r15 = r10
            r10 = r17
            r11 = r18
            r13 = r12
            r12 = r19
            r14 = r13
            r13 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.setOnShowListener(r15)
            ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda2 r0 = new ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog$$ExternalSyntheticLambda2
            r2 = r14
            r0.<init>(r1)
            r2.setOnDismissListener(r0)
            r2.show()
            return
    }

    private static void styleDialogChrome(android.app.Activity r4, androidx.appcompat.app.AlertDialog r5) {
            android.view.Window r0 = r5.getWindow()
            r1 = -2
            if (r0 == 0) goto L36
            int r2 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_DIALOG_BG
            r3 = 22
            android.graphics.drawable.GradientDrawable r2 = roundedDrawable(r4, r2, r2, r3)
            r0.setBackgroundDrawable(r2)
            r2 = 1058306785(0x3f147ae1, float:0.58)
            r0.setDimAmount(r2)
            android.content.res.Resources r2 = r4.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            r3 = 36
            int r3 = dp(r4, r3)
            int r2 = r2 - r3
            r3 = 760(0x2f8, float:1.065E-42)
            int r4 = dp(r4, r3)
            int r4 = java.lang.Math.min(r2, r4)
            r0.setLayout(r4, r1)
        L36:
            r4 = -1
            tintDialogButton(r5, r4)
            tintDialogButton(r5, r1)
            r4 = -3
            tintDialogButton(r5, r4)
            return
    }

    private static void tintDialogButton(androidx.appcompat.app.AlertDialog r0, int r1) {
            android.widget.Button r0 = r0.getButton(r1)
            if (r0 == 0) goto L10
            int r1 = ca.dnamobile.javalauncher.modmanager.ModpackExportOptionsDialog.COLOR_ACCENT
            r0.setTextColor(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r1)
        L10:
            return
    }
}
