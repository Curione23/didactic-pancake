package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class MapFieldLite<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.crypto.tink.shaded.protobuf.MapFieldLite<?, ?> EMPTY_MAP_FIELD = null;
    private boolean isMutable;

    static {
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = new com.google.crypto.tink.shaded.protobuf.MapFieldLite
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.MapFieldLite.EMPTY_MAP_FIELD = r0
            r0.makeImmutable()
            return
    }

    private MapFieldLite() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isMutable = r0
            return
    }

    private MapFieldLite(java.util.Map<K, V> r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.isMutable = r1
            return
    }

    static <K, V> int calculateHashCodeForMap(java.util.Map<K, V> r3) {
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            int r2 = calculateHashCodeForObject(r2)
            java.lang.Object r1 = r1.getValue()
            int r1 = calculateHashCodeForObject(r1)
            r1 = r1 ^ r2
            int r0 = r0 + r1
            goto L9
        L28:
            return r0
    }

    private static int calculateHashCodeForObject(java.lang.Object r1) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto Lb
            byte[] r1 = (byte[]) r1
            int r1 = com.google.crypto.tink.shaded.protobuf.Internal.hashCode(r1)
            return r1
        Lb:
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r0 != 0) goto L14
            int r1 = r1.hashCode()
            return r1
        L14:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    private static void checkForNullKeysAndValues(java.util.Map<?, ?> r2) {
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r1)
            java.lang.Object r1 = r2.get(r1)
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r1)
            goto L8
        L1d:
            return
    }

    private static java.lang.Object copy(java.lang.Object r1) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto Lb
            byte[] r1 = (byte[]) r1
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
        Lb:
            return r1
    }

    static <K, V> java.util.Map<K, V> copy(java.util.Map<K, V> r3) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r1 = copy(r1)
            r0.put(r2, r1)
            goto Ld
        L29:
            return r0
    }

    public static <K, V> com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> emptyMapField() {
            com.google.crypto.tink.shaded.protobuf.MapFieldLite<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.MapFieldLite.EMPTY_MAP_FIELD
            return r0
    }

    private void ensureMutable() {
            r1 = this;
            boolean r0 = r1.isMutable()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private static boolean equals(java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto L11
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L11
            byte[] r1 = (byte[]) r1
            byte[] r2 = (byte[]) r2
            boolean r1 = java.util.Arrays.equals(r1, r2)
            return r1
        L11:
            boolean r1 = r1.equals(r2)
            return r1
    }

    static <K, V> boolean equals(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L10
            return r3
        L10:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L2f
            return r3
        L2f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = equals(r2, r1)
            if (r1 != 0) goto L18
            return r3
        L42:
            return r0
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
            r0 = this;
            r0.ensureMutable()
            super.clear()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Set r0 = java.util.Collections.emptySet()
            goto Lf
        Lb:
            java.util.Set r0 = super.entrySet()
        Lf:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Le
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = equals(r1, r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
            r1 = this;
            int r0 = calculateHashCodeForMap(r1)
            return r0
    }

    public boolean isMutable() {
            r1 = this;
            boolean r0 = r1.isMutable
            return r0
    }

    public void makeImmutable() {
            r1 = this;
            r0 = 0
            r1.isMutable = r0
            return
    }

    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> r2) {
            r1 = this;
            r1.ensureMutable()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            r1.putAll(r2)
        Lc:
            return
    }

    public com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> mutableCopy() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = new com.google.crypto.tink.shaded.protobuf.MapFieldLite
            r0.<init>()
            goto L11
        Lc:
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = new com.google.crypto.tink.shaded.protobuf.MapFieldLite
            r0.<init>(r1)
        L11:
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K r1, V r2) {
            r0 = this;
            r0.ensureMutable()
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r1)
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2)
            java.lang.Object r1 = super.put(r1, r2)
            return r1
    }

    public V put(java.util.Map.Entry<K, V> r2) {
            r1 = this;
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r2 = r1.put(r0, r2)
            return r2
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r1) {
            r0 = this;
            r0.ensureMutable()
            checkForNullKeysAndValues(r1)
            super.putAll(r1)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r1) {
            r0 = this;
            r0.ensureMutable()
            java.lang.Object r1 = super.remove(r1)
            return r1
    }
}
