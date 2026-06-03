package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class MutableMonitoringRegistry {
    private static final com.google.crypto.tink.internal.MutableMonitoringRegistry.DoNothingClient DO_NOTHING_CLIENT = null;
    private static final com.google.crypto.tink.internal.MutableMonitoringRegistry GLOBAL_INSTANCE = null;
    private final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> monitoringClient;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.MutableMonitoringRegistry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class DoNothingClient implements com.google.crypto.tink.monitoring.MonitoringClient {
        private DoNothingClient() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DoNothingClient(com.google.crypto.tink.internal.MutableMonitoringRegistry.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient
        public com.google.crypto.tink.monitoring.MonitoringClient.Logger createLogger(com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                return r1
        }
    }

    static {
            com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = new com.google.crypto.tink.internal.MutableMonitoringRegistry
            r0.<init>()
            com.google.crypto.tink.internal.MutableMonitoringRegistry.GLOBAL_INSTANCE = r0
            com.google.crypto.tink.internal.MutableMonitoringRegistry$DoNothingClient r0 = new com.google.crypto.tink.internal.MutableMonitoringRegistry$DoNothingClient
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.internal.MutableMonitoringRegistry.DO_NOTHING_CLIENT = r0
            return
    }

    public MutableMonitoringRegistry() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.monitoringClient = r0
            return
    }

    public static com.google.crypto.tink.internal.MutableMonitoringRegistry globalInstance() {
            com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.GLOBAL_INSTANCE
            return r0
    }

    public synchronized void clear() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> r0 = r2.monitoringClient     // Catch: java.lang.Throwable -> L9
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public com.google.crypto.tink.monitoring.MonitoringClient getMonitoringClient() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> r0 = r1.monitoringClient
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.monitoring.MonitoringClient r0 = (com.google.crypto.tink.monitoring.MonitoringClient) r0
            if (r0 != 0) goto Lc
            com.google.crypto.tink.internal.MutableMonitoringRegistry$DoNothingClient r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.DO_NOTHING_CLIENT
        Lc:
            return r0
    }

    public synchronized void registerMonitoringClient(com.google.crypto.tink.monitoring.MonitoringClient r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> r0 = r1.monitoringClient     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L10
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> r0 = r1.monitoringClient     // Catch: java.lang.Throwable -> L18
            r0.set(r2)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            return
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "a monitoring client has already been registered"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L18
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r2
    }
}
