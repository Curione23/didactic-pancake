package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Diff<T> extends org.apache.commons.lang3.tuple.Pair<T, T> {
    private static final long serialVersionUID = 1;
    private final java.lang.String fieldName;
    private final java.lang.reflect.Type type;

    protected Diff(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.fieldName = r3
            java.lang.Class r3 = r2.getClass()
            java.lang.Class<org.apache.commons.lang3.builder.Diff> r0 = org.apache.commons.lang3.builder.Diff.class
            java.util.Map r3 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(r3, r0)
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            r1 = 0
            r0 = r0[r1]
            java.lang.Object r3 = r3.get(r0)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r3 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(r3, r0)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            r2.type = r3
            return
    }

    Diff(java.lang.String r1, java.lang.reflect.Type r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.fieldName = r1
            java.lang.Object r1 = java.util.Objects.requireNonNull(r2)
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            r0.type = r1
            return
    }

    public final java.lang.String getFieldName() {
            r1 = this;
            java.lang.String r0 = r1.fieldName
            return r0
    }

    @java.lang.Deprecated
    public final java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            return r0
    }

    @Override // java.util.Map.Entry
    public final T setValue(T r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Cannot alter Diff object."
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.fieldName
            java.lang.Object r1 = r3.getLeft()
            java.lang.Object r2 = r3.getRight()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "[%s: %s, %s]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
