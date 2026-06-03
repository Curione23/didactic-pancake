package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR.class */
public class VkSamplerYcbcrConversionCreateInfoKHR extends org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer {
        private static final org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000156000(0x3b9d2b60, float:0.0047964305)
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.nformat(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer ycbcrModel(@org.lwjgl.system.NativeType("VkSamplerYcbcrModelConversion") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.nycbcrModel(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer ycbcrRange(@org.lwjgl.system.NativeType("VkSamplerYcbcrRange") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.nycbcrRange(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer components(org.lwjgl.vulkan.VkComponentMapping r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.ncomponents(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer components(java.util.function.Consumer<org.lwjgl.vulkan.VkComponentMapping> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkComponentMapping r1 = r1.components()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer xChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.nxChromaOffset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer yChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.nyChromaOffset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer chromaFilter(@org.lwjgl.system.NativeType("VkFilter") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.nchromaFilter(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer forceExplicitReconstruction(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.nforceExplicitReconstruction(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer forceExplicitReconstruction(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.forceExplicitReconstruction(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer chromaFilter(@org.lwjgl.system.NativeType("VkFilter") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.chromaFilter(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer yChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.yChromaOffset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer xChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.xChromaOffset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer components(java.util.function.Consumer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.components(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer components(org.lwjgl.vulkan.VkComponentMapping r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.components(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrRange(@org.lwjgl.system.NativeType("VkSamplerYcbcrRange") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.ycbcrRange(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrModel(@org.lwjgl.system.NativeType("VkSamplerYcbcrModelConversion") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.ycbcrModel(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer format(@org.lwjgl.system.NativeType("VkFormat") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.format(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.create(r0)
                org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSamplerYcbcrConversionCreateInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSamplerYcbcrConversionCreateInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000156000(0x3b9d2b60, float:0.0047964305)
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR ycbcrModel(@org.lwjgl.system.NativeType("VkSamplerYcbcrModelConversion") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nycbcrModel(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR ycbcrRange(@org.lwjgl.system.NativeType("VkSamplerYcbcrRange") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nycbcrRange(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR components(org.lwjgl.vulkan.VkComponentMapping r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncomponents(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR components(java.util.function.Consumer<org.lwjgl.vulkan.VkComponentMapping> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkComponentMapping r1 = r1.components()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR xChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nxChromaOffset(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR yChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nyChromaOffset(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR chromaFilter(@org.lwjgl.system.NativeType("VkFilter") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchromaFilter(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR forceExplicitReconstruction(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR set(int r5, long r6, int r8, int r9, int r10, org.lwjgl.vulkan.VkComponentMapping r11, int r12, int r13, int r14, boolean r15) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.format(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.ycbcrModel(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.ycbcrRange(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.components(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.xChromaOffset(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.yChromaOffset(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.chromaFilter(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.forceExplicitReconstruction(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR set(org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR malloc() {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR calloc() {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo set(int r14, long r15, int r17, int r18, int r19, org.lwjgl.vulkan.VkComponentMapping r20, int r21, int r22, int r23, boolean r24) {
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.forceExplicitReconstruction(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo chromaFilter(@org.lwjgl.system.NativeType("VkFilter") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.chromaFilter(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo yChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.yChromaOffset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo xChromaOffset(@org.lwjgl.system.NativeType("VkChromaLocation") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.xChromaOffset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo components(java.util.function.Consumer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.components(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo components(org.lwjgl.vulkan.VkComponentMapping r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.components(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo ycbcrRange(@org.lwjgl.system.NativeType("VkSamplerYcbcrRange") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.ycbcrRange(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo ycbcrModel(@org.lwjgl.system.NativeType("VkSamplerYcbcrModelConversion") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.ycbcrModel(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo format(@org.lwjgl.system.NativeType("VkFormat") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.format(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
