package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class SpannableBuilder extends android.text.SpannableStringBuilder {
    private final java.lang.Class<?> mWatcherClass;
    private final java.util.List<androidx.emoji2.text.SpannableBuilder.WatcherWrapper> mWatchers;

    private static class WatcherWrapper implements android.text.TextWatcher, android.text.SpanWatcher {
        private final java.util.concurrent.atomic.AtomicInteger mBlockCalls;
        final java.lang.Object mObject;

        WatcherWrapper(java.lang.Object r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 0
                r0.<init>(r1)
                r2.mBlockCalls = r0
                r2.mObject = r3
                return
        }

        private boolean isEmojiSpan(java.lang.Object r1) {
                r0 = this;
                boolean r1 = r1 instanceof androidx.emoji2.text.EmojiSpan
                return r1
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r2) {
                r1 = this;
                java.lang.Object r0 = r1.mObject
                android.text.TextWatcher r0 = (android.text.TextWatcher) r0
                r0.afterTextChanged(r2)
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
                r1 = this;
                java.lang.Object r0 = r1.mObject
                android.text.TextWatcher r0 = (android.text.TextWatcher) r0
                r0.beforeTextChanged(r2, r3, r4, r5)
                return
        }

        final void blockCalls() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.mBlockCalls
                r0.incrementAndGet()
                return
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(android.text.Spannable r2, java.lang.Object r3, int r4, int r5) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.mBlockCalls
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r1.isEmojiSpan(r3)
                if (r0 == 0) goto Lf
                return
            Lf:
                java.lang.Object r0 = r1.mObject
                android.text.SpanWatcher r0 = (android.text.SpanWatcher) r0
                r0.onSpanAdded(r2, r3, r4, r5)
                return
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
                r8 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r8.mBlockCalls
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r8.isEmojiSpan(r10)
                if (r0 == 0) goto Lf
                return
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L1e
                r0 = 0
                if (r11 <= r12) goto L19
                r11 = r0
            L19:
                if (r13 <= r14) goto L1e
                r4 = r11
                r6 = r0
                goto L20
            L1e:
                r4 = r11
                r6 = r13
            L20:
                java.lang.Object r11 = r8.mObject
                r1 = r11
                android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
                r2 = r9
                r3 = r10
                r5 = r12
                r7 = r14
                r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(android.text.Spannable r2, java.lang.Object r3, int r4, int r5) {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.mBlockCalls
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r1.isEmojiSpan(r3)
                if (r0 == 0) goto Lf
                return
            Lf:
                java.lang.Object r0 = r1.mObject
                android.text.SpanWatcher r0 = (android.text.SpanWatcher) r0
                r0.onSpanRemoved(r2, r3, r4, r5)
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
                r1 = this;
                java.lang.Object r0 = r1.mObject
                android.text.TextWatcher r0 = (android.text.TextWatcher) r0
                r0.onTextChanged(r2, r3, r4, r5)
                return
        }

        final void unblockCalls() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.mBlockCalls
                r0.decrementAndGet()
                return
        }
    }

    SpannableBuilder(java.lang.Class<?> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mWatchers = r0
            java.lang.String r0 = "watcherClass cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            r1.mWatcherClass = r2
            return
    }

    SpannableBuilder(java.lang.Class<?> r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mWatchers = r2
            java.lang.String r2 = "watcherClass cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r1, r2)
            r0.mWatcherClass = r1
            return
    }

    SpannableBuilder(java.lang.Class<?> r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mWatchers = r2
            java.lang.String r2 = "watcherClass cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r1, r2)
            r0.mWatcherClass = r1
            return
    }

    private void blockWatchers() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r1 = r2.mWatchers
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r1 = r2.mWatchers
            java.lang.Object r1 = r1.get(r0)
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r1 = (androidx.emoji2.text.SpannableBuilder.WatcherWrapper) r1
            r1.blockCalls()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    public static androidx.emoji2.text.SpannableBuilder create(java.lang.Class<?> r1, java.lang.CharSequence r2) {
            androidx.emoji2.text.SpannableBuilder r0 = new androidx.emoji2.text.SpannableBuilder
            r0.<init>(r1, r2)
            return r0
    }

    private void fireWatchers() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r2 = r5.mWatchers
            int r2 = r2.size()
            if (r1 >= r2) goto L20
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r2 = r5.mWatchers
            java.lang.Object r2 = r2.get(r1)
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r2 = (androidx.emoji2.text.SpannableBuilder.WatcherWrapper) r2
            int r3 = r5.length()
            int r4 = r5.length()
            r2.onTextChanged(r5, r0, r3, r4)
            int r1 = r1 + 1
            goto L2
        L20:
            return
    }

    private androidx.emoji2.text.SpannableBuilder.WatcherWrapper getWatcherFor(java.lang.Object r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r1 = r3.mWatchers
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r1 = r3.mWatchers
            java.lang.Object r1 = r1.get(r0)
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r1 = (androidx.emoji2.text.SpannableBuilder.WatcherWrapper) r1
            java.lang.Object r2 = r1.mObject
            if (r2 != r4) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r4 = 0
            return r4
    }

    private boolean isWatcher(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<?> r0 = r1.mWatcherClass
            if (r0 != r2) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    private boolean isWatcher(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto Le
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r0.isWatcher(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private void unblockwatchers() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r1 = r2.mWatchers
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r1 = r2.mWatchers
            java.lang.Object r1 = r1.get(r0)
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r1 = (androidx.emoji2.text.SpannableBuilder.WatcherWrapper) r1
            r1.unblockCalls()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ android.text.Editable append(char r1) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ android.text.Editable append(java.lang.CharSequence r1) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ android.text.Editable append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(char r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(java.lang.CharSequence r1) {
            r0 = this;
            super.append(r1)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder
    public android.text.SpannableStringBuilder append(java.lang.CharSequence r1, java.lang.Object r2, int r3) {
            r0 = this;
            super.append(r1, r2, r3)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.append(r1, r2, r3)
            return r1
    }

    public void beginBatchEdit() {
            r0 = this;
            r0.blockWatchers()
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ android.text.Editable delete(int r1, int r2) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.delete(r1, r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder delete(int r1, int r2) {
            r0 = this;
            super.delete(r1, r2)
            return r0
    }

    public void endBatchEdit() {
            r0 = this;
            r0.unblockwatchers()
            r0.fireWatchers()
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isWatcher(r2)
            if (r0 == 0) goto Ld
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r0 = r1.getWatcherFor(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isWatcher(r2)
            if (r0 == 0) goto Ld
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r0 = r1.getWatcherFor(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isWatcher(r2)
            if (r0 == 0) goto Ld
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r0 = r1.getWatcherFor(r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            int r2 = super.getSpanStart(r2)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int r2, int r3, java.lang.Class<T> r4) {
            r1 = this;
            boolean r0 = r1.isWatcher(r4)
            if (r0 == 0) goto L23
            java.lang.Class<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r0 = androidx.emoji2.text.SpannableBuilder.WatcherWrapper.class
            java.lang.Object[] r2 = super.getSpans(r2, r3, r0)
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper[] r2 = (androidx.emoji2.text.SpannableBuilder.WatcherWrapper[]) r2
            int r3 = r2.length
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r4, r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L16:
            int r0 = r2.length
            if (r4 >= r0) goto L22
            r0 = r2[r4]
            java.lang.Object r0 = r0.mObject
            r3[r4] = r0
            int r4 = r4 + 1
            goto L16
        L22:
            return r3
        L23:
            java.lang.Object[] r2 = super.getSpans(r2, r3, r4)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ android.text.Editable insert(int r1, java.lang.CharSequence r2) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.insert(r1, r2)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ android.text.Editable insert(int r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.insert(r1, r2, r3, r4)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder insert(int r1, java.lang.CharSequence r2) {
            r0 = this;
            super.insert(r1, r2)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder insert(int r1, java.lang.CharSequence r2, int r3, int r4) {
            r0 = this;
            super.insert(r1, r2, r3, r4)
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            if (r4 == 0) goto L8
            boolean r0 = r1.isWatcher(r4)
            if (r0 == 0) goto La
        L8:
            java.lang.Class<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r4 = androidx.emoji2.text.SpannableBuilder.WatcherWrapper.class
        La:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.isWatcher(r2)
            if (r0 == 0) goto Le
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r0 = r1.getWatcherFor(r2)
            if (r0 == 0) goto Lf
            r2 = r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            super.removeSpan(r2)
            if (r0 == 0) goto L19
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r2 = r1.mWatchers
            r2.remove(r0)
        L19:
            return
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ android.text.Editable replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.replace(r1, r2, r3)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public /* bridge */ /* synthetic */ android.text.Editable replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            android.text.SpannableStringBuilder r1 = r0.replace(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.blockWatchers()
            super.replace(r1, r2, r3)
            r0.unblockwatchers()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int r1, int r2, java.lang.CharSequence r3, int r4, int r5) {
            r0 = this;
            r0.blockWatchers()
            super.replace(r1, r2, r3, r4, r5)
            r0.unblockwatchers()
            return r0
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(java.lang.Object r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.isWatcher(r2)
            if (r0 == 0) goto L11
            androidx.emoji2.text.SpannableBuilder$WatcherWrapper r0 = new androidx.emoji2.text.SpannableBuilder$WatcherWrapper
            r0.<init>(r2)
            java.util.List<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r2 = r1.mWatchers
            r2.add(r0)
            r2 = r0
        L11:
            super.setSpan(r2, r3, r4, r5)
            return
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r3, int r4) {
            r2 = this;
            androidx.emoji2.text.SpannableBuilder r0 = new androidx.emoji2.text.SpannableBuilder
            java.lang.Class<?> r1 = r2.mWatcherClass
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
