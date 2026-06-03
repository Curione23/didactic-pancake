package org.apache.commons.io.function;

/* JADX INFO: loaded from: classes2.dex */
final class IOStreamAdapter<T> extends org.apache.commons.io.function.IOBaseStreamAdapter<T, org.apache.commons.io.function.IOStream<T>, java.util.stream.Stream<T>> implements org.apache.commons.io.function.IOStream<T> {
    private IOStreamAdapter(java.util.stream.Stream<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static <T> org.apache.commons.io.function.IOStream<T> adapt(java.util.stream.Stream<T> r1) {
            if (r1 == 0) goto L8
            org.apache.commons.io.function.IOStreamAdapter r0 = new org.apache.commons.io.function.IOStreamAdapter
            r0.<init>(r1)
            goto Lc
        L8:
            org.apache.commons.io.function.IOStream r0 = org.apache.commons.io.function.IOStream.empty()
        Lc:
            return r0
    }

    @Override // org.apache.commons.io.function.IOBaseStream
    public /* bridge */ /* synthetic */ org.apache.commons.io.function.IOBaseStream wrap(java.util.stream.BaseStream r1) {
            r0 = this;
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            org.apache.commons.io.function.IOStream r1 = r0.wrap(r1)
            return r1
    }

    public org.apache.commons.io.function.IOStream<T> wrap(java.util.stream.Stream<T> r2) {
            r1 = this;
            java.util.stream.BaseStream r0 = r1.unwrap()
            if (r0 != r2) goto L8
            r2 = r1
            goto Lc
        L8:
            org.apache.commons.io.function.IOStream r2 = adapt(r2)
        Lc:
            return r2
    }
}
