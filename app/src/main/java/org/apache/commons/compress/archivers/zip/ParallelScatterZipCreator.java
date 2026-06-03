package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ParallelScatterZipCreator {
    private final org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier backingStoreSupplier;
    private long compressionDoneAt;
    private final int compressionLevel;
    private final java.util.concurrent.ExecutorService executorService;
    private final java.util.Deque<java.util.concurrent.Future<? extends org.apache.commons.compress.archivers.zip.ScatterZipOutputStream>> futures;
    private long scatterDoneAt;
    private final long startedAt;
    private final java.util.Deque<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> streams;
    private final java.lang.ThreadLocal<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> tlScatterStreams;


    public ParallelScatterZipCreator() {
            r1 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            r1.<init>(r0)
            return
    }

    public ParallelScatterZipCreator(java.util.concurrent.ExecutorService r3) {
            r2 = this;
            org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier r0 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier
            r1 = 0
            r0.<init>(r1)
            r2.<init>(r3, r0)
            return
    }

    public ParallelScatterZipCreator(java.util.concurrent.ExecutorService r2, org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r0)
            return
    }

    public ParallelScatterZipCreator(java.util.concurrent.ExecutorService r3, org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier r4, int r5) throws java.lang.IllegalArgumentException {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentLinkedDeque r0 = new java.util.concurrent.ConcurrentLinkedDeque
            r0.<init>()
            r2.streams = r0
            java.util.concurrent.ConcurrentLinkedDeque r0 = new java.util.concurrent.ConcurrentLinkedDeque
            r0.<init>()
            r2.futures = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.startedAt = r0
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$1 r0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$1
            r0.<init>(r2)
            r2.tlScatterStreams = r0
            if (r5 < 0) goto L24
            r0 = 9
            if (r5 <= r0) goto L27
        L24:
            r0 = -1
            if (r5 != r0) goto L2e
        L27:
            r2.backingStoreSupplier = r4
            r2.executorService = r3
            r2.compressionLevel = r5
            return
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Compression level is expected between -1~9"
            r3.<init>(r4)
            throw r3
    }

    static /* synthetic */ org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier access$000(org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator r0) {
            org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier r0 = r0.backingStoreSupplier
            return r0
    }

    static /* synthetic */ org.apache.commons.compress.archivers.zip.ScatterZipOutputStream access$100(org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator r0, org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier r1) throws java.io.IOException {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r0 = r0.createDeferred(r1)
            return r0
    }

    static /* synthetic */ java.util.Deque access$200(org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator r0) {
            java.util.Deque<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> r0 = r0.streams
            return r0
    }

    private void closeAll() {
            r2 = this;
            java.util.Deque<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> r0 = r2.streams
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r1 = (org.apache.commons.compress.archivers.zip.ScatterZipOutputStream) r1
            r1.close()     // Catch: java.io.IOException -> L6
            goto L6
        L16:
            return
    }

    private org.apache.commons.compress.archivers.zip.ScatterZipOutputStream createDeferred(org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.parallel.ScatterGatherBackingStore r3 = r3.get()
            int r0 = r2.compressionLevel
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(r0, r3)
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r1 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream
            r1.<init>(r3, r0)
            return r1
    }

    public void addArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r1, org.apache.commons.compress.parallel.InputStreamSupplier r2) {
            r0 = this;
            java.util.concurrent.Callable r1 = r0.createCallable(r1, r2)
            r0.submitStreamAwareCallable(r1)
            return
    }

    public void addArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier r1) {
            r0 = this;
            java.util.concurrent.Callable r1 = r0.createCallable(r1)
            r0.submitStreamAwareCallable(r1)
            return
    }

    public final java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> createCallable(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r3, org.apache.commons.compress.parallel.InputStreamSupplier r4) {
            r2 = this;
            int r0 = r3.getMethod()
            r1 = -1
            if (r0 == r1) goto L11
            org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest r3 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(r3, r4)
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda2 r4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda2
            r4.<init>(r2, r3)
            return r4
        L11:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Method must be set on zipArchiveEntry: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public final java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> createCallable(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier r2) {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ScatterStatistics getStatisticsMessage() {
            r7 = this;
            org.apache.commons.compress.archivers.zip.ScatterStatistics r0 = new org.apache.commons.compress.archivers.zip.ScatterStatistics
            long r1 = r7.compressionDoneAt
            long r3 = r7.startedAt
            long r3 = r1 - r3
            long r5 = r7.scatterDoneAt
            long r5 = r5 - r1
            r0.<init>(r3, r5)
            return r0
    }

    /* JADX INFO: renamed from: lambda$createCallable$0$org-apache-commons-compress-archivers-zip-ParallelScatterZipCreator, reason: not valid java name */
    /* synthetic */ org.apache.commons.compress.archivers.zip.ScatterZipOutputStream m2542x5cb3ae55(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest r2) throws java.lang.Exception {
            r1 = this;
            java.lang.ThreadLocal<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> r0 = r1.tlScatterStreams
            java.lang.Object r0 = r0.get()
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r0 = (org.apache.commons.compress.archivers.zip.ScatterZipOutputStream) r0
            r0.addArchiveEntry(r2)
            return r0
    }

    /* JADX INFO: renamed from: lambda$createCallable$1$org-apache-commons-compress-archivers-zip-ParallelScatterZipCreator, reason: not valid java name */
    /* synthetic */ org.apache.commons.compress.archivers.zip.ScatterZipOutputStream m2543x4e053dd6(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier r2) throws java.lang.Exception {
            r1 = this;
            java.lang.ThreadLocal<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> r0 = r1.tlScatterStreams
            java.lang.Object r0 = r0.get()
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r0 = (org.apache.commons.compress.archivers.zip.ScatterZipOutputStream) r0
            org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest r2 = r2.get()
            r0.addArchiveEntry(r2)
            return r0
    }

    /* JADX INFO: renamed from: lambda$submit$2$org-apache-commons-compress-archivers-zip-ParallelScatterZipCreator, reason: not valid java name */
    /* synthetic */ org.apache.commons.compress.archivers.zip.ScatterZipOutputStream m2544x592c3d9b(java.util.concurrent.Callable r1) throws java.lang.Exception {
            r0 = this;
            r1.call()
            java.lang.ThreadLocal<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> r1 = r0.tlScatterStreams
            java.lang.Object r1 = r1.get()
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r1 = (org.apache.commons.compress.archivers.zip.ScatterZipOutputStream) r1
            return r1
    }

    public final void submit(java.util.concurrent.Callable<? extends java.lang.Object> r2) {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator$$ExternalSyntheticLambda1
            r0.<init>(r1, r2)
            r1.submitStreamAwareCallable(r0)
            return
    }

    public final void submitStreamAwareCallable(java.util.concurrent.Callable<? extends org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> r3) {
            r2 = this;
            java.util.Deque<java.util.concurrent.Future<? extends org.apache.commons.compress.archivers.zip.ScatterZipOutputStream>> r0 = r2.futures
            java.util.concurrent.ExecutorService r1 = r2.executorService
            java.util.concurrent.Future r3 = r1.submit(r3)
            r0.add(r3)
            return
    }

    public void writeTo(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream r5) throws java.io.IOException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r4 = this;
            java.util.Deque<java.util.concurrent.Future<? extends org.apache.commons.compress.archivers.zip.ScatterZipOutputStream>> r0 = r4.futures     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch: java.lang.Throwable -> L6b
            r1.get()     // Catch: java.lang.Throwable -> L6b
            goto L6
        L16:
            java.util.concurrent.ExecutorService r0 = r4.executorService     // Catch: java.lang.Throwable -> L72
            r0.shutdown()     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.ExecutorService r0 = r4.executorService     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L72
            r2 = 60000(0xea60, double:2.9644E-319)
            r0.awaitTermination(r2, r1)     // Catch: java.lang.Throwable -> L72
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L72
            r4.compressionDoneAt = r0     // Catch: java.lang.Throwable -> L72
            java.util.Deque<java.util.concurrent.Future<? extends org.apache.commons.compress.archivers.zip.ScatterZipOutputStream>> r0 = r4.futures     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L72
        L31:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch: java.lang.Throwable -> L72
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L72
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r1 = (org.apache.commons.compress.archivers.zip.ScatterZipOutputStream) r1     // Catch: java.lang.Throwable -> L72
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$ZipEntryWriter r1 = r1.zipEntryWriter()     // Catch: java.lang.Throwable -> L72
            r1.writeNextZipEntry(r5)     // Catch: java.lang.Throwable -> L72
            goto L31
        L4b:
            java.util.Deque<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> r5 = r4.streams     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L72
        L51:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L61
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L72
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r0 = (org.apache.commons.compress.archivers.zip.ScatterZipOutputStream) r0     // Catch: java.lang.Throwable -> L72
            r0.close()     // Catch: java.lang.Throwable -> L72
            goto L51
        L61:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L72
            r4.scatterDoneAt = r0     // Catch: java.lang.Throwable -> L72
            r4.closeAll()
            return
        L6b:
            r5 = move-exception
            java.util.concurrent.ExecutorService r0 = r4.executorService     // Catch: java.lang.Throwable -> L72
            r0.shutdown()     // Catch: java.lang.Throwable -> L72
            throw r5     // Catch: java.lang.Throwable -> L72
        L72:
            r5 = move-exception
            r4.closeAll()
            throw r5
    }
}
