package kotlin.time;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TestTimeSource extends kotlin.time.AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
            r1 = this;
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            r1.<init>(r0)
            r1.markNow()
            return
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m2227overflowLRDsOJo(long r5) {
            r4 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TestTimeSource will overflow if its reading "
            r1.<init>(r2)
            long r2 = r4.reading
            java.lang.StringBuilder r1 = r1.append(r2)
            kotlin.time.DurationUnit r2 = r4.getUnit()
            java.lang.String r2 = kotlin.time.DurationUnitKt.shortName(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is advanced by "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r5 = kotlin.time.Duration.m2141toStringimpl(r5)
            java.lang.StringBuilder r5 = r1.append(r5)
            r6 = 46
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m2228plusAssignLRDsOJo(long r9) {
            r8 = this;
            kotlin.time.DurationUnit r0 = r8.getUnit()
            long r0 = kotlin.time.Duration.m2138toLongimpl(r9, r0)
            r2 = 1
            long r4 = r0 - r2
            long r4 = r4 | r2
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L3e
            r0 = 2
            long r0 = kotlin.time.Duration.m2095divUwyO8pc(r9, r0)
            kotlin.time.DurationUnit r4 = r8.getUnit()
            long r4 = kotlin.time.Duration.m2138toLongimpl(r0, r4)
            long r4 = r4 - r2
            long r2 = r2 | r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L2d
            r8.m2227overflowLRDsOJo(r9)
            goto L54
        L2d:
            long r2 = r8.reading
            r8.m2228plusAssignLRDsOJo(r0)     // Catch: java.lang.IllegalStateException -> L3a
            long r9 = kotlin.time.Duration.m2127minusLRDsOJo(r9, r0)     // Catch: java.lang.IllegalStateException -> L3a
            r8.m2228plusAssignLRDsOJo(r9)     // Catch: java.lang.IllegalStateException -> L3a
            goto L54
        L3a:
            r9 = move-exception
            r8.reading = r2
            throw r9
        L3e:
            long r2 = r8.reading
            long r4 = r2 + r0
            long r0 = r0 ^ r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L52
            long r0 = r2 ^ r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L52
            r8.m2227overflowLRDsOJo(r9)
        L52:
            r8.reading = r4
        L54:
            return
    }

    @Override // kotlin.time.AbstractLongTimeSource
    protected long read() {
            r2 = this;
            long r0 = r2.reading
            return r0
    }
}
