package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isEmpty(java.util.Collection<?> r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf() {
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T r0) {
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T... r2) {
            int r0 = r2.length
            if (r0 == 0) goto L17
            r1 = 1
            if (r0 == r1) goto Lf
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            goto L1b
        Lf:
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = java.util.Collections.singletonList(r2)
            goto L1b
        L17:
            java.util.List r2 = java.util.Collections.emptyList()
        L1b:
            return r2
    }

    public static <K, V> java.util.Map<K, V> mapOf(K r2, V r3, K r4, V r5, K r6, V r7) {
            r0 = 3
            r1 = 0
            java.util.Map r0 = zzb(r0, r1)
            r0.put(r2, r3)
            r0.put(r4, r5)
            r0.put(r6, r7)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            return r2
    }

    public static <K, V> java.util.Map<K, V> mapOf(K r2, V r3, K r4, V r5, K r6, V r7, K r8, V r9, K r10, V r11, K r12, V r13) {
            r0 = 6
            r1 = 0
            java.util.Map r0 = zzb(r0, r1)
            r0.put(r2, r3)
            r0.put(r4, r5)
            r0.put(r6, r7)
            r0.put(r8, r9)
            r0.put(r10, r11)
            r0.put(r12, r13)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            return r2
    }

    public static <K, V> java.util.Map<K, V> mapOfKeyValueArrays(K[] r4, V[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto L2e
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L20
            java.util.Map r0 = zzb(r0, r2)
        Le:
            int r1 = r4.length
            if (r2 >= r1) goto L1b
            r1 = r4[r2]
            r3 = r5[r2]
            r0.put(r1, r3)
            int r2 = r2 + 1
            goto Le
        L1b:
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r0)
            return r4
        L20:
            r4 = r4[r2]
            r5 = r5[r2]
            java.util.Map r4 = java.util.Collections.singletonMap(r4, r5)
            return r4
        L29:
            java.util.Map r4 = java.util.Collections.emptyMap()
            return r4
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r5 = r5 + 44
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r5 = r5 + r2
            r3.<init>(r5)
            java.lang.String r5 = "Key and values array lengths not equal: "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = " != "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            r4.<init>(r5)
            throw r4
    }

    public static <T> java.util.Set<T> mutableSetOfWithSize(int r1) {
            if (r1 != 0) goto L8
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
            goto Ld
        L8:
            r0 = 1
            java.util.Set r1 = zza(r1, r0)
        Ld:
            return r1
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T r2, T r3, T r4) {
            r0 = 3
            r1 = 0
            java.util.Set r0 = zza(r0, r1)
            r0.add(r2)
            r0.add(r3)
            r0.add(r4)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            return r2
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T... r6) {
            int r0 = r6.length
            if (r0 == 0) goto L5e
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L57
            r3 = 2
            if (r0 == r3) goto L44
            r4 = 3
            if (r0 == r4) goto L39
            r5 = 4
            if (r0 == r5) goto L1c
            java.util.Set r0 = zza(r0, r2)
            java.util.Collections.addAll(r0, r6)
            java.util.Set r6 = java.util.Collections.unmodifiableSet(r0)
            return r6
        L1c:
            r0 = r6[r2]
            r1 = r6[r1]
            r3 = r6[r3]
            r6 = r6[r4]
            java.util.Set r2 = zza(r5, r2)
            r2.add(r0)
            r2.add(r1)
            r2.add(r3)
            r2.add(r6)
            java.util.Set r6 = java.util.Collections.unmodifiableSet(r2)
            return r6
        L39:
            r0 = r6[r2]
            r1 = r6[r1]
            r6 = r6[r3]
            java.util.Set r6 = setOf(r0, r1, r6)
            return r6
        L44:
            r0 = r6[r2]
            r6 = r6[r1]
            java.util.Set r1 = zza(r3, r2)
            r1.add(r0)
            r1.add(r6)
            java.util.Set r6 = java.util.Collections.unmodifiableSet(r1)
            return r6
        L57:
            r6 = r6[r2]
            java.util.Set r6 = java.util.Collections.singleton(r6)
            return r6
        L5e:
            java.util.Set r6 = java.util.Collections.emptySet()
            return r6
    }

    private static java.util.Set zza(int r2, boolean r3) {
            r0 = 1
            if (r0 == r3) goto L6
            r1 = 256(0x100, float:3.59E-43)
            goto L8
        L6:
            r1 = 128(0x80, float:1.8E-43)
        L8:
            if (r2 > r1) goto L10
            androidx.collection.ArraySet r3 = new androidx.collection.ArraySet
            r3.<init>(r2)
            goto L1d
        L10:
            if (r0 == r3) goto L15
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L17
        L15:
            r3 = 1061158912(0x3f400000, float:0.75)
        L17:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2, r3)
            r3 = r0
        L1d:
            return r3
    }

    private static java.util.Map zzb(int r1, boolean r2) {
            r2 = 256(0x100, float:3.59E-43)
            if (r1 > r2) goto La
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>(r1)
            goto L11
        La:
            java.util.HashMap r2 = new java.util.HashMap
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r1, r0)
        L11:
            return r2
    }
}
