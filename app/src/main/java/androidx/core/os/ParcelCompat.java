package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelCompat {

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T extends android.os.Parcelable> java.util.List<T> readParcelableList(android.os.Parcel r0, java.util.List<T> r1, java.lang.ClassLoader r2) {
                java.util.List r0 = r0.readParcelableList(r1, r2)
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.Parcelable.Creator<?> readParcelableCreator(android.os.Parcel r0, java.lang.ClassLoader r1) {
                android.os.Parcelable$Creator r0 = r0.readParcelableCreator(r1)
                return r0
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T[] readArray(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.readArray(r1, r2)
                return r0
        }

        static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.readArrayList(r1, r2)
                return r0
        }

        static <V, K> java.util.HashMap<K, V> readHashMap(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends K> r2, java.lang.Class<? extends V> r3) {
                java.util.HashMap r0 = r0.readHashMap(r1, r2, r3)
                return r0
        }

        static <T> void readList(android.os.Parcel r0, java.util.List<? super T> r1, java.lang.ClassLoader r2, java.lang.Class<T> r3) {
                r0.readList(r1, r2, r3)
                return
        }

        static <K, V> void readMap(android.os.Parcel r0, java.util.Map<? super K, ? super V> r1, java.lang.ClassLoader r2, java.lang.Class<K> r3, java.lang.Class<V> r4) {
                r0.readMap(r1, r2, r3, r4)
                return
        }

        static <T extends android.os.Parcelable> T readParcelable(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.readParcelable(r1, r2)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                return r0
        }

        static <T> T[] readParcelableArray(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.readParcelableArray(r1, r2)
                return r0
        }

        static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                android.os.Parcelable$Creator r0 = r0.readParcelableCreator(r1, r2)
                return r0
        }

        static <T> java.util.List<T> readParcelableList(android.os.Parcel r0, java.util.List<T> r1, java.lang.ClassLoader r2, java.lang.Class<T> r3) {
                java.util.List r0 = r0.readParcelableList(r1, r2, r3)
                return r0
        }

        static <T extends java.io.Serializable> T readSerializable(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.readSerializable(r1, r2)
                java.io.Serializable r0 = (java.io.Serializable) r0
                return r0
        }

        static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends T> r2) {
                android.util.SparseArray r0 = r0.readSparseArray(r1, r2)
                return r0
        }
    }

    private ParcelCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> java.lang.Object[] readArray(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object[] r2 = androidx.core.os.ParcelCompat.Api33Impl.readArray(r2, r3, r4)
            return r2
        Lb:
            java.lang.Object[] r2 = r2.readArray(r3)
            return r2
    }

    public static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r2 = androidx.core.os.ParcelCompat.Api33Impl.readArrayList(r2, r3, r4)
            return r2
        Lb:
            java.util.ArrayList r2 = r2.readArrayList(r3)
            return r2
    }

    public static boolean readBoolean(android.os.Parcel r0) {
            int r0 = r0.readInt()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static <K, V> java.util.HashMap<K, V> readHashMap(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<? extends K> r4, java.lang.Class<? extends V> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.HashMap r2 = androidx.core.os.ParcelCompat.Api33Impl.readHashMap(r2, r3, r4, r5)
            return r2
        Lb:
            java.util.HashMap r2 = r2.readHashMap(r3)
            return r2
    }

    public static <T> void readList(android.os.Parcel r2, java.util.List<? super T> r3, java.lang.ClassLoader r4, java.lang.Class<T> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.os.ParcelCompat.Api33Impl.readList(r2, r3, r4, r5)
            goto Ld
        La:
            r2.readList(r3, r4)
        Ld:
            return
    }

    public static <K, V> void readMap(android.os.Parcel r2, java.util.Map<? super K, ? super V> r3, java.lang.ClassLoader r4, java.lang.Class<K> r5, java.lang.Class<V> r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.os.ParcelCompat.Api33Impl.readMap(r2, r3, r4, r5, r6)
            goto Ld
        La:
            r2.readMap(r3, r4)
        Ld:
            return
    }

    public static <T extends android.os.Parcelable> T readParcelable(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.os.Parcelable r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelable(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.readParcelable(r3)
            if (r2 == 0) goto L45
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L18
            goto L45
        L18:
            android.os.BadParcelableException r3 = new android.os.BadParcelableException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Parcelable "
            r0.<init>(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = " is not a subclass of required class "
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " provided in the parameter"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L45:
            return r2
    }

    @java.lang.Deprecated
    public static <T> T[] readParcelableArray(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object[] r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableArray(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable[] r2 = r2.readParcelableArray(r3)
            java.lang.Class<android.os.Parcelable> r3 = android.os.Parcelable.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L1a
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        L1a:
            int r3 = r2.length
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r4, r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
        L22:
            int r1 = r2.length
            if (r0 >= r1) goto L59
            r1 = r2[r0]     // Catch: java.lang.ClassCastException -> L30
            java.lang.Object r1 = r4.cast(r1)     // Catch: java.lang.ClassCastException -> L30
            r3[r0] = r1     // Catch: java.lang.ClassCastException -> L30
            int r0 = r0 + 1
            goto L22
        L30:
            android.os.BadParcelableException r2 = new android.os.BadParcelableException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Parcelable at index "
            r3.<init>(r1)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = " is not a subclass of required class "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " provided in the parameter"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L59:
            return r3
    }

    public static <T> android.os.Parcelable[] readParcelableArrayTyped(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableArray(r2, r3, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            return r2
        Ld:
            android.os.Parcelable[] r2 = r2.readParcelableArray(r3)
            return r2
    }

    public static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.os.Parcelable$Creator r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableCreator(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable$Creator r2 = androidx.core.os.ParcelCompat.Api30Impl.readParcelableCreator(r2, r3)
            return r2
    }

    public static <T> java.util.List<T> readParcelableList(android.os.Parcel r2, java.util.List<T> r3, java.lang.ClassLoader r4, java.lang.Class<T> r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.List r2 = androidx.core.os.ParcelCompat.Api33Impl.readParcelableList(r2, r3, r4, r5)
            return r2
        Lb:
            java.util.List r2 = androidx.core.os.ParcelCompat.Api29Impl.readParcelableList(r2, r3, r4)
            return r2
    }

    public static <T extends java.io.Serializable> T readSerializable(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lb
            java.io.Serializable r2 = androidx.core.os.ParcelCompat.Api33Impl.readSerializable(r2, r3, r4)
            return r2
        Lb:
            java.io.Serializable r2 = r2.readSerializable()
            return r2
    }

    public static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel r2, java.lang.ClassLoader r3, java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            android.util.SparseArray r2 = androidx.core.os.ParcelCompat.Api33Impl.readSparseArray(r2, r3, r4)
            return r2
        Lb:
            android.util.SparseArray r2 = r2.readSparseArray(r3)
            return r2
    }

    public static void writeBoolean(android.os.Parcel r0, boolean r1) {
            r0.writeInt(r1)
            return
    }
}
