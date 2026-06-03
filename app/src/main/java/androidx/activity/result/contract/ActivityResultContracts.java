package androidx.activity.result.contract;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0014"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts;", "", "()V", "CaptureVideo", "CreateDocument", "GetContent", "GetMultipleContents", "OpenDocument", "OpenDocumentTree", "OpenMultipleDocuments", "PickContact", "PickMultipleVisualMedia", "PickVisualMedia", "RequestMultiplePermissions", "RequestPermission", "StartActivityForResult", "StartIntentSenderForResult", "TakePicture", "TakePicturePreview", "TakeVideo", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultContracts {

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001d\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CaptureVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class CaptureVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        public CaptureVideo() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
                r2.<init>(r0)
                java.lang.String r0 = "output"
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007\b\u0017¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0017J \u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "()V", "mimeType", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class CreateDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        private final java.lang.String mimeType;

        @kotlin.Deprecated(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @kotlin.ReplaceWith(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public CreateDocument() {
                r1 = this;
                java.lang.String r0 = "*/*"
                r1.<init>(r0)
                return
        }

        public CreateDocument(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mimeType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.mimeType = r2
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.CREATE_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = r1.mimeType
                android.content.Intent r2 = r2.setType(r0)
                java.lang.String r0 = "android.intent.extra.TITLE"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Lc
                android.net.Uri r1 = r4.getData()
            Lc:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetContent;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class GetContent extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, android.net.Uri> {
        public GetContent() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.GET_CONTENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.category.OPENABLE"
                android.content.Intent r2 = r2.addCategory(r0)
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "Intent(Intent.ACTION_GET…          .setType(input)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Lc
                android.net.Uri r1 = r4.getData()
            Lc:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00122\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0017J$\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\b¨\u0006\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class GetMultipleContents extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.util.List<android.net.Uri>> {
        public static final androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion Companion = null;

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "()V", "getClipDataUris", "", "Landroid/net/Uri;", "Landroid/content/Intent;", "getClipDataUris$activity_release", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

            public final java.util.List<android.net.Uri> getClipDataUris$activity_release(android.content.Intent r5) {
                    r4 = this;
                    java.lang.String r0 = "<this>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                    java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                    r0.<init>()
                    android.net.Uri r1 = r5.getData()
                    if (r1 == 0) goto L13
                    r0.add(r1)
                L13:
                    android.content.ClipData r5 = r5.getClipData()
                    if (r5 != 0) goto L24
                    boolean r1 = r0.isEmpty()
                    if (r1 == 0) goto L24
                    java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
                    return r5
                L24:
                    if (r5 == 0) goto L3d
                    int r1 = r5.getItemCount()
                    r2 = 0
                L2b:
                    if (r2 >= r1) goto L3d
                    android.content.ClipData$Item r3 = r5.getItemAt(r2)
                    android.net.Uri r3 = r3.getUri()
                    if (r3 == 0) goto L3a
                    r0.add(r3)
                L3a:
                    int r2 = r2 + 1
                    goto L2b
                L3d:
                    java.util.ArrayList r5 = new java.util.ArrayList
                    java.util.Collection r0 = (java.util.Collection) r0
                    r5.<init>(r0)
                    java.util.List r5 = (java.util.List) r5
                    return r5
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion = r0
                return
        }

        public GetMultipleContents() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.GET_CONTENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.category.OPENABLE"
                android.content.Intent r2 = r2.addCategory(r0)
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                android.content.Intent r2 = r2.putExtra(r3, r0)
                java.lang.String r3 = "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.List r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r2, android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L4
                goto L5
            L4:
                r3 = 0
            L5:
                if (r3 == 0) goto L10
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r2 = r2.getClipDataUris$activity_release(r3)
                if (r2 == 0) goto L10
                goto L14
            L10:
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L14:
                return r2
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¨\u0006\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class OpenDocument extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], android.net.Uri> {
        public OpenDocument() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "*/*"
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Lc
                android.net.Uri r1 = r4.getData()
            Lc:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class OpenDocumentTree extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.net.Uri> {
        public OpenDocumentTree() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT_TREE"
                r2.<init>(r0)
                if (r3 == 0) goto L15
                java.lang.String r0 = "android.provider.extra.INITIAL_URI"
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                r2.putExtra(r0, r3)
            L15:
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                java.lang.String r2 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                r1 = 0
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Lc
                android.net.Uri r1 = r4.getData()
            Lc:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t¨\u0006\u0015"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class OpenMultipleDocuments extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.List<android.net.Uri>> {
        public OpenMultipleDocuments() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
                r2.<init>(r0)
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                android.content.Intent r2 = r2.putExtra(r3, r0)
                java.lang.String r3 = "*/*"
                android.content.Intent r2 = r2.setType(r3)
                java.lang.String r3 = "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.List r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r2, android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L4
                goto L5
            L4:
                r3 = 0
            L5:
                if (r3 == 0) goto L10
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r2 = r2.getClipDataUris$activity_release(r3)
                if (r2 == 0) goto L10
                goto L14
            L10:
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L14:
                return r2
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickContact;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PickContact extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.net.Uri> {
        public PickContact() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.String r2 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "android.intent.action.PICK"
                r1.<init>(r2)
                java.lang.String r2 = "vnd.android.cursor.dir/contact"
                android.content.Intent r1 = r1.setType(r2)
                java.lang.String r2 = "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public android.net.Uri parseResult(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto Lc
                android.net.Uri r1 = r4.getData()
            Lc:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00132\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0013B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0017J)\u0010\u000e\u001a\u0015\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "maxItems", "", "(I)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "intent", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class PickMultipleVisualMedia extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.PickVisualMediaRequest, java.util.List<android.net.Uri>> {
        public static final androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion Companion = null;
        private final int maxItems;

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;", "", "()V", "getMaxItems", "", "getMaxItems$activity_release", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

            public final int getMaxItems$activity_release() {
                    r1 = this;
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                    boolean r0 = r0.isSystemPickerAvailable$activity_release()
                    if (r0 == 0) goto Ld
                    int r0 = android.provider.MediaStore.getPickImagesMaxLimit()
                    goto L10
                Ld:
                    r0 = 2147483647(0x7fffffff, float:NaN)
                L10:
                    return r0
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion = r0
                return
        }

        public PickMultipleVisualMedia() {
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r1)
                return
        }

        public PickMultipleVisualMedia(int r2) {
                r1 = this;
                r1.<init>()
                r1.maxItems = r2
                r0 = 1
                if (r2 <= r0) goto L9
                return
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Max items must be higher than 1"
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        public /* synthetic */ PickMultipleVisualMedia(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto La
                androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia$Companion r1 = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion
                int r1 = r1.getMaxItems$activity_release()
            La:
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, androidx.activity.result.PickVisualMediaRequest r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemPickerAvailable$activity_release()
                if (r0 == 0) goto L43
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "android.provider.action.PICK_IMAGES"
                r4.<init>(r0)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r5.getMediaType()
                java.lang.String r5 = r0.getVisualMimeType$activity_release(r5)
                r4.setType(r5)
                int r5 = r3.maxItems
                int r0 = android.provider.MediaStore.getPickImagesMaxLimit()
                if (r5 > r0) goto L37
                java.lang.String r5 = "android.provider.extra.PICK_IMAGES_MAX"
                int r0 = r3.maxItems
                r4.putExtra(r5, r0)
                goto Lf0
            L37:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Max items must be less or equals MediaStore.getPickImagesMaxLimit()"
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            L43:
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemFallbackPickerAvailable$activity_release(r4)
                java.lang.String r1 = "Required value was null."
                java.lang.String r2 = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX"
                if (r0 == 0) goto L87
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r4 = r0.getSystemFallbackPicker$activity_release(r4)
                if (r4 == 0) goto L7d
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
                r0.<init>(r1)
                android.content.pm.ApplicationInfo r1 = r4.applicationInfo
                java.lang.String r1 = r1.packageName
                java.lang.String r4 = r4.name
                r0.setClassName(r1, r4)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r4 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r5.getMediaType()
                java.lang.String r4 = r4.getVisualMimeType$activity_release(r5)
                r0.setType(r4)
                int r4 = r3.maxItems
                r0.putExtra(r2, r4)
                r4 = r0
                goto Lf0
            L7d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r1.toString()
                r4.<init>(r5)
                throw r4
            L87:
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isGmsPickerAvailable$activity_release(r4)
                if (r0 == 0) goto Lba
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r5 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r4 = r5.getGmsPicker$activity_release(r4)
                if (r4 == 0) goto Lb0
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r0 = "com.google.android.gms.provider.action.PICK_IMAGES"
                r5.<init>(r0)
                android.content.pm.ApplicationInfo r0 = r4.applicationInfo
                java.lang.String r0 = r0.packageName
                java.lang.String r4 = r4.name
                r5.setClassName(r0, r4)
                int r4 = r3.maxItems
                r5.putExtra(r2, r4)
                r4 = r5
                goto Lf0
            Lb0:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r1.toString()
                r4.<init>(r5)
                throw r4
            Lba:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
                r4.<init>(r0)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r5.getMediaType()
                java.lang.String r5 = r0.getVisualMimeType$activity_release(r5)
                r4.setType(r5)
                java.lang.String r5 = "android.intent.extra.ALLOW_MULTIPLE"
                r0 = 1
                r4.putExtra(r5, r0)
                java.lang.String r5 = r4.getType()
                if (r5 != 0) goto Lf0
                java.lang.String r5 = "*/*"
                r4.setType(r5)
                r5 = 2
                java.lang.String[] r5 = new java.lang.String[r5]
                r1 = 0
                java.lang.String r2 = "image/*"
                r5[r1] = r2
                java.lang.String r1 = "video/*"
                r5[r0] = r1
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                r4.putExtra(r0, r5)
            Lf0:
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.PickVisualMediaRequest r2) {
                r0 = this;
                androidx.activity.result.PickVisualMediaRequest r2 = (androidx.activity.result.PickVisualMediaRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult2(android.content.Context r2, androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.List<android.net.Uri>> getSynchronousResult(android.content.Context r1, androidx.activity.result.PickVisualMediaRequest r2) {
                r0 = this;
                androidx.activity.result.PickVisualMediaRequest r2 = (androidx.activity.result.PickVisualMediaRequest) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.List<android.net.Uri> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.List r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: parseResult, reason: avoid collision after fix types in other method */
        public final java.util.List<android.net.Uri> parseResult2(int r2, android.content.Intent r3) {
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L4
                goto L5
            L4:
                r3 = 0
            L5:
                if (r3 == 0) goto L10
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r2 = r2.getClipDataUris$activity_release(r3)
                if (r2 == 0) goto L10
                goto L14
            L10:
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L14:
                return r2
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u0000 \u00102\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "ImageAndVideo", "ImageOnly", "SingleMimeType", "VideoOnly", "VisualMediaType", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class PickVisualMedia extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.PickVisualMediaRequest, android.net.Uri> {
        public static final java.lang.String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";
        public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion Companion = null;
        public static final java.lang.String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final java.lang.String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final java.lang.String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0016H\u0007J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0007J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0014\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$Companion;", "", "()V", "ACTION_SYSTEM_FALLBACK_PICK_IMAGES", "", "getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX", "getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations", "GMS_ACTION_PICK_IMAGES", "GMS_EXTRA_PICK_IMAGES_MAX", "getGmsPicker", "Landroid/content/pm/ResolveInfo;", "context", "Landroid/content/Context;", "getGmsPicker$activity_release", "getSystemFallbackPicker", "getSystemFallbackPicker$activity_release", "getVisualMimeType", "input", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getVisualMimeType$activity_release", "isGmsPickerAvailable", "", "isGmsPickerAvailable$activity_release", "isPhotoPickerAvailable", "isSystemFallbackPickerAvailable", "isSystemFallbackPickerAvailable$activity_release", "isSystemPickerAvailable", "isSystemPickerAvailable$activity_release", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
                    return
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
                    return
            }

            @kotlin.jvm.JvmStatic
            public final android.content.pm.ResolveInfo getGmsPicker$activity_release(android.content.Context r3) {
                    r2 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    android.content.pm.PackageManager r3 = r3.getPackageManager()
                    android.content.Intent r0 = new android.content.Intent
                    java.lang.String r1 = "com.google.android.gms.provider.action.PICK_IMAGES"
                    r0.<init>(r1)
                    r1 = 1114112(0x110000, float:1.561203E-39)
                    android.content.pm.ResolveInfo r3 = r3.resolveActivity(r0, r1)
                    return r3
            }

            @kotlin.jvm.JvmStatic
            public final android.content.pm.ResolveInfo getSystemFallbackPicker$activity_release(android.content.Context r3) {
                    r2 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    android.content.pm.PackageManager r3 = r3.getPackageManager()
                    android.content.Intent r0 = new android.content.Intent
                    java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
                    r0.<init>(r1)
                    r1 = 1114112(0x110000, float:1.561203E-39)
                    android.content.pm.ResolveInfo r3 = r3.resolveActivity(r0, r1)
                    return r3
            }

            public final java.lang.String getVisualMimeType$activity_release(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
                    r1 = this;
                    java.lang.String r0 = "input"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly
                    if (r0 == 0) goto Lc
                    java.lang.String r2 = "image/*"
                    goto L23
                Lc:
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly
                    if (r0 == 0) goto L13
                    java.lang.String r2 = "video/*"
                    goto L23
                L13:
                    boolean r0 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.SingleMimeType
                    if (r0 == 0) goto L1e
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$SingleMimeType r2 = (androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.SingleMimeType) r2
                    java.lang.String r2 = r2.getMimeType()
                    goto L23
                L1e:
                    boolean r2 = r2 instanceof androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo
                    if (r2 == 0) goto L24
                    r2 = 0
                L23:
                    return r2
                L24:
                    kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                    r2.<init>()
                    throw r2
            }

            @kotlin.jvm.JvmStatic
            public final boolean isGmsPickerAvailable$activity_release(android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    android.content.pm.ResolveInfo r2 = r1.getGmsPicker$activity_release(r2)
                    if (r2 == 0) goto Ld
                    r2 = 1
                    goto Le
                Ld:
                    r2 = 0
                Le:
                    return r2
            }

            @kotlin.Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @kotlin.jvm.JvmStatic
            public final boolean isPhotoPickerAvailable() {
                    r1 = this;
                    boolean r0 = r1.isSystemPickerAvailable$activity_release()
                    return r0
            }

            @kotlin.jvm.JvmStatic
            public final boolean isPhotoPickerAvailable(android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    boolean r0 = r1.isSystemPickerAvailable$activity_release()
                    if (r0 != 0) goto L1a
                    boolean r0 = r1.isSystemFallbackPickerAvailable$activity_release(r2)
                    if (r0 != 0) goto L1a
                    boolean r2 = r1.isGmsPickerAvailable$activity_release(r2)
                    if (r2 == 0) goto L18
                    goto L1a
                L18:
                    r2 = 0
                    goto L1b
                L1a:
                    r2 = 1
                L1b:
                    return r2
            }

            @kotlin.jvm.JvmStatic
            public final boolean isSystemFallbackPickerAvailable$activity_release(android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    android.content.pm.ResolveInfo r2 = r1.getSystemFallbackPicker$activity_release(r2)
                    if (r2 == 0) goto Ld
                    r2 = 1
                    goto Le
                Ld:
                    r2 = 0
                Le:
                    return r2
            }

            @kotlin.jvm.JvmStatic
            public final boolean isSystemPickerAvailable$activity_release() {
                    r4 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 33
                    r2 = 1
                    if (r0 < r1) goto L8
                    goto L18
                L8:
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 0
                    r3 = 30
                    if (r0 < r3) goto L17
                    int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r3)
                    r3 = 2
                    if (r0 < r3) goto L17
                    goto L18
                L17:
                    r2 = r1
                L18:
                    return r2
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ImageAndVideo implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE = r0
                    return
            }

            private ImageAndVideo() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ImageOnly implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageOnly r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageOnly
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE = r0
                    return
            }

            private ImageOnly() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mimeType", "", "(Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class SingleMimeType implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            private final java.lang.String mimeType;

            public SingleMimeType(java.lang.String r2) {
                    r1 = this;
                    java.lang.String r0 = "mimeType"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    r1.<init>()
                    r1.mimeType = r2
                    return
            }

            public final java.lang.String getMimeType() {
                    r1 = this;
                    java.lang.String r0 = r1.mimeType
                    return r0
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class VideoOnly implements androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType {
            public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly INSTANCE = null;

            static {
                    androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VideoOnly r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VideoOnly
                    r0.<init>()
                    androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE = r0
                    return
            }

            private VideoOnly() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface VisualMediaType {
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion = r0
                return
        }

        public PickVisualMedia() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public static final android.content.pm.ResolveInfo getGmsPicker$activity_release(android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r1 = r0.getGmsPicker$activity_release(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public static final android.content.pm.ResolveInfo getSystemFallbackPicker$activity_release(android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                android.content.pm.ResolveInfo r1 = r0.getSystemFallbackPicker$activity_release(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isGmsPickerAvailable$activity_release(android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isGmsPickerAvailable$activity_release(r1)
                return r1
        }

        @kotlin.Deprecated(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.ReplaceWith(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @kotlin.jvm.JvmStatic
        public static final boolean isPhotoPickerAvailable() {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isPhotoPickerAvailable()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isPhotoPickerAvailable(android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isPhotoPickerAvailable(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isSystemFallbackPickerAvailable$activity_release(android.content.Context r1) {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isSystemFallbackPickerAvailable$activity_release(r1)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isSystemPickerAvailable$activity_release() {
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r0 = r0.isSystemPickerAvailable$activity_release()
                return r0
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, androidx.activity.result.PickVisualMediaRequest r5) {
                r3 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$Companion r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion
                boolean r1 = r0.isSystemPickerAvailable$activity_release()
                if (r1 == 0) goto L26
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r1 = "android.provider.action.PICK_IMAGES"
                r4.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r5.getMediaType()
                java.lang.String r5 = r0.getVisualMimeType$activity_release(r5)
                r4.setType(r5)
                goto Lc0
            L26:
                boolean r1 = r0.isSystemFallbackPickerAvailable$activity_release(r4)
                java.lang.String r2 = "Required value was null."
                if (r1 == 0) goto L5d
                android.content.pm.ResolveInfo r4 = r0.getSystemFallbackPicker$activity_release(r4)
                if (r4 == 0) goto L53
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "androidx.activity.result.contract.action.PICK_IMAGES"
                r1.<init>(r2)
                android.content.pm.ApplicationInfo r2 = r4.applicationInfo
                java.lang.String r2 = r2.packageName
                java.lang.String r4 = r4.name
                r1.setClassName(r2, r4)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r4 = r5.getMediaType()
                java.lang.String r4 = r0.getVisualMimeType$activity_release(r4)
                r1.setType(r4)
            L51:
                r4 = r1
                goto Lc0
            L53:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r2.toString()
                r4.<init>(r5)
                throw r4
            L5d:
                boolean r1 = r0.isGmsPickerAvailable$activity_release(r4)
                if (r1 == 0) goto L91
                android.content.pm.ResolveInfo r4 = r0.getGmsPicker$activity_release(r4)
                if (r4 == 0) goto L87
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "com.google.android.gms.provider.action.PICK_IMAGES"
                r1.<init>(r2)
                android.content.pm.ApplicationInfo r2 = r4.applicationInfo
                java.lang.String r2 = r2.packageName
                java.lang.String r4 = r4.name
                r1.setClassName(r2, r4)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r4 = r5.getMediaType()
                java.lang.String r4 = r0.getVisualMimeType$activity_release(r4)
                r1.setType(r4)
                goto L51
            L87:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r2.toString()
                r4.<init>(r5)
                throw r4
            L91:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.OPEN_DOCUMENT"
                r4.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r5 = r5.getMediaType()
                java.lang.String r5 = r0.getVisualMimeType$activity_release(r5)
                r4.setType(r5)
                java.lang.String r5 = r4.getType()
                if (r5 != 0) goto Lc0
                java.lang.String r5 = "*/*"
                r4.setType(r5)
                r5 = 2
                java.lang.String[] r5 = new java.lang.String[r5]
                r0 = 0
                java.lang.String r1 = "image/*"
                r5[r0] = r1
                r0 = 1
                java.lang.String r1 = "video/*"
                r5[r0] = r1
                java.lang.String r0 = "android.intent.extra.MIME_TYPES"
                r4.putExtra(r0, r5)
            Lc0:
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.PickVisualMediaRequest r2) {
                r0 = this;
                androidx.activity.result.PickVisualMediaRequest r2 = (androidx.activity.result.PickVisualMediaRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult2(android.content.Context r2, androidx.activity.result.PickVisualMediaRequest r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.net.Uri> getSynchronousResult(android.content.Context r1, androidx.activity.result.PickVisualMediaRequest r2) {
                r0 = this;
                androidx.activity.result.PickVisualMediaRequest r2 = (androidx.activity.result.PickVisualMediaRequest) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.net.Uri parseResult(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto L1b
                android.net.Uri r3 = r4.getData()
                if (r3 != 0) goto L1a
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r3 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.Companion
                java.util.List r3 = r3.getClipDataUris$activity_release(r4)
                java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
                android.net.Uri r3 = (android.net.Uri) r3
            L1a:
                r1 = r3
            L1b:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.net.Uri parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.net.Uri r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00152%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0002\u0010\rJ7\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestMultiplePermissions extends androidx.activity.result.contract.ActivityResultContract<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> {
        public static final java.lang.String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion Companion = null;
        public static final java.lang.String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final java.lang.String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "()V", "ACTION_REQUEST_PERMISSIONS", "", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "createIntent", "Landroid/content/Intent;", "input", "", "createIntent$activity_release", "([Ljava/lang/String;)Landroid/content/Intent;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

            public final android.content.Intent createIntent$activity_release(java.lang.String[] r3) {
                    r2 = this;
                    java.lang.String r0 = "input"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    android.content.Intent r0 = new android.content.Intent
                    java.lang.String r1 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
                    r0.<init>(r1)
                    java.lang.String r1 = "androidx.activity.result.contract.extra.PERMISSIONS"
                    android.content.Intent r3 = r0.putExtra(r1, r3)
                    java.lang.String r0 = "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
                    return r3
            }
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion = r0
                return
        }

        public RequestMultiplePermissions() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion
                android.content.Intent r2 = r2.createIntent$activity_release(r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult(android.content.Context r1, java.lang.String[] r2) {
                r0 = this;
                java.lang.String[] r2 = (java.lang.String[]) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.util.Map<java.lang.String, java.lang.Boolean>> getSynchronousResult2(android.content.Context r5, java.lang.String[] r6) {
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r6.length
                if (r0 != 0) goto L17
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r5 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
                r5.<init>(r6)
                return r5
            L17:
                int r0 = r6.length
                r1 = 0
                r2 = r1
            L1a:
                if (r2 >= r0) goto L29
                r3 = r6[r2]
                int r3 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r3)
                if (r3 != 0) goto L27
                int r2 = r2 + 1
                goto L1a
            L27:
                r5 = 0
                goto L5c
            L29:
                int r5 = r6.length
                int r5 = kotlin.collections.MapsKt.mapCapacity(r5)
                r0 = 16
                int r5 = kotlin.ranges.RangesKt.coerceAtLeast(r5, r0)
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>(r5)
                java.util.Map r0 = (java.util.Map) r0
                int r5 = r6.length
            L3c:
                if (r1 >= r5) goto L57
                r2 = r6[r1]
                r3 = 1
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
                java.lang.Object r3 = r2.getFirst()
                java.lang.Object r2 = r2.getSecond()
                r0.put(r3, r2)
                int r1 = r1 + 1
                goto L3c
            L57:
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r5 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                r5.<init>(r0)
            L5c:
                return r5
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.util.Map<java.lang.String, java.lang.Boolean> parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.util.Map r1 = r0.parseResult2(r1, r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: parseResult, reason: avoid collision after fix types in other method */
        public java.util.Map<java.lang.String, java.lang.Boolean> parseResult2(int r6, android.content.Intent r7) {
                r5 = this;
                r0 = -1
                if (r6 == r0) goto L8
                java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
                return r6
            L8:
                if (r7 != 0) goto Lf
                java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
                return r6
            Lf:
                java.lang.String r6 = "androidx.activity.result.contract.extra.PERMISSIONS"
                java.lang.String[] r6 = r7.getStringArrayExtra(r6)
                java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r7 = r7.getIntArrayExtra(r0)
                if (r7 == 0) goto L53
                if (r6 != 0) goto L20
                goto L53
            L20:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r7.length
                r0.<init>(r1)
                java.util.Collection r0 = (java.util.Collection) r0
                int r1 = r7.length
                r2 = 0
                r3 = r2
            L2b:
                if (r3 >= r1) goto L3e
                r4 = r7[r3]
                if (r4 != 0) goto L33
                r4 = 1
                goto L34
            L33:
                r4 = r2
            L34:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r0.add(r4)
                int r3 = r3 + 1
                goto L2b
            L3e:
                java.util.List r0 = (java.util.List) r0
                java.util.List r6 = kotlin.collections.ArraysKt.filterNotNull(r6)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r6 = kotlin.collections.CollectionsKt.zip(r6, r0)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Map r6 = kotlin.collections.MapsKt.toMap(r6)
                return r6
            L53:
                java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
                return r6
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J \u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestPermission extends androidx.activity.result.contract.ActivityResultContract<java.lang.String, java.lang.Boolean> {
        public RequestPermission() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r3, java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r3 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
                androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions$Companion r3 = androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion
                r0 = 1
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
                r0[r1] = r4
                android.content.Intent r3 = r3.createIntent$activity_release(r0)
                return r3
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                int r2 = androidx.core.content.ContextCompat.checkSelfPermission(r2, r3)
                if (r2 != 0) goto L1b
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r2 = new androidx.activity.result.contract.ActivityResultContract$SynchronousResult
                r3 = 1
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r2.<init>(r3)
                goto L1c
            L1b:
                r2 = 0
            L1c:
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public java.lang.Boolean parseResult(int r4, android.content.Intent r5) {
                r3 = this;
                r0 = 0
                if (r5 == 0) goto L21
                r1 = -1
                if (r4 == r1) goto L7
                goto L21
            L7:
                java.lang.String r4 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r4 = r5.getIntArrayExtra(r4)
                if (r4 == 0) goto L1c
                int r5 = r4.length
                r1 = r0
            L11:
                if (r1 >= r5) goto L1c
                r2 = r4[r1]
                if (r2 != 0) goto L19
                r0 = 1
                goto L1c
            L19:
                int r1 = r1 + 1
                goto L11
            L1c:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
                return r4
            L21:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "()V", "createIntent", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StartActivityForResult extends androidx.activity.result.contract.ActivityResultContract<android.content.Intent, androidx.activity.result.ActivityResult> {
        public static final androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion Companion = null;
        public static final java.lang.String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult$Companion;", "", "()V", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion = r0
                return
        }

        public StartActivityForResult() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                return r3
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                android.content.Intent r2 = (android.content.Intent) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StartIntentSenderForResult extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        public static final java.lang.String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion Companion = null;
        public static final java.lang.String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final java.lang.String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* JADX INFO: compiled from: ActivityResultContracts.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult$Companion;", "", "()V", "ACTION_INTENT_SENDER_REQUEST", "", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        }

        static {
                androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult$Companion r0 = new androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion = r0
                return
        }

        public StartIntentSenderForResult() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, androidx.activity.result.IntentSenderRequest r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r2.<init>(r0)
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001d\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class TakePicture extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, java.lang.Boolean> {
        public TakePicture() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
                r2.<init>(r0)
                java.lang.String r0 = "output"
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<java.lang.Boolean> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                r2 = -1
                if (r1 != r2) goto L5
                r1 = 1
                goto L6
            L5:
                r1 = 0
            L6:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ java.lang.Boolean parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                java.lang.Boolean r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class TakePicturePreview extends androidx.activity.result.contract.ActivityResultContract<java.lang.Void, android.graphics.Bitmap> {
        public TakePicturePreview() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.String r2 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
                r1.<init>(r2)
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.Void r2 = (java.lang.Void) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult2(android.content.Context r1, java.lang.Void r2) {
                r0 = this;
                java.lang.String r2 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                r1 = 0
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto L11
                java.lang.String r3 = "data"
                android.os.Parcelable r3 = r4.getParcelableExtra(r3)
                r1 = r3
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            L11:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.graphics.Bitmap parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.graphics.Bitmap r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    /* JADX INFO: compiled from: ActivityResultContracts.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakeVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.Deprecated(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class TakeVideo extends androidx.activity.result.contract.ActivityResultContract<android.net.Uri, android.graphics.Bitmap> {
        public TakeVideo() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
                r2.<init>(r0)
                java.lang.String r0 = "output"
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                android.content.Intent r2 = r2.putExtra(r0, r3)
                java.lang.String r3 = "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult2(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                r2 = 0
                return r2
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.contract.ActivityResultContract.SynchronousResult<android.graphics.Bitmap> getSynchronousResult(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                android.net.Uri r2 = (android.net.Uri) r2
                androidx.activity.result.contract.ActivityResultContract$SynchronousResult r1 = r0.getSynchronousResult2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final android.graphics.Bitmap parseResult(int r3, android.content.Intent r4) {
                r2 = this;
                r0 = -1
                r1 = 0
                if (r3 != r0) goto L5
                goto L6
            L5:
                r4 = r1
            L6:
                if (r4 == 0) goto L11
                java.lang.String r3 = "data"
                android.os.Parcelable r3 = r4.getParcelableExtra(r3)
                r1 = r3
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            L11:
                return r1
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.graphics.Bitmap parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                android.graphics.Bitmap r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    private ActivityResultContracts() {
            r0 = this;
            r0.<init>()
            return
    }
}
