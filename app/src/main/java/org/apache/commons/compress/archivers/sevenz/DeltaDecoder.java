package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class DeltaDecoder extends org.apache.commons.compress.archivers.sevenz.AbstractCoder {
    DeltaDecoder() {
            r3 = this;
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.lang.Number> r2 = java.lang.Number.class
            r0[r1] = r2
            r3.<init>(r0)
            return
    }

    private int getOptionsFromCoder(org.apache.commons.compress.archivers.sevenz.Coder r3) {
            r2 = this;
            byte[] r0 = r3.properties
            r1 = 1
            if (r0 == 0) goto L14
            byte[] r0 = r3.properties
            int r0 = r0.length
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            byte[] r3 = r3.properties
            r0 = 0
            r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            return r3
        L14:
            return r1
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.io.InputStream decode(java.lang.String r1, java.io.InputStream r2, long r3, org.apache.commons.compress.archivers.sevenz.Coder r5, byte[] r6, int r7) throws java.io.IOException {
            r0 = this;
            org.tukaani.xz.DeltaOptions r1 = new org.tukaani.xz.DeltaOptions
            int r3 = r0.getOptionsFromCoder(r5)
            r1.<init>(r3)
            java.io.InputStream r1 = r1.getInputStream(r2)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.io.OutputStream encode(java.io.OutputStream r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            int r3 = toInt(r3, r0)
            org.tukaani.xz.DeltaOptions r0 = new org.tukaani.xz.DeltaOptions     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L14
            r0.<init>(r3)     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L14
            org.tukaani.xz.FinishableWrapperOutputStream r3 = new org.tukaani.xz.FinishableWrapperOutputStream     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L14
            r3.<init>(r2)     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L14
            org.tukaani.xz.FinishableOutputStream r2 = r0.getOutputStream(r3)     // Catch: org.tukaani.xz.UnsupportedOptionsException -> L14
            return r2
        L14:
            r2 = move-exception
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r2 = r2.getMessage()
            r3.<init>(r2)
            throw r3
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    byte[] getOptionsAsProperties(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            int r3 = toInt(r3, r0)
            int r3 = r3 - r0
            byte r3 = (byte) r3
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r3
            return r0
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.lang.Object getOptionsFromCoder(org.apache.commons.compress.archivers.sevenz.Coder r1, java.io.InputStream r2) {
            r0 = this;
            int r1 = r0.getOptionsFromCoder(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }
}
