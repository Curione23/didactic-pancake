package androidx.core.util;

/* JADX INFO: compiled from: SparseIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001aE\u0010\u000b\u001a\u00020\f*\u00020\u000226\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\f0\u000eH\u0086\b\u001a\u001d\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\b\u001a#\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0086\b\u001a\r\u0010\u0015\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0002\u001a\u0015\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0086\u0002\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u001a\u0010\u001c\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u001d\u0010\u001d\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\n\u0010\u001e\u001a\u00020\u0018*\u00020\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001f"}, d2 = {"size", "", "Landroid/util/SparseIntArray;", "getSize", "(Landroid/util/SparseIntArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SparseIntArrayKt {



    public static final boolean contains(android.util.SparseIntArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final boolean containsKey(android.util.SparseIntArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final boolean containsValue(android.util.SparseIntArray r0, int r1) {
            int r0 = r0.indexOfValue(r1)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final void forEach(android.util.SparseIntArray r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            int r2 = r4.keyAt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.valueAt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    public static final int getOrDefault(android.util.SparseIntArray r0, int r1, int r2) {
            int r0 = r0.get(r1, r2)
            return r0
    }

    public static final int getOrElse(android.util.SparseIntArray r0, int r1, kotlin.jvm.functions.Function0<java.lang.Integer> r2) {
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            int r0 = r0.valueAt(r1)
            goto L15
        Lb:
            java.lang.Object r0 = r2.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L15:
            return r0
    }

    public static final int getSize(android.util.SparseIntArray r0) {
            int r0 = r0.size()
            return r0
    }

    public static final boolean isEmpty(android.util.SparseIntArray r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final boolean isNotEmpty(android.util.SparseIntArray r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static final kotlin.collections.IntIterator keyIterator(android.util.SparseIntArray r1) {
            androidx.core.util.SparseIntArrayKt$keyIterator$1 r0 = new androidx.core.util.SparseIntArrayKt$keyIterator$1
            r0.<init>(r1)
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
            return r0
    }

    public static final android.util.SparseIntArray plus(android.util.SparseIntArray r3, android.util.SparseIntArray r4) {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    public static final void putAll(android.util.SparseIntArray r4, android.util.SparseIntArray r5) {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            int r2 = r5.keyAt(r1)
            int r3 = r5.valueAt(r1)
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public static final boolean remove(android.util.SparseIntArray r1, int r2, int r3) {
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L11
            int r0 = r1.valueAt(r2)
            if (r3 != r0) goto L11
            r1.removeAt(r2)
            r1 = 1
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final void set(android.util.SparseIntArray r0, int r1, int r2) {
            r0.put(r1, r2)
            return
    }

    public static final kotlin.collections.IntIterator valueIterator(android.util.SparseIntArray r1) {
            androidx.core.util.SparseIntArrayKt$valueIterator$1 r0 = new androidx.core.util.SparseIntArrayKt$valueIterator$1
            r0.<init>(r1)
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
            return r0
    }
}
