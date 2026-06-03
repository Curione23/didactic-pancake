package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimplePathVisitor extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> implements org.apache.commons.io.file.PathVisitor {
    private final org.apache.commons.io.function.IOBiFunction<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> visitFileFailedFunction;

    protected SimplePathVisitor() {
            r1 = this;
            r1.<init>()
            org.apache.commons.io.file.SimplePathVisitor$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.file.SimplePathVisitor$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.visitFileFailedFunction = r0
            return
    }

    protected SimplePathVisitor(org.apache.commons.io.function.IOBiFunction<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "visitFileFailed"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.function.IOBiFunction r2 = (org.apache.commons.io.function.IOBiFunction) r2
            r1.visitFileFailedFunction = r2
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$org-apache-commons-io-file-SimplePathVisitor, reason: not valid java name */
    /* synthetic */ java.nio.file.FileVisitResult m2593lambda$new$0$orgapachecommonsiofileSimplePathVisitor(java.lang.Object r1, java.io.IOException r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.FileVisitResult r1 = super.visitFileFailed(r1, r2)
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFileFailed(java.nio.file.Path r1, java.io.IOException r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.visitFileFailed2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: visitFileFailed, reason: avoid collision after fix types in other method */
    public java.nio.file.FileVisitResult visitFileFailed2(java.nio.file.Path r2, java.io.IOException r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.function.IOBiFunction<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r1.visitFileFailedFunction
            java.lang.Object r2 = r0.apply(r2, r3)
            java.nio.file.FileVisitResult r2 = (java.nio.file.FileVisitResult) r2
            return r2
    }
}
