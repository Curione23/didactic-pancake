package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class Segment extends org.objectweb.asm.ClassVisitor {
    public static int ASM_API = 262144;
    private org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands attributeDefinitionBands;
    private org.apache.commons.compress.harmony.pack200.BcBands bcBands;
    private org.apache.commons.compress.harmony.pack200.ClassBands classBands;
    private org.apache.commons.compress.harmony.pack200.CpBands cpBands;
    private org.apache.commons.compress.harmony.pack200.Pack200ClassReader currentClassReader;
    private final org.apache.commons.compress.harmony.pack200.Segment.SegmentFieldVisitor fieldVisitor;
    private org.apache.commons.compress.harmony.pack200.FileBands fileBands;
    private org.apache.commons.compress.harmony.pack200.IcBands icBands;
    private final org.apache.commons.compress.harmony.pack200.Segment.SegmentMethodVisitor methodVisitor;
    private org.objectweb.asm.Attribute[] nonStandardAttributePrototypes;
    private org.apache.commons.compress.harmony.pack200.PackingOptions options;
    private org.apache.commons.compress.harmony.pack200.SegmentHeader segmentHeader;
    private boolean stripDebug;

    public class ArrayVisitor extends org.objectweb.asm.AnnotationVisitor {
        private final java.util.List<java.lang.Integer> caseArrayN;
        private final int indexInCaseArrayN;
        private final java.util.List<java.lang.String> nameRU;
        private final java.util.List<java.lang.String> tags;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.Segment this$0;
        private final java.util.List<java.lang.Object> values;

        public ArrayVisitor(org.apache.commons.compress.harmony.pack200.Segment r1, java.util.List<java.lang.Integer> r2, java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4, java.util.List<java.lang.Object> r5) {
                r0 = this;
                r0.this$0 = r1
                int r1 = org.apache.commons.compress.harmony.pack200.Segment.ASM_API
                r0.<init>(r1)
                r0.caseArrayN = r2
                r0.tags = r3
                r0.nameRU = r4
                r0.values = r5
                int r1 = r2.size()
                int r1 = r1 + (-1)
                r0.indexInCaseArrayN = r1
                return
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public void visit(java.lang.String r3, java.lang.Object r4) {
                r2 = this;
                java.util.List<java.lang.Integer> r3 = r2.caseArrayN
                int r0 = r2.indexInCaseArrayN
                java.lang.Object r3 = r3.remove(r0)
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.util.List<java.lang.Integer> r0 = r2.caseArrayN
                int r1 = r2.indexInCaseArrayN
                int r3 = r3.intValue()
                int r3 = r3 + 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r1, r3)
                org.apache.commons.compress.harmony.pack200.Segment r3 = r2.this$0
                java.util.List<java.lang.String> r0 = r2.tags
                java.util.List<java.lang.Object> r1 = r2.values
                org.apache.commons.compress.harmony.pack200.Segment.access$000(r3, r4, r0, r1)
                return
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "Not yet supported"
                r1.<init>(r2)
                throw r1
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String r8) {
                r7 = this;
                java.util.List<java.lang.String> r0 = r7.tags
                java.lang.String r1 = "["
                r0.add(r1)
                if (r8 != 0) goto Lb
                java.lang.String r8 = ""
            Lb:
                java.util.List<java.lang.String> r0 = r7.nameRU
                r0.add(r8)
                java.util.List<java.lang.Integer> r8 = r7.caseArrayN
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r8.add(r0)
                org.apache.commons.compress.harmony.pack200.Segment$ArrayVisitor r8 = new org.apache.commons.compress.harmony.pack200.Segment$ArrayVisitor
                org.apache.commons.compress.harmony.pack200.Segment r2 = r7.this$0
                java.util.List<java.lang.Integer> r3 = r7.caseArrayN
                java.util.List<java.lang.String> r4 = r7.tags
                java.util.List<java.lang.String> r5 = r7.nameRU
                java.util.List<java.lang.Object> r6 = r7.values
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r8
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public void visitEnd() {
                r0 = this;
                return
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public void visitEnum(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                java.util.List<java.lang.Integer> r2 = r1.caseArrayN
                int r0 = r2.size()
                int r0 = r0 + (-1)
                java.lang.Object r2 = r2.remove(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.util.List<java.lang.Integer> r0 = r1.caseArrayN
                int r2 = r2.intValue()
                int r2 = r2 + 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.add(r2)
                java.util.List<java.lang.String> r2 = r1.tags
                java.lang.String r0 = "e"
                r2.add(r0)
                java.util.List<java.lang.Object> r2 = r1.values
                r2.add(r3)
                java.util.List<java.lang.Object> r2 = r1.values
                r2.add(r4)
                return
        }
    }

    public static class PassException extends java.lang.RuntimeException {
        private static final long serialVersionUID = 1;

        public PassException() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public class SegmentAnnotationVisitor extends org.objectweb.asm.AnnotationVisitor {
        private final java.util.List<java.lang.Integer> caseArrayN;
        private int context;
        private java.lang.String desc;
        private final java.util.List<java.lang.String> nameRU;
        private final java.util.List<java.lang.String> nestNameRU;
        private final java.util.List<java.lang.Integer> nestPairN;
        private final java.util.List<java.lang.String> nestTypeRS;
        private int parameter;
        private final java.util.List<java.lang.String> tags;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.Segment this$0;
        private final java.util.List<java.lang.Object> values;
        private boolean visible;


        public SegmentAnnotationVisitor(org.apache.commons.compress.harmony.pack200.Segment r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                int r1 = org.apache.commons.compress.harmony.pack200.Segment.ASM_API
                r0.<init>(r1)
                r1 = -1
                r0.context = r1
                r0.parameter = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nameRU = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.tags = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.values = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.caseArrayN = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestTypeRS = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestNameRU = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestPairN = r1
                r0.context = r2
                return
        }

        public SegmentAnnotationVisitor(org.apache.commons.compress.harmony.pack200.Segment r1, int r2, int r3, java.lang.String r4, boolean r5) {
                r0 = this;
                r0.this$0 = r1
                int r1 = org.apache.commons.compress.harmony.pack200.Segment.ASM_API
                r0.<init>(r1)
                r1 = -1
                r0.context = r1
                r0.parameter = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nameRU = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.tags = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.values = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.caseArrayN = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestTypeRS = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestNameRU = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestPairN = r1
                r0.context = r2
                r0.parameter = r3
                r0.desc = r4
                r0.visible = r5
                return
        }

        public SegmentAnnotationVisitor(org.apache.commons.compress.harmony.pack200.Segment r1, int r2, java.lang.String r3, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                int r1 = org.apache.commons.compress.harmony.pack200.Segment.ASM_API
                r0.<init>(r1)
                r1 = -1
                r0.context = r1
                r0.parameter = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nameRU = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.tags = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.values = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.caseArrayN = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestTypeRS = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestNameRU = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.nestPairN = r1
                r0.context = r2
                r0.desc = r3
                r0.visible = r4
                return
        }

        static /* synthetic */ java.util.List access$100(org.apache.commons.compress.harmony.pack200.Segment.SegmentAnnotationVisitor r0) {
                java.util.List<java.lang.Integer> r0 = r0.nestPairN
                return r0
        }

        static /* synthetic */ java.util.List access$200(org.apache.commons.compress.harmony.pack200.Segment.SegmentAnnotationVisitor r0) {
                java.util.List<java.lang.String> r0 = r0.nestNameRU
                return r0
        }

        static /* synthetic */ java.util.List access$300(org.apache.commons.compress.harmony.pack200.Segment.SegmentAnnotationVisitor r0) {
                java.util.List<java.lang.String> r0 = r0.tags
                return r0
        }

        static /* synthetic */ java.util.List access$400(org.apache.commons.compress.harmony.pack200.Segment.SegmentAnnotationVisitor r0) {
                java.util.List<java.lang.Object> r0 = r0.values
                return r0
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public void visit(java.lang.String r3, java.lang.Object r4) {
                r2 = this;
                if (r3 != 0) goto L4
                java.lang.String r3 = ""
            L4:
                java.util.List<java.lang.String> r0 = r2.nameRU
                r0.add(r3)
                org.apache.commons.compress.harmony.pack200.Segment r3 = r2.this$0
                java.util.List<java.lang.String> r0 = r2.tags
                java.util.List<java.lang.Object> r1 = r2.values
                org.apache.commons.compress.harmony.pack200.Segment.access$000(r3, r4, r0, r1)
                return
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.tags
                java.lang.String r1 = "@"
                r0.add(r1)
                if (r3 != 0) goto Lb
                java.lang.String r3 = ""
            Lb:
                java.util.List<java.lang.String> r0 = r2.nameRU
                r0.add(r3)
                java.util.List<java.lang.String> r3 = r2.nestTypeRS
                r3.add(r4)
                java.util.List<java.lang.Integer> r3 = r2.nestPairN
                r4 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3.add(r4)
                org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor$1 r3 = new org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor$1
                int r4 = r2.context
                org.objectweb.asm.AnnotationVisitor r0 = r2.av
                r3.<init>(r2, r4, r0)
                return r3
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public org.objectweb.asm.AnnotationVisitor visitArray(java.lang.String r8) {
                r7 = this;
                java.util.List<java.lang.String> r0 = r7.tags
                java.lang.String r1 = "["
                r0.add(r1)
                if (r8 != 0) goto Lb
                java.lang.String r8 = ""
            Lb:
                java.util.List<java.lang.String> r0 = r7.nameRU
                r0.add(r8)
                java.util.List<java.lang.Integer> r8 = r7.caseArrayN
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r8.add(r0)
                org.apache.commons.compress.harmony.pack200.Segment$ArrayVisitor r8 = new org.apache.commons.compress.harmony.pack200.Segment$ArrayVisitor
                org.apache.commons.compress.harmony.pack200.Segment r2 = r7.this$0
                java.util.List<java.lang.Integer> r3 = r7.caseArrayN
                java.util.List<java.lang.String> r4 = r7.tags
                java.util.List<java.lang.String> r5 = r7.nameRU
                java.util.List<java.lang.Object> r6 = r7.values
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r8
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public void visitEnd() {
                r12 = this;
                java.lang.String r0 = r12.desc
                if (r0 != 0) goto L1c
                org.apache.commons.compress.harmony.pack200.Segment r0 = r12.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r1 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                java.util.List<java.lang.String> r2 = r12.nameRU
                java.util.List<java.lang.String> r3 = r12.tags
                java.util.List<java.lang.Object> r4 = r12.values
                java.util.List<java.lang.Integer> r5 = r12.caseArrayN
                java.util.List<java.lang.String> r6 = r12.nestTypeRS
                java.util.List<java.lang.String> r7 = r12.nestNameRU
                java.util.List<java.lang.Integer> r8 = r12.nestPairN
                r1.addAnnotationDefault(r2, r3, r4, r5, r6, r7, r8)
                goto L5c
            L1c:
                int r0 = r12.parameter
                r1 = -1
                if (r0 == r1) goto L3f
                org.apache.commons.compress.harmony.pack200.Segment r0 = r12.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r1 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                int r2 = r12.parameter
                java.lang.String r3 = r12.desc
                boolean r4 = r12.visible
                java.util.List<java.lang.String> r5 = r12.nameRU
                java.util.List<java.lang.String> r6 = r12.tags
                java.util.List<java.lang.Object> r7 = r12.values
                java.util.List<java.lang.Integer> r8 = r12.caseArrayN
                java.util.List<java.lang.String> r9 = r12.nestTypeRS
                java.util.List<java.lang.String> r10 = r12.nestNameRU
                java.util.List<java.lang.Integer> r11 = r12.nestPairN
                r1.addParameterAnnotation(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                goto L5c
            L3f:
                org.apache.commons.compress.harmony.pack200.Segment r0 = r12.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r1 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                int r2 = r12.context
                java.lang.String r3 = r12.desc
                boolean r4 = r12.visible
                java.util.List<java.lang.String> r5 = r12.nameRU
                java.util.List<java.lang.String> r6 = r12.tags
                java.util.List<java.lang.Object> r7 = r12.values
                java.util.List<java.lang.Integer> r8 = r12.caseArrayN
                java.util.List<java.lang.String> r9 = r12.nestTypeRS
                java.util.List<java.lang.String> r10 = r12.nestNameRU
                java.util.List<java.lang.Integer> r11 = r12.nestPairN
                r1.addAnnotation(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L5c:
                return
        }

        @Override // org.objectweb.asm.AnnotationVisitor
        public void visitEnum(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.tags
                java.lang.String r1 = "e"
                r0.add(r1)
                if (r3 != 0) goto Lb
                java.lang.String r3 = ""
            Lb:
                java.util.List<java.lang.String> r0 = r2.nameRU
                r0.add(r3)
                java.util.List<java.lang.Object> r3 = r2.values
                r3.add(r4)
                java.util.List<java.lang.Object> r3 = r2.values
                r3.add(r5)
                return
        }
    }

    public class SegmentFieldVisitor extends org.objectweb.asm.FieldVisitor {
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.Segment this$0;

        public SegmentFieldVisitor(org.apache.commons.compress.harmony.pack200.Segment r1) {
                r0 = this;
                r0.this$0 = r1
                int r1 = org.apache.commons.compress.harmony.pack200.Segment.ASM_API
                r0.<init>(r1)
                return
        }

        @Override // org.objectweb.asm.FieldVisitor
        public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r4, boolean r5) {
                r3 = this;
                org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor r0 = new org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor
                org.apache.commons.compress.harmony.pack200.Segment r1 = r3.this$0
                r2 = 1
                r0.<init>(r1, r2, r4, r5)
                return r0
        }

        @Override // org.objectweb.asm.FieldVisitor
        public void visitAttribute(org.objectweb.asm.Attribute r6) {
                r5 = this;
                boolean r0 = r6.isUnknown()
                java.lang.String r1 = "Unknown attribute encountered"
                java.lang.String r2 = "error"
                java.lang.String r3 = "pass"
                if (r0 == 0) goto L2f
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.PackingOptions r6 = org.apache.commons.compress.harmony.pack200.Segment.access$600(r6)
                java.lang.String r6 = r6.getUnknownAttributeAction()
                boolean r0 = r6.equals(r3)
                if (r0 == 0) goto L22
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.Segment.access$700(r6)
                goto L6a
            L22:
                boolean r6 = r6.equals(r2)
                if (r6 != 0) goto L29
                goto L6a
            L29:
                java.lang.Error r6 = new java.lang.Error
                r6.<init>(r1)
                throw r6
            L2f:
                boolean r0 = r6 instanceof org.apache.commons.compress.harmony.pack200.NewAttribute
                if (r0 == 0) goto L6b
                org.apache.commons.compress.harmony.pack200.NewAttribute r6 = (org.apache.commons.compress.harmony.pack200.NewAttribute) r6
                r0 = 1
                boolean r0 = r6.isUnknown(r0)
                if (r0 == 0) goto L61
                org.apache.commons.compress.harmony.pack200.Segment r0 = r5.this$0
                org.apache.commons.compress.harmony.pack200.PackingOptions r0 = org.apache.commons.compress.harmony.pack200.Segment.access$600(r0)
                java.lang.String r4 = r6.type
                java.lang.String r0 = r0.getUnknownFieldAttributeAction(r4)
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L54
                org.apache.commons.compress.harmony.pack200.Segment r0 = r5.this$0
                org.apache.commons.compress.harmony.pack200.Segment.access$700(r0)
                goto L61
            L54:
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L5b
                goto L61
            L5b:
                java.lang.Error r6 = new java.lang.Error
                r6.<init>(r1)
                throw r6
            L61:
                org.apache.commons.compress.harmony.pack200.Segment r0 = r5.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                r0.addFieldAttribute(r6)
            L6a:
                return
            L6b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unexpected attribute encountered: "
                r1.<init>(r2)
                java.lang.String r6 = r6.type
                java.lang.StringBuilder r6 = r1.append(r6)
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }

        @Override // org.objectweb.asm.FieldVisitor
        public void visitEnd() {
                r0 = this;
                return
        }
    }

    public class SegmentMethodVisitor extends org.objectweb.asm.MethodVisitor {
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.Segment this$0;

        public SegmentMethodVisitor(org.apache.commons.compress.harmony.pack200.Segment r1) {
                r0 = this;
                r0.this$0 = r1
                int r1 = org.apache.commons.compress.harmony.pack200.Segment.ASM_API
                r0.<init>(r1)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r4, boolean r5) {
                r3 = this;
                org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor r0 = new org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor
                org.apache.commons.compress.harmony.pack200.Segment r1 = r3.this$0
                r2 = 2
                r0.<init>(r1, r2, r4, r5)
                return r0
        }

        @Override // org.objectweb.asm.MethodVisitor
        public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
                r3 = this;
                org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor r0 = new org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor
                org.apache.commons.compress.harmony.pack200.Segment r1 = r3.this$0
                r2 = 2
                r0.<init>(r1, r2)
                return r0
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitAttribute(org.objectweb.asm.Attribute r6) {
                r5 = this;
                boolean r0 = r6.isUnknown()
                java.lang.String r1 = "Unknown attribute encountered"
                java.lang.String r2 = "error"
                java.lang.String r3 = "pass"
                if (r0 == 0) goto L31
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.PackingOptions r6 = org.apache.commons.compress.harmony.pack200.Segment.access$600(r6)
                java.lang.String r6 = r6.getUnknownAttributeAction()
                boolean r0 = r6.equals(r3)
                if (r0 == 0) goto L23
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.Segment.access$700(r6)
                goto La9
            L23:
                boolean r6 = r6.equals(r2)
                if (r6 != 0) goto L2b
                goto La9
            L2b:
                java.lang.Error r6 = new java.lang.Error
                r6.<init>(r1)
                throw r6
            L31:
                boolean r0 = r6 instanceof org.apache.commons.compress.harmony.pack200.NewAttribute
                if (r0 == 0) goto Laa
                r0 = r6
                org.apache.commons.compress.harmony.pack200.NewAttribute r0 = (org.apache.commons.compress.harmony.pack200.NewAttribute) r0
                boolean r6 = r6.isCodeAttribute()
                if (r6 == 0) goto L74
                r6 = 3
                boolean r6 = r0.isUnknown(r6)
                if (r6 == 0) goto L6a
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.PackingOptions r6 = org.apache.commons.compress.harmony.pack200.Segment.access$600(r6)
                java.lang.String r4 = r0.type
                java.lang.String r6 = r6.getUnknownCodeAttributeAction(r4)
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L5d
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.Segment.access$700(r6)
                goto L6a
            L5d:
                boolean r6 = r6.equals(r2)
                if (r6 != 0) goto L64
                goto L6a
            L64:
                java.lang.Error r6 = new java.lang.Error
                r6.<init>(r1)
                throw r6
            L6a:
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r6 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r6)
                r6.addCodeAttribute(r0)
                goto La9
            L74:
                r6 = 2
                boolean r6 = r0.isUnknown(r6)
                if (r6 == 0) goto La0
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.PackingOptions r6 = org.apache.commons.compress.harmony.pack200.Segment.access$600(r6)
                java.lang.String r4 = r0.type
                java.lang.String r6 = r6.getUnknownMethodAttributeAction(r4)
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L93
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.Segment.access$700(r6)
                goto La0
            L93:
                boolean r6 = r6.equals(r2)
                if (r6 != 0) goto L9a
                goto La0
            L9a:
                java.lang.Error r6 = new java.lang.Error
                r6.<init>(r1)
                throw r6
            La0:
                org.apache.commons.compress.harmony.pack200.Segment r6 = r5.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r6 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r6)
                r6.addMethodAttribute(r0)
            La9:
                return
            Laa:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unexpected attribute encountered: "
                r1.<init>(r2)
                java.lang.String r6 = r6.type
                java.lang.StringBuilder r6 = r1.append(r6)
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitCode() {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                r0.addCode()
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitEnd() {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                r0.endOfMethod()
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitEnd()
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitFieldInsn(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitFieldInsn(r2, r3, r4, r5)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitFrame(int r1, int r2, java.lang.Object[] r3, int r4, java.lang.Object[] r5) {
                r0 = this;
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitIincInsn(int r2, int r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitIincInsn(r2, r3)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitInsn(int r2) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitInsn(r2)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitIntInsn(int r2, int r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitIntInsn(r2, r3)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitJumpInsn(int r2, org.objectweb.asm.Label r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitJumpInsn(r2, r3)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitLabel(org.objectweb.asm.Label r2) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitLabel(r2)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitLdcInsn(java.lang.Object r2) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitLdcInsn(r2)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitLineNumber(int r2, org.objectweb.asm.Label r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                boolean r0 = org.apache.commons.compress.harmony.pack200.Segment.access$900(r0)
                if (r0 != 0) goto L11
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                r0.addLineNumber(r2, r3)
            L11:
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitLocalVariable(java.lang.String r9, java.lang.String r10, java.lang.String r11, org.objectweb.asm.Label r12, org.objectweb.asm.Label r13, int r14) {
                r8 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r8.this$0
                boolean r0 = org.apache.commons.compress.harmony.pack200.Segment.access$900(r0)
                if (r0 != 0) goto L17
                org.apache.commons.compress.harmony.pack200.Segment r0 = r8.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r1 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r1.addLocalVariable(r2, r3, r4, r5, r6, r7)
            L17:
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitLookupSwitchInsn(org.objectweb.asm.Label r2, int[] r3, org.objectweb.asm.Label[] r4) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitLookupSwitchInsn(r2, r3, r4)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitMaxs(int r2, int r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                r0.addMaxStack(r2, r3)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitMethodInsn(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitMethodInsn(r2, r3, r4, r5)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitMultiANewArrayInsn(java.lang.String r2, int r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitMultiANewArrayInsn(r2, r3)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int r8, java.lang.String r9, boolean r10) {
                r7 = this;
                org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor r6 = new org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor
                org.apache.commons.compress.harmony.pack200.Segment r1 = r7.this$0
                r2 = 2
                r0 = r6
                r3 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitTableSwitchInsn(int r2, int r3, org.objectweb.asm.Label r4, org.objectweb.asm.Label... r5) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitTableSwitchInsn(r2, r3, r4, r5)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitTryCatchBlock(org.objectweb.asm.Label r2, org.objectweb.asm.Label r3, org.objectweb.asm.Label r4, java.lang.String r5) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.ClassBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$500(r0)
                r0.addHandler(r2, r3, r4, r5)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitTypeInsn(int r2, java.lang.String r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitTypeInsn(r2, r3)
                return
        }

        @Override // org.objectweb.asm.MethodVisitor
        public void visitVarInsn(int r2, int r3) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.Segment r0 = r1.this$0
                org.apache.commons.compress.harmony.pack200.BcBands r0 = org.apache.commons.compress.harmony.pack200.Segment.access$800(r0)
                r0.visitVarInsn(r2, r3)
                return
        }
    }

    static {
            return
    }

    public Segment() {
            r1 = this;
            int r0 = org.apache.commons.compress.harmony.pack200.Segment.ASM_API
            r1.<init>(r0)
            org.apache.commons.compress.harmony.pack200.Segment$SegmentFieldVisitor r0 = new org.apache.commons.compress.harmony.pack200.Segment$SegmentFieldVisitor
            r0.<init>(r1)
            r1.fieldVisitor = r0
            org.apache.commons.compress.harmony.pack200.Segment$SegmentMethodVisitor r0 = new org.apache.commons.compress.harmony.pack200.Segment$SegmentMethodVisitor
            r0.<init>(r1)
            r1.methodVisitor = r0
            return
    }

    static /* synthetic */ void access$000(org.apache.commons.compress.harmony.pack200.Segment r0, java.lang.Object r1, java.util.List r2, java.util.List r3) {
            r0.addValueAndTag(r1, r2, r3)
            return
    }

    static /* synthetic */ org.apache.commons.compress.harmony.pack200.ClassBands access$500(org.apache.commons.compress.harmony.pack200.Segment r0) {
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r0.classBands
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.harmony.pack200.PackingOptions access$600(org.apache.commons.compress.harmony.pack200.Segment r0) {
            org.apache.commons.compress.harmony.pack200.PackingOptions r0 = r0.options
            return r0
    }

    static /* synthetic */ void access$700(org.apache.commons.compress.harmony.pack200.Segment r0) {
            r0.passCurrentClass()
            return
    }

    static /* synthetic */ org.apache.commons.compress.harmony.pack200.BcBands access$800(org.apache.commons.compress.harmony.pack200.Segment r0) {
            org.apache.commons.compress.harmony.pack200.BcBands r0 = r0.bcBands
            return r0
    }

    static /* synthetic */ boolean access$900(org.apache.commons.compress.harmony.pack200.Segment r0) {
            boolean r0 = r0.stripDebug
            return r0
    }

    private void addValueAndTag(java.lang.Object r2, java.util.List<java.lang.String> r3, java.util.List<java.lang.Object> r4) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto Le
            java.lang.String r0 = "I"
            r3.add(r0)
            r4.add(r2)
            goto Lb3
        Le:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L1c
            java.lang.String r0 = "D"
            r3.add(r0)
            r4.add(r2)
            goto Lb3
        L1c:
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L2a
            java.lang.String r0 = "F"
            r3.add(r0)
            r4.add(r2)
            goto Lb3
        L2a:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L38
            java.lang.String r0 = "J"
            r3.add(r0)
            r4.add(r2)
            goto Lb3
        L38:
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 == 0) goto L4f
            java.lang.String r0 = "B"
            r3.add(r0)
            java.lang.Byte r2 = (java.lang.Byte) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.add(r2)
            goto Lb3
        L4f:
            boolean r0 = r2 instanceof java.lang.Character
            if (r0 == 0) goto L66
            java.lang.String r0 = "C"
            r3.add(r0)
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.add(r2)
            goto Lb3
        L66:
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 == 0) goto L7d
            java.lang.String r0 = "S"
            r3.add(r0)
            java.lang.Short r2 = (java.lang.Short) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.add(r2)
            goto Lb3
        L7d:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L94
            java.lang.String r0 = "Z"
            r3.add(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.add(r2)
            goto Lb3
        L94:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto La1
            java.lang.String r0 = "s"
            r3.add(r0)
            r4.add(r2)
            goto Lb3
        La1:
            boolean r0 = r2 instanceof org.objectweb.asm.Type
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "c"
            r3.add(r0)
            org.objectweb.asm.Type r2 = (org.objectweb.asm.Type) r2
            java.lang.String r2 = r2.toString()
            r4.add(r2)
        Lb3:
            return
    }

    private void passCurrentClass() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Segment$PassException r0 = new org.apache.commons.compress.harmony.pack200.Segment$PassException
            r0.<init>()
            throw r0
    }

    private void processClasses(org.apache.commons.compress.harmony.pack200.Archive.SegmentUnit r7, org.objectweb.asm.Attribute[] r8) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r6.segmentHeader
            int r1 = r7.classListSize()
            r0.setClass_count(r1)
            java.util.List r0 = r7.getClassList()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.Pack200ClassReader r1 = (org.apache.commons.compress.harmony.pack200.Pack200ClassReader) r1
            r6.currentClassReader = r1
            boolean r2 = r6.stripDebug
            if (r2 == 0) goto L25
            r2 = 2
            goto L26
        L25:
            r2 = 0
        L26:
            r1.accept(r6, r8, r2)     // Catch: org.apache.commons.compress.harmony.pack200.Segment.PassException -> L2a
            goto L11
        L2a:
            org.apache.commons.compress.harmony.pack200.ClassBands r2 = r6.classBands
            r2.removeCurrentClass()
            java.lang.String r2 = r1.getFileName()
            org.apache.commons.compress.harmony.pack200.PackingOptions r3 = r6.options
            r3.addPassFile(r2)
            org.apache.commons.compress.harmony.pack200.CpBands r3 = r6.cpBands
            r3.addCPUtf8(r2)
            java.util.List r3 = r7.getFileList()
            java.util.Iterator r3 = r3.iterator()
        L45:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r3.next()
            org.apache.commons.compress.harmony.pack200.Archive$PackingFile r4 = (org.apache.commons.compress.harmony.pack200.Archive.PackingFile) r4
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L45
            byte[] r1 = r1.b
            r4.setContents(r1)
            goto L11
        L61:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r7 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Error passing file "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L76:
            return
    }

    public org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands getAttrBands() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r0 = r1.attributeDefinitionBands
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.ClassBands getClassBands() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r1.classBands
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.CpBands getCpBands() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r1.cpBands
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.Pack200ClassReader getCurrentClassReader() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Pack200ClassReader r0 = r1.currentClassReader
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.IcBands getIcBands() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.IcBands r0 = r1.icBands
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.SegmentHeader getSegmentHeader() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r1.segmentHeader
            return r0
    }

    public boolean lastConstantHadWideIndex() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.Pack200ClassReader r0 = r1.currentClassReader
            boolean r0 = r0.lastConstantHadWideIndex()
            return r0
    }

    public void pack(org.apache.commons.compress.harmony.pack200.Archive.SegmentUnit r8, java.io.OutputStream r9, org.apache.commons.compress.harmony.pack200.PackingOptions r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            r7.options = r10
            boolean r0 = r10.isStripDebug()
            r7.stripDebug = r0
            int r6 = r10.getEffort()
            org.objectweb.asm.Attribute[] r0 = r10.getUnknownAttributePrototypes()
            r7.nonStandardAttributePrototypes = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Start to pack a new segment with "
            r0.<init>(r1)
            int r1 = r8.fileListSize()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " files including "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r8.classListSize()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " classes"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "Initialize a header for the segment"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = new org.apache.commons.compress.harmony.pack200.SegmentHeader
            r0.<init>()
            r7.segmentHeader = r0
            int r1 = r8.fileListSize()
            r0.setFile_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r7.segmentHeader
            boolean r1 = r7.stripDebug
            r1 = r1 ^ 1
            r0.setHave_all_code_flags(r1)
            boolean r0 = r10.isKeepDeflateHint()
            if (r0 != 0) goto L6b
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r7.segmentHeader
            java.lang.String r1 = r10.getDeflateHint()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            r0.setDeflate_hint(r1)
        L6b:
            java.lang.String r0 = "Setup constant pool bands for the segment"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.CpBands r0 = new org.apache.commons.compress.harmony.pack200.CpBands
            r0.<init>(r7, r6)
            r7.cpBands = r0
            java.lang.String r0 = "Setup attribute definition bands for the segment"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r0 = new org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands
            org.objectweb.asm.Attribute[] r1 = r7.nonStandardAttributePrototypes
            r0.<init>(r7, r6, r1)
            r7.attributeDefinitionBands = r0
            java.lang.String r0 = "Setup internal class bands for the segment"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IcBands r0 = new org.apache.commons.compress.harmony.pack200.IcBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r1 = r7.segmentHeader
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r7.cpBands
            r0.<init>(r1, r2, r6)
            r7.icBands = r0
            java.lang.String r0 = "Setup class bands for the segment"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = new org.apache.commons.compress.harmony.pack200.ClassBands
            int r1 = r8.classListSize()
            boolean r2 = r7.stripDebug
            r0.<init>(r7, r1, r6, r2)
            r7.classBands = r0
            java.lang.String r0 = "Setup byte code bands for the segment"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.BcBands r0 = new org.apache.commons.compress.harmony.pack200.BcBands
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r7.cpBands
            r0.<init>(r1, r7, r6)
            r7.bcBands = r0
            java.lang.String r0 = "Setup file bands for the segment"
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.FileBands r0 = new org.apache.commons.compress.harmony.pack200.FileBands
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r7.cpBands
            org.apache.commons.compress.harmony.pack200.SegmentHeader r3 = r7.segmentHeader
            r1 = r0
            r4 = r10
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.fileBands = r0
            org.objectweb.asm.Attribute[] r10 = r7.nonStandardAttributePrototypes
            r7.processClasses(r8, r10)
            org.apache.commons.compress.harmony.pack200.CpBands r10 = r7.cpBands
            r10.finaliseBands()
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r10 = r7.attributeDefinitionBands
            r10.finaliseBands()
            org.apache.commons.compress.harmony.pack200.IcBands r10 = r7.icBands
            r10.finaliseBands()
            org.apache.commons.compress.harmony.pack200.ClassBands r10 = r7.classBands
            r10.finaliseBands()
            org.apache.commons.compress.harmony.pack200.BcBands r10 = r7.bcBands
            r10.finaliseBands()
            org.apache.commons.compress.harmony.pack200.FileBands r10 = r7.fileBands
            r10.finaliseBands()
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            java.lang.String r0 = "Packing..."
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r7.classBands
            int r0 = r0.numClassesProcessed()
            org.apache.commons.compress.harmony.pack200.SegmentHeader r1 = r7.segmentHeader
            r1.setClass_count(r0)
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r7.cpBands
            r1.pack(r10)
            if (r0 <= 0) goto L11b
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands r0 = r7.attributeDefinitionBands
            r0.pack(r10)
            org.apache.commons.compress.harmony.pack200.IcBands r0 = r7.icBands
            r0.pack(r10)
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r7.classBands
            r0.pack(r10)
            org.apache.commons.compress.harmony.pack200.BcBands r0 = r7.bcBands
            r0.pack(r10)
        L11b:
            org.apache.commons.compress.harmony.pack200.FileBands r0 = r7.fileBands
            r0.pack(r10)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            org.apache.commons.compress.harmony.pack200.SegmentHeader r1 = r7.segmentHeader
            r1.pack(r0)
            r0.writeTo(r9)
            r10.writeTo(r9)
            int r9 = r0.size()
            r8.addPackedByteAmount(r9)
            int r9 = r10.size()
            r8.addPackedByteAmount(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Wrote total of "
            r9.<init>(r10)
            int r10 = r8.getPackedByteAmount()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " bytes"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Transmitted "
            r9.<init>(r0)
            int r0 = r8.fileListSize()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r0 = " files of "
            java.lang.StringBuilder r9 = r9.append(r0)
            int r0 = r8.getByteAmount()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r0 = " input bytes in a segment of "
            java.lang.StringBuilder r9 = r9.append(r0)
            int r8 = r8.getPackedByteAmount()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r8)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
            r8 = this;
            org.apache.commons.compress.harmony.pack200.BcBands r0 = r8.bcBands
            r0.setCurrentClass(r11, r13)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r8.segmentHeader
            r0.addMajorVersion(r9)
            org.apache.commons.compress.harmony.pack200.ClassBands r1 = r8.classBands
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.addClass(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotation(java.lang.String r3, boolean r4) {
            r2 = this;
            org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor r0 = new org.apache.commons.compress.harmony.pack200.Segment$SegmentAnnotationVisitor
            r1 = 0
            r0.<init>(r2, r1, r3, r4)
            return r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitAttribute(org.objectweb.asm.Attribute r6) {
            r5 = this;
            boolean r0 = r6.isUnknown()
            java.lang.String r1 = "Unknown attribute encountered"
            java.lang.String r2 = "error"
            java.lang.String r3 = "pass"
            if (r0 == 0) goto L29
            org.apache.commons.compress.harmony.pack200.PackingOptions r6 = r5.options
            java.lang.String r6 = r6.getUnknownAttributeAction()
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L1c
            r5.passCurrentClass()
            goto L5a
        L1c:
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L23
            goto L5a
        L23:
            java.lang.Error r6 = new java.lang.Error
            r6.<init>(r1)
            throw r6
        L29:
            boolean r0 = r6 instanceof org.apache.commons.compress.harmony.pack200.NewAttribute
            if (r0 == 0) goto L5b
            org.apache.commons.compress.harmony.pack200.NewAttribute r6 = (org.apache.commons.compress.harmony.pack200.NewAttribute) r6
            r0 = 0
            boolean r0 = r6.isUnknown(r0)
            if (r0 == 0) goto L55
            org.apache.commons.compress.harmony.pack200.PackingOptions r0 = r5.options
            java.lang.String r4 = r6.type
            java.lang.String r0 = r0.getUnknownClassAttributeAction(r4)
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L48
            r5.passCurrentClass()
            goto L55
        L48:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4f
            goto L55
        L4f:
            java.lang.Error r6 = new java.lang.Error
            r6.<init>(r1)
            throw r6
        L55:
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r5.classBands
            r0.addClassAttribute(r6)
        L5a:
            return
        L5b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected attribute encountered: "
            r1.<init>(r2)
            java.lang.String r6 = r6.type
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r1.classBands
            r0.endOfClass()
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11) {
            r6 = this;
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r6.classBands
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.addField(r1, r2, r3, r4, r5)
            org.apache.commons.compress.harmony.pack200.Segment$SegmentFieldVisitor r7 = r6.fieldVisitor
            return r7
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.IcBands r0 = r1.icBands
            r0.addInnerClass(r2, r3, r4, r5)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String[] r11) {
            r6 = this;
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r6.classBands
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.addMethod(r1, r2, r3, r4, r5)
            org.apache.commons.compress.harmony.pack200.Segment$SegmentMethodVisitor r7 = r6.methodVisitor
            return r7
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitOuterClass(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r1.classBands
            r0.addEnclosingMethod(r2, r3, r4)
            return
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitSource(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            boolean r2 = r0.stripDebug
            if (r2 != 0) goto L9
            org.apache.commons.compress.harmony.pack200.ClassBands r2 = r0.classBands
            r2.addSourceFile(r1)
        L9:
            return
    }
}
