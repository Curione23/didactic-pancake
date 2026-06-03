package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
public class NoopPathVisitor extends org.apache.commons.io.file.SimplePathVisitor {
    public static final org.apache.commons.io.file.NoopPathVisitor INSTANCE = null;

    static {
            org.apache.commons.io.file.NoopPathVisitor r0 = new org.apache.commons.io.file.NoopPathVisitor
            r0.<init>()
            org.apache.commons.io.file.NoopPathVisitor.INSTANCE = r0
            return
    }

    public NoopPathVisitor() {
            r0 = this;
            r0.<init>()
            return
    }

    public NoopPathVisitor(org.apache.commons.io.function.IOBiFunction<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
