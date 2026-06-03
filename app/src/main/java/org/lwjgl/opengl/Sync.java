package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Sync.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Sync.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Sync.class */
class Sync {
    private static final long NANOS_IN_SECOND = 1000000000;
    private static long nextFrame;
    private static long lastFrameTime;
    private static long lastDelay;
    private static boolean initialised;
    private static org.lwjgl.opengl.Sync.RunningAvg sleepDurations;
    private static org.lwjgl.opengl.Sync.RunningAvg yieldDurations;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Sync$RunningAvg.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Sync$RunningAvg.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Sync$RunningAvg.class */
    private static class RunningAvg {
        private final long[] slots;
        private int offset;
        private static final long DAMPEN_THRESHOLD = 10000000;
        private static final float DAMPEN_FACTOR = 0.9f;

        public RunningAvg(int r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                long[] r1 = new long[r1]
                r0.slots = r1
                r0 = r3
                r1 = 0
                r0.offset = r1
                return
        }

        public void init(long r7) {
                r6 = this;
            L0:
                r0 = r6
                int r0 = r0.offset
                r1 = r6
                long[] r1 = r1.slots
                int r1 = r1.length
                if (r0 >= r1) goto L20
                r0 = r6
                long[] r0 = r0.slots
                r1 = r6
                r2 = r1
                int r2 = r2.offset
                r3 = r2; r2 = r1; r1 = r3; 
                r4 = 1
                int r3 = r3 + r4
                r2.offset = r3
                r2 = r7
                r0[r1] = r2
                goto L0
            L20:
                return
        }

        public void add(long r7) {
                r6 = this;
                r0 = r6
                long[] r0 = r0.slots
                r1 = r6
                r2 = r1
                int r2 = r2.offset
                r3 = r2; r2 = r1; r1 = r3; 
                r4 = 1
                int r3 = r3 + r4
                r2.offset = r3
                r2 = r6
                long[] r2 = r2.slots
                int r2 = r2.length
                int r1 = r1 % r2
                r2 = r7
                r0[r1] = r2
                r0 = r6
                r1 = r0
                int r1 = r1.offset
                r2 = r6
                long[] r2 = r2.slots
                int r2 = r2.length
                int r1 = r1 % r2
                r0.offset = r1
                return
        }

        public long avg() {
                r5 = this;
                r0 = 0
                r6 = r0
                r0 = 0
                r8 = r0
            L4:
                r0 = r8
                r1 = r5
                long[] r1 = r1.slots
                int r1 = r1.length
                if (r0 >= r1) goto L1c
                r0 = r6
                r1 = r5
                long[] r1 = r1.slots
                r2 = r8
                r1 = r1[r2]
                long r0 = r0 + r1
                r6 = r0
                int r8 = r8 + 1
                goto L4
            L1c:
                r0 = r6
                r1 = r5
                long[] r1 = r1.slots
                int r1 = r1.length
                long r1 = (long) r1
                long r0 = r0 / r1
                return r0
        }

        public void dampenForLowResTicker() {
                r5 = this;
                r0 = r5
                long r0 = r0.avg()
                r1 = 10000000(0x989680, double:4.9406565E-317)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L29
                r0 = 0
                r6 = r0
            Ld:
                r0 = r6
                r1 = r5
                long[] r1 = r1.slots
                int r1 = r1.length
                if (r0 >= r1) goto L29
                r0 = r5
                long[] r0 = r0.slots
                r1 = r6
                r2 = r0; r3 = r1; 
                r2 = r2[r3]
                float r2 = (float) r2
                r3 = 1063675494(0x3f666666, float:0.9)
                float r2 = r2 * r3
                long r2 = (long) r2
                r0[r1] = r2
                int r6 = r6 + 1
                goto Ld
            L29:
                return
        }
    }

    Sync() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void sync(int r2) {
            r0 = r2
            if (r0 > 0) goto L5
            return
        L5:
            r0 = r2
            preciseSync(r0)
            return
    }

    private static void fastSync(int r5) {
            boolean r0 = org.lwjgl.opengl.Sync.initialised
            if (r0 != 0) goto L10
            r0 = 1
            org.lwjgl.opengl.Sync.initialised = r0
            long r0 = getTime()
            org.lwjgl.opengl.Sync.lastFrameTime = r0
        L10:
            long r0 = getTime()
            r6 = r0
            r0 = r6
            long r1 = org.lwjgl.opengl.Sync.lastFrameTime
            long r0 = r0 - r1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r1
            r8 = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r1 = r5
            int r0 = r0 / r1
            long r0 = (long) r0
            r10 = r0
            r0 = r8
            r1 = r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4e
            r0 = r10
            r1 = r8
            long r0 = r0 - r1
            long r1 = org.lwjgl.opengl.Sync.lastDelay     // Catch: java.lang.InterruptedException -> L40
            long r0 = r0 + r1
            r1 = r10
            long r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.InterruptedException -> L40
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L40
            goto L47
        L40:
            r12 = move-exception
            r0 = r12
            r0.printStackTrace()
        L47:
            r0 = 0
            org.lwjgl.opengl.Sync.lastDelay = r0
            goto L55
        L4e:
            r0 = r8
            r1 = r10
            long r0 = r0 - r1
            org.lwjgl.opengl.Sync.lastDelay = r0
        L55:
            long r0 = getTime()
            org.lwjgl.opengl.Sync.lastFrameTime = r0
            return
    }

    private static void preciseSync(int r7) {
            boolean r0 = org.lwjgl.opengl.Sync.initialised
            if (r0 != 0) goto L9
            initialise()
        L9:
            long r0 = getTime()     // Catch: java.lang.InterruptedException -> L63
            r8 = r0
        Ld:
            long r0 = org.lwjgl.opengl.Sync.nextFrame     // Catch: java.lang.InterruptedException -> L63
            r1 = r8
            long r0 = r0 - r1
            org.lwjgl.opengl.Sync$RunningAvg r1 = org.lwjgl.opengl.Sync.sleepDurations     // Catch: java.lang.InterruptedException -> L63
            long r1 = r1.avg()     // Catch: java.lang.InterruptedException -> L63
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L32
            r0 = 1
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L63
            org.lwjgl.opengl.Sync$RunningAvg r0 = org.lwjgl.opengl.Sync.sleepDurations     // Catch: java.lang.InterruptedException -> L63
            long r1 = getTime()     // Catch: java.lang.InterruptedException -> L63
            r2 = r1; r1 = r0;      // Catch: java.lang.InterruptedException -> L63
            r10 = r2
            r2 = r8
            long r1 = r1 - r2
            r0.add(r1)     // Catch: java.lang.InterruptedException -> L63
            r0 = r10
            r8 = r0
            goto Ld
        L32:
            org.lwjgl.opengl.Sync$RunningAvg r0 = org.lwjgl.opengl.Sync.sleepDurations     // Catch: java.lang.InterruptedException -> L63
            r0.dampenForLowResTicker()     // Catch: java.lang.InterruptedException -> L63
            long r0 = getTime()     // Catch: java.lang.InterruptedException -> L63
            r8 = r0
        L3c:
            long r0 = org.lwjgl.opengl.Sync.nextFrame     // Catch: java.lang.InterruptedException -> L63
            r1 = r8
            long r0 = r0 - r1
            org.lwjgl.opengl.Sync$RunningAvg r1 = org.lwjgl.opengl.Sync.yieldDurations     // Catch: java.lang.InterruptedException -> L63
            long r1 = r1.avg()     // Catch: java.lang.InterruptedException -> L63
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L60
            java.lang.Thread.yield()     // Catch: java.lang.InterruptedException -> L63
            org.lwjgl.opengl.Sync$RunningAvg r0 = org.lwjgl.opengl.Sync.yieldDurations     // Catch: java.lang.InterruptedException -> L63
            long r1 = getTime()     // Catch: java.lang.InterruptedException -> L63
            r2 = r1; r1 = r0;      // Catch: java.lang.InterruptedException -> L63
            r10 = r2
            r2 = r8
            long r1 = r1 - r2
            r0.add(r1)     // Catch: java.lang.InterruptedException -> L63
            r0 = r10
            r8 = r0
            goto L3c
        L60:
            goto L64
        L63:
            r8 = move-exception
        L64:
            long r0 = org.lwjgl.opengl.Sync.nextFrame
            r1 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            r2 = r7
            long r2 = (long) r2
            long r1 = r1 / r2
            long r0 = r0 + r1
            long r1 = getTime()
            long r0 = java.lang.Math.max(r0, r1)
            org.lwjgl.opengl.Sync.nextFrame = r0
            return
    }

    private static void initialise() {
            r0 = 1
            org.lwjgl.opengl.Sync.initialised = r0
            org.lwjgl.opengl.Sync$RunningAvg r0 = org.lwjgl.opengl.Sync.sleepDurations
            r1 = 1000000(0xf4240, double:4.940656E-318)
            r0.init(r1)
            org.lwjgl.opengl.Sync$RunningAvg r0 = org.lwjgl.opengl.Sync.yieldDurations
            long r1 = getTime()
            long r2 = getTime()
            long r1 = r1 - r2
            long r1 = -r1
            double r1 = (double) r1
            r2 = 4608682117475931783(0x3ff553f7ced91687, double:1.333)
            double r1 = r1 * r2
            int r1 = (int) r1
            long r1 = (long) r1
            r0.init(r1)
            long r0 = getTime()
            org.lwjgl.opengl.Sync.nextFrame = r0
            return
    }

    private static long getTime() {
            long r0 = org.lwjgl.Sys.getTime()
            r1 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r1
            long r1 = org.lwjgl.Sys.getTimerResolution()
            long r0 = r0 / r1
            return r0
    }

    static {
            r0 = 0
            org.lwjgl.opengl.Sync.nextFrame = r0
            r0 = 0
            org.lwjgl.opengl.Sync.lastFrameTime = r0
            r0 = 0
            org.lwjgl.opengl.Sync.lastDelay = r0
            r0 = 0
            org.lwjgl.opengl.Sync.initialised = r0
            org.lwjgl.opengl.Sync$RunningAvg r0 = new org.lwjgl.opengl.Sync$RunningAvg
            r1 = r0
            r2 = 10
            r1.<init>(r2)
            org.lwjgl.opengl.Sync.sleepDurations = r0
            org.lwjgl.opengl.Sync$RunningAvg r0 = new org.lwjgl.opengl.Sync$RunningAvg
            r1 = r0
            r2 = 10
            r1.<init>(r2)
            org.lwjgl.opengl.Sync.yieldDurations = r0
            return
    }
}
