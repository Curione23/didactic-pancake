package kotlin.collections;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/collections/State;", "", "(Ljava/lang/String;I)V", "Ready", "NotReady", "Done", "Failed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
enum State extends java.lang.Enum<kotlin.collections.State> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.collections.State[] $VALUES = null;
    public static final kotlin.collections.State Done = null;
    public static final kotlin.collections.State Failed = null;
    public static final kotlin.collections.State NotReady = null;
    public static final kotlin.collections.State Ready = null;

    private static final /* synthetic */ kotlin.collections.State[] $values() {
            kotlin.collections.State r0 = kotlin.collections.State.Ready
            kotlin.collections.State r1 = kotlin.collections.State.NotReady
            kotlin.collections.State r2 = kotlin.collections.State.Done
            kotlin.collections.State r3 = kotlin.collections.State.Failed
            kotlin.collections.State[] r0 = new kotlin.collections.State[]{r0, r1, r2, r3}
            return r0
    }

    static {
            kotlin.collections.State r0 = new kotlin.collections.State
            java.lang.String r1 = "Ready"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.collections.State.Ready = r0
            kotlin.collections.State r0 = new kotlin.collections.State
            java.lang.String r1 = "NotReady"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.collections.State.NotReady = r0
            kotlin.collections.State r0 = new kotlin.collections.State
            java.lang.String r1 = "Done"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.collections.State.Done = r0
            kotlin.collections.State r0 = new kotlin.collections.State
            java.lang.String r1 = "Failed"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.collections.State.Failed = r0
            kotlin.collections.State[] r0 = $values()
            kotlin.collections.State.$VALUES = r0
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.collections.State.$ENTRIES = r0
            return
    }

    State(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.collections.State> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.collections.State.$ENTRIES
            return r0
    }

    public static kotlin.collections.State valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.collections.State> r0 = kotlin.collections.State.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.collections.State r1 = (kotlin.collections.State) r1
            return r1
    }

    public static kotlin.collections.State[] values() {
            kotlin.collections.State[] r0 = kotlin.collections.State.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.collections.State[] r0 = (kotlin.collections.State[]) r0
            return r0
    }
}
