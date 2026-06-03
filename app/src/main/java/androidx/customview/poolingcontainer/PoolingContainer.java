package androidx.customview.poolingcontainer;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\n\u0010\u0013\u001a\u00020\u0010*\u00020\u0006\u001a\n\u0010\u0014\u001a\u00020\u0010*\u00020\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\u0005\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"IsPoolingContainerTag", "", "PoolingContainerListenerHolderTag", "value", "", "isPoolingContainer", "Landroid/view/View;", "(Landroid/view/View;)Z", "setPoolingContainer", "(Landroid/view/View;Z)V", "isWithinPoolingContainer", "poolingContainerListenerHolder", "Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "getPoolingContainerListenerHolder", "(Landroid/view/View;)Landroidx/customview/poolingcontainer/PoolingContainerListenerHolder;", "addPoolingContainerListener", "", "listener", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", "callPoolingContainerOnRelease", "callPoolingContainerOnReleaseForChildren", "Landroid/view/ViewGroup;", "removePoolingContainerListener", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PoolingContainer {
    private static final int IsPoolingContainerTag = 0;
    private static final int PoolingContainerListenerHolderTag = 0;

    static {
            int r0 = androidx.customview.poolingcontainer.R.id.pooling_container_listener_holder_tag
            androidx.customview.poolingcontainer.PoolingContainer.PoolingContainerListenerHolderTag = r0
            int r0 = androidx.customview.poolingcontainer.R.id.is_pooling_container_tag
            androidx.customview.poolingcontainer.PoolingContainer.IsPoolingContainerTag = r0
            return
    }

    public static final void addPoolingContainerListener(android.view.View r1, androidx.customview.poolingcontainer.PoolingContainerListener r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r1 = getPoolingContainerListenerHolder(r1)
            r1.addListener(r2)
            return
    }

    public static final void callPoolingContainerOnRelease(android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.Sequence r1 = androidx.core.view.ViewKt.getAllViews(r1)
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r0 = getPoolingContainerListenerHolder(r0)
            r0.onRelease()
            goto Ld
        L21:
            return
    }

    public static final void callPoolingContainerOnReleaseForChildren(android.view.ViewGroup r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.sequences.Sequence r1 = androidx.core.view.ViewGroupKt.getChildren(r1)
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r0 = getPoolingContainerListenerHolder(r0)
            r0.onRelease()
            goto Ld
        L21:
            return
    }

    private static final androidx.customview.poolingcontainer.PoolingContainerListenerHolder getPoolingContainerListenerHolder(android.view.View r2) {
            int r0 = androidx.customview.poolingcontainer.PoolingContainer.PoolingContainerListenerHolderTag
            java.lang.Object r1 = r2.getTag(r0)
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r1 = (androidx.customview.poolingcontainer.PoolingContainerListenerHolder) r1
            if (r1 != 0) goto L12
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r1 = new androidx.customview.poolingcontainer.PoolingContainerListenerHolder
            r1.<init>()
            r2.setTag(r0, r1)
        L12:
            return r1
    }

    public static final boolean isPoolingContainer(android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = androidx.customview.poolingcontainer.PoolingContainer.IsPoolingContainerTag
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L12
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L1a
            boolean r1 = r1.booleanValue()
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    public static final boolean isWithinPoolingContainer(android.view.View r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.sequences.Sequence r2 = androidx.core.view.ViewKt.getAncestors(r2)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Ld
            android.view.View r0 = (android.view.View) r0
            boolean r0 = isPoolingContainer(r0)
            if (r0 == 0) goto Ld
            r2 = 1
            return r2
        L27:
            r2 = 0
            return r2
    }

    public static final void removePoolingContainerListener(android.view.View r1, androidx.customview.poolingcontainer.PoolingContainerListener r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r1 = getPoolingContainerListenerHolder(r1)
            r1.removeListener(r2)
            return
    }

    public static final void setPoolingContainer(android.view.View r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = androidx.customview.poolingcontainer.PoolingContainer.IsPoolingContainerTag
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setTag(r0, r2)
            return
    }
}
