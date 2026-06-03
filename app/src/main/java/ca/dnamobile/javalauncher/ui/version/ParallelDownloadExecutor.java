package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
public final class ParallelDownloadExecutor {
    private static final int MAX_NETWORK_THREADS = 6;


    public interface Progress<T> {
        void onItemComplete(int r1, int r2, T r3);
    }

    public interface Worker<T> {
        void run(T r1) throws java.lang.Exception;
    }

    private ParallelDownloadExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void cancelAll(java.util.ArrayList<java.util.concurrent.Future<?>> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r2.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            r1 = 1
            r0.cancel(r1)
            goto L4
        L15:
            return
    }

    public static int defaultNetworkThreads() {
            r0 = 6
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$run$0(ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.Worker r0, java.lang.Object r1, java.util.concurrent.atomic.AtomicInteger r2, ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.Progress r3, java.util.List r4) throws java.lang.Exception {
            r0.run(r1)
            int r0 = r2.incrementAndGet()
            if (r3 == 0) goto L10
            int r2 = r4.size()
            r3.onItemComplete(r0, r2, r1)
        L10:
            r0 = 0
            return r0
    }

    public static <T> void run(java.util.List<T> r10, int r11, ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.Worker<T> r12, ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor.Progress<T> r13) throws java.lang.Exception {
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r10.size()
            int r11 = java.lang.Math.min(r11, r0)
            r0 = 6
            int r11 = java.lang.Math.min(r11, r0)
            r0 = 1
            int r11 = java.lang.Math.max(r0, r11)
            ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor$1 r0 = new ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor$1
            r0.<init>()
            java.util.concurrent.ExecutorService r11 = java.util.concurrent.Executors.newFixedThreadPool(r11, r0)
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r6.<init>(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r10.size()
            r7.<init>(r0)
            java.util.Iterator r8 = r10.iterator()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
        L35:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            if (r0 == 0) goto L51
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor$$ExternalSyntheticLambda0 r9 = new ca.dnamobile.javalauncher.ui.version.ParallelDownloadExecutor$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            r0 = r9
            r1 = r12
            r3 = r6
            r4 = r13
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            java.util.concurrent.Future r0 = r11.submit(r9)     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            r7.add(r0)     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            goto L35
        L51:
            java.util.Iterator r10 = r7.iterator()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
        L55:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            if (r12 == 0) goto L65
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            java.util.concurrent.Future r12 = (java.util.concurrent.Future) r12     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            r12.get()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L6b java.util.concurrent.ExecutionException -> L77
            goto L55
        L65:
            r11.shutdownNow()
            return
        L69:
            r10 = move-exception
            goto L93
        L6b:
            r10 = move-exception
            cancelAll(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L69
            r12.interrupt()     // Catch: java.lang.Throwable -> L69
            throw r10     // Catch: java.lang.Throwable -> L69
        L77:
            r10 = move-exception
            cancelAll(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.Throwable r10 = r10.getCause()     // Catch: java.lang.Throwable -> L69
            boolean r12 = r10 instanceof java.lang.Exception     // Catch: java.lang.Throwable -> L69
            if (r12 != 0) goto L90
            boolean r12 = r10 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L69
            if (r12 == 0) goto L8a
            java.lang.Error r10 = (java.lang.Error) r10     // Catch: java.lang.Throwable -> L69
            throw r10     // Catch: java.lang.Throwable -> L69
        L8a:
            java.lang.Exception r12 = new java.lang.Exception     // Catch: java.lang.Throwable -> L69
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L69
            throw r12     // Catch: java.lang.Throwable -> L69
        L90:
            java.lang.Exception r10 = (java.lang.Exception) r10     // Catch: java.lang.Throwable -> L69
            throw r10     // Catch: java.lang.Throwable -> L69
        L93:
            r11.shutdownNow()
            throw r10
    }
}
