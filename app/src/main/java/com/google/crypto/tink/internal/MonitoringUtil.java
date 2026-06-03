package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class MonitoringUtil {
    public static final com.google.crypto.tink.monitoring.MonitoringClient.Logger DO_NOTHING_LOGGER = null;
    private static final java.lang.String TYPE_URL_PREFIX = "type.googleapis.com/google.crypto.";

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.MonitoringUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = null;

        static {
                com.google.crypto.tink.proto.KeyStatusType[] r0 = com.google.crypto.tink.proto.KeyStatusType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType = r0
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    private static class DoNothingLogger implements com.google.crypto.tink.monitoring.MonitoringClient.Logger {
        private DoNothingLogger() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DoNothingLogger(com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public void log(int r1, long r2) {
                r0 = this;
                return
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public void logFailure() {
                r0 = this;
                return
        }
    }

    static {
            com.google.crypto.tink.internal.MonitoringUtil$DoNothingLogger r0 = new com.google.crypto.tink.internal.MonitoringUtil$DoNothingLogger
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER = r0
            return
    }

    private MonitoringUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <P> com.google.crypto.tink.monitoring.MonitoringKeysetInfo getMonitoringKeysetInfo(com.google.crypto.tink.PrimitiveSet<P> r7) {
            com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Builder r0 = com.google.crypto.tink.monitoring.MonitoringKeysetInfo.newBuilder()
            com.google.crypto.tink.monitoring.MonitoringAnnotations r1 = r7.getAnnotations()
            r0.setAnnotations(r1)
            java.util.Collection r1 = r7.getAll()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L13
            java.lang.Object r3 = r2.next()
            com.google.crypto.tink.PrimitiveSet$Entry r3 = (com.google.crypto.tink.PrimitiveSet.Entry) r3
            com.google.crypto.tink.proto.KeyStatusType r4 = r3.getStatus()
            com.google.crypto.tink.KeyStatus r4 = parseStatus(r4)
            int r5 = r3.getKeyId()
            java.lang.String r6 = r3.getKeyType()
            java.lang.String r6 = parseKeyTypeUrl(r6)
            com.google.crypto.tink.proto.OutputPrefixType r3 = r3.getOutputPrefixType()
            java.lang.String r3 = r3.name()
            r0.addEntry(r4, r5, r6, r3)
            goto L23
        L4f:
            com.google.crypto.tink.PrimitiveSet$Entry r1 = r7.getPrimary()
            if (r1 == 0) goto L60
            com.google.crypto.tink.PrimitiveSet$Entry r7 = r7.getPrimary()
            int r7 = r7.getKeyId()
            r0.setPrimaryKeyId(r7)
        L60:
            com.google.crypto.tink.monitoring.MonitoringKeysetInfo r7 = r0.build()     // Catch: java.security.GeneralSecurityException -> L65
            return r7
        L65:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
    }

    private static java.lang.String parseKeyTypeUrl(java.lang.String r2) {
            java.lang.String r0 = "type.googleapis.com/google.crypto."
            boolean r1 = r2.startsWith(r0)
            if (r1 != 0) goto L9
            return r2
        L9:
            int r0 = r0.length()
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    private static com.google.crypto.tink.KeyStatus parseStatus(com.google.crypto.tink.proto.KeyStatusType r1) {
            int[] r0 = com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1f
            r0 = 2
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L14
            com.google.crypto.tink.KeyStatus r1 = com.google.crypto.tink.KeyStatus.DESTROYED
            return r1
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown key status"
            r1.<init>(r0)
            throw r1
        L1c:
            com.google.crypto.tink.KeyStatus r1 = com.google.crypto.tink.KeyStatus.DISABLED
            return r1
        L1f:
            com.google.crypto.tink.KeyStatus r1 = com.google.crypto.tink.KeyStatus.ENABLED
            return r1
    }
}
