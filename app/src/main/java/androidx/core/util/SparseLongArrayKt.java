package androidx.core.util;

/* JADX INFO: compiled from: SparseLongArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0086\b\u001aE\u0010\f\u001a\u00020\r*\u00020\u000226\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u000fH\u0086\b\u001a\u001d\u0010\u0012\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000bH\u0086\b\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u0017\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\n\u0010\u0018\u001a\u00020\u0019*\u00020\u0002\u001a\u0015\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0086\u0002\u001a\u0012\u0010\u001c\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u001a\u0010\u001d\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u001d\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\n\u001a\n\u0010\u001f\u001a\u00020 *\u00020\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006!"}, d2 = {"size", "", "Landroid/util/SparseLongArray;", "getSize", "(Landroid/util/SparseLongArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "Lkotlin/collections/LongIterator;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SparseLongArrayKt {



    public static final boolean contains(android.util.SparseLongArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final boolean containsKey(android.util.SparseLongArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final boolean containsValue(android.util.SparseLongArray r0, long r1) {
            int r0 = r0.indexOfValue(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final void forEach(android.util.SparseLongArray r5, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> r6) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            int r2 = r5.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r5.valueAt(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    public static final long getOrDefault(android.util.SparseLongArray r0, int r1, long r2) {
            long r0 = r0.get(r1, r2)
            return r0
    }

    public static final long getOrElse(android.util.SparseLongArray r0, int r1, kotlin.jvm.functions.Function0<java.lang.Long> r2) {
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            long r0 = r0.valueAt(r1)
            goto L15
        Lb:
            java.lang.Object r0 = r2.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
        L15:
            return r0
    }

    public static final int getSize(android.util.SparseLongArray r0) {
            int r0 = r0.size()
            return r0
    }

    public static final boolean isEmpty(android.util.SparseLongArray r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final boolean isNotEmpty(android.util.SparseLongArray r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final kotlin.collections.IntIterator keyIterator(android.util.SparseLongArray r1) {
            androidx.core.util.SparseLongArrayKt$keyIterator$1 r0 = new androidx.core.util.SparseLongArrayKt$keyIterator$1
            r0.<init>(r1)
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
            return r0
    }

    public static final android.util.SparseLongArray plus(android.util.SparseLongArray r3, android.util.SparseLongArray r4) {
            android.util.SparseLongArray r0 = new android.util.SparseLongArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    public static final void putAll(android.util.SparseLongArray r5, android.util.SparseLongArray r6) {
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r6.keyAt(r1)
            long r3 = r6.valueAt(r1)
            r5.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public static final boolean remove(android.util.SparseLongArray r2, int r3, long r4) {
            int r3 = r2.indexOfKey(r3)
            if (r3 < 0) goto L13
            long r0 = r2.valueAt(r3)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L13
            r2.removeAt(r3)
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public static final void set(android.util.SparseLongArray r0, int r1, long r2) {
            r0.put(r1, r2)
            return
    }

    public static final kotlin.collections.LongIterator valueIterator(android.util.SparseLongArray r1) {
            androidx.core.util.SparseLongArrayKt$valueIterator$1 r0 = new androidx.core.util.SparseLongArrayKt$valueIterator$1
            r0.<init>(r1)
            kotlin.collections.LongIterator r0 = (kotlin.collections.LongIterator) r0
            return r0
    }
}
