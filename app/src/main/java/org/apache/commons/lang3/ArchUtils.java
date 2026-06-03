package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class ArchUtils {
    private static final java.util.Map<java.lang.String, org.apache.commons.lang3.arch.Processor> ARCH_TO_PROCESSOR = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.apache.commons.lang3.ArchUtils.ARCH_TO_PROCESSOR = r0
            init()
            return
    }

    @java.lang.Deprecated
    public ArchUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addProcessor(java.lang.String r2, org.apache.commons.lang3.arch.Processor r3) {
            java.util.Map<java.lang.String, org.apache.commons.lang3.arch.Processor> r0 = org.apache.commons.lang3.ArchUtils.ARCH_TO_PROCESSOR
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto Lc
            r0.put(r2, r3)
            return
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " already exists in processor map"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private static void addProcessors(org.apache.commons.lang3.arch.Processor r1, java.lang.String... r2) {
            java.util.stream.Stream r2 = org.apache.commons.lang3.stream.Streams.of(r2)
            org.apache.commons.lang3.ArchUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.ArchUtils$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r2.forEach(r0)
            return
    }

    public static org.apache.commons.lang3.arch.Processor getProcessor() {
            java.lang.String r0 = org.apache.commons.lang3.SystemProperties.getOsArch()
            org.apache.commons.lang3.arch.Processor r0 = getProcessor(r0)
            return r0
    }

    public static org.apache.commons.lang3.arch.Processor getProcessor(java.lang.String r1) {
            java.util.Map<java.lang.String, org.apache.commons.lang3.arch.Processor> r0 = org.apache.commons.lang3.ArchUtils.ARCH_TO_PROCESSOR
            java.lang.Object r1 = r0.get(r1)
            org.apache.commons.lang3.arch.Processor r1 = (org.apache.commons.lang3.arch.Processor) r1
            return r1
    }

    private static void init() {
            init_X86_32Bit()
            init_X86_64Bit()
            init_IA64_32Bit()
            init_IA64_64Bit()
            init_PPC_32Bit()
            init_PPC_64Bit()
            init_Aarch_64Bit()
            init_RISCV_32Bit()
            init_RISCV_64Bit()
            return
    }

    private static void init_Aarch_64Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.AARCH_64
            r0.<init>(r1, r2)
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "aarch64"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    private static void init_IA64_32Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.IA_64
            r0.<init>(r1, r2)
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "ia64_32"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "ia64n"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    private static void init_IA64_64Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.IA_64
            r0.<init>(r1, r2)
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "ia64"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "ia64w"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    private static void init_PPC_32Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.PPC
            r0.<init>(r1, r2)
            r1 = 5
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "ppc"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "power"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "powerpc"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "power_pc"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "power_rs"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    private static void init_PPC_64Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.PPC
            r0.<init>(r1, r2)
            r1 = 5
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "ppc64"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "power64"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "powerpc64"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "power_pc64"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "power_rs64"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    private static void init_RISCV_32Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.RISC_V
            r0.<init>(r1, r2)
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "riscv32"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    private static void init_RISCV_64Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.RISC_V
            r0.<init>(r1, r2)
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "riscv64"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    private static void init_X86_32Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_32
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.X86
            r0.<init>(r1, r2)
            r1 = 6
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "x86"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "i386"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "i486"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "i586"
            r1[r2] = r3
            r2 = 4
            java.lang.String r3 = "i686"
            r1[r2] = r3
            r2 = 5
            java.lang.String r3 = "pentium"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    private static void init_X86_64Bit() {
            org.apache.commons.lang3.arch.Processor r0 = new org.apache.commons.lang3.arch.Processor
            org.apache.commons.lang3.arch.Processor$Arch r1 = org.apache.commons.lang3.arch.Processor.Arch.BIT_64
            org.apache.commons.lang3.arch.Processor$Type r2 = org.apache.commons.lang3.arch.Processor.Type.X86
            r0.<init>(r1, r2)
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "x86_64"
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "amd64"
            r1[r2] = r3
            r2 = 2
            java.lang.String r3 = "em64t"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "universal"
            r1[r2] = r3
            addProcessors(r0, r1)
            return
    }

    static /* synthetic */ void lambda$addProcessors$0(org.apache.commons.lang3.arch.Processor r0, java.lang.String r1) {
            addProcessor(r1, r0)
            return
    }
}
