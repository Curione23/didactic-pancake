package okio;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", "index", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Options extends kotlin.collections.AbstractList<okio.ByteString> implements java.util.RandomAccess {
    public static final okio.Options.Companion Companion = null;
    private final okio.ByteString[] byteStrings;
    private final int[] trie;

    /* JADX INFO: compiled from: Options.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        private final void buildTrieRecursive(long r21, okio.Buffer r23, int r24, java.util.List<? extends okio.ByteString> r25, int r26, int r27, java.util.List<java.lang.Integer> r28) {
                r20 = this;
                r9 = r20
                r10 = r23
                r11 = r24
                r12 = r25
                r0 = r26
                r13 = r27
                r14 = r28
                java.lang.String r1 = "Failed requirement."
                if (r0 >= r13) goto L1c7
                r2 = r0
            L13:
                if (r2 >= r13) goto L2e
                java.lang.Object r3 = r12.get(r2)
                okio.ByteString r3 = (okio.ByteString) r3
                int r3 = r3.size()
                if (r3 < r11) goto L24
                int r2 = r2 + 1
                goto L13
            L24:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L2e:
                java.lang.Object r1 = r25.get(r26)
                okio.ByteString r1 = (okio.ByteString) r1
                int r2 = r13 + (-1)
                java.lang.Object r2 = r12.get(r2)
                okio.ByteString r2 = (okio.ByteString) r2
                int r3 = r1.size()
                r15 = -1
                if (r11 != r3) goto L59
                java.lang.Object r1 = r14.get(r0)
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                int r0 = r0 + 1
                java.lang.Object r3 = r12.get(r0)
                okio.ByteString r3 = (okio.ByteString) r3
                r6 = r0
                r0 = r1
                r1 = r3
                goto L5b
            L59:
                r6 = r0
                r0 = r15
            L5b:
                byte r3 = r1.getByte(r11)
                byte r4 = r2.getByte(r11)
                r5 = 2
                if (r3 == r4) goto L137
                int r1 = r6 + 1
                r2 = 1
            L69:
                if (r1 >= r13) goto L88
                int r3 = r1 + (-1)
                java.lang.Object r3 = r12.get(r3)
                okio.ByteString r3 = (okio.ByteString) r3
                byte r3 = r3.getByte(r11)
                java.lang.Object r4 = r12.get(r1)
                okio.ByteString r4 = (okio.ByteString) r4
                byte r4 = r4.getByte(r11)
                if (r3 == r4) goto L85
                int r2 = r2 + 1
            L85:
                int r1 = r1 + 1
                goto L69
            L88:
                long r3 = r9.getIntCount(r10)
                long r3 = r21 + r3
                long r7 = (long) r5
                long r3 = r3 + r7
                int r1 = r2 * 2
                long r7 = (long) r1
                long r16 = r3 + r7
                r10.writeInt(r2)
                r10.writeInt(r0)
                r0 = r6
            L9c:
                if (r0 >= r13) goto Lc0
                java.lang.Object r1 = r12.get(r0)
                okio.ByteString r1 = (okio.ByteString) r1
                byte r1 = r1.getByte(r11)
                if (r0 == r6) goto Lb8
                int r2 = r0 + (-1)
                java.lang.Object r2 = r12.get(r2)
                okio.ByteString r2 = (okio.ByteString) r2
                byte r2 = r2.getByte(r11)
                if (r1 == r2) goto Lbd
            Lb8:
                r1 = r1 & 255(0xff, float:3.57E-43)
                r10.writeInt(r1)
            Lbd:
                int r0 = r0 + 1
                goto L9c
            Lc0:
                okio.Buffer r8 = new okio.Buffer
                r8.<init>()
            Lc5:
                if (r6 >= r13) goto L12c
                java.lang.Object r0 = r12.get(r6)
                okio.ByteString r0 = (okio.ByteString) r0
                byte r0 = r0.getByte(r11)
                int r1 = r6 + 1
                r2 = r1
            Ld4:
                if (r2 >= r13) goto Le7
                java.lang.Object r3 = r12.get(r2)
                okio.ByteString r3 = (okio.ByteString) r3
                byte r3 = r3.getByte(r11)
                if (r0 == r3) goto Le4
                r7 = r2
                goto Le8
            Le4:
                int r2 = r2 + 1
                goto Ld4
            Le7:
                r7 = r13
            Le8:
                if (r1 != r7) goto L10a
                int r0 = r11 + 1
                java.lang.Object r1 = r12.get(r6)
                okio.ByteString r1 = (okio.ByteString) r1
                int r1 = r1.size()
                if (r0 != r1) goto L10a
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.writeInt(r0)
                r18 = r7
                r19 = r8
                goto L127
            L10a:
                long r0 = r9.getIntCount(r8)
                long r0 = r16 + r0
                int r0 = (int) r0
                int r0 = r0 * r15
                r10.writeInt(r0)
                int r4 = r11 + 1
                r0 = r20
                r1 = r16
                r3 = r8
                r5 = r25
                r18 = r7
                r19 = r8
                r8 = r28
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
            L127:
                r6 = r18
                r8 = r19
                goto Lc5
            L12c:
                r19 = r8
                r8 = r19
                okio.Source r8 = (okio.Source) r8
                r10.writeAll(r8)
                goto L1c6
            L137:
                int r3 = r1.size()
                int r4 = r2.size()
                int r3 = java.lang.Math.min(r3, r4)
                r4 = 0
                r7 = r11
            L145:
                if (r7 >= r3) goto L157
                byte r8 = r1.getByte(r7)
                byte r15 = r2.getByte(r7)
                if (r8 != r15) goto L157
                int r4 = r4 + 1
                int r7 = r7 + 1
                r15 = -1
                goto L145
            L157:
                long r2 = r9.getIntCount(r10)
                long r2 = r21 + r2
                long r7 = (long) r5
                long r2 = r2 + r7
                long r7 = (long) r4
                long r2 = r2 + r7
                r7 = 1
                long r2 = r2 + r7
                int r5 = -r4
                r10.writeInt(r5)
                r10.writeInt(r0)
                int r4 = r4 + r11
            L16c:
                if (r11 >= r4) goto L17a
                byte r0 = r1.getByte(r11)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r10.writeInt(r0)
                int r11 = r11 + 1
                goto L16c
            L17a:
                int r0 = r6 + 1
                if (r0 != r13) goto L1a4
                java.lang.Object r0 = r12.get(r6)
                okio.ByteString r0 = (okio.ByteString) r0
                int r0 = r0.size()
                if (r4 != r0) goto L198
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.writeInt(r0)
                goto L1c6
            L198:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Check failed."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L1a4:
                okio.Buffer r11 = new okio.Buffer
                r11.<init>()
                long r0 = r9.getIntCount(r11)
                long r0 = r0 + r2
                int r0 = (int) r0
                r1 = -1
                int r0 = r0 * r1
                r10.writeInt(r0)
                r0 = r20
                r1 = r2
                r3 = r11
                r5 = r25
                r7 = r27
                r8 = r28
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
                okio.Source r11 = (okio.Source) r11
                r10.writeAll(r11)
            L1c6:
                return
            L1c7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        static /* synthetic */ void buildTrieRecursive$default(okio.Options.Companion r11, long r12, okio.Buffer r14, int r15, java.util.List r16, int r17, int r18, java.util.List r19, int r20, java.lang.Object r21) {
                r0 = r20 & 1
                if (r0 == 0) goto L8
                r0 = 0
                r3 = r0
                goto L9
            L8:
                r3 = r12
            L9:
                r0 = r20 & 4
                r1 = 0
                if (r0 == 0) goto L10
                r6 = r1
                goto L11
            L10:
                r6 = r15
            L11:
                r0 = r20 & 16
                if (r0 == 0) goto L17
                r8 = r1
                goto L19
            L17:
                r8 = r17
            L19:
                r0 = r20 & 32
                if (r0 == 0) goto L23
                int r0 = r16.size()
                r9 = r0
                goto L25
            L23:
                r9 = r18
            L25:
                r2 = r11
                r5 = r14
                r7 = r16
                r10 = r19
                r2.buildTrieRecursive(r3, r5, r6, r7, r8, r9, r10)
                return
        }

        private final long getIntCount(okio.Buffer r5) {
                r4 = this;
                long r0 = r5.size()
                r5 = 4
                long r2 = (long) r5
                long r0 = r0 / r2
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.Options of(okio.ByteString... r17) {
                r16 = this;
                r0 = r17
                java.lang.String r1 = "byteStrings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                int r1 = r0.length
                r2 = 0
                r3 = -1
                r4 = 0
                if (r1 != 0) goto L19
                okio.Options r0 = new okio.Options
                okio.ByteString[] r1 = new okio.ByteString[r4]
                int[] r3 = new int[]{r4, r3}
                r0.<init>(r1, r3, r2)
                return r0
            L19:
                java.util.List r1 = kotlin.collections.ArraysKt.toMutableList(r17)
                kotlin.collections.CollectionsKt.sort(r1)
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r0.length
                r5.<init>(r6)
                java.util.Collection r5 = (java.util.Collection) r5
                int r6 = r0.length
                r7 = r4
            L2a:
                if (r7 >= r6) goto L38
                r8 = r0[r7]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
                r5.add(r8)
                int r7 = r7 + 1
                goto L2a
            L38:
                java.util.List r5 = (java.util.List) r5
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Integer[] r3 = new java.lang.Integer[r4]
                java.lang.Object[] r3 = r5.toArray(r3)
                java.lang.Integer[] r3 = (java.lang.Integer[]) r3
                int r5 = r3.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r5)
                java.util.List r13 = kotlin.collections.CollectionsKt.mutableListOf(r3)
                int r3 = r0.length
                r11 = r4
                r12 = r11
            L50:
                if (r11 >= r3) goto L6d
                r5 = r0[r11]
                int r14 = r12 + 1
                r6 = r5
                java.lang.Comparable r6 = (java.lang.Comparable) r6
                r9 = 6
                r10 = 0
                r7 = 0
                r8 = 0
                r5 = r1
                int r5 = kotlin.collections.CollectionsKt.binarySearch$default(r5, r6, r7, r8, r9, r10)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
                r13.set(r5, r6)
                int r11 = r11 + 1
                r12 = r14
                goto L50
            L6d:
                java.lang.Object r3 = r1.get(r4)
                okio.ByteString r3 = (okio.ByteString) r3
                int r3 = r3.size()
                if (r3 <= 0) goto L11f
                r3 = r4
            L7a:
                int r5 = r1.size()
                if (r3 >= r5) goto Le0
                java.lang.Object r5 = r1.get(r3)
                okio.ByteString r5 = (okio.ByteString) r5
                int r6 = r3 + 1
                r7 = r6
            L89:
                int r8 = r1.size()
                if (r7 >= r8) goto Lde
                java.lang.Object r8 = r1.get(r7)
                okio.ByteString r8 = (okio.ByteString) r8
                boolean r9 = r8.startsWith(r5)
                if (r9 == 0) goto Lde
                int r9 = r8.size()
                int r10 = r5.size()
                if (r9 == r10) goto Lc5
                java.lang.Object r8 = r13.get(r7)
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                java.lang.Object r9 = r13.get(r3)
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r8 <= r9) goto Lc2
                r1.remove(r7)
                r13.remove(r7)
                goto L89
            Lc2:
                int r7 = r7 + 1
                goto L89
            Lc5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "duplicate option: "
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r0.append(r8)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            Lde:
                r3 = r6
                goto L7a
            Le0:
                okio.Buffer r3 = new okio.Buffer
                r3.<init>()
                r14 = 53
                r15 = 0
                r6 = 0
                r9 = 0
                r11 = 0
                r12 = 0
                r5 = r16
                r8 = r3
                r10 = r1
                buildTrieRecursive$default(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
                r1 = r16
                long r5 = r1.getIntCount(r3)
                int r5 = (int) r5
                int[] r5 = new int[r5]
            Lfd:
                boolean r6 = r3.exhausted()
                if (r6 != 0) goto L10d
                int r6 = r4 + 1
                int r7 = r3.readInt()
                r5[r4] = r7
                r4 = r6
                goto Lfd
            L10d:
                okio.Options r3 = new okio.Options
                int r4 = r0.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
                java.lang.String r4 = "copyOf(this, size)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
                okio.ByteString[] r0 = (okio.ByteString[]) r0
                r3.<init>(r0, r5, r2)
                return r3
            L11f:
                r1 = r16
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "the empty byte string is not a supported option"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
        }
    }

    static {
            okio.Options$Companion r0 = new okio.Options$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Options.Companion = r0
            return
    }

    private Options(okio.ByteString[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.byteStrings = r1
            r0.trie = r2
            return
    }

    public /* synthetic */ Options(okio.ByteString[] r1, int[] r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Options of(okio.ByteString... r1) {
            okio.Options$Companion r0 = okio.Options.Companion
            okio.Options r1 = r0.of(r1)
            return r1
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(okio.ByteString r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            okio.ByteString r1 = r0.get(r1)
            return r1
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public okio.ByteString get(int r2) {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            r2 = r0[r2]
            return r2
    }

    public final okio.ByteString[] getByteStrings$okio() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            int r0 = r0.length
            return r0
    }

    public final int[] getTrie$okio() {
            r1 = this;
            int[] r0 = r1.trie
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int indexOf(okio.ByteString r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(okio.ByteString r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }
}
