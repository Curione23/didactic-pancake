package androidx.core.os;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BundleKt {
    public static final android.os.Bundle bundleOf() {
            android.os.Bundle r0 = new android.os.Bundle
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static final android.os.Bundle bundleOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r9) {
            android.os.Bundle r0 = new android.os.Bundle
            int r1 = r9.length
            r0.<init>(r1)
            int r1 = r9.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1e4
            r3 = r9[r2]
            java.lang.Object r4 = r3.component1()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.component2()
            if (r3 != 0) goto L1e
            r3 = 0
            r0.putString(r4, r3)
            goto L1b7
        L1e:
            boolean r5 = r3 instanceof java.lang.Boolean
            if (r5 == 0) goto L2d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r0.putBoolean(r4, r3)
            goto L1b7
        L2d:
            boolean r5 = r3 instanceof java.lang.Byte
            if (r5 == 0) goto L3c
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            r0.putByte(r4, r3)
            goto L1b7
        L3c:
            boolean r5 = r3 instanceof java.lang.Character
            if (r5 == 0) goto L4b
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            r0.putChar(r4, r3)
            goto L1b7
        L4b:
            boolean r5 = r3 instanceof java.lang.Double
            if (r5 == 0) goto L5a
            java.lang.Number r3 = (java.lang.Number) r3
            double r5 = r3.doubleValue()
            r0.putDouble(r4, r5)
            goto L1b7
        L5a:
            boolean r5 = r3 instanceof java.lang.Float
            if (r5 == 0) goto L69
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0.putFloat(r4, r3)
            goto L1b7
        L69:
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L78
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.putInt(r4, r3)
            goto L1b7
        L78:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L87
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            r0.putLong(r4, r5)
            goto L1b7
        L87:
            boolean r5 = r3 instanceof java.lang.Short
            if (r5 == 0) goto L96
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            r0.putShort(r4, r3)
            goto L1b7
        L96:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.putBundle(r4, r3)
            goto L1b7
        La1:
            boolean r5 = r3 instanceof java.lang.CharSequence
            if (r5 == 0) goto Lac
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.putCharSequence(r4, r3)
            goto L1b7
        Lac:
            boolean r5 = r3 instanceof android.os.Parcelable
            if (r5 == 0) goto Lb7
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r0.putParcelable(r4, r3)
            goto L1b7
        Lb7:
            boolean r5 = r3 instanceof boolean[]
            if (r5 == 0) goto Lc2
            boolean[] r3 = (boolean[]) r3
            r0.putBooleanArray(r4, r3)
            goto L1b7
        Lc2:
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto Lcd
            byte[] r3 = (byte[]) r3
            r0.putByteArray(r4, r3)
            goto L1b7
        Lcd:
            boolean r5 = r3 instanceof char[]
            if (r5 == 0) goto Ld8
            char[] r3 = (char[]) r3
            r0.putCharArray(r4, r3)
            goto L1b7
        Ld8:
            boolean r5 = r3 instanceof double[]
            if (r5 == 0) goto Le3
            double[] r3 = (double[]) r3
            r0.putDoubleArray(r4, r3)
            goto L1b7
        Le3:
            boolean r5 = r3 instanceof float[]
            if (r5 == 0) goto Lee
            float[] r3 = (float[]) r3
            r0.putFloatArray(r4, r3)
            goto L1b7
        Lee:
            boolean r5 = r3 instanceof int[]
            if (r5 == 0) goto Lf9
            int[] r3 = (int[]) r3
            r0.putIntArray(r4, r3)
            goto L1b7
        Lf9:
            boolean r5 = r3 instanceof long[]
            if (r5 == 0) goto L104
            long[] r3 = (long[]) r3
            r0.putLongArray(r4, r3)
            goto L1b7
        L104:
            boolean r5 = r3 instanceof short[]
            if (r5 == 0) goto L10f
            short[] r3 = (short[]) r3
            r0.putShortArray(r4, r3)
            goto L1b7
        L10f:
            boolean r5 = r3 instanceof java.lang.Object[]
            r6 = 34
            java.lang.String r7 = " for key \""
            if (r5 == 0) goto L190
            java.lang.Class r5 = r3.getClass()
            java.lang.Class r5 = r5.getComponentType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.Class<android.os.Parcelable> r8 = android.os.Parcelable.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L136
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r5)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            r0.putParcelableArray(r4, r3)
            goto L1b7
        L136:
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L14a
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r5)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.putStringArray(r4, r3)
            goto L1b7
        L14a:
            java.lang.Class<java.lang.CharSequence> r8 = java.lang.CharSequence.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L15d
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r5)
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            r0.putCharSequenceArray(r4, r3)
            goto L1b7
        L15d:
            java.lang.Class<java.io.Serializable> r8 = java.io.Serializable.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L16b
            java.io.Serializable r3 = (java.io.Serializable) r3
            r0.putSerializable(r4, r3)
            goto L1b7
        L16b:
            java.lang.String r9 = r5.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal value array type "
            r1.<init>(r2)
            java.lang.StringBuilder r9 = r1.append(r9)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.StringBuilder r9 = r9.append(r6)
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L190:
            boolean r5 = r3 instanceof java.io.Serializable
            if (r5 == 0) goto L19a
            java.io.Serializable r3 = (java.io.Serializable) r3
            r0.putSerializable(r4, r3)
            goto L1b7
        L19a:
            boolean r5 = r3 instanceof android.os.IBinder
            if (r5 == 0) goto L1a4
            android.os.IBinder r3 = (android.os.IBinder) r3
            r0.putBinder(r4, r3)
            goto L1b7
        L1a4:
            boolean r5 = r3 instanceof android.util.Size
            if (r5 == 0) goto L1ae
            android.util.Size r3 = (android.util.Size) r3
            androidx.core.os.BundleApi21ImplKt.putSize(r0, r4, r3)
            goto L1b7
        L1ae:
            boolean r5 = r3 instanceof android.util.SizeF
            if (r5 == 0) goto L1bb
            android.util.SizeF r3 = (android.util.SizeF) r3
            androidx.core.os.BundleApi21ImplKt.putSizeF(r0, r4, r3)
        L1b7:
            int r2 = r2 + 1
            goto L8
        L1bb:
            java.lang.Class r9 = r3.getClass()
            java.lang.String r9 = r9.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal value type "
            r1.<init>(r2)
            java.lang.StringBuilder r9 = r1.append(r9)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.StringBuilder r9 = r9.append(r6)
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L1e4:
            return r0
    }
}
