package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo.class */
public class VkSamplerYcbcrConversionCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FORMAT = 0;
    public static final int YCBCRMODEL = 0;
    public static final int YCBCRRANGE = 0;
    public static final int COMPONENTS = 0;
    public static final int XCHROMAOFFSET = 0;
    public static final int YCHROMAOFFSET = 0;
    public static final int CHROMAFILTER = 0;
    public static final int FORCEEXPLICITRECONSTRUCTION = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo, org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
                int r2 = r2 / r3
                r0.<init>(r1, r2)
                return
        }

        public Buffer(long r10, int r12) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = r12
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nformat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerYcbcrModelConversion")
        public int ycbcrModel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nycbcrModel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerYcbcrRange")
        public int ycbcrRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nycbcrRange(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkComponentMapping components() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkComponentMapping r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.ncomponents(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkChromaLocation")
        public int xChromaOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkChromaLocation")
        public int yChromaOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFilter")
        public int chromaFilter() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nchromaFilter(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean forceExplicitReconstruction() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000156000(0x3b9d2b60, float:0.0047964305)
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExternalFormatANDROID r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalFormatANDROID r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nformat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrModel(@org.lwjgl.system.NativeType("VkSamplerYcbcrModelConversion") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nycbcrModel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrRange(@org.lwjgl.system.NativeType("VkSamplerYcbcrRange") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nycbcrRange(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer components(org.lwjgl.vulkan.VkComponentMapping r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.ncomponents(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer components(java.util.function.Consumer<org.lwjgl.vulkan.VkComponentMapping> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkComponentMapping r1 = r1.components()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer xChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer yChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer chromaFilter(@org.lwjgl.system.NativeType("VkFilter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nchromaFilter(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer forceExplicitReconstruction(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.create(r0)
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSamplerYcbcrConversionCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSamplerYcbcrConversionCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkStructureType")
    public int sType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSamplerYcbcrModelConversion")
    public int ycbcrModel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nycbcrModel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSamplerYcbcrRange")
    public int ycbcrRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nycbcrRange(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkComponentMapping components() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkComponentMapping r0 = ncomponents(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkChromaLocation")
    public int xChromaOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nxChromaOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkChromaLocation")
    public int yChromaOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nyChromaOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFilter")
    public int chromaFilter() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nchromaFilter(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean forceExplicitReconstruction() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nforceExplicitReconstruction(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000156000(0x3b9d2b60, float:0.0047964305)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo pNext(org.lwjgl.vulkan.VkExternalFormatANDROID r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalFormatANDROID r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo pNext(org.lwjgl.vulkan.VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo ycbcrModel(@org.lwjgl.system.NativeType("VkSamplerYcbcrModelConversion") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nycbcrModel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo ycbcrRange(@org.lwjgl.system.NativeType("VkSamplerYcbcrRange") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nycbcrRange(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo components(org.lwjgl.vulkan.VkComponentMapping r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncomponents(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo components(java.util.function.Consumer<org.lwjgl.vulkan.VkComponentMapping> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkComponentMapping r1 = r1.components()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo xChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nxChromaOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo yChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nyChromaOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo chromaFilter(@org.lwjgl.system.NativeType("VkFilter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchromaFilter(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nforceExplicitReconstruction(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo set(int r5, long r6, int r8, int r9, int r10, org.lwjgl.vulkan.VkComponentMapping r11, int r12, int r13, int r14, boolean r15) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.format(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.ycbcrModel(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.ycbcrRange(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.components(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.xChromaOffset(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.yChromaOffset(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.chromaFilter(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.forceExplicitReconstruction(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo set(org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo malloc() {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo calloc() {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nycbcrModel(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nycbcrRange(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkComponentMapping ncomponents(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.COMPONENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkComponentMapping r0 = org.lwjgl.vulkan.VkComponentMapping.create(r0)
            return r0
    }

    public static int nxChromaOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nyChromaOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nchromaFilter(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nforceExplicitReconstruction(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nformat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nycbcrModel(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nycbcrRange(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncomponents(long r7, org.lwjgl.vulkan.VkComponentMapping r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.COMPONENTS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkComponentMapping.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nxChromaOffset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nyChromaOffset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nchromaFilter(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nforceExplicitReconstruction(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkComponentMapping.SIZEOF
            int r4 = org.lwjgl.vulkan.VkComponentMapping.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORMAT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.COMPONENTS = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION = r0
            return
    }
}
