package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class NewAttributeBands extends org.apache.commons.compress.harmony.pack200.BandSet {
    protected java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement> attributeLayoutElements;
    private int[] backwardsCallCounts;
    private final org.apache.commons.compress.harmony.pack200.CpBands cpBands;
    private final org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition def;
    private org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral lastPIntegral;
    private boolean usedAtLeastOnce;

    public interface AttributeLayoutElement {
        void addAttributeToBand(org.apache.commons.compress.harmony.pack200.NewAttribute r1, java.io.InputStream r2);

        void pack(java.io.OutputStream r1) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception;

        void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r1, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r2);
    }

    public class Call extends org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement {
        private org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable callable;
        private final int callableIndex;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands this$0;

        public Call(org.apache.commons.compress.harmony.pack200.NewAttributeBands r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.callableIndex = r2
                return
        }

        static /* synthetic */ int access$700(org.apache.commons.compress.harmony.pack200.NewAttributeBands.Call r0) {
                int r0 = r0.callableIndex
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void addAttributeToBand(org.apache.commons.compress.harmony.pack200.NewAttribute r2, java.io.InputStream r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable r0 = r1.callable
                r0.addAttributeToBand(r2, r3)
                int r2 = r1.callableIndex
                r3 = 1
                if (r2 >= r3) goto Lf
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable r2 = r1.callable
                r2.addBackwardsCall()
            Lf:
                return
        }

        public org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable getCallable() {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable r0 = r1.callable
                return r0
        }

        public int getCallableIndex() {
                r1 = this;
                int r0 = r1.callableIndex
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void pack(java.io.OutputStream r1) {
                r0 = this;
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r1, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r2) {
                r0 = this;
                return
        }

        public void setCallable(org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable r3) {
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

    public class Callable implements org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement {
        private int backwardsCallableIndex;
        private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> body;
        private boolean isBackwardsCallable;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands this$0;

        public Callable(org.apache.commons.compress.harmony.pack200.NewAttributeBands r1, java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.body = r2
                return
        }

        static /* synthetic */ java.util.List access$500(org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable r0) {
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r0.body
                return r0
        }

        static /* synthetic */ boolean access$600(org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable r0) {
                boolean r0 = r0.isBackwardsCallable
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void addAttributeToBand(org.apache.commons.compress.harmony.pack200.NewAttribute r3, java.io.InputStream r4) {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.body
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r1
                r1.addAttributeToBand(r3, r4)
                goto L6
            L16:
                return
        }

        public void addBackwardsCall() {
                r3 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r0 = r3.this$0
                int[] r0 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$000(r0)
                int r1 = r3.backwardsCallableIndex
                r2 = r0[r1]
                int r2 = r2 + 1
                r0[r1] = r2
                return
        }

        public java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> getBody() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r1.body
                return r0
        }

        public boolean isBackwardsCallable() {
                r1 = this;
                boolean r0 = r1.isBackwardsCallable
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void pack(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.body
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r1
                r1.pack(r3)
                goto L6
            L16:
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r3, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r4) {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.body
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r1
                r1.renumberBci(r3, r4)
                goto L6
            L16:
                return
        }

        public void setBackwardsCallable() {
                r1 = this;
                r0 = 1
                r1.isBackwardsCallable = r0
                return
        }

        public void setBackwardsCallableIndex(int r1) {
                r0 = this;
                r0.backwardsCallableIndex = r1
                return
        }
    }

    public class Integral extends org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement {
        private final java.util.List band;
        private final org.apache.commons.compress.harmony.pack200.BHSDCodec defaultCodec;
        private org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral previousIntegral;
        private int previousPValue;
        private final java.lang.String tag;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands this$0;

        public Integral(org.apache.commons.compress.harmony.pack200.NewAttributeBands r2, java.lang.String r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.band = r0
                r1.tag = r3
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$100(r2, r3)
                r1.defaultCodec = r2
                return
        }

        public Integral(org.apache.commons.compress.harmony.pack200.NewAttributeBands r2, java.lang.String r3, org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral r4) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.band = r0
                r1.tag = r3
                org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$100(r2, r3)
                r1.defaultCodec = r2
                r1.previousIntegral = r4
                return
        }

        private void renumberOffsetBci(java.util.List r4, org.apache.commons.compress.harmony.pack200.IntList r5, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r6) {
                r3 = this;
                java.util.List r0 = r3.band
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L43
                java.util.List r1 = r3.band
                java.lang.Object r1 = r1.get(r0)
                boolean r2 = r1 instanceof java.lang.Integer
                if (r2 == 0) goto L15
                goto L43
            L15:
                boolean r2 = r1 instanceof org.objectweb.asm.Label
                if (r2 == 0) goto L40
                java.util.List r2 = r3.band
                r2.remove(r0)
                java.lang.Object r1 = r6.get(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                int r1 = r5.get(r1)
                java.lang.Object r2 = r4.get(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                int r1 = r1 - r2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.util.List r2 = r3.band
                r2.add(r0, r1)
            L40:
                int r0 = r0 + (-1)
                goto L8
            L43:
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void addAttributeToBand(org.apache.commons.compress.harmony.pack200.NewAttribute r7, java.io.InputStream r8) {
                r6 = this;
                java.lang.String r0 = r6.tag
                java.lang.String r1 = "B"
                boolean r0 = r0.equals(r1)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L134
                java.lang.String r0 = r6.tag
                java.lang.String r3 = "FB"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L18
                goto L134
            L18:
                java.lang.String r0 = r6.tag
                java.lang.String r3 = "SB"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L2a
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r7 = r6.this$0
                int r7 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r7, r1, r8)
                goto L13c
            L2a:
                java.lang.String r0 = r6.tag
                java.lang.String r3 = "H"
                boolean r0 = r0.equals(r3)
                r3 = 2
                if (r0 != 0) goto L129
                java.lang.String r0 = r6.tag
                java.lang.String r4 = "FH"
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L41
                goto L129
            L41:
                java.lang.String r0 = r6.tag
                java.lang.String r4 = "SH"
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L53
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r7 = r6.this$0
                int r7 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r7, r3, r8)
                goto L13c
            L53:
                java.lang.String r0 = r6.tag
                java.lang.String r4 = "I"
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L121
                java.lang.String r0 = r6.tag
                java.lang.String r4 = "FI"
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L121
                java.lang.String r0 = r6.tag
                java.lang.String r4 = "SI"
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L73
                goto L121
            L73:
                java.lang.String r0 = r6.tag
                java.lang.String r4 = "V"
                boolean r0 = r0.equals(r4)
                r4 = 0
                if (r0 != 0) goto L11f
                java.lang.String r0 = r6.tag
                java.lang.String r5 = "FV"
                boolean r0 = r0.equals(r5)
                if (r0 != 0) goto L11f
                java.lang.String r0 = r6.tag
                java.lang.String r5 = "SV"
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L94
                goto L11f
            L94:
                java.lang.String r0 = r6.tag
                java.lang.String r5 = "PO"
                boolean r0 = r0.startsWith(r5)
                if (r0 != 0) goto Lfc
                java.lang.String r0 = r6.tag
                java.lang.String r5 = "OS"
                boolean r0 = r0.startsWith(r5)
                if (r0 == 0) goto La9
                goto Lfc
            La9:
                java.lang.String r0 = r6.tag
                java.lang.String r3 = "P"
                boolean r0 = r0.startsWith(r3)
                if (r0 == 0) goto Ld0
                java.lang.String r0 = r6.tag
                java.lang.String r0 = r0.substring(r1)
                char[] r0 = r0.toCharArray()
                char r0 = r0[r4]
                int r0 = r6.getLength(r0)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = r6.this$0
                int r8 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r1, r0, r8)
                org.objectweb.asm.Label r2 = r7.getLabel(r8)
                r6.previousPValue = r8
                goto L11d
            Ld0:
                java.lang.String r0 = r6.tag
                java.lang.String r3 = "O"
                boolean r0 = r0.startsWith(r3)
                if (r0 == 0) goto L11f
                java.lang.String r0 = r6.tag
                java.lang.String r0 = r0.substring(r1)
                char[] r0 = r0.toCharArray()
                char r0 = r0[r4]
                int r0 = r6.getLength(r0)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = r6.this$0
                int r8 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r1, r0, r8)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r6.previousIntegral
                int r0 = r0.previousPValue
                int r8 = r8 + r0
                org.objectweb.asm.Label r2 = r7.getLabel(r8)
                r6.previousPValue = r8
                goto L11d
            Lfc:
                java.lang.String r0 = r6.tag
                java.lang.String r0 = r0.substring(r3)
                char[] r0 = r0.toCharArray()
                char r0 = r0[r4]
                int r0 = r6.getLength(r0)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = r6.this$0
                int r8 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r1, r0, r8)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r6.previousIntegral
                int r0 = r0.previousPValue
                int r8 = r8 + r0
                org.objectweb.asm.Label r2 = r7.getLabel(r8)
                r6.previousPValue = r8
            L11d:
                r7 = r8
                goto L13c
            L11f:
                r7 = r4
                goto L13c
            L121:
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r7 = r6.this$0
                r0 = 4
                int r7 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r7, r0, r8)
                goto L13c
            L129:
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r7 = r6.this$0
                int r7 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r7, r3, r8)
                r8 = 65535(0xffff, float:9.1834E-41)
                r7 = r7 & r8
                goto L13c
            L134:
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r7 = r6.this$0
                int r7 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r7, r1, r8)
                r7 = r7 & 255(0xff, float:3.57E-43)
            L13c:
                if (r2 != 0) goto L142
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            L142:
                java.util.List r7 = r6.band
                r7.add(r2)
                return
        }

        public java.lang.String getTag() {
                r1 = this;
                java.lang.String r0 = r1.tag
                return r0
        }

        public int latestValue() {
                r2 = this;
                java.util.List r0 = r2.band
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void pack(java.io.OutputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r4 = this;
                java.lang.String r0 = "Writing new attribute bands..."
                org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r0 = r4.this$0
                java.lang.String r1 = r4.tag
                java.util.List r2 = r4.band
                int[] r2 = r0.integerListToArray(r2)
                org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = r4.defaultCodec
                byte[] r0 = r0.encodeBandInt(r1, r2, r3)
                r5.write(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r1 = "Wrote "
                r5.<init>(r1)
                int r0 = r0.length
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r0 = " bytes from "
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r0 = r4.tag
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r0 = "["
                java.lang.StringBuilder r5 = r5.append(r0)
                java.util.List r0 = r4.band
                int r0 = r0.size()
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r0 = "]"
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r5 = r5.toString()
                org.apache.commons.compress.harmony.pack200.PackingUtils.log(r5)
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r4, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r5) {
                r3 = this;
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "O"
                boolean r0 = r0.startsWith(r1)
                if (r0 != 0) goto L57
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "PO"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L15
                goto L57
            L15:
                java.lang.String r0 = r3.tag
                java.lang.String r1 = "P"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L5e
                java.util.List r0 = r3.band
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L27:
                if (r0 < 0) goto L5e
                java.util.List r1 = r3.band
                java.lang.Object r1 = r1.get(r0)
                boolean r2 = r1 instanceof java.lang.Integer
                if (r2 == 0) goto L34
                goto L5e
            L34:
                boolean r2 = r1 instanceof org.objectweb.asm.Label
                if (r2 == 0) goto L54
                java.util.List r2 = r3.band
                r2.remove(r0)
                java.lang.Object r1 = r5.get(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.util.List r2 = r3.band
                int r1 = r1.intValue()
                int r1 = r4.get(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.add(r0, r1)
            L54:
                int r0 = r0 + (-1)
                goto L27
            L57:
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r3.previousIntegral
                java.util.List r0 = r0.band
                r3.renumberOffsetBci(r0, r4, r5)
            L5e:
                return
        }
    }

    public abstract class LayoutElement implements org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement {
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands this$0;

        public LayoutElement(org.apache.commons.compress.harmony.pack200.NewAttributeBands r1) {
                r0 = this;
                r0.this$0 = r1
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

    public class Reference extends org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement {
        private final java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> band;
        private final boolean nullsAllowed;
        private final java.lang.String tag;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands this$0;

        public Reference(org.apache.commons.compress.harmony.pack200.NewAttributeBands r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.band = r1
                r0.tag = r2
                r1 = 78
                int r1 = r2.indexOf(r1)
                r2 = -1
                if (r1 == r2) goto L19
                r1 = 1
                goto L1a
            L19:
                r1 = 0
            L1a:
                r0.nullsAllowed = r1
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void addAttributeToBand(org.apache.commons.compress.harmony.pack200.NewAttribute r3, java.io.InputStream r4) {
                r2 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r0 = r2.this$0
                r1 = 4
                int r4 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$200(r0, r1, r4)
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RC"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L25
                java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r2.band
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = r2.this$0
                org.apache.commons.compress.harmony.pack200.CpBands r1 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$300(r1)
                java.lang.String r3 = r3.readClass(r4)
                org.apache.commons.compress.harmony.pack200.CPClass r3 = r1.getCPClass(r3)
                r0.add(r3)
                goto L74
            L25:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RU"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L43
                java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r2.band
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = r2.this$0
                org.apache.commons.compress.harmony.pack200.CpBands r1 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$300(r1)
                java.lang.String r3 = r3.readUTF8(r4)
                org.apache.commons.compress.harmony.pack200.CPUTF8 r3 = r1.getCPUtf8(r3)
                r0.add(r3)
                goto L74
            L43:
                java.lang.String r0 = r2.tag
                java.lang.String r1 = "RS"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L61
                java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r2.band
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = r2.this$0
                org.apache.commons.compress.harmony.pack200.CpBands r1 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$300(r1)
                java.lang.String r3 = r3.readUTF8(r4)
                org.apache.commons.compress.harmony.pack200.CPSignature r3 = r1.getCPSignature(r3)
                r0.add(r3)
                goto L74
            L61:
                java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r0 = r2.band
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = r2.this$0
                org.apache.commons.compress.harmony.pack200.CpBands r1 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$300(r1)
                java.lang.Object r3 = r3.readConst(r4)
                org.apache.commons.compress.harmony.pack200.CPConstant r3 = r1.getConstant(r3)
                r0.add(r3)
            L74:
                return
        }

        public java.lang.String getTag() {
                r1 = this;
                java.lang.String r0 = r1.tag
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void pack(java.io.OutputStream r5) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r4 = this;
                boolean r0 = r4.nullsAllowed
                if (r0 == 0) goto Ld
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r0 = r4.this$0
                java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r1 = r4.band
                int[] r0 = r0.cpEntryOrNullListToArray(r1)
                goto L15
            Ld:
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r0 = r4.this$0
                java.util.List<org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r1 = r4.band
                int[] r0 = r0.cpEntryListToArray(r1)
            L15:
                org.apache.commons.compress.harmony.pack200.NewAttributeBands r1 = r4.this$0
                java.lang.String r2 = r4.tag
                org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
                byte[] r1 = r1.encodeBandInt(r2, r0, r3)
                r5.write(r1)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r2 = "Wrote "
                r5.<init>(r2)
                int r1 = r1.length
                java.lang.StringBuilder r5 = r5.append(r1)
                java.lang.String r1 = " bytes from "
                java.lang.StringBuilder r5 = r5.append(r1)
                java.lang.String r1 = r4.tag
                java.lang.StringBuilder r5 = r5.append(r1)
                java.lang.String r1 = "["
                java.lang.StringBuilder r5 = r5.append(r1)
                int r0 = r0.length
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r0 = "]"
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r5 = r5.toString()
                org.apache.commons.compress.harmony.pack200.PackingUtils.log(r5)
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r1, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r2) {
                r0 = this;
                return
        }
    }

    public class Replication extends org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement {
        private final org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral countElement;
        private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> layoutElements;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands this$0;

        public Replication(org.apache.commons.compress.harmony.pack200.NewAttributeBands r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.layoutElements = r0
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral
                r0.<init>(r2, r3)
                r1.countElement = r0
                java.io.StringReader r3 = new java.io.StringReader
                r3.<init>(r4)
            L18:
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r4 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.access$400(r2, r3)
                if (r4 == 0) goto L24
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r1.layoutElements
                r0.add(r4)
                goto L18
            L24:
                return
        }

        static /* synthetic */ java.util.List access$800(org.apache.commons.compress.harmony.pack200.NewAttributeBands.Replication r0) {
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r0.layoutElements
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void addAttributeToBand(org.apache.commons.compress.harmony.pack200.NewAttribute r5, java.io.InputStream r6) {
                r4 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r4.countElement
                r0.addAttributeToBand(r5, r6)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r4.countElement
                int r0 = r0.latestValue()
                r1 = 0
            Lc:
                if (r1 >= r0) goto L27
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r2 = r4.layoutElements
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L24
                java.lang.Object r3 = r2.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r3 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r3
                r3.addAttributeToBand(r5, r6)
                goto L14
            L24:
                int r1 = r1 + 1
                goto Lc
            L27:
                return
        }

        public org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral getCountElement() {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r1.countElement
                return r0
        }

        public java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> getLayoutElements() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r1.layoutElements
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void pack(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r2 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r2.countElement
                r0.pack(r3)
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.layoutElements
                java.util.Iterator r0 = r0.iterator()
            Lb:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r1
                r1.pack(r3)
                goto Lb
            L1b:
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r3, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r4) {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.layoutElements
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r1
                r1.renumberBci(r3, r4)
                goto L6
            L16:
                return
        }
    }

    public class Union extends org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement {
        private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> defaultCaseBody;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands this$0;
        private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.UnionCase> unionCases;
        private final org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral unionTag;

        public Union(org.apache.commons.compress.harmony.pack200.NewAttributeBands r2, java.lang.String r3, java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.UnionCase> r4, java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> r5) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral
                r0.<init>(r2, r3)
                r1.unionTag = r0
                r1.unionCases = r4
                r1.defaultCaseBody = r5
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void addAttributeToBand(org.apache.commons.compress.harmony.pack200.NewAttribute r7, java.io.InputStream r8) {
                r6 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r6.unionTag
                r0.addAttributeToBand(r7, r8)
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r6.unionTag
                int r0 = r0.latestValue()
                long r0 = (long) r0
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase> r2 = r6.unionCases
                java.util.Iterator r2 = r2.iterator()
                r3 = 1
            L13:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L2a
                java.lang.Object r4 = r2.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase r4 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.UnionCase) r4
                boolean r5 = r4.hasTag(r0)
                if (r5 == 0) goto L13
                r4.addAttributeToBand(r7, r8)
                r3 = 0
                goto L13
            L2a:
                if (r3 == 0) goto L42
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r6.defaultCaseBody
                java.util.Iterator r0 = r0.iterator()
            L32:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L42
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement) r1
                r1.addAttributeToBand(r7, r8)
                goto L32
            L42:
                return
        }

        public java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> getDefaultCaseBody() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r1.defaultCaseBody
                return r0
        }

        public java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.UnionCase> getUnionCases() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase> r0 = r1.unionCases
                return r0
        }

        public org.apache.commons.compress.harmony.pack200.NewAttributeBands.Integral getUnionTag() {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r1.unionTag
                return r0
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void pack(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r2 = this;
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = r2.unionTag
                r0.pack(r3)
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase> r0 = r2.unionCases
                java.util.Iterator r0 = r0.iterator()
            Lb:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.UnionCase) r1
                r1.pack(r3)
                goto Lb
            L1b:
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.defaultCaseBody
                java.util.Iterator r0 = r0.iterator()
            L21:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement) r1
                r1.pack(r3)
                goto L21
            L31:
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r3, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r4) {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase> r0 = r2.unionCases
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.UnionCase) r1
                r1.renumberBci(r3, r4)
                goto L6
            L16:
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.defaultCaseBody
                java.util.Iterator r0 = r0.iterator()
            L1c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2c
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement) r1
                r1.renumberBci(r3, r4)
                goto L1c
            L2c:
                return
        }
    }

    public class UnionCase extends org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement {
        private final java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> body;
        private final java.util.List<java.lang.Integer> tags;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands this$0;

        public UnionCase(org.apache.commons.compress.harmony.pack200.NewAttributeBands r1, java.util.List<java.lang.Integer> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.tags = r2
                java.util.List r1 = java.util.Collections.EMPTY_LIST
                r0.body = r1
                return
        }

        public UnionCase(org.apache.commons.compress.harmony.pack200.NewAttributeBands r1, java.util.List<java.lang.Integer> r2, java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.tags = r2
                r0.body = r3
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void addAttributeToBand(org.apache.commons.compress.harmony.pack200.NewAttribute r3, java.io.InputStream r4) {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.body
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement) r1
                r1.addAttributeToBand(r3, r4)
                goto L6
            L16:
                return
        }

        public java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> getBody() {
                r1 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r1.body
                return r0
        }

        public boolean hasTag(long r2) {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.tags
                int r2 = (int) r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void pack(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.body
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement) r1
                r1.pack(r3)
                goto L6
            L16:
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement
        public void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r3, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r4) {
                r2 = this;
                java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement> r0 = r2.body
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement) r1
                r1.renumberBci(r3, r4)
                goto L6
            L16:
                return
        }
    }

    public NewAttributeBands(int r1, org.apache.commons.compress.harmony.pack200.CpBands r2, org.apache.commons.compress.harmony.pack200.SegmentHeader r3, org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition r4) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1, r3)
            r0.def = r4
            r0.cpBands = r2
            r0.parseLayout()
            return
    }

    static /* synthetic */ int[] access$000(org.apache.commons.compress.harmony.pack200.NewAttributeBands r0) {
            int[] r0 = r0.backwardsCallCounts
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.harmony.pack200.BHSDCodec access$100(org.apache.commons.compress.harmony.pack200.NewAttributeBands r0, java.lang.String r1) {
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = r0.getCodec(r1)
            return r0
    }

    static /* synthetic */ int access$200(org.apache.commons.compress.harmony.pack200.NewAttributeBands r0, int r1, java.io.InputStream r2) {
            int r0 = r0.readInteger(r1, r2)
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.harmony.pack200.CpBands access$300(org.apache.commons.compress.harmony.pack200.NewAttributeBands r0) {
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r0.cpBands
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement access$400(org.apache.commons.compress.harmony.pack200.NewAttributeBands r0, java.io.StringReader r1) throws java.io.IOException {
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r0 = r0.readNextLayoutElement(r1)
            return r0
    }

    private org.apache.commons.compress.harmony.pack200.BHSDCodec getCodec(java.lang.String r2) {
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
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r0 = r3.def
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r0.layout
            java.lang.String r0 = r0.getUnderlyingString()
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r1 = r3.attributeLayoutElements
            if (r1 != 0) goto L27
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.attributeLayoutElements = r1
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r0)
        L18:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r0 = r3.readNextAttributeElement(r1)
            if (r0 == 0) goto L24
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r2 = r3.attributeLayoutElements
            r2.add(r0)
            goto L18
        L24:
            r3.resolveCalls()
        L27:
            return
    }

    private java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement> readBody(java.io.StringReader r3) throws java.io.IOException {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r1 = r2.readNextLayoutElement(r3)
            if (r1 == 0) goto Lf
            r0.add(r1)
            goto L5
        Lf:
            return r0
    }

    private int readInteger(int r4, java.io.InputStream r5) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            if (r0 >= r4) goto L17
            int r1 = r1 << 8
            int r2 = r5.read()     // Catch: java.io.IOException -> Le
            r1 = r1 | r2
            int r0 = r0 + 1
            goto L2
        Le:
            r4 = move-exception
            java.io.UncheckedIOException r5 = new java.io.UncheckedIOException
            java.lang.String r0 = "Error reading unknown attribute"
            r5.<init>(r0, r4)
            throw r5
        L17:
            r5 = 1
            if (r4 != r5) goto L1b
            byte r1 = (byte) r1
        L1b:
            r5 = 2
            if (r4 != r5) goto L1f
            short r1 = (short) r1
        L1f:
            return r1
    }

    private org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement readNextAttributeElement(java.io.StringReader r3) throws java.io.IOException {
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
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable r0 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable
            java.io.StringReader r3 = r2.getStreamUpToMatchingBracket(r3)
            java.util.List r3 = r2.readBody(r3)
            r0.<init>(r2, r3)
            return r0
        L1f:
            r3.reset()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r3 = r2.readNextLayoutElement(r3)
            return r3
    }

    private org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement readNextLayoutElement(java.io.StringReader r7) throws java.io.IOException {
            r6 = this;
            int r0 = r7.read()
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            r1 = 40
            if (r0 == r1) goto L192
            r1 = 66
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L182
            r1 = 70
            if (r0 == r1) goto L16a
            r1 = 75
            java.lang.String r5 = ""
            if (r0 == r1) goto L139
            r1 = 86
            if (r0 == r1) goto L182
            r1 = 72
            if (r0 == r1) goto L182
            r1 = 73
            if (r0 == r1) goto L182
            switch(r0) {
                case 78: goto L11a;
                case 79: goto Ld4;
                case 80: goto L8c;
                default: goto L2c;
            }
        L2c:
            switch(r0) {
                case 82: goto L139;
                case 83: goto L16a;
                case 84: goto L30;
                default: goto L2f;
            }
        L2f:
            return r2
        L30:
            int r0 = r7.read()
            char r0 = (char) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "S"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            int r1 = r7.read()
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L57:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L5c:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase r3 = r6.readNextUnionCase(r7)
            if (r3 == 0) goto L66
            r1.add(r3)
            goto L5c
        L66:
            r7.read()
            r7.read()
            r7.read()
            r7.mark(r4)
            int r3 = r7.read()
            char r3 = (char) r3
            r4 = 93
            if (r3 == r4) goto L86
            r7.reset()
            java.io.StringReader r7 = r6.getStreamUpToMatchingBracket(r7)
            java.util.List r2 = r6.readBody(r7)
        L86:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Union r7 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Union
            r7.<init>(r6, r0, r1, r2)
            return r7
        L8c:
            r7.mark(r4)
            int r0 = r7.read()
            r1 = 79
            if (r0 == r1) goto Lb6
            r7.reset()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "P"
            r1.<init>(r2)
            int r7 = r7.read()
            char r7 = (char) r7
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            r0.<init>(r6, r7)
            r6.lastPIntegral = r0
            return r0
        Lb6:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PO"
            r1.<init>(r2)
            int r7 = r7.read()
            char r7 = (char) r7
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r1 = r6.lastPIntegral
            r0.<init>(r6, r7, r1)
            r6.lastPIntegral = r0
            return r0
        Ld4:
            r7.mark(r4)
            int r0 = r7.read()
            r1 = 83
            if (r0 == r1) goto Lfe
            r7.reset()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "O"
            r1.<init>(r2)
            int r7 = r7.read()
            char r7 = (char) r7
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r1 = r6.lastPIntegral
            r0.<init>(r6, r7, r1)
            return r0
        Lfe:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r0 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OS"
            r1.<init>(r2)
            int r7 = r7.read()
            char r7 = (char) r7
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r7 = r7.toString()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r1 = r6.lastPIntegral
            r0.<init>(r6, r7, r1)
            return r0
        L11a:
            int r0 = r7.read()
            char r0 = (char) r0
            r7.read()
            java.lang.String r7 = r6.readUpToMatchingBracket(r7)
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Replication r1 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Replication
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r6, r0, r7)
            return r1
        L139:
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
            if (r1 != r2) goto L160
            int r7 = r7.read()
            char r7 = (char) r7
            r0.append(r7)
        L160:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Reference r7 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Reference
            java.lang.String r0 = r0.toString()
            r7.<init>(r6, r0)
            return r7
        L16a:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r1 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral
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
        L182:
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral r7 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Integral
            java.lang.String r1 = new java.lang.String
            char r0 = (char) r0
            char[] r2 = new char[r4]
            r2[r3] = r0
            r1.<init>(r2)
            r7.<init>(r6, r1)
            return r7
        L192:
            java.lang.Integer r0 = r6.readNumber(r7)
            int r0 = r0.intValue()
            r7.read()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Call r7 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$Call
            r7.<init>(r6, r0)
            return r7
    }

    private org.apache.commons.compress.harmony.pack200.NewAttributeBands.UnionCase readNextUnionCase(java.io.StringReader r4) throws java.io.IOException {
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
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase r4 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase
            r4.<init>(r3, r0)
            return r4
        L43:
            r4.reset()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase r1 = new org.apache.commons.compress.harmony.pack200.NewAttributeBands$UnionCase
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
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r2 = r5.attributeLayoutElements
            int r2 = r2.size()
            if (r1 >= r2) goto L33
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r2 = r5.attributeLayoutElements
            java.lang.Object r2 = r2.get(r1)
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r2
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable
            if (r3 == 0) goto L30
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable) r2
            java.util.List r3 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable.access$500(r2)
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r4 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement) r4
            r5.resolveCallsForElement(r1, r2, r4)
            goto L20
        L30:
            int r1 = r1 + 1
            goto L2
        L33:
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r1 = r5.attributeLayoutElements
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r2
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable
            if (r3 == 0) goto L39
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable) r2
            boolean r3 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable.access$600(r2)
            if (r3 == 0) goto L39
            r2.setBackwardsCallableIndex(r0)
            int r0 = r0 + 1
            goto L39
        L57:
            int[] r0 = new int[r0]
            r5.backwardsCallCounts = r0
            return
    }

    private void resolveCallsForElement(int r3, org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable r4, org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement r5) {
            r2 = this;
            boolean r0 = r5 instanceof org.apache.commons.compress.harmony.pack200.NewAttributeBands.Call
            if (r0 == 0) goto L50
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Call r5 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.Call) r5
            int r0 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.Call.access$700(r5)
            if (r0 != 0) goto L10
            r5.setCallable(r4)
            goto L6e
        L10:
            if (r0 <= 0) goto L33
        L12:
            int r3 = r3 + 1
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r4 = r2.attributeLayoutElements
            int r4 = r4.size()
            if (r3 >= r4) goto L6e
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r4 = r2.attributeLayoutElements
            java.lang.Object r4 = r4.get(r3)
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r4 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r4
            boolean r1 = r4 instanceof org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable
            if (r1 == 0) goto L32
            int r0 = r0 + (-1)
            if (r0 != 0) goto L32
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable r4 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable) r4
            r5.setCallable(r4)
            goto L6e
        L32:
            goto L12
        L33:
            int r3 = r3 + (-1)
        L35:
            if (r3 < 0) goto L6e
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r4 = r2.attributeLayoutElements
            java.lang.Object r4 = r4.get(r3)
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r4 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r4
            boolean r1 = r4 instanceof org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable
            if (r1 == 0) goto L4d
            int r0 = r0 + 1
            if (r0 != 0) goto L4d
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Callable r4 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.Callable) r4
            r5.setCallable(r4)
            goto L6e
        L4d:
            int r3 = r3 + (-1)
            goto L35
        L50:
            boolean r0 = r5 instanceof org.apache.commons.compress.harmony.pack200.NewAttributeBands.Replication
            if (r0 == 0) goto L6e
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$Replication r5 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.Replication) r5
            java.util.List r5 = org.apache.commons.compress.harmony.pack200.NewAttributeBands.Replication.access$800(r5)
            java.util.Iterator r5 = r5.iterator()
        L5e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$LayoutElement r0 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.LayoutElement) r0
            r2.resolveCallsForElement(r3, r4, r0)
            goto L5e
        L6e:
            return
    }

    public void addAttribute(org.apache.commons.compress.harmony.pack200.NewAttribute r4) {
            r3 = this;
            r0 = 1
            r3.usedAtLeastOnce = r0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r4.getBytes()
            r0.<init>(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r1 = r3.attributeLayoutElements
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r2 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r2
            r2.addAttributeToBand(r4, r0)
            goto L12
        L22:
            return
    }

    public java.lang.String getAttributeName() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r0 = r1.def
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r0.name
            java.lang.String r0 = r0.getUnderlyingString()
            return r0
    }

    public int getFlagIndex() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r0 = r1.def
            int r0 = r0.index
            return r0
    }

    public boolean isUsedAtLeastOnce() {
            r1 = this;
            boolean r0 = r1.usedAtLeastOnce
            return r0
    }

    public int[] numBackwardsCalls() {
            r1 = this;
            int[] r0 = r1.backwardsCallCounts
            return r0
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r0 = r2.attributeLayoutElements
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r1
            r1.pack(r3)
            goto L6
        L16:
            return
    }

    public void renumberBci(org.apache.commons.compress.harmony.pack200.IntList r3, java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r4) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement> r0 = r2.attributeLayoutElements
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.NewAttributeBands$AttributeLayoutElement r1 = (org.apache.commons.compress.harmony.pack200.NewAttributeBands.AttributeLayoutElement) r1
            r1.renumberBci(r3, r4)
            goto L6
        L16:
            return
    }
}
