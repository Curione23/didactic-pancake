package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class BasicThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.Boolean daemon;
    private final java.lang.String namingPattern;
    private final java.lang.Integer priority;
    private final java.util.concurrent.atomic.AtomicLong threadCounter;
    private final java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
    private final java.util.concurrent.ThreadFactory wrappedFactory;

    /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.BasicThreadFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder implements org.apache.commons.lang3.builder.Builder<org.apache.commons.lang3.concurrent.BasicThreadFactory> {
        private java.lang.Boolean daemon;
        private java.lang.Thread.UncaughtExceptionHandler exceptionHandler;
        private java.util.concurrent.ThreadFactory factory;
        private java.lang.String namingPattern;
        private java.lang.Integer priority;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.concurrent.ThreadFactory access$100(org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder r0) {
                java.util.concurrent.ThreadFactory r0 = r0.factory
                return r0
        }

        static /* synthetic */ java.lang.String access$200(org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder r0) {
                java.lang.String r0 = r0.namingPattern
                return r0
        }

        static /* synthetic */ java.lang.Integer access$300(org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder r0) {
                java.lang.Integer r0 = r0.priority
                return r0
        }

        static /* synthetic */ java.lang.Boolean access$400(org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder r0) {
                java.lang.Boolean r0 = r0.daemon
                return r0
        }

        static /* synthetic */ java.lang.Thread.UncaughtExceptionHandler access$500(org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder r0) {
                java.lang.Thread$UncaughtExceptionHandler r0 = r0.exceptionHandler
                return r0
        }

        @Override // org.apache.commons.lang3.builder.Builder
        public /* bridge */ /* synthetic */ org.apache.commons.lang3.concurrent.BasicThreadFactory build() {
                r1 = this;
                org.apache.commons.lang3.concurrent.BasicThreadFactory r0 = r1.build2()
                return r0
        }

        @Override // org.apache.commons.lang3.builder.Builder
        /* JADX INFO: renamed from: build, reason: avoid collision after fix types in other method */
        public org.apache.commons.lang3.concurrent.BasicThreadFactory build2() {
                r2 = this;
                org.apache.commons.lang3.concurrent.BasicThreadFactory r0 = new org.apache.commons.lang3.concurrent.BasicThreadFactory
                r1 = 0
                r0.<init>(r2, r1)
                r2.reset()
                return r0
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder daemon(boolean r1) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.daemon = r1
                return r0
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder namingPattern(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "pattern"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.lang.String r2 = (java.lang.String) r2
                r1.namingPattern = r2
                return r1
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder priority(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.priority = r1
                return r0
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.factory = r0
                r1.exceptionHandler = r0
                r1.namingPattern = r0
                r1.priority = r0
                r1.daemon = r0
                return
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder uncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler r2) {
                r1 = this;
                java.lang.String r0 = "handler"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.lang.Thread$UncaughtExceptionHandler r2 = (java.lang.Thread.UncaughtExceptionHandler) r2
                r1.exceptionHandler = r2
                return r1
        }

        public org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder wrappedFactory(java.util.concurrent.ThreadFactory r2) {
                r1 = this;
                java.lang.String r0 = "factory"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.util.concurrent.ThreadFactory r2 = (java.util.concurrent.ThreadFactory) r2
                r1.factory = r2
                return r1
        }
    }

    private BasicThreadFactory(org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ThreadFactory r0 = org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.access$100(r2)
            if (r0 == 0) goto Le
            java.util.concurrent.ThreadFactory r0 = org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.access$100(r2)
            goto L12
        Le:
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
        L12:
            r1.wrappedFactory = r0
            java.lang.String r0 = org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.access$200(r2)
            r1.namingPattern = r0
            java.lang.Integer r0 = org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.access$300(r2)
            r1.priority = r0
            java.lang.Boolean r0 = org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.access$400(r2)
            r1.daemon = r0
            java.lang.Thread$UncaughtExceptionHandler r2 = org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder.access$500(r2)
            r1.uncaughtExceptionHandler = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r1.threadCounter = r2
            return
    }

    /* synthetic */ BasicThreadFactory(org.apache.commons.lang3.concurrent.BasicThreadFactory.Builder r1, org.apache.commons.lang3.concurrent.BasicThreadFactory.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void initializeThread(java.lang.Thread r3) {
            r2 = this;
            java.lang.String r0 = r2.getNamingPattern()
            if (r0 == 0) goto L1f
            java.util.concurrent.atomic.AtomicLong r0 = r2.threadCounter
            long r0 = r0.incrementAndGet()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r2.getNamingPattern()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.setName(r0)
        L1f:
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.getUncaughtExceptionHandler()
            if (r0 == 0) goto L2c
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.getUncaughtExceptionHandler()
            r3.setUncaughtExceptionHandler(r0)
        L2c:
            java.lang.Integer r0 = r2.getPriority()
            if (r0 == 0) goto L3d
            java.lang.Integer r0 = r2.getPriority()
            int r0 = r0.intValue()
            r3.setPriority(r0)
        L3d:
            java.lang.Boolean r0 = r2.getDaemonFlag()
            if (r0 == 0) goto L4e
            java.lang.Boolean r0 = r2.getDaemonFlag()
            boolean r0 = r0.booleanValue()
            r3.setDaemon(r0)
        L4e:
            return
    }

    public final java.lang.Boolean getDaemonFlag() {
            r1 = this;
            java.lang.Boolean r0 = r1.daemon
            return r0
    }

    public final java.lang.String getNamingPattern() {
            r1 = this;
            java.lang.String r0 = r1.namingPattern
            return r0
    }

    public final java.lang.Integer getPriority() {
            r1 = this;
            java.lang.Integer r0 = r1.priority
            return r0
    }

    public long getThreadCount() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.threadCounter
            long r0 = r0.get()
            return r0
    }

    public final java.lang.Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
            r1 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.uncaughtExceptionHandler
            return r0
    }

    public final java.util.concurrent.ThreadFactory getWrappedFactory() {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = r1.wrappedFactory
            return r0
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = r1.getWrappedFactory()
            java.lang.Thread r2 = r0.newThread(r2)
            r1.initializeThread(r2)
            return r2
    }
}
