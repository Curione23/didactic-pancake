package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface PostMessageBackend {
    void onDisconnectChannel(android.content.Context r1);

    boolean onNotifyMessageChannelReady(android.os.Bundle r1);

    boolean onPostMessage(java.lang.String r1, android.os.Bundle r2);
}
