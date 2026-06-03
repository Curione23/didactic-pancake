package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends android.content.ContentProvider {
    public InitializationProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not allowed."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L1b
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L14
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.getInstance(r0)
            r0.discoverAndInitialize()
            goto L19
        L14:
            java.lang.String r0 = "Deferring initialization because `applicationContext` is null."
            androidx.startup.StartupLogger.w(r0)
        L19:
            r0 = 1
            return r0
        L1b:
            androidx.startup.StartupException r0 = new androidx.startup.StartupException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not allowed."
            r1.<init>(r2)
            throw r1
    }
}
