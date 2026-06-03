package com.google.android.gms.common.internal;

import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGmsClient<T extends android.os.IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = null;
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private static final com.google.android.gms.common.Feature[] zze = null;
    private volatile java.lang.String zzA;
    private volatile com.google.android.gms.common.wrappers.AttributionSourceWrapper zzB;
    private com.google.android.gms.common.ConnectionResult zzC;
    private boolean zzD;
    private volatile com.google.android.gms.common.internal.zzj zzE;
    com.google.android.gms.common.internal.zzs zza;
    final android.os.Handler zzb;
    protected com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private com.google.android.gms.common.internal.zze zzu;
    private int zzv;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzw;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final java.lang.String zzz;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface BaseConnectionCallbacks {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(android.os.Bundle r1);

        void onConnectionSuspended(int r1);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(com.google.android.gms.common.ConnectionResult r1);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(com.google.android.gms.common.ConnectionResult r1);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    protected class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

        public LegacyClientCallbackAdapter(com.google.android.gms.common.internal.BaseGmsClient r1) {
                r0 = this;
                java.util.Objects.requireNonNull(r1)
                r0.zza = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult r3) {
                r2 = this;
                boolean r0 = r3.isSuccess()
                if (r0 == 0) goto L11
                com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zza
                java.util.Set r0 = r3.getScopes()
                r1 = 0
                r3.getRemoteService(r1, r0)
                return
            L11:
                com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
                com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r1 = r0.zzl()
                if (r1 == 0) goto L20
                com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = r0.zzl()
                r0.onConnectionFailed(r3)
            L20:
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    static {
            r0 = 0
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r0]
            com.google.android.gms.common.internal.BaseGmsClient.zze = r1
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "service_esmobile"
            r1[r0] = r2
            r0 = 1
            java.lang.String r2 = "service_googleme"
            r1[r0] = r2
            com.google.android.gms.common.internal.BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES = r1
            return
    }

    protected BaseGmsClient(android.content.Context r4, android.os.Handler r5, com.google.android.gms.common.internal.GmsClientSupervisor r6, com.google.android.gms.common.GoogleApiAvailabilityLight r7, int r8, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r9, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r10) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.zzk = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r3.zzp = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r3.zzq = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.zzt = r1
            r1 = 1
            r3.zzv = r1
            r3.zzC = r0
            r1 = 0
            r3.zzD = r1
            r3.zzE = r0
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r1)
            r3.zzd = r2
            java.lang.String r1 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r1)
            r1 = r4
            android.content.Context r1 = (android.content.Context) r1
            r3.zzl = r4
            java.lang.String r4 = "Handler must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r4)
            r4 = r5
            android.os.Handler r4 = (android.os.Handler) r4
            r3.zzb = r5
            android.os.Looper r4 = r5.getLooper()
            r3.zzm = r4
            java.lang.String r4 = "Supervisor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r4)
            r4 = r6
            com.google.android.gms.common.internal.GmsClientSupervisor r4 = (com.google.android.gms.common.internal.GmsClientSupervisor) r4
            r3.zzn = r6
            java.lang.String r4 = "API availability must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r4)
            r4 = r7
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = (com.google.android.gms.common.GoogleApiAvailabilityLight) r4
            r3.zzo = r7
            r3.zzy = r8
            r3.zzw = r9
            r3.zzx = r10
            r3.zzz = r0
            return
    }

    protected BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            r0 = r13
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = (com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) r0
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r0 = r14
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = (com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) r0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    protected BaseGmsClient(android.content.Context r3, android.os.Looper r4, com.google.android.gms.common.internal.GmsClientSupervisor r5, com.google.android.gms.common.GoogleApiAvailabilityLight r6, int r7, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r8, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r9, java.lang.String r10) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzk = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzp = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzq = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.zzt = r1
            r1 = 1
            r2.zzv = r1
            r2.zzC = r0
            r1 = 0
            r2.zzD = r1
            r2.zzE = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.zzd = r0
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r0 = r3
            android.content.Context r0 = (android.content.Context) r0
            r2.zzl = r3
            java.lang.String r3 = "Looper must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r3)
            r3 = r4
            android.os.Looper r3 = (android.os.Looper) r3
            r2.zzm = r4
            java.lang.String r3 = "Supervisor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r3)
            r3 = r5
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = (com.google.android.gms.common.internal.GmsClientSupervisor) r3
            r2.zzn = r5
            java.lang.String r3 = "API availability must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r3)
            r3 = r6
            com.google.android.gms.common.GoogleApiAvailabilityLight r3 = (com.google.android.gms.common.GoogleApiAvailabilityLight) r3
            r2.zzo = r6
            com.google.android.gms.common.internal.zzb r3 = new com.google.android.gms.common.internal.zzb
            r3.<init>(r2, r4)
            r2.zzb = r3
            r2.zzy = r7
            r2.zzw = r8
            r2.zzx = r9
            r2.zzz = r10
            return
    }

    private final void zzp(int r13, android.os.IInterface r14) {
            r12 = this;
            r0 = 0
            r1 = 1
            r2 = 4
            if (r13 == r2) goto L7
            r3 = r0
            goto L8
        L7:
            r3 = r1
        L8:
            if (r14 != 0) goto Lc
            r4 = r0
            goto Ld
        Lc:
            r4 = r1
        Ld:
            if (r3 != r4) goto L10
            r0 = r1
        L10:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            java.lang.Object r0 = r12.zzp
            monitor-enter(r0)
            r12.zzv = r13     // Catch: java.lang.Throwable -> L1cf
            r12.zzs = r14     // Catch: java.lang.Throwable -> L1cf
            r3 = 0
            if (r13 == r1) goto L1a4
            r1 = 2
            r4 = 3
            if (r13 == r1) goto L32
            if (r13 == r4) goto L32
            if (r13 == r2) goto L27
            goto L1cd
        L27:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch: java.lang.Throwable -> L1cf
            r13 = r14
            android.os.IInterface r13 = (android.os.IInterface) r13     // Catch: java.lang.Throwable -> L1cf
            r12.onConnectedLocked(r14)     // Catch: java.lang.Throwable -> L1cf
            goto L1cd
        L32:
            java.lang.String r13 = "Calling connect() while still connected, missing disconnect() for "
            java.lang.String r14 = " on "
            java.lang.String r1 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "
            java.lang.String r2 = "unable to connect to service: "
            com.google.android.gms.common.internal.zze r9 = r12.zzu     // Catch: java.lang.Throwable -> L1cf
            if (r9 == 0) goto L9f
            com.google.android.gms.common.internal.zzs r5 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            if (r5 == 0) goto L9f
            java.lang.String r6 = "GmsClient"
            java.lang.String r7 = r5.zza()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r5 = r5.zzb()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L1cf
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L1cf
            int r8 = r8 + 70
            java.lang.String r10 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1cf
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L1cf
            int r8 = r8 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cf
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L1cf
            r10.append(r13)     // Catch: java.lang.Throwable -> L1cf
            r10.append(r7)     // Catch: java.lang.Throwable -> L1cf
            r10.append(r14)     // Catch: java.lang.Throwable -> L1cf
            r10.append(r5)     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r13 = r10.toString()     // Catch: java.lang.Throwable -> L1cf
            android.util.Log.e(r6, r13)     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.GmsClientSupervisor r5 = r12.zzn     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r13 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r6 = r13.zza()     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L1cf
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r13 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r7 = r13.zzb()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r10 = r12.zza()     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r13 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            boolean r11 = r13.zzc()     // Catch: java.lang.Throwable -> L1cf
            r8 = 4225(0x1081, float:5.92E-42)
            r5.zzb(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1cf
            java.util.concurrent.atomic.AtomicInteger r13 = r12.zzd     // Catch: java.lang.Throwable -> L1cf
            r13.incrementAndGet()     // Catch: java.lang.Throwable -> L1cf
        L9f:
            com.google.android.gms.common.internal.zze r13 = new com.google.android.gms.common.internal.zze     // Catch: java.lang.Throwable -> L1cf
            java.util.concurrent.atomic.AtomicInteger r5 = r12.zzd     // Catch: java.lang.Throwable -> L1cf
            int r5 = r5.get()     // Catch: java.lang.Throwable -> L1cf
            r13.<init>(r12, r5)     // Catch: java.lang.Throwable -> L1cf
            r12.zzu = r13     // Catch: java.lang.Throwable -> L1cf
            int r5 = r12.zzv     // Catch: java.lang.Throwable -> L1cf
            if (r5 != r4) goto Lcd
            java.lang.String r4 = r12.getLocalStartServiceAction()     // Catch: java.lang.Throwable -> L1cf
            if (r4 == 0) goto Lcd
            com.google.android.gms.common.internal.zzs r4 = new com.google.android.gms.common.internal.zzs     // Catch: java.lang.Throwable -> L1cf
            android.content.Context r5 = r12.getContext()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r6 = r5.getPackageName()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r7 = r12.getLocalStartServiceAction()     // Catch: java.lang.Throwable -> L1cf
            r9 = 4225(0x1081, float:5.92E-42)
            r10 = 0
            r8 = 1
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1cf
            goto Le3
        Lcd:
            com.google.android.gms.common.internal.zzs r10 = new com.google.android.gms.common.internal.zzs     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r5 = r12.getStartServicePackage()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r6 = r12.getStartServiceAction()     // Catch: java.lang.Throwable -> L1cf
            boolean r9 = r12.getUseDynamicLookup()     // Catch: java.lang.Throwable -> L1cf
            r7 = 0
            r8 = 4225(0x1081, float:5.92E-42)
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1cf
            r4 = r10
        Le3:
            r12.zza = r4     // Catch: java.lang.Throwable -> L1cf
            boolean r4 = r4.zzc()     // Catch: java.lang.Throwable -> L1cf
            if (r4 == 0) goto L10c
            int r4 = r12.getMinApkVersion()     // Catch: java.lang.Throwable -> L1cf
            r5 = 17895000(0x1110e58, float:2.6642585E-38)
            if (r4 < r5) goto Lf5
            goto L10c
        Lf5:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r14 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r14 = r14.zza()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r14 = r1.concat(r14)     // Catch: java.lang.Throwable -> L1cf
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L1cf
            throw r13     // Catch: java.lang.Throwable -> L1cf
        L10c:
            com.google.android.gms.common.internal.GmsClientSupervisor r1 = r12.zzn     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r4 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r4 = r4.zza()     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L1cf
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r5 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r5 = r5.zzb()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r6 = r12.zza()     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r7 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            boolean r7 = r7.zzc()     // Catch: java.lang.Throwable -> L1cf
            java.util.concurrent.Executor r8 = r12.getBindServiceExecutor()     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzn r9 = new com.google.android.gms.common.internal.zzn     // Catch: java.lang.Throwable -> L1cf
            r10 = 4225(0x1081, float:5.92E-42)
            r9.<init>(r4, r5, r10, r7)     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.ConnectionResult r13 = r1.zza(r9, r13, r6, r8)     // Catch: java.lang.Throwable -> L1cf
            boolean r1 = r13.isSuccess()     // Catch: java.lang.Throwable -> L1cf
            if (r1 != 0) goto L1cd
            java.lang.String r1 = "GmsClient"
            com.google.android.gms.common.internal.zzs r4 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r4 = r4.zza()     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r5 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r5 = r5.zzb()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L1cf
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L1cf
            int r6 = r6 + 34
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1cf
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L1cf
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cf
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L1cf
            r7.append(r2)     // Catch: java.lang.Throwable -> L1cf
            r7.append(r4)     // Catch: java.lang.Throwable -> L1cf
            r7.append(r14)     // Catch: java.lang.Throwable -> L1cf
            r7.append(r5)     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r14 = r7.toString()     // Catch: java.lang.Throwable -> L1cf
            android.util.Log.w(r1, r14)     // Catch: java.lang.Throwable -> L1cf
            int r14 = r13.getErrorCode()     // Catch: java.lang.Throwable -> L1cf
            r1 = -1
            if (r14 != r1) goto L182
            r14 = 16
            goto L186
        L182:
            int r14 = r13.getErrorCode()     // Catch: java.lang.Throwable -> L1cf
        L186:
            android.app.PendingIntent r1 = r13.getResolution()     // Catch: java.lang.Throwable -> L1cf
            if (r1 == 0) goto L19a
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1cf
            r3.<init>()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r1 = "pendingIntent"
            android.app.PendingIntent r13 = r13.getResolution()     // Catch: java.lang.Throwable -> L1cf
            r3.putParcelable(r1, r13)     // Catch: java.lang.Throwable -> L1cf
        L19a:
            java.util.concurrent.atomic.AtomicInteger r13 = r12.zzd     // Catch: java.lang.Throwable -> L1cf
            int r13 = r13.get()     // Catch: java.lang.Throwable -> L1cf
            r12.zzb(r14, r3, r13)     // Catch: java.lang.Throwable -> L1cf
            goto L1cd
        L1a4:
            com.google.android.gms.common.internal.zze r8 = r12.zzu     // Catch: java.lang.Throwable -> L1cf
            if (r8 == 0) goto L1cd
            com.google.android.gms.common.internal.GmsClientSupervisor r4 = r12.zzn     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r13 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r5 = r13.zza()     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L1cf
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r13 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r6 = r13.zzb()     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r9 = r12.zza()     // Catch: java.lang.Throwable -> L1cf
            com.google.android.gms.common.internal.zzs r13 = r12.zza     // Catch: java.lang.Throwable -> L1cf
            boolean r10 = r13.zzc()     // Catch: java.lang.Throwable -> L1cf
            r7 = 4225(0x1081, float:5.92E-42)
            r4.zzb(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1cf
            r12.zzu = r3     // Catch: java.lang.Throwable -> L1cf
        L1cd:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1cf
            return
        L1cf:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1cf
            throw r13
    }

    public void checkAvailabilityAndConnect() {
            r3 = this;
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = r3.zzo
            android.content.Context r1 = r3.zzl
            int r2 = r3.getMinApkVersion()
            int r0 = r0.isGooglePlayServicesAvailable(r1, r2)
            if (r0 == 0) goto L1c
            r1 = 1
            r2 = 0
            r3.zzp(r1, r2)
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r1 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r1.<init>(r3)
            r3.triggerNotAvailable(r1, r0, r2)
            return
        L1c:
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r0 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r0.<init>(r3)
            r3.connect(r0)
            return
    }

    protected final void checkConnected() {
            r2 = this;
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not connected. Call connect() and wait for onConnected() to be called."
            r0.<init>(r1)
            throw r0
    }

    public void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r2) {
            r1 = this;
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r0 = r2
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) r0
            r1.zzc = r2
            r2 = 2
            r0 = 0
            r1.zzp(r2, r0)
            return
    }

    protected abstract T createServiceInterface(android.os.IBinder r1);

    public void disconnect() {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zzd
            r0.incrementAndGet()
            java.util.ArrayList r0 = r4.zzt
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L2e
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.common.internal.zzc r3 = (com.google.android.gms.common.internal.zzc) r3     // Catch: java.lang.Throwable -> L2e
            r3.zzf()     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            goto Ld
        L1b:
            r0.clear()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r4.zzq
            monitor-enter(r1)
            r0 = 0
            r4.zzr = r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            r1 = 1
            r4.zzp(r1, r0)
            return
        L2b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0
        L2e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
    }

    public void disconnect(java.lang.String r1) {
            r0 = this;
            r0.zzk = r1
            r0.disconnect()
            return
    }

    public void dump(java.lang.String r17, java.io.FileDescriptor r18, java.io.PrintWriter r19, java.lang.String[] r20) {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            java.lang.Object r3 = r1.zzp
            monitor-enter(r3)
            int r4 = r1.zzv     // Catch: java.lang.Throwable -> L1a8
            android.os.IInterface r5 = r1.zzs     // Catch: java.lang.Throwable -> L1a8
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a8
            java.lang.Object r6 = r1.zzq
            monitor-enter(r6)
            com.google.android.gms.common.internal.IGmsServiceBroker r3 = r1.zzr     // Catch: java.lang.Throwable -> L1a5
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1a5
            java.io.PrintWriter r6 = r2.append(r0)
            java.lang.String r7 = "mConnectState="
            r6.append(r7)
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == r8) goto L4a
            if (r4 == r7) goto L44
            if (r4 == r6) goto L3e
            r9 = 4
            if (r4 == r9) goto L38
            r9 = 5
            if (r4 == r9) goto L32
            java.lang.String r4 = "UNKNOWN"
            r2.print(r4)
            goto L4f
        L32:
            java.lang.String r4 = "DISCONNECTING"
            r2.print(r4)
            goto L4f
        L38:
            java.lang.String r4 = "CONNECTED"
            r2.print(r4)
            goto L4f
        L3e:
            java.lang.String r4 = "LOCAL_CONNECTING"
            r2.print(r4)
            goto L4f
        L44:
            java.lang.String r4 = "REMOTE_CONNECTING"
            r2.print(r4)
            goto L4f
        L4a:
            java.lang.String r4 = "DISCONNECTED"
            r2.print(r4)
        L4f:
            java.lang.String r4 = " mService="
            r2.append(r4)
            if (r5 != 0) goto L5c
            java.lang.String r4 = "null"
            r2.append(r4)
            goto L79
        L5c:
            java.lang.String r4 = r16.getServiceDescriptor()
            java.io.PrintWriter r4 = r2.append(r4)
            java.lang.String r9 = "@"
            java.io.PrintWriter r4 = r4.append(r9)
            android.os.IBinder r5 = r5.asBinder()
            int r5 = java.lang.System.identityHashCode(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r4.append(r5)
        L79:
            java.lang.String r4 = " mServiceBroker="
            r2.append(r4)
            if (r3 != 0) goto L86
            java.lang.String r3 = "null"
            r2.println(r3)
            goto L9b
        L86:
            java.lang.String r4 = "IGmsServiceBroker@"
            java.io.PrintWriter r4 = r2.append(r4)
            android.os.IBinder r3 = r3.asBinder()
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r4.println(r3)
        L9b:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r5 = java.util.Locale.US
            r3.<init>(r4, r5)
            long r4 = r1.zzh
            r9 = 0
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            java.lang.String r5 = " "
            if (r4 <= 0) goto Lea
            java.io.PrintWriter r4 = r2.append(r0)
            java.lang.String r11 = "lastConnectedTime="
            java.io.PrintWriter r4 = r4.append(r11)
            long r11 = r1.zzh
            java.util.Date r13 = new java.util.Date
            r13.<init>(r11)
            java.lang.String r13 = r3.format(r13)
            java.lang.String r14 = java.lang.String.valueOf(r11)
            int r14 = r14.length()
            int r14 = r14 + r8
            java.lang.String r15 = java.lang.String.valueOf(r13)
            int r15 = r15.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r14 = r14 + r15
            r6.<init>(r14)
            r6.append(r11)
            r6.append(r5)
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r4.println(r6)
        Lea:
            long r11 = r1.zzg
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 <= 0) goto L153
            java.io.PrintWriter r4 = r2.append(r0)
            java.lang.String r6 = "lastSuspendedCause="
            r4.append(r6)
            int r4 = r1.zzf
            if (r4 == r8) goto L116
            if (r4 == r7) goto L110
            r6 = 3
            if (r4 == r6) goto L10a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.append(r4)
            goto L11b
        L10a:
            java.lang.String r4 = "CAUSE_DEAD_OBJECT_EXCEPTION"
            r2.append(r4)
            goto L11b
        L110:
            java.lang.String r4 = "CAUSE_NETWORK_LOST"
            r2.append(r4)
            goto L11b
        L116:
            java.lang.String r4 = "CAUSE_SERVICE_DISCONNECTED"
            r2.append(r4)
        L11b:
            java.lang.String r4 = " lastSuspendedTime="
            java.io.PrintWriter r4 = r2.append(r4)
            long r6 = r1.zzg
            java.util.Date r11 = new java.util.Date
            r11.<init>(r6)
            java.lang.String r11 = r3.format(r11)
            java.lang.String r12 = java.lang.String.valueOf(r6)
            int r12 = r12.length()
            int r12 = r12 + r8
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r13 = r13.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r12 = r12 + r13
            r14.<init>(r12)
            r14.append(r6)
            r14.append(r5)
            r14.append(r11)
            java.lang.String r6 = r14.toString()
            r4.println(r6)
        L153:
            long r6 = r1.zzj
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 <= 0) goto L1a4
            java.io.PrintWriter r0 = r2.append(r0)
            java.lang.String r4 = "lastFailedStatus="
            java.io.PrintWriter r0 = r0.append(r4)
            int r4 = r1.zzi
            java.lang.String r4 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r4)
            r0.append(r4)
            java.lang.String r0 = " lastFailedTime="
            java.io.PrintWriter r0 = r2.append(r0)
            long r6 = r1.zzj
            java.util.Date r2 = new java.util.Date
            r2.<init>(r6)
            java.lang.String r2 = r3.format(r2)
            java.lang.String r3 = java.lang.String.valueOf(r6)
            int r3 = r3.length()
            int r3 = r3 + r8
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r3 = r3 + r4
            r8.<init>(r3)
            r8.append(r6)
            r8.append(r5)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            r0.println(r2)
        L1a4:
            return
        L1a5:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1a5
            throw r0
        L1a8:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a8
            throw r0
    }

    protected boolean enableLocalFallback() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.accounts.Account getAccount() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.google.android.gms.common.Feature[] getApiFeatures() {
            r1 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.common.internal.BaseGmsClient.zze
            return r0
    }

    public com.google.android.gms.common.wrappers.AttributionSourceWrapper getAttributionSourceWrapper() {
            r1 = this;
            com.google.android.gms.common.wrappers.AttributionSourceWrapper r0 = r1.zzB
            return r0
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
            r1 = this;
            com.google.android.gms.common.internal.zzj r0 = r1.zzE
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.Feature[] r0 = r0.zzb
            return r0
    }

    protected java.util.concurrent.Executor getBindServiceExecutor() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.os.Bundle getConnectionHint() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.zzl
            return r0
    }

    public java.lang.String getEndpointPackageName() {
            r2 = this;
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto Lf
            com.google.android.gms.common.internal.zzs r0 = r2.zza
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zzb()
            return r0
        Lf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to connect when checking package"
            r0.<init>(r1)
            throw r0
    }

    public int getGCoreServiceId() {
            r1 = this;
            int r0 = r1.zzy
            return r0
    }

    protected android.os.Bundle getGetServiceRequestExtraArgs() {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    public java.lang.String getLastDisconnectMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzk
            return r0
    }

    protected java.lang.String getLocalStartServiceAction() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.os.Looper getLooper() {
            r1 = this;
            android.os.Looper r0 = r1.zzm
            return r0
    }

    public int getMinApkVersion() {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            return r0
    }

    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor r21, java.util.Set<com.google.android.gms.common.api.Scope> r22) {
            r20 = this;
            r1 = r20
            r0 = r22
            android.os.Bundle r2 = r20.getGetServiceRequestExtraArgs()
            com.google.android.gms.common.internal.GetServiceRequest r15 = new com.google.android.gms.common.internal.GetServiceRequest
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 >= r4) goto L15
            java.lang.String r3 = r1.zzA
        L12:
            r17 = r3
            goto L35
        L15:
            com.google.android.gms.common.wrappers.AttributionSourceWrapper r3 = r1.zzB
            if (r3 != 0) goto L1c
            java.lang.String r3 = r1.zzA
            goto L12
        L1c:
            com.google.android.gms.common.wrappers.AttributionSourceWrapper r3 = r1.zzB
            android.content.AttributionSource r3 = r3.getAttributionSource()
            if (r3 != 0) goto L27
            java.lang.String r3 = r1.zzA
            goto L12
        L27:
            java.lang.String r4 = r3.getAttributionTag()
            if (r4 != 0) goto L30
            java.lang.String r3 = r1.zzA
            goto L12
        L30:
            java.lang.String r3 = r3.getAttributionTag()
            goto L12
        L35:
            int r5 = r1.zzy
            int r6 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.api.Scope[] r9 = com.google.android.gms.common.internal.GetServiceRequest.zza
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            com.google.android.gms.common.Feature[] r13 = com.google.android.gms.common.internal.GetServiceRequest.zzb
            r16 = 0
            r18 = 0
            r4 = 6
            r7 = 0
            r8 = 0
            r11 = 0
            r14 = 1
            r3 = r15
            r12 = r13
            r19 = r15
            r15 = r16
            r16 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.content.Context r3 = r1.zzl
            java.lang.String r3 = r3.getPackageName()
            r4 = r19
            r4.zzf = r3
            r4.zzi = r2
            if (r0 == 0) goto L6f
            r2 = 0
            com.google.android.gms.common.api.Scope[] r2 = new com.google.android.gms.common.api.Scope[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.gms.common.api.Scope[] r0 = (com.google.android.gms.common.api.Scope[]) r0
            r4.zzh = r0
        L6f:
            boolean r0 = r20.requiresSignIn()
            if (r0 == 0) goto L8f
            android.accounts.Account r0 = r20.getAccount()
            if (r0 != 0) goto L84
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r2 = "<<default account>>"
            java.lang.String r3 = "com.google"
            r0.<init>(r2, r3)
        L84:
            r4.zzj = r0
            if (r21 == 0) goto L9b
            android.os.IBinder r0 = r21.asBinder()
            r4.zzg = r0
            goto L9b
        L8f:
            boolean r0 = r20.requiresAccount()
            if (r0 == 0) goto L9b
            android.accounts.Account r0 = r20.getAccount()
            r4.zzj = r0
        L9b:
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.common.internal.BaseGmsClient.zze
            r4.zzk = r0
            com.google.android.gms.common.Feature[] r0 = r20.getApiFeatures()
            r4.zzl = r0
            boolean r0 = r20.usesClientTelemetry()
            if (r0 == 0) goto Lae
            r0 = 1
            r4.zzo = r0
        Lae:
            java.lang.Object r2 = r1.zzq     // Catch: java.lang.RuntimeException -> Ld0 android.os.RemoteException -> Ld2 java.lang.SecurityException -> Le7 android.os.DeadObjectException -> Le9
            monitor-enter(r2)     // Catch: java.lang.RuntimeException -> Ld0 android.os.RemoteException -> Ld2 java.lang.SecurityException -> Le7 android.os.DeadObjectException -> Le9
            com.google.android.gms.common.internal.IGmsServiceBroker r0 = r1.zzr     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto Lc4
            com.google.android.gms.common.internal.zzd r3 = new com.google.android.gms.common.internal.zzd     // Catch: java.lang.Throwable -> Lcd
            java.util.concurrent.atomic.AtomicInteger r5 = r1.zzd     // Catch: java.lang.Throwable -> Lcd
            int r5 = r5.get()     // Catch: java.lang.Throwable -> Lcd
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> Lcd
            r0.getService(r3, r4)     // Catch: java.lang.Throwable -> Lcd
            goto Lcb
        Lc4:
            java.lang.String r0 = "GmsClient"
            java.lang.String r3 = "mServiceBroker is null, client disconnected"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> Lcd
        Lcb:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcd
            return
        Lcd:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcd
            throw r0     // Catch: java.lang.RuntimeException -> Ld0 android.os.RemoteException -> Ld2 java.lang.SecurityException -> Le7 android.os.DeadObjectException -> Le9
        Ld0:
            r0 = move-exception
            goto Ld3
        Ld2:
            r0 = move-exception
        Ld3:
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r2, r3, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zzd
            int r0 = r0.get()
            r2 = 8
            r3 = 0
            r1.onPostInitHandler(r2, r3, r3, r0)
            return
        Le7:
            r0 = move-exception
            throw r0
        Le9:
            r0 = move-exception
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r2, r3, r0)
            r0 = 3
            r1.triggerConnectionSuspended(r0)
            return
    }

    protected java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    public final T getService() throws android.os.DeadObjectException {
            r3 = this;
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r1 = r3.zzv     // Catch: java.lang.Throwable -> L1d
            r2 = 5
            if (r1 == r2) goto L17
            r3.checkConnected()     // Catch: java.lang.Throwable -> L1d
            android.os.IInterface r1 = r3.zzs     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "Client is connected but service is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L1d
            r2 = r1
            android.os.IInterface r2 = (android.os.IInterface) r2     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L17:
            android.os.DeadObjectException r1 = new android.os.DeadObjectException     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    public android.os.IBinder getServiceBrokerBinder() {
            r2 = this;
            java.lang.Object r0 = r2.zzq
            monitor-enter(r0)
            com.google.android.gms.common.internal.IGmsServiceBroker r1 = r2.zzr     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            return r0
        La:
            android.os.IBinder r1 = r1.asBinder()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    protected abstract java.lang.String getServiceDescriptor();

    public android.content.Intent getSignInIntent() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not a sign in API"
            r0.<init>(r1)
            throw r0
    }

    protected abstract java.lang.String getStartServiceAction();

    protected java.lang.String getStartServicePackage() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms"
            return r0
    }

    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration() {
            r1 = this;
            com.google.android.gms.common.internal.zzj r0 = r1.zzE
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r0.zzd
            return r0
    }

    protected boolean getUseDynamicLookup() {
            r2 = this;
            int r0 = r2.getMinApkVersion()
            r1 = 211700000(0xc9e4920, float:2.4387765E-31)
            if (r0 < r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean hasConnectionInfo() {
            r1 = this;
            com.google.android.gms.common.internal.zzj r0 = r1.zzE
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isConnected() {
            r3 = this;
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r1 = r3.zzv     // Catch: java.lang.Throwable -> Ld
            r2 = 4
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public boolean isConnecting() {
            r4 = this;
            java.lang.Object r0 = r4.zzp
            monitor-enter(r0)
            int r1 = r4.zzv     // Catch: java.lang.Throwable -> L10
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Le
            r2 = 3
            if (r1 != r2) goto Ld
            goto Le
        Ld:
            r3 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r3
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    protected void onConnectedLocked(T r3) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzh = r0
            return
    }

    protected void onConnectionFailed(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            int r3 = r3.getErrorCode()
            r2.zzi = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzj = r0
            return
    }

    protected void onConnectionSuspended(int r3) {
            r2 = this;
            r2.zzf = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzg = r0
            return
    }

    protected void onPostInitHandler(int r2, android.os.IBinder r3, android.os.Bundle r4, int r5) {
            r1 = this;
            com.google.android.gms.common.internal.zzf r0 = new com.google.android.gms.common.internal.zzf
            r0.<init>(r1, r2, r3, r4)
            android.os.Handler r2 = r1.zzb
            r3 = 1
            r4 = -1
            android.os.Message r3 = r2.obtainMessage(r3, r5, r4, r0)
            r2.sendMessage(r3)
            return
    }

    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1) {
            r0 = this;
            r1.onSignOutComplete()
            return
    }

    public boolean providesSignIn() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean requiresAccount() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean requiresGooglePlayServices() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean requiresSignIn() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void setAttributionSourceWrapper(com.google.android.gms.common.wrappers.AttributionSourceWrapper r1) {
            r0 = this;
            r0.zzB = r1
            return
    }

    public void setAttributionTag(java.lang.String r1) {
            r0 = this;
            r0.zzA = r1
            return
    }

    public void triggerConnectionSuspended(int r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzd
            int r0 = r0.get()
            android.os.Handler r1 = r3.zzb
            r2 = 6
            android.os.Message r4 = r1.obtainMessage(r2, r0, r4)
            r1.sendMessage(r4)
            return
    }

    protected void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r3, int r4, android.app.PendingIntent r5) {
            r2 = this;
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r0 = r3
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) r0
            r2.zzc = r3
            java.util.concurrent.atomic.AtomicInteger r3 = r2.zzd
            int r3 = r3.get()
            android.os.Handler r0 = r2.zzb
            r1 = 3
            android.os.Message r3 = r0.obtainMessage(r1, r3, r4, r5)
            r0.sendMessage(r3)
            return
    }

    public boolean usesClientTelemetry() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzz
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.zzl
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
        Le:
            return r0
    }

    protected final void zzb(int r3, android.os.Bundle r4, int r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzg r0 = new com.google.android.gms.common.internal.zzg
            r0.<init>(r2, r3, r4)
            android.os.Handler r3 = r2.zzb
            r4 = 7
            r1 = -1
            android.os.Message r4 = r3.obtainMessage(r4, r5, r1, r0)
            r3.sendMessage(r4)
            return
    }

    final /* synthetic */ void zzc(com.google.android.gms.common.internal.zzj r2) {
            r1 = this;
            r1.zzE = r2
            boolean r0 = r1.usesClientTelemetry()
            if (r0 == 0) goto L19
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = r2.zzd
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            if (r2 != 0) goto L12
            r2 = 0
            goto L16
        L12:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = r2.zza()
        L16:
            r0.zza(r2)
        L19:
            return
    }

    final /* synthetic */ void zzd(int r1, android.os.IInterface r2) {
            r0 = this;
            r2 = 0
            r0.zzp(r1, r2)
            return
    }

    final /* synthetic */ boolean zze(int r3, int r4, android.os.IInterface r5) {
            r2 = this;
            java.lang.Object r0 = r2.zzp
            monitor-enter(r0)
            int r1 = r2.zzv     // Catch: java.lang.Throwable -> L10
            if (r1 == r3) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r3 = 0
            goto Lf
        La:
            r2.zzp(r4, r5)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r3 = 1
        Lf:
            return r3
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    final /* synthetic */ void zzf(int r4) {
            r3 = this;
            java.lang.Object r4 = r3.zzp
            monitor-enter(r4)
            int r0 = r3.zzv     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            r4 = 3
            if (r0 != r4) goto Le
            r4 = 1
            r3.zzD = r4
            r4 = 5
            goto Lf
        Le:
            r4 = 4
        Lf:
            android.os.Handler r0 = r3.zzb
            java.util.concurrent.atomic.AtomicInteger r1 = r3.zzd
            int r1 = r1.get()
            r2 = 16
            android.os.Message r4 = r0.obtainMessage(r4, r1, r2)
            r0.sendMessage(r4)
            return
        L21:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    final /* synthetic */ boolean zzg() {
            r2 = this;
            boolean r0 = r2.zzD
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r0 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
    }

    final /* synthetic */ java.lang.Object zzh() {
            r1 = this;
            java.lang.Object r0 = r1.zzq
            return r0
    }

    final /* synthetic */ void zzi(com.google.android.gms.common.internal.IGmsServiceBroker r1) {
            r0 = this;
            r0.zzr = r1
            return
    }

    final /* synthetic */ java.util.ArrayList zzj() {
            r1 = this;
            java.util.ArrayList r0 = r1.zzt
            return r0
    }

    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzk() {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r1.zzw
            return r0
    }

    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzl() {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = r1.zzx
            return r0
    }

    final /* synthetic */ com.google.android.gms.common.ConnectionResult zzm() {
            r1 = this;
            com.google.android.gms.common.ConnectionResult r0 = r1.zzC
            return r0
    }

    final /* synthetic */ void zzn(com.google.android.gms.common.ConnectionResult r1) {
            r0 = this;
            r0.zzC = r1
            return
    }

    final /* synthetic */ boolean zzo() {
            r1 = this;
            boolean r0 = r1.zzD
            return r0
    }
}
