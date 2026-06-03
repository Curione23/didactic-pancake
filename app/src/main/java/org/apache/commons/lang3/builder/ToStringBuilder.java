package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class ToStringBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.String> {
    private static volatile org.apache.commons.lang3.builder.ToStringStyle defaultStyle;
    private final java.lang.StringBuffer buffer;
    private final java.lang.Object object;
    private final org.apache.commons.lang3.builder.ToStringStyle style;

    static {
            org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE
            org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle = r0
            return
    }

    public ToStringBuilder(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public ToStringBuilder(java.lang.Object r2, org.apache.commons.lang3.builder.ToStringStyle r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ToStringBuilder(java.lang.Object r2, org.apache.commons.lang3.builder.ToStringStyle r3, java.lang.StringBuffer r4) {
            r1 = this;
            r1.<init>()
            if (r3 != 0) goto L9
            org.apache.commons.lang3.builder.ToStringStyle r3 = getDefaultStyle()
        L9:
            if (r4 != 0) goto L12
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r0 = 512(0x200, float:7.17E-43)
            r4.<init>(r0)
        L12:
            r1.buffer = r4
            r1.style = r3
            r1.object = r2
            r3.appendStart(r4, r2)
            return
    }

    public static org.apache.commons.lang3.builder.ToStringStyle getDefaultStyle() {
            org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle
            return r0
    }

    public static java.lang.String reflectionToString(java.lang.Object r0) {
            java.lang.String r0 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(r0)
            return r0
    }

    public static java.lang.String reflectionToString(java.lang.Object r0, org.apache.commons.lang3.builder.ToStringStyle r1) {
            java.lang.String r0 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(r0, r1)
            return r0
    }

    public static java.lang.String reflectionToString(java.lang.Object r2, org.apache.commons.lang3.builder.ToStringStyle r3, boolean r4) {
            r0 = 0
            r1 = 0
            java.lang.String r2 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(r2, r3, r4, r0, r1)
            return r2
    }

    public static <T> java.lang.String reflectionToString(T r1, org.apache.commons.lang3.builder.ToStringStyle r2, boolean r3, java.lang.Class<? super T> r4) {
            r0 = 0
            java.lang.String r1 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(r1, r2, r3, r0, r4)
            return r1
    }

    public static void setDefaultStyle(org.apache.commons.lang3.builder.ToStringStyle r1) {
            java.lang.String r0 = "style"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            org.apache.commons.lang3.builder.ToStringStyle r1 = (org.apache.commons.lang3.builder.ToStringStyle) r1
            org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle = r1
            return
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(byte r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(char r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(double r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(float r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(int r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(long r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.Object r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, byte r4) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.append(r1, r3, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, char r4) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.append(r1, r3, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, double r4) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.append(r1, r3, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, float r4) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.append(r1, r3, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, int r4) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.append(r1, r3, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, long r4) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.append(r1, r3, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, java.lang.Object r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, short r4) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.append(r1, r3, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, boolean r4) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.append(r1, r3, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, byte[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, byte[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, char[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, char[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, double[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, double[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, float[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, float[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, int[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, int[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, long[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, long[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, java.lang.Object[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, java.lang.Object[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, short[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, short[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r4, boolean[] r5) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r4, r5, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String r3, boolean[] r4, boolean r5) {
            r2 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.append(r1, r3, r4, r5)
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(short r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(boolean r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(byte[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(char[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(double[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(float[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(int[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(long[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.Object[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(short[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(boolean[] r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.buffer
            r2 = 0
            r0.append(r1, r2, r4, r2)
            return r3
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendAsObjectToString(java.lang.Object r2) {
            r1 = this;
            java.lang.StringBuffer r0 = r1.getStringBuffer()
            org.apache.commons.lang3.ObjectUtils.identityToString(r0, r2)
            return r1
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendSuper(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L9
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.appendSuper(r1, r3)
        L9:
            return r2
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendToString(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L9
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.style
            java.lang.StringBuffer r1 = r2.buffer
            r0.appendToString(r1, r3)
        L9:
            return r2
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ java.lang.String build() {
            r1 = this;
            java.lang.String r0 = r1.build2()
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    /* JADX INFO: renamed from: build, reason: avoid collision after fix types in other method */
    public java.lang.String build2() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    public java.lang.Object getObject() {
            r1 = this;
            java.lang.Object r0 = r1.object
            return r0
    }

    public java.lang.StringBuffer getStringBuffer() {
            r1 = this;
            java.lang.StringBuffer r0 = r1.buffer
            return r0
    }

    public org.apache.commons.lang3.builder.ToStringStyle getStyle() {
            r1 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r1.style
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.getObject()
            if (r0 != 0) goto L16
            java.lang.StringBuffer r0 = r3.getStringBuffer()
            org.apache.commons.lang3.builder.ToStringStyle r1 = r3.getStyle()
            java.lang.String r1 = r1.getNullText()
            r0.append(r1)
            goto L23
        L16:
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.style
            java.lang.StringBuffer r1 = r3.getStringBuffer()
            java.lang.Object r2 = r3.getObject()
            r0.appendEnd(r1, r2)
        L23:
            java.lang.StringBuffer r0 = r3.getStringBuffer()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
