package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
public final class KmsClients {
    private static java.util.List<com.google.crypto.tink.KmsClient> autoClients;
    private static final java.util.concurrent.CopyOnWriteArrayList<com.google.crypto.tink.KmsClient> clients = null;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.google.crypto.tink.KmsClients.clients = r0
            return
    }

    private KmsClients() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void add(com.google.crypto.tink.KmsClient r1) {
            java.util.concurrent.CopyOnWriteArrayList<com.google.crypto.tink.KmsClient> r0 = com.google.crypto.tink.KmsClients.clients
            r0.add(r1)
            return
    }

    public static com.google.crypto.tink.KmsClient get(java.lang.String r3) throws java.security.GeneralSecurityException {
            java.util.concurrent.CopyOnWriteArrayList<com.google.crypto.tink.KmsClient> r0 = com.google.crypto.tink.KmsClients.clients
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.KmsClient r1 = (com.google.crypto.tink.KmsClient) r1
            boolean r2 = r1.doesSupport(r3)
            if (r2 == 0) goto L6
            return r1
        L19:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No KMS client does support: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static synchronized com.google.crypto.tink.KmsClient getAutoLoaded(java.lang.String r4) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.crypto.tink.KmsClients> r0 = com.google.crypto.tink.KmsClients.class
            monitor-enter(r0)
            java.util.List<com.google.crypto.tink.KmsClient> r1 = com.google.crypto.tink.KmsClients.autoClients     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto Ld
            java.util.List r1 = loadAutoKmsClients()     // Catch: java.lang.Throwable -> L40
            com.google.crypto.tink.KmsClients.autoClients = r1     // Catch: java.lang.Throwable -> L40
        Ld:
            java.util.List<com.google.crypto.tink.KmsClient> r1 = com.google.crypto.tink.KmsClients.autoClients     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L40
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L40
            com.google.crypto.tink.KmsClient r2 = (com.google.crypto.tink.KmsClient) r2     // Catch: java.lang.Throwable -> L40
            boolean r3 = r2.doesSupport(r4)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L13
            monitor-exit(r0)
            return r2
        L27:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "No KMS client does support: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L40
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L40
            throw r1     // Catch: java.lang.Throwable -> L40
        L40:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r4
    }

    private static java.util.List<com.google.crypto.tink.KmsClient> loadAutoKmsClients() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<com.google.crypto.tink.KmsClient> r1 = com.google.crypto.tink.KmsClient.class
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.KmsClient r2 = (com.google.crypto.tink.KmsClient) r2
            r0.add(r2)
            goto Lf
        L1f:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    static void reset() {
            java.util.concurrent.CopyOnWriteArrayList<com.google.crypto.tink.KmsClient> r0 = com.google.crypto.tink.KmsClients.clients
            r0.clear()
            return
    }
}
