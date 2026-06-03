package ca.dnamobile.javalauncher.feature.unpack;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractUnpackTask implements java.lang.Runnable {
    protected ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask.Listener listener;

    public interface Listener {
        default void onTaskEnd() {
                r0 = this;
                return
        }

        default void onTaskStart() {
                r0 = this;
                return
        }
    }

    public AbstractUnpackTask() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean isNeedUnpack();

    public void setListener(ca.dnamobile.javalauncher.feature.unpack.AbstractUnpackTask.Listener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
