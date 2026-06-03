package com.google.crypto.tink.monitoring;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
public final class MonitoringAnnotations {
    public static final com.google.crypto.tink.monitoring.MonitoringAnnotations EMPTY = null;
    private final java.util.Map<java.lang.String, java.lang.String> entries;

    /* JADX INFO: renamed from: com.google.crypto.tink.monitoring.MonitoringAnnotations$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private java.util.HashMap<java.lang.String, java.lang.String> builderEntries;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.builderEntries = r0
                return
        }

        public com.google.crypto.tink.monitoring.MonitoringAnnotations.Builder add(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.builderEntries
                if (r0 == 0) goto L8
                r0.put(r2, r3)
                return r1
            L8:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "add cannot be called after build()"
                r2.<init>(r3)
                throw r2
        }

        public com.google.crypto.tink.monitoring.MonitoringAnnotations.Builder addAll(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.builderEntries
                if (r0 == 0) goto L8
                r0.putAll(r2)
                return r1
            L8:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "addAll cannot be called after build()"
                r2.<init>(r0)
                throw r2
        }

        public com.google.crypto.tink.monitoring.MonitoringAnnotations build() {
                r3 = this;
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.builderEntries
                if (r0 == 0) goto L13
                com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = new com.google.crypto.tink.monitoring.MonitoringAnnotations
                java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.builderEntries
                java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
                r2 = 0
                r0.<init>(r1, r2)
                r3.builderEntries = r2
                return r0
            L13:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "cannot call build() twice"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            com.google.crypto.tink.monitoring.MonitoringAnnotations$Builder r0 = newBuilder()
            com.google.crypto.tink.monitoring.MonitoringAnnotations r0 = r0.build()
            com.google.crypto.tink.monitoring.MonitoringAnnotations.EMPTY = r0
            return
    }

    private MonitoringAnnotations(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.entries = r1
            return
    }

    /* synthetic */ MonitoringAnnotations(java.util.Map r1, com.google.crypto.tink.monitoring.MonitoringAnnotations.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.crypto.tink.monitoring.MonitoringAnnotations.Builder newBuilder() {
            com.google.crypto.tink.monitoring.MonitoringAnnotations$Builder r0 = new com.google.crypto.tink.monitoring.MonitoringAnnotations$Builder
            r0.<init>()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.crypto.tink.monitoring.MonitoringAnnotations
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.crypto.tink.monitoring.MonitoringAnnotations r2 = (com.google.crypto.tink.monitoring.MonitoringAnnotations) r2
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.entries
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.entries
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.entries
            int r0 = r0.hashCode()
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> toMap() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.entries
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.entries
            java.lang.String r0 = r0.toString()
            return r0
    }
}
