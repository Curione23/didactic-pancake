package org.apache.commons.lang3.concurrent.locks;

/* JADX INFO: loaded from: classes2.dex */
public class LockingVisitors {

    public static class LockVisitor<O, L> {
        private final L lock;
        private final O object;
        private final java.util.function.Supplier<java.util.concurrent.locks.Lock> readLockSupplier;
        private final java.util.function.Supplier<java.util.concurrent.locks.Lock> writeLockSupplier;

        protected LockVisitor(O r2, L r3, java.util.function.Supplier<java.util.concurrent.locks.Lock> r4, java.util.function.Supplier<java.util.concurrent.locks.Lock> r5) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "object"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                r1.object = r2
                java.lang.String r2 = "lock"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r3, r2)
                r1.lock = r2
                java.lang.String r2 = "readLockSupplier"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r4, r2)
                java.util.function.Supplier r2 = (java.util.function.Supplier) r2
                r1.readLockSupplier = r2
                java.lang.String r2 = "writeLockSupplier"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r5, r2)
                java.util.function.Supplier r2 = (java.util.function.Supplier) r2
                r1.writeLockSupplier = r2
                return
        }

        public void acceptReadLocked(org.apache.commons.lang3.function.FailableConsumer<O, ?> r2) {
                r1 = this;
                java.util.function.Supplier<java.util.concurrent.locks.Lock> r0 = r1.readLockSupplier
                r1.lockAcceptUnlock(r0, r2)
                return
        }

        public void acceptWriteLocked(org.apache.commons.lang3.function.FailableConsumer<O, ?> r2) {
                r1 = this;
                java.util.function.Supplier<java.util.concurrent.locks.Lock> r0 = r1.writeLockSupplier
                r1.lockAcceptUnlock(r0, r2)
                return
        }

        public <T> T applyReadLocked(org.apache.commons.lang3.function.FailableFunction<O, T, ?> r2) {
                r1 = this;
                java.util.function.Supplier<java.util.concurrent.locks.Lock> r0 = r1.readLockSupplier
                java.lang.Object r2 = r1.lockApplyUnlock(r0, r2)
                return r2
        }

        public <T> T applyWriteLocked(org.apache.commons.lang3.function.FailableFunction<O, T, ?> r2) {
                r1 = this;
                java.util.function.Supplier<java.util.concurrent.locks.Lock> r0 = r1.writeLockSupplier
                java.lang.Object r2 = r1.lockApplyUnlock(r0, r2)
                return r2
        }

        public L getLock() {
                r1 = this;
                L r0 = r1.lock
                return r0
        }

        public O getObject() {
                r1 = this;
                O r0 = r1.object
                return r0
        }

        protected void lockAcceptUnlock(java.util.function.Supplier<java.util.concurrent.locks.Lock> r2, org.apache.commons.lang3.function.FailableConsumer<O, ?> r3) {
                r1 = this;
                java.lang.Object r2 = org.apache.commons.lang3.function.Suppliers.get(r2)
                java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
                java.lang.String r0 = "lock"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
                r2.lock()
                if (r3 == 0) goto L24
                O r0 = r1.object     // Catch: java.lang.Throwable -> L19
                r3.accept(r0)     // Catch: java.lang.Throwable -> L19
                goto L24
            L19:
                r3 = move-exception
                java.lang.RuntimeException r3 = org.apache.commons.lang3.function.Failable.rethrow(r3)     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r2.unlock()
                throw r3
            L24:
                r2.unlock()
                return
        }

        protected <T> T lockApplyUnlock(java.util.function.Supplier<java.util.concurrent.locks.Lock> r2, org.apache.commons.lang3.function.FailableFunction<O, T, ?> r3) {
                r1 = this;
                java.lang.Object r2 = org.apache.commons.lang3.function.Suppliers.get(r2)
                java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
                java.lang.String r0 = "lock"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
                r2.lock()
                O r0 = r1.object     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r3 = r3.apply(r0)     // Catch: java.lang.Throwable -> L1b
                r2.unlock()
                return r3
            L1b:
                r3 = move-exception
                java.lang.RuntimeException r3 = org.apache.commons.lang3.function.Failable.rethrow(r3)     // Catch: java.lang.Throwable -> L21
                throw r3     // Catch: java.lang.Throwable -> L21
            L21:
                r3 = move-exception
                r2.unlock()
                throw r3
        }
    }

    public static class ReadWriteLockVisitor<O> extends org.apache.commons.lang3.concurrent.locks.LockingVisitors.LockVisitor<O, java.util.concurrent.locks.ReadWriteLock> {
        protected ReadWriteLockVisitor(O r3, java.util.concurrent.locks.ReadWriteLock r4) {
                r2 = this;
                java.util.Objects.requireNonNull(r4)
                org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor$$ExternalSyntheticLambda0
                r0.<init>(r4)
                java.util.Objects.requireNonNull(r4)
                org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor$$ExternalSyntheticLambda1 r1 = new org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor$$ExternalSyntheticLambda1
                r1.<init>(r4)
                r2.<init>(r3, r4, r0, r1)
                return
        }
    }

    public static class StampedLockVisitor<O> extends org.apache.commons.lang3.concurrent.locks.LockingVisitors.LockVisitor<O, java.util.concurrent.locks.StampedLock> {
        /* JADX INFO: renamed from: $r8$lambda$ayPvuO-7CeOO4n0U281qvN6qXZg, reason: not valid java name */
        public static /* synthetic */ java.util.concurrent.locks.Lock m2666$r8$lambda$ayPvuO7CeOO4n0U281qvN6qXZg(java.util.concurrent.locks.StampedLock r0) {
                java.util.concurrent.locks.Lock r0 = r0.asReadLock()
                return r0
        }

        /* JADX INFO: renamed from: $r8$lambda$jXi-BdbXGi1SaTTARcYIPNGfwrs, reason: not valid java name */
        public static /* synthetic */ java.util.concurrent.locks.Lock m2667$r8$lambda$jXiBdbXGi1SaTTARcYIPNGfwrs(java.util.concurrent.locks.StampedLock r0) {
                java.util.concurrent.locks.Lock r0 = r0.asWriteLock()
                return r0
        }

        protected StampedLockVisitor(O r3, java.util.concurrent.locks.StampedLock r4) {
                r2 = this;
                java.util.Objects.requireNonNull(r4)
                org.apache.commons.lang3.concurrent.locks.LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.concurrent.locks.LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda0
                r0.<init>(r4)
                java.util.Objects.requireNonNull(r4)
                org.apache.commons.lang3.concurrent.locks.LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda1 r1 = new org.apache.commons.lang3.concurrent.locks.LockingVisitors$StampedLockVisitor$$ExternalSyntheticLambda1
                r1.<init>(r4)
                r2.<init>(r3, r4, r0, r1)
                return
        }
    }

    @java.lang.Deprecated
    public LockingVisitors() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <O> org.apache.commons.lang3.concurrent.locks.LockingVisitors.ReadWriteLockVisitor<O> create(O r1, java.util.concurrent.locks.ReadWriteLock r2) {
            org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor r0 = new org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor
            r0.<init>(r1, r2)
            return r0
    }

    public static <O> org.apache.commons.lang3.concurrent.locks.LockingVisitors.ReadWriteLockVisitor<O> reentrantReadWriteLockVisitor(O r1) {
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            org.apache.commons.lang3.concurrent.locks.LockingVisitors$ReadWriteLockVisitor r1 = create(r1, r0)
            return r1
    }

    public static <O> org.apache.commons.lang3.concurrent.locks.LockingVisitors.StampedLockVisitor<O> stampedLockVisitor(O r2) {
            org.apache.commons.lang3.concurrent.locks.LockingVisitors$StampedLockVisitor r0 = new org.apache.commons.lang3.concurrent.locks.LockingVisitors$StampedLockVisitor
            java.util.concurrent.locks.StampedLock r1 = new java.util.concurrent.locks.StampedLock
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }
}
