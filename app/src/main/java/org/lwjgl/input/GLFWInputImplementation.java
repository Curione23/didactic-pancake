package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/GLFWInputImplementation.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/GLFWInputImplementation.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/GLFWInputImplementation.class */
public class GLFWInputImplementation implements org.lwjgl.opengl.InputImplementation {
    public static final org.lwjgl.input.GLFWInputImplementation singleton = null;
    private final java.nio.ByteBuffer event_buffer;
    private org.lwjgl.input.EventQueue event_queue;
    private final org.lwjgl.input.EventQueue keyboardEventQueue;
    private final java.nio.ByteBuffer keyboardEvent;
    public final byte[] key_down_buffer;
    public final byte[] mouse_buffer;
    public int mouseX;
    public int lastPhysicalX;
    public int mouseY;
    public int lastPhysicalY;
    public int mouseLastX;
    public int mouseLastY;
    public boolean grab;
    private long last_event_nanos;

    public GLFWInputImplementation() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = 22
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.event_buffer = r1
            r0 = r5
            org.lwjgl.input.EventQueue r1 = new org.lwjgl.input.EventQueue
            r2 = r1
            r3 = 22
            r2.<init>(r3)
            r0.event_queue = r1
            r0 = r5
            org.lwjgl.input.EventQueue r1 = new org.lwjgl.input.EventQueue
            r2 = r1
            r3 = 18
            r2.<init>(r3)
            r0.keyboardEventQueue = r1
            r0 = r5
            r1 = 18
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.keyboardEvent = r1
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r1]
            r0.key_down_buffer = r1
            r0 = r5
            r1 = 3
            byte[] r1 = new byte[r1]
            r0.mouse_buffer = r1
            r0 = r5
            r1 = 0
            r0.mouseX = r1
            r0 = r5
            r1 = 0
            r0.lastPhysicalX = r1
            r0 = r5
            r1 = 0
            r0.mouseY = r1
            r0 = r5
            r1 = 0
            r0.lastPhysicalY = r1
            r0 = r5
            r1 = 0
            r0.mouseLastX = r1
            r0 = r5
            r1 = 0
            r0.mouseLastY = r1
            r0 = r5
            long r1 = java.lang.System.nanoTime()
            r0.last_event_nanos = r1
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public boolean hasWheel() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getButtonCount() {
            r2 = this;
            r0 = 8
            return r0
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void createMouse() throws org.lwjgl.LWJGLException {
            r1 = this;
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void destroyMouse() {
            r1 = this;
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void pollMouse(java.nio.IntBuffer r6, java.nio.ByteBuffer r7) {
            r5 = this;
            r0 = r6
            r1 = 0
            r2 = r5
            boolean r2 = r2.grab
            if (r2 == 0) goto L15
            r2 = r5
            int r2 = r2.mouseX
            r3 = r5
            int r3 = r3.mouseLastX
            int r2 = r2 - r3
            goto L19
        L15:
            r2 = r5
            int r2 = r2.mouseX
        L19:
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r0 = r6
            r1 = 1
            r2 = r5
            boolean r2 = r2.grab
            if (r2 == 0) goto L32
            r2 = r5
            int r2 = r2.mouseY
            r3 = r5
            int r3 = r3.mouseLastY
            int r2 = r2 - r3
            goto L36
        L32:
            r2 = r5
            int r2 = r2.mouseY
        L36:
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            r0 = r7
            java.nio.Buffer r0 = r0.rewind()
            r0 = r7
            r1 = r5
            byte[] r1 = r1.mouse_buffer
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r5
            r1 = r5
            int r1 = r1.mouseX
            r0.mouseLastX = r1
            r0 = r5
            r1 = r5
            int r1 = r1.mouseY
            r0.mouseLastY = r1
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void readMouse(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            org.lwjgl.input.EventQueue r0 = r0.event_queue
            r1 = r4
            r0.copyEvents(r1)
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void grabMouse(boolean r6) {
            r5 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Grab: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r5
            r1 = r6
            r0.grab = r1
            long r0 = org.lwjgl.opengl.Display.getWindow()
            r1 = 208897(0x33001, float:2.92727E-40)
            r2 = r5
            boolean r2 = r2.grab
            if (r2 == 0) goto L2f
            r2 = 212995(0x34003, float:2.9847E-40)
            goto L31
        L2f:
            r2 = 212993(0x34001, float:2.98467E-40)
        L31:
            org.lwjgl.glfw.GLFW.glfwSetInputMode(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getNativeCursorCapabilities() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void setCursorPosition(int r2, int r3) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void setNativeCursor(java.lang.Object r2) throws org.lwjgl.LWJGLException {
            r1 = this;
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getMinCursorSize() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getMaxCursorSize() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void createKeyboard() throws org.lwjgl.LWJGLException {
            r1 = this;
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void destroyKeyboard() {
            r1 = this;
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void pollKeyboard(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r4
            int r0 = r0.position()
            r5 = r0
            r0 = r4
            r1 = r3
            byte[] r1 = r1.key_down_buffer
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            r1 = r5
            java.nio.Buffer r0 = r0.position(r1)
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void readKeyboard(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            org.lwjgl.input.EventQueue r0 = r0.keyboardEventQueue
            r1 = r4
            r0.copyEvents(r1)
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public java.lang.Object createCursor(int r3, int r4, int r5, int r6, int r7, java.nio.IntBuffer r8, java.nio.IntBuffer r9) throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public void destroyCursor(java.lang.Object r2) {
            r1 = this;
            return
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getWidth() {
            r2 = this;
            int r0 = org.lwjgl.opengl.Display.getWidth()
            return r0
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public int getHeight() {
            r2 = this;
            int r0 = org.lwjgl.opengl.Display.getHeight()
            return r0
    }

    @Override // org.lwjgl.opengl.InputImplementation
    public boolean isInsideWindow() {
            r2 = this;
            r0 = 1
            return r0
    }

    public void putMouseEventWithCoords(byte r5, byte r6, int r7, int r8, int r9, long r10) {
            r4 = this;
            r0 = r7
            r1 = -1
            if (r0 != r1) goto L16
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L16
            r0 = r4
            int r0 = r0.lastPhysicalX
            r7 = r0
            r0 = r4
            int r0 = r0.lastPhysicalY
            r8 = r0
        L16:
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            java.nio.Buffer r0 = r0.clear()
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            r1 = r5
            java.nio.ByteBuffer r0 = r0.put(r1)
            r1 = r6
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            boolean r0 = r0.grab
            if (r0 == 0) goto L6d
            r0 = r7
            r1 = r4
            int r1 = r1.lastPhysicalX
            int r0 = r0 - r1
            r12 = r0
            r0 = r8
            r1 = r4
            int r1 = r1.lastPhysicalY
            int r0 = r0 - r1
            r1 = -1
            int r0 = r0 * r1
            r13 = r0
            r0 = r4
            r1 = r0
            int r1 = r1.mouseX
            r2 = r12
            int r1 = r1 + r2
            r0.mouseX = r1
            r0 = r4
            r1 = r0
            int r1 = r1.mouseY
            r2 = r13
            int r1 = r1 + r2
            r0.mouseY = r1
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            r1 = r12
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            r1 = r13
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            goto L91
        L6d:
            r0 = r4
            r1 = r7
            r0.mouseX = r1
            r0 = r4
            r1 = r8
            int r2 = org.lwjgl.opengl.Display.getHeight()
            int r1 = r1 - r2
            r2 = -1
            int r1 = r1 * r2
            r0.mouseY = r1
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            r1 = r4
            int r1 = r1.mouseX
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            r1 = r4
            int r1 = r1.mouseY
            java.nio.ByteBuffer r0 = r0.putInt(r1)
        L91:
            r0 = r5
            r1 = -1
            if (r0 == r1) goto L9d
            r0 = r4
            byte[] r0 = r0.mouse_buffer
            r1 = r5
            r2 = r6
            r0[r1] = r2
        L9d:
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            r1 = r9
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            r1 = r10
            java.nio.ByteBuffer r0 = r0.putLong(r1)
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            java.nio.Buffer r0 = r0.flip()
            r0 = r4
            org.lwjgl.input.EventQueue r0 = r0.event_queue
            r1 = r4
            java.nio.ByteBuffer r1 = r1.event_buffer
            boolean r0 = r0.putEvent(r1)
            r0 = r4
            r1 = r10
            r0.last_event_nanos = r1
            r0 = r4
            r1 = r7
            r0.lastPhysicalX = r1
            r0 = r4
            r1 = r8
            r0.lastPhysicalY = r1
            return
    }

    public void setMouseButtonInGrabMode(byte r5, byte r6) {
            r4 = this;
            long r0 = java.lang.System.nanoTime()
            r7 = r0
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            java.nio.Buffer r0 = r0.clear()
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            r1 = r5
            java.nio.ByteBuffer r0 = r0.put(r1)
            r1 = r6
            java.nio.ByteBuffer r0 = r0.put(r1)
            r1 = 0
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            r1 = 0
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            r1 = 0
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            r1 = r7
            java.nio.ByteBuffer r0 = r0.putLong(r1)
            r0 = r4
            java.nio.ByteBuffer r0 = r0.event_buffer
            java.nio.Buffer r0 = r0.flip()
            r0 = r4
            org.lwjgl.input.EventQueue r0 = r0.event_queue
            r1 = r4
            java.nio.ByteBuffer r1 = r1.event_buffer
            boolean r0 = r0.putEvent(r1)
            r0 = r4
            r1 = r7
            r0.last_event_nanos = r1
            return
    }

    public void putKeyboardEvent(int r5, byte r6, int r7, long r8, boolean r10) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.key_down_buffer
            r1 = r5
            r2 = r6
            r0[r1] = r2
            r0 = r4
            java.nio.ByteBuffer r0 = r0.keyboardEvent
            java.nio.Buffer r0 = r0.clear()
            r0 = r4
            java.nio.ByteBuffer r0 = r0.keyboardEvent
            r1 = r5
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            r1 = r6
            java.nio.ByteBuffer r0 = r0.put(r1)
            r1 = r7
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            r1 = r8
            java.nio.ByteBuffer r0 = r0.putLong(r1)
            r1 = r10
            if (r1 == 0) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.ByteBuffer r0 = r0.keyboardEvent
            java.nio.Buffer r0 = r0.flip()
            r0 = r4
            org.lwjgl.input.EventQueue r0 = r0.keyboardEventQueue
            r1 = r4
            java.nio.ByteBuffer r1 = r1.keyboardEvent
            boolean r0 = r0.putEvent(r1)
            return
    }

    static {
            org.lwjgl.input.GLFWInputImplementation r0 = new org.lwjgl.input.GLFWInputImplementation
            r1 = r0
            r1.<init>()
            org.lwjgl.input.GLFWInputImplementation.singleton = r0
            return
    }
}
