package org.lwjgl.nanovg;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/BNDwidgetTheme.class */
public class BNDwidgetTheme extends org.lwjgl.system.Struct<org.lwjgl.nanovg.BNDwidgetTheme> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int OUTLINECOLOR = 0;
    public static final int ITEMCOLOR = 0;
    public static final int INNERCOLOR = 0;
    public static final int INNERSELECTEDCOLOR = 0;
    public static final int TEXTCOLOR = 0;
    public static final int TEXTSELECTEDCOLOR = 0;
    public static final int SHADETOP = 0;
    public static final int SHADEDOWN = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/BNDwidgetTheme$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.BNDwidgetTheme, org.lwjgl.nanovg.BNDwidgetTheme.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.nanovg.BNDwidgetTheme ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
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
        protected org.lwjgl.nanovg.BNDwidgetTheme.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.BNDwidgetTheme getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor outlineColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDwidgetTheme.noutlineColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor itemColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDwidgetTheme.nitemColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor innerColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDwidgetTheme.ninnerColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor innerSelectedColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDwidgetTheme.ninnerSelectedColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor textColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDwidgetTheme.ntextColor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor textSelectedColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDwidgetTheme.ntextSelectedColor(r0)
                return r0
        }

        public int shadeTop() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.BNDwidgetTheme.nshadeTop(r0)
                return r0
        }

        public int shadeDown() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.BNDwidgetTheme.nshadeDown(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer outlineColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDwidgetTheme.noutlineColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer outlineColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.outlineColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer itemColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDwidgetTheme.nitemColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer itemColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.itemColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer innerColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDwidgetTheme.ninnerColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer innerColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.innerColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer innerSelectedColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDwidgetTheme.ninnerSelectedColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer innerSelectedColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.innerSelectedColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer textColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDwidgetTheme.ntextColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer textColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.textColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer textSelectedColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDwidgetTheme.ntextSelectedColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer textSelectedColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.textSelectedColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer shadeTop(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDwidgetTheme.nshadeTop(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme.Buffer shadeDown(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDwidgetTheme.nshadeDown(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
                org.lwjgl.nanovg.BNDwidgetTheme.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected BNDwidgetTheme(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.BNDwidgetTheme create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.BNDwidgetTheme r0 = new org.lwjgl.nanovg.BNDwidgetTheme
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public BNDwidgetTheme(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor outlineColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = noutlineColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor itemColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = nitemColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor innerColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = ninnerColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor innerSelectedColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = ninnerSelectedColor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor textColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = ntextColor(r0)
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

    public int shadeTop() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshadeTop(r0)
            return r0
    }

    public int shadeDown() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshadeDown(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme outlineColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noutlineColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme outlineColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.outlineColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme itemColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nitemColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme itemColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.itemColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme innerColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninnerColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme innerColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.innerColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme innerSelectedColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninnerSelectedColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme innerSelectedColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.innerSelectedColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme textColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntextColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme textColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.textColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme textSelectedColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntextSelectedColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme textSelectedColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.textSelectedColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme shadeTop(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshadeTop(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme shadeDown(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshadeDown(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme set(org.lwjgl.nanovg.NVGColor r4, org.lwjgl.nanovg.NVGColor r5, org.lwjgl.nanovg.NVGColor r6, org.lwjgl.nanovg.NVGColor r7, org.lwjgl.nanovg.NVGColor r8, org.lwjgl.nanovg.NVGColor r9, int r10, int r11) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.outlineColor(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.itemColor(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.innerColor(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.innerSelectedColor(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.textColor(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.textSelectedColor(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.shadeTop(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.shadeDown(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme set(org.lwjgl.nanovg.BNDwidgetTheme r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme malloc() {
            org.lwjgl.nanovg.BNDwidgetTheme r0 = new org.lwjgl.nanovg.BNDwidgetTheme
            r1 = r0
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme calloc() {
            org.lwjgl.nanovg.BNDwidgetTheme r0 = new org.lwjgl.nanovg.BNDwidgetTheme
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme create() {
            int r0 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.nanovg.BNDwidgetTheme r0 = new org.lwjgl.nanovg.BNDwidgetTheme
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme create(long r6) {
            org.lwjgl.nanovg.BNDwidgetTheme r0 = new org.lwjgl.nanovg.BNDwidgetTheme
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.BNDwidgetTheme createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.BNDwidgetTheme r0 = new org.lwjgl.nanovg.BNDwidgetTheme
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer malloc(int r6) {
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = new org.lwjgl.nanovg.BNDwidgetTheme$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer calloc(int r7) {
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = new org.lwjgl.nanovg.BNDwidgetTheme$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = new org.lwjgl.nanovg.BNDwidgetTheme$Buffer
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

    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = new org.lwjgl.nanovg.BNDwidgetTheme$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = new org.lwjgl.nanovg.BNDwidgetTheme$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDwidgetTheme mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDwidgetTheme callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDwidgetTheme mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.BNDwidgetTheme r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDwidgetTheme callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.BNDwidgetTheme r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.nanovg.BNDwidgetTheme r0 = new org.lwjgl.nanovg.BNDwidgetTheme
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.nanovg.BNDwidgetTheme r0 = new org.lwjgl.nanovg.BNDwidgetTheme
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = new org.lwjgl.nanovg.BNDwidgetTheme$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.BNDwidgetTheme$Buffer r0 = new org.lwjgl.nanovg.BNDwidgetTheme$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor noutlineColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDwidgetTheme.OUTLINECOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor nitemColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDwidgetTheme.ITEMCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor ninnerColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDwidgetTheme.INNERCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor ninnerSelectedColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDwidgetTheme.INNERSELECTEDCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor ntextColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDwidgetTheme.TEXTCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor ntextSelectedColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDwidgetTheme.TEXTSELECTEDCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static int nshadeTop(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.BNDwidgetTheme.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SHADETOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshadeDown(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.BNDwidgetTheme.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SHADEDOWN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void noutlineColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.OUTLINECOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nitemColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.ITEMCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ninnerColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.INNERCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ninnerSelectedColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.INNERSELECTEDCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntextColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.TEXTCOLOR
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
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.TEXTSELECTEDCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nshadeTop(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.BNDwidgetTheme.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SHADETOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshadeDown(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.BNDwidgetTheme.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SHADEDOWN
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
            org.lwjgl.nanovg.BNDwidgetTheme r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
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
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDwidgetTheme.OUTLINECOLOR = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDwidgetTheme.ITEMCOLOR = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDwidgetTheme.INNERCOLOR = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDwidgetTheme.INNERSELECTEDCOLOR = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDwidgetTheme.TEXTCOLOR = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDwidgetTheme.TEXTSELECTEDCOLOR = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDwidgetTheme.SHADETOP = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDwidgetTheme.SHADEDOWN = r0
            return
    }
}
