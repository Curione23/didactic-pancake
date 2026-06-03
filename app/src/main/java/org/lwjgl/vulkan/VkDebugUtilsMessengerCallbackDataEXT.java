package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT.class */
public class VkDebugUtilsMessengerCallbackDataEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int PMESSAGEIDNAME = 0;
    public static final int MESSAGEIDNUMBER = 0;
    public static final int PMESSAGE = 0;
    public static final int QUEUELABELCOUNT = 0;
    public static final int PQUEUELABELS = 0;
    public static final int CMDBUFLABELCOUNT = 0;
    public static final int PCMDBUFLABELS = 0;
    public static final int OBJECTCOUNT = 0;
    public static final int POBJECTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT, org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.nflags(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer pMessageIdName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npMessageIdName(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String pMessageIdNameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npMessageIdNameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int32_t")
        public int messageIdNumber() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.nmessageIdNumber(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.nio.ByteBuffer pMessage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npMessage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char const *")
        public java.lang.String pMessageString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npMessageString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queueLabelCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.nqueueLabelCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *")
        public org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer pQueueLabels() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDebugUtilsLabelEXT$Buffer r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npQueueLabels(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int cmdBufLabelCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.ncmdBufLabelCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *")
        public org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer pCmdBufLabels() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDebugUtilsLabelEXT$Buffer r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npCmdBufLabels(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int objectCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.nobjectCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDebugUtilsObjectNameInfoEXT const *")
        public org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT.Buffer pObjects() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT$Buffer r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npObjects(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000128003(0x3b9cbe03, float:0.0047833933)
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer pNext(org.lwjgl.vulkan.VkDeviceAddressBindingCallbackDataEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceAddressBindingCallbackDataEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer flags(@org.lwjgl.system.NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer pMessageIdName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npMessageIdName(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer messageIdNumber(@org.lwjgl.system.NativeType("int32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.nmessageIdNumber(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer pMessage(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npMessage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer pQueueLabels(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *") org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npQueueLabels(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer pCmdBufLabels(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *") org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npCmdBufLabels(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer pObjects(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDebugUtilsObjectNameInfoEXT const *") org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.npObjects(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.create(r0)
                org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDebugUtilsMessengerCallbackDataEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDebugUtilsMessengerCallbackDataEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer pMessageIdName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npMessageIdName(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String pMessageIdNameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = npMessageIdNameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int32_t")
    public int messageIdNumber() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmessageIdNumber(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.nio.ByteBuffer pMessage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npMessage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char const *")
    public java.lang.String pMessageString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = npMessageString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int queueLabelCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueueLabelCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *")
    public org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer pQueueLabels() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDebugUtilsLabelEXT$Buffer r0 = npQueueLabels(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int cmdBufLabelCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncmdBufLabelCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *")
    public org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer pCmdBufLabels() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDebugUtilsLabelEXT$Buffer r0 = npCmdBufLabels(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int objectCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nobjectCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDebugUtilsObjectNameInfoEXT const *")
    public org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT.Buffer pObjects() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT$Buffer r0 = npObjects(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000128003(0x3b9cbe03, float:0.0047833933)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT pNext(org.lwjgl.vulkan.VkDeviceAddressBindingCallbackDataEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceAddressBindingCallbackDataEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT flags(@org.lwjgl.system.NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT pMessageIdName(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMessageIdName(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT messageIdNumber(@org.lwjgl.system.NativeType("int32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmessageIdNumber(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT pMessage(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMessage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT pQueueLabels(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *") org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npQueueLabels(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabels(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDebugUtilsLabelEXT const *") org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npCmdBufLabels(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT pObjects(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDebugUtilsObjectNameInfoEXT const *") org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npObjects(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT set(int r5, long r6, int r8, @javax.annotation.Nullable java.nio.ByteBuffer r9, int r10, java.nio.ByteBuffer r11, @javax.annotation.Nullable org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer r12, @javax.annotation.Nullable org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT.Buffer r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.pMessageIdName(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.messageIdNumber(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.pMessage(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.pQueueLabels(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.pCmdBufLabels(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.pObjects(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT set(org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT malloc() {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT calloc() {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT create() {
            int r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT create(long r6) {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer npMessageIdName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String npMessageIdNameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static int nmessageIdNumber(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.MESSAGEIDNUMBER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer npMessage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String npMessageString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static int nqueueLabelCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.QUEUELABELCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer npQueueLabels(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nqueueLabelCount(r1)
            org.lwjgl.vulkan.VkDebugUtilsLabelEXT$Buffer r0 = org.lwjgl.vulkan.VkDebugUtilsLabelEXT.createSafe(r0, r1)
            return r0
    }

    public static int ncmdBufLabelCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.CMDBUFLABELCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer npCmdBufLabels(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncmdBufLabelCount(r1)
            org.lwjgl.vulkan.VkDebugUtilsLabelEXT$Buffer r0 = org.lwjgl.vulkan.VkDebugUtilsLabelEXT.createSafe(r0, r1)
            return r0
    }

    public static int nobjectCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT.Buffer npObjects(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POBJECTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nobjectCount(r1)
            org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT$Buffer r0 = org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT.createSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npMessageIdName(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmessageIdNumber(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.MESSAGEIDNUMBER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npMessage(long r5, java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nqueueLabelCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.QUEUELABELCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npQueueLabels(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nqueueLabelCount(r0, r1)
            return
    }

    public static void ncmdBufLabelCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.CMDBUFLABELCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npCmdBufLabels(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDebugUtilsLabelEXT.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            ncmdBufLabelCount(r0, r1)
            return
    }

    public static void nobjectCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npObjects(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POBJECTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nobjectCount(r0, r1)
            return
    }

    public static void validate(long r6) {
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            int r0 = nqueueLabelCount(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L32
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r2 = org.lwjgl.vulkan.VkDebugUtilsLabelEXT.SIZEOF
            void r3 = org.lwjgl.vulkan.VkDebugUtilsLabelEXT::validate
            validate(r0, r1, r2, r3)
        L32:
            r0 = r6
            int r0 = ncmdBufLabelCount(r0)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L5a
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r10 = r0
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r9
            int r2 = org.lwjgl.vulkan.VkDebugUtilsLabelEXT.SIZEOF
            void r3 = org.lwjgl.vulkan.VkDebugUtilsLabelEXT::validate
            validate(r0, r1, r2, r3)
        L5a:
            r0 = r6
            int r0 = nobjectCount(r0)
            if (r0 == 0) goto L6e
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POBJECTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L6e:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGEIDNAME = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.MESSAGEIDNUMBER = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PMESSAGE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.QUEUELABELCOUNT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PQUEUELABELS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.CMDBUFLABELCOUNT = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.PCMDBUFLABELS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.OBJECTCOUNT = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDebugUtilsMessengerCallbackDataEXT.POBJECTS = r0
            return
    }
}
