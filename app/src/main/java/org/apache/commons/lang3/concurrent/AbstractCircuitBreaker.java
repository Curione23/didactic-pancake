package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCircuitBreaker<T> implements org.apache.commons.lang3.concurrent.CircuitBreaker<T> {
    public static final java.lang.String PROPERTY_NAME = "open";
    private final java.beans.PropertyChangeSupport changeSupport;
    protected final java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State> state;

    /* JADX INFO: renamed from: org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    protected enum State extends java.lang.Enum<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State> {
        private static final /* synthetic */ org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State[] $VALUES = null;
        public static final org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State CLOSED = null;
        public static final org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State OPEN = null;



        private static /* synthetic */ org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State[] $values() {
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r0 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.CLOSED
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r1 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.OPEN
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State[] r0 = new org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State[]{r0, r1}
                return r0
        }

        static {
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State$1 r0 = new org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State$1
                java.lang.String r1 = "CLOSED"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.CLOSED = r0
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State$2 r0 = new org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State$2
                java.lang.String r1 = "OPEN"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.OPEN = r0
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State[] r0 = $values()
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ State(java.lang.String r1, int r2, org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State> r0 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r1 = (org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State) r1
                return r1
        }

        public static org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State[] values() {
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State[] r0 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State[] r0 = (org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State[]) r0
                return r0
        }

        public abstract org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State oppositeState();
    }

    public AbstractCircuitBreaker() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r1 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.CLOSED
            r0.<init>(r1)
            r2.state = r0
            java.beans.PropertyChangeSupport r0 = new java.beans.PropertyChangeSupport
            r0.<init>(r2)
            r2.changeSupport = r0
            return
    }

    protected static boolean isOpen(org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State r1) {
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r0 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.OPEN
            if (r1 != r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public void addChangeListener(java.beans.PropertyChangeListener r2) {
            r1 = this;
            java.beans.PropertyChangeSupport r0 = r1.changeSupport
            r0.addPropertyChangeListener(r2)
            return
    }

    protected void changeState(org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State> r0 = r3.state
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r1 = r4.oppositeState()
            boolean r0 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r4)
            if (r0 == 0) goto L1d
            java.beans.PropertyChangeSupport r0 = r3.changeSupport
            boolean r1 = isOpen(r4)
            r1 = r1 ^ 1
            boolean r4 = isOpen(r4)
            java.lang.String r2 = "open"
            r0.firePropertyChange(r2, r1, r4)
        L1d:
            return
    }

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public abstract boolean checkState();

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public void close() {
            r1 = this;
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r0 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.CLOSED
            r1.changeState(r0)
            return
    }

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public abstract boolean incrementAndCheckState(T r1);

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.isOpen()
            r0 = r0 ^ 1
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean isOpen() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State> r0 = r1.state
            java.lang.Object r0 = r0.get()
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r0 = (org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State) r0
            boolean r0 = isOpen(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public void open() {
            r1 = this;
            org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State r0 = org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State.OPEN
            r1.changeState(r0)
            return
    }

    public void removeChangeListener(java.beans.PropertyChangeListener r2) {
            r1 = this;
            java.beans.PropertyChangeSupport r0 = r1.changeSupport
            r0.removePropertyChangeListener(r2)
            return
    }
}
