package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Module_Class.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Module_Class.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Module_Class.class */
public class FT_Module_Class extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Module_Class> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int MODULE_FLAGS = 0;
    public static final int MODULE_SIZE = 0;
    public static final int MODULE_NAME = 0;
    public static final int MODULE_VERSION = 0;
    public static final int MODULE_REQUIRES = 0;
    public static final int MODULE_INTERFACE = 0;
    public static final int MODULE_INIT = 0;
    public static final int MODULE_DONE = 0;
    public static final int GET_INTERFACE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Module_Class$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Module_Class$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Module_Class$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Module_Class, org.lwjgl.util.freetype.FT_Module_Class.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Module_Class ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Module_Class.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Module_Class getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Module_Class r0 = org.lwjgl.util.freetype.FT_Module_Class.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long module_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long module_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_size(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String const *")
        public java.nio.ByteBuffer module_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String const *")
        public java.lang.String module_nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_nameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long module_version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_version(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long module_requires() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_requires(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("void const *")
        public java.nio.ByteBuffer module_interface(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_interface(r0, r1)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Module_Constructor module_init() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Module_Constructor r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_init(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Module_Destructor module_done() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Module_Destructor r0 = org.lwjgl.util.freetype.FT_Module_Class.nmodule_done(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Module_Requester get_interface() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Module_Requester r0 = org.lwjgl.util.freetype.FT_Module_Class.nget_interface(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer module_flags(@org.lwjgl.system.NativeType("FT_ULong") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Module_Class.nmodule_flags(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer module_size(@org.lwjgl.system.NativeType("FT_Long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Module_Class.nmodule_size(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer module_name(@org.lwjgl.system.NativeType("FT_String const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Module_Class.nmodule_name(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer module_version(@org.lwjgl.system.NativeType("FT_Fixed") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Module_Class.nmodule_version(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer module_requires(@org.lwjgl.system.NativeType("FT_Fixed") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Module_Class.nmodule_requires(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer module_interface(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Module_Class.nmodule_interface(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer module_init(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Module_Constructor") org.lwjgl.util.freetype.FT_Module_ConstructorI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Module_Class.nmodule_init(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer module_done(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Module_Destructor") org.lwjgl.util.freetype.FT_Module_DestructorI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Module_Class.nmodule_done(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Module_Class.Buffer get_interface(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Module_Requester") org.lwjgl.util.freetype.FT_Module_RequesterI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Module_Class.nget_interface(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Module_Class r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Module_Class$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Module_Class r0 = org.lwjgl.util.freetype.FT_Module_Class.create(r0)
                org.lwjgl.util.freetype.FT_Module_Class.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Module_Class(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Module_Class create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Module_Class r0 = new org.lwjgl.util.freetype.FT_Module_Class
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Module_Class(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long module_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmodule_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long module_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmodule_size(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String const *")
    public java.nio.ByteBuffer module_name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nmodule_name(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String const *")
    public java.lang.String module_nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nmodule_nameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long module_version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmodule_version(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long module_requires() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmodule_requires(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void const *")
    public java.nio.ByteBuffer module_interface(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = nmodule_interface(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Module_Constructor module_init() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Module_Constructor r0 = nmodule_init(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Module_Destructor module_done() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Module_Destructor r0 = nmodule_done(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Module_Requester get_interface() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Module_Requester r0 = nget_interface(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class module_flags(@org.lwjgl.system.NativeType("FT_ULong") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmodule_flags(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class module_size(@org.lwjgl.system.NativeType("FT_Long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmodule_size(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class module_name(@org.lwjgl.system.NativeType("FT_String const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmodule_name(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class module_version(@org.lwjgl.system.NativeType("FT_Fixed") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmodule_version(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class module_requires(@org.lwjgl.system.NativeType("FT_Fixed") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmodule_requires(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class module_interface(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmodule_interface(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class module_init(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Module_Constructor") org.lwjgl.util.freetype.FT_Module_ConstructorI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmodule_init(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class module_done(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Module_Destructor") org.lwjgl.util.freetype.FT_Module_DestructorI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmodule_done(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class get_interface(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Module_Requester") org.lwjgl.util.freetype.FT_Module_RequesterI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nget_interface(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class set(long r5, long r7, java.nio.ByteBuffer r9, long r10, long r12, @javax.annotation.Nullable java.nio.ByteBuffer r14, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Module_ConstructorI r15, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Module_DestructorI r16, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Module_RequesterI r17) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.module_flags(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.module_size(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.module_name(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.module_version(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.module_requires(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.module_interface(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.module_init(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.module_done(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.get_interface(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Module_Class set(org.lwjgl.util.freetype.FT_Module_Class r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class malloc() {
            org.lwjgl.util.freetype.FT_Module_Class r0 = new org.lwjgl.util.freetype.FT_Module_Class
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class calloc() {
            org.lwjgl.util.freetype.FT_Module_Class r0 = new org.lwjgl.util.freetype.FT_Module_Class
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class create() {
            int r0 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Module_Class r0 = new org.lwjgl.util.freetype.FT_Module_Class
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class create(long r6) {
            org.lwjgl.util.freetype.FT_Module_Class r0 = new org.lwjgl.util.freetype.FT_Module_Class
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Module_Class createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Module_Class r0 = new org.lwjgl.util.freetype.FT_Module_Class
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Module_Class$Buffer r0 = new org.lwjgl.util.freetype.FT_Module_Class$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Module_Class$Buffer r0 = new org.lwjgl.util.freetype.FT_Module_Class$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Module_Class$Buffer r0 = new org.lwjgl.util.freetype.FT_Module_Class$Buffer
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

    public static org.lwjgl.util.freetype.FT_Module_Class.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Module_Class$Buffer r0 = new org.lwjgl.util.freetype.FT_Module_Class$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Module_Class.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Module_Class$Buffer r0 = new org.lwjgl.util.freetype.FT_Module_Class$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Module_Class r0 = new org.lwjgl.util.freetype.FT_Module_Class
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Module_Class r0 = new org.lwjgl.util.freetype.FT_Module_Class
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Module_Class$Buffer r0 = new org.lwjgl.util.freetype.FT_Module_Class$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Module_Class.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Module_Class$Buffer r0 = new org.lwjgl.util.freetype.FT_Module_Class$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Module_Class.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nmodule_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nmodule_size(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static java.nio.ByteBuffer nmodule_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nmodule_nameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static long nmodule_version(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nmodule_requires(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_REQUIRES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nmodule_interface(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_INTERFACE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Module_Constructor nmodule_init(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_INIT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Module_Constructor r0 = org.lwjgl.util.freetype.FT_Module_Constructor.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Module_Destructor nmodule_done(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_DONE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Module_Destructor r0 = org.lwjgl.util.freetype.FT_Module_Destructor.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Module_Requester nget_interface(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.GET_INTERFACE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Module_Requester r0 = org.lwjgl.util.freetype.FT_Module_Requester.createSafe(r0)
            return r0
    }

    public static void nmodule_flags(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nmodule_size(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nmodule_name(long r5, java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmodule_version(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nmodule_requires(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_REQUIRES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nmodule_interface(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_INTERFACE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmodule_init(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Module_ConstructorI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_INIT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmodule_done(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Module_DestructorI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_DONE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nget_interface(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Module_RequesterI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.GET_INTERFACE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Module_Class.MODULE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Module_Class r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.util.freetype.FT_Module_Class.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Module_Class.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Module_Class.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.MODULE_FLAGS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.MODULE_SIZE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.MODULE_NAME = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.MODULE_VERSION = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.MODULE_REQUIRES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.MODULE_INTERFACE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.MODULE_INIT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.MODULE_DONE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Module_Class.GET_INTERFACE = r0
            return
    }
}
