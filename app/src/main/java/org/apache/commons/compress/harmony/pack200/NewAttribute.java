package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class NewAttribute extends org.objectweb.asm.Attribute {
    private char[] buf;
    private org.objectweb.asm.ClassReader classReader;
    private int codeOff;
    private byte[] contents;
    private boolean contextClass;
    private boolean contextCode;
    private boolean contextField;
    private boolean contextMethod;
    private org.objectweb.asm.Label[] labels;
    private final java.lang.String layout;

    public static class ErrorAttribute extends org.apache.commons.compress.harmony.pack200.NewAttribute {
        public ErrorAttribute(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = ""
                r1.<init>(r2, r0, r3)
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttribute, org.objectweb.asm.Attribute
        protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r1, int r2, int r3, char[] r4, int r5, org.objectweb.asm.Label[] r6) {
                r0 = this;
                java.lang.Error r1 = new java.lang.Error
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Attribute "
                r2.<init>(r3)
                java.lang.String r3 = r0.type
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " was found"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }
    }

    public static class PassAttribute extends org.apache.commons.compress.harmony.pack200.NewAttribute {
        public PassAttribute(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = ""
                r1.<init>(r2, r0, r3)
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttribute, org.objectweb.asm.Attribute
        protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r1, int r2, int r3, char[] r4, int r5, org.objectweb.asm.Label[] r6) {
                r0 = this;
                org.apache.commons.compress.harmony.pack200.Segment$PassException r1 = new org.apache.commons.compress.harmony.pack200.Segment$PassException
                r1.<init>()
                throw r1
        }
    }

    public static class StripAttribute extends org.apache.commons.compress.harmony.pack200.NewAttribute {
        public StripAttribute(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = ""
                r1.<init>(r2, r0, r3)
                return
        }

        @Override // org.apache.commons.compress.harmony.pack200.NewAttribute, org.objectweb.asm.Attribute
        protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r1, int r2, int r3, char[] r4, int r5, org.objectweb.asm.Label[] r6) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public NewAttribute(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.layout = r2
            r0.addContext(r3)
            return
    }

    public NewAttribute(org.objectweb.asm.ClassReader r1, java.lang.String r2, java.lang.String r3, byte[] r4, char[] r5, int r6, org.objectweb.asm.Label[] r7) {
            r0 = this;
            r0.<init>(r2)
            r0.classReader = r1
            r0.contents = r4
            r0.layout = r3
            r0.codeOff = r6
            r0.labels = r7
            r0.buf = r5
            return
    }

    public void addContext(int r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L15
            if (r3 == r0) goto L12
            r1 = 2
            if (r3 == r1) goto Lf
            r1 = 3
            if (r3 == r1) goto Lc
            goto L17
        Lc:
            r2.contextCode = r0
            goto L17
        Lf:
            r2.contextMethod = r0
            goto L17
        L12:
            r2.contextField = r0
            goto L17
        L15:
            r2.contextClass = r0
        L17:
            return
    }

    public byte[] getBytes() {
            r1 = this;
            byte[] r0 = r1.contents
            return r0
    }

    public org.objectweb.asm.Label getLabel(int r2) {
            r1 = this;
            org.objectweb.asm.Label[] r0 = r1.labels
            r2 = r0[r2]
            return r2
    }

    public java.lang.String getLayout() {
            r1 = this;
            java.lang.String r0 = r1.layout
            return r0
    }

    @Override // org.objectweb.asm.Attribute
    public boolean isCodeAttribute() {
            r2 = this;
            int r0 = r2.codeOff
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean isContextClass() {
            r1 = this;
            boolean r0 = r1.contextClass
            return r0
    }

    public boolean isContextCode() {
            r1 = this;
            boolean r0 = r1.contextCode
            return r0
    }

    public boolean isContextField() {
            r1 = this;
            boolean r0 = r1.contextField
            return r0
    }

    public boolean isContextMethod() {
            r1 = this;
            boolean r0 = r1.contextMethod
            return r0
    }

    @Override // org.objectweb.asm.Attribute
    public boolean isUnknown() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isUnknown(int r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L19
            if (r3 == r0) goto L15
            r1 = 2
            if (r3 == r1) goto L11
            r1 = 3
            if (r3 == r1) goto Ld
            r3 = 0
            return r3
        Ld:
            boolean r3 = r2.contextCode
            r3 = r3 ^ r0
            return r3
        L11:
            boolean r3 = r2.contextMethod
            r3 = r3 ^ r0
            return r3
        L15:
            boolean r3 = r2.contextField
            r3 = r3 ^ r0
            return r3
        L19:
            boolean r3 = r2.contextClass
            r3 = r3 ^ r0
            return r3
    }

    @Override // org.objectweb.asm.Attribute
    protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader r9, int r10, int r11, char[] r12, int r13, org.objectweb.asm.Label[] r14) {
            r8 = this;
            byte[] r4 = new byte[r11]
            byte[] r0 = r9.b
            r1 = 0
            java.lang.System.arraycopy(r0, r10, r4, r1, r11)
            org.apache.commons.compress.harmony.pack200.NewAttribute r10 = new org.apache.commons.compress.harmony.pack200.NewAttribute
            java.lang.String r2 = r8.type
            java.lang.String r3 = r8.layout
            r0 = r10
            r1 = r9
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
    }

    public java.lang.String readClass(int r3) {
            r2 = this;
            org.objectweb.asm.ClassReader r0 = r2.classReader
            char[] r1 = r2.buf
            java.lang.String r3 = r0.readClass(r3, r1)
            return r3
    }

    public java.lang.Object readConst(int r3) {
            r2 = this;
            org.objectweb.asm.ClassReader r0 = r2.classReader
            char[] r1 = r2.buf
            java.lang.Object r3 = r0.readConst(r3, r1)
            return r3
    }

    public java.lang.String readUTF8(int r3) {
            r2 = this;
            org.objectweb.asm.ClassReader r0 = r2.classReader
            char[] r1 = r2.buf
            java.lang.String r3 = r0.readUTF8(r3, r1)
            return r3
    }
}
