package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FilterOptions implements java.lang.Cloneable {
    FilterOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDecoderMemoryUsage(org.tukaani.xz.FilterOptions[] r3) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.length
            if (r0 >= r2) goto Lf
            r2 = r3[r0]
            int r2 = r2.getDecoderMemoryUsage()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        Lf:
            return r1
    }

    public static int getEncoderMemoryUsage(org.tukaani.xz.FilterOptions[] r3) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.length
            if (r0 >= r2) goto Lf
            r2 = r3[r0]
            int r2 = r2.getEncoderMemoryUsage()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        Lf:
            return r1
    }

    public abstract int getDecoderMemoryUsage();

    public abstract int getEncoderMemoryUsage();

    abstract org.tukaani.xz.FilterEncoder getFilterEncoder();

    public java.io.InputStream getInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            java.io.InputStream r2 = r1.getInputStream(r2, r0)
            return r2
    }

    public abstract java.io.InputStream getInputStream(java.io.InputStream r1, org.tukaani.xz.ArrayCache r2) throws java.io.IOException;

    public org.tukaani.xz.FinishableOutputStream getOutputStream(org.tukaani.xz.FinishableOutputStream r2) {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            org.tukaani.xz.FinishableOutputStream r2 = r1.getOutputStream(r2, r0)
            return r2
    }

    public abstract org.tukaani.xz.FinishableOutputStream getOutputStream(org.tukaani.xz.FinishableOutputStream r1, org.tukaani.xz.ArrayCache r2);
}
