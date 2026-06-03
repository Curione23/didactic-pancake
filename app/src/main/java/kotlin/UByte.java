package kotlin;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u000fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0012J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010\u000bJ\u001b\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010\u0012J\u001b\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u001fJ\u001b\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u000fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0012J\u001b\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u000fJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0012J\u001b\u0010J\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0018J\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u000fJ\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0012J\u001b\u0010O\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001b\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0016\u0010l\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010\u0005J\u0016\u0010n\u001a\u00020\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0016\u0010p\u001a\u00020\u0013H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010cJ\u0016\u0010r\u001a\u00020\u0016H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010gJ\u001b\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class UByte implements java.lang.Comparable<kotlin.UByte> {
    public static final kotlin.UByte.Companion Companion = null;
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* JADX INFO: compiled from: UByte.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            kotlin.UByte$Companion r0 = new kotlin.UByte$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.UByte.Companion = r0
            return
    }

    private /* synthetic */ UByte(byte r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m778and7apg3OU(byte r0, byte r1) {
            r0 = r0 & r1
            byte r0 = (byte) r0
            byte r0 = m785constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m779boximpl(byte r1) {
            kotlin.UByte r0 = new kotlin.UByte
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m780compareTo7apg3OU(byte r2) {
            r1 = this;
            byte r0 = r1.m835unboximpl()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m781compareTo7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m782compareToVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            int r4 = java.lang.Long.compareUnsigned(r0, r5)
            return r4
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m783compareToWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = java.lang.Integer.compareUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m784compareToxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m785constructorimpl(byte r0) {
            return r0
    }

    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m786decw2LRezQ(byte r0) {
            int r0 = r0 + (-1)
            byte r0 = (byte) r0
            byte r0 = m785constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m787div7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m788divVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            long r4 = java.lang.Long.divideUnsigned(r0, r5)
            return r4
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m789divWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m790divxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r1 = java.lang.Integer.divideUnsigned(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m791equalsimpl(byte r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlin.UByte
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.UByte r3 = (kotlin.UByte) r3
            byte r3 = r3.m835unboximpl()
            if (r2 == r3) goto Lf
            return r1
        Lf:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m792equalsimpl0(byte r0, byte r1) {
            if (r0 != r1) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            return r0
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m793floorDiv7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m794floorDivVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            long r4 = java.lang.Long.divideUnsigned(r0, r5)
            return r4
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m795floorDivWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = java.lang.Integer.divideUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m796floorDivxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r1 = java.lang.Integer.divideUnsigned(r1, r2)
            return r1
    }

    public static /* synthetic */ void getData$annotations() {
            return
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m797hashCodeimpl(byte r0) {
            int r0 = java.lang.Byte.hashCode(r0)
            return r0
    }

    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m798incw2LRezQ(byte r0) {
            int r0 = r0 + 1
            byte r0 = (byte) r0
            byte r0 = m785constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m799invw2LRezQ(byte r0) {
            int r0 = ~r0
            byte r0 = (byte) r0
            byte r0 = m785constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m800minus7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            int r0 = r0 - r1
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m801minusVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            long r0 = r0 - r5
            long r4 = kotlin.ULong.m941constructorimpl(r0)
            return r4
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m802minusWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = r0 - r1
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m803minusxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r1 = r1 - r2
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            return r1
    }

    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m804mod7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r1)
            byte r0 = (byte) r0
            byte r0 = m785constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m805modVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            long r4 = java.lang.Long.remainderUnsigned(r0, r5)
            return r4
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m806modWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m807modxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r1 = java.lang.Integer.remainderUnsigned(r1, r2)
            short r1 = (short) r1
            short r1 = kotlin.UShort.m1048constructorimpl(r1)
            return r1
    }

    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m808or7apg3OU(byte r0, byte r1) {
            r0 = r0 | r1
            byte r0 = (byte) r0
            byte r0 = m785constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m809plus7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            int r0 = r0 + r1
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m810plusVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            long r0 = r0 + r5
            long r4 = kotlin.ULong.m941constructorimpl(r0)
            return r4
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m811plusWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = r0 + r1
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m812plusxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r1 = r1 + r2
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            return r1
    }

    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final kotlin.ranges.UIntRange m813rangeTo7apg3OU(byte r2, byte r3) {
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = kotlin.UInt.m862constructorimpl(r3)
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final kotlin.ranges.UIntRange m814rangeUntil7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            kotlin.ranges.UIntRange r0 = kotlin.ranges.URangesKt.m2034untilJ1ME1BU(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m815rem7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m816remVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            long r4 = java.lang.Long.remainderUnsigned(r0, r5)
            return r4
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m817remWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = java.lang.Integer.remainderUnsigned(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m818remxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r1 = java.lang.Integer.remainderUnsigned(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m819times7apg3OU(byte r0, byte r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            int r0 = r0 * r1
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m820timesVKZWuLQ(byte r4, long r5) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            long r0 = r0 * r5
            long r4 = kotlin.ULong.m941constructorimpl(r0)
            return r4
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m821timesWZ4Q5Ns(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = r0 * r1
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m822timesxj2QHRw(byte r1, short r2) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r1 = r1 * r2
            int r1 = kotlin.UInt.m862constructorimpl(r1)
            return r1
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m823toByteimpl(byte r0) {
            return r0
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m824toDoubleimpl(byte r2) {
            r2 = r2 & 255(0xff, float:3.57E-43)
            double r0 = (double) r2
            return r0
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m825toFloatimpl(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            return r0
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m826toIntimpl(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m827toLongimpl(byte r4) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            return r0
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m828toShortimpl(byte r0) {
            short r0 = (short) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m829toStringimpl(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m830toUBytew2LRezQ(byte r0) {
            return r0
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m831toUIntpVg5ArA(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m832toULongsVKNKU(byte r4) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m833toUShortMh2AYeg(byte r0) {
            short r0 = (short) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            short r0 = kotlin.UShort.m1048constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m834xor7apg3OU(byte r0, byte r1) {
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            byte r0 = m785constructorimpl(r0)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.UByte r2) {
            r1 = this;
            kotlin.UByte r2 = (kotlin.UByte) r2
            byte r2 = r2.m835unboximpl()
            byte r0 = r1.m835unboximpl()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            byte r0 = r1.data
            boolean r2 = m791equalsimpl(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            byte r0 = r1.data
            int r0 = m797hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            byte r0 = r1.data
            java.lang.String r0 = m829toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m835unboximpl() {
            r1 = this;
            byte r0 = r1.data
            return r0
    }
}
