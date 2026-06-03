package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Objects {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static final class ToStringHelper {
        private final java.util.List zza;
        private final java.lang.Object zzb;

        /* synthetic */ ToStringHelper(java.lang.Object r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                r0.zzb = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zza = r1
                return
        }

        public com.google.android.gms.common.internal.Objects.ToStringHelper add(java.lang.String r4, java.lang.Object r5) {
                r3 = this;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
                r0 = r4
                java.lang.String r0 = (java.lang.String) r0
                int r0 = r4.length()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r1 = java.lang.String.valueOf(r5)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r0 = r0 + 1
                int r0 = r0 + r1
                r2.<init>(r0)
                r2.append(r4)
                java.lang.String r4 = "="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                java.util.List r5 = r3.zza
                r5.add(r4)
                return r3
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 100
                r0.<init>(r1)
                java.lang.Object r1 = r5.zzb
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                r1 = 123(0x7b, float:1.72E-43)
                r0.append(r1)
                java.util.List r1 = r5.zza
                int r2 = r1.size()
                r3 = 0
            L20:
                if (r3 >= r2) goto L37
                java.lang.Object r4 = r1.get(r3)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r4 = r2 + (-1)
                if (r3 >= r4) goto L34
                java.lang.String r4 = ", "
                r0.append(r4)
            L34:
                int r3 = r3 + 1
                goto L20
            L37:
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private Objects() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Uninstantiable"
            r0.<init>(r1)
            throw r0
    }

    public static boolean checkBundlesEquality(android.os.Bundle r5, android.os.Bundle r6) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L41
            if (r6 != 0) goto L7
            goto L41
        L7:
            int r2 = r5.size()
            int r3 = r6.size()
            if (r2 == r3) goto L12
            return r1
        L12:
            java.util.Set r2 = r5.keySet()
            java.util.Set r3 = r6.keySet()
            boolean r3 = r2.containsAll(r3)
            if (r3 != 0) goto L21
            return r1
        L21:
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r3)
            java.lang.Object r3 = r6.get(r3)
            boolean r3 = equal(r4, r3)
            if (r3 != 0) goto L25
            return r1
        L40:
            return r0
        L41:
            if (r5 != r6) goto L44
            return r0
        L44:
            return r1
    }

    public static boolean equal(java.lang.Object r2, java.lang.Object r3) {
            r0 = 1
            if (r2 == r3) goto Lf
            r1 = 0
            if (r2 == 0) goto Le
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            return r1
        Le:
            r0 = r1
        Lf:
            return r0
    }

    public static int hashCode(java.lang.Object... r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public static com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelper(java.lang.Object r2) {
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = new com.google.android.gms.common.internal.Objects$ToStringHelper
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
