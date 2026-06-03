package org.apache.commons.io.output;

import java.lang.Appendable;

/* JADX INFO: loaded from: classes2.dex */
public class AppendableOutputStream<T extends java.lang.Appendable> extends java.io.OutputStream {
    private final T appendable;

    public AppendableOutputStream(T r1) {
            r0 = this;
            r0.<init>()
            r0.appendable = r1
            return
    }

    public T getAppendable() {
            r1 = this;
            T extends java.lang.Appendable r0 = r1.appendable
            return r0
    }

    @Override // java.io.OutputStream
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            T extends java.lang.Appendable r0 = r1.appendable
            char r2 = (char) r2
            r0.append(r2)
            return
    }
}
