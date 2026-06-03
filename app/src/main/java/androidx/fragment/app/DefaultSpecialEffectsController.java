package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {


    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }









    private static class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        AnimationInfo(androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.core.os.CancellationSignal r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mLoadedAnim = r1
                r0.mIsPop = r3
                return
        }

        androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(android.content.Context r5) {
                r4 = this;
                boolean r0 = r4.mLoadedAnim
                if (r0 == 0) goto L7
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = r4.mAnimation
                return r5
            L7:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r4.getOperation()
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.getOperation()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r3 = 1
                if (r1 != r2) goto L1e
                r1 = r3
                goto L1f
            L1e:
                r1 = 0
            L1f:
                boolean r2 = r4.mIsPop
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = androidx.fragment.app.FragmentAnim.loadAnimation(r5, r0, r1, r2)
                r4.mAnimation = r5
                r4.mLoadedAnim = r3
                return r5
        }
    }

    private static class SpecialEffectsInfo {
        private final androidx.fragment.app.SpecialEffectsController.Operation mOperation;
        private final androidx.core.os.CancellationSignal mSignal;

        SpecialEffectsInfo(androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.core.os.CancellationSignal r2) {
                r0 = this;
                r0.<init>()
                r0.mOperation = r1
                r0.mSignal = r2
                return
        }

        void completeSpecialEffect() {
                r2 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.mOperation
                androidx.core.os.CancellationSignal r1 = r2.mSignal
                r0.completeSpecialEffect(r1)
                return
        }

        androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.mOperation
                return r0
        }

        androidx.core.os.CancellationSignal getSignal() {
                r1 = this;
                androidx.core.os.CancellationSignal r0 = r1.mSignal
                return r0
        }

        boolean isVisibilityUnchanged() {
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.mOperation
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.mOperation
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                if (r0 == r1) goto L1f
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r1 == r0) goto L1d
                goto L1f
            L1d:
                r0 = 0
                goto L20
            L1f:
                r0 = 1
            L20:
                return r0
        }
    }

    private static class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        private final java.lang.Object mSharedElementTransition;
        private final java.lang.Object mTransition;

        TransitionInfo(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.core.os.CancellationSignal r3, boolean r4, boolean r5) {
                r1 = this;
                r1.<init>(r2, r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r2.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r3 != r0) goto L36
                if (r4 == 0) goto L16
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReenterTransition()
                goto L1e
            L16:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getEnterTransition()
            L1e:
                r1.mTransition = r3
                if (r4 == 0) goto L2b
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowReturnTransitionOverlap()
                goto L33
            L2b:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowEnterTransitionOverlap()
            L33:
                r1.mOverlapAllowed = r3
                goto L4e
            L36:
                if (r4 == 0) goto L41
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReturnTransition()
                goto L49
            L41:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getExitTransition()
            L49:
                r1.mTransition = r3
                r3 = 1
                r1.mOverlapAllowed = r3
            L4e:
                if (r5 == 0) goto L68
                if (r4 == 0) goto L5d
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementReturnTransition()
                r1.mSharedElementTransition = r2
                goto L6b
            L5d:
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementEnterTransition()
                r1.mSharedElementTransition = r2
                goto L6b
            L68:
                r2 = 0
                r1.mSharedElementTransition = r2
            L6b:
                return
        }

        private androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                if (r0 == 0) goto L13
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                boolean r0 = r0.canHandle(r4)
                if (r0 == 0) goto L13
                androidx.fragment.app.FragmentTransitionImpl r4 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                return r4
            L13:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                if (r0 == 0) goto L22
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                boolean r0 = r0.canHandle(r4)
                if (r0 == 0) goto L22
                androidx.fragment.app.FragmentTransitionImpl r4 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                return r4
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Transition "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r1 = " for fragment "
                java.lang.StringBuilder r4 = r4.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.getOperation()
                androidx.fragment.app.Fragment r1 = r1.getFragment()
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r1 = " is not a valid framework Transition or AndroidX Transition"
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
                r3 = this;
                java.lang.Object r0 = r3.mTransition
                androidx.fragment.app.FragmentTransitionImpl r0 = r3.getHandlingImpl(r0)
                java.lang.Object r1 = r3.mSharedElementTransition
                androidx.fragment.app.FragmentTransitionImpl r1 = r3.getHandlingImpl(r1)
                if (r0 == 0) goto L48
                if (r1 == 0) goto L48
                if (r0 != r1) goto L13
                goto L48
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                r1.<init>(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.getOperation()
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " returned Transition "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.Object r2 = r3.mTransition
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " which uses a different Transition  type than its shared element transition "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.Object r2 = r3.mSharedElementTransition
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L48:
                if (r0 == 0) goto L4b
                goto L4c
            L4b:
                r0 = r1
            L4c:
                return r0
        }

        public java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                return r0
        }

        java.lang.Object getTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mTransition
                return r0
        }

        public boolean hasSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        boolean isOverlapAllowed() {
                r1 = this;
                boolean r0 = r1.mOverlapAllowed
                return r0
        }
    }

    DefaultSpecialEffectsController(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void startAnimations(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> r20, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r21, boolean r22, java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> r23) {
            r19 = this;
            android.view.ViewGroup r7 = r19.getContainer()
            android.content.Context r8 = r7.getContext()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r20.iterator()
            r6 = 0
        L12:
            boolean r0 = r10.hasNext()
            java.lang.String r12 = " has started."
            java.lang.String r13 = "FragmentManager"
            r14 = 2
            if (r0 == 0) goto Le8
            java.lang.Object r0 = r10.next()
            r15 = r0
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r15 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r15
            boolean r0 = r15.isVisibilityUnchanged()
            if (r0 == 0) goto L30
            r15.completeSpecialEffect()
        L2d:
            r3 = r23
            goto L12
        L30:
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r15.getAnimation(r8)
            if (r0 != 0) goto L3a
            r15.completeSpecialEffect()
            goto L2d
        L3a:
            android.animation.Animator r5 = r0.animator
            if (r5 != 0) goto L42
            r9.add(r15)
            goto L2d
        L42:
            androidx.fragment.app.SpecialEffectsController$Operation r4 = r15.getOperation()
            androidx.fragment.app.Fragment r0 = r4.getFragment()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3 = r23
            java.lang.Object r2 = r3.get(r4)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r14)
            if (r1 == 0) goto L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ignoring Animator set on "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " as this Fragment was involved in a Transition."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L76:
            r15.completeSpecialEffect()
            goto L12
        L7a:
            androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r4.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            r16 = 1
            if (r1 != r2) goto L87
            r6 = r16
            goto L88
        L87:
            r6 = 0
        L88:
            r2 = r21
            if (r6 == 0) goto L8f
            r2.remove(r4)
        L8f:
            android.view.View r1 = r0.mView
            r7.startViewTransition(r1)
            androidx.fragment.app.DefaultSpecialEffectsController$2 r0 = new androidx.fragment.app.DefaultSpecialEffectsController$2
            r20 = r0
            r17 = r1
            r1 = r19
            r2 = r7
            r3 = r17
            r18 = r4
            r4 = r6
            r6 = r5
            r5 = r18
            r11 = r6
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.addListener(r0)
            r0 = r17
            r11.setTarget(r0)
            r11.start()
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r14)
            if (r0 == 0) goto Ld4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Animator from operation "
            r0.<init>(r1)
            r1 = r18
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
            goto Ld6
        Ld4:
            r1 = r18
        Ld6:
            androidx.core.os.CancellationSignal r0 = r15.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$3 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$3
            r15 = r19
            r2.<init>(r15, r11, r1)
            r0.setOnCancelListener(r2)
            r6 = r16
            goto L12
        Le8:
            r15 = r19
            java.util.Iterator r9 = r9.iterator()
        Lee:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L1cb
            java.lang.Object r0 = r9.next()
            r10 = r0
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r10 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r10
            androidx.fragment.app.SpecialEffectsController$Operation r11 = r10.getOperation()
            androidx.fragment.app.Fragment r0 = r11.getFragment()
            java.lang.String r1 = "Ignoring Animation set on "
            if (r22 == 0) goto L127
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r14)
            if (r2 == 0) goto L123
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r1 = " as Animations cannot run alongside Transitions."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L123:
            r10.completeSpecialEffect()
            goto Lee
        L127:
            if (r6 == 0) goto L149
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r14)
            if (r2 == 0) goto L145
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r1 = " as Animations cannot run alongside Animators."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L145:
            r10.completeSpecialEffect()
            goto Lee
        L149:
            android.view.View r5 = r0.mView
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r10.getAnimation(r8)
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = (androidx.fragment.app.FragmentAnim.AnimationOrAnimator) r0
            android.view.animation.Animation r0 = r0.animation
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            android.view.animation.Animation r0 = (android.view.animation.Animation) r0
            androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r11.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r1 == r2) goto L172
            r5.startAnimation(r0)
            r10.completeSpecialEffect()
            r16 = r6
            r17 = r8
            r6 = r14
            r8 = r5
            goto L1b0
        L172:
            r7.startViewTransition(r5)
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r4 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            r4.<init>(r0, r7, r5)
            androidx.fragment.app.DefaultSpecialEffectsController$4 r3 = new androidx.fragment.app.DefaultSpecialEffectsController$4
            r0 = r3
            r1 = r19
            r2 = r11
            r14 = r3
            r3 = r7
            r16 = r6
            r6 = r4
            r4 = r5
            r17 = r8
            r8 = r5
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.setAnimationListener(r14)
            r8.startAnimation(r6)
            r6 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r0 == 0) goto L1b0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Animation from operation "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L1b0:
            androidx.core.os.CancellationSignal r14 = r10.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$5 r5 = new androidx.fragment.app.DefaultSpecialEffectsController$5
            r0 = r5
            r1 = r19
            r2 = r8
            r3 = r7
            r4 = r10
            r8 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r14.setOnCancelListener(r8)
            r14 = r6
            r6 = r16
            r8 = r17
            goto Lee
        L1cb:
            return
    }

    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r34, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r35, boolean r36, androidx.fragment.app.SpecialEffectsController.Operation r37, androidx.fragment.app.SpecialEffectsController.Operation r38) {
            r33 = this;
            r6 = r33
            r7 = r36
            r8 = r37
            r9 = r38
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Iterator r0 = r34.iterator()
            r15 = 0
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            boolean r2 = r1.isVisibilityUnchanged()
            if (r2 == 0) goto L25
            goto L12
        L25:
            androidx.fragment.app.FragmentTransitionImpl r2 = r1.getHandlingImpl()
            if (r15 != 0) goto L2d
            r15 = r2
            goto L12
        L2d:
            if (r2 == 0) goto L12
            if (r15 != r2) goto L32
            goto L12
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r2.<init>(r3)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.getOperation()
            androidx.fragment.app.Fragment r3 = r3.getFragment()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " returned Transition "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Object r1 = r1.getTransition()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " which uses a different Transition  type than other Fragments."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L63:
            r14 = 0
            if (r15 != 0) goto L86
            java.util.Iterator r0 = r34.iterator()
        L6a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.getOperation()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            r10.put(r2, r3)
            r1.completeSpecialEffect()
            goto L6a
        L85:
            return r10
        L86:
            android.view.View r13 = new android.view.View
            android.view.ViewGroup r0 = r33.getContainer()
            android.content.Context r0 = r0.getContext()
            r13.<init>(r0)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.Iterator r20 = r34.iterator()
            r21 = r14
            r0 = 0
            r2 = 0
        Laf:
            boolean r1 = r20.hasNext()
            r22 = 2
            java.lang.String r14 = "FragmentManager"
            if (r1 == 0) goto L3a1
            java.lang.Object r1 = r20.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            boolean r17 = r1.hasSharedElementTransition()
            if (r17 == 0) goto L387
            if (r8 == 0) goto L387
            if (r9 == 0) goto L387
            java.lang.Object r0 = r1.getSharedElementTransition()
            java.lang.Object r0 = r15.cloneTransition(r0)
            java.lang.Object r1 = r15.wrapTransitionInSet(r0)
            androidx.fragment.app.Fragment r0 = r38.getFragment()
            java.util.ArrayList r0 = r0.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r17 = r37.getFragment()
            java.util.ArrayList r11 = r17.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r17 = r37.getFragment()
            r18 = r1
            java.util.ArrayList r1 = r17.getSharedElementTargetNames()
            r17 = r2
            r23 = r10
            r2 = 0
        Lf4:
            int r10 = r1.size()
            if (r2 >= r10) goto L115
            java.lang.Object r10 = r1.get(r2)
            int r10 = r0.indexOf(r10)
            r19 = r1
            r1 = -1
            if (r10 == r1) goto L110
            java.lang.Object r1 = r11.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.set(r10, r1)
        L110:
            int r2 = r2 + 1
            r1 = r19
            goto Lf4
        L115:
            androidx.fragment.app.Fragment r1 = r38.getFragment()
            java.util.ArrayList r10 = r1.getSharedElementTargetNames()
            if (r7 != 0) goto L130
            androidx.fragment.app.Fragment r1 = r37.getFragment()
            androidx.core.app.SharedElementCallback r1 = r1.getExitTransitionCallback()
            androidx.fragment.app.Fragment r2 = r38.getFragment()
            androidx.core.app.SharedElementCallback r2 = r2.getEnterTransitionCallback()
            goto L140
        L130:
            androidx.fragment.app.Fragment r1 = r37.getFragment()
            androidx.core.app.SharedElementCallback r1 = r1.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r2 = r38.getFragment()
            androidx.core.app.SharedElementCallback r2 = r2.getExitTransitionCallback()
        L140:
            int r11 = r0.size()
            r19 = r13
            r13 = 0
        L147:
            if (r13 >= r11) goto L167
            java.lang.Object r24 = r0.get(r13)
            r25 = r11
            r11 = r24
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r24 = r10.get(r13)
            r26 = r12
            r12 = r24
            java.lang.String r12 = (java.lang.String) r12
            r3.put(r11, r12)
            int r13 = r13 + 1
            r11 = r25
            r12 = r26
            goto L147
        L167:
            r26 = r12
            boolean r11 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r22)
            if (r11 == 0) goto L1c5
            java.lang.String r11 = ">>> entering view names <<<"
            android.util.Log.v(r14, r11)
            java.util.Iterator r11 = r10.iterator()
        L178:
            boolean r12 = r11.hasNext()
            java.lang.String r13 = "Name: "
            if (r12 == 0) goto L19b
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            r24 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r13)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r14, r11)
            r11 = r24
            goto L178
        L19b:
            java.lang.String r11 = ">>> exiting view names <<<"
            android.util.Log.v(r14, r11)
            java.util.Iterator r11 = r0.iterator()
        L1a4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1c5
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            r24 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r13)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r14, r11)
            r11 = r24
            goto L1a4
        L1c5:
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
            r11.<init>()
            androidx.fragment.app.Fragment r12 = r37.getFragment()
            android.view.View r12 = r12.mView
            r6.findNamedViews(r11, r12)
            r11.retainAll(r0)
            if (r1 == 0) goto L230
            boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r22)
            if (r12 == 0) goto L1f0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Executing exit callback for operation "
            r12.<init>(r13)
            java.lang.StringBuilder r12 = r12.append(r8)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r14, r12)
        L1f0:
            r1.onMapSharedElements(r0, r11)
            int r1 = r0.size()
            r12 = 1
            int r1 = r1 - r12
        L1f9:
            if (r1 < 0) goto L22d
            java.lang.Object r12 = r0.get(r1)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r11.get(r12)
            android.view.View r13 = (android.view.View) r13
            if (r13 != 0) goto L20f
            r3.remove(r12)
            r24 = r0
            goto L228
        L20f:
            r24 = r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r13)
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L228
            java.lang.Object r0 = r3.remove(r12)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r12 = androidx.core.view.ViewCompat.getTransitionName(r13)
            r3.put(r12, r0)
        L228:
            int r1 = r1 + (-1)
            r0 = r24
            goto L1f9
        L22d:
            r24 = r0
            goto L239
        L230:
            r24 = r0
            java.util.Set r0 = r11.keySet()
            r3.retainAll(r0)
        L239:
            androidx.collection.ArrayMap r12 = new androidx.collection.ArrayMap
            r12.<init>()
            androidx.fragment.app.Fragment r0 = r38.getFragment()
            android.view.View r0 = r0.mView
            r6.findNamedViews(r12, r0)
            r12.retainAll(r10)
            java.util.Collection r0 = r3.values()
            r12.retainAll(r0)
            if (r2 == 0) goto L2a8
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r22)
            if (r0 == 0) goto L26b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Executing enter callback for operation "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r14, r0)
        L26b:
            r2.onMapSharedElements(r10, r12)
            int r0 = r10.size()
            r1 = 1
            int r0 = r0 - r1
        L274:
            if (r0 < 0) goto L2ab
            java.lang.Object r1 = r10.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r12.get(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L28e
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.findKeyForValue(r3, r1)
            if (r1 == 0) goto L2a5
            r3.remove(r1)
            goto L2a5
        L28e:
            java.lang.String r13 = androidx.core.view.ViewCompat.getTransitionName(r2)
            boolean r13 = r1.equals(r13)
            if (r13 != 0) goto L2a5
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.findKeyForValue(r3, r1)
            if (r1 == 0) goto L2a5
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r2)
            r3.put(r1, r2)
        L2a5:
            int r0 = r0 + (-1)
            goto L274
        L2a8:
            androidx.fragment.app.FragmentTransition.retainValues(r3, r12)
        L2ab:
            java.util.Set r0 = r3.keySet()
            r6.retainMatchingViews(r11, r0)
            java.util.Collection r0 = r3.values()
            r6.retainMatchingViews(r12, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L2d7
            r5.clear()
            r4.clear()
            r25 = r3
            r3 = r9
            r11 = r15
            r2 = r17
            r10 = r23
            r0 = 0
            r1 = 0
            r9 = r4
            r15 = r5
            r5 = r19
            r4 = r26
            goto L394
        L2d7:
            androidx.fragment.app.Fragment r0 = r38.getFragment()
            androidx.fragment.app.Fragment r1 = r37.getFragment()
            r2 = 1
            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r0, r1, r7, r11, r2)
            android.view.ViewGroup r13 = r33.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$6 r14 = new androidx.fragment.app.DefaultSpecialEffectsController$6
            r2 = r24
            r0 = r14
            r7 = r18
            r1 = r33
            r27 = r17
            r2 = r38
            r25 = r3
            r3 = r37
            r9 = r4
            r4 = r36
            r8 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.core.view.OneShotPreDrawListener.add(r13, r14)
            java.util.Collection r0 = r11.values()
            r8.addAll(r0)
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L324
            r0 = r24
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.get(r0)
            android.view.View r0 = (android.view.View) r0
            r15.setEpicenter(r7, r0)
            r2 = r0
            goto L327
        L324:
            r1 = 0
            r2 = r27
        L327:
            java.util.Collection r0 = r12.values()
            r9.addAll(r0)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L355
            java.lang.Object r0 = r10.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r12.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L355
            android.view.ViewGroup r3 = r33.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$7 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$7
            r5 = r26
            r4.<init>(r6, r15, r0, r5)
            androidx.core.view.OneShotPreDrawListener.add(r3, r4)
            r0 = r19
            r21 = 1
            goto L359
        L355:
            r5 = r26
            r0 = r19
        L359:
            r15.setSharedElementTargets(r7, r0, r8)
            r16 = 0
            r17 = 0
            r14 = 0
            r3 = 0
            r4 = r5
            r12 = r15
            r5 = r0
            r13 = r7
            r11 = r15
            r15 = r3
            r18 = r7
            r19 = r9
            r12.scheduleRemoveTargets(r13, r14, r15, r16, r17, r18, r19)
            r0 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r15 = r8
            r10 = r23
            r8 = r37
            r10.put(r8, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = r38
            r10.put(r3, r0)
            r0 = r7
            goto L394
        L387:
            r27 = r2
            r25 = r3
            r3 = r9
            r11 = r15
            r1 = 0
            r9 = r4
            r15 = r5
            r4 = r12
            r5 = r13
            r2 = r27
        L394:
            r7 = r36
            r14 = r1
            r12 = r4
            r13 = r5
            r4 = r9
            r5 = r15
            r9 = r3
            r15 = r11
            r3 = r25
            goto Laf
        L3a1:
            r27 = r2
            r25 = r3
            r3 = r9
            r11 = r15
            r1 = 0
            r9 = r4
            r15 = r5
            r4 = r12
            r5 = r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r34.iterator()
            r12 = 0
            r13 = 0
        L3b7:
            boolean r16 = r7.hasNext()
            if (r16 == 0) goto L4f7
            java.lang.Object r16 = r7.next()
            r20 = r16
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r20 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r20
            boolean r16 = r20.isVisibilityUnchanged()
            if (r16 == 0) goto L3e2
            r36 = r7
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r20.getOperation()
            r16 = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            r10.put(r7, r12)
            r20.completeSpecialEffect()
            r7 = r36
            r12 = r16
            goto L3b7
        L3e2:
            r36 = r7
            r16 = r12
            java.lang.Object r7 = r20.getTransition()
            java.lang.Object r7 = r11.cloneTransition(r7)
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r20.getOperation()
            if (r0 == 0) goto L3fb
            if (r12 == r8) goto L3f8
            if (r12 != r3) goto L3fb
        L3f8:
            r17 = 1
            goto L3fd
        L3fb:
            r17 = r1
        L3fd:
            if (r7 != 0) goto L41c
            if (r17 != 0) goto L40b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r10.put(r12, r7)
            r20.completeSpecialEffect()
        L40b:
            r12 = r35
            r29 = r5
            r30 = r9
            r5 = r13
            r31 = r14
            r32 = r15
            r1 = r27
            r13 = 0
            r14 = 1
            goto L4e5
        L41c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r18 = r13
            androidx.fragment.app.Fragment r13 = r12.getFragment()
            android.view.View r13 = r13.mView
            r6.captureTransitioningViews(r1, r13)
            if (r17 == 0) goto L437
            if (r12 != r8) goto L434
            r1.removeAll(r15)
            goto L437
        L434:
            r1.removeAll(r9)
        L437:
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto L450
            r11.addTarget(r7, r5)
            r29 = r5
            r30 = r9
            r13 = r12
            r31 = r14
            r32 = r15
            r9 = r16
            r5 = r18
            r12 = r35
            goto L4b0
        L450:
            r11.addTargets(r7, r1)
            r19 = 0
            r24 = 0
            r17 = 0
            r26 = 0
            r28 = r12
            r13 = r16
            r12 = r11
            r29 = r5
            r30 = r9
            r9 = r13
            r5 = r18
            r13 = r7
            r31 = r14
            r14 = r7
            r32 = r15
            r15 = r1
            r16 = r17
            r17 = r26
            r18 = r19
            r19 = r24
            r12.scheduleRemoveTargets(r13, r14, r15, r16, r17, r18, r19)
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r28.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r12 != r13) goto L4ac
            r12 = r35
            r13 = r28
            r12.remove(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r1)
            androidx.fragment.app.Fragment r15 = r13.getFragment()
            android.view.View r15 = r15.mView
            r14.remove(r15)
            androidx.fragment.app.Fragment r15 = r13.getFragment()
            android.view.View r15 = r15.mView
            r11.scheduleHideFragmentView(r7, r15, r14)
            android.view.ViewGroup r14 = r33.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$8 r15 = new androidx.fragment.app.DefaultSpecialEffectsController$8
            r15.<init>(r6, r1)
            androidx.core.view.OneShotPreDrawListener.add(r14, r15)
            goto L4b0
        L4ac:
            r12 = r35
            r13 = r28
        L4b0:
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = r13.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r14 != r15) goto L4c3
            r2.addAll(r1)
            if (r21 == 0) goto L4c0
            r11.setEpicenter(r7, r4)
        L4c0:
            r1 = r27
            goto L4c8
        L4c3:
            r1 = r27
            r11.setEpicenter(r7, r1)
        L4c8:
            r14 = 1
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)
            r10.put(r13, r15)
            boolean r13 = r20.isOverlapAllowed()
            if (r13 == 0) goto L4de
            r13 = 0
            java.lang.Object r5 = r11.mergeTransitionsTogether(r5, r7, r13)
            r16 = r9
            goto L4e5
        L4de:
            r13 = 0
            java.lang.Object r7 = r11.mergeTransitionsTogether(r9, r7, r13)
            r16 = r7
        L4e5:
            r7 = r36
            r27 = r1
            r13 = r5
            r12 = r16
            r5 = r29
            r9 = r30
            r14 = r31
            r15 = r32
            r1 = 0
            goto L3b7
        L4f7:
            r30 = r9
            r9 = r12
            r5 = r13
            r31 = r14
            r32 = r15
            r14 = 1
            java.lang.Object r1 = r11.mergeTransitionsInSequence(r5, r9, r0)
            if (r1 != 0) goto L507
            return r10
        L507:
            java.util.Iterator r4 = r34.iterator()
        L50b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L589
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r5
            boolean r7 = r5.isVisibilityUnchanged()
            if (r7 == 0) goto L51e
            goto L50b
        L51e:
            java.lang.Object r7 = r5.getTransition()
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r5.getOperation()
            if (r0 == 0) goto L52e
            if (r9 == r8) goto L52c
            if (r9 != r3) goto L52e
        L52c:
            r12 = r14
            goto L52f
        L52e:
            r12 = 0
        L52f:
            if (r7 != 0) goto L537
            if (r12 == 0) goto L534
            goto L537
        L534:
            r12 = r31
            goto L586
        L537:
            android.view.ViewGroup r7 = r33.getContainer()
            boolean r7 = androidx.core.view.ViewCompat.isLaidOut(r7)
            if (r7 != 0) goto L570
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r22)
            if (r7 == 0) goto L56a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r12 = "SpecialEffectsController: Container "
            r7.<init>(r12)
            android.view.ViewGroup r12 = r33.getContainer()
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.String r12 = " has not been laid out. Completing operation "
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            r12 = r31
            android.util.Log.v(r12, r7)
            goto L56c
        L56a:
            r12 = r31
        L56c:
            r5.completeSpecialEffect()
            goto L586
        L570:
            r12 = r31
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.getOperation()
            androidx.fragment.app.Fragment r7 = r7.getFragment()
            androidx.core.os.CancellationSignal r13 = r5.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$9 r15 = new androidx.fragment.app.DefaultSpecialEffectsController$9
            r15.<init>(r6, r5, r9)
            r11.setListenerForTransitionEnd(r7, r1, r13, r15)
        L586:
            r31 = r12
            goto L50b
        L589:
            r12 = r31
            android.view.ViewGroup r3 = r33.getContainer()
            boolean r3 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r3 != 0) goto L596
            return r10
        L596:
            r3 = 4
            androidx.fragment.app.FragmentTransition.setViewVisibility(r2, r3)
            r3 = r30
            java.util.ArrayList r16 = r11.prepareSetNameOverridesReordered(r3)
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r22)
            if (r4 == 0) goto L613
            java.lang.String r4 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r12, r4)
            java.lang.String r4 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r12, r4)
            java.util.Iterator r4 = r32.iterator()
        L5b4:
            boolean r5 = r4.hasNext()
            java.lang.String r7 = " Name: "
            java.lang.String r8 = "View: "
            if (r5 == 0) goto L5e1
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.StringBuilder r8 = r9.append(r5)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r5)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r12, r5)
            goto L5b4
        L5e1:
            java.lang.String r4 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r12, r4)
            java.util.Iterator r4 = r3.iterator()
        L5ea:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L613
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.StringBuilder r9 = r9.append(r5)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r5)
            java.lang.StringBuilder r5 = r9.append(r5)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r12, r5)
            goto L5ea
        L613:
            android.view.ViewGroup r4 = r33.getContainer()
            r11.beginDelayedTransition(r4, r1)
            android.view.ViewGroup r13 = r33.getContainer()
            r12 = r11
            r14 = r32
            r15 = r3
            r17 = r25
            r12.setNameOverridesReordered(r13, r14, r15, r16, r17)
            r1 = 0
            androidx.fragment.app.FragmentTransition.setViewVisibility(r2, r1)
            r1 = r32
            r11.swapSharedElementTargets(r0, r1, r3)
            return r10
    }

    private void syncAnimations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r5) {
            r4 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.SpecialEffectsController$Operation r0 = (androidx.fragment.app.SpecialEffectsController.Operation) r0
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mEnterAnim
            r2.mEnterAnim = r3
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mExitAnim
            r2.mExitAnim = r3
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r2 = r2.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r3 = r0.mAnimationInfo
            int r3 = r3.mPopEnterAnim
            r2.mPopEnterAnim = r3
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r1 = r1.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r2 = r0.mAnimationInfo
            int r2 = r2.mPopExitAnim
            r1.mPopExitAnim = r2
            goto L14
        L51:
            return
    }

    void applyContainerChanges(androidx.fragment.app.SpecialEffectsController.Operation r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r2.getFragment()
            android.view.View r0 = r0.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r2.getFinalState()
            r2.applyState(r0)
            return
    }

    void captureTransitioningViews(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
            if (r1 == 0) goto L17
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L37
            r5.add(r0)
            goto L37
        L17:
            int r6 = r0.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r6) goto L37
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L2b
            r4.captureTransitioningViews(r5, r2)
        L2b:
            int r1 = r1 + 1
            goto L1c
        L2e:
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L37
            r5.add(r6)
        L37:
            return
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r17, boolean r18) {
            r16 = this;
            r6 = r16
            r3 = r18
            java.util.Iterator r0 = r17.iterator()
            r1 = 0
            r7 = r1
            r8 = r7
        Lb:
            boolean r1 = r0.hasNext()
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            android.view.View r2 = r2.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r2)
            int[] r4 = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r1.getFinalState()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r10) goto L40
            if (r4 == r9) goto L40
            r5 = 3
            if (r4 == r5) goto L40
            r5 = 4
            if (r4 == r5) goto L3a
            goto Lb
        L3a:
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r2 == r4) goto Lb
            r8 = r1
            goto Lb
        L40:
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r2 != r4) goto Lb
            if (r7 != 0) goto Lb
            r7 = r1
            goto Lb
        L48:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r9)
            java.lang.String r11 = " to "
            java.lang.String r12 = "FragmentManager"
            if (r0 == 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Executing operations from "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L6c:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = r17
            r14.<init>(r0)
            r16.syncAnimations(r17)
            java.util.Iterator r0 = r17.iterator()
        L84:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            androidx.core.os.CancellationSignal r4 = new androidx.core.os.CancellationSignal
            r4.<init>()
            r2.markStartedSpecialEffect(r4)
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r5.<init>(r2, r4, r3)
            r13.add(r5)
            androidx.core.os.CancellationSignal r4 = new androidx.core.os.CancellationSignal
            r4.<init>()
            r2.markStartedSpecialEffect(r4)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r15 = 0
            if (r3 == 0) goto Lb0
            if (r2 != r7) goto Lb3
            goto Lb2
        Lb0:
            if (r2 != r8) goto Lb3
        Lb2:
            r15 = r10
        Lb3:
            r5.<init>(r2, r4, r3, r15)
            r1.add(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$1 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$1
            r4.<init>(r6, r14, r2)
            r2.addCompletionListener(r4)
            goto L84
        Lc2:
            r0 = r16
            r2 = r14
            r3 = r18
            r4 = r7
            r5 = r8
            java.util.Map r0 = r0.startTransitions(r1, r2, r3, r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            boolean r1 = r0.containsValue(r1)
            r6.startAnimations(r13, r14, r1, r0)
            java.util.Iterator r0 = r14.iterator()
        Ldc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lec
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            r6.applyContainerChanges(r1)
            goto Ldc
        Lec:
            r14.clear()
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r9)
            if (r0 == 0) goto L10f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Completed executing operations from "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L10f:
            return
    }

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> r5, android.view.View r6) {
            r4 = this;
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r0 == 0) goto L9
            r5.put(r0, r6)
        L9:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L26
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L23
            r4.findNamedViews(r5, r2)
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return
    }

    void retainMatchingViews(androidx.collection.ArrayMap<java.lang.String, android.view.View> r2, java.util.Collection<java.lang.String> r3) {
            r1 = this;
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L8
            r2.remove()
            goto L8
        L28:
            return
    }
}
