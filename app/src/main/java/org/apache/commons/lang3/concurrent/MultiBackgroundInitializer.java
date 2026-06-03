package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class MultiBackgroundInitializer extends org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> {
    private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> childInitializers;

    /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class MultiBackgroundInitializerResults {
        private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> exceptions;
        private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> initializers;
        private final java.util.Map<java.lang.String, java.lang.Object> resultObjects;

        private MultiBackgroundInitializerResults(java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r1, java.util.Map<java.lang.String, java.lang.Object> r2, java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> r3) {
                r0 = this;
                r0.<init>()
                r0.initializers = r1
                r0.resultObjects = r2
                r0.exceptions = r3
                return
        }

        /* synthetic */ MultiBackgroundInitializerResults(java.util.Map r1, java.util.Map r2, java.util.Map r3, org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private org.apache.commons.lang3.concurrent.BackgroundInitializer<?> checkName(java.lang.String r4) {
                r3 = this;
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r3.initializers
                java.lang.Object r0 = r0.get(r4)
                org.apache.commons.lang3.concurrent.BackgroundInitializer r0 = (org.apache.commons.lang3.concurrent.BackgroundInitializer) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "No child initializer with name "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public org.apache.commons.lang3.concurrent.ConcurrentException getException(java.lang.String r2) {
                r1 = this;
                r1.checkName(r2)
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> r0 = r1.exceptions
                java.lang.Object r2 = r0.get(r2)
                org.apache.commons.lang3.concurrent.ConcurrentException r2 = (org.apache.commons.lang3.concurrent.ConcurrentException) r2
                return r2
        }

        public org.apache.commons.lang3.concurrent.BackgroundInitializer<?> getInitializer(java.lang.String r1) {
                r0 = this;
                org.apache.commons.lang3.concurrent.BackgroundInitializer r1 = r0.checkName(r1)
                return r1
        }

        public java.lang.Object getResultObject(java.lang.String r2) {
                r1 = this;
                r1.checkName(r2)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.resultObjects
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        public java.util.Set<java.lang.String> initializerNames() {
                r1 = this;
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r1.initializers
                java.util.Set r0 = r0.keySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }

        public boolean isException(java.lang.String r2) {
                r1 = this;
                r1.checkName(r2)
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> r0 = r1.exceptions
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        public boolean isSuccessful() {
                r1 = this;
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> r0 = r1.exceptions
                boolean r0 = r0.isEmpty()
                return r0
        }
    }

    public MultiBackgroundInitializer() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.childInitializers = r0
            return
    }

    public MultiBackgroundInitializer(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.childInitializers = r1
            return
    }

    static /* synthetic */ void lambda$initialize$0(java.util.concurrent.ExecutorService r1, org.apache.commons.lang3.concurrent.BackgroundInitializer r2) {
            java.util.concurrent.ExecutorService r0 = r2.getExternalExecutor()
            if (r0 != 0) goto L9
            r2.setExternalExecutor(r1)
        L9:
            r2.start()
            return
    }

    static /* synthetic */ void lambda$initialize$1(java.util.Map r0, java.util.Map r1, java.lang.String r2, org.apache.commons.lang3.concurrent.BackgroundInitializer r3) {
            java.lang.Object r3 = r3.get()     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L8
            r0.put(r2, r3)     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L8
            goto Lc
        L8:
            r0 = move-exception
            r1.put(r2, r0)
        Lc:
            return
    }

    public void addInitializer(java.lang.String r2, org.apache.commons.lang3.concurrent.BackgroundInitializer<?> r3) {
            r1 = this;
            java.lang.String r0 = "name"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "backgroundInitializer"
            java.util.Objects.requireNonNull(r3, r0)
            monitor-enter(r1)
            boolean r0 = r1.isStarted()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L18
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r1.childInitializers     // Catch: java.lang.Throwable -> L20
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            return
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "addInitializer() must not be called after start()!"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L20:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            throw r2
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public void close() throws org.apache.commons.lang3.concurrent.ConcurrentException {
            r4 = this;
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r4.childInitializers
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            org.apache.commons.lang3.concurrent.BackgroundInitializer r2 = (org.apache.commons.lang3.concurrent.BackgroundInitializer) r2
            r2.close()     // Catch: java.lang.Exception -> L1b
            goto Lb
        L1b:
            r2 = move-exception
            if (r1 != 0) goto L23
            org.apache.commons.lang3.concurrent.ConcurrentException r1 = new org.apache.commons.lang3.concurrent.ConcurrentException
            r1.<init>()
        L23:
            boolean r3 = r2 instanceof org.apache.commons.lang3.concurrent.ConcurrentException
            if (r3 == 0) goto L2f
            java.lang.Throwable r2 = r2.getCause()
            r1.addSuppressed(r2)
            goto Lb
        L2f:
            r1.addSuppressed(r2)
            goto Lb
        L33:
            if (r1 != 0) goto L36
            return
        L36:
            throw r1
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer
    protected int getTaskCount() {
            r2 = this;
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r2.childInitializers
            java.util.Collection r0 = r0.values()
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$$ExternalSyntheticLambda2 r1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$$ExternalSyntheticLambda2
            r1.<init>()
            java.util.stream.IntStream r0 = r0.mapToInt(r1)
            int r0 = r0.sum()
            int r0 = r0 + 1
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    protected /* bridge */ /* synthetic */ java.lang.Object initialize() throws java.lang.Exception {
            r1 = this;
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults r0 = r1.initialize()
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    protected org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults initialize() throws java.lang.Exception {
            r5 = this;
            monitor-enter(r5)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L32
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r1 = r5.childInitializers     // Catch: java.lang.Throwable -> L32
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r1 = r5.getActiveExecutor()
            java.util.Collection r2 = r0.values()
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$$ExternalSyntheticLambda0 r3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$$ExternalSyntheticLambda0
            r3.<init>(r1)
            r2.forEach(r3)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$$ExternalSyntheticLambda1 r3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$$ExternalSyntheticLambda1
            r3.<init>(r1, r2)
            r0.forEach(r3)
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults r3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults
            r4 = 0
            r3.<init>(r0, r1, r2, r4)
            return r3
        L32:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer, org.apache.commons.lang3.concurrent.AbstractConcurrentInitializer
    public boolean isInitialized() {
            r2 = this;
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r2.childInitializers
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r2.childInitializers
            java.util.Collection r0 = r0.values()
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$$ExternalSyntheticLambda3 r1 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$$ExternalSyntheticLambda3
            r1.<init>()
            boolean r0 = r0.allMatch(r1)
            return r0
    }
}
