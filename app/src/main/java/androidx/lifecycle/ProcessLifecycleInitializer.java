package androidx.lifecycle;

/* JADX INFO: compiled from: ProcessLifecycleInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Landroidx/startup/Initializer;", "Landroidx/lifecycle/LifecycleOwner;", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements androidx.startup.Initializer<androidx.lifecycle.LifecycleOwner> {
    public ProcessLifecycleInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public androidx.lifecycle.LifecycleOwner create(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.getInstance(r3)
            java.lang.String r1 = "getInstance(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Class r1 = r2.getClass()
            boolean r0 = r0.isEagerlyInitialized(r1)
            if (r0 == 0) goto L27
            androidx.lifecycle.LifecycleDispatcher.init(r3)
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            r0.init$lifecycle_process_release(r3)
            androidx.lifecycle.ProcessLifecycleOwner$Companion r3 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            androidx.lifecycle.LifecycleOwner r3 = r3.get()
            return r3
        L27:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml"
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ androidx.lifecycle.LifecycleOwner create(android.content.Context r1) {
            r0 = this;
            androidx.lifecycle.LifecycleOwner r1 = r0.create(r1)
            return r1
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
    }
}
