package org.apache.commons.io.charset;

/* JADX INFO: loaded from: classes2.dex */
public final class CharsetEncoders {
    private CharsetEncoders() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.nio.charset.CharsetEncoder lambda$toCharsetEncoder$0() {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
            return r0
    }

    public static java.nio.charset.CharsetEncoder toCharsetEncoder(java.nio.charset.CharsetEncoder r1) {
            org.apache.commons.io.charset.CharsetEncoders$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.charset.CharsetEncoders$$ExternalSyntheticLambda0
            r0.<init>()
            java.nio.charset.CharsetEncoder r1 = toCharsetEncoder(r1, r0)
            return r1
    }

    public static java.nio.charset.CharsetEncoder toCharsetEncoder(java.nio.charset.CharsetEncoder r0, java.util.function.Supplier<java.nio.charset.CharsetEncoder> r1) {
            if (r0 == 0) goto L3
            goto L9
        L3:
            java.lang.Object r0 = r1.get()
            java.nio.charset.CharsetEncoder r0 = (java.nio.charset.CharsetEncoder) r0
        L9:
            return r0
    }
}
