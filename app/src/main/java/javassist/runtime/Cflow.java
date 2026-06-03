package javassist.runtime;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/runtime/Cflow.class */
public class Cflow extends java.lang.ThreadLocal<javassist.runtime.Cflow.Depth> {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/runtime/Cflow$Depth.class */
    protected static class Depth {
        private int depth;

        Depth() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.depth = r1
                return
        }

        int value() {
                r2 = this;
                r0 = r2
                int r0 = r0.depth
                return r0
        }

        void inc() {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.depth
                r2 = 1
                int r1 = r1 + r2
                r0.depth = r1
                return
        }

        void dec() {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.depth
                r2 = 1
                int r1 = r1 - r2
                r0.depth = r1
                return
        }
    }

    public Cflow() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.ThreadLocal
    protected synchronized javassist.runtime.Cflow.Depth initialValue() {
            r3 = this;
            javassist.runtime.Cflow$Depth r0 = new javassist.runtime.Cflow$Depth
            r1 = r0
            r1.<init>()
            return r0
    }

    public void enter() {
            r2 = this;
            r0 = r2
            java.lang.Object r0 = r0.get()
            javassist.runtime.Cflow$Depth r0 = (javassist.runtime.Cflow.Depth) r0
            r0.inc()
            return
    }

    public void exit() {
            r2 = this;
            r0 = r2
            java.lang.Object r0 = r0.get()
            javassist.runtime.Cflow$Depth r0 = (javassist.runtime.Cflow.Depth) r0
            r0.dec()
            return
    }

    public int value() {
            r2 = this;
            r0 = r2
            java.lang.Object r0 = r0.get()
            javassist.runtime.Cflow$Depth r0 = (javassist.runtime.Cflow.Depth) r0
            int r0 = r0.value()
            return r0
    }

    @Override // java.lang.ThreadLocal
    protected /* bridge */ /* synthetic */ javassist.runtime.Cflow.Depth initialValue() {
            r2 = this;
            r0 = r2
            javassist.runtime.Cflow$Depth r0 = r0.initialValue()
            return r0
    }
}
