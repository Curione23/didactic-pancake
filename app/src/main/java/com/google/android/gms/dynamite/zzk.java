package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzk implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zzk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r5, java.lang.String r6, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r7) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r4 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            int r1 = r7.zzb(r5, r6)
            r0.localVersion = r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            int r5 = r7.zza(r5, r6, r3)
            r0.remoteVersion = r5
            goto L1c
        L16:
            int r5 = r7.zza(r5, r6, r2)
            r0.remoteVersion = r5
        L1c:
            int r6 = r0.localVersion
            if (r6 != 0) goto L24
            if (r5 != 0) goto L25
            r2 = r3
            goto L28
        L24:
            r3 = r6
        L25:
            if (r3 < r5) goto L28
            r2 = -1
        L28:
            r0.selection = r2
            return r0
    }
}
