package org.lwjgl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/Sys.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/Sys.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/Sys.class */
public class Sys {
    private Sys() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = org.lwjgl.Version.getVersion()
            return r0
    }

    public static void initialize() {
            boolean r0 = org.lwjgl.glfw.GLFW.glfwInit()
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Unable to initialize GLFW"
            r1.<init>(r2)
            throw r0
        L10:
            return
    }

    public static long getTimerResolution() {
            r0 = 1000(0x3e8, double:4.94E-321)
            return r0
    }

    public static long getTime() {
            long r0 = org.lwjgl.glfw.GLFW.glfwGetTimerValue()
            return r0
    }

    public static long getNanoTime() {
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    public static boolean openURL(java.lang.String r5) {
            boolean r0 = java.awt.Desktop.isDesktopSupported()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.awt.Desktop r0 = java.awt.Desktop.getDesktop()
            r6 = r0
            r0 = r6
            java.awt.Desktop$Action r1 = java.awt.Desktop.Action.BROWSE
            boolean r0 = r0.isSupported(r1)
            if (r0 != 0) goto L18
            r0 = 0
            return r0
        L18:
            r0 = r6
            java.net.URI r1 = new java.net.URI     // Catch: java.lang.Exception -> L26
            r2 = r1
            r3 = r5
            r2.<init>(r3)     // Catch: java.lang.Exception -> L26
            r0.browse(r1)     // Catch: java.lang.Exception -> L26
            r0 = 1
            return r0
        L26:
            r7 = move-exception
            r0 = r7
            r0.printStackTrace()
            r0 = 0
            return r0
    }

    public static void alert(java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = javax.swing.UIManager.getSystemLookAndFeelClassName()     // Catch: java.lang.Exception -> L9
            javax.swing.UIManager.setLookAndFeel(r0)     // Catch: java.lang.Exception -> L9
            goto L20
        L9:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Caught exception while setting Look-and-Feel: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.LWJGLUtil.log(r0)
        L20:
            r0 = 0
            r1 = r6
            r2 = r5
            r3 = 2
            javax.swing.JOptionPane.showMessageDialog(r0, r1, r2, r3)
            return
    }

    public static java.lang.String getClipboard() {
            long r0 = org.lwjgl.glfw.GLFW.glfwGetPrimaryMonitor()
            java.lang.String r0 = org.lwjgl.glfw.GLFW.glfwGetClipboardString(r0)
            return r0
    }

    public static boolean is64Bit() {
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r3 = r0
            r0 = r3
            java.lang.String r1 = "64"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L18
            r0 = r3
            java.lang.String r1 = "armv8"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1c
        L18:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }
}
