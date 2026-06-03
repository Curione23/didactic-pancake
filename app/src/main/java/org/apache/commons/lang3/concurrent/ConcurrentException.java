package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentException extends java.lang.Exception {
    private static final long serialVersionUID = 6622707671812226130L;

    protected ConcurrentException() {
            r0 = this;
            r0.<init>()
            return
    }

    public ConcurrentException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            java.lang.Throwable r2 = org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(r2)
            r0.<init>(r1, r2)
            return
    }

    public ConcurrentException(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(r1)
            r0.<init>(r1)
            return
    }
}
