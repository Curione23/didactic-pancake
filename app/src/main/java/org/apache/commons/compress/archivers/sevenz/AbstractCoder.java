package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractCoder {
    private final java.lang.Class<?>[] optionClasses;

    protected AbstractCoder(java.lang.Class<?>... r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "optionClasses"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.Class[] r2 = (java.lang.Class[]) r2
            r1.optionClasses = r2
            return
    }

    static /* synthetic */ boolean lambda$isOptionInstance$0(java.lang.Object r0, java.lang.Class r1) {
            boolean r0 = r1.isInstance(r0)
            return r0
    }

    protected static int toInt(java.lang.Object r1, int r2) {
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto La
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
        La:
            return r2
    }

    abstract java.io.InputStream decode(java.lang.String r1, java.io.InputStream r2, long r3, org.apache.commons.compress.archivers.sevenz.Coder r5, byte[] r6, int r7) throws java.io.IOException;

    java.io.OutputStream encode(java.io.OutputStream r1, java.lang.Object r2) throws java.io.IOException {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Method doesn't support writing"
            r1.<init>(r2)
            throw r1
    }

    byte[] getOptionsAsProperties(java.lang.Object r1) throws java.io.IOException {
            r0 = this;
            byte[] r1 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
            return r1
    }

    java.lang.Object getOptionsFromCoder(org.apache.commons.compress.archivers.sevenz.Coder r1, java.io.InputStream r2) throws java.io.IOException {
            r0 = this;
            r1 = 0
            return r1
    }

    boolean isOptionInstance(java.lang.Object r3) {
            r2 = this;
            java.lang.Class<?>[] r0 = r2.optionClasses
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            org.apache.commons.compress.archivers.sevenz.AbstractCoder$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.archivers.sevenz.AbstractCoder$$ExternalSyntheticLambda0
            r1.<init>(r3)
            boolean r3 = r0.anyMatch(r1)
            return r3
    }
}
