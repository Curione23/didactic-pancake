package ca.dnamobile.javalauncher.input;

/* JADX INFO: loaded from: classes.dex */
public final class GamepadInputController {
    private static final float BASE_DPAD_CURSOR_STEP = 14.0f;
    private static final float BASE_GAME_CAMERA_SENSITIVITY = 18.0f;
    private static final float BASE_MENU_CURSOR_SENSITIVITY = 26.0f;
    private static final float CURSOR_ACTION_BASE_STEP = 72.0f;
    private static final float DEADZONE = 0.25f;
    private static final int DIRECTION_EAST = 0;
    private static final int DIRECTION_NONE = -1;
    private static final int DIRECTION_NORTH = 2;
    private static final int DIRECTION_NORTH_EAST = 1;
    private static final int DIRECTION_NORTH_WEST = 3;
    private static final int DIRECTION_SOUTH = 6;
    private static final int DIRECTION_SOUTH_EAST = 7;
    private static final int DIRECTION_SOUTH_WEST = 5;
    private static final int DIRECTION_WEST = 4;
    private static final long GAME_REGRAB_CAMERA_SETTLE_NANOS = 120000000;
    private static final long GAME_REGRAB_STALE_STICK_TIMEOUT_NANOS = 650000000;
    private static final float HAT_THRESHOLD = 0.85f;
    private static final java.lang.String TAG = "GamepadInputController";
    private static final float TRIGGER_THRESHOLD = 0.5f;
    private final java.util.EnumMap<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadInputController.ActiveMappedAction[]> activeButtonActions;
    private android.view.InputDevice activeDevice;
    private final android.view.Choreographer choreographer;
    private final android.content.Context context;
    private int currentDirection;
    private final android.view.Choreographer.FrameCallback frameCallback;
    private boolean hatDown;
    private boolean hatLeft;
    private boolean hatRight;
    private boolean hatUp;
    private long lastFrameNanos;
    private boolean lastGameMode;
    private boolean leftTriggerDown;
    private float leftX;
    private float leftY;
    private final ca.dnamobile.javalauncher.input.GamepadInputController.MappingRequestListener mappingRequestListener;
    private final ca.dnamobile.javalauncher.input.GamepadMappingStore mappingStore;
    private boolean removed;
    private boolean requireRightStickNeutralBeforeCamera;
    private boolean rightTriggerDown;
    private float rightX;
    private float rightY;
    private long suppressCameraUntilNanos;


    /* JADX INFO: renamed from: ca.dnamobile.javalauncher.input.GamepadInputController$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton = null;

        static {
                ca.dnamobile.javalauncher.input.GamepadButton[] r0 = ca.dnamobile.javalauncher.input.GamepadButton.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ca.dnamobile.javalauncher.input.GamepadInputController.AnonymousClass2.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton = r0
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_UP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadInputController.AnonymousClass2.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L1d
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_DOWN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadInputController.AnonymousClass2.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L28
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_LEFT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = ca.dnamobile.javalauncher.input.GamepadInputController.AnonymousClass2.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton     // Catch: java.lang.NoSuchFieldError -> L33
                ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_RIGHT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    private static final class ActiveMappedAction {
        final ca.dnamobile.javalauncher.input.GamepadAction action;
        final boolean gameMode;
        final boolean pulseMenuMouseClick;

        ActiveMappedAction(ca.dnamobile.javalauncher.input.GamepadAction r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.action = r1
                r0.pulseMenuMouseClick = r2
                r0.gameMode = r3
                return
        }
    }

    public interface MappingRequestListener {
        void onRequestControllerMapping();
    }

    /* JADX INFO: renamed from: -$$Nest$fgetchoreographer, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.view.Choreographer m462$$Nest$fgetchoreographer(ca.dnamobile.javalauncher.input.GamepadInputController r0) {
            android.view.Choreographer r0 = r0.choreographer
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetremoved, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m463$$Nest$fgetremoved(ca.dnamobile.javalauncher.input.GamepadInputController r0) {
            boolean r0 = r0.removed
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$mtick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m464$$Nest$mtick(ca.dnamobile.javalauncher.input.GamepadInputController r0, long r1) {
            r0.tick(r1)
            return
    }

    public GamepadInputController(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public GamepadInputController(android.view.View r5, ca.dnamobile.javalauncher.input.GamepadInputController.MappingRequestListener r6) {
            r4 = this;
            r4.<init>()
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.choreographer = r0
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<ca.dnamobile.javalauncher.input.GamepadButton> r2 = ca.dnamobile.javalauncher.input.GamepadButton.class
            r1.<init>(r2)
            r4.activeButtonActions = r1
            long r1 = java.lang.System.nanoTime()
            r4.lastFrameNanos = r1
            r1 = -1
            r4.currentDirection = r1
            ca.dnamobile.javalauncher.input.GamepadInputController$1 r1 = new ca.dnamobile.javalauncher.input.GamepadInputController$1
            r1.<init>(r4)
            r4.frameCallback = r1
            android.content.Context r2 = r5.getContext()
            android.content.Context r2 = r2.getApplicationContext()
            r4.context = r2
            android.content.Context r2 = r5.getContext()
            ca.dnamobile.javalauncher.input.GamepadMappingStore r2 = ca.dnamobile.javalauncher.input.GamepadMappingStore.get(r2)
            r4.mappingStore = r2
            r4.mappingRequestListener = r6
            r6 = 1
            r5.setFocusable(r6)
            r5.setFocusableInTouchMode(r6)
            r5.requestFocus()
            int r5 = org.lwjgl.glfw.CallbackBridge.windowWidth
            int r5 = java.lang.Math.max(r6, r5)
            float r5 = (float) r5
            r2 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r2
            int r3 = org.lwjgl.glfw.CallbackBridge.windowHeight
            int r6 = java.lang.Math.max(r6, r3)
            float r6 = (float) r6
            float r6 = r6 / r2
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r5, r6)
            boolean r5 = r4.isGameMode()
            r4.lastGameMode = r5
            r0.postFrameCallback(r1)
            return
    }

    private void addCursorRepeat(float[] r6, ca.dnamobile.javalauncher.input.GamepadButton r7, boolean r8, float r9) {
            r5 = this;
            if (r8 != 0) goto L3
            return
        L3:
            ca.dnamobile.javalauncher.input.GamepadMappingStore r8 = r5.mappingStore
            android.view.InputDevice r0 = r5.activeDevice
            r1 = 0
            ca.dnamobile.javalauncher.input.GamepadAction[] r7 = r8.getButtonActions(r7, r1, r0)
            int r8 = r7.length
            r0 = r1
        Le:
            if (r0 >= r8) goto L33
            r2 = r7[r0]
            if (r2 == 0) goto L30
            boolean r3 = r2.isCursorAction()
            if (r3 != 0) goto L1b
            goto L30
        L1b:
            r3 = r6[r1]
            float r4 = r2.getCursorDx()
            float r4 = r4 * r9
            float r3 = r3 + r4
            r6[r1] = r3
            r3 = 1
            r4 = r6[r3]
            float r2 = r2.getCursorDy()
            float r2 = r2 * r9
            float r4 = r4 + r2
            r6[r3] = r4
        L30:
            int r0 = r0 + 1
            goto Le
        L33:
            return
    }

    private float[] addDpadCursorRepeat(float r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_LEFT
            boolean r2 = r3.hatLeft
            r3.addCursorRepeat(r0, r1, r2, r4)
            ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_RIGHT
            boolean r2 = r3.hatRight
            r3.addCursorRepeat(r0, r1, r2, r4)
            ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_UP
            boolean r2 = r3.hatUp
            r3.addCursorRepeat(r0, r1, r2, r4)
            ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_DOWN
            boolean r2 = r3.hatDown
            r3.addCursorRepeat(r0, r1, r2, r4)
            return r0
    }

    private void blockCameraAfterMenuClose(long r6, java.lang.String r8) {
            r5 = this;
            boolean r0 = r5.isRightStickNeutral()
            r1 = r0 ^ 1
            r5.clearLeftStickAxes()
            if (r0 == 0) goto Le
            r5.clearRightStickAxes()
        Le:
            r5.releaseDirection()
            r5.requireRightStickNeutralBeforeCamera = r1
            long r1 = r5.suppressCameraUntilNanos
            if (r0 != 0) goto L1b
            r3 = 650000000(0x26be3680, double:3.2114267E-315)
            goto L1e
        L1b:
            r3 = 120000000(0x7270e00, double:5.92878775E-316)
        L1e:
            long r6 = r6 + r3
            long r6 = java.lang.Math.max(r1, r6)
            r5.suppressCameraUntilNanos = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r8)
            if (r0 != 0) goto L33
            java.lang.String r7 = "; right stick was active, guarding camera until neutral or timeout"
            goto L35
        L33:
            java.lang.String r7 = "; right stick was neutral, short camera settle only"
        L35:
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "GamepadInputController"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
    }

    private static float clamp(float r0, float r1, float r2) {
            float r0 = java.lang.Math.min(r2, r0)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    private void clearLeftStickAxes() {
            r1 = this;
            r0 = 0
            r1.leftX = r0
            r1.leftY = r0
            return
    }

    private void clearRightStickAxes() {
            r1 = this;
            r0 = 0
            r1.rightX = r0
            r1.rightY = r0
            return
    }

    private static boolean containsMenuEscape(ca.dnamobile.javalauncher.input.GamepadInputController.ActiveMappedAction[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L18
            r3 = r5[r2]
            if (r3 == 0) goto L15
            boolean r4 = r3.gameMode
            if (r4 != 0) goto L15
            ca.dnamobile.javalauncher.input.GamepadAction r3 = r3.action
            ca.dnamobile.javalauncher.input.GamepadAction r4 = ca.dnamobile.javalauncher.input.GamepadAction.ESCAPE
            if (r3 != r4) goto L15
            r5 = 1
            return r5
        L15:
            int r2 = r2 + 1
            goto L3
        L18:
            return r1
    }

    private static java.lang.String describeMappedActions(ca.dnamobile.javalauncher.input.GamepadInputController.ActiveMappedAction[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L35
            r2 = r5[r1]
            if (r2 == 0) goto L32
            ca.dnamobile.javalauncher.input.GamepadAction r3 = r2.action
            ca.dnamobile.javalauncher.input.GamepadAction r4 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            if (r3 != r4) goto L14
            goto L32
        L14:
            int r3 = r0.length()
            if (r3 <= 0) goto L1f
            java.lang.String r3 = " + "
            r0.append(r3)
        L1f:
            java.lang.StringBuilder r3 = r0.append(r1)
            java.lang.String r4 = ":"
            java.lang.StringBuilder r3 = r3.append(r4)
            ca.dnamobile.javalauncher.input.GamepadAction r2 = r2.action
            java.lang.String r2 = r2.name()
            r3.append(r2)
        L32:
            int r1 = r1 + 1
            goto L6
        L35:
            int r5 = r0.length()
            if (r5 != 0) goto L3e
            java.lang.String r5 = "NONE"
            goto L42
        L3e:
            java.lang.String r5 = r0.toString()
        L42:
            return r5
    }

    private static int directionFor(float r4, float r5) {
            float r0 = r4 * r4
            float r1 = r5 * r5
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L12
            r4 = -1
            return r4
        L12:
            float r5 = -r5
            double r0 = (double) r5
            double r4 = (double) r4
            double r4 = java.lang.Math.atan2(r0, r4)
            double r4 = java.lang.Math.toDegrees(r4)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L29
            r0 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r4 = r4 + r0
        L29:
            r0 = 4627026404658118656(0x4036800000000000, double:22.5)
            double r4 = r4 + r0
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r4 = r4 / r0
            int r4 = (int) r4
            int r4 = r4 % 8
            return r4
    }

    private static float getCenteredAxis(android.view.MotionEvent r1, android.view.InputDevice r2, int r3) {
            int r0 = r1.getSource()
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r3, r0)
            r0 = 0
            if (r2 != 0) goto Lc
            return r0
        Lc:
            float r1 = r1.getAxisValue(r3)
            float r2 = r2.getFlat()
            r3 = 1048576000(0x3e800000, float:0.25)
            float r2 = java.lang.Math.max(r2, r3)
            float r3 = java.lang.Math.abs(r1)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L23
            r0 = r1
        L23:
            return r0
    }

    private void handleInputModeChanged(boolean r1, long r2) {
            r0 = this;
            r0.releaseDirection()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "Minecraft input re-grabbed"
            r0.blockCameraAfterMenuClose(r2, r1)
            goto L12
        Lb:
            r1 = 0
            r0.requireRightStickNeutralBeforeCamera = r1
            r1 = 0
            r0.suppressCameraUntilNanos = r1
        L12:
            return
    }

    private boolean isGameMode() {
            r1 = this;
            boolean r0 = org.lwjgl.glfw.CallbackBridge.isGrabbing()
            if (r0 != 0) goto L11
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = r1.mappingStore
            boolean r0 = r0.isForceGameMode()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    private static boolean isGamepadKeyEvent(android.view.KeyEvent r5) {
            int r0 = r5.getSource()
            android.view.InputDevice r1 = r5.getDevice()
            r2 = r0 & 1025(0x401, float:1.436E-42)
            r3 = 1
            r4 = 1025(0x401, float:1.436E-42)
            if (r2 == r4) goto L42
            r2 = 16777232(0x1000010, float:2.3509932E-38)
            r0 = r0 & r2
            if (r0 == r2) goto L42
            if (r1 == 0) goto L26
            int r0 = r1.getSources()
            r0 = r0 & r4
            if (r0 == r4) goto L42
            int r0 = r1.getSources()
            r0 = r0 & r2
            if (r0 != r2) goto L26
            goto L42
        L26:
            int r0 = r5.getKeyCode()
            ca.dnamobile.javalauncher.input.GamepadButton r0 = ca.dnamobile.javalauncher.input.GamepadButton.fromAndroidKeyCode(r0)
            if (r0 != 0) goto L42
            int r0 = r5.getKeyCode()
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L42
            int r5 = r5.getKeyCode()
            r0 = 82
            if (r5 != r0) goto L41
            goto L42
        L41:
            r3 = 0
        L42:
            return r3
    }

    private static boolean isGamepadMotionEvent(android.view.MotionEvent r3) {
            int r0 = r3.getSource()
            r1 = 16777232(0x1000010, float:2.3509932E-38)
            r2 = r0 & r1
            if (r2 == r1) goto L10
            r1 = 1025(0x401, float:1.436E-42)
            r0 = r0 & r1
            if (r0 != r1) goto L19
        L10:
            int r3 = r3.getActionMasked()
            r0 = 2
            if (r3 != r0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            return r3
    }

    private static boolean isPointerMotionEvent(android.view.MotionEvent r5) {
            int r0 = r5.getSource()
            r1 = 16777232(0x1000010, float:2.3509932E-38)
            r2 = r0 & r1
            r3 = 0
            if (r2 == r1) goto L2c
            r1 = r0 & 1025(0x401, float:1.436E-42)
            r2 = 1025(0x401, float:1.436E-42)
            if (r1 != r2) goto L13
            goto L2c
        L13:
            r1 = r0 & 4098(0x1002, float:5.743E-42)
            r2 = 1
            r4 = 4098(0x1002, float:5.743E-42)
            if (r1 == r4) goto L2b
            r1 = r0 & 8194(0x2002, float:1.1482E-41)
            r4 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r4) goto L2b
            r1 = 16386(0x4002, float:2.2962E-41)
            r0 = r0 & r1
            if (r0 == r1) goto L2b
            int r5 = r5.getPointerCount()
            if (r5 <= r2) goto L2c
        L2b:
            r3 = r2
        L2c:
            return r3
    }

    private boolean isRightStickNeutral() {
            r2 = this;
            float r0 = r2.rightX
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            float r0 = r2.rightY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    private float menuCursorResolutionScale() {
            r6 = this;
            r0 = 1075838976(0x40200000, float:2.5)
            r1 = 1051931443(0x3eb33333, float:0.35)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = org.lwjgl.glfw.CallbackBridge.windowWidth     // Catch: java.lang.Throwable -> L35
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L35
            int r4 = org.lwjgl.glfw.CallbackBridge.physicalWidth     // Catch: java.lang.Throwable -> L35
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L35
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 <= 0) goto L35
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L35
            float r3 = r3 / r4
            r4 = 1028443341(0x3d4ccccd, float:0.05)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L35
            r4 = 1082130432(0x40800000, float:4.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L35
            float r4 = r3 - r2
            float r4 = java.lang.Math.abs(r4)     // Catch: java.lang.Throwable -> L35
            r5 = 1020054733(0x3ccccccd, float:0.025)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L35
            float r0 = clamp(r3, r1, r0)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            android.content.Context r3 = r6.context     // Catch: java.lang.Throwable -> L46
            int r3 = ca.dnamobile.javalauncher.settings.LauncherPreferences.getGameResolutionScalePercent(r3)     // Catch: java.lang.Throwable -> L46
            if (r3 <= 0) goto L46
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L46
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r4
            float r0 = clamp(r3, r1, r0)     // Catch: java.lang.Throwable -> L46
            return r0
        L46:
            return r2
    }

    private static void performMappedActions(ca.dnamobile.javalauncher.input.GamepadInputController.ActiveMappedAction[] r5, boolean r6) {
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L1b
            int r6 = r5.length
        L5:
            if (r0 >= r6) goto L33
            r2 = r5[r0]
            if (r2 == 0) goto L18
            ca.dnamobile.javalauncher.input.GamepadAction r3 = r2.action
            ca.dnamobile.javalauncher.input.GamepadAction r4 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            if (r3 == r4) goto L18
            ca.dnamobile.javalauncher.input.GamepadAction r3 = r2.action
            boolean r2 = r2.pulseMenuMouseClick
            r3.perform(r1, r2)
        L18:
            int r0 = r0 + 1
            goto L5
        L1b:
            int r6 = r5.length
            int r6 = r6 - r1
        L1d:
            if (r6 < 0) goto L33
            r1 = r5[r6]
            if (r1 == 0) goto L30
            ca.dnamobile.javalauncher.input.GamepadAction r2 = r1.action
            ca.dnamobile.javalauncher.input.GamepadAction r3 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
            if (r2 == r3) goto L30
            ca.dnamobile.javalauncher.input.GamepadAction r2 = r1.action
            boolean r1 = r1.pulseMenuMouseClick
            r2.perform(r0, r1)
        L30:
            int r6 = r6 + (-1)
            goto L1d
        L33:
            return
    }

    private void prepareForLikelyMenuCloseFromController(ca.dnamobile.javalauncher.input.GamepadButton r5) {
            r4 = this;
            long r0 = java.lang.System.nanoTime()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Menu close requested by "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r4.blockCameraAfterMenuClose(r0, r5)
            return
    }

    private void releaseAllMappedButtons() {
            r3 = this;
            java.util.EnumMap<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[]> r0 = r3.activeButtonActions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.EnumMap<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[]> r0 = r3.activeButtonActions
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[] r1 = (ca.dnamobile.javalauncher.input.GamepadInputController.ActiveMappedAction[]) r1
            if (r1 == 0) goto L13
            r2 = 0
            performMappedActions(r1, r2)
            goto L13
        L26:
            java.util.EnumMap<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[]> r0 = r3.activeButtonActions
            r0.clear()
            return
    }

    private void releaseDirection() {
            r2 = this;
            int r0 = r2.currentDirection
            r1 = 0
            r2.sendDirectional(r0, r1)
            r0 = -1
            r2.currentDirection = r0
            return
    }

    private void rememberDevice(android.view.InputDevice r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r1.activeDevice = r2
            ca.dnamobile.javalauncher.input.GamepadMappingStore r0 = r1.mappingStore
            r0.rememberDevice(r2)
            return
    }

    private ca.dnamobile.javalauncher.input.GamepadInputController.ActiveMappedAction[] resolveMappedActions(ca.dnamobile.javalauncher.input.GamepadButton r8, android.view.InputDevice r9) {
            r7 = this;
            boolean r0 = r7.isGameMode()
            ca.dnamobile.javalauncher.input.GamepadMappingStore r1 = r7.mappingStore
            ca.dnamobile.javalauncher.input.GamepadAction[] r9 = r1.getButtonActions(r8, r0, r9)
            int r1 = r9.length
            ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[] r1 = new ca.dnamobile.javalauncher.input.GamepadInputController.ActiveMappedAction[r1]
            r2 = 0
            r3 = r2
        Lf:
            int r4 = r9.length
            if (r3 >= r4) goto L65
            r4 = r9[r3]
            if (r4 != 0) goto L18
            ca.dnamobile.javalauncher.input.GamepadAction r4 = ca.dnamobile.javalauncher.input.GamepadAction.NONE
        L18:
            if (r0 != 0) goto L50
            ca.dnamobile.javalauncher.input.GamepadButton r5 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_A
            if (r8 == r5) goto L26
            ca.dnamobile.javalauncher.input.GamepadButton r5 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_R2
            if (r8 == r5) goto L26
            ca.dnamobile.javalauncher.input.GamepadButton r5 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_CENTER
            if (r8 != r5) goto L50
        L26:
            ca.dnamobile.javalauncher.input.GamepadAction r5 = ca.dnamobile.javalauncher.input.GamepadAction.ENTER
            if (r4 != r5) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Overriding old menu "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r5 = " slot "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r5 = " ENTER mapping to MOUSE_LEFT"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "GamepadInputController"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r4)
            ca.dnamobile.javalauncher.input.GamepadAction r4 = ca.dnamobile.javalauncher.input.GamepadAction.MOUSE_LEFT
        L50:
            if (r0 != 0) goto L5a
            boolean r5 = r4.isMouseButton()
            if (r5 == 0) goto L5a
            r5 = 1
            goto L5b
        L5a:
            r5 = r2
        L5b:
            ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction r6 = new ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction
            r6.<init>(r4, r5, r0)
            r1[r3] = r6
            int r3 = r3 + 1
            goto Lf
        L65:
            return r1
    }

    private void sendDirectional(int r1, boolean r2) {
            r0 = this;
            switch(r1) {
                case 0: goto L42;
                case 1: goto L37;
                case 2: goto L31;
                case 3: goto L26;
                case 4: goto L20;
                case 5: goto L15;
                case 6: goto Lf;
                case 7: goto L4;
                default: goto L3;
            }
        L3:
            goto L47
        L4:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.RIGHT
            r1.perform(r2)
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.BACKWARD
            r1.perform(r2)
            goto L47
        Lf:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.BACKWARD
            r1.perform(r2)
            goto L47
        L15:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.BACKWARD
            r1.perform(r2)
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.LEFT
            r1.perform(r2)
            goto L47
        L20:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.LEFT
            r1.perform(r2)
            goto L47
        L26:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.FORWARD
            r1.perform(r2)
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.LEFT
            r1.perform(r2)
            goto L47
        L31:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.FORWARD
            r1.perform(r2)
            goto L47
        L37:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.FORWARD
            r1.perform(r2)
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.RIGHT
            r1.perform(r2)
            goto L47
        L42:
            ca.dnamobile.javalauncher.input.GamepadAction r1 = ca.dnamobile.javalauncher.input.GamepadAction.RIGHT
            r1.perform(r2)
        L47:
            return
    }

    private void sendMappedButton(ca.dnamobile.javalauncher.input.GamepadButton r4, boolean r5, android.view.InputDevice r6) {
            r3 = this;
            if (r5 == 0) goto Lc
            ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[] r0 = r3.resolveMappedActions(r4, r6)
            java.util.EnumMap<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[]> r1 = r3.activeButtonActions
            r1.put(r4, r0)
            goto L1a
        Lc:
            java.util.EnumMap<ca.dnamobile.javalauncher.input.GamepadButton, ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[]> r0 = r3.activeButtonActions
            java.lang.Object r0 = r0.remove(r4)
            ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[] r0 = (ca.dnamobile.javalauncher.input.GamepadInputController.ActiveMappedAction[]) r0
            if (r0 != 0) goto L1a
            ca.dnamobile.javalauncher.input.GamepadInputController$ActiveMappedAction[] r0 = r3.resolveMappedActions(r4, r6)
        L1a:
            if (r5 == 0) goto L25
            boolean r1 = containsMenuEscape(r0)
            if (r1 == 0) goto L25
            r3.prepareForLikelyMenuCloseFromController(r4)
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Button="
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", down="
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r1 = ", profile="
            java.lang.StringBuilder r4 = r4.append(r1)
            ca.dnamobile.javalauncher.input.GamepadMappingStore r1 = r3.mappingStore
            java.lang.String r6 = r1.profileKeyForDevice(r6)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ", actions="
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = describeMappedActions(r0)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ", cursor="
            java.lang.StringBuilder r4 = r4.append(r6)
            float r6 = org.lwjgl.glfw.CallbackBridge.mouseX
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ","
            java.lang.StringBuilder r4 = r4.append(r6)
            float r6 = org.lwjgl.glfw.CallbackBridge.mouseY
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "GamepadInputController"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r4)
            performMappedActions(r0, r5)
            return
    }

    private boolean shouldBlockCameraInput(long r9) {
            r8 = this;
            boolean r0 = r8.isRightStickNeutral()
            long r1 = r8.suppressCameraUntilNanos
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r3 >= 0) goto Le
            r3 = r4
            goto Lf
        Le:
            r3 = r5
        Lf:
            boolean r6 = r8.requireRightStickNeutralBeforeCamera
            if (r6 == 0) goto L2e
            if (r0 != 0) goto L17
            if (r3 != 0) goto L2e
        L17:
            r8.requireRightStickNeutralBeforeCamera = r5
            if (r0 == 0) goto L2e
            if (r3 == 0) goto L2e
            r6 = 120000000(0x7270e00, double:5.92878775E-316)
            long r6 = r6 + r9
            long r0 = java.lang.Math.min(r1, r6)
            r8.suppressCameraUntilNanos = r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L2d
            r3 = r4
            goto L2e
        L2d:
            r3 = r5
        L2e:
            if (r3 != 0) goto L36
            boolean r9 = r8.requireRightStickNeutralBeforeCamera
            if (r9 == 0) goto L35
            goto L36
        L35:
            r4 = r5
        L36:
            return r4
    }

    private void tick(long r4) {
            r3 = this;
            long r0 = r3.lastFrameNanos
            long r0 = r4 - r0
            float r0 = (float) r0
            r1 = 1266569258(0x4b7e502a, float:1.6666666E7)
            float r0 = r0 / r1
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L14
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L16
        L14:
            r0 = 1065353216(0x3f800000, float:1.0)
        L16:
            boolean r1 = r3.isGameMode()
            boolean r2 = r3.lastGameMode
            if (r1 == r2) goto L26
            r3.handleInputModeChanged(r1, r4)
            r3.lastGameMode = r1
            r3.lastFrameNanos = r4
            return
        L26:
            if (r1 == 0) goto L2c
            r3.tickCamera(r0, r4)
            goto L2f
        L2c:
            r3.tickMenuCursor(r0)
        L2f:
            r3.lastFrameNanos = r4
            return
    }

    private void tickCamera(float r3, long r4) {
            r2 = this;
            boolean r4 = r2.shouldBlockCameraInput(r4)
            if (r4 == 0) goto L7
            return
        L7:
            float r4 = r2.rightX
            r5 = 0
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L15
            float r0 = r2.rightY
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L15
            return
        L15:
            float r4 = r4 * r4
            float r5 = r2.rightY
            float r5 = r5 * r5
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r5, r4)
            float r4 = r4 * r4
            ca.dnamobile.javalauncher.input.GamepadMappingStore r5 = r2.mappingStore
            float r5 = r5.getGameCameraSensitivityMultiplier()
            r0 = 1099956224(0x41900000, float:18.0)
            float r5 = r5 * r0
            float r0 = r2.rightX
            float r0 = r0 * r4
            float r0 = r0 * r5
            float r0 = r0 * r3
            float r1 = r2.rightY
            float r1 = r1 * r4
            float r1 = r1 * r5
            float r1 = r1 * r3
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r3 = r3 + r0
            org.lwjgl.glfw.CallbackBridge.mouseX = r3
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseY
            float r3 = r3 + r1
            org.lwjgl.glfw.CallbackBridge.mouseY = r3
            float r3 = org.lwjgl.glfw.CallbackBridge.mouseX
            float r4 = org.lwjgl.glfw.CallbackBridge.mouseY
            org.lwjgl.glfw.CallbackBridge.sendCursorPos(r3, r4)
            return
    }

    private void tickMenuCursor(float r8) {
            r7 = this;
            float r0 = r7.rightX
            float r0 = java.lang.Math.abs(r0)
            float r1 = r7.leftX
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L13
            float r0 = r7.rightX
            goto L15
        L13:
            float r0 = r7.leftX
        L15:
            float r1 = r7.rightY
            float r1 = java.lang.Math.abs(r1)
            float r2 = r7.leftY
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L28
            float r1 = r7.rightY
            goto L2a
        L28:
            float r1 = r7.leftY
        L2a:
            ca.dnamobile.javalauncher.input.GamepadMappingStore r2 = r7.mappingStore
            float r2 = r2.getMenuCursorSensitivityMultiplier()
            float r3 = r7.menuCursorResolutionScale()
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 != 0) goto L41
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 == 0) goto L3e
            goto L41
        L3e:
            r0 = r4
            r1 = r0
            goto L66
        L41:
            float r5 = r0 * r0
            float r6 = r1 * r1
            float r5 = r5 + r6
            double r5 = (double) r5
            double r5 = java.lang.Math.sqrt(r5)
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r6, r5)
            r6 = 1051931443(0x3eb33333, float:0.35)
            float r5 = r5 * r5
            float r5 = java.lang.Math.max(r6, r5)
            r6 = 1104150528(0x41d00000, float:26.0)
            float r6 = r6 * r2
            float r6 = r6 * r3
            float r0 = r0 * r5
            float r0 = r0 * r6
            float r0 = r0 * r8
            float r0 = r0 + r4
            float r1 = r1 * r5
            float r1 = r1 * r6
            float r1 = r1 * r8
            float r1 = r1 + r4
        L66:
            r5 = 1044847730(0x3e471c72, float:0.19444445)
            float r2 = r2 * r5
            float r2 = r2 * r3
            float r2 = r2 * r8
            float[] r8 = r7.addDpadCursorRepeat(r2)
            r2 = 0
            r2 = r8[r2]
            float r0 = r0 + r2
            r2 = 1
            r8 = r8[r2]
            float r1 = r1 + r8
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L80
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 == 0) goto L83
        L80:
            ca.dnamobile.javalauncher.input.GamepadAction.moveCursorBy(r0, r1)
        L83:
            return
    }

    private void updateDirection() {
            r3 = this;
            boolean r0 = r3.isGameMode()
            if (r0 != 0) goto La
            r3.releaseDirection()
            return
        La:
            float r0 = r3.leftX
            float r1 = r3.leftY
            int r0 = directionFor(r0, r1)
            int r1 = r3.currentDirection
            if (r0 != r1) goto L17
            return
        L17:
            r2 = 0
            r3.sendDirectional(r1, r2)
            r3.currentDirection = r0
            r1 = 1
            r3.sendDirectional(r0, r1)
            return
    }

    private void updateHatButton(ca.dnamobile.javalauncher.input.GamepadButton r3, boolean r4, android.view.InputDevice r5) {
            r2 = this;
            int[] r0 = ca.dnamobile.javalauncher.input.GamepadInputController.AnonymousClass2.$SwitchMap$ca$dnamobile$javalauncher$input$GamepadButton
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L36
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 == r1) goto L20
            r1 = 4
            if (r0 == r1) goto L15
            goto L40
        L15:
            boolean r0 = r2.hatRight
            if (r0 != r4) goto L1a
            return
        L1a:
            r2.hatRight = r4
            r2.sendMappedButton(r3, r4, r5)
            goto L40
        L20:
            boolean r0 = r2.hatLeft
            if (r0 != r4) goto L25
            return
        L25:
            r2.hatLeft = r4
            r2.sendMappedButton(r3, r4, r5)
            goto L40
        L2b:
            boolean r0 = r2.hatDown
            if (r0 != r4) goto L30
            return
        L30:
            r2.hatDown = r4
            r2.sendMappedButton(r3, r4, r5)
            goto L40
        L36:
            boolean r0 = r2.hatUp
            if (r0 != r4) goto L3b
            return
        L3b:
            r2.hatUp = r4
            r2.sendMappedButton(r3, r4, r5)
        L40:
            return
    }

    private void updateTrigger(boolean r1, boolean r2, android.view.InputDevice r3) {
            r0 = this;
            if (r1 == 0) goto Lf
            boolean r1 = r0.leftTriggerDown
            if (r1 != r2) goto L7
            return
        L7:
            r0.leftTriggerDown = r2
            ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_L2
            r0.sendMappedButton(r1, r2, r3)
            goto L1b
        Lf:
            boolean r1 = r0.rightTriggerDown
            if (r1 != r2) goto L14
            return
        L14:
            r0.rightTriggerDown = r2
            ca.dnamobile.javalauncher.input.GamepadButton r1 = ca.dnamobile.javalauncher.input.GamepadButton.BUTTON_R2
            r0.sendMappedButton(r1, r2, r3)
        L1b:
            return
    }

    public boolean handleKeyEvent(android.view.KeyEvent r7) {
            r6 = this;
            boolean r0 = isGamepadKeyEvent(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r7.getAction()
            r2 = 1
            if (r0 == 0) goto L12
            if (r0 == r2) goto L12
            return r1
        L12:
            android.view.InputDevice r3 = r7.getDevice()
            r6.rememberDevice(r3)
            int r4 = r7.getKeyCode()
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 == r5) goto L45
            int r4 = r7.getKeyCode()
            r5 = 82
            if (r4 != r5) goto L2a
            goto L45
        L2a:
            int r4 = r7.getKeyCode()
            ca.dnamobile.javalauncher.input.GamepadButton r4 = ca.dnamobile.javalauncher.input.GamepadButton.fromAndroidKeyCode(r4)
            if (r4 != 0) goto L35
            return r1
        L35:
            if (r0 != 0) goto L3e
            int r7 = r7.getRepeatCount()
            if (r7 <= 0) goto L3e
            return r2
        L3e:
            if (r0 != 0) goto L41
            r1 = r2
        L41:
            r6.sendMappedButton(r4, r1, r3)
            return r2
        L45:
            if (r0 != r2) goto L4e
            ca.dnamobile.javalauncher.input.GamepadInputController$MappingRequestListener r7 = r6.mappingRequestListener
            if (r7 == 0) goto L4e
            r7.onRequestControllerMapping()
        L4e:
            return r2
    }

    public boolean handleMotionEvent(android.view.MotionEvent r9) {
            r8 = this;
            boolean r0 = isGamepadMotionEvent(r9)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = isPointerMotionEvent(r9)
            if (r0 == 0) goto Lf
            return r1
        Lf:
            android.view.InputDevice r0 = r9.getDevice()
            if (r0 != 0) goto L16
            return r1
        L16:
            r8.rememberDevice(r0)
            float r2 = getCenteredAxis(r9, r0, r1)
            r8.leftX = r2
            r2 = 1
            float r3 = getCenteredAxis(r9, r0, r2)
            r8.leftY = r3
            r3 = 11
            float r3 = getCenteredAxis(r9, r0, r3)
            r8.rightX = r3
            r3 = 14
            float r3 = getCenteredAxis(r9, r0, r3)
            r8.rightY = r3
            float r3 = r8.rightX
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L45
            r3 = 12
            float r3 = getCenteredAxis(r9, r0, r3)
            r8.rightX = r3
        L45:
            float r3 = r8.rightY
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L53
            r3 = 13
            float r3 = getCenteredAxis(r9, r0, r3)
            r8.rightY = r3
        L53:
            r8.updateDirection()
            ca.dnamobile.javalauncher.input.GamepadButton r3 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_LEFT
            r4 = 15
            float r5 = getCenteredAxis(r9, r0, r4)
            r6 = -1084647014(0xffffffffbf59999a, float:-0.85)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L67
            r5 = r2
            goto L68
        L67:
            r5 = r1
        L68:
            r8.updateHatButton(r3, r5, r0)
            ca.dnamobile.javalauncher.input.GamepadButton r3 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_RIGHT
            float r4 = getCenteredAxis(r9, r0, r4)
            r5 = 1062836634(0x3f59999a, float:0.85)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L7a
            r4 = r2
            goto L7b
        L7a:
            r4 = r1
        L7b:
            r8.updateHatButton(r3, r4, r0)
            ca.dnamobile.javalauncher.input.GamepadButton r3 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_UP
            r4 = 16
            float r7 = getCenteredAxis(r9, r0, r4)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 >= 0) goto L8c
            r6 = r2
            goto L8d
        L8c:
            r6 = r1
        L8d:
            r8.updateHatButton(r3, r6, r0)
            ca.dnamobile.javalauncher.input.GamepadButton r3 = ca.dnamobile.javalauncher.input.GamepadButton.DPAD_DOWN
            float r4 = getCenteredAxis(r9, r0, r4)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L9c
            r4 = r2
            goto L9d
        L9c:
            r4 = r1
        L9d:
            r8.updateHatButton(r3, r4, r0)
            r3 = 17
            float r3 = getCenteredAxis(r9, r0, r3)
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto Lae
            r3 = r2
            goto Laf
        Lae:
            r3 = r1
        Laf:
            r8.updateTrigger(r2, r3, r0)
            r3 = 18
            float r9 = getCenteredAxis(r9, r0, r3)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto Lbe
            r9 = r2
            goto Lbf
        Lbe:
            r9 = r1
        Lbf:
            r8.updateTrigger(r1, r9, r0)
            return r2
    }

    public void removeSelf() {
            r1 = this;
            r0 = 1
            r1.removed = r0
            r1.releaseDirection()
            r1.releaseAllMappedButtons()
            return
    }
}
