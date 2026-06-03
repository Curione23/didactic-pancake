package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class TouchKeyPickerDialog {
    public static final int GAMEPAD_CURSOR_DOWN = -2147482606;
    public static final int GAMEPAD_CURSOR_LEFT = -2147482605;
    public static final int GAMEPAD_CURSOR_RIGHT = -2147482604;
    public static final int GAMEPAD_CURSOR_UP = -2147482607;

    public interface Callback {
        boolean onKeyPicked(int r1);
    }

    private interface KeySelection {
        void onKeyPicked(int r1);
    }

    public static final class KeySpec {
        final int keyCode;
        final java.lang.String label;
        final float widthDp;

        private KeySpec(java.lang.String r1, int r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.label = r1
                r0.keyCode = r2
                r0.widthDp = r3
                return
        }

        /* synthetic */ KeySpec(java.lang.String r1, int r2, float r3, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpecIA r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec-IA, reason: invalid class name */
    /* JADX INFO: compiled from: D8$$SyntheticClass */
    public final /* synthetic */ class KeySpecIA {
    }

    private TouchKeyPickerDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addKeyboardPickerDynamicRows(android.content.Context r6, android.widget.LinearLayout r7, int r8, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySelection r9, java.util.List<ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec> r10) {
            r0 = 0
        L1:
            int r1 = r10.size()
            if (r0 >= r1) goto L2a
            int r1 = r0 + 4
            int r2 = r10.size()
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r1 - r0
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r2 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r2]
            r3 = r0
        L16:
            if (r3 >= r1) goto L25
            int r4 = r3 - r0
            java.lang.Object r5 = r10.get(r3)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r5 = (ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec) r5
            r2[r4] = r5
            int r3 = r3 + 1
            goto L16
        L25:
            addKeyboardPickerRow(r6, r7, r8, r9, r2)
            r0 = r1
            goto L1
        L2a:
            return
    }

    private static void addKeyboardPickerKey(android.content.Context r3, android.widget.LinearLayout r4, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec r5, int r6, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySelection r7) {
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r3)
            java.lang.String r1 = r5.label
            r0.setText(r1)
            r1 = 1107296256(0x42000000, float:32.0)
            int r1 = dp(r3, r1)
            if (r6 > r1) goto L15
            r6 = 1092091904(0x41180000, float:9.5)
            goto L22
        L15:
            r1 = 1110966272(0x42380000, float:46.0)
            int r1 = dp(r3, r1)
            if (r6 < r1) goto L20
            r6 = 1094713344(0x41400000, float:12.0)
            goto L22
        L20:
            r6 = 1093140480(0x41280000, float:10.5)
        L22:
            r0.setTextSize(r6)
            r6 = 0
            r0.setAllCaps(r6)
            r1 = 1
            r0.setSingleLine(r1)
            r0.setMinWidth(r6)
            r0.setMinimumWidth(r6)
            r0.setMinHeight(r6)
            r0.setMinimumHeight(r6)
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = dp(r3, r1)
            int r1 = dp(r3, r1)
            r0.setPadding(r2, r6, r1, r6)
            android.graphics.drawable.GradientDrawable r1 = makeKeyboardKeyBackground(r3)
            r0.setBackground(r1)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$$ExternalSyntheticLambda3
            r1.<init>(r7, r5)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r5 = r5.widthDp
            float r5 = java.lang.Math.max(r1, r5)
            r1 = -1
            r7.<init>(r6, r1, r5)
            r5 = 1069547520(0x3fc00000, float:1.5)
            int r6 = dp(r3, r5)
            int r1 = dp(r3, r5)
            int r2 = dp(r3, r5)
            int r3 = dp(r3, r5)
            r7.setMargins(r6, r1, r2, r3)
            r4.addView(r0, r7)
            return
    }

    private static void addKeyboardPickerRow(android.content.Context r4, android.widget.LinearLayout r5, int r6, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySelection r7, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec... r8) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r0.setPadding(r1, r1, r1, r1)
            int r2 = r8.length
        L12:
            if (r1 >= r2) goto L1c
            r3 = r8[r1]
            addKeyboardPickerKey(r4, r0, r3, r6, r7)
            int r1 = r1 + 1
            goto L12
        L1c:
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r4.<init>(r7, r6)
            r5.addView(r0, r4)
            return
    }

    private static void addKeyboardPickerSection(android.content.Context r3, android.widget.LinearLayout r4, java.lang.String r5) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setText(r5)
            r5 = -1
            r0.setTextColor(r5)
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r1)
            r1 = 1
            r0.setSingleLine(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = dp(r3, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = dp(r3, r2)
            r2 = 0
            r0.setPadding(r2, r1, r2, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r3.<init>(r5, r1)
            r4.addView(r0, r3)
            return
    }

    private static int dp(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    public static ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec extraKey(java.lang.String r2, int r3, float r4) {
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r0 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    private static int keyboardPickerRowHeightPx(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = java.lang.Math.max(r0, r1)
            r0 = 1110966272(0x42380000, float:46.0)
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            return r1
    }

    public static java.lang.String labelForKeyCode(int r0) {
            java.lang.String r0 = ca.dnamobile.javalauncher.controls.TouchInputBinding.labelForKeyCode(r0)
            return r0
    }

    static /* synthetic */ void lambda$addKeyboardPickerKey$3(ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySelection r0, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec r1, android.view.View r2) {
            int r1 = r1.keyCode
            r0.onKeyPicked(r1)
            return
    }

    static /* synthetic */ void lambda$showPicker$0(ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.Callback r0, android.app.AlertDialog[] r1, int r2) {
            boolean r0 = r0.onKeyPicked(r2)
            if (r0 == 0) goto Le
            r0 = 0
            r0 = r1[r0]
            if (r0 == 0) goto Le
            r0.dismiss()
        Le:
            return
    }

    static /* synthetic */ void lambda$showPicker$1(android.app.AlertDialog r0, android.view.View r1) {
            r0.dismiss()
            return
    }

    static /* synthetic */ void lambda$showPicker$2(android.app.AlertDialog r0, android.content.DialogInterface r1) {
            styleKeyboardPickerWindow(r0)
            return
    }

    private static android.graphics.drawable.GradientDrawable makeKeyboardKeyBackground(android.content.Context r2) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = -298831306(0xffffffffee303236, float:-1.3632516E28)
            r0.setColor(r1)
            r1 = 1088421888(0x40e00000, float:7.0)
            int r1 = dp(r2, r1)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = dp(r2, r1)
            r1 = 1
            int r2 = java.lang.Math.max(r1, r2)
            r1 = 1442840575(0x55ffffff, float:3.518437E13)
            r0.setStroke(r2, r1)
            return r0
    }

    private static android.graphics.drawable.GradientDrawable makeKeyboardPickerBackground() {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = -199220956(0xfffffffff4202124, float:-5.074705E31)
            r0.setColor(r1)
            r1 = 0
            r0.setCornerRadius(r1)
            return r0
    }

    public static void showPicker(android.content.Context r2, int r3, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.Callback r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pick key for Position "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "Tap a key. Extra launcher/mouse actions are below."
            r1 = 0
            showPicker(r2, r3, r0, r1, r4)
            return
    }

    public static void showPicker(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.util.List<ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec> r19, ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.Callback r20) {
            r0 = r16
            r1 = r19
            int r2 = keyboardPickerRowHeightPx(r16)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            r4 = 1
            r3.setOrientation(r4)
            r5 = 1092616192(0x41200000, float:10.0)
            int r5 = dp(r0, r5)
            r6 = 1090519040(0x41000000, float:8.0)
            int r7 = dp(r0, r6)
            r8 = 1092616192(0x41200000, float:10.0)
            int r8 = dp(r0, r8)
            int r9 = dp(r0, r6)
            r3.setPadding(r5, r7, r8, r9)
            android.graphics.drawable.GradientDrawable r5 = makeKeyboardPickerBackground()
            r3.setBackground(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r0)
            r7 = 0
            r5.setOrientation(r7)
            r8 = 16
            r5.setGravity(r8)
            r8 = 1082130432(0x40800000, float:4.0)
            int r8 = dp(r0, r8)
            r5.setPadding(r7, r7, r7, r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r0)
            r9 = r17
            r8.setText(r9)
            r9 = -1
            r8.setTextColor(r9)
            r10 = 1097859072(0x41700000, float:15.0)
            r8.setTextSize(r10)
            r8.setSingleLine(r4)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r12 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r7, r11, r12)
            r5.addView(r8, r10)
            android.widget.Button r8 = new android.widget.Button
            r8.<init>(r0)
            java.lang.String r10 = "Cancel"
            r8.setText(r10)
            r8.setAllCaps(r7)
            r8.setMinHeight(r7)
            r8.setMinimumHeight(r7)
            int r10 = dp(r0, r6)
            int r6 = dp(r0, r6)
            r8.setPadding(r10, r7, r6, r7)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r10 = 1119354880(0x42b80000, float:92.0)
            int r10 = dp(r0, r10)
            r13 = 1107820544(0x42080000, float:34.0)
            int r13 = dp(r0, r13)
            r6.<init>(r10, r13)
            r5.addView(r8, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r9, r11)
            r3.addView(r5, r6)
            r5 = r18
            android.widget.TextView r5 = valueLabel(r0, r5)
            r6 = 1093664768(0x41300000, float:11.0)
            r5.setTextSize(r6)
            r5.setSingleLine(r7)
            r6 = 1073741824(0x40000000, float:2.0)
            int r6 = dp(r0, r6)
            r5.setPadding(r7, r7, r7, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r9, r11)
            r3.addView(r5, r6)
            android.app.AlertDialog[] r5 = new android.app.AlertDialog[r4]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$$ExternalSyntheticLambda0 r6 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$$ExternalSyntheticLambda0
            r10 = r20
            r6.<init>(r10, r5)
            android.widget.ScrollView r10 = new android.widget.ScrollView
            r10.<init>(r0)
            r10.setFillViewport(r7)
            r10.setClipToPadding(r7)
            r13 = 1086324736(0x40c00000, float:6.0)
            int r13 = dp(r0, r13)
            r10.setPadding(r7, r7, r7, r13)
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            r13.<init>(r0)
            r13.setOrientation(r4)
            android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
            r14.<init>(r9, r11)
            r10.addView(r13, r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r9, r7, r12)
            r3.addView(r10, r14)
            r10 = 13
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r10]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r14 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r15 = "Esc"
            r11 = 256(0x100, float:3.59E-43)
            r9 = 1067030938(0x3f99999a, float:1.2)
            r4 = 0
            r14.<init>(r15, r11, r9, r4)
            r10[r7] = r14
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "F1"
            r15 = 290(0x122, float:4.06E-43)
            r11.<init>(r14, r15, r12, r4)
            r14 = 1
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "F2"
            r15 = 291(0x123, float:4.08E-43)
            r11.<init>(r14, r15, r12, r4)
            r14 = 2
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r15 = "F3"
            r9 = 292(0x124, float:4.09E-43)
            r11.<init>(r15, r9, r12, r4)
            r9 = 3
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r15 = "F4"
            r9 = 293(0x125, float:4.1E-43)
            r11.<init>(r15, r9, r12, r4)
            r9 = 4
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r15 = "F5"
            r9 = 294(0x126, float:4.12E-43)
            r11.<init>(r15, r9, r12, r4)
            r9 = 5
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r15 = "F6"
            r9 = 295(0x127, float:4.13E-43)
            r11.<init>(r15, r9, r12, r4)
            r9 = 6
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r15 = "F7"
            r9 = 296(0x128, float:4.15E-43)
            r11.<init>(r15, r9, r12, r4)
            r9 = 7
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r15 = "F8"
            r9 = 297(0x129, float:4.16E-43)
            r11.<init>(r15, r9, r12, r4)
            r9 = 8
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r15 = "F9"
            r9 = 298(0x12a, float:4.18E-43)
            r11.<init>(r15, r9, r12, r4)
            r9 = 9
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r15 = 299(0x12b, float:4.19E-43)
            r9 = 1066024305(0x3f8a3d71, float:1.08)
            java.lang.String r14 = "F10"
            r11.<init>(r14, r15, r9, r4)
            r9 = 10
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r14 = 300(0x12c, float:4.2E-43)
            r15 = 1066024305(0x3f8a3d71, float:1.08)
            java.lang.String r9 = "F11"
            r11.<init>(r9, r14, r15, r4)
            r9 = 11
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r14 = 301(0x12d, float:4.22E-43)
            java.lang.String r9 = "F12"
            r11.<init>(r9, r14, r15, r4)
            r9 = 12
            r10[r9] = r11
            addKeyboardPickerRow(r0, r13, r2, r6, r10)
            r10 = 14
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r10]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "`"
            r15 = 96
            r11.<init>(r14, r15, r12, r4)
            r10[r7] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "1"
            r15 = 49
            r11.<init>(r14, r15, r12, r4)
            r14 = 1
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "2"
            r15 = 50
            r11.<init>(r14, r15, r12, r4)
            r14 = 2
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "3"
            r15 = 51
            r11.<init>(r14, r15, r12, r4)
            r14 = 3
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "4"
            r15 = 52
            r11.<init>(r14, r15, r12, r4)
            r14 = 4
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "5"
            r15 = 53
            r11.<init>(r14, r15, r12, r4)
            r14 = 5
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "6"
            r15 = 54
            r11.<init>(r14, r15, r12, r4)
            r14 = 6
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "7"
            r15 = 55
            r11.<init>(r14, r15, r12, r4)
            r14 = 7
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "8"
            r15 = 56
            r11.<init>(r14, r15, r12, r4)
            r14 = 8
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "9"
            r15 = 57
            r11.<init>(r14, r15, r12, r4)
            r14 = 9
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "0"
            r15 = 48
            r11.<init>(r14, r15, r12, r4)
            r14 = 10
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "-"
            r15 = 45
            r11.<init>(r14, r15, r12, r4)
            r14 = 11
            r10[r14] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "="
            r15 = 61
            r11.<init>(r14, r15, r12, r4)
            r10[r9] = r11
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r11 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r14 = 259(0x103, float:3.63E-43)
            r15 = 1072902963(0x3ff33333, float:1.9)
            java.lang.String r9 = "Back"
            r11.<init>(r9, r14, r15, r4)
            r9 = 13
            r10[r9] = r11
            addKeyboardPickerRow(r0, r13, r2, r6, r10)
            r9 = 14
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r9]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = 258(0x102, float:3.62E-43)
            r14 = 1069128090(0x3fb9999a, float:1.45)
            java.lang.String r15 = "Tab"
            r10.<init>(r15, r11, r14, r4)
            r9[r7] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Q"
            r14 = 81
            r10.<init>(r11, r14, r12, r4)
            r11 = 1
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "W"
            r14 = 87
            r10.<init>(r11, r14, r12, r4)
            r11 = 2
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "E"
            r14 = 69
            r10.<init>(r11, r14, r12, r4)
            r11 = 3
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "R"
            r14 = 82
            r10.<init>(r11, r14, r12, r4)
            r11 = 4
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "T"
            r14 = 84
            r10.<init>(r11, r14, r12, r4)
            r11 = 5
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Y"
            r14 = 89
            r10.<init>(r11, r14, r12, r4)
            r11 = 6
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "U"
            r14 = 85
            r10.<init>(r11, r14, r12, r4)
            r11 = 7
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "I"
            r14 = 73
            r10.<init>(r11, r14, r12, r4)
            r11 = 8
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "O"
            r14 = 79
            r10.<init>(r11, r14, r12, r4)
            r11 = 9
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "P"
            r14 = 80
            r10.<init>(r11, r14, r12, r4)
            r11 = 10
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "["
            r14 = 91
            r10.<init>(r11, r14, r12, r4)
            r11 = 11
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "]"
            r14 = 93
            r10.<init>(r11, r14, r12, r4)
            r11 = 12
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r14 = "\\"
            r15 = 92
            r7 = 1067450368(0x3fa00000, float:1.25)
            r10.<init>(r14, r15, r7, r4)
            r14 = 13
            r9[r14] = r10
            addKeyboardPickerRow(r0, r13, r2, r6, r9)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r11]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "A"
            r14 = 65
            r10.<init>(r11, r14, r12, r4)
            r11 = 0
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "S"
            r14 = 83
            r10.<init>(r11, r14, r12, r4)
            r11 = 1
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "D"
            r14 = 68
            r10.<init>(r11, r14, r12, r4)
            r11 = 2
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "F"
            r14 = 70
            r10.<init>(r11, r14, r12, r4)
            r11 = 3
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "G"
            r14 = 71
            r10.<init>(r11, r14, r12, r4)
            r11 = 4
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "H"
            r14 = 72
            r10.<init>(r11, r14, r12, r4)
            r11 = 5
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "J"
            r14 = 74
            r10.<init>(r11, r14, r12, r4)
            r11 = 6
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "K"
            r14 = 75
            r10.<init>(r11, r14, r12, r4)
            r11 = 7
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "L"
            r14 = 76
            r10.<init>(r11, r14, r12, r4)
            r11 = 8
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = ";"
            r14 = 59
            r10.<init>(r11, r14, r12, r4)
            r11 = 9
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "'"
            r14 = 39
            r10.<init>(r11, r14, r12, r4)
            r11 = 10
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = 257(0x101, float:3.6E-43)
            r14 = 1072483533(0x3feccccd, float:1.85)
            java.lang.String r15 = "Enter"
            r10.<init>(r15, r11, r14, r4)
            r11 = 11
            r9[r11] = r10
            addKeyboardPickerRow(r0, r13, r2, r6, r9)
            r9 = 12
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r9]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = 340(0x154, float:4.76E-43)
            r14 = 1071644672(0x3fe00000, float:1.75)
            java.lang.String r15 = "Shift"
            r10.<init>(r15, r11, r14, r4)
            r11 = 0
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Z"
            r14 = 90
            r10.<init>(r11, r14, r12, r4)
            r11 = 1
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "X"
            r14 = 88
            r10.<init>(r11, r14, r12, r4)
            r11 = 2
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "C"
            r14 = 67
            r10.<init>(r11, r14, r12, r4)
            r11 = 3
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "V"
            r14 = 86
            r10.<init>(r11, r14, r12, r4)
            r11 = 4
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "B"
            r14 = 66
            r10.<init>(r11, r14, r12, r4)
            r11 = 5
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "N"
            r14 = 78
            r10.<init>(r11, r14, r12, r4)
            r11 = 6
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "M"
            r14 = 77
            r10.<init>(r11, r14, r12, r4)
            r11 = 7
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = ","
            r14 = 44
            r10.<init>(r11, r14, r12, r4)
            r11 = 8
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "."
            r14 = 46
            r10.<init>(r11, r14, r12, r4)
            r11 = 9
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "/"
            r14 = 47
            r10.<init>(r11, r14, r12, r4)
            r11 = 10
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = 344(0x158, float:4.82E-43)
            r12 = 1071644672(0x3fe00000, float:1.75)
            java.lang.String r14 = "RShift"
            r10.<init>(r14, r11, r12, r4)
            r11 = 11
            r9[r11] = r10
            addKeyboardPickerRow(r0, r13, r2, r6, r9)
            r9 = 6
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r9]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Ctrl"
            r12 = 341(0x155, float:4.78E-43)
            r14 = 1066611507(0x3f933333, float:1.15)
            r9.<init>(r11, r12, r14, r4)
            r11 = 0
            r10[r11] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = 342(0x156, float:4.79E-43)
            r12 = 1066192077(0x3f8ccccd, float:1.1)
            java.lang.String r15 = "Alt"
            r9.<init>(r15, r11, r12, r4)
            r11 = 1
            r10[r11] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = 32
            r12 = 1085066445(0x40accccd, float:5.4)
            java.lang.String r15 = "Space"
            r9.<init>(r15, r11, r12, r4)
            r11 = 2
            r10[r11] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "RAlt"
            r12 = 346(0x15a, float:4.85E-43)
            r9.<init>(r11, r12, r14, r4)
            r11 = 3
            r10[r11] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "RCtrl"
            r12 = 345(0x159, float:4.83E-43)
            r9.<init>(r11, r12, r7, r4)
            r11 = 4
            r10[r11] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Menu"
            r12 = 348(0x15c, float:4.88E-43)
            r9.<init>(r11, r12, r7, r4)
            r11 = 5
            r10[r11] = r9
            addKeyboardPickerRow(r0, r13, r2, r6, r10)
            r9 = 10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r9]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Ins"
            r12 = 260(0x104, float:3.64E-43)
            r10.<init>(r11, r12, r14, r4)
            r11 = 0
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Del"
            r12 = 261(0x105, float:3.66E-43)
            r10.<init>(r11, r12, r14, r4)
            r11 = 1
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Home"
            r12 = 268(0x10c, float:3.76E-43)
            r14 = 1067030938(0x3f99999a, float:1.2)
            r10.<init>(r11, r12, r14, r4)
            r11 = 2
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = 269(0x10d, float:3.77E-43)
            r12 = 1066192077(0x3f8ccccd, float:1.1)
            java.lang.String r15 = "End"
            r10.<init>(r15, r11, r12, r4)
            r11 = 3
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "PgUp"
            r12 = 266(0x10a, float:3.73E-43)
            r10.<init>(r11, r12, r14, r4)
            r11 = 4
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "PgDn"
            r12 = 267(0x10b, float:3.74E-43)
            r10.<init>(r11, r12, r14, r4)
            r11 = 5
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "←"
            r12 = 263(0x107, float:3.69E-43)
            r14 = 1063675494(0x3f666666, float:0.9)
            r10.<init>(r11, r12, r14, r4)
            r11 = 6
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "↑"
            r12 = 265(0x109, float:3.71E-43)
            r10.<init>(r11, r12, r14, r4)
            r11 = 7
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "↓"
            r12 = 264(0x108, float:3.7E-43)
            r10.<init>(r11, r12, r14, r4)
            r11 = 8
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "→"
            r12 = 262(0x106, float:3.67E-43)
            r10.<init>(r11, r12, r14, r4)
            r11 = 9
            r9[r11] = r10
            addKeyboardPickerRow(r0, r13, r2, r6, r9)
            java.lang.String r9 = "Extra actions"
            addKeyboardPickerSection(r0, r13, r9)
            r9 = 6
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r9]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "None"
            r12 = 1064514355(0x3f733333, float:0.95)
            r14 = 0
            r10.<init>(r11, r14, r12, r4)
            r9[r14] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = -3
            r12 = 1068289229(0x3faccccd, float:1.35)
            java.lang.String r14 = "Left click"
            r10.<init>(r14, r11, r12, r4)
            r11 = 1
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = -4
            r12 = 1068876431(0x3fb5c28f, float:1.42)
            java.lang.String r14 = "Right click"
            r10.<init>(r14, r11, r12, r4)
            r11 = 2
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r11 = -6
            r12 = 1069966950(0x3fc66666, float:1.55)
            java.lang.String r14 = "Middle click"
            r10.<init>(r14, r11, r12, r4)
            r11 = 3
            r9[r11] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r10 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r11 = "Wheel up"
            r12 = -7
            r10.<init>(r11, r12, r7, r4)
            r7 = 4
            r9[r7] = r10
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r7 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r10 = -8
            r11 = 1068289229(0x3faccccd, float:1.35)
            java.lang.String r12 = "Wheel down"
            r7.<init>(r12, r10, r11, r4)
            r10 = 5
            r9[r10] = r7
            addKeyboardPickerRow(r0, r13, r2, r6, r9)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec[] r7 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.KeySpec[r10]
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r10 = "Android keyboard"
            r11 = 1069966950(0x3fc66666, float:1.55)
            r12 = -1
            r9.<init>(r10, r12, r11, r4)
            r10 = 0
            r7[r10] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r10 = -10
            r11 = 1068289229(0x3faccccd, float:1.35)
            java.lang.String r12 = "Key sender"
            r9.<init>(r12, r10, r11, r4)
            r10 = 1
            r7[r10] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r10 = -9
            r11 = 1069966950(0x3fc66666, float:1.55)
            java.lang.String r12 = "Launcher menu"
            r9.<init>(r12, r10, r11, r4)
            r10 = 2
            r7[r10] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            java.lang.String r10 = "Hide controls"
            r11 = 1069128090(0x3fb9999a, float:1.45)
            r12 = -2
            r9.<init>(r10, r12, r11, r4)
            r10 = 3
            r7[r10] = r9
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r9 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec
            r10 = -5
            r11 = 1069547520(0x3fc00000, float:1.5)
            java.lang.String r12 = "Virtual cursor"
            r9.<init>(r12, r10, r11, r4)
            r4 = 4
            r7[r4] = r9
            addKeyboardPickerRow(r0, r13, r2, r6, r7)
            if (r1 == 0) goto L5e9
            boolean r4 = r19.isEmpty()
            if (r4 != 0) goto L5e9
            java.lang.String r4 = "Gamepad cursor actions"
            addKeyboardPickerSection(r0, r13, r4)
            addKeyboardPickerDynamicRows(r0, r13, r2, r6, r1)
        L5e9:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            android.app.AlertDialog$Builder r0 = r1.setView(r3)
            android.app.AlertDialog r0 = r0.create()
            r1 = 0
            r5[r1] = r0
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$$ExternalSyntheticLambda1
            r1.<init>(r0)
            r8.setOnClickListener(r1)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$$ExternalSyntheticLambda2 r1 = new ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$$ExternalSyntheticLambda2
            r1.<init>(r0)
            r0.setOnShowListener(r1)
            r0.show()
            return
    }

    private static void styleKeyboardPickerWindow(android.app.AlertDialog r4) {
            android.view.Window r0 = r4.getWindow()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.Window r0 = r4.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            android.view.Window r0 = r4.getWindow()
            r1 = -1
            r0.setLayout(r1, r1)
            android.view.Window r4 = r4.getWindow()     // Catch: java.lang.Throwable -> L50
            android.view.View r4 = r4.getDecorView()     // Catch: java.lang.Throwable -> L50
            r0 = 5894(0x1706, float:8.259E-42)
            r4.setSystemUiVisibility(r0)     // Catch: java.lang.Throwable -> L50
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r4 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L50
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch: java.lang.Throwable -> L50
        L36:
            int r0 = r4.getChildCount()     // Catch: java.lang.Throwable -> L50
            if (r2 >= r0) goto L50
            android.view.View r0 = r4.getChildAt(r2)     // Catch: java.lang.Throwable -> L50
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L4d
            r3.width = r1     // Catch: java.lang.Throwable -> L50
            r3.height = r1     // Catch: java.lang.Throwable -> L50
            r0.setLayoutParams(r3)     // Catch: java.lang.Throwable -> L50
        L4d:
            int r2 = r2 + 1
            goto L36
        L50:
            return
    }

    private static android.widget.TextView valueLabel(android.content.Context r2, java.lang.String r3) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r3)
            r3 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r0.setTextColor(r3)
            r3 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r3)
            r3 = 1082130432(0x40800000, float:4.0)
            int r3 = dp(r2, r3)
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = dp(r2, r1)
            r1 = 0
            r0.setPadding(r1, r3, r1, r2)
            return r0
    }
}
