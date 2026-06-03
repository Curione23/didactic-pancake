package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/EventQueue.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/input/EventQueue.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/input/EventQueue.class */
class EventQueue {
    private static final int QUEUE_SIZE = 200;
    private final int event_size;
    private final java.nio.ByteBuffer queue;

    protected EventQueue(int r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.event_size = r1
            r0 = r4
            r1 = 200(0xc8, float:2.8E-43)
            r2 = r5
            int r1 = r1 * r2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.queue = r1
            return
    }

    protected synchronized void clearEvents() {
            r2 = this;
            r0 = r2
            java.nio.ByteBuffer r0 = r0.queue
            java.nio.Buffer r0 = r0.clear()
            return
    }

    public synchronized void copyEvents(java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            java.nio.ByteBuffer r0 = r0.queue
            java.nio.Buffer r0 = r0.flip()
            r0 = r4
            java.nio.ByteBuffer r0 = r0.queue
            int r0 = r0.limit()
            r6 = r0
            r0 = r5
            int r0 = r0.remaining()
            r1 = r4
            java.nio.ByteBuffer r1 = r1.queue
            int r1 = r1.remaining()
            if (r0 >= r1) goto L32
            r0 = r4
            java.nio.ByteBuffer r0 = r0.queue
            r1 = r5
            int r1 = r1.remaining()
            r2 = r4
            java.nio.ByteBuffer r2 = r2.queue
            int r2 = r2.position()
            int r1 = r1 + r2
            java.nio.Buffer r0 = r0.limit(r1)
        L32:
            r0 = r5
            r1 = r4
            java.nio.ByteBuffer r1 = r1.queue
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.ByteBuffer r0 = r0.queue
            r1 = r6
            java.nio.Buffer r0 = r0.limit(r1)
            r0 = r4
            java.nio.ByteBuffer r0 = r0.queue
            java.nio.ByteBuffer r0 = r0.compact()
            return
    }

    public synchronized boolean putEvent(java.nio.ByteBuffer r6) {
            r5 = this;
            r0 = r6
            int r0 = r0.remaining()
            r1 = r5
            int r1 = r1.event_size
            if (r0 == r1) goto L35
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Internal error: event size "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.event_size
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " does not equal the given event size "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            int r3 = r3.remaining()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L35:
            r0 = r5
            java.nio.ByteBuffer r0 = r0.queue
            int r0 = r0.remaining()
            r1 = r6
            int r1 = r1.remaining()
            if (r0 < r1) goto L4e
            r0 = r5
            java.nio.ByteBuffer r0 = r0.queue
            r1 = r6
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = 1
            return r0
        L4e:
            r0 = 0
            return r0
    }
}
