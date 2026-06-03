package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties.class */
public class VkPhysicalDeviceShaderIntegerDotProductProperties extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT8BITSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT16BITSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT32BITSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT64BITSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED = 0;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties, org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct8BitUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct8BitSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct8BitMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct16BitUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct16BitSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct16BitMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct32BitUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct32BitSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct32BitMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct64BitUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct64BitSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProduct64BitMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000280001(0x3b9f0fc1, float:0.004854173)
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceShaderIntegerDotProductProperties(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceShaderIntegerDotProductProperties(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
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

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct8BitUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct8BitUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct8BitSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct8BitSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct8BitMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct8BitMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct4x8BitPackedUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct4x8BitPackedSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct16BitUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct16BitUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct16BitSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct16BitSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct16BitMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct16BitMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct32BitUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct32BitUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct32BitSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct32BitSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct32BitMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct32BitMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct64BitUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct64BitUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct64BitSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct64BitSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProduct64BitMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProduct64BitMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000280001(0x3b9f0fc1, float:0.004854173)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties set(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nintegerDotProduct8BitUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct8BitSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct8BitMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct4x8BitPackedUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct4x8BitPackedSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct16BitUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct16BitSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct16BitMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct32BitUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct32BitSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct32BitMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct64BitUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct64BitSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProduct64BitMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.PNEXT
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
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 32
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.POINTER_SIZE
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
            r1 = r0
            r2 = 19
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED = r0
            r0 = r5
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED = r0
            r0 = r5
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties.INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED = r0
            return
    }
}
