package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    static {
            java.lang.Class<com.google.android.play.integrity.internal.c> r0 = com.google.android.play.integrity.internal.c.class
            r0.getClassLoader()
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Parcelable a(android.os.Parcel r1, android.os.Parcelable.Creator r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    public static void b(android.os.Parcel r3) {
            int r3 = r3.dataAvail()
            if (r3 > 0) goto L7
            return
        L7:
            android.os.BadParcelableException r0 = new android.os.BadParcelableException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parcel data not fully consumed, unread size: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void c(android.os.Parcel r1, android.os.Parcelable r2) {
            r0 = 1
            r1.writeInt(r0)
            r0 = 0
            r2.writeToParcel(r1, r0)
            return
    }
}
