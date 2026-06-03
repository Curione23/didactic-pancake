package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
final class UncheckedAppendableImpl implements org.apache.commons.io.output.UncheckedAppendable {
    private final java.lang.Appendable appendable;

    UncheckedAppendableImpl(java.lang.Appendable r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "appendable"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.Appendable r2 = (java.lang.Appendable) r2
            r1.appendable = r2
            return
    }

    @Override // org.apache.commons.io.output.UncheckedAppendable, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.io.output.UncheckedAppendable r1 = r0.append(r1)
            return r1
    }

    @Override // org.apache.commons.io.output.UncheckedAppendable, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.io.output.UncheckedAppendable r1 = r0.append(r1)
            return r1
    }

    @Override // org.apache.commons.io.output.UncheckedAppendable, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            org.apache.commons.io.output.UncheckedAppendable r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // org.apache.commons.io.output.UncheckedAppendable, java.lang.Appendable
    public org.apache.commons.io.output.UncheckedAppendable append(char r3) {
            r2 = this;
            java.lang.Appendable r0 = r2.appendable
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda0
            r1.<init>(r0)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            org.apache.commons.io.function.Uncheck.apply(r1, r3)
            return r2
    }

    @Override // org.apache.commons.io.output.UncheckedAppendable, java.lang.Appendable
    public org.apache.commons.io.output.UncheckedAppendable append(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.Appendable r0 = r2.appendable
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda2 r1 = new org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda2
            r1.<init>(r0)
            org.apache.commons.io.function.Uncheck.apply(r1, r3)
            return r2
    }

    @Override // org.apache.commons.io.output.UncheckedAppendable, java.lang.Appendable
    public org.apache.commons.io.output.UncheckedAppendable append(java.lang.CharSequence r3, int r4, int r5) {
            r2 = this;
            java.lang.Appendable r0 = r2.appendable
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda1 r1 = new org.apache.commons.io.output.UncheckedAppendableImpl$$ExternalSyntheticLambda1
            r1.<init>(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            org.apache.commons.io.function.Uncheck.apply(r1, r3, r4, r5)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Appendable r0 = r1.appendable
            java.lang.String r0 = r0.toString()
            return r0
    }
}
