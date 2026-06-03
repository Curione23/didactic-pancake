package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface PathFilter {
    java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2);
}
