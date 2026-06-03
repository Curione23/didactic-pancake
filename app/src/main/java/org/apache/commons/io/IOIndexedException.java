package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class IOIndexedException extends java.io.IOException {
    private static final long serialVersionUID = 1;
    private final int index;

    public IOIndexedException(int r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = toMessage(r2, r3)
            r1.<init>(r0, r3)
            r1.index = r2
            return
    }

    protected static java.lang.String toMessage(int r2, java.lang.Throwable r3) {
            java.lang.String r0 = "Null"
            if (r3 != 0) goto L6
            r1 = r0
            goto Le
        L6:
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
        Le:
            if (r3 != 0) goto L11
            goto L15
        L11:
            java.lang.String r0 = r3.getMessage()
        L15:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r0}
            java.lang.String r3 = "%s #%,d: %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            return r2
    }

    public int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }
}
