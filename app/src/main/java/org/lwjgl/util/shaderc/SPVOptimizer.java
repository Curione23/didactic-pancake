package org.lwjgl.util.shaderc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVOptimizer.class */
public class SPVOptimizer {
    private static final org.lwjgl.system.SharedLibrary SHADERC = null;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/shaderc/SPVOptimizer$Functions.class */
    public static final class Functions {
        public static final long OptimizerCreate = 0;
        public static final long OptimizerDestroy = 0;
        public static final long OptimizerSetMessageConsumer = 0;
        public static final long OptimizerRegisterLegalizationPasses = 0;
        public static final long OptimizerRegisterPerformancePasses = 0;
        public static final long OptimizerRegisterSizePasses = 0;
        public static final long OptimizerRegisterPassFromFlag = 0;
        public static final long OptimizerRegisterPassesFromFlags = 0;
        public static final long OptimizerRegisterPassesFromFlagsWhilePreservingTheInterface = 0;
        public static final long OptimizerRun = 0;

        private Functions() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerCreate"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerCreate = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerDestroy"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerDestroy = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerSetMessageConsumer"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerSetMessageConsumer = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerRegisterLegalizationPasses"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterLegalizationPasses = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerRegisterPerformancePasses"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterPerformancePasses = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerRegisterSizePasses"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterSizePasses = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerRegisterPassFromFlag"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterPassFromFlag = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerRegisterPassesFromFlags"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterPassesFromFlags = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterPassesFromFlagsWhilePreservingTheInterface = r0
                org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.access$000()
                java.lang.String r1 = "spvOptimizerRun"
                long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)
                org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRun = r0
                return
        }
    }

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.SHADERC
            return r0
    }

    protected SPVOptimizer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("spv_optimizer_t *")
    public static long spvOptimizerCreate(@org.lwjgl.system.NativeType("spv_target_env") int r4) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerCreate
            r5 = r0
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            return r0
    }

    public static void spvOptimizerDestroy(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerDestroy
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void nspvOptimizerSetMessageConsumer(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerSetMessageConsumer
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    public static void spvOptimizerSetMessageConsumer(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r5, @org.lwjgl.system.NativeType("spv_message_consumer") org.lwjgl.util.shaderc.SPVMessageConsumerI r7) {
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            nspvOptimizerSetMessageConsumer(r0, r1)
            return
    }

    public static void spvOptimizerRegisterLegalizationPasses(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterLegalizationPasses
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvOptimizerRegisterPerformancePasses(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterPerformancePasses
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static void spvOptimizerRegisterSizePasses(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r5) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterSizePasses
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static boolean nspvOptimizerRegisterPassFromFlag(long r7, long r9) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterPassFromFlag
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean spvOptimizerRegisterPassFromFlag(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            boolean r0 = nspvOptimizerRegisterPassFromFlag(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean spvOptimizerRegisterPassFromFlag(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r5, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            boolean r0 = nspvOptimizerRegisterPassFromFlag(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static boolean nspvOptimizerRegisterPassesFromFlags(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterPassesFromFlags
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean spvOptimizerRegisterPassesFromFlags(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r7, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r9) {
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = (long) r2
            boolean r0 = nspvOptimizerRegisterPassesFromFlags(r0, r1, r2)
            return r0
    }

    public static boolean nspvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(long r9, long r11, long r13) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRegisterPassesFromFlagsWhilePreservingTheInterface
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            boolean r0 = org.lwjgl.system.JNI.invokePPPZ(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("bool")
    public static boolean spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r7, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r9) {
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = (long) r2
            boolean r0 = nspvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(r0, r1, r2)
            return r0
    }

    public static int nspvOptimizerRun(long r13, long r15, long r17, long r19, long r21) {
            long r0 = org.lwjgl.util.shaderc.SPVOptimizer.Functions.OptimizerRun
            r23 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L16:
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r23
            int r0 = org.lwjgl.system.JNI.invokePPPPPI(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("spv_result_t")
    public static int spvOptimizerRun(@org.lwjgl.system.NativeType("spv_optimizer_t *") long r11, @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("spv_binary *") org.lwjgl.PointerBuffer r14, @org.lwjgl.system.NativeType("spv_optimizer_options const") long r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r11
            r1 = r13
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            int r0 = nspvOptimizerRun(r0, r1, r2, r3, r4)
            return r0
    }

    static /* synthetic */ org.lwjgl.system.SharedLibrary access$000() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.util.shaderc.SPVOptimizer.SHADERC
            return r0
    }

    static {
            java.lang.Class<org.lwjgl.util.shaderc.SPVOptimizer> r0 = org.lwjgl.util.shaderc.SPVOptimizer.class
            java.lang.String r1 = "org.lwjgl.shaderc"
            org.lwjgl.system.Configuration r2 = org.lwjgl.system.Configuration.SPIRV_TOOLS_OPTIMIZER_LIBRARY_NAME
            void r3 = org.lwjgl.util.shaderc.Shaderc::getLibrary
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3, r4)
            org.lwjgl.util.shaderc.SPVOptimizer.SHADERC = r0
            return
    }
}
