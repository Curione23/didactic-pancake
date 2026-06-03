package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class ControlifySDL {
    private static final java.lang.String TAG = "ControlifySDL";
    private static volatile boolean initialized;

    public static /* synthetic */ void $r8$lambda$f9t8zjDsjCV69MQfZ8sYsFH1vt0() {
            safePollInputDevices()
            return
    }

    private ControlifySDL() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void append(java.lang.String r0) {
            java.lang.String r0 = stripTrailingLineBreaks(r0)     // Catch: java.lang.Throwable -> L7
            net.kdt.pojavlaunch.Logger.appendToLog(r0)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    private static boolean containsControlifyJar(java.io.File r6) {
            r0 = 0
            if (r6 == 0) goto L52
            boolean r1 = r6.isDirectory()
            if (r1 != 0) goto La
            goto L52
        La:
            java.io.File[] r6 = r6.listFiles()
            if (r6 != 0) goto L11
            return r0
        L11:
            int r1 = r6.length
            r2 = r0
        L13:
            if (r2 >= r1) goto L52
            r3 = r6[r2]
            java.lang.String r4 = r3.getName()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            boolean r5 = r3.isFile()
            if (r5 == 0) goto L4f
            java.lang.String r5 = ".jar"
            boolean r5 = r4.endsWith(r5)
            if (r5 == 0) goto L4f
            java.lang.String r5 = "controlify"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L4f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "ControlifySDL: found "
            r6.<init>(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            append(r6)
            r6 = 1
            return r6
        L4f:
            int r2 = r2 + 1
            goto L13
        L52:
            return r0
    }

    private static boolean hasControlify(java.io.File r3) {
            java.io.File r0 = new java.io.File
            if (r3 != 0) goto L7
            java.lang.String r1 = ""
            goto Lb
        L7:
            java.lang.String r1 = r3.getAbsolutePath()
        Lb:
            java.lang.String r2 = "mods"
            r0.<init>(r1, r2)
            boolean r0 = containsControlifyJar(r0)
            r1 = 1
            if (r0 == 0) goto L18
            return r1
        L18:
            if (r3 == 0) goto L2c
            java.io.File r3 = r3.getParentFile()
            if (r3 == 0) goto L2c
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r2)
            boolean r3 = containsControlifyJar(r0)
            if (r3 == 0) goto L2c
            return r1
        L2c:
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L3e
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3e
            boolean r3 = containsControlifyJar(r3)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L3e
            return r1
        L3e:
            r3 = 0
            return r3
    }

    public static synchronized void initialize(android.content.Context r4) {
            java.lang.String r0 = "ControlifySDL: failed to initialize SDL controller bridge: "
            java.lang.Class<ca.dnamobile.javalauncher.modcompat.ControlifySDL> r1 = ca.dnamobile.javalauncher.modcompat.ControlifySDL.class
            monitor-enter(r1)
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L54
            r2 = 1
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r2     // Catch: java.lang.Throwable -> L54
            boolean r3 = ca.dnamobile.javalauncher.modcompat.ControlifySDL.initialized     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L1a
            java.lang.String r4 = "ControlifySDL: already initialized; SDL routing forced enabled"
            append(r4)     // Catch: java.lang.Throwable -> L54
            pollNowAndLater()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r1)
            return
        L1a:
            java.lang.String r3 = "SDL3"
            org.libsdl.app.SDL.loadLibrary(r3, r4)     // Catch: java.lang.Throwable -> L3c
            org.libsdl.app.SDL.setupJNI()     // Catch: java.lang.Throwable -> L3c
            org.libsdl.app.SDL.initialize()     // Catch: java.lang.Throwable -> L3c
            org.libsdl.app.SDL.setContext(r4)     // Catch: java.lang.Throwable -> L3c
            org.libsdl.app.SDLControllerManager.initialize()     // Catch: java.lang.Throwable -> L3c
            net.kdt.pojavlaunch.Tools.SDL.initializeControllerSubsystems()     // Catch: java.lang.Throwable -> L3c
            ca.dnamobile.javalauncher.modcompat.ControlifySDL.initialized = r2     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "ControlifySDL: SDL controller bridge initialized; sdlEnabled=true"
            append(r4)     // Catch: java.lang.Throwable -> L3c
            logAndroidInputDevices()     // Catch: java.lang.Throwable -> L3c
            pollNowAndLater()     // Catch: java.lang.Throwable -> L3c
            goto L52
        L3c:
            r4 = move-exception
            r2 = 0
            ca.dnamobile.javalauncher.modcompat.ControlifySDL.initialized = r2     // Catch: java.lang.Throwable -> L54
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r2     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L54
            append(r4)     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r1)
            return
        L54:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r4
    }

    public static synchronized void initializeIfNeeded(android.content.Context r1, java.io.File r2) {
            java.lang.Class<ca.dnamobile.javalauncher.modcompat.ControlifySDL> r0 = ca.dnamobile.javalauncher.modcompat.ControlifySDL.class
            monitor-enter(r0)
            boolean r2 = hasControlify(r2)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L13
            reset()     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "ControlifySDL: Controlify not found, SDL controller routing disabled"
            append(r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return
        L13:
            initialize(r1)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    private static void logAndroidInputDevices() {
            int[] r0 = android.view.InputDevice.getDeviceIds()     // Catch: java.lang.Throwable -> L8b
            int r1 = r0.length     // Catch: java.lang.Throwable -> L8b
            r2 = 0
            r3 = r2
            r4 = r3
        L8:
            if (r3 >= r1) goto L74
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L8b
            android.view.InputDevice r6 = android.view.InputDevice.getDevice(r5)     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L13
            goto L71
        L13:
            int r7 = r6.getSources()     // Catch: java.lang.Throwable -> L8b
            r8 = r7 & 1025(0x401, float:1.436E-42)
            r9 = 1025(0x401, float:1.436E-42)
            r10 = 1
            if (r8 != r9) goto L20
            r8 = r10
            goto L21
        L20:
            r8 = r2
        L21:
            r9 = 16777232(0x1000010, float:2.3509932E-38)
            r11 = r7 & r9
            if (r11 != r9) goto L29
            goto L2a
        L29:
            r10 = r2
        L2a:
            if (r8 != 0) goto L2f
            if (r10 != 0) goto L2f
            goto L71
        L2f:
            int r4 = r4 + 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r8.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = "ControlifySDL: Android controller device id="
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r5 = r8.append(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = " name="
            java.lang.StringBuilder r5 = r5.append(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r5 = r5.append(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = " descriptor="
            java.lang.StringBuilder r5 = r5.append(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = r6.getDescriptor()     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = " sources=0x"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = java.lang.Integer.toHexString(r7)     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8b
            append(r5)     // Catch: java.lang.Throwable -> L8b
        L71:
            int r3 = r3 + 1
            goto L8
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r0.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "ControlifySDL: Android controller count="
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8b
            append(r0)     // Catch: java.lang.Throwable -> L8b
            goto L9e
        L8b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ControlifySDL: failed to list Android input devices: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            append(r0)
        L9e:
            return
    }

    private static void pollNowAndLater() {
            org.libsdl.app.SDLControllerManager.initialize()     // Catch: java.lang.Throwable -> Lc
            org.libsdl.app.SDLControllerManager.pollInputDevices()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "ControlifySDL: pollInputDevices() completed immediately"
            append(r0)     // Catch: java.lang.Throwable -> Lc
            goto L1f
        Lc:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ControlifySDL: immediate pollInputDevices() failed: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            append(r0)
        L1f:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modcompat.ControlifySDL$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.modcompat.ControlifySDL$$ExternalSyntheticLambda0
            r1.<init>()
            r2 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r1, r2)
            ca.dnamobile.javalauncher.modcompat.ControlifySDL$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.modcompat.ControlifySDL$$ExternalSyntheticLambda0
            r1.<init>()
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
    }

    public static synchronized void reset() {
            java.lang.Class<ca.dnamobile.javalauncher.modcompat.ControlifySDL> r0 = ca.dnamobile.javalauncher.modcompat.ControlifySDL.class
            monitor-enter(r0)
            r1 = 0
            ca.dnamobile.javalauncher.modcompat.ControlifySDL.initialized = r1     // Catch: java.lang.Throwable -> La
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r1     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    private static void safePollInputDevices() {
            org.libsdl.app.SDLControllerManager.initialize()     // Catch: java.lang.Throwable -> Lc
            org.libsdl.app.SDLControllerManager.pollInputDevices()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "ControlifySDL: delayed pollInputDevices() completed"
            append(r0)     // Catch: java.lang.Throwable -> Lc
            goto L1f
        Lc:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ControlifySDL: delayed pollInputDevices() failed: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            append(r0)
        L1f:
            return
    }

    private static java.lang.String stripTrailingLineBreaks(java.lang.String r3) {
            int r0 = r3.length()
        L4:
            if (r0 <= 0) goto L18
            int r1 = r0 + (-1)
            char r1 = r3.charAt(r1)
            r2 = 10
            if (r1 == r2) goto L15
            r2 = 13
            if (r1 == r2) goto L15
            goto L18
        L15:
            int r0 = r0 + (-1)
            goto L4
        L18:
            int r1 = r3.length()
            if (r0 != r1) goto L1f
            goto L24
        L1f:
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L24:
            return r3
    }
}
