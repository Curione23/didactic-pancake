package androidx.activity;

/* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeFullyDrawnReporterOwner", "Landroidx/activity/FullyDrawnReporterOwner;", "Landroid/view/View;", "get", "setViewTreeFullyDrawnReporterOwner", "", "fullyDrawnReporterOwner", "set", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeFullyDrawnReporterOwner {
    public static final androidx.activity.FullyDrawnReporterOwner get(android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 r0 = androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.generateSequence(r1, r0)
            androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 r0 = androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.mapNotNull(r1, r0)
            java.lang.Object r1 = kotlin.sequences.SequencesKt.firstOrNull(r1)
            androidx.activity.FullyDrawnReporterOwner r1 = (androidx.activity.FullyDrawnReporterOwner) r1
            return r1
    }

    public static final void set(android.view.View r1, androidx.activity.FullyDrawnReporterOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "fullyDrawnReporterOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = androidx.activity.R.id.report_drawn
            r1.setTag(r0, r2)
            return
    }
}
