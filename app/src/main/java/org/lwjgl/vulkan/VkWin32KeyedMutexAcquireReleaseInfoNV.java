package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV.class */
public class VkWin32KeyedMutexAcquireReleaseInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int ACQUIRECOUNT = 0;
    public static final int PACQUIRESYNCS = 0;
    public static final int PACQUIREKEYS = 0;
    public static final int PACQUIRETIMEOUTMILLISECONDS = 0;
    public static final int RELEASECOUNT = 0;
    public static final int PRELEASESYNCS = 0;
    public static final int PRELEASEKEYS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV, org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int acquireCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.nacquireCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDeviceMemory const *")
        public java.nio.LongBuffer pAcquireSyncs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireSyncs(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint64_t const *")
        public java.nio.LongBuffer pAcquireKeys() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireKeys(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pAcquireTimeoutMilliseconds() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireTimeoutMilliseconds(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int releaseCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.nreleaseCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkDeviceMemory const *")
        public java.nio.LongBuffer pReleaseSyncs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseSyncs(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint64_t const *")
        public java.nio.LongBuffer pReleaseKeys() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseKeys(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000058000(0x3b9bac90, float:0.0047507957)
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer acquireCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.nacquireCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pAcquireSyncs(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceMemory const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireSyncs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pAcquireKeys(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireKeys(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pAcquireTimeoutMilliseconds(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireTimeoutMilliseconds(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer releaseCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.nreleaseCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pReleaseSyncs(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceMemory const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseSyncs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pReleaseKeys(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseKeys(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.create(r0)
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkWin32KeyedMutexAcquireReleaseInfoNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkWin32KeyedMutexAcquireReleaseInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int acquireCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nacquireCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDeviceMemory const *")
    public java.nio.LongBuffer pAcquireSyncs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npAcquireSyncs(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint64_t const *")
    public java.nio.LongBuffer pAcquireKeys() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npAcquireKeys(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer pAcquireTimeoutMilliseconds() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npAcquireTimeoutMilliseconds(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int releaseCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nreleaseCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDeviceMemory const *")
    public java.nio.LongBuffer pReleaseSyncs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npReleaseSyncs(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint64_t const *")
    public java.nio.LongBuffer pReleaseKeys() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npReleaseKeys(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000058000(0x3b9bac90, float:0.0047507957)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV acquireCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nacquireCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireSyncs(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceMemory const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npAcquireSyncs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireKeys(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npAcquireKeys(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireTimeoutMilliseconds(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npAcquireTimeoutMilliseconds(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV releaseCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nreleaseCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseSyncs(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceMemory const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npReleaseSyncs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseKeys(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npReleaseKeys(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV set(int r5, long r6, int r8, @javax.annotation.Nullable java.nio.LongBuffer r9, @javax.annotation.Nullable java.nio.LongBuffer r10, @javax.annotation.Nullable java.nio.IntBuffer r11, int r12, @javax.annotation.Nullable java.nio.LongBuffer r13, @javax.annotation.Nullable java.nio.LongBuffer r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.acquireCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.pAcquireSyncs(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.pAcquireKeys(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.pAcquireTimeoutMilliseconds(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.releaseCount(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.pReleaseSyncs(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.pReleaseKeys(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV set(org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV malloc() {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV calloc() {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV create(long r6) {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nacquireCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.ACQUIRECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npAcquireSyncs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRESYNCS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nacquireCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npAcquireKeys(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIREKEYS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nacquireCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npAcquireTimeoutMilliseconds(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRETIMEOUTMILLISECONDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nacquireCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static int nreleaseCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.RELEASECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npReleaseSyncs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASESYNCS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nreleaseCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npReleaseKeys(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASEKEYS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nreleaseCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nacquireCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.ACQUIRECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npAcquireSyncs(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRESYNCS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npAcquireKeys(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIREKEYS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npAcquireTimeoutMilliseconds(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRETIMEOUTMILLISECONDS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nreleaseCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.RELEASECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npReleaseSyncs(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASESYNCS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npReleaseKeys(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASEKEYS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nacquireCount(r0)
            if (r0 == 0) goto L2e
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRESYNCS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIREKEYS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRETIMEOUTMILLISECONDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L2e:
            r0 = r5
            int r0 = nreleaseCount(r0)
            if (r0 == 0) goto L4f
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASESYNCS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASEKEYS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L4f:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.ACQUIRECOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRESYNCS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIREKEYS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRETIMEOUTMILLISECONDS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.RELEASECOUNT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASESYNCS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASEKEYS = r0
            return
    }
}
