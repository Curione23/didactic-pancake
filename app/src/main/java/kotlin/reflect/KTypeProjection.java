package kotlin.reflect;

/* JADX INFO: compiled from: KTypeProjection.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KTypeProjection {
    public static final kotlin.reflect.KTypeProjection.Companion Companion = null;
    public static final kotlin.reflect.KTypeProjection star = null;
    private final kotlin.reflect.KType type;
    private final kotlin.reflect.KVariance variance;

    /* JADX INFO: compiled from: KTypeProjection.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "()V", "STAR", "Lkotlin/reflect/KTypeProjection;", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "star", "getStar$annotations", "contravariant", "type", "Lkotlin/reflect/KType;", "covariant", "invariant", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public static /* synthetic */ void getStar$annotations() {
                return
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.KTypeProjection contravariant(kotlin.reflect.KType r3) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                kotlin.reflect.KTypeProjection r0 = new kotlin.reflect.KTypeProjection
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN
                r0.<init>(r1, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.KTypeProjection covariant(kotlin.reflect.KType r3) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                kotlin.reflect.KTypeProjection r0 = new kotlin.reflect.KTypeProjection
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT
                r0.<init>(r1, r3)
                return r0
        }

        public final kotlin.reflect.KTypeProjection getSTAR() {
                r1 = this;
                kotlin.reflect.KTypeProjection r0 = kotlin.reflect.KTypeProjection.star
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.KTypeProjection invariant(kotlin.reflect.KType r3) {
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                kotlin.reflect.KTypeProjection r0 = new kotlin.reflect.KTypeProjection
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: KTypeProjection.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.KTypeProjection.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    static {
            kotlin.reflect.KTypeProjection$Companion r0 = new kotlin.reflect.KTypeProjection$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.KTypeProjection.Companion = r0
            kotlin.reflect.KTypeProjection r0 = new kotlin.reflect.KTypeProjection
            r0.<init>(r1, r1)
            kotlin.reflect.KTypeProjection.star = r0
            return
    }

    public KTypeProjection(kotlin.reflect.KVariance r4, kotlin.reflect.KType r5) {
            r3 = this;
            r3.<init>()
            r3.variance = r4
            r3.type = r5
            r0 = 1
            r1 = 0
            if (r4 != 0) goto Ld
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r5 != 0) goto L11
            goto L12
        L11:
            r0 = r1
        L12:
            if (r2 != r0) goto L15
            return
        L15:
            if (r4 != 0) goto L1a
            java.lang.String r4 = "Star projection must have no type specified."
            goto L2f
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "The projection variance "
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " requires type to be specified."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.KTypeProjection contravariant(kotlin.reflect.KType r1) {
            kotlin.reflect.KTypeProjection$Companion r0 = kotlin.reflect.KTypeProjection.Companion
            kotlin.reflect.KTypeProjection r1 = r0.contravariant(r1)
            return r1
    }

    public static /* synthetic */ kotlin.reflect.KTypeProjection copy$default(kotlin.reflect.KTypeProjection r0, kotlin.reflect.KVariance r1, kotlin.reflect.KType r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            kotlin.reflect.KVariance r1 = r0.variance
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            kotlin.reflect.KType r2 = r0.type
        Lc:
            kotlin.reflect.KTypeProjection r0 = r0.copy(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.KTypeProjection covariant(kotlin.reflect.KType r1) {
            kotlin.reflect.KTypeProjection$Companion r0 = kotlin.reflect.KTypeProjection.Companion
            kotlin.reflect.KTypeProjection r1 = r0.covariant(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.KTypeProjection invariant(kotlin.reflect.KType r1) {
            kotlin.reflect.KTypeProjection$Companion r0 = kotlin.reflect.KTypeProjection.Companion
            kotlin.reflect.KTypeProjection r1 = r0.invariant(r1)
            return r1
    }

    public final kotlin.reflect.KVariance component1() {
            r1 = this;
            kotlin.reflect.KVariance r0 = r1.variance
            return r0
    }

    public final kotlin.reflect.KType component2() {
            r1 = this;
            kotlin.reflect.KType r0 = r1.type
            return r0
    }

    public final kotlin.reflect.KTypeProjection copy(kotlin.reflect.KVariance r2, kotlin.reflect.KType r3) {
            r1 = this;
            kotlin.reflect.KTypeProjection r0 = new kotlin.reflect.KTypeProjection
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.KTypeProjection
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.KTypeProjection r5 = (kotlin.reflect.KTypeProjection) r5
            kotlin.reflect.KVariance r1 = r4.variance
            kotlin.reflect.KVariance r3 = r5.variance
            if (r1 == r3) goto L13
            return r2
        L13:
            kotlin.reflect.KType r1 = r4.type
            kotlin.reflect.KType r5 = r5.type
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final kotlin.reflect.KType getType() {
            r1 = this;
            kotlin.reflect.KType r0 = r1.type
            return r0
    }

    public final kotlin.reflect.KVariance getVariance() {
            r1 = this;
            kotlin.reflect.KVariance r0 = r1.variance
            return r0
    }

    public int hashCode() {
            r3 = this;
            kotlin.reflect.KVariance r0 = r3.variance
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            kotlin.reflect.KType r2 = r3.type
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            kotlin.reflect.KVariance r0 = r3.variance
            r1 = -1
            if (r0 != 0) goto L7
            r0 = r1
            goto Lf
        L7:
            int[] r2 = kotlin.reflect.KTypeProjection.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r2[r0]
        Lf:
            if (r0 == r1) goto L4b
            r1 = 1
            if (r0 == r1) goto L44
            r1 = 2
            if (r0 == r1) goto L32
            r1 = 3
            if (r0 != r1) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "out "
            r0.<init>(r1)
            kotlin.reflect.KType r1 = r3.type
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L4d
        L2c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "in "
            r0.<init>(r1)
            kotlin.reflect.KType r1 = r3.type
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L4d
        L44:
            kotlin.reflect.KType r0 = r3.type
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L4d
        L4b:
            java.lang.String r0 = "*"
        L4d:
            return r0
    }
}
