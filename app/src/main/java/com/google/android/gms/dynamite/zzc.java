package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzc implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r2, java.lang.String r3, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r4) {
            r1 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            int r2 = r4.zzb(r2, r3)
            r0.localVersion = r2
            if (r2 == 0) goto Lf
            r2 = -1
            goto L10
        Lf:
            r2 = 0
        L10:
            r0.selection = r2
            return r0
    }
}
