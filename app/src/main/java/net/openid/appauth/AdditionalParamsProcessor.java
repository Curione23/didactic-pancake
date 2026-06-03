package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
class AdditionalParamsProcessor {
    private AdditionalParamsProcessor() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.Set<java.lang.String> builtInParams(java.lang.String... r1) {
            if (r1 == 0) goto L14
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto L14
        L6:
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r0)
            return r1
        L14:
            java.util.Set r1 = java.util.Collections.emptySet()
            return r1
    }

    static java.util.Map<java.lang.String, java.lang.String> checkAdditionalParams(java.util.Map<java.lang.String, java.lang.String> r6, java.util.Set<java.lang.String> r7) {
            if (r6 != 0) goto L7
            java.util.Map r6 = java.util.Collections.emptyMap()
            return r6
        L7:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "additional parameter keys cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r2, r3)
            java.lang.String r3 = "additional parameter values cannot be null"
            net.openid.appauth.Preconditions.checkNotNull(r1, r3)
            boolean r3 = r7.contains(r2)
            r3 = r3 ^ 1
            java.lang.String r4 = "Parameter %s is directly supported via the authorization request builder, use the builder method instead"
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            net.openid.appauth.Preconditions.checkArgument(r3, r4, r5)
            r0.put(r2, r1)
            goto L14
        L49:
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r0)
            return r6
    }

    static java.util.Map<java.lang.String, java.lang.String> extractAdditionalParams(android.net.Uri r4, java.util.Set<java.lang.String> r5) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r4.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r5.contains(r2)
            if (r3 != 0) goto Ld
            java.lang.String r3 = r4.getQueryParameter(r2)
            r0.put(r2, r3)
            goto Ld
        L27:
            return r0
    }

    static java.util.Map<java.lang.String, java.lang.String> extractAdditionalParams(org.json.JSONObject r4, java.util.Set<java.lang.String> r5) throws org.json.JSONException {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r4.keys()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r5.contains(r2)
            if (r3 != 0) goto L9
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = r3.toString()
            r0.put(r2, r3)
            goto L9
        L27:
            return r0
    }
}
