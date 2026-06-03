package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewModel {
    private final java.util.Map<java.lang.String, java.lang.Object> mBagOfTags;
    private volatile boolean mCleared;
    private final java.util.Set<java.io.Closeable> mCloseables;

    public ViewModel() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mBagOfTags = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mCloseables = r0
            r0 = 0
            r1.mCleared = r0
            return
    }

    public ViewModel(java.io.Closeable... r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBagOfTags = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.mCloseables = r0
            r1 = 0
            r2.mCleared = r1
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.addAll(r3)
            return
    }

    private static void closeWithRuntimeException(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.io.Closeable
            if (r0 == 0) goto L11
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch: java.io.IOException -> La
            r1.close()     // Catch: java.io.IOException -> La
            goto L11
        La:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L11:
            return
    }

    public void addCloseable(java.io.Closeable r3) {
            r2 = this;
            java.util.Set<java.io.Closeable> r0 = r2.mCloseables
            if (r0 == 0) goto Lf
            monitor-enter(r0)
            java.util.Set<java.io.Closeable> r1 = r2.mCloseables     // Catch: java.lang.Throwable -> Lc
            r1.add(r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
        Lf:
            return
    }

    final void clear() {
            r3 = this;
            r0 = 1
            r3.mCleared = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mBagOfTags
            if (r0 == 0) goto L25
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L22
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L22
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L22
            closeWithRuntimeException(r2)     // Catch: java.lang.Throwable -> L22
            goto L12
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
        L25:
            java.util.Set<java.io.Closeable> r0 = r3.mCloseables
            if (r0 == 0) goto L45
            monitor-enter(r0)
            java.util.Set<java.io.Closeable> r1 = r3.mCloseables     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
        L30:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L42
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.lang.Throwable -> L42
            closeWithRuntimeException(r2)     // Catch: java.lang.Throwable -> L42
            goto L30
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1
        L45:
            r3.onCleared()
            return
    }

    <T> T getTag(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mBagOfTags
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.mBagOfTags     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    protected void onCleared() {
            r0 = this;
            return
    }

    <T> T setTagIfAbsent(java.lang.String r4, T r5) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mBagOfTags
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L10
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.mBagOfTags     // Catch: java.lang.Throwable -> L1d
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L1d
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L14
            goto L15
        L14:
            r5 = r1
        L15:
            boolean r4 = r3.mCleared
            if (r4 == 0) goto L1c
            closeWithRuntimeException(r5)
        L1c:
            return r5
        L1d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }
}
