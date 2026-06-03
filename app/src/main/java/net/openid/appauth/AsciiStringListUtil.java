package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
final class AsciiStringListUtil {
    private AsciiStringListUtil() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This type is not intended to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String iterableToString(java.lang.Iterable<java.lang.String> r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r3 = r3 ^ 1
            java.lang.String r4 = "individual scopes cannot be null or empty"
            net.openid.appauth.Preconditions.checkArgument(r3, r4)
            r1.add(r2)
            goto Ld
        L28:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L2f
            return r0
        L2f:
            java.lang.String r5 = " "
            java.lang.String r5 = android.text.TextUtils.join(r5, r1)
            return r5
    }

    public static java.util.Set<java.lang.String> stringToSet(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = " "
            java.lang.String[] r2 = android.text.TextUtils.split(r2, r0)
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            r0.<init>(r1)
            r0.addAll(r2)
            return r0
    }
}
