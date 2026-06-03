package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class CorruptedInputException extends org.tukaani.xz.XZIOException {
    private static final long serialVersionUID = 3;

    public CorruptedInputException() {
            r1 = this;
            java.lang.String r0 = "Compressed data is corrupt"
            r1.<init>(r0)
            return
    }

    public CorruptedInputException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
