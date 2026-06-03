package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingParams.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingParams.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingParams.class */
@org.lwjgl.system.NativeType("struct io_uring_params")
public class IOURingParams extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingParams> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SQ_ENTRIES = 0;
    public static final int CQ_ENTRIES = 0;
    public static final int FLAGS = 0;
    public static final int SQ_THREAD_CPU = 0;
    public static final int SQ_THREAD_IDLE = 0;
    public static final int FEATURES = 0;
    public static final int WQ_FD = 0;
    public static final int RESV = 0;
    public static final int SQ_OFF = 0;
    public static final int CQ_OFF = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingParams$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingParams$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingParams$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingParams, org.lwjgl.system.linux.liburing.IOURingParams.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingParams ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingParams.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingParams getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingParams r0 = org.lwjgl.system.linux.liburing.IOURingParams.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int sq_entries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingParams.nsq_entries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int cq_entries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingParams.ncq_entries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingParams.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int sq_thread_cpu() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingParams.nsq_thread_cpu(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int sq_thread_idle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingParams.nsq_thread_idle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int features() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingParams.nfeatures(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int wq_fd() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingParams.nwq_fd(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32[3]")
        public java.nio.IntBuffer resv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.system.linux.liburing.IOURingParams.nresv(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int resv(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.system.linux.liburing.IOURingParams.nresv(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_sqring_offsets")
        public org.lwjgl.system.linux.liburing.IOSQRingOffsets sq_off() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOSQRingOffsets r0 = org.lwjgl.system.linux.liburing.IOURingParams.nsq_off(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_cqring_offsets")
        public org.lwjgl.system.linux.liburing.IOCQRingOffsets cq_off() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = org.lwjgl.system.linux.liburing.IOURingParams.ncq_off(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer sq_entries(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.nsq_entries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer cq_entries(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.ncq_entries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer sq_thread_cpu(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.nsq_thread_cpu(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer sq_thread_idle(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.nsq_thread_idle(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer features(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.nfeatures(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer wq_fd(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.nwq_fd(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer resv(@org.lwjgl.system.NativeType("__u32[3]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.nresv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer resv(int r6, @org.lwjgl.system.NativeType("__u32") int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.system.linux.liburing.IOURingParams.nresv(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer sq_off(@org.lwjgl.system.NativeType("struct io_sqring_offsets") org.lwjgl.system.linux.liburing.IOSQRingOffsets r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.nsq_off(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer sq_off(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOSQRingOffsets> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.liburing.IOSQRingOffsets r1 = r1.sq_off()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer cq_off(@org.lwjgl.system.NativeType("struct io_cqring_offsets") org.lwjgl.system.linux.liburing.IOCQRingOffsets r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingParams.ncq_off(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingParams.Buffer cq_off(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOCQRingOffsets> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.liburing.IOCQRingOffsets r1 = r1.cq_off()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingParams$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingParams r0 = org.lwjgl.system.linux.liburing.IOURingParams.create(r0)
                org.lwjgl.system.linux.liburing.IOURingParams.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingParams(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingParams create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingParams r0 = new org.lwjgl.system.linux.liburing.IOURingParams
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingParams(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int sq_entries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsq_entries(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int cq_entries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncq_entries(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int sq_thread_cpu() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsq_thread_cpu(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int sq_thread_idle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsq_thread_idle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int features() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfeatures(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int wq_fd() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwq_fd(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32[3]")
    public java.nio.IntBuffer resv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nresv(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int resv(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nresv(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_sqring_offsets")
    public org.lwjgl.system.linux.liburing.IOSQRingOffsets sq_off() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOSQRingOffsets r0 = nsq_off(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_cqring_offsets")
    public org.lwjgl.system.linux.liburing.IOCQRingOffsets cq_off() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = ncq_off(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams sq_entries(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsq_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams cq_entries(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncq_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams sq_thread_cpu(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsq_thread_cpu(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams sq_thread_idle(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsq_thread_idle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams features(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfeatures(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams wq_fd(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwq_fd(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams resv(@org.lwjgl.system.NativeType("__u32[3]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams resv(int r6, @org.lwjgl.system.NativeType("__u32") int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nresv(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams sq_off(@org.lwjgl.system.NativeType("struct io_sqring_offsets") org.lwjgl.system.linux.liburing.IOSQRingOffsets r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsq_off(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams sq_off(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOSQRingOffsets> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.liburing.IOSQRingOffsets r1 = r1.sq_off()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams cq_off(@org.lwjgl.system.NativeType("struct io_cqring_offsets") org.lwjgl.system.linux.liburing.IOCQRingOffsets r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncq_off(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams cq_off(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOCQRingOffsets> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r1 = r1.cq_off()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams set(int r4, int r5, int r6, int r7, int r8, int r9, int r10, java.nio.IntBuffer r11, org.lwjgl.system.linux.liburing.IOSQRingOffsets r12, org.lwjgl.system.linux.liburing.IOCQRingOffsets r13) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.sq_entries(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.cq_entries(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.flags(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.sq_thread_cpu(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.sq_thread_idle(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.features(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.wq_fd(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.resv(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.sq_off(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.cq_off(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingParams set(org.lwjgl.system.linux.liburing.IOURingParams r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams malloc() {
            org.lwjgl.system.linux.liburing.IOURingParams r0 = new org.lwjgl.system.linux.liburing.IOURingParams
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams calloc() {
            org.lwjgl.system.linux.liburing.IOURingParams r0 = new org.lwjgl.system.linux.liburing.IOURingParams
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingParams r0 = new org.lwjgl.system.linux.liburing.IOURingParams
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingParams r0 = new org.lwjgl.system.linux.liburing.IOURingParams
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingParams createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingParams r0 = new org.lwjgl.system.linux.liburing.IOURingParams
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingParams$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingParams$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingParams$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingParams$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingParams$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingParams$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingParams.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingParams$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingParams$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingParams.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingParams$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingParams$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingParams r0 = new org.lwjgl.system.linux.liburing.IOURingParams
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingParams r0 = new org.lwjgl.system.linux.liburing.IOURingParams
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingParams$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingParams$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingParams.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingParams$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingParams$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsq_entries(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SQ_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncq_entries(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.CQ_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsq_thread_cpu(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SQ_THREAD_CPU
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsq_thread_idle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SQ_THREAD_IDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfeatures(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.FEATURES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nwq_fd(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.WQ_FD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nresv(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingParams.RESV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nresv(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOSQRingOffsets nsq_off(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingParams.SQ_OFF
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOSQRingOffsets r0 = org.lwjgl.system.linux.liburing.IOSQRingOffsets.create(r0)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOCQRingOffsets ncq_off(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingParams.CQ_OFF
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOCQRingOffsets r0 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.create(r0)
            return r0
    }

    public static void nsq_entries(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SQ_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncq_entries(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.CQ_ENTRIES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsq_thread_cpu(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SQ_THREAD_CPU
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsq_thread_idle(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.SQ_THREAD_IDLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfeatures(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.FEATURES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nwq_fd(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.WQ_FD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nresv(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingParams.RESV
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nresv(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingParams.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingParams.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsq_off(long r7, org.lwjgl.system.linux.liburing.IOSQRingOffsets r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingParams.SQ_OFF
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.liburing.IOSQRingOffsets.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ncq_off(long r7, org.lwjgl.system.linux.liburing.IOCQRingOffsets r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingParams.CQ_OFF
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingParams r0 = r0.create(r1, r2)
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
            r3 = 4
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
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.system.linux.liburing.IOSQRingOffsets.SIZEOF
            int r4 = org.lwjgl.system.linux.liburing.IOSQRingOffsets.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.SIZEOF
            int r4 = org.lwjgl.system.linux.liburing.IOCQRingOffsets.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingParams.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingParams.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.SQ_ENTRIES = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.CQ_ENTRIES = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.SQ_THREAD_CPU = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.SQ_THREAD_IDLE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.FEATURES = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.WQ_FD = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.RESV = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.SQ_OFF = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingParams.CQ_OFF = r0
            return
    }
}
