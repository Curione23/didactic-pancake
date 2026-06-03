package com.movtery.optifine_renamer;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/OptiFineRenamer.jar:com/movtery/optifine_renamer/MainAgent.class */
public class MainAgent {
    private static java.lang.String replacementValue;

    public MainAgent() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r1) {
            return
    }

    public static void premain(java.lang.String r3, java.lang.instrument.Instrumentation r4) {
            r0 = r3
            r1 = r4
            start(r0, r1)
            return
    }

    public static void agentmain(java.lang.String r3, java.lang.instrument.Instrumentation r4) {
            r0 = r3
            r1 = r4
            start(r0, r1)
            return
    }

    private static void start(java.lang.String r5, java.lang.instrument.Instrumentation r6) {
            r0 = r5
            if (r0 == 0) goto Lf
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf
            r0 = r5
            com.movtery.optifine_renamer.MainAgent.replacementValue = r0
        Lf:
            r0 = r6
            com.movtery.optifine_renamer.optifine.ChangeClassTransformer r1 = new com.movtery.optifine_renamer.optifine.ChangeClassTransformer
            r2 = r1
            java.lang.String r3 = com.movtery.optifine_renamer.MainAgent.replacementValue
            r2.<init>(r3)
            r0.addTransformer(r1)
            return
    }

    static {
            java.lang.String r0 = "OptiFine_Version"
            com.movtery.optifine_renamer.MainAgent.replacementValue = r0
            return
    }
}
