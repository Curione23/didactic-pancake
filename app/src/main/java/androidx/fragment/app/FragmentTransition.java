package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentTransition {
    static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = null;
    static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = null;

    static {
            androidx.fragment.app.FragmentTransitionCompat21 r0 = new androidx.fragment.app.FragmentTransitionCompat21
            r0.<init>()
            androidx.fragment.app.FragmentTransition.PLATFORM_IMPL = r0
            androidx.fragment.app.FragmentTransitionImpl r0 = resolveSupportImpl()
            androidx.fragment.app.FragmentTransition.SUPPORT_IMPL = r0
            return
    }

    private FragmentTransition() {
            r0 = this;
            r0.<init>()
            return
    }

    static void callSharedElementStartEnd(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, boolean r5, androidx.collection.ArrayMap<java.lang.String, android.view.View> r6, boolean r7) {
            if (r5 == 0) goto L7
            androidx.core.app.SharedElementCallback r3 = r4.getEnterTransitionCallback()
            goto Lb
        L7:
            androidx.core.app.SharedElementCallback r3 = r3.getEnterTransitionCallback()
        Lb:
            if (r3 == 0) goto L41
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            if (r6 != 0) goto L1c
            r1 = r0
            goto L20
        L1c:
            int r1 = r6.size()
        L20:
            if (r0 >= r1) goto L37
            java.lang.Object r2 = r6.keyAt(r0)
            java.lang.String r2 = (java.lang.String) r2
            r5.add(r2)
            java.lang.Object r2 = r6.valueAt(r0)
            android.view.View r2 = (android.view.View) r2
            r4.add(r2)
            int r0 = r0 + 1
            goto L20
        L37:
            r6 = 0
            if (r7 == 0) goto L3e
            r3.onSharedElementStart(r5, r4, r6)
            goto L41
        L3e:
            r3.onSharedElementEnd(r5, r4, r6)
        L41:
            return
    }

    static java.lang.String findKeyForValue(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r3, java.lang.String r4) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            java.lang.Object r2 = r3.valueAt(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L18
            java.lang.Object r3 = r3.keyAt(r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r3 = 0
            return r3
    }

    private static androidx.fragment.app.FragmentTransitionImpl resolveSupportImpl() {
            java.lang.String r0 = "androidx.transition.FragmentTransitionSupport"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L16
            androidx.fragment.app.FragmentTransitionImpl r0 = (androidx.fragment.app.FragmentTransitionImpl) r0     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }

    static void retainValues(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r2, androidx.collection.ArrayMap<java.lang.String, android.view.View> r3) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.valueAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.containsKey(r1)
            if (r1 != 0) goto L17
            r2.removeAt(r0)
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    static void setViewVisibility(java.util.ArrayList<android.view.View> r2, int r3) {
            if (r2 != 0) goto L3
            return
        L3:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L9:
            if (r0 < 0) goto L17
            java.lang.Object r1 = r2.get(r0)
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            int r0 = r0 + (-1)
            goto L9
        L17:
            return
    }

    static boolean supportsTransition() {
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r0 != 0) goto Lb
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }
}
