package androidx.core.service.quicksettings;

/* JADX INFO: loaded from: classes.dex */
public class PendingIntentActivityWrapper {
    private final android.content.Context mContext;
    private final int mFlags;
    private final android.content.Intent mIntent;
    private final boolean mIsMutable;
    private final android.os.Bundle mOptions;
    private final android.app.PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentActivityWrapper(android.content.Context r1, int r2, android.content.Intent r3, int r4, android.os.Bundle r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mRequestCode = r2
            r0.mIntent = r3
            r0.mFlags = r4
            r0.mOptions = r5
            r0.mIsMutable = r6
            android.app.PendingIntent r1 = r0.createPendingIntent()
            r0.mPendingIntent = r1
            return
    }

    public PendingIntentActivityWrapper(android.content.Context r8, int r9, android.content.Intent r10, int r11, boolean r12) {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private android.app.PendingIntent createPendingIntent() {
            r6 = this;
            android.os.Bundle r4 = r6.mOptions
            if (r4 != 0) goto L13
            android.content.Context r0 = r6.mContext
            int r1 = r6.mRequestCode
            android.content.Intent r2 = r6.mIntent
            int r3 = r6.mFlags
            boolean r4 = r6.mIsMutable
            android.app.PendingIntent r0 = androidx.core.app.PendingIntentCompat.getActivity(r0, r1, r2, r3, r4)
            return r0
        L13:
            android.content.Context r0 = r6.mContext
            int r1 = r6.mRequestCode
            android.content.Intent r2 = r6.mIntent
            int r3 = r6.mFlags
            boolean r5 = r6.mIsMutable
            android.app.PendingIntent r0 = androidx.core.app.PendingIntentCompat.getActivity(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public int getFlags() {
            r1 = this;
            int r0 = r1.mFlags
            return r0
    }

    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.mIntent
            return r0
    }

    public android.os.Bundle getOptions() {
            r1 = this;
            android.os.Bundle r0 = r1.mOptions
            return r0
    }

    public android.app.PendingIntent getPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mPendingIntent
            return r0
    }

    public int getRequestCode() {
            r1 = this;
            int r0 = r1.mRequestCode
            return r0
    }

    public boolean isMutable() {
            r1 = this;
            boolean r0 = r1.mIsMutable
            return r0
    }
}
