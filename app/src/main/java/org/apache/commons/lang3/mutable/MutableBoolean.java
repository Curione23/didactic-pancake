package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes2.dex */
public class MutableBoolean implements org.apache.commons.lang3.mutable.Mutable<java.lang.Boolean>, java.io.Serializable, java.lang.Comparable<org.apache.commons.lang3.mutable.MutableBoolean> {
    private static final long serialVersionUID = -4830728138360036487L;
    private boolean value;

    public MutableBoolean() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutableBoolean(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            boolean r1 = r1.booleanValue()
            r0.value = r1
            return
    }

    public MutableBoolean(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public boolean booleanValue() {
            r1 = this;
            boolean r0 = r1.value
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.apache.commons.lang3.mutable.MutableBoolean r1) {
            r0 = this;
            org.apache.commons.lang3.mutable.MutableBoolean r1 = (org.apache.commons.lang3.mutable.MutableBoolean) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.apache.commons.lang3.mutable.MutableBoolean r2) {
            r1 = this;
            boolean r0 = r1.value
            boolean r2 = r2.value
            int r2 = org.apache.commons.lang3.BooleanUtils.compare(r0, r2)
            return r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof org.apache.commons.lang3.mutable.MutableBoolean
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r2.value
            org.apache.commons.lang3.mutable.MutableBoolean r3 = (org.apache.commons.lang3.mutable.MutableBoolean) r3
            boolean r3 = r3.booleanValue()
            if (r0 != r3) goto L10
            r1 = 1
        L10:
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.mutable.Mutable
    public java.lang.Boolean getValue() {
            r1 = this;
            boolean r0 = r1.value
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public /* bridge */ /* synthetic */ java.lang.Boolean getValue() {
            r1 = this;
            java.lang.Boolean r0 = r1.getValue()
            return r0
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.value
            if (r0 == 0) goto L7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L9
        L7:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L9:
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isFalse() {
            r1 = this;
            boolean r0 = r1.value
            r0 = r0 ^ 1
            return r0
    }

    public boolean isTrue() {
            r1 = this;
            boolean r0 = r1.value
            return r0
    }

    public void setFalse() {
            r1 = this;
            r0 = 0
            r1.value = r0
            return
    }

    public void setTrue() {
            r1 = this;
            r0 = 1
            r1.value = r0
            return
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r0.value = r1
            return
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public /* bridge */ /* synthetic */ void setValue(java.lang.Boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0.setValue2(r1)
            return
    }

    public void setValue(boolean r1) {
            r0 = this;
            r0.value = r1
            return
    }

    public java.lang.Boolean toBoolean() {
            r1 = this;
            boolean r0 = r1.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
