package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
final class UncheckedIOExceptions {
    private UncheckedIOExceptions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.UncheckedIOException create(java.lang.Object r2) {
            java.lang.String r2 = java.util.Objects.toString(r2)
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r2)
            r0.<init>(r2, r1)
            return r0
    }

    public static java.io.UncheckedIOException wrap(java.io.IOException r1, java.lang.Object r2) {
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            java.lang.String r2 = java.util.Objects.toString(r2)
            r0.<init>(r2, r1)
            return r0
    }
}
