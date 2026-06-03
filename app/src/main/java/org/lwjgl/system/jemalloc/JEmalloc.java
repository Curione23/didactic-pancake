package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmalloc.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmalloc.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmalloc.class */
public class JEmalloc {
    public static final int JEMALLOC_VERSION_MAJOR = 5;
    public static final int JEMALLOC_VERSION_MINOR = 2;
    public static final int JEMALLOC_VERSION_BUGFIX = 0;
    public static final int JEMALLOC_VERSION_NREV = 0;
    public static final java.lang.String JEMALLOC_VERSION_GID = "b0b3e49a54ec29e32636f4577d9d5a896d67fd20";
    public static final java.lang.String JEMALLOC_VERSION = "5.2.0-0-gb0b3e49a54ec29e32636f4577d9d5a896d67fd20";
    public static final int MALLOCX_ZERO = 64;
    public static final int MALLOCX_TCACHE_NONE = 0;
    public static final int MALLCTL_ARENAS_ALL = 4096;
    public static final int MALLCTL_ARENAS_DESTROYED = 4097;
    private static final org.lwjgl.system.SharedLibrary JEMALLOC = null;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmalloc$Functions.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmalloc$Functions.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/JEmalloc$Functions.class */
    public static final class Functions {
        public static final long malloc_message = 0;
        public static final long malloc = 0;
        public static final long calloc = 0;
        public static final long posix_memalign = 0;
        public static final long aligned_alloc = 0;
        public static final long realloc = 0;
        public static final long free = 0;
        public static final long mallocx = 0;
        public static final long rallocx = 0;
        public static final long xallocx = 0;
        public static final long sallocx = 0;
        public static final long dallocx = 0;
        public static final long sdallocx = 0;
        public static final long nallocx = 0;
        public static final long mallctl = 0;
        public static final long mallctlnametomib = 0;
        public static final long mallctlbymib = 0;
        public static final long malloc_stats_print = 0;
        public static final long malloc_usable_size = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_malloc_message"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc_message = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_malloc"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_calloc"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.calloc = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_posix_memalign"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.posix_memalign = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_aligned_alloc"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.aligned_alloc = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_realloc"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.realloc = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_free"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.free = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_mallocx"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.mallocx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_rallocx"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.rallocx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_xallocx"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.xallocx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_sallocx"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.sallocx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_dallocx"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.dallocx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_sdallocx"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.sdallocx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_nallocx"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.nallocx = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_mallctl"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.mallctl = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_mallctlnametomib"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.mallctlnametomib = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_mallctlbymib"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.mallctlbymib = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_malloc_stats_print"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc_stats_print = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.access$000()
                java.lang.String r1 = "je_malloc_usable_size"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc_usable_size = r0
                return
        }
    }

    protected JEmalloc() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.JEMALLOC
            return r0
    }

    @org.lwjgl.system.NativeType("void (*) (void *, char const *) *")
    public static org.lwjgl.PointerBuffer je_malloc_message() {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc_message
            r4 = r0
            r0 = r4
            r1 = 1
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            return r0
    }

    public static long nje_malloc(long r5) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer je_malloc(@org.lwjgl.system.NativeType("size_t") long r5) {
            r0 = r5
            long r0 = nje_malloc(r0)
            r7 = r0
            r0 = r7
            r1 = r5
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long nje_calloc(long r7, long r9) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.calloc
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer je_calloc(@org.lwjgl.system.NativeType("size_t") long r6, @org.lwjgl.system.NativeType("size_t") long r8) {
            r0 = r6
            r1 = r8
            long r0 = nje_calloc(r0, r1)
            r10 = r0
            r0 = r10
            r1 = r6
            int r1 = (int) r1
            r2 = r8
            int r2 = (int) r2
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static int nje_posix_memalign(long r9, long r11, long r13) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.posix_memalign
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    public static int je_posix_memalign(@org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r7, @org.lwjgl.system.NativeType("size_t") long r8, @org.lwjgl.system.NativeType("size_t") long r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r10
            int r0 = nje_posix_memalign(r0, r1, r2)
            return r0
    }

    public static long nje_aligned_alloc(long r7, long r9) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.aligned_alloc
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer je_aligned_alloc(@org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("size_t") long r7) {
            r0 = r5
            r1 = r7
            long r0 = nje_aligned_alloc(r0, r1)
            r9 = r0
            r0 = r9
            r1 = r7
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long nje_realloc(long r7, long r9) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.realloc
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer je_realloc(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("size_t") long r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r6
            long r0 = nje_realloc(r0, r1)
            r8 = r0
            r0 = r8
            r1 = r6
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static void nje_free(long r5) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.free
            r7 = r0
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void je_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nje_free(r0)
            return
    }

    public static void je_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nje_free(r0)
            return
    }

    public static void je_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nje_free(r0)
            return
    }

    public static void je_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nje_free(r0)
            return
    }

    public static void je_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nje_free(r0)
            return
    }

    public static void je_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nje_free(r0)
            return
    }

    public static void je_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") org.lwjgl.PointerBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nje_free(r0)
            return
    }

    public static long nje_mallocx(long r6, int r8) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.mallocx
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer je_mallocx(@org.lwjgl.system.NativeType("size_t") long r5, int r7) {
            r0 = r5
            r1 = r7
            long r0 = nje_mallocx(r0, r1)
            r8 = r0
            r0 = r8
            r1 = r5
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long nje_rallocx(long r8, long r10, int r12) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.rallocx
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer je_rallocx(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("size_t") long r7, int r9) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r7
            r2 = r9
            long r0 = nje_rallocx(r0, r1, r2)
            r10 = r0
            r0 = r10
            r1 = r7
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long nje_xallocx(long r10, long r12, long r14, int r16) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.xallocx
            r17 = r0
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            long r0 = org.lwjgl.system.JNI.invokePPPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public static long je_xallocx(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("size_t") long r9, @org.lwjgl.system.NativeType("size_t") long r11, int r13) {
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r9
            r2 = r11
            r3 = r13
            long r0 = nje_xallocx(r0, r1, r2, r3)
            return r0
    }

    public static long nje_sallocx(long r6, int r8) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.sallocx
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public static long je_sallocx(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            long r0 = nje_sallocx(r0, r1)
            return r0
    }

    public static void nje_dallocx(long r6, int r8) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.dallocx
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    public static void je_dallocx(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nje_dallocx(r0, r1)
            return
    }

    public static void je_dallocx(@org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nje_dallocx(r0, r1)
            return
    }

    public static void je_dallocx(@org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nje_dallocx(r0, r1)
            return
    }

    public static void je_dallocx(@org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nje_dallocx(r0, r1)
            return
    }

    public static void je_dallocx(@org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nje_dallocx(r0, r1)
            return
    }

    public static void je_dallocx(@org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nje_dallocx(r0, r1)
            return
    }

    public static void je_dallocx(@org.lwjgl.system.NativeType("void *") org.lwjgl.PointerBuffer r4, int r5) {
            r0 = r4
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            nje_dallocx(r0, r1)
            return
    }

    public static void nje_sdallocx(long r8, long r10, int r12) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.sdallocx
            r13 = r0
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }

    public static void je_sdallocx(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r6, int r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r7
            nje_sdallocx(r0, r1, r2)
            return
    }

    public static void je_sdallocx(@org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r6, int r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r7
            nje_sdallocx(r0, r1, r2)
            return
    }

    public static void je_sdallocx(@org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r6, int r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r7
            nje_sdallocx(r0, r1, r2)
            return
    }

    public static void je_sdallocx(@org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r6, int r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r7
            nje_sdallocx(r0, r1, r2)
            return
    }

    public static void je_sdallocx(@org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r6, int r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r7
            nje_sdallocx(r0, r1, r2)
            return
    }

    public static void je_sdallocx(@org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r6, int r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r7
            nje_sdallocx(r0, r1, r2)
            return
    }

    public static void je_sdallocx(@org.lwjgl.system.NativeType("void *") org.lwjgl.PointerBuffer r6, int r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r6
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            int r2 = org.lwjgl.system.Pointer.POINTER_SHIFT
            long r1 = r1 << r2
            r2 = r7
            nje_sdallocx(r0, r1, r2)
            return
    }

    public static long nje_nallocx(long r6, int r8) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.nallocx
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer je_nallocx(@org.lwjgl.system.NativeType("size_t") long r5, int r7) {
            r0 = r5
            r1 = r7
            long r0 = nje_nallocx(r0, r1)
            r8 = r0
            r0 = r8
            r1 = r5
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static int nje_mallctl(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.mallctl
            r23 = r0
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            int r0 = org.lwjgl.system.JNI.invokePPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static int je_mallctl(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r11
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lf:
            r0 = r11
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            int r4 = org.lwjgl.system.Checks.remainingSafe(r4)
            long r4 = (long) r4
            int r0 = nje_mallctl(r0, r1, r2, r3, r4)
            return r0
    }

    public static int je_mallctl(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r11
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L48
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L48
            r17 = r0
            r0 = r17
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)     // Catch: java.lang.Throwable -> L48
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L48
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L48
            r4 = r14
            int r4 = org.lwjgl.system.Checks.remainingSafe(r4)     // Catch: java.lang.Throwable -> L48
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L48
            int r0 = nje_mallctl(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L48
            r19 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            return r0
        L48:
            r20 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r20
            throw r0
    }

    public static int nje_mallctlnametomib(long r9, long r11, long r13) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.mallctlnametomib
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            int r0 = org.lwjgl.system.JNI.invokePPPI(r0, r1, r2, r3)
            return r0
    }

    public static int je_mallctlnametomib(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r9
            r2 = r9
            int r2 = r2.position()
            long r1 = r1.get(r2)
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nje_mallctlnametomib(r0, r1, r2)
            return r0
    }

    public static int je_mallctlnametomib(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r8
            r1 = r9
            r2 = r9
            int r2 = r2.position()
            long r1 = r1.get(r2)
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L46
            r0 = r10
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L46
            r12 = r0
            r0 = r12
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L46
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L46
            int r0 = nje_mallctlnametomib(r0, r1, r2)     // Catch: java.lang.Throwable -> L46
            r14 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            return r0
        L46:
            r15 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static int nje_mallctlbymib(long r15, long r17, long r19, long r21, long r23, long r25) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.mallctlbymib
            r27 = r0
            r0 = r15
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r23
            r5 = r25
            r6 = r27
            int r0 = org.lwjgl.system.JNI.invokePPPPPPI(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static int je_mallctlbymib(@org.lwjgl.system.NativeType("size_t const *") org.lwjgl.PointerBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r13
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r13
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r16
            int r5 = org.lwjgl.system.Checks.remainingSafe(r5)
            long r5 = (long) r5
            int r0 = nje_mallctlbymib(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void nje_malloc_stats_print(long r9, long r11, long r13) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc_stats_print
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    public static void je_malloc_stats_print(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void (*) (void *, char const *)") org.lwjgl.system.jemalloc.MallocMessageCallbackI r7, @org.lwjgl.system.NativeType("void *") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r10
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r8
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nje_malloc_stats_print(r0, r1, r2)
            return
    }

    public static void je_malloc_stats_print(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void (*) (void *, char const *)") org.lwjgl.system.jemalloc.MallocMessageCallbackI r7, @org.lwjgl.system.NativeType("void *") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r10
            r2 = 1
            int r0 = r0.nASCIISafe(r1, r2)     // Catch: java.lang.Throwable -> L37
            r0 = r10
            if (r0 != 0) goto L1c
            r0 = 0
            goto L21
        L1c:
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L37
        L21:
            r13 = r0
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)     // Catch: java.lang.Throwable -> L37
            r1 = r8
            r2 = r13
            nje_malloc_stats_print(r0, r1, r2)     // Catch: java.lang.Throwable -> L37
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            goto L43
        L37:
            r15 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            throw r0
        L43:
            return
    }

    public static long nje_malloc_usable_size(long r5) {
            long r0 = org.lwjgl.system.jemalloc.JEmalloc.Functions.malloc_usable_size
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public static long je_malloc_usable_size(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nje_malloc_usable_size(r0)
            return r0
    }

    public static int MALLOCX_LG_ALIGN(int r2) {
            r0 = r2
            return r0
    }

    public static int MALLOCX_ALIGN(int r2) {
            r0 = r2
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    public static int MALLOCX_TCACHE(int r3) {
            r0 = r3
            r1 = 2
            int r0 = r0 + r1
            r1 = 8
            int r0 = r0 << r1
            return r0
    }

    public static int MALLOCX_ARENA(int r3) {
            r0 = r3
            r1 = 1
            int r0 = r0 + r1
            r1 = 20
            int r0 = r0 << r1
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.jemalloc.JEmalloc.JEMALLOC
            return r0
    }

    static {
            r0 = -1
            int r0 = MALLOCX_TCACHE(r0)
            org.lwjgl.system.jemalloc.JEmalloc.MALLOCX_TCACHE_NONE = r0
            java.lang.Class<org.lwjgl.system.jemalloc.JEmalloc> r0 = org.lwjgl.system.jemalloc.JEmalloc.class
            java.lang.String r1 = "org.lwjgl.jemalloc"
            org.lwjgl.system.Configuration<java.lang.String> r2 = org.lwjgl.system.Configuration.JEMALLOC_LIBRARY_NAME
            java.lang.String r3 = "jemalloc"
            java.lang.String r3 = org.lwjgl.system.Platform.mapLibraryNameBundled(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            org.lwjgl.system.jemalloc.JEmalloc.JEMALLOC = r0
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS
            if (r0 != r1) goto L32
            r0 = 8
            long r0 = nje_malloc(r0)
            nje_free(r0)
        L32:
            return
    }
}
