package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultBackingStoreSupplier implements org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier {
    private static final java.lang.String PREFIX = "parallelscatter";
    private final java.nio.file.Path dir;
    private final java.util.concurrent.atomic.AtomicInteger storeNum;

    public DefaultBackingStoreSupplier(java.nio.file.Path r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.storeNum = r0
            r1.dir = r2
            return
    }

    @Override // org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier
    public org.apache.commons.compress.parallel.ScatterGatherBackingStore get() throws java.io.IOException {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "n"
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.storeNum
            int r1 = r1.incrementAndGet()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.nio.file.Path r1 = r4.dir
            r2 = 0
            java.lang.String r3 = "parallelscatter"
            if (r1 != 0) goto L23
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r2]
            java.nio.file.Path r0 = java.nio.file.Files.createTempFile(r3, r0, r1)
            goto L29
        L23:
            java.nio.file.attribute.FileAttribute[] r2 = new java.nio.file.attribute.FileAttribute[r2]
            java.nio.file.Path r0 = java.nio.file.Files.createTempFile(r1, r3, r0, r2)
        L29:
            org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore r1 = new org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore
            r1.<init>(r0)
            return r1
    }
}
