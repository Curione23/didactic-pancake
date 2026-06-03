package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzi implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zzi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r3, java.lang.String r4, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r5) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r2 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            r1 = 0
            int r3 = r5.zza(r3, r4, r1)
            r0.remoteVersion = r3
            if (r3 != 0) goto Lf
            goto L10
        Lf:
            r1 = 1
        L10:
            r0.selection = r1
            return r0
    }
}
