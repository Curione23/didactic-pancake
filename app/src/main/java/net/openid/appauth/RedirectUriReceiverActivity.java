package net.openid.appauth;

/* JADX INFO: loaded from: classes2.dex */
public class RedirectUriReceiverActivity extends androidx.appcompat.app.AppCompatActivity {
    public RedirectUriReceiverActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            android.content.Intent r1 = r0.getIntent()
            android.net.Uri r1 = r1.getData()
            android.content.Intent r1 = net.openid.appauth.AuthorizationManagementActivity.createResponseHandlingIntent(r0, r1)
            r0.startActivity(r1)
            r0.finish()
            return
    }
}
