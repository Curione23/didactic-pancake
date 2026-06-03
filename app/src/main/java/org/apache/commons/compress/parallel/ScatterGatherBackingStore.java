package org.apache.commons.compress.parallel;

/* JADX INFO: loaded from: classes2.dex */
public interface ScatterGatherBackingStore extends java.io.Closeable {
    void closeForWriting() throws java.io.IOException;

    java.io.InputStream getInputStream() throws java.io.IOException;

    void writeOut(byte[] r1, int r2, int r3) throws java.io.IOException;
}
