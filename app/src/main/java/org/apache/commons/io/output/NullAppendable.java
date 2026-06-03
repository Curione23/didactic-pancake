package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class NullAppendable implements java.lang.Appendable {
    public static final org.apache.commons.io.output.NullAppendable INSTANCE = null;

    static {
            org.apache.commons.io.output.NullAppendable r0 = new org.apache.commons.io.output.NullAppendable
            r0.<init>()
            org.apache.commons.io.output.NullAppendable.INSTANCE = r0
            return
    }

    private NullAppendable() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            return r0
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            return r0
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            return r0
    }
}
