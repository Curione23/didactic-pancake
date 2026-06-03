package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteCreator<T> {
    private final java.lang.String zza;
    private java.lang.Object zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class RemoteCreatorException extends java.lang.Exception {
        public RemoteCreatorException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public RemoteCreatorException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    protected RemoteCreator(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    protected abstract T getRemoteCreator(android.os.IBinder r1);

    protected final T getRemoteCreatorInstance(android.content.Context r3) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            if (r0 != 0) goto L47
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.Context r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r3)
            if (r3 == 0) goto L3f
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.String r0 = r2.zza     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Class r3 = r3.loadClass(r0)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            java.lang.Object r3 = r2.getRemoteCreator(r3)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            r2.zzb = r3     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L2d java.lang.ClassNotFoundException -> L36
            goto L47
        L24:
            r3 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not access creator."
            r0.<init>(r1, r3)
            throw r0
        L2d:
            r3 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not instantiate creator."
            r0.<init>(r1, r3)
            throw r0
        L36:
            r3 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not load creator class."
            r0.<init>(r1, r3)
            throw r0
        L3f:
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r3 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r0 = "Could not get remote context."
            r3.<init>(r0)
            throw r3
        L47:
            java.lang.Object r3 = r2.zzb
            return r3
    }
}
