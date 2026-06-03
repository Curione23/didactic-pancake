package androidx.core.os;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "()V", "createPersistableBundle", "Landroid/os/PersistableBundle;", "capacity", "", "putValue", "", "persistableBundle", "key", "", "value", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PersistableBundleApi21ImplKt {
    public static final androidx.core.os.PersistableBundleApi21ImplKt INSTANCE = null;

    static {
            androidx.core.os.PersistableBundleApi21ImplKt r0 = new androidx.core.os.PersistableBundleApi21ImplKt
            r0.<init>()
            androidx.core.os.PersistableBundleApi21ImplKt.INSTANCE = r0
            return
    }

    private PersistableBundleApi21ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.PersistableBundle createPersistableBundle(int r1) {
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final void putValue(android.os.PersistableBundle r4, java.lang.String r5, java.lang.Object r6) {
            if (r6 != 0) goto L8
            r6 = 0
            r4.putString(r5, r6)
            goto L99
        L8:
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L17
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            androidx.core.os.PersistableBundleApi22ImplKt.putBoolean(r4, r5, r6)
            goto L99
        L17:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L26
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            r4.putDouble(r5, r0)
            goto L99
        L26:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L34
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4.putInt(r5, r6)
            goto L99
        L34:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L42
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            r4.putLong(r5, r0)
            goto L99
        L42:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L4c
            java.lang.String r6 = (java.lang.String) r6
            r4.putString(r5, r6)
            goto L99
        L4c:
            boolean r0 = r6 instanceof boolean[]
            if (r0 == 0) goto L56
            boolean[] r6 = (boolean[]) r6
            androidx.core.os.PersistableBundleApi22ImplKt.putBooleanArray(r4, r5, r6)
            goto L99
        L56:
            boolean r0 = r6 instanceof double[]
            if (r0 == 0) goto L60
            double[] r6 = (double[]) r6
            r4.putDoubleArray(r5, r6)
            goto L99
        L60:
            boolean r0 = r6 instanceof int[]
            if (r0 == 0) goto L6a
            int[] r6 = (int[]) r6
            r4.putIntArray(r5, r6)
            goto L99
        L6a:
            boolean r0 = r6 instanceof long[]
            if (r0 == 0) goto L74
            long[] r6 = (long[]) r6
            r4.putLongArray(r5, r6)
            goto L99
        L74:
            boolean r0 = r6 instanceof java.lang.Object[]
            r1 = 34
            java.lang.String r2 = " for key \""
            if (r0 == 0) goto Lbf
            java.lang.Class r0 = r6.getClass()
            java.lang.Class r0 = r0.getComponentType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L9a
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r4.putStringArray(r5, r6)
        L99:
            return
        L9a:
            java.lang.String r4 = r0.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal value array type "
            r0.<init>(r3)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r6.<init>(r4)
            throw r6
        Lbf:
            java.lang.Class r4 = r6.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal value type "
            r0.<init>(r3)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r6.<init>(r4)
            throw r6
    }
}
