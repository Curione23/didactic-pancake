package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements java.lang.Cloneable {
    static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER = null;
    private static final android.animation.Animator[] EMPTY_ANIMATOR_ARRAY = null;
    private static final java.lang.String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final java.lang.String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final java.lang.String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final java.lang.String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final java.lang.String MATCH_NAME_STR = "name";
    private static final androidx.transition.PathMotion STRAIGHT_PATH_MOTION = null;
    private static java.lang.ThreadLocal<androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo>> sRunningAnimators;
    private android.animation.Animator[] mAnimatorCache;
    java.util.ArrayList<android.animation.Animator> mAnimators;
    boolean mCanRemoveViews;
    private androidx.transition.Transition mCloneParent;
    java.util.ArrayList<android.animation.Animator> mCurrentAnimators;
    long mDuration;
    private androidx.transition.TransitionValuesMaps mEndValues;
    private java.util.ArrayList<androidx.transition.TransitionValues> mEndValuesList;
    boolean mEnded;
    private androidx.transition.Transition.EpicenterCallback mEpicenterCallback;
    private android.animation.TimeInterpolator mInterpolator;
    private java.util.ArrayList<androidx.transition.Transition.TransitionListener> mListeners;
    private androidx.transition.Transition.TransitionListener[] mListenersCache;
    private int[] mMatchOrder;
    private java.lang.String mName;
    private androidx.collection.ArrayMap<java.lang.String, java.lang.String> mNameOverrides;
    int mNumInstances;
    androidx.transition.TransitionSet mParent;
    private androidx.transition.PathMotion mPathMotion;
    private boolean mPaused;
    androidx.transition.TransitionPropagation mPropagation;
    androidx.transition.Transition.SeekController mSeekController;
    long mSeekOffsetInParent;
    private long mStartDelay;
    private androidx.transition.TransitionValuesMaps mStartValues;
    private java.util.ArrayList<androidx.transition.TransitionValues> mStartValuesList;
    private java.util.ArrayList<android.view.View> mTargetChildExcludes;
    private java.util.ArrayList<android.view.View> mTargetExcludes;
    private java.util.ArrayList<java.lang.Integer> mTargetIdChildExcludes;
    private java.util.ArrayList<java.lang.Integer> mTargetIdExcludes;
    java.util.ArrayList<java.lang.Integer> mTargetIds;
    private java.util.ArrayList<java.lang.String> mTargetNameExcludes;
    private java.util.ArrayList<java.lang.String> mTargetNames;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeChildExcludes;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeExcludes;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypes;
    java.util.ArrayList<android.view.View> mTargets;
    long mTotalDuration;




    private static class AnimationInfo {
        android.animation.Animator mAnimator;
        java.lang.String mName;
        androidx.transition.Transition mTransition;
        androidx.transition.TransitionValues mValues;
        android.view.View mView;
        android.view.WindowId mWindowId;

        AnimationInfo(android.view.View r1, java.lang.String r2, androidx.transition.Transition r3, android.view.WindowId r4, androidx.transition.TransitionValues r5, android.animation.Animator r6) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                r0.mName = r2
                r0.mValues = r5
                r0.mWindowId = r4
                r0.mTransition = r3
                r0.mAnimator = r6
                return
        }
    }

    private static class ArrayListManager {
        private ArrayListManager() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> java.util.ArrayList<T> add(java.util.ArrayList<T> r1, T r2) {
                if (r1 != 0) goto L7
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L7:
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto L10
                r1.add(r2)
            L10:
                return r1
        }

        static <T> java.util.ArrayList<T> remove(java.util.ArrayList<T> r0, T r1) {
                if (r0 == 0) goto Lc
                r0.remove(r1)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto Lc
                r0 = 0
            Lc:
                return r0
        }
    }

    public static abstract class EpicenterCallback {
        public EpicenterCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract android.graphics.Rect onGetEpicenter(androidx.transition.Transition r1);
    }

    private static class Impl26 {
        private Impl26() {
                r0 = this;
                r0.<init>()
                return
        }

        static long getTotalDuration(android.animation.Animator r2) {
                long r0 = r2.getTotalDuration()
                return r0
        }

        static void setCurrentPlayTime(android.animation.Animator r0, long r1) {
                android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
                r0.setCurrentPlayTime(r1)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    class SeekController extends androidx.transition.TransitionListenerAdapter implements androidx.transition.TransitionSeekController, androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener {
        private long mCurrentPlayTime;
        private boolean mIsCanceled;
        private boolean mIsReady;
        private androidx.core.util.Consumer<androidx.transition.TransitionSeekController>[] mListenerCache;
        private java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> mOnProgressListeners;
        private java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> mOnReadyListeners;
        private java.lang.Runnable mResetToStartState;
        private androidx.dynamicanimation.animation.SpringAnimation mSpringAnimation;
        private final androidx.transition.VelocityTracker1D mVelocityTracker;
        final /* synthetic */ androidx.transition.Transition this$0;

        SeekController(androidx.transition.Transition r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r0 = -1
                r2.mCurrentPlayTime = r0
                r3 = 0
                r2.mOnReadyListeners = r3
                r2.mOnProgressListeners = r3
                r2.mListenerCache = r3
                androidx.transition.VelocityTracker1D r3 = new androidx.transition.VelocityTracker1D
                r3.<init>()
                r2.mVelocityTracker = r3
                return
        }

        private void callProgressListeners() {
                r5 = this;
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r5.mOnProgressListeners
                if (r0 == 0) goto L35
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                goto L35
            Lb:
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r5.mOnProgressListeners
                int r0 = r0.size()
                androidx.core.util.Consumer<androidx.transition.TransitionSeekController>[] r1 = r5.mListenerCache
                if (r1 != 0) goto L19
                androidx.core.util.Consumer[] r1 = new androidx.core.util.Consumer[r0]
                r5.mListenerCache = r1
            L19:
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r1 = r5.mOnProgressListeners
                androidx.core.util.Consumer<androidx.transition.TransitionSeekController>[] r2 = r5.mListenerCache
                java.lang.Object[] r1 = r1.toArray(r2)
                androidx.core.util.Consumer[] r1 = (androidx.core.util.Consumer[]) r1
                r2 = 0
                r5.mListenerCache = r2
                r3 = 0
            L27:
                if (r3 >= r0) goto L33
                r4 = r1[r3]
                r4.accept(r5)
                r1[r3] = r2
                int r3 = r3 + 1
                goto L27
            L33:
                r5.mListenerCache = r1
            L35:
                return
        }

        private void ensureAnimation() {
                r5 = this;
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                if (r0 == 0) goto L5
                return
            L5:
                androidx.transition.VelocityTracker1D r0 = r5.mVelocityTracker
                long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r3 = r5.mCurrentPlayTime
                float r3 = (float) r3
                r0.addDataPoint(r1, r3)
                androidx.dynamicanimation.animation.SpringAnimation r0 = new androidx.dynamicanimation.animation.SpringAnimation
                androidx.dynamicanimation.animation.FloatValueHolder r1 = new androidx.dynamicanimation.animation.FloatValueHolder
                r1.<init>()
                r0.<init>(r1)
                r5.mSpringAnimation = r0
                androidx.dynamicanimation.animation.SpringForce r0 = new androidx.dynamicanimation.animation.SpringForce
                r0.<init>()
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.setDampingRatio(r1)
                r1 = 1128792064(0x43480000, float:200.0)
                r0.setStiffness(r1)
                androidx.dynamicanimation.animation.SpringAnimation r1 = r5.mSpringAnimation
                r1.setSpring(r0)
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                long r1 = r5.mCurrentPlayTime
                float r1 = (float) r1
                r0.setStartValue(r1)
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                r0.addUpdateListener(r5)
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                androidx.transition.VelocityTracker1D r1 = r5.mVelocityTracker
                float r1 = r1.calculateVelocity()
                r0.setStartVelocity(r1)
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                long r1 = r5.getDurationMillis()
                r3 = 1
                long r1 = r1 + r3
                float r1 = (float) r1
                r0.setMaxValue(r1)
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r0.setMinValue(r1)
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                r1 = 1082130432(0x40800000, float:4.0)
                r0.setMinimumVisibleChange(r1)
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                androidx.transition.Transition$SeekController$$ExternalSyntheticLambda0 r1 = new androidx.transition.Transition$SeekController$$ExternalSyntheticLambda0
                r1.<init>(r5)
                r0.addEndListener(r1)
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public void addOnProgressChangedListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> r2) {
                r1 = this;
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r1.mOnProgressListeners
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mOnProgressListeners = r0
            Lb:
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r1.mOnProgressListeners
                r0.add(r2)
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public void addOnReadyListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> r2) {
                r1 = this;
                boolean r0 = r1.isReady()
                if (r0 == 0) goto La
                r2.accept(r1)
                return
            La:
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r1.mOnReadyListeners
                if (r0 != 0) goto L15
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mOnReadyListeners = r0
            L15:
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r1.mOnReadyListeners
                r0.add(r2)
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public void animateToEnd() {
                r5 = this;
                r5.ensureAnimation()
                androidx.dynamicanimation.animation.SpringAnimation r0 = r5.mSpringAnimation
                long r1 = r5.getDurationMillis()
                r3 = 1
                long r1 = r1 + r3
                float r1 = (float) r1
                r0.animateToFinalPosition(r1)
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public void animateToStart(java.lang.Runnable r2) {
                r1 = this;
                r1.mResetToStartState = r2
                r1.ensureAnimation()
                androidx.dynamicanimation.animation.SpringAnimation r2 = r1.mSpringAnimation
                r0 = 0
                r2.animateToFinalPosition(r0)
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public float getCurrentFraction() {
                r3 = this;
                long r0 = r3.getCurrentPlayTimeMillis()
                float r0 = (float) r0
                long r1 = r3.getDurationMillis()
                float r1 = (float) r1
                float r0 = r0 / r1
                return r0
        }

        @Override // androidx.transition.TransitionSeekController
        public long getCurrentPlayTimeMillis() {
                r6 = this;
                long r0 = r6.getDurationMillis()
                r2 = 0
                long r4 = r6.mCurrentPlayTime
                long r2 = java.lang.Math.max(r2, r4)
                long r0 = java.lang.Math.min(r0, r2)
                return r0
        }

        @Override // androidx.transition.TransitionSeekController
        public long getDurationMillis() {
                r2 = this;
                androidx.transition.Transition r0 = r2.this$0
                long r0 = r0.getTotalDurationMillis()
                return r0
        }

        void initPlayTime() {
                r6 = this;
                long r0 = r6.getDurationMillis()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Lc
                r2 = 1
            Lc:
                androidx.transition.Transition r0 = r6.this$0
                long r4 = r6.mCurrentPlayTime
                r0.setCurrentPlayTimeMillis(r2, r4)
                r6.mCurrentPlayTime = r2
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public boolean isReady() {
                r1 = this;
                boolean r0 = r1.mIsReady
                return r0
        }

        /* JADX INFO: renamed from: lambda$ensureAnimation$0$androidx-transition-Transition$SeekController, reason: not valid java name */
        /* synthetic */ void m70x76b2d240(androidx.dynamicanimation.animation.DynamicAnimation r5, boolean r6, float r7, float r8) {
                r4 = this;
                if (r6 != 0) goto L4b
                r5 = 1065353216(0x3f800000, float:1.0)
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                r6 = 0
                if (r5 >= 0) goto L44
                long r7 = r4.getDurationMillis()
                androidx.transition.Transition r5 = r4.this$0
                androidx.transition.TransitionSet r5 = (androidx.transition.TransitionSet) r5
                androidx.transition.Transition r5 = r5.getTransitionAt(r6)
                androidx.transition.Transition r6 = androidx.transition.Transition.access$000(r5)
                r0 = 0
                androidx.transition.Transition.access$002(r5, r0)
                androidx.transition.Transition r5 = r4.this$0
                long r0 = r4.mCurrentPlayTime
                r2 = -1
                r5.setCurrentPlayTimeMillis(r2, r0)
                androidx.transition.Transition r5 = r4.this$0
                r5.setCurrentPlayTimeMillis(r7, r2)
                r4.mCurrentPlayTime = r7
                java.lang.Runnable r5 = r4.mResetToStartState
                if (r5 == 0) goto L34
                r5.run()
            L34:
                androidx.transition.Transition r5 = r4.this$0
                java.util.ArrayList<android.animation.Animator> r5 = r5.mAnimators
                r5.clear()
                if (r6 == 0) goto L4b
                androidx.transition.Transition$TransitionNotification r5 = androidx.transition.Transition.TransitionNotification.ON_END
                r7 = 1
                r6.notifyListeners(r5, r7)
                goto L4b
            L44:
                androidx.transition.Transition r5 = r4.this$0
                androidx.transition.Transition$TransitionNotification r7 = androidx.transition.Transition.TransitionNotification.ON_END
                r5.notifyListeners(r7, r6)
            L4b:
                return
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(androidx.dynamicanimation.animation.DynamicAnimation r5, float r6, float r7) {
                r4 = this;
                long r0 = r4.getDurationMillis()
                r2 = 1
                long r0 = r0 + r2
                double r5 = (double) r6
                long r5 = java.lang.Math.round(r5)
                long r5 = java.lang.Math.min(r0, r5)
                r0 = -1
                long r5 = java.lang.Math.max(r0, r5)
                androidx.transition.Transition r7 = r4.this$0
                long r0 = r4.mCurrentPlayTime
                r7.setCurrentPlayTimeMillis(r5, r0)
                r4.mCurrentPlayTime = r5
                r4.callProgressListeners()
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition r1) {
                r0 = this;
                r1 = 1
                r0.mIsCanceled = r1
                return
        }

        public void ready() {
                r3 = this;
                r0 = 1
                r3.mIsReady = r0
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r3.mOnReadyListeners
                if (r0 == 0) goto L1d
                r1 = 0
                r3.mOnReadyListeners = r1
                r1 = 0
            Lb:
                int r2 = r0.size()
                if (r1 >= r2) goto L1d
                java.lang.Object r2 = r0.get(r1)
                androidx.core.util.Consumer r2 = (androidx.core.util.Consumer) r2
                r2.accept(r3)
                int r1 = r1 + 1
                goto Lb
            L1d:
                r3.callProgressListeners()
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public void removeOnProgressChangedListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> r2) {
                r1 = this;
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r1.mOnProgressListeners
                if (r0 == 0) goto L7
                r0.remove(r2)
            L7:
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public void removeOnReadyListener(androidx.core.util.Consumer<androidx.transition.TransitionSeekController> r2) {
                r1 = this;
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r0 = r1.mOnReadyListeners
                if (r0 == 0) goto L12
                r0.remove(r2)
                java.util.ArrayList<androidx.core.util.Consumer<androidx.transition.TransitionSeekController>> r2 = r1.mOnReadyListeners
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L12
                r2 = 0
                r1.mOnReadyListeners = r2
            L12:
                return
        }

        @Override // androidx.transition.TransitionSeekController
        public void setCurrentFraction(float r3) {
                r2 = this;
                androidx.dynamicanimation.animation.SpringAnimation r0 = r2.mSpringAnimation
                if (r0 != 0) goto Lf
                long r0 = r2.getDurationMillis()
                float r0 = (float) r0
                float r3 = r3 * r0
                long r0 = (long) r3
                r2.setCurrentPlayTimeMillis(r0)
                return
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "setCurrentFraction() called after animation has been started"
                r3.<init>(r0)
                throw r3
        }

        @Override // androidx.transition.TransitionSeekController
        public void setCurrentPlayTimeMillis(long r5) {
                r4 = this;
                androidx.dynamicanimation.animation.SpringAnimation r0 = r4.mSpringAnimation
                if (r0 != 0) goto L51
                long r0 = r4.mCurrentPlayTime
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 == 0) goto L50
                boolean r0 = r4.isReady()
                if (r0 != 0) goto L11
                goto L50
            L11:
                boolean r0 = r4.mIsCanceled
                if (r0 != 0) goto L43
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L24
                long r2 = r4.mCurrentPlayTime
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 <= 0) goto L24
                r5 = -1
                goto L36
            L24:
                long r0 = r4.getDurationMillis()
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L36
                long r2 = r4.mCurrentPlayTime
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 >= 0) goto L36
                r5 = 1
                long r0 = r0 + r5
                r5 = r0
            L36:
                long r0 = r4.mCurrentPlayTime
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 == 0) goto L43
                androidx.transition.Transition r2 = r4.this$0
                r2.setCurrentPlayTimeMillis(r5, r0)
                r4.mCurrentPlayTime = r5
            L43:
                r4.callProgressListeners()
                androidx.transition.VelocityTracker1D r0 = r4.mVelocityTracker
                long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                float r5 = (float) r5
                r0.addDataPoint(r1, r5)
            L50:
                return
            L51:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "setCurrentPlayTimeMillis() called after animation has been started"
                r5.<init>(r6)
                throw r5
        }
    }

    public interface TransitionListener {
        void onTransitionCancel(androidx.transition.Transition r1);

        void onTransitionEnd(androidx.transition.Transition r1);

        default void onTransitionEnd(androidx.transition.Transition r1, boolean r2) {
                r0 = this;
                r0.onTransitionEnd(r1)
                return
        }

        void onTransitionPause(androidx.transition.Transition r1);

        void onTransitionResume(androidx.transition.Transition r1);

        void onTransitionStart(androidx.transition.Transition r1);

        default void onTransitionStart(androidx.transition.Transition r1, boolean r2) {
                r0 = this;
                r0.onTransitionStart(r1)
                return
        }
    }

    interface TransitionNotification {
        public static final androidx.transition.Transition.TransitionNotification ON_CANCEL = null;
        public static final androidx.transition.Transition.TransitionNotification ON_END = null;
        public static final androidx.transition.Transition.TransitionNotification ON_PAUSE = null;
        public static final androidx.transition.Transition.TransitionNotification ON_RESUME = null;
        public static final androidx.transition.Transition.TransitionNotification ON_START = null;

        static {
                androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda0 r0 = new androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda0
                r0.<init>()
                androidx.transition.Transition.TransitionNotification.ON_START = r0
                androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda1 r0 = new androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda1
                r0.<init>()
                androidx.transition.Transition.TransitionNotification.ON_END = r0
                androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda2 r0 = new androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda2
                r0.<init>()
                androidx.transition.Transition.TransitionNotification.ON_CANCEL = r0
                androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda3 r0 = new androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda3
                r0.<init>()
                androidx.transition.Transition.TransitionNotification.ON_PAUSE = r0
                androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda4 r0 = new androidx.transition.Transition$TransitionNotification$$ExternalSyntheticLambda4
                r0.<init>()
                androidx.transition.Transition.TransitionNotification.ON_RESUME = r0
                return
        }

        static /* synthetic */ void lambda$static$0(androidx.transition.Transition.TransitionListener r0, androidx.transition.Transition r1, boolean r2) {
                r0.onTransitionCancel(r1)
                return
        }

        static /* synthetic */ void lambda$static$1(androidx.transition.Transition.TransitionListener r0, androidx.transition.Transition r1, boolean r2) {
                r0.onTransitionPause(r1)
                return
        }

        static /* synthetic */ void lambda$static$2(androidx.transition.Transition.TransitionListener r0, androidx.transition.Transition r1, boolean r2) {
                r0.onTransitionResume(r1)
                return
        }

        void notifyListener(androidx.transition.Transition.TransitionListener r1, androidx.transition.Transition r2, boolean r3);
    }

    static {
            r0 = 0
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            androidx.transition.Transition.EMPTY_ANIMATOR_ARRAY = r0
            r0 = 3
            r1 = 4
            r2 = 2
            r3 = 1
            int[] r0 = new int[]{r2, r3, r0, r1}
            androidx.transition.Transition.DEFAULT_MATCH_ORDER = r0
            androidx.transition.Transition$1 r0 = new androidx.transition.Transition$1
            r0.<init>()
            androidx.transition.Transition.STRAIGHT_PATH_MOTION = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.transition.Transition.sRunningAnimators = r0
            return
    }

    public Transition() {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r3.mName = r0
            r0 = -1
            r3.mStartDelay = r0
            r3.mDuration = r0
            r0 = 0
            r3.mInterpolator = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.mTargetIds = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.mTargets = r1
            r3.mTargetNames = r0
            r3.mTargetTypes = r0
            r3.mTargetIdExcludes = r0
            r3.mTargetExcludes = r0
            r3.mTargetTypeExcludes = r0
            r3.mTargetNameExcludes = r0
            r3.mTargetIdChildExcludes = r0
            r3.mTargetChildExcludes = r0
            r3.mTargetTypeChildExcludes = r0
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps
            r1.<init>()
            r3.mStartValues = r1
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps
            r1.<init>()
            r3.mEndValues = r1
            r3.mParent = r0
            int[] r1 = androidx.transition.Transition.DEFAULT_MATCH_ORDER
            r3.mMatchOrder = r1
            r1 = 0
            r3.mCanRemoveViews = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mCurrentAnimators = r2
            android.animation.Animator[] r2 = androidx.transition.Transition.EMPTY_ANIMATOR_ARRAY
            r3.mAnimatorCache = r2
            r3.mNumInstances = r1
            r3.mPaused = r1
            r3.mEnded = r1
            r3.mCloneParent = r0
            r3.mListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mAnimators = r0
            androidx.transition.PathMotion r0 = androidx.transition.Transition.STRAIGHT_PATH_MOTION
            r3.mPathMotion = r0
            return
    }

    public Transition(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getName()
            r8.mName = r0
            r0 = -1
            r8.mStartDelay = r0
            r8.mDuration = r0
            r0 = 0
            r8.mInterpolator = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.mTargetIds = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.mTargets = r1
            r8.mTargetNames = r0
            r8.mTargetTypes = r0
            r8.mTargetIdExcludes = r0
            r8.mTargetExcludes = r0
            r8.mTargetTypeExcludes = r0
            r8.mTargetNameExcludes = r0
            r8.mTargetIdChildExcludes = r0
            r8.mTargetChildExcludes = r0
            r8.mTargetTypeChildExcludes = r0
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps
            r1.<init>()
            r8.mStartValues = r1
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps
            r1.<init>()
            r8.mEndValues = r1
            r8.mParent = r0
            int[] r1 = androidx.transition.Transition.DEFAULT_MATCH_ORDER
            r8.mMatchOrder = r1
            r1 = 0
            r8.mCanRemoveViews = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8.mCurrentAnimators = r2
            android.animation.Animator[] r2 = androidx.transition.Transition.EMPTY_ANIMATOR_ARRAY
            r8.mAnimatorCache = r2
            r8.mNumInstances = r1
            r8.mPaused = r1
            r8.mEnded = r1
            r8.mCloneParent = r0
            r8.mListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.mAnimators = r0
            androidx.transition.PathMotion r0 = androidx.transition.Transition.STRAIGHT_PATH_MOTION
            r8.mPathMotion = r0
            int[] r0 = androidx.transition.Styleable.TRANSITION
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0)
            android.content.res.XmlResourceParser r10 = (android.content.res.XmlResourceParser) r10
            java.lang.String r2 = "duration"
            r3 = 1
            r4 = -1
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r0, r10, r2, r3, r4)
            long r2 = (long) r2
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L87
            r8.setDuration(r2)
        L87:
            java.lang.String r2 = "startDelay"
            r3 = 2
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r0, r10, r2, r3, r4)
            long r2 = (long) r2
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L96
            r8.setStartDelay(r2)
        L96:
            java.lang.String r2 = "interpolator"
            int r1 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r0, r10, r2, r1, r1)
            if (r1 <= 0) goto La5
            android.view.animation.Interpolator r9 = android.view.animation.AnimationUtils.loadInterpolator(r9, r1)
            r8.setInterpolator(r9)
        La5:
            java.lang.String r9 = "matchOrder"
            r1 = 3
            java.lang.String r9 = androidx.core.content.res.TypedArrayUtils.getNamedString(r0, r10, r9, r1)
            if (r9 == 0) goto Lb5
            int[] r9 = parseMatchOrder(r9)
            r8.setMatchOrder(r9)
        Lb5:
            r0.recycle()
            return
    }

    static /* synthetic */ androidx.transition.Transition access$000(androidx.transition.Transition r0) {
            androidx.transition.Transition r0 = r0.mCloneParent
            return r0
    }

    static /* synthetic */ androidx.transition.Transition access$002(androidx.transition.Transition r0, androidx.transition.Transition r1) {
            r0.mCloneParent = r1
            return r1
    }

    private void addUnmatched(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r6, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r7) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            r3 = 0
            if (r1 >= r2) goto L24
            java.lang.Object r2 = r6.valueAt(r1)
            androidx.transition.TransitionValues r2 = (androidx.transition.TransitionValues) r2
            android.view.View r4 = r2.view
            boolean r4 = r5.isValidTarget(r4)
            if (r4 == 0) goto L21
            java.util.ArrayList<androidx.transition.TransitionValues> r4 = r5.mStartValuesList
            r4.add(r2)
            java.util.ArrayList<androidx.transition.TransitionValues> r2 = r5.mEndValuesList
            r2.add(r3)
        L21:
            int r1 = r1 + 1
            goto L2
        L24:
            int r6 = r7.size()
            if (r0 >= r6) goto L45
            java.lang.Object r6 = r7.valueAt(r0)
            androidx.transition.TransitionValues r6 = (androidx.transition.TransitionValues) r6
            android.view.View r1 = r6.view
            boolean r1 = r5.isValidTarget(r1)
            if (r1 == 0) goto L42
            java.util.ArrayList<androidx.transition.TransitionValues> r1 = r5.mEndValuesList
            r1.add(r6)
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r5.mStartValuesList
            r6.add(r3)
        L42:
            int r0 = r0 + 1
            goto L24
        L45:
            return
    }

    private static void addViewValues(androidx.transition.TransitionValuesMaps r3, android.view.View r4, androidx.transition.TransitionValues r5) {
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r0 = r3.mViewValues
            r0.put(r4, r5)
            int r5 = r4.getId()
            r0 = 0
            if (r5 < 0) goto L1f
            android.util.SparseArray<android.view.View> r1 = r3.mIdValues
            int r1 = r1.indexOfKey(r5)
            if (r1 < 0) goto L1a
            android.util.SparseArray<android.view.View> r1 = r3.mIdValues
            r1.put(r5, r0)
            goto L1f
        L1a:
            android.util.SparseArray<android.view.View> r1 = r3.mIdValues
            r1.put(r5, r4)
        L1f:
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r4)
            if (r5 == 0) goto L38
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r1 = r3.mNameValues
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L33
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r1 = r3.mNameValues
            r1.put(r5, r0)
            goto L38
        L33:
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r1 = r3.mNameValues
            r1.put(r5, r4)
        L38:
            android.view.ViewParent r5 = r4.getParent()
            boolean r5 = r5 instanceof android.widget.ListView
            if (r5 == 0) goto L7d
            android.view.ViewParent r5 = r4.getParent()
            android.widget.ListView r5 = (android.widget.ListView) r5
            android.widget.ListAdapter r1 = r5.getAdapter()
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L7d
            int r1 = r5.getPositionForView(r4)
            long r1 = r5.getItemIdAtPosition(r1)
            androidx.collection.LongSparseArray<android.view.View> r5 = r3.mItemIdValues
            int r5 = r5.indexOfKey(r1)
            if (r5 < 0) goto L74
            androidx.collection.LongSparseArray<android.view.View> r4 = r3.mItemIdValues
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L7d
            r5 = 0
            r4.setHasTransientState(r5)
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            r3.put(r1, r0)
            goto L7d
        L74:
            r5 = 1
            r4.setHasTransientState(r5)
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            r3.put(r1, r4)
        L7d:
            return
    }

    private static boolean alreadyContains(int[] r4, int r5) {
            r0 = r4[r5]
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r5) goto Lf
            r3 = r4[r2]
            if (r3 != r0) goto Lc
            r4 = 1
            return r4
        Lc:
            int r2 = r2 + 1
            goto L4
        Lf:
            return r1
    }

    private void captureHierarchy(android.view.View r6, boolean r7) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdExcludes
            if (r1 == 0) goto L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L16
            return
        L16:
            java.util.ArrayList<android.view.View> r1 = r5.mTargetExcludes
            if (r1 == 0) goto L21
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L21
            return
        L21:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypeExcludes
            r2 = 0
            if (r1 == 0) goto L3f
            int r1 = r1.size()
            r3 = r2
        L2b:
            if (r3 >= r1) goto L3f
            java.util.ArrayList<java.lang.Class<?>> r4 = r5.mTargetTypeExcludes
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L3c
            return
        L3c:
            int r3 = r3 + 1
            goto L2b
        L3f:
            android.view.ViewParent r1 = r6.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L6a
            androidx.transition.TransitionValues r1 = new androidx.transition.TransitionValues
            r1.<init>(r6)
            if (r7 == 0) goto L52
            r5.captureStartValues(r1)
            goto L55
        L52:
            r5.captureEndValues(r1)
        L55:
            java.util.ArrayList<androidx.transition.Transition> r3 = r1.mTargetedTransitions
            r3.add(r5)
            r5.capturePropagationValues(r1)
            if (r7 == 0) goto L65
            androidx.transition.TransitionValuesMaps r3 = r5.mStartValues
            addViewValues(r3, r6, r1)
            goto L6a
        L65:
            androidx.transition.TransitionValuesMaps r3 = r5.mEndValues
            addViewValues(r3, r6, r1)
        L6a:
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lb7
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdChildExcludes
            if (r1 == 0) goto L7d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L7d
            return
        L7d:
            java.util.ArrayList<android.view.View> r0 = r5.mTargetChildExcludes
            if (r0 == 0) goto L88
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L88
            return
        L88:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypeChildExcludes
            if (r0 == 0) goto La5
            int r0 = r0.size()
            r1 = r2
        L91:
            if (r1 >= r0) goto La5
            java.util.ArrayList<java.lang.Class<?>> r3 = r5.mTargetTypeChildExcludes
            java.lang.Object r3 = r3.get(r1)
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isInstance(r6)
            if (r3 == 0) goto La2
            return
        La2:
            int r1 = r1 + 1
            goto L91
        La5:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        La7:
            int r0 = r6.getChildCount()
            if (r2 >= r0) goto Lb7
            android.view.View r0 = r6.getChildAt(r2)
            r5.captureHierarchy(r0, r7)
            int r2 = r2 + 1
            goto La7
        Lb7:
            return
    }

    private java.util.ArrayList<java.lang.Integer> excludeId(java.util.ArrayList<java.lang.Integer> r1, int r2, boolean r3) {
            r0 = this;
            if (r2 <= 0) goto L15
            if (r3 == 0) goto Ld
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.add(r1, r2)
            goto L15
        Ld:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.remove(r1, r2)
        L15:
            return r1
    }

    private static <T> java.util.ArrayList<T> excludeObject(java.util.ArrayList<T> r0, T r1, boolean r2) {
            if (r1 == 0) goto Ld
            if (r2 == 0) goto L9
            java.util.ArrayList r0 = androidx.transition.Transition.ArrayListManager.add(r0, r1)
            goto Ld
        L9:
            java.util.ArrayList r0 = androidx.transition.Transition.ArrayListManager.remove(r0, r1)
        Ld:
            return r0
    }

    private java.util.ArrayList<java.lang.Class<?>> excludeType(java.util.ArrayList<java.lang.Class<?>> r1, java.lang.Class<?> r2, boolean r3) {
            r0 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.add(r1, r2)
            goto Ld
        L9:
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.remove(r1, r2)
        Ld:
            return r1
    }

    private java.util.ArrayList<android.view.View> excludeView(java.util.ArrayList<android.view.View> r1, android.view.View r2, boolean r3) {
            r0 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.add(r1, r2)
            goto Ld
        L9:
            java.util.ArrayList r1 = androidx.transition.Transition.ArrayListManager.remove(r1, r2)
        Ld:
            return r1
    }

    private static androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> getRunningAnimators() {
            java.lang.ThreadLocal<androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition$AnimationInfo>> r0 = androidx.transition.Transition.sRunningAnimators
            java.lang.Object r0 = r0.get()
            androidx.collection.ArrayMap r0 = (androidx.collection.ArrayMap) r0
            if (r0 != 0) goto L14
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.ThreadLocal<androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition$AnimationInfo>> r1 = androidx.transition.Transition.sRunningAnimators
            r1.set(r0)
        L14:
            return r0
    }

    private static boolean isValidMatch(int r2) {
            r0 = 1
            if (r2 < r0) goto L7
            r1 = 4
            if (r2 > r1) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private static boolean isValueChanged(androidx.transition.TransitionValues r0, androidx.transition.TransitionValues r1, java.lang.String r2) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.values
            java.lang.Object r0 = r0.get(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.values
            java.lang.Object r1 = r1.get(r2)
            if (r0 != 0) goto L12
            if (r1 != 0) goto L12
            r0 = 0
            goto L1f
        L12:
            r2 = 1
            if (r0 == 0) goto L1e
            if (r1 != 0) goto L18
            goto L1e
        L18:
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ r2
            goto L1f
        L1e:
            r0 = r2
        L1f:
            return r0
    }

    private void matchIds(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r8, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r9, android.util.SparseArray<android.view.View> r10, android.util.SparseArray<android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            int r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            java.lang.Object r5 = r9.get(r3)
            androidx.transition.TransitionValues r5 = (androidx.transition.TransitionValues) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<androidx.transition.TransitionValues> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    private void matchInstances(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r5, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r6) {
            r4 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L39
            java.lang.Object r1 = r5.keyAt(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L36
            boolean r2 = r4.isValidTarget(r1)
            if (r2 == 0) goto L36
            java.lang.Object r1 = r6.remove(r1)
            androidx.transition.TransitionValues r1 = (androidx.transition.TransitionValues) r1
            if (r1 == 0) goto L36
            android.view.View r2 = r1.view
            boolean r2 = r4.isValidTarget(r2)
            if (r2 == 0) goto L36
            java.lang.Object r2 = r5.removeAt(r0)
            androidx.transition.TransitionValues r2 = (androidx.transition.TransitionValues) r2
            java.util.ArrayList<androidx.transition.TransitionValues> r3 = r4.mStartValuesList
            r3.add(r2)
            java.util.ArrayList<androidx.transition.TransitionValues> r2 = r4.mEndValuesList
            r2.add(r1)
        L36:
            int r0 = r0 + (-1)
            goto L6
        L39:
            return
    }

    private void matchItemIds(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r8, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r9, androidx.collection.LongSparseArray<android.view.View> r10, androidx.collection.LongSparseArray<android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            long r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            java.lang.Object r5 = r9.get(r3)
            androidx.transition.TransitionValues r5 = (androidx.transition.TransitionValues) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<androidx.transition.TransitionValues> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    private void matchNames(androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r8, androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r9, androidx.collection.ArrayMap<java.lang.String, android.view.View> r10, androidx.collection.ArrayMap<java.lang.String, android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            java.lang.Object r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            java.lang.Object r5 = r9.get(r3)
            androidx.transition.TransitionValues r5 = (androidx.transition.TransitionValues) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<androidx.transition.TransitionValues> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    private void matchStartAndEnd(androidx.transition.TransitionValuesMaps r6, androidx.transition.TransitionValuesMaps r7) {
            r5 = this;
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r1 = r6.mViewValues
            r0.<init>(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r2 = r7.mViewValues
            r1.<init>(r2)
            r2 = 0
        Lf:
            int[] r3 = r5.mMatchOrder
            int r4 = r3.length
            if (r2 >= r4) goto L41
            r3 = r3[r2]
            r4 = 1
            if (r3 == r4) goto L3b
            r4 = 2
            if (r3 == r4) goto L33
            r4 = 3
            if (r3 == r4) goto L2b
            r4 = 4
            if (r3 == r4) goto L23
            goto L3e
        L23:
            androidx.collection.LongSparseArray<android.view.View> r3 = r6.mItemIdValues
            androidx.collection.LongSparseArray<android.view.View> r4 = r7.mItemIdValues
            r5.matchItemIds(r0, r1, r3, r4)
            goto L3e
        L2b:
            android.util.SparseArray<android.view.View> r3 = r6.mIdValues
            android.util.SparseArray<android.view.View> r4 = r7.mIdValues
            r5.matchIds(r0, r1, r3, r4)
            goto L3e
        L33:
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r3 = r6.mNameValues
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r4 = r7.mNameValues
            r5.matchNames(r0, r1, r3, r4)
            goto L3e
        L3b:
            r5.matchInstances(r0, r1)
        L3e:
            int r2 = r2 + 1
            goto Lf
        L41:
            r5.addUnmatched(r0, r1)
            return
    }

    private void notifyFromTransition(androidx.transition.Transition r6, androidx.transition.Transition.TransitionNotification r7, boolean r8) {
            r5 = this;
            androidx.transition.Transition r0 = r5.mCloneParent
            if (r0 == 0) goto L7
            r0.notifyFromTransition(r6, r7, r8)
        L7:
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r5.mListeners
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r5.mListeners
            int r0 = r0.size()
            androidx.transition.Transition$TransitionListener[] r1 = r5.mListenersCache
            if (r1 != 0) goto L1d
            androidx.transition.Transition$TransitionListener[] r1 = new androidx.transition.Transition.TransitionListener[r0]
        L1d:
            r2 = 0
            r5.mListenersCache = r2
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r3 = r5.mListeners
            java.lang.Object[] r1 = r3.toArray(r1)
            androidx.transition.Transition$TransitionListener[] r1 = (androidx.transition.Transition.TransitionListener[]) r1
            r3 = 0
        L29:
            if (r3 >= r0) goto L35
            r4 = r1[r3]
            r7.notifyListener(r4, r6, r8)
            r1[r3] = r2
            int r3 = r3 + 1
            goto L29
        L35:
            r5.mListenersCache = r1
        L37:
            return
    }

    private static int[] parseMatchOrder(java.lang.String r6) {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = ","
            r0.<init>(r6, r1)
            int r6 = r0.countTokens()
            int[] r6 = new int[r6]
            r1 = 0
            r2 = r1
        Lf:
            boolean r3 = r0.hasMoreTokens()
            if (r3 == 0) goto L7a
            java.lang.String r3 = r0.nextToken()
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = "id"
            boolean r4 = r4.equalsIgnoreCase(r3)
            r5 = 1
            if (r4 == 0) goto L2a
            r3 = 3
            r6[r2] = r3
            goto L5d
        L2a:
            java.lang.String r4 = "instance"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L35
            r6[r2] = r5
            goto L5d
        L35:
            java.lang.String r4 = "name"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L41
            r3 = 2
            r6[r2] = r3
            goto L5d
        L41:
            java.lang.String r4 = "itemId"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L4d
            r3 = 4
            r6[r2] = r3
            goto L5d
        L4d:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L5f
            int r3 = r6.length
            int r3 = r3 - r5
            int[] r3 = new int[r3]
            java.lang.System.arraycopy(r6, r1, r3, r1, r2)
            int r2 = r2 + (-1)
            r6 = r3
        L5d:
            int r2 = r2 + r5
            goto Lf
        L5f:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown match type in matchOrder: '"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "'"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L7a:
            return r6
    }

    private void runAnimator(android.animation.Animator r2, androidx.collection.ArrayMap<android.animation.Animator, androidx.transition.Transition.AnimationInfo> r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            androidx.transition.Transition$2 r0 = new androidx.transition.Transition$2
            r0.<init>(r1, r3)
            r2.addListener(r0)
            r1.animate(r2)
        Ld:
            return
    }

    public androidx.transition.Transition addListener(androidx.transition.Transition.TransitionListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r1.mListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mListeners = r0
        Lb:
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r1.mListeners
            r0.add(r2)
            return r1
    }

    public androidx.transition.Transition addTarget(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        Lb:
            return r1
    }

    public androidx.transition.Transition addTarget(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            r0.add(r2)
            return r1
    }

    public androidx.transition.Transition addTarget(java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTargetTypes = r0
        Lb:
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            r0.add(r2)
            return r1
    }

    public androidx.transition.Transition addTarget(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTargetNames = r0
        Lb:
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            r0.add(r2)
            return r1
    }

    protected void animate(android.animation.Animator r5) {
            r4 = this;
            if (r5 != 0) goto L6
            r4.end()
            goto L43
        L6:
            long r0 = r4.getDuration()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L17
            long r0 = r4.getDuration()
            r5.setDuration(r0)
        L17:
            long r0 = r4.getStartDelay()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L2b
            long r0 = r4.getStartDelay()
            long r2 = r5.getStartDelay()
            long r0 = r0 + r2
            r5.setStartDelay(r0)
        L2b:
            android.animation.TimeInterpolator r0 = r4.getInterpolator()
            if (r0 == 0) goto L38
            android.animation.TimeInterpolator r0 = r4.getInterpolator()
            r5.setInterpolator(r0)
        L38:
            androidx.transition.Transition$3 r0 = new androidx.transition.Transition$3
            r0.<init>(r4)
            r5.addListener(r0)
            r5.start()
        L43:
            return
    }

    protected void cancel() {
            r4 = this;
            java.util.ArrayList<android.animation.Animator> r0 = r4.mCurrentAnimators
            int r0 = r0.size()
            java.util.ArrayList<android.animation.Animator> r1 = r4.mCurrentAnimators
            android.animation.Animator[] r2 = r4.mAnimatorCache
            java.lang.Object[] r1 = r1.toArray(r2)
            android.animation.Animator[] r1 = (android.animation.Animator[]) r1
            android.animation.Animator[] r2 = androidx.transition.Transition.EMPTY_ANIMATOR_ARRAY
            r4.mAnimatorCache = r2
            int r0 = r0 + (-1)
        L16:
            if (r0 < 0) goto L23
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            r2.cancel()
            int r0 = r0 + (-1)
            goto L16
        L23:
            r4.mAnimatorCache = r1
            androidx.transition.Transition$TransitionNotification r0 = androidx.transition.Transition.TransitionNotification.ON_CANCEL
            r1 = 0
            r4.notifyListeners(r0, r1)
            return
    }

    public abstract void captureEndValues(androidx.transition.TransitionValues r1);

    void capturePropagationValues(androidx.transition.TransitionValues r5) {
            r4 = this;
            androidx.transition.TransitionPropagation r0 = r4.mPropagation
            if (r0 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.values
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2c
            androidx.transition.TransitionPropagation r0 = r4.mPropagation
            java.lang.String[] r0 = r0.getPropagationProperties()
            if (r0 != 0) goto L15
            return
        L15:
            r1 = 0
        L16:
            int r2 = r0.length
            if (r1 >= r2) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.values
            r3 = r0[r1]
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L29
            androidx.transition.TransitionPropagation r0 = r4.mPropagation
            r0.captureValues(r5)
            goto L2c
        L29:
            int r1 = r1 + 1
            goto L16
        L2c:
            return
    }

    public abstract void captureStartValues(androidx.transition.TransitionValues r1);

    void captureValues(android.view.ViewGroup r6, boolean r7) {
            r5 = this;
            r5.clearValues(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.mTargetIds
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L14
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            int r0 = r0.size()
            if (r0 <= 0) goto L29
        L14:
            java.util.ArrayList<java.lang.String> r0 = r5.mTargetNames
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
        L1e:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypes
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
            goto L2e
        L29:
            r5.captureHierarchy(r6, r7)
            goto La6
        L2e:
            r0 = r1
        L2f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.mTargetIds
            int r2 = r2.size()
            if (r0 >= r2) goto L6f
            java.util.ArrayList<java.lang.Integer> r2 = r5.mTargetIds
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L6c
            androidx.transition.TransitionValues r3 = new androidx.transition.TransitionValues
            r3.<init>(r2)
            if (r7 == 0) goto L54
            r5.captureStartValues(r3)
            goto L57
        L54:
            r5.captureEndValues(r3)
        L57:
            java.util.ArrayList<androidx.transition.Transition> r4 = r3.mTargetedTransitions
            r4.add(r5)
            r5.capturePropagationValues(r3)
            if (r7 == 0) goto L67
            androidx.transition.TransitionValuesMaps r4 = r5.mStartValues
            addViewValues(r4, r2, r3)
            goto L6c
        L67:
            androidx.transition.TransitionValuesMaps r4 = r5.mEndValues
            addViewValues(r4, r2, r3)
        L6c:
            int r0 = r0 + 1
            goto L2f
        L6f:
            r6 = r1
        L70:
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            int r0 = r0.size()
            if (r6 >= r0) goto La6
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            androidx.transition.TransitionValues r2 = new androidx.transition.TransitionValues
            r2.<init>(r0)
            if (r7 == 0) goto L8b
            r5.captureStartValues(r2)
            goto L8e
        L8b:
            r5.captureEndValues(r2)
        L8e:
            java.util.ArrayList<androidx.transition.Transition> r3 = r2.mTargetedTransitions
            r3.add(r5)
            r5.capturePropagationValues(r2)
            if (r7 == 0) goto L9e
            androidx.transition.TransitionValuesMaps r3 = r5.mStartValues
            addViewValues(r3, r0, r2)
            goto La3
        L9e:
            androidx.transition.TransitionValuesMaps r3 = r5.mEndValues
            addViewValues(r3, r0, r2)
        La3:
            int r6 = r6 + 1
            goto L70
        La6:
            if (r7 != 0) goto Lec
            androidx.collection.ArrayMap<java.lang.String, java.lang.String> r6 = r5.mNameOverrides
            if (r6 == 0) goto Lec
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = r1
        Lb6:
            if (r0 >= r6) goto Ld0
            androidx.collection.ArrayMap<java.lang.String, java.lang.String> r2 = r5.mNameOverrides
            java.lang.Object r2 = r2.keyAt(r0)
            java.lang.String r2 = (java.lang.String) r2
            androidx.transition.TransitionValuesMaps r3 = r5.mStartValues
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r3 = r3.mNameValues
            java.lang.Object r2 = r3.remove(r2)
            android.view.View r2 = (android.view.View) r2
            r7.add(r2)
            int r0 = r0 + 1
            goto Lb6
        Ld0:
            if (r1 >= r6) goto Lec
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Le9
            androidx.collection.ArrayMap<java.lang.String, java.lang.String> r2 = r5.mNameOverrides
            java.lang.Object r2 = r2.valueAt(r1)
            java.lang.String r2 = (java.lang.String) r2
            androidx.transition.TransitionValuesMaps r3 = r5.mStartValues
            androidx.collection.ArrayMap<java.lang.String, android.view.View> r3 = r3.mNameValues
            r3.put(r2, r0)
        Le9:
            int r1 = r1 + 1
            goto Ld0
        Lec:
            return
    }

    void clearValues(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L18
            androidx.transition.TransitionValuesMaps r1 = r0.mStartValues
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r1 = r1.mViewValues
            r1.clear()
            androidx.transition.TransitionValuesMaps r1 = r0.mStartValues
            android.util.SparseArray<android.view.View> r1 = r1.mIdValues
            r1.clear()
            androidx.transition.TransitionValuesMaps r1 = r0.mStartValues
            androidx.collection.LongSparseArray<android.view.View> r1 = r1.mItemIdValues
            r1.clear()
            goto L2d
        L18:
            androidx.transition.TransitionValuesMaps r1 = r0.mEndValues
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r1 = r1.mViewValues
            r1.clear()
            androidx.transition.TransitionValuesMaps r1 = r0.mEndValues
            android.util.SparseArray<android.view.View> r1 = r1.mIdValues
            r1.clear()
            androidx.transition.TransitionValuesMaps r1 = r0.mEndValues
            androidx.collection.LongSparseArray<android.view.View> r1 = r1.mItemIdValues
            r1.clear()
        L2d:
            return
    }

    public androidx.transition.Transition clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L27
            androidx.transition.Transition r0 = (androidx.transition.Transition) r0     // Catch: java.lang.CloneNotSupportedException -> L27
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.CloneNotSupportedException -> L27
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mAnimators = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps     // Catch: java.lang.CloneNotSupportedException -> L27
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mStartValues = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            androidx.transition.TransitionValuesMaps r1 = new androidx.transition.TransitionValuesMaps     // Catch: java.lang.CloneNotSupportedException -> L27
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mEndValues = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r1 = 0
            r0.mStartValuesList = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mEndValuesList = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mSeekController = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mCloneParent = r2     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mListeners = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            return r0
        L27:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo69clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.transition.Transition r0 = r1.clone()
            return r0
    }

    public android.animation.Animator createAnimator(android.view.ViewGroup r1, androidx.transition.TransitionValues r2, androidx.transition.TransitionValues r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    void createAnimators(android.view.ViewGroup r22, androidx.transition.TransitionValuesMaps r23, androidx.transition.TransitionValuesMaps r24, java.util.ArrayList<androidx.transition.TransitionValues> r25, java.util.ArrayList<androidx.transition.TransitionValues> r26) {
            r21 = this;
            r7 = r21
            r8 = r22
            androidx.collection.ArrayMap r9 = getRunningAnimators()
            android.util.SparseIntArray r10 = new android.util.SparseIntArray
            r10.<init>()
            int r11 = r25.size()
            androidx.transition.Transition r0 = r21.getRootTransition()
            androidx.transition.Transition$SeekController r0 = r0.mSeekController
            if (r0 == 0) goto L1c
            r0 = 1
            r13 = r0
            goto L1d
        L1c:
            r13 = 0
        L1d:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = 0
        L23:
            if (r14 >= r11) goto L143
            r15 = r25
            java.lang.Object r2 = r15.get(r14)
            androidx.transition.TransitionValues r2 = (androidx.transition.TransitionValues) r2
            r6 = r26
            java.lang.Object r3 = r6.get(r14)
            androidx.transition.TransitionValues r3 = (androidx.transition.TransitionValues) r3
            if (r2 == 0) goto L40
            java.util.ArrayList<androidx.transition.Transition> r5 = r2.mTargetedTransitions
            boolean r5 = r5.contains(r7)
            if (r5 != 0) goto L40
            r2 = 0
        L40:
            if (r3 == 0) goto L4b
            java.util.ArrayList<androidx.transition.Transition> r5 = r3.mTargetedTransitions
            boolean r5 = r5.contains(r7)
            if (r5 != 0) goto L4b
            r3 = 0
        L4b:
            if (r2 != 0) goto L57
            if (r3 != 0) goto L57
        L4f:
            r17 = r11
            r19 = r13
            r18 = r14
            goto L13b
        L57:
            if (r2 == 0) goto L61
            if (r3 == 0) goto L61
            boolean r5 = r7.isTransitionRequired(r2, r3)
            if (r5 == 0) goto L4f
        L61:
            android.animation.Animator r5 = r7.createAnimator(r8, r2, r3)
            if (r5 == 0) goto L4f
            if (r3 == 0) goto Lee
            android.view.View r4 = r3.view
            java.lang.String[] r12 = r21.getTransitionProperties()
            r16 = r5
            if (r12 == 0) goto Le4
            int r5 = r12.length
            if (r5 <= 0) goto Le4
            androidx.transition.TransitionValues r5 = new androidx.transition.TransitionValues
            r5.<init>(r4)
            r17 = r11
            r11 = r24
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r6 = r11.mViewValues
            java.lang.Object r6 = r6.get(r4)
            androidx.transition.TransitionValues r6 = (androidx.transition.TransitionValues) r6
            if (r6 == 0) goto Lab
            r11 = 0
        L8a:
            int r15 = r12.length
            if (r11 >= r15) goto Lab
            java.util.Map<java.lang.String, java.lang.Object> r15 = r5.values
            r18 = r14
            r14 = r12[r11]
            r19 = r13
            java.util.Map<java.lang.String, java.lang.Object> r13 = r6.values
            r20 = r6
            r6 = r12[r11]
            java.lang.Object r6 = r13.get(r6)
            r15.put(r14, r6)
            int r11 = r11 + 1
            r14 = r18
            r13 = r19
            r6 = r20
            goto L8a
        Lab:
            r19 = r13
            r18 = r14
            int r6 = r9.size()
            r11 = 0
        Lb4:
            if (r11 >= r6) goto Leb
            java.lang.Object r12 = r9.keyAt(r11)
            android.animation.Animator r12 = (android.animation.Animator) r12
            java.lang.Object r12 = r9.get(r12)
            androidx.transition.Transition$AnimationInfo r12 = (androidx.transition.Transition.AnimationInfo) r12
            androidx.transition.TransitionValues r13 = r12.mValues
            if (r13 == 0) goto Le1
            android.view.View r13 = r12.mView
            if (r13 != r4) goto Le1
            java.lang.String r13 = r12.mName
            java.lang.String r14 = r21.getName()
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto Le1
            androidx.transition.TransitionValues r12 = r12.mValues
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto Le1
            r16 = 0
            goto Leb
        Le1:
            int r11 = r11 + 1
            goto Lb4
        Le4:
            r17 = r11
            r19 = r13
            r18 = r14
            r5 = 0
        Leb:
            r11 = r16
            goto Lfb
        Lee:
            r16 = r5
            r17 = r11
            r19 = r13
            r18 = r14
            android.view.View r4 = r2.view
            r11 = r16
            r5 = 0
        Lfb:
            if (r11 == 0) goto L13b
            androidx.transition.TransitionPropagation r6 = r7.mPropagation
            if (r6 == 0) goto L113
            long r2 = r6.getStartDelay(r8, r7, r2, r3)
            java.util.ArrayList<android.animation.Animator> r6 = r7.mAnimators
            int r6 = r6.size()
            int r12 = (int) r2
            r10.put(r6, r12)
            long r0 = java.lang.Math.min(r2, r0)
        L113:
            r12 = r0
            androidx.transition.Transition$AnimationInfo r14 = new androidx.transition.Transition$AnimationInfo
            java.lang.String r2 = r21.getName()
            android.view.WindowId r6 = r22.getWindowId()
            r0 = r14
            r1 = r4
            r3 = r21
            r4 = r6
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            if (r19 == 0) goto L132
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.play(r11)
            r11 = r0
        L132:
            r9.put(r11, r14)
            java.util.ArrayList<android.animation.Animator> r0 = r7.mAnimators
            r0.add(r11)
            r0 = r12
        L13b:
            int r14 = r18 + 1
            r11 = r17
            r13 = r19
            goto L23
        L143:
            int r2 = r10.size()
            if (r2 == 0) goto L177
            r12 = 0
        L14a:
            int r2 = r10.size()
            if (r12 >= r2) goto L177
            int r2 = r10.keyAt(r12)
            java.util.ArrayList<android.animation.Animator> r3 = r7.mAnimators
            java.lang.Object r2 = r3.get(r2)
            android.animation.Animator r2 = (android.animation.Animator) r2
            java.lang.Object r2 = r9.get(r2)
            androidx.transition.Transition$AnimationInfo r2 = (androidx.transition.Transition.AnimationInfo) r2
            int r3 = r10.valueAt(r12)
            long r3 = (long) r3
            long r3 = r3 - r0
            android.animation.Animator r5 = r2.mAnimator
            long r5 = r5.getStartDelay()
            long r3 = r3 + r5
            android.animation.Animator r2 = r2.mAnimator
            r2.setStartDelay(r3)
            int r12 = r12 + 1
            goto L14a
        L177:
            return
    }

    androidx.transition.TransitionSeekController createSeekController() {
            r1 = this;
            androidx.transition.Transition$SeekController r0 = new androidx.transition.Transition$SeekController
            r0.<init>(r1)
            r1.mSeekController = r0
            r1.addListener(r0)
            androidx.transition.Transition$SeekController r0 = r1.mSeekController
            return r0
    }

    protected void end() {
            r4 = this;
            int r0 = r4.mNumInstances
            r1 = 1
            int r0 = r0 - r1
            r4.mNumInstances = r0
            if (r0 != 0) goto L4a
            androidx.transition.Transition$TransitionNotification r0 = androidx.transition.Transition.TransitionNotification.ON_END
            r2 = 0
            r4.notifyListeners(r0, r2)
            r0 = r2
        Lf:
            androidx.transition.TransitionValuesMaps r3 = r4.mStartValues
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            int r3 = r3.size()
            if (r0 >= r3) goto L2b
            androidx.transition.TransitionValuesMaps r3 = r4.mStartValues
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            java.lang.Object r3 = r3.valueAt(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L28
            r3.setHasTransientState(r2)
        L28:
            int r0 = r0 + 1
            goto Lf
        L2b:
            r0 = r2
        L2c:
            androidx.transition.TransitionValuesMaps r3 = r4.mEndValues
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            int r3 = r3.size()
            if (r0 >= r3) goto L48
            androidx.transition.TransitionValuesMaps r3 = r4.mEndValues
            androidx.collection.LongSparseArray<android.view.View> r3 = r3.mItemIdValues
            java.lang.Object r3 = r3.valueAt(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L45
            r3.setHasTransientState(r2)
        L45:
            int r0 = r0 + 1
            goto L2c
        L48:
            r4.mEnded = r1
        L4a:
            return
    }

    public androidx.transition.Transition excludeChildren(int r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIdChildExcludes
            java.util.ArrayList r2 = r1.excludeId(r0, r2, r3)
            r1.mTargetIdChildExcludes = r2
            return r1
    }

    public androidx.transition.Transition excludeChildren(android.view.View r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargetChildExcludes
            java.util.ArrayList r2 = r1.excludeView(r0, r2, r3)
            r1.mTargetChildExcludes = r2
            return r1
    }

    public androidx.transition.Transition excludeChildren(java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypeChildExcludes
            java.util.ArrayList r2 = r1.excludeType(r0, r2, r3)
            r1.mTargetTypeChildExcludes = r2
            return r1
    }

    public androidx.transition.Transition excludeTarget(int r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIdExcludes
            java.util.ArrayList r2 = r1.excludeId(r0, r2, r3)
            r1.mTargetIdExcludes = r2
            return r1
    }

    public androidx.transition.Transition excludeTarget(android.view.View r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargetExcludes
            java.util.ArrayList r2 = r1.excludeView(r0, r2, r3)
            r1.mTargetExcludes = r2
            return r1
    }

    public androidx.transition.Transition excludeTarget(java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypeExcludes
            java.util.ArrayList r2 = r1.excludeType(r0, r2, r3)
            r1.mTargetTypeExcludes = r2
            return r1
    }

    public androidx.transition.Transition excludeTarget(java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNameExcludes
            java.util.ArrayList r2 = excludeObject(r0, r2, r3)
            r1.mTargetNameExcludes = r2
            return r1
    }

    void forceToEnd(android.view.ViewGroup r5) {
            r4 = this;
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            int r1 = r0.size()
            if (r5 == 0) goto L3b
            if (r1 != 0) goto Ld
            goto L3b
        Ld:
            android.view.WindowId r5 = r5.getWindowId()
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>(r0)
            r0.clear()
            int r1 = r1 + (-1)
        L1b:
            if (r1 < 0) goto L3b
            java.lang.Object r0 = r2.valueAt(r1)
            androidx.transition.Transition$AnimationInfo r0 = (androidx.transition.Transition.AnimationInfo) r0
            android.view.View r3 = r0.mView
            if (r3 == 0) goto L38
            android.view.WindowId r0 = r0.mWindowId
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L38
            java.lang.Object r0 = r2.keyAt(r1)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.end()
        L38:
            int r1 = r1 + (-1)
            goto L1b
        L3b:
            return
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.mDuration
            return r0
    }

    public android.graphics.Rect getEpicenter() {
            r1 = this;
            androidx.transition.Transition$EpicenterCallback r0 = r1.mEpicenterCallback
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.Rect r0 = r0.onGetEpicenter(r1)
            return r0
    }

    public androidx.transition.Transition.EpicenterCallback getEpicenterCallback() {
            r1 = this;
            androidx.transition.Transition$EpicenterCallback r0 = r1.mEpicenterCallback
            return r0
    }

    public android.animation.TimeInterpolator getInterpolator() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.mInterpolator
            return r0
    }

    androidx.transition.TransitionValues getMatchedTransitionValues(android.view.View r6, boolean r7) {
            r5 = this;
            androidx.transition.TransitionSet r0 = r5.mParent
            if (r0 == 0) goto L9
            androidx.transition.TransitionValues r6 = r0.getMatchedTransitionValues(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<androidx.transition.TransitionValues> r0 = r5.mStartValuesList
            goto L10
        Le:
            java.util.ArrayList<androidx.transition.TransitionValues> r0 = r5.mEndValuesList
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.TransitionValues r4 = (androidx.transition.TransitionValues) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.view
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r5.mEndValuesList
            goto L36
        L34:
            java.util.ArrayList<androidx.transition.TransitionValues> r6 = r5.mStartValuesList
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            androidx.transition.TransitionValues r1 = (androidx.transition.TransitionValues) r1
        L3d:
            return r1
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public androidx.transition.PathMotion getPathMotion() {
            r1 = this;
            androidx.transition.PathMotion r0 = r1.mPathMotion
            return r0
    }

    public androidx.transition.TransitionPropagation getPropagation() {
            r1 = this;
            androidx.transition.TransitionPropagation r0 = r1.mPropagation
            return r0
    }

    public final androidx.transition.Transition getRootTransition() {
            r1 = this;
            androidx.transition.TransitionSet r0 = r1.mParent
            if (r0 == 0) goto L9
            androidx.transition.Transition r0 = r0.getRootTransition()
            return r0
        L9:
            return r1
    }

    public long getStartDelay() {
            r2 = this;
            long r0 = r2.mStartDelay
            return r0
    }

    public java.util.List<java.lang.Integer> getTargetIds() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            return r0
    }

    public java.util.List<java.lang.String> getTargetNames() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            return r0
    }

    public java.util.List<java.lang.Class<?>> getTargetTypes() {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            return r0
    }

    public java.util.List<android.view.View> getTargets() {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            return r0
    }

    final long getTotalDurationMillis() {
            r2 = this;
            long r0 = r2.mTotalDuration
            return r0
    }

    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.transition.TransitionValues getTransitionValues(android.view.View r2, boolean r3) {
            r1 = this;
            androidx.transition.TransitionSet r0 = r1.mParent
            if (r0 == 0) goto L9
            androidx.transition.TransitionValues r2 = r0.getTransitionValues(r2, r3)
            return r2
        L9:
            if (r3 == 0) goto Le
            androidx.transition.TransitionValuesMaps r3 = r1.mStartValues
            goto L10
        Le:
            androidx.transition.TransitionValuesMaps r3 = r1.mEndValues
        L10:
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r3 = r3.mViewValues
            java.lang.Object r2 = r3.get(r2)
            androidx.transition.TransitionValues r2 = (androidx.transition.TransitionValues) r2
            return r2
    }

    boolean hasAnimators() {
            r1 = this;
            java.util.ArrayList<android.animation.Animator> r0 = r1.mCurrentAnimators
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isTransitionRequired(androidx.transition.TransitionValues r7, androidx.transition.TransitionValues r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L39
            if (r8 == 0) goto L39
            java.lang.String[] r1 = r6.getTransitionProperties()
            r2 = 1
            if (r1 == 0) goto L1c
            int r3 = r1.length
            r4 = r0
        Le:
            if (r4 >= r3) goto L39
            r5 = r1[r4]
            boolean r5 = isValueChanged(r7, r8, r5)
            if (r5 == 0) goto L19
            goto L38
        L19:
            int r4 = r4 + 1
            goto Le
        L1c:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.values
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = isValueChanged(r7, r8, r3)
            if (r3 == 0) goto L26
        L38:
            r0 = r2
        L39:
            return r0
    }

    boolean isValidTarget(android.view.View r6) {
            r5 = this;
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdExcludes
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.ArrayList<android.view.View> r1 = r5.mTargetExcludes
            if (r1 == 0) goto L1f
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L1f
            return r2
        L1f:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypeExcludes
            if (r1 == 0) goto L3c
            int r1 = r1.size()
            r3 = r2
        L28:
            if (r3 >= r1) goto L3c
            java.util.ArrayList<java.lang.Class<?>> r4 = r5.mTargetTypeExcludes
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L39
            return r2
        L39:
            int r3 = r3 + 1
            goto L28
        L3c:
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNameExcludes
            if (r1 == 0) goto L53
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r1 == 0) goto L53
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNameExcludes
            java.lang.String r3 = androidx.core.view.ViewCompat.getTransitionName(r6)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L53
            return r2
        L53:
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIds
            int r1 = r1.size()
            r3 = 1
            if (r1 != 0) goto L79
            java.util.ArrayList<android.view.View> r1 = r5.mTargets
            int r1 = r1.size()
            if (r1 != 0) goto L79
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            if (r1 == 0) goto L6e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L79
        L6e:
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNames
            if (r1 == 0) goto L78
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L79
        L78:
            return r3
        L79:
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIds
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lbd
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L8e
            goto Lbd
        L8e:
            java.util.ArrayList<java.lang.String> r0 = r5.mTargetNames
            if (r0 == 0) goto L9d
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r6)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9d
            return r3
        L9d:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypes
            if (r0 == 0) goto Lbc
            r0 = r2
        La2:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            int r1 = r1.size()
            if (r0 >= r1) goto Lbc
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            java.lang.Object r1 = r1.get(r0)
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r6)
            if (r1 == 0) goto Lb9
            return r3
        Lb9:
            int r0 = r0 + 1
            goto La2
        Lbc:
            return r2
        Lbd:
            return r3
    }

    void notifyListeners(androidx.transition.Transition.TransitionNotification r1, boolean r2) {
            r0 = this;
            r0.notifyFromTransition(r0, r1, r2)
            return
    }

    public void pause(android.view.View r5) {
            r4 = this;
            boolean r5 = r4.mEnded
            if (r5 != 0) goto L31
            java.util.ArrayList<android.animation.Animator> r5 = r4.mCurrentAnimators
            int r5 = r5.size()
            java.util.ArrayList<android.animation.Animator> r0 = r4.mCurrentAnimators
            android.animation.Animator[] r1 = r4.mAnimatorCache
            java.lang.Object[] r0 = r0.toArray(r1)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            android.animation.Animator[] r1 = androidx.transition.Transition.EMPTY_ANIMATOR_ARRAY
            r4.mAnimatorCache = r1
            r1 = 1
            int r5 = r5 - r1
        L1a:
            if (r5 < 0) goto L27
            r2 = r0[r5]
            r3 = 0
            r0[r5] = r3
            r2.pause()
            int r5 = r5 + (-1)
            goto L1a
        L27:
            r4.mAnimatorCache = r0
            androidx.transition.Transition$TransitionNotification r5 = androidx.transition.Transition.TransitionNotification.ON_PAUSE
            r0 = 0
            r4.notifyListeners(r5, r0)
            r4.mPaused = r1
        L31:
            return
    }

    void playTransition(android.view.ViewGroup r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mStartValuesList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mEndValuesList = r0
            androidx.transition.TransitionValuesMaps r0 = r10.mStartValues
            androidx.transition.TransitionValuesMaps r1 = r10.mEndValues
            r10.matchStartAndEnd(r0, r1)
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            int r1 = r0.size()
            android.view.WindowId r2 = r11.getWindowId()
            r3 = 1
            int r1 = r1 - r3
        L23:
            if (r1 < 0) goto Laf
            java.lang.Object r4 = r0.keyAt(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto Lab
            java.lang.Object r5 = r0.get(r4)
            androidx.transition.Transition$AnimationInfo r5 = (androidx.transition.Transition.AnimationInfo) r5
            if (r5 == 0) goto Lab
            android.view.View r6 = r5.mView
            if (r6 == 0) goto Lab
            android.view.WindowId r6 = r5.mWindowId
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            androidx.transition.TransitionValues r6 = r5.mValues
            android.view.View r7 = r5.mView
            androidx.transition.TransitionValues r8 = r10.getTransitionValues(r7, r3)
            androidx.transition.TransitionValues r9 = r10.getMatchedTransitionValues(r7, r3)
            if (r8 != 0) goto L5c
            if (r9 != 0) goto L5c
            androidx.transition.TransitionValuesMaps r9 = r10.mEndValues
            androidx.collection.ArrayMap<android.view.View, androidx.transition.TransitionValues> r9 = r9.mViewValues
            java.lang.Object r7 = r9.get(r7)
            r9 = r7
            androidx.transition.TransitionValues r9 = (androidx.transition.TransitionValues) r9
        L5c:
            if (r8 != 0) goto L60
            if (r9 == 0) goto Lab
        L60:
            androidx.transition.Transition r7 = r5.mTransition
            boolean r6 = r7.isTransitionRequired(r6, r9)
            if (r6 == 0) goto Lab
            androidx.transition.Transition r5 = r5.mTransition
            androidx.transition.Transition r6 = r5.getRootTransition()
            androidx.transition.Transition$SeekController r6 = r6.mSeekController
            if (r6 == 0) goto L97
            r4.cancel()
            java.util.ArrayList<android.animation.Animator> r6 = r5.mCurrentAnimators
            r6.remove(r4)
            r0.remove(r4)
            java.util.ArrayList<android.animation.Animator> r4 = r5.mCurrentAnimators
            int r4 = r4.size()
            if (r4 != 0) goto Lab
            androidx.transition.Transition$TransitionNotification r4 = androidx.transition.Transition.TransitionNotification.ON_CANCEL
            r6 = 0
            r5.notifyListeners(r4, r6)
            boolean r4 = r5.mEnded
            if (r4 != 0) goto Lab
            r5.mEnded = r3
            androidx.transition.Transition$TransitionNotification r4 = androidx.transition.Transition.TransitionNotification.ON_END
            r5.notifyListeners(r4, r6)
            goto Lab
        L97:
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto La8
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto La4
            goto La8
        La4:
            r0.remove(r4)
            goto Lab
        La8:
            r4.cancel()
        Lab:
            int r1 = r1 + (-1)
            goto L23
        Laf:
            androidx.transition.TransitionValuesMaps r6 = r10.mStartValues
            androidx.transition.TransitionValuesMaps r7 = r10.mEndValues
            java.util.ArrayList<androidx.transition.TransitionValues> r8 = r10.mStartValuesList
            java.util.ArrayList<androidx.transition.TransitionValues> r9 = r10.mEndValuesList
            r4 = r10
            r5 = r11
            r4.createAnimators(r5, r6, r7, r8, r9)
            androidx.transition.Transition$SeekController r11 = r10.mSeekController
            if (r11 != 0) goto Lc4
            r10.runAnimators()
            goto Ld7
        Lc4:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r11 < r0) goto Ld7
            r10.prepareAnimatorsForSeeking()
            androidx.transition.Transition$SeekController r11 = r10.mSeekController
            r11.initPlayTime()
            androidx.transition.Transition$SeekController r11 = r10.mSeekController
            r11.ready()
        Ld7:
            return
    }

    void prepareAnimatorsForSeeking() {
            r11 = this;
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            r1 = 0
            r11.mTotalDuration = r1
            r3 = 0
        L9:
            java.util.ArrayList<android.animation.Animator> r4 = r11.mAnimators
            int r4 = r4.size()
            if (r3 >= r4) goto L6f
            java.util.ArrayList<android.animation.Animator> r4 = r11.mAnimators
            java.lang.Object r4 = r4.get(r3)
            android.animation.Animator r4 = (android.animation.Animator) r4
            java.lang.Object r5 = r0.get(r4)
            androidx.transition.Transition$AnimationInfo r5 = (androidx.transition.Transition.AnimationInfo) r5
            if (r4 == 0) goto L6c
            if (r5 == 0) goto L6c
            long r6 = r11.getDuration()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 < 0) goto L34
            android.animation.Animator r6 = r5.mAnimator
            long r7 = r11.getDuration()
            r6.setDuration(r7)
        L34:
            long r6 = r11.getStartDelay()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 < 0) goto L4c
            android.animation.Animator r6 = r5.mAnimator
            long r7 = r11.getStartDelay()
            android.animation.Animator r9 = r5.mAnimator
            long r9 = r9.getStartDelay()
            long r7 = r7 + r9
            r6.setStartDelay(r7)
        L4c:
            android.animation.TimeInterpolator r6 = r11.getInterpolator()
            if (r6 == 0) goto L5b
            android.animation.Animator r5 = r5.mAnimator
            android.animation.TimeInterpolator r6 = r11.getInterpolator()
            r5.setInterpolator(r6)
        L5b:
            java.util.ArrayList<android.animation.Animator> r5 = r11.mCurrentAnimators
            r5.add(r4)
            long r5 = r11.mTotalDuration
            long r7 = androidx.transition.Transition.Impl26.getTotalDuration(r4)
            long r4 = java.lang.Math.max(r5, r7)
            r11.mTotalDuration = r4
        L6c:
            int r3 = r3 + 1
            goto L9
        L6f:
            java.util.ArrayList<android.animation.Animator> r0 = r11.mAnimators
            r0.clear()
            return
    }

    public androidx.transition.Transition removeListener(androidx.transition.Transition.TransitionListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r0 = r1.mListeners
            if (r0 != 0) goto L5
            return r1
        L5:
            boolean r0 = r0.remove(r2)
            if (r0 != 0) goto L12
            androidx.transition.Transition r0 = r1.mCloneParent
            if (r0 == 0) goto L12
            r0.removeListener(r2)
        L12:
            java.util.ArrayList<androidx.transition.Transition$TransitionListener> r2 = r1.mListeners
            int r2 = r2.size()
            if (r2 != 0) goto L1d
            r2 = 0
            r1.mListeners = r2
        L1d:
            return r1
    }

    public androidx.transition.Transition removeTarget(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
        Lb:
            return r1
    }

    public androidx.transition.Transition removeTarget(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            r0.remove(r2)
            return r1
    }

    public androidx.transition.Transition removeTarget(java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return r1
    }

    public androidx.transition.Transition removeTarget(java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return r1
    }

    public void resume(android.view.View r5) {
            r4 = this;
            boolean r5 = r4.mPaused
            if (r5 == 0) goto L35
            boolean r5 = r4.mEnded
            r0 = 0
            if (r5 != 0) goto L33
            java.util.ArrayList<android.animation.Animator> r5 = r4.mCurrentAnimators
            int r5 = r5.size()
            java.util.ArrayList<android.animation.Animator> r1 = r4.mCurrentAnimators
            android.animation.Animator[] r2 = r4.mAnimatorCache
            java.lang.Object[] r1 = r1.toArray(r2)
            android.animation.Animator[] r1 = (android.animation.Animator[]) r1
            android.animation.Animator[] r2 = androidx.transition.Transition.EMPTY_ANIMATOR_ARRAY
            r4.mAnimatorCache = r2
            int r5 = r5 + (-1)
        L1f:
            if (r5 < 0) goto L2c
            r2 = r1[r5]
            r3 = 0
            r1[r5] = r3
            r2.resume()
            int r5 = r5 + (-1)
            goto L1f
        L2c:
            r4.mAnimatorCache = r1
            androidx.transition.Transition$TransitionNotification r5 = androidx.transition.Transition.TransitionNotification.ON_RESUME
            r4.notifyListeners(r5, r0)
        L33:
            r4.mPaused = r0
        L35:
            return
    }

    protected void runAnimators() {
            r4 = this;
            r4.start()
            androidx.collection.ArrayMap r0 = getRunningAnimators()
            java.util.ArrayList<android.animation.Animator> r1 = r4.mAnimators
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            android.animation.Animator r2 = (android.animation.Animator) r2
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto Ld
            r4.start()
            r4.runAnimator(r2, r0)
            goto Ld
        L26:
            java.util.ArrayList<android.animation.Animator> r0 = r4.mAnimators
            r0.clear()
            r4.end()
            return
    }

    void setCanRemoveViews(boolean r1) {
            r0 = this;
            r0.mCanRemoveViews = r1
            return
    }

    void setCurrentPlayTimeMillis(long r18, long r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            long r3 = r17.getTotalDurationMillis()
            int r5 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            r7 = 0
            if (r5 >= 0) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = r7
        L10:
            r8 = 0
            int r10 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r10 >= 0) goto L1a
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 >= 0) goto L22
        L1a:
            int r11 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r11 <= 0) goto L29
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 > 0) goto L29
        L22:
            r0.mEnded = r7
            androidx.transition.Transition$TransitionNotification r11 = androidx.transition.Transition.TransitionNotification.ON_START
            r0.notifyListeners(r11, r5)
        L29:
            java.util.ArrayList<android.animation.Animator> r11 = r0.mCurrentAnimators
            int r11 = r11.size()
            java.util.ArrayList<android.animation.Animator> r12 = r0.mCurrentAnimators
            android.animation.Animator[] r13 = r0.mAnimatorCache
            java.lang.Object[] r12 = r12.toArray(r13)
            android.animation.Animator[] r12 = (android.animation.Animator[]) r12
            android.animation.Animator[] r13 = androidx.transition.Transition.EMPTY_ANIMATOR_ARRAY
            r0.mAnimatorCache = r13
        L3d:
            if (r7 >= r11) goto L58
            r13 = r12[r7]
            r14 = 0
            r12[r7] = r14
            long r14 = androidx.transition.Transition.Impl26.getTotalDuration(r13)
            r16 = r7
            long r6 = java.lang.Math.max(r8, r1)
            long r6 = java.lang.Math.min(r6, r14)
            androidx.transition.Transition.Impl26.setCurrentPlayTime(r13, r6)
            int r7 = r16 + 1
            goto L3d
        L58:
            r0.mAnimatorCache = r12
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L62
            int r3 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r3 <= 0) goto L68
        L62:
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L72
            if (r10 < 0) goto L72
        L68:
            if (r6 <= 0) goto L6d
            r1 = 1
            r0.mEnded = r1
        L6d:
            androidx.transition.Transition$TransitionNotification r1 = androidx.transition.Transition.TransitionNotification.ON_END
            r0.notifyListeners(r1, r5)
        L72:
            return
    }

    public androidx.transition.Transition setDuration(long r1) {
            r0 = this;
            r0.mDuration = r1
            return r0
    }

    public void setEpicenterCallback(androidx.transition.Transition.EpicenterCallback r1) {
            r0 = this;
            r0.mEpicenterCallback = r1
            return
    }

    public androidx.transition.Transition setInterpolator(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.mInterpolator = r1
            return r0
    }

    public void setMatchOrder(int... r3) {
            r2 = this;
            if (r3 == 0) goto L34
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L34
        L6:
            r0 = 0
        L7:
            int r1 = r3.length
            if (r0 >= r1) goto L2b
            r1 = r3[r0]
            boolean r1 = isValidMatch(r1)
            if (r1 == 0) goto L23
            boolean r1 = alreadyContains(r3, r0)
            if (r1 != 0) goto L1b
            int r0 = r0 + 1
            goto L7
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "matches contains a duplicate value"
            r3.<init>(r0)
            throw r3
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "matches contains invalid value"
            r3.<init>(r0)
            throw r3
        L2b:
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            r2.mMatchOrder = r3
            goto L38
        L34:
            int[] r3 = androidx.transition.Transition.DEFAULT_MATCH_ORDER
            r2.mMatchOrder = r3
        L38:
            return
    }

    public void setPathMotion(androidx.transition.PathMotion r1) {
            r0 = this;
            if (r1 != 0) goto L7
            androidx.transition.PathMotion r1 = androidx.transition.Transition.STRAIGHT_PATH_MOTION
            r0.mPathMotion = r1
            goto L9
        L7:
            r0.mPathMotion = r1
        L9:
            return
    }

    public void setPropagation(androidx.transition.TransitionPropagation r1) {
            r0 = this;
            r0.mPropagation = r1
            return
    }

    public androidx.transition.Transition setStartDelay(long r1) {
            r0 = this;
            r0.mStartDelay = r1
            return r0
    }

    protected void start() {
            r2 = this;
            int r0 = r2.mNumInstances
            if (r0 != 0) goto Lc
            androidx.transition.Transition$TransitionNotification r0 = androidx.transition.Transition.TransitionNotification.ON_START
            r1 = 0
            r2.notifyListeners(r0, r1)
            r2.mEnded = r1
        Lc:
            int r0 = r2.mNumInstances
            int r0 = r0 + 1
            r2.mNumInstances = r0
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    java.lang.String toString(java.lang.String r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.lang.Class r7 = r6.getClass()
            java.lang.String r7 = r7.getSimpleName()
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = "@"
            java.lang.StringBuilder r7 = r7.append(r0)
            int r0 = r6.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r7 = r7.append(r0)
            long r0 = r6.mDuration
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = ") "
            if (r0 == 0) goto L42
            java.lang.String r0 = "dur("
            java.lang.StringBuilder r0 = r7.append(r0)
            long r4 = r6.mDuration
            java.lang.StringBuilder r0 = r0.append(r4)
            r0.append(r1)
        L42:
            long r4 = r6.mStartDelay
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L57
            java.lang.String r0 = "dly("
            java.lang.StringBuilder r0 = r7.append(r0)
            long r2 = r6.mStartDelay
            java.lang.StringBuilder r0 = r0.append(r2)
            r0.append(r1)
        L57:
            android.animation.TimeInterpolator r0 = r6.mInterpolator
            if (r0 == 0) goto L6a
            java.lang.String r0 = "interp("
            java.lang.StringBuilder r0 = r7.append(r0)
            android.animation.TimeInterpolator r2 = r6.mInterpolator
            java.lang.StringBuilder r0 = r0.append(r2)
            r0.append(r1)
        L6a:
            java.util.ArrayList<java.lang.Integer> r0 = r6.mTargetIds
            int r0 = r0.size()
            if (r0 > 0) goto L7a
            java.util.ArrayList<android.view.View> r0 = r6.mTargets
            int r0 = r0.size()
            if (r0 <= 0) goto Lca
        L7a:
            java.lang.String r0 = "tgts("
            r7.append(r0)
            java.util.ArrayList<java.lang.Integer> r0 = r6.mTargetIds
            int r0 = r0.size()
            java.lang.String r1 = ", "
            r2 = 0
            if (r0 <= 0) goto La4
            r0 = r2
        L8b:
            java.util.ArrayList<java.lang.Integer> r3 = r6.mTargetIds
            int r3 = r3.size()
            if (r0 >= r3) goto La4
            if (r0 <= 0) goto L98
            r7.append(r1)
        L98:
            java.util.ArrayList<java.lang.Integer> r3 = r6.mTargetIds
            java.lang.Object r3 = r3.get(r0)
            r7.append(r3)
            int r0 = r0 + 1
            goto L8b
        La4:
            java.util.ArrayList<android.view.View> r0 = r6.mTargets
            int r0 = r0.size()
            if (r0 <= 0) goto Lc5
        Lac:
            java.util.ArrayList<android.view.View> r0 = r6.mTargets
            int r0 = r0.size()
            if (r2 >= r0) goto Lc5
            if (r2 <= 0) goto Lb9
            r7.append(r1)
        Lb9:
            java.util.ArrayList<android.view.View> r0 = r6.mTargets
            java.lang.Object r0 = r0.get(r2)
            r7.append(r0)
            int r2 = r2 + 1
            goto Lac
        Lc5:
            java.lang.String r0 = ")"
            r7.append(r0)
        Lca:
            java.lang.String r7 = r7.toString()
            return r7
    }
}
