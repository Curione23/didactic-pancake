package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    static class Api22Impl {
        private Api22Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isAsynchronous(android.os.Message r0) {
                boolean r0 = r0.isAsynchronous()
                return r0
        }

        static void setAsynchronous(android.os.Message r0, boolean r1) {
                r0.setAsynchronous(r1)
                return
        }
    }

    static {
            return
    }

    private MessageCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAsynchronous(android.os.Message r0) {
            boolean r0 = androidx.core.os.MessageCompat.Api22Impl.isAsynchronous(r0)
            return r0
    }

    public static void setAsynchronous(android.os.Message r0, boolean r1) {
            androidx.core.os.MessageCompat.Api22Impl.setAsynchronous(r0, r1)
            return
    }
}
