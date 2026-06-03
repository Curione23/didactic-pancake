package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectWrapper<T> extends com.google.android.gms.dynamic.IObjectWrapper.Stub {
    private final java.lang.Object zza;

    private ObjectWrapper(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static <T> T unwrap(com.google.android.gms.dynamic.IObjectWrapper r7) {
            boolean r0 = r7 instanceof com.google.android.gms.dynamic.ObjectWrapper
            if (r0 == 0) goto L9
            com.google.android.gms.dynamic.ObjectWrapper r7 = (com.google.android.gms.dynamic.ObjectWrapper) r7
            java.lang.Object r7 = r7.zza
            return r7
        L9:
            android.os.IBinder r7 = r7.asBinder()
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L1a:
            if (r2 >= r1) goto L2a
            r5 = r0[r2]
            boolean r6 = r5.isSynthetic()
            if (r6 != 0) goto L27
            int r3 = r3 + 1
            r4 = r5
        L27:
            int r2 = r2 + 1
            goto L1a
        L2a:
            r1 = 1
            if (r3 != r1) goto L5b
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r0 = r4
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            boolean r0 = r4.isAccessible()
            if (r0 != 0) goto L53
            r4.setAccessible(r1)
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NullPointerException -> L4a
            return r7
        L41:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Could not access the field in remoteBinder."
            r0.<init>(r1, r7)
            throw r0
        L4a:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Binder object is null."
            r0.<init>(r1, r7)
            throw r0
        L53:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "IObjectWrapper declared field not private!"
            r7.<init>(r0)
            throw r7
        L5b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int r0 = r0.length
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 53
            r2.<init>(r1)
            java.lang.String r1 = "Unexpected number of IObjectWrapper declared fields: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.<init>(r0)
            throw r7
    }

    public static <T> com.google.android.gms.dynamic.IObjectWrapper wrap(T r1) {
            com.google.android.gms.dynamic.ObjectWrapper r0 = new com.google.android.gms.dynamic.ObjectWrapper
            r0.<init>(r1)
            return r0
    }
}
