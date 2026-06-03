package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public interface TransitionSeekController {
    void addOnProgressChangedListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> r1);

    void addOnReadyListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> r1);

    void animateToEnd();

    void animateToStart(java.lang.Runnable r1);

    float getCurrentFraction();

    long getCurrentPlayTimeMillis();

    long getDurationMillis();

    boolean isReady();

    void removeOnProgressChangedListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> r1);

    void removeOnReadyListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> r1);

    void setCurrentFraction(float r1);

    void setCurrentPlayTimeMillis(long r1);
}
