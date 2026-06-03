package com.github.caciocavallosilano.cacio.agent;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-agent.jar:com/github/caciocavallosilano/cacio/agent/CTCJavaAgent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-agent.jar:com/github/caciocavallosilano/cacio/agent/CTCJavaAgent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-agent.jar:com/github/caciocavallosilano/cacio/agent/CTCJavaAgent.class */
public class CTCJavaAgent {
    public CTCJavaAgent() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void premain(java.lang.String r3, java.lang.instrument.Instrumentation r4) {
            initializeCTCEnvironment()     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = "swing.defaultlaf"
            java.lang.Class<javax.swing.plaf.nimbus.NimbusLookAndFeel> r1 = javax.swing.plaf.nimbus.NimbusLookAndFeel.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)     // Catch: java.lang.Exception -> L11
            goto L16
        L11:
            r5 = move-exception
            r0 = r5
            r0.printStackTrace()
        L16:
            return
    }

    private static void initializeCTCEnvironment() throws java.lang.Exception {
            java.lang.Class<java.awt.Toolkit> r0 = java.awt.Toolkit.class
            java.lang.String r1 = "toolkit"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r5 = r0
            r0 = r5
            r1 = 1
            r0.setAccessible(r1)
            r0 = r5
            r1 = 0
            com.github.caciocavallosilano.cacio.ctc.CTCToolkit r2 = new com.github.caciocavallosilano.cacio.ctc.CTCToolkit
            r3 = r2
            r3.<init>()
            r0.set(r1, r2)
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "defaultHeadless"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r6 = r0
            r0 = r6
            r1 = 1
            r0.setAccessible(r1)
            r0 = r6
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.set(r1, r2)
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "headless"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r7 = r0
            r0 = r7
            r1 = 1
            r0.setAccessible(r1)
            r0 = r7
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.set(r1, r2)
            java.lang.String r0 = "java.awt.GraphicsEnvironment$LocalGE"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r8 = r0
            r0 = r8
            java.lang.String r1 = "INSTANCE"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setAccessible(r1)
            r0 = r6
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.set(r1, r2)
            r0 = r7
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.set(r1, r2)
            java.lang.String r0 = "sun.java2d.SurfaceManagerFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setAccessible(r1)
            r0 = r11
            r1 = 0
            r2 = 0
            r0.set(r1, r2)
            r0 = r9
            com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment r1 = new com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment
            r2 = r1
            r2.<init>()
            setFinalStatic(r0, r1)
            java.lang.String r0 = "cacio.font.fontmanager"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto La1
            r0 = r12
            com.github.caciocavallosilano.cacio.ctc.FontManagerUtil.setFontManager(r0)
        La1:
            return
    }

    public static void setFinalStatic(java.lang.reflect.Field r6, java.lang.Object r7) throws java.lang.Exception {
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            java.lang.String r1 = "theUnsafe"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r8 = r0
            r0 = r8
            r1 = 1
            r0.setAccessible(r1)
            r0 = r8
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            r9 = r0
            r0 = r9
            r1 = r6
            java.lang.Object r0 = r0.staticFieldBase(r1)
            r10 = r0
            r0 = r9
            r1 = r6
            long r0 = r0.staticFieldOffset(r1)
            r11 = r0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r7
            r0.putObject(r1, r2, r3)
            return
    }

    static java.net.URL getFileURL(java.io.File r4) {
            r0 = r4
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L8
            r4 = r0
            goto L9
        L8:
            r5 = move-exception
        L9:
            r0 = r4
            java.net.URL r0 = r0.toURL()     // Catch: java.net.MalformedURLException -> Le
            return r0
        Le:
            r5 = move-exception
            java.lang.InternalError r0 = new java.lang.InternalError
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }
}
