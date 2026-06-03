package org.lwjgl.openal;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALCdevice.class */
public final class ALCdevice {
    final long device;
    private boolean valid;
    private final java.util.HashMap<java.lang.Long, org.lwjgl.openal.ALCcontext> contexts;

    ALCdevice(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.contexts = r1
            r0 = r4
            r1 = r5
            r0.device = r1
            r0 = r4
            r1 = 1
            r0.valid = r1
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.openal.ALCdevice
            if (r0 == 0) goto L1c
            r0 = r6
            org.lwjgl.openal.ALCdevice r0 = (org.lwjgl.openal.ALCdevice) r0
            long r0 = r0.device
            r1 = r5
            long r1 = r1.device
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
        L1c:
            r0 = r5
            r1 = r6
            boolean r0 = super.equals(r1)
            return r0
    }

    void addContext(org.lwjgl.openal.ALCcontext r5) {
            r4 = this;
            r0 = r4
            java.util.HashMap<java.lang.Long, org.lwjgl.openal.ALCcontext> r0 = r0.contexts
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r4
            java.util.HashMap<java.lang.Long, org.lwjgl.openal.ALCcontext> r0 = r0.contexts     // Catch: java.lang.Throwable -> L1c
            r1 = r5
            long r1 = r1.context     // Catch: java.lang.Throwable -> L1c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L1c
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1c
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            goto L21
        L1c:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r0 = r7
            throw r0
        L21:
            return
    }

    void removeContext(org.lwjgl.openal.ALCcontext r5) {
            r4 = this;
            r0 = r4
            java.util.HashMap<java.lang.Long, org.lwjgl.openal.ALCcontext> r0 = r0.contexts
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r4
            java.util.HashMap<java.lang.Long, org.lwjgl.openal.ALCcontext> r0 = r0.contexts     // Catch: java.lang.Throwable -> L1b
            r1 = r5
            long r1 = r1.context     // Catch: java.lang.Throwable -> L1b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1b
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L20
        L1b:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = r7
            throw r0
        L20:
            return
    }

    void setInvalid() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.valid = r1
            r0 = r3
            java.util.HashMap<java.lang.Long, org.lwjgl.openal.ALCcontext> r0 = r0.contexts
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            java.util.HashMap<java.lang.Long, org.lwjgl.openal.ALCcontext> r0 = r0.contexts     // Catch: java.lang.Throwable -> L38
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L38
            r5 = r0
        L19:
            r0 = r5
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L33
            r0 = r5
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L38
            org.lwjgl.openal.ALCcontext r0 = (org.lwjgl.openal.ALCcontext) r0     // Catch: java.lang.Throwable -> L38
            r6 = r0
            r0 = r6
            r0.setInvalid()     // Catch: java.lang.Throwable -> L38
            goto L19
        L33:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r7 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r0 = r7
            throw r0
        L3f:
            r0 = r3
            java.util.HashMap<java.lang.Long, org.lwjgl.openal.ALCcontext> r0 = r0.contexts
            r0.clear()
            return
    }

    public boolean isValid() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.valid
            return r0
    }
}
