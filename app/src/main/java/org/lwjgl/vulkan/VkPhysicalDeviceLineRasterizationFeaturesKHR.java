package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeaturesKHR.class */
public class VkPhysicalDeviceLineRasterizationFeaturesKHR extends org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR ELEMENT_FACTORY = null;

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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000259000(0x3b9ebdb8, float:0.0048443936)
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer rectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.nrectangularLines(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer bresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.nbresenhamLines(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer smoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.nsmoothLines(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledRectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledRectangularLines(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledBresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledBresenhamLines(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledSmoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledSmoothLines(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer stippledSmoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.stippledSmoothLines(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer stippledBresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.stippledBresenhamLines(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer stippledRectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.stippledRectangularLines(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer smoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.smoothLines(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer bresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.bresenhamLines(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer rectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.rectangularLines(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        /* JADX INFO: renamed from: create */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo5611create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceLineRasterizationFeaturesKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceLineRasterizationFeaturesKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000259000(0x3b9ebdb8, float:0.0048443936)
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR rectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nrectangularLines(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR bresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nbresenhamLines(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR smoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nsmoothLines(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR stippledRectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstippledRectangularLines(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR stippledBresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstippledBresenhamLines(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR stippledSmoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstippledSmoothLines(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR set(int r5, long r6, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.rectangularLines(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.bresenhamLines(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.smoothLines(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.stippledRectangularLines(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.stippledBresenhamLines(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.stippledSmoothLines(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR set(org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures set(int r12, long r13, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.stippledSmoothLines(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.stippledBresenhamLines(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.stippledRectangularLines(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures smoothLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.smoothLines(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures bresenhamLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.bresenhamLines(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures rectangularLines(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.rectangularLines(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures pNext(@org.lwjgl.system.NativeType("void *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesKHR r0 = r0.create(r1, r2)
            return r0
    }
}
