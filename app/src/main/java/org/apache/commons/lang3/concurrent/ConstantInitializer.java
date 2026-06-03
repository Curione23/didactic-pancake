package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class ConstantInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
    private static final java.lang.String FMT_TO_STRING = "ConstantInitializer@%d [ object = %s ]";
    private final T object;

    public ConstantInitializer(T r1) {
            r0 = this;
            r0.<init>()
            r0.object = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof org.apache.commons.lang3.concurrent.ConstantInitializer
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.apache.commons.lang3.concurrent.ConstantInitializer r2 = (org.apache.commons.lang3.concurrent.ConstantInitializer) r2
            java.lang.Object r0 = r1.getObject()
            java.lang.Object r2 = r2.getObject()
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r1 = this;
            java.lang.Object r0 = r1.getObject()
            return r0
    }

    public final T getObject() {
            r1 = this;
            T r0 = r1.object
            return r0
    }

    public int hashCode() {
            r1 = this;
            T r0 = r1.object
            int r0 = java.util.Objects.hashCode(r0)
            return r0
    }

    public boolean isInitialized() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r2.getObject()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "ConstantInitializer@%d [ object = %s ]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
