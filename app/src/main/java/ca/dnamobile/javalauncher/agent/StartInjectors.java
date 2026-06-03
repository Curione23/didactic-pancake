package ca.dnamobile.javalauncher.agent;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/methods_injector_agent/methods_injector_agent.jar:ca/dnamobile/javalauncher/agent/StartInjectors.class */
public final class StartInjectors {


    private StartInjectors() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void premain(java.lang.String r4, java.lang.instrument.Instrumentation r5) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "JavaLauncher Agent: premain started"
            r0.println(r1)
            r0 = r5
            ca.dnamobile.javalauncher.agent.StartInjectors$1 r1 = new ca.dnamobile.javalauncher.agent.StartInjectors$1
            r2 = r1
            r2.<init>()
            r2 = 0
            r0.addTransformer(r1, r2)
            return
    }

    public static void agentmain(java.lang.String r3, java.lang.instrument.Instrumentation r4) {
            r0 = r3
            r1 = r4
            premain(r0, r1)
            return
    }
}
