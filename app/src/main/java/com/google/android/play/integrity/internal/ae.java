package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ae {
    private static final java.util.Map a = null;
    private final android.content.Context b;
    private final com.google.android.play.integrity.internal.s c;
    private final java.lang.String d;
    private final java.util.List e;
    private final java.util.Set f;
    private final java.lang.Object g;
    private boolean h;
    private final android.content.Intent i;
    private final com.google.android.play.integrity.internal.z j;
    private final java.lang.ref.WeakReference k;
    private final android.os.IBinder.DeathRecipient l;
    private final java.util.concurrent.atomic.AtomicInteger m;
    private android.content.ServiceConnection n;
    private android.os.IInterface o;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.integrity.internal.ae.a = r0
            return
    }

    public ae(android.content.Context r2, com.google.android.play.integrity.internal.s r3, java.lang.String r4, android.content.Intent r5, com.google.android.play.integrity.internal.z r6, com.google.android.play.integrity.internal.y r7) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.e = r7
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r1.f = r7
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            r1.g = r7
            com.google.android.play.integrity.internal.u r7 = new com.google.android.play.integrity.internal.u
            r7.<init>(r1)
            r1.l = r7
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r7.<init>(r0)
            r1.m = r7
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.i = r5
            r1.j = r6
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r3 = 0
            r2.<init>(r3)
            r1.k = r2
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context a(com.google.android.play.integrity.internal.ae r0) {
            android.content.Context r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.ServiceConnection b(com.google.android.play.integrity.internal.ae r0) {
            android.content.ServiceConnection r0 = r0.n
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.IInterface d(com.google.android.play.integrity.internal.ae r0) {
            android.os.IInterface r0 = r0.o
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.play.integrity.internal.s f(com.google.android.play.integrity.internal.ae r0) {
            com.google.android.play.integrity.internal.s r0 = r0.c
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.play.integrity.internal.z g(com.google.android.play.integrity.internal.ae r0) {
            com.google.android.play.integrity.internal.z r0 = r0.j
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object h(com.google.android.play.integrity.internal.ae r0) {
            java.lang.Object r0 = r0.g
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i(com.google.android.play.integrity.internal.ae r0) {
            java.util.List r0 = r0.e
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicInteger j(com.google.android.play.integrity.internal.ae r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.m
            return r0
    }

    public static /* synthetic */ void k(com.google.android.play.integrity.internal.ae r4) {
            com.google.android.play.integrity.internal.s r0 = r4.c
            java.lang.String r1 = "reportBinderDeath"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.d(r1, r3)
            java.lang.ref.WeakReference r1 = r4.k
            java.lang.Object r1 = r1.get()
            com.google.android.play.integrity.internal.y r1 = (com.google.android.play.integrity.internal.y) r1
            if (r1 == 0) goto L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "calling onBinderDied"
            r0.d(r3, r2)
            r1.a()
            goto L47
        L1f:
            java.lang.String r1 = r4.d
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "%s : Binder has died."
            r0.d(r2, r1)
            java.util.List r0 = r4.e
            java.util.Iterator r1 = r0.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            com.google.android.play.integrity.internal.t r2 = (com.google.android.play.integrity.internal.t) r2
            android.os.RemoteException r3 = r4.w()
            r2.a(r3)
            goto L30
        L44:
            r0.clear()
        L47:
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
            r4.x()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r4
    }

    public static /* synthetic */ void l(com.google.android.play.integrity.internal.ae r0, com.google.android.gms.tasks.TaskCompletionSource r1, com.google.android.gms.tasks.Task r2) {
            java.lang.Object r2 = r0.g
            monitor-enter(r2)
            java.util.Set r0 = r0.f     // Catch: java.lang.Throwable -> La
            r0.remove(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    static /* bridge */ /* synthetic */ void m(com.google.android.play.integrity.internal.ae r0, android.content.ServiceConnection r1) {
            r1 = 0
            r0.n = r1
            return
    }

    static /* bridge */ /* synthetic */ void n(com.google.android.play.integrity.internal.ae r0, boolean r1) {
            r1 = 0
            r0.h = r1
            return
    }

    static /* bridge */ /* synthetic */ void o(com.google.android.play.integrity.internal.ae r0, android.os.IInterface r1) {
            r0.o = r1
            return
    }

    static /* bridge */ /* synthetic */ void p(com.google.android.play.integrity.internal.ae r2, com.google.android.gms.tasks.TaskCompletionSource r3) {
            java.util.Set r0 = r2.f
            r0.add(r3)
            com.google.android.gms.tasks.Task r0 = r3.getTask()
            com.google.android.play.integrity.internal.v r1 = new com.google.android.play.integrity.internal.v
            r1.<init>(r2, r3)
            r0.addOnCompleteListener(r1)
            return
    }

    static /* bridge */ /* synthetic */ void q(com.google.android.play.integrity.internal.ae r0) {
            r0.x()
            return
    }

    static /* bridge */ /* synthetic */ void r(com.google.android.play.integrity.internal.ae r6, com.google.android.play.integrity.internal.t r7) {
            android.os.IInterface r0 = r6.o
            r1 = 0
            if (r0 != 0) goto L52
            boolean r0 = r6.h
            if (r0 != 0) goto L52
            com.google.android.play.integrity.internal.s r0 = r6.c
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Initiate binding to the service."
            r0.d(r3, r2)
            java.util.List r2 = r6.e
            r2.add(r7)
            com.google.android.play.integrity.internal.ac r7 = new com.google.android.play.integrity.internal.ac
            r3 = 0
            r7.<init>(r6, r3)
            r6.n = r7
            r3 = 1
            r6.h = r3
            android.content.Context r4 = r6.b
            android.content.Intent r5 = r6.i
            boolean r7 = r4.bindService(r5, r7, r3)
            if (r7 != 0) goto L51
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r3 = "Failed to bind to the service."
            r0.d(r3, r7)
            r6.h = r1
            java.util.Iterator r6 = r2.iterator()
        L39:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4e
            java.lang.Object r7 = r6.next()
            com.google.android.play.integrity.internal.t r7 = (com.google.android.play.integrity.internal.t) r7
            com.google.android.play.integrity.internal.af r0 = new com.google.android.play.integrity.internal.af
            r0.<init>()
            r7.a(r0)
            goto L39
        L4e:
            r2.clear()
        L51:
            return
        L52:
            boolean r0 = r6.h
            if (r0 == 0) goto L65
            com.google.android.play.integrity.internal.s r0 = r6.c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Waiting to bind to the service."
            r0.d(r2, r1)
            java.util.List r6 = r6.e
            r6.add(r7)
            return
        L65:
            r7.run()
            return
    }

    static /* bridge */ /* synthetic */ void s(com.google.android.play.integrity.internal.ae r4) {
            com.google.android.play.integrity.internal.s r0 = r4.c
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "linkToDeath"
            r0.d(r3, r2)
            android.os.IInterface r0 = r4.o     // Catch: android.os.RemoteException -> L16
            android.os.IBinder r0 = r0.asBinder()     // Catch: android.os.RemoteException -> L16
            android.os.IBinder$DeathRecipient r2 = r4.l     // Catch: android.os.RemoteException -> L16
            r0.linkToDeath(r2, r1)     // Catch: android.os.RemoteException -> L16
            return
        L16:
            r0 = move-exception
            com.google.android.play.integrity.internal.s r4 = r4.c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "linkToDeath failed"
            r4.c(r0, r2, r1)
            return
    }

    static /* bridge */ /* synthetic */ void t(com.google.android.play.integrity.internal.ae r4) {
            com.google.android.play.integrity.internal.s r0 = r4.c
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "unlinkToDeath"
            r0.d(r3, r2)
            android.os.IInterface r0 = r4.o
            android.os.IBinder r0 = r0.asBinder()
            android.os.IBinder$DeathRecipient r4 = r4.l
            r0.unlinkToDeath(r4, r1)
            return
    }

    private final android.os.RemoteException w() {
            r3 = this;
            java.lang.String r0 = r3.d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.os.RemoteException r1 = new android.os.RemoteException
            java.lang.String r2 = " : Binder has died."
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
            return r1
    }

    private final void x() {
            r4 = this;
            java.util.Set r0 = r4.f
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            android.os.RemoteException r3 = r4.w()
            r2.trySetException(r3)
            goto L6
        L1a:
            r0.clear()
            return
    }

    public final android.os.Handler c() {
            r4 = this;
            java.util.Map r0 = com.google.android.play.integrity.internal.ae.a
            monitor-enter(r0)
            java.lang.String r1 = r4.d     // Catch: java.lang.Throwable -> L29
            boolean r2 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L21
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L29
            r3 = 10
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L29
            r2.start()     // Catch: java.lang.Throwable -> L29
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L29
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L29
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L29
        L21:
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L29
            android.os.Handler r1 = (android.os.Handler) r1     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r1
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
    }

    public final android.os.IInterface e() {
            r1 = this;
            android.os.IInterface r0 = r1.o
            return r0
    }

    public final void u(com.google.android.play.integrity.internal.t r3, com.google.android.gms.tasks.TaskCompletionSource r4) {
            r2 = this;
            com.google.android.play.integrity.internal.w r0 = new com.google.android.play.integrity.internal.w
            com.google.android.gms.tasks.TaskCompletionSource r1 = r3.c()
            r0.<init>(r2, r1, r4, r3)
            android.os.Handler r3 = r2.c()
            r3.post(r0)
            return
    }

    public final void v(com.google.android.gms.tasks.TaskCompletionSource r3) {
            r2 = this;
            java.lang.Object r0 = r2.g
            monitor-enter(r0)
            java.util.Set r1 = r2.f     // Catch: java.lang.Throwable -> L16
            r1.remove(r3)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            com.google.android.play.integrity.internal.x r3 = new com.google.android.play.integrity.internal.x
            r3.<init>(r2)
            android.os.Handler r0 = r2.c()
            r0.post(r3)
            return
        L16:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }
}
