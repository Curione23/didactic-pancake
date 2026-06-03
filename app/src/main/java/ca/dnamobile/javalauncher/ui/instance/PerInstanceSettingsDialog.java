package ca.dnamobile.javalauncher.ui.instance;

/* JADX INFO: loaded from: classes.dex */
public final class PerInstanceSettingsDialog {
    private final android.app.Activity activity;
    private final java.util.ArrayList<java.lang.String> aliasKeys;
    private com.google.android.material.switchmaterial.SwitchMaterial customRamSwitch;
    private androidx.appcompat.app.AlertDialog dialog;
    private com.google.android.material.textfield.TextInputEditText jvmArgsInput;
    private int maxRamMb;
    private int minRamMb;
    private final java.lang.Runnable onDismiss;
    private com.google.android.material.textfield.TextInputEditText ramInput;
    private com.google.android.material.textfield.TextInputLayout ramInputLayout;
    private android.widget.TextView ramRangeText;
    private com.google.android.material.slider.Slider ramSlider;
    private int ramStepMb;
    private android.widget.TextView ramSummary;
    private com.google.android.material.textfield.MaterialAutoCompleteTextView rendererDropdown;
    private final java.util.ArrayList<java.lang.String> rendererLabels;
    private final java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> renderers;
    private com.google.android.material.textfield.MaterialAutoCompleteTextView runtimeDropdown;
    private int selectedRamMb;
    private int selectedRendererIndex;
    private int selectedRuntimeIndex;
    private final java.lang.String settingsKey;
    private int sliderMaxRamMb;
    private boolean updatingRamText;

    /* JADX INFO: renamed from: $r8$lambda$2AmKdVJr_EHRVMT5dIZcF-a9n6I, reason: not valid java name */
    public static /* synthetic */ void m579$r8$lambda$2AmKdVJr_EHRVMT5dIZcFa9n6I(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.view.View r1) {
            r0.lambda$createRuntimeSection$4(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$5-NB5YD9pWsNU2jIppFLIAKxcr0, reason: not valid java name */
    public static /* synthetic */ void m580$r8$lambda$5NB5YD9pWsNU2jIppFLIAKxcr0(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.view.View r1) {
            r0.lambda$createActionsSection$12(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$6EkRk01iuJODxIj0XFsW9kLXuQI(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, com.google.android.material.slider.Slider r1, float r2, boolean r3) {
            r0.lambda$createRamSection$10(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$7cyYo5gjvlz3xOeK-84fa1gj3G4, reason: not valid java name */
    public static /* synthetic */ void m581$r8$lambda$7cyYo5gjvlz3xOeK84fa1gj3G4(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.content.DialogInterface r1) {
            r0.lambda$show$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$LEJ9LcdfzMf0qlxvSIrA8R0o8jw(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.view.View r1) {
            r0.lambda$createActionsSection$14(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$LbL3XV4hqXzMdEiuDHFpUWjsfPs(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.lambda$createRendererSection$3(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$c-Gn2vKuIDdnZvqdYQ-R3Dtth2A, reason: not valid java name */
    public static /* synthetic */ void m582$r8$lambda$cGn2vKuIDdnZvqdYQR3Dtth2A(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.view.View r1) {
            r0.lambda$createActionsSection$13(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$eN3FtYJD2qWB8ZqkCM3MNSaPw9c(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.widget.CompoundButton r1, boolean r2) {
            r0.lambda$createRamSection$11(r1, r2)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$fHph5JwZejHti-YemU7GbEGgVSQ, reason: not valid java name */
    public static /* synthetic */ boolean m583$r8$lambda$fHph5JwZejHtiYemU7GbEGgVSQ(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = r0.lambda$createRamSection$7(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$jXK2Qzft_5WwxMLllQyiO2pwXN0(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, java.lang.String[] r1, android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
            r0.lambda$createRuntimeSection$5(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$qftLljX8IDyaMy2b7mEDqQXWPSY(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.view.View r1, boolean r2) {
            r0.lambda$createRamSection$6(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$ut0vaCsPNLBEHsEPlgdVn9QiTgI(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.content.DialogInterface r1) {
            r0.lambda$show$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$zPXakciKM2m6dxhKkuXj6Jgjgfo(ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog r0, android.view.View r1) {
            r0.lambda$createRendererSection$2(r1)
            return
    }

    public PerInstanceSettingsDialog(android.app.Activity r2, java.lang.String r3, java.util.List<java.lang.String> r4, java.lang.Runnable r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.renderers = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.rendererLabels = r0
            r1.activity = r2
            r1.settingsKey = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.aliasKeys = r2
            r1.addAlias(r3)
            if (r4 == 0) goto L35
            java.util.Iterator r2 = r4.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.addAlias(r3)
            goto L25
        L35:
            r1.onDismiss = r5
            return
    }

    private void addAlias(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.String r2 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.resolveInstanceKey(r2, r2)
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            return
        L12:
            java.util.ArrayList<java.lang.String> r0 = r1.aliasKeys
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1f
            java.util.ArrayList<java.lang.String> r0 = r1.aliasKeys
            r0.add(r2)
        L1f:
            return
    }

    private void addSectionTitle(android.widget.LinearLayout r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r1 = r2.activity
            r0.<init>(r1)
            r0.setText(r4)
            android.graphics.Typeface r4 = r0.getTypeface()
            r1 = 1
            r0.setTypeface(r4, r1)
            r4 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r4)
            android.widget.LinearLayout$LayoutParams r4 = r2.matchWrap()
            r3.addView(r0, r4)
            android.widget.TextView r4 = new android.widget.TextView
            android.app.Activity r0 = r2.activity
            r4.<init>(r0)
            r4.setText(r5)
            r5 = 1094713344(0x41400000, float:12.0)
            r4.setTextSize(r5)
            r5 = 2
            int r5 = r2.dp(r5)
            r0 = 8
            int r0 = r2.dp(r0)
            r1 = 0
            r4.setPadding(r1, r5, r1, r0)
            android.widget.LinearLayout$LayoutParams r5 = r2.matchWrap()
            r3.addView(r4, r5)
            return
    }

    private void applyTypedRamValue() {
            r2 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r2.ramInput
            if (r0 == 0) goto L58
            android.text.Editable r0 = r0.getText()
            if (r0 != 0) goto Lb
            goto L58
        Lb:
            com.google.android.material.textfield.TextInputEditText r0 = r2.ramInput
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L28
            android.app.Activity r0 = r2.activity
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r0)
            r2.selectedRamMb = r0
            goto L37
        L28:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L2f
            r2.selectedRamMb = r0     // Catch: java.lang.Throwable -> L2f
            goto L37
        L2f:
            android.app.Activity r0 = r2.activity
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r0)
            r2.selectedRamMb = r0
        L37:
            int r0 = r2.selectedRamMb
            int r0 = r2.clampRamToSliderRange(r0)
            r2.selectedRamMb = r0
            com.google.android.material.slider.Slider r0 = r2.ramSlider
            if (r0 == 0) goto L55
            float r0 = r0.getValue()
            int r0 = java.lang.Math.round(r0)
            int r1 = r2.selectedRamMb
            if (r0 == r1) goto L55
            com.google.android.material.slider.Slider r0 = r2.ramSlider
            float r1 = (float) r1
            r0.setValue(r1)
        L55:
            r2.updateRamViews()
        L58:
            return
    }

    private int calculateMaxFormHeight() {
            r4 = this;
            android.app.Activity r0 = r4.activity
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            r1 = 440(0x1b8, float:6.17E-43)
            int r1 = r4.dp(r1)
            r2 = 250(0xfa, float:3.5E-43)
            int r2 = r4.dp(r2)
            r3 = 310(0x136, float:4.34E-43)
            int r3 = r4.dp(r3)
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    private int clampRamToSliderRange(int r3) {
            r2 = this;
            android.app.Activity r0 = r2.activity
            int r3 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r0, r3)
            int r0 = r2.minRamMb
            int r1 = r2.sliderMaxRamMb
            int r3 = java.lang.Math.min(r1, r3)
            int r3 = java.lang.Math.max(r0, r3)
            int r0 = r2.minRamMb
            int r3 = r3 - r0
            float r3 = (float) r3
            int r0 = r2.ramStepMb
            float r0 = (float) r0
            float r3 = r3 / r0
            int r3 = java.lang.Math.round(r3)
            int r0 = r2.minRamMb
            int r1 = r2.ramStepMb
            int r3 = r3 * r1
            int r3 = r3 + r0
            int r1 = r2.sliderMaxRamMb
            int r3 = java.lang.Math.min(r1, r3)
            int r3 = java.lang.Math.max(r0, r3)
            return r3
    }

    private void clearAllAliases() {
            r3 = this;
            java.util.ArrayList<java.lang.String> r0 = r3.aliasKeys
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            android.app.Activity r2 = r3.activity
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.clear(r2, r1)
            goto L6
        L18:
            return
    }

    private android.view.View createActionsSection() {
            r8 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.app.Activity r1 = r8.activity
            r0.<init>(r1)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 8388629(0x800015, float:1.1754973E-38)
            r0.setGravity(r2)
            r2 = 12
            int r2 = r8.dp(r2)
            r0.setPadding(r1, r2, r1, r1)
            com.google.android.material.button.MaterialButton r2 = new com.google.android.material.button.MaterialButton
            android.app.Activity r3 = r8.activity
            int r4 = com.google.android.material.R.attr.materialButtonOutlinedStyle
            r5 = 0
            r2.<init>(r3, r5, r4)
            java.lang.String r3 = "Reset"
            r2.setText(r3)
            r2.setAllCaps(r1)
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda7 r3 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda7
            r3.<init>(r8)
            r2.setOnClickListener(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r6 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r1, r4, r6)
            r0.addView(r2, r3)
            com.google.android.material.button.MaterialButton r2 = new com.google.android.material.button.MaterialButton
            android.app.Activity r3 = r8.activity
            int r7 = com.google.android.material.R.attr.materialButtonOutlinedStyle
            r2.<init>(r3, r5, r7)
            r3 = 17039360(0x1040000, float:2.424457E-38)
            r2.setText(r3)
            r2.setAllCaps(r1)
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda8 r3 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda8
            r3.<init>(r8)
            r2.setOnClickListener(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r1, r4, r6)
            r5 = 8
            int r7 = r8.dp(r5)
            r3.setMargins(r7, r1, r1, r1)
            r0.addView(r2, r3)
            com.google.android.material.button.MaterialButton r2 = new com.google.android.material.button.MaterialButton
            android.app.Activity r3 = r8.activity
            r2.<init>(r3)
            java.lang.String r3 = "Save"
            r2.setText(r3)
            r2.setAllCaps(r1)
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda9 r3 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda9
            r3.<init>(r8)
            r2.setOnClickListener(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r1, r4, r6)
            int r4 = r8.dp(r5)
            r3.setMargins(r4, r1, r1, r1)
            r0.addView(r2, r3)
            return r0
    }

    private com.google.android.material.textfield.TextInputLayout createDropdownLayout(java.lang.String r2) {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r2 = r1.createOutlinedLayout(r2)
            r0 = 3
            r2.setEndIconMode(r0)
            return r2
    }

    private android.view.View createHeader() {
            r8 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.app.Activity r1 = r8.activity
            r0.<init>(r1)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            int r3 = r8.dp(r2)
            r0.setPadding(r1, r1, r1, r3)
            android.widget.ImageView r3 = new android.widget.ImageView
            android.app.Activity r4 = r8.activity
            r3.<init>(r4)
            int r4 = ca.dnamobile.javalauncher.R.mipmap.ic_launcher
            r3.setImageResource(r4)
            r4 = 12
            int r5 = r8.dp(r4)
            int r6 = r8.dp(r4)
            int r7 = r8.dp(r4)
            int r4 = r8.dp(r4)
            r3.setPadding(r5, r6, r7, r4)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r5 = 18
            int r5 = r8.dp(r5)
            float r5 = (float) r5
            r4.setCornerRadius(r5)
            r5 = -14670805(0xffffffffff20242b, float:-2.1286427E38)
            r4.setColor(r5)
            r3.setBackground(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 72
            int r6 = r8.dp(r5)
            int r5 = r8.dp(r5)
            r4.<init>(r6, r5)
            r0.addView(r3, r4)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.app.Activity r4 = r8.activity
            r3.<init>(r4)
            r4 = 1
            r3.setOrientation(r4)
            int r2 = r8.dp(r2)
            r3.setPadding(r2, r1, r1, r1)
            android.widget.TextView r2 = new android.widget.TextView
            android.app.Activity r5 = r8.activity
            r2.<init>(r5)
            java.lang.String r5 = "Per Instance Settings"
            r2.setText(r5)
            r5 = 1102053376(0x41b00000, float:22.0)
            r2.setTextSize(r5)
            android.graphics.Typeface r5 = r2.getTypeface()
            r2.setTypeface(r5, r4)
            android.widget.LinearLayout$LayoutParams r4 = r8.matchWrap()
            r3.addView(r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            android.app.Activity r4 = r8.activity
            r2.<init>(r4)
            java.lang.String r4 = "Renderer, Java runtime, JVM arguments, and RAM for this instance only."
            r2.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r4)
            r4 = 4
            int r4 = r8.dp(r4)
            r2.setPadding(r1, r4, r1, r1)
            android.widget.LinearLayout$LayoutParams r4 = r8.matchWrap()
            r3.addView(r2, r4)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r1, r4, r5)
            r0.addView(r3, r2)
            return r0
    }

    private android.view.View createJvmArgsSection(ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r5) {
            r4 = this;
            android.widget.LinearLayout r0 = r4.createSection()
            java.lang.String r1 = "Optional extra JVM flags. Memory and classpath flags are ignored by the launcher."
            java.lang.String r2 = "Custom JVM arguments"
            r4.addSectionTitle(r0, r2, r1)
            com.google.android.material.textfield.TextInputEditText r1 = new com.google.android.material.textfield.TextInputEditText
            android.app.Activity r3 = r4.activity
            r1.<init>(r3)
            r4.jvmArgsInput = r1
            r3 = 0
            r1.setSingleLine(r3)
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            r3 = 2
            r1.setMinLines(r3)
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            r3 = 4
            r1.setMaxLines(r3)
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r1.setGravity(r3)
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            r3 = 655361(0xa0001, float:9.18356E-40)
            r1.setInputType(r3)
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            java.lang.String r3 = "-Dexample=true"
            r1.setHint(r3)
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            java.lang.String r3 = r5.customJvmArgs
            if (r3 != 0) goto L44
            java.lang.String r5 = ""
            goto L46
        L44:
            java.lang.String r5 = r5.customJvmArgs
        L46:
            r1.setText(r5)
            com.google.android.material.textfield.TextInputLayout r5 = r4.createOutlinedLayout(r2)
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            android.widget.LinearLayout$LayoutParams r2 = r4.matchWrap()
            r5.addView(r1, r2)
            android.widget.LinearLayout$LayoutParams r1 = r4.matchWrap()
            r0.addView(r5, r1)
            return r0
    }

    private com.google.android.material.textfield.TextInputLayout createOutlinedLayout(java.lang.String r5) {
            r4 = this;
            com.google.android.material.textfield.TextInputLayout r0 = new com.google.android.material.textfield.TextInputLayout
            android.app.Activity r1 = r4.activity
            r0.<init>(r1)
            r0.setHint(r5)
            r5 = 2
            r0.setBoxBackgroundMode(r5)
            r5 = 14
            int r1 = r4.dp(r5)
            float r1 = (float) r1
            int r2 = r4.dp(r5)
            float r2 = (float) r2
            int r3 = r4.dp(r5)
            float r3 = (float) r3
            int r5 = r4.dp(r5)
            float r5 = (float) r5
            r0.setBoxCornerRadii(r1, r2, r3, r5)
            return r0
    }

    private android.view.View createRamSection(ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r5) {
            r4 = this;
            android.widget.LinearLayout r0 = r4.createSection()
            java.lang.String r1 = "RAM"
            java.lang.String r2 = "Leave disabled to use the launcher-wide RAM value."
            r4.addSectionTitle(r0, r1, r2)
            com.google.android.material.switchmaterial.SwitchMaterial r1 = new com.google.android.material.switchmaterial.SwitchMaterial
            android.app.Activity r2 = r4.activity
            r1.<init>(r2)
            r4.customRamSwitch = r1
            java.lang.String r2 = "Use custom RAM for this instance"
            r1.setText(r2)
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r4.customRamSwitch
            boolean r5 = r5.hasRamOverride()
            r1.setChecked(r5)
            com.google.android.material.switchmaterial.SwitchMaterial r5 = r4.customRamSwitch
            android.widget.LinearLayout$LayoutParams r1 = r4.matchWrap()
            r0.addView(r5, r1)
            com.google.android.material.textfield.TextInputEditText r5 = new com.google.android.material.textfield.TextInputEditText
            android.app.Activity r1 = r4.activity
            r5.<init>(r1)
            r4.ramInput = r5
            r1 = 1
            r5.setSingleLine(r1)
            com.google.android.material.textfield.TextInputEditText r5 = r4.ramInput
            r2 = 2
            r5.setInputType(r2)
            com.google.android.material.textfield.TextInputEditText r5 = r4.ramInput
            r5.setSelectAllOnFocus(r1)
            com.google.android.material.textfield.TextInputEditText r5 = r4.ramInput
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda14 r1 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda14
            r1.<init>(r4)
            r5.setOnFocusChangeListener(r1)
            com.google.android.material.textfield.TextInputEditText r5 = r4.ramInput
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda1
            r1.<init>(r4)
            r5.setOnEditorActionListener(r1)
            java.lang.String r5 = "RAM in MB"
            com.google.android.material.textfield.TextInputLayout r5 = r4.createOutlinedLayout(r5)
            r4.ramInputLayout = r5
            com.google.android.material.textfield.TextInputEditText r1 = r4.ramInput
            android.widget.LinearLayout$LayoutParams r2 = r4.matchWrap()
            r5.addView(r1, r2)
            android.widget.LinearLayout$LayoutParams r5 = r4.matchWrap()
            r1 = 8
            int r2 = r4.dp(r1)
            r3 = 0
            r5.setMargins(r3, r2, r3, r3)
            com.google.android.material.textfield.TextInputLayout r2 = r4.ramInputLayout
            r0.addView(r2, r5)
            com.google.android.material.slider.Slider r5 = new com.google.android.material.slider.Slider
            android.app.Activity r2 = r4.activity
            r5.<init>(r2)
            r4.ramSlider = r5
            int r2 = r4.minRamMb
            float r2 = (float) r2
            r5.setValueFrom(r2)
            com.google.android.material.slider.Slider r5 = r4.ramSlider
            int r2 = r4.sliderMaxRamMb
            float r2 = (float) r2
            r5.setValueTo(r2)
            com.google.android.material.slider.Slider r5 = r4.ramSlider
            int r2 = r4.ramStepMb
            float r2 = (float) r2
            r5.setStepSize(r2)
            com.google.android.material.slider.Slider r5 = r4.ramSlider
            int r2 = r4.selectedRamMb
            int r2 = r4.clampRamToSliderRange(r2)
            float r2 = (float) r2
            r5.setValue(r2)
            com.google.android.material.slider.Slider r5 = r4.ramSlider
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda2 r2 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda2
            r2.<init>()
            r5.setLabelFormatter(r2)
            com.google.android.material.slider.Slider r5 = r4.ramSlider
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda3 r2 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda3
            r2.<init>()
            r5.setOnTouchListener(r2)
            com.google.android.material.slider.Slider r5 = r4.ramSlider
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda4 r2 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda4
            r2.<init>(r4)
            r5.addOnChangeListener(r2)
            android.widget.LinearLayout$LayoutParams r5 = r4.matchWrap()
            int r1 = r4.dp(r1)
            r5.setMargins(r3, r1, r3, r3)
            com.google.android.material.slider.Slider r1 = r4.ramSlider
            r0.addView(r1, r5)
            android.widget.TextView r5 = new android.widget.TextView
            android.app.Activity r1 = r4.activity
            r5.<init>(r1)
            r4.ramSummary = r5
            r1 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r1)
            android.widget.TextView r5 = r4.ramSummary
            r1 = 4
            int r2 = r4.dp(r1)
            r5.setPadding(r3, r2, r3, r3)
            android.widget.TextView r5 = r4.ramSummary
            android.widget.LinearLayout$LayoutParams r2 = r4.matchWrap()
            r0.addView(r5, r2)
            android.widget.TextView r5 = new android.widget.TextView
            android.app.Activity r2 = r4.activity
            r5.<init>(r2)
            r4.ramRangeText = r5
            r2 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r2)
            android.widget.TextView r5 = r4.ramRangeText
            int r1 = r4.dp(r1)
            r5.setPadding(r3, r1, r3, r3)
            android.widget.TextView r5 = r4.ramRangeText
            android.widget.LinearLayout$LayoutParams r1 = r4.matchWrap()
            r0.addView(r5, r1)
            com.google.android.material.switchmaterial.SwitchMaterial r5 = r4.customRamSwitch
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda5 r1 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda5
            r1.<init>(r4)
            r5.setOnCheckedChangeListener(r1)
            r4.updateRamViews()
            return r0
    }

    private android.view.View createRendererSection(ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r9) {
            r8 = this;
            android.widget.LinearLayout r0 = r8.createSection()
            java.lang.String r1 = "Use a specific renderer for this instance, or keep the launcher default."
            java.lang.String r2 = "Renderer"
            r8.addSectionTitle(r0, r2, r1)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = new com.google.android.material.textfield.MaterialAutoCompleteTextView
            android.app.Activity r3 = r8.activity
            r1.<init>(r3)
            r8.rendererDropdown = r1
            r3 = 0
            r1.setInputType(r3)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r8.rendererDropdown
            r4 = 1
            r1.setSingleLine(r4)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r8.rendererDropdown
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda10 r4 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda10
            r4.<init>(r8)
            r1.setOnClickListener(r4)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r8.rendererDropdown
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            android.app.Activity r5 = r8.activity
            r6 = 17367043(0x1090003, float:2.5162934E-38)
            java.util.ArrayList<java.lang.String> r7 = r8.rendererLabels
            r4.<init>(r5, r6, r7)
            r1.setAdapter(r4)
            java.lang.String r9 = r9.rendererIdentifier
            int r9 = r8.resolveRendererSelectionIndex(r9)
            r8.selectedRendererIndex = r9
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r8.rendererDropdown
            java.util.ArrayList<java.lang.String> r4 = r8.rendererLabels
            java.lang.Object r9 = r4.get(r9)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r1.setText(r9, r3)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r9 = r8.rendererDropdown
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda11 r1 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda11
            r1.<init>(r8)
            r9.setOnItemClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r9 = r8.createDropdownLayout(r2)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r8.rendererDropdown
            android.widget.LinearLayout$LayoutParams r2 = r8.matchWrap()
            r9.addView(r1, r2)
            android.widget.LinearLayout$LayoutParams r1 = r8.matchWrap()
            r0.addView(r9, r1)
            return r0
    }

    private android.view.View createRuntimeSection(ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r9) {
            r8 = this;
            android.widget.LinearLayout r0 = r8.createSection()
            java.lang.String r1 = "Default automatically picks the runtime for the Minecraft version."
            java.lang.String r2 = "Java runtime"
            r8.addSectionTitle(r0, r2, r1)
            java.lang.String[] r1 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.getRuntimeDisplayLabels()
            com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = new com.google.android.material.textfield.MaterialAutoCompleteTextView
            android.app.Activity r4 = r8.activity
            r3.<init>(r4)
            r8.runtimeDropdown = r3
            r4 = 0
            r3.setInputType(r4)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r8.runtimeDropdown
            r5 = 1
            r3.setSingleLine(r5)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r8.runtimeDropdown
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda12 r5 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda12
            r5.<init>(r8)
            r3.setOnClickListener(r5)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r8.runtimeDropdown
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            android.app.Activity r6 = r8.activity
            r7 = 17367043(0x1090003, float:2.5162934E-38)
            r5.<init>(r6, r7, r1)
            r3.setAdapter(r5)
            java.lang.String r9 = r9.runtimeName
            int r9 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.runtimeIndexForName(r9)
            r8.selectedRuntimeIndex = r9
            if (r9 < 0) goto L48
            int r3 = r1.length
            if (r9 < r3) goto L4a
        L48:
            r8.selectedRuntimeIndex = r4
        L4a:
            com.google.android.material.textfield.MaterialAutoCompleteTextView r9 = r8.runtimeDropdown
            int r3 = r8.selectedRuntimeIndex
            r3 = r1[r3]
            r9.setText(r3, r4)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r9 = r8.runtimeDropdown
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda13 r3 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda13
            r3.<init>(r8, r1)
            r9.setOnItemClickListener(r3)
            com.google.android.material.textfield.TextInputLayout r9 = r8.createDropdownLayout(r2)
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r8.runtimeDropdown
            android.widget.LinearLayout$LayoutParams r2 = r8.matchWrap()
            r9.addView(r1, r2)
            android.widget.LinearLayout$LayoutParams r1 = r8.matchWrap()
            r0.addView(r9, r1)
            return r0
    }

    private android.widget.LinearLayout createSection() {
            r4 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.app.Activity r1 = r4.activity
            r0.<init>(r1)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 8
            int r1 = r4.dp(r1)
            r2 = 10
            int r2 = r4.dp(r2)
            r3 = 0
            r0.setPadding(r3, r1, r3, r2)
            return r0
    }

    private void dismiss() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.dialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    private int dp(int r2) {
            r1 = this;
            float r2 = (float) r2
            android.app.Activity r0 = r1.activity
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    private java.lang.String formatGb(int r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            float r3 = (float) r3
            r1 = 1149239296(0x44800000, float:1024.0)
            float r3 = r3 / r1
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r1 = "%.1f"
            java.lang.String r3 = java.lang.String.format(r0, r1, r3)
            return r3
    }

    private /* synthetic */ void lambda$createActionsSection$12(android.view.View r3) {
            r2 = this;
            r2.clearAllAliases()
            android.app.Activity r3 = r2.activity
            java.lang.String r0 = "Per-instance settings reset."
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
            r3.show()
            r2.dismiss()
            return
    }

    private /* synthetic */ void lambda$createActionsSection$13(android.view.View r1) {
            r0 = this;
            r0.dismiss()
            return
    }

    private /* synthetic */ void lambda$createActionsSection$14(android.view.View r1) {
            r0 = this;
            r0.saveAndDismiss()
            return
    }

    private /* synthetic */ void lambda$createRamSection$10(com.google.android.material.slider.Slider r1, float r2, boolean r3) {
            r0 = this;
            int r1 = java.lang.Math.round(r2)
            r0.selectedRamMb = r1
            r0.updateRamViews()
            return
    }

    private /* synthetic */ void lambda$createRamSection$11(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            r0.updateRamViews()
            return
    }

    private /* synthetic */ void lambda$createRamSection$6(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.applyTypedRamValue()
        L5:
            return
    }

    private /* synthetic */ boolean lambda$createRamSection$7(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            r0.applyTypedRamValue()
            r1 = 0
            return r1
    }

    static /* synthetic */ java.lang.String lambda$createRamSection$8(float r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = java.lang.Math.round(r1)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = " MB"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    static /* synthetic */ boolean lambda$createRamSection$9(android.view.View r3, android.view.MotionEvent r4) {
            int r0 = r4.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            android.view.ViewParent r3 = r3.getParent()
            r3.requestDisallowInterceptTouchEvent(r2)
            goto L24
        L10:
            int r0 = r4.getActionMasked()
            if (r0 == r2) goto L1d
            int r4 = r4.getActionMasked()
            r0 = 3
            if (r4 != r0) goto L24
        L1d:
            android.view.ViewParent r3 = r3.getParent()
            r3.requestDisallowInterceptTouchEvent(r1)
        L24:
            return r1
    }

    private /* synthetic */ void lambda$createRendererSection$2(android.view.View r1) {
            r0 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r0.rendererDropdown
            r1.showDropDown()
            return
    }

    private /* synthetic */ void lambda$createRendererSection$3(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            java.util.ArrayList<java.lang.String> r1 = r0.rendererLabels
            int r1 = r1.size()
            int r1 = r1 + (-1)
            int r1 = java.lang.Math.min(r3, r1)
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r0.selectedRendererIndex = r1
            com.google.android.material.textfield.MaterialAutoCompleteTextView r3 = r0.rendererDropdown
            java.util.ArrayList<java.lang.String> r4 = r0.rendererLabels
            java.lang.Object r1 = r4.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.setText(r1, r2)
            return
    }

    private /* synthetic */ void lambda$createRuntimeSection$4(android.view.View r1) {
            r0 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r0.runtimeDropdown
            r1.showDropDown()
            return
    }

    private /* synthetic */ void lambda$createRuntimeSection$5(java.lang.String[] r1, android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
            r0 = this;
            int r2 = r1.length
            int r2 = r2 + (-1)
            int r2 = java.lang.Math.min(r4, r2)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            r0.selectedRuntimeIndex = r2
            com.google.android.material.textfield.MaterialAutoCompleteTextView r4 = r0.runtimeDropdown
            r1 = r1[r2]
            r4.setText(r1, r3)
            return
    }

    private /* synthetic */ void lambda$show$0(android.content.DialogInterface r5) {
            r4 = this;
            androidx.appcompat.app.AlertDialog r5 = r4.dialog
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L5f
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r5.setBackgroundDrawableResource(r0)
            android.app.Activity r0 = r4.activity
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.app.Activity r1 = r4.activity
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            r2 = 24
            int r3 = r4.dp(r2)
            int r0 = r0 - r3
            r3 = 760(0x2f8, float:1.065E-42)
            int r3 = r4.dp(r3)
            int r0 = java.lang.Math.min(r0, r3)
            int r2 = r4.dp(r2)
            int r2 = r1 - r2
            r3 = 260(0x104, float:3.64E-43)
            int r3 = r4.dp(r3)
            if (r2 >= r3) goto L4d
            r2 = 8
            int r2 = r4.dp(r2)
            int r2 = r1 - r2
        L4d:
            r1 = 1
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 640(0x280, float:8.97E-43)
            int r2 = r4.dp(r2)
            int r1 = java.lang.Math.min(r1, r2)
            r5.setLayout(r0, r1)
        L5f:
            return
    }

    private /* synthetic */ void lambda$show$1(android.content.DialogInterface r1) {
            r0 = this;
            java.lang.Runnable r1 = r0.onDismiss
            if (r1 == 0) goto L7
            r1.run()
        L7:
            return
    }

    private android.widget.LinearLayout.LayoutParams matchWrap() {
            r3 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    private void prepareRamBounds(ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r5) {
            r4 = this;
            android.app.Activity r0 = r4.activity
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMaxAllocatableMemoryMb(r0)
            r4.maxRamMb = r0
            int r0 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.getMinimumMemoryMb(r0)
            r4.minRamMb = r0
            r0 = 256(0x100, float:3.59E-43)
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            r4.ramStepMb = r0
            int r2 = r4.maxRamMb
            int r3 = r4.minRamMb
            int r2 = r2 - r3
            int r2 = r2 / r0
            int r0 = java.lang.Math.max(r1, r2)
            int r1 = r4.minRamMb
            int r2 = r4.ramStepMb
            int r0 = r0 * r2
            int r1 = r1 + r0
            r4.sliderMaxRamMb = r1
            boolean r0 = r5.hasRamOverride()
            if (r0 == 0) goto L32
            int r5 = r5.ramMb
            goto L38
        L32:
            android.app.Activity r5 = r4.activity
            int r5 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r5)
        L38:
            r4.selectedRamMb = r5
            int r5 = r4.clampRamToSliderRange(r5)
            r4.selectedRamMb = r5
            return
    }

    private void prepareRendererChoices(ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r6) {
            r5 = this;
            android.app.Activity r6 = r5.activity
            ca.dnamobile.javalauncher.renderer.Renderers.reload(r6)
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> r6 = r5.renderers
            r6.clear()
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> r6 = r5.renderers
            android.app.Activity r0 = r5.activity
            java.util.List r0 = ca.dnamobile.javalauncher.renderer.Renderers.getCompatibleRenderers(r0)
            r6.addAll(r0)
            java.util.ArrayList<java.lang.String> r6 = r5.rendererLabels
            r6.clear()
            java.util.ArrayList<java.lang.String> r6 = r5.rendererLabels
            java.lang.String r0 = "Default launcher renderer"
            r6.add(r0)
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> r6 = r5.renderers
            java.util.Iterator r6 = r6.iterator()
        L27:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r6.next()
            ca.dnamobile.javalauncher.renderer.RendererInterface r1 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r1
            java.util.ArrayList<java.lang.String> r2 = r5.rendererLabels
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.getRendererName()
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r1 = r1.isExternalPlugin()
            if (r1 == 0) goto L4b
            java.lang.String r1 = "  •  Plugin"
            goto L4d
        L4b:
            java.lang.String r1 = ""
        L4d:
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.add(r1)
            goto L27
        L59:
            java.util.ArrayList<java.lang.String> r6 = r5.rendererLabels
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L66
            java.util.ArrayList<java.lang.String> r6 = r5.rendererLabels
            r6.add(r0)
        L66:
            return
    }

    private int resolveRendererSelectionIndex(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2f
            java.lang.String r1 = r4.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Le
            goto L2f
        Le:
            r1 = r0
        Lf:
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> r2 = r3.renderers
            int r2 = r2.size()
            if (r1 >= r2) goto L2f
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> r2 = r3.renderers
            java.lang.Object r2 = r2.get(r1)
            ca.dnamobile.javalauncher.renderer.RendererInterface r2 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r2
            java.lang.String r2 = r2.getUniqueIdentifier()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L2c
            int r1 = r1 + 1
            return r1
        L2c:
            int r1 = r1 + 1
            goto Lf
        L2f:
            return r0
    }

    private void saveAllAliases(ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r4) {
            r3 = this;
            java.util.ArrayList<java.lang.String> r0 = r3.aliasKeys
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            android.app.Activity r2 = r3.activity
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.save(r2, r1, r4)
            goto L6
        L18:
            return
    }

    private void saveAndDismiss() {
            r4 = this;
            android.app.Activity r0 = r4.activity
            java.lang.String r1 = r4.settingsKey
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings$Settings r0 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.load(r0, r1)
            int r1 = r4.selectedRendererIndex
            java.lang.String r2 = ""
            if (r1 <= 0) goto L2b
            int r1 = r1 + (-1)
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> r3 = r4.renderers
            int r3 = r3.size()
            if (r1 >= r3) goto L2b
            java.util.ArrayList<ca.dnamobile.javalauncher.renderer.RendererInterface> r1 = r4.renderers
            int r3 = r4.selectedRendererIndex
            int r3 = r3 + (-1)
            java.lang.Object r1 = r1.get(r3)
            ca.dnamobile.javalauncher.renderer.RendererInterface r1 = (ca.dnamobile.javalauncher.renderer.RendererInterface) r1
            java.lang.String r1 = r1.getUniqueIdentifier()
            r0.rendererIdentifier = r1
            goto L2d
        L2b:
            r0.rendererIdentifier = r2
        L2d:
            int r1 = r4.selectedRuntimeIndex
            java.lang.String r1 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.runtimeNameForIndex(r1)
            r0.runtimeName = r1
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            if (r1 == 0) goto L4d
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L4d
            com.google.android.material.textfield.TextInputEditText r1 = r4.jvmArgsInput
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r1.trim()
        L4d:
            r0.customJvmArgs = r2
            com.google.android.material.switchmaterial.SwitchMaterial r1 = r4.customRamSwitch
            if (r1 == 0) goto L65
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L65
            r4.applyTypedRamValue()
            int r1 = r4.selectedRamMb
            int r1 = r4.clampRamToSliderRange(r1)
            r0.ramMb = r1
            goto L68
        L65:
            r1 = -1
            r0.ramMb = r1
        L68:
            r4.saveAllAliases(r0)
            android.app.Activity r0 = r4.activity
            java.lang.String r1 = "Per-instance settings saved."
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            r4.dismiss()
            return
    }

    private void setRamInputText(int r2) {
            r1 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r1.ramInput
            if (r0 == 0) goto L3d
            boolean r0 = r1.updatingRamText
            if (r0 == 0) goto L9
            goto L3d
        L9:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r1.ramInput
            android.text.Editable r0 = r0.getText()
            if (r0 != 0) goto L18
            java.lang.String r0 = ""
            goto L22
        L18:
            com.google.android.material.textfield.TextInputEditText r0 = r1.ramInput
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
        L22:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L29
            return
        L29:
            r0 = 1
            r1.updatingRamText = r0
            com.google.android.material.textfield.TextInputEditText r0 = r1.ramInput
            r0.setText(r2)
            com.google.android.material.textfield.TextInputEditText r2 = r1.ramInput
            int r0 = r2.length()
            r2.setSelection(r0)
            r2 = 0
            r1.updatingRamText = r2
        L3d:
            return
    }

    private void updateRamViews() {
            r6 = this;
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r6.customRamSwitch
            if (r0 == 0) goto Lc
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            android.app.Activity r1 = r6.activity
            int r1 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.resolveAllocatedMemoryMb(r1)
            com.google.android.material.textfield.TextInputEditText r2 = r6.ramInput
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L28
            r2.setEnabled(r0)
            com.google.android.material.textfield.TextInputEditText r2 = r6.ramInput
            if (r0 == 0) goto L22
            r4 = r3
            goto L25
        L22:
            r4 = 1057803469(0x3f0ccccd, float:0.55)
        L25:
            r2.setAlpha(r4)
        L28:
            com.google.android.material.textfield.TextInputLayout r2 = r6.ramInputLayout
            if (r2 == 0) goto L2f
            r2.setEnabled(r0)
        L2f:
            com.google.android.material.slider.Slider r2 = r6.ramSlider
            if (r2 == 0) goto L41
            r2.setEnabled(r0)
            com.google.android.material.slider.Slider r2 = r6.ramSlider
            if (r0 == 0) goto L3b
            goto L3e
        L3b:
            r3 = 1055286886(0x3ee66666, float:0.45)
        L3e:
            r2.setAlpha(r3)
        L41:
            if (r0 == 0) goto L46
            int r2 = r6.selectedRamMb
            goto L47
        L46:
            r2 = r1
        L47:
            r6.setRamInputText(r2)
            android.widget.TextView r2 = r6.ramSummary
            if (r2 == 0) goto L9d
            java.lang.String r3 = " GB)"
            java.lang.String r4 = " MB ("
            if (r0 == 0) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Custom RAM: "
            r0.<init>(r1)
            int r1 = r6.selectedRamMb
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            int r1 = r6.selectedRamMb
            java.lang.String r1 = r6.formatGb(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.setText(r0)
            goto L9d
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Using launcher default: "
            r0.<init>(r5)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = r6.formatGb(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.setText(r0)
        L9d:
            android.widget.TextView r0 = r6.ramRangeText
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Range: "
            r1.<init>(r2)
            int r2 = r6.minRamMb
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MB - "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r6.sliderMaxRamMb
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MB · Step: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r6.ramStepMb
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MB"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
        Ld3:
            return
    }

    public void show() {
            r11 = this;
            android.app.Activity r0 = r11.activity
            java.lang.String r1 = r11.settingsKey
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings$Settings r0 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.load(r0, r1)
            r11.prepareRendererChoices(r0)
            r11.prepareRamBounds(r0)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.app.Activity r2 = r11.activity
            r1.<init>(r2)
            r2 = 4
            int r3 = r11.dp(r2)
            int r4 = r11.dp(r2)
            int r5 = r11.dp(r2)
            int r2 = r11.dp(r2)
            r1.setPadding(r3, r4, r5, r2)
            com.google.android.material.card.MaterialCardView r2 = new com.google.android.material.card.MaterialCardView
            android.app.Activity r3 = r11.activity
            r2.<init>(r3)
            r3 = 26
            int r3 = r11.dp(r3)
            float r3 = (float) r3
            r2.setRadius(r3)
            r3 = 8
            int r4 = r11.dp(r3)
            float r4 = (float) r4
            r2.setCardElevation(r4)
            r4 = 1
            r2.setUseCompatPadding(r4)
            r2.setPreventCornerOverlap(r4)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.app.Activity r6 = r11.activity
            r5.<init>(r6)
            r5.setOrientation(r4)
            r6 = 22
            int r7 = r11.dp(r6)
            r8 = 18
            int r8 = r11.dp(r8)
            int r6 = r11.dp(r6)
            r9 = 14
            int r9 = r11.dp(r9)
            r5.setPadding(r7, r8, r6, r9)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -1
            r6.<init>(r7, r7)
            r2.addView(r5, r6)
            android.view.View r6 = r11.createHeader()
            android.widget.LinearLayout$LayoutParams r8 = r11.matchWrap()
            r5.addView(r6, r8)
            android.widget.ScrollView r6 = new android.widget.ScrollView
            android.app.Activity r8 = r11.activity
            r6.<init>(r8)
            r8 = 0
            r6.setFillViewport(r8)
            r6.setClipToPadding(r8)
            r6.setOverScrollMode(r4)
            int r9 = r11.dp(r3)
            r6.setPadding(r8, r8, r8, r9)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            android.app.Activity r10 = r11.activity
            r9.<init>(r10)
            r9.setOrientation(r4)
            int r3 = r11.dp(r3)
            r9.setPadding(r8, r8, r8, r3)
            android.widget.LinearLayout$LayoutParams r3 = r11.matchWrap()
            r6.addView(r9, r3)
            android.view.View r3 = r11.createRendererSection(r0)
            android.widget.LinearLayout$LayoutParams r4 = r11.matchWrap()
            r9.addView(r3, r4)
            android.view.View r3 = r11.createRuntimeSection(r0)
            android.widget.LinearLayout$LayoutParams r4 = r11.matchWrap()
            r9.addView(r3, r4)
            android.view.View r3 = r11.createJvmArgsSection(r0)
            android.widget.LinearLayout$LayoutParams r4 = r11.matchWrap()
            r9.addView(r3, r4)
            android.view.View r0 = r11.createRamSection(r0)
            android.widget.LinearLayout$LayoutParams r3 = r11.matchWrap()
            r9.addView(r0, r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r7, r8, r3)
            r5.addView(r6, r0)
            android.view.View r0 = r11.createActionsSection()
            android.widget.LinearLayout$LayoutParams r3 = r11.matchWrap()
            r5.addView(r0, r3)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r7, r7)
            r1.addView(r2, r0)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r0 = new com.google.android.material.dialog.MaterialAlertDialogBuilder
            android.app.Activity r2 = r11.activity
            r0.<init>(r2)
            com.google.android.material.dialog.MaterialAlertDialogBuilder r0 = r0.setView(r1)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            r11.dialog = r0
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda0
            r1.<init>(r11)
            r0.setOnShowListener(r1)
            androidx.appcompat.app.AlertDialog r0 = r11.dialog
            ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda6 r1 = new ca.dnamobile.javalauncher.ui.instance.PerInstanceSettingsDialog$$ExternalSyntheticLambda6
            r1.<init>(r11)
            r0.setOnDismissListener(r1)
            androidx.appcompat.app.AlertDialog r0 = r11.dialog
            r0.show()
            return
    }
}
