package org.lwjgl.nanovg;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/BNDtheme.class */
public class BNDtheme extends org.lwjgl.system.Struct<org.lwjgl.nanovg.BNDtheme> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BACKGROUNDCOLOR = 0;
    public static final int REGULARTHEME = 0;
    public static final int TOOLTHEME = 0;
    public static final int RADIOTHEME = 0;
    public static final int TEXTFIELDTHEME = 0;
    public static final int OPTIONTHEME = 0;
    public static final int CHOICETHEME = 0;
    public static final int NUMBERFIELDTHEME = 0;
    public static final int SLIDERTHEME = 0;
    public static final int SCROLLBARTHEME = 0;
    public static final int TOOLTIPTHEME = 0;
    public static final int MENUTHEME = 0;
    public static final int MENUITEMTHEME = 0;
    public static final int NODETHEME = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/BNDtheme$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.BNDtheme, org.lwjgl.nanovg.BNDtheme.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.nanovg.BNDtheme ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.BNDtheme.SIZEOF
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
        protected org.lwjgl.nanovg.BNDtheme.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.BNDtheme getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.BNDtheme r0 = org.lwjgl.nanovg.BNDtheme.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("NVGcolor")
        public org.lwjgl.nanovg.NVGColor backgroundColor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.BNDtheme.nbackgroundColor(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme regularTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.nregularTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme toolTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.ntoolTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme radioTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.nradioTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme textFieldTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.ntextFieldTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme optionTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.noptionTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme choiceTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.nchoiceTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme numberFieldTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.nnumberFieldTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme sliderTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.nsliderTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme scrollBarTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.nscrollBarTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme tooltipTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.ntooltipTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme menuTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.nmenuTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDwidgetTheme menuItemTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDtheme.nmenuItemTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDnodeTheme nodeTheme() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.BNDnodeTheme r0 = org.lwjgl.nanovg.BNDtheme.nnodeTheme(r0)
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer backgroundColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nbackgroundColor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer backgroundColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.NVGColor r1 = r1.backgroundColor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer regularTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nregularTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer regularTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.regularTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer toolTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.ntoolTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer toolTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.toolTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer radioTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nradioTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer radioTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.radioTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer textFieldTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.ntextFieldTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer textFieldTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.textFieldTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer optionTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.noptionTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer optionTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.optionTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer choiceTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nchoiceTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer choiceTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.choiceTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer numberFieldTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nnumberFieldTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer numberFieldTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.numberFieldTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer sliderTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nsliderTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer sliderTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.sliderTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer scrollBarTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nscrollBarTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer scrollBarTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.scrollBarTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer tooltipTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.ntooltipTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer tooltipTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.tooltipTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer menuTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nmenuTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer menuTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.menuTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer menuItemTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nmenuItemTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer menuItemTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.menuItemTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer nodeTheme(org.lwjgl.nanovg.BNDnodeTheme r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.BNDtheme.nnodeTheme(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.BNDtheme.Buffer nodeTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDnodeTheme> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.nanovg.BNDnodeTheme r1 = r1.nodeTheme()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.BNDtheme r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.BNDtheme$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.BNDtheme r0 = org.lwjgl.nanovg.BNDtheme.create(r0)
                org.lwjgl.nanovg.BNDtheme.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected BNDtheme(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.BNDtheme create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.BNDtheme r0 = new org.lwjgl.nanovg.BNDtheme
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public BNDtheme(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("NVGcolor")
    public org.lwjgl.nanovg.NVGColor backgroundColor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NVGColor r0 = nbackgroundColor(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme regularTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = nregularTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme toolTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = ntoolTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme radioTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = nradioTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme textFieldTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = ntextFieldTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme optionTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = noptionTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme choiceTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = nchoiceTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme numberFieldTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = nnumberFieldTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme sliderTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = nsliderTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme scrollBarTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = nscrollBarTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme tooltipTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = ntooltipTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme menuTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = nmenuTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDwidgetTheme menuItemTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDwidgetTheme r0 = nmenuItemTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDnodeTheme nodeTheme() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.BNDnodeTheme r0 = nnodeTheme(r0)
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme backgroundColor(@org.lwjgl.system.NativeType("NVGcolor") org.lwjgl.nanovg.NVGColor r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbackgroundColor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme backgroundColor(java.util.function.Consumer<org.lwjgl.nanovg.NVGColor> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.NVGColor r1 = r1.backgroundColor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme regularTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nregularTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme regularTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.regularTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme toolTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntoolTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme toolTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.toolTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme radioTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nradioTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme radioTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.radioTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme textFieldTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntextFieldTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme textFieldTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.textFieldTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme optionTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noptionTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme optionTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.optionTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme choiceTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nchoiceTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme choiceTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.choiceTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme numberFieldTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnumberFieldTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme numberFieldTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.numberFieldTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme sliderTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsliderTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme sliderTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.sliderTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme scrollBarTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nscrollBarTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme scrollBarTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.scrollBarTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme tooltipTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntooltipTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme tooltipTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.tooltipTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme menuTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmenuTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme menuTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.menuTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme menuItemTheme(org.lwjgl.nanovg.BNDwidgetTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmenuItemTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme menuItemTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDwidgetTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDwidgetTheme r1 = r1.menuItemTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme nodeTheme(org.lwjgl.nanovg.BNDnodeTheme r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnodeTheme(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme nodeTheme(java.util.function.Consumer<org.lwjgl.nanovg.BNDnodeTheme> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.nanovg.BNDnodeTheme r1 = r1.nodeTheme()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme set(org.lwjgl.nanovg.NVGColor r4, org.lwjgl.nanovg.BNDwidgetTheme r5, org.lwjgl.nanovg.BNDwidgetTheme r6, org.lwjgl.nanovg.BNDwidgetTheme r7, org.lwjgl.nanovg.BNDwidgetTheme r8, org.lwjgl.nanovg.BNDwidgetTheme r9, org.lwjgl.nanovg.BNDwidgetTheme r10, org.lwjgl.nanovg.BNDwidgetTheme r11, org.lwjgl.nanovg.BNDwidgetTheme r12, org.lwjgl.nanovg.BNDwidgetTheme r13, org.lwjgl.nanovg.BNDwidgetTheme r14, org.lwjgl.nanovg.BNDwidgetTheme r15, org.lwjgl.nanovg.BNDwidgetTheme r16, org.lwjgl.nanovg.BNDnodeTheme r17) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDtheme r0 = r0.backgroundColor(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.nanovg.BNDtheme r0 = r0.regularTheme(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.nanovg.BNDtheme r0 = r0.toolTheme(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.nanovg.BNDtheme r0 = r0.radioTheme(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.nanovg.BNDtheme r0 = r0.textFieldTheme(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.nanovg.BNDtheme r0 = r0.optionTheme(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.nanovg.BNDtheme r0 = r0.choiceTheme(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.nanovg.BNDtheme r0 = r0.numberFieldTheme(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.nanovg.BNDtheme r0 = r0.sliderTheme(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.nanovg.BNDtheme r0 = r0.scrollBarTheme(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.nanovg.BNDtheme r0 = r0.tooltipTheme(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.nanovg.BNDtheme r0 = r0.menuTheme(r1)
            r0 = r3
            r1 = r16
            org.lwjgl.nanovg.BNDtheme r0 = r0.menuItemTheme(r1)
            r0 = r3
            r1 = r17
            org.lwjgl.nanovg.BNDtheme r0 = r0.nodeTheme(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.nanovg.BNDtheme set(org.lwjgl.nanovg.BNDtheme r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme malloc() {
            org.lwjgl.nanovg.BNDtheme r0 = new org.lwjgl.nanovg.BNDtheme
            r1 = r0
            int r2 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme calloc() {
            org.lwjgl.nanovg.BNDtheme r0 = new org.lwjgl.nanovg.BNDtheme
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme create() {
            int r0 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.nanovg.BNDtheme r0 = new org.lwjgl.nanovg.BNDtheme
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme create(long r6) {
            org.lwjgl.nanovg.BNDtheme r0 = new org.lwjgl.nanovg.BNDtheme
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.BNDtheme createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.BNDtheme r0 = new org.lwjgl.nanovg.BNDtheme
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme.Buffer malloc(int r6) {
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = new org.lwjgl.nanovg.BNDtheme$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme.Buffer calloc(int r7) {
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = new org.lwjgl.nanovg.BNDtheme$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = new org.lwjgl.nanovg.BNDtheme$Buffer
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

    public static org.lwjgl.nanovg.BNDtheme.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = new org.lwjgl.nanovg.BNDtheme$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.BNDtheme.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = new org.lwjgl.nanovg.BNDtheme$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDtheme mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDtheme r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDtheme callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDtheme r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDtheme mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.BNDtheme r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDtheme callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.BNDtheme r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDtheme.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDtheme.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDtheme.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.BNDtheme.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.nanovg.BNDtheme r0 = new org.lwjgl.nanovg.BNDtheme
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.BNDtheme.ALIGNOF
            int r4 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.nanovg.BNDtheme r0 = new org.lwjgl.nanovg.BNDtheme
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.nanovg.BNDtheme.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = new org.lwjgl.nanovg.BNDtheme$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.BNDtheme.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.BNDtheme.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.BNDtheme$Buffer r0 = new org.lwjgl.nanovg.BNDtheme$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.BNDtheme.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.BNDtheme.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.NVGColor nbackgroundColor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.BACKGROUNDCOLOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.NVGColor r0 = org.lwjgl.nanovg.NVGColor.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme nregularTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.REGULARTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme ntoolTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.TOOLTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme nradioTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.RADIOTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme ntextFieldTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.TEXTFIELDTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme noptionTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.OPTIONTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme nchoiceTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.CHOICETHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme nnumberFieldTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.NUMBERFIELDTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme nsliderTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.SLIDERTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme nscrollBarTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.SCROLLBARTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme ntooltipTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.TOOLTIPTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme nmenuTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.MENUTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDwidgetTheme nmenuItemTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.MENUITEMTHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDwidgetTheme r0 = org.lwjgl.nanovg.BNDwidgetTheme.create(r0)
            return r0
    }

    public static org.lwjgl.nanovg.BNDnodeTheme nnodeTheme(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.BNDtheme.NODETHEME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.nanovg.BNDnodeTheme r0 = org.lwjgl.nanovg.BNDnodeTheme.create(r0)
            return r0
    }

    public static void nbackgroundColor(long r7, org.lwjgl.nanovg.NVGColor r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.BACKGROUNDCOLOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.NVGColor.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nregularTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.REGULARTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntoolTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.TOOLTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nradioTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.RADIOTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntextFieldTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.TEXTFIELDTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void noptionTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.OPTIONTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nchoiceTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.CHOICETHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nnumberFieldTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.NUMBERFIELDTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsliderTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.SLIDERTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nscrollBarTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.SCROLLBARTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntooltipTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.TOOLTIPTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nmenuTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.MENUTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nmenuItemTheme(long r7, org.lwjgl.nanovg.BNDwidgetTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.MENUITEMTHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nnodeTheme(long r7, org.lwjgl.nanovg.BNDnodeTheme r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.nanovg.BNDtheme.NODETHEME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.BNDtheme r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 14
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.nanovg.NVGColor.SIZEOF
            int r4 = org.lwjgl.nanovg.NVGColor.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.nanovg.BNDwidgetTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDwidgetTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.nanovg.BNDnodeTheme.SIZEOF
            int r4 = org.lwjgl.nanovg.BNDnodeTheme.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.nanovg.BNDtheme.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.BNDtheme.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.BACKGROUNDCOLOR = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.REGULARTHEME = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.TOOLTHEME = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.RADIOTHEME = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.TEXTFIELDTHEME = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.OPTIONTHEME = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.CHOICETHEME = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.NUMBERFIELDTHEME = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.SLIDERTHEME = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.SCROLLBARTHEME = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.TOOLTIPTHEME = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.MENUTHEME = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.MENUITEMTHEME = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.BNDtheme.NODETHEME = r0
            return
    }
}
