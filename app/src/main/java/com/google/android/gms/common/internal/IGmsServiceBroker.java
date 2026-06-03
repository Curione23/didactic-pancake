package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public interface IGmsServiceBroker extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static abstract class Stub extends android.os.Binder implements com.google.android.gms.common.internal.IGmsServiceBroker {
        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r1.attachInterface(r1, r0)
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                if (r4 <= 0) goto L115
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 <= r0) goto L9
                goto L115
            L9:
                java.lang.String r7 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r5.enforceInterface(r7)
                android.os.IBinder r7 = r5.readStrongBinder()
                r0 = 0
                if (r7 != 0) goto L17
                r1 = r0
                goto L29
            L17:
                java.lang.String r1 = "com.google.android.gms.common.internal.IGmsCallbacks"
                android.os.IInterface r1 = r7.queryLocalInterface(r1)
                boolean r2 = r1 instanceof com.google.android.gms.common.internal.IGmsCallbacks
                if (r2 == 0) goto L24
                com.google.android.gms.common.internal.IGmsCallbacks r1 = (com.google.android.gms.common.internal.IGmsCallbacks) r1
                goto L29
            L24:
                com.google.android.gms.common.internal.zzy r1 = new com.google.android.gms.common.internal.zzy
                r1.<init>(r7)
            L29:
                r7 = 46
                r2 = 1
                if (r4 != r7) goto L4a
                int r4 = r5.readInt()
                if (r4 == 0) goto L3d
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.GetServiceRequest> r4 = com.google.android.gms.common.internal.GetServiceRequest.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.google.android.gms.common.internal.GetServiceRequest r0 = (com.google.android.gms.common.internal.GetServiceRequest) r0
            L3d:
                r3.getService(r1, r0)
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
                r4 = r6
                android.os.Parcel r4 = (android.os.Parcel) r4
                r6.writeNoException()
                return r2
            L4a:
                r6 = 47
                if (r4 != r6) goto L62
                int r4 = r5.readInt()
                if (r4 == 0) goto L5c
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.zzai> r4 = com.google.android.gms.common.internal.zzai.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.google.android.gms.common.internal.zzai r4 = (com.google.android.gms.common.internal.zzai) r4
            L5c:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
            L62:
                r5.readInt()
                r6 = 4
                if (r4 == r6) goto L10f
                r5.readString()
                if (r4 == r2) goto Lf8
                r6 = 2
                if (r4 == r6) goto Le9
                r6 = 23
                if (r4 == r6) goto Le9
                r6 = 25
                if (r4 == r6) goto Le9
                r6 = 27
                if (r4 == r6) goto Le9
                r6 = 30
                if (r4 == r6) goto Ld4
                r6 = 34
                if (r4 == r6) goto Ld0
                r6 = 41
                if (r4 == r6) goto Le9
                r6 = 43
                if (r4 == r6) goto Le9
                r6 = 37
                if (r4 == r6) goto Le9
                r6 = 38
                if (r4 == r6) goto Le9
                switch(r4) {
                    case 5: goto Le9;
                    case 6: goto Le9;
                    case 7: goto Le9;
                    case 8: goto Le9;
                    case 9: goto Lb2;
                    case 10: goto Lab;
                    case 11: goto Le9;
                    case 12: goto Le9;
                    case 13: goto Le9;
                    case 14: goto Le9;
                    case 15: goto Le9;
                    case 16: goto Le9;
                    case 17: goto Le9;
                    case 18: goto Le9;
                    case 19: goto L99;
                    case 20: goto Ld4;
                    default: goto L97;
                }
            L97:
                goto L10f
            L99:
                r5.readStrongBinder()
                int r4 = r5.readInt()
                if (r4 == 0) goto L10f
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L10f
            Lab:
                r5.readString()
                r5.createStringArray()
                goto L10f
            Lb2:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                r5.readStrongBinder()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L10f
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L10f
            Ld0:
                r5.readString()
                goto L10f
            Ld4:
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L10f
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L10f
            Le9:
                int r4 = r5.readInt()
                if (r4 == 0) goto L10f
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L10f
            Lf8:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L10f
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
            L10f:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
            L115:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
        }
    }

    void getService(com.google.android.gms.common.internal.IGmsCallbacks r1, com.google.android.gms.common.internal.GetServiceRequest r2) throws android.os.RemoteException;
}
