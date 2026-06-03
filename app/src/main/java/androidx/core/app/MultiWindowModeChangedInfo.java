package androidx.core.app;

/* JADX INFO: compiled from: MultiWindowModeChangedInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/core/app/MultiWindowModeChangedInfo;", "", "isInMultiWindowMode", "", "newConfig", "Landroid/content/res/Configuration;", "(ZLandroid/content/res/Configuration;)V", "(Z)V", "()Z", "getNewConfig", "()Landroid/content/res/Configuration;", "newConfiguration", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiWindowModeChangedInfo {
    private final boolean isInMultiWindowMode;
    private android.content.res.Configuration newConfiguration;

    public MultiWindowModeChangedInfo(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.isInMultiWindowMode = r1
            return
    }

    public MultiWindowModeChangedInfo(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            java.lang.String r0 = "newConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.newConfiguration = r3
            return
    }

    public final android.content.res.Configuration getNewConfig() {
            r2 = this;
            android.content.res.Configuration r0 = r2.newConfiguration
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean isInMultiWindowMode() {
            r1 = this;
            boolean r0 = r1.isInMultiWindowMode
            return r0
    }
}
