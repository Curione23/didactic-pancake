package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: CloseGuard.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", "", "getMethod", "Ljava/lang/reflect/Method;", "openMethod", "warnIfOpenMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "createAndOpen", "closer", "", "warnIfOpen", "", "closeGuardInstance", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CloseGuard {
    public static final okhttp3.internal.platform.android.CloseGuard.Companion Companion = null;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method openMethod;
    private final java.lang.reflect.Method warnIfOpenMethod;

    /* JADX INFO: compiled from: CloseGuard.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", "", "()V", "get", "Lokhttp3/internal/platform/android/CloseGuard;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.platform.android.CloseGuard get() {
                r6 = this;
                java.lang.String r0 = "dalvik.system.CloseGuard"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L25
                java.lang.String r1 = "get"
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L25
                java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L25
                java.lang.String r3 = "open"
                r4 = 1
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L25
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r2] = r5     // Catch: java.lang.Exception -> L25
                java.lang.reflect.Method r3 = r0.getMethod(r3, r4)     // Catch: java.lang.Exception -> L25
                java.lang.String r4 = "warnIfOpen"
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L25
                java.lang.reflect.Method r0 = r0.getMethod(r4, r2)     // Catch: java.lang.Exception -> L25
                goto L28
            L25:
                r1 = 0
                r0 = r1
                r3 = r0
            L28:
                okhttp3.internal.platform.android.CloseGuard r2 = new okhttp3.internal.platform.android.CloseGuard
                r2.<init>(r1, r3, r0)
                return r2
        }
    }

    static {
            okhttp3.internal.platform.android.CloseGuard$Companion r0 = new okhttp3.internal.platform.android.CloseGuard$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.CloseGuard.Companion = r0
            return
    }

    public CloseGuard(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.getMethod = r1
            r0.openMethod = r2
            r0.warnIfOpenMethod = r3
            return
    }

    public final java.lang.Object createAndOpen(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "closer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.reflect.Method r0 = r3.getMethod
            r1 = 0
            if (r0 == 0) goto L1e
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Method r2 = r3.openMethod     // Catch: java.lang.Exception -> L1e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Exception -> L1e
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L1e
            r2.invoke(r0, r4)     // Catch: java.lang.Exception -> L1e
            return r0
        L1e:
            return r1
    }

    public final boolean warnIfOpen(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto Le
            java.lang.reflect.Method r1 = r3.warnIfOpenMethod     // Catch: java.lang.Exception -> Le
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> Le
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> Le
            r1.invoke(r4, r2)     // Catch: java.lang.Exception -> Le
            r0 = 1
        Le:
            return r0
    }
}
