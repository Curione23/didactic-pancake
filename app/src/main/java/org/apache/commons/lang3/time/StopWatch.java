package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class StopWatch {
    private static final long NANO_2_MILLIS = 1000000;
    private final java.lang.String message;
    private org.apache.commons.lang3.time.StopWatch.State runningState;
    private org.apache.commons.lang3.time.StopWatch.SplitState splitState;
    private java.time.Instant startInstant;
    private long startTimeNanos;
    private java.time.Instant stopInstant;
    private long stopTimeNanos;

    /* JADX INFO: renamed from: org.apache.commons.lang3.time.StopWatch$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private enum SplitState extends java.lang.Enum<org.apache.commons.lang3.time.StopWatch.SplitState> {
        private static final /* synthetic */ org.apache.commons.lang3.time.StopWatch.SplitState[] $VALUES = null;
        public static final org.apache.commons.lang3.time.StopWatch.SplitState SPLIT = null;
        public static final org.apache.commons.lang3.time.StopWatch.SplitState UNSPLIT = null;

        private static /* synthetic */ org.apache.commons.lang3.time.StopWatch.SplitState[] $values() {
                org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT
                org.apache.commons.lang3.time.StopWatch$SplitState r1 = org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT
                org.apache.commons.lang3.time.StopWatch$SplitState[] r0 = new org.apache.commons.lang3.time.StopWatch.SplitState[]{r0, r1}
                return r0
        }

        static {
                org.apache.commons.lang3.time.StopWatch$SplitState r0 = new org.apache.commons.lang3.time.StopWatch$SplitState
                java.lang.String r1 = "SPLIT"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT = r0
                org.apache.commons.lang3.time.StopWatch$SplitState r0 = new org.apache.commons.lang3.time.StopWatch$SplitState
                java.lang.String r1 = "UNSPLIT"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT = r0
                org.apache.commons.lang3.time.StopWatch$SplitState[] r0 = $values()
                org.apache.commons.lang3.time.StopWatch.SplitState.$VALUES = r0
                return
        }

        SplitState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.time.StopWatch.SplitState valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.time.StopWatch$SplitState> r0 = org.apache.commons.lang3.time.StopWatch.SplitState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.time.StopWatch$SplitState r1 = (org.apache.commons.lang3.time.StopWatch.SplitState) r1
                return r1
        }

        public static org.apache.commons.lang3.time.StopWatch.SplitState[] values() {
                org.apache.commons.lang3.time.StopWatch$SplitState[] r0 = org.apache.commons.lang3.time.StopWatch.SplitState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.time.StopWatch$SplitState[] r0 = (org.apache.commons.lang3.time.StopWatch.SplitState[]) r0
                return r0
        }
    }

    private enum State extends java.lang.Enum<org.apache.commons.lang3.time.StopWatch.State> {
        private static final /* synthetic */ org.apache.commons.lang3.time.StopWatch.State[] $VALUES = null;
        public static final org.apache.commons.lang3.time.StopWatch.State RUNNING = null;
        public static final org.apache.commons.lang3.time.StopWatch.State STOPPED = null;
        public static final org.apache.commons.lang3.time.StopWatch.State SUSPENDED = null;
        public static final org.apache.commons.lang3.time.StopWatch.State UNSTARTED = null;





        private static /* synthetic */ org.apache.commons.lang3.time.StopWatch.State[] $values() {
                org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
                org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.STOPPED
                org.apache.commons.lang3.time.StopWatch$State r2 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
                org.apache.commons.lang3.time.StopWatch$State r3 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
                org.apache.commons.lang3.time.StopWatch$State[] r0 = new org.apache.commons.lang3.time.StopWatch.State[]{r0, r1, r2, r3}
                return r0
        }

        static {
                org.apache.commons.lang3.time.StopWatch$State$1 r0 = new org.apache.commons.lang3.time.StopWatch$State$1
                java.lang.String r1 = "RUNNING"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.StopWatch.State.RUNNING = r0
                org.apache.commons.lang3.time.StopWatch$State$2 r0 = new org.apache.commons.lang3.time.StopWatch$State$2
                java.lang.String r1 = "STOPPED"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.StopWatch.State.STOPPED = r0
                org.apache.commons.lang3.time.StopWatch$State$3 r0 = new org.apache.commons.lang3.time.StopWatch$State$3
                java.lang.String r1 = "SUSPENDED"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.StopWatch.State.SUSPENDED = r0
                org.apache.commons.lang3.time.StopWatch$State$4 r0 = new org.apache.commons.lang3.time.StopWatch$State$4
                java.lang.String r1 = "UNSTARTED"
                r2 = 3
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.StopWatch.State.UNSTARTED = r0
                org.apache.commons.lang3.time.StopWatch$State[] r0 = $values()
                org.apache.commons.lang3.time.StopWatch.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ State(java.lang.String r1, int r2, org.apache.commons.lang3.time.StopWatch.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.time.StopWatch.State valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.time.StopWatch$State> r0 = org.apache.commons.lang3.time.StopWatch.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.time.StopWatch$State r1 = (org.apache.commons.lang3.time.StopWatch.State) r1
                return r1
        }

        public static org.apache.commons.lang3.time.StopWatch.State[] values() {
                org.apache.commons.lang3.time.StopWatch$State[] r0 = org.apache.commons.lang3.time.StopWatch.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.time.StopWatch$State[] r0 = (org.apache.commons.lang3.time.StopWatch.State[]) r0
                return r0
        }

        abstract boolean isStarted();

        abstract boolean isStopped();

        abstract boolean isSuspended();
    }

    public StopWatch() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public StopWatch(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            r1.runningState = r0
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT
            r1.splitState = r0
            r1.message = r2
            return
    }

    public static org.apache.commons.lang3.time.StopWatch create() {
            org.apache.commons.lang3.time.StopWatch r0 = new org.apache.commons.lang3.time.StopWatch
            r0.<init>()
            return r0
    }

    public static org.apache.commons.lang3.time.StopWatch createStarted() {
            org.apache.commons.lang3.time.StopWatch r0 = new org.apache.commons.lang3.time.StopWatch
            r0.<init>()
            r0.start()
            return r0
    }

    private long nanosToMillis(long r3) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r0
            return r3
    }

    public java.lang.String formatSplitTime() {
            r2 = this;
            java.time.Duration r0 = r2.getSplitDuration()
            long r0 = r0.toMillis()
            java.lang.String r0 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(r0)
            return r0
    }

    public java.lang.String formatTime() {
            r2 = this;
            long r0 = r2.getTime()
            java.lang.String r0 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(r0)
            return r0
    }

    public java.time.Duration getDuration() {
            r2 = this;
            long r0 = r2.getNanoTime()
            java.time.Duration r0 = java.time.Duration.ofNanos(r0)
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public long getNanoTime() {
            r4 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r4.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.STOPPED
            if (r0 == r1) goto L2c
            org.apache.commons.lang3.time.StopWatch$State r0 = r4.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
            if (r0 != r1) goto Ld
            goto L2c
        Ld:
            org.apache.commons.lang3.time.StopWatch$State r0 = r4.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            if (r0 != r1) goto L16
            r0 = 0
            return r0
        L16:
            org.apache.commons.lang3.time.StopWatch$State r0 = r4.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 != r1) goto L24
            long r0 = java.lang.System.nanoTime()
            long r2 = r4.startTimeNanos
        L22:
            long r0 = r0 - r2
            return r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Illegal running state has occurred."
            r0.<init>(r1)
            throw r0
        L2c:
            long r0 = r4.stopTimeNanos
            long r2 = r4.startTimeNanos
            goto L22
    }

    public java.time.Duration getSplitDuration() {
            r2 = this;
            long r0 = r2.getSplitNanoTime()
            java.time.Duration r0 = java.time.Duration.ofNanos(r0)
            return r0
    }

    public long getSplitNanoTime() {
            r4 = this;
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = r4.splitState
            org.apache.commons.lang3.time.StopWatch$SplitState r1 = org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT
            if (r0 != r1) goto Lc
            long r0 = r4.stopTimeNanos
            long r2 = r4.startTimeNanos
            long r0 = r0 - r2
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch must be split to get the split time."
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public long getSplitTime() {
            r2 = this;
            long r0 = r2.getSplitNanoTime()
            long r0 = r2.nanosToMillis(r0)
            return r0
    }

    public java.time.Instant getStartInstant() {
            r2 = this;
            long r0 = r2.getStartTime()
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            return r0
    }

    @java.lang.Deprecated
    public long getStartTime() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            if (r0 == r1) goto Ld
            java.time.Instant r0 = r2.startInstant
            long r0 = r0.toEpochMilli()
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch has not been started"
            r0.<init>(r1)
            throw r0
    }

    public java.time.Instant getStopInstant() {
            r2 = this;
            long r0 = r2.getStopTime()
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            return r0
    }

    @java.lang.Deprecated
    public long getStopTime() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            if (r0 == r1) goto Ld
            java.time.Instant r0 = r2.stopInstant
            long r0 = r0.toEpochMilli()
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch has not been started"
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public long getTime() {
            r2 = this;
            long r0 = r2.getNanoTime()
            long r0 = r2.nanosToMillis(r0)
            return r0
    }

    public long getTime(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.getNanoTime()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    public boolean isStarted() {
            r1 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r1.runningState
            boolean r0 = r0.isStarted()
            return r0
    }

    public boolean isStopped() {
            r1 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r1.runningState
            boolean r0 = r0.isStopped()
            return r0
    }

    public boolean isSuspended() {
            r1 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r1.runningState
            boolean r0 = r0.isSuspended()
            return r0
    }

    public void reset() {
            r1 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            r1.runningState = r0
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT
            r1.splitState = r0
            return
    }

    public void resume() {
            r6 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r6.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
            if (r0 != r1) goto L17
            long r0 = r6.startTimeNanos
            long r2 = java.lang.System.nanoTime()
            long r4 = r6.stopTimeNanos
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.startTimeNanos = r0
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            r6.runningState = r0
            return
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch must be suspended to resume. "
            r0.<init>(r1)
            throw r0
    }

    public void split() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 != r1) goto L11
            long r0 = java.lang.System.nanoTime()
            r2.stopTimeNanos = r0
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT
            r2.splitState = r0
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch is not running. "
            r0.<init>(r1)
            throw r0
    }

    public void start() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.STOPPED
            if (r0 == r1) goto L25
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            if (r0 != r1) goto L1d
            long r0 = java.lang.System.nanoTime()
            r2.startTimeNanos = r0
            java.time.Instant r0 = java.time.Instant.now()
            r2.startInstant = r0
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            r2.runningState = r0
            return
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch already started. "
            r0.<init>(r1)
            throw r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch must be reset before being restarted. "
            r0.<init>(r1)
            throw r0
    }

    public void stop() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 == r1) goto L15
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
            if (r0 != r1) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch is not running. "
            r0.<init>(r1)
            throw r0
        L15:
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 != r1) goto L27
            long r0 = java.lang.System.nanoTime()
            r2.stopTimeNanos = r0
            java.time.Instant r0 = java.time.Instant.now()
            r2.stopInstant = r0
        L27:
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.STOPPED
            r2.runningState = r0
            return
    }

    public void suspend() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 != r1) goto L17
            long r0 = java.lang.System.nanoTime()
            r2.stopTimeNanos = r0
            java.time.Instant r0 = java.time.Instant.now()
            r2.stopInstant = r0
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
            r2.runningState = r0
            return
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch must be running to suspend. "
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toSplitString() {
            r3 = this;
            java.lang.String r0 = r3.message
            java.lang.String r1 = ""
            java.lang.String r0 = java.util.Objects.toString(r0, r1)
            java.lang.String r1 = r3.formatSplitTime()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L13
            goto L2a
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
        L2a:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.message
            java.lang.String r1 = ""
            java.lang.String r0 = java.util.Objects.toString(r0, r1)
            java.lang.String r1 = r3.formatTime()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L13
            goto L2a
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
        L2a:
            return r1
    }

    public void unsplit() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = r2.splitState
            org.apache.commons.lang3.time.StopWatch$SplitState r1 = org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT
            if (r0 != r1) goto Lb
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT
            r2.splitState = r0
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch has not been split. "
            r0.<init>(r1)
            throw r0
    }
}
