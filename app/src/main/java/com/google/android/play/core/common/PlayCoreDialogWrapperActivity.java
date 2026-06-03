package com.google.android.play.core.common;

/* JADX INFO: compiled from: com.google.android.play:core-common@@2.0.4 */
/* JADX INFO: loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends android.app.Activity {
    private android.os.ResultReceiver zza;

    public PlayCoreDialogWrapperActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void zza() {
            r3 = this;
            android.os.ResultReceiver r0 = r3.zza
            if (r0 == 0) goto Ld
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 3
            r0.send(r2, r1)
        Ld:
            return
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            super.onActivityResult(r1, r2, r3)
            if (r1 != 0) goto L21
            android.os.ResultReceiver r1 = r0.zza
            if (r1 == 0) goto L21
            r3 = -1
            if (r2 != r3) goto L16
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r3 = 1
            r1.send(r3, r2)
            goto L21
        L16:
            if (r2 != 0) goto L21
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r3 = 2
            r1.send(r3, r2)
        L21:
            r0.finish()
            return
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle r12) {
            r11 = this;
            android.content.Intent r0 = r11.getIntent()
            r1 = 0
            java.lang.String r2 = "window_flags"
            int r0 = r0.getIntExtra(r2, r1)
            r1 = 0
            if (r0 == 0) goto L23
            android.view.Window r3 = r11.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.setSystemUiVisibility(r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r3.putExtra(r2, r0)
            r7 = r3
            goto L24
        L23:
            r7 = r1
        L24:
            super.onCreate(r12)
            java.lang.String r0 = "result_receiver"
            if (r12 != 0) goto L6a
            android.content.Intent r12 = r11.getIntent()
            android.os.Parcelable r12 = r12.getParcelableExtra(r0)
            android.os.ResultReceiver r12 = (android.os.ResultReceiver) r12
            r11.zza = r12
            android.content.Intent r12 = r11.getIntent()
            android.os.Bundle r12 = r12.getExtras()
            if (r12 == 0) goto L4a
            java.lang.String r0 = "confirmation_intent"
            java.lang.Object r0 = r12.get(r0)
            r1 = r0
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L4a:
            if (r12 == 0) goto L63
            if (r1 != 0) goto L4f
            goto L63
        L4f:
            android.content.IntentSender r5 = r1.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> L5c
            r9 = 0
            r10 = 0
            r6 = 0
            r8 = 0
            r4 = r11
            r4.startIntentSenderForResult(r5, r6, r7, r8, r9, r10)     // Catch: android.content.IntentSender.SendIntentException -> L5c
            return
        L5c:
            r11.zza()
            r11.finish()
            return
        L63:
            r11.zza()
            r11.finish()
            return
        L6a:
            android.os.Parcelable r12 = r12.getParcelable(r0)
            android.os.ResultReceiver r12 = (android.os.ResultReceiver) r12
            r11.zza = r12
            return
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "result_receiver"
            android.os.ResultReceiver r1 = r2.zza
            r3.putParcelable(r0, r1)
            return
    }
}
