package com.github.caciocavallosilano.cacio.ctc.junit;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioTestRunner.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioTestRunner.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/caciocavallo.zip:caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioTestRunner.class */
public class CacioTestRunner extends org.junit.runners.BlockJUnit4ClassRunner {
    private static final java.lang.invoke.VarHandle MODIFIERS = null;

    public CacioTestRunner(java.lang.Class<?> r4) throws org.junit.runners.model.InitializationError {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    public static void makeNonFinal(java.lang.reflect.Field r5) {
            r0 = r5
            int r0 = r0.getModifiers()
            r6 = r0
            r0 = r6
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 == 0) goto L17
            java.lang.invoke.VarHandle r0 = com.github.caciocavallosilano.cacio.ctc.junit.CacioTestRunner.MODIFIERS
            r1 = r5
            r2 = r6
            r3 = -17
            r2 = r2 & r3
            r0.set(r1, r2)
        L17:
            return
    }

    static {
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            java.lang.invoke.MethodHandles$Lookup r1 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L1a
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.privateLookupIn(r0, r1)     // Catch: java.lang.Throwable -> L1a
            r5 = r0
            r0 = r5
            java.lang.Class<java.lang.reflect.Field> r1 = java.lang.reflect.Field.class
            java.lang.String r2 = "modifiers"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1a
            java.lang.invoke.VarHandle r0 = r0.findVarHandle(r1, r2, r3)     // Catch: java.lang.Throwable -> L1a
            com.github.caciocavallosilano.cacio.ctc.junit.CacioTestRunner.MODIFIERS = r0     // Catch: java.lang.Throwable -> L1a
            goto L24
        L1a:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L24:
            java.lang.Class<java.awt.Toolkit> r0 = java.awt.Toolkit.class
            java.lang.String r1 = "toolkit"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lbd
            r5 = r0
            r0 = r5
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lbd
            r0 = r5
            r1 = 0
            com.github.caciocavallosilano.cacio.ctc.CTCToolkit r2 = new com.github.caciocavallosilano.cacio.ctc.CTCToolkit     // Catch: java.lang.Exception -> Lbd
            r3 = r2
            r3.<init>()     // Catch: java.lang.Exception -> Lbd
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lbd
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "defaultHeadless"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lbd
            r6 = r0
            r0 = r6
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lbd
            r0 = r6
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lbd
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lbd
            java.lang.Class<java.awt.GraphicsEnvironment> r0 = java.awt.GraphicsEnvironment.class
            java.lang.String r1 = "headless"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lbd
            r7 = r0
            r0 = r7
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lbd
            r0 = r7
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lbd
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = "java.awt.GraphicsEnvironment$LocalGE"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lbd
            r8 = r0
            r0 = r8
            java.lang.String r1 = "INSTANCE"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lbd
            r9 = r0
            r0 = r9
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lbd
            r0 = r6
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lbd
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lbd
            r0 = r7
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lbd
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lbd
            r0 = r9
            makeNonFinal(r0)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = "sun.java2d.SurfaceManagerFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lbd
            r10 = r0
            r0 = r10
            java.lang.String r1 = "instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lbd
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lbd
            r0 = r11
            r1 = 0
            r2 = 0
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lbd
            r0 = r9
            r1 = 0
            com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment r2 = new com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment     // Catch: java.lang.Exception -> Lbd
            r3 = r2
            r3.<init>()     // Catch: java.lang.Exception -> Lbd
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Lbd
            goto Lc2
        Lbd:
            r5 = move-exception
            r0 = r5
            r0.printStackTrace()
        Lc2:
            java.lang.String r0 = "swing.defaultlaf"
            java.lang.Class<javax.swing.plaf.metal.MetalLookAndFeel> r1 = javax.swing.plaf.metal.MetalLookAndFeel.class
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)
            return
    }
}
