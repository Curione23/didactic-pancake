package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public interface UncheckedAppendable extends java.lang.Appendable {
    static org.apache.commons.io.output.UncheckedAppendable on(java.lang.Appendable r1) {
            org.apache.commons.io.output.UncheckedAppendableImpl r0 = new org.apache.commons.io.output.UncheckedAppendableImpl
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Appendable
    /* bridge */ /* synthetic */ default java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.io.output.UncheckedAppendable r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    /* bridge */ /* synthetic */ default java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.io.output.UncheckedAppendable r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    /* bridge */ /* synthetic */ default java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            org.apache.commons.io.output.UncheckedAppendable r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.lang.Appendable
    org.apache.commons.io.output.UncheckedAppendable append(char r1);

    @Override // java.lang.Appendable
    org.apache.commons.io.output.UncheckedAppendable append(java.lang.CharSequence r1);

    @Override // java.lang.Appendable
    org.apache.commons.io.output.UncheckedAppendable append(java.lang.CharSequence r1, int r2, int r3);
}
