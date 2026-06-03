package kotlinx.coroutines;

/* JADX INFO: compiled from: Debug.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0081\b\u001a\b\u0010\u0016\u001a\u00020\u0013H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0003\"\u000e\u0010\u0011\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"ASSERTIONS_ENABLED", "", "getASSERTIONS_ENABLED", "()Z", "COROUTINE_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "getCOROUTINE_ID", "()Ljava/util/concurrent/atomic/AtomicLong;", "DEBUG", "getDEBUG", "DEBUG_PROPERTY_NAME", "", "DEBUG_PROPERTY_VALUE_AUTO", "DEBUG_PROPERTY_VALUE_OFF", "DEBUG_PROPERTY_VALUE_ON", "RECOVER_STACK_TRACES", "getRECOVER_STACK_TRACES", "STACKTRACE_RECOVERY_PROPERTY_NAME", "assert", "", "value", "Lkotlin/Function0;", "resetCoroutineId", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DebugKt {
    private static final boolean ASSERTIONS_ENABLED = false;
    private static final java.util.concurrent.atomic.AtomicLong COROUTINE_ID = null;
    private static final boolean DEBUG = false;
    public static final java.lang.String DEBUG_PROPERTY_NAME = "kotlinx.coroutines.debug";
    public static final java.lang.String DEBUG_PROPERTY_VALUE_AUTO = "auto";
    public static final java.lang.String DEBUG_PROPERTY_VALUE_OFF = "off";
    public static final java.lang.String DEBUG_PROPERTY_VALUE_ON = "on";
    private static final boolean RECOVER_STACK_TRACES = false;
    public static final java.lang.String STACKTRACE_RECOVERY_PROPERTY_NAME = "kotlinx.coroutines.stacktrace.recovery";

    static {
            java.lang.Class<kotlinx.coroutines.CoroutineId> r0 = kotlinx.coroutines.CoroutineId.class
            r0 = 0
            kotlinx.coroutines.DebugKt.ASSERTIONS_ENABLED = r0
            java.lang.String r1 = "kotlinx.coroutines.debug"
            java.lang.String r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1)
            r2 = 1
            if (r1 == 0) goto L66
            int r3 = r1.hashCode()
            if (r3 == 0) goto L3d
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L34
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L2b
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L47
            java.lang.String r3 = "auto"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L47
            goto L66
        L2b:
            java.lang.String r3 = "off"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L47
            goto L66
        L34:
            java.lang.String r3 = "on"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L47
            goto L45
        L3d:
            java.lang.String r3 = ""
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L47
        L45:
            r1 = r2
            goto L67
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            r2 = 39
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L66:
            r1 = r0
        L67:
            kotlinx.coroutines.DebugKt.DEBUG = r1
            if (r1 == 0) goto L74
            java.lang.String r1 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1, r2)
            if (r1 == 0) goto L74
            r0 = r2
        L74:
            kotlinx.coroutines.DebugKt.RECOVER_STACK_TRACES = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.DebugKt.COROUTINE_ID = r0
            return
    }

    /* JADX INFO: renamed from: assert, reason: not valid java name */
    private static final void m2255assert(kotlin.jvm.functions.Function0<java.lang.Boolean> r1) {
            boolean r0 = getASSERTIONS_ENABLED()
            if (r0 == 0) goto L19
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L19:
            return
    }

    public static final boolean getASSERTIONS_ENABLED() {
            boolean r0 = kotlinx.coroutines.DebugKt.ASSERTIONS_ENABLED
            return r0
    }

    public static final java.util.concurrent.atomic.AtomicLong getCOROUTINE_ID() {
            java.util.concurrent.atomic.AtomicLong r0 = kotlinx.coroutines.DebugKt.COROUTINE_ID
            return r0
    }

    public static final boolean getDEBUG() {
            boolean r0 = kotlinx.coroutines.DebugKt.DEBUG
            return r0
    }

    public static final boolean getRECOVER_STACK_TRACES() {
            boolean r0 = kotlinx.coroutines.DebugKt.RECOVER_STACK_TRACES
            return r0
    }

    public static final void resetCoroutineId() {
            java.util.concurrent.atomic.AtomicLong r0 = kotlinx.coroutines.DebugKt.COROUTINE_ID
            r1 = 0
            r0.set(r1)
            return
    }
}
