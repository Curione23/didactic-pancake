package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class NotImplementedException extends java.lang.UnsupportedOperationException {
    private static final long serialVersionUID = 20131021;
    private final java.lang.String code;

    public NotImplementedException() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.code = r0
            return
    }

    public NotImplementedException(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r0)
            return
    }

    public NotImplementedException(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.code = r2
            return
    }

    public NotImplementedException(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NotImplementedException(java.lang.String r1, java.lang.Throwable r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.code = r3
            return
    }

    public NotImplementedException(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NotImplementedException(java.lang.Throwable r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.code = r2
            return
    }

    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }
}
