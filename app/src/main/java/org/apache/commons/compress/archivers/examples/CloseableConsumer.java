package org.apache.commons.compress.archivers.examples;

/* JADX INFO: loaded from: classes2.dex */
public interface CloseableConsumer {
    public static final org.apache.commons.compress.archivers.examples.CloseableConsumer CLOSING_CONSUMER = null;
    public static final org.apache.commons.compress.archivers.examples.CloseableConsumer NULL_CONSUMER = null;

    static {
            org.apache.commons.compress.archivers.examples.CloseableConsumer$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.archivers.examples.CloseableConsumer$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER = r0
            org.apache.commons.compress.archivers.examples.CloseableConsumer$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.archivers.examples.CloseableConsumer$$ExternalSyntheticLambda1
            r0.<init>()
            org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER = r0
            return
    }

    static /* synthetic */ void lambda$static$0(java.io.Closeable r0) throws java.io.IOException {
            return
    }

    void accept(java.io.Closeable r1) throws java.io.IOException;
}
