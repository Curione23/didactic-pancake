package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    private final androidx.core.view.ContentInfoCompat.Compat mCompat;

    private static final class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> partition(android.view.ContentInfo r4, java.util.function.Predicate<android.content.ClipData.Item> r5) {
                android.content.ClipData r0 = r4.getClip()
                int r1 = r0.getItemCount()
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L22
                r1 = 0
                android.content.ClipData$Item r0 = r0.getItemAt(r1)
                boolean r5 = r5.test(r0)
                if (r5 == 0) goto L19
                r0 = r4
                goto L1a
            L19:
                r0 = r3
            L1a:
                if (r5 == 0) goto L1d
                r4 = r3
            L1d:
                android.util.Pair r4 = android.util.Pair.create(r0, r4)
                return r4
            L22:
                java.util.Objects.requireNonNull(r5)
                androidx.core.view.ContentInfoCompat$Api31Impl$$ExternalSyntheticLambda0 r1 = new androidx.core.view.ContentInfoCompat$Api31Impl$$ExternalSyntheticLambda0
                r1.<init>(r5)
                android.util.Pair r5 = androidx.core.view.ContentInfoCompat.partition(r0, r1)
                java.lang.Object r0 = r5.first
                if (r0 != 0) goto L37
                android.util.Pair r4 = android.util.Pair.create(r3, r4)
                return r4
            L37:
                java.lang.Object r0 = r5.second
                if (r0 != 0) goto L40
                android.util.Pair r4 = android.util.Pair.create(r4, r3)
                return r4
            L40:
                android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
                r0.<init>(r4)
                java.lang.Object r1 = r5.first
                android.content.ClipData r1 = (android.content.ClipData) r1
                android.view.ContentInfo$Builder r0 = r0.setClip(r1)
                android.view.ContentInfo r0 = r0.build()
                android.view.ContentInfo$Builder r1 = new android.view.ContentInfo$Builder
                r1.<init>(r4)
                java.lang.Object r4 = r5.second
                android.content.ClipData r4 = (android.content.ClipData) r4
                android.view.ContentInfo$Builder r4 = r1.setClip(r4)
                android.view.ContentInfo r4 = r4.build()
                android.util.Pair r4 = android.util.Pair.create(r0, r4)
                return r4
        }
    }

    public static final class Builder {
        private final androidx.core.view.ContentInfoCompat.BuilderCompat mBuilderCompat;

        public Builder(android.content.ClipData r3, int r4) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 < r1) goto L11
                androidx.core.view.ContentInfoCompat$BuilderCompat31Impl r0 = new androidx.core.view.ContentInfoCompat$BuilderCompat31Impl
                r0.<init>(r3, r4)
                r2.mBuilderCompat = r0
                goto L18
            L11:
                androidx.core.view.ContentInfoCompat$BuilderCompatImpl r0 = new androidx.core.view.ContentInfoCompat$BuilderCompatImpl
                r0.<init>(r3, r4)
                r2.mBuilderCompat = r0
            L18:
                return
        }

        public Builder(androidx.core.view.ContentInfoCompat r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 < r1) goto L11
                androidx.core.view.ContentInfoCompat$BuilderCompat31Impl r0 = new androidx.core.view.ContentInfoCompat$BuilderCompat31Impl
                r0.<init>(r3)
                r2.mBuilderCompat = r0
                goto L18
            L11:
                androidx.core.view.ContentInfoCompat$BuilderCompatImpl r0 = new androidx.core.view.ContentInfoCompat$BuilderCompatImpl
                r0.<init>(r3)
                r2.mBuilderCompat = r0
            L18:
                return
        }

        public androidx.core.view.ContentInfoCompat build() {
                r1 = this;
                androidx.core.view.ContentInfoCompat$BuilderCompat r0 = r1.mBuilderCompat
                androidx.core.view.ContentInfoCompat r0 = r0.build()
                return r0
        }

        public androidx.core.view.ContentInfoCompat.Builder setClip(android.content.ClipData r2) {
                r1 = this;
                androidx.core.view.ContentInfoCompat$BuilderCompat r0 = r1.mBuilderCompat
                r0.setClip(r2)
                return r1
        }

        public androidx.core.view.ContentInfoCompat.Builder setExtras(android.os.Bundle r2) {
                r1 = this;
                androidx.core.view.ContentInfoCompat$BuilderCompat r0 = r1.mBuilderCompat
                r0.setExtras(r2)
                return r1
        }

        public androidx.core.view.ContentInfoCompat.Builder setFlags(int r2) {
                r1 = this;
                androidx.core.view.ContentInfoCompat$BuilderCompat r0 = r1.mBuilderCompat
                r0.setFlags(r2)
                return r1
        }

        public androidx.core.view.ContentInfoCompat.Builder setLinkUri(android.net.Uri r2) {
                r1 = this;
                androidx.core.view.ContentInfoCompat$BuilderCompat r0 = r1.mBuilderCompat
                r0.setLinkUri(r2)
                return r1
        }

        public androidx.core.view.ContentInfoCompat.Builder setSource(int r2) {
                r1 = this;
                androidx.core.view.ContentInfoCompat$BuilderCompat r0 = r1.mBuilderCompat
                r0.setSource(r2)
                return r1
        }
    }

    private interface BuilderCompat {
        androidx.core.view.ContentInfoCompat build();

        void setClip(android.content.ClipData r1);

        void setExtras(android.os.Bundle r1);

        void setFlags(int r1);

        void setLinkUri(android.net.Uri r1);

        void setSource(int r1);
    }

    private static final class BuilderCompat31Impl implements androidx.core.view.ContentInfoCompat.BuilderCompat {
        private final android.view.ContentInfo.Builder mPlatformBuilder;

        BuilderCompat31Impl(android.content.ClipData r2, int r3) {
                r1 = this;
                r1.<init>()
                android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
                r0.<init>(r2, r3)
                r1.mPlatformBuilder = r0
                return
        }

        BuilderCompat31Impl(androidx.core.view.ContentInfoCompat r2) {
                r1 = this;
                r1.<init>()
                android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
                android.view.ContentInfo r2 = r2.toContentInfo()
                r0.<init>(r2)
                r1.mPlatformBuilder = r0
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public androidx.core.view.ContentInfoCompat build() {
                r3 = this;
                androidx.core.view.ContentInfoCompat r0 = new androidx.core.view.ContentInfoCompat
                androidx.core.view.ContentInfoCompat$Compat31Impl r1 = new androidx.core.view.ContentInfoCompat$Compat31Impl
                android.view.ContentInfo$Builder r2 = r3.mPlatformBuilder
                android.view.ContentInfo r2 = r2.build()
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(android.content.ClipData r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.mPlatformBuilder
                r0.setClip(r2)
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(android.os.Bundle r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.mPlatformBuilder
                r0.setExtras(r2)
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.mPlatformBuilder
                r0.setFlags(r2)
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(android.net.Uri r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.mPlatformBuilder
                r0.setLinkUri(r2)
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.mPlatformBuilder
                r0.setSource(r2)
                return
        }
    }

    private static final class BuilderCompatImpl implements androidx.core.view.ContentInfoCompat.BuilderCompat {
        android.content.ClipData mClip;
        android.os.Bundle mExtras;
        int mFlags;
        android.net.Uri mLinkUri;
        int mSource;

        BuilderCompatImpl(android.content.ClipData r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mClip = r1
                r0.mSource = r2
                return
        }

        BuilderCompatImpl(androidx.core.view.ContentInfoCompat r2) {
                r1 = this;
                r1.<init>()
                android.content.ClipData r0 = r2.getClip()
                r1.mClip = r0
                int r0 = r2.getSource()
                r1.mSource = r0
                int r0 = r2.getFlags()
                r1.mFlags = r0
                android.net.Uri r0 = r2.getLinkUri()
                r1.mLinkUri = r0
                android.os.Bundle r2 = r2.getExtras()
                r1.mExtras = r2
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public androidx.core.view.ContentInfoCompat build() {
                r2 = this;
                androidx.core.view.ContentInfoCompat r0 = new androidx.core.view.ContentInfoCompat
                androidx.core.view.ContentInfoCompat$CompatImpl r1 = new androidx.core.view.ContentInfoCompat$CompatImpl
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setClip(android.content.ClipData r1) {
                r0 = this;
                r0.mClip = r1
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(android.os.Bundle r1) {
                r0 = this;
                r0.mExtras = r1
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setFlags(int r1) {
                r0 = this;
                r0.mFlags = r1
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setLinkUri(android.net.Uri r1) {
                r0 = this;
                r0.mLinkUri = r1
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setSource(int r1) {
                r0 = this;
                r0.mSource = r1
                return
        }
    }

    private interface Compat {
        android.content.ClipData getClip();

        android.os.Bundle getExtras();

        int getFlags();

        android.net.Uri getLinkUri();

        int getSource();

        android.view.ContentInfo getWrapped();
    }

    private static final class Compat31Impl implements androidx.core.view.ContentInfoCompat.Compat {
        private final android.view.ContentInfo mWrapped;

        Compat31Impl(android.view.ContentInfo r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.view.ContentInfo r1 = (android.view.ContentInfo) r1
                r0.mWrapped = r1
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.content.ClipData getClip() {
                r1 = this;
                android.view.ContentInfo r0 = r1.mWrapped
                android.content.ClipData r0 = r0.getClip()
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.os.Bundle getExtras() {
                r1 = this;
                android.view.ContentInfo r0 = r1.mWrapped
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
                r1 = this;
                android.view.ContentInfo r0 = r1.mWrapped
                int r0 = r0.getFlags()
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.net.Uri getLinkUri() {
                r1 = this;
                android.view.ContentInfo r0 = r1.mWrapped
                android.net.Uri r0 = r0.getLinkUri()
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
                r1 = this;
                android.view.ContentInfo r0 = r1.mWrapped
                int r0 = r0.getSource()
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.view.ContentInfo getWrapped() {
                r1 = this;
                android.view.ContentInfo r0 = r1.mWrapped
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ContentInfoCompat{"
                r0.<init>(r1)
                android.view.ContentInfo r1 = r2.mWrapped
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static final class CompatImpl implements androidx.core.view.ContentInfoCompat.Compat {
        private final android.content.ClipData mClip;
        private final android.os.Bundle mExtras;
        private final int mFlags;
        private final android.net.Uri mLinkUri;
        private final int mSource;

        CompatImpl(androidx.core.view.ContentInfoCompat.BuilderCompatImpl r5) {
                r4 = this;
                r4.<init>()
                android.content.ClipData r0 = r5.mClip
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
                android.content.ClipData r0 = (android.content.ClipData) r0
                r4.mClip = r0
                int r0 = r5.mSource
                r1 = 5
                java.lang.String r2 = "source"
                r3 = 0
                int r0 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r3, r1, r2)
                r4.mSource = r0
                int r0 = r5.mFlags
                r1 = 1
                int r0 = androidx.core.util.Preconditions.checkFlagsArgument(r0, r1)
                r4.mFlags = r0
                android.net.Uri r0 = r5.mLinkUri
                r4.mLinkUri = r0
                android.os.Bundle r5 = r5.mExtras
                r4.mExtras = r5
                return
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.content.ClipData getClip() {
                r1 = this;
                android.content.ClipData r0 = r1.mClip
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getFlags() {
                r1 = this;
                int r0 = r1.mFlags
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.net.Uri getLinkUri() {
                r1 = this;
                android.net.Uri r0 = r1.mLinkUri
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
                r1 = this;
                int r0 = r1.mSource
                return r0
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public android.view.ContentInfo getWrapped() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ContentInfoCompat{clip="
                r0.<init>(r1)
                android.content.ClipData r1 = r4.mClip
                android.content.ClipDescription r1 = r1.getDescription()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", source="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r4.mSource
                java.lang.String r1 = androidx.core.view.ContentInfoCompat.sourceToString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", flags="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r4.mFlags
                java.lang.String r1 = androidx.core.view.ContentInfoCompat.flagsToString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                android.net.Uri r1 = r4.mLinkUri
                java.lang.String r2 = ""
                if (r1 != 0) goto L39
                r1 = r2
                goto L58
            L39:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = ", hasLinkUri("
                r1.<init>(r3)
                android.net.Uri r3 = r4.mLinkUri
                java.lang.String r3 = r3.toString()
                int r3 = r3.length()
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r3 = ")"
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
            L58:
                java.lang.StringBuilder r0 = r0.append(r1)
                android.os.Bundle r1 = r4.mExtras
                if (r1 != 0) goto L61
                goto L63
            L61:
                java.lang.String r2 = ", hasExtras"
            L63:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    ContentInfoCompat(androidx.core.view.ContentInfoCompat.Compat r1) {
            r0 = this;
            r0.<init>()
            r0.mCompat = r1
            return
    }

    static android.content.ClipData buildClipData(android.content.ClipDescription r2, java.util.List<android.content.ClipData.Item> r3) {
            android.content.ClipData r0 = new android.content.ClipData
            android.content.ClipDescription r1 = new android.content.ClipDescription
            r1.<init>(r2)
            r2 = 0
            java.lang.Object r2 = r3.get(r2)
            android.content.ClipData$Item r2 = (android.content.ClipData.Item) r2
            r0.<init>(r1, r2)
            r2 = 1
        L12:
            int r1 = r3.size()
            if (r2 >= r1) goto L24
            java.lang.Object r1 = r3.get(r2)
            android.content.ClipData$Item r1 = (android.content.ClipData.Item) r1
            r0.addItem(r1)
            int r2 = r2 + 1
            goto L12
        L24:
            return r0
    }

    static java.lang.String flagsToString(int r1) {
            r0 = r1 & 1
            if (r0 == 0) goto L7
            java.lang.String r1 = "FLAG_CONVERT_TO_PLAIN_TEXT"
            return r1
        L7:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    static android.util.Pair<android.content.ClipData, android.content.ClipData> partition(android.content.ClipData r6, androidx.core.util.Predicate<android.content.ClipData.Item> r7) {
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
        L4:
            int r4 = r6.getItemCount()
            if (r1 >= r4) goto L2c
            android.content.ClipData$Item r4 = r6.getItemAt(r1)
            boolean r5 = r7.test(r4)
            if (r5 == 0) goto L1f
            if (r2 != 0) goto L1b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L1b:
            r2.add(r4)
            goto L29
        L1f:
            if (r3 != 0) goto L26
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L26:
            r3.add(r4)
        L29:
            int r1 = r1 + 1
            goto L4
        L2c:
            if (r2 != 0) goto L33
            android.util.Pair r6 = android.util.Pair.create(r0, r6)
            return r6
        L33:
            if (r3 != 0) goto L3a
            android.util.Pair r6 = android.util.Pair.create(r6, r0)
            return r6
        L3a:
            android.content.ClipDescription r7 = r6.getDescription()
            android.content.ClipData r7 = buildClipData(r7, r2)
            android.content.ClipDescription r6 = r6.getDescription()
            android.content.ClipData r6 = buildClipData(r6, r3)
            android.util.Pair r6 = android.util.Pair.create(r7, r6)
            return r6
    }

    public static android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> partition(android.view.ContentInfo r0, java.util.function.Predicate<android.content.ClipData.Item> r1) {
            android.util.Pair r0 = androidx.core.view.ContentInfoCompat.Api31Impl.partition(r0, r1)
            return r0
    }

    static java.lang.String sourceToString(int r1) {
            if (r1 == 0) goto L25
            r0 = 1
            if (r1 == r0) goto L22
            r0 = 2
            if (r1 == r0) goto L1f
            r0 = 3
            if (r1 == r0) goto L1c
            r0 = 4
            if (r1 == r0) goto L19
            r0 = 5
            if (r1 == r0) goto L16
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        L16:
            java.lang.String r1 = "SOURCE_PROCESS_TEXT"
            return r1
        L19:
            java.lang.String r1 = "SOURCE_AUTOFILL"
            return r1
        L1c:
            java.lang.String r1 = "SOURCE_DRAG_AND_DROP"
            return r1
        L1f:
            java.lang.String r1 = "SOURCE_INPUT_METHOD"
            return r1
        L22:
            java.lang.String r1 = "SOURCE_CLIPBOARD"
            return r1
        L25:
            java.lang.String r1 = "SOURCE_APP"
            return r1
    }

    public static androidx.core.view.ContentInfoCompat toContentInfoCompat(android.view.ContentInfo r2) {
            androidx.core.view.ContentInfoCompat r0 = new androidx.core.view.ContentInfoCompat
            androidx.core.view.ContentInfoCompat$Compat31Impl r1 = new androidx.core.view.ContentInfoCompat$Compat31Impl
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public android.content.ClipData getClip() {
            r1 = this;
            androidx.core.view.ContentInfoCompat$Compat r0 = r1.mCompat
            android.content.ClipData r0 = r0.getClip()
            return r0
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            androidx.core.view.ContentInfoCompat$Compat r0 = r1.mCompat
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    public int getFlags() {
            r1 = this;
            androidx.core.view.ContentInfoCompat$Compat r0 = r1.mCompat
            int r0 = r0.getFlags()
            return r0
    }

    public android.net.Uri getLinkUri() {
            r1 = this;
            androidx.core.view.ContentInfoCompat$Compat r0 = r1.mCompat
            android.net.Uri r0 = r0.getLinkUri()
            return r0
    }

    public int getSource() {
            r1 = this;
            androidx.core.view.ContentInfoCompat$Compat r0 = r1.mCompat
            int r0 = r0.getSource()
            return r0
    }

    public android.util.Pair<androidx.core.view.ContentInfoCompat, androidx.core.view.ContentInfoCompat> partition(androidx.core.util.Predicate<android.content.ClipData.Item> r5) {
            r4 = this;
            androidx.core.view.ContentInfoCompat$Compat r0 = r4.mCompat
            android.content.ClipData r0 = r0.getClip()
            int r1 = r0.getItemCount()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L25
            r1 = 0
            android.content.ClipData$Item r0 = r0.getItemAt(r1)
            boolean r5 = r5.test(r0)
            if (r5 == 0) goto L1b
            r0 = r4
            goto L1c
        L1b:
            r0 = r3
        L1c:
            if (r5 == 0) goto L1f
            goto L20
        L1f:
            r3 = r4
        L20:
            android.util.Pair r5 = android.util.Pair.create(r0, r3)
            return r5
        L25:
            android.util.Pair r5 = partition(r0, r5)
            java.lang.Object r0 = r5.first
            if (r0 != 0) goto L32
            android.util.Pair r5 = android.util.Pair.create(r3, r4)
            return r5
        L32:
            java.lang.Object r0 = r5.second
            if (r0 != 0) goto L3b
            android.util.Pair r5 = android.util.Pair.create(r4, r3)
            return r5
        L3b:
            androidx.core.view.ContentInfoCompat$Builder r0 = new androidx.core.view.ContentInfoCompat$Builder
            r0.<init>(r4)
            java.lang.Object r1 = r5.first
            android.content.ClipData r1 = (android.content.ClipData) r1
            androidx.core.view.ContentInfoCompat$Builder r0 = r0.setClip(r1)
            androidx.core.view.ContentInfoCompat r0 = r0.build()
            androidx.core.view.ContentInfoCompat$Builder r1 = new androidx.core.view.ContentInfoCompat$Builder
            r1.<init>(r4)
            java.lang.Object r5 = r5.second
            android.content.ClipData r5 = (android.content.ClipData) r5
            androidx.core.view.ContentInfoCompat$Builder r5 = r1.setClip(r5)
            androidx.core.view.ContentInfoCompat r5 = r5.build()
            android.util.Pair r5 = android.util.Pair.create(r0, r5)
            return r5
    }

    public android.view.ContentInfo toContentInfo() {
            r1 = this;
            androidx.core.view.ContentInfoCompat$Compat r0 = r1.mCompat
            android.view.ContentInfo r0 = r0.getWrapped()
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            androidx.core.view.ContentInfoCompat$Compat r0 = r1.mCompat
            java.lang.String r0 = r0.toString()
            return r0
    }
}
