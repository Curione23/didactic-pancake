package androidx.browser.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface EngagementSignalsCallback {
    default void onGreatestScrollPercentageIncreased(int r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    default void onSessionEnded(boolean r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    default void onVerticalScrollEvent(boolean r1, android.os.Bundle r2) {
            r0 = this;
            return
    }
}
