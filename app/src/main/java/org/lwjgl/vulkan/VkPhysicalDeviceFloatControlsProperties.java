package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties.class */
public class VkPhysicalDeviceFloatControlsProperties extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int DENORMBEHAVIORINDEPENDENCE = 0;
    public static final int ROUNDINGMODEINDEPENDENCE = 0;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = 0;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = 0;
    public static final int SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = 0;
    public static final int SHADERDENORMPRESERVEFLOAT16 = 0;
    public static final int SHADERDENORMPRESERVEFLOAT32 = 0;
    public static final int SHADERDENORMPRESERVEFLOAT64 = 0;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT16 = 0;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT32 = 0;
    public static final int SHADERDENORMFLUSHTOZEROFLOAT64 = 0;
    public static final int SHADERROUNDINGMODERTEFLOAT16 = 0;
    public static final int SHADERROUNDINGMODERTEFLOAT32 = 0;
    public static final int SHADERROUNDINGMODERTEFLOAT64 = 0;
    public static final int SHADERROUNDINGMODERTZFLOAT16 = 0;
    public static final int SHADERROUNDINGMODERTZFLOAT32 = 0;
    public static final int SHADERROUNDINGMODERTZFLOAT64 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFloatControlsProperties$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties, org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderFloatControlsIndependence")
        public int denormBehaviorIndependence() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ndenormBehaviorIndependence(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderFloatControlsIndependence")
        public int roundingModeIndependence() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nroundingModeIndependence(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderSignedZeroInfNanPreserveFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderDenormPreserveFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderDenormFlushToZeroFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTEFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat32() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat32(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat64() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nshaderRoundingModeRTZFloat64(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000197000(0x3b9dcb88, float:0.0048155226)
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceFloatControlsProperties(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceFloatControlsProperties(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
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

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderFloatControlsIndependence")
    public int denormBehaviorIndependence() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndenormBehaviorIndependence(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderFloatControlsIndependence")
    public int roundingModeIndependence() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nroundingModeIndependence(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSignedZeroInfNanPreserveFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSignedZeroInfNanPreserveFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSignedZeroInfNanPreserveFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormPreserveFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormPreserveFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormPreserveFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormFlushToZeroFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormFlushToZeroFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderDenormFlushToZeroFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTEFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTEFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTEFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTZFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat32() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTZFloat32(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat64() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRoundingModeRTZFloat64(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000197000(0x3b9dcb88, float:0.0048155226)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties set(org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ndenormBehaviorIndependence(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.DENORMBEHAVIORINDEPENDENCE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nroundingModeIndependence(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ROUNDINGMODEINDEPENDENCE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSignedZeroInfNanPreserveFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSignedZeroInfNanPreserveFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSignedZeroInfNanPreserveFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormPreserveFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormPreserveFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormPreserveFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormFlushToZeroFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormFlushToZeroFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderDenormFlushToZeroFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTEFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTEFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTEFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTZFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTZFloat32(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT32
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderRoundingModeRTZFloat64(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT64
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 19
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
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
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.DENORMBEHAVIORINDEPENDENCE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.ROUNDINGMODEINDEPENDENCE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT16 = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT32 = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMPRESERVEFLOAT64 = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT16 = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT32 = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERDENORMFLUSHTOZEROFLOAT64 = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT16 = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT32 = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTEFLOAT64 = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT16 = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT32 = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties.SHADERROUNDINGMODERTZFLOAT64 = r0
            return
    }
}
