package ca.dnamobile.javalauncher.input;

/* JADX INFO: loaded from: classes.dex */
public final class GameCursorOverlay extends android.view.View {
    private static final float CURSOR_CANVAS_DP = 28.0f;
    private android.graphics.Bitmap cursorBitmap;
    private final android.graphics.drawable.Drawable cursorDrawable;
    private final android.graphics.Path cursorPath;
    private boolean cursorVisible;
    private boolean drawableAdded;
    private final android.graphics.Paint fillPaint;
    private final android.view.Choreographer.FrameCallback frameCallback;
    private boolean lastMenuMode;
    private boolean lastShouldShow;
    private int loadedCursorSizePercent;
    private java.lang.String loadedCursorStyle;
    private java.lang.String loadedCustomCursorPath;
    private final ca.dnamobile.javalauncher.input.GamepadMappingStore mappingStore;
    private android.view.ViewGroup overlayParent;
    private boolean removed;
    private final android.graphics.Paint strokePaint;



    /* JADX INFO: renamed from: -$$Nest$fgetcursorBitmap, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.graphics.Bitmap m455$$Nest$fgetcursorBitmap(ca.dnamobile.javalauncher.input.GameCursorOverlay r0) {
            android.graphics.Bitmap r0 = r0.cursorBitmap
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetcursorVisible, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m456$$Nest$fgetcursorVisible(ca.dnamobile.javalauncher.input.GameCursorOverlay r0) {
            boolean r0 = r0.cursorVisible
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetfillPaint, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.graphics.Paint m457$$Nest$fgetfillPaint(ca.dnamobile.javalauncher.input.GameCursorOverlay r0) {
            android.graphics.Paint r0 = r0.fillPaint
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetremoved, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m458$$Nest$fgetremoved(ca.dnamobile.javalauncher.input.GameCursorOverlay r0) {
            boolean r0 = r0.removed
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetstrokePaint, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.graphics.Paint m459$$Nest$fgetstrokePaint(ca.dnamobile.javalauncher.input.GameCursorOverlay r0) {
            android.graphics.Paint r0 = r0.strokePaint
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mdrawFallbackCrosshair, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m460$$Nest$mdrawFallbackCrosshair(ca.dnamobile.javalauncher.input.GameCursorOverlay r0, android.graphics.Canvas r1, int r2, int r3) {
            r0.drawFallbackCrosshair(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mupdateFromBridge, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m461$$Nest$mupdateFromBridge(ca.dnamobile.javalauncher.input.GameCursorOverlay r0) {
            r0.updateFromBridge()
            return
    }

    public GameCursorOverlay(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r5.fillPaint = r0
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r1)
            r5.strokePaint = r2
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r5.cursorPath = r3
            java.lang.String r3 = ""
            r5.loadedCursorStyle = r3
            r3 = -1
            r5.loadedCursorSizePercent = r3
            ca.dnamobile.javalauncher.input.GameCursorOverlay$1 r4 = new ca.dnamobile.javalauncher.input.GameCursorOverlay$1
            r4.<init>(r5)
            r5.cursorDrawable = r4
            ca.dnamobile.javalauncher.input.GameCursorOverlay$2 r4 = new ca.dnamobile.javalauncher.input.GameCursorOverlay$2
            r4.<init>(r5)
            r5.frameCallback = r4
            ca.dnamobile.javalauncher.input.GamepadMappingStore r6 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r6)
            r5.mappingStore = r6
            r5.reloadCursorBitmapIfNeeded(r1)
            r6 = 8
            r5.setVisibility(r6)
            r5.setWillNotDraw(r1)
            r6 = 0
            r5.setClickable(r6)
            r5.setLongClickable(r6)
            r5.setFocusable(r6)
            r5.setFocusableInTouchMode(r6)
            r5.setHapticFeedbackEnabled(r6)
            r5.setSoundEffectsEnabled(r6)
            r5.setEnabled(r6)
            r6 = 2
            r5.setImportantForAccessibility(r6)
            r0.setColor(r3)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r0.setStyle(r6)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setColor(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r6)
            r6 = 1082130432(0x40800000, float:4.0)
            float r6 = r5.dp(r6)
            r2.setStrokeWidth(r6)
            android.graphics.Paint$Cap r6 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r6)
            android.graphics.Paint$Join r6 = android.graphics.Paint.Join.ROUND
            r2.setStrokeJoin(r6)
            r6 = 1072064102(0x3fe66666, float:1.8)
            float r6 = r5.dp(r6)
            r0.setStrokeWidth(r6)
            android.graphics.Paint$Cap r6 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r6)
            android.graphics.Paint$Join r6 = android.graphics.Paint.Join.ROUND
            r0.setStrokeJoin(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r6)
            r5.buildPath()
            android.view.Choreographer r6 = android.view.Choreographer.getInstance()
            r6.postFrameCallback(r4)
            return
    }

    private void attachDrawableToParent() {
            r2 = this;
            boolean r0 = r2.drawableAdded
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 != 0) goto Le
            return
        Le:
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.overlayParent = r0
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            android.graphics.drawable.Drawable r1 = r2.cursorDrawable
            r0.add(r1)
            r0 = 1
            r2.drawableAdded = r0
            return
    }

    private void buildPath() {
            r1 = this;
            android.graphics.Path r0 = r1.cursorPath
            r0.reset()
            return
    }

    private static float clamp(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private void detachDrawableFromParent() {
            r2 = this;
            boolean r0 = r2.drawableAdded
            if (r0 == 0) goto L18
            android.view.ViewGroup r0 = r2.overlayParent
            if (r0 != 0) goto L9
            goto L18
        L9:
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            android.graphics.drawable.Drawable r1 = r2.cursorDrawable
            r0.remove(r1)
            r0 = 0
            r2.drawableAdded = r0
            r0 = 0
            r2.overlayParent = r0
        L18:
            return
    }

    private float dp(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            return r2
    }

    private static void drawCrosshairLines(android.graphics.Canvas r6, float r7, float r8, float r9, float r10, float r11, android.graphics.Paint r12) {
            float r1 = r7 - r9
            float r3 = r7 - r10
            r0 = r6
            r2 = r8
            r4 = r8
            r5 = r12
            r0.drawLine(r1, r2, r3, r4, r5)
            float r1 = r7 + r10
            float r3 = r7 + r9
            r0.drawLine(r1, r2, r3, r4, r5)
            float r2 = r8 - r9
            float r4 = r8 - r10
            r1 = r7
            r3 = r7
            r0.drawLine(r1, r2, r3, r4, r5)
            float r2 = r8 + r10
            float r4 = r8 + r9
            r0.drawLine(r1, r2, r3, r4, r5)
            r6.drawCircle(r7, r8, r11, r12)
            return
    }

    private void drawFallbackCrosshair(android.graphics.Canvas r11, int r12, int r13) {
            r10 = this;
            float r12 = (float) r12
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r0
            float r13 = (float) r13
            float r13 = r13 / r0
            android.content.res.Resources r0 = r10.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1093664768(0x41300000, float:11.0)
            float r8 = r0 * r1
            r1 = 1080033280(0x40600000, float:3.5)
            float r9 = r0 * r1
            r1 = 1087373312(0x40d00000, float:6.5)
            float r0 = r0 * r1
            android.graphics.Paint r7 = r10.strokePaint
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r8
            r5 = r9
            r6 = r0
            drawCrosshairLines(r1, r2, r3, r4, r5, r6, r7)
            android.graphics.Paint r7 = r10.fillPaint
            drawCrosshairLines(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private static boolean hasPhysicalPointerDevice() {
            r0 = 0
            int[] r1 = android.view.InputDevice.getDeviceIds()     // Catch: java.lang.Throwable -> L1a
            int r2 = r1.length     // Catch: java.lang.Throwable -> L1a
            r3 = r0
        L7:
            if (r3 >= r2) goto L1a
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L1a
            android.view.InputDevice r4 = android.view.InputDevice.getDevice(r4)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = isRealExternalPointerDevice(r4)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L17
            r0 = 1
            return r0
        L17:
            int r3 = r3 + 1
            goto L7
        L1a:
            return r0
    }

    private static boolean isControllerLikeDevice(android.view.InputDevice r2, int r3) {
            r0 = r3 & 1025(0x401, float:1.436E-42)
            r1 = 1025(0x401, float:1.436E-42)
            if (r0 == r1) goto L1a
            r0 = 16777232(0x1000010, float:2.3509932E-38)
            r3 = r3 & r0
            if (r3 != r0) goto Ld
            goto L1a
        Ld:
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = safeLower(r2)
            boolean r2 = looksLikeControllerName(r2)
            return r2
        L1a:
            r2 = 1
            return r2
    }

    private static boolean isRealExternalPointerDevice(android.view.InputDevice r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.getSources()
            boolean r2 = isControllerLikeDevice(r5, r1)
            if (r2 == 0) goto Lf
            return r0
        Lf:
            r2 = r1 & 8194(0x2002, float:1.1482E-41)
            r3 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r3) goto L36
            r2 = 131076(0x20004, float:1.83677E-40)
            r4 = r1 & r2
            if (r4 == r2) goto L36
            r4 = 1048584(0x100008, float:1.469379E-39)
            r1 = r1 & r4
            if (r1 == r4) goto L36
            boolean r1 = r5.supportsSource(r3)
            if (r1 != 0) goto L36
            boolean r1 = r5.supportsSource(r2)
            if (r1 != 0) goto L36
            boolean r1 = r5.supportsSource(r4)
            if (r1 == 0) goto L35
            goto L36
        L35:
            return r0
        L36:
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = safeLower(r5)
            boolean r1 = looksLikeControllerName(r5)
            if (r1 != 0) goto L4d
            boolean r5 = looksLikeVirtualTouchName(r5)
            if (r5 == 0) goto L4b
            goto L4d
        L4b:
            r5 = 1
            return r5
        L4d:
            return r0
    }

    private static android.graphics.Bitmap loadCursorBitmap(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = "custom"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L2a
            if (r7 == 0) goto L2a
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L2a
            boolean r7 = r0.isFile()     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L2a
            long r1 = r0.length()     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L2a
            java.lang.String r7 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFile(r7)     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L2a
            return r7
        L2a:
            r7 = 0
            android.content.res.Resources r0 = r5.getResources()     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorResourceName(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "drawable"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L47
            int r6 = r0.getIdentifier(r6, r1, r2)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L47
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L47
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r5, r6)     // Catch: java.lang.Throwable -> L47
        L47:
            return r7
    }

    private static boolean looksLikeControllerName(java.lang.String r1) {
            java.lang.String r0 = "controller"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "gamepad"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "joystick"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "xbox"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "dualshock"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "dualsense"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "playstation"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "8bitdo"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "gamesir"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "ipega"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "backbone"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "kishi"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "odin"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "retroid"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "anbernic"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "aya"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "gpd"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "legion go"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "steam deck"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "razer raiju"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lab
            java.lang.String r0 = "moga"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto La9
            goto Lab
        La9:
            r1 = 0
            goto Lac
        Lab:
            r1 = 1
        Lac:
            return r1
    }

    private static boolean looksLikeMouseName(java.lang.String r1) {
            java.lang.String r0 = "mouse"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "trackball"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "trackpad"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "receiver"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "logitech"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "razer"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "microsoft"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "hid-compliant"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L41
            goto L43
        L41:
            r1 = 0
            goto L44
        L43:
            r1 = 1
        L44:
            return r1
    }

    private static boolean looksLikeVirtualTouchName(java.lang.String r1) {
            java.lang.String r0 = "virtual"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "touchscreen"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "touch mapping"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "touchmapping"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "uinput"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "gpio"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "keypad"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L39
            goto L3b
        L39:
            r1 = 0
            goto L3c
        L3b:
            r1 = 1
        L3c:
            return r1
    }

    private void reloadCursorBitmapIfNeeded(boolean r9) {
            r8 = this;
            android.content.Context r0 = r8.getContext()
            java.lang.String r0 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorStyle(r0)
            android.content.Context r1 = r8.getContext()
            java.lang.String r1 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getCustomMouseCursorPath(r1)
            android.content.Context r2 = r8.getContext()
            int r2 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorSizePercent(r2)
            java.lang.String r3 = r8.loadedCursorStyle
            boolean r3 = r0.equals(r3)
            r4 = 1
            r5 = 0
            java.lang.String r6 = r8.loadedCustomCursorPath
            if (r1 != 0) goto L2a
            if (r6 != 0) goto L28
            r6 = r4
            goto L2e
        L28:
            r6 = r5
            goto L2e
        L2a:
            boolean r6 = r1.equals(r6)
        L2e:
            int r7 = r8.loadedCursorSizePercent
            if (r2 != r7) goto L33
            goto L34
        L33:
            r4 = r5
        L34:
            if (r9 != 0) goto L3d
            if (r3 == 0) goto L3d
            if (r6 == 0) goto L3d
            if (r4 == 0) goto L3d
            return
        L3d:
            r8.loadedCursorStyle = r0
            r8.loadedCustomCursorPath = r1
            r8.loadedCursorSizePercent = r2
            android.content.Context r9 = r8.getContext()
            android.graphics.Bitmap r9 = loadCursorBitmap(r9, r0, r1)
            r8.cursorBitmap = r9
            android.graphics.drawable.Drawable r9 = r8.cursorDrawable
            r9.invalidateSelf()
            return
    }

    private static void resetBridgeCursorToCenter() {
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L3e
            if (r0 <= 0) goto L8
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L3e
        L6:
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L3e
            goto Lb
        L8:
            int r0 = org.lwjgl.glfw.CallbackBridge.physicalWidth     // Catch: java.lang.Throwable -> L3e
            goto L6
        Lb:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Throwable -> L3e
            int r2 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L3e
            if (r2 <= 0) goto L19
            int r2 = org.lwjgl.glfw.CallbackBridge.windowHeight     // Catch: java.lang.Throwable -> L3e
        L17:
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L3e
            goto L1c
        L19:
            int r2 = org.lwjgl.glfw.CallbackBridge.physicalHeight     // Catch: java.lang.Throwable -> L3e
            goto L17
        L1c:
            float r2 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r3 = 1
            org.lwjgl.glfw.CallbackBridge.setInputReady(r3)     // Catch: java.lang.Throwable -> L3e
            float r0 = r0 - r1
            r3 = 0
            float r0 = java.lang.Math.max(r3, r0)     // Catch: java.lang.Throwable -> L3e
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            org.lwjgl.glfw.CallbackBridge.mouseX = r0     // Catch: java.lang.Throwable -> L3e
            float r2 = r2 - r1
            float r0 = java.lang.Math.max(r3, r2)     // Catch: java.lang.Throwable -> L3e
            float r0 = r0 / r4
            org.lwjgl.glfw.CallbackBridge.mouseY = r0     // Catch: java.lang.Throwable -> L3e
            float r0 = org.lwjgl.glfw.CallbackBridge.mouseX     // Catch: java.lang.Throwable -> L3e
            float r1 = org.lwjgl.glfw.CallbackBridge.mouseY     // Catch: java.lang.Throwable -> L3e
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r0, r1)     // Catch: java.lang.Throwable -> L3e
        L3e:
            return
    }

    private static java.lang.String safeLower(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto Lb
        L5:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
        Lb:
            return r1
    }

    private void updateFromBridge() {
            r7 = this;
            r7.attachDrawableToParent()
            r0 = 0
            r7.reloadCursorBitmapIfNeeded(r0)
            ca.dnamobile.javalauncher.input.GamepadMappingStore r1 = r7.mappingStore
            boolean r1 = r1.isForceGameMode()
            r2 = 1
            if (r1 != 0) goto L18
            boolean r1 = org.lwjgl.glfw.CallbackBridge.isGrabbing()
            if (r1 != 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            boolean r3 = hasPhysicalPointerDevice()
            android.content.Context r4 = r7.getContext()
            boolean r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.isVirtualMouseEnabled(r4)
            if (r4 == 0) goto L2d
            if (r1 == 0) goto L2d
            if (r3 != 0) goto L2d
            r3 = r2
            goto L2e
        L2d:
            r3 = r0
        L2e:
            ca.dnamobile.javalauncher.input.GamepadMappingStore r4 = r7.mappingStore
            boolean r4 = r4.isShowCursorOverlay()
            if (r4 == 0) goto L3a
            if (r1 == 0) goto L3a
            r4 = r2
            goto L3b
        L3a:
            r4 = r0
        L3b:
            if (r3 != 0) goto L42
            if (r4 == 0) goto L40
            goto L42
        L40:
            r3 = r0
            goto L43
        L42:
            r3 = r2
        L43:
            if (r3 == 0) goto L52
            boolean r4 = r7.lastShouldShow
            if (r4 == 0) goto L4f
            boolean r4 = r7.lastMenuMode
            if (r4 != 0) goto L52
            if (r1 == 0) goto L52
        L4f:
            resetBridgeCursorToCenter()
        L52:
            r7.lastMenuMode = r1
            r7.lastShouldShow = r3
            r7.cursorVisible = r3
            if (r3 == 0) goto Le4
            android.view.ViewGroup r1 = r7.overlayParent
            if (r1 != 0) goto L60
            goto Le4
        L60:
            int r0 = r1.getWidth()
            int r0 = java.lang.Math.max(r2, r0)
            android.view.ViewGroup r1 = r7.overlayParent
            int r1 = r1.getHeight()
            int r1 = java.lang.Math.max(r2, r1)
            r3 = 1105199104(0x41e00000, float:28.0)
            float r3 = r7.dp(r3)
            android.content.Context r4 = r7.getContext()
            int r4 = ca.dnamobile.javalauncher.controls.ControlsPreferences.getMouseCursorSizePercent(r4)
            float r4 = (float) r4
            float r3 = r3 * r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r4
            int r3 = java.lang.Math.round(r3)
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = org.lwjgl.glfw.CallbackBridge.windowWidth
            if (r3 <= 0) goto L94
            int r3 = org.lwjgl.glfw.CallbackBridge.windowWidth
            goto L96
        L94:
            int r3 = org.lwjgl.glfw.CallbackBridge.physicalWidth
        L96:
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.max(r4, r3)
            int r5 = org.lwjgl.glfw.CallbackBridge.windowHeight
            if (r5 <= 0) goto La4
            int r5 = org.lwjgl.glfw.CallbackBridge.windowHeight
            goto La6
        La4:
            int r5 = org.lwjgl.glfw.CallbackBridge.physicalHeight
        La6:
            float r5 = (float) r5
            float r5 = java.lang.Math.max(r4, r5)
            float r6 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r0 = (float) r0
            float r6 = r6 * r0
            float r6 = r6 / r3
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseY
            float r1 = (float) r1
            float r3 = r3 * r1
            float r3 = r3 / r5
            float r0 = r0 - r4
            r5 = 0
            float r0 = java.lang.Math.max(r5, r0)
            float r0 = clamp(r6, r5, r0)
            float r1 = r1 - r4
            float r1 = java.lang.Math.max(r5, r1)
            float r1 = clamp(r3, r5, r1)
            float r3 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r0 = r0 - r3
            int r0 = java.lang.Math.round(r0)
            float r1 = r1 - r3
            int r1 = java.lang.Math.round(r1)
            android.graphics.drawable.Drawable r3 = r7.cursorDrawable
            int r4 = r0 + r2
            int r2 = r2 + r1
            r3.setBounds(r0, r1, r4, r2)
            android.graphics.drawable.Drawable r0 = r7.cursorDrawable
            r0.invalidateSelf()
            return
        Le4:
            android.graphics.drawable.Drawable r1 = r7.cursorDrawable
            r1.setBounds(r0, r0, r0, r0)
            android.graphics.drawable.Drawable r0 = r7.cursorDrawable
            r0.invalidateSelf()
            return
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 8
            r1.setVisibility(r0)
            r1.attachDrawableToParent()
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            r0.detachDrawableFromParent()
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 1
            r0.setMeasuredDimension(r1, r1)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void removeSelf() {
            r2 = this;
            r0 = 1
            r2.removed = r0
            r0 = 0
            r2.cursorVisible = r0
            android.graphics.drawable.Drawable r1 = r2.cursorDrawable
            r1.setBounds(r0, r0, r0, r0)
            android.graphics.drawable.Drawable r0 = r2.cursorDrawable
            r0.invalidateSelf()
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            android.view.Choreographer$FrameCallback r1 = r2.frameCallback
            r0.removeFrameCallback(r1)
            r2.detachDrawableFromParent()
            return
    }
}
