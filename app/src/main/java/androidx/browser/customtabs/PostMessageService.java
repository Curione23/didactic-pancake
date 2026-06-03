package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends android.app.Service {
    private android.support.customtabs.IPostMessageService.Stub mBinder;


    public PostMessageService() {
            r1 = this;
            r1.<init>()
            androidx.browser.customtabs.PostMessageService$1 r0 = new androidx.browser.customtabs.PostMessageService$1
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            android.support.customtabs.IPostMessageService$Stub r1 = r0.mBinder
            return r1
    }
}
