package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public interface IFragmentWrapper extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IFragmentWrapper {
        public Stub() {
                r1 = this;
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                r1.<init>(r0)
                return
        }

        public static com.google.android.gms.dynamic.IFragmentWrapper asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.dynamic.IFragmentWrapper"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof com.google.android.gms.dynamic.IFragmentWrapper
                if (r1 == 0) goto L11
                com.google.android.gms.dynamic.IFragmentWrapper r0 = (com.google.android.gms.dynamic.IFragmentWrapper) r0
                return r0
            L11:
                com.google.android.gms.dynamic.zza r0 = new com.google.android.gms.dynamic.zza
                r0.<init>(r2)
                return r0
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
                r0 = this;
                switch(r1) {
                    case 2: goto L166;
                    case 3: goto L15b;
                    case 4: goto L150;
                    case 5: goto L145;
                    case 6: goto L13a;
                    case 7: goto L12d;
                    case 8: goto L122;
                    case 9: goto L117;
                    case 10: goto L10c;
                    case 11: goto Lff;
                    case 12: goto Lf3;
                    case 13: goto Le5;
                    case 14: goto Ld7;
                    case 15: goto Lc9;
                    case 16: goto Lbb;
                    case 17: goto Lad;
                    case 18: goto L9f;
                    case 19: goto L91;
                    case 20: goto L7e;
                    case 21: goto L6f;
                    case 22: goto L60;
                    case 23: goto L51;
                    case 24: goto L42;
                    case 25: goto L2f;
                    case 26: goto L18;
                    case 27: goto L5;
                    default: goto L3;
                }
            L3:
                r1 = 0
                return r1
            L5:
                android.os.IBinder r1 = r2.readStrongBinder()
                com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
                com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzA(r1)
                r3.writeNoException()
                goto L170
            L18:
                android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
                android.os.Parcelable r1 = com.google.android.gms.internal.common.zzc.zzb(r2, r1)
                android.content.Intent r1 = (android.content.Intent) r1
                int r4 = r2.readInt()
                com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzz(r1, r4)
                r3.writeNoException()
                goto L170
            L2f:
                android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
                android.os.Parcelable r1 = com.google.android.gms.internal.common.zzc.zzb(r2, r1)
                android.content.Intent r1 = (android.content.Intent) r1
                com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzy(r1)
                r3.writeNoException()
                goto L170
            L42:
                boolean r1 = com.google.android.gms.internal.common.zzc.zza(r2)
                com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzx(r1)
                r3.writeNoException()
                goto L170
            L51:
                boolean r1 = com.google.android.gms.internal.common.zzc.zza(r2)
                com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzw(r1)
                r3.writeNoException()
                goto L170
            L60:
                boolean r1 = com.google.android.gms.internal.common.zzc.zza(r2)
                com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzv(r1)
                r3.writeNoException()
                goto L170
            L6f:
                boolean r1 = com.google.android.gms.internal.common.zzc.zza(r2)
                com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzu(r1)
                r3.writeNoException()
                goto L170
            L7e:
                android.os.IBinder r1 = r2.readStrongBinder()
                com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
                com.google.android.gms.internal.common.zzc.zzf(r2)
                r0.zzt(r1)
                r3.writeNoException()
                goto L170
            L91:
                boolean r1 = r0.zzs()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            L9f:
                boolean r1 = r0.zzr()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            Lad:
                boolean r1 = r0.zzq()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            Lbb:
                boolean r1 = r0.zzp()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            Lc9:
                boolean r1 = r0.zzo()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            Ld7:
                boolean r1 = r0.zzn()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            Le5:
                boolean r1 = r0.zzm()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            Lf3:
                com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzl()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
                goto L170
            Lff:
                boolean r1 = r0.zzk()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            L10c:
                int r1 = r0.zzj()
                r3.writeNoException()
                r3.writeInt(r1)
                goto L170
            L117:
                com.google.android.gms.dynamic.IFragmentWrapper r1 = r0.zzi()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
                goto L170
            L122:
                java.lang.String r1 = r0.zzh()
                r3.writeNoException()
                r3.writeString(r1)
                goto L170
            L12d:
                boolean r1 = r0.zzg()
                r3.writeNoException()
                int r2 = com.google.android.gms.internal.common.zzc.zza
                r3.writeInt(r1)
                goto L170
            L13a:
                com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzf()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
                goto L170
            L145:
                com.google.android.gms.dynamic.IFragmentWrapper r1 = r0.zze()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
                goto L170
            L150:
                int r1 = r0.zzd()
                r3.writeNoException()
                r3.writeInt(r1)
                goto L170
            L15b:
                android.os.Bundle r1 = r0.zzc()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zzd(r3, r1)
                goto L170
            L166:
                com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzb()
                r3.writeNoException()
                com.google.android.gms.internal.common.zzc.zze(r3, r1)
            L170:
                r1 = 1
                return r1
        }
    }

    void zzA(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzb() throws android.os.RemoteException;

    android.os.Bundle zzc() throws android.os.RemoteException;

    int zzd() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zze() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException;

    boolean zzg() throws android.os.RemoteException;

    java.lang.String zzh() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zzi() throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;

    boolean zzk() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzl() throws android.os.RemoteException;

    boolean zzm() throws android.os.RemoteException;

    boolean zzn() throws android.os.RemoteException;

    boolean zzo() throws android.os.RemoteException;

    boolean zzp() throws android.os.RemoteException;

    boolean zzq() throws android.os.RemoteException;

    boolean zzr() throws android.os.RemoteException;

    boolean zzs() throws android.os.RemoteException;

    void zzt(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException;

    void zzu(boolean r1) throws android.os.RemoteException;

    void zzv(boolean r1) throws android.os.RemoteException;

    void zzw(boolean r1) throws android.os.RemoteException;

    void zzx(boolean r1) throws android.os.RemoteException;

    void zzy(android.content.Intent r1) throws android.os.RemoteException;

    void zzz(android.content.Intent r1, int r2) throws android.os.RemoteException;
}
