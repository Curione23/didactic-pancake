package org.apache.commons.io.function;

import java.util.stream.BaseStream;
import org.apache.commons.io.function.IOBaseStream;

/* JADX INFO: loaded from: classes2.dex */
abstract class IOBaseStreamAdapter<T, S extends org.apache.commons.io.function.IOBaseStream<T, S, B>, B extends java.util.stream.BaseStream<T, B>> implements org.apache.commons.io.function.IOBaseStream<T, S, B> {
    private final B delegate;

    IOBaseStreamAdapter(B r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.stream.BaseStream r2 = (java.util.stream.BaseStream) r2
            r1.delegate = r2
            return
    }

    @Override // org.apache.commons.io.function.IOBaseStream
    public B unwrap() {
            r1 = this;
            B extends java.util.stream.BaseStream<T, B> r0 = r1.delegate
            return r0
    }
}
