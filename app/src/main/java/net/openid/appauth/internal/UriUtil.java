package net.openid.appauth.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class UriUtil {
    private UriUtil() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This type is not intended to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    public static void appendQueryParameterIfNotNull(android.net.Uri.Builder r1, java.lang.String r2, java.lang.Object r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.toString()
            if (r0 != 0) goto La
            return
        La:
            java.lang.String r3 = r3.toString()
            r1.appendQueryParameter(r2, r3)
            return
    }

    public static java.util.List<androidx.core.util.Pair<java.lang.String, java.lang.String>> formUrlDecode(java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Lb
            java.util.List r7 = java.util.Collections.emptyList()
            return r7
        Lb:
            java.lang.String r0 = "&"
            java.lang.String[] r7 = r7.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L19:
            if (r3 >= r1) goto L43
            r4 = r7[r3]
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            r5 = r4[r2]
            r6 = 1
            r4 = r4[r6]
            java.lang.String r6 = "utf-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r6)     // Catch: java.io.UnsupportedEncodingException -> L36
            androidx.core.util.Pair r4 = androidx.core.util.Pair.create(r5, r4)     // Catch: java.io.UnsupportedEncodingException -> L36
            r0.add(r4)     // Catch: java.io.UnsupportedEncodingException -> L36
            goto L40
        L36:
            r4 = move-exception
            java.lang.String r5 = "Unable to decode parameter, ignoring"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            net.openid.appauth.internal.Logger.error(r5, r4)
        L40:
            int r3 = r3 + 1
            goto L19
        L43:
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> formUrlDecodeUnique(java.lang.String r3) {
            java.util.List r3 = formUrlDecode(r3)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            F r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            S r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r2, r1)
            goto Ld
        L25:
            return r0
    }

    public static java.lang.String formUrlEncode(java.util.Map<java.lang.String, java.lang.String> r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = formUrlEncodeValue(r1)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L12
        L49:
            java.lang.String r4 = "&"
            java.lang.String r4 = android.text.TextUtils.join(r4, r0)
            return r4
    }

    public static java.lang.String formUrlEncodeValue(java.lang.String r1) {
            net.openid.appauth.Preconditions.checkNotNull(r1)
            java.lang.String r0 = "utf-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> La
            return r1
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to encode using UTF-8"
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.Long getLongQueryParameter(android.net.Uri r0, java.lang.String r1) {
            java.lang.String r0 = r0.getQueryParameter(r1)
            if (r0 == 0) goto Lf
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static android.net.Uri parseUriIfAvailable(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    public static java.util.List<android.os.Bundle> toCustomTabUriBundle(android.net.Uri[] r5, int r6) {
            r0 = 0
            if (r6 < 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            java.lang.String r2 = "startIndex must be positive"
            net.openid.appauth.Preconditions.checkArgument(r1, r2)
            if (r5 == 0) goto L3a
            int r1 = r5.length
            if (r1 > r6) goto L11
            goto L3a
        L11:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r5.length
            int r2 = r2 - r6
            r1.<init>(r2)
        L18:
            int r2 = r5.length
            if (r6 >= r2) goto L39
            r2 = r5[r6]
            if (r2 != 0) goto L27
            java.lang.String r2 = "Null URI in possibleUris list - ignoring"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            net.openid.appauth.internal.Logger.warn(r2, r3)
            goto L36
        L27:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "android.support.customtabs.otherurls.URL"
            r4 = r5[r6]
            r2.putParcelable(r3, r4)
            r1.add(r2)
        L36:
            int r6 = r6 + 1
            goto L18
        L39:
            return r1
        L3a:
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
    }
}
