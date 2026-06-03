package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class RecursiveToStringStyle extends org.apache.commons.lang3.builder.ToStringStyle {
    private static final long serialVersionUID = 1;

    public RecursiveToStringStyle() {
            r0 = this;
            r0.<init>()
            return
    }

    protected boolean accept(java.lang.Class<?> r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(java.lang.StringBuffer r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            java.lang.Class r0 = r5.getClass()
            boolean r0 = org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(r0)
            if (r0 != 0) goto L28
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r1 = r5.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r2.accept(r0)
            if (r0 == 0) goto L28
            java.lang.String r4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(r5, r2)
            r3.append(r4)
            goto L2b
        L28:
            super.appendDetail(r3, r4, r5)
        L2b:
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    protected void appendDetail(java.lang.StringBuffer r1, java.lang.String r2, java.util.Collection<?> r3) {
            r0 = this;
            r0.appendClassName(r1, r3)
            r0.appendIdentityHashCode(r1, r3)
            java.lang.Object[] r3 = r3.toArray()
            r0.appendDetail(r1, r2, r3)
            return
    }
}
