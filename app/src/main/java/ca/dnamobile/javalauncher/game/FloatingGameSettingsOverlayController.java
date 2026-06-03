package ca.dnamobile.javalauncher.game;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingGameSettingsOverlayController {
    private static final int BUTTON_SIZE_DP = 48;
    private static final int DEFAULT_MARGIN_DP = 16;
    private static final long FPS_POLL_MS = 500;
    private static final int WRAPPER_SIZE_DP = 58;
    private static final java.lang.String WRAPPER_TAG = "game_settings_floating_wrapper";
    private final android.app.Activity activity;
    private boolean attached;
    private float downRawX;
    private float downRawY;
    private boolean dragging;
    private android.widget.FrameLayout floatingContainer;
    private android.widget.TextView fpsText;
    private final java.lang.Runnable fpsTicker;
    private final android.os.Handler handler;
    private final android.widget.ImageButton settingsButton;
    private int startLeft;
    private int startTop;
    private final int touchSlop;


    public static /* synthetic */ void $r8$lambda$0gRbypzUw_zdk_mEpt_ffCdIlos(ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0) {
            r0.applySavedPosition()
            return
    }

    public static /* synthetic */ boolean $r8$lambda$u7IsAsTABLyfaVkWTXexlZm2EfA(ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.onSettingsButtonTouch(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgethandler, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.os.Handler m453$$Nest$fgethandler(ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0) {
            android.os.Handler r0 = r0.handler
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mrefreshFromPreferences, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m454$$Nest$mrefreshFromPreferences(ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController r0, boolean r1) {
            r0.refreshFromPreferences(r1)
            return
    }

    public FloatingGameSettingsOverlayController(android.app.Activity r3, android.widget.ImageButton r4) {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.handler = r0
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController$1 r0 = new ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController$1
            r0.<init>(r2)
            r2.fpsTicker = r0
            r2.activity = r3
            r2.settingsButton = r4
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            r2.touchSlop = r3
            return
    }

    private void applySavedPosition() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.ensureWrapped()
            android.view.ViewGroup r1 = r3.parentViewGroup()
            if (r0 == 0) goto L56
            if (r1 != 0) goto Ld
            goto L56
        Ld:
            android.app.Activity r1 = r3.activity
            boolean r1 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.hasCustomGameSettingsButtonPosition(r1)
            if (r1 == 0) goto L2e
            android.app.Activity r0 = r3.activity
            int r0 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.getGameSettingsButtonCustomLeftDp(r0)
            int r0 = r3.dpToPx(r0)
            android.app.Activity r1 = r3.activity
            int r1 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.getGameSettingsButtonCustomTopDp(r1)
            int r1 = r3.dpToPx(r1)
            r2 = 0
            r3.moveTo(r0, r1, r2)
            return
        L2e:
            android.widget.FrameLayout$LayoutParams r1 = r3.ensureFrameLayoutParams(r0)
            android.app.Activity r2 = r3.activity
            java.lang.String r2 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.getGameSettingsButtonPlacement(r2)
            int r2 = gravityForPlacement(r2)
            r1.gravity = r2
            r2 = 16
            int r2 = r3.dpToPx(r2)
            r1.leftMargin = r2
            r1.topMargin = r2
            r1.rightMargin = r2
            r1.bottomMargin = r2
            r2 = 0
            r0.setTranslationX(r2)
            r0.setTranslationY(r2)
            r0.setLayoutParams(r1)
        L56:
            return
    }

    private android.view.ViewGroup.LayoutParams buildWrapperLayoutParams(android.view.ViewGroup.LayoutParams r5) {
            r4 = this;
            r0 = 58
            int r0 = r4.dpToPx(r0)
            boolean r1 = r5 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L3e
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            int r2 = r5.width
            if (r2 <= 0) goto L15
            int r2 = r5.width
            goto L16
        L15:
            r2 = r0
        L16:
            int r2 = java.lang.Math.max(r0, r2)
            int r3 = r5.height
            if (r3 <= 0) goto L21
            int r3 = r5.height
            goto L22
        L21:
            r3 = r0
        L22:
            int r0 = java.lang.Math.max(r0, r3)
            r1.<init>(r2, r0)
            int r0 = r5.gravity
            r1.gravity = r0
            int r0 = r5.leftMargin
            r1.leftMargin = r0
            int r0 = r5.topMargin
            r1.topMargin = r0
            int r0 = r5.rightMargin
            r1.rightMargin = r0
            int r5 = r5.bottomMargin
            r1.bottomMargin = r5
            return r1
        L3e:
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r1 = 8388693(0x800055, float:1.1755063E-38)
            r5.<init>(r0, r0, r1)
            return r5
    }

    private static int clamp(int r0, int r1, int r2) {
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private int dpToPx(int r2) {
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

    private android.widget.FrameLayout.LayoutParams ensureFrameLayoutParams(android.widget.FrameLayout r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r0 = r3 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto Lb
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            return r3
        Lb:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r1 = r3.width
            int r3 = r3.height
            r0.<init>(r1, r3)
            return r0
    }

    private android.widget.FrameLayout ensureWrapped() {
            r6 = this;
            android.widget.FrameLayout r0 = r6.floatingContainer
            if (r0 == 0) goto L5
            return r0
        L5:
            android.widget.ImageButton r0 = r6.settingsButton
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L19
            android.widget.ImageButton r0 = r6.settingsButton
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 != 0) goto L1d
            return r1
        L1d:
            boolean r1 = r0 instanceof android.widget.FrameLayout
            java.lang.String r2 = "game_settings_floating_wrapper"
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.getTag()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L3a
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.floatingContainer = r0
            android.widget.TextView r0 = r6.findOrCreateFpsText(r0)
            r6.fpsText = r0
            android.widget.FrameLayout r0 = r6.floatingContainer
            return r0
        L3a:
            android.widget.ImageButton r1 = r6.settingsButton
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.ImageButton r3 = r6.settingsButton
            int r3 = r0.indexOfChild(r3)
            android.widget.ImageButton r4 = r6.settingsButton
            r0.removeView(r4)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            android.app.Activity r5 = r6.activity
            r4.<init>(r5)
            r4.setTag(r2)
            r2 = 0
            r4.setClipChildren(r2)
            r4.setClipToPadding(r2)
            r4.setClickable(r2)
            r4.setFocusable(r2)
            android.view.ViewGroup$LayoutParams r1 = r6.buildWrapperLayoutParams(r1)
            int r2 = java.lang.Math.max(r2, r3)
            r0.addView(r4, r2, r1)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 48
            int r2 = r6.dpToPx(r1)
            int r1 = r6.dpToPx(r1)
            r3 = 17
            r0.<init>(r2, r1, r3)
            android.widget.ImageButton r1 = r6.settingsButton
            r1.setLayoutParams(r0)
            android.widget.ImageButton r0 = r6.settingsButton
            r4.addView(r0)
            android.widget.TextView r0 = r6.findOrCreateFpsText(r4)
            r6.fpsText = r0
            r6.floatingContainer = r4
            return r4
    }

    private android.widget.TextView findOrCreateFpsText(android.widget.FrameLayout r6) {
            r5 = this;
            java.lang.String r0 = "game_settings_fps_badge"
            android.view.View r1 = r6.findViewWithTag(r0)
            boolean r2 = r1 instanceof android.widget.TextView
            if (r2 == 0) goto Ld
            android.widget.TextView r1 = (android.widget.TextView) r1
            return r1
        Ld:
            android.widget.TextView r1 = new android.widget.TextView
            android.app.Activity r2 = r5.activity
            r1.<init>(r2)
            r1.setTag(r0)
            int r0 = ca.dnamobile.javalauncher.R.drawable.bg_fps_badge
            r1.setBackgroundResource(r0)
            r0 = 17
            r1.setGravity(r0)
            r0 = 0
            r1.setIncludeFontPadding(r0)
            r2 = 42
            int r2 = r5.dpToPx(r2)
            r1.setMinWidth(r2)
            r2 = 5
            int r3 = r5.dpToPx(r2)
            int r2 = r5.dpToPx(r2)
            r1.setPadding(r3, r0, r2, r0)
            java.lang.String r2 = "FPS"
            r1.setText(r2)
            r2 = -1
            r1.setTextColor(r2)
            r2 = 1090519040(0x41000000, float:8.0)
            r1.setTextSize(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r2)
            r2 = 8
            r1.setVisibility(r2)
            r1.setClickable(r0)
            r1.setFocusable(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r2 = 18
            int r2 = r5.dpToPx(r2)
            r3 = 81
            r4 = -2
            r0.<init>(r4, r2, r3)
            r6.addView(r1, r0)
            return r1
    }

    private void forceAbsolutePosition(int r4, int r5) {
            r3 = this;
            android.widget.FrameLayout r0 = r3.ensureWrapped()
            if (r0 != 0) goto L7
            return
        L7:
            android.widget.FrameLayout$LayoutParams r1 = r3.ensureFrameLayoutParams(r0)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.gravity = r2
            r2 = 0
            r1.rightMargin = r2
            r1.bottomMargin = r2
            r0.setLayoutParams(r1)
            r3.moveTo(r4, r5, r2)
            return
    }

    private static int gravityForPlacement(java.lang.String r1) {
            java.lang.String r0 = "top_left"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            r1 = 8388659(0x800033, float:1.1755015E-38)
            return r1
        Lc:
            java.lang.String r0 = "top_right"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r1 = 8388661(0x800035, float:1.1755018E-38)
            return r1
        L18:
            java.lang.String r0 = "bottom_left"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L24
            r1 = 8388691(0x800053, float:1.175506E-38)
            return r1
        L24:
            r1 = 8388693(0x800055, float:1.1755063E-38)
            return r1
    }

    private void moveTo(int r6, int r7, boolean r8) {
            r5 = this;
            android.widget.FrameLayout r0 = r5.ensureWrapped()
            android.view.ViewGroup r1 = r5.parentViewGroup()
            if (r0 == 0) goto L5a
            if (r1 != 0) goto Ld
            goto L5a
        Ld:
            int r2 = r1.getWidth()
            int r3 = r0.getWidth()
            int r2 = r2 - r3
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r1 = r1.getHeight()
            int r4 = r0.getHeight()
            int r1 = r1 - r4
            int r1 = java.lang.Math.max(r3, r1)
            int r6 = clamp(r6, r3, r2)
            int r7 = clamp(r7, r3, r1)
            android.widget.FrameLayout$LayoutParams r1 = r5.ensureFrameLayoutParams(r0)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.gravity = r2
            r1.leftMargin = r6
            r1.topMargin = r7
            r1.rightMargin = r3
            r1.bottomMargin = r3
            r2 = 0
            r0.setTranslationX(r2)
            r0.setTranslationY(r2)
            r0.setLayoutParams(r1)
            if (r8 == 0) goto L5a
            android.app.Activity r8 = r5.activity
            int r6 = r5.pxToDp(r6)
            int r7 = r5.pxToDp(r7)
            ca.dnamobile.javalauncher.settings.GameOverlayPreferences.setGameSettingsButtonCustomPosition(r8, r6, r7)
        L5a:
            return
    }

    private boolean onSettingsButtonTouch(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            android.widget.FrameLayout r0 = r4.ensureWrapped()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r6.getActionMasked()
            r3 = 1
            if (r2 == 0) goto L82
            if (r2 == r3) goto L61
            r0 = 2
            if (r2 == r0) goto L18
            r0 = 3
            if (r2 == r0) goto L61
            return r3
        L18:
            float r5 = r6.getRawX()
            float r0 = r4.downRawX
            float r5 = r5 - r0
            float r6 = r6.getRawY()
            float r0 = r4.downRawY
            float r6 = r6 - r0
            boolean r0 = r4.dragging
            if (r0 != 0) goto L49
            float r0 = java.lang.Math.abs(r5)
            int r2 = r4.touchSlop
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L40
            float r0 = java.lang.Math.abs(r6)
            int r2 = r4.touchSlop
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L49
        L40:
            r4.dragging = r3
            int r0 = r4.startLeft
            int r2 = r4.startTop
            r4.forceAbsolutePosition(r0, r2)
        L49:
            boolean r0 = r4.dragging
            if (r0 == 0) goto L60
            int r0 = r4.startLeft
            float r0 = (float) r0
            float r0 = r0 + r5
            int r5 = java.lang.Math.round(r0)
            int r0 = r4.startTop
            float r0 = (float) r0
            float r0 = r0 + r6
            int r6 = java.lang.Math.round(r0)
            r4.moveTo(r5, r6, r1)
        L60:
            return r3
        L61:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L6e
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L6e:
            boolean r0 = r4.dragging
            if (r0 == 0) goto L78
            r4.saveCurrentPosition()
            r4.dragging = r1
            goto L81
        L78:
            int r6 = r6.getActionMasked()
            if (r6 != r3) goto L81
            r5.performClick()
        L81:
            return r3
        L82:
            r4.dragging = r1
            float r1 = r6.getRawX()
            r4.downRawX = r1
            float r6 = r6.getRawY()
            r4.downRawY = r6
            int r6 = r0.getLeft()
            r4.startLeft = r6
            int r6 = r0.getTop()
            r4.startTop = r6
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto La9
            android.view.ViewParent r5 = r5.getParent()
            r5.requestDisallowInterceptTouchEvent(r3)
        La9:
            return r3
    }

    private android.view.ViewGroup parentViewGroup() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.floatingContainer
            if (r0 == 0) goto L13
            android.view.ViewParent r1 = r0.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L13
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    private int pxToDp(int r2) {
            r1 = this;
            float r2 = (float) r2
            android.app.Activity r0 = r1.activity
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 / r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    private void refreshFromPreferences(boolean r6) {
            r5 = this;
            android.widget.FrameLayout r0 = r5.ensureWrapped()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.Activity r1 = r5.activity
            boolean r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowInGameSettingsButton(r1)
            r2 = 0
            r3 = 8
            if (r1 == 0) goto L14
            r4 = r2
            goto L15
        L14:
            r4 = r3
        L15:
            r0.setVisibility(r4)
            android.widget.ImageButton r4 = r5.settingsButton
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            r2 = r3
        L1e:
            r4.setVisibility(r2)
            if (r6 == 0) goto L2d
            if (r1 == 0) goto L2d
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController$$ExternalSyntheticLambda0 r6 = new ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController$$ExternalSyntheticLambda0
            r6.<init>(r5)
            r0.post(r6)
        L2d:
            r5.updateFpsText(r1)
            if (r1 == 0) goto L35
            r5.bringToFront()
        L35:
            return
    }

    private void saveCurrentPosition() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.ensureWrapped()
            if (r0 != 0) goto L7
            return
        L7:
            int r1 = r0.getLeft()
            int r0 = r0.getTop()
            r2 = 1
            r3.moveTo(r1, r0, r2)
            return
    }

    private void updateFpsText(boolean r4) {
            r3 = this;
            android.widget.TextView r0 = r3.fpsText
            if (r0 != 0) goto L5
            return
        L5:
            if (r4 == 0) goto L39
            android.app.Activity r4 = r3.activity
            boolean r4 = ca.dnamobile.javalauncher.settings.GameOverlayPreferences.isShowGameFpsCounter(r4)
            if (r4 == 0) goto L39
            r4 = 0
            int r1 = org.lwjgl.glfw.CallbackBridge.getCurrentFps()     // Catch: java.lang.Throwable -> L19
            int r1 = java.lang.Math.max(r4, r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L19:
            r1 = r4
        L1a:
            if (r1 <= 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " FPS"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L32
        L30:
            java.lang.String r1 = "FPS"
        L32:
            r0.setText(r1)
            r0.setVisibility(r4)
            return
        L39:
            r4 = 8
            r0.setVisibility(r4)
            return
    }

    public void attach() {
            r3 = this;
            boolean r0 = r3.attached
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.attached = r0
            r3.ensureWrapped()
            android.widget.ImageButton r1 = r3.settingsButton
            ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.game.FloatingGameSettingsOverlayController$$ExternalSyntheticLambda1
            r2.<init>(r3)
            r1.setOnTouchListener(r2)
            r3.refreshFromPreferences(r0)
            return
    }

    public void bringToFront() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.ensureWrapped()
            if (r0 != 0) goto L7
            return
        L7:
            r0.bringToFront()
            r1 = 1176256512(0x461c4000, float:10000.0)
            r0.setElevation(r1)
            r0.setTranslationZ(r1)
            return
    }

    public void detach() {
            r2 = this;
            r2.pause()
            android.widget.ImageButton r0 = r2.settingsButton
            r1 = 0
            r0.setOnTouchListener(r1)
            r0 = 0
            r2.attached = r0
            return
    }

    public void pause() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.fpsTicker
            r0.removeCallbacks(r1)
            return
    }

    public void refreshFromPreferences() {
            r1 = this;
            r0 = 1
            r1.refreshFromPreferences(r0)
            return
    }

    public void resume() {
            r2 = this;
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.fpsTicker
            r0.removeCallbacks(r1)
            r0 = 1
            r2.refreshFromPreferences(r0)
            android.os.Handler r0 = r2.handler
            java.lang.Runnable r1 = r2.fpsTicker
            r0.post(r1)
            return
    }
}
