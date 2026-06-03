package androidx.activity.result;

/* JADX INFO: compiled from: IntentSenderRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "intentSender", "Landroid/content/IntentSender;", "fillInIntent", "Landroid/content/Intent;", "flagsMask", "", "flagsValues", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "getFillInIntent", "()Landroid/content/Intent;", "getFlagsMask", "()I", "getFlagsValues", "getIntentSender", "()Landroid/content/IntentSender;", "describeContents", "writeToParcel", "", "dest", "flags", "Builder", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntentSenderRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest> CREATOR = null;
    public static final androidx.activity.result.IntentSenderRequest.Companion Companion = null;
    private final android.content.Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;
    private final android.content.IntentSender intentSender;

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder;", "", "pendingIntent", "Landroid/app/PendingIntent;", "(Landroid/app/PendingIntent;)V", "intentSender", "Landroid/content/IntentSender;", "(Landroid/content/IntentSender;)V", "fillInIntent", "Landroid/content/Intent;", "flagsMask", "", "flagsValues", "build", "Landroidx/activity/result/IntentSenderRequest;", "setFillInIntent", "setFlags", "values", "mask", "Flag", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private android.content.Intent fillInIntent;
        private int flagsMask;
        private int flagsValues;
        private final android.content.IntentSender intentSender;

        /* JADX INFO: compiled from: IntentSenderRequest.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder$Flag;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
        private @interface Flag {
        }

        public Builder(android.app.PendingIntent r2) {
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                r1.<init>(r2)
                return
        }

        public Builder(android.content.IntentSender r2) {
                r1 = this;
                java.lang.String r0 = "intentSender"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.intentSender = r2
                return
        }

        public final androidx.activity.result.IntentSenderRequest build() {
                r5 = this;
                androidx.activity.result.IntentSenderRequest r0 = new androidx.activity.result.IntentSenderRequest
                android.content.IntentSender r1 = r5.intentSender
                android.content.Intent r2 = r5.fillInIntent
                int r3 = r5.flagsMask
                int r4 = r5.flagsValues
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public final androidx.activity.result.IntentSenderRequest.Builder setFillInIntent(android.content.Intent r1) {
                r0 = this;
                r0.fillInIntent = r1
                return r0
        }

        public final androidx.activity.result.IntentSenderRequest.Builder setFlags(int r1, int r2) {
                r0 = this;
                r0.flagsValues = r1
                r0.flagsMask = r2
                return r0
        }
    }

    /* JADX INFO: compiled from: IntentSenderRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "getCREATOR$annotations", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ void getCREATOR$annotations() {
                return
        }
    }

    static {
            androidx.activity.result.IntentSenderRequest$Companion r0 = new androidx.activity.result.IntentSenderRequest$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.result.IntentSenderRequest.Companion = r0
            androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1 r0 = new androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
            r0.<init>()
            android.os.Parcelable$Creator r0 = (android.os.Parcelable.Creator) r0
            androidx.activity.result.IntentSenderRequest.CREATOR = r0
            return
    }

    public IntentSenderRequest(android.content.IntentSender r2, android.content.Intent r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "intentSender"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.intentSender = r2
            r1.fillInIntent = r3
            r1.flagsMask = r4
            r1.flagsValues = r5
            return
    }

    public /* synthetic */ IntentSenderRequest(android.content.IntentSender r2, android.content.Intent r3, int r4, int r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public IntentSenderRequest(android.os.Parcel r4) {
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
    }

    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final android.content.Intent getFillInIntent() {
            r1 = this;
            android.content.Intent r0 = r1.fillInIntent
            return r0
    }

    public final int getFlagsMask() {
            r1 = this;
            int r0 = r1.flagsMask
            return r0
    }

    public final int getFlagsValues() {
            r1 = this;
            int r0 = r1.flagsValues
            return r0
    }

    public final android.content.IntentSender getIntentSender() {
            r1 = this;
            android.content.IntentSender r0 = r1.intentSender
            return r0
    }

    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r0 = "dest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.content.IntentSender r0 = r1.intentSender
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r2.writeParcelable(r0, r3)
            android.content.Intent r0 = r1.fillInIntent
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r2.writeParcelable(r0, r3)
            int r3 = r1.flagsMask
            r2.writeInt(r3)
            int r3 = r1.flagsValues
            r2.writeInt(r3)
            return
    }
}
