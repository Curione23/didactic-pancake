package com.mio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioFabricAgent.jar:com/mio/PreMainAgent.class */
public class PreMainAgent {
    public PreMainAgent() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void premain(java.lang.String r4, java.lang.instrument.Instrumentation r5) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "澪のFabric代理运行中!"
            r0.println(r1)
            r0 = r5
            com.mio.MyTransformer r1 = new com.mio.MyTransformer
            r2 = r1
            r2.<init>()
            r2 = 1
            r0.addTransformer(r1, r2)
            return
    }

    public static void agentmain(java.lang.String r6, java.lang.instrument.Instrumentation r7) throws java.lang.instrument.UnmodifiableClassException {
            r0 = r7
            com.mio.MyTransformer r1 = new com.mio.MyTransformer
            r2 = r1
            r2.<init>()
            r2 = 1
            r0.addTransformer(r1, r2)
            r0 = r7
            java.lang.Class[] r0 = r0.getAllLoadedClasses()
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L1e:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L50
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "ClientInstaller"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            r0 = r7
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            r4 = r12
            r2[r3] = r4
            r0.retransformClasses(r1)
            goto L50
        L4a:
            int r11 = r11 + 1
            goto L1e
        L50:
            return
    }
}
