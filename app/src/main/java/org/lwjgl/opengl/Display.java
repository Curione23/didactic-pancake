package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Display.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Display.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Display.class */
public class Display {
    private static java.lang.String windowTitle;
    private static org.lwjgl.opengl.GLContext context;
    private static org.lwjgl.opengl.DisplayImplementation display_impl;
    private static boolean displayCreated;
    private static boolean displayFocused;
    private static boolean displayVisible;
    private static boolean displayDirty;
    private static boolean displayResizable;
    private static org.lwjgl.opengl.DisplayMode mode;
    private static org.lwjgl.opengl.DisplayMode desktopDisplayMode;
    private static int latestEventKey;
    private static int displayX;
    private static int displayY;
    private static boolean displayResized;
    private static int displayWidth;
    private static int displayHeight;
    private static int displayFramebufferWidth;
    private static int displayFramebufferHeight;
    private static boolean latestResized;
    private static int latestWidth;
    private static int latestHeight;
    private static boolean vsyncEnabled;
    private static boolean displayFullscreen;
    private static float fps;
    private static boolean window_created;
    private static volatile org.lwjgl.opengl.DrawableLWJGL drawable;
    private static java.awt.Canvas parent;
    private static org.lwjgl.glfw.GLFWImage.Buffer icons;
    private static int swap_interval;
    private static boolean isCreated;















    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Display$Window.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Display$Window.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Display$Window.class */
    static class Window {
        static long handle;
        static org.lwjgl.glfw.GLFWKeyCallback keyCallback;
        static org.lwjgl.glfw.GLFWCharCallback charCallback;
        static org.lwjgl.glfw.GLFWCursorEnterCallback cursorEnterCallback;
        static org.lwjgl.glfw.GLFWCursorPosCallback cursorPosCallback;
        static org.lwjgl.glfw.GLFWMouseButtonCallback mouseButtonCallback;
        static org.lwjgl.glfw.GLFWWindowFocusCallback windowFocusCallback;
        static org.lwjgl.glfw.GLFWWindowIconifyCallback windowIconifyCallback;
        static org.lwjgl.glfw.GLFWWindowSizeCallback windowSizeCallback;
        static org.lwjgl.glfw.GLFWWindowPosCallback windowPosCallback;
        static org.lwjgl.glfw.GLFWWindowRefreshCallback windowRefreshCallback;
        static org.lwjgl.glfw.GLFWFramebufferSizeCallback framebufferSizeCallback;
        static org.lwjgl.glfw.GLFWScrollCallback scrollCallback;

        Window() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static void setCallbacks() {
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWKeyCallback r1 = org.lwjgl.opengl.Display.Window.keyCallback
                org.lwjgl.glfw.GLFWKeyCallback r0 = org.lwjgl.glfw.GLFW.glfwSetKeyCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWCharCallback r1 = org.lwjgl.opengl.Display.Window.charCallback
                org.lwjgl.glfw.GLFWCharCallback r0 = org.lwjgl.glfw.GLFW.glfwSetCharCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWCursorEnterCallback r1 = org.lwjgl.opengl.Display.Window.cursorEnterCallback
                org.lwjgl.glfw.GLFWCursorEnterCallback r0 = org.lwjgl.glfw.GLFW.glfwSetCursorEnterCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWCursorPosCallback r1 = org.lwjgl.opengl.Display.Window.cursorPosCallback
                org.lwjgl.glfw.GLFWCursorPosCallback r0 = org.lwjgl.glfw.GLFW.glfwSetCursorPosCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWMouseButtonCallback r1 = org.lwjgl.opengl.Display.Window.mouseButtonCallback
                org.lwjgl.glfw.GLFWMouseButtonCallback r0 = org.lwjgl.glfw.GLFW.glfwSetMouseButtonCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWWindowFocusCallback r1 = org.lwjgl.opengl.Display.Window.windowFocusCallback
                org.lwjgl.glfw.GLFWWindowFocusCallback r0 = org.lwjgl.glfw.GLFW.glfwSetWindowFocusCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWWindowIconifyCallback r1 = org.lwjgl.opengl.Display.Window.windowIconifyCallback
                org.lwjgl.glfw.GLFWWindowIconifyCallback r0 = org.lwjgl.glfw.GLFW.glfwSetWindowIconifyCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWWindowSizeCallback r1 = org.lwjgl.opengl.Display.Window.windowSizeCallback
                org.lwjgl.glfw.GLFWWindowSizeCallback r0 = org.lwjgl.glfw.GLFW.glfwSetWindowSizeCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWWindowPosCallback r1 = org.lwjgl.opengl.Display.Window.windowPosCallback
                org.lwjgl.glfw.GLFWWindowPosCallback r0 = org.lwjgl.glfw.GLFW.glfwSetWindowPosCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWWindowRefreshCallback r1 = org.lwjgl.opengl.Display.Window.windowRefreshCallback
                org.lwjgl.glfw.GLFWWindowRefreshCallback r0 = org.lwjgl.glfw.GLFW.glfwSetWindowRefreshCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWFramebufferSizeCallback r1 = org.lwjgl.opengl.Display.Window.framebufferSizeCallback
                org.lwjgl.glfw.GLFWFramebufferSizeCallback r0 = org.lwjgl.glfw.GLFW.glfwSetFramebufferSizeCallback(r0, r1)
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.GLFWScrollCallback r1 = org.lwjgl.opengl.Display.Window.scrollCallback
                org.lwjgl.glfw.GLFWScrollCallback r0 = org.lwjgl.glfw.GLFW.glfwSetScrollCallback(r0, r1)
                return
        }

        public static void releaseCallbacks() {
                long r0 = org.lwjgl.opengl.Display.Window.handle
                org.lwjgl.glfw.Callbacks.glfwFreeCallbacks(r0)
                r0 = 0
                org.lwjgl.opengl.Display.Window.keyCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.charCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.cursorEnterCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.cursorPosCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.mouseButtonCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.windowFocusCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.windowIconifyCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.windowSizeCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.windowPosCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.windowRefreshCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.framebufferSizeCallback = r0
                r0 = 0
                org.lwjgl.opengl.Display.Window.scrollCallback = r0
                java.lang.System.gc()
                return
        }
    }

    public Display() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void setSwapInterval(int r3) {
            java.lang.Object r0 = org.lwjgl.opengl.GlobalLock.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            org.lwjgl.opengl.Display.swap_interval = r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = isCreated()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1b
            org.lwjgl.opengl.DrawableLWJGL r0 = org.lwjgl.opengl.Display.drawable     // Catch: java.lang.Throwable -> L20
            int r1 = org.lwjgl.opengl.Display.swap_interval     // Catch: java.lang.Throwable -> L20
            r0.setSwapInterval(r1)     // Catch: java.lang.Throwable -> L20
        L1b:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            goto L25
        L20:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = r5
            throw r0
        L25:
            return
    }

    private static void makeCurrentAndSetSwapInterval() throws org.lwjgl.LWJGLException {
            makeCurrent()
            org.lwjgl.opengl.DrawableLWJGL r0 = org.lwjgl.opengl.Display.drawable     // Catch: org.lwjgl.opengl.OpenGLException -> Le
            r0.checkGLError()     // Catch: org.lwjgl.opengl.OpenGLException -> Le
            goto L28
        Le:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "OpenGL error during context creation: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.LWJGLUtil.log(r0)
        L28:
            int r0 = org.lwjgl.opengl.Display.swap_interval
            setSwapInterval(r0)
            return
    }

    private static void initContext() {
            org.lwjgl.opengl.DrawableLWJGL r0 = org.lwjgl.opengl.Display.drawable
            r1 = 0
            r2 = 0
            r3 = 0
            r0.initContext(r1, r2, r3)
            update()
            return
    }

    private static void initControls() {
            boolean r0 = org.lwjgl.input.Mouse.isCreated()
            if (r0 != 0) goto L33
            org.lwjgl.input.Mouse.create()     // Catch: org.lwjgl.LWJGLException -> Lc
            goto L33
        Lc:
            r3 = move-exception
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG
            if (r0 == 0) goto L1d
            r0 = r3
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            goto L33
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Failed to create Mouse: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.LWJGLUtil.log(r0)
        L33:
            boolean r0 = org.lwjgl.input.Keyboard.isCreated()
            if (r0 != 0) goto L66
            org.lwjgl.input.Keyboard.create()     // Catch: org.lwjgl.LWJGLException -> L3f
            goto L66
        L3f:
            r3 = move-exception
            boolean r0 = org.lwjgl.LWJGLUtil.DEBUG
            if (r0 == 0) goto L50
            r0 = r3
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            goto L66
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Failed to create Keyboard: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.LWJGLUtil.log(r0)
        L66:
            return
    }

    private static void releaseDrawable() {
            org.lwjgl.opengl.DrawableLWJGL r0 = org.lwjgl.opengl.Display.drawable     // Catch: org.lwjgl.LWJGLException -> L25
            org.lwjgl.opengl.Context r0 = r0.getContext()     // Catch: org.lwjgl.LWJGLException -> L25
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L22
            r0 = r3
            boolean r0 = r0.isCurrent()     // Catch: org.lwjgl.LWJGLException -> L25
            if (r0 == 0) goto L22
            r0 = r3
            r0.releaseCurrent()     // Catch: org.lwjgl.LWJGLException -> L25
            r0 = r3
            r0.releaseDrawable()     // Catch: org.lwjgl.LWJGLException -> L25
        L22:
            goto L3c
        L25:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Exception occurred while trying to release context: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.LWJGLUtil.log(r0)
        L3c:
            return
    }

    private static void destroyWindow() {
            boolean r0 = org.lwjgl.opengl.Display.window_created
            if (r0 != 0) goto L7
            return
        L7:
            releaseDrawable()
            boolean r0 = org.lwjgl.input.Mouse.isCreated()
            if (r0 == 0) goto L13
            org.lwjgl.input.Mouse.destroy()
        L13:
            boolean r0 = org.lwjgl.input.Keyboard.isCreated()
            if (r0 == 0) goto L1c
            org.lwjgl.input.Keyboard.destroy()
        L1c:
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.display_impl
            r0.destroyWindow()
            r0 = 0
            org.lwjgl.opengl.Display.window_created = r0
            return
    }

    private static void reset() {
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.display_impl
            r0.resetDisplayMode()
            return
    }

    private static void createWindow() throws org.lwjgl.LWJGLException {
            boolean r0 = org.lwjgl.opengl.Display.window_created
            if (r0 == 0) goto L7
            return
        L7:
            org.lwjgl.opengl.DisplayMode r0 = getDisplayMode()
            r7 = r0
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.display_impl
            org.lwjgl.opengl.DrawableLWJGL r1 = org.lwjgl.opengl.Display.drawable
            r2 = r7
            r3 = 0
            r4 = 0
            r5 = 0
            r0.createWindow(r1, r2, r3, r4, r5)
            r0 = 1
            org.lwjgl.opengl.Display.window_created = r0
            r0 = r7
            int r0 = r0.getWidth()
            org.lwjgl.opengl.Display.displayWidth = r0
            r0 = r7
            int r0 = r0.getHeight()
            org.lwjgl.opengl.Display.displayHeight = r0
            initControls()
            r0 = 2
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r0]
            r1 = r0
            r2 = 0
            java.nio.ByteBuffer r3 = org.lwjgl.LWJGLUtil.LWJGLIcon32x32
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.nio.ByteBuffer r3 = org.lwjgl.LWJGLUtil.LWJGLIcon16x16
            r1[r2] = r3
            int r0 = setIcon(r0)
            return
    }

    public static void create(org.lwjgl.opengl.PixelFormat r7, org.lwjgl.opengl.Drawable r8) throws org.lwjgl.LWJGLException {
            r0 = r7
            create(r0)
            org.lwjgl.opengl.DrawableLWJGL r0 = org.lwjgl.opengl.Display.drawable     // Catch: org.lwjgl.LWJGLException -> L60
            r1 = r7
            r2 = 0
            r0.setPixelFormat(r1, r2)     // Catch: org.lwjgl.LWJGLException -> L60
            createWindow()     // Catch: org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            org.lwjgl.opengl.DrawableLWJGL r0 = org.lwjgl.opengl.Display.drawable     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            org.lwjgl.opengl.DrawableGL r0 = (org.lwjgl.opengl.DrawableGL) r0     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            org.lwjgl.opengl.ContextGL r1 = new org.lwjgl.opengl.ContextGL     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            r2 = r1
            org.lwjgl.opengl.DrawableLWJGL r3 = org.lwjgl.opengl.Display.drawable     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            org.lwjgl.opengl.DrawableGL r3 = (org.lwjgl.opengl.DrawableGL) r3     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            org.lwjgl.opengl.PeerInfo r3 = r3.peer_info     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            r4 = 0
            r5 = r8
            if (r5 == 0) goto L33
            r5 = r8
            org.lwjgl.opengl.DrawableGL r5 = (org.lwjgl.opengl.DrawableGL) r5     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            org.lwjgl.opengl.ContextGL r5 = r5.getContext()     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            goto L34
        L33:
            r5 = 0
        L34:
            r2.<init>(r3, r4, r5)     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            r0.context = r1     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            makeCurrentAndSetSwapInterval()     // Catch: org.lwjgl.LWJGLException -> L43 org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            initContext()     // Catch: org.lwjgl.LWJGLException -> L43 org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            goto L46
        L43:
            r9 = move-exception
            r0 = r9
            throw r0     // Catch: org.lwjgl.LWJGLException -> L49 org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
        L46:
            goto L4f
        L49:
            r9 = move-exception
            destroyWindow()     // Catch: org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
            r0 = r9
            throw r0     // Catch: org.lwjgl.LWJGLException -> L52 org.lwjgl.LWJGLException -> L60
        L4f:
            goto L5d
        L52:
            r9 = move-exception
            org.lwjgl.opengl.DrawableLWJGL r0 = org.lwjgl.opengl.Display.drawable     // Catch: org.lwjgl.LWJGLException -> L60
            r0.destroy()     // Catch: org.lwjgl.LWJGLException -> L60
            r0 = r9
            throw r0     // Catch: org.lwjgl.LWJGLException -> L60
        L5d:
            goto L6b
        L60:
            r9 = move-exception
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.display_impl
            r0.resetDisplayMode()
            r0 = r9
            throw r0
        L6b:
            return
    }

    public static void create(org.lwjgl.opengl.PixelFormat r2, org.lwjgl.opengl.ContextAttribs r3) throws org.lwjgl.LWJGLException {
            r0 = r2
            create(r0)
            return
    }

    public static void create(org.lwjgl.opengl.PixelFormat r3) throws org.lwjgl.LWJGLException {
            r0 = 135178(0x2100a, float:1.89425E-40)
            r1 = r3
            int r1 = r1.getAccumulationBitsPerPixel()
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 135172(0x21004, float:1.89416E-40)
            r1 = r3
            int r1 = r1.getAlphaBits()
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 135179(0x2100b, float:1.89426E-40)
            r1 = r3
            int r1 = r1.getAuxBuffers()
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 135173(0x21005, float:1.89418E-40)
            r1 = r3
            int r1 = r1.getDepthBits()
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 135181(0x2100d, float:1.89429E-40)
            r1 = r3
            int r1 = r1.getSamples()
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 135174(0x21006, float:1.89419E-40)
            r1 = r3
            int r1 = r1.getStencilBits()
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            create()
            return
    }

    public static void create() throws org.lwjgl.LWJGLException {
            boolean r0 = org.lwjgl.opengl.Display.isCreated
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            org.lwjgl.opengl.Display.isCreated = r0
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L19
            long r0 = org.lwjgl.opengl.Display.Window.handle
            org.lwjgl.glfw.GLFW.glfwDestroyWindow(r0)
        L19:
            long r0 = org.lwjgl.glfw.GLFW.glfwGetPrimaryMonitor()
            r8 = r0
            r0 = r8
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.glfwGetVideoMode(r0)
            r10 = r0
            r0 = r10
            int r0 = r0.width()
            r11 = r0
            r0 = r10
            int r0 = r0.height()
            r12 = r0
            r0 = r10
            int r0 = r0.redBits()
            r1 = r10
            int r1 = r1.greenBits()
            int r0 = r0 + r1
            r1 = r10
            int r1 = r1.blueBits()
            int r0 = r0 + r1
            r13 = r0
            r0 = r10
            int r0 = r0.refreshRate()
            r14 = r0
            org.lwjgl.opengl.DisplayMode r0 = new org.lwjgl.opengl.DisplayMode
            r1 = r0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5)
            org.lwjgl.opengl.Display.desktopDisplayMode = r0
            org.lwjgl.glfw.GLFW.glfwDefaultWindowHints()
            r0 = 131076(0x20004, float:1.83677E-40)
            r1 = 0
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 131075(0x20003, float:1.83675E-40)
            boolean r1 = org.lwjgl.opengl.Display.displayResizable
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = 0
        L6a:
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 139271(0x22007, float:1.9516E-40)
            r1 = 1
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            org.lwjgl.opengl.DisplayMode r0 = org.lwjgl.opengl.Display.mode
            int r0 = r0.getWidth()
            org.lwjgl.opengl.DisplayMode r1 = org.lwjgl.opengl.Display.mode
            int r1 = r1.getHeight()
            java.lang.String r2 = org.lwjgl.opengl.Display.windowTitle
            r3 = 0
            r4 = 0
            long r0 = org.lwjgl.glfw.GLFW.glfwCreateWindow(r0, r1, r2, r3, r4)
            org.lwjgl.opengl.Display.Window.handle = r0
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L9c
            org.lwjgl.LWJGLException r0 = new org.lwjgl.LWJGLException
            r1 = r0
            java.lang.String r2 = "Failed to create Display window"
            r1.<init>(r2)
            throw r0
        L9c:
            org.lwjgl.opengl.Display$1 r0 = new org.lwjgl.opengl.Display$1
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.keyCallback = r0
            org.lwjgl.opengl.Display$2 r0 = new org.lwjgl.opengl.Display$2
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.charCallback = r0
            org.lwjgl.opengl.Display$3 r0 = new org.lwjgl.opengl.Display$3
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.cursorEnterCallback = r0
            org.lwjgl.opengl.Display$4 r0 = new org.lwjgl.opengl.Display$4
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.cursorPosCallback = r0
            org.lwjgl.opengl.Display$5 r0 = new org.lwjgl.opengl.Display$5
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.mouseButtonCallback = r0
            org.lwjgl.opengl.Display$6 r0 = new org.lwjgl.opengl.Display$6
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.windowFocusCallback = r0
            org.lwjgl.opengl.Display$7 r0 = new org.lwjgl.opengl.Display$7
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.windowIconifyCallback = r0
            org.lwjgl.opengl.Display$8 r0 = new org.lwjgl.opengl.Display$8
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.windowSizeCallback = r0
            org.lwjgl.opengl.Display$9 r0 = new org.lwjgl.opengl.Display$9
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.windowPosCallback = r0
            org.lwjgl.opengl.Display$10 r0 = new org.lwjgl.opengl.Display$10
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.windowRefreshCallback = r0
            org.lwjgl.opengl.Display$11 r0 = new org.lwjgl.opengl.Display$11
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.framebufferSizeCallback = r0
            org.lwjgl.opengl.Display$12 r0 = new org.lwjgl.opengl.Display$12
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.Window.scrollCallback = r0
            org.lwjgl.opengl.Display.Window.setCallbacks()
            org.lwjgl.opengl.DisplayMode r0 = org.lwjgl.opengl.Display.mode
            int r0 = r0.getWidth()
            org.lwjgl.opengl.Display.displayWidth = r0
            org.lwjgl.opengl.DisplayMode r0 = org.lwjgl.opengl.Display.mode
            int r0 = r0.getHeight()
            org.lwjgl.opengl.Display.displayHeight = r0
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r15 = r0
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r16 = r0
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r15
            r2 = r16
            org.lwjgl.glfw.GLFW.glfwGetFramebufferSize(r0, r1, r2)
            r0 = r15
            r1 = 0
            int r0 = r0.get(r1)
            org.lwjgl.opengl.Display.displayFramebufferWidth = r0
            r0 = r16
            r1 = 0
            int r0 = r0.get(r1)
            org.lwjgl.opengl.Display.displayFramebufferHeight = r0
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r11
            org.lwjgl.opengl.DisplayMode r2 = org.lwjgl.opengl.Display.mode
            int r2 = r2.getWidth()
            int r1 = r1 - r2
            r2 = 2
            int r1 = r1 / r2
            r2 = r12
            org.lwjgl.opengl.DisplayMode r3 = org.lwjgl.opengl.Display.mode
            int r3 = r3.getHeight()
            int r2 = r2 - r3
            r3 = 2
            int r2 = r2 / r3
            org.lwjgl.glfw.GLFW.glfwSetWindowPos(r0, r1, r2)
            int r0 = org.lwjgl.opengl.Display.displayX
            r1 = -1
            if (r0 != r1) goto L180
            r0 = r11
            org.lwjgl.opengl.DisplayMode r1 = org.lwjgl.opengl.Display.mode
            int r1 = r1.getWidth()
            int r0 = r0 - r1
            r1 = 2
            int r0 = r0 / r1
            org.lwjgl.opengl.Display.displayX = r0
        L180:
            int r0 = org.lwjgl.opengl.Display.displayY
            r1 = -1
            if (r0 != r1) goto L195
            r0 = r12
            org.lwjgl.opengl.DisplayMode r1 = org.lwjgl.opengl.Display.mode
            int r1 = r1.getHeight()
            int r0 = r0 - r1
            r1 = 2
            int r0 = r0 / r1
            org.lwjgl.opengl.Display.displayY = r0
        L195:
            org.lwjgl.opengl.Display$13 r0 = new org.lwjgl.opengl.Display$13
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r17
            org.lwjgl.opengl.ContextGL r1 = new org.lwjgl.opengl.ContextGL
            r2 = r1
            long r3 = org.lwjgl.opengl.Display.Window.handle
            r2.<init>(r3)
            r0.context = r1
            r0 = r17
            org.lwjgl.opengl.ContextGL r0 = r0.context
            r0.makeCurrent()
            r0 = r17
            org.lwjgl.opengl.Display.drawable = r0
            org.lwjgl.opengl.GLContext r0 = org.lwjgl.opengl.GLContext.createFromCurrent()
            org.lwjgl.opengl.Display.context = r0
            long r0 = org.lwjgl.opengl.Display.Window.handle
            org.lwjgl.glfw.GLFW.glfwShowWindow(r0)
            java.awt.Canvas r0 = org.lwjgl.opengl.Display.parent
            if (r0 == 0) goto L1d8
            java.awt.Canvas r0 = org.lwjgl.opengl.Display.parent
            int r1 = org.lwjgl.opengl.Display.displayWidth
            int r2 = org.lwjgl.opengl.Display.displayHeight
            r0.setSize(r1, r2)
        L1d8:
            org.lwjgl.opengl.Display$14 r0 = new org.lwjgl.opengl.Display$14
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.Display.display_impl = r0
            r0 = 1
            org.lwjgl.opengl.Display.displayCreated = r0
            org.lwjgl.input.Mouse.create()
            org.lwjgl.input.Keyboard.create()
            return
    }

    public static boolean isCreated() {
            boolean r0 = org.lwjgl.opengl.Display.displayCreated
            return r0
    }

    public static boolean isActive() {
            boolean r0 = org.lwjgl.opengl.Display.displayFocused
            return r0
    }

    public static boolean isVisible() {
            boolean r0 = org.lwjgl.opengl.Display.displayVisible
            return r0
    }

    public static org.lwjgl.opengl.GLContext getContext() {
            org.lwjgl.opengl.GLContext r0 = org.lwjgl.opengl.Display.context
            return r0
    }

    public static void setLocation(int r5, int r6) {
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            r0 = r5
            org.lwjgl.opengl.Display.displayX = r0
            r0 = r6
            org.lwjgl.opengl.Display.displayY = r0
            goto L1b
        L13:
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r5
            r2 = r6
            org.lwjgl.glfw.GLFW.glfwSetWindowPos(r0, r1, r2)
        L1b:
            return
    }

    public static void setVSyncEnabled(boolean r2) {
            r0 = r2
            org.lwjgl.opengl.Display.vsyncEnabled = r0
            boolean r0 = org.lwjgl.opengl.Display.vsyncEnabled
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            org.lwjgl.glfw.GLFW.glfwSwapInterval(r0)
            return
    }

    public static long getWindow() {
            long r0 = org.lwjgl.opengl.Display.Window.handle
            return r0
    }

    public static void update() {
            r0 = 1
            update(r0)
            return
    }

    public static void update(boolean r4) {
            swapBuffers()     // Catch: org.lwjgl.LWJGLException -> La
            r0 = 0
            org.lwjgl.opengl.Display.displayDirty = r0     // Catch: org.lwjgl.LWJGLException -> La
            goto L14
        La:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r4
            if (r0 == 0) goto L1b
            processMessages()
        L1b:
            return
    }

    public static void processMessages() {
            org.lwjgl.glfw.GLFW.glfwPollEvents()
            org.lwjgl.input.Keyboard.poll()
            org.lwjgl.input.Mouse.poll()
            boolean r0 = org.lwjgl.opengl.Display.latestResized
            if (r0 == 0) goto L26
            r0 = 0
            org.lwjgl.opengl.Display.latestResized = r0
            r0 = 1
            org.lwjgl.opengl.Display.displayResized = r0
            int r0 = org.lwjgl.opengl.Display.latestWidth
            org.lwjgl.opengl.Display.displayWidth = r0
            int r0 = org.lwjgl.opengl.Display.latestHeight
            org.lwjgl.opengl.Display.displayHeight = r0
            goto L2a
        L26:
            r0 = 0
            org.lwjgl.opengl.Display.displayResized = r0
        L2a:
            return
    }

    public static java.awt.Canvas getParent() {
            java.awt.Canvas r0 = org.lwjgl.opengl.Display.parent
            return r0
    }

    public static void setParent(java.awt.Canvas r3) throws org.lwjgl.LWJGLException {
            java.awt.Canvas r0 = org.lwjgl.opengl.Display.parent
            r1 = r3
            if (r0 == r1) goto Lb
            r0 = r3
            org.lwjgl.opengl.Display.parent = r0
        Lb:
            return
    }

    public static void swapBuffers() throws org.lwjgl.LWJGLException {
            long r0 = org.lwjgl.opengl.Display.Window.handle
            org.lwjgl.glfw.GLFW.glfwSwapBuffers(r0)
            return
    }

    public static void destroy() {
            org.lwjgl.opengl.Display.Window.releaseCallbacks()
            long r0 = org.lwjgl.opengl.Display.Window.handle
            org.lwjgl.glfw.GLFW.glfwDestroyWindow(r0)
            r0 = 0
            org.lwjgl.opengl.Display.displayCreated = r0
            return
    }

    public static void setDisplayMode(org.lwjgl.opengl.DisplayMode r5) throws org.lwjgl.LWJGLException {
            r0 = r5
            org.lwjgl.opengl.Display.mode = r0
            boolean r0 = org.lwjgl.opengl.Display.isCreated
            if (r0 == 0) goto L18
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r5
            int r1 = r1.getWidth()
            r2 = r5
            int r2 = r2.getHeight()
            org.lwjgl.glfw.GLFW.glfwSetWindowSize(r0, r1, r2)
        L18:
            return
    }

    public static org.lwjgl.opengl.DisplayMode getDisplayMode() {
            org.lwjgl.opengl.DisplayMode r0 = org.lwjgl.opengl.Display.mode
            return r0
    }

    public static org.lwjgl.opengl.DisplayMode[] getAvailableDisplayModes() throws org.lwjgl.LWJGLException {
            long r0 = org.lwjgl.glfw.GLFW.glfwGetPrimaryMonitor()
            org.lwjgl.glfw.GLFWVidMode$Buffer r0 = org.lwjgl.glfw.GLFW.glfwGetVideoModes(r0)
            r9 = r0
            r0 = r9
            int r0 = r0.capacity()
            org.lwjgl.opengl.DisplayMode[] r0 = new org.lwjgl.opengl.DisplayMode[r0]
            r10 = r0
            r0 = 0
            r11 = r0
        L11:
            r0 = r11
            r1 = r9
            int r1 = r1.capacity()
            if (r0 >= r1) goto L57
            r0 = r9
            r1 = r11
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
            r0 = r9
            int r0 = r0.width()
            r12 = r0
            r0 = r9
            int r0 = r0.height()
            r13 = r0
            r0 = r9
            int r0 = r0.redBits()
            r1 = r9
            int r1 = r1.greenBits()
            int r0 = r0 + r1
            r1 = r9
            int r1 = r1.blueBits()
            int r0 = r0 + r1
            r14 = r0
            r0 = r9
            int r0 = r0.refreshRate()
            r15 = r0
            r0 = r10
            r1 = r11
            org.lwjgl.opengl.DisplayMode r2 = new org.lwjgl.opengl.DisplayMode
            r3 = r2
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r3.<init>(r4, r5, r6, r7)
            r0[r1] = r2
            int r11 = r11 + 1
            goto L11
        L57:
            r0 = r10
            return r0
    }

    public static org.lwjgl.opengl.DisplayMode getDesktopDisplayMode() {
            long r0 = org.lwjgl.glfw.GLFW.glfwGetPrimaryMonitor()
            r7 = r0
            r0 = r7
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.glfwGetVideoMode(r0)
            r9 = r0
            org.lwjgl.opengl.DisplayMode r0 = new org.lwjgl.opengl.DisplayMode
            r1 = r0
            r2 = r9
            int r2 = r2.width()
            r3 = r9
            int r3 = r3.height()
            r4 = r9
            int r4 = r4.redBits()
            r5 = r9
            int r5 = r5.greenBits()
            int r4 = r4 + r5
            r5 = r9
            int r5 = r5.blueBits()
            int r4 = r4 + r5
            r5 = r9
            int r5 = r5.refreshRate()
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static boolean wasResized() {
            boolean r0 = org.lwjgl.opengl.Display.displayResized
            return r0
    }

    public static int getX() {
            int r0 = org.lwjgl.opengl.Display.displayX
            return r0
    }

    public static int getY() {
            int r0 = org.lwjgl.opengl.Display.displayY
            return r0
    }

    public static int getWidth() {
            int r0 = org.lwjgl.opengl.Display.displayWidth
            return r0
    }

    public static int getHeight() {
            int r0 = org.lwjgl.opengl.Display.displayHeight
            return r0
    }

    public static int getFramebufferWidth() {
            int r0 = org.lwjgl.opengl.Display.displayFramebufferWidth
            return r0
    }

    public static int getFramebufferHeight() {
            int r0 = org.lwjgl.opengl.Display.displayFramebufferHeight
            return r0
    }

    public static void setTitle(java.lang.String r2) {
            r0 = r2
            org.lwjgl.opengl.Display.windowTitle = r0
            return
    }

    public static java.lang.String getTitle() {
            java.lang.String r0 = org.lwjgl.opengl.Display.windowTitle
            return r0
    }

    public static boolean isCloseRequested() {
            long r0 = org.lwjgl.opengl.Display.Window.handle
            boolean r0 = org.lwjgl.glfw.GLFW.glfwWindowShouldClose(r0)
            r1 = 1
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isDirty() {
            boolean r0 = org.lwjgl.opengl.Display.displayDirty
            return r0
    }

    public static void setInitialBackground(float r5, float r6, float r7) {
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L15
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 1065353216(0x3f800000, float:1.0)
            org.lwjgl.opengl.GL11.glClearColor(r0, r1, r2, r3)
            r0 = 16384(0x4000, float:2.2959E-41)
            org.lwjgl.opengl.GL11.glClear(r0)
        L15:
            return
    }

    public static int setIcon(java.nio.ByteBuffer[] r7) {
            long r0 = org.lwjgl.opengl.Display.Window.handle     // Catch: java.lang.Exception -> L2b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            org.lwjgl.glfw.GLFWImage$Buffer r0 = new org.lwjgl.glfw.GLFWImage$Buffer     // Catch: java.lang.Exception -> L2b
            r1 = r0
            r2 = r7
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Exception -> L2b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2b
            org.lwjgl.opengl.Display.icons = r0     // Catch: java.lang.Exception -> L2b
            goto L28
        L18:
            long r0 = org.lwjgl.opengl.Display.Window.handle     // Catch: java.lang.Exception -> L2b
            org.lwjgl.glfw.GLFWImage$Buffer r1 = new org.lwjgl.glfw.GLFWImage$Buffer     // Catch: java.lang.Exception -> L2b
            r2 = r1
            r3 = r7
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Exception -> L2b
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2b
            org.lwjgl.glfw.GLFW.glfwSetWindowIcon(r0, r1)     // Catch: java.lang.Exception -> L2b
        L28:
            goto L35
        L2b:
            r8 = move-exception
            java.lang.String r0 = "Couldn't set icon"
            org.lwjgl.LWJGLUtil.log(r0)
            r0 = r8
            r0.printStackTrace()
        L35:
            r0 = 0
            return r0
    }

    public static void setResizable(boolean r5) {
            boolean r0 = org.lwjgl.opengl.Display.displayResizable
            r1 = r5
            r0 = r0 ^ r1
            if (r0 == 0) goto L63
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L63
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r6 = r0
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r7 = r0
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r6
            r2 = r7
            org.lwjgl.glfw.GLFW.glfwGetWindowSize(r0, r1, r2)
            r0 = r6
            java.nio.Buffer r0 = r0.rewind()
            r0 = r7
            java.nio.Buffer r0 = r0.rewind()
            org.lwjgl.glfw.GLFW.glfwDefaultWindowHints()
            r0 = 131076(0x20004, float:1.83677E-40)
            boolean r1 = org.lwjgl.opengl.Display.displayVisible
            if (r1 == 0) goto L3b
            r1 = 1
            goto L3c
        L3b:
            r1 = 0
        L3c:
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 131075(0x20003, float:1.83675E-40)
            boolean r1 = org.lwjgl.opengl.Display.displayResizable
            if (r1 == 0) goto L4b
            r1 = 1
            goto L4c
        L4b:
            r1 = 0
        L4c:
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 139271(0x22007, float:1.9516E-40)
            r1 = 1
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r6
            int r1 = r1.get()
            r2 = r7
            int r2 = r2.get()
            org.lwjgl.glfw.GLFW.glfwSetWindowSize(r0, r1, r2)
        L63:
            r0 = r5
            org.lwjgl.opengl.Display.displayResizable = r0
            return
    }

    public static boolean isResizable() {
            boolean r0 = org.lwjgl.opengl.Display.displayResizable
            return r0
    }

    public static void setDisplayModeAndFullscreen(org.lwjgl.opengl.DisplayMode r5) throws org.lwjgl.LWJGLException {
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1a
            r0 = r5
            org.lwjgl.opengl.Display.mode = r0
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r5
            int r1 = r1.getWidth()
            r2 = r5
            int r2 = r2.getHeight()
            org.lwjgl.glfw.GLFW.glfwSetWindowSize(r0, r1, r2)
        L1a:
            return
    }

    public static void setFullscreen(boolean r5) throws org.lwjgl.LWJGLException {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "LWJGLX: switch fullscreen to "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r5
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            boolean r0 = isFullscreen()
            r1 = r5
            r0 = r0 ^ r1
            if (r0 == 0) goto L93
            r0 = r5
            if (r0 == 0) goto L38
            org.lwjgl.opengl.DisplayMode r0 = org.lwjgl.opengl.Display.mode
            boolean r0 = r0.isFullscreenCapable()
            if (r0 != 0) goto L38
            org.lwjgl.LWJGLException r0 = new org.lwjgl.LWJGLException
            r1 = r0
            java.lang.String r2 = "Display mode is not fullscreen capable"
            r1.<init>(r2)
            throw r0
        L38:
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L93
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r6 = r0
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r7 = r0
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r6
            r2 = r7
            org.lwjgl.glfw.GLFW.glfwGetWindowSize(r0, r1, r2)
            r0 = r6
            java.nio.Buffer r0 = r0.rewind()
            r0 = r7
            java.nio.Buffer r0 = r0.rewind()
            org.lwjgl.glfw.GLFW.glfwDefaultWindowHints()
            r0 = 131076(0x20004, float:1.83677E-40)
            boolean r1 = org.lwjgl.opengl.Display.displayVisible
            if (r1 == 0) goto L6b
            r1 = 1
            goto L6c
        L6b:
            r1 = 0
        L6c:
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 131075(0x20003, float:1.83675E-40)
            boolean r1 = org.lwjgl.opengl.Display.displayResizable
            if (r1 == 0) goto L7b
            r1 = 1
            goto L7c
        L7b:
            r1 = 0
        L7c:
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            r0 = 139271(0x22007, float:1.9516E-40)
            r1 = 1
            org.lwjgl.glfw.GLFW.glfwWindowHint(r0, r1)
            long r0 = org.lwjgl.opengl.Display.Window.handle
            r1 = r6
            int r1 = r1.get()
            r2 = r7
            int r2 = r2.get()
            org.lwjgl.glfw.GLFW.glfwSetWindowSize(r0, r1, r2)
        L93:
            r0 = r5
            org.lwjgl.opengl.Display.displayFullscreen = r0
            return
    }

    public static boolean isFullscreen() {
            boolean r0 = org.lwjgl.opengl.Display.displayFullscreen
            return r0
    }

    public static void releaseContext() throws org.lwjgl.LWJGLException {
            r0 = 0
            org.lwjgl.glfw.GLFW.glfwMakeContextCurrent(r0)
            return
    }

    public static boolean isCurrent() throws org.lwjgl.LWJGLException {
            long r0 = org.lwjgl.glfw.GLFW.glfwGetCurrentContext()
            long r1 = org.lwjgl.opengl.Display.Window.handle
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static void makeCurrent() throws org.lwjgl.LWJGLException {
            boolean r0 = isCurrent()
            if (r0 != 0) goto L6
        L6:
            return
    }

    public static void setDisplayConfiguration(float r1, float r2, float r3) throws org.lwjgl.LWJGLException {
            return
    }

    public static java.lang.String getAdapter() {
            java.lang.String r0 = "GeNotSupportedAdapter"
            return r0
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = "1.0 NOT SUPPORTED"
            return r0
    }

    public static void sync(int r2) {
            r0 = r2
            org.lwjgl.opengl.Sync.sync(r0)
            return
    }

    public static org.lwjgl.opengl.Drawable getDrawable() {
            org.lwjgl.opengl.DrawableLWJGL r0 = org.lwjgl.opengl.Display.drawable
            return r0
    }

    static org.lwjgl.opengl.DisplayImplementation getImplementation() {
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.display_impl
            return r0
    }

    static /* synthetic */ int access$002(int r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.latestEventKey = r1
            return r0
    }

    static /* synthetic */ boolean access$102(boolean r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.displayFocused = r1
            return r0
    }

    static /* synthetic */ boolean access$202(boolean r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.displayVisible = r1
            return r0
    }

    static /* synthetic */ boolean access$302(boolean r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.latestResized = r1
            return r0
    }

    static /* synthetic */ int access$402(int r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.latestWidth = r1
            return r0
    }

    static /* synthetic */ int access$502(int r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.latestHeight = r1
            return r0
    }

    static /* synthetic */ java.awt.Canvas access$600() {
            java.awt.Canvas r0 = org.lwjgl.opengl.Display.parent
            return r0
    }

    static /* synthetic */ int access$702(int r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.displayX = r1
            return r0
    }

    static /* synthetic */ int access$802(int r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.displayY = r1
            return r0
    }

    static /* synthetic */ boolean access$902(boolean r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.displayDirty = r1
            return r0
    }

    static /* synthetic */ int access$1002(int r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.displayFramebufferWidth = r1
            return r0
    }

    static /* synthetic */ int access$1102(int r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.displayFramebufferHeight = r1
            return r0
    }

    static /* synthetic */ void access$1200() {
            releaseDrawable()
            return
    }

    static /* synthetic */ void access$1300() {
            destroyWindow()
            return
    }

    static /* synthetic */ void access$1400() {
            reset()
            return
    }

    static /* synthetic */ java.lang.String access$1502(java.lang.String r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.Display.windowTitle = r1
            return r0
    }

    static /* synthetic */ org.lwjgl.opengl.DisplayMode access$1600() {
            org.lwjgl.opengl.DisplayMode r0 = org.lwjgl.opengl.Display.desktopDisplayMode
            return r0
    }

    static /* synthetic */ boolean access$200() {
            boolean r0 = org.lwjgl.opengl.Display.displayVisible
            return r0
    }

    static /* synthetic */ boolean access$900() {
            boolean r0 = org.lwjgl.opengl.Display.displayDirty
            return r0
    }

    static /* synthetic */ boolean access$100() {
            boolean r0 = org.lwjgl.opengl.Display.displayFocused
            return r0
    }

    static /* synthetic */ int access$800() {
            int r0 = org.lwjgl.opengl.Display.displayY
            return r0
    }

    static /* synthetic */ int access$700() {
            int r0 = org.lwjgl.opengl.Display.displayX
            return r0
    }

    static /* synthetic */ int access$400() {
            int r0 = org.lwjgl.opengl.Display.latestWidth
            return r0
    }

    static /* synthetic */ int access$500() {
            int r0 = org.lwjgl.opengl.Display.latestHeight
            return r0
    }

    static {
            java.lang.String r0 = "Game"
            org.lwjgl.opengl.Display.windowTitle = r0
            r0 = 0
            org.lwjgl.opengl.Display.displayCreated = r0
            r0 = 1
            org.lwjgl.opengl.Display.displayFocused = r0
            r0 = 1
            org.lwjgl.opengl.Display.displayVisible = r0
            r0 = 0
            org.lwjgl.opengl.Display.displayDirty = r0
            r0 = 0
            org.lwjgl.opengl.Display.displayResizable = r0
            r0 = 0
            org.lwjgl.opengl.Display.latestEventKey = r0
            r0 = -1
            org.lwjgl.opengl.Display.displayX = r0
            r0 = -1
            org.lwjgl.opengl.Display.displayY = r0
            r0 = 0
            org.lwjgl.opengl.Display.displayResized = r0
            r0 = 0
            org.lwjgl.opengl.Display.displayWidth = r0
            r0 = 0
            org.lwjgl.opengl.Display.displayHeight = r0
            r0 = 0
            org.lwjgl.opengl.Display.displayFramebufferWidth = r0
            r0 = 0
            org.lwjgl.opengl.Display.displayFramebufferHeight = r0
            r0 = 0
            org.lwjgl.opengl.Display.latestResized = r0
            r0 = 0
            org.lwjgl.opengl.Display.latestWidth = r0
            r0 = 0
            org.lwjgl.opengl.Display.latestHeight = r0
            r0 = 0
            org.lwjgl.opengl.Display.vsyncEnabled = r0
            r0 = 1
            org.lwjgl.opengl.Display.displayFullscreen = r0
            r0 = 0
            org.lwjgl.opengl.Display.drawable = r0
            org.lwjgl.Sys.initialize()
            long r0 = org.lwjgl.glfw.GLFW.glfwGetPrimaryMonitor()
            r7 = r0
            r0 = r7
            org.lwjgl.glfw.GLFWVidMode r0 = org.lwjgl.glfw.GLFW.glfwGetVideoMode(r0)
            r9 = r0
            r0 = r9
            int r0 = r0.width()
            r1 = r0
            org.lwjgl.opengl.Display.displayFramebufferWidth = r1
            r1 = r0
            org.lwjgl.opengl.Display.displayWidth = r1
            r10 = r0
            r0 = r9
            int r0 = r0.height()
            r1 = r0
            org.lwjgl.opengl.Display.displayFramebufferHeight = r1
            r1 = r0
            org.lwjgl.opengl.Display.displayHeight = r1
            r11 = r0
            r0 = r9
            int r0 = r0.redBits()
            r1 = r9
            int r1 = r1.greenBits()
            int r0 = r0 + r1
            r1 = r9
            int r1 = r1.blueBits()
            int r0 = r0 + r1
            r12 = r0
            r0 = r9
            int r0 = r0.refreshRate()
            r13 = r0
            org.lwjgl.opengl.DisplayMode r0 = new org.lwjgl.opengl.DisplayMode
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            r1 = r0
            org.lwjgl.opengl.Display.desktopDisplayMode = r1
            org.lwjgl.opengl.Display.mode = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Initial mode: "
            java.lang.StringBuilder r0 = r0.append(r1)
            org.lwjgl.opengl.DisplayMode r1 = org.lwjgl.opengl.Display.desktopDisplayMode
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.LWJGLUtil.log(r0)
            java.lang.String r0 = "opengles2"
            java.lang.String r1 = "POJAV_RENDERER"
            java.lang.String r1 = java.lang.System.getenv(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lcb
            org.lwjgl.opengl.GLContext.initCapabilities()
        Lcb:
            r0 = 0
            org.lwjgl.opengl.Display.isCreated = r0
            return
    }
}
