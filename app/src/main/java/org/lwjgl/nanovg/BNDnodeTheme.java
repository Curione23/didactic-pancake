package org.lwjgl.nanovg;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/BNDnodeTheme.class */
public class BNDnodeTheme extends org.lwjgl.system.Struct<org.lwjgl.nanovg.BNDnodeTheme> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NODESELECTEDCOLOR = 0;
    public static final int WIRESCOLOR = 0;
    public static final int TEXTSELECTEDCOLOR = 0;
    public static final int ACTIVENODECOLOR = 0;
    public static final int WIRESELECTCOLOR = 0;
    public static final int NODEBACKDROPCOLOR = 0;
    public static final int NOODLECURVING = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/BNDnodeTheme$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.BNDnodeTheme, org.lwjgl.nanovg.BNDnodeTheme.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.nanovg.BNDnodeTheme ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
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
        protected org.lwjgl.nanovg.BNDnodeTheme.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.BNDnodeTheme getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.BNDnodeTheme r0 = org.lwjgl.nanovg.BNDnodeTheme.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor nodeSelectedColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDnodeTheme.nnodeSelectedColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor wiresColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDnodeTheme.nwiresColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor textSelectedColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDnodeTheme.ntextSelectedColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor activeNodeColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDnodeTheme.nactiveNodeColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor wireSelectColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDnodeTheme.nwireSelectColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor nodeBackdropColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDnodeTheme.nnodeBackdropColor(r0)
                return r0
        }

        public int noodleCurving() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.BNDnodeTheme.nnoodleCurving(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer nodeSelectedColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDnodeTheme.nnodeSelectedColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer nodeSelectedColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.nodeSelectedColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer wiresColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDnodeTheme.nwiresColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer wiresColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.wiresColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer textSelectedColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDnodeTheme.ntextSelectedColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer textSelectedColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.textSelectedColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer activeNodeColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDnodeTheme.nactiveNodeColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer activeNodeColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.activeNodeColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer wireSelectColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDnodeTheme.nwireSelectColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer wireSelectColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.wireSelectColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer nodeBackdropColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDnodeTheme.nnodeBackdropColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer nodeBackdropColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.nodeBackdropColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme.Buffer noodleCurving(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDnodeTheme.nnoodleCurving(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.BNDnodeTheme r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.BNDnodeTheme r0 = org.lwjgl.nanovg.BNDnodeTheme.create(r0)
                org.lwjgl.nanovg.BNDnodeTheme.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected BNDnodeTheme(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.BNDnodeTheme create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.BNDnodeTheme r0 = new org.lwjgl.nanovg.BNDnodeTheme
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public BNDnodeTheme(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor nodeSelectedColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = nnodeSelectedColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor wiresColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = nwiresColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor textSelectedColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = ntextSelectedColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor activeNodeColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = nactiveNodeColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor wireSelectColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = nwireSelectColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor nodeBackdropColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = nnodeBackdropColor(r0)
            return r0
    }

    public int noodleCurving() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnoodleCurving(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme nodeSelectedColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnodeSelectedColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme nodeSelectedColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.nodeSelectedColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme wiresColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwiresColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme wiresColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.wiresColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme textSelectedColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntextSelectedColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme textSelectedColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.textSelectedColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme activeNodeColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nactiveNodeColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme activeNodeColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.activeNodeColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme wireSelectColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwireSelectColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme wireSelectColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.wireSelectColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme nodeBackdropColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnodeBackdropColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme nodeBackdropColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.nodeBackdropColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme noodleCurving(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnoodleCurving(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme set(org.lwjgl.nanovg.NVGColor r4, org.lwjgl.nanovg.NVGColor r5, org.lwjgl.nanovg.NVGColor r6, org.lwjgl.nanovg.NVGColor r7, org.lwjgl.nanovg.NVGColor r8, org.lwjgl.nanovg.NVGColor r9, int r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDnodeTheme r0 = r0.nodeSelectedColor(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.nanovg.BNDnodeTheme r0 = r0.wiresColor(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.nanovg.BNDnodeTheme r0 = r0.textSelectedColor(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.nanovg.BNDnodeTheme r0 = r0.activeNodeColor(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.nanovg.BNDnodeTheme r0 = r0.wireSelectColor(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.nanovg.BNDnodeTheme r0 = r0.nodeBackdropColor(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.nanovg.BNDnodeTheme r0 = r0.noodleCurving(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme set(org.lwjgl.nanovg.BNDnodeTheme r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme malloc() {
            org.lwjgl.nanovg.BNDnodeTheme r0 = new org.lwjgl.nanovg.BNDnodeTheme
            r1 = r0
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme calloc() {
            org.lwjgl.nanovg.BNDnodeTheme r0 = new org.lwjgl.nanovg.BNDnodeTheme
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme create() {
            int r0 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.nanovg.BNDnodeTheme r0 = new org.lwjgl.nanovg.BNDnodeTheme
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme create(long r6) {
            org.lwjgl.nanovg.BNDnodeTheme r0 = new org.lwjgl.nanovg.BNDnodeTheme
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.BNDnodeTheme createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.BNDnodeTheme r0 = new org.lwjgl.nanovg.BNDnodeTheme
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer malloc(int r6) {
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = new org.lwjgl.nanovg.BNDnodeTheme$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer calloc(int r7) {
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = new org.lwjgl.nanovg.BNDnodeTheme$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = new org.lwjgl.nanovg.BNDnodeTheme$Buffer
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

    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = new org.lwjgl.nanovg.BNDnodeTheme$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = new org.lwjgl.nanovg.BNDnodeTheme$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDnodeTheme mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDnodeTheme r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDnodeTheme callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDnodeTheme r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDnodeTheme mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.BNDnodeTheme r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDnodeTheme callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.BNDnodeTheme r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.nanovg.BNDnodeTheme r0 = new org.lwjgl.nanovg.BNDnodeTheme
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.ALIGNOF
            int r4 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.nanovg.BNDnodeTheme r0 = new org.lwjgl.nanovg.BNDnodeTheme
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = new org.lwjgl.nanovg.BNDnodeTheme$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.BNDnodeTheme$Buffer r0 = new org.lwjgl.nanovg.BNDnodeTheme$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor nnodeSelectedColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDnodeTheme.NODESELECTEDCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor nwiresColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDnodeTheme.WIRESCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor ntextSelectedColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDnodeTheme.TEXTSELECTEDCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor nactiveNodeColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDnodeTheme.ACTIVENODECOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor nwireSelectColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDnodeTheme.WIRESELECTCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor nnodeBackdropColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDnodeTheme.NODEBACKDROPCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static int nnoodleCurving(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.BNDnodeTheme.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.NOODLECURVING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nnodeSelectedColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.NODESELECTEDCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nwiresColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.WIRESCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntextSelectedColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.TEXTSELECTEDCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nactiveNodeColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.ACTIVENODECOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nwireSelectColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.WIRESELECTCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nnodeBackdropColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.NODEBACKDROPCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nnoodleCurving(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.BNDnodeTheme.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.NOODLECURVING
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
            org.lwjgl.nanovg.BNDnodeTheme r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.nanovg.BNDnodeTheme.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.BNDnodeTheme.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDnodeTheme.NODESELECTEDCOLOR = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDnodeTheme.WIRESCOLOR = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDnodeTheme.TEXTSELECTEDCOLOR = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDnodeTheme.ACTIVENODECOLOR = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDnodeTheme.WIRESELECTCOLOR = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDnodeTheme.NODEBACKDROPCOLOR = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDnodeTheme.NOODLECURVING = r0
            return
    }
}
