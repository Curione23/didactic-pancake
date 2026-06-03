package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u001b\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u001b\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010jJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J!\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0018\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class Duration implements java.lang.Comparable<kotlin.time.Duration> {
    public static final kotlin.time.Duration.Companion Companion = null;
    private static final long INFINITE = 0;
    private static final long NEG_INFINITE = 0;
    private static final long ZERO = 0;
    private final long rawValue;

    /* JADX INFO: compiled from: Duration.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u001b\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u001b\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b>J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R%\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R%\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R%\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R%\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R%\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R%\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R%\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R%\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R%\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R%\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R%\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R%\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R%\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2148getDaysUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2149getDaysUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2150getDaysUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2151getDaysUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2152getDaysUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2153getDaysUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2154getHoursUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2155getHoursUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2156getHoursUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2157getHoursUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2158getHoursUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2159getHoursUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2160getMicrosecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2161getMicrosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2162getMicrosecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2163getMicrosecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2164getMicrosecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2165getMicrosecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2166getMillisecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2167getMillisecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2168getMillisecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2169getMillisecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2170getMillisecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2171getMillisecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2172getMinutesUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2173getMinutesUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2174getMinutesUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2175getMinutesUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2176getMinutesUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2177getMinutesUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2178getNanosecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2179getNanosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2180getNanosecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2181getNanosecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2182getNanosecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2183getNanosecondsUwyO8pc$annotations(long r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2184getSecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2185getSecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2186getSecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2187getSecondsUwyO8pc$annotations(double r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2188getSecondsUwyO8pc$annotations(int r0) {
                return
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2189getSecondsUwyO8pc$annotations(long r0) {
                return
        }

        public final double convert(double r2, kotlin.time.DurationUnit r4, kotlin.time.DurationUnit r5) {
                r1 = this;
                java.lang.String r0 = "sourceUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "targetUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                double r2 = kotlin.time.DurationUnitKt.convertDurationUnit(r2, r4, r5)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2190daysUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2191daysUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2192daysUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m2193getINFINITEUwyO8pc() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getINFINITE$cp()
                return r0
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m2194getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getNEG_INFINITE$cp()
                return r0
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m2195getZEROUwyO8pc() {
                r2 = this;
                long r0 = kotlin.time.Duration.access$getZERO$cp()
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2196hoursUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2197hoursUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2198hoursUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2199microsecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2200microsecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2201microsecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2202millisecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2203millisecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2204millisecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2205minutesUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2206minutesUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2207minutesUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2208nanosecondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2209nanosecondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2210nanosecondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m2211parseUwyO8pc(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 0
                long r0 = kotlin.time.DurationKt.access$parseDuration(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lb
                return r0
            Lb:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Invalid duration string format: '"
                r2.<init>(r3)
                java.lang.StringBuilder r5 = r2.append(r5)
                java.lang.String r2 = "'."
                java.lang.StringBuilder r5 = r5.append(r2)
                java.lang.String r5 = r5.toString()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r1.<init>(r5, r0)
                throw r1
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m2212parseIsoStringUwyO8pc(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = 1
                long r0 = kotlin.time.DurationKt.access$parseDuration(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lb
                return r0
            Lb:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Invalid ISO duration string format: '"
                r2.<init>(r3)
                java.lang.StringBuilder r5 = r2.append(r5)
                java.lang.String r2 = "'."
                java.lang.StringBuilder r5 = r5.append(r2)
                java.lang.String r5 = r5.toString()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r1.<init>(r5, r0)
                throw r1
        }

        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m2213parseIsoStringOrNullFghU774(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 1
                long r0 = kotlin.time.DurationKt.access$parseDuration(r3, r0)     // Catch: java.lang.IllegalArgumentException -> Lf
                kotlin.time.Duration r3 = kotlin.time.Duration.m2090boximpl(r0)     // Catch: java.lang.IllegalArgumentException -> Lf
                goto L10
            Lf:
                r3 = 0
            L10:
                return r3
        }

        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m2214parseOrNullFghU774(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                long r0 = kotlin.time.DurationKt.access$parseDuration(r3, r0)     // Catch: java.lang.IllegalArgumentException -> Lf
                kotlin.time.Duration r3 = kotlin.time.Duration.m2090boximpl(r0)     // Catch: java.lang.IllegalArgumentException -> Lf
                goto L10
            Lf:
                r3 = 0
            L10:
                return r3
        }

        @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2215secondsUwyO8pc(double r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }

        @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2216secondsUwyO8pc(int r3) {
                r2 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r0 = kotlin.time.DurationKt.toDuration(r3, r0)
                return r0
        }

        @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m2217secondsUwyO8pc(long r2) {
                r1 = this;
                kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                long r2 = kotlin.time.DurationKt.toDuration(r2, r0)
                return r2
        }
    }

    static {
            kotlin.time.Duration$Companion r0 = new kotlin.time.Duration$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.time.Duration.Companion = r0
            r0 = 0
            long r0 = m2092constructorimpl(r0)
            kotlin.time.Duration.ZERO = r0
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.INFINITE = r0
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            kotlin.time.Duration.NEG_INFINITE = r0
            return
    }

    private /* synthetic */ Duration(long r1) {
            r0 = this;
            r0.<init>()
            r0.rawValue = r1
            return
    }

    public static final /* synthetic */ long access$getINFINITE$cp() {
            long r0 = kotlin.time.Duration.INFINITE
            return r0
    }

    public static final /* synthetic */ long access$getNEG_INFINITE$cp() {
            long r0 = kotlin.time.Duration.NEG_INFINITE
            return r0
    }

    public static final /* synthetic */ long access$getZERO$cp() {
            long r0 = kotlin.time.Duration.ZERO
            return r0
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m2088addValuesMixedRangesUwyO8pc(long r6, long r8, long r10) {
            long r6 = kotlin.time.DurationKt.access$nanosToMillis(r10)
            long r0 = r8 + r6
            kotlin.ranges.LongRange r8 = new kotlin.ranges.LongRange
            r2 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r4 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r8.<init>(r2, r4)
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L2a
            long r6 = kotlin.time.DurationKt.access$millisToNanos(r6)
            long r10 = r10 - r6
            long r6 = kotlin.time.DurationKt.access$millisToNanos(r0)
            long r6 = r6 + r10
            long r6 = kotlin.time.DurationKt.access$durationOfNanos(r6)
            goto L3c
        L2a:
            r2 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r6 = kotlin.ranges.RangesKt.coerceIn(r0, r2, r4)
            long r6 = kotlin.time.DurationKt.access$durationOfMillis(r6)
        L3c:
            return r6
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m2089appendFractionalimpl(long r1, java.lang.StringBuilder r3, int r4, int r5, int r6, java.lang.String r7, boolean r8) {
            r3.append(r4)
            if (r5 == 0) goto L49
            r1 = 46
            r3.append(r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r2 = 48
            java.lang.String r1 = kotlin.text.StringsKt.padStart(r1, r6, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r4 = r1.length()
            r5 = -1
            int r4 = r4 + r5
            if (r4 < 0) goto L2d
        L1e:
            int r6 = r4 + (-1)
            char r0 = r1.charAt(r4)
            if (r0 == r2) goto L28
            r5 = r4
            goto L2d
        L28:
            if (r6 >= 0) goto L2b
            goto L2d
        L2b:
            r4 = r6
            goto L1e
        L2d:
            int r2 = r5 + 1
            java.lang.String r4 = "this.append(value, startIndex, endIndex)"
            r6 = 0
            r0 = 3
            if (r8 != 0) goto L3f
            if (r2 >= r0) goto L3f
            java.lang.StringBuilder r1 = r3.append(r1, r6, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            goto L49
        L3f:
            int r5 = r5 + r0
            int r5 = r5 / r0
            int r5 = r5 * r0
            java.lang.StringBuilder r1 = r3.append(r1, r6, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
        L49:
            r3.append(r7)
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.time.Duration m2090boximpl(long r1) {
            kotlin.time.Duration r0 = new kotlin.time.Duration
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m2091compareToLRDsOJo(long r4, long r6) {
            long r0 = r4 ^ r6
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L1d
            int r0 = (int) r0
            r0 = r0 & 1
            if (r0 != 0) goto Le
            goto L1d
        Le:
            int r0 = (int) r4
            r0 = r0 & 1
            int r6 = (int) r6
            r6 = r6 & 1
            int r0 = r0 - r6
            boolean r4 = m2125isNegativeimpl(r4)
            if (r4 == 0) goto L1c
            int r0 = -r0
        L1c:
            return r0
        L1d:
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r4, r6)
            return r4
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2092constructorimpl(long r5) {
            boolean r0 = kotlin.time.DurationJvmKt.getDurationAssertionsEnabled()
            if (r0 == 0) goto Lb1
            boolean r0 = m2123isInNanosimpl(r5)
            if (r0 == 0) goto L44
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r3 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r0.<init>(r1, r3)
            long r1 = m2119getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L27
            goto Lb1
        L27:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m2119getValueimpl(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r6 = " ns is out of nanoseconds range"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L44:
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0.<init>(r1, r3)
            long r1 = m2119getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L94
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r3 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r0.<init>(r1, r3)
            long r1 = m2119getValueimpl(r5)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L77
            goto Lb1
        L77:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m2119getValueimpl(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r6 = " ms is denormalized"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L94:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r5 = m2119getValueimpl(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r6 = " ms is out of milliseconds range"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        Lb1:
            return r5
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m2093divLRDsOJo(long r2, long r4) {
            kotlin.time.DurationUnit r0 = m2117getStorageUnitimpl(r2)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            kotlin.time.DurationUnit r1 = m2117getStorageUnitimpl(r4)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.maxOf(r0, r1)
            kotlin.time.DurationUnit r0 = (kotlin.time.DurationUnit) r0
            double r2 = m2135toDoubleimpl(r2, r0)
            double r4 = m2135toDoubleimpl(r4, r0)
            double r2 = r2 / r4
            return r2
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m2094divUwyO8pc(long r3, double r5) {
            int r0 = kotlin.math.MathKt.roundToInt(r5)
            double r1 = (double) r0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L10
            if (r0 == 0) goto L10
            long r3 = m2095divUwyO8pc(r3, r0)
            return r3
        L10:
            kotlin.time.DurationUnit r0 = m2117getStorageUnitimpl(r3)
            double r3 = m2135toDoubleimpl(r3, r0)
            double r3 = r3 / r5
            long r3 = kotlin.time.DurationKt.toDuration(r3, r0)
            return r3
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m2095divUwyO8pc(long r8, int r10) {
            if (r10 != 0) goto L1c
            boolean r10 = m2126isPositiveimpl(r8)
            if (r10 == 0) goto Lb
            long r8 = kotlin.time.Duration.INFINITE
            goto L13
        Lb:
            boolean r8 = m2125isNegativeimpl(r8)
            if (r8 == 0) goto L14
            long r8 = kotlin.time.Duration.NEG_INFINITE
        L13:
            return r8
        L14:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Dividing zero duration by zero yields an undefined result."
            r8.<init>(r9)
            throw r8
        L1c:
            boolean r0 = m2123isInNanosimpl(r8)
            if (r0 == 0) goto L2d
            long r8 = m2119getValueimpl(r8)
            long r0 = (long) r10
            long r8 = r8 / r0
            long r8 = kotlin.time.DurationKt.access$durationOfNanos(r8)
            return r8
        L2d:
            boolean r0 = m2124isInfiniteimpl(r8)
            if (r0 == 0) goto L3c
            int r10 = kotlin.math.MathKt.getSign(r10)
            long r8 = m2130timesUwyO8pc(r8, r10)
            return r8
        L3c:
            long r0 = m2119getValueimpl(r8)
            long r2 = (long) r10
            long r0 = r0 / r2
            kotlin.ranges.LongRange r10 = new kotlin.ranges.LongRange
            r4 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r6 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r10.<init>(r4, r6)
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L6d
            long r8 = m2119getValueimpl(r8)
            long r4 = r0 * r2
            long r8 = r8 - r4
            long r8 = kotlin.time.DurationKt.access$millisToNanos(r8)
            long r8 = r8 / r2
            long r0 = kotlin.time.DurationKt.access$millisToNanos(r0)
            long r0 = r0 + r8
            long r8 = kotlin.time.DurationKt.access$durationOfNanos(r0)
            return r8
        L6d:
            long r8 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            return r8
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2096equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof kotlin.time.Duration
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.time.Duration r6 = (kotlin.time.Duration) r6
            long r2 = r6.m2147unboximpl()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L11
            return r1
        L11:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2097equalsimpl0(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m2098getAbsoluteValueUwyO8pc(long r1) {
            boolean r0 = m2125isNegativeimpl(r1)
            if (r0 == 0) goto La
            long r1 = m2145unaryMinusUwyO8pc(r1)
        La:
            return r1
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m2099getHoursComponentimpl(long r2) {
            boolean r0 = m2124isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m2108getInWholeHoursimpl(r2)
            r0 = 24
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    @kotlin.Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInDays$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInDays-impl, reason: not valid java name */
    public static final /* synthetic */ double m2100getInDaysimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            double r1 = m2135toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInHours$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInHours-impl, reason: not valid java name */
    public static final /* synthetic */ double m2101getInHoursimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            double r1 = m2135toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMicroseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMicroseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m2102getInMicrosecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            double r1 = m2135toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMilliseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMilliseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m2103getInMillisecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            double r1 = m2135toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMinutes$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInMinutes-impl, reason: not valid java name */
    public static final /* synthetic */ double m2104getInMinutesimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            double r1 = m2135toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInNanoseconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInNanoseconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m2105getInNanosecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r1 = m2135toDoubleimpl(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInSeconds$annotations() {
            return
    }

    /* JADX INFO: renamed from: getInSeconds-impl, reason: not valid java name */
    public static final /* synthetic */ double m2106getInSecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            double r1 = m2135toDoubleimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m2107getInWholeDaysimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r1 = m2138toLongimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m2108getInWholeHoursimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r1 = m2138toLongimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m2109getInWholeMicrosecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r1 = m2138toLongimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m2110getInWholeMillisecondsimpl(long r1) {
            boolean r0 = m2122isInMillisimpl(r1)
            if (r0 == 0) goto L11
            boolean r0 = m2121isFiniteimpl(r1)
            if (r0 == 0) goto L11
            long r1 = m2119getValueimpl(r1)
            goto L17
        L11:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = m2138toLongimpl(r1, r0)
        L17:
            return r1
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m2111getInWholeMinutesimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r1 = m2138toLongimpl(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m2112getInWholeNanosecondsimpl(long r2) {
            long r0 = m2119getValueimpl(r2)
            boolean r2 = m2123isInNanosimpl(r2)
            if (r2 == 0) goto Lb
            goto L2a
        Lb:
            r2 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L2a
        L1a:
            r2 = -9223372036854(0xfffff79c842fa50a, double:NaN)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L26
            r0 = -9223372036854775808
            goto L2a
        L26:
            long r0 = kotlin.time.DurationKt.access$millisToNanos(r0)
        L2a:
            return r0
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m2113getInWholeSecondsimpl(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r1 = m2138toLongimpl(r1, r0)
            return r1
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m2114getMinutesComponentimpl(long r2) {
            boolean r0 = m2124isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m2111getInWholeMinutesimpl(r2)
            r0 = 60
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m2115getNanosecondsComponentimpl(long r2) {
            boolean r0 = m2124isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L25
        L8:
            boolean r0 = m2122isInMillisimpl(r2)
            if (r0 == 0) goto L1b
            long r2 = m2119getValueimpl(r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 % r0
            long r2 = kotlin.time.DurationKt.access$millisToNanos(r2)
            goto L24
        L1b:
            long r2 = m2119getValueimpl(r2)
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            long r0 = (long) r0
            long r2 = r2 % r0
        L24:
            int r2 = (int) r2
        L25:
            return r2
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
            return
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m2116getSecondsComponentimpl(long r2) {
            boolean r0 = m2124isInfiniteimpl(r2)
            if (r0 == 0) goto L8
            r2 = 0
            goto L11
        L8:
            long r2 = m2113getInWholeSecondsimpl(r2)
            r0 = 60
            long r0 = (long) r0
            long r2 = r2 % r0
            int r2 = (int) r2
        L11:
            return r2
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final kotlin.time.DurationUnit m2117getStorageUnitimpl(long r0) {
            boolean r0 = m2123isInNanosimpl(r0)
            if (r0 == 0) goto L9
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            goto Lb
        L9:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m2118getUnitDiscriminatorimpl(long r0) {
            int r0 = (int) r0
            r0 = r0 & 1
            return r0
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m2119getValueimpl(long r1) {
            r0 = 1
            long r1 = r1 >> r0
            return r1
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2120hashCodeimpl(long r0) {
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m2121isFiniteimpl(long r0) {
            boolean r0 = m2124isInfiniteimpl(r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m2122isInMillisimpl(long r0) {
            int r0 = (int) r0
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m2123isInNanosimpl(long r0) {
            int r0 = (int) r0
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m2124isInfiniteimpl(long r2) {
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lf
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m2125isNegativeimpl(long r2) {
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m2126isPositiveimpl(long r2) {
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m2127minusLRDsOJo(long r0, long r2) {
            long r2 = m2145unaryMinusUwyO8pc(r2)
            long r0 = m2128plusLRDsOJo(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m2128plusLRDsOJo(long r7, long r9) {
            boolean r0 = m2124isInfiniteimpl(r7)
            if (r0 == 0) goto L1d
            boolean r0 = m2121isFiniteimpl(r9)
            if (r0 != 0) goto L1c
            long r9 = r9 ^ r7
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 < 0) goto L14
            goto L1c
        L14:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Summing infinite durations of different signs yields an undefined result."
            r7.<init>(r8)
            throw r7
        L1c:
            return r7
        L1d:
            boolean r0 = m2124isInfiniteimpl(r9)
            if (r0 == 0) goto L24
            return r9
        L24:
            int r0 = (int) r7
            r0 = r0 & 1
            int r1 = (int) r9
            r1 = r1 & 1
            if (r0 != r1) goto L45
            long r0 = m2119getValueimpl(r7)
            long r9 = m2119getValueimpl(r9)
            long r0 = r0 + r9
            boolean r7 = m2123isInNanosimpl(r7)
            if (r7 == 0) goto L40
            long r7 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r0)
            goto L66
        L40:
            long r7 = kotlin.time.DurationKt.access$durationOfMillisNormalized(r0)
            goto L66
        L45:
            boolean r0 = m2122isInMillisimpl(r7)
            if (r0 == 0) goto L59
            long r3 = m2119getValueimpl(r7)
            long r5 = m2119getValueimpl(r9)
            r1 = r7
            long r7 = m2088addValuesMixedRangesUwyO8pc(r1, r3, r5)
            goto L66
        L59:
            long r2 = m2119getValueimpl(r9)
            long r4 = m2119getValueimpl(r7)
            r0 = r7
            long r7 = m2088addValuesMixedRangesUwyO8pc(r0, r2, r4)
        L66:
            return r7
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m2129timesUwyO8pc(long r3, double r5) {
            int r0 = kotlin.math.MathKt.roundToInt(r5)
            double r1 = (double) r0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto Le
            long r3 = m2130timesUwyO8pc(r3, r0)
            return r3
        Le:
            kotlin.time.DurationUnit r0 = m2117getStorageUnitimpl(r3)
            double r3 = m2135toDoubleimpl(r3, r0)
            double r3 = r3 * r5
            long r3 = kotlin.time.DurationKt.toDuration(r3, r0)
            return r3
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m2130timesUwyO8pc(long r16, int r18) {
            r0 = r18
            boolean r1 = m2124isInfiniteimpl(r16)
            if (r1 == 0) goto L1c
            if (r0 == 0) goto L14
            if (r0 <= 0) goto Lf
            r0 = r16
            goto L13
        Lf:
            long r0 = m2145unaryMinusUwyO8pc(r16)
        L13:
            return r0
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiplying infinite duration by zero yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1c:
            if (r0 != 0) goto L21
            long r0 = kotlin.time.Duration.ZERO
            return r0
        L21:
            long r1 = m2119getValueimpl(r16)
            long r3 = (long) r0
            long r5 = r1 * r3
            boolean r7 = m2123isInNanosimpl(r16)
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r10 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r7 == 0) goto L9b
            kotlin.ranges.LongRange r7 = new kotlin.ranges.LongRange
            r12 = -2147483647(0xffffffff80000001, double:NaN)
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r7.<init>(r12, r14)
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L4f
            long r0 = kotlin.time.DurationKt.access$durationOfNanos(r5)
            goto Lc1
        L4f:
            long r12 = r5 / r3
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 != 0) goto L5a
            long r0 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r5)
            goto Lc1
        L5a:
            long r5 = kotlin.time.DurationKt.access$nanosToMillis(r1)
            long r12 = kotlin.time.DurationKt.access$millisToNanos(r5)
            long r12 = r1 - r12
            long r14 = r5 * r3
            long r12 = r12 * r3
            long r12 = kotlin.time.DurationKt.access$nanosToMillis(r12)
            long r12 = r12 + r14
            long r3 = r14 / r3
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L8a
            long r3 = r12 ^ r14
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L8a
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r0.<init>(r10, r8)
            kotlin.ranges.ClosedRange r0 = (kotlin.ranges.ClosedRange) r0
            long r0 = kotlin.ranges.RangesKt.coerceIn(r12, r0)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            goto Lc1
        L8a:
            int r1 = kotlin.math.MathKt.getSign(r1)
            int r0 = kotlin.math.MathKt.getSign(r18)
            int r1 = r1 * r0
            if (r1 <= 0) goto L98
            long r0 = kotlin.time.Duration.INFINITE
            goto Lc1
        L98:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            goto Lc1
        L9b:
            long r3 = r5 / r3
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto Lb1
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r0.<init>(r10, r8)
            kotlin.ranges.ClosedRange r0 = (kotlin.ranges.ClosedRange) r0
            long r0 = kotlin.ranges.RangesKt.coerceIn(r5, r0)
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            goto Lc1
        Lb1:
            int r1 = kotlin.math.MathKt.getSign(r1)
            int r0 = kotlin.math.MathKt.getSign(r18)
            int r1 = r1 * r0
            if (r1 <= 0) goto Lbf
            long r0 = kotlin.time.Duration.INFINITE
            goto Lc1
        Lbf:
            long r0 = kotlin.time.Duration.NEG_INFINITE
        Lc1:
            return r0
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2131toComponentsimpl(long r2, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = m2113getInWholeSecondsimpl(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r2 = m2115getNanosecondsComponentimpl(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2132toComponentsimpl(long r2, kotlin.jvm.functions.Function3<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = m2111getInWholeMinutesimpl(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = m2116getSecondsComponentimpl(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = m2115getNanosecondsComponentimpl(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r0, r1, r2)
            return r2
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2133toComponentsimpl(long r3, kotlin.jvm.functions.Function4<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r5) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = m2108getInWholeHoursimpl(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = m2114getMinutesComponentimpl(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = m2116getSecondsComponentimpl(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = m2115getNanosecondsComponentimpl(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r5.invoke(r0, r1, r2, r3)
            return r3
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2134toComponentsimpl(long r8, kotlin.jvm.functions.Function5<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r10) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            long r0 = m2107getInWholeDaysimpl(r8)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            int r0 = m2099getHoursComponentimpl(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = m2114getMinutesComponentimpl(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            int r0 = m2116getSecondsComponentimpl(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r8 = m2115getNanosecondsComponentimpl(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r2 = r10
            java.lang.Object r8 = r2.invoke(r3, r4, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m2135toDoubleimpl(long r2, kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Le
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L24
        Le:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L17
            r2 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            goto L24
        L17:
            long r0 = m2119getValueimpl(r2)
            double r0 = (double) r0
            kotlin.time.DurationUnit r2 = m2117getStorageUnitimpl(r2)
            double r2 = kotlin.time.DurationUnitKt.convertDurationUnit(r0, r2, r4)
        L24:
            return r2
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m2136toIntimpl(long r7, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r1 = m2138toLongimpl(r7, r9)
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = kotlin.ranges.RangesKt.coerceIn(r1, r3, r5)
            int r7 = (int) r7
            return r7
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final java.lang.String m2137toIsoStringimpl(long r11) {
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            boolean r0 = m2125isNegativeimpl(r11)
            if (r0 == 0) goto L10
            r0 = 45
            r8.append(r0)
        L10:
            java.lang.String r0 = "PT"
            r8.append(r0)
            long r0 = m2098getAbsoluteValueUwyO8pc(r11)
            long r2 = m2108getInWholeHoursimpl(r0)
            int r4 = m2114getMinutesComponentimpl(r0)
            int r5 = m2116getSecondsComponentimpl(r0)
            int r6 = m2115getNanosecondsComponentimpl(r0)
            boolean r0 = m2124isInfiniteimpl(r11)
            if (r0 == 0) goto L34
            r2 = 9999999999999(0x9184e729fff, double:4.940656458412E-311)
        L34:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L3e
            r0 = r1
            goto L3f
        L3e:
            r0 = r7
        L3f:
            if (r5 != 0) goto L46
            if (r6 == 0) goto L44
            goto L46
        L44:
            r9 = r7
            goto L47
        L46:
            r9 = r1
        L47:
            if (r4 != 0) goto L4f
            if (r9 == 0) goto L4e
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r7
        L4f:
            if (r0 == 0) goto L5a
            java.lang.StringBuilder r2 = r8.append(r2)
            r3 = 72
            r2.append(r3)
        L5a:
            if (r1 == 0) goto L65
            java.lang.StringBuilder r2 = r8.append(r4)
            r3 = 77
            r2.append(r3)
        L65:
            if (r9 != 0) goto L6b
            if (r0 != 0) goto L7a
            if (r1 != 0) goto L7a
        L6b:
            java.lang.String r7 = "S"
            r9 = 1
            r10 = 9
            r0 = r11
            r2 = r8
            r3 = r5
            r4 = r6
            r5 = r10
            r6 = r7
            r7 = r9
            m2089appendFractionalimpl(r0, r2, r3, r4, r5, r6, r7)
        L7a:
            java.lang.String r11 = r8.toString()
            java.lang.String r12 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            return r11
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m2138toLongimpl(long r2, kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L11
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L26
        L11:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L1a
            r2 = -9223372036854775808
            goto L26
        L1a:
            long r0 = m2119getValueimpl(r2)
            kotlin.time.DurationUnit r2 = m2117getStorageUnitimpl(r2)
            long r2 = kotlin.time.DurationUnitKt.convertDurationUnit(r0, r2, r4)
        L26:
            return r2
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    /* JADX INFO: renamed from: toLongMilliseconds-impl, reason: not valid java name */
    public static final /* synthetic */ long m2139toLongMillisecondsimpl(long r0) {
            long r0 = m2110getInWholeMillisecondsimpl(r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    /* JADX INFO: renamed from: toLongNanoseconds-impl, reason: not valid java name */
    public static final /* synthetic */ long m2140toLongNanosecondsimpl(long r0) {
            long r0 = m2112getInWholeNanosecondsimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2141toStringimpl(long r14) {
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            java.lang.String r14 = "0s"
            goto L109
        La:
            long r2 = kotlin.time.Duration.INFINITE
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L14
            java.lang.String r14 = "Infinity"
            goto L109
        L14:
            long r2 = kotlin.time.Duration.NEG_INFINITE
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L1e
            java.lang.String r14 = "-Infinity"
            goto L109
        L1e:
            boolean r2 = m2125isNegativeimpl(r14)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            if (r2 == 0) goto L2e
            r3 = 45
            r11.append(r3)
        L2e:
            long r3 = m2098getAbsoluteValueUwyO8pc(r14)
            long r5 = m2107getInWholeDaysimpl(r3)
            int r7 = m2099getHoursComponentimpl(r3)
            int r8 = m2114getMinutesComponentimpl(r3)
            int r9 = m2116getSecondsComponentimpl(r3)
            int r10 = m2115getNanosecondsComponentimpl(r3)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r12 = 1
            if (r0 == 0) goto L4e
            r0 = r12
            goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r7 == 0) goto L53
            r3 = r12
            goto L54
        L53:
            r3 = r1
        L54:
            if (r8 == 0) goto L58
            r4 = r12
            goto L59
        L58:
            r4 = r1
        L59:
            if (r9 != 0) goto L60
            if (r10 == 0) goto L5e
            goto L60
        L5e:
            r13 = r1
            goto L61
        L60:
            r13 = r12
        L61:
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r1 = r11.append(r5)
            r5 = 100
            r1.append(r5)
            r1 = r12
        L6d:
            r5 = 32
            if (r3 != 0) goto L77
            if (r0 == 0) goto L88
            if (r4 != 0) goto L77
            if (r13 == 0) goto L88
        L77:
            int r6 = r1 + 1
            if (r1 <= 0) goto L7e
            r11.append(r5)
        L7e:
            java.lang.StringBuilder r1 = r11.append(r7)
            r7 = 104(0x68, float:1.46E-43)
            r1.append(r7)
            r1 = r6
        L88:
            if (r4 != 0) goto L90
            if (r13 == 0) goto La1
            if (r3 != 0) goto L90
            if (r0 == 0) goto La1
        L90:
            int r6 = r1 + 1
            if (r1 <= 0) goto L97
            r11.append(r5)
        L97:
            java.lang.StringBuilder r1 = r11.append(r8)
            r7 = 109(0x6d, float:1.53E-43)
            r1.append(r7)
            r1 = r6
        La1:
            if (r13 == 0) goto Lf1
            int r13 = r1 + 1
            if (r1 <= 0) goto Laa
            r11.append(r5)
        Laa:
            if (r9 != 0) goto Le2
            if (r0 != 0) goto Le2
            if (r3 != 0) goto Le2
            if (r4 == 0) goto Lb3
            goto Le2
        Lb3:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r10 < r0) goto Lc6
            int r6 = r10 / r0
            int r7 = r10 % r0
            java.lang.String r9 = "ms"
            r10 = 0
            r8 = 6
            r3 = r14
            r5 = r11
            m2089appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
            goto Lf0
        Lc6:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r10 < r0) goto Ld8
            int r6 = r10 / 1000
            int r7 = r10 % 1000
            java.lang.String r9 = "us"
            r10 = 0
            r8 = 3
            r3 = r14
            r5 = r11
            m2089appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
            goto Lf0
        Ld8:
            java.lang.StringBuilder r14 = r11.append(r10)
            java.lang.String r15 = "ns"
            r14.append(r15)
            goto Lf0
        Le2:
            java.lang.String r0 = "s"
            r1 = 0
            r8 = 9
            r3 = r14
            r5 = r11
            r6 = r9
            r7 = r10
            r9 = r0
            r10 = r1
            m2089appendFractionalimpl(r3, r5, r6, r7, r8, r9, r10)
        Lf0:
            r1 = r13
        Lf1:
            if (r2 == 0) goto L100
            if (r1 <= r12) goto L100
            r14 = 40
            java.lang.StringBuilder r14 = r11.insert(r12, r14)
            r15 = 41
            r14.append(r15)
        L100:
            java.lang.String r14 = r11.toString()
            java.lang.String r15 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
        L109:
            return r14
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final java.lang.String m2142toStringimpl(long r2, kotlin.time.DurationUnit r4, int r5) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 < 0) goto L36
            double r2 = m2135toDoubleimpl(r2, r4)
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 == 0) goto L16
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 12
            int r5 = kotlin.ranges.RangesKt.coerceAtMost(r5, r1)
            java.lang.String r2 = kotlin.time.DurationJvmKt.formatToExactDecimals(r2, r5)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r3 = kotlin.time.DurationUnitKt.shortName(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "decimals must be not negative, but was "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m2143toStringimpl$default(long r0, kotlin.time.DurationUnit r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = m2142toStringimpl(r0, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m2144truncateToUwyO8pc$kotlin_stdlib(long r5, kotlin.time.DurationUnit r7) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.time.DurationUnit r0 = m2117getStorageUnitimpl(r5)
            r1 = r0
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r1 = r7.compareTo(r1)
            if (r1 <= 0) goto L2d
            boolean r1 = m2124isInfiniteimpl(r5)
            if (r1 == 0) goto L19
            goto L2d
        L19:
            r1 = 1
            long r1 = kotlin.time.DurationUnitKt.convertDurationUnit(r1, r7, r0)
            long r3 = m2119getValueimpl(r5)
            long r5 = m2119getValueimpl(r5)
            long r5 = r5 % r1
            long r3 = r3 - r5
            long r5 = kotlin.time.DurationKt.toDuration(r3, r0)
        L2d:
            return r5
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m2145unaryMinusUwyO8pc(long r2) {
            long r0 = m2119getValueimpl(r2)
            long r0 = -r0
            int r2 = (int) r2
            r2 = r2 & 1
            long r2 = kotlin.time.DurationKt.access$durationOf(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.time.Duration r3) {
            r2 = this;
            kotlin.time.Duration r3 = (kotlin.time.Duration) r3
            long r0 = r3.m2147unboximpl()
            int r3 = r2.m2146compareToLRDsOJo(r0)
            return r3
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m2146compareToLRDsOJo(long r3) {
            r2 = this;
            long r0 = r2.rawValue
            int r3 = m2091compareToLRDsOJo(r0, r3)
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.rawValue
            boolean r3 = m2096equalsimpl(r0, r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.rawValue
            int r0 = m2120hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.rawValue
            java.lang.String r0 = m2141toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2147unboximpl() {
            r2 = this;
            long r0 = r2.rawValue
            return r0
    }
}
