package ca.dnamobile.javalauncher.controls;

/* JADX INFO: loaded from: classes.dex */
public final class ControlsEditorActivity extends androidx.appcompat.app.AppCompatActivity {
    private static final java.lang.String KEY_MENU_X = "floating_menu_x";
    private static final java.lang.String KEY_MENU_Y = "floating_menu_y";
    private static final java.lang.String UI_PREFS = "touch_controls_editor_ui";
    private android.widget.LinearLayout editorPanel;
    private android.widget.SeekBar globalOpacitySlider;
    private android.widget.TextView globalOpacityValue;
    private android.widget.Button menuButton;
    private float menuDownRawX;
    private float menuDownRawY;
    private boolean menuDragging;
    private float menuStartX;
    private float menuStartY;
    private int menuTouchSlop;
    private ca.dnamobile.javalauncher.controls.TouchControlsOverlay overlay;
    private android.widget.FrameLayout root;


    public static /* synthetic */ void $r8$lambda$EcLBYdhBFODw8vYiO7_iRWlTrYU(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1) {
            r0.lambda$buildEditorPanel$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$F1J7tRN0uew3sHtF3clbCR19skQ(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1) {
            r0.lambda$buildEditorPanel$3(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$HrSL7-8YGMMnDeZLTV_2ThxFo6Q, reason: not valid java name */
    public static /* synthetic */ void m409$r8$lambda$HrSL78YGMMnDeZLTV_2ThxFo6Q(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1) {
            r0.lambda$buildEditorPanel$8(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$JnIlPMzhOARiqNQORNArOqxQEGw(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0) {
            r0.positionPanelNearMenuButton()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$NMChoTaWDMZZWmkZp5-7tRwVrgI, reason: not valid java name */
    public static /* synthetic */ boolean m410$r8$lambda$NMChoTaWDMZZWmkZp57tRwVrgI(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.handleMenuButtonTouch(r1, r2)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$P3EWAwQGNOJHBKP3EOH4mtP52i0(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1) {
            r0.lambda$buildEditorPanel$9(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$T5XwagFzyqTkDdUnmiJiSx0jiwY(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.widget.Button r1, android.view.View r2) {
            r0.lambda$buildEditorPanel$5(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$cJWqDTIK8HA79uTstkS1IUEtfik(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1) {
            r0.lambda$buildEditorPanel$10(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$oUb7PBjywlrd5qj4XcmfyWIegHo(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1) {
            r0.lambda$buildEditorPanel$7(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$udQDLOu0sY2pyVna51GrwDEsjwE(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1) {
            r0.lambda$buildEditorPanel$2(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$xse29CGI3EAxMeCXqpMfeoTMqs0(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.widget.Button r1, android.view.View r2) {
            r0.lambda$buildEditorPanel$4(r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$yZffi5QisazA4e3BTXnZx55mpHU(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, android.view.View r1) {
            r0.lambda$buildEditorPanel$6(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$z3q3yRULY0k8QawwLzDfEW4VZy8(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0) {
            r0.lambda$onCreate$0()
            return
    }

    /* JADX INFO: renamed from: -$$Nest$fgetoverlay, reason: not valid java name */
    static /* bridge */ /* synthetic */ ca.dnamobile.javalauncher.controls.TouchControlsOverlay m411$$Nest$fgetoverlay(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0) {
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r0.overlay
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateGlobalOpacityLabel, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m412$$Nest$mupdateGlobalOpacityLabel(ca.dnamobile.javalauncher.controls.ControlsEditorActivity r0, int r1) {
            r0.updateGlobalOpacityLabel(r1)
            return
    }

    public ControlsEditorActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addGlobalOpacityControls() {
            r7 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            java.lang.String r1 = "All button opacity"
            r0.setText(r1)
            r1 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r1)
            r1 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r0.setTextColor(r1)
            r1 = 17
            r0.setGravity(r1)
            r2 = 1082130432(0x40800000, float:4.0)
            int r2 = r7.dp(r2)
            r3 = 0
            r0.setPadding(r3, r2, r3, r3)
            android.widget.LinearLayout r2 = r7.editorPanel
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r6 = -2
            r4.<init>(r5, r6)
            r2.addView(r0, r4)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            r7.globalOpacityValue = r0
            r2 = 1093664768(0x41300000, float:11.0)
            r0.setTextSize(r2)
            android.widget.TextView r0 = r7.globalOpacityValue
            r2 = -4342339(0xffffffffffbdbdbd, float:NaN)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r7.globalOpacityValue
            r0.setGravity(r1)
            android.widget.TextView r0 = r7.globalOpacityValue
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = r7.dp(r1)
            r0.setPadding(r3, r3, r3, r1)
            android.widget.LinearLayout r0 = r7.editorPanel
            android.widget.TextView r1 = r7.globalOpacityValue
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r5, r6)
            r0.addView(r1, r2)
            android.widget.SeekBar r0 = new android.widget.SeekBar
            r0.<init>(r7)
            r7.globalOpacitySlider = r0
            r1 = 100
            r0.setMax(r1)
            float r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getGlobalOpacity(r7)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            android.widget.SeekBar r2 = r7.globalOpacitySlider
            int r0 = java.lang.Math.min(r1, r0)
            int r0 = java.lang.Math.max(r3, r0)
            r2.setProgress(r0)
            android.widget.SeekBar r0 = r7.globalOpacitySlider
            int r0 = r0.getProgress()
            r7.updateGlobalOpacityLabel(r0)
            android.widget.SeekBar r0 = r7.globalOpacitySlider
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$1 r1 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$1
            r1.<init>(r7)
            r0.setOnSeekBarChangeListener(r1)
            android.widget.LinearLayout r0 = r7.editorPanel
            android.widget.SeekBar r1 = r7.globalOpacitySlider
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 1108869120(0x42180000, float:38.0)
            int r3 = r7.dp(r3)
            r2.<init>(r5, r3)
            r0.addView(r1, r2)
            return
    }

    private void buildEditorPanel() {
            r7 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            java.lang.String r1 = "Touch editor"
            r0.setText(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r1)
            r1 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r0.setTextColor(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1086324736(0x40c00000, float:6.0)
            int r1 = r7.dp(r1)
            r2 = 0
            r0.setPadding(r2, r2, r2, r1)
            android.widget.LinearLayout r1 = r7.editorPanel
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r1.addView(r0, r2)
            r7.addGlobalOpacityControls()
            android.widget.LinearLayout r0 = r7.panelRow()
            android.widget.LinearLayout r1 = r7.panelRow()
            android.widget.LinearLayout r2 = r7.panelRow()
            android.widget.LinearLayout r3 = r7.panelRow()
            java.lang.String r4 = "Add Key"
            android.widget.Button r4 = r7.panelButton(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda6 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda6
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r0.addView(r4, r5)
            java.lang.String r4 = "Add Mouse"
            android.widget.Button r4 = r7.panelButton(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda7 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda7
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r0.addView(r4, r5)
            java.lang.String r4 = "Add Stick"
            android.widget.Button r4 = r7.panelButton(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda8 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda8
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r0.addView(r4, r5)
            java.lang.String r4 = ""
            android.widget.Button r5 = r7.panelButton(r4)
            r7.updateSnapButtonText(r5)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda9 r6 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda9
            r6.<init>(r7, r5)
            r5.setOnClickListener(r6)
            android.widget.LinearLayout$LayoutParams r6 = r7.panelButtonParams()
            r1.addView(r5, r6)
            android.widget.Button r4 = r7.panelButton(r4)
            r7.updateMouseButtonText(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda10 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda10
            r5.<init>(r7, r4)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r1.addView(r4, r5)
            java.lang.String r4 = "Save"
            android.widget.Button r4 = r7.panelButton(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda11 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda11
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r1.addView(r4, r5)
            java.lang.String r4 = "Undo"
            android.widget.Button r4 = r7.panelButton(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda12 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda12
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r2.addView(r4, r5)
            java.lang.String r4 = "Redo"
            android.widget.Button r4 = r7.panelButton(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda1 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda1
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r2.addView(r4, r5)
            java.lang.String r4 = "Hide panel"
            android.widget.Button r4 = r7.panelButton(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda2 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda2
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r3.addView(r4, r5)
            java.lang.String r4 = "Close"
            android.widget.Button r4 = r7.panelButton(r4)
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda3 r5 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda3
            r5.<init>(r7)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = r7.panelButtonParams()
            r3.addView(r4, r5)
            android.widget.LinearLayout r4 = r7.editorPanel
            r4.addView(r0)
            android.widget.LinearLayout r0 = r7.editorPanel
            r0.addView(r1)
            android.widget.LinearLayout r0 = r7.editorPanel
            r0.addView(r2)
            android.widget.LinearLayout r0 = r7.editorPanel
            r0.addView(r3)
            return
    }

    private static float clamp(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private int dp(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    private void enableImmersiveSafely() {
            r0 = this;
            ca.dnamobile.javalauncher.utils.FullscreenUtils.enableImmersive(r0)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    private boolean handleMenuButtonTouch(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L68
            if (r0 == r2) goto L43
            r3 = 2
            if (r0 == r3) goto L11
            r3 = 3
            if (r0 == r3) goto L43
            return r2
        L11:
            float r5 = r6.getRawX()
            float r0 = r4.menuDownRawX
            float r5 = r5 - r0
            float r6 = r6.getRawY()
            float r0 = r4.menuDownRawY
            float r6 = r6 - r0
            boolean r0 = r4.menuDragging
            if (r0 != 0) goto L35
            float r0 = r5 * r5
            float r3 = r6 * r6
            float r0 = r0 + r3
            int r3 = r4.menuTouchSlop
            int r3 = r3 * r3
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L35
            r4.menuDragging = r2
            r4.setPanelVisible(r1)
        L35:
            boolean r0 = r4.menuDragging
            if (r0 == 0) goto L42
            float r0 = r4.menuStartX
            float r0 = r0 + r5
            float r5 = r4.menuStartY
            float r5 = r5 + r6
            r4.moveMenuButton(r0, r5)
        L42:
            return r2
        L43:
            r4.requestParentDisallowIntercept(r5, r1)
            boolean r0 = r4.menuDragging
            if (r0 == 0) goto L4e
            r4.saveMenuButtonPosition()
            goto L65
        L4e:
            int r6 = r6.getActionMasked()
            if (r6 != r2) goto L65
            r5.performClick()
            android.widget.LinearLayout r5 = r4.editorPanel
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L61
            r5 = r2
            goto L62
        L61:
            r5 = r1
        L62:
            r4.setPanelVisible(r5)
        L65:
            r4.menuDragging = r1
            return r2
        L68:
            float r0 = r6.getRawX()
            r4.menuDownRawX = r0
            float r6 = r6.getRawY()
            r4.menuDownRawY = r6
            android.widget.Button r6 = r4.menuButton
            float r6 = r6.getX()
            r4.menuStartX = r6
            android.widget.Button r6 = r4.menuButton
            float r6 = r6.getY()
            r4.menuStartY = r6
            r4.menuDragging = r1
            r4.requestParentDisallowIntercept(r5, r2)
            return r2
    }

    private /* synthetic */ void lambda$buildEditorPanel$1(android.view.View r7) {
            r6 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r7 = r6.overlay
            r4 = 1116733440(0x42900000, float:72.0)
            r5 = 1112539136(0x42500000, float:52.0)
            java.lang.String r0 = "Key"
            r1 = 32
            r2 = 1123024896(0x42f00000, float:120.0)
            r3 = 1123024896(0x42f00000, float:120.0)
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = ca.dnamobile.javalauncher.controls.TouchControlData.key(r0, r1, r2, r3, r4, r5)
            r7.addControl(r0)
            java.lang.String r7 = "Tap the new button to edit it."
            r0 = 0
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r0)
            r7.show()
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$10(android.view.View r1) {
            r0 = this;
            r0.finish()
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$2(android.view.View r5) {
            r4 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r5 = r4.overlay
            r0 = 1130102784(0x435c0000, float:220.0)
            r1 = 1123024896(0x42f00000, float:120.0)
            java.lang.String r2 = "Mouse"
            r3 = 0
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = ca.dnamobile.javalauncher.controls.TouchControlData.mouse(r2, r3, r0, r1)
            r5.addControl(r0)
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$3(android.view.View r5) {
            r4 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r5 = r4.overlay
            r0 = 1134886912(0x43a50000, float:330.0)
            r1 = 1124073472(0x43000000, float:128.0)
            java.lang.String r2 = "Joystick"
            r3 = 1111490560(0x42400000, float:48.0)
            ca.dnamobile.javalauncher.controls.TouchControlData r0 = ca.dnamobile.javalauncher.controls.TouchControlData.joystick(r2, r3, r0, r1, r1)
            r5.addControl(r0)
            java.lang.String r5 = "Added joystick. Long-press it to resize or move it."
            r0 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)
            r5.show()
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$4(android.widget.Button r2, android.view.View r3) {
            r1 = this;
            boolean r3 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isSnapControlsEnabled(r1)
            r0 = r3 ^ 1
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setSnapControlsEnabled(r1, r0)
            r1.updateSnapButtonText(r2)
            if (r3 != 0) goto L11
            java.lang.String r2 = "Snap enabled."
            goto L13
        L11:
            java.lang.String r2 = "Snap disabled."
        L13:
            r3 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$5(android.widget.Button r2, android.view.View r3) {
            r1 = this;
            boolean r3 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r1)
            r0 = r3 ^ 1
            ca.dnamobile.javalauncher.controls.ControlsPreferences.setVirtualMouseEnabled(r1, r0)
            r1.updateMouseButtonText(r2)
            if (r3 != 0) goto L11
            java.lang.String r2 = "Virtual cursor shown."
            goto L13
        L11:
            java.lang.String r2 = "Virtual cursor hidden."
        L13:
            r3 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$6(android.view.View r2) {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r2 = r1.overlay
            r2.saveLayout()
            java.lang.String r2 = "Touch controls saved."
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$7(android.view.View r2) {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r2 = r1.overlay
            boolean r2 = r2.undoLastChange()
            r0 = 0
            if (r2 == 0) goto L13
            java.lang.String r2 = "Undid last touch edit."
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            goto L1c
        L13:
            java.lang.String r2 = "Nothing to undo."
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
        L1c:
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$8(android.view.View r2) {
            r1 = this;
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r2 = r1.overlay
            boolean r2 = r2.redoLastChange()
            r0 = 0
            if (r2 == 0) goto L13
            java.lang.String r2 = "Redid touch edit."
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
            goto L1c
        L13:
            java.lang.String r2 = "Nothing to redo."
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r0)
            r2.show()
        L1c:
            return
    }

    private /* synthetic */ void lambda$buildEditorPanel$9(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.setPanelVisible(r1)
            return
    }

    private /* synthetic */ void lambda$onCreate$0() {
            r2 = this;
            r2.restoreMenuButtonPosition()
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.overlay
            if (r0 == 0) goto L10
            r1 = 1
            r0.setEditMode(r1)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r0 = r2.overlay
            r0.loadSelectedLayout()
        L10:
            r2.enableImmersiveSafely()
            return
    }

    private android.graphics.drawable.GradientDrawable makeGearBackground() {
            r3 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = -585096924(0xffffffffdd202124, float:-7.2115896E17)
            r0.setColor(r1)
            r1 = 1
            r0.setShape(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = r3.dp(r1)
            r2 = 1728053247(0x66ffffff, float:6.0446287E23)
            r0.setStroke(r1, r2)
            return r0
    }

    private android.graphics.drawable.GradientDrawable makePanelBackground() {
            r3 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = -586084079(0xffffffffdd111111, float:-6.533222E17)
            r0.setColor(r1)
            r1 = 1099956224(0x41900000, float:18.0)
            int r1 = r3.dp(r1)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = r3.dp(r1)
            r2 = 1442840575(0x55ffffff, float:3.518437E13)
            r0.setStroke(r1, r2)
            return r0
    }

    private void moveMenuButton(float r6, float r7) {
            r5 = this;
            android.widget.FrameLayout r0 = r5.root
            int r0 = r0.getWidth()
            android.widget.Button r1 = r5.menuButton
            int r1 = r1.getWidth()
            int r0 = r0 - r1
            r1 = 1082130432(0x40800000, float:4.0)
            int r2 = r5.dp(r1)
            int r0 = r0 - r2
            float r0 = (float) r0
            r2 = 0
            float r0 = java.lang.Math.max(r2, r0)
            android.widget.FrameLayout r3 = r5.root
            int r3 = r3.getHeight()
            android.widget.Button r4 = r5.menuButton
            int r4 = r4.getHeight()
            int r3 = r3 - r4
            int r4 = r5.dp(r1)
            int r3 = r3 - r4
            float r3 = (float) r3
            float r2 = java.lang.Math.max(r2, r3)
            android.widget.Button r3 = r5.menuButton
            int r4 = r5.dp(r1)
            float r4 = (float) r4
            float r6 = clamp(r6, r4, r0)
            r3.setX(r6)
            android.widget.Button r6 = r5.menuButton
            int r0 = r5.dp(r1)
            float r0 = (float) r0
            float r7 = clamp(r7, r0, r2)
            r6.setY(r7)
            android.widget.LinearLayout r6 = r5.editorPanel
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L58
            r5.positionPanelNearMenuButton()
        L58:
            return
    }

    private android.widget.Button panelButton(java.lang.String r4) {
            r3 = this;
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r3)
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

    private android.widget.LinearLayout.LayoutParams panelButtonParams() {
            r4 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 1121976320(0x42e00000, float:112.0)
            int r1 = r4.dp(r1)
            r2 = 1109917696(0x42280000, float:42.0)
            int r2 = r4.dp(r2)
            r0.<init>(r1, r2)
            r1 = 1077936128(0x40400000, float:3.0)
            int r2 = r4.dp(r1)
            r3 = 0
            int r1 = r4.dp(r1)
            r0.setMargins(r2, r3, r1, r3)
            return r0
    }

    private android.widget.LinearLayout panelRow() {
            r4 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = r4.dp(r2)
            int r2 = r4.dp(r2)
            r0.setPadding(r1, r3, r1, r2)
            return r0
    }

    private void positionPanelNearMenuButton() {
            r10 = this;
            android.widget.FrameLayout r0 = r10.root
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L137
            android.widget.FrameLayout r0 = r10.root
            int r0 = r0.getHeight()
            if (r0 > 0) goto L12
            goto L137
        L12:
            android.widget.LinearLayout r0 = r10.editorPanel
            android.widget.FrameLayout r1 = r10.root
            int r1 = r1.getWidth()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            android.widget.FrameLayout r3 = r10.root
            int r3 = r3.getHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r0.measure(r1, r2)
            android.widget.LinearLayout r0 = r10.editorPanel
            int r0 = r0.getMeasuredWidth()
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            android.widget.LinearLayout r2 = r10.editorPanel
            int r2 = r2.getMeasuredHeight()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 1090519040(0x41000000, float:8.0)
            int r2 = r10.dp(r2)
            float r2 = (float) r2
            android.widget.Button r3 = r10.menuButton
            float r3 = r3.getX()
            android.widget.Button r4 = r10.menuButton
            int r4 = r4.getWidth()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 + r4
            android.widget.FrameLayout r4 = r10.root
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r4 = r4 / r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L76
            android.widget.Button r3 = r10.menuButton
            float r3 = r3.getX()
            android.widget.Button r4 = r10.menuButton
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r3 = r3 + r4
            float r3 = r3 + r2
            goto L7f
        L76:
            android.widget.Button r3 = r10.menuButton
            float r3 = r3.getX()
            float r4 = (float) r0
            float r3 = r3 - r4
            float r3 = r3 - r2
        L7f:
            android.widget.Button r4 = r10.menuButton
            float r4 = r4.getY()
            r6 = 1082130432(0x40800000, float:4.0)
            int r7 = r10.dp(r6)
            float r7 = (float) r7
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 < 0) goto La2
            float r7 = (float) r0
            float r7 = r7 + r3
            android.widget.FrameLayout r8 = r10.root
            int r8 = r8.getWidth()
            int r9 = r10.dp(r6)
            int r8 = r8 - r9
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto Lf1
        La2:
            android.widget.Button r3 = r10.menuButton
            float r3 = r3.getX()
            int r4 = r10.dp(r6)
            float r4 = (float) r4
            int r7 = r10.dp(r6)
            android.widget.FrameLayout r8 = r10.root
            int r8 = r8.getWidth()
            int r8 = r8 - r0
            int r9 = r10.dp(r6)
            int r8 = r8 - r9
            int r7 = java.lang.Math.max(r7, r8)
            float r7 = (float) r7
            float r3 = clamp(r3, r4, r7)
            android.widget.Button r4 = r10.menuButton
            float r4 = r4.getY()
            android.widget.FrameLayout r7 = r10.root
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r7 = r7 / r5
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto Le2
            android.widget.Button r4 = r10.menuButton
            float r4 = r4.getY()
            float r5 = (float) r1
            float r4 = r4 - r5
            float r4 = r4 - r2
            goto Lf1
        Le2:
            android.widget.Button r4 = r10.menuButton
            float r4 = r4.getY()
            android.widget.Button r5 = r10.menuButton
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r4 = r4 + r5
            float r4 = r4 + r2
        Lf1:
            android.widget.LinearLayout r2 = r10.editorPanel
            int r5 = r10.dp(r6)
            float r5 = (float) r5
            int r7 = r10.dp(r6)
            android.widget.FrameLayout r8 = r10.root
            int r8 = r8.getWidth()
            int r8 = r8 - r0
            int r0 = r10.dp(r6)
            int r8 = r8 - r0
            int r0 = java.lang.Math.max(r7, r8)
            float r0 = (float) r0
            float r0 = clamp(r3, r5, r0)
            r2.setX(r0)
            android.widget.LinearLayout r0 = r10.editorPanel
            int r2 = r10.dp(r6)
            float r2 = (float) r2
            int r3 = r10.dp(r6)
            android.widget.FrameLayout r5 = r10.root
            int r5 = r5.getHeight()
            int r5 = r5 - r1
            int r1 = r10.dp(r6)
            int r5 = r5 - r1
            int r1 = java.lang.Math.max(r3, r5)
            float r1 = (float) r1
            float r1 = clamp(r4, r2, r1)
            r0.setY(r1)
        L137:
            return
    }

    private void requestParentDisallowIntercept(android.view.View r1, boolean r2) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            android.view.ViewParent r1 = r1.getParent()
        L8:
            if (r1 == 0) goto Ld
            r1.requestDisallowInterceptTouchEvent(r2)
        Ld:
            return
    }

    private void restoreMenuButtonPosition() {
            r7 = this;
            java.lang.String r0 = "touch_controls_editor_ui"
            r1 = 0
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r0, r1)
            r2 = 1082130432(0x40800000, float:4.0)
            int r3 = r7.dp(r2)
            float r3 = (float) r3
            android.widget.FrameLayout r4 = r7.root
            int r4 = r4.getWidth()
            android.widget.Button r5 = r7.menuButton
            int r5 = r5.getWidth()
            int r4 = r4 - r5
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = java.lang.Math.max(r3, r4)
            int r2 = r7.dp(r2)
            float r2 = (float) r2
            android.widget.FrameLayout r4 = r7.root
            int r4 = r4.getHeight()
            android.widget.Button r6 = r7.menuButton
            int r6 = r6.getHeight()
            int r4 = r4 - r6
            float r4 = (float) r4
            float r4 = r4 / r5
            float r2 = java.lang.Math.max(r2, r4)
            java.lang.String r4 = "floating_menu_x"
            boolean r5 = r0.contains(r4)
            java.lang.String r6 = "floating_menu_y"
            if (r5 == 0) goto L4c
            boolean r5 = r0.contains(r6)
            if (r5 == 0) goto L4c
            r1 = 1
        L4c:
            if (r1 == 0) goto L52
            float r3 = r0.getFloat(r4, r3)
        L52:
            if (r1 == 0) goto L58
            float r2 = r0.getFloat(r6, r2)
        L58:
            r7.moveMenuButton(r3, r2)
            return
    }

    private void saveMenuButtonPosition() {
            r3 = this;
            java.lang.String r0 = "touch_controls_editor_ui"
            r1 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.widget.Button r1 = r3.menuButton
            float r1 = r1.getX()
            java.lang.String r2 = "floating_menu_x"
            android.content.SharedPreferences$Editor r0 = r0.putFloat(r2, r1)
            android.widget.Button r1 = r3.menuButton
            float r1 = r1.getY()
            java.lang.String r2 = "floating_menu_y"
            android.content.SharedPreferences$Editor r0 = r0.putFloat(r2, r1)
            r0.apply()
            return
    }

    private void setPanelVisible(boolean r3) {
            r2 = this;
            android.widget.LinearLayout r0 = r2.editorPanel
            if (r3 == 0) goto L6
            r1 = 0
            goto L8
        L6:
            r1 = 8
        L8:
            r0.setVisibility(r1)
            android.widget.Button r0 = r2.menuButton
            if (r3 == 0) goto L12
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L15
        L12:
            r1 = 1061326684(0x3f428f5c, float:0.76)
        L15:
            r0.setAlpha(r1)
            if (r3 == 0) goto L24
            android.widget.LinearLayout r3 = r2.editorPanel
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r3.post(r0)
        L24:
            return
    }

    private void updateGlobalOpacityLabel(int r4) {
            r3 = this;
            android.widget.TextView r0 = r3.globalOpacityValue
            if (r0 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Opacity: "
            r1.<init>(r2)
            r2 = 100
            int r4 = java.lang.Math.min(r2, r4)
            r2 = 0
            int r4 = java.lang.Math.max(r2, r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "%"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
        L27:
            return
    }

    private void updateMouseButtonText(android.widget.Button r2) {
            r1 = this;
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r1)
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cursor: ON"
            goto Lb
        L9:
            java.lang.String r0 = "Cursor: OFF"
        Lb:
            r2.setText(r0)
            return
    }

    private void updateSnapButtonText(android.widget.Button r2) {
            r1 = this;
            boolean r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isSnapControlsEnabled(r1)
            if (r0 == 0) goto L9
            java.lang.String r0 = "Snap: ON"
            goto Lb
        L9:
            java.lang.String r0 = "Snap: OFF"
        Lb:
            r2.setText(r0)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r5)
            int r6 = r6.getScaledTouchSlop()
            r5.menuTouchSlop = r6
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r5)
            r5.root = r6
            r5.setContentView(r6)
            ca.dnamobile.javalauncher.controls.TouchControlsOverlay r6 = new ca.dnamobile.javalauncher.controls.TouchControlsOverlay
            r6.<init>(r5)
            r5.overlay = r6
            android.widget.FrameLayout r0 = r5.root
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.addView(r6, r1)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r5)
            r5.editorPanel = r6
            r0 = 1
            r6.setOrientation(r0)
            android.widget.LinearLayout r6 = r5.editorPanel
            r0 = 16
            r6.setGravity(r0)
            android.widget.LinearLayout r6 = r5.editorPanel
            r0 = 1092616192(0x41200000, float:10.0)
            int r1 = r5.dp(r0)
            int r2 = r5.dp(r0)
            int r3 = r5.dp(r0)
            int r0 = r5.dp(r0)
            r6.setPadding(r1, r2, r3, r0)
            android.widget.LinearLayout r6 = r5.editorPanel
            android.graphics.drawable.GradientDrawable r0 = r5.makePanelBackground()
            r6.setBackground(r0)
            android.widget.LinearLayout r6 = r5.editorPanel
            r0 = 8
            r6.setVisibility(r0)
            android.widget.FrameLayout r6 = r5.root
            android.widget.LinearLayout r0 = r5.editorPanel
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r1.<init>(r2, r2, r3)
            r6.addView(r0, r1)
            r5.buildEditorPanel()
            android.widget.Button r6 = new android.widget.Button
            r6.<init>(r5)
            r5.menuButton = r6
            java.lang.String r0 = "⚙"
            r6.setText(r0)
            android.widget.Button r6 = r5.menuButton
            r0 = 1102053376(0x41b00000, float:22.0)
            r6.setTextSize(r0)
            android.widget.Button r6 = r5.menuButton
            r0 = 0
            r6.setAllCaps(r0)
            android.widget.Button r6 = r5.menuButton
            r0 = 1061326684(0x3f428f5c, float:0.76)
            r6.setAlpha(r0)
            android.widget.Button r6 = r5.menuButton
            android.graphics.drawable.GradientDrawable r0 = r5.makeGearBackground()
            r6.setBackground(r0)
            android.widget.Button r6 = r5.menuButton
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda4 r0 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda4
            r0.<init>(r5)
            r6.setOnTouchListener(r0)
            android.widget.FrameLayout r6 = r5.root
            android.widget.Button r0 = r5.menuButton
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 1112539136(0x42500000, float:52.0)
            int r4 = r5.dp(r2)
            int r2 = r5.dp(r2)
            r1.<init>(r4, r2, r3)
            r6.addView(r0, r1)
            android.widget.LinearLayout r6 = r5.editorPanel
            r6.bringToFront()
            android.widget.Button r6 = r5.menuButton
            r6.bringToFront()
            android.widget.FrameLayout r6 = r5.root
            ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda5 r0 = new ca.dnamobile.javalauncher.controls.ControlsEditorActivity$$ExternalSyntheticLambda5
            r0.<init>(r5)
            r6.post(r0)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r0 = this;
            super.onResume()
            r0.enableImmersiveSafely()
            return
    }
}
