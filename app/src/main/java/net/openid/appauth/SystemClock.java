package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
class SystemClock implements net.openid.appauth.Clock {
    public static final net.openid.appauth.SystemClock INSTANCE = null;

    static {
            net.openid.appauth.SystemClock r0 = new net.openid.appauth.SystemClock
            r0.<init>()
            net.openid.appauth.SystemClock.INSTANCE = r0
            return
    }

    private SystemClock() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // net.openid.appauth.Clock
    public long getCurrentTimeMillis() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }
}
