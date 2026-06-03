package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This type is not intended to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void checkArgument(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkArgument(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static <T extends java.util.Collection<?>> T checkCollectionNotEmpty(T r1, java.lang.Object r2) {
            checkNotNull(r1, r2)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            checkArgument(r0, r2)
            return r1
    }

    public static java.lang.String checkNotEmpty(java.lang.String r1, java.lang.Object r2) {
            checkNotNull(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r0 = r0 ^ 1
            checkArgument(r0, r2)
            return r1
    }

    public static <T> T checkNotNull(T r0) {
            r0.getClass()
            return r0
    }

    public static <T> T checkNotNull(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String checkNullOrNotEmpty(java.lang.String r0, java.lang.Object r1) {
            if (r0 == 0) goto L5
            checkNotEmpty(r0, r1)
        L5:
            return r0
    }
}
