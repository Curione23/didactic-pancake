package org.lwjgl.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Timer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/Timer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/Timer.class */
public class Timer {
    private static long resolution;
    private static final int QUERY_INTERVAL = 50;
    private static int queryCount;
    private static long currentTime;
    private long startTime;
    private long lastTime;
    private boolean paused;

    public Timer() {
            r2 = this;
            r0 = r2
            r0.<init>()
            r0 = r2
            r0.reset()
            r0 = r2
            r0.resume()
            return
    }

    public float getTime() {
            r6 = this;
            r0 = r6
            boolean r0 = r0.paused
            if (r0 != 0) goto L13
            r0 = r6
            long r1 = org.lwjgl.util.Timer.currentTime
            r2 = r6
            long r2 = r2.startTime
            long r1 = r1 - r2
            r0.lastTime = r1
        L13:
            r0 = r6
            long r0 = r0.lastTime
            double r0 = (double) r0
            long r1 = org.lwjgl.util.Timer.resolution
            double r1 = (double) r1
            double r0 = r0 / r1
            float r0 = (float) r0
            return r0
    }

    public boolean isPaused() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.paused
            return r0
    }

    public void pause() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.paused = r1
            return
    }

    public void reset() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.set(r1)
            return
    }

    public void resume() {
            r6 = this;
            r0 = r6
            r1 = 0
            r0.paused = r1
            r0 = r6
            long r1 = org.lwjgl.util.Timer.currentTime
            r2 = r6
            long r2 = r2.lastTime
            long r1 = r1 - r2
            r0.startTime = r1
            return
    }

    public void set(float r7) {
            r6 = this;
            r0 = r7
            double r0 = (double) r0
            long r1 = org.lwjgl.util.Timer.resolution
            double r1 = (double) r1
            double r0 = r0 * r1
            long r0 = (long) r0
            r8 = r0
            r0 = r6
            long r1 = org.lwjgl.util.Timer.currentTime
            r2 = r8
            long r1 = r1 - r2
            r0.startTime = r1
            r0 = r6
            r1 = r8
            r0.lastTime = r1
            return
    }

    public static void tick() {
            long r0 = org.lwjgl.Sys.getTime()
            org.lwjgl.util.Timer.currentTime = r0
            int r0 = org.lwjgl.util.Timer.queryCount
            r1 = 1
            int r0 = r0 + r1
            org.lwjgl.util.Timer.queryCount = r0
            int r0 = org.lwjgl.util.Timer.queryCount
            r1 = 50
            if (r0 <= r1) goto L20
            r0 = 0
            org.lwjgl.util.Timer.queryCount = r0
            long r0 = org.lwjgl.Sys.getTimerResolution()
            org.lwjgl.util.Timer.resolution = r0
        L20:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Timer[Time="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            float r1 = r1.getTime()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Paused="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            boolean r1 = r1.paused
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static {
            long r0 = org.lwjgl.Sys.getTimerResolution()
            org.lwjgl.util.Timer.resolution = r0
            tick()
            return
    }
}
