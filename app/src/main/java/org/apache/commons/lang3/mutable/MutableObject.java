package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes2.dex */
public class MutableObject<T> implements org.apache.commons.lang3.mutable.Mutable<T>, java.io.Serializable {
    private static final long serialVersionUID = 86241875189L;
    private T value;

    public MutableObject() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutableObject(T r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            if (r3 != r4) goto L8
            r4 = 1
            return r4
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 != r2) goto L1d
            org.apache.commons.lang3.mutable.MutableObject r4 = (org.apache.commons.lang3.mutable.MutableObject) r4
            T r0 = r3.value
            T r4 = r4.value
            boolean r4 = java.util.Objects.equals(r0, r4)
            return r4
        L1d:
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public T getValue() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            T r0 = r1.value
            int r0 = java.util.Objects.hashCode(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(T r1) {
            r0 = this;
            r0.value = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            T r0 = r1.value
            java.lang.String r0 = java.util.Objects.toString(r0)
            return r0
    }
}
