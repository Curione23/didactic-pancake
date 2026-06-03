package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil.class */
public final class MemoryUtil {
    public static final long NULL = 0;
    public static final int PAGE_SIZE = 0;
    public static final int CACHE_LINE_SIZE = 0;
    static final int ARRAY_TLC_SIZE = 0;
    static final java.lang.ThreadLocal<byte[]> ARRAY_TLC_BYTE = null;
    static final java.lang.ThreadLocal<char[]> ARRAY_TLC_CHAR = null;
    static final sun.misc.Unsafe UNSAFE = null;
    static final java.nio.ByteOrder NATIVE_ORDER = null;
    private static final java.nio.charset.Charset UTF16 = null;
    static final java.lang.Class<? extends java.nio.ByteBuffer> BUFFER_BYTE = null;
    static final java.lang.Class<? extends java.nio.ShortBuffer> BUFFER_SHORT = null;
    static final java.lang.Class<? extends java.nio.CharBuffer> BUFFER_CHAR = null;
    static final java.lang.Class<? extends java.nio.IntBuffer> BUFFER_INT = null;
    static final java.lang.Class<? extends java.nio.LongBuffer> BUFFER_LONG = null;
    static final java.lang.Class<? extends java.nio.FloatBuffer> BUFFER_FLOAT = null;
    static final java.lang.Class<? extends java.nio.DoubleBuffer> BUFFER_DOUBLE = null;
    private static final long MARK = 0;
    private static final long POSITION = 0;
    private static final long LIMIT = 0;
    private static final long CAPACITY = 0;
    private static final long ADDRESS = 0;
    private static final long PARENT_BYTE = 0;
    private static final long PARENT_SHORT = 0;
    private static final long PARENT_CHAR = 0;
    private static final long PARENT_INT = 0;
    private static final long PARENT_LONG = 0;
    private static final long PARENT_FLOAT = 0;
    private static final long PARENT_DOUBLE = 0;
    private static final int FILL_PATTERN_32 = 0;
    private static final long FILL_PATTERN_64 = 0;
    private static final int MAGIC_CAPACITY = 219540062;
    private static final int MAGIC_POSITION = 16435934;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$LazyInit.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$LazyInit.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$LazyInit.class */
    static final class LazyInit {
        static final org.lwjgl.system.MemoryUtil.MemoryAllocator ALLOCATOR_IMPL = null;
        static final org.lwjgl.system.MemoryUtil.MemoryAllocator ALLOCATOR = null;

        private LazyInit() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR
                r1 = 0
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r4 = r0
                org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryManage.getInstance()
                org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR_IMPL = r0
                r0 = r4
                if (r0 == 0) goto L28
                org.lwjgl.system.MemoryManage$DebugAllocator r0 = new org.lwjgl.system.MemoryManage$DebugAllocator
                r1 = r0
                org.lwjgl.system.MemoryUtil$MemoryAllocator r2 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR_IMPL
                r1.<init>(r2)
                goto L2b
            L28:
                org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR_IMPL
            L2b:
                org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "MemoryUtil allocator: "
                java.lang.StringBuilder r0 = r0.append(r1)
                org.lwjgl.system.MemoryUtil$MemoryAllocator r1 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                org.lwjgl.system.APIUtil.apiLog(r0)
                r0 = r4
                if (r0 == 0) goto L68
                org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_MEMORY_ALLOCATOR_FAST
                r1 = 0
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L68
                java.lang.String r0 = "Reminder: enable Configuration.DEBUG_MEMORY_ALLOCATOR_FAST for low overhead allocation tracking."
                org.lwjgl.system.APIUtil.apiLogMore(r0)
            L68:
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport.class */
    public interface MemoryAllocationReport {

        /* JADX WARN: Classes with same name are omitted, all sources:
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport$Aggregate.class
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport$Aggregate.class
         */
        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocationReport$Aggregate.class */
        public enum Aggregate extends java.lang.Enum<org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate> {
            public static final org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate ALL = null;
            public static final org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate GROUP_BY_METHOD = null;
            public static final org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate GROUP_BY_STACKTRACE = null;
            private static final /* synthetic */ org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate[] $VALUES = null;

            public static org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate[] values() {
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate[] r0 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.$VALUES
                    java.lang.Object r0 = r0.clone()
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate[] r0 = (org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate[]) r0
                    return r0
            }

            public static org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate valueOf(java.lang.String r3) {
                    java.lang.Class<org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate> r0 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.class
                    r1 = r3
                    java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r0 = (org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate) r0
                    return r0
            }

            Aggregate(java.lang.String r5, int r6) {
                    r4 = this;
                    r0 = r4
                    r1 = r5
                    r2 = r6
                    r0.<init>(r1, r2)
                    return
            }

            static {
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r0 = new org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate
                    r1 = r0
                    java.lang.String r2 = "ALL"
                    r3 = 0
                    r1.<init>(r2, r3)
                    org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.ALL = r0
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r0 = new org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate
                    r1 = r0
                    java.lang.String r2 = "GROUP_BY_METHOD"
                    r3 = 1
                    r1.<init>(r2, r3)
                    org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.GROUP_BY_METHOD = r0
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r0 = new org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate
                    r1 = r0
                    java.lang.String r2 = "GROUP_BY_STACKTRACE"
                    r3 = 2
                    r1.<init>(r2, r3)
                    org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.GROUP_BY_STACKTRACE = r0
                    r0 = 3
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate[] r0 = new org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate[r0]
                    r1 = r0
                    r2 = 0
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r3 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.ALL
                    r1[r2] = r3
                    r1 = r0
                    r2 = 1
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r3 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.GROUP_BY_METHOD
                    r1[r2] = r3
                    r1 = r0
                    r2 = 2
                    org.lwjgl.system.MemoryUtil$MemoryAllocationReport$Aggregate r3 = org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.GROUP_BY_STACKTRACE
                    r1[r2] = r3
                    org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate.$VALUES = r0
                    return
            }
        }

        void invoke(long r1, long r3, long r5, @javax.annotation.Nullable java.lang.String r7, @javax.annotation.Nullable java.lang.StackTraceElement... r8);
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocator.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocator.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryUtil$MemoryAllocator.class */
    public interface MemoryAllocator {
        long getMalloc();

        long getCalloc();

        long getRealloc();

        long getFree();

        long getAlignedAlloc();

        long getAlignedFree();

        long malloc(long r1);

        long calloc(long r1, long r3);

        long realloc(long r1, long r3);

        void free(long r1);

        long aligned_alloc(long r1, long r3);

        void aligned_free(long r1);
    }

    private MemoryUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static org.lwjgl.system.MemoryUtil.MemoryAllocator getAllocator() {
            r0 = 0
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = getAllocator(r0)
            return r0
    }

    public static org.lwjgl.system.MemoryUtil.MemoryAllocator getAllocator(boolean r2) {
            r0 = r2
            if (r0 == 0) goto La
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR
            goto Ld
        La:
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR_IMPL
        Ld:
            return r0
    }

    public static long nmemAlloc(long r4) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR
            r1 = r4
            long r0 = r0.malloc(r1)
            return r0
    }

    public static long nmemAllocChecked(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = r5
            goto Lb
        La:
            r0 = 1
        Lb:
            long r0 = nmemAlloc(r0)
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L23
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            r1.<init>()
            throw r0
        L23:
            r0 = r7
            return r0
    }

    private static long getAllocationSize(int r6, int r7) {
            r0 = r6
            r1 = r6
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = r7
            long r1 = r1 << r2
            boolean r2 = org.lwjgl.system.Pointer.BITS64
            if (r2 == 0) goto L13
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L16
        L13:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L16:
            long r0 = org.lwjgl.system.APIUtil.apiCheckAllocation(r0, r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer memAlloc(int r5) {
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r5
            long r1 = (long) r1
            long r1 = nmemAllocChecked(r1)
            r2 = r5
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ShortBuffer memAllocShort(int r5) {
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r5
            r2 = 1
            long r1 = getAllocationSize(r1, r2)
            long r1 = nmemAllocChecked(r1)
            r2 = r5
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    public static java.nio.IntBuffer memAllocInt(int r5) {
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r5
            r2 = 2
            long r1 = getAllocationSize(r1, r2)
            long r1 = nmemAllocChecked(r1)
            r2 = r5
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    public static java.nio.FloatBuffer memAllocFloat(int r5) {
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r5
            r2 = 2
            long r1 = getAllocationSize(r1, r2)
            long r1 = nmemAllocChecked(r1)
            r2 = r5
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    public static java.nio.LongBuffer memAllocLong(int r5) {
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r5
            r2 = 3
            long r1 = getAllocationSize(r1, r2)
            long r1 = nmemAllocChecked(r1)
            r2 = r5
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    public static org.lwjgl.CLongBuffer memAllocCLong(int r4) {
            r0 = r4
            int r1 = org.lwjgl.system.Pointer.CLONG_SHIFT
            long r0 = getAllocationSize(r0, r1)
            long r0 = nmemAllocChecked(r0)
            r1 = r4
            org.lwjgl.CLongBuffer r0 = org.lwjgl.CLongBuffer.create(r0, r1)
            return r0
    }

    public static java.nio.DoubleBuffer memAllocDouble(int r5) {
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r5
            r2 = 3
            long r1 = getAllocationSize(r1, r2)
            long r1 = nmemAllocChecked(r1)
            r2 = r5
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    public static org.lwjgl.PointerBuffer memAllocPointer(int r4) {
            r0 = r4
            int r1 = org.lwjgl.system.Pointer.POINTER_SHIFT
            long r0 = getAllocationSize(r0, r1)
            long r0 = nmemAllocChecked(r0)
            r1 = r4
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            return r0
    }

    public static void nmemFree(long r4) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR
            r1 = r4
            r0.free(r1)
            return
    }

    public static void memFree(@javax.annotation.Nullable java.nio.Buffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemFree(r0)
        L11:
            return
    }

    public static void memFree(@javax.annotation.Nullable java.nio.ByteBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemFree(r0)
        L11:
            return
    }

    public static void memFree(@javax.annotation.Nullable java.nio.ShortBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemFree(r0)
        L11:
            return
    }

    public static void memFree(@javax.annotation.Nullable java.nio.CharBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemFree(r0)
        L11:
            return
    }

    public static void memFree(@javax.annotation.Nullable java.nio.IntBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemFree(r0)
        L11:
            return
    }

    public static void memFree(@javax.annotation.Nullable java.nio.LongBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemFree(r0)
        L11:
            return
    }

    public static void memFree(@javax.annotation.Nullable java.nio.FloatBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemFree(r0)
        L11:
            return
    }

    public static void memFree(@javax.annotation.Nullable java.nio.DoubleBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemFree(r0)
        L11:
            return
    }

    public static void memFree(@javax.annotation.Nullable org.lwjgl.system.CustomBuffer<?> r3) {
            r0 = r3
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = r0.address
            nmemFree(r0)
        Lb:
            return
    }

    public static void memFree(@javax.annotation.Nullable org.lwjgl.PointerBuffer r3) {
            r0 = r3
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = r0.address
            nmemFree(r0)
        Lb:
            return
    }

    public static long nmemCalloc(long r6, long r8) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR
            r1 = r6
            r2 = r8
            long r0 = r0.calloc(r1, r2)
            return r0
    }

    public static long nmemCallocChecked(long r5, long r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lc
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L10
        Lc:
            r0 = 1
            r5 = r0
            r0 = 1
            r7 = r0
        L10:
            r0 = r5
            r1 = r7
            long r0 = nmemCalloc(r0, r1)
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2c
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2c
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            r1.<init>()
            throw r0
        L2c:
            r0 = r9
            return r0
    }

    public static java.nio.ByteBuffer memCalloc(int r6, int r7) {
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = (long) r1
            r2 = r7
            long r2 = (long) r2
            long r1 = nmemCallocChecked(r1, r2)
            r2 = r6
            r3 = r7
            int r2 = r2 * r3
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ByteBuffer memCalloc(int r6) {
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = (long) r1
            r2 = 1
            long r1 = nmemCallocChecked(r1, r2)
            r2 = r6
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ShortBuffer memCallocShort(int r6) {
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r6
            long r1 = (long) r1
            r2 = 2
            long r1 = nmemCallocChecked(r1, r2)
            r2 = r6
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    public static java.nio.IntBuffer memCallocInt(int r6) {
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r6
            long r1 = (long) r1
            r2 = 4
            long r1 = nmemCallocChecked(r1, r2)
            r2 = r6
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    public static java.nio.FloatBuffer memCallocFloat(int r6) {
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r6
            long r1 = (long) r1
            r2 = 4
            long r1 = nmemCallocChecked(r1, r2)
            r2 = r6
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    public static java.nio.LongBuffer memCallocLong(int r6) {
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r6
            long r1 = (long) r1
            r2 = 8
            long r1 = nmemCallocChecked(r1, r2)
            r2 = r6
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    public static org.lwjgl.CLongBuffer memCallocCLong(int r5) {
            r0 = r5
            long r0 = (long) r0
            int r1 = org.lwjgl.system.Pointer.CLONG_SIZE
            long r1 = (long) r1
            long r0 = nmemCallocChecked(r0, r1)
            r1 = r5
            org.lwjgl.CLongBuffer r0 = org.lwjgl.CLongBuffer.create(r0, r1)
            return r0
    }

    public static java.nio.DoubleBuffer memCallocDouble(int r6) {
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r6
            long r1 = (long) r1
            r2 = 8
            long r1 = nmemCallocChecked(r1, r2)
            r2 = r6
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    public static org.lwjgl.PointerBuffer memCallocPointer(int r5) {
            r0 = r5
            long r0 = (long) r0
            int r1 = org.lwjgl.system.Pointer.POINTER_SIZE
            long r1 = (long) r1
            long r0 = nmemCallocChecked(r0, r1)
            r1 = r5
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            return r0
    }

    public static long nmemRealloc(long r6, long r8) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR
            r1 = r6
            r2 = r8
            long r0 = r0.realloc(r1, r2)
            return r0
    }

    public static long nmemReallocChecked(long r7, long r9) {
            r0 = r7
            r1 = r9
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto Lb
            r1 = r9
            goto Lc
        Lb:
            r1 = 1
        Lc:
            long r0 = nmemRealloc(r0, r1)
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L26
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L26
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            r1.<init>()
            throw r0
        L26:
            r0 = r11
            return r0
    }

    private static <T extends java.nio.Buffer> T realloc(@javax.annotation.Nullable T r4, T r5, int r6) {
            r0 = r4
            if (r0 == 0) goto L11
            r0 = r5
            r1 = r4
            int r1 = r1.position()
            r2 = r6
            int r1 = java.lang.Math.min(r1, r2)
            java.nio.Buffer r0 = r0.position(r1)
        L11:
            r0 = r5
            return r0
    }

    public static java.nio.ByteBuffer memRealloc(@javax.annotation.Nullable java.nio.ByteBuffer r6, int r7) {
            r0 = r6
            r1 = r6
            if (r1 != 0) goto L9
            r1 = 0
            goto L13
        L9:
            sun.misc.Unsafe r1 = org.lwjgl.system.MemoryUtil.UNSAFE
            r2 = r6
            long r3 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r1 = r1.getLong(r2, r3)
        L13:
            r2 = r7
            long r2 = (long) r2
            long r1 = nmemReallocChecked(r1, r2)
            r2 = r7
            java.nio.ByteBuffer r1 = memByteBuffer(r1, r2)
            r2 = r7
            java.nio.Buffer r0 = realloc(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
    }

    public static java.nio.ShortBuffer memRealloc(@javax.annotation.Nullable java.nio.ShortBuffer r6, int r7) {
            r0 = r6
            r1 = r6
            if (r1 != 0) goto L9
            r1 = 0
            goto L13
        L9:
            sun.misc.Unsafe r1 = org.lwjgl.system.MemoryUtil.UNSAFE
            r2 = r6
            long r3 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r1 = r1.getLong(r2, r3)
        L13:
            r2 = r7
            r3 = 1
            long r2 = getAllocationSize(r2, r3)
            long r1 = nmemReallocChecked(r1, r2)
            r2 = r7
            java.nio.ShortBuffer r1 = memShortBuffer(r1, r2)
            r2 = r7
            java.nio.Buffer r0 = realloc(r0, r1, r2)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    public static java.nio.IntBuffer memRealloc(@javax.annotation.Nullable java.nio.IntBuffer r6, int r7) {
            r0 = r6
            r1 = r6
            if (r1 != 0) goto L9
            r1 = 0
            goto L13
        L9:
            sun.misc.Unsafe r1 = org.lwjgl.system.MemoryUtil.UNSAFE
            r2 = r6
            long r3 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r1 = r1.getLong(r2, r3)
        L13:
            r2 = r7
            r3 = 2
            long r2 = getAllocationSize(r2, r3)
            long r1 = nmemReallocChecked(r1, r2)
            r2 = r7
            java.nio.IntBuffer r1 = memIntBuffer(r1, r2)
            r2 = r7
            java.nio.Buffer r0 = realloc(r0, r1, r2)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    public static java.nio.LongBuffer memRealloc(@javax.annotation.Nullable java.nio.LongBuffer r6, int r7) {
            r0 = r6
            r1 = r6
            if (r1 != 0) goto L9
            r1 = 0
            goto L13
        L9:
            sun.misc.Unsafe r1 = org.lwjgl.system.MemoryUtil.UNSAFE
            r2 = r6
            long r3 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r1 = r1.getLong(r2, r3)
        L13:
            r2 = r7
            r3 = 3
            long r2 = getAllocationSize(r2, r3)
            long r1 = nmemReallocChecked(r1, r2)
            r2 = r7
            java.nio.LongBuffer r1 = memLongBuffer(r1, r2)
            r2 = r7
            java.nio.Buffer r0 = realloc(r0, r1, r2)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    public static org.lwjgl.CLongBuffer memRealloc(@javax.annotation.Nullable org.lwjgl.CLongBuffer r5, int r6) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r5
            long r0 = r0.address
        Lc:
            r1 = r6
            int r2 = org.lwjgl.system.Pointer.CLONG_SIZE
            long r1 = getAllocationSize(r1, r2)
            long r0 = nmemReallocChecked(r0, r1)
            r1 = r6
            org.lwjgl.CLongBuffer r0 = memCLongBuffer(r0, r1)
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = r7
            r1 = r5
            int r1 = r1.position()
            r2 = r6
            int r1 = java.lang.Math.min(r1, r2)
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
        L2c:
            r0 = r7
            return r0
    }

    public static java.nio.FloatBuffer memRealloc(@javax.annotation.Nullable java.nio.FloatBuffer r6, int r7) {
            r0 = r6
            r1 = r6
            if (r1 != 0) goto L9
            r1 = 0
            goto L13
        L9:
            sun.misc.Unsafe r1 = org.lwjgl.system.MemoryUtil.UNSAFE
            r2 = r6
            long r3 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r1 = r1.getLong(r2, r3)
        L13:
            r2 = r7
            r3 = 2
            long r2 = getAllocationSize(r2, r3)
            long r1 = nmemReallocChecked(r1, r2)
            r2 = r7
            java.nio.FloatBuffer r1 = memFloatBuffer(r1, r2)
            r2 = r7
            java.nio.Buffer r0 = realloc(r0, r1, r2)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    public static java.nio.DoubleBuffer memRealloc(@javax.annotation.Nullable java.nio.DoubleBuffer r6, int r7) {
            r0 = r6
            r1 = r6
            if (r1 != 0) goto L9
            r1 = 0
            goto L13
        L9:
            sun.misc.Unsafe r1 = org.lwjgl.system.MemoryUtil.UNSAFE
            r2 = r6
            long r3 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r1 = r1.getLong(r2, r3)
        L13:
            r2 = r7
            r3 = 3
            long r2 = getAllocationSize(r2, r3)
            long r1 = nmemReallocChecked(r1, r2)
            r2 = r7
            java.nio.DoubleBuffer r1 = memDoubleBuffer(r1, r2)
            r2 = r7
            java.nio.Buffer r0 = realloc(r0, r1, r2)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    public static org.lwjgl.PointerBuffer memRealloc(@javax.annotation.Nullable org.lwjgl.PointerBuffer r5, int r6) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r5
            long r0 = r0.address
        Lc:
            r1 = r6
            int r2 = org.lwjgl.system.Pointer.POINTER_SHIFT
            long r1 = getAllocationSize(r1, r2)
            long r0 = nmemReallocChecked(r0, r1)
            r1 = r6
            org.lwjgl.PointerBuffer r0 = memPointerBuffer(r0, r1)
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = r7
            r1 = r5
            int r1 = r1.position()
            r2 = r6
            int r1 = java.lang.Math.min(r1, r2)
            org.lwjgl.system.CustomBuffer r0 = r0.position(r1)
        L2c:
            r0 = r7
            return r0
    }

    public static long nmemAlignedAlloc(long r6, long r8) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR
            r1 = r6
            r2 = r8
            long r0 = r0.aligned_alloc(r1, r2)
            return r0
    }

    public static long nmemAlignedAllocChecked(long r7, long r9) {
            r0 = r7
            r1 = r9
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto Lb
            r1 = r9
            goto Lc
        Lb:
            r1 = 1
        Lc:
            long r0 = nmemAlignedAlloc(r0, r1)
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L26
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L26
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            r1.<init>()
            throw r0
        L26:
            r0 = r11
            return r0
    }

    public static java.nio.ByteBuffer memAlignedAlloc(int r6, int r7) {
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = (long) r1
            r2 = r7
            long r2 = (long) r2
            long r1 = nmemAlignedAllocChecked(r1, r2)
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static void nmemAlignedFree(long r4) {
            org.lwjgl.system.MemoryUtil$MemoryAllocator r0 = org.lwjgl.system.MemoryUtil.LazyInit.ALLOCATOR
            r1 = r4
            r0.aligned_free(r1)
            return
    }

    public static void memAlignedFree(@javax.annotation.Nullable java.nio.ByteBuffer r5) {
            r0 = r5
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            nmemAlignedFree(r0)
        L11:
            return
    }

    public static void memReport(org.lwjgl.system.MemoryUtil.MemoryAllocationReport r2) {
            r0 = r2
            org.lwjgl.system.MemoryManage.DebugAllocator.report(r0)
            return
    }

    public static void memReport(org.lwjgl.system.MemoryUtil.MemoryAllocationReport r4, org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate r5, boolean r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.system.MemoryManage.DebugAllocator.report(r0, r1, r2)
            return
    }

    public static long memAddress0(java.nio.Buffer r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long memAddress0(java.nio.ByteBuffer r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long memAddress0(java.nio.ShortBuffer r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long memAddress0(java.nio.CharBuffer r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long memAddress0(java.nio.IntBuffer r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long memAddress0(java.nio.LongBuffer r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long memAddress0(java.nio.FloatBuffer r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long memAddress0(java.nio.DoubleBuffer r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long memAddress(java.nio.ByteBuffer r5) {
            r0 = r5
            int r0 = r0.position()
            long r0 = (long) r0
            r1 = r5
            long r1 = memAddress0(r1)
            long r0 = r0 + r1
            return r0
    }

    public static long memAddress(java.nio.ByteBuffer r5, int r6) {
            r0 = r5
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r0 = r5
            long r0 = memAddress0(r0)
            r1 = r6
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            long r0 = r0 + r1
            return r0
    }

    private static long address(int r7, int r8, long r9) {
            r0 = r9
            r1 = r7
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            r2 = r8
            long r1 = r1 << r2
            long r0 = r0 + r1
            return r0
    }

    public static long memAddress(java.nio.ShortBuffer r5) {
            r0 = r5
            int r0 = r0.position()
            r1 = 1
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.ShortBuffer r5, int r6) {
            r0 = r5
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r0 = r6
            r1 = 1
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.CharBuffer r5) {
            r0 = r5
            int r0 = r0.position()
            r1 = 1
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.CharBuffer r5, int r6) {
            r0 = r5
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r0 = r6
            r1 = 1
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.IntBuffer r5) {
            r0 = r5
            int r0 = r0.position()
            r1 = 2
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.IntBuffer r5, int r6) {
            r0 = r5
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r0 = r6
            r1 = 2
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.FloatBuffer r5) {
            r0 = r5
            int r0 = r0.position()
            r1 = 2
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.FloatBuffer r5, int r6) {
            r0 = r5
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r0 = r6
            r1 = 2
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.LongBuffer r5) {
            r0 = r5
            int r0 = r0.position()
            r1 = 3
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.LongBuffer r5, int r6) {
            r0 = r5
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r0 = r6
            r1 = 3
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.DoubleBuffer r5) {
            r0 = r5
            int r0 = r0.position()
            r1 = 3
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.DoubleBuffer r5, int r6) {
            r0 = r5
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            r0 = r6
            r1 = 3
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(java.nio.Buffer r7) {
            r0 = r7
            boolean r0 = r0 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto Lc
            r0 = 0
            r8 = r0
            goto L34
        Lc:
            r0 = r7
            boolean r0 = r0 instanceof java.nio.ShortBuffer
            if (r0 != 0) goto L1a
            r0 = r7
            boolean r0 = r0 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L1f
        L1a:
            r0 = 1
            r8 = r0
            goto L34
        L1f:
            r0 = r7
            boolean r0 = r0 instanceof java.nio.IntBuffer
            if (r0 != 0) goto L2d
            r0 = r7
            boolean r0 = r0 instanceof java.nio.FloatBuffer
            if (r0 == 0) goto L32
        L2d:
            r0 = 2
            r8 = r0
            goto L34
        L32:
            r0 = 3
            r8 = r0
        L34:
            r0 = r7
            int r0 = r0.position()
            r1 = r8
            sun.misc.Unsafe r2 = org.lwjgl.system.MemoryUtil.UNSAFE
            r3 = r7
            long r4 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r2 = r2.getLong(r3, r4)
            long r0 = address(r0, r1, r2)
            return r0
    }

    public static long memAddress(org.lwjgl.system.CustomBuffer<?> r3) {
            r0 = r3
            long r0 = r0.address()
            return r0
    }

    public static long memAddress(org.lwjgl.system.CustomBuffer<?> r3, int r4) {
            r0 = r3
            r1 = r4
            long r0 = r0.address(r1)
            return r0
    }

    public static long memAddressSafe(@javax.annotation.Nullable java.nio.ByteBuffer r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            r0 = r5
            long r0 = memAddress0(r0)
            r1 = r5
            int r1 = r1.position()
            long r1 = (long) r1
            long r0 = r0 + r1
        L12:
            return r0
    }

    public static long memAddressSafe(@javax.annotation.Nullable java.nio.ShortBuffer r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto L14
        L8:
            r0 = r5
            int r0 = r0.position()
            r1 = 1
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
        L14:
            return r0
    }

    public static long memAddressSafe(@javax.annotation.Nullable java.nio.CharBuffer r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto L14
        L8:
            r0 = r5
            int r0 = r0.position()
            r1 = 1
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
        L14:
            return r0
    }

    public static long memAddressSafe(@javax.annotation.Nullable java.nio.IntBuffer r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto L14
        L8:
            r0 = r5
            int r0 = r0.position()
            r1 = 2
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
        L14:
            return r0
    }

    public static long memAddressSafe(@javax.annotation.Nullable java.nio.FloatBuffer r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto L14
        L8:
            r0 = r5
            int r0 = r0.position()
            r1 = 2
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
        L14:
            return r0
    }

    public static long memAddressSafe(@javax.annotation.Nullable java.nio.LongBuffer r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto L14
        L8:
            r0 = r5
            int r0 = r0.position()
            r1 = 3
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
        L14:
            return r0
    }

    public static long memAddressSafe(@javax.annotation.Nullable java.nio.DoubleBuffer r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto L14
        L8:
            r0 = r5
            int r0 = r0.position()
            r1 = 3
            r2 = r5
            long r2 = memAddress0(r2)
            long r0 = address(r0, r1, r2)
        L14:
            return r0
    }

    public static long memAddressSafe(@javax.annotation.Nullable org.lwjgl.system.Pointer r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            r0 = r3
            long r0 = r0.address()
        Le:
            return r0
    }

    public static java.nio.ByteBuffer memByteBuffer(long r5, int r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memByteBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L1b
        La:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
        L1b:
            return r0
    }

    public static java.nio.ByteBuffer memByteBuffer(java.nio.ShortBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r1 = r6
            int r1 = r1.remaining()
            if (r0 >= r1) goto L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The source buffer range is too wide"
            r1.<init>(r2)
            throw r0
        L19:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = memAddress(r1)
            r2 = r6
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 << r3
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBuffer(java.nio.CharBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r1 = r6
            int r1 = r1.remaining()
            if (r0 >= r1) goto L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The source buffer range is too wide"
            r1.<init>(r2)
            throw r0
        L19:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = memAddress(r1)
            r2 = r6
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 << r3
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBuffer(java.nio.IntBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1 = r6
            int r1 = r1.remaining()
            if (r0 >= r1) goto L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The source buffer range is too wide"
            r1.<init>(r2)
            throw r0
        L19:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = memAddress(r1)
            r2 = r6
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 << r3
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBuffer(java.nio.LongBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = 268435455(0xfffffff, float:2.5243547E-29)
            r1 = r6
            int r1 = r1.remaining()
            if (r0 >= r1) goto L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The source buffer range is too wide"
            r1.<init>(r2)
            throw r0
        L19:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = memAddress(r1)
            r2 = r6
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 << r3
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBuffer(java.nio.FloatBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1 = r6
            int r1 = r1.remaining()
            if (r0 >= r1) goto L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The source buffer range is too wide"
            r1.<init>(r2)
            throw r0
        L19:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = memAddress(r1)
            r2 = r6
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 << r3
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBuffer(java.nio.DoubleBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = 268435455(0xfffffff, float:2.5243547E-29)
            r1 = r6
            int r1 = r1.remaining()
            if (r0 >= r1) goto L19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The source buffer range is too wide"
            r1.<init>(r2)
            throw r0
        L19:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = memAddress(r1)
            r2 = r6
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 << r3
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBuffer(org.lwjgl.system.CustomBuffer<?> r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r6
            int r1 = r1.sizeof()
            int r0 = r0 / r1
            r1 = r6
            int r1 = r1.remaining()
            if (r0 >= r1) goto L1e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The source buffer range is too wide"
            r1.<init>(r2)
            throw r0
        L1e:
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r6
            long r1 = memAddress(r1)
            r2 = r6
            int r2 = r2.remaining()
            r3 = r6
            int r3 = r3.sizeof()
            int r2 = r2 * r3
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static <T extends org.lwjgl.system.Struct<T>> java.nio.ByteBuffer memByteBuffer(T r5) {
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r5
            long r1 = r1.address
            r2 = r5
            int r2 = r2.sizeof()
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ShortBuffer memShortBuffer(long r5, int r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ShortBuffer memShortBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L15
        La:
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
        L15:
            return r0
    }

    public static java.nio.CharBuffer memCharBuffer(long r5, int r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            java.lang.Class<? extends java.nio.CharBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_CHAR
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.CharBuffer r0 = (java.nio.CharBuffer) r0
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.CharBuffer memCharBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L15
        La:
            java.lang.Class<? extends java.nio.CharBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_CHAR
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.CharBuffer r0 = (java.nio.CharBuffer) r0
        L15:
            return r0
    }

    public static java.nio.IntBuffer memIntBuffer(long r5, int r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer memIntBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L15
        La:
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
        L15:
            return r0
    }

    public static java.nio.LongBuffer memLongBuffer(long r5, int r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer memLongBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L15
        La:
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
        L15:
            return r0
    }

    public static org.lwjgl.CLongBuffer memCLongBuffer(long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            org.lwjgl.CLongBuffer r0 = org.lwjgl.CLongBuffer.create(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.CLongBuffer memCLongBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Lf
        La:
            r0 = r5
            r1 = r7
            org.lwjgl.CLongBuffer r0 = org.lwjgl.CLongBuffer.create(r0, r1)
        Lf:
            return r0
    }

    public static java.nio.FloatBuffer memFloatBuffer(long r5, int r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.FloatBuffer memFloatBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L15
        La:
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
        L15:
            return r0
    }

    public static java.nio.DoubleBuffer memDoubleBuffer(long r5, int r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.DoubleBuffer memDoubleBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L15
        La:
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r5
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
        L15:
            return r0
    }

    public static org.lwjgl.PointerBuffer memPointerBuffer(long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer memPointerBufferSafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Lf
        La:
            r0 = r5
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.PointerBuffer.create(r0, r1)
        Lf:
            return r0
    }

    public static java.nio.ByteBuffer memDuplicate(java.nio.ByteBuffer r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE     // Catch: java.lang.InstantiationException -> L10
            java.lang.Class<? extends java.nio.ByteBuffer> r1 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE     // Catch: java.lang.InstantiationException -> L10
            java.lang.Object r0 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L10
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.InstantiationException -> L10
            r10 = r0
            goto L1a
        L10:
            r11 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        L1a:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r9
            long r5 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r3 = r3.getLong(r4, r5)
            r0.putLong(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtil.MARK
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r9
            long r5 = org.lwjgl.system.MemoryUtil.MARK
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtil.POSITION
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r9
            long r5 = org.lwjgl.system.MemoryUtil.POSITION
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtil.LIMIT
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r9
            long r5 = org.lwjgl.system.MemoryUtil.LIMIT
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtil.CAPACITY
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r9
            long r5 = org.lwjgl.system.MemoryUtil.CAPACITY
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r9
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_BYTE
            java.lang.Object r0 = r0.getObject(r1, r2)
            r11 = r0
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r10
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_BYTE
            r3 = r11
            if (r3 != 0) goto L98
            r3 = r9
            goto L99
        L98:
            r3 = r11
        L99:
            r0.putObject(r1, r2, r3)
            r0 = r10
            r1 = r9
            java.nio.ByteOrder r1 = r1.order()
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    public static java.nio.ShortBuffer memDuplicate(java.nio.ShortBuffer r5) {
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_SHORT
            java.nio.Buffer r0 = duplicate(r0, r1, r2)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    public static java.nio.CharBuffer memDuplicate(java.nio.CharBuffer r5) {
            java.lang.Class<? extends java.nio.CharBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_CHAR
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_CHAR
            java.nio.Buffer r0 = duplicate(r0, r1, r2)
            java.nio.CharBuffer r0 = (java.nio.CharBuffer) r0
            return r0
    }

    public static java.nio.IntBuffer memDuplicate(java.nio.IntBuffer r5) {
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_INT
            java.nio.Buffer r0 = duplicate(r0, r1, r2)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    public static java.nio.LongBuffer memDuplicate(java.nio.LongBuffer r5) {
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_LONG
            java.nio.Buffer r0 = duplicate(r0, r1, r2)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    public static java.nio.FloatBuffer memDuplicate(java.nio.FloatBuffer r5) {
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_FLOAT
            java.nio.Buffer r0 = duplicate(r0, r1, r2)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    public static java.nio.DoubleBuffer memDuplicate(java.nio.DoubleBuffer r5) {
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r5
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_DOUBLE
            java.nio.Buffer r0 = duplicate(r0, r1, r2)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    public static java.nio.ByteBuffer memSlice(java.nio.ByteBuffer r6) {
            r0 = r6
            r1 = r6
            long r1 = memAddress0(r1)
            r2 = r6
            int r2 = r2.position()
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r6
            int r2 = r2.remaining()
            java.nio.ByteBuffer r0 = slice(r0, r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer memSlice(java.nio.ShortBuffer r8) {
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r8
            r2 = r8
            int r2 = r2.position()
            r3 = 1
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r8
            int r3 = r3.remaining()
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_SHORT
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    public static java.nio.CharBuffer memSlice(java.nio.CharBuffer r8) {
            java.lang.Class<? extends java.nio.CharBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_CHAR
            r1 = r8
            r2 = r8
            int r2 = r2.position()
            r3 = 1
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r8
            int r3 = r3.remaining()
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_CHAR
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.CharBuffer r0 = (java.nio.CharBuffer) r0
            return r0
    }

    public static java.nio.IntBuffer memSlice(java.nio.IntBuffer r8) {
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r8
            r2 = r8
            int r2 = r2.position()
            r3 = 2
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r8
            int r3 = r3.remaining()
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_INT
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    public static java.nio.LongBuffer memSlice(java.nio.LongBuffer r8) {
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r8
            r2 = r8
            int r2 = r2.position()
            r3 = 3
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r8
            int r3 = r3.remaining()
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_LONG
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    public static java.nio.FloatBuffer memSlice(java.nio.FloatBuffer r8) {
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r8
            r2 = r8
            int r2 = r2.position()
            r3 = 2
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r8
            int r3 = r3.remaining()
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_FLOAT
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    public static java.nio.DoubleBuffer memSlice(java.nio.DoubleBuffer r8) {
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r8
            r2 = r8
            int r2 = r2.position()
            r3 = 3
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r8
            int r3 = r3.remaining()
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_DOUBLE
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    public static java.nio.ByteBuffer memSlice(java.nio.ByteBuffer r6, int r7, int r8) {
            r0 = r6
            int r0 = r0.position()
            r1 = r7
            int r0 = r0 + r1
            r9 = r0
            r0 = r7
            if (r0 < 0) goto L13
            r0 = r6
            int r0 = r0.limit()
            r1 = r9
            if (r0 >= r1) goto L1b
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r8
            if (r0 < 0) goto L29
            r0 = r6
            int r0 = r0.capacity()
            r1 = r9
            int r0 = r0 - r1
            r1 = r8
            if (r0 >= r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            r0 = r6
            r1 = r6
            long r1 = memAddress0(r1)
            r2 = r9
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r8
            java.nio.ByteBuffer r0 = slice(r0, r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer memSlice(java.nio.ShortBuffer r8, int r9, int r10) {
            r0 = r8
            int r0 = r0.position()
            r1 = r9
            int r0 = r0 + r1
            r11 = r0
            r0 = r9
            if (r0 < 0) goto L13
            r0 = r8
            int r0 = r0.limit()
            r1 = r11
            if (r0 >= r1) goto L1b
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r10
            if (r0 < 0) goto L29
            r0 = r8
            int r0 = r0.capacity()
            r1 = r11
            int r0 = r0 - r1
            r1 = r10
            if (r0 >= r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            java.lang.Class<? extends java.nio.ShortBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_SHORT
            r1 = r8
            r2 = r11
            r3 = 1
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r10
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_SHORT
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.ShortBuffer r0 = (java.nio.ShortBuffer) r0
            return r0
    }

    public static java.nio.CharBuffer memSlice(java.nio.CharBuffer r8, int r9, int r10) {
            r0 = r8
            int r0 = r0.position()
            r1 = r9
            int r0 = r0 + r1
            r11 = r0
            r0 = r9
            if (r0 < 0) goto L13
            r0 = r8
            int r0 = r0.limit()
            r1 = r11
            if (r0 >= r1) goto L1b
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r10
            if (r0 < 0) goto L29
            r0 = r8
            int r0 = r0.capacity()
            r1 = r11
            int r0 = r0 - r1
            r1 = r10
            if (r0 >= r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            java.lang.Class<? extends java.nio.CharBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_CHAR
            r1 = r8
            r2 = r11
            r3 = 1
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r10
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_CHAR
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.CharBuffer r0 = (java.nio.CharBuffer) r0
            return r0
    }

    public static java.nio.IntBuffer memSlice(java.nio.IntBuffer r8, int r9, int r10) {
            r0 = r8
            int r0 = r0.position()
            r1 = r9
            int r0 = r0 + r1
            r11 = r0
            r0 = r9
            if (r0 < 0) goto L13
            r0 = r8
            int r0 = r0.limit()
            r1 = r11
            if (r0 >= r1) goto L1b
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r10
            if (r0 < 0) goto L29
            r0 = r8
            int r0 = r0.capacity()
            r1 = r11
            int r0 = r0 - r1
            r1 = r10
            if (r0 >= r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            java.lang.Class<? extends java.nio.IntBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_INT
            r1 = r8
            r2 = r11
            r3 = 2
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r10
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_INT
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.IntBuffer r0 = (java.nio.IntBuffer) r0
            return r0
    }

    public static java.nio.LongBuffer memSlice(java.nio.LongBuffer r8, int r9, int r10) {
            r0 = r8
            int r0 = r0.position()
            r1 = r9
            int r0 = r0 + r1
            r11 = r0
            r0 = r9
            if (r0 < 0) goto L13
            r0 = r8
            int r0 = r0.limit()
            r1 = r11
            if (r0 >= r1) goto L1b
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r10
            if (r0 < 0) goto L29
            r0 = r8
            int r0 = r0.capacity()
            r1 = r11
            int r0 = r0 - r1
            r1 = r10
            if (r0 >= r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            java.lang.Class<? extends java.nio.LongBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_LONG
            r1 = r8
            r2 = r11
            r3 = 3
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r10
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_LONG
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.LongBuffer r0 = (java.nio.LongBuffer) r0
            return r0
    }

    public static java.nio.FloatBuffer memSlice(java.nio.FloatBuffer r8, int r9, int r10) {
            r0 = r8
            int r0 = r0.position()
            r1 = r9
            int r0 = r0 + r1
            r11 = r0
            r0 = r9
            if (r0 < 0) goto L13
            r0 = r8
            int r0 = r0.limit()
            r1 = r11
            if (r0 >= r1) goto L1b
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r10
            if (r0 < 0) goto L29
            r0 = r8
            int r0 = r0.capacity()
            r1 = r11
            int r0 = r0 - r1
            r1 = r10
            if (r0 >= r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            java.lang.Class<? extends java.nio.FloatBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_FLOAT
            r1 = r8
            r2 = r11
            r3 = 2
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r10
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_FLOAT
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0
            return r0
    }

    public static java.nio.DoubleBuffer memSlice(java.nio.DoubleBuffer r8, int r9, int r10) {
            r0 = r8
            int r0 = r0.position()
            r1 = r9
            int r0 = r0 + r1
            r11 = r0
            r0 = r9
            if (r0 < 0) goto L13
            r0 = r8
            int r0 = r0.limit()
            r1 = r11
            if (r0 >= r1) goto L1b
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b:
            r0 = r10
            if (r0 < 0) goto L29
            r0 = r8
            int r0 = r0.capacity()
            r1 = r11
            int r0 = r0 - r1
            r1 = r10
            if (r0 >= r1) goto L31
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L31:
            java.lang.Class<? extends java.nio.DoubleBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE
            r1 = r8
            r2 = r11
            r3 = 3
            r4 = r8
            long r4 = memAddress0(r4)
            long r2 = address(r2, r3, r4)
            r3 = r10
            long r4 = org.lwjgl.system.MemoryUtil.PARENT_DOUBLE
            java.nio.Buffer r0 = slice(r0, r1, r2, r3, r4)
            java.nio.DoubleBuffer r0 = (java.nio.DoubleBuffer) r0
            return r0
    }

    public static <T extends org.lwjgl.system.CustomBuffer<T>> T memSlice(T r4, int r5, int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.system.CustomBuffer r0 = r0.slice(r1, r2)
            return r0
    }

    public static void memSet(java.nio.ByteBuffer r6, int r7) {
            r0 = r6
            long r0 = memAddress(r0)
            r1 = r7
            r2 = r6
            int r2 = r2.remaining()
            long r2 = (long) r2
            memSet(r0, r1, r2)
            return
    }

    public static void memSet(java.nio.ShortBuffer r6, int r7) {
            r0 = r6
            long r0 = memAddress(r0)
            r1 = r7
            r2 = r6
            int r2 = r2.remaining()
            r3 = 1
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            memSet(r0, r1, r2)
            return
    }

    public static void memSet(java.nio.CharBuffer r6, int r7) {
            r0 = r6
            long r0 = memAddress(r0)
            r1 = r7
            r2 = r6
            int r2 = r2.remaining()
            r3 = 1
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            memSet(r0, r1, r2)
            return
    }

    public static void memSet(java.nio.IntBuffer r6, int r7) {
            r0 = r6
            long r0 = memAddress(r0)
            r1 = r7
            r2 = r6
            int r2 = r2.remaining()
            r3 = 2
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            memSet(r0, r1, r2)
            return
    }

    public static void memSet(java.nio.LongBuffer r6, int r7) {
            r0 = r6
            long r0 = memAddress(r0)
            r1 = r7
            r2 = r6
            int r2 = r2.remaining()
            r3 = 3
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            memSet(r0, r1, r2)
            return
    }

    public static void memSet(java.nio.FloatBuffer r6, int r7) {
            r0 = r6
            long r0 = memAddress(r0)
            r1 = r7
            r2 = r6
            int r2 = r2.remaining()
            r3 = 2
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            memSet(r0, r1, r2)
            return
    }

    public static void memSet(java.nio.DoubleBuffer r6, int r7) {
            r0 = r6
            long r0 = memAddress(r0)
            r1 = r7
            r2 = r6
            int r2 = r2.remaining()
            r3 = 3
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            memSet(r0, r1, r2)
            return
    }

    public static <T extends org.lwjgl.system.CustomBuffer<T>> void memSet(T r8, int r9) {
            r0 = r8
            long r0 = memAddress(r0)
            r1 = r9
            r2 = r8
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r8
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            memSet(r0, r1, r2)
            return
    }

    public static <T extends org.lwjgl.system.Struct<T>> void memSet(T r6, int r7) {
            r0 = r6
            long r0 = r0.address
            r1 = r7
            r2 = r6
            int r2 = r2.sizeof()
            long r2 = (long) r2
            memSet(r0, r1, r2)
            return
    }

    public static void memCopy(java.nio.ByteBuffer r7, java.nio.ByteBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = memAddress(r0)
            r1 = r8
            long r1 = memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            long r2 = (long) r2
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static void memCopy(java.nio.ShortBuffer r7, java.nio.ShortBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = memAddress(r0)
            r1 = r8
            long r1 = memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            r3 = 1
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static void memCopy(java.nio.CharBuffer r7, java.nio.CharBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = memAddress(r0)
            r1 = r8
            long r1 = memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            r3 = 1
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static void memCopy(java.nio.IntBuffer r7, java.nio.IntBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = memAddress(r0)
            r1 = r8
            long r1 = memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            r3 = 2
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static void memCopy(java.nio.LongBuffer r7, java.nio.LongBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = memAddress(r0)
            r1 = r8
            long r1 = memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            r3 = 3
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static void memCopy(java.nio.FloatBuffer r7, java.nio.FloatBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = memAddress(r0)
            r1 = r8
            long r1 = memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            r3 = 2
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static void memCopy(java.nio.DoubleBuffer r7, java.nio.DoubleBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r7
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = memAddress(r0)
            r1 = r8
            long r1 = memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            r3 = 3
            long r2 = org.lwjgl.system.APIUtil.apiGetBytes(r2, r3)
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static <T extends org.lwjgl.system.CustomBuffer<T>> void memCopy(T r9, T r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r10
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r9
            long r0 = memAddress(r0)
            r1 = r10
            long r1 = memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r9
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static <T extends org.lwjgl.system.Struct<T>> void memCopy(T r7, T r8) {
            r0 = r7
            long r0 = r0.address
            r1 = r8
            long r1 = r1.address
            r2 = r7
            int r2 = r2.sizeof()
            long r2 = (long) r2
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    public static void memSet(long r6, int r8, long r9) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L1a
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L12
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1a
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1a:
            r0 = r9
            r1 = 256(0x100, double:1.265E-321)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L54
            r0 = r6
            int r0 = (int) r0
            r11 = r0
            boolean r0 = org.lwjgl.system.Pointer.BITS64
            if (r0 == 0) goto L40
            r0 = r11
            r1 = 7
            r0 = r0 & r1
            if (r0 != 0) goto L54
            r0 = r6
            r1 = r8
            r2 = r9
            int r2 = (int) r2
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            memSet64(r0, r1, r2)
            return
        L40:
            r0 = r11
            r1 = 3
            r0 = r0 & r1
            if (r0 != 0) goto L54
            r0 = r11
            r1 = r8
            r2 = r9
            int r2 = (int) r2
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            memSet32(r0, r1, r2)
            return
        L54:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.libc.LibCString.nmemset(r0, r1, r2)
            return
    }

    private static void memSet64(long r7, int r9, int r10) {
            r0 = r10
            r1 = -8
            r0 = r0 & r1
            r11 = r0
            r0 = r9
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            long r0 = (long) r0
            long r1 = org.lwjgl.system.MemoryUtil.FILL_PATTERN_64
            long r0 = r0 * r1
            r12 = r0
            r0 = 0
            r14 = r0
        L15:
            r0 = r14
            r1 = r11
            if (r0 >= r1) goto L30
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r14
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r12
            r0.putLong(r1, r2, r3)
            int r14 = r14 + 8
            goto L15
        L30:
            r0 = r9
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            byte r0 = (byte) r0
            r14 = r0
            r0 = r11
            r15 = r0
        L3c:
            r0 = r15
            r1 = r10
            if (r0 >= r1) goto L56
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r15
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r14
            r0.putByte(r1, r2, r3)
            int r15 = r15 + 1
            goto L3c
        L56:
            return
    }

    private static void memSet32(int r7, int r8, int r9) {
            r0 = r9
            r1 = -4
            r0 = r0 & r1
            r10 = r0
            r0 = r8
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            int r1 = org.lwjgl.system.MemoryUtil.FILL_PATTERN_32
            int r0 = r0 * r1
            r11 = r0
            r0 = 0
            r12 = r0
        L13:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L31
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r12
            int r2 = r2 + r3
            long r2 = (long) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r3
            r3 = r11
            r0.putInt(r1, r2, r3)
            int r12 = r12 + 4
            goto L13
        L31:
            r0 = r8
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            byte r0 = (byte) r0
            r12 = r0
            r0 = r10
            r13 = r0
        L3c:
            r0 = r13
            r1 = r9
            if (r0 >= r1) goto L5a
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r13
            int r2 = r2 + r3
            long r2 = (long) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r3
            r3 = r12
            r0.putByte(r1, r2, r3)
            int r13 = r13 + 1
            goto L3c
        L5a:
            return
    }

    private static long merge(long r7, long r9, long r11) {
            r0 = r7
            r1 = r7
            r2 = r9
            long r1 = r1 ^ r2
            r2 = r11
            long r1 = r1 & r2
            long r0 = r0 ^ r1
            return r0
    }

    public static void memCopy(long r7, long r9, int r11) {
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = (long) r2
            memCopy(r0, r1, r2)
            return
    }

    public static void memCopy(long r7, long r9, long r11) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L21
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L21
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L21:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.MultiReleaseMemCopy.copy(r0, r1, r2)
            return
    }

    static void memCopyAligned64(long r11, long r13, int r15) {
            r0 = r15
            r1 = -8
            r0 = r0 & r1
            r16 = r0
            r0 = 0
            r17 = r0
        La:
            r0 = r17
            r1 = r16
            if (r0 >= r1) goto L2f
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r13
            r3 = r17
            long r3 = (long) r3
            long r2 = r2 + r3
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = 0
            r5 = r11
            r6 = r17
            long r6 = (long) r6
            long r5 = r5 + r6
            long r3 = r3.getLong(r4, r5)
            r0.putLong(r1, r2, r3)
            int r17 = r17 + 8
            goto La
        L2f:
            r0 = r16
            r17 = r0
        L33:
            r0 = r17
            r1 = r15
            if (r0 >= r1) goto L58
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r13
            r3 = r17
            long r3 = (long) r3
            long r2 = r2 + r3
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = 0
            r5 = r11
            r6 = r17
            long r6 = (long) r6
            long r5 = r5 + r6
            byte r3 = r3.getByte(r4, r5)
            r0.putByte(r1, r2, r3)
            int r17 = r17 + 1
            goto L33
        L58:
            return
    }

    static void memCopyAligned32(int r11, int r12, int r13) {
            r0 = r13
            r1 = -4
            r0 = r0 & r1
            r14 = r0
            r0 = 0
            r15 = r0
        L8:
            r0 = r15
            r1 = r14
            if (r0 >= r1) goto L34
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r12
            r3 = r15
            int r2 = r2 + r3
            long r2 = (long) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r3
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = 0
            r5 = r11
            r6 = r15
            int r5 = r5 + r6
            long r5 = (long) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r6
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            int r15 = r15 + 4
            goto L8
        L34:
            r0 = r14
            r15 = r0
        L37:
            r0 = r15
            r1 = r13
            if (r0 >= r1) goto L63
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r12
            r3 = r15
            int r2 = r2 + r3
            long r2 = (long) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r3
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = 0
            r5 = r11
            r6 = r15
            int r5 = r5 + r6
            long r5 = (long) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r6
            byte r3 = r3.getByte(r4, r5)
            r0.putByte(r1, r2, r3)
            int r15 = r15 + 1
            goto L37
        L63:
            return
    }

    public static boolean memGetBoolean(long r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            byte r0 = r0.getByte(r1, r2)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static byte memGetByte(long r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short memGetShort(long r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int memGetInt(long r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long memGetLong(long r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static float memGetFloat(long r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static double memGetDouble(long r5) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            double r0 = r0.getDouble(r1, r2)
            return r0
    }

    public static long memGetCLong(long r5) {
            int r0 = org.lwjgl.system.Pointer.CLONG_SIZE
            r1 = 8
            if (r0 != r1) goto L13
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            long r0 = r0.getLong(r1, r2)
            goto L1c
        L13:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            int r0 = r0.getInt(r1, r2)
            long r0 = (long) r0
        L1c:
            return r0
    }

    public static long memGetAddress(long r5) {
            boolean r0 = org.lwjgl.system.Pointer.BITS64
            if (r0 == 0) goto L11
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            long r0 = r0.getLong(r1, r2)
            goto L1e
        L11:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r5
            int r0 = r0.getInt(r1, r2)
            long r0 = (long) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
        L1e:
            return r0
    }

    public static void memPutByte(long r6, byte r8) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r6
            r3 = r8
            r0.putByte(r1, r2, r3)
            return
    }

    public static void memPutShort(long r6, short r8) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r6
            r3 = r8
            r0.putShort(r1, r2, r3)
            return
    }

    public static void memPutInt(long r6, int r8) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r6
            r3 = r8
            r0.putInt(r1, r2, r3)
            return
    }

    public static void memPutLong(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void memPutFloat(long r6, float r8) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r6
            r3 = r8
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void memPutDouble(long r7, double r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            r0.putDouble(r1, r2, r3)
            return
    }

    public static void memPutCLong(long r7, long r9) {
            int r0 = org.lwjgl.system.Pointer.CLONG_SIZE
            r1 = 8
            if (r0 != r1) goto L14
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            r0.putLong(r1, r2, r3)
            goto L1e
        L14:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            int r3 = (int) r3
            r0.putInt(r1, r2, r3)
        L1e:
            return
    }

    public static void memPutAddress(long r7, long r9) {
            boolean r0 = org.lwjgl.system.Pointer.BITS64
            if (r0 == 0) goto L12
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            r0.putLong(r1, r2, r3)
            goto L1c
        L12:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            int r3 = (int) r3
            r0.putInt(r1, r2, r3)
        L1c:
            return
    }

    public static native <T> T memGlobalRefToObject(long r0);

    private static int write8(long r7, int r9, int r10) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            long r2 = r2 + r3
            r3 = r10
            byte r3 = (byte) r3
            r0.putByte(r1, r2, r3)
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            return r0
    }

    private static int write8Safe(long r7, int r9, int r10, int r11) {
            r0 = r9
            r1 = r10
            if (r0 != r1) goto Ld
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        Ld:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            long r2 = r2 + r3
            r3 = r11
            byte r3 = (byte) r3
            r0.putByte(r1, r2, r3)
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            return r0
    }

    private static int write16(long r7, int r9, char r10) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r9
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            long r2 = r2 + r3
            r3 = r10
            short r3 = (short) r3
            r0.putShort(r1, r2, r3)
            r0 = r9
            r1 = 2
            int r0 = r0 + r1
            return r0
    }

    public static java.nio.ByteBuffer memASCII(java.lang.CharSequence r3) {
            r0 = r3
            r1 = 1
            java.nio.ByteBuffer r0 = memASCII(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memASCIISafe(@javax.annotation.Nullable java.lang.CharSequence r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = 1
            java.nio.ByteBuffer r0 = memASCII(r0, r1)
        Ld:
            return r0
    }

    public static java.nio.ByteBuffer memASCII(java.lang.CharSequence r5, boolean r6) {
            r0 = r5
            r1 = r6
            int r0 = memLengthASCII(r0, r1)
            r7 = r0
            r0 = r7
            long r0 = (long) r0
            long r0 = nmemAlloc(r0)
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L20
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            r1.<init>()
            throw r0
        L20:
            r0 = r5
            r1 = r6
            r2 = r8
            int r0 = encodeASCIIUnsafe(r0, r1, r2)
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r8
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memASCIISafe(@javax.annotation.Nullable java.lang.CharSequence r3, boolean r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            java.nio.ByteBuffer r0 = memASCII(r0, r1)
        Ld:
            return r0
    }

    public static int memASCII(java.lang.CharSequence r5, boolean r6, java.nio.ByteBuffer r7) {
            r0 = r7
            int r0 = r0.remaining()
            r1 = r5
            r2 = r6
            int r1 = memLengthASCII(r1, r2)
            if (r0 >= r1) goto L14
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L14:
            r0 = r7
            long r0 = memAddress(r0)
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            int r0 = encodeASCIIUnsafe(r0, r1, r2)
            return r0
    }

    public static int memASCII(java.lang.CharSequence r5, boolean r6, java.nio.ByteBuffer r7, int r8) {
            r0 = r7
            int r0 = r0.capacity()
            r1 = r8
            int r0 = r0 - r1
            r1 = r5
            r2 = r6
            int r1 = memLengthASCII(r1, r2)
            if (r0 >= r1) goto L16
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L16:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            long r2 = memAddress(r2, r3)
            int r0 = encodeASCIIUnsafe(r0, r1, r2)
            return r0
    }

    static int encodeASCIIUnsafe(java.lang.CharSequence r6, boolean r7, long r8) {
            r0 = 0
            r10 = r0
            r0 = r6
            int r0 = r0.length()
            r11 = r0
        Lb:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L25
            r0 = r8
            r1 = r10
            r2 = r6
            r3 = r10
            char r2 = r2.charAt(r3)
            int r0 = write8(r0, r1, r2)
            r10 = r0
            goto Lb
        L25:
            r0 = r7
            if (r0 == 0) goto L32
            r0 = r8
            r1 = r10
            r2 = 0
            int r0 = write8(r0, r1, r2)
            r10 = r0
        L32:
            r0 = r10
            return r0
    }

    public static int memLengthASCII(java.lang.CharSequence r3, boolean r4) {
            r0 = r3
            int r0 = r0.length()
            r1 = r4
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            if (r0 >= 0) goto L1d
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L1d:
            r0 = r5
            return r0
    }

    public static java.nio.ByteBuffer memUTF8(java.lang.CharSequence r3) {
            r0 = r3
            r1 = 1
            java.nio.ByteBuffer r0 = memUTF8(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memUTF8Safe(@javax.annotation.Nullable java.lang.CharSequence r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = 1
            java.nio.ByteBuffer r0 = memUTF8(r0, r1)
        Ld:
            return r0
    }

    public static java.nio.ByteBuffer memUTF8(java.lang.CharSequence r5, boolean r6) {
            r0 = r5
            r1 = r6
            int r0 = memLengthUTF8(r0, r1)
            r7 = r0
            r0 = r7
            long r0 = (long) r0
            long r0 = nmemAlloc(r0)
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L20
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            r1.<init>()
            throw r0
        L20:
            r0 = r5
            r1 = r6
            r2 = r8
            int r0 = encodeUTF8Unsafe(r0, r1, r2)
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r8
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memUTF8Safe(@javax.annotation.Nullable java.lang.CharSequence r3, boolean r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            java.nio.ByteBuffer r0 = memUTF8(r0, r1)
        Ld:
            return r0
    }

    public static int memUTF8(java.lang.CharSequence r6, boolean r7, java.nio.ByteBuffer r8) {
            r0 = r8
            int r0 = r0.remaining()
            r1 = r6
            r2 = r7
            int r1 = memLengthASCII(r1, r2)
            if (r0 >= r1) goto L14
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L14:
            r0 = r6
            r1 = r7
            r2 = r8
            long r2 = memAddress(r2)
            r3 = r8
            int r3 = r3.remaining()
            int r0 = encodeUTF8Safe(r0, r1, r2, r3)
            return r0
    }

    public static int memUTF8(java.lang.CharSequence r7, boolean r8, java.nio.ByteBuffer r9, int r10) {
            r0 = r9
            int r0 = r0.capacity()
            r1 = r10
            int r0 = r0 - r1
            r1 = r7
            r2 = r8
            int r1 = memLengthASCII(r1, r2)
            if (r0 >= r1) goto L16
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L16:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            long r2 = memAddress(r2, r3)
            r3 = r9
            int r3 = r3.capacity()
            r4 = r10
            int r3 = r3 - r4
            int r0 = encodeUTF8Safe(r0, r1, r2, r3)
            return r0
    }

    static int encodeUTF8Unsafe(java.lang.CharSequence r7, boolean r8, long r9) {
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r7
            int r0 = r0.length()
            r13 = r0
        Le:
            r0 = r12
            r1 = r13
            if (r0 >= r1) goto Ld2
            r0 = r7
            r1 = r12
            int r12 = r12 + 1
            char r0 = r0.charAt(r1)
            r14 = r0
            r0 = r14
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L37
            r0 = r9
            r1 = r11
            r2 = r14
            int r0 = write8(r0, r1, r2)
            r11 = r0
            goto Lcf
        L37:
            r0 = r14
            r15 = r0
            r0 = r14
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L57
            r0 = r9
            r1 = r11
            r2 = 192(0xc0, float:2.69E-43)
            r3 = r15
            r4 = 6
            int r3 = r3 >> r4
            r2 = r2 | r3
            int r0 = write8(r0, r1, r2)
            r11 = r0
            goto Lbe
        L57:
            r0 = r14
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 != 0) goto L73
            r0 = r9
            r1 = r11
            r2 = 224(0xe0, float:3.14E-43)
            r3 = r15
            r4 = 12
            int r3 = r3 >> r4
            r2 = r2 | r3
            int r0 = write8(r0, r1, r2)
            r11 = r0
            goto Laa
        L73:
            r0 = r14
            r1 = r7
            r2 = r12
            int r12 = r12 + 1
            char r1 = r1.charAt(r2)
            int r0 = java.lang.Character.toCodePoint(r0, r1)
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = 240(0xf0, float:3.36E-43)
            r3 = r15
            r4 = 18
            int r3 = r3 >> r4
            r2 = r2 | r3
            int r0 = write8(r0, r1, r2)
            r11 = r0
            r0 = r9
            r1 = r11
            r2 = 128(0x80, float:1.8E-43)
            r3 = r15
            r4 = 12
            int r3 = r3 >> r4
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            int r0 = write8(r0, r1, r2)
            r11 = r0
        Laa:
            r0 = r9
            r1 = r11
            r2 = 128(0x80, float:1.8E-43)
            r3 = r15
            r4 = 6
            int r3 = r3 >> r4
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            int r0 = write8(r0, r1, r2)
            r11 = r0
        Lbe:
            r0 = r9
            r1 = r11
            r2 = 128(0x80, float:1.8E-43)
            r3 = r15
            r4 = 63
            r3 = r3 & r4
            r2 = r2 | r3
            int r0 = write8(r0, r1, r2)
            r11 = r0
        Lcf:
            goto Le
        Ld2:
            r0 = r8
            if (r0 == 0) goto Ldf
            r0 = r9
            r1 = r11
            r2 = 0
            int r0 = write8(r0, r1, r2)
            r11 = r0
        Ldf:
            r0 = r11
            return r0
    }

    static int encodeUTF8Safe(java.lang.CharSequence r8, boolean r9, long r10, int r12) {
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r8
            int r0 = r0.length()
            r15 = r0
        Le:
            r0 = r14
            r1 = r15
            if (r0 >= r1) goto L3a
            r0 = r8
            r1 = r14
            char r0 = r0.charAt(r1)
            r16 = r0
            r0 = 128(0x80, float:1.8E-43)
            r1 = r16
            if (r0 > r1) goto L2a
            goto L3a
        L2a:
            r0 = r10
            r1 = r13
            r2 = r16
            int r0 = write8(r0, r1, r2)
            r13 = r0
            int r14 = r14 + 1
            goto Le
        L3a:
            r0 = r14
            r1 = r15
            if (r0 >= r1) goto L10c
            r0 = r8
            r1 = r14
            int r14 = r14 + 1
            char r0 = r0.charAt(r1)
            r16 = r0
            r0 = r16
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L65
            r0 = r10
            r1 = r13
            r2 = r12
            r3 = r16
            int r0 = write8Safe(r0, r1, r2, r3)
            r13 = r0
            goto L109
        L65:
            r0 = r16
            r17 = r0
            r0 = r16
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L87
            r0 = r10
            r1 = r13
            r2 = r12
            r3 = 192(0xc0, float:2.69E-43)
            r4 = r17
            r5 = 6
            int r4 = r4 >> r5
            r3 = r3 | r4
            int r0 = write8Safe(r0, r1, r2, r3)
            r13 = r0
            goto Lf6
        L87:
            r0 = r16
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 != 0) goto La5
            r0 = r10
            r1 = r13
            r2 = r12
            r3 = 224(0xe0, float:3.14E-43)
            r4 = r17
            r5 = 12
            int r4 = r4 >> r5
            r3 = r3 | r4
            int r0 = write8Safe(r0, r1, r2, r3)
            r13 = r0
            goto Le0
        La5:
            r0 = r16
            r1 = r8
            r2 = r14
            int r14 = r14 + 1
            char r1 = r1.charAt(r2)
            int r0 = java.lang.Character.toCodePoint(r0, r1)
            r17 = r0
            r0 = r10
            r1 = r13
            r2 = r12
            r3 = 240(0xf0, float:3.36E-43)
            r4 = r17
            r5 = 18
            int r4 = r4 >> r5
            r3 = r3 | r4
            int r0 = write8Safe(r0, r1, r2, r3)
            r13 = r0
            r0 = r10
            r1 = r13
            r2 = r12
            r3 = 128(0x80, float:1.8E-43)
            r4 = r17
            r5 = 12
            int r4 = r4 >> r5
            r5 = 63
            r4 = r4 & r5
            r3 = r3 | r4
            int r0 = write8Safe(r0, r1, r2, r3)
            r13 = r0
        Le0:
            r0 = r10
            r1 = r13
            r2 = r12
            r3 = 128(0x80, float:1.8E-43)
            r4 = r17
            r5 = 6
            int r4 = r4 >> r5
            r5 = 63
            r4 = r4 & r5
            r3 = r3 | r4
            int r0 = write8Safe(r0, r1, r2, r3)
            r13 = r0
        Lf6:
            r0 = r10
            r1 = r13
            r2 = r12
            r3 = 128(0x80, float:1.8E-43)
            r4 = r17
            r5 = 63
            r4 = r4 & r5
            r3 = r3 | r4
            int r0 = write8Safe(r0, r1, r2, r3)
            r13 = r0
        L109:
            goto L3a
        L10c:
            r0 = r9
            if (r0 == 0) goto L11b
            r0 = r10
            r1 = r13
            r2 = r12
            r3 = 0
            int r0 = write8Safe(r0, r1, r2, r3)
            r13 = r0
        L11b:
            r0 = r13
            return r0
    }

    public static int memLengthUTF8(java.lang.CharSequence r4, boolean r5) {
            r0 = r4
            int r0 = r0.length()
            r6 = r0
            r0 = r6
            r1 = r5
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            int r0 = r0 + r1
            r7 = r0
            r0 = 0
            r8 = r0
        L16:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L67
            r0 = r4
            r1 = r8
            char r0 = r0.charAt(r1)
            r9 = r0
            r0 = r9
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L31
            goto L61
        L31:
            r0 = r9
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L47
            r0 = r7
            r1 = 127(0x7f, float:1.78E-43)
            r2 = r9
            int r1 = r1 - r2
            r2 = 31
            int r1 = r1 >>> r2
            int r0 = r0 + r1
            r7 = r0
            goto L55
        L47:
            int r7 = r7 + 2
            r0 = r9
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L55
            int r8 = r8 + 1
        L55:
            r0 = r7
            if (r0 >= 0) goto L61
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L61:
            int r8 = r8 + 1
            goto L16
        L67:
            r0 = r7
            if (r0 >= 0) goto L73
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L73:
            r0 = r7
            return r0
    }

    public static java.nio.ByteBuffer memUTF16(java.lang.CharSequence r3) {
            r0 = r3
            r1 = 1
            java.nio.ByteBuffer r0 = memUTF16(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memUTF16Safe(@javax.annotation.Nullable java.lang.CharSequence r3) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = 1
            java.nio.ByteBuffer r0 = memUTF16(r0, r1)
        Ld:
            return r0
    }

    public static java.nio.ByteBuffer memUTF16(java.lang.CharSequence r5, boolean r6) {
            r0 = r5
            r1 = r6
            int r0 = memLengthUTF16(r0, r1)
            r7 = r0
            r0 = r7
            long r0 = (long) r0
            long r0 = nmemAlloc(r0)
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L20
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            r1.<init>()
            throw r0
        L20:
            r0 = r5
            r1 = r6
            r2 = r8
            int r0 = encodeUTF16Unsafe(r0, r1, r2)
            java.lang.Class<? extends java.nio.ByteBuffer> r0 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE
            r1 = r8
            r2 = r7
            java.nio.Buffer r0 = wrap(r0, r1, r2)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memUTF16Safe(@javax.annotation.Nullable java.lang.CharSequence r3, boolean r4) {
            r0 = r3
            if (r0 != 0) goto L8
            r0 = 0
            goto Ld
        L8:
            r0 = r3
            r1 = r4
            java.nio.ByteBuffer r0 = memUTF16(r0, r1)
        Ld:
            return r0
    }

    public static int memUTF16(java.lang.CharSequence r5, boolean r6, java.nio.ByteBuffer r7) {
            r0 = r7
            int r0 = r0.remaining()
            r1 = r5
            r2 = r6
            int r1 = memLengthUTF16(r1, r2)
            if (r0 >= r1) goto L14
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L14:
            r0 = r7
            long r0 = memAddress(r0)
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            int r0 = encodeUTF16Unsafe(r0, r1, r2)
            return r0
    }

    public static int memUTF16(java.lang.CharSequence r5, boolean r6, java.nio.ByteBuffer r7, int r8) {
            r0 = r7
            int r0 = r0.capacity()
            r1 = r8
            int r0 = r0 - r1
            r1 = r5
            r2 = r6
            int r1 = memLengthUTF16(r1, r2)
            if (r0 >= r1) goto L16
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L16:
            r0 = r7
            r1 = r8
            long r0 = memAddress(r0, r1)
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            int r0 = encodeUTF16Unsafe(r0, r1, r2)
            return r0
    }

    static int encodeUTF16Unsafe(java.lang.CharSequence r6, boolean r7, long r8) {
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r6
            int r0 = r0.length()
            r12 = r0
        Le:
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L2b
            r0 = r8
            r1 = r10
            r2 = r6
            r3 = r11
            int r11 = r11 + 1
            char r2 = r2.charAt(r3)
            int r0 = write16(r0, r1, r2)
            r10 = r0
            goto Le
        L2b:
            r0 = r7
            if (r0 == 0) goto L38
            r0 = r8
            r1 = r10
            r2 = 0
            int r0 = write16(r0, r1, r2)
            r10 = r0
        L38:
            r0 = r10
            return r0
    }

    public static int memLengthUTF16(java.lang.CharSequence r3, boolean r4) {
            r0 = r3
            int r0 = r0.length()
            r1 = r4
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            if (r0 < 0) goto L1b
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r1 = r5
            if (r0 >= r1) goto L23
        L1b:
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r1 = r0
            r1.<init>()
            throw r0
        L23:
            r0 = r5
            r1 = 1
            int r0 = r0 << r1
            return r0
    }

    private static int memLengthNT1(long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            boolean r0 = org.lwjgl.system.Pointer.BITS64
            if (r0 == 0) goto L19
            r0 = r4
            r1 = r6
            int r0 = strlen64NT1(r0, r1)
            goto L1e
        L19:
            r0 = r4
            r1 = r6
            int r0 = strlen32NT1(r0, r1)
        L1e:
            return r0
    }

    private static int strlen64NT1(long r7, int r9) {
            r0 = 0
            r10 = r0
            r0 = 8
            r1 = r9
            if (r0 > r1) goto L59
            r0 = r7
            int r0 = (int) r0
            r1 = 7
            r0 = r0 & r1
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L37
            r0 = 8
            r1 = r11
            int r0 = r0 - r1
            r12 = r0
        L1b:
            r0 = r10
            r1 = r12
            if (r0 >= r1) goto L37
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            if (r0 != 0) goto L31
            r0 = r10
            return r0
        L31:
            int r10 = r10 + 1
            goto L1b
        L37:
            r0 = r10
            r1 = r9
            r2 = 8
            int r1 = r1 - r2
            if (r0 > r1) goto L59
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            boolean r0 = org.lwjgl.system.MathUtil.mathHasZeroByte(r0)
            if (r0 == 0) goto L53
            goto L59
        L53:
            int r10 = r10 + 8
            goto L37
        L59:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L75
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            if (r0 != 0) goto L6f
            goto L75
        L6f:
            int r10 = r10 + 1
            goto L59
        L75:
            r0 = r10
            return r0
    }

    private static int strlen32NT1(long r7, int r9) {
            r0 = 0
            r10 = r0
            r0 = 4
            r1 = r9
            if (r0 > r1) goto L55
            r0 = r7
            int r0 = (int) r0
            r1 = 3
            r0 = r0 & r1
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L34
            r0 = 4
            r1 = r11
            int r0 = r0 - r1
            r12 = r0
        L18:
            r0 = r10
            r1 = r12
            if (r0 >= r1) goto L34
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            if (r0 != 0) goto L2e
            r0 = r10
            return r0
        L2e:
            int r10 = r10 + 1
            goto L18
        L34:
            r0 = r10
            r1 = r9
            r2 = 4
            int r1 = r1 - r2
            if (r0 > r1) goto L55
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            boolean r0 = org.lwjgl.system.MathUtil.mathHasZeroByte(r0)
            if (r0 == 0) goto L4f
            goto L55
        L4f:
            int r10 = r10 + 4
            goto L34
        L55:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L71
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            if (r0 != 0) goto L6b
            goto L71
        L6b:
            int r10 = r10 + 1
            goto L55
        L71:
            r0 = r10
            return r0
    }

    public static int memLengthNT1(java.nio.ByteBuffer r4) {
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r4
            int r1 = r1.remaining()
            int r0 = memLengthNT1(r0, r1)
            return r0
    }

    private static int memLengthNT2(long r4, int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            boolean r0 = org.lwjgl.system.Pointer.BITS64
            if (r0 == 0) goto L19
            r0 = r4
            r1 = r6
            int r0 = strlen64NT2(r0, r1)
            goto L20
        L19:
            r0 = r4
            int r0 = (int) r0
            long r0 = (long) r0
            r1 = r6
            int r0 = strlen32NT2(r0, r1)
        L20:
            return r0
    }

    private static int strlen64NT2(long r7, int r9) {
            r0 = 0
            r10 = r0
            r0 = 8
            r1 = r9
            if (r0 > r1) goto L59
            r0 = r7
            int r0 = (int) r0
            r1 = 7
            r0 = r0 & r1
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L37
            r0 = 8
            r1 = r11
            int r0 = r0 - r1
            r12 = r0
        L1b:
            r0 = r10
            r1 = r12
            if (r0 >= r1) goto L37
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            if (r0 != 0) goto L31
            r0 = r10
            return r0
        L31:
            int r10 = r10 + 2
            goto L1b
        L37:
            r0 = r10
            r1 = r9
            r2 = 8
            int r1 = r1 - r2
            if (r0 > r1) goto L59
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            boolean r0 = org.lwjgl.system.MathUtil.mathHasZeroShort(r0)
            if (r0 == 0) goto L53
            goto L59
        L53:
            int r10 = r10 + 8
            goto L37
        L59:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L75
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            if (r0 != 0) goto L6f
            goto L75
        L6f:
            int r10 = r10 + 2
            goto L59
        L75:
            r0 = r10
            return r0
    }

    private static int strlen32NT2(long r7, int r9) {
            r0 = 0
            r10 = r0
            r0 = 4
            r1 = r9
            if (r0 > r1) goto L55
            r0 = r7
            int r0 = (int) r0
            r1 = 3
            r0 = r0 & r1
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L34
            r0 = 4
            r1 = r11
            int r0 = r0 - r1
            r12 = r0
        L18:
            r0 = r10
            r1 = r12
            if (r0 >= r1) goto L34
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            if (r0 != 0) goto L2e
            r0 = r10
            return r0
        L2e:
            int r10 = r10 + 2
            goto L18
        L34:
            r0 = r10
            r1 = r9
            r2 = 4
            int r1 = r1 - r2
            if (r0 > r1) goto L55
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            boolean r0 = org.lwjgl.system.MathUtil.mathHasZeroShort(r0)
            if (r0 == 0) goto L4f
            goto L55
        L4f:
            int r10 = r10 + 4
            goto L34
        L55:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L71
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r10
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            if (r0 != 0) goto L6b
            goto L71
        L6b:
            int r10 = r10 + 2
            goto L55
        L71:
            r0 = r10
            return r0
    }

    public static int memLengthNT2(java.nio.ByteBuffer r4) {
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r4
            int r1 = r1.remaining()
            int r0 = memLengthNT2(r0, r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBufferNT1(long r6) {
            r0 = r6
            r1 = r6
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = memLengthNT1(r1, r2)
            java.nio.ByteBuffer r0 = memByteBuffer(r0, r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBufferNT1(long r6, int r8) {
            r0 = r6
            r1 = r6
            r2 = r8
            int r1 = memLengthNT1(r1, r2)
            java.nio.ByteBuffer r0 = memByteBuffer(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memByteBufferNT1Safe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L14
        La:
            r0 = r6
            r1 = r6
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = memLengthNT1(r1, r2)
            java.nio.ByteBuffer r0 = memByteBuffer(r0, r1)
        L14:
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memByteBufferNT1Safe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            r0 = r6
            r1 = r6
            r2 = r8
            int r1 = memLengthNT1(r1, r2)
            java.nio.ByteBuffer r0 = memByteBuffer(r0, r1)
        L13:
            return r0
    }

    public static java.nio.ByteBuffer memByteBufferNT2(long r4) {
            r0 = r4
            r1 = 2147483646(0x7ffffffe, float:NaN)
            java.nio.ByteBuffer r0 = memByteBufferNT2(r0, r1)
            return r0
    }

    public static java.nio.ByteBuffer memByteBufferNT2(long r6, int r8) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L16
            r0 = r8
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The maximum length must be an even number."
            r1.<init>(r2)
            throw r0
        L16:
            r0 = r6
            r1 = r6
            r2 = r8
            int r1 = memLengthNT2(r1, r2)
            java.nio.ByteBuffer r0 = memByteBuffer(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memByteBufferNT2Safe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L10
        La:
            r0 = r5
            r1 = 2147483646(0x7ffffffe, float:NaN)
            java.nio.ByteBuffer r0 = memByteBufferNT2(r0, r1)
        L10:
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer memByteBufferNT2Safe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Lf
        La:
            r0 = r5
            r1 = r7
            java.nio.ByteBuffer r0 = memByteBufferNT2(r0, r1)
        Lf:
            return r0
    }

    public static java.lang.String memASCII(long r6) {
            r0 = r6
            r1 = r6
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = memLengthNT1(r1, r2)
            java.lang.String r0 = memASCII(r0, r1)
            return r0
    }

    public static java.lang.String memASCII(long r7, int r9) {
            r0 = r9
            if (r0 > 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            r0 = r9
            int r1 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_SIZE
            if (r0 > r1) goto L1a
            java.lang.ThreadLocal<byte[]> r0 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_BYTE
            java.lang.Object r0 = r0.get()
            byte[] r0 = (byte[]) r0
            goto L1d
        L1a:
            r0 = r9
            byte[] r0 = new byte[r0]
        L1d:
            r10 = r0
            r0 = r7
            r1 = r9
            java.nio.ByteBuffer r0 = memByteBuffer(r0, r1)
            r1 = r10
            r2 = 0
            r3 = r9
            java.nio.ByteBuffer r0 = r0.get(r1, r2, r3)
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r10
            r3 = 0
            r4 = 0
            r5 = r9
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static java.lang.String memASCII(java.nio.ByteBuffer r4) {
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r4
            int r1 = r1.remaining()
            java.lang.String r0 = memASCII(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memASCIISafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L14
        La:
            r0 = r6
            r1 = r6
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = memLengthNT1(r1, r2)
            java.lang.String r0 = memASCII(r0, r1)
        L14:
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memASCIISafe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Lf
        La:
            r0 = r5
            r1 = r7
            java.lang.String r0 = memASCII(r0, r1)
        Lf:
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memASCIISafe(@javax.annotation.Nullable java.nio.ByteBuffer r4) {
            r0 = r4
            if (r0 != 0) goto L8
            r0 = 0
            goto L13
        L8:
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r4
            int r1 = r1.remaining()
            java.lang.String r0 = memASCII(r0, r1)
        L13:
            return r0
    }

    public static java.lang.String memASCII(java.nio.ByteBuffer r4, int r5) {
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r5
            java.lang.String r0 = memASCII(r0, r1)
            return r0
    }

    public static java.lang.String memASCII(java.nio.ByteBuffer r4, int r5, int r6) {
            r0 = r4
            r1 = r6
            long r0 = memAddress(r0, r1)
            r1 = r5
            java.lang.String r0 = memASCII(r0, r1)
            return r0
    }

    public static java.lang.String memUTF8(long r6) {
            r0 = r6
            r1 = r6
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = memLengthNT1(r1, r2)
            java.lang.String r0 = org.lwjgl.system.MultiReleaseTextDecoding.decodeUTF8(r0, r1)
            return r0
    }

    public static java.lang.String memUTF8(long r4, int r6) {
            r0 = r4
            r1 = r6
            java.lang.String r0 = org.lwjgl.system.MultiReleaseTextDecoding.decodeUTF8(r0, r1)
            return r0
    }

    public static java.lang.String memUTF8(java.nio.ByteBuffer r4) {
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r4
            int r1 = r1.remaining()
            java.lang.String r0 = org.lwjgl.system.MultiReleaseTextDecoding.decodeUTF8(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memUTF8Safe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L14
        La:
            r0 = r6
            r1 = r6
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = memLengthNT1(r1, r2)
            java.lang.String r0 = org.lwjgl.system.MultiReleaseTextDecoding.decodeUTF8(r0, r1)
        L14:
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memUTF8Safe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Lf
        La:
            r0 = r5
            r1 = r7
            java.lang.String r0 = org.lwjgl.system.MultiReleaseTextDecoding.decodeUTF8(r0, r1)
        Lf:
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memUTF8Safe(@javax.annotation.Nullable java.nio.ByteBuffer r4) {
            r0 = r4
            if (r0 != 0) goto L8
            r0 = 0
            goto L13
        L8:
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r4
            int r1 = r1.remaining()
            java.lang.String r0 = org.lwjgl.system.MultiReleaseTextDecoding.decodeUTF8(r0, r1)
        L13:
            return r0
    }

    public static java.lang.String memUTF8(java.nio.ByteBuffer r4, int r5) {
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r5
            java.lang.String r0 = org.lwjgl.system.MultiReleaseTextDecoding.decodeUTF8(r0, r1)
            return r0
    }

    public static java.lang.String memUTF8(java.nio.ByteBuffer r4, int r5, int r6) {
            r0 = r4
            r1 = r6
            long r0 = memAddress(r0, r1)
            r1 = r5
            java.lang.String r0 = org.lwjgl.system.MultiReleaseTextDecoding.decodeUTF8(r0, r1)
            return r0
    }

    public static java.lang.String memUTF16(long r6) {
            r0 = r6
            r1 = r6
            r2 = 2147483646(0x7ffffffe, float:NaN)
            int r1 = memLengthNT2(r1, r2)
            r2 = 1
            int r1 = r1 >> r2
            java.lang.String r0 = memUTF16(r0, r1)
            return r0
    }

    public static java.lang.String memUTF16(long r7, int r9) {
            r0 = r9
            if (r0 > 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L45
            r0 = r9
            r1 = 1
            int r0 = r0 << r1
            r10 = r0
            r0 = r10
            int r1 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_SIZE
            if (r0 > r1) goto L24
            java.lang.ThreadLocal<byte[]> r0 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_BYTE
            java.lang.Object r0 = r0.get()
            byte[] r0 = (byte[]) r0
            goto L27
        L24:
            r0 = r10
            byte[] r0 = new byte[r0]
        L27:
            r11 = r0
            r0 = r7
            r1 = r10
            java.nio.ByteBuffer r0 = memByteBuffer(r0, r1)
            r1 = r11
            r2 = 0
            r3 = r10
            java.nio.ByteBuffer r0 = r0.get(r1, r2, r3)
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r11
            r3 = 0
            r4 = r10
            java.nio.charset.Charset r5 = org.lwjgl.system.MemoryUtil.UTF16
            r1.<init>(r2, r3, r4, r5)
            return r0
        L45:
            r0 = r9
            int r1 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_SIZE
            if (r0 > r1) goto L58
            java.lang.ThreadLocal<char[]> r0 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_CHAR
            java.lang.Object r0 = r0.get()
            char[] r0 = (char[]) r0
            goto L5b
        L58:
            r0 = r9
            char[] r0 = new char[r0]
        L5b:
            r10 = r0
            r0 = r7
            r1 = r9
            java.nio.CharBuffer r0 = memCharBuffer(r0, r1)
            r1 = r10
            r2 = 0
            r3 = r9
            java.nio.CharBuffer r0 = r0.get(r1, r2, r3)
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r10
            r3 = 0
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
    }

    public static java.lang.String memUTF16(java.nio.ByteBuffer r5) {
            r0 = r5
            long r0 = memAddress(r0)
            r1 = r5
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            java.lang.String r0 = memUTF16(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memUTF16Safe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L16
        La:
            r0 = r6
            r1 = r6
            r2 = 2147483646(0x7ffffffe, float:NaN)
            int r1 = memLengthNT2(r1, r2)
            r2 = 1
            int r1 = r1 >> r2
            java.lang.String r0 = memUTF16(r0, r1)
        L16:
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memUTF16Safe(long r5, int r7) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Lf
        La:
            r0 = r5
            r1 = r7
            java.lang.String r0 = memUTF16(r0, r1)
        Lf:
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String memUTF16Safe(@javax.annotation.Nullable java.nio.ByteBuffer r5) {
            r0 = r5
            if (r0 != 0) goto L8
            r0 = 0
            goto L15
        L8:
            r0 = r5
            long r0 = memAddress(r0)
            r1 = r5
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            java.lang.String r0 = memUTF16(r0, r1)
        L15:
            return r0
    }

    public static java.lang.String memUTF16(java.nio.ByteBuffer r4, int r5) {
            r0 = r4
            long r0 = memAddress(r0)
            r1 = r5
            java.lang.String r0 = memUTF16(r0, r1)
            return r0
    }

    public static java.lang.String memUTF16(java.nio.ByteBuffer r4, int r5, int r6) {
            r0 = r4
            r1 = r6
            long r0 = memAddress(r0, r1)
            r1 = r5
            java.lang.String r0 = memUTF16(r0, r1)
            return r0
    }

    private static sun.misc.Unsafe getUnsafeInstance() {
            java.lang.Class<sun.misc.Unsafe> r0 = sun.misc.Unsafe.class
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r4 = r0
            r0 = r4
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        Ld:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L5c
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            java.lang.Class r0 = r0.getType()
            java.lang.Class<sun.misc.Unsafe> r1 = sun.misc.Unsafe.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L56
        L27:
            r0 = r8
            int r0 = r0.getModifiers()
            r9 = r0
            r0 = r9
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L56
            r0 = r9
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L41
            goto L56
        L41:
            r0 = r8
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L51
            r0 = r8
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L51
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.lang.Exception -> L51
            return r0
        L51:
            r10 = move-exception
            goto L5c
        L56:
            int r7 = r7 + 1
            goto Ld
        L5c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "LWJGL requires sun.misc.Unsafe to be available."
            r1.<init>(r2)
            throw r0
    }

    private static long getFieldOffset(java.lang.Class<?> r4, java.lang.Class<?> r5, java.util.function.LongPredicate r6) {
            r0 = r4
            r7 = r0
        L2:
            r0 = r7
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L71
            r0 = r7
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L1b:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L69
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            java.lang.Class r0 = r0.getType()
            r1 = r5
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L63
            r0 = r12
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L63
            r0 = r12
            boolean r0 = r0.isSynthetic()
            if (r0 == 0) goto L4b
            goto L63
        L4b:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r12
            long r0 = r0.objectFieldOffset(r1)
            r13 = r0
            r0 = r6
            r1 = r13
            boolean r0 = r0.test(r1)
            if (r0 == 0) goto L63
            r0 = r13
            return r0
        L63:
            int r11 = r11 + 1
            goto L1b
        L69:
            r0 = r7
            java.lang.Class r0 = r0.getSuperclass()
            r7 = r0
            goto L2
        L71:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Failed to find field offset in class."
            r1.<init>(r2)
            throw r0
    }

    private static long getFieldOffsetInt(java.lang.Object r5, int r6) {
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = r5
            r3 = r6
            long r2 = (v2) -> { // java.util.function.LongPredicate.test(long):boolean
                return lambda$getFieldOffsetInt$2(r2, r3, v2);
            }
            long r0 = getFieldOffset(r0, r1, r2)
            return r0
    }

    private static long getFieldOffsetObject(java.lang.Object r5, java.lang.Object r6) {
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r1 = r6
            java.lang.Class r1 = r1.getClass()
            r2 = r5
            r3 = r6
            long r2 = (v2) -> { // java.util.function.LongPredicate.test(long):boolean
                return lambda$getFieldOffsetObject$3(r2, r3, v2);
            }
            long r0 = getFieldOffset(r0, r1, r2)
            return r0
    }

    private static long getAddressOffset() {
            r0 = -2401053090268712947(0xdeadbeef8badf00d, double:-1.1885957280273295E148)
            boolean r1 = org.lwjgl.system.Pointer.BITS32
            if (r1 == 0) goto Lf
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L12
        Lf:
            r1 = -1
        L12:
            long r0 = r0 & r1
            r6 = r0
            r0 = r6
            r1 = 0
            java.nio.ByteBuffer r0 = org.lwjgl.system.jni.JNINativeInterface.NewDirectByteBuffer(r0, r1)
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r8 = r0
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r1 = java.lang.Long.TYPE
            r2 = r8
            r3 = r6
            long r2 = (v2) -> { // java.util.function.LongPredicate.test(long):boolean
                return lambda$getAddressOffset$4(r2, r3, v2);
            }
            long r0 = getFieldOffset(r0, r1, r2)
            return r0
    }

    private static long getMarkOffset() {
            r0 = 1
            r1 = 0
            java.nio.ByteBuffer r0 = org.lwjgl.system.jni.JNINativeInterface.NewDirectByteBuffer(r0, r1)
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r5 = r0
            r0 = r5
            r1 = -1
            long r0 = getFieldOffsetInt(r0, r1)
            return r0
    }

    private static long getPositionOffset() {
            r0 = -1
            r1 = 219540062(0xd15ea5e, double:1.084672025E-315)
            java.nio.ByteBuffer r0 = org.lwjgl.system.jni.JNINativeInterface.NewDirectByteBuffer(r0, r1)
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r5 = r0
            r0 = r5
            r1 = 16435934(0xfacade, float:2.3031649E-38)
            java.nio.Buffer r0 = r0.position(r1)
            r0 = r5
            r1 = 16435934(0xfacade, float:2.3031649E-38)
            long r0 = getFieldOffsetInt(r0, r1)
            return r0
    }

    private static long getLimitOffset() {
            r0 = -1
            r1 = 219540062(0xd15ea5e, double:1.084672025E-315)
            java.nio.ByteBuffer r0 = org.lwjgl.system.jni.JNINativeInterface.NewDirectByteBuffer(r0, r1)
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r5 = r0
            r0 = r5
            r1 = 16435934(0xfacade, float:2.3031649E-38)
            java.nio.Buffer r0 = r0.limit(r1)
            r0 = r5
            r1 = 16435934(0xfacade, float:2.3031649E-38)
            long r0 = getFieldOffsetInt(r0, r1)
            return r0
    }

    private static long getCapacityOffset() {
            r0 = -1
            r1 = 219540062(0xd15ea5e, double:1.084672025E-315)
            java.nio.ByteBuffer r0 = org.lwjgl.system.jni.JNINativeInterface.NewDirectByteBuffer(r0, r1)
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r5 = r0
            r0 = r5
            r1 = 0
            java.nio.Buffer r0 = r0.limit(r1)
            r0 = r5
            r1 = 219540062(0xd15ea5e, float:4.619628E-31)
            long r0 = getFieldOffsetInt(r0, r1)
            return r0
    }

    static <T extends java.nio.Buffer> T wrap(java.lang.Class<? extends T> r7, long r8, int r10) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE     // Catch: java.lang.InstantiationException -> Lf
            r1 = r7
            java.lang.Object r0 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> Lf
            java.nio.Buffer r0 = (java.nio.Buffer) r0     // Catch: java.lang.InstantiationException -> Lf
            r11 = r0
            goto L1b
        Lf:
            r12 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        L1b:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            r3 = r8
            r0.putLong(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.MARK
            r3 = -1
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.LIMIT
            r3 = r10
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.CAPACITY
            r3 = r10
            r0.putInt(r1, r2, r3)
            r0 = r11
            return r0
    }

    static java.nio.ByteBuffer slice(java.nio.ByteBuffer r7, long r8, int r10) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE     // Catch: java.lang.InstantiationException -> L11
            java.lang.Class<? extends java.nio.ByteBuffer> r1 = org.lwjgl.system.MemoryUtil.BUFFER_BYTE     // Catch: java.lang.InstantiationException -> L11
            java.lang.Object r0 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> L11
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.InstantiationException -> L11
            r11 = r0
            goto L1d
        L11:
            r12 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        L1d:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            r3 = r8
            r0.putLong(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.MARK
            r3 = -1
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.LIMIT
            r3 = r10
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.CAPACITY
            r3 = r10
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r7
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_BYTE
            java.lang.Object r0 = r0.getObject(r1, r2)
            r12 = r0
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r11
            long r2 = org.lwjgl.system.MemoryUtil.PARENT_BYTE
            r3 = r12
            if (r3 != 0) goto L6a
            r3 = r7
            goto L6c
        L6a:
            r3 = r12
        L6c:
            r0.putObject(r1, r2, r3)
            r0 = r11
            r1 = r7
            java.nio.ByteOrder r1 = r1.order()
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    static <T extends java.nio.Buffer> T slice(java.lang.Class<? extends T> r9, T r10, long r11, int r13, long r14) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE     // Catch: java.lang.InstantiationException -> Lf
            r1 = r9
            java.lang.Object r0 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> Lf
            java.nio.Buffer r0 = (java.nio.Buffer) r0     // Catch: java.lang.InstantiationException -> Lf
            r16 = r0
            goto L1b
        Lf:
            r17 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r17
            r1.<init>(r2)
            throw r0
        L1b:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r16
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            r3 = r11
            r0.putLong(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r16
            long r2 = org.lwjgl.system.MemoryUtil.MARK
            r3 = -1
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r16
            long r2 = org.lwjgl.system.MemoryUtil.LIMIT
            r3 = r13
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r16
            long r2 = org.lwjgl.system.MemoryUtil.CAPACITY
            r3 = r13
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r16
            r2 = r14
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r10
            r5 = r14
            java.lang.Object r3 = r3.getObject(r4, r5)
            r0.putObject(r1, r2, r3)
            r0 = r16
            return r0
    }

    static <T extends java.nio.Buffer> T duplicate(java.lang.Class<? extends T> r9, T r10, long r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE     // Catch: java.lang.InstantiationException -> Lf
            r1 = r9
            java.lang.Object r0 = r0.allocateInstance(r1)     // Catch: java.lang.InstantiationException -> Lf
            java.nio.Buffer r0 = (java.nio.Buffer) r0     // Catch: java.lang.InstantiationException -> Lf
            r13 = r0
            goto L1b
        Lf:
            r14 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
        L1b:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r13
            long r2 = org.lwjgl.system.MemoryUtil.ADDRESS
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r10
            long r5 = org.lwjgl.system.MemoryUtil.ADDRESS
            long r3 = r3.getLong(r4, r5)
            r0.putLong(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r13
            long r2 = org.lwjgl.system.MemoryUtil.MARK
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r10
            long r5 = org.lwjgl.system.MemoryUtil.MARK
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r13
            long r2 = org.lwjgl.system.MemoryUtil.POSITION
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r10
            long r5 = org.lwjgl.system.MemoryUtil.POSITION
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r13
            long r2 = org.lwjgl.system.MemoryUtil.LIMIT
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r10
            long r5 = org.lwjgl.system.MemoryUtil.LIMIT
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r13
            long r2 = org.lwjgl.system.MemoryUtil.CAPACITY
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r10
            long r5 = org.lwjgl.system.MemoryUtil.CAPACITY
            int r3 = r3.getInt(r4, r5)
            r0.putInt(r1, r2, r3)
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r13
            r2 = r11
            sun.misc.Unsafe r3 = org.lwjgl.system.MemoryUtil.UNSAFE
            r4 = r10
            r5 = r11
            java.lang.Object r3 = r3.getObject(r4, r5)
            r0.putObject(r1, r2, r3)
            r0 = r13
            return r0
    }

    private static /* synthetic */ boolean lambda$getAddressOffset$4(java.nio.ByteBuffer r5, long r6, long r8) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            r2 = r8
            long r0 = r0.getLong(r1, r2)
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    private static /* synthetic */ boolean lambda$getFieldOffsetObject$3(java.lang.Object r5, java.lang.Object r6, long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            r2 = r7
            java.lang.Object r0 = r0.getObject(r1, r2)
            r1 = r6
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private static /* synthetic */ boolean lambda$getFieldOffsetInt$2(java.lang.Object r5, int r6, long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = r5
            r2 = r7
            int r0 = r0.getInt(r1, r2)
            r1 = r6
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private static /* synthetic */ char[] lambda$static$1() {
            int r0 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_SIZE
            char[] r0 = new char[r0]
            return r0
    }

    private static /* synthetic */ byte[] lambda$static$0() {
            int r0 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_SIZE
            byte[] r0 = new byte[r0]
            return r0
    }

    static {
            org.lwjgl.system.Configuration<java.lang.Integer> r0 = org.lwjgl.system.Configuration.ARRAY_TLC_SIZE
            r1 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            org.lwjgl.system.MemoryUtil.ARRAY_TLC_SIZE = r0
            void r0 = () -> { // java.util.function.Supplier.get():java.lang.Object
                return lambda$static$0();
            }
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.lwjgl.system.MemoryUtil.ARRAY_TLC_BYTE = r0
            void r0 = () -> { // java.util.function.Supplier.get():java.lang.Object
                return lambda$static$1();
            }
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.lwjgl.system.MemoryUtil.ARRAY_TLC_CHAR = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            org.lwjgl.system.MemoryUtil.NATIVE_ORDER = r0
            java.nio.ByteOrder r0 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r1) goto L40
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            goto L43
        L40:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
        L43:
            org.lwjgl.system.MemoryUtil.UTF16 = r0
            org.lwjgl.system.Library.initialize()
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = org.lwjgl.system.MemoryUtil.NATIVE_ORDER
            java.nio.ByteBuffer r0 = r0.order(r1)
            r5 = r0
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            org.lwjgl.system.MemoryUtil.BUFFER_BYTE = r0
            r0 = r5
            java.nio.ShortBuffer r0 = r0.asShortBuffer()
            java.lang.Class r0 = r0.getClass()
            org.lwjgl.system.MemoryUtil.BUFFER_SHORT = r0
            r0 = r5
            java.nio.CharBuffer r0 = r0.asCharBuffer()
            java.lang.Class r0 = r0.getClass()
            org.lwjgl.system.MemoryUtil.BUFFER_CHAR = r0
            r0 = r5
            java.nio.IntBuffer r0 = r0.asIntBuffer()
            java.lang.Class r0 = r0.getClass()
            org.lwjgl.system.MemoryUtil.BUFFER_INT = r0
            r0 = r5
            java.nio.LongBuffer r0 = r0.asLongBuffer()
            java.lang.Class r0 = r0.getClass()
            org.lwjgl.system.MemoryUtil.BUFFER_LONG = r0
            r0 = r5
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()
            java.lang.Class r0 = r0.getClass()
            org.lwjgl.system.MemoryUtil.BUFFER_FLOAT = r0
            r0 = r5
            java.nio.DoubleBuffer r0 = r0.asDoubleBuffer()
            java.lang.Class r0 = r0.getClass()
            org.lwjgl.system.MemoryUtil.BUFFER_DOUBLE = r0
            sun.misc.Unsafe r0 = getUnsafeInstance()
            org.lwjgl.system.MemoryUtil.UNSAFE = r0
            long r0 = getMarkOffset()     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.MARK = r0     // Catch: java.lang.Throwable -> L112
            long r0 = getPositionOffset()     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.POSITION = r0     // Catch: java.lang.Throwable -> L112
            long r0 = getLimitOffset()     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.LIMIT = r0     // Catch: java.lang.Throwable -> L112
            long r0 = getCapacityOffset()     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.CAPACITY = r0     // Catch: java.lang.Throwable -> L112
            long r0 = getAddressOffset()     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.ADDRESS = r0     // Catch: java.lang.Throwable -> L112
            r0 = r5
            java.nio.ByteBuffer r0 = r0.duplicate()     // Catch: java.lang.Throwable -> L112
            r1 = r5
            java.nio.ByteOrder r1 = r1.order()     // Catch: java.lang.Throwable -> L112
            java.nio.ByteBuffer r0 = r0.order(r1)     // Catch: java.lang.Throwable -> L112
            r1 = r5
            long r0 = getFieldOffsetObject(r0, r1)     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.PARENT_BYTE = r0     // Catch: java.lang.Throwable -> L112
            r0 = r5
            java.nio.ShortBuffer r0 = r0.asShortBuffer()     // Catch: java.lang.Throwable -> L112
            r1 = r5
            long r0 = getFieldOffsetObject(r0, r1)     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.PARENT_SHORT = r0     // Catch: java.lang.Throwable -> L112
            r0 = r5
            java.nio.CharBuffer r0 = r0.asCharBuffer()     // Catch: java.lang.Throwable -> L112
            r1 = r5
            long r0 = getFieldOffsetObject(r0, r1)     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.PARENT_CHAR = r0     // Catch: java.lang.Throwable -> L112
            r0 = r5
            java.nio.IntBuffer r0 = r0.asIntBuffer()     // Catch: java.lang.Throwable -> L112
            r1 = r5
            long r0 = getFieldOffsetObject(r0, r1)     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.PARENT_INT = r0     // Catch: java.lang.Throwable -> L112
            r0 = r5
            java.nio.LongBuffer r0 = r0.asLongBuffer()     // Catch: java.lang.Throwable -> L112
            r1 = r5
            long r0 = getFieldOffsetObject(r0, r1)     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.PARENT_LONG = r0     // Catch: java.lang.Throwable -> L112
            r0 = r5
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()     // Catch: java.lang.Throwable -> L112
            r1 = r5
            long r0 = getFieldOffsetObject(r0, r1)     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.PARENT_FLOAT = r0     // Catch: java.lang.Throwable -> L112
            r0 = r5
            java.nio.DoubleBuffer r0 = r0.asDoubleBuffer()     // Catch: java.lang.Throwable -> L112
            r1 = r5
            long r0 = getFieldOffsetObject(r0, r1)     // Catch: java.lang.Throwable -> L112
            org.lwjgl.system.MemoryUtil.PARENT_DOUBLE = r0     // Catch: java.lang.Throwable -> L112
            goto L11c
        L112:
            r6 = move-exception
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L11c:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            int r0 = r0.pageSize()
            org.lwjgl.system.MemoryUtil.PAGE_SIZE = r0
            r0 = 64
            org.lwjgl.system.MemoryUtil.CACHE_LINE_SIZE = r0
            r0 = -1
            r1 = 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            org.lwjgl.system.MemoryUtil.FILL_PATTERN_32 = r0
            r0 = -1
            r1 = 255(0xff, double:1.26E-321)
            long r0 = java.lang.Long.divideUnsigned(r0, r1)
            org.lwjgl.system.MemoryUtil.FILL_PATTERN_64 = r0
            return
    }
}
