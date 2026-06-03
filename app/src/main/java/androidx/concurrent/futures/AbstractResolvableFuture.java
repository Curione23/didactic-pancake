package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper ATOMIC_HELPER = null;
    static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final java.lang.Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final java.util.logging.Logger log = null;
    volatile androidx.concurrent.futures.AbstractResolvableFuture.Listener listeners;
    volatile java.lang.Object value;
    volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter waiters;

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static abstract class AtomicHelper {
        private AtomicHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AtomicHelper(androidx.concurrent.futures.AbstractResolvableFuture.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, androidx.concurrent.futures.AbstractResolvableFuture.Listener r2, androidx.concurrent.futures.AbstractResolvableFuture.Listener r3);

        abstract boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, java.lang.Object r2, java.lang.Object r3);

        abstract boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3);

        abstract void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2);

        abstract void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, java.lang.Thread r2);
    }

    private static final class Cancellation {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation CAUSELESS_CANCELLED = null;
        static final androidx.concurrent.futures.AbstractResolvableFuture.Cancellation CAUSELESS_INTERRUPTED = null;
        final java.lang.Throwable cause;
        final boolean wasInterrupted;

        static {
                boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
                r1 = 0
                if (r0 == 0) goto La
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED = r1
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED = r1
                goto L1a
            La:
                androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
                r2 = 0
                r0.<init>(r2, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED = r0
                androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
                r2 = 1
                r0.<init>(r2, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED = r0
            L1a:
                return
        }

        Cancellation(boolean r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.wasInterrupted = r1
                r0.cause = r2
                return
        }
    }

    private static final class Failure {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Failure FALLBACK_INSTANCE = null;
        final java.lang.Throwable exception;


        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
                androidx.concurrent.futures.AbstractResolvableFuture$Failure$1 r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure$1
                java.lang.String r2 = "Failure occurred while trying to finish a future."
                r1.<init>(r2)
                r0.<init>(r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Failure.FALLBACK_INSTANCE = r0
                return
        }

        Failure(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.concurrent.futures.AbstractResolvableFuture.checkNotNull(r1)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.exception = r1
                return
        }
    }

    private static final class Listener {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Listener TOMBSTONE = null;
        final java.util.concurrent.Executor executor;
        androidx.concurrent.futures.AbstractResolvableFuture.Listener next;
        final java.lang.Runnable task;

        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Listener
                r1 = 0
                r0.<init>(r1, r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE = r0
                return
        }

        Listener(java.lang.Runnable r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.task = r1
                r0.executor = r2
                return
        }
    }

    private static final class SafeAtomicHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> listenersUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> valueUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> waiterNextUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> waiterThreadUpdater;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> waitersUpdater;

        SafeAtomicHelper(java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, java.lang.Thread> r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture.Waiter, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Waiter> r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture.Listener> r5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> r6) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.waiterThreadUpdater = r2
                r1.waiterNextUpdater = r3
                r1.waitersUpdater = r4
                r1.listenersUpdater = r5
                r1.valueUpdater = r6
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Listener r3, androidx.concurrent.futures.AbstractResolvableFuture.Listener r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture$Listener> r0 = r1.listenersUpdater
                boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r2
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, java.lang.Object> r0 = r1.valueUpdater
                boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r2
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r4) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture, androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r0 = r1.waitersUpdater
                boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3, r4)
                return r2
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture$Waiter, androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r0 = r1.waiterNextUpdater
                r0.lazySet(r2, r3)
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2, java.lang.Thread r3) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater<androidx.concurrent.futures.AbstractResolvableFuture$Waiter, java.lang.Thread> r0 = r1.waiterThreadUpdater
                r0.lazySet(r2, r3)
                return
        }
    }

    private static final class SetFuture<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        final androidx.concurrent.futures.AbstractResolvableFuture<V> owner;

        SetFuture(androidx.concurrent.futures.AbstractResolvableFuture<V> r1, com.google.common.util.concurrent.ListenableFuture<? extends V> r2) {
                r0 = this;
                r0.<init>()
                r0.owner = r1
                r0.future = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.concurrent.futures.AbstractResolvableFuture<V> r0 = r3.owner
                java.lang.Object r0 = r0.value
                if (r0 == r3) goto L7
                return
            L7:
                com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r3.future
                java.lang.Object r0 = androidx.concurrent.futures.AbstractResolvableFuture.getFutureValue(r0)
                androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
                androidx.concurrent.futures.AbstractResolvableFuture<V> r2 = r3.owner
                boolean r0 = r1.casValue(r2, r3, r0)
                if (r0 == 0) goto L1c
                androidx.concurrent.futures.AbstractResolvableFuture<V> r0 = r3.owner
                androidx.concurrent.futures.AbstractResolvableFuture.complete(r0)
            L1c:
                return
        }
    }

    private static final class SynchronizedHelper extends androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper {
        SynchronizedHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casListeners(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Listener r3, androidx.concurrent.futures.AbstractResolvableFuture.Listener r4) {
                r1 = this;
                monitor-enter(r2)
                androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r2.listeners     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.listeners = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            La:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casValue(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, java.lang.Object r3, java.lang.Object r4) {
                r1 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2.value     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.value = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            La:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casWaiters(androidx.concurrent.futures.AbstractResolvableFuture<?> r2, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r3, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r4) {
                r1 = this;
                monitor-enter(r2)
                androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r2.waiters     // Catch: java.lang.Throwable -> Ld
                if (r0 != r3) goto La
                r2.waiters = r4     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 1
                return r2
            La:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                r2 = 0
                return r2
            Ld:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r3
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2) {
                r0 = this;
                r1.next = r2
                return
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putThread(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r1, java.lang.Thread r2) {
                r0 = this;
                r1.thread = r2
                return
        }
    }

    private static final class Waiter {
        static final androidx.concurrent.futures.AbstractResolvableFuture.Waiter TOMBSTONE = null;
        volatile androidx.concurrent.futures.AbstractResolvableFuture.Waiter next;
        volatile java.lang.Thread thread;

        static {
                androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
                r1 = 0
                r0.<init>(r1)
                androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE = r0
                return
        }

        Waiter() {
                r2 = this;
                r2.<init>()
                androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.putThread(r2, r1)
                return
        }

        Waiter(boolean r1) {
                r0 = this;
                r0.<init>()
                return
        }

        void setNext(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r2) {
                r1 = this;
                androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
                r0.putNext(r1, r2)
                return
        }

        void unpark() {
                r2 = this;
                java.lang.Thread r0 = r2.thread
                if (r0 == 0) goto La
                r1 = 0
                r2.thread = r1
                java.util.concurrent.locks.LockSupport.unpark(r0)
            La:
                return
        }
    }

    static {
            java.lang.String r0 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r1 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES = r0
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r0 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            androidx.concurrent.futures.AbstractResolvableFuture.log = r1
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper r1 = new androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r2 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r3, r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r2 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r4 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.String r5 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r4, r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r2 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.String r5 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Listener> r2 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.class
            java.lang.String r6 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch: java.lang.Throwable -> L4e
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
            r0 = 0
            goto L54
        L4e:
            r0 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper r1 = new androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper
            r1.<init>()
        L54:
            androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L63
            java.util.logging.Logger r1 = androidx.concurrent.futures.AbstractResolvableFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L63:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.concurrent.futures.AbstractResolvableFuture.NULL = r0
            return
    }

    protected AbstractResolvableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    private void addDoneString(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = getUninterruptibly(r3)     // Catch: java.lang.RuntimeException -> L18 java.util.concurrent.CancellationException -> L2d java.util.concurrent.ExecutionException -> L33
            java.lang.String r2 = "SUCCESS, result=["
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch: java.lang.RuntimeException -> L18 java.util.concurrent.CancellationException -> L2d java.util.concurrent.ExecutionException -> L33
            java.lang.String r1 = r3.userObjectToString(r1)     // Catch: java.lang.RuntimeException -> L18 java.util.concurrent.CancellationException -> L2d java.util.concurrent.ExecutionException -> L33
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.RuntimeException -> L18 java.util.concurrent.CancellationException -> L2d java.util.concurrent.ExecutionException -> L33
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L18 java.util.concurrent.CancellationException -> L2d java.util.concurrent.ExecutionException -> L33
            goto L45
        L18:
            r0 = move-exception
            java.lang.String r1 = "UNKNOWN, cause=["
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            r4.append(r0)
            goto L45
        L2d:
            java.lang.String r0 = "CANCELLED"
            r4.append(r0)
            goto L45
        L33:
            r1 = move-exception
            java.lang.String r2 = "FAILURE, cause=["
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            java.lang.StringBuilder r4 = r4.append(r1)
            r4.append(r0)
        L45:
            return
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String r1, java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            r0.initCause(r2)
            return r0
    }

    static <T> T checkNotNull(T r0) {
            r0.getClass()
            return r0
    }

    private androidx.concurrent.futures.AbstractResolvableFuture.Listener clearListeners(androidx.concurrent.futures.AbstractResolvableFuture.Listener r5) {
            r4 = this;
        L0:
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r4.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r2 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            boolean r1 = r1.casListeners(r4, r0, r2)
            if (r1 == 0) goto L0
            r3 = r0
            r0 = r5
            r5 = r3
        Lf:
            if (r5 == 0) goto L18
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r1 = r5.next
            r5.next = r0
            r0 = r5
            r5 = r1
            goto Lf
        L18:
            return r0
    }

    static void complete(androidx.concurrent.futures.AbstractResolvableFuture<?> r4) {
            r0 = 0
        L1:
            r4.releaseWaiters()
            r4.afterDone()
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r4 = r4.clearListeners(r0)
        Lb:
            if (r4 == 0) goto L33
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r4.next
            java.lang.Runnable r1 = r4.task
            boolean r2 = r1 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r2 == 0) goto L2c
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r1 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r1
            androidx.concurrent.futures.AbstractResolvableFuture<V> r4 = r1.owner
            java.lang.Object r2 = r4.value
            if (r2 != r1) goto L31
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r1.future
            java.lang.Object r2 = getFutureValue(r2)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r3 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r1 = r3.casValue(r4, r1, r2)
            if (r1 == 0) goto L31
            goto L1
        L2c:
            java.util.concurrent.Executor r4 = r4.executor
            executeListener(r1, r4)
        L31:
            r4 = r0
            goto Lb
        L33:
            return
    }

    private static void executeListener(java.lang.Runnable r5, java.util.concurrent.Executor r6) {
            r6.execute(r5)     // Catch: java.lang.RuntimeException -> L4
            goto L25
        L4:
            r0 = move-exception
            java.util.logging.Logger r1 = androidx.concurrent.futures.AbstractResolvableFuture.log
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RuntimeException while executing runnable "
            r3.<init>(r4)
            java.lang.StringBuilder r5 = r3.append(r5)
            java.lang.String r3 = " with executor "
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.log(r2, r5, r0)
        L25:
            return
    }

    private V getDoneValue(java.lang.Object r2) throws java.util.concurrent.ExecutionException {
            r1 = this;
            boolean r0 = r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Failure
            if (r0 != 0) goto Le
            java.lang.Object r0 = androidx.concurrent.futures.AbstractResolvableFuture.NULL
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r2 = (androidx.concurrent.futures.AbstractResolvableFuture.Failure) r2
            java.lang.Throwable r2 = r2.exception
            r0.<init>(r2)
            throw r0
        L18:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r2 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r2
            java.lang.Throwable r2 = r2.cause
            java.lang.String r0 = "Task was cancelled."
            java.util.concurrent.CancellationException r2 = cancellationExceptionWithCause(r0, r2)
            throw r2
    }

    static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> r5) {
            boolean r0 = r5 instanceof androidx.concurrent.futures.AbstractResolvableFuture
            r1 = 0
            if (r0 == 0) goto L23
            androidx.concurrent.futures.AbstractResolvableFuture r5 = (androidx.concurrent.futures.AbstractResolvableFuture) r5
            java.lang.Object r5 = r5.value
            boolean r0 = r5 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r0 == 0) goto L22
            r0 = r5
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r0
            boolean r2 = r0.wasInterrupted
            if (r2 == 0) goto L22
            java.lang.Throwable r5 = r0.cause
            if (r5 == 0) goto L20
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r5 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            java.lang.Throwable r0 = r0.cause
            r5.<init>(r1, r0)
            goto L22
        L20:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r5 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
        L22:
            return r5
        L23:
            boolean r0 = r5.isCancelled()
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
            r2 = r2 ^ 1
            r2 = r2 & r0
            if (r2 == 0) goto L31
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r5 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
            return r5
        L31:
            java.lang.Object r2 = getUninterruptibly(r5)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L41 java.util.concurrent.ExecutionException -> L64
            if (r2 != 0) goto L39
            java.lang.Object r2 = androidx.concurrent.futures.AbstractResolvableFuture.NULL     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L41 java.util.concurrent.ExecutionException -> L64
        L39:
            return r2
        L3a:
            r5 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            r0.<init>(r5)
            return r0
        L41:
            r2 = move-exception
            if (r0 != 0) goto L5e
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.<init>(r4)
            java.lang.StringBuilder r5 = r3.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r2)
            r0.<init>(r1)
            return r0
        L5e:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r5 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            r5.<init>(r1, r2)
            return r5
        L64:
            r5 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.lang.Throwable r5 = r5.getCause()
            r0.<init>(r5)
            return r0
    }

    static <V> V getUninterruptibly(java.util.concurrent.Future<V> r1) throws java.util.concurrent.ExecutionException {
            r0 = 0
        L1:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lf java.lang.InterruptedException -> L1a
            if (r0 == 0) goto Le
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return r1
        Lf:
            r1 = move-exception
            if (r0 == 0) goto L19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L19:
            throw r1
        L1a:
            r0 = 1
            goto L1
    }

    private void releaseWaiters() {
            r3 = this;
        L0:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r3.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r1 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r2 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            boolean r1 = r1.casWaiters(r3, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            if (r0 == 0) goto L14
            r0.unpark()
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r0.next
            goto Lc
        L14:
            return
    }

    private void removeWaiter(androidx.concurrent.futures.AbstractResolvableFuture.Waiter r5) {
            r4 = this;
            r0 = 0
            r5.thread = r0
        L3:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r5 = r4.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r1 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r5 != r1) goto La
            return
        La:
            r1 = r0
        Lb:
            if (r5 == 0) goto L29
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r2 = r5.next
            java.lang.Thread r3 = r5.thread
            if (r3 == 0) goto L15
            r1 = r5
            goto L27
        L15:
            if (r1 == 0) goto L1e
            r1.next = r2
            java.lang.Thread r5 = r1.thread
            if (r5 != 0) goto L27
            goto L3
        L1e:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r3 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r5 = r3.casWaiters(r4, r5, r2)
            if (r5 != 0) goto L27
            goto L3
        L27:
            r5 = r2
            goto Lb
        L29:
            return
    }

    private java.lang.String userObjectToString(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L5
            java.lang.String r1 = "this future"
            return r1
        L5:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r4, java.util.concurrent.Executor r5) {
            r3 = this;
            checkNotNull(r4)
            checkNotNull(r5)
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r3.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r1 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            if (r0 == r1) goto L22
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Listener
            r1.<init>(r4, r5)
        L11:
            r1.next = r0
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r2 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r0 = r2.casListeners(r3, r0, r1)
            if (r0 == 0) goto L1c
            return
        L1c:
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r0 = r3.listeners
            androidx.concurrent.futures.AbstractResolvableFuture$Listener r2 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.TOMBSTONE
            if (r0 != r2) goto L11
        L22:
            executeListener(r4, r5)
            return
    }

    protected void afterDone() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r8) {
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L61
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L1f
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_INTERRUPTED
            goto L26
        L24:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.CAUSELESS_CANCELLED
        L26:
            r4 = r7
            r5 = r2
        L28:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r6 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r6 = r6.casValue(r4, r0, r3)
            if (r6 == 0) goto L59
            if (r8 == 0) goto L35
            r4.interruptTask()
        L35:
            complete(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r4 == 0) goto L62
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r0 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture
            if (r4 == 0) goto L55
            r4 = r0
            androidx.concurrent.futures.AbstractResolvableFuture r4 = (androidx.concurrent.futures.AbstractResolvableFuture) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4d
            r5 = r1
            goto L4e
        L4d:
            r5 = r2
        L4e:
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L62
            r5 = r1
            goto L28
        L55:
            r0.cancel(r8)
            goto L62
        L59:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r6 != 0) goto L28
            r1 = r5
            goto L62
        L61:
            r1 = r2
        L62:
            return r1
    }

    @Override // java.util.concurrent.Future
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L1a:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r6.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r3 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r0 == r3) goto L5a
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r3 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
            r3.<init>()
        L25:
            r3.setNext(r0)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r4 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r0 = r4.casWaiters(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L4b:
            r6.removeWaiter(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r0 = r6.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r4 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.value
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L1c2
            java.lang.Object r6 = r0.value
            r8 = 1
            if (r6 == 0) goto L17
            r9 = r8
            goto L18
        L17:
            r9 = 0
        L18:
            boolean r10 = r6 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r10 = r10 ^ r8
            r9 = r9 & r10
            if (r9 == 0) goto L23
            java.lang.Object r1 = r0.getDoneValue(r6)
            return r1
        L23:
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L2f
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 + r4
            goto L30
        L2f:
            r11 = r9
        L30:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L8b
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r6 = r0.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r15 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r6 == r15) goto L84
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r15 = new androidx.concurrent.futures.AbstractResolvableFuture$Waiter
            r15.<init>()
        L41:
            r15.setNext(r6)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r7 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r6 = r7.casWaiters(r0, r6, r15)
            if (r6 == 0) goto L7e
        L4c:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L75
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L5b
            r5 = r8
            goto L5c
        L5b:
            r5 = 0
        L5c:
            boolean r6 = r4 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L67
            java.lang.Object r1 = r0.getDoneValue(r4)
            return r1
        L67:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L4c
            r0.removeWaiter(r15)
            goto L8b
        L75:
            r0.removeWaiter(r15)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L7e:
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r6 = r0.waiters
            androidx.concurrent.futures.AbstractResolvableFuture$Waiter r7 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.TOMBSTONE
            if (r6 != r7) goto L41
        L84:
            java.lang.Object r1 = r0.value
            java.lang.Object r1 = r0.getDoneValue(r1)
            return r1
        L8b:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto Lb4
            java.lang.Object r4 = r0.value
            if (r4 == 0) goto L95
            r5 = r8
            goto L96
        L95:
            r5 = 0
        L96:
            boolean r6 = r4 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto La1
            java.lang.Object r1 = r0.getDoneValue(r4)
            return r1
        La1:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto Lae
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            goto L8b
        Lae:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        Lb4:
            java.lang.String r6 = r19.toString()
            java.lang.String r7 = r22.toString()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Waited "
            r11.<init>(r12)
            java.lang.StringBuilder r1 = r11.append(r1)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r11 = r22.toString()
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r12)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            long r11 = r4 + r13
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 >= 0) goto L186
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r1 = r11.append(r1)
            java.lang.String r11 = " (plus "
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            long r4 = -r4
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r3.convert(r4, r11)
            long r17 = r3.toNanos(r11)
            long r4 = r4 - r17
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 == 0) goto L117
            int r9 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r9 <= 0) goto L114
            goto L117
        L114:
            r16 = 0
            goto L119
        L117:
            r16 = r8
        L119:
            if (r3 <= 0) goto L15a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            if (r16 == 0) goto L149
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ","
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
        L149:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L15a:
            if (r16 == 0) goto L173
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " nanoseconds "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L173:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "delay)"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L186:
            boolean r2 = r19.isDone()
            if (r2 == 0) goto L1a5
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " but future completed as timeout expired"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L1a5:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " for "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L1c2:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    protected void interruptTask() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r3 = this;
            java.lang.Object r0 = r3.value
            r1 = 1
            if (r0 == 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r0 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r0 = r0 ^ r1
            r0 = r0 & r2
            return r0
    }

    final void maybePropagateCancellationTo(java.util.concurrent.Future<?> r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            boolean r1 = r2.isCancelled()
            r0 = r0 & r1
            if (r0 == 0) goto L13
            boolean r0 = r2.wasInterrupted()
            r3.cancel(r0)
        L13:
            return
    }

    protected java.lang.String pendingToString() {
            r3 = this;
            java.lang.Object r0 = r3.value
            boolean r1 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r1 == 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setFuture=["
            r1.<init>(r2)
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r0 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            java.lang.String r0 = r3.userObjectToString(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L24:
            boolean r0 = r3 instanceof java.util.concurrent.ScheduledFuture
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "remaining delay=["
            r0.<init>(r1)
            r1 = r3
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.getDelay(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ms]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L47:
            r0 = 0
            return r0
    }

    protected boolean set(V r3) {
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.Object r3 = androidx.concurrent.futures.AbstractResolvableFuture.NULL
        L4:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r0.casValue(r2, r1, r3)
            if (r3 == 0) goto L12
            complete(r2)
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    protected boolean setException(java.lang.Throwable r3) {
            r2 = this;
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r0 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure
            java.lang.Object r3 = checkNotNull(r3)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0.<init>(r3)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r3 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r1 = 0
            boolean r3 = r3.casValue(r2, r1, r0)
            if (r3 == 0) goto L19
            complete(r2)
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r6) {
            r5 = this;
            checkNotNull(r6)
            java.lang.Object r0 = r5.value
            r1 = 0
            if (r0 != 0) goto L45
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L21
            java.lang.Object r6 = getFutureValue(r6)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r0 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r6 = r0.casValue(r5, r3, r6)
            if (r6 == 0) goto L20
            complete(r5)
            return r2
        L20:
            return r1
        L21:
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r0 = new androidx.concurrent.futures.AbstractResolvableFuture$SetFuture
            r0.<init>(r5, r6)
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r4 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            boolean r3 = r4.casValue(r5, r3, r0)
            if (r3 == 0) goto L43
            androidx.concurrent.futures.DirectExecutor r1 = androidx.concurrent.futures.DirectExecutor.INSTANCE     // Catch: java.lang.Throwable -> L34
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L34
            goto L42
        L34:
            r6 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r1 = new androidx.concurrent.futures.AbstractResolvableFuture$Failure     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            androidx.concurrent.futures.AbstractResolvableFuture$Failure r1 = androidx.concurrent.futures.AbstractResolvableFuture.Failure.FALLBACK_INSTANCE
        L3d:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r6 = androidx.concurrent.futures.AbstractResolvableFuture.ATOMIC_HELPER
            r6.casValue(r5, r0, r1)
        L42:
            return r2
        L43:
            java.lang.Object r0 = r5.value
        L45:
            boolean r2 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r2 == 0) goto L50
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r0
            boolean r0 = r0.wasInterrupted
            r6.cancel(r0)
        L50:
            return r1
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[status="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r5.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L21
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto L69
        L21:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L2b
            r5.addDoneString(r0)
            goto L69
        L2b:
            java.lang.String r1 = r5.pendingToString()     // Catch: java.lang.RuntimeException -> L30
            goto L44
        L30:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception thrown from implementation: "
            r3.<init>(r4)
            java.lang.Class r1 = r1.getClass()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
        L44:
            if (r1 == 0) goto L5a
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L5a
            java.lang.String r3 = "PENDING, info=["
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r1 = r3.append(r1)
            r1.append(r2)
            goto L69
        L5a:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L64
            r5.addDoneString(r0)
            goto L69
        L64:
            java.lang.String r1 = "PENDING"
            r0.append(r1)
        L69:
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected final boolean wasInterrupted() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.Cancellation
            if (r1 == 0) goto Le
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r0 = (androidx.concurrent.futures.AbstractResolvableFuture.Cancellation) r0
            boolean r0 = r0.wasInterrupted
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
