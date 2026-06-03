package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;
    private final int[] mEmojiAsDefaultStyleExceptions;
    private androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;
    private final androidx.emoji2.text.MetadataRepo mMetadataRepo;
    private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    private static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
                r0 = this;
                r0.<init>()
                return
        }

        static int findIndexBackward(java.lang.CharSequence r5, int r6, int r7) {
                int r0 = r5.length()
                r1 = -1
                if (r6 < 0) goto L3c
                if (r0 >= r6) goto La
                goto L3c
            La:
                if (r7 >= 0) goto Ld
                return r1
            Ld:
                r0 = 0
            Le:
                r2 = r0
            Lf:
                if (r7 != 0) goto L12
                return r6
            L12:
                int r6 = r6 + (-1)
                if (r6 >= 0) goto L1a
                if (r2 == 0) goto L19
                return r1
            L19:
                return r0
            L1a:
                char r3 = r5.charAt(r6)
                if (r2 == 0) goto L2a
                boolean r2 = java.lang.Character.isHighSurrogate(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                int r7 = r7 + (-1)
                goto Le
            L2a:
                boolean r4 = java.lang.Character.isSurrogate(r3)
                if (r4 != 0) goto L33
                int r7 = r7 + (-1)
                goto Lf
            L33:
                boolean r2 = java.lang.Character.isHighSurrogate(r3)
                if (r2 == 0) goto L3a
                return r1
            L3a:
                r2 = 1
                goto Lf
            L3c:
                return r1
        }

        static int findIndexForward(java.lang.CharSequence r6, int r7, int r8) {
                int r0 = r6.length()
                r1 = -1
                if (r7 < 0) goto L40
                if (r0 >= r7) goto La
                goto L40
            La:
                if (r8 >= 0) goto Ld
                return r1
            Ld:
                r2 = 0
            Le:
                r3 = r2
            Lf:
                if (r8 != 0) goto L12
                return r7
            L12:
                if (r7 < r0) goto L18
                if (r3 == 0) goto L17
                return r1
            L17:
                return r0
            L18:
                char r4 = r6.charAt(r7)
                if (r3 == 0) goto L2a
                boolean r3 = java.lang.Character.isLowSurrogate(r4)
                if (r3 != 0) goto L25
                return r1
            L25:
                int r8 = r8 + (-1)
                int r7 = r7 + 1
                goto Le
            L2a:
                boolean r5 = java.lang.Character.isSurrogate(r4)
                if (r5 != 0) goto L35
                int r8 = r8 + (-1)
                int r7 = r7 + 1
                goto Lf
            L35:
                boolean r3 = java.lang.Character.isLowSurrogate(r4)
                if (r3 == 0) goto L3c
                return r1
            L3c:
                int r7 = r7 + 1
                r3 = 1
                goto Lf
            L40:
                return r1
        }
    }

    private static class EmojiProcessAddSpanCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.UnprecomputeTextOnModificationSpannable> {
        private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
        public androidx.emoji2.text.UnprecomputeTextOnModificationSpannable spannable;

        EmojiProcessAddSpanCallback(androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r1, androidx.emoji2.text.EmojiCompat.SpanFactory r2) {
                r0 = this;
                r0.<init>()
                r0.spannable = r1
                r0.mSpanFactory = r2
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public androidx.emoji2.text.UnprecomputeTextOnModificationSpannable getResult() {
                r1 = this;
                androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r0 = r1.spannable
                return r0
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public /* bridge */ /* synthetic */ androidx.emoji2.text.UnprecomputeTextOnModificationSpannable getResult() {
                r1 = this;
                androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r0 = r1.getResult()
                return r0
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(java.lang.CharSequence r4, int r5, int r6, androidx.emoji2.text.TypefaceEmojiRasterizer r7) {
                r3 = this;
                boolean r0 = r7.isPreferredSystemRender()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r0 = r3.spannable
                if (r0 != 0) goto L20
                androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r0 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable
                boolean r2 = r4 instanceof android.text.Spannable
                if (r2 == 0) goto L15
                android.text.Spannable r4 = (android.text.Spannable) r4
                goto L1b
            L15:
                android.text.SpannableString r2 = new android.text.SpannableString
                r2.<init>(r4)
                r4 = r2
            L1b:
                r0.<init>(r4)
                r3.spannable = r0
            L20:
                androidx.emoji2.text.EmojiCompat$SpanFactory r4 = r3.mSpanFactory
                androidx.emoji2.text.EmojiSpan r4 = r4.createSpan(r7)
                androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r7 = r3.spannable
                r0 = 33
                r7.setSpan(r4, r5, r6, r0)
                return r1
        }
    }

    private interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(java.lang.CharSequence r1, int r2, int r3, androidx.emoji2.text.TypefaceEmojiRasterizer r4);
    }

    private static class EmojiProcessLookupCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback> {
        public int end;
        private final int mOffset;
        public int start;

        EmojiProcessLookupCallback(int r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.start = r0
                r1.end = r0
                r1.mOffset = r2
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback getResult() {
                r0 = this;
                return r0
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public /* bridge */ /* synthetic */ androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback getResult() {
                r1 = this;
                androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback r0 = r1.getResult()
                return r0
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(java.lang.CharSequence r1, int r2, int r3, androidx.emoji2.text.TypefaceEmojiRasterizer r4) {
                r0 = this;
                int r1 = r0.mOffset
                r4 = 0
                if (r2 > r1) goto Lc
                if (r1 >= r3) goto Lc
                r0.start = r2
                r0.end = r3
                return r4
            Lc:
                if (r3 > r1) goto Lf
                r4 = 1
            Lf:
                return r4
        }
    }

    private static class MarkExclusionCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback> {
        private final java.lang.String mExclusion;

        MarkExclusionCallback(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.mExclusion = r1
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback getResult() {
                r0 = this;
                return r0
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public /* bridge */ /* synthetic */ androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback getResult() {
                r1 = this;
                androidx.emoji2.text.EmojiProcessor$MarkExclusionCallback r0 = r1.getResult()
                return r0
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(java.lang.CharSequence r1, int r2, int r3, androidx.emoji2.text.TypefaceEmojiRasterizer r4) {
                r0 = this;
                java.lang.CharSequence r1 = r1.subSequence(r2, r3)
                java.lang.String r2 = r0.mExclusion
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                r2 = 1
                if (r1 == 0) goto L12
                r4.setExclusion(r2)
                r1 = 0
                return r1
            L12:
                return r2
        }
    }

    static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private androidx.emoji2.text.MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private androidx.emoji2.text.MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final androidx.emoji2.text.MetadataRepo.Node mRootNode;
        private int mState;
        private final boolean mUseEmojiAsDefaultStyle;

        ProcessorSm(androidx.emoji2.text.MetadataRepo.Node r2, boolean r3, int[] r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mState = r0
                r1.mRootNode = r2
                r1.mCurrentNode = r2
                r1.mUseEmojiAsDefaultStyle = r3
                r1.mEmojiAsDefaultStyleExceptions = r4
                return
        }

        private static boolean isEmojiStyle(int r1) {
                r0 = 65039(0xfe0f, float:9.1139E-41)
                if (r1 != r0) goto L7
                r1 = 1
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        private static boolean isTextStyle(int r1) {
                r0 = 65038(0xfe0e, float:9.1138E-41)
                if (r1 != r0) goto L7
                r1 = 1
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        private int reset() {
                r2 = this;
                r0 = 1
                r2.mState = r0
                androidx.emoji2.text.MetadataRepo$Node r1 = r2.mRootNode
                r2.mCurrentNode = r1
                r1 = 0
                r2.mCurrentDepth = r1
                return r0
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
                r4 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r0.getData()
                boolean r0 = r0.isDefaultEmoji()
                r1 = 1
                if (r0 == 0) goto Le
                return r1
            Le:
                int r0 = r4.mLastCodepoint
                boolean r0 = isEmojiStyle(r0)
                if (r0 == 0) goto L17
                return r1
            L17:
                boolean r0 = r4.mUseEmojiAsDefaultStyle
                r2 = 0
                if (r0 == 0) goto L34
                int[] r0 = r4.mEmojiAsDefaultStyleExceptions
                if (r0 != 0) goto L21
                return r1
            L21:
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r0.getData()
                int r0 = r0.getCodepointAt(r2)
                int[] r3 = r4.mEmojiAsDefaultStyleExceptions
                int r0 = java.util.Arrays.binarySearch(r3, r0)
                if (r0 >= 0) goto L34
                return r1
            L34:
                return r2
        }

        int check(int r5) {
                r4 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.MetadataRepo$Node r0 = r0.get(r5)
                int r1 = r4.mState
                r2 = 1
                r3 = 2
                if (r1 == r3) goto L1a
                if (r0 != 0) goto L13
                int r3 = r4.reset()
                goto L62
            L13:
                r4.mState = r3
                r4.mCurrentNode = r0
                r4.mCurrentDepth = r2
                goto L62
            L1a:
                if (r0 == 0) goto L24
                r4.mCurrentNode = r0
                int r0 = r4.mCurrentDepth
                int r0 = r0 + r2
                r4.mCurrentDepth = r0
                goto L62
            L24:
                boolean r0 = isTextStyle(r5)
                if (r0 == 0) goto L2f
                int r3 = r4.reset()
                goto L62
            L2f:
                boolean r0 = isEmojiStyle(r5)
                if (r0 == 0) goto L36
                goto L62
            L36:
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r0.getData()
                if (r0 == 0) goto L5e
                int r0 = r4.mCurrentDepth
                r3 = 3
                if (r0 != r2) goto L56
                boolean r0 = r4.shouldUseEmojiPresentationStyleForSingleCodepoint()
                if (r0 == 0) goto L51
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                r4.mFlushNode = r0
                r4.reset()
                goto L62
            L51:
                int r3 = r4.reset()
                goto L62
            L56:
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                r4.mFlushNode = r0
                r4.reset()
                goto L62
            L5e:
                int r3 = r4.reset()
            L62:
                r4.mLastCodepoint = r5
                return r3
        }

        androidx.emoji2.text.TypefaceEmojiRasterizer getCurrentMetadata() {
                r1 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r1.mCurrentNode
                androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r0.getData()
                return r0
        }

        androidx.emoji2.text.TypefaceEmojiRasterizer getFlushMetadata() {
                r1 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r1.mFlushNode
                androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r0.getData()
                return r0
        }

        boolean isInFlushableState() {
                r2 = this;
                int r0 = r2.mState
                r1 = 2
                if (r0 != r1) goto L19
                androidx.emoji2.text.MetadataRepo$Node r0 = r2.mCurrentNode
                androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r0.getData()
                if (r0 == 0) goto L19
                int r0 = r2.mCurrentDepth
                r1 = 1
                if (r0 > r1) goto L1a
                boolean r0 = r2.shouldUseEmojiPresentationStyleForSingleCodepoint()
                if (r0 == 0) goto L19
                goto L1a
            L19:
                r1 = 0
            L1a:
                return r1
        }
    }

    EmojiProcessor(androidx.emoji2.text.MetadataRepo r1, androidx.emoji2.text.EmojiCompat.SpanFactory r2, androidx.emoji2.text.EmojiCompat.GlyphChecker r3, boolean r4, int[] r5, java.util.Set<int[]> r6) {
            r0 = this;
            r0.<init>()
            r0.mSpanFactory = r2
            r0.mMetadataRepo = r1
            r0.mGlyphChecker = r3
            r0.mUseEmojiAsDefaultStyle = r4
            r0.mEmojiAsDefaultStyleExceptions = r5
            r0.initExclusions(r6)
            return
    }

    private static boolean delete(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
            boolean r7 = hasModifiers(r7)
            r0 = 0
            if (r7 == 0) goto L8
            return r0
        L8:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = hasInvalidSelection(r7, r1)
            if (r2 == 0) goto L17
            return r0
        L17:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r2 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            androidx.emoji2.text.EmojiSpan[] r1 = (androidx.emoji2.text.EmojiSpan[]) r1
            if (r1 == 0) goto L46
            int r2 = r1.length
            if (r2 <= 0) goto L46
            int r2 = r1.length
            r3 = r0
        L26:
            if (r3 >= r2) goto L46
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L36
            if (r5 == r7) goto L3e
        L36:
            if (r8 != 0) goto L3a
            if (r4 == r7) goto L3e
        L3a:
            if (r7 <= r5) goto L43
            if (r7 >= r4) goto L43
        L3e:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L43:
            int r3 = r3 + 1
            goto L26
        L46:
            return r0
    }

    static boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection r5, android.text.Editable r6, int r7, int r8, boolean r9) {
            r0 = 0
            if (r6 == 0) goto L7f
            if (r5 != 0) goto L7
            goto L7f
        L7:
            if (r7 < 0) goto L7f
            if (r8 >= 0) goto Ld
            goto L7f
        Ld:
            int r1 = android.text.Selection.getSelectionStart(r6)
            int r2 = android.text.Selection.getSelectionEnd(r6)
            boolean r3 = hasInvalidSelection(r1, r2)
            if (r3 == 0) goto L1c
            return r0
        L1c:
            if (r9 == 0) goto L34
            int r7 = java.lang.Math.max(r7, r0)
            int r7 = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexBackward(r6, r1, r7)
            int r8 = java.lang.Math.max(r8, r0)
            int r8 = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexForward(r6, r2, r8)
            r9 = -1
            if (r7 == r9) goto L33
            if (r8 != r9) goto L42
        L33:
            return r0
        L34:
            int r1 = r1 - r7
            int r7 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r8
            int r8 = r6.length()
            int r8 = java.lang.Math.min(r2, r8)
        L42:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r9 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r9 = r6.getSpans(r7, r8, r9)
            androidx.emoji2.text.EmojiSpan[] r9 = (androidx.emoji2.text.EmojiSpan[]) r9
            if (r9 == 0) goto L7f
            int r1 = r9.length
            if (r1 <= 0) goto L7f
            int r1 = r9.length
            r2 = r0
        L51:
            if (r2 >= r1) goto L68
            r3 = r9[r2]
            int r4 = r6.getSpanStart(r3)
            int r3 = r6.getSpanEnd(r3)
            int r7 = java.lang.Math.min(r4, r7)
            int r8 = java.lang.Math.max(r3, r8)
            int r2 = r2 + 1
            goto L51
        L68:
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r6.length()
            int r8 = java.lang.Math.min(r8, r9)
            r5.beginBatchEdit()
            r6.delete(r7, r8)
            r5.endBatchEdit()
            r5 = 1
            return r5
        L7f:
            return r0
    }

    static boolean handleOnKeyDown(android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r0 = 67
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L11
            r0 = 112(0x70, float:1.57E-43)
            if (r4 == r0) goto Lc
            r4 = r2
            goto L15
        Lc:
            boolean r4 = delete(r3, r5, r1)
            goto L15
        L11:
            boolean r4 = delete(r3, r5, r2)
        L15:
            if (r4 == 0) goto L1b
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r3)
            return r1
        L1b:
            return r2
    }

    private boolean hasGlyph(java.lang.CharSequence r3, int r4, int r5, androidx.emoji2.text.TypefaceEmojiRasterizer r6) {
            r2 = this;
            int r0 = r6.getHasGlyph()
            if (r0 != 0) goto L13
            androidx.emoji2.text.EmojiCompat$GlyphChecker r0 = r2.mGlyphChecker
            short r1 = r6.getSdkAdded()
            boolean r3 = r0.hasGlyph(r3, r4, r5, r1)
            r6.setHasGlyph(r3)
        L13:
            int r3 = r6.getHasGlyph()
            r4 = 2
            if (r3 != r4) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    private static boolean hasInvalidSelection(int r1, int r2) {
            r0 = -1
            if (r1 == r0) goto La
            if (r2 == r0) goto La
            if (r1 == r2) goto L8
            goto La
        L8:
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    private static boolean hasModifiers(android.view.KeyEvent r0) {
            int r0 = r0.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            r0 = r0 ^ 1
            return r0
    }

    private void initExclusions(java.util.Set<int[]> r9) {
            r8 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Iterator r9 = r9.iterator()
        Lb:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r9.next()
            int[] r0 = (int[]) r0
            java.lang.String r2 = new java.lang.String
            r1 = 0
            int r3 = r0.length
            r2.<init>(r0, r1, r3)
            androidx.emoji2.text.EmojiProcessor$MarkExclusionCallback r7 = new androidx.emoji2.text.EmojiProcessor$MarkExclusionCallback
            r7.<init>(r2)
            int r4 = r2.length()
            r5 = 1
            r6 = 1
            r3 = 0
            r1 = r8
            r1.process(r2, r3, r4, r5, r6, r7)
            goto Lb
        L2f:
            return
    }

    private <T> T process(java.lang.CharSequence r9, int r10, int r11, int r12, boolean r13, androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<T> r14) {
            r8 = this;
            androidx.emoji2.text.EmojiProcessor$ProcessorSm r0 = new androidx.emoji2.text.EmojiProcessor$ProcessorSm
            androidx.emoji2.text.MetadataRepo r1 = r8.mMetadataRepo
            androidx.emoji2.text.MetadataRepo$Node r1 = r1.getRootNode()
            boolean r2 = r8.mUseEmojiAsDefaultStyle
            int[] r3 = r8.mEmojiAsDefaultStyleExceptions
            r0.<init>(r1, r2, r3)
            int r1 = java.lang.Character.codePointAt(r9, r10)
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r3
            r2 = r1
        L18:
            r1 = r10
        L19:
            if (r10 >= r11) goto L62
            if (r4 >= r12) goto L62
            if (r5 == 0) goto L62
            int r6 = r0.check(r2)
            if (r6 == r3) goto L50
            r7 = 2
            if (r6 == r7) goto L44
            r7 = 3
            if (r6 == r7) goto L2c
            goto L19
        L2c:
            if (r13 != 0) goto L38
            androidx.emoji2.text.TypefaceEmojiRasterizer r6 = r0.getFlushMetadata()
            boolean r6 = r8.hasGlyph(r9, r1, r10, r6)
            if (r6 != 0) goto L18
        L38:
            androidx.emoji2.text.TypefaceEmojiRasterizer r5 = r0.getFlushMetadata()
            boolean r1 = r14.handleEmoji(r9, r1, r10, r5)
            int r4 = r4 + 1
            r5 = r1
            goto L18
        L44:
            int r6 = java.lang.Character.charCount(r2)
            int r10 = r10 + r6
            if (r10 >= r11) goto L19
            int r2 = java.lang.Character.codePointAt(r9, r10)
            goto L19
        L50:
            int r10 = java.lang.Character.codePointAt(r9, r1)
            int r10 = java.lang.Character.charCount(r10)
            int r1 = r1 + r10
            if (r1 >= r11) goto L60
            int r10 = java.lang.Character.codePointAt(r9, r1)
            r2 = r10
        L60:
            r10 = r1
            goto L19
        L62:
            boolean r11 = r0.isInFlushableState()
            if (r11 == 0) goto L7f
            if (r4 >= r12) goto L7f
            if (r5 == 0) goto L7f
            if (r13 != 0) goto L78
            androidx.emoji2.text.TypefaceEmojiRasterizer r11 = r0.getCurrentMetadata()
            boolean r11 = r8.hasGlyph(r9, r1, r10, r11)
            if (r11 != 0) goto L7f
        L78:
            androidx.emoji2.text.TypefaceEmojiRasterizer r11 = r0.getCurrentMetadata()
            r14.handleEmoji(r9, r1, r10, r11)
        L7f:
            java.lang.Object r9 = r14.getResult()
            return r9
    }

    int getEmojiEnd(java.lang.CharSequence r10, int r11) {
            r9 = this;
            if (r11 < 0) goto L49
            int r0 = r10.length()
            if (r11 < r0) goto L9
            goto L49
        L9:
            boolean r0 = r10 instanceof android.text.Spanned
            r1 = 0
            if (r0 == 0) goto L25
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r2 = r11 + 1
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r3 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r2 = r0.getSpans(r11, r2, r3)
            androidx.emoji2.text.EmojiSpan[] r2 = (androidx.emoji2.text.EmojiSpan[]) r2
            int r3 = r2.length
            if (r3 <= 0) goto L25
            r10 = r2[r1]
            int r10 = r0.getSpanEnd(r10)
            return r10
        L25:
            int r0 = r11 + (-16)
            int r4 = java.lang.Math.max(r1, r0)
            int r0 = r10.length()
            int r1 = r11 + 16
            int r5 = java.lang.Math.min(r0, r1)
            androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback r8 = new androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback
            r8.<init>(r11)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r2 = r9
            r3 = r10
            java.lang.Object r10 = r2.process(r3, r4, r5, r6, r7, r8)
            androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback r10 = (androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback) r10
            int r10 = r10.end
            return r10
        L49:
            r10 = -1
            return r10
    }

    int getEmojiMatch(java.lang.CharSequence r2) {
            r1 = this;
            androidx.emoji2.text.MetadataRepo r0 = r1.mMetadataRepo
            int r0 = r0.getMetadataVersion()
            int r2 = r1.getEmojiMatch(r2, r0)
            return r2
    }

    int getEmojiMatch(java.lang.CharSequence r12, int r13) {
            r11 = this;
            androidx.emoji2.text.EmojiProcessor$ProcessorSm r0 = new androidx.emoji2.text.EmojiProcessor$ProcessorSm
            androidx.emoji2.text.MetadataRepo r1 = r11.mMetadataRepo
            androidx.emoji2.text.MetadataRepo$Node r1 = r1.getRootNode()
            boolean r2 = r11.mUseEmojiAsDefaultStyle
            int[] r3 = r11.mEmojiAsDefaultStyleExceptions
            r0.<init>(r1, r2, r3)
            int r1 = r12.length()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L17:
            r6 = 2
            r7 = 1
            if (r3 >= r1) goto L53
            int r8 = java.lang.Character.codePointAt(r12, r3)
            int r9 = r0.check(r8)
            androidx.emoji2.text.TypefaceEmojiRasterizer r10 = r0.getCurrentMetadata()
            if (r9 == r7) goto L42
            if (r9 == r6) goto L3c
            r6 = 3
            if (r9 == r6) goto L2f
            goto L48
        L2f:
            androidx.emoji2.text.TypefaceEmojiRasterizer r10 = r0.getFlushMetadata()
            short r6 = r10.getCompatAdded()
            if (r6 > r13) goto L48
            int r4 = r4 + 1
            goto L48
        L3c:
            int r6 = java.lang.Character.charCount(r8)
            int r3 = r3 + r6
            goto L48
        L42:
            int r5 = java.lang.Character.charCount(r8)
            int r3 = r3 + r5
            r5 = r2
        L48:
            if (r10 == 0) goto L17
            short r6 = r10.getCompatAdded()
            if (r6 > r13) goto L17
            int r5 = r5 + 1
            goto L17
        L53:
            if (r4 == 0) goto L56
            return r6
        L56:
            boolean r12 = r0.isInFlushableState()
            if (r12 == 0) goto L67
            androidx.emoji2.text.TypefaceEmojiRasterizer r12 = r0.getCurrentMetadata()
            short r12 = r12.getCompatAdded()
            if (r12 > r13) goto L67
            return r7
        L67:
            if (r5 != 0) goto L6a
            return r2
        L6a:
            return r6
    }

    int getEmojiStart(java.lang.CharSequence r10, int r11) {
            r9 = this;
            if (r11 < 0) goto L49
            int r0 = r10.length()
            if (r11 < r0) goto L9
            goto L49
        L9:
            boolean r0 = r10 instanceof android.text.Spanned
            r1 = 0
            if (r0 == 0) goto L25
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r2 = r11 + 1
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r3 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r2 = r0.getSpans(r11, r2, r3)
            androidx.emoji2.text.EmojiSpan[] r2 = (androidx.emoji2.text.EmojiSpan[]) r2
            int r3 = r2.length
            if (r3 <= 0) goto L25
            r10 = r2[r1]
            int r10 = r0.getSpanStart(r10)
            return r10
        L25:
            int r0 = r11 + (-16)
            int r4 = java.lang.Math.max(r1, r0)
            int r0 = r10.length()
            int r1 = r11 + 16
            int r5 = java.lang.Math.min(r0, r1)
            androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback r8 = new androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback
            r8.<init>(r11)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r2 = r9
            r3 = r10
            java.lang.Object r10 = r2.process(r3, r4, r5, r6, r7, r8)
            androidx.emoji2.text.EmojiProcessor$EmojiProcessLookupCallback r10 = (androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback) r10
            int r10 = r10.start
            return r10
        L49:
            r10 = -1
            return r10
    }

    java.lang.CharSequence process(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji2.text.SpannableBuilder
            if (r0 == 0) goto La
            r1 = r10
            androidx.emoji2.text.SpannableBuilder r1 = (androidx.emoji2.text.SpannableBuilder) r1
            r1.beginBatchEdit()
        La:
            if (r0 != 0) goto L2c
            boolean r1 = r10 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto L11
            goto L2c
        L11:
            boolean r1 = r10 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto L2a
            r1 = r10
            android.text.Spanned r1 = (android.text.Spanned) r1     // Catch: java.lang.Throwable -> Lb3
            int r2 = r11 + (-1)
            int r3 = r12 + 1
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r4 = androidx.emoji2.text.EmojiSpan.class
            int r1 = r1.nextSpanTransition(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb3
            if (r1 > r12) goto L2a
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r1 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> Lb3
            r1.<init>(r10)     // Catch: java.lang.Throwable -> Lb3
            goto L34
        L2a:
            r1 = 0
            goto L34
        L2c:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r1 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> Lb3
            r2 = r10
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch: java.lang.Throwable -> Lb3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
        L34:
            r2 = 0
            if (r1 == 0) goto L62
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r3 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch: java.lang.Throwable -> Lb3
            androidx.emoji2.text.EmojiSpan[] r3 = (androidx.emoji2.text.EmojiSpan[]) r3     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L62
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lb3
            if (r4 <= 0) goto L62
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lb3
            r5 = r2
        L46:
            if (r5 >= r4) goto L62
            r6 = r3[r5]     // Catch: java.lang.Throwable -> Lb3
            int r7 = r1.getSpanStart(r6)     // Catch: java.lang.Throwable -> Lb3
            int r8 = r1.getSpanEnd(r6)     // Catch: java.lang.Throwable -> Lb3
            if (r7 == r12) goto L57
            r1.removeSpan(r6)     // Catch: java.lang.Throwable -> Lb3
        L57:
            int r11 = java.lang.Math.min(r7, r11)     // Catch: java.lang.Throwable -> Lb3
            int r12 = java.lang.Math.max(r8, r12)     // Catch: java.lang.Throwable -> Lb3
            int r5 = r5 + 1
            goto L46
        L62:
            r3 = r11
            r4 = r12
            if (r3 == r4) goto Laa
            int r11 = r10.length()     // Catch: java.lang.Throwable -> Lb3
            if (r3 < r11) goto L6d
            goto Laa
        L6d:
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r11) goto L82
            if (r1 == 0) goto L82
            int r11 = r1.length()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r12 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r11 = r1.getSpans(r2, r11, r12)     // Catch: java.lang.Throwable -> Lb3
            androidx.emoji2.text.EmojiSpan[] r11 = (androidx.emoji2.text.EmojiSpan[]) r11     // Catch: java.lang.Throwable -> Lb3
            int r11 = r11.length     // Catch: java.lang.Throwable -> Lb3
            int r13 = r13 - r11
        L82:
            r5 = r13
            androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback r7 = new androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback     // Catch: java.lang.Throwable -> Lb3
            androidx.emoji2.text.EmojiCompat$SpanFactory r11 = r9.mSpanFactory     // Catch: java.lang.Throwable -> Lb3
            r7.<init>(r1, r11)     // Catch: java.lang.Throwable -> Lb3
            r1 = r9
            r2 = r10
            r6 = r14
            java.lang.Object r11 = r1.process(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb3
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r11 = (androidx.emoji2.text.UnprecomputeTextOnModificationSpannable) r11     // Catch: java.lang.Throwable -> Lb3
            if (r11 == 0) goto La1
            android.text.Spannable r11 = r11.getUnwrappedSpannable()     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto La0
            androidx.emoji2.text.SpannableBuilder r10 = (androidx.emoji2.text.SpannableBuilder) r10
            r10.endBatchEdit()
        La0:
            return r11
        La1:
            if (r0 == 0) goto La9
            r11 = r10
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        La9:
            return r10
        Laa:
            if (r0 == 0) goto Lb2
            r11 = r10
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        Lb2:
            return r10
        Lb3:
            r11 = move-exception
            if (r0 == 0) goto Lbb
            androidx.emoji2.text.SpannableBuilder r10 = (androidx.emoji2.text.SpannableBuilder) r10
            r10.endBatchEdit()
        Lbb:
            throw r11
    }
}
