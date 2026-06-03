package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public class EventCountCircuitBreaker extends org.apache.commons.lang3.concurrent.AbstractCircuitBreaker<java.lang.Integer> {
    private static final java.util.Map<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy> STRATEGY_MAP = null;
    private final java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData> checkIntervalData;
    private final long closingInterval;
    private final int closingThreshold;
    private final long openingInterval;
    private final int openingThreshold;

    /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class CheckIntervalData {
        private final long checkIntervalStart;
        private final int eventCount;

        CheckIntervalData(int r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.eventCount = r1
                r0.checkIntervalStart = r2
                return
        }

        public long getCheckIntervalStart() {
                r2 = this;
                long r0 = r2.checkIntervalStart
                return r0
        }

        public int getEventCount() {
                r1 = this;
                int r0 = r1.eventCount
                return r0
        }

        public org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData increment(int r5) {
                r4 = this;
                if (r5 != 0) goto L4
                r0 = r4
                goto L12
            L4:
                org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r0 = new org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData
                int r1 = r4.getEventCount()
                int r1 = r1 + r5
                long r2 = r4.getCheckIntervalStart()
                r0.<init>(r1, r2)
            L12:
                return r0
        }
    }

    private static abstract class StateStrategy {
        private StateStrategy() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ StateStrategy(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        protected abstract long fetchCheckInterval(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker r1);

        public boolean isCheckIntervalFinished(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker r3, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r4, long r5) {
                r2 = this;
                long r0 = r4.getCheckIntervalStart()
                long r5 = r5 - r0
                long r3 = r2.fetchCheckInterval(r3)
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 <= 0) goto Lf
                r3 = 1
                goto L10
            Lf:
                r3 = 0
            L10:
                return r3
        }

        public abstract boolean isStateTransition(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker r1, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r2, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r3);
    }

    private static final class StateStrategyClosed extends org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy {
        private StateStrategyClosed() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ StateStrategyClosed(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy
        protected long fetchCheckInterval(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker r3) {
                r2 = this;
                long r0 = r3.getOpeningInterval()
                return r0
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy
        public boolean isStateTransition(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker r1, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r2, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r3) {
                r0 = this;
                int r2 = r3.getEventCount()
                int r1 = r1.getOpeningThreshold()
                if (r2 <= r1) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    private static final class StateStrategyOpen extends org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy {
        private StateStrategyOpen() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ StateStrategyOpen(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy
        protected long fetchCheckInterval(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker r3) {
                r2 = this;
                long r0 = r3.getClosingInterval()
                return r0
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy
        public boolean isStateTransition(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker r5, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r6, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r7) {
                r4 = this;
                long r0 = r7.getCheckIntervalStart()
                long r2 = r6.getCheckIntervalStart()
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 == 0) goto L18
                int r6 = r6.getEventCount()
                int r5 = r5.getClosingThreshold()
                if (r6 >= r5) goto L18
                r5 = 1
                goto L19
            L18:
                r5 = 0
            L19:
                return r5
        }
    }

    static {
            java.util.Map r0 = createStrategyMap()
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.STRATEGY_MAP = r0
            return
    }

    public EventCountCircuitBreaker(int r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r7
            r0.<init>(r1, r2, r4, r5)
            return
    }

    public EventCountCircuitBreaker(int r10, long r11, java.util.concurrent.TimeUnit r13, int r14) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r11
            r8 = r13
            r0.<init>(r1, r2, r4, r5, r6, r8)
            return
    }

    public EventCountCircuitBreaker(int r6, long r7, java.util.concurrent.TimeUnit r9, int r10, long r11, java.util.concurrent.TimeUnit r13) {
            r5 = this;
            r5.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r1 = new org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r5.checkIntervalData = r0
            r5.openingThreshold = r6
            long r6 = r9.toNanos(r7)
            r5.openingInterval = r6
            r5.closingThreshold = r10
            long r6 = r13.toNanos(r11)
            r5.closingInterval = r6
            return
    }

    private void changeStateAndStartNewCheckInterval(org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State r5) {
            r4 = this;
            r4.changeState(r5)
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData> r5 = r4.checkIntervalData
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r0 = new org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData
            r1 = 0
            long r2 = r4.nanoTime()
            r0.<init>(r1, r2)
            r5.set(r0)
            return
    }

    private static java.util.Map<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy> createStrategyMap() {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State> r1 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.class
            r0.<init>(r1)
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r1 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.CLOSED
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$StateStrategyClosed r2 = new org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$StateStrategyClosed
            r3 = 0
            r2.<init>(r3)
            r0.put(r1, r2)
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r1 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.OPEN
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$StateStrategyOpen r2 = new org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$StateStrategyOpen
            r2.<init>(r3)
            r0.put(r1, r2)
            return r0
    }

    private org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData nextCheckIntervalData(int r1, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r2, org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State r3, long r4) {
            r0 = this;
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$StateStrategy r3 = stateStrategy(r3)
            boolean r3 = r3.isCheckIntervalFinished(r0, r2, r4)
            if (r3 == 0) goto L10
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r2 = new org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData
            r2.<init>(r1, r4)
            goto L14
        L10:
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r2 = r2.increment(r1)
        L14:
            return r2
    }

    private boolean performStateCheck(int r9) {
            r8 = this;
        L0:
            long r4 = r8.nanoTime()
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State> r0 = r8.state
            java.lang.Object r0 = r0.get()
            r6 = r0
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r6 = (org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State) r6
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData> r0 = r8.checkIntervalData
            java.lang.Object r0 = r0.get()
            r7 = r0
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r7 = (org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData) r7
            r0 = r8
            r1 = r9
            r2 = r7
            r3 = r6
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r0 = r0.nextCheckIntervalData(r1, r2, r3, r4)
            boolean r1 = r8.updateCheckIntervalData(r7, r0)
            if (r1 == 0) goto L0
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$StateStrategy r9 = stateStrategy(r6)
            boolean r9 = r9.isStateTransition(r8, r7, r0)
            if (r9 == 0) goto L35
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r6 = r6.oppositeState()
            r8.changeStateAndStartNewCheckInterval(r6)
        L35:
            boolean r9 = isOpen(r6)
            r9 = r9 ^ 1
            return r9
    }

    private static org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy stateStrategy(org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State r1) {
            java.util.Map<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$StateStrategy> r0 = org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.STRATEGY_MAP
            java.lang.Object r1 = r0.get(r1)
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$StateStrategy r1 = (org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy) r1
            return r1
    }

    private boolean updateCheckIntervalData(org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r2, org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.CheckIntervalData r3) {
            r1 = this;
            if (r2 == r3) goto Ld
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData> r0 = r1.checkIntervalData
            boolean r2 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r3)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean checkState() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.performStateCheck(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void close() {
            r5 = this;
            super.close()
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData> r0 = r5.checkIntervalData
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r1 = new org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData
            r2 = 0
            long r3 = r5.nanoTime()
            r1.<init>(r2, r3)
            r0.set(r1)
            return
    }

    public long getClosingInterval() {
            r2 = this;
            long r0 = r2.closingInterval
            return r0
    }

    public int getClosingThreshold() {
            r1 = this;
            int r0 = r1.closingThreshold
            return r0
    }

    public long getOpeningInterval() {
            r2 = this;
            long r0 = r2.openingInterval
            return r0
    }

    public int getOpeningThreshold() {
            r1 = this;
            int r0 = r1.openingThreshold
            return r0
    }

    public boolean incrementAndCheckState() {
            r1 = this;
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.incrementAndCheckState(r0)
            return r0
    }

    public boolean incrementAndCheckState(java.lang.Integer r1) {
            r0 = this;
            int r1 = r1.intValue()
            boolean r1 = r0.performStateCheck(r1)
            return r1
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public /* bridge */ /* synthetic */ boolean incrementAndCheckState(java.lang.Object r1) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            boolean r1 = r0.incrementAndCheckState(r1)
            return r1
    }

    long nanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void open() {
            r5 = this;
            super.open()
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData> r0 = r5.checkIntervalData
            org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData r1 = new org.apache.commons.lang3.concurrent.EventCountCircuitBreaker$CheckIntervalData
            r2 = 0
            long r3 = r5.nanoTime()
            r1.<init>(r2, r3)
            r0.set(r1)
            return
    }
}
