package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentRuntimeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -6582182735562919670L;

    protected ConcurrentRuntimeException() {
            r0 = this;
            r0.<init>()
            return
    }

    public ConcurrentRuntimeException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            java.lang.Throwable r2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(r2)
            r0.<init>(r1, r2)
            return
    }

    public ConcurrentRuntimeException(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(r1)
            r0.<init>(r1)
            return
    }
}
