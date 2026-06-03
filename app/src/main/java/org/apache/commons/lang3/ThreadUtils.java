package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadUtils {
    private static final java.util.function.Predicate<?> ALWAYS_TRUE = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.ThreadUtils.AlwaysTruePredicate ALWAYS_TRUE_PREDICATE = null;

    /* JADX INFO: renamed from: org.apache.commons.lang3.ThreadUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    @java.lang.Deprecated
    private static final class AlwaysTruePredicate implements org.apache.commons.lang3.ThreadUtils.ThreadPredicate, org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate {
        private AlwaysTruePredicate() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AlwaysTruePredicate(org.apache.commons.lang3.ThreadUtils.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(java.lang.Thread r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate
        public boolean test(java.lang.ThreadGroup r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    @java.lang.Deprecated
    public static class NamePredicate implements org.apache.commons.lang3.ThreadUtils.ThreadPredicate, org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate {
        private final java.lang.String name;

        public NamePredicate(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name"
                java.util.Objects.requireNonNull(r2, r0)
                r1.name = r2
                return
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(java.lang.Thread r2) {
                r1 = this;
                if (r2 == 0) goto L10
                java.lang.String r2 = r2.getName()
                java.lang.String r0 = r1.name
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate
        public boolean test(java.lang.ThreadGroup r2) {
                r1 = this;
                if (r2 == 0) goto L10
                java.lang.String r2 = r2.getName()
                java.lang.String r0 = r1.name
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface ThreadGroupPredicate {
        boolean test(java.lang.ThreadGroup r1);
    }

    @java.lang.Deprecated
    public static class ThreadIdPredicate implements org.apache.commons.lang3.ThreadUtils.ThreadPredicate {
        private final long threadId;

        public ThreadIdPredicate(long r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 <= 0) goto Lc
                r2.threadId = r3
                return
            Lc:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "The thread id must be greater than zero"
                r3.<init>(r4)
                throw r3
        }

        @Override // org.apache.commons.lang3.ThreadUtils.ThreadPredicate
        public boolean test(java.lang.Thread r5) {
                r4 = this;
                if (r5 == 0) goto Le
                long r0 = r5.getId()
                long r2 = r4.threadId
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto Le
                r5 = 1
                goto Lf
            Le:
                r5 = 0
            Lf:
                return r5
        }
    }

    @java.lang.FunctionalInterface
    @java.lang.Deprecated
    public interface ThreadPredicate {
        boolean test(java.lang.Thread r1);
    }

    public static /* synthetic */ java.lang.String $r8$lambda$YHL_QulH_KmQoivjQMLCmXNpvjA(java.lang.Thread r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$ZWB-HZH3FrAoAArz258k5khmiwY, reason: not valid java name */
    public static /* synthetic */ void m2660$r8$lambda$ZWBHZH3FrAoAArz258k5khmiwY(java.lang.Thread r0, long r1, int r3) {
            r0.join(r1, r3)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$Zgh5a8N9HEVvBkHP45WS-MYIpuk, reason: not valid java name */
    public static /* synthetic */ void m2661$r8$lambda$Zgh5a8N9HEVvBkHP45WSMYIpuk(long r0, int r2) {
            java.lang.Thread.sleep(r0, r2)
            return
    }

    public static /* synthetic */ java.lang.String $r8$lambda$cW5QU2KvH9grOgBBRsPdPTIqWzI(java.lang.ThreadGroup r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    static {
            org.apache.commons.lang3.ThreadUtils$AlwaysTruePredicate r0 = new org.apache.commons.lang3.ThreadUtils$AlwaysTruePredicate
            r1 = 0
            r0.<init>(r1)
            org.apache.commons.lang3.ThreadUtils.ALWAYS_TRUE_PREDICATE = r0
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.ThreadUtils.ALWAYS_TRUE = r0
            return
    }

    @java.lang.Deprecated
    public ThreadUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <T> java.util.function.Predicate<T> alwaysTruePredicate() {
            java.util.function.Predicate<?> r0 = org.apache.commons.lang3.ThreadUtils.ALWAYS_TRUE
            return r0
    }

    public static java.lang.Thread findThreadById(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L22
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda4 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda4
            r0.<init>(r2)
            java.util.Collection r2 = findThreads(r0)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L17
            r2 = 0
            goto L21
        L17:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            java.lang.Thread r2 = (java.lang.Thread) r2
        L21:
            return r2
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The thread id must be greater than zero"
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.Thread findThreadById(long r1, java.lang.String r3) {
            java.lang.String r0 = "threadGroupName"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.Thread r1 = findThreadById(r1)
            if (r1 == 0) goto L20
            java.lang.ThreadGroup r2 = r1.getThreadGroup()
            if (r2 == 0) goto L20
            java.lang.ThreadGroup r2 = r1.getThreadGroup()
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static java.lang.Thread findThreadById(long r1, java.lang.ThreadGroup r3) {
            java.lang.String r0 = "threadGroup"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.Thread r1 = findThreadById(r1)
            if (r1 == 0) goto L16
            java.lang.ThreadGroup r2 = r1.getThreadGroup()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L16
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(java.lang.ThreadGroup r3, boolean r4, java.util.function.Predicate<java.lang.ThreadGroup> r5) {
            java.lang.String r0 = "threadGroup"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "predicate"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r3.activeGroupCount()
        Le:
            int r1 = r0 / 2
            int r0 = r0 + r1
            int r0 = r0 + 1
            java.lang.ThreadGroup[] r1 = new java.lang.ThreadGroup[r0]
            int r2 = r3.enumerate(r1, r4)
            if (r2 >= r0) goto L37
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r1)
            long r0 = (long) r2
            java.util.stream.Stream r3 = r3.limit(r0)
            java.util.stream.Stream r3 = r3.filter(r5)
            java.util.stream.Collector r4 = java.util.stream.Collectors.toList()
            java.lang.Object r3 = r3.collect(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Collection r3 = java.util.Collections.unmodifiableCollection(r3)
            return r3
        L37:
            r0 = r2
            goto Le
    }

    @java.lang.Deprecated
    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(java.lang.ThreadGroup r1, boolean r2, org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate r3) {
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda1
            r0.<init>(r3)
            java.util.Collection r1 = findThreadGroups(r1, r2, r0)
            return r1
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(java.util.function.Predicate<java.lang.ThreadGroup> r2) {
            java.lang.ThreadGroup r0 = getSystemThreadGroup()
            r1 = 1
            java.util.Collection r2 = findThreadGroups(r0, r1, r2)
            return r2
    }

    @java.lang.Deprecated
    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroups(org.apache.commons.lang3.ThreadUtils.ThreadGroupPredicate r2) {
            java.lang.ThreadGroup r0 = getSystemThreadGroup()
            r1 = 1
            java.util.Collection r2 = findThreadGroups(r0, r1, r2)
            return r2
    }

    public static java.util.Collection<java.lang.ThreadGroup> findThreadGroupsByName(java.lang.String r0) {
            java.util.function.Predicate r0 = predicateThreadGroup(r0)
            java.util.Collection r0 = findThreadGroups(r0)
            return r0
    }

    public static java.util.Collection<java.lang.Thread> findThreads(java.lang.ThreadGroup r3, boolean r4, java.util.function.Predicate<java.lang.Thread> r5) {
            java.lang.String r0 = "The group must not be null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "The predicate must not be null"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r3.activeCount()
        Le:
            int r1 = r0 / 2
            int r0 = r0 + r1
            int r0 = r0 + 1
            java.lang.Thread[] r1 = new java.lang.Thread[r0]
            int r2 = r3.enumerate(r1, r4)
            if (r2 >= r0) goto L37
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r1)
            long r0 = (long) r2
            java.util.stream.Stream r3 = r3.limit(r0)
            java.util.stream.Stream r3 = r3.filter(r5)
            java.util.stream.Collector r4 = java.util.stream.Collectors.toList()
            java.lang.Object r3 = r3.collect(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Collection r3 = java.util.Collections.unmodifiableCollection(r3)
            return r3
        L37:
            r0 = r2
            goto Le
    }

    @java.lang.Deprecated
    public static java.util.Collection<java.lang.Thread> findThreads(java.lang.ThreadGroup r1, boolean r2, org.apache.commons.lang3.ThreadUtils.ThreadPredicate r3) {
            java.util.Objects.requireNonNull(r3)
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda7 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda7
            r0.<init>(r3)
            java.util.Collection r1 = findThreads(r1, r2, r0)
            return r1
    }

    public static java.util.Collection<java.lang.Thread> findThreads(java.util.function.Predicate<java.lang.Thread> r2) {
            java.lang.ThreadGroup r0 = getSystemThreadGroup()
            r1 = 1
            java.util.Collection r2 = findThreads(r0, r1, r2)
            return r2
    }

    @java.lang.Deprecated
    public static java.util.Collection<java.lang.Thread> findThreads(org.apache.commons.lang3.ThreadUtils.ThreadPredicate r2) {
            java.lang.ThreadGroup r0 = getSystemThreadGroup()
            r1 = 1
            java.util.Collection r2 = findThreads(r0, r1, r2)
            return r2
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String r0) {
            java.util.function.Predicate r0 = predicateThread(r0)
            java.util.Collection r0 = findThreads(r0)
            return r0
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "threadName"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "threadGroupName"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.function.Predicate r2 = predicateThreadGroup(r2)
            java.util.Collection r2 = findThreadGroups(r2)
            java.util.stream.Stream r2 = r2.stream()
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda5 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda5
            r0.<init>(r1)
            java.util.stream.Stream r1 = r2.flatMap(r0)
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Collection r1 = java.util.Collections.unmodifiableCollection(r1)
            return r1
    }

    public static java.util.Collection<java.lang.Thread> findThreadsByName(java.lang.String r1, java.lang.ThreadGroup r2) {
            r0 = 0
            java.util.function.Predicate r1 = predicateThread(r1)
            java.util.Collection r1 = findThreads(r2, r0, r1)
            return r1
    }

    public static java.util.Collection<java.lang.ThreadGroup> getAllThreadGroups() {
            java.util.function.Predicate r0 = alwaysTruePredicate()
            java.util.Collection r0 = findThreadGroups(r0)
            return r0
    }

    public static java.util.Collection<java.lang.Thread> getAllThreads() {
            java.util.function.Predicate r0 = alwaysTruePredicate()
            java.util.Collection r0 = findThreads(r0)
            return r0
    }

    public static java.lang.ThreadGroup getSystemThreadGroup() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r0 = r0.getThreadGroup()
        L8:
            if (r0 == 0) goto L15
            java.lang.ThreadGroup r1 = r0.getParent()
            if (r1 == 0) goto L15
            java.lang.ThreadGroup r0 = r0.getParent()
            goto L8
        L15:
            return r0
    }

    public static void join(java.lang.Thread r1, java.time.Duration r2) throws java.lang.InterruptedException {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda3
            r0.<init>(r1)
            org.apache.commons.lang3.time.DurationUtils.accept(r0, r2)
            return
    }

    static /* synthetic */ boolean lambda$findThreadById$1(long r2, java.lang.Thread r4) {
            if (r4 == 0) goto Lc
            long r0 = r4.getId()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    static /* synthetic */ java.util.stream.Stream lambda$findThreadsByName$2(java.lang.String r1, java.lang.ThreadGroup r2) {
            r0 = 0
            java.util.function.Predicate r1 = predicateThread(r1)
            java.util.Collection r1 = findThreads(r2, r0, r1)
            java.util.stream.Stream r1 = r1.stream()
            return r1
    }

    static /* synthetic */ boolean lambda$namePredicate$3(java.util.function.Function r0, java.lang.String r1, java.lang.Object r2) {
            if (r2 == 0) goto L12
            java.lang.Object r0 = r0.apply(r2)
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    static /* synthetic */ boolean lambda$static$0(java.lang.Object r0) {
            r0 = 1
            return r0
    }

    private static <T> java.util.function.Predicate<T> namePredicate(java.lang.String r1, java.util.function.Function<T, java.lang.String> r2) {
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda9 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda9
            r0.<init>(r2, r1)
            return r0
    }

    private static java.util.function.Predicate<java.lang.Thread> predicateThread(java.lang.String r1) {
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda8 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda8
            r0.<init>()
            java.util.function.Predicate r1 = namePredicate(r1, r0)
            return r1
    }

    private static java.util.function.Predicate<java.lang.ThreadGroup> predicateThreadGroup(java.lang.String r1) {
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda6 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda6
            r0.<init>()
            java.util.function.Predicate r1 = namePredicate(r1, r0)
            return r1
    }

    public static void sleep(java.time.Duration r1) throws java.lang.InterruptedException {
            org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.ThreadUtils$$ExternalSyntheticLambda2
            r0.<init>()
            org.apache.commons.lang3.time.DurationUtils.accept(r0, r1)
            return
    }

    public static void sleepQuietly(java.time.Duration r0) {
            sleep(r0)     // Catch: java.lang.InterruptedException -> L3
        L3:
            return
    }
}
