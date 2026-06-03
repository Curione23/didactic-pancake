package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final java.lang.String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final java.lang.String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final java.lang.String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final java.lang.String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private final boolean mAllowFreeFormTextInput;
    private final java.util.Set<java.lang.String> mAllowedDataTypes;
    private final java.lang.CharSequence[] mChoices;
    private final int mEditChoicesBeforeSending;
    private final android.os.Bundle mExtras;
    private final java.lang.CharSequence mLabel;
    private final java.lang.String mResultKey;

    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void addResultsToIntent(java.lang.Object r0, android.content.Intent r1, android.os.Bundle r2) {
                android.app.RemoteInput[] r0 = (android.app.RemoteInput[]) r0
                android.app.RemoteInput.addResultsToIntent(r0, r1, r2)
                return
        }

        public static android.app.RemoteInput fromCompat(androidx.core.app.RemoteInput r4) {
                android.app.RemoteInput$Builder r0 = new android.app.RemoteInput$Builder
                java.lang.String r1 = r4.getResultKey()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r4.getLabel()
                android.app.RemoteInput$Builder r0 = r0.setLabel(r1)
                java.lang.CharSequence[] r1 = r4.getChoices()
                android.app.RemoteInput$Builder r0 = r0.setChoices(r1)
                boolean r1 = r4.getAllowFreeFormInput()
                android.app.RemoteInput$Builder r0 = r0.setAllowFreeFormInput(r1)
                android.os.Bundle r1 = r4.getExtras()
                android.app.RemoteInput$Builder r0 = r0.addExtras(r1)
                java.util.Set r1 = r4.getAllowedDataTypes()
                if (r1 == 0) goto L44
                java.util.Iterator r1 = r1.iterator()
            L33:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L44
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                androidx.core.app.RemoteInput.Api26Impl.setAllowDataType(r0, r2, r3)
                goto L33
            L44:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 < r2) goto L51
                int r4 = r4.getEditChoicesBeforeSending()
                androidx.core.app.RemoteInput.Api29Impl.setEditChoicesBeforeSending(r0, r4)
            L51:
                android.app.RemoteInput r4 = r0.build()
                return r4
        }

        static androidx.core.app.RemoteInput fromPlatform(java.lang.Object r4) {
                android.app.RemoteInput r4 = (android.app.RemoteInput) r4
                androidx.core.app.RemoteInput$Builder r0 = new androidx.core.app.RemoteInput$Builder
                java.lang.String r1 = r4.getResultKey()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r4.getLabel()
                androidx.core.app.RemoteInput$Builder r0 = r0.setLabel(r1)
                java.lang.CharSequence[] r1 = r4.getChoices()
                androidx.core.app.RemoteInput$Builder r0 = r0.setChoices(r1)
                boolean r1 = r4.getAllowFreeFormInput()
                androidx.core.app.RemoteInput$Builder r0 = r0.setAllowFreeFormInput(r1)
                android.os.Bundle r1 = r4.getExtras()
                androidx.core.app.RemoteInput$Builder r0 = r0.addExtras(r1)
                java.util.Set r1 = androidx.core.app.RemoteInput.Api26Impl.getAllowedDataTypes(r4)
                if (r1 == 0) goto L46
                java.util.Iterator r1 = r1.iterator()
            L35:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L46
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r0.setAllowDataType(r2, r3)
                goto L35
            L46:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 < r2) goto L53
                int r4 = androidx.core.app.RemoteInput.Api29Impl.getEditChoicesBeforeSending(r4)
                r0.setEditChoicesBeforeSending(r4)
            L53:
                androidx.core.app.RemoteInput r4 = r0.build()
                return r4
        }

        static android.os.Bundle getResultsFromIntent(android.content.Intent r0) {
                android.os.Bundle r0 = android.app.RemoteInput.getResultsFromIntent(r0)
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void addDataResultToIntent(androidx.core.app.RemoteInput r0, android.content.Intent r1, java.util.Map<java.lang.String, android.net.Uri> r2) {
                android.app.RemoteInput r0 = androidx.core.app.RemoteInput.fromCompat(r0)
                android.app.RemoteInput.addDataResultToIntent(r0, r1, r2)
                return
        }

        static java.util.Set<java.lang.String> getAllowedDataTypes(java.lang.Object r0) {
                android.app.RemoteInput r0 = (android.app.RemoteInput) r0
                java.util.Set r0 = r0.getAllowedDataTypes()
                return r0
        }

        static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent r0, java.lang.String r1) {
                java.util.Map r0 = android.app.RemoteInput.getDataResultsFromIntent(r0, r1)
                return r0
        }

        static android.app.RemoteInput.Builder setAllowDataType(android.app.RemoteInput.Builder r0, java.lang.String r1, boolean r2) {
                android.app.RemoteInput$Builder r0 = r0.setAllowDataType(r1, r2)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getResultsSource(android.content.Intent r0) {
                int r0 = android.app.RemoteInput.getResultsSource(r0)
                return r0
        }

        static void setResultsSource(android.content.Intent r0, int r1) {
                android.app.RemoteInput.setResultsSource(r0, r1)
                return
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getEditChoicesBeforeSending(java.lang.Object r0) {
                android.app.RemoteInput r0 = (android.app.RemoteInput) r0
                int r0 = r0.getEditChoicesBeforeSending()
                return r0
        }

        static android.app.RemoteInput.Builder setEditChoicesBeforeSending(android.app.RemoteInput.Builder r0, int r1) {
                android.app.RemoteInput$Builder r0 = r0.setEditChoicesBeforeSending(r1)
                return r0
        }
    }

    public static final class Builder {
        private boolean mAllowFreeFormTextInput;
        private final java.util.Set<java.lang.String> mAllowedDataTypes;
        private java.lang.CharSequence[] mChoices;
        private int mEditChoicesBeforeSending;
        private final android.os.Bundle mExtras;
        private java.lang.CharSequence mLabel;
        private final java.lang.String mResultKey;

        public Builder(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mAllowedDataTypes = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.mExtras = r0
                r0 = 1
                r1.mAllowFreeFormTextInput = r0
                r0 = 0
                r1.mEditChoicesBeforeSending = r0
                if (r2 == 0) goto L1c
                r1.mResultKey = r2
                return
            L1c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Result key can't be null"
                r2.<init>(r0)
                throw r2
        }

        public androidx.core.app.RemoteInput.Builder addExtras(android.os.Bundle r2) {
                r1 = this;
                if (r2 == 0) goto L7
                android.os.Bundle r0 = r1.mExtras
                r0.putAll(r2)
            L7:
                return r1
        }

        public androidx.core.app.RemoteInput build() {
                r9 = this;
                androidx.core.app.RemoteInput r8 = new androidx.core.app.RemoteInput
                java.lang.String r1 = r9.mResultKey
                java.lang.CharSequence r2 = r9.mLabel
                java.lang.CharSequence[] r3 = r9.mChoices
                boolean r4 = r9.mAllowFreeFormTextInput
                int r5 = r9.mEditChoicesBeforeSending
                android.os.Bundle r6 = r9.mExtras
                java.util.Set<java.lang.String> r7 = r9.mAllowedDataTypes
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setAllowDataType(java.lang.String r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L8
                java.util.Set<java.lang.String> r2 = r0.mAllowedDataTypes
                r2.add(r1)
                goto Ld
            L8:
                java.util.Set<java.lang.String> r2 = r0.mAllowedDataTypes
                r2.remove(r1)
            Ld:
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setAllowFreeFormInput(boolean r1) {
                r0 = this;
                r0.mAllowFreeFormTextInput = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] r1) {
                r0 = this;
                r0.mChoices = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setEditChoicesBeforeSending(int r1) {
                r0 = this;
                r0.mEditChoicesBeforeSending = r1
                return r0
        }

        public androidx.core.app.RemoteInput.Builder setLabel(java.lang.CharSequence r1) {
                r0 = this;
                r0.mLabel = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    RemoteInput(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence[] r3, boolean r4, int r5, android.os.Bundle r6, java.util.Set<java.lang.String> r7) {
            r0 = this;
            r0.<init>()
            r0.mResultKey = r1
            r0.mLabel = r2
            r0.mChoices = r3
            r0.mAllowFreeFormTextInput = r4
            r0.mEditChoicesBeforeSending = r5
            r0.mExtras = r6
            r0.mAllowedDataTypes = r7
            int r1 = r0.getEditChoicesBeforeSending()
            r2 = 2
            if (r1 != r2) goto L27
            boolean r1 = r0.getAllowFreeFormInput()
            if (r1 == 0) goto L1f
            goto L27
        L1f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "setEditChoicesBeforeSending requires setAllowFreeFormInput"
            r1.<init>(r2)
            throw r1
        L27:
            return
    }

    public static void addDataResultToIntent(androidx.core.app.RemoteInput r0, android.content.Intent r1, java.util.Map<java.lang.String, android.net.Uri> r2) {
            androidx.core.app.RemoteInput.Api26Impl.addDataResultToIntent(r0, r1, r2)
            return
    }

    public static void addResultsToIntent(androidx.core.app.RemoteInput[] r0, android.content.Intent r1, android.os.Bundle r2) {
            android.app.RemoteInput[] r0 = fromCompat(r0)
            androidx.core.app.RemoteInput.Api20Impl.addResultsToIntent(r0, r1, r2)
            return
    }

    static android.app.RemoteInput fromCompat(androidx.core.app.RemoteInput r0) {
            android.app.RemoteInput r0 = androidx.core.app.RemoteInput.Api20Impl.fromCompat(r0)
            return r0
    }

    static android.app.RemoteInput[] fromCompat(androidx.core.app.RemoteInput[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            android.app.RemoteInput[] r0 = new android.app.RemoteInput[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            android.app.RemoteInput r2 = fromCompat(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    static androidx.core.app.RemoteInput fromPlatform(android.app.RemoteInput r0) {
            androidx.core.app.RemoteInput r0 = androidx.core.app.RemoteInput.Api20Impl.fromPlatform(r0)
            return r0
    }

    private static android.content.Intent getClipDataIntentFromIntent(android.content.Intent r3) {
            android.content.ClipData r3 = r3.getClipData()
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            android.content.ClipDescription r1 = r3.getDescription()
            java.lang.String r2 = "text/vnd.android.intent"
            boolean r2 = r1.hasMimeType(r2)
            if (r2 != 0) goto L15
            return r0
        L15:
            java.lang.CharSequence r1 = r1.getLabel()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.remoteinput.results"
            boolean r1 = r1.contentEquals(r2)
            if (r1 != 0) goto L26
            return r0
        L26:
            r0 = 0
            android.content.ClipData$Item r3 = r3.getItemAt(r0)
            android.content.Intent r3 = r3.getIntent()
            return r3
    }

    public static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent r0, java.lang.String r1) {
            java.util.Map r0 = androidx.core.app.RemoteInput.Api26Impl.getDataResultsFromIntent(r0, r1)
            return r0
    }

    private static java.lang.String getExtraResultsKeyForData(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "android.remoteinput.dataTypeResultsData"
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static android.os.Bundle getResultsFromIntent(android.content.Intent r0) {
            android.os.Bundle r0 = androidx.core.app.RemoteInput.Api20Impl.getResultsFromIntent(r0)
            return r0
    }

    public static int getResultsSource(android.content.Intent r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.core.app.RemoteInput.Api28Impl.getResultsSource(r2)
            return r2
        Lb:
            android.content.Intent r2 = getClipDataIntentFromIntent(r2)
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            android.os.Bundle r2 = r2.getExtras()
            java.lang.String r1 = "android.remoteinput.resultsSource"
            int r2 = r2.getInt(r1, r0)
            return r2
    }

    public static void setResultsSource(android.content.Intent r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.app.RemoteInput.Api28Impl.setResultsSource(r2, r3)
            goto L23
        La:
            android.content.Intent r0 = getClipDataIntentFromIntent(r2)
            if (r0 != 0) goto L15
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
        L15:
            java.lang.String r1 = "android.remoteinput.resultsSource"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "android.remoteinput.results"
            android.content.ClipData r3 = android.content.ClipData.newIntent(r3, r0)
            r2.setClipData(r3)
        L23:
            return
    }

    public boolean getAllowFreeFormInput() {
            r1 = this;
            boolean r0 = r1.mAllowFreeFormTextInput
            return r0
    }

    public java.util.Set<java.lang.String> getAllowedDataTypes() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mAllowedDataTypes
            return r0
    }

    public java.lang.CharSequence[] getChoices() {
            r1 = this;
            java.lang.CharSequence[] r0 = r1.mChoices
            return r0
    }

    public int getEditChoicesBeforeSending() {
            r1 = this;
            int r0 = r1.mEditChoicesBeforeSending
            return r0
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            return r0
    }

    public java.lang.CharSequence getLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel
            return r0
    }

    public java.lang.String getResultKey() {
            r1 = this;
            java.lang.String r0 = r1.mResultKey
            return r0
    }

    public boolean isDataOnly() {
            r1 = this;
            boolean r0 = r1.getAllowFreeFormInput()
            if (r0 != 0) goto L25
            java.lang.CharSequence[] r0 = r1.getChoices()
            if (r0 == 0) goto L13
            java.lang.CharSequence[] r0 = r1.getChoices()
            int r0 = r0.length
            if (r0 != 0) goto L25
        L13:
            java.util.Set r0 = r1.getAllowedDataTypes()
            if (r0 == 0) goto L25
            java.util.Set r0 = r1.getAllowedDataTypes()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }
}
