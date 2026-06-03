package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class MultilineRecursiveToStringStyle extends org.apache.commons.lang3.builder.RecursiveToStringStyle {
    private static final int INDENT = 2;
    private static final long serialVersionUID = 1;
    private int spaces;

    public MultilineRecursiveToStringStyle() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.spaces = r0
            r1.resetIndent()
            return
    }

    private void resetIndent() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.lang.String r1 = java.lang.System.lineSeparator()
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.spaces
            java.lang.String r1 = r3.spacer(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setArrayStart(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ","
            r0.<init>(r1)
            java.lang.String r2 = java.lang.System.lineSeparator()
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.spaces
            java.lang.String r2 = r3.spacer(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.setArraySeparator(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = java.lang.System.lineSeparator()
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.spaces
            int r2 = r2 + (-2)
            java.lang.String r2 = r3.spacer(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "}"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.setArrayEnd(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r0.<init>(r2)
            java.lang.String r2 = java.lang.System.lineSeparator()
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.spaces
            java.lang.String r2 = r3.spacer(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.setContentStart(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r1 = java.lang.System.lineSeparator()
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.spaces
            java.lang.String r1 = r3.spacer(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setFieldSeparator(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = java.lang.System.lineSeparator()
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.spaces
            int r1 = r1 + (-2)
            java.lang.String r1 = r3.spacer(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setContentEnd(r0)
            return
    }

    private java.lang.String spacer(int r2) {
            r1 = this;
            r0 = 32
            java.lang.String r2 = org.apache.commons.lang3.StringUtils.repeat(r0, r2)
            return r2
    }

    @Override // org.apache.commons.lang3.builder.RecursiveToStringStyle, org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            java.lang.Class r0 = r5.getClass()
            boolean r0 = org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(r0)
            if (r0 != 0) goto L3a
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r1 = r5.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r2.accept(r0)
            if (r0 == 0) goto L3a
            int r4 = r2.spaces
            int r4 = r4 + 2
            r2.spaces = r4
            r2.resetIndent()
            java.lang.String r4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(r5, r2)
            r3.append(r4)
            int r3 = r2.spaces
            int r3 = r3 + (-2)
            r2.spaces = r3
            r2.resetIndent()
            goto L3d
        L3a:
            super.appendDetail(r3, r4, r5)
        L3d:
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, byte[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, char[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, double[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, float[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, int[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, long[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, java.lang.Object[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, short[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, boolean[] r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.appendDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void reflectionAppendArrayDetail(java.lang.StringBuffer r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            int r0 = r1.spaces
            int r0 = r0 + 2
            r1.spaces = r0
            r1.resetIndent()
            super.reflectionAppendArrayDetail(r2, r3, r4)
            int r2 = r1.spaces
            int r2 = r2 + (-2)
            r1.spaces = r2
            r1.resetIndent()
            return
    }
}
