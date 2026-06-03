package ca.dnamobile.javalauncher.input;

/* JADX INFO: loaded from: classes.dex */
public final class GamepadMappingDialog {
    private static final int COLOR_ACCENT = 0;
    private static final int COLOR_ACCENT_MUTED = 0;
    private static final int COLOR_CARD_BG = 0;
    private static final int COLOR_CARD_BG_PRESSED = 0;
    private static final int COLOR_CARD_STROKE = 0;
    private static final int COLOR_DIALOG_BG = 0;
    private static final int COLOR_TEXT_MUTED = 0;
    private static final int COLOR_TEXT_PRIMARY = 0;
    private static final int COLOR_TEXT_SECONDARY = 0;
    private static final float DIALOG_ALPHA_HITBOX_PREVIEW = 0.12f;
    private static final float DIALOG_ALPHA_VISIBLE = 1.0f;
    private static final float DIALOG_DIM_NORMAL = 0.58f;
    private static final float DIALOG_DIM_PREVIEW = 0.02f;
    private static androidx.appcompat.app.AlertDialog activeDialog;









    private interface ActionPickCallback {
        void onActionPicked(ca.dnamobile.javalauncher.input.GamepadAction r1);
    }

    private static final class ActionSlotView {
        ca.dnamobile.javalauncher.input.GamepadAction action;
        final android.widget.TextView view;

        ActionSlotView(android.widget.TextView r1, ca.dnamobile.javalauncher.input.GamepadAction r2) {
                r0 = this;
                r0.<init>()
                r0.view = r1
                r0.action = r2
                r0.setAction(r2)
                return
        }

        void setAction(ca.dnamobile.javalauncher.input.GamepadAction r5) {
                r4 = this;
                r4.action = r5
                android.widget.TextView r0 = r4.view
                java.lang.String r1 = r5.toString()
                r0.setText(r1)
                ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
                if (r5 != r0) goto L11
                r5 = 1
                goto L12
            L11:
                r5 = 0
            L12:
                android.widget.TextView r0 = r4.view
                if (r5 == 0) goto L1b
                int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.m469$$Nest$sfgetCOLOR_TEXT_MUTED()
                goto L1f
            L1b:
                int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.m470$$Nest$sfgetCOLOR_TEXT_PRIMARY()
            L1f:
                r0.setTextColor(r1)
                android.widget.TextView r0 = r4.view
                android.content.Context r1 = r0.getContext()
                android.app.Activity r1 = (android.app.Activity) r1
                if (r5 == 0) goto L31
                int r2 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.m466$$Nest$sfgetCOLOR_CARD_BG()
                goto L35
            L31:
                int r2 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.m467$$Nest$sfgetCOLOR_CARD_BG_PRESSED()
            L35:
                if (r5 == 0) goto L3c
                int r5 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.m468$$Nest$sfgetCOLOR_CARD_STROKE()
                goto L40
            L3c:
                int r5 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.m465$$Nest$sfgetCOLOR_ACCENT_MUTED()
            L40:
                r3 = 12
                android.graphics.drawable.GradientDrawable r5 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.m478$$Nest$smroundedDrawable(r1, r2, r5, r3)
                r0.setBackground(r5)
                return
        }
    }

    private static final class DeviceProfile {
        final boolean attached;
        final java.lang.String key;
        final java.lang.String label;

        DeviceProfile(java.lang.String r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.label = r2
                r0.attached = r3
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.label
                return r0
        }
    }

    private interface NumberValueCallback {
        void onValueSelected(int r1);
    }

    public interface OnSettingsSavedListener {
        void onSettingsSaved();
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_ACCENT_MUTED, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m465$$Nest$sfgetCOLOR_ACCENT_MUTED() {
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_ACCENT_MUTED
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_CARD_BG, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m466$$Nest$sfgetCOLOR_CARD_BG() {
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_BG
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_CARD_BG_PRESSED, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m467$$Nest$sfgetCOLOR_CARD_BG_PRESSED() {
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_BG_PRESSED
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_CARD_STROKE, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m468$$Nest$sfgetCOLOR_CARD_STROKE() {
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_STROKE
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_TEXT_MUTED, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m469$$Nest$sfgetCOLOR_TEXT_MUTED() {
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_MUTED
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$sfgetCOLOR_TEXT_PRIMARY, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m470$$Nest$sfgetCOLOR_TEXT_PRIMARY() {
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_PRIMARY
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smapplyGameResolutionScale, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m471$$Nest$smapplyGameResolutionScale(android.app.Activity r0, int r1, android.widget.TextView r2, java.lang.String r3, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r4) {
            applyGameResolutionScale(r0, r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$smapplySectionSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m472$$Nest$smapplySectionSelections(ca.dnamobile.javalauncher.input.GamepadMappingStore r0, java.lang.String r1, boolean r2, java.util.Map r3) {
            applySectionSelections(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$smnotifySettingsChanged, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m473$$Nest$smnotifySettingsChanged(android.app.Activity r0, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r1) {
            notifySettingsChanged(r0, r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$smprogressToFloat, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m474$$Nest$smprogressToFloat(int r0, int r1) {
            float r0 = progressToFloat(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smprogressToMouseDpi, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m475$$Nest$smprogressToMouseDpi(int r0) {
            int r0 = progressToMouseDpi(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smprogressToResolutionScale, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m476$$Nest$smprogressToResolutionScale(int r0) {
            int r0 = progressToResolutionScale(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smprogressToSensitivity, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m477$$Nest$smprogressToSensitivity(int r0) {
            int r0 = progressToSensitivity(r0)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smroundedDrawable, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.graphics.drawable.GradientDrawable m478$$Nest$smroundedDrawable(android.app.Activity r0, int r1, int r2, int r3) {
            android.graphics.drawable.GradientDrawable r0 = roundedDrawable(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smselectedGuiScaleValue, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m479$$Nest$smselectedGuiScaleValue(int[] r0, android.widget.Spinner r1) {
            int r0 = selectedGuiScaleValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smselectedProfileKey, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m480$$Nest$smselectedProfileKey(java.util.List r0, android.widget.Spinner r1) {
            java.lang.String r0 = selectedProfileKey(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$smsetActiveDialogHitboxPreviewAlpha, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m481$$Nest$smsetActiveDialogHitboxPreviewAlpha(boolean r0) {
            setActiveDialogHitboxPreviewAlpha(r0)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$smsetActiveDialogPreviewAlpha, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m482$$Nest$smsetActiveDialogPreviewAlpha(boolean r0) {
            setActiveDialogPreviewAlpha(r0)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$smstyleSpinnerText, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m483$$Nest$smstyleSpinnerText(android.view.View r0, boolean r1) {
            styleSpinnerText(r0, r1)
            return
    }

    static {
            r0 = 34
            r1 = 42
            r2 = 30
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_DIALOG_BG = r0
            r0 = 53
            r1 = 38
            r2 = 43
            int r0 = android.graphics.Color.rgb(r1, r2, r0)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_BG = r0
            r0 = 49
            r1 = 60
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_BG_PRESSED = r0
            r0 = 61
            r1 = 74
            r2 = 54
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_STROKE = r0
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 248(0xf8, float:3.48E-43)
            r2 = 238(0xee, float:3.34E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_PRIMARY = r0
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 216(0xd8, float:3.03E-43)
            r2 = 198(0xc6, float:2.77E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_SECONDARY = r0
            r0 = 159(0x9f, float:2.23E-43)
            r1 = 176(0xb0, float:2.47E-43)
            r2 = 150(0x96, float:2.1E-43)
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_MUTED = r0
            r0 = 211(0xd3, float:2.96E-43)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 37
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_ACCENT = r0
            r0 = 135(0x87, float:1.89E-43)
            r1 = 110(0x6e, float:1.54E-43)
            r2 = 86
            int r0 = android.graphics.Color.rgb(r2, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_ACCENT_MUTED = r0
            return
    }

    private GamepadMappingDialog() {
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
            int r3 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_BG
            r2.setColor(r3)
            r3 = 18
            int r3 = dp(r4, r3)
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            int r1 = dp(r4, r1)
            int r3 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_STROKE
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
            r4 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r4)
            int r4 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_PRIMARY
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

    private static android.widget.CheckBox addCheckBox(android.app.Activity r1, android.widget.LinearLayout r2, java.lang.String r3, boolean r4) {
            android.widget.CheckBox r0 = new android.widget.CheckBox
            r0.<init>(r1)
            r0.setText(r3)
            r1 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r1)
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_SECONDARY
            r0.setTextColor(r1)
            r0.setChecked(r4)
            tintCheckBox(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r1.<init>(r3, r4)
            r2.addView(r0, r1)
            return r0
    }

    private static void addCollapsibleHeader(android.app.Activity r3, android.widget.LinearLayout r4, java.lang.String r5, android.widget.LinearLayout r6, boolean r7) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r7 == 0) goto Lf
            java.lang.String r2 = "▾  "
            goto L11
        Lf:
            java.lang.String r2 = "▸  "
        L11:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            r1 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r1)
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_PRIMARY
            r0.setTextColor(r1)
            r1 = 16
            r0.setGravity(r1)
            r1 = 8
            int r3 = dp(r3, r1)
            r2 = 0
            r0.setPadding(r2, r2, r2, r3)
            if (r7 == 0) goto L41
            r1 = r2
        L41:
            r6.setVisibility(r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda11 r3 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda11
            r3.<init>(r6, r0, r5)
            r0.setOnClickListener(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r6 = -2
            r3.<init>(r5, r6)
            r4.addView(r0, r3)
            return
    }

    private static android.widget.TextView addFloatControl(android.app.Activity r1, android.widget.LinearLayout r2, java.lang.String r3, float r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = java.lang.Math.round(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.widget.TextView r1 = addPlainLabel(r1, r2, r3)
            return r1
    }

    private static android.widget.SeekBar addFloatSeekBar(android.app.Activity r8, android.widget.LinearLayout r9, int r10, int r11, float r12, android.widget.TextView r13, java.lang.String r14) {
            android.widget.SeekBar r7 = new android.widget.SeekBar
            r7.<init>(r8)
            tintSeekBar(r7)
            r0 = 1
            int r1 = r11 - r10
            int r0 = java.lang.Math.max(r0, r1)
            r7.setMax(r0)
            int r12 = floatToProgress(r12, r10, r11)
            r7.setProgress(r12)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda15 r12 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda15
            r0 = r12
            r1 = r8
            r2 = r14
            r3 = r7
            r4 = r10
            r5 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.setOnClickListener(r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r14)
            java.lang.String r11 = ": "
            java.lang.StringBuilder r8 = r8.append(r11)
            int r11 = r7.getProgress()
            float r11 = progressToFloat(r11, r10)
            int r11 = java.lang.Math.round(r11)
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.String r8 = r8.toString()
            r13.setText(r8)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$4 r8 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$4
            r8.<init>(r13, r14, r10)
            r7.setOnSeekBarChangeListener(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r11 = -2
            r8.<init>(r10, r11)
            r9.addView(r7, r8)
            return r7
    }

    private static android.widget.TextView addInfoText(android.app.Activity r2, android.widget.LinearLayout r3, java.lang.String r4) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r4)
            int r4 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_SECONDARY
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

    private static android.widget.TextView addMouseDpiControl(android.app.Activity r1, android.widget.LinearLayout r2, java.lang.String r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "%"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.widget.TextView r1 = addPlainLabel(r1, r2, r3)
            return r1
    }

    private static android.widget.SeekBar addMouseDpiSeekBar(android.app.Activity r7, android.widget.LinearLayout r8, ca.dnamobile.javalauncher.input.GamepadMappingStore r9, int r10, android.widget.TextView r11, java.lang.String r12) {
            android.widget.SeekBar r6 = new android.widget.SeekBar
            r6.<init>(r7)
            tintSeekBar(r6)
            r0 = 275(0x113, float:3.85E-43)
            r6.setMax(r0)
            int r10 = mouseDpiToProgress(r10)
            r6.setProgress(r10)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda3 r10 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda3
            r0 = r10
            r1 = r7
            r2 = r12
            r3 = r6
            r4 = r11
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r11.setOnClickListener(r10)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.String r10 = ": "
            java.lang.StringBuilder r7 = r7.append(r10)
            int r10 = r6.getProgress()
            int r10 = progressToMouseDpi(r10)
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r10 = "%"
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.String r7 = r7.toString()
            r11.setText(r7)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$6 r7 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$6
            r7.<init>(r11, r12, r9)
            r6.setOnSeekBarChangeListener(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r10 = -2
            r7.<init>(r9, r10)
            r8.addView(r6, r7)
            return r6
    }

    private static android.widget.TextView addPlainLabel(android.app.Activity r2, android.widget.LinearLayout r3, java.lang.String r4) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r4)
            r4 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r4)
            int r4 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_SECONDARY
            r0.setTextColor(r4)
            r4 = 10
            int r4 = dp(r2, r4)
            r1 = 2
            int r2 = dp(r2, r1)
            r1 = 0
            r0.setPadding(r1, r4, r1, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r1 = -2
            r2.<init>(r4, r1)
            r3.addView(r0, r2)
            return r0
    }

    private static android.widget.TextView addResolutionScaleControl(android.app.Activity r1, android.widget.LinearLayout r2, java.lang.String r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = ca.dnamobile.javalauncher.settings.LauncherPreferences.clampGameResolutionScalePercent(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "%"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.widget.TextView r1 = addPlainLabel(r1, r2, r3)
            return r1
    }

    private static android.widget.SeekBar addResolutionScaleSeekBar(android.app.Activity r9, android.widget.LinearLayout r10, int r11, android.widget.TextView r12, java.lang.String r13, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r14) {
            android.widget.SeekBar r7 = new android.widget.SeekBar
            r7.<init>(r9)
            tintSeekBar(r7)
            r0 = 175(0xaf, float:2.45E-43)
            r7.setMax(r0)
            int r11 = resolutionScaleToProgress(r11)
            r7.setProgress(r11)
            int r11 = r7.getProgress()
            int[] r11 = new int[]{r11}
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda18 r8 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda18
            r0 = r8
            r1 = r9
            r2 = r13
            r3 = r7
            r4 = r11
            r5 = r12
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.setOnClickListener(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r7.getProgress()
            int r1 = progressToResolutionScale(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "%"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.setText(r0)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$7 r6 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$7
            r0 = r6
            r1 = r12
            r3 = r11
            r4 = r9
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r7.setOnSeekBarChangeListener(r6)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r12 = -2
            r9.<init>(r11, r12)
            r10.addView(r7, r9)
            return r7
    }

    private static void addSection(android.app.Activity r20, android.widget.LinearLayout r21, boolean r22, ca.dnamobile.javalauncher.input.GamepadMappingStore r23, java.lang.String r24, java.util.Map<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionSlotView[]> r25) {
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = "Extra mappings hidden"
            r4.add(r5)
            r5 = 1
            r6 = r5
        L14:
            r7 = 4
            if (r6 >= r7) goto L2c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Show position "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r7 = r7.toString()
            r4.add(r7)
            int r6 = r6 + 1
            goto L14
        L2c:
            ca.dnamobile.javalauncher.input.GamepadButton[] r6 = ca.dnamobile.javalauncher.input.GamepadButton.values()
            int r8 = r6.length
            r9 = 0
            r10 = r9
        L33:
            if (r10 >= r8) goto L1fe
            r11 = r6[r10]
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r0)
            r12.setOrientation(r5)
            r13 = 6
            int r13 = dp(r0, r13)
            r14 = 8
            int r15 = dp(r0, r14)
            r12.setPadding(r9, r13, r9, r15)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$ActionSlotView[] r13 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionSlotView[r7]
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r0)
            r15.setOrientation(r9)
            r14 = 16
            r15.setGravity(r14)
            r7 = 2
            int r14 = dp(r0, r7)
            int r5 = dp(r0, r7)
            r15.setPadding(r9, r14, r9, r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r0)
            r14 = 1
            r5.setOrientation(r14)
            r14 = 16
            r5.setGravity(r14)
            android.widget.TextView r14 = new android.widget.TextView
            r14.<init>(r0)
            java.lang.String r7 = r11.toString()
            r14.setText(r7)
            r7 = 1096810496(0x41600000, float:14.0)
            r14.setTextSize(r7)
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT_BOLD
            r14.setTypeface(r7)
            int r7 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_SECONDARY
            r14.setTextColor(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            java.lang.String r9 = "Position 0"
            r7.setText(r9)
            r9 = 1094713344(0x41400000, float:12.0)
            r7.setTextSize(r9)
            int r9 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_MUTED
            r7.setTextColor(r9)
            r16 = r6
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r17 = r8
            r8 = -1
            r18 = r10
            r10 = -2
            r6.<init>(r8, r10)
            r5.addView(r14, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r8, r10)
            r5.addView(r7, r6)
            r6 = 0
            ca.dnamobile.javalauncher.input.GamepadAction r7 = r2.getButtonActionSlot(r11, r1, r3, r6)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$ActionSlotView r7 = createActionSlotView(r0, r11, r1, r6, r7)
            r13[r6] = r7
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r8 = 1063675494(0x3f666666, float:0.9)
            r14.<init>(r6, r10, r8)
            r15.addView(r5, r14)
            android.widget.TextView r5 = r7.view
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = 1069966950(0x3fc66666, float:1.55)
            r7.<init>(r6, r10, r8)
            r15.addView(r5, r7)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r5.<init>(r7, r10)
            r12.addView(r15, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r6)
            r8 = 16
            r7.setGravity(r8)
            r8 = 12
            int r14 = dp(r0, r8)
            r15 = 2
            int r8 = dp(r0, r15)
            int r10 = dp(r0, r15)
            r7.setPadding(r14, r8, r6, r10)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r0)
            java.lang.String r10 = "Extra slots"
            r8.setText(r10)
            r10 = 1094713344(0x41400000, float:12.0)
            r8.setTextSize(r10)
            r8.setTextColor(r9)
            android.widget.Spinner r9 = new android.widget.Spinner
            r9.<init>(r0)
            android.widget.ArrayAdapter r10 = darkAdapter(r0, r4)
            r9.setAdapter(r10)
            r9.setSelection(r6, r6)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r14 = 1061158912(0x3f400000, float:0.75)
            r15 = -2
            r10.<init>(r6, r15, r14)
            r7.addView(r8, r10)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = 1070386381(0x3fcccccd, float:1.6)
            r8.<init>(r6, r15, r10)
            r7.addView(r9, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r8.<init>(r10, r15)
            r12.addView(r7, r8)
            r7 = 1
            r8 = 4
        L14f:
            if (r7 >= r8) goto L1d3
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            r10.setOrientation(r6)
            r15 = 16
            r10.setGravity(r15)
            r8 = 12
            int r15 = dp(r0, r8)
            r8 = 2
            int r14 = dp(r0, r8)
            r19 = r4
            int r4 = dp(r0, r8)
            r10.setPadding(r15, r14, r6, r4)
            r4 = 8
            r10.setVisibility(r4)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Position "
            r14.<init>(r15)
            java.lang.StringBuilder r14 = r14.append(r7)
            java.lang.String r14 = r14.toString()
            r6.setText(r14)
            r14 = 1094713344(0x41400000, float:12.0)
            r6.setTextSize(r14)
            int r15 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_MUTED
            r6.setTextColor(r15)
            ca.dnamobile.javalauncher.input.GamepadAction r15 = r2.getButtonActionSlot(r11, r1, r3, r7)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$ActionSlotView r15 = createActionSlotView(r0, r11, r1, r7, r15)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r0 = 0
            r8 = 1061158912(0x3f400000, float:0.75)
            r14 = -2
            r4.<init>(r0, r14, r8)
            r10.addView(r6, r4)
            android.widget.TextView r4 = r15.view
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = 1070386381(0x3fcccccd, float:1.6)
            r6.<init>(r0, r14, r8)
            r10.addView(r4, r6)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r4.<init>(r6, r14)
            r12.addView(r10, r4)
            r5.add(r10)
            r13[r7] = r15
            int r7 = r7 + 1
            r6 = r0
            r4 = r19
            r8 = 4
            r14 = 1061158912(0x3f400000, float:0.75)
            r0 = r20
            goto L14f
        L1d3:
            r19 = r4
            r0 = r6
            r6 = -1
            r14 = -2
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$8 r4 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$8
            r4.<init>(r5)
            r9.setOnItemSelectedListener(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r6, r14)
            r5 = r21
            r5.addView(r12, r4)
            r4 = r25
            r4.put(r11, r13)
            int r10 = r18 + 1
            r9 = r0
            r6 = r16
            r8 = r17
            r4 = r19
            r5 = 1
            r7 = 4
            r0 = r20
            goto L33
        L1fe:
            return
    }

    private static android.widget.TextView addSensitivityControl(android.app.Activity r1, android.widget.LinearLayout r2, java.lang.String r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "%"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.widget.TextView r1 = addPlainLabel(r1, r2, r3)
            return r1
    }

    private static android.widget.SeekBar addSensitivitySeekBar(android.app.Activity r2, android.widget.LinearLayout r3, int r4, android.widget.TextView r5, java.lang.String r6) {
            android.widget.SeekBar r0 = new android.widget.SeekBar
            r0.<init>(r2)
            tintSeekBar(r0)
            r1 = 175(0xaf, float:2.45E-43)
            r0.setMax(r1)
            int r4 = sensitivityToProgress(r4)
            r0.setProgress(r4)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda19 r4 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda19
            r4.<init>(r2, r6, r0, r5)
            r5.setOnClickListener(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r2 = r2.append(r4)
            int r4 = r0.getProgress()
            int r4 = progressToSensitivity(r4)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = "%"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r5.setText(r2)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$5 r2 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$5
            r2.<init>(r5, r6)
            r0.setOnSeekBarChangeListener(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r2.<init>(r4, r5)
            r3.addView(r0, r2)
            return r0
    }

    private static void addSmallHint(android.app.Activity r2, android.widget.LinearLayout r3, java.lang.String r4) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r4)
            r4 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r4)
            int r4 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_MUTED
            r0.setTextColor(r4)
            r4 = 32
            int r4 = dp(r2, r4)
            r1 = 6
            int r2 = dp(r2, r1)
            r1 = 0
            r0.setPadding(r4, r1, r1, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r1 = -2
            r2.<init>(r4, r1)
            r3.addView(r0, r2)
            return
    }

    private static void applyGameResolutionScale(android.app.Activity r1, int r2, android.widget.TextView r3, java.lang.String r4, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r5) {
            int r2 = ca.dnamobile.javalauncher.settings.LauncherPreferences.clampGameResolutionScalePercent(r2)
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setGameResolutionScalePercent(r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = "%"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.setText(r2)
            notifySettingsChanged(r1, r5)
            return
    }

    private static void applySectionSelections(ca.dnamobile.javalauncher.input.GamepadMappingStore r5, java.lang.String r6, boolean r7, java.util.Map<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionSlotView[]> r8) {
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$ActionSlotView[] r1 = (ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionSlotView[]) r1
            r2 = 0
        L1b:
            int r3 = r1.length
            if (r2 >= r3) goto L8
            r3 = r1[r2]
            if (r3 == 0) goto L2f
            java.lang.Object r4 = r0.getKey()
            ca.dnamobile.javalauncher.input.GamepadButton r4 = (ca.dnamobile.javalauncher.input.GamepadButton) r4
            ca.dnamobile.javalauncher.input.GamepadAction r4 = r5.getButtonActionSlot(r4, r7, r6, r2)
            r3.setAction(r4)
        L2f:
            int r2 = r2 + 1
            goto L1b
        L32:
            return
    }

    private static ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionSlotView createActionSlotView(android.app.Activity r8, ca.dnamobile.javalauncher.input.GamepadButton r9, boolean r10, int r11, ca.dnamobile.javalauncher.input.GamepadAction r12) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r8)
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r1)
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_PRIMARY
            r0.setTextColor(r1)
            r1 = 16
            r0.setGravity(r1)
            r1 = 44
            int r1 = dp(r8, r1)
            r0.setMinHeight(r1)
            r1 = 12
            int r2 = dp(r8, r1)
            r3 = 8
            int r4 = dp(r8, r3)
            int r1 = dp(r8, r1)
            int r3 = dp(r8, r3)
            r0.setPadding(r2, r4, r1, r3)
            r1 = 0
            r0.setSingleLine(r1)
            r1 = 1
            r0.setClickable(r1)
            r0.setFocusable(r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$ActionSlotView r1 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$ActionSlotView
            r1.<init>(r0, r12)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda2 r12 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda2
            r2 = r12
            r3 = r8
            r4 = r9
            r5 = r11
            r6 = r10
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.setOnClickListener(r12)
            return r1
    }

    private static <T> android.widget.ArrayAdapter<T> darkAdapter(android.app.Activity r2, java.util.List<T> r3) {
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$3 r0 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$3
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r0.<init>(r2, r1, r3)
            r2 = 17367049(0x1090009, float:2.516295E-38)
            r0.setDropDownViewResource(r2)
            return r0
    }

    private static java.util.List<ca.dnamobile.javalauncher.input.GamepadMappingDialog.DeviceProfile> discoverProfiles(android.app.Activity r8, ca.dnamobile.javalauncher.input.GamepadMappingStore r9) {
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r0 = r9.getActiveProfileKey()
            java.lang.String r1 = r9.getDefaultProfileKey()
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile r2 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile
            java.lang.String r3 = r9.getDefaultProfileKey()
            java.lang.String r4 = r9.getDefaultProfileKey()
            java.lang.String r4 = r9.getProfileDisplayName(r4)
            r5 = 0
            r2.<init>(r3, r4, r5)
            r8.put(r1, r2)
            java.util.Set r1 = r9.getKnownProfileKeys()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile r3 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile
            java.lang.String r4 = r9.getProfileDisplayName(r2)
            r3.<init>(r2, r4, r5)
            r8.put(r2, r3)
            goto L2a
        L43:
            int[] r1 = android.view.InputDevice.getDeviceIds()
            int r2 = r1.length
        L48:
            if (r5 >= r2) goto L70
            r3 = r1[r5]
            android.view.InputDevice r3 = android.view.InputDevice.getDevice(r3)
            if (r3 == 0) goto L6d
            boolean r4 = isGamepadDevice(r3)
            if (r4 != 0) goto L59
            goto L6d
        L59:
            r9.registerDevice(r3)
            java.lang.String r3 = r9.profileKeyForDevice(r3)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile r4 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile
            java.lang.String r6 = r9.getProfileDisplayName(r3)
            r7 = 1
            r4.<init>(r3, r6, r7)
            r8.put(r3, r4)
        L6d:
            int r5 = r5 + 1
            goto L48
        L70:
            r9.setActiveProfileKey(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.Collection r8 = r8.values()
            r9.<init>(r8)
            return r9
    }

    private static int dp(android.app.Activity r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    private static int dpFromView(android.view.View r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    private static int findGuiScaleIndex(int[] r3, int r4) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.length
            if (r1 >= r2) goto Ld
            r2 = r3[r1]
            if (r2 != r4) goto La
            return r1
        La:
            int r1 = r1 + 1
            goto L2
        Ld:
            return r0
    }

    private static int floatToProgress(float r0, int r1, int r2) {
            int r2 = r2 - r1
            int r0 = java.lang.Math.round(r0)
            int r0 = r0 - r1
            int r0 = java.lang.Math.min(r2, r0)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private static ca.dnamobile.javalauncher.input.GamepadAction gamepadActionForPickerCode(int r0) {
            switch(r0) {
                case -2147482607: goto L11;
                case -2147482606: goto Le;
                case -2147482605: goto Lb;
                case -2147482604: goto L8;
                default: goto L3;
            }
        L3:
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.fromKeyboardPickerCode(r0)
            return r0
        L8:
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.CURSOR_RIGHT
            return r0
        Lb:
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.CURSOR_LEFT
            return r0
        Le:
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.CURSOR_DOWN
            return r0
        L11:
            ca.dnamobile.javalauncher.input.GamepadAction r0 = ca.dnamobile.javalauncher.input.GamepadAction.CURSOR_UP
            return r0
    }

    private static boolean isGamepadDevice(android.view.InputDevice r2) {
            int r2 = r2.getSources()
            r0 = r2 & 1025(0x401, float:1.436E-42)
            r1 = 1025(0x401, float:1.436E-42)
            if (r0 == r1) goto L13
            r0 = 16777232(0x1000010, float:2.3509932E-38)
            r2 = r2 & r0
            if (r2 != r0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    static /* synthetic */ void lambda$addCollapsibleHeader$6(android.widget.LinearLayout r1, android.widget.TextView r2, java.lang.String r3, android.view.View r4) {
            int r4 = r1.getVisibility()
            r0 = 0
            if (r4 == 0) goto L9
            r4 = 1
            goto La
        L9:
            r4 = r0
        La:
            if (r4 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 8
        Lf:
            r1.setVisibility(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L1c
            java.lang.String r4 = "▾  "
            goto L1e
        L1c:
            java.lang.String r4 = "▸  "
        L1e:
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.setText(r1)
            return
    }

    static /* synthetic */ void lambda$addFloatSeekBar$7(android.widget.SeekBar r1, int r2, int r3, android.widget.TextView r4, java.lang.String r5, int r6) {
            float r0 = (float) r6
            int r2 = floatToProgress(r0, r2, r3)
            r1.setProgress(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r4.setText(r1)
            return
    }

    static /* synthetic */ void lambda$addFloatSeekBar$8(android.app.Activity r9, java.lang.String r10, android.widget.SeekBar r11, int r12, int r13, android.widget.TextView r14, android.view.View r15) {
            int r15 = r11.getProgress()
            float r15 = progressToFloat(r15, r12)
            int r2 = java.lang.Math.round(r15)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda16 r15 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda16
            r3 = r15
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r5 = ""
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
            r6 = r15
            showNumberInputDialog(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ void lambda$addMouseDpiSeekBar$11(android.widget.SeekBar r1, android.widget.TextView r2, java.lang.String r3, ca.dnamobile.javalauncher.input.GamepadMappingStore r4, int r5) {
            int r0 = mouseDpiToProgress(r5)
            r1.setProgress(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r3 = "%"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.setText(r1)
            r4.setHardwareMouseDpiScale(r5)
            return
    }

    static /* synthetic */ void lambda$addMouseDpiSeekBar$12(android.app.Activity r7, java.lang.String r8, android.widget.SeekBar r9, android.widget.TextView r10, ca.dnamobile.javalauncher.input.GamepadMappingStore r11, android.view.View r12) {
            int r12 = r9.getProgress()
            int r2 = progressToMouseDpi(r12)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda0 r6 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda0
            r6.<init>(r9, r10, r8, r11)
            r3 = 25
            r4 = 300(0x12c, float:4.2E-43)
            java.lang.String r5 = "%"
            r0 = r7
            r1 = r8
            showNumberInputDialog(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ void lambda$addResolutionScaleSeekBar$13(android.widget.SeekBar r1, int[] r2, android.app.Activity r3, android.widget.TextView r4, java.lang.String r5, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r6, int r7) {
            int r7 = ca.dnamobile.javalauncher.settings.LauncherPreferences.clampGameResolutionScalePercent(r7)
            int r0 = resolutionScaleToProgress(r7)
            r1.setProgress(r0)
            r1 = 0
            r2[r1] = r0
            applyGameResolutionScale(r3, r7, r4, r5, r6)
            return
    }

    static /* synthetic */ void lambda$addResolutionScaleSeekBar$14(android.app.Activity r11, java.lang.String r12, android.widget.SeekBar r13, int[] r14, android.widget.TextView r15, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r16, android.view.View r17) {
            int r0 = r13.getProgress()
            int r3 = progressToResolutionScale(r0)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda1 r0 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda1
            r4 = r0
            r5 = r13
            r6 = r14
            r7 = r11
            r8 = r15
            r9 = r12
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4 = 25
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.String r6 = "%"
            r1 = r11
            r2 = r12
            r7 = r0
            showNumberInputDialog(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static /* synthetic */ void lambda$addSensitivitySeekBar$10(android.app.Activity r7, java.lang.String r8, android.widget.SeekBar r9, android.widget.TextView r10, android.view.View r11) {
            int r11 = r9.getProgress()
            int r2 = progressToSensitivity(r11)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda17 r6 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda17
            r6.<init>(r9, r10, r8)
            r3 = 25
            r4 = 200(0xc8, float:2.8E-43)
            java.lang.String r5 = "%"
            r0 = r7
            r1 = r8
            showNumberInputDialog(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ void lambda$addSensitivitySeekBar$9(android.widget.SeekBar r1, android.widget.TextView r2, java.lang.String r3, int r4) {
            int r0 = sensitivityToProgress(r4)
            r1.setProgress(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r3 = "%"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.setText(r1)
            return
    }

    static /* synthetic */ void lambda$createActionSlotView$17(android.app.Activity r0, ca.dnamobile.javalauncher.input.GamepadButton r1, int r2, boolean r3, ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionSlotView r4, android.view.View r5) {
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r1 = r5.append(r1)
            java.lang.String r5 = " • Position "
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.input.GamepadAction r2 = r4.action
            java.util.Objects.requireNonNull(r4)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda10 r5 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda10
            r5.<init>(r4)
            showActionKeyboardDialog(r0, r1, r3, r2, r5)
            return
    }

    static /* synthetic */ void lambda$notifySettingsChanged$19(android.view.View r0) {
            r0.requestLayout()
            r0.invalidate()
            r0.postInvalidateOnAnimation()
            return
    }

    static /* synthetic */ void lambda$show$0(java.util.List r0, android.widget.Spinner r1, ca.dnamobile.javalauncher.input.GamepadMappingStore r2, java.util.Map r3, java.util.Map r4, android.app.Activity r5, android.view.View r6) {
            java.lang.String r0 = selectedProfileKey(r0, r1)
            r1 = 0
            saveSection(r2, r0, r1, r3)
            r1 = 1
            saveSection(r2, r0, r1, r4)
            r2.setActiveProfileKey(r0)
            ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity.startExport(r5, r0)
            return
    }

    static /* synthetic */ void lambda$show$1(java.util.List r0, android.widget.Spinner r1, ca.dnamobile.javalauncher.input.GamepadMappingStore r2, android.app.Activity r3, android.view.View r4) {
            java.lang.String r0 = selectedProfileKey(r0, r1)
            r2.setActiveProfileKey(r0)
            ca.dnamobile.javalauncher.input.GamepadMappingTransferActivity.startImport(r3, r0)
            return
    }

    static /* synthetic */ void lambda$show$2(android.app.Activity r0, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r1, android.widget.CompoundButton r2, boolean r3) {
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarHitboxDebugEnabled(r0, r3)
            notifySettingsChanged(r0, r1)
            return
    }

    static /* synthetic */ void lambda$show$3(boolean[] r7, java.util.List r8, android.widget.Spinner r9, ca.dnamobile.javalauncher.input.GamepadMappingStore r10, android.widget.Spinner r11, java.util.List r12, android.app.Activity r13, android.widget.CheckBox r14, android.widget.CheckBox r15, android.widget.CheckBox r16, android.widget.CheckBox r17, android.widget.CheckBox r18, android.widget.SeekBar r19, android.widget.SeekBar r20, android.widget.SeekBar r21, android.widget.SeekBar r22, android.widget.CheckBox r23, int[] r24, android.widget.Spinner r25, android.widget.SeekBar r26, android.widget.SeekBar r27, android.widget.SeekBar r28, android.widget.SeekBar r29, android.widget.SeekBar r30, java.util.Map r31, java.util.Map r32, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r33, android.content.DialogInterface r34, int r35) {
            r0 = r10
            r1 = r13
            r2 = 0
            r3 = 1
            r7[r2] = r3
            java.lang.String r4 = selectedProfileKey(r8, r9)
            r10.setActiveProfileKey(r4)
            int r5 = r11.getSelectedItemPosition()
            int r5 = java.lang.Math.max(r2, r5)
            boolean r6 = r12.isEmpty()
            if (r6 != 0) goto L2f
            int r6 = r12.size()
            if (r5 >= r6) goto L2f
            r6 = r12
            java.lang.Object r5 = r12.get(r5)
            java.io.File r5 = (java.io.File) r5
            java.lang.String r5 = r5.getAbsolutePath()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setSelectedLayoutPath(r13, r5)
        L2f:
            boolean r5 = r14.isChecked()
            r10.setForceGameMode(r5)
            boolean r5 = r15.isChecked()
            r10.setShowCursorOverlay(r5)
            boolean r5 = r16.isChecked()
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setShowInGameSettingsButton(r13, r5)
            boolean r5 = r17.isChecked()
            ca.dnamobile.javalauncher.settings.GameOverlayPreferences.setShowGameFpsCounter(r13, r5)
            boolean r5 = r18.isChecked()
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setShowGameLogOverlay(r13, r5)
            int r5 = r19.getProgress()
            int r5 = progressToSensitivity(r5)
            r10.setMenuCursorSensitivity(r5)
            int r5 = r20.getProgress()
            int r5 = progressToSensitivity(r5)
            r10.setGameCameraSensitivity(r5)
            int r5 = r21.getProgress()
            int r5 = progressToMouseDpi(r5)
            r10.setHardwareMouseDpiScale(r5)
            int r5 = r22.getProgress()
            int r5 = progressToResolutionScale(r5)
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setGameResolutionScalePercent(r13, r5)
            boolean r5 = r23.isChecked()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarHitboxDebugEnabled(r13, r5)
            int r5 = selectedGuiScaleValue(r24, r25)
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarGuiScaleOverride(r13, r5)
            int r5 = r26.getProgress()
            r6 = 90
            float r5 = progressToFloat(r5, r6)
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarWidthGui(r13, r5)
            int r5 = r27.getProgress()
            r6 = 12
            float r5 = progressToFloat(r5, r6)
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarHeightGui(r13, r5)
            int r5 = r28.getProgress()
            r6 = -160(0xffffffffffffff60, float:NaN)
            float r5 = progressToFloat(r5, r6)
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarXOffsetDp(r13, r5)
            int r5 = r29.getProgress()
            r6 = -80
            float r5 = progressToFloat(r5, r6)
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarYOffsetDp(r13, r5)
            int r5 = r30.getProgress()
            float r5 = progressToFloat(r5, r2)
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarVerticalPaddingDp(r13, r5)
            r5 = r31
            saveSection(r10, r4, r3, r5)
            r3 = r32
            saveSection(r10, r4, r2, r3)
            r0 = r33
            notifySettingsChanged(r13, r0)
            return
    }

    static /* synthetic */ void lambda$show$4(boolean[] r0, ca.dnamobile.javalauncher.input.GamepadMappingStore r1, android.app.Activity r2, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r3, android.content.DialogInterface r4, int r5) {
            r4 = 0
            r5 = 1
            r0[r4] = r5
            r1.resetDefaults()
            ca.dnamobile.javalauncher.controls.ControlsPreferences.resetHotbarHitboxSettings(r2)
            ca.dnamobile.javalauncher.settings.GameOverlayPreferences.setShowGameFpsCounter(r2, r5)
            r0 = 100
            ca.dnamobile.javalauncher.settings.LauncherPreferences.setGameResolutionScalePercent(r2, r0)
            notifySettingsChanged(r2, r3)
            return
    }

    static /* synthetic */ void lambda$show$5(boolean[] r0, android.app.Activity r1, boolean r2, int r3, ca.dnamobile.javalauncher.input.GamepadMappingStore r4, int r5, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r6, android.content.DialogInterface r7) {
            r7 = 0
            setActiveDialogHitboxPreviewAlpha(r7)
            setActiveDialogPreviewAlpha(r7)
            boolean r0 = r0[r7]
            if (r0 != 0) goto L17
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarHitboxDebugEnabled(r1, r2)
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setHotbarGuiScaleOverride(r1, r3)
            r4.setHardwareMouseDpiScale(r5)
            notifySettingsChanged(r1, r6)
        L17:
            r0 = 0
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.activeDialog = r0
            return
    }

    static /* synthetic */ boolean lambda$showActionKeyboardDialog$18(android.app.Activity r0, ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionPickCallback r1, int r2) {
            ca.dnamobile.javalauncher.input.GamepadAction r2 = gamepadActionForPickerCode(r2)
            if (r2 != 0) goto L11
            java.lang.String r1 = "That touch-only action is not available for gamepad mappings."
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return r2
        L11:
            r1.onActionPicked(r2)
            r0 = 1
            return r0
    }

    static /* synthetic */ void lambda$showNumberInputDialog$15(android.widget.EditText r1, android.app.Activity r2, int r3, int r4, ca.dnamobile.javalauncher.input.GamepadMappingDialog.NumberValueCallback r5, androidx.appcompat.app.AlertDialog r6, android.view.View r7) {
            android.text.Editable r7 = r1.getText()
            if (r7 != 0) goto L9
            java.lang.String r1 = ""
            goto L15
        L9:
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
        L15:
            boolean r7 = r1.isEmpty()
            r0 = 0
            if (r7 != 0) goto L42
            java.lang.String r7 = "-"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L25
            goto L42
        L25:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L38
            int r1 = java.lang.Math.min(r4, r1)     // Catch: java.lang.NumberFormatException -> L38
            int r1 = java.lang.Math.max(r3, r1)     // Catch: java.lang.NumberFormatException -> L38
            r5.onValueSelected(r1)     // Catch: java.lang.NumberFormatException -> L38
            r6.dismiss()     // Catch: java.lang.NumberFormatException -> L38
            goto L41
        L38:
            java.lang.String r1 = "Enter a valid number."
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r1, r0)
            r1.show()
        L41:
            return
        L42:
            java.lang.String r1 = "Enter a number."
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r1, r0)
            r1.show()
            return
    }

    static /* synthetic */ void lambda$showNumberInputDialog$16(android.app.Activity r8, androidx.appcompat.app.AlertDialog r9, android.widget.EditText r10, int r11, int r12, ca.dnamobile.javalauncher.input.GamepadMappingDialog.NumberValueCallback r13, android.content.DialogInterface r14) {
            styleDialogChrome(r8, r9)
            r10.requestFocus()
            android.view.Window r14 = r9.getWindow()
            if (r14 == 0) goto L10
            r0 = 5
            r14.setSoftInputMode(r0)
        L10:
            r14 = -1
            android.widget.Button r14 = r9.getButton(r14)
            if (r14 == 0) goto L26
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda13 r7 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda13
            r0 = r7
            r1 = r10
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.setOnClickListener(r7)
        L26:
            return
    }

    private static android.widget.LinearLayout.LayoutParams matchWrapWithTopMargin(android.app.Activity r3, int r4) {
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r1 = 0
            int r3 = dp(r3, r4)
            r0.setMargins(r1, r3, r1, r1)
            return r0
    }

    private static int mouseDpiToProgress(int r1) {
            int r1 = r1 + (-25)
            r0 = 275(0x113, float:3.85E-43)
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static void notifySettingsChanged(android.app.Activity r0, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r1) {
            if (r1 == 0) goto L5
            r1.onSettingsSaved()
        L5:
            android.view.Window r1 = r0.getWindow()
            if (r1 != 0) goto Ld
            r0 = 0
            goto L15
        Ld:
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
        L15:
            if (r0 == 0) goto L28
            r0.requestLayout()
            r0.invalidate()
            r0.postInvalidateOnAnimation()
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda12 r1 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda12
            r1.<init>(r0)
            r0.post(r1)
        L28:
            return
    }

    private static int preferredProfileIndex(java.util.List<ca.dnamobile.javalauncher.input.GamepadMappingDialog.DeviceProfile> r3, java.lang.String r4) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.size()
            if (r1 >= r2) goto L1b
            java.lang.Object r2 = r3.get(r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile r2 = (ca.dnamobile.javalauncher.input.GamepadMappingDialog.DeviceProfile) r2
            java.lang.String r2 = r2.key
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L18
            r0 = r1
            goto L1b
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            if (r0 != 0) goto L38
            int r4 = r3.size()
            r1 = 1
            if (r4 <= r1) goto L38
        L24:
            int r4 = r3.size()
            if (r1 >= r4) goto L38
            java.lang.Object r4 = r3.get(r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile r4 = (ca.dnamobile.javalauncher.input.GamepadMappingDialog.DeviceProfile) r4
            boolean r4 = r4.attached
            if (r4 == 0) goto L35
            return r1
        L35:
            int r1 = r1 + 1
            goto L24
        L38:
            return r0
    }

    private static float progressToFloat(int r0, int r1) {
            int r1 = r1 + r0
            float r0 = (float) r1
            return r0
    }

    private static int progressToMouseDpi(int r0) {
            int r0 = r0 + 25
            return r0
    }

    private static int progressToResolutionScale(int r0) {
            int r0 = r0 + 25
            int r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.clampGameResolutionScalePercent(r0)
            return r0
    }

    private static int progressToSensitivity(int r0) {
            int r0 = r0 + 25
            return r0
    }

    private static int resolutionScaleToProgress(int r1) {
            int r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.clampGameResolutionScalePercent(r1)
            int r1 = r1 + (-25)
            r0 = 175(0xaf, float:2.45E-43)
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            return r1
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

    private static void saveSection(ca.dnamobile.javalauncher.input.GamepadMappingStore r9, java.lang.String r10, boolean r11, java.util.Map<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionSlotView[]> r12) {
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L8:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$ActionSlotView[] r1 = (ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionSlotView[]) r1
            r2 = 0
        L1b:
            int r3 = r1.length
            if (r2 >= r3) goto L8
            r3 = r1[r2]
            if (r3 != 0) goto L23
            goto L32
        L23:
            java.lang.Object r4 = r0.getKey()
            ca.dnamobile.javalauncher.input.GamepadButton r4 = (ca.dnamobile.javalauncher.input.GamepadButton) r4
            ca.dnamobile.javalauncher.input.GamepadAction r5 = r3.action
            r3 = r9
            r6 = r11
            r7 = r10
            r8 = r2
            r3.setButtonActionSlot(r4, r5, r6, r7, r8)
        L32:
            int r2 = r2 + 1
            goto L1b
        L35:
            return
    }

    private static int selectedGuiScaleValue(int[] r1, android.widget.Spinner r2) {
            int r2 = r2.getSelectedItemPosition()
            if (r2 >= 0) goto La
            r2 = 0
            r1 = r1[r2]
            return r1
        La:
            int r0 = r1.length
            if (r2 < r0) goto L13
            int r2 = r1.length
            int r2 = r2 + (-1)
            r1 = r1[r2]
            return r1
        L13:
            r1 = r1[r2]
            return r1
    }

    private static java.lang.String selectedProfileKey(java.util.List<ca.dnamobile.javalauncher.input.GamepadMappingDialog.DeviceProfile> r1, android.widget.Spinner r2) {
            int r2 = r2.getSelectedItemPosition()
            if (r2 < 0) goto L16
            int r0 = r1.size()
            if (r2 < r0) goto Ld
            goto L16
        Ld:
            java.lang.Object r1 = r1.get(r2)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile r1 = (ca.dnamobile.javalauncher.input.GamepadMappingDialog.DeviceProfile) r1
            java.lang.String r1 = r1.key
            return r1
        L16:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$DeviceProfile r1 = (ca.dnamobile.javalauncher.input.GamepadMappingDialog.DeviceProfile) r1
            java.lang.String r1 = r1.key
            return r1
    }

    private static int sensitivityToProgress(int r1) {
            int r1 = r1 + (-25)
            r0 = 175(0xaf, float:2.45E-43)
            int r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    private static void setActiveDialogHitboxPreviewAlpha(boolean r3) {
            androidx.appcompat.app.AlertDialog r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.activeDialog
            if (r0 == 0) goto L2e
            android.view.Window r1 = r0.getWindow()
            if (r1 != 0) goto Lb
            goto L2e
        Lb:
            android.view.Window r1 = r0.getWindow()
            if (r3 == 0) goto L15
            r2 = 1017370378(0x3ca3d70a, float:0.02)
            goto L18
        L15:
            r2 = 1058306785(0x3f147ae1, float:0.58)
        L18:
            r1.setDimAmount(r2)
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r3 == 0) goto L29
            r3 = 1039516303(0x3df5c28f, float:0.12)
            goto L2b
        L29:
            r3 = 1065353216(0x3f800000, float:1.0)
        L2b:
            r0.setAlpha(r3)
        L2e:
            return
    }

    private static void setActiveDialogPreviewAlpha(boolean r2) {
            androidx.appcompat.app.AlertDialog r2 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.activeDialog
            if (r2 == 0) goto L22
            android.view.Window r0 = r2.getWindow()
            if (r0 != 0) goto Lb
            goto L22
        Lb:
            android.view.Window r0 = r2.getWindow()
            r1 = 1058306785(0x3f147ae1, float:0.58)
            r0.setDimAmount(r1)
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
        L22:
            return
    }

    public static void show(android.app.Activity r1) {
            r0 = 0
            show(r1, r0)
            return
    }

    public static void show(android.app.Activity r43, ca.dnamobile.javalauncher.input.GamepadMappingDialog.OnSettingsSavedListener r44) {
            r15 = r43
            r14 = r44
            ca.dnamobile.javalauncher.input.GamepadMappingStore r13 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r43)
            boolean r11 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isHotbarHitboxDebugEnabled(r43)
            int r35 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarGuiScaleOverride(r43)
            int r36 = r13.getHardwareMouseDpiScale()
            r7 = 1
            boolean[] r10 = new boolean[r7]
            r8 = 0
            r10[r8] = r8
            android.widget.ScrollView r9 = new android.widget.ScrollView
            r9.<init>(r15)
            r9.setFillViewport(r8)
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r15)
            r12.setOrientation(r7)
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_DIALOG_BG
            r12.setBackgroundColor(r0)
            r9.setBackgroundColor(r0)
            r0 = 18
            int r0 = dp(r15, r0)
            r6 = 8
            int r1 = dp(r15, r6)
            r12.setPadding(r0, r0, r0, r1)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r9.addView(r12, r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r15)
            java.lang.String r3 = "In-game Button Overlay"
            r0.setText(r3)
            r3 = 1103101952(0x41c00000, float:24.0)
            r0.setTextSize(r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r3)
            int r3 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_PRIMARY
            r0.setTextColor(r3)
            r5 = 2
            int r3 = dp(r15, r5)
            int r4 = dp(r15, r5)
            r6 = 6
            int r7 = dp(r15, r6)
            r0.setPadding(r3, r8, r4, r7)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r1, r2)
            r12.addView(r0, r3)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r15)
            java.lang.String r3 = "Configure the launcher-side controller bridge, visual menu cursor, hotbar touch hitbox, and floating in-game overlay. Mappings are saved to the selected controller profile when Android reports a physical controller."
            r0.setText(r3)
            r3 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r3)
            int r3 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_SECONDARY
            r0.setTextColor(r3)
            int r3 = dp(r15, r5)
            int r4 = dp(r15, r5)
            r7 = 12
            int r7 = dp(r15, r7)
            r0.setPadding(r3, r8, r4, r7)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r1, r2)
            r12.addView(r0, r3)
            java.util.EnumMap r7 = new java.util.EnumMap
            java.lang.Class<ca.dnamobile.javalauncher.input.GamepadButton> r0 = ca.dnamobile.javalauncher.input.GamepadButton.class
            r7.<init>(r0)
            java.util.EnumMap r4 = new java.util.EnumMap
            java.lang.Class<ca.dnamobile.javalauncher.input.GamepadButton> r0 = ca.dnamobile.javalauncher.input.GamepadButton.class
            r4.<init>(r0)
            android.widget.LinearLayout r0 = addCard(r15, r12)
            java.lang.String r3 = "Controller profile"
            addCardTitle(r15, r0, r3)
            java.lang.String r3 = "Use the attached controller profile below. If Android cannot identify a controller, the default profile is used."
            android.widget.TextView r3 = addInfoText(r15, r0, r3)
            java.util.List r1 = discoverProfiles(r15, r13)
            android.widget.Spinner r2 = new android.widget.Spinner
            r2.<init>(r15)
            android.widget.ArrayAdapter r5 = darkAdapter(r15, r1)
            r2.setAdapter(r5)
            java.lang.String r5 = r13.getActiveProfileKey()
            int r5 = preferredProfileIndex(r1, r5)
            r2.setSelection(r5)
            android.widget.LinearLayout$LayoutParams r5 = matchWrapWithTopMargin(r15, r6)
            r0.addView(r2, r5)
            int r5 = r1.size()
            r6 = 1
            if (r5 <= r6) goto Lf2
            r5 = r8
            goto Lf4
        Lf2:
            r5 = 8
        Lf4:
            r3.setVisibility(r5)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r15)
            r3.setOrientation(r8)
            r5 = 16
            r3.setGravity(r5)
            r5 = 8
            int r6 = dp(r15, r5)
            r3.setPadding(r8, r6, r8, r8)
            java.lang.String r5 = "Export selected profile"
            android.widget.Button r6 = styledSmallButton(r15, r5)
            java.lang.String r5 = "Import into selected profile"
            android.widget.Button r5 = styledSmallButton(r15, r5)
            r22 = r1
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r23 = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r24 = r4
            r4 = -2
            r1.<init>(r8, r4, r2)
            r3.addView(r6, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r8, r4, r2)
            r2 = 8
            int r8 = dp(r15, r2)
            r1.leftMargin = r8
            r3.addView(r5, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r1.<init>(r8, r4)
            r0.addView(r3, r1)
            java.lang.String r1 = "Exports/imports the currently selected controller profile as a portable DroidBridge gamepad mapping JSON file."
            addSmallHint(r15, r0, r1)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda4 r8 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda4
            r0 = r8
            r4 = r22
            r1 = r4
            r18 = r2
            r3 = r23
            r2 = r3
            r19 = r10
            r10 = r3
            r3 = r13
            r32 = r9
            r33 = r24
            r9 = r4
            r4 = r33
            r14 = r5
            r34 = r11
            r11 = 2
            r5 = r7
            r11 = r6
            r18 = 6
            r6 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.setOnClickListener(r8)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda5 r0 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda5
            r0.<init>(r9, r10, r13, r15)
            r14.setOnClickListener(r0)
            android.widget.LinearLayout r6 = addCard(r15, r12)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r15)
            r0 = 1
            r8.setOrientation(r0)
            java.lang.String r0 = "Menu mappings"
            r1 = 0
            addCollapsibleHeader(r15, r6, r0, r8, r1)
            java.lang.String r0 = "Used in Minecraft menus. D-pad cursor movement now only repeats when the selected D-pad action is a Cursor action."
            addInfoText(r15, r8, r0)
            r2 = 0
            java.lang.String r4 = selectedProfileKey(r9, r10)
            r0 = r43
            r1 = r8
            r5 = r33
            addSection(r0, r1, r2, r3, r4, r5)
            r6.addView(r8)
            android.widget.LinearLayout r6 = addCard(r15, r12)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r15)
            r0 = 1
            r8.setOrientation(r0)
            java.lang.String r0 = "In-game mappings"
            r1 = 0
            addCollapsibleHeader(r15, r6, r0, r8, r1)
            java.lang.String r0 = "Used while Minecraft has grabbed the mouse or when Force in-game mappings is enabled."
            addInfoText(r15, r8, r0)
            r2 = 1
            java.lang.String r4 = selectedProfileKey(r9, r10)
            r0 = r43
            r1 = r8
            r5 = r7
            addSection(r0, r1, r2, r3, r4, r5)
            r6.addView(r8)
            android.widget.LinearLayout r6 = addCard(r15, r12)
            java.lang.String r0 = "Overlay behavior"
            addCardTitle(r15, r6, r0)
            java.lang.String r0 = "Force in-game mappings"
            boolean r1 = r13.isForceGameMode()
            android.widget.CheckBox r38 = addCheckBox(r15, r6, r0, r1)
            java.lang.String r0 = "Only turn this on after entering a world if camera/WASD input does not start automatically."
            addSmallHint(r15, r6, r0)
            java.lang.String r0 = "Show controller cursor overlay in menus"
            boolean r1 = r13.isShowCursorOverlay()
            android.widget.CheckBox r39 = addCheckBox(r15, r6, r0, r1)
            java.lang.String r0 = "Visual only. It no longer becomes a touch target, so screen taps and Touch Controller input pass through to Minecraft."
            addSmallHint(r15, r6, r0)
            java.lang.String r0 = "Show floating settings button"
            boolean r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowInGameSettingsButton(r43)
            android.widget.CheckBox r40 = addCheckBox(r15, r6, r0, r1)
            java.lang.String r0 = "Show FPS counter on floating button"
            boolean r1 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.isShowGameFpsCounter(r43)
            android.widget.CheckBox r41 = addCheckBox(r15, r6, r0, r1)
            java.lang.String r0 = "Enabled by default. Turn this off if the FPS text feels distracting while playing."
            addSmallHint(r15, r6, r0)
            java.lang.String r0 = "Show latest log on the left side"
            boolean r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowGameLogOverlay(r43)
            android.widget.CheckBox r42 = addCheckBox(r15, r6, r0, r1)
            java.lang.String r0 = "Touch controls layout"
            addPlainLabel(r15, r6, r0)
            java.util.List r14 = ca.dnamobile.javalauncher.controls.TouchControlsStore.listLayouts(r43)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getSelectedLayoutPath(r43)
            r2 = 0
            r3 = 0
        L223:
            int r4 = r14.size()
            if (r2 >= r4) goto L263
            java.lang.Object r4 = r14.get(r2)
            java.io.File r4 = (java.io.File) r4
            ca.dnamobile.javalauncher.controls.TouchControlsLayoutData r5 = ca.dnamobile.javalauncher.controls.TouchControlsStore.loadLayout(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = r5.name
            java.lang.StringBuilder r5 = r8.append(r5)
            java.lang.String r8 = "  •  "
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r8 = r4.getName()
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            r0.add(r5)
            if (r1 == 0) goto L260
            java.lang.String r4 = r4.getAbsolutePath()
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L260
            r3 = r2
        L260:
            int r2 = r2 + 1
            goto L223
        L263:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L286
            java.io.File r1 = ca.dnamobile.javalauncher.controls.TouchControlsStore.getDefaultLayoutFile(r43)
            r14.add(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Default Touch Controls  •  "
            r2.<init>(r4)
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L286:
            android.widget.Spinner r1 = new android.widget.Spinner
            r8 = r12
            r12 = r1
            r1.<init>(r15)
            android.widget.ArrayAdapter r0 = darkAdapter(r15, r0)
            r1.setAdapter(r0)
            int r0 = r14.size()
            r2 = 1
            int r0 = r0 - r2
            int r0 = java.lang.Math.min(r3, r0)
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r1.setSelection(r0, r2)
            r0 = 2
            android.widget.LinearLayout$LayoutParams r2 = matchWrapWithTopMargin(r15, r0)
            r6.addView(r1, r2)
            java.lang.String r0 = "Switch the active on-screen touch layout while the game is running. This keeps the same dialog design and only changes the selected layout."
            addSmallHint(r15, r6, r0)
            int r0 = r13.getMenuCursorSensitivity()
            java.lang.String r1 = "Menu cursor sensitivity"
            android.widget.TextView r0 = addSensitivityControl(r15, r6, r1, r0)
            int r2 = r13.getMenuCursorSensitivity()
            android.widget.SeekBar r20 = addSensitivitySeekBar(r15, r6, r2, r0, r1)
            int r0 = r13.getGameCameraSensitivity()
            java.lang.String r1 = "In-game camera sensitivity"
            android.widget.TextView r0 = addSensitivityControl(r15, r6, r1, r0)
            int r2 = r13.getGameCameraSensitivity()
            android.widget.SeekBar r21 = addSensitivitySeekBar(r15, r6, r2, r0, r1)
            java.lang.String r0 = "Hardware mouse DPI scale"
            int r1 = r13.getHardwareMouseDpiScale()
            android.widget.TextView r4 = addMouseDpiControl(r15, r6, r0, r1)
            int r3 = r13.getHardwareMouseDpiScale()
            java.lang.String r5 = "Hardware mouse DPI scale"
            r0 = r43
            r1 = r6
            r2 = r13
            android.widget.SeekBar r22 = addMouseDpiSeekBar(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "This updates live while the dialog is open, and only affects real mouse/captured-pointer movement, not touch camera swipes or absolute menu taps."
            addSmallHint(r15, r6, r0)
            java.lang.String r0 = "Game resolution scale"
            int r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r43)
            android.widget.TextView r3 = addResolutionScaleControl(r15, r6, r0, r1)
            int r2 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r43)
            java.lang.String r4 = "Game resolution scale"
            r0 = r43
            r1 = r6
            r5 = r44
            android.widget.SeekBar r23 = addResolutionScaleSeekBar(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "Lower this for better FPS, raise it for sharper rendering. This updates live while you drag so you can immediately judge image quality and performance."
            addSmallHint(r15, r6, r0)
            android.widget.LinearLayout r8 = addCard(r15, r8)
            java.lang.String r0 = "Hotbar touch hitbox"
            addCardTitle(r15, r8, r0)
            java.lang.String r0 = "Turn on the debug box to see the launcher hotbar touch area while in game. Auto match Minecraft follows Minecraft's current GUI scale when the hitbox is calculated. Use a manual value only if a specific version/device needs an override."
            addInfoText(r15, r8, r0)
            java.lang.String r0 = "Show hotbar hitbox debug box"
            r11 = r34
            android.widget.CheckBox r6 = addCheckBox(r15, r8, r0, r11)
            r24 = r6
            r0 = 8
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "Auto match Minecraft"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "2"
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "3"
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "4"
            r3 = 3
            r1[r3] = r2
            java.lang.String r2 = "5"
            r3 = 4
            r1[r3] = r2
            java.lang.String r2 = "6"
            r3 = 5
            r1[r3] = r2
            java.lang.String r2 = "7"
            r1[r18] = r2
            java.lang.String r2 = "8"
            r3 = 7
            r1[r3] = r2
            int[] r3 = new int[r0]
            r25 = r3
            r3 = {x04a6: FILL_ARRAY_DATA , data: [0, 2, 3, 4, 5, 6, 7, 8} // fill-array
            java.lang.String r0 = "Hotbar GUI scale"
            addPlainLabel(r15, r8, r0)
            android.widget.Spinner r5 = new android.widget.Spinner
            r26 = r5
            r5.<init>(r15)
            java.util.List r0 = java.util.Arrays.asList(r1)
            android.widget.ArrayAdapter r0 = darkAdapter(r15, r0)
            r5.setAdapter(r0)
            int r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarGuiScaleOverride(r43)
            int r0 = findGuiScaleIndex(r3, r0)
            r5.setSelection(r0)
            r0 = 2
            android.widget.LinearLayout$LayoutParams r0 = matchWrapWithTopMargin(r15, r0)
            r8.addView(r5, r0)
            r0 = 1
            boolean[] r1 = new boolean[r0]
            r0 = 0
            r1[r0] = r0
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$1 r4 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$1
            r0 = r4
            r2 = r43
            r16 = r6
            r6 = r4
            r4 = r5
            r11 = r5
            r5 = r44
            r0.<init>(r1, r2, r3, r4, r5)
            r11.setOnItemSelectedListener(r6)
            java.lang.String r0 = "Hitbox width GUI px"
            float r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarWidthGui(r43)
            android.widget.TextView r5 = addFloatControl(r15, r8, r0, r1)
            float r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarWidthGui(r43)
            java.lang.String r6 = "Hitbox width GUI px"
            r2 = 90
            r3 = 260(0x104, float:3.64E-43)
            r0 = r43
            r1 = r8
            r11 = r16
            android.widget.SeekBar r27 = addFloatSeekBar(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "Hitbox height GUI px"
            float r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarHeightGui(r43)
            android.widget.TextView r5 = addFloatControl(r15, r8, r0, r1)
            float r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarHeightGui(r43)
            java.lang.String r6 = "Hitbox height GUI px"
            r2 = 12
            r3 = 60
            r0 = r43
            r1 = r8
            android.widget.SeekBar r28 = addFloatSeekBar(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "X offset dp"
            float r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarXOffsetDp(r43)
            android.widget.TextView r5 = addFloatControl(r15, r8, r0, r1)
            float r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarXOffsetDp(r43)
            java.lang.String r6 = "X offset dp"
            r2 = -160(0xffffffffffffff60, float:NaN)
            r3 = 160(0xa0, float:2.24E-43)
            r0 = r43
            r1 = r8
            android.widget.SeekBar r29 = addFloatSeekBar(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "Y offset dp"
            float r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarYOffsetDp(r43)
            android.widget.TextView r5 = addFloatControl(r15, r8, r0, r1)
            float r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarYOffsetDp(r43)
            java.lang.String r6 = "Y offset dp"
            r2 = -80
            r0 = r43
            r1 = r8
            android.widget.SeekBar r30 = addFloatSeekBar(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "Vertical padding dp"
            float r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarVerticalPaddingDp(r43)
            android.widget.TextView r5 = addFloatControl(r15, r8, r0, r1)
            float r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getHotbarVerticalPaddingDp(r43)
            java.lang.String r6 = "Vertical padding dp"
            r2 = 0
            r3 = 80
            r0 = r43
            r1 = r8
            android.widget.SeekBar r31 = addFloatSeekBar(r0, r1, r2, r3, r4, r5, r6)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$2 r6 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$2
            r0 = r6
            r1 = r9
            r2 = r10
            r3 = r13
            r4 = r33
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r10.setOnItemSelectedListener(r6)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda6 r0 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda6
            r1 = r44
            r0.<init>(r15, r1)
            r11.setOnCheckedChangeListener(r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r15)
            r2 = r32
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setView(r2)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda7 r2 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda7
            r3 = r7
            r7 = r2
            r8 = r19
            r4 = r19
            r5 = r34
            r11 = r13
            r6 = r13
            r13 = r14
            r14 = r43
            r37 = r5
            r5 = r15
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r32 = r3
            r34 = r44
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.String r3 = "Save"
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r2)
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda8 r2 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda8
            r2.<init>(r4, r6, r5, r1)
            java.lang.String r3 = "Reset defaults"
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNeutralButton(r3, r2)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r3 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
            androidx.appcompat.app.AlertDialog r8 = r0.create()
            ca.dnamobile.javalauncher.input.GamepadMappingDialog.activeDialog = r8
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda9 r9 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda9
            r0 = r9
            r1 = r4
            r2 = r43
            r3 = r37
            r4 = r35
            r10 = r5
            r5 = r6
            r6 = r36
            r7 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.setOnDismissListener(r9)
            r8.show()
            styleDialogChrome(r10, r8)
            return
    }

    private static void showActionKeyboardDialog(android.app.Activity r4, java.lang.String r5, boolean r6, ca.dnamobile.javalauncher.input.GamepadAction r7, ca.dnamobile.javalauncher.input.GamepadMappingDialog.ActionPickCallback r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = -2147482607(0xffffffff80000411, float:-1.459E-42)
            r2 = 1067030938(0x3f99999a, float:1.2)
            java.lang.String r3 = "Cursor Up"
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r1 = ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.extraKey(r3, r1, r2)
            r0.add(r1)
            java.lang.String r1 = "Cursor Down"
            r2 = -2147482606(0xffffffff80000412, float:-1.46E-42)
            r3 = 1067869798(0x3fa66666, float:1.3)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r1 = ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.extraKey(r1, r2, r3)
            r0.add(r1)
            java.lang.String r1 = "Cursor Left"
            r2 = -2147482605(0xffffffff80000413, float:-1.462E-42)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r1 = ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.extraKey(r1, r2, r3)
            r0.add(r1)
            r1 = -2147482604(0xffffffff80000414, float:-1.463E-42)
            r2 = 1068289229(0x3faccccd, float:1.35)
            java.lang.String r3 = "Cursor Right"
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog$KeySpec r1 = ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.extraKey(r3, r1, r2)
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Pick key for "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r6 == 0) goto L57
            java.lang.String r6 = "Tap a key for in-game mode. Mouse actions are below. Current: "
            goto L59
        L57:
            java.lang.String r6 = "Tap a key for menu mode. Mouse/cursor actions are below. Current: "
        L59:
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda14 r7 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda14
            r7.<init>(r4, r8)
            ca.dnamobile.javalauncher.controls.TouchKeyPickerDialog.showPicker(r4, r5, r6, r0, r7)
            return
    }

    private static void showNumberInputDialog(android.app.Activity r7, java.lang.String r8, int r9, int r10, int r11, java.lang.String r12, ca.dnamobile.javalauncher.input.GamepadMappingDialog.NumberValueCallback r13) {
            android.widget.EditText r3 = new android.widget.EditText
            r3.<init>(r7)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r3.setText(r9)
            r9 = 1
            r3.setSelectAllOnFocus(r9)
            r3.setSingleLine(r9)
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_PRIMARY
            r3.setTextColor(r0)
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_MUTED
            r3.setHintTextColor(r0)
            r0 = 4098(0x1002, float:5.743E-42)
            r3.setInputType(r0)
            r0 = 16
            int r1 = dp(r7, r0)
            r2 = 10
            int r4 = dp(r7, r2)
            int r0 = dp(r7, r0)
            int r2 = dp(r7, r2)
            r3.setPadding(r1, r4, r0, r2)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r0.setOrientation(r9)
            r9 = 18
            int r9 = dp(r7, r9)
            r1 = 8
            int r2 = dp(r7, r1)
            r4 = 0
            r0.setPadding(r9, r2, r9, r4)
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Enter a value from "
            r2.<init>(r5)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r5 = " to "
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.StringBuilder r12 = r2.append(r12)
            java.lang.String r2 = "."
            java.lang.StringBuilder r12 = r12.append(r2)
            java.lang.String r12 = r12.toString()
            r9.setText(r12)
            r12 = 1095761920(0x41500000, float:13.0)
            r9.setTextSize(r12)
            int r12 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_SECONDARY
            r9.setTextColor(r12)
            int r12 = dp(r7, r1)
            r9.setPadding(r4, r4, r4, r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r12.<init>(r1, r2)
            r0.addView(r9, r12)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r1, r2)
            r0.addView(r3, r9)
            androidx.appcompat.app.AlertDialog$Builder r9 = new androidx.appcompat.app.AlertDialog$Builder
            r9.<init>(r7)
            androidx.appcompat.app.AlertDialog$Builder r8 = r9.setTitle(r8)
            androidx.appcompat.app.AlertDialog$Builder r8 = r8.setView(r0)
            java.lang.String r9 = "Apply"
            r12 = 0
            androidx.appcompat.app.AlertDialog$Builder r8 = r8.setPositiveButton(r9, r12)
            r9 = 17039360(0x1040000, float:2.424457E-38)
            androidx.appcompat.app.AlertDialog$Builder r8 = r8.setNegativeButton(r9, r12)
            androidx.appcompat.app.AlertDialog r8 = r8.create()
            ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda20 r9 = new ca.dnamobile.javalauncher.input.GamepadMappingDialog$$ExternalSyntheticLambda20
            r0 = r9
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.setOnShowListener(r9)
            r8.show()
            return
    }

    private static void styleDialogChrome(android.app.Activity r3, androidx.appcompat.app.AlertDialog r4) {
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L17
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_DIALOG_BG
            r2 = 22
            android.graphics.drawable.GradientDrawable r3 = roundedDrawable(r3, r1, r1, r2)
            r0.setBackgroundDrawable(r3)
            r3 = 1058306785(0x3f147ae1, float:0.58)
            r0.setDimAmount(r3)
        L17:
            r3 = -1
            tintDialogButton(r4, r3)
            r3 = -2
            tintDialogButton(r4, r3)
            r3 = -3
            tintDialogButton(r4, r3)
            return
    }

    private static void styleSpinnerText(android.view.View r3, boolean r4) {
            r0 = 0
            if (r4 == 0) goto L6
            int r4 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_BG_PRESSED
            goto L7
        L6:
            r4 = r0
        L7:
            r3.setBackgroundColor(r4)
            boolean r4 = r3 instanceof android.widget.TextView
            if (r4 == 0) goto L32
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_PRIMARY
            r3.setTextColor(r4)
            r4 = 1097859072(0x41700000, float:15.0)
            r3.setTextSize(r4)
            r3.setSingleLine(r0)
            int r4 = r3.getPaddingLeft()
            r0 = 8
            int r1 = dpFromView(r3, r0)
            int r2 = r3.getPaddingRight()
            int r0 = dpFromView(r3, r0)
            r3.setPadding(r4, r1, r2, r0)
        L32:
            return
    }

    private static android.widget.Button styledSmallButton(android.app.Activity r4, java.lang.String r5) {
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r4)
            r0.setText(r5)
            r5 = 0
            r0.setAllCaps(r5)
            r1 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r1)
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_ACCENT
            r0.setTextColor(r1)
            r0.setMinHeight(r5)
            r0.setMinimumHeight(r5)
            r5 = 10
            int r1 = dp(r4, r5)
            r2 = 6
            int r3 = dp(r4, r2)
            int r5 = dp(r4, r5)
            int r2 = dp(r4, r2)
            r0.setPadding(r1, r3, r5, r2)
            int r5 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_BG
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_ACCENT_MUTED
            r2 = 14
            android.graphics.drawable.GradientDrawable r4 = roundedDrawable(r4, r5, r1, r2)
            r0.setBackground(r4)
            return r0
    }

    private static void tintCheckBox(android.widget.CheckBox r3) {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            r1 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1}
            int[][] r0 = new int[][]{r0, r1}
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_ACCENT
            int r2 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_TEXT_MUTED
            int[] r1 = new int[]{r1, r2}
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r0, r1)
            r3.setButtonTintList(r2)
            return
    }

    private static void tintDialogButton(androidx.appcompat.app.AlertDialog r0, int r1) {
            android.widget.Button r0 = r0.getButton(r1)
            if (r0 == 0) goto Lb
            int r1 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_ACCENT
            r0.setTextColor(r1)
        Lb:
            return
    }

    private static void tintSeekBar(android.widget.SeekBar r2) {
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_ACCENT
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r0)
            r2.setThumbTintList(r1)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setProgressTintList(r0)
            int r0 = ca.dnamobile.javalauncher.input.GamepadMappingDialog.COLOR_CARD_STROKE
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setProgressBackgroundTintList(r0)
            return
    }
}
