package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public interface IAccountAccessor extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IAccountAccessor {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
                r1.<init>(r0)
                return
        }

        public static com.google.android.gms.common.internal.IAccountAccessor asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.common.internal.IAccountAccessor
                if (r1 == 0) goto L11
                com.google.android.gms.common.internal.IAccountAccessor r0 = (com.google.android.gms.common.internal.IAccountAccessor) r0
                return r0
            L11:
                com.google.android.gms.common.internal.zzt r0 = new com.google.android.gms.common.internal.zzt
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
                r0 = this;
                r2 = 2
                if (r1 != r2) goto Lf
                android.accounts.Account r1 = r0.zzb()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzd(r3, r1)
                r1 = 1
                return r1
            Lf:
                r1 = 0
                return r1
        }
    }

    android.accounts.Account zzb() throws android.os.RemoteException;
}
