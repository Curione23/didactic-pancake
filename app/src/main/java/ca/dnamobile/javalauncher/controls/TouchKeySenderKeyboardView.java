package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class TouchKeySenderKeyboardView extends android.widget.FrameLayout {
    private static final int ACTION_CLOSE = -2147482745;
    private final java.util.ArrayList<android.widget.Button> highlightedButtons;
    private final ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.Listener listener;
    private final java.util.ArrayList<java.lang.Integer> pendingKeys;
    private android.widget.TextView queuedLabel;

    private static final class KeySpec {
        final int keyCode;
        final java.lang.String label;
        final float widthDp;

        KeySpec(java.lang.String r1, int r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.label = r1
                r0.keyCode = r2
                r0.widthDp = r3
                return
        }
    }

    public interface Listener {
        void onCloseRequested();

        void onSendRequested(java.util.List<java.lang.Integer> r1);
    }

    /* JADX INFO: renamed from: $r8$lambda$98NpFu-YEmeCuWlnpPPkj_rRcws, reason: not valid java name */
    public static /* synthetic */ void m431$r8$lambda$98NpFuYEmeCuWlnpPPkj_rRcws(ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView r0, android.view.View r1) {
            r0.lambda$buildLayout$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$QIoc5B8DHaasKVQ8QhcgQ6oOyqc(ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView r0, android.view.View r1) {
            r0.lambda$buildLayout$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$y963LpTFvArvyxRs__eRQ4H_vk0(ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView r0, ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec r1, android.widget.Button r2, android.view.View r3) {
            r0.lambda$addKeyboardKey$3(r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$zPE_pjQvvjD_2_2pWltxN68h9oM(ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView r0, android.view.View r1) {
            r0.lambda$buildLayout$1(r1)
            return
    }

    public TouchKeySenderKeyboardView(android.content.Context r1, ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.Listener r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.pendingKeys = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.highlightedButtons = r1
            r0.listener = r2
            r1 = 1
            r0.setClickable(r1)
            r0.setFocusable(r1)
            r1 = -872415232(0xffffffffcc000000, float:-3.3554432E7)
            r0.setBackgroundColor(r1)
            r0.buildLayout()
            return
    }

    private void addKeyboardKey(android.widget.LinearLayout r5, ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec r6, int r7) {
            r4 = this;
            android.widget.Button r0 = new android.widget.Button
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            java.lang.String r1 = r6.label
            r0.setText(r1)
            r1 = 1107296256(0x42000000, float:32.0)
            int r1 = r4.dp(r1)
            if (r7 > r1) goto L19
            r7 = 1092091904(0x41180000, float:9.5)
            goto L26
        L19:
            r1 = 1110966272(0x42380000, float:46.0)
            int r1 = r4.dp(r1)
            if (r7 < r1) goto L24
            r7 = 1094713344(0x41400000, float:12.0)
            goto L26
        L24:
            r7 = 1093140480(0x41280000, float:10.5)
        L26:
            r0.setTextSize(r7)
            r7 = 0
            r0.setAllCaps(r7)
            r1 = 1
            r0.setSingleLine(r1)
            r0.setMinWidth(r7)
            r0.setMinimumWidth(r7)
            r0.setMinHeight(r7)
            r0.setMinimumHeight(r7)
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = r4.dp(r1)
            int r1 = r4.dp(r1)
            r0.setPadding(r2, r7, r1, r7)
            android.graphics.drawable.GradientDrawable r1 = r4.makeKeyBackground(r7)
            r0.setBackground(r1)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$$ExternalSyntheticLambda0
            r1.<init>(r4, r6, r0)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6.widthDp
            float r6 = java.lang.Math.max(r2, r6)
            r2 = -1
            r1.<init>(r7, r2, r6)
            r6 = 1069547520(0x3fc00000, float:1.5)
            int r7 = r4.dp(r6)
            int r2 = r4.dp(r6)
            int r3 = r4.dp(r6)
            int r6 = r4.dp(r6)
            r1.setMargins(r7, r2, r3, r6)
            r5.addView(r0, r1)
            return
    }

    private void addKeyboardRow(android.widget.LinearLayout r5, int r6, ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec... r7) {
            r4 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r0.setPadding(r1, r1, r1, r1)
            int r2 = r7.length
        L16:
            if (r1 >= r2) goto L20
            r3 = r7[r1]
            r4.addKeyboardKey(r0, r3, r6)
            int r1 = r1 + 1
            goto L16
        L20:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r7.<init>(r1, r6)
            r5.addView(r0, r7)
            return
    }

    private void addKeyboardRows(android.widget.LinearLayout r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 13
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec[] r4 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec[r3]
            java.lang.String r5 = "Esc"
            r6 = 256(0x100, float:3.59E-43)
            r7 = 1067030938(0x3f99999a, float:1.2)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r6, r7)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "F1"
            r8 = 290(0x122, float:4.06E-43)
            r9 = 1065353216(0x3f800000, float:1.0)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r8, r9)
            r8 = 1
            r4[r8] = r5
            java.lang.String r5 = "F2"
            r10 = 291(0x123, float:4.08E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r10, r9)
            r10 = 2
            r4[r10] = r5
            java.lang.String r5 = "F3"
            r11 = 292(0x124, float:4.09E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r11, r9)
            r11 = 3
            r4[r11] = r5
            java.lang.String r5 = "F4"
            r12 = 293(0x125, float:4.1E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r12, r9)
            r12 = 4
            r4[r12] = r5
            java.lang.String r5 = "F5"
            r13 = 294(0x126, float:4.12E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r13, r9)
            r13 = 5
            r4[r13] = r5
            java.lang.String r5 = "F6"
            r14 = 295(0x127, float:4.13E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r14, r9)
            r14 = 6
            r4[r14] = r5
            java.lang.String r5 = "F7"
            r15 = 296(0x128, float:4.15E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r15, r9)
            r15 = 7
            r4[r15] = r5
            java.lang.String r5 = "F8"
            r7 = 297(0x129, float:4.16E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r5 = key(r5, r7, r9)
            r7 = 8
            r4[r7] = r5
            java.lang.String r5 = "F9"
            r3 = 298(0x12a, float:4.18E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r5, r3, r9)
            r5 = 9
            r4[r5] = r3
            java.lang.String r3 = "F10"
            r5 = 299(0x12b, float:4.19E-43)
            r7 = 1066024305(0x3f8a3d71, float:1.08)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r5, r7)
            r5 = 10
            r4[r5] = r3
            java.lang.String r3 = "F11"
            r5 = 300(0x12c, float:4.2E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r5, r7)
            r5 = 11
            r4[r5] = r3
            java.lang.String r3 = "F12"
            r5 = 301(0x12d, float:4.22E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r5, r7)
            r5 = 12
            r4[r5] = r3
            r0.addKeyboardRow(r1, r2, r4)
            r3 = 14
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec[] r4 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec[r3]
            java.lang.String r7 = "`"
            r3 = 96
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r7, r3, r9)
            r4[r6] = r3
            java.lang.String r3 = "1"
            r7 = 49
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r4[r8] = r3
            java.lang.String r3 = "2"
            r7 = 50
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r4[r10] = r3
            java.lang.String r3 = "3"
            r7 = 51
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r4[r11] = r3
            java.lang.String r3 = "4"
            r7 = 52
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r4[r12] = r3
            java.lang.String r3 = "5"
            r7 = 53
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r4[r13] = r3
            java.lang.String r3 = "6"
            r7 = 54
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r4[r14] = r3
            java.lang.String r3 = "7"
            r7 = 55
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r4[r15] = r3
            java.lang.String r3 = "8"
            r7 = 56
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r7 = 8
            r4[r7] = r3
            java.lang.String r3 = "9"
            r7 = 57
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r7 = 9
            r4[r7] = r3
            java.lang.String r3 = "0"
            r7 = 48
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r7 = 10
            r4[r7] = r3
            java.lang.String r3 = "-"
            r7 = 45
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r7 = 11
            r4[r7] = r3
            java.lang.String r3 = "="
            r7 = 61
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r3, r7, r9)
            r4[r5] = r3
            r3 = 259(0x103, float:3.63E-43)
            r7 = 1072902963(0x3ff33333, float:1.9)
            java.lang.String r5 = "Back"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r3 = key(r5, r3, r7)
            r5 = 13
            r4[r5] = r3
            r0.addKeyboardRow(r1, r2, r4)
            r3 = 14
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec[] r3 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec[r3]
            r4 = 258(0x102, float:3.62E-43)
            r5 = 1069128090(0x3fb9999a, float:1.45)
            java.lang.String r7 = "Tab"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r7, r4, r5)
            r3[r6] = r4
            java.lang.String r4 = "Q"
            r5 = 81
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r8] = r4
            java.lang.String r4 = "W"
            r5 = 87
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r10] = r4
            java.lang.String r4 = "E"
            r5 = 69
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r11] = r4
            java.lang.String r4 = "R"
            r5 = 82
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r12] = r4
            java.lang.String r4 = "T"
            r5 = 84
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r13] = r4
            java.lang.String r4 = "Y"
            r5 = 89
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r14] = r4
            java.lang.String r4 = "U"
            r5 = 85
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r15] = r4
            java.lang.String r4 = "I"
            r5 = 73
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 8
            r3[r5] = r4
            java.lang.String r4 = "O"
            r5 = 79
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 9
            r3[r5] = r4
            java.lang.String r4 = "P"
            r5 = 80
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 10
            r3[r5] = r4
            java.lang.String r4 = "["
            r5 = 91
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 11
            r3[r5] = r4
            java.lang.String r4 = "]"
            r5 = 93
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 12
            r3[r5] = r4
            java.lang.String r4 = "\\"
            r7 = 92
            r15 = 1067450368(0x3fa00000, float:1.25)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r7, r15)
            r7 = 13
            r3[r7] = r4
            r0.addKeyboardRow(r1, r2, r3)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec[] r3 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec[r5]
            java.lang.String r4 = "A"
            r5 = 65
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r6] = r4
            java.lang.String r4 = "S"
            r5 = 83
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r8] = r4
            java.lang.String r4 = "D"
            r5 = 68
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r10] = r4
            java.lang.String r4 = "F"
            r5 = 70
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r11] = r4
            java.lang.String r4 = "G"
            r5 = 71
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r12] = r4
            java.lang.String r4 = "H"
            r5 = 72
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r13] = r4
            java.lang.String r4 = "J"
            r5 = 74
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r14] = r4
            java.lang.String r4 = "K"
            r5 = 75
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 7
            r3[r5] = r4
            java.lang.String r4 = "L"
            r5 = 76
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 8
            r3[r5] = r4
            java.lang.String r4 = ";"
            r5 = 59
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 9
            r3[r5] = r4
            java.lang.String r4 = "'"
            r5 = 39
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 10
            r3[r5] = r4
            r4 = 257(0x101, float:3.6E-43)
            r5 = 1072483533(0x3feccccd, float:1.85)
            java.lang.String r7 = "Enter"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r7, r4, r5)
            r5 = 11
            r3[r5] = r4
            r0.addKeyboardRow(r1, r2, r3)
            r3 = 12
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec[] r3 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec[r3]
            java.lang.String r4 = "Shift"
            r5 = 340(0x154, float:4.76E-43)
            r7 = 1071644672(0x3fe00000, float:1.75)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r6] = r4
            java.lang.String r4 = "Z"
            r5 = 90
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r8] = r4
            java.lang.String r4 = "X"
            r5 = 88
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r10] = r4
            java.lang.String r4 = "C"
            r5 = 67
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r11] = r4
            java.lang.String r4 = "V"
            r5 = 86
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r12] = r4
            java.lang.String r4 = "B"
            r5 = 66
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r13] = r4
            java.lang.String r4 = "N"
            r5 = 78
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r3[r14] = r4
            java.lang.String r4 = "M"
            r5 = 77
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 7
            r3[r5] = r4
            java.lang.String r4 = ","
            r5 = 44
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 8
            r3[r5] = r4
            java.lang.String r4 = "."
            r5 = 46
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 9
            r3[r5] = r4
            java.lang.String r4 = "/"
            r5 = 47
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r9)
            r5 = 10
            r3[r5] = r4
            java.lang.String r4 = "RShift"
            r5 = 344(0x158, float:4.82E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r5 = 11
            r3[r5] = r4
            r0.addKeyboardRow(r1, r2, r3)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec[] r3 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec[r14]
            java.lang.String r4 = "Ctrl"
            r5 = 341(0x155, float:4.78E-43)
            r7 = 1066611507(0x3f933333, float:1.15)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r6] = r4
            r4 = 342(0x156, float:4.79E-43)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            java.lang.String r9 = "Alt"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r9, r4, r5)
            r3[r8] = r4
            r4 = 32
            r5 = 1085066445(0x40accccd, float:5.4)
            java.lang.String r9 = "Space"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r9, r4, r5)
            r3[r10] = r4
            java.lang.String r4 = "RAlt"
            r5 = 346(0x15a, float:4.85E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r11] = r4
            java.lang.String r4 = "RCtrl"
            r5 = 345(0x159, float:4.83E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r15)
            r3[r12] = r4
            java.lang.String r4 = "Menu"
            r5 = 348(0x15c, float:4.88E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r15)
            r3[r13] = r4
            r0.addKeyboardRow(r1, r2, r3)
            r3 = 10
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec[] r3 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec[r3]
            java.lang.String r4 = "Ins"
            r5 = 260(0x104, float:3.64E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r6] = r4
            java.lang.String r4 = "Del"
            r5 = 261(0x105, float:3.66E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r8] = r4
            java.lang.String r4 = "Home"
            r5 = 268(0x10c, float:3.76E-43)
            r7 = 1067030938(0x3f99999a, float:1.2)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r10] = r4
            r4 = 269(0x10d, float:3.77E-43)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            java.lang.String r9 = "End"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r9, r4, r5)
            r3[r11] = r4
            java.lang.String r4 = "PgUp"
            r5 = 266(0x10a, float:3.73E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r12] = r4
            java.lang.String r4 = "PgDn"
            r5 = 267(0x10b, float:3.74E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r13] = r4
            java.lang.String r4 = "←"
            r5 = 263(0x107, float:3.69E-43)
            r7 = 1063675494(0x3f666666, float:0.9)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r14] = r4
            java.lang.String r4 = "↑"
            r5 = 265(0x109, float:3.71E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r5 = 7
            r3[r5] = r4
            java.lang.String r4 = "↓"
            r5 = 264(0x108, float:3.7E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r5 = 8
            r3[r5] = r4
            java.lang.String r4 = "→"
            r9 = 262(0x106, float:3.67E-43)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r9, r7)
            r7 = 9
            r3[r7] = r4
            r0.addKeyboardRow(r1, r2, r3)
            java.lang.String r3 = "Actions"
            r0.addSection(r1, r3)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec[] r3 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec[r5]
            java.lang.String r4 = "Close"
            r5 = -2147482745(0xffffffff80000387, float:-1.265E-42)
            r7 = 1065353216(0x3f800000, float:1.0)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r7)
            r3[r6] = r4
            r4 = -3
            r5 = 1068289229(0x3faccccd, float:1.35)
            java.lang.String r6 = "Left click"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r6, r4, r5)
            r3[r8] = r4
            r4 = -4
            r5 = 1068876431(0x3fb5c28f, float:1.42)
            java.lang.String r6 = "Right click"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r6, r4, r5)
            r3[r10] = r4
            r4 = -6
            r5 = 1069966950(0x3fc66666, float:1.55)
            java.lang.String r6 = "Middle click"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r6, r4, r5)
            r3[r11] = r4
            java.lang.String r4 = "Wheel up"
            r5 = -7
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r4, r5, r15)
            r3[r12] = r4
            r4 = -8
            r5 = 1068289229(0x3faccccd, float:1.35)
            java.lang.String r6 = "Wheel down"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r6, r4, r5)
            r3[r13] = r4
            r4 = -1
            r5 = 1070805811(0x3fd33333, float:1.65)
            java.lang.String r6 = "Android keyboard"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r6, r4, r5)
            r3[r14] = r4
            r4 = -9
            r5 = 1069966950(0x3fc66666, float:1.55)
            java.lang.String r6 = "Launcher menu"
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r4 = key(r6, r4, r5)
            r5 = 7
            r3[r5] = r4
            r0.addKeyboardRow(r1, r2, r3)
            return
    }

    private void addSection(android.widget.LinearLayout r5, java.lang.String r6) {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r0.setText(r6)
            r6 = -1
            r0.setTextColor(r6)
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r1)
            r1 = 1
            r0.setSingleLine(r1)
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = r4.dp(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = r4.dp(r2)
            r3 = 0
            r0.setPadding(r3, r1, r3, r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r6, r2)
            r5.addView(r0, r1)
            return
    }

    private void buildLayout() {
            r15 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r15.getContext()
            r0.<init>(r1)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 1092616192(0x41200000, float:10.0)
            int r3 = r15.dp(r2)
            r4 = 1090519040(0x41000000, float:8.0)
            int r5 = r15.dp(r4)
            int r2 = r15.dp(r2)
            int r4 = r15.dp(r4)
            r0.setPadding(r3, r5, r2, r4)
            android.graphics.drawable.GradientDrawable r2 = r15.makeKeyboardBackground()
            r0.setBackground(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r15.addView(r0, r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r4 = r15.getContext()
            r2.<init>(r4)
            r4 = 0
            r2.setOrientation(r4)
            r5 = 16
            r2.setGravity(r5)
            r5 = 1082130432(0x40800000, float:4.0)
            int r6 = r15.dp(r5)
            r2.setPadding(r4, r4, r4, r6)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r7 = r15.getContext()
            r6.<init>(r7)
            java.lang.String r7 = "DroidBridge key keyboard"
            r6.setText(r7)
            r6.setTextColor(r3)
            r7 = 1097859072(0x41700000, float:15.0)
            r6.setTextSize(r7)
            r6.setSingleLine(r1)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r4, r8, r9)
            r2.addView(r6, r7)
            java.lang.String r6 = "Send Key"
            android.widget.Button r6 = r15.compactButton(r6)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r10 = 1121976320(0x42e00000, float:112.0)
            int r10 = r15.dp(r10)
            r11 = 1107820544(0x42080000, float:34.0)
            int r12 = r15.dp(r11)
            r7.<init>(r10, r12)
            r2.addView(r6, r7)
            java.lang.String r7 = "Clear"
            android.widget.Button r7 = r15.compactButton(r7)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r12 = 1118568448(0x42ac0000, float:86.0)
            int r13 = r15.dp(r12)
            int r14 = r15.dp(r11)
            r10.<init>(r13, r14)
            r2.addView(r7, r10)
            java.lang.String r10 = "Close"
            android.widget.Button r10 = r15.compactButton(r10)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$$ExternalSyntheticLambda1 r13 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$$ExternalSyntheticLambda1
            r13.<init>(r15)
            r10.setOnClickListener(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            int r12 = r15.dp(r12)
            int r11 = r15.dp(r11)
            r13.<init>(r12, r11)
            r2.addView(r10, r13)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r3, r8)
            r0.addView(r2, r10)
            java.lang.String r2 = "Tap keys to queue them. Press Send Key to send the highlighted keys to Minecraft as one keyboard chord."
            android.widget.TextView r2 = r15.label(r2)
            r10 = 1093664768(0x41300000, float:11.0)
            r2.setTextSize(r10)
            r2.setSingleLine(r4)
            r10 = 1073741824(0x40000000, float:2.0)
            int r10 = r15.dp(r10)
            r2.setPadding(r4, r4, r4, r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r3, r8)
            r0.addView(r2, r10)
            java.lang.String r2 = "Queued: none"
            android.widget.TextView r2 = r15.label(r2)
            r15.queuedLabel = r2
            r10 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r10)
            android.widget.TextView r2 = r15.queuedLabel
            r2.setSingleLine(r4)
            android.widget.TextView r2 = r15.queuedLabel
            int r5 = r15.dp(r5)
            r2.setPadding(r4, r4, r4, r5)
            android.widget.TextView r2 = r15.queuedLabel
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r3, r8)
            r0.addView(r2, r5)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$$ExternalSyntheticLambda2 r2 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$$ExternalSyntheticLambda2
            r2.<init>(r15)
            r7.setOnClickListener(r2)
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$$ExternalSyntheticLambda3 r2 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$$ExternalSyntheticLambda3
            r2.<init>(r15)
            r6.setOnClickListener(r2)
            android.widget.ScrollView r2 = new android.widget.ScrollView
            android.content.Context r5 = r15.getContext()
            r2.<init>(r5)
            r2.setFillViewport(r4)
            r2.setClipToPadding(r4)
            r5 = 1086324736(0x40c00000, float:6.0)
            int r5 = r15.dp(r5)
            r2.setPadding(r4, r4, r4, r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r6 = r15.getContext()
            r5.<init>(r6)
            r5.setOrientation(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r3, r8)
            r2.addView(r5, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r3, r4, r9)
            r0.addView(r2, r1)
            int r0 = r15.keyboardRowHeightPx()
            r15.addKeyboardRows(r5, r0)
            return
    }

    private void clearQueuedKeys() {
            r3 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r3.pendingKeys
            r0.clear()
            java.util.ArrayList<android.widget.Button> r0 = r3.highlightedButtons
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            android.widget.Button r1 = (android.widget.Button) r1
            if (r1 == 0) goto Lb
            r2 = 0
            android.graphics.drawable.GradientDrawable r2 = r3.makeKeyBackground(r2)
            r1.setBackground(r2)
            goto Lb
        L22:
            java.util.ArrayList<android.widget.Button> r0 = r3.highlightedButtons
            r0.clear()
            r3.updateQueuedLabel()
            return
    }

    private android.widget.Button compactButton(java.lang.String r4) {
            r3 = this;
            android.widget.Button r0 = new android.widget.Button
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r0.setText(r4)
            r4 = 0
            r0.setAllCaps(r4)
            r0.setMinHeight(r4)
            r0.setMinimumHeight(r4)
            r1 = 1090519040(0x41000000, float:8.0)
            int r2 = r3.dp(r1)
            int r1 = r3.dp(r1)
            r0.setPadding(r2, r4, r1, r4)
            return r0
    }

    private int dp(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    private static ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec key(java.lang.String r1, int r2, float r3) {
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec r0 = new ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$KeySpec
            r0.<init>(r1, r2, r3)
            return r0
    }

    private int keyboardRowHeightPx() {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = java.lang.Math.max(r1, r0)
            r1 = 1110966272(0x42380000, float:46.0)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    private android.widget.TextView label(java.lang.String r4) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r0.setText(r4)
            r4 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r0.setTextColor(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r4)
            r4 = 1082130432(0x40800000, float:4.0)
            int r4 = r3.dp(r4)
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = r3.dp(r1)
            r2 = 0
            r0.setPadding(r2, r4, r2, r1)
            return r0
    }

    private /* synthetic */ void lambda$addKeyboardKey$3(ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec r1, android.widget.Button r2, android.view.View r3) {
            r0 = this;
            r0.queueKey(r1, r2)
            return
    }

    private /* synthetic */ void lambda$buildLayout$0(android.view.View r1) {
            r0 = this;
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$Listener r1 = r0.listener
            r1.onCloseRequested()
            return
    }

    private /* synthetic */ void lambda$buildLayout$1(android.view.View r1) {
            r0 = this;
            r0.clearQueuedKeys()
            return
    }

    private /* synthetic */ void lambda$buildLayout$2(android.view.View r1) {
            r0 = this;
            r0.sendQueuedKeys()
            return
    }

    private android.graphics.drawable.GradientDrawable makeKeyBackground(boolean r4) {
            r3 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            if (r4 == 0) goto Lb
            r1 = -295797534(0xffffffffee5e7ce2, float:-1.7214162E28)
            goto Le
        Lb:
            r1 = -298831306(0xffffffffee303236, float:-1.3632516E28)
        Le:
            r0.setColor(r1)
            r1 = 1088421888(0x40e00000, float:7.0)
            int r1 = r3.dp(r1)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            if (r4 == 0) goto L20
            r1 = 1073741824(0x40000000, float:2.0)
            goto L22
        L20:
            r1 = 1065353216(0x3f800000, float:1.0)
        L22:
            int r1 = r3.dp(r1)
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            if (r4 == 0) goto L2f
            r4 = -1
            goto L32
        L2f:
            r4 = 1442840575(0x55ffffff, float:3.518437E13)
        L32:
            r0.setStroke(r1, r4)
            return r0
    }

    private android.graphics.drawable.GradientDrawable makeKeyboardBackground() {
            r2 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = -199220956(0xfffffffff4202124, float:-5.074705E31)
            r0.setColor(r1)
            r1 = 0
            r0.setCornerRadius(r1)
            return r0
    }

    private void queueKey(ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView.KeySpec r3, android.widget.Button r4) {
            r2 = this;
            int r0 = r3.keyCode
            r1 = -2147482745(0xffffffff80000387, float:-1.265E-42)
            if (r0 != r1) goto Ld
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$Listener r3 = r2.listener
            r3.onCloseRequested()
            return
        Ld:
            int r0 = r3.keyCode
            r1 = -10
            if (r0 != r1) goto L14
            return
        L14:
            java.util.ArrayList<java.lang.Integer> r0 = r2.pendingKeys
            int r3 = r3.keyCode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            java.util.ArrayList<android.widget.Button> r3 = r2.highlightedButtons
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L34
            java.util.ArrayList<android.widget.Button> r3 = r2.highlightedButtons
            r3.add(r4)
            r3 = 1
            android.graphics.drawable.GradientDrawable r3 = r2.makeKeyBackground(r3)
            r4.setBackground(r3)
        L34:
            r2.updateQueuedLabel()
            return
    }

    private void sendQueuedKeys() {
            r3 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r3.pendingKeys
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "Pick at least one key first."
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L17:
            ca.dnamobile.javalauncher.controls.TouchKeySenderKeyboardView$Listener r0 = r3.listener
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList<java.lang.Integer> r2 = r3.pendingKeys
            r1.<init>(r2)
            r0.onSendRequested(r1)
            return
    }

    private void updateQueuedLabel() {
            r3 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r3.pendingKeys
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            android.widget.TextView r0 = r3.queuedLabel
            java.lang.String r1 = "Queued: none"
            r0.setText(r1)
            return
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Queued: "
            r0.<init>(r1)
            r1 = 0
        L18:
            java.util.ArrayList<java.lang.Integer> r2 = r3.pendingKeys
            int r2 = r2.size()
            if (r1 >= r2) goto L3d
            if (r1 <= 0) goto L27
            java.lang.String r2 = "  •  "
            r0.append(r2)
        L27:
            java.util.ArrayList<java.lang.Integer> r2 = r3.pendingKeys
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r2 = ca.dnamobile.javalauncher.controls.TouchInputBinding.labelForKeyCode(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L18
        L3d:
            android.widget.TextView r1 = r3.queuedLabel
            java.lang.String r0 = r0.toString()
            r1.setText(r0)
            return
    }
}
