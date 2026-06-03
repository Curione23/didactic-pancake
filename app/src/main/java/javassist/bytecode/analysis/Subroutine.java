package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/Subroutine.class */
public class Subroutine {
    private java.util.List<java.lang.Integer> callers;
    private java.util.Set<java.lang.Integer> access;
    private int start;

    public Subroutine(int r5, int r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.callers = r1
            r0 = r4
            java.util.HashSet r1 = new java.util.HashSet
            r2 = r1
            r2.<init>()
            r0.access = r1
            r0 = r4
            r1 = r5
            r0.start = r1
            r0 = r4
            java.util.List<java.lang.Integer> r0 = r0.callers
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            return
    }

    public void addCaller(int r4) {
            r3 = this;
            r0 = r3
            java.util.List<java.lang.Integer> r0 = r0.callers
            r1 = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            return
    }

    public int start() {
            r2 = this;
            r0 = r2
            int r0 = r0.start
            return r0
    }

    public void access(int r4) {
            r3 = this;
            r0 = r3
            java.util.Set<java.lang.Integer> r0 = r0.access
            r1 = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            return
    }

    public boolean isAccessed(int r4) {
            r3 = this;
            r0 = r3
            java.util.Set<java.lang.Integer> r0 = r0.access
            r1 = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            return r0
    }

    public java.util.Collection<java.lang.Integer> accessed() {
            r2 = this;
            r0 = r2
            java.util.Set<java.lang.Integer> r0 = r0.access
            return r0
    }

    public java.util.Collection<java.lang.Integer> callers() {
            r2 = this;
            r0 = r2
            java.util.List<java.lang.Integer> r0 = r0.callers
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "start = "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.start
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " callers = "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.util.List<java.lang.Integer> r1 = r1.callers
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
