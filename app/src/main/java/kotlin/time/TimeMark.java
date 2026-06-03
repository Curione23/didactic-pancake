package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u001b\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\f\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TimeMark {

    /* JADX INFO: compiled from: TimeSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(kotlin.time.TimeMark r2) {
                long r0 = r2.mo2082elapsedNowUwyO8pc()
                boolean r2 = kotlin.time.Duration.m2125isNegativeimpl(r0)
                return r2
        }

        public static boolean hasPassedNow(kotlin.time.TimeMark r2) {
                long r0 = r2.mo2082elapsedNowUwyO8pc()
                boolean r2 = kotlin.time.Duration.m2125isNegativeimpl(r0)
                r2 = r2 ^ 1
                return r2
        }

        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.TimeMark m2229minusLRDsOJo(kotlin.time.TimeMark r0, long r1) {
                long r1 = kotlin.time.Duration.m2145unaryMinusUwyO8pc(r1)
                kotlin.time.TimeMark r0 = r0.mo2085plusLRDsOJo(r1)
                return r0
        }

        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.TimeMark m2230plusLRDsOJo(kotlin.time.TimeMark r2, long r3) {
                kotlin.time.AdjustedTimeMark r0 = new kotlin.time.AdjustedTimeMark
                r1 = 0
                r0.<init>(r2, r3, r1)
                kotlin.time.TimeMark r0 = (kotlin.time.TimeMark) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    long mo2082elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* JADX INFO: renamed from: minus-LRDsOJo */
    kotlin.time.TimeMark mo2083minusLRDsOJo(long r1);

    /* JADX INFO: renamed from: plus-LRDsOJo */
    kotlin.time.TimeMark mo2085plusLRDsOJo(long r1);
}
