package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class NewAttributeBands extends org.apache.commons.compress.harmony.unpack200.BandSet {
    private final org.apache.commons.compress.harmony.unpack200.AttributeLayout attributeLayout;
    protected java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement> attributeLayoutElements;
    private int backwardsCallCount;

    /* JADX INFO: renamed from: org.apache.commons.compress.harmony.unpack200.NewAttributeBands$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private interface AttributeLayoutElement {
        void addToAttribute(int r1, org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r2);

        void readBands(java.io.InputStream r1, int r2) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception;
    }

    public class Call extends org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement {
        private org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable callable;
        private final int callableIndex;
        final /* synthetic */ org.apache.commons.compress.harmony.unpack200.NewAttributeBands this$0;

        public Call(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                r0.callableIndex = r2
                return
        }

        static /* synthetic */ int access$500(org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Call r0) {
                int r0 = r0.callableIndex
                return r0
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void addToAttribute(int r1, org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r2) {
                r0 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable r1 = r0.callable
                r1.addNextToAttribute(r2)
                return
        }

        public org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable getCallable() {
                r1 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable r0 = r1.callable
                return r0
        }

        public int getCallableIndex() {
                r1 = this;
                int r0 = r1.callableIndex
                return r0
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void readBands(java.io.InputStream r1, int r2) {
                r0 = this;
                int r1 = r0.callableIndex
                if (r1 <= 0) goto L9
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable r1 = r0.callable
                r1.addCount(r2)
            L9:
                return
        }

        public void setCallable(org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable r3) {
                r2 = this;
                r2.callable = r3
                int r0 = r2.callableIndex
                r1 = 1
                if (r0 >= r1) goto La
                r3.setBackwardsCallable()
            La:
                return
        }
    }

    public static class Callable implements org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement {
        private final java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> body;
        private int count;
        private int index;
        private boolean isBackwardsCallable;
        private boolean isFirstCallable;

        public Callable(java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> r1) {
                r0 = this;
                r0.<init>()
                r0.body = r1
                return
        }

        static /* synthetic */ java.util.List access$400(org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable r0) {
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r0.body
                return r0
        }

        public void addCount(int r2) {
                r1 = this;
                int r0 = r1.count
                int r0 = r0 + r2
                r1.count = r0
                return
        }

        public void addNextToAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r4) {
                r3 = this;
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r3.body
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r1
                int r2 = r3.index
                r1.addToAttribute(r2, r4)
                goto L6
            L18:
                int r4 = r3.index
                int r4 = r4 + 1
                r3.index = r4
                return
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void addToAttribute(int r3, org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r4) {
                r2 = this;
                boolean r3 = r2.isFirstCallable
                if (r3 == 0) goto L22
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r3 = r2.body
                java.util.Iterator r3 = r3.iterator()
            La:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L1c
                java.lang.Object r0 = r3.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r0 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r0
                int r1 = r2.index
                r0.addToAttribute(r1, r4)
                goto La
            L1c:
                int r3 = r2.index
                int r3 = r3 + 1
                r2.index = r3
            L22:
                return
        }

        public java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> getBody() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r1.body
                return r0
        }

        public boolean isBackwardsCallable() {
                r1 = this;
                boolean r0 = r1.isBackwardsCallable
                return r0
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void readBands(java.io.InputStream r3, int r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r2 = this;
                boolean r0 = r2.isFirstCallable
                if (r0 == 0) goto L8
                int r0 = r2.count
                int r4 = r4 + r0
                goto La
            L8:
                int r4 = r2.count
            La:
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r2.body
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r1
                r1.readBands(r3, r4)
                goto L10
            L20:
                return
        }

        public void setBackwardsCallable() {
                r1 = this;
                r0 = 1
                r1.isBackwardsCallable = r0
                return
        }

        public void setFirstCallable(boolean r1) {
                r0 = this;
                r0.isFirstCallable = r1
                return
        }
    }

    public class Integral extends org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement {
        private int[] band;
        private final java.lang.String tag;
        final /* synthetic */ org.apache.commons.compress.harmony.unpack200.NewAttributeBands this$0;

        public Integral(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                r0.tag = r2
                return
        }

        static /* synthetic */ int[] access$300(org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Integral r0) {
                int[] r0 = r0.band
                return r0
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void addToAttribute(int r6, org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r7) {
                r5 = this;
                int[] r0 = r5.band
                r6 = r0[r6]
                java.lang.String r0 = r5.tag
                java.lang.String r1 = "B"
                boolean r0 = r0.equals(r1)
                r1 = 1
                if (r0 != 0) goto L121
                java.lang.String r0 = r5.tag
                java.lang.String r2 = "FB"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1b
                goto L121
            L1b:
                java.lang.String r0 = r5.tag
                java.lang.String r2 = "SB"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L2c
                byte r6 = (byte) r6
                long r2 = (long) r6
                r7.addInteger(r1, r2)
                goto L125
            L2c:
                java.lang.String r0 = r5.tag
                java.lang.String r2 = "H"
                boolean r0 = r0.equals(r2)
                r2 = 2
                if (r0 != 0) goto L11c
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "FH"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L43
                goto L11c
            L43:
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "SH"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L54
                short r6 = (short) r6
                long r0 = (long) r6
                r7.addInteger(r2, r0)
                goto L125
            L54:
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "I"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L116
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "FI"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L116
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "SI"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L74
                goto L116
            L74:
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "V"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L125
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "FV"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L125
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "SV"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L94
                goto L125
            L94:
                java.lang.String r0 = r5.tag
                java.lang.String r3 = "PO"
                boolean r0 = r0.startsWith(r3)
                r3 = 0
                if (r0 == 0) goto Lb4
                java.lang.String r0 = r5.tag
                java.lang.String r0 = r0.substring(r2)
                char[] r0 = r0.toCharArray()
                char r0 = r0[r3]
                int r0 = r5.getLength(r0)
                r7.addBCOffset(r0, r6)
                goto L125
            Lb4:
                java.lang.String r0 = r5.tag
                java.lang.String r4 = "P"
                boolean r0 = r0.startsWith(r4)
                if (r0 == 0) goto Ld2
                java.lang.String r0 = r5.tag
                java.lang.String r0 = r0.substring(r1)
                char[] r0 = r0.toCharArray()
                char r0 = r0[r3]
                int r0 = r5.getLength(r0)
                r7.addBCIndex(r0, r6)
                goto L125
            Ld2:
                java.lang.String r0 = r5.tag
                java.lang.String r4 = "OS"
                boolean r0 = r0.startsWith(r4)
                if (r0 == 0) goto Lf8
                java.lang.String r0 = r5.tag
                java.lang.String r0 = r0.substring(r2)
                char[] r0 = r0.toCharArray()
                char r0 = r0[r3]
                int r0 = r5.getLength(r0)
                if (r0 == r1) goto Lf3
                if (r0 == r2) goto Lf1
                goto Lf4
            Lf1:
                short r6 = (short) r6
                goto Lf4
            Lf3:
                byte r6 = (byte) r6
            Lf4:
                r7.addBCLength(r0, r6)
                goto L125
            Lf8:
                java.lang.String r0 = r5.tag
                java.lang.String r2 = "O"
                boolean r0 = r0.startsWith(r2)
                if (r0 == 0) goto L125
                java.lang.String r0 = r5.tag
                java.lang.String r0 = r0.substring(r1)
                char[] r0 = r0.toCharArray()
                char r0 = r0[r3]
                int r0 = r5.getLength(r0)
                r7.addBCLength(r0, r6)
                goto L125
            L116:
                r0 = 4
                long r1 = (long) r6
                r7.addInteger(r0, r1)
                goto L125
            L11c:
                long r0 = (long) r6
                r7.addInteger(r2, r0)
                goto L125
            L121:
                long r2 = (long) r6
                r7.addInteger(r1, r2)
            L125:
                return
        }

        public java.lang.String getTag() {
                r1 = this;
                java.lang.String r0 = r1.tag
                return r0
        }

        int getValue(int r2) {
                r1 = this;
                int[] r0 = r1.band
                r2 = r0[r2]
                return r2
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void readBands(java.io.InputStream r5, int r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r4 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r4.this$0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r2 = r4.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r2 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r2)
                java.lang.String r2 = r2.getName()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "_"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = r4.tag
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r2 = r4.this$0
                java.lang.String r3 = r4.tag
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = r2.getCodec(r3)
                int[] r5 = r0.decodeBandInt(r1, r5, r2, r6)
                r4.band = r5
                return
        }
    }

    private static abstract class LayoutElement implements org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement {
        private LayoutElement() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ LayoutElement(org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        protected int getLength(char r3) {
                r2 = this;
                r0 = 66
                if (r3 == r0) goto L16
                r0 = 86
                r1 = 0
                if (r3 == r0) goto L17
                r0 = 72
                if (r3 == r0) goto L14
                r0 = 73
                if (r3 == r0) goto L12
                goto L17
            L12:
                r1 = 4
                goto L17
            L14:
                r1 = 2
                goto L17
            L16:
                r1 = 1
            L17:
                return r1
        }
    }

    public class Reference extends org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement {
        private java.lang.Object band;
        private final int length;
        private final java.lang.String tag;
        final /* synthetic */ org.apache.commons.compress.harmony.unpack200.NewAttributeBands this$0;

        public Reference(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                r0.tag = r2
                int r1 = r2.length()
                int r1 = r1 + (-1)
                char r1 = r2.charAt(r1)
                int r1 = r0.getLength(r1)
                r0.length = r1
                return
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void addToAttribute(int r3, org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r4) {
                r2 = this;
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "KI"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L17
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            L17:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "KJ"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L2e
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            L2e:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "KF"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L45
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            L45:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "KD"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L5c
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            L5c:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "KS"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L73
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPString[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPString[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            L73:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RC"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L8a
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            L8a:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RS"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto La0
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            La0:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RD"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto Lb6
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            Lb6:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RF"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto Lcc
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            Lcc:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RM"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto Le2
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            Le2:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RI"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto Lf8
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
                goto L10d
            Lf8:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RU"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L10d
                int r0 = r2.length
                java.lang.Object r1 = r2.band
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[]) r1
                r3 = r1[r3]
                r4.addToBody(r0, r3)
            L10d:
                return
        }

        public java.lang.String getTag() {
                r1 = this;
                java.lang.String r0 = r1.tag
                return r0
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void readBands(java.io.InputStream r4, int r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r3 = this;
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "KI"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L1e
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger[] r4 = r0.parseCPIntReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            L1e:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "KJ"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L3c
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPLong[] r4 = r0.parseCPLongReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            L3c:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "KF"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L5a
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat[] r4 = r0.parseCPFloatReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            L5a:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "KD"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L78
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble[] r4 = r0.parseCPDoubleReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            L78:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "KS"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L96
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPString[] r4 = r0.parseCPStringReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            L96:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "RC"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto Lb4
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r4 = r0.parseCPClassReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            Lb4:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "RS"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto Ld2
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r4 = r0.parseCPSignatureReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            Ld2:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "RD"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto Lf0
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType[] r4 = r0.parseCPDescriptorReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            Lf0:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "RF"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L10d
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef[] r4 = r0.parseCPFieldRefReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            L10d:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "RM"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L12a
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef[] r4 = r0.parseCPMethodRefReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            L12a:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "RI"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L147
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef[] r4 = r0.parseCPInterfaceMethodRefReferences(r1, r4, r2, r5)
                r3.band = r4
                goto L163
            L147:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "RU"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L163
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0 = r3.this$0
                org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$100(r0)
                java.lang.String r1 = r1.getName()
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r4 = r0.parseCPUTF8References(r1, r4, r2, r5)
                r3.band = r4
            L163:
                return
        }
    }

    public class Replication extends org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement {
        private final org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Integral countElement;
        private final java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> layoutElements;
        final /* synthetic */ org.apache.commons.compress.harmony.unpack200.NewAttributeBands this$0;

        public Replication(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.layoutElements = r0
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral
                r0.<init>(r2, r3)
                r1.countElement = r0
                java.io.StringReader r3 = new java.io.StringReader
                r3.<init>(r4)
            L19:
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r4 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.access$200(r2, r3)
                if (r4 == 0) goto L25
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r1.layoutElements
                r0.add(r4)
                goto L19
            L25:
                return
        }

        static /* synthetic */ java.util.List access$600(org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Replication r0) {
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r0.layoutElements
                return r0
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void addToAttribute(int r9, org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r10) {
                r8 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = r8.countElement
                r0.addToAttribute(r9, r10)
                r0 = 0
                r1 = r0
            L7:
                if (r0 >= r9) goto L13
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r2 = r8.countElement
                int r2 = r2.getValue(r0)
                int r1 = r1 + r2
                int r0 = r0 + 1
                goto L7
            L13:
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = r8.countElement
                int r9 = r0.getValue(r9)
                long r2 = (long) r9
                r9 = r1
            L1b:
                long r4 = (long) r9
                long r6 = (long) r1
                long r6 = r6 + r2
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 >= 0) goto L3b
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r8.layoutElements
                java.util.Iterator r0 = r0.iterator()
            L28:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L38
                java.lang.Object r4 = r0.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r4 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r4
                r4.addToAttribute(r9, r10)
                goto L28
            L38:
                int r9 = r9 + 1
                goto L1b
            L3b:
                return
        }

        public org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Integral getCountElement() {
                r1 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = r1.countElement
                return r0
        }

        public java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> getLayoutElements() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r1.layoutElements
                return r0
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void readBands(java.io.InputStream r4, int r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r3 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = r3.countElement
                r0.readBands(r4, r5)
                r0 = 0
                r1 = r0
            L7:
                if (r0 >= r5) goto L13
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r2 = r3.countElement
                int r2 = r2.getValue(r0)
                int r1 = r1 + r2
                int r0 = r0 + 1
                goto L7
            L13:
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r5 = r3.layoutElements
                java.util.Iterator r5 = r5.iterator()
            L19:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L29
                java.lang.Object r0 = r5.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r0 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r0
                r0.readBands(r4, r1)
                goto L19
            L29:
                return
        }
    }

    public class Union extends org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement {
        private int[] caseCounts;
        private final java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> defaultCaseBody;
        private int defaultCount;
        final /* synthetic */ org.apache.commons.compress.harmony.unpack200.NewAttributeBands this$0;
        private final java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.UnionCase> unionCases;
        private final org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Integral unionTag;

        public Union(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r2, java.lang.String r3, java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.UnionCase> r4, java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> r5) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r0)
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral
                r0.<init>(r2, r3)
                r1.unionTag = r0
                r1.unionCases = r4
                r1.defaultCaseBody = r5
                return
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void addToAttribute(int r10, org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r11) {
                r9 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = r9.unionTag
                r0.addToAttribute(r10, r11)
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = r9.unionTag
                int[] r0 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Integral.access$300(r0)
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r1 = r9.unionTag
                int r1 = r1.getValue(r10)
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase> r2 = r9.unionCases
                java.util.Iterator r2 = r2.iterator()
                r3 = 0
                r4 = 1
                r6 = r3
                r5 = r4
            L1b:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L42
                java.lang.Object r7 = r2.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase r7 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.UnionCase) r7
                boolean r8 = r7.hasTag(r1)
                if (r8 == 0) goto L1b
                r5 = r3
            L2e:
                if (r5 >= r10) goto L3d
                r8 = r0[r5]
                boolean r8 = r7.hasTag(r8)
                if (r8 == 0) goto L3a
                int r6 = r6 + 1
            L3a:
                int r5 = r5 + 1
                goto L2e
            L3d:
                r7.addToAttribute(r6, r11)
                r5 = r3
                goto L1b
            L42:
                if (r5 == 0) goto L84
                r1 = r3
                r2 = r1
            L46:
                if (r1 >= r10) goto L6c
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase> r5 = r9.unionCases
                java.util.Iterator r5 = r5.iterator()
                r6 = r3
            L4f:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L65
                java.lang.Object r7 = r5.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase r7 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.UnionCase) r7
                r8 = r0[r1]
                boolean r7 = r7.hasTag(r8)
                if (r7 == 0) goto L4f
                r6 = r4
                goto L4f
            L65:
                if (r6 != 0) goto L69
                int r2 = r2 + 1
            L69:
                int r1 = r1 + 1
                goto L46
            L6c:
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r10 = r9.defaultCaseBody
                if (r10 == 0) goto L84
                java.util.Iterator r10 = r10.iterator()
            L74:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L84
                java.lang.Object r0 = r10.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r0 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r0
                r0.addToAttribute(r2, r11)
                goto L74
            L84:
                return
        }

        public java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> getDefaultCaseBody() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r1.defaultCaseBody
                return r0
        }

        public java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.UnionCase> getUnionCases() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase> r0 = r1.unionCases
                return r0
        }

        public org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Integral getUnionTag() {
                r1 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = r1.unionTag
                return r0
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void readBands(java.io.InputStream r9, int r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r8 = this;
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = r8.unionTag
                r0.readBands(r9, r10)
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r10 = r8.unionTag
                int[] r10 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Integral.access$300(r10)
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase> r0 = r8.unionCases
                int r0 = r0.size()
                int[] r0 = new int[r0]
                r8.caseCounts = r0
                r0 = 0
                r1 = r0
            L17:
                int[] r2 = r8.caseCounts
                int r2 = r2.length
                r3 = 1
                if (r1 >= r2) goto L45
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase> r2 = r8.unionCases
                java.lang.Object r2 = r2.get(r1)
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase r2 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.UnionCase) r2
                int r4 = r10.length
                r5 = r0
            L27:
                if (r5 >= r4) goto L3b
                r6 = r10[r5]
                boolean r6 = r2.hasTag(r6)
                if (r6 == 0) goto L38
                int[] r6 = r8.caseCounts
                r7 = r6[r1]
                int r7 = r7 + r3
                r6[r1] = r7
            L38:
                int r5 = r5 + 1
                goto L27
            L3b:
                int[] r3 = r8.caseCounts
                r3 = r3[r1]
                r2.readBands(r9, r3)
                int r1 = r1 + 1
                goto L17
            L45:
                int r1 = r10.length
                r2 = r0
            L47:
                if (r2 >= r1) goto L70
                r4 = r10[r2]
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase> r5 = r8.unionCases
                java.util.Iterator r5 = r5.iterator()
                r6 = r0
            L52:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L66
                java.lang.Object r7 = r5.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase r7 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.UnionCase) r7
                boolean r7 = r7.hasTag(r4)
                if (r7 == 0) goto L52
                r6 = r3
                goto L52
            L66:
                if (r6 != 0) goto L6d
                int r4 = r8.defaultCount
                int r4 = r4 + r3
                r8.defaultCount = r4
            L6d:
                int r2 = r2 + 1
                goto L47
            L70:
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r10 = r8.defaultCaseBody
                if (r10 == 0) goto L8a
                java.util.Iterator r10 = r10.iterator()
            L78:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L8a
                java.lang.Object r0 = r10.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r0 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r0
                int r1 = r8.defaultCount
                r0.readBands(r9, r1)
                goto L78
            L8a:
                return
        }
    }

    public class UnionCase extends org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement {
        private java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> body;
        private final java.util.List<java.lang.Integer> tags;
        final /* synthetic */ org.apache.commons.compress.harmony.unpack200.NewAttributeBands this$0;

        public UnionCase(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r1, java.util.List<java.lang.Integer> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                r0.tags = r2
                return
        }

        public UnionCase(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r1, java.util.List<java.lang.Integer> r2, java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> r3) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                r0.tags = r2
                r0.body = r3
                return
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void addToAttribute(int r3, org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r4) {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r2.body
                if (r0 == 0) goto L18
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r1
                r1.addToAttribute(r3, r4)
                goto L8
            L18:
                return
        }

        public java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> getBody() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r1.body
                if (r0 != 0) goto L6
                java.util.List r0 = java.util.Collections.EMPTY_LIST
            L6:
                return r0
        }

        public boolean hasTag(int r2) {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.tags
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        public boolean hasTag(long r2) {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.tags
                int r2 = (int) r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement
        public void readBands(java.io.InputStream r3, int r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement> r0 = r2.body
                if (r0 == 0) goto L18
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r1
                r1.readBands(r3, r4)
                goto L8
            L18:
                return
        }
    }

    public NewAttributeBands(org.apache.commons.compress.harmony.unpack200.Segment r1, org.apache.commons.compress.harmony.unpack200.AttributeLayout r2) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1)
            r0.attributeLayout = r2
            r0.parseLayout()
            int r1 = r0.backwardsCallCount
            r2.setBackwardsCallCount(r1)
            return
    }

    static /* synthetic */ org.apache.commons.compress.harmony.unpack200.AttributeLayout access$100(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0) {
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r0 = r0.attributeLayout
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement access$200(org.apache.commons.compress.harmony.unpack200.NewAttributeBands r0, java.io.StringReader r1) throws java.io.IOException {
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r0 = r0.readNextLayoutElement(r1)
            return r0
    }

    private org.apache.commons.compress.harmony.unpack200.bytecode.Attribute getOneAttribute(int r4, java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement> r5) {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute
            org.apache.commons.compress.harmony.unpack200.Segment r1 = r3.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r1.getCpBands()
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r2 = r3.attributeLayout
            java.lang.String r2 = r2.getName()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r1.cpUTF8Value(r2)
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r2 = r3.attributeLayout
            int r2 = r2.getIndex()
            r0.<init>(r1, r2)
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r5.next()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement) r1
            r1.addToAttribute(r4, r0)
            goto L1f
        L2f:
            return r0
    }

    private java.io.StringReader getStreamUpToMatchingBracket(java.io.StringReader r6) throws java.io.IOException {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = -1
            r2 = r1
        L7:
            if (r2 == 0) goto L23
            int r3 = r6.read()
            if (r3 != r1) goto L10
            goto L23
        L10:
            char r3 = (char) r3
            r4 = 93
            if (r3 != r4) goto L17
            int r2 = r2 + 1
        L17:
            r4 = 91
            if (r3 != r4) goto L1d
            int r2 = r2 + (-1)
        L1d:
            if (r2 == 0) goto L7
            r0.append(r3)
            goto L7
        L23:
            java.io.StringReader r6 = new java.io.StringReader
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            return r6
    }

    private void parseLayout() throws java.io.IOException {
            r3 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r0 = r3.attributeLayoutElements
            if (r0 != 0) goto L25
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.attributeLayoutElements = r0
            java.io.StringReader r0 = new java.io.StringReader
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r1 = r3.attributeLayout
            java.lang.String r1 = r1.getLayout()
            r0.<init>(r1)
        L16:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement r1 = r3.readNextAttributeElement(r0)
            if (r1 == 0) goto L22
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r2 = r3.attributeLayoutElements
            r2.add(r1)
            goto L16
        L22:
            r3.resolveCalls()
        L25:
            return
    }

    private java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement> readBody(java.io.StringReader r3) throws java.io.IOException {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r1 = r2.readNextLayoutElement(r3)
            if (r1 == 0) goto Lf
            r0.add(r1)
            goto L5
        Lf:
            return r0
    }

    private org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement readNextAttributeElement(java.io.StringReader r3) throws java.io.IOException {
            r2 = this;
            r0 = 1
            r3.mark(r0)
            int r0 = r3.read()
            r1 = -1
            if (r0 != r1) goto Ld
            r3 = 0
            return r3
        Ld:
            r1 = 91
            if (r0 != r1) goto L1f
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable r0 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable
            java.io.StringReader r3 = r2.getStreamUpToMatchingBracket(r3)
            java.util.List r3 = r2.readBody(r3)
            r0.<init>(r3)
            return r0
        L1f:
            r3.reset()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r3 = r2.readNextLayoutElement(r3)
            return r3
    }

    private org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement readNextLayoutElement(java.io.StringReader r7) throws java.io.IOException {
            r6 = this;
            int r0 = r7.read()
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            r1 = 40
            if (r0 == r1) goto L191
            r1 = 66
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L181
            r1 = 70
            if (r0 == r1) goto L169
            r1 = 75
            java.lang.String r5 = ""
            if (r0 == r1) goto L138
            r1 = 86
            if (r0 == r1) goto L181
            r1 = 72
            if (r0 == r1) goto L181
            r1 = 73
            if (r0 == r1) goto L181
            switch(r0) {
                case 78: goto L119;
                case 79: goto Ld7;
                case 80: goto L95;
                default: goto L2c;
            }
        L2c:
            switch(r0) {
                case 82: goto L138;
                case 83: goto L169;
                case 84: goto L30;
                default: goto L2f;
            }
        L2f:
            return r2
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            int r1 = r7.read()
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "S"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            int r1 = r7.read()
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L60:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L65:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase r3 = r6.readNextUnionCase(r7)
            if (r3 == 0) goto L6f
            r1.add(r3)
            goto L65
        L6f:
            r7.read()
            r7.read()
            r7.read()
            r7.mark(r4)
            int r3 = r7.read()
            char r3 = (char) r3
            r4 = 93
            if (r3 == r4) goto L8f
            r7.reset()
            java.io.StringReader r7 = r6.getStreamUpToMatchingBracket(r7)
            java.util.List r2 = r6.readBody(r7)
        L8f:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Union r7 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Union
            r7.<init>(r6, r0, r1, r2)
            return r7
        L95:
            r7.mark(r4)
            int r0 = r7.read()
            r1 = 79
            if (r0 == r1) goto Lbd
            r7.reset()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "P"
            r1.<init>(r2)
            int r7 = r7.read()
            char r7 = (char) r7
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            r0.<init>(r6, r7)
            return r0
        Lbd:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PO"
            r1.<init>(r2)
            int r7 = r7.read()
            char r7 = (char) r7
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            r0.<init>(r6, r7)
            return r0
        Ld7:
            r7.mark(r4)
            int r0 = r7.read()
            r1 = 83
            if (r0 == r1) goto Lff
            r7.reset()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "O"
            r1.<init>(r2)
            int r7 = r7.read()
            char r7 = (char) r7
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            r0.<init>(r6, r7)
            return r0
        Lff:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OS"
            r1.<init>(r2)
            int r7 = r7.read()
            char r7 = (char) r7
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            r0.<init>(r6, r7)
            return r0
        L119:
            int r0 = r7.read()
            char r0 = (char) r0
            r7.read()
            java.lang.String r7 = r6.readUpToMatchingBracket(r7)
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Replication r1 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Replication
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r6, r0, r7)
            return r1
        L138:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            char r0 = (char) r0
            java.lang.StringBuilder r0 = r1.append(r0)
            int r1 = r7.read()
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r7.read()
            char r1 = (char) r1
            r0.append(r1)
            r2 = 78
            if (r1 != r2) goto L15f
            int r7 = r7.read()
            char r7 = (char) r7
            r0.append(r7)
        L15f:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Reference r7 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Reference
            java.lang.String r0 = r0.toString()
            r7.<init>(r6, r0)
            return r7
        L169:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r1 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral
            java.lang.String r2 = new java.lang.String
            char r0 = (char) r0
            int r7 = r7.read()
            char r7 = (char) r7
            r5 = 2
            char[] r5 = new char[r5]
            r5[r3] = r0
            r5[r4] = r7
            r2.<init>(r5)
            r1.<init>(r6, r2)
            return r1
        L181:
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral r7 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Integral
            java.lang.String r1 = new java.lang.String
            char r0 = (char) r0
            char[] r2 = new char[r4]
            r2[r3] = r0
            r1.<init>(r2)
            r7.<init>(r6, r1)
            return r7
        L191:
            java.lang.Integer r0 = r6.readNumber(r7)
            int r0 = r0.intValue()
            r7.read()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Call r7 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Call
            r7.<init>(r6, r0)
            return r7
    }

    private org.apache.commons.compress.harmony.unpack200.NewAttributeBands.UnionCase readNextUnionCase(java.io.StringReader r4) throws java.io.IOException {
            r3 = this;
            r0 = 2
            r4.mark(r0)
            r4.read()
            int r0 = r4.read()
            char r1 = (char) r0
            r2 = 41
            if (r1 == r2) goto L54
            r1 = -1
            if (r0 != r1) goto L14
            goto L54
        L14:
            r4.reset()
            r4.read()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L1f:
            java.lang.Integer r1 = r3.readNumber(r4)
            if (r1 == 0) goto L2b
            r0.add(r1)
            r4.read()
        L2b:
            if (r1 != 0) goto L1f
            r4.read()
            r1 = 1
            r4.mark(r1)
            int r1 = r4.read()
            char r1 = (char) r1
            r2 = 93
            if (r1 != r2) goto L43
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase r4 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase
            r4.<init>(r3, r0)
            return r4
        L43:
            r4.reset()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase r1 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands$UnionCase
            java.io.StringReader r4 = r3.getStreamUpToMatchingBracket(r4)
            java.util.List r4 = r3.readBody(r4)
            r1.<init>(r3, r0, r4)
            return r1
        L54:
            r4.reset()
            r4 = 0
            return r4
    }

    private java.lang.Integer readNumber(java.io.StringReader r5) throws java.io.IOException {
            r4 = this;
            r0 = 1
            r5.mark(r0)
            int r1 = r5.read()
            char r1 = (char) r1
            r2 = 45
            r3 = 0
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r0 = r3
        L10:
            if (r0 != 0) goto L15
            r5.reset()
        L15:
            r1 = 100
            r5.mark(r1)
        L1a:
            int r1 = r5.read()
            r2 = -1
            if (r1 == r2) goto L2b
            char r1 = (char) r1
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 == 0) goto L2b
            int r3 = r3 + 1
            goto L1a
        L2b:
            r5.reset()
            if (r3 != 0) goto L32
            r5 = 0
            return r5
        L32:
            char[] r1 = new char[r3]
            int r5 = r5.read(r1)
            if (r5 != r3) goto L53
            if (r0 == 0) goto L3f
            java.lang.String r5 = "-"
            goto L41
        L3f:
            java.lang.String r5 = ""
        L41:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            java.lang.String r5 = r5.concat(r0)
            int r5 = org.apache.commons.compress.utils.ParsingUtils.parseIntValue(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L53:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Error reading from the input stream"
            r5.<init>(r0)
            throw r5
    }

    private java.lang.String readUpToMatchingBracket(java.io.StringReader r6) throws java.io.IOException {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = -1
            r2 = r1
        L7:
            if (r2 == 0) goto L23
            int r3 = r6.read()
            if (r3 != r1) goto L10
            goto L23
        L10:
            char r3 = (char) r3
            r4 = 93
            if (r3 != r4) goto L17
            int r2 = r2 + 1
        L17:
            r4 = 91
            if (r3 != r4) goto L1d
            int r2 = r2 + (-1)
        L1d:
            if (r2 == 0) goto L7
            r0.append(r3)
            goto L7
        L23:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private void resolveCalls() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r2 = r5.attributeLayoutElements
            int r2 = r2.size()
            if (r0 >= r2) goto L3b
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r2 = r5.attributeLayoutElements
            java.lang.Object r2 = r2.get(r0)
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement r2 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement) r2
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable
            if (r3 == 0) goto L38
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable r2 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable) r2
            if (r0 != 0) goto L1e
            r3 = 1
            r2.setFirstCallable(r3)
        L1e:
            java.util.List r3 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable.access$400(r2)
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r4 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r4
            int r4 = r5.resolveCallsForElement(r0, r2, r4)
            int r1 = r1 + r4
            goto L26
        L38:
            int r0 = r0 + 1
            goto L2
        L3b:
            r5.backwardsCallCount = r1
            return
    }

    private int resolveCallsForElement(int r4, org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable r5, org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement r6) {
            r3 = this;
            boolean r0 = r6 instanceof org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Call
            r1 = 0
            if (r0 == 0) goto L53
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Call r6 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Call) r6
            int r0 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Call.access$500(r6)
            r2 = 1
            if (r0 != 0) goto L13
            r6.setCallable(r5)
        L11:
            r1 = r2
            goto L73
        L13:
            if (r0 <= 0) goto L37
            int r4 = r4 + r2
        L16:
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r5 = r3.attributeLayoutElements
            int r5 = r5.size()
            if (r4 >= r5) goto L73
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r5 = r3.attributeLayoutElements
            java.lang.Object r5 = r5.get(r4)
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement r5 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement) r5
            boolean r2 = r5 instanceof org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable
            if (r2 == 0) goto L34
            int r0 = r0 + (-1)
            if (r0 != 0) goto L34
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable r5 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable) r5
            r6.setCallable(r5)
            goto L73
        L34:
            int r4 = r4 + 1
            goto L16
        L37:
            int r4 = r4 - r2
        L38:
            if (r4 < 0) goto L11
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r5 = r3.attributeLayoutElements
            java.lang.Object r5 = r5.get(r4)
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement r5 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement) r5
            boolean r1 = r5 instanceof org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable
            if (r1 == 0) goto L50
            int r0 = r0 + 1
            if (r0 != 0) goto L50
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable r5 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable) r5
            r6.setCallable(r5)
            goto L11
        L50:
            int r4 = r4 + (-1)
            goto L38
        L53:
            boolean r0 = r6 instanceof org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Replication
            if (r0 == 0) goto L73
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Replication r6 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Replication) r6
            java.util.List r6 = org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Replication.access$600(r6)
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r6.next()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$LayoutElement r0 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.LayoutElement) r0
            int r0 = r3.resolveCallsForElement(r4, r5, r0)
            int r1 = r1 + r0
            goto L61
        L73:
            return r1
    }

    public int getBackwardsCallCount() {
            r1 = this;
            int r0 = r1.backwardsCallCount
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.BHSDCodec getCodec(java.lang.String r2) {
            r1 = this;
            r0 = 79
            int r0 = r2.indexOf(r0)
            if (r0 < 0) goto Lb
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            return r2
        Lb:
            r0 = 80
            int r0 = r2.indexOf(r0)
            if (r0 < 0) goto L16
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            return r2
        L16:
            r0 = 83
            int r0 = r2.indexOf(r0)
            if (r0 < 0) goto L31
            java.lang.String r0 = "KS"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = "RS"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L31
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.SIGNED5
            return r2
        L31:
            r0 = 66
            int r2 = r2.indexOf(r0)
            if (r2 < 0) goto L3c
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            return r2
        L3c:
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            return r2
    }

    public java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> parseAttributes(java.io.InputStream r3, int r4) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r0 = r2.attributeLayoutElements
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement) r1
            r1.readBands(r3, r4)
            goto L6
        L16:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r0 = 0
        L1c:
            if (r0 >= r4) goto L2a
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r1 = r2.attributeLayoutElements
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r1 = r2.getOneAttribute(r0, r1)
            r3.add(r1)
            int r0 = r0 + 1
            goto L1c
        L2a:
            return r3
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(java.io.InputStream r1) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            return
    }

    public void setBackwardsCalls(int[] r5) throws java.io.IOException {
            r4 = this;
            r4.parseLayout()
            java.util.List<org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement> r0 = r4.attributeLayoutElements
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$AttributeLayoutElement r2 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.AttributeLayoutElement) r2
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable
            if (r3 == 0) goto La
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands$Callable r2 = (org.apache.commons.compress.harmony.unpack200.NewAttributeBands.Callable) r2
            boolean r3 = r2.isBackwardsCallable()
            if (r3 == 0) goto La
            r3 = r5[r1]
            r2.addCount(r3)
            int r1 = r1 + 1
            goto La
        L2a:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            return
    }
}
