package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Mouse.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Mouse.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Mouse.class */
public class Mouse {
    public static final int EVENT_SIZE = 22;
    private static boolean created;
    private static java.nio.ByteBuffer buttons;
    private static int x;
    private static int y;
    private static int absolute_x;
    private static int absolute_y;
    private static java.nio.IntBuffer coord_buffer;
    private static int dx;
    private static int dy;
    private static int dwheel;
    private static int buttonCount;
    private static boolean hasWheel;
    private static org.lwjgl.input.Cursor currentCursor;
    private static java.lang.String[] buttonName;
    private static final java.util.Map<java.lang.String, java.lang.Integer> buttonMap = null;
    private static boolean initialized;
    private static java.nio.ByteBuffer readBuffer;
    private static int eventButton;
    private static boolean eventState;
    private static int event_dx;
    private static int event_dy;
    private static int event_dwheel;
    private static int event_x;
    private static int event_y;
    private static long event_nanos;
    private static int grab_x;
    private static int grab_y;
    private static int last_event_raw_x;
    private static int last_event_raw_y;
    private static final int BUFFER_SIZE = 50;
    private static boolean isGrabbed;
    private static org.lwjgl.opengl.InputImplementation implementation;
    private static org.lwjgl.input.Mouse.EmptyCursorGrabListener grabListener;
    private static final boolean emulateCursorAnimation = false;
    private static boolean clipMouseCoordinatesToWindow;


    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Mouse$EmptyCursorGrabListener.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/Mouse$EmptyCursorGrabListener.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/Mouse$EmptyCursorGrabListener.class */
    interface EmptyCursorGrabListener {
        void onGrab(boolean r1);
    }

    private Mouse() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.lwjgl.input.Cursor getNativeCursor() {
            org.lwjgl.input.Cursor r0 = org.lwjgl.input.Mouse.currentCursor
            return r0
    }

    public static org.lwjgl.input.Cursor setNativeCursor(org.lwjgl.input.Cursor r3) throws org.lwjgl.LWJGLException {
            r0 = r3
            if (r0 != 0) goto L20
            org.lwjgl.input.Cursor r0 = org.lwjgl.input.Mouse.currentCursor
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            r0 = 0
            setGrabbed(r0)
            org.lwjgl.input.Mouse$EmptyCursorGrabListener r0 = org.lwjgl.input.Mouse.grabListener
            if (r0 == 0) goto L20
            org.lwjgl.input.Mouse$EmptyCursorGrabListener r0 = org.lwjgl.input.Mouse.grabListener
            r1 = 0
            r0.onGrab(r1)
        L20:
            r0 = r3
            if (r0 == 0) goto L3e
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3e
            r0 = 1
            setGrabbed(r0)
            org.lwjgl.input.Mouse$EmptyCursorGrabListener r0 = org.lwjgl.input.Mouse.grabListener
            if (r0 == 0) goto L3e
            org.lwjgl.input.Mouse$EmptyCursorGrabListener r0 = org.lwjgl.input.Mouse.grabListener
            r1 = 1
            r0.onGrab(r1)
        L3e:
            r0 = r3
            org.lwjgl.input.Mouse.currentCursor = r0
            org.lwjgl.input.Cursor r0 = org.lwjgl.input.Mouse.currentCursor
            return r0
    }

    public static boolean isClipMouseCoordinatesToWindow() {
            boolean r0 = org.lwjgl.input.Mouse.clipMouseCoordinatesToWindow
            return r0
    }

    public static void setClipMouseCoordinatesToWindow(boolean r2) {
            r0 = r2
            org.lwjgl.input.Mouse.clipMouseCoordinatesToWindow = r0
            return
    }

    public static void setCursorPosition(int r1, int r2) {
            return
    }

    private static void initialize() {
            org.lwjgl.Sys.initialize()
            r0 = 16
            java.lang.String[] r0 = new java.lang.String[r0]
            org.lwjgl.input.Mouse.buttonName = r0
            r0 = 0
            r5 = r0
        Ld:
            r0 = r5
            r1 = 16
            if (r0 >= r1) goto L43
            java.lang.String[] r0 = org.lwjgl.input.Mouse.buttonName
            r1 = r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "BUTTON"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            java.util.Map<java.lang.String, java.lang.Integer> r0 = org.lwjgl.input.Mouse.buttonMap
            java.lang.String[] r1 = org.lwjgl.input.Mouse.buttonName
            r2 = r5
            r1 = r1[r2]
            r2 = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            int r5 = r5 + 1
            goto Ld
        L43:
            r0 = 1
            org.lwjgl.input.Mouse.initialized = r0
            return
    }

    private static void resetMouse() {
            r0 = 0
            r1 = r0
            org.lwjgl.input.Mouse.dwheel = r1
            r1 = r0
            org.lwjgl.input.Mouse.dy = r1
            org.lwjgl.input.Mouse.dx = r0
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            java.nio.ByteBuffer r1 = org.lwjgl.input.Mouse.readBuffer
            int r1 = r1.limit()
            java.nio.Buffer r0 = r0.position(r1)
            return
    }

    static org.lwjgl.opengl.InputImplementation getImplementation() {
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            return r0
    }

    private static void create(org.lwjgl.opengl.InputImplementation r3) throws org.lwjgl.LWJGLException {
            boolean r0 = org.lwjgl.input.Mouse.created
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = org.lwjgl.input.Mouse.initialized
            if (r0 != 0) goto L10
            initialize()
        L10:
            r0 = r3
            org.lwjgl.input.Mouse.implementation = r0
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            r0.createMouse()
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            boolean r0 = r0.hasWheel()
            org.lwjgl.input.Mouse.hasWheel = r0
            r0 = 1
            org.lwjgl.input.Mouse.created = r0
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            int r0 = r0.getButtonCount()
            org.lwjgl.input.Mouse.buttonCount = r0
            int r0 = org.lwjgl.input.Mouse.buttonCount
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            org.lwjgl.input.Mouse.buttons = r0
            r0 = 3
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            org.lwjgl.input.Mouse.coord_buffer = r0
            org.lwjgl.input.Cursor r0 = org.lwjgl.input.Mouse.currentCursor
            if (r0 == 0) goto L5e
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            int r0 = r0.getNativeCursorCapabilities()
            if (r0 == 0) goto L5e
            org.lwjgl.input.Cursor r0 = org.lwjgl.input.Mouse.currentCursor
            org.lwjgl.input.Cursor r0 = setNativeCursor(r0)
        L5e:
            r0 = 1100(0x44c, float:1.541E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            org.lwjgl.input.Mouse.readBuffer = r0
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            r1 = 0
            java.nio.Buffer r0 = r0.limit(r1)
            boolean r0 = org.lwjgl.input.Mouse.isGrabbed
            setGrabbed(r0)
            return
    }

    public static void create() throws org.lwjgl.LWJGLException {
            boolean r0 = org.lwjgl.opengl.Display.isCreated()
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Display must be created."
            r1.<init>(r2)
            throw r0
        L10:
            org.lwjgl.input.GLFWInputImplementation r0 = org.lwjgl.input.GLFWInputImplementation.singleton
            create(r0)
            return
    }

    public static boolean isCreated() {
            boolean r0 = org.lwjgl.input.Mouse.created
            return r0
    }

    public static void destroy() {
            boolean r0 = org.lwjgl.input.Mouse.created
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            org.lwjgl.input.Mouse.created = r0
            r0 = 0
            org.lwjgl.input.Mouse.buttons = r0
            r0 = 0
            org.lwjgl.input.Mouse.coord_buffer = r0
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            r0.destroyMouse()
            return
    }

    public static void poll() {
            boolean r0 = org.lwjgl.input.Mouse.created
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Mouse must be created before you can poll it"
            r1.<init>(r2)
            throw r0
        L10:
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            java.nio.IntBuffer r1 = org.lwjgl.input.Mouse.coord_buffer
            java.nio.ByteBuffer r2 = org.lwjgl.input.Mouse.buttons
            r0.pollMouse(r1, r2)
            java.nio.IntBuffer r0 = org.lwjgl.input.Mouse.coord_buffer
            r1 = 0
            int r0 = r0.get(r1)
            r4 = r0
            java.nio.IntBuffer r0 = org.lwjgl.input.Mouse.coord_buffer
            r1 = 1
            int r0 = r0.get(r1)
            r5 = r0
            java.nio.IntBuffer r0 = org.lwjgl.input.Mouse.coord_buffer
            r1 = 2
            int r0 = r0.get(r1)
            r6 = r0
            boolean r0 = isGrabbed()
            if (r0 == 0) goto L6f
            int r0 = org.lwjgl.input.Mouse.dx
            r1 = r4
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.dx = r0
            int r0 = org.lwjgl.input.Mouse.dy
            r1 = r5
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.dy = r0
            int r0 = org.lwjgl.input.Mouse.x
            r1 = r4
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.x = r0
            int r0 = org.lwjgl.input.Mouse.y
            r1 = r5
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.y = r0
            int r0 = org.lwjgl.input.Mouse.absolute_x
            r1 = r4
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.absolute_x = r0
            int r0 = org.lwjgl.input.Mouse.absolute_y
            r1 = r5
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.absolute_y = r0
            goto L8f
        L6f:
            r0 = r4
            int r1 = org.lwjgl.input.Mouse.absolute_x
            int r0 = r0 - r1
            org.lwjgl.input.Mouse.dx = r0
            r0 = r5
            int r1 = org.lwjgl.input.Mouse.absolute_y
            int r0 = r0 - r1
            org.lwjgl.input.Mouse.dy = r0
            r0 = r4
            r1 = r0
            org.lwjgl.input.Mouse.x = r1
            org.lwjgl.input.Mouse.absolute_x = r0
            r0 = r5
            r1 = r0
            org.lwjgl.input.Mouse.y = r1
            org.lwjgl.input.Mouse.absolute_y = r0
        L8f:
            boolean r0 = org.lwjgl.input.Mouse.clipMouseCoordinatesToWindow
            if (r0 == 0) goto Lb9
            int r0 = org.lwjgl.opengl.Display.getWidth()
            r1 = 1
            int r0 = r0 - r1
            r1 = 0
            int r2 = org.lwjgl.input.Mouse.x
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.min(r0, r1)
            org.lwjgl.input.Mouse.x = r0
            int r0 = org.lwjgl.opengl.Display.getHeight()
            r1 = 1
            int r0 = r0 - r1
            r1 = 0
            int r2 = org.lwjgl.input.Mouse.y
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.min(r0, r1)
            org.lwjgl.input.Mouse.y = r0
        Lb9:
            int r0 = org.lwjgl.input.Mouse.dwheel
            r1 = r6
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.dwheel = r0
            read()
            return
    }

    private static void read() {
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            java.nio.ByteBuffer r0 = r0.compact()
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            java.nio.ByteBuffer r1 = org.lwjgl.input.Mouse.readBuffer
            r0.readMouse(r1)
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            java.nio.Buffer r0 = r0.flip()
            return
    }

    public static boolean isButtonDown(int r4) {
            boolean r0 = org.lwjgl.input.Mouse.created
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Mouse must be created before you can poll the button state"
            r1.<init>(r2)
            throw r0
        L10:
            r0 = r4
            int r1 = org.lwjgl.input.Mouse.buttonCount
            if (r0 >= r1) goto L1b
            r0 = r4
            if (r0 >= 0) goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.buttons
            r1 = r4
            byte r0 = r0.get(r1)
            r1 = 1
            if (r0 != r1) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    public static java.lang.String getButtonName(int r3) {
            r0 = r3
            java.lang.String[] r1 = org.lwjgl.input.Mouse.buttonName
            int r1 = r1.length
            if (r0 >= r1) goto Lc
            r0 = r3
            if (r0 >= 0) goto Le
        Lc:
            r0 = 0
            return r0
        Le:
            java.lang.String[] r0 = org.lwjgl.input.Mouse.buttonName
            r1 = r3
            r0 = r0[r1]
            return r0
    }

    public static int getButtonIndex(java.lang.String r3) {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = org.lwjgl.input.Mouse.buttonMap
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L13
            r0 = -1
            return r0
        L13:
            r0 = r4
            int r0 = r0.intValue()
            return r0
    }

    public static boolean next() {
            boolean r0 = org.lwjgl.input.Mouse.created
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Mouse must be created before you can read events"
            r1.<init>(r2)
            throw r0
        L10:
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto Lda
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            byte r0 = r0.get()
            org.lwjgl.input.Mouse.eventButton = r0
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            byte r0 = r0.get()
            if (r0 == 0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            org.lwjgl.input.Mouse.eventState = r0
            boolean r0 = isGrabbed()
            if (r0 == 0) goto L6e
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            int r0 = r0.getInt()
            org.lwjgl.input.Mouse.event_dx = r0
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            int r0 = r0.getInt()
            org.lwjgl.input.Mouse.event_dy = r0
            int r0 = org.lwjgl.input.Mouse.event_x
            int r1 = org.lwjgl.input.Mouse.event_dx
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.event_x = r0
            int r0 = org.lwjgl.input.Mouse.event_y
            int r1 = org.lwjgl.input.Mouse.event_dy
            int r0 = r0 + r1
            org.lwjgl.input.Mouse.event_y = r0
            int r0 = org.lwjgl.input.Mouse.event_x
            org.lwjgl.input.Mouse.last_event_raw_x = r0
            int r0 = org.lwjgl.input.Mouse.event_y
            org.lwjgl.input.Mouse.last_event_raw_y = r0
            goto L9c
        L6e:
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            int r0 = r0.getInt()
            r4 = r0
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            int r0 = r0.getInt()
            r5 = r0
            r0 = r4
            int r1 = org.lwjgl.input.Mouse.last_event_raw_x
            int r0 = r0 - r1
            org.lwjgl.input.Mouse.event_dx = r0
            r0 = r5
            int r1 = org.lwjgl.input.Mouse.last_event_raw_y
            int r0 = r0 - r1
            org.lwjgl.input.Mouse.event_dy = r0
            r0 = r4
            org.lwjgl.input.Mouse.event_x = r0
            r0 = r5
            org.lwjgl.input.Mouse.event_y = r0
            r0 = r4
            org.lwjgl.input.Mouse.last_event_raw_x = r0
            r0 = r5
            org.lwjgl.input.Mouse.last_event_raw_y = r0
        L9c:
            boolean r0 = org.lwjgl.input.Mouse.clipMouseCoordinatesToWindow
            if (r0 == 0) goto Lc6
            int r0 = org.lwjgl.opengl.Display.getWidth()
            r1 = 1
            int r0 = r0 - r1
            r1 = 0
            int r2 = org.lwjgl.input.Mouse.event_x
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.min(r0, r1)
            org.lwjgl.input.Mouse.event_x = r0
            int r0 = org.lwjgl.opengl.Display.getHeight()
            r1 = 1
            int r0 = r0 - r1
            r1 = 0
            int r2 = org.lwjgl.input.Mouse.event_y
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.min(r0, r1)
            org.lwjgl.input.Mouse.event_y = r0
        Lc6:
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            int r0 = r0.getInt()
            org.lwjgl.input.Mouse.event_dwheel = r0
            java.nio.ByteBuffer r0 = org.lwjgl.input.Mouse.readBuffer
            long r0 = r0.getLong()
            org.lwjgl.input.Mouse.event_nanos = r0
            r0 = 1
            return r0
        Lda:
            r0 = 0
            return r0
    }

    public static int getEventButton() {
            int r0 = org.lwjgl.input.Mouse.eventButton
            return r0
    }

    public static boolean getEventButtonState() {
            boolean r0 = org.lwjgl.input.Mouse.eventState
            return r0
    }

    public static int getEventDX() {
            int r0 = org.lwjgl.input.Mouse.event_dx
            return r0
    }

    public static int getEventDY() {
            int r0 = org.lwjgl.input.Mouse.event_dy
            return r0
    }

    public static int getEventX() {
            int r0 = org.lwjgl.input.Mouse.event_x
            return r0
    }

    public static int getEventY() {
            int r0 = org.lwjgl.input.Mouse.event_y
            return r0
    }

    public static int getEventDWheel() {
            int r0 = org.lwjgl.input.Mouse.event_dwheel
            return r0
    }

    public static long getEventNanoseconds() {
            long r0 = org.lwjgl.input.Mouse.event_nanos
            return r0
    }

    public static int getX() {
            int r0 = org.lwjgl.input.Mouse.x
            return r0
    }

    public static int getY() {
            int r0 = org.lwjgl.input.Mouse.y
            return r0
    }

    public static int getDX() {
            int r0 = org.lwjgl.input.Mouse.dx
            r2 = r0
            r0 = 0
            org.lwjgl.input.Mouse.dx = r0
            r0 = r2
            return r0
    }

    public static int getDY() {
            int r0 = org.lwjgl.input.Mouse.dy
            r2 = r0
            r0 = 0
            org.lwjgl.input.Mouse.dy = r0
            r0 = r2
            return r0
    }

    public static int getDWheel() {
            int r0 = org.lwjgl.input.Mouse.dwheel
            r2 = r0
            r0 = 0
            org.lwjgl.input.Mouse.dwheel = r0
            r0 = r2
            return r0
    }

    public static int getButtonCount() {
            int r0 = org.lwjgl.input.Mouse.buttonCount
            return r0
    }

    public static boolean hasWheel() {
            boolean r0 = org.lwjgl.input.Mouse.hasWheel
            return r0
    }

    public static boolean isGrabbed() {
            boolean r0 = org.lwjgl.input.Mouse.isGrabbed
            return r0
    }

    public static void setGrabbed(boolean r3) {
            boolean r0 = org.lwjgl.input.Mouse.isGrabbed
            r4 = r0
            r0 = r3
            org.lwjgl.input.Mouse.isGrabbed = r0
            boolean r0 = isCreated()
            if (r0 == 0) goto Le
        Le:
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            r1 = r3
            r0.grabMouse(r1)
            poll()
            int r0 = org.lwjgl.input.Mouse.x
            org.lwjgl.input.Mouse.event_x = r0
            int r0 = org.lwjgl.input.Mouse.y
            org.lwjgl.input.Mouse.event_y = r0
            int r0 = org.lwjgl.input.Mouse.x
            org.lwjgl.input.Mouse.last_event_raw_x = r0
            int r0 = org.lwjgl.input.Mouse.y
            org.lwjgl.input.Mouse.last_event_raw_y = r0
            resetMouse()
            return
    }

    public static void updateCursor() {
            return
    }

    static boolean getPrivilegedBoolean(java.lang.String r4) {
            org.lwjgl.input.Mouse$1 r0 = new org.lwjgl.input.Mouse$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r5 = r0
            r0 = r5
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static boolean isInsideWindow() {
            org.lwjgl.opengl.InputImplementation r0 = org.lwjgl.input.Mouse.implementation
            boolean r0 = r0.isInsideWindow()
            return r0
    }

    static int getAbsoluteX() {
            int r0 = org.lwjgl.input.Mouse.absolute_x
            return r0
    }

    static int getAbsoluteY() {
            int r0 = org.lwjgl.input.Mouse.absolute_y
            return r0
    }

    static {
            r0 = -1
            org.lwjgl.input.Mouse.buttonCount = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 16
            r1.<init>(r2)
            org.lwjgl.input.Mouse.buttonMap = r0
            r0 = 0
            org.lwjgl.input.Mouse.grabListener = r0
            int r0 = org.lwjgl.LWJGLUtil.getPlatform()
            r1 = 3
            if (r0 == r1) goto L22
            int r0 = org.lwjgl.LWJGLUtil.getPlatform()
            r1 = 2
            if (r0 != r1) goto L26
        L22:
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            org.lwjgl.input.Mouse.emulateCursorAnimation = r0
            java.lang.String r0 = "org.lwjgl.input.Mouse.allowNegativeMouseCoords"
            boolean r0 = getPrivilegedBoolean(r0)
            if (r0 != 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            org.lwjgl.input.Mouse.clipMouseCoordinatesToWindow = r0
            java.lang.String r0 = "org.lwjgl.input.InfdevMouse"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5a
            r4 = r0
            r0 = r4
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> L5a
            r5 = r0
            r0 = r5
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L5a
            org.lwjgl.input.Mouse$EmptyCursorGrabListener r0 = (org.lwjgl.input.Mouse.EmptyCursorGrabListener) r0     // Catch: java.lang.Throwable -> L5a
            org.lwjgl.input.Mouse.grabListener = r0     // Catch: java.lang.Throwable -> L5a
            goto L5f
        L5a:
            r4 = move-exception
            r0 = r4
            r0.printStackTrace()
        L5f:
            return
    }
}
