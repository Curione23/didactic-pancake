package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public class State {
    static final int CONSTRAINT_RATIO = 2;
    static final int CONSTRAINT_SPREAD = 0;
    static final int CONSTRAINT_WRAP = 1;
    public static final java.lang.Integer PARENT = null;
    static final int UNKNOWN = -1;
    protected java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> mHelperReferences;
    public final androidx.constraintlayout.core.state.ConstraintReference mParent;
    protected java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> mReferences;
    java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> mTags;
    private int numHelpers;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.State$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Helper = null;

        static {
                androidx.constraintlayout.core.state.State$Helper[] r0 = androidx.constraintlayout.core.state.State.Helper.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Helper = r0
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Helper     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Helper     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.ALIGN_HORIZONTALLY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Helper     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Helper     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.BARRIER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    public enum Chain extends java.lang.Enum<androidx.constraintlayout.core.state.State.Chain> {
        private static final /* synthetic */ androidx.constraintlayout.core.state.State.Chain[] $VALUES = null;
        public static final androidx.constraintlayout.core.state.State.Chain PACKED = null;
        public static final androidx.constraintlayout.core.state.State.Chain SPREAD = null;
        public static final androidx.constraintlayout.core.state.State.Chain SPREAD_INSIDE = null;

        static {
                androidx.constraintlayout.core.state.State$Chain r0 = new androidx.constraintlayout.core.state.State$Chain
                java.lang.String r1 = "SPREAD"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.State.Chain.SPREAD = r0
                androidx.constraintlayout.core.state.State$Chain r1 = new androidx.constraintlayout.core.state.State$Chain
                java.lang.String r2 = "SPREAD_INSIDE"
                r3 = 1
                r1.<init>(r2, r3)
                androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE = r1
                androidx.constraintlayout.core.state.State$Chain r2 = new androidx.constraintlayout.core.state.State$Chain
                java.lang.String r3 = "PACKED"
                r4 = 2
                r2.<init>(r3, r4)
                androidx.constraintlayout.core.state.State.Chain.PACKED = r2
                androidx.constraintlayout.core.state.State$Chain[] r0 = new androidx.constraintlayout.core.state.State.Chain[]{r0, r1, r2}
                androidx.constraintlayout.core.state.State.Chain.$VALUES = r0
                return
        }

        Chain(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.state.State.Chain valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.state.State$Chain> r0 = androidx.constraintlayout.core.state.State.Chain.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.state.State$Chain r1 = (androidx.constraintlayout.core.state.State.Chain) r1
                return r1
        }

        public static androidx.constraintlayout.core.state.State.Chain[] values() {
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.state.State$Chain[] r0 = (androidx.constraintlayout.core.state.State.Chain[]) r0
                return r0
        }
    }

    public enum Constraint extends java.lang.Enum<androidx.constraintlayout.core.state.State.Constraint> {
        private static final /* synthetic */ androidx.constraintlayout.core.state.State.Constraint[] $VALUES = null;
        public static final androidx.constraintlayout.core.state.State.Constraint BASELINE_TO_BASELINE = null;
        public static final androidx.constraintlayout.core.state.State.Constraint BASELINE_TO_BOTTOM = null;
        public static final androidx.constraintlayout.core.state.State.Constraint BASELINE_TO_TOP = null;
        public static final androidx.constraintlayout.core.state.State.Constraint BOTTOM_TO_BOTTOM = null;
        public static final androidx.constraintlayout.core.state.State.Constraint BOTTOM_TO_TOP = null;
        public static final androidx.constraintlayout.core.state.State.Constraint CENTER_HORIZONTALLY = null;
        public static final androidx.constraintlayout.core.state.State.Constraint CENTER_VERTICALLY = null;
        public static final androidx.constraintlayout.core.state.State.Constraint CIRCULAR_CONSTRAINT = null;
        public static final androidx.constraintlayout.core.state.State.Constraint END_TO_END = null;
        public static final androidx.constraintlayout.core.state.State.Constraint END_TO_START = null;
        public static final androidx.constraintlayout.core.state.State.Constraint LEFT_TO_LEFT = null;
        public static final androidx.constraintlayout.core.state.State.Constraint LEFT_TO_RIGHT = null;
        public static final androidx.constraintlayout.core.state.State.Constraint RIGHT_TO_LEFT = null;
        public static final androidx.constraintlayout.core.state.State.Constraint RIGHT_TO_RIGHT = null;
        public static final androidx.constraintlayout.core.state.State.Constraint START_TO_END = null;
        public static final androidx.constraintlayout.core.state.State.Constraint START_TO_START = null;
        public static final androidx.constraintlayout.core.state.State.Constraint TOP_TO_BOTTOM = null;
        public static final androidx.constraintlayout.core.state.State.Constraint TOP_TO_TOP = null;

        static {
                androidx.constraintlayout.core.state.State$Constraint r1 = new androidx.constraintlayout.core.state.State$Constraint
                r0 = r1
                java.lang.String r2 = "LEFT_TO_LEFT"
                r3 = 0
                r1.<init>(r2, r3)
                androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT = r1
                androidx.constraintlayout.core.state.State$Constraint r2 = new androidx.constraintlayout.core.state.State$Constraint
                r1 = r2
                java.lang.String r3 = "LEFT_TO_RIGHT"
                r4 = 1
                r2.<init>(r3, r4)
                androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT = r2
                androidx.constraintlayout.core.state.State$Constraint r3 = new androidx.constraintlayout.core.state.State$Constraint
                r2 = r3
                java.lang.String r4 = "RIGHT_TO_LEFT"
                r5 = 2
                r3.<init>(r4, r5)
                androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT = r3
                androidx.constraintlayout.core.state.State$Constraint r4 = new androidx.constraintlayout.core.state.State$Constraint
                r3 = r4
                java.lang.String r5 = "RIGHT_TO_RIGHT"
                r6 = 3
                r4.<init>(r5, r6)
                androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT = r4
                androidx.constraintlayout.core.state.State$Constraint r5 = new androidx.constraintlayout.core.state.State$Constraint
                r4 = r5
                java.lang.String r6 = "START_TO_START"
                r7 = 4
                r5.<init>(r6, r7)
                androidx.constraintlayout.core.state.State.Constraint.START_TO_START = r5
                androidx.constraintlayout.core.state.State$Constraint r6 = new androidx.constraintlayout.core.state.State$Constraint
                r5 = r6
                java.lang.String r7 = "START_TO_END"
                r8 = 5
                r6.<init>(r7, r8)
                androidx.constraintlayout.core.state.State.Constraint.START_TO_END = r6
                androidx.constraintlayout.core.state.State$Constraint r7 = new androidx.constraintlayout.core.state.State$Constraint
                r6 = r7
                java.lang.String r8 = "END_TO_START"
                r9 = 6
                r7.<init>(r8, r9)
                androidx.constraintlayout.core.state.State.Constraint.END_TO_START = r7
                androidx.constraintlayout.core.state.State$Constraint r8 = new androidx.constraintlayout.core.state.State$Constraint
                r7 = r8
                java.lang.String r9 = "END_TO_END"
                r10 = 7
                r8.<init>(r9, r10)
                androidx.constraintlayout.core.state.State.Constraint.END_TO_END = r8
                androidx.constraintlayout.core.state.State$Constraint r9 = new androidx.constraintlayout.core.state.State$Constraint
                r8 = r9
                java.lang.String r10 = "TOP_TO_TOP"
                r11 = 8
                r9.<init>(r10, r11)
                androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP = r9
                androidx.constraintlayout.core.state.State$Constraint r10 = new androidx.constraintlayout.core.state.State$Constraint
                r9 = r10
                java.lang.String r11 = "TOP_TO_BOTTOM"
                r12 = 9
                r10.<init>(r11, r12)
                androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM = r10
                androidx.constraintlayout.core.state.State$Constraint r11 = new androidx.constraintlayout.core.state.State$Constraint
                r10 = r11
                java.lang.String r12 = "BOTTOM_TO_TOP"
                r13 = 10
                r11.<init>(r12, r13)
                androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP = r11
                androidx.constraintlayout.core.state.State$Constraint r12 = new androidx.constraintlayout.core.state.State$Constraint
                r11 = r12
                java.lang.String r13 = "BOTTOM_TO_BOTTOM"
                r14 = 11
                r12.<init>(r13, r14)
                androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM = r12
                androidx.constraintlayout.core.state.State$Constraint r13 = new androidx.constraintlayout.core.state.State$Constraint
                r12 = r13
                java.lang.String r14 = "BASELINE_TO_BASELINE"
                r15 = 12
                r13.<init>(r14, r15)
                androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE = r13
                androidx.constraintlayout.core.state.State$Constraint r14 = new androidx.constraintlayout.core.state.State$Constraint
                r13 = r14
                java.lang.String r15 = "BASELINE_TO_TOP"
                r18 = r0
                r0 = 13
                r14.<init>(r15, r0)
                androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP = r14
                androidx.constraintlayout.core.state.State$Constraint r0 = new androidx.constraintlayout.core.state.State$Constraint
                r14 = r0
                java.lang.String r15 = "BASELINE_TO_BOTTOM"
                r19 = r1
                r1 = 14
                r0.<init>(r15, r1)
                androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM = r0
                androidx.constraintlayout.core.state.State$Constraint r0 = new androidx.constraintlayout.core.state.State$Constraint
                r15 = r0
                java.lang.String r1 = "CENTER_HORIZONTALLY"
                r20 = r2
                r2 = 15
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY = r0
                androidx.constraintlayout.core.state.State$Constraint r0 = new androidx.constraintlayout.core.state.State$Constraint
                r16 = r0
                java.lang.String r1 = "CENTER_VERTICALLY"
                r2 = 16
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY = r0
                androidx.constraintlayout.core.state.State$Constraint r0 = new androidx.constraintlayout.core.state.State$Constraint
                r17 = r0
                java.lang.String r1 = "CIRCULAR_CONSTRAINT"
                r2 = 17
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT = r0
                r0 = r18
                r1 = r19
                r2 = r20
                androidx.constraintlayout.core.state.State$Constraint[] r0 = new androidx.constraintlayout.core.state.State.Constraint[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
                androidx.constraintlayout.core.state.State.Constraint.$VALUES = r0
                return
        }

        Constraint(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.state.State.Constraint valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.state.State$Constraint> r0 = androidx.constraintlayout.core.state.State.Constraint.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.state.State$Constraint r1 = (androidx.constraintlayout.core.state.State.Constraint) r1
                return r1
        }

        public static androidx.constraintlayout.core.state.State.Constraint[] values() {
                androidx.constraintlayout.core.state.State$Constraint[] r0 = androidx.constraintlayout.core.state.State.Constraint.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.state.State$Constraint[] r0 = (androidx.constraintlayout.core.state.State.Constraint[]) r0
                return r0
        }
    }

    public enum Direction extends java.lang.Enum<androidx.constraintlayout.core.state.State.Direction> {
        private static final /* synthetic */ androidx.constraintlayout.core.state.State.Direction[] $VALUES = null;
        public static final androidx.constraintlayout.core.state.State.Direction BOTTOM = null;
        public static final androidx.constraintlayout.core.state.State.Direction END = null;
        public static final androidx.constraintlayout.core.state.State.Direction LEFT = null;
        public static final androidx.constraintlayout.core.state.State.Direction RIGHT = null;
        public static final androidx.constraintlayout.core.state.State.Direction START = null;
        public static final androidx.constraintlayout.core.state.State.Direction TOP = null;

        static {
                androidx.constraintlayout.core.state.State$Direction r0 = new androidx.constraintlayout.core.state.State$Direction
                java.lang.String r1 = "LEFT"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.State.Direction.LEFT = r0
                androidx.constraintlayout.core.state.State$Direction r1 = new androidx.constraintlayout.core.state.State$Direction
                java.lang.String r2 = "RIGHT"
                r3 = 1
                r1.<init>(r2, r3)
                androidx.constraintlayout.core.state.State.Direction.RIGHT = r1
                androidx.constraintlayout.core.state.State$Direction r2 = new androidx.constraintlayout.core.state.State$Direction
                java.lang.String r3 = "START"
                r4 = 2
                r2.<init>(r3, r4)
                androidx.constraintlayout.core.state.State.Direction.START = r2
                androidx.constraintlayout.core.state.State$Direction r3 = new androidx.constraintlayout.core.state.State$Direction
                java.lang.String r4 = "END"
                r5 = 3
                r3.<init>(r4, r5)
                androidx.constraintlayout.core.state.State.Direction.END = r3
                androidx.constraintlayout.core.state.State$Direction r4 = new androidx.constraintlayout.core.state.State$Direction
                java.lang.String r5 = "TOP"
                r6 = 4
                r4.<init>(r5, r6)
                androidx.constraintlayout.core.state.State.Direction.TOP = r4
                androidx.constraintlayout.core.state.State$Direction r5 = new androidx.constraintlayout.core.state.State$Direction
                java.lang.String r6 = "BOTTOM"
                r7 = 5
                r5.<init>(r6, r7)
                androidx.constraintlayout.core.state.State.Direction.BOTTOM = r5
                androidx.constraintlayout.core.state.State$Direction[] r0 = new androidx.constraintlayout.core.state.State.Direction[]{r0, r1, r2, r3, r4, r5}
                androidx.constraintlayout.core.state.State.Direction.$VALUES = r0
                return
        }

        Direction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.state.State.Direction valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.state.State$Direction> r0 = androidx.constraintlayout.core.state.State.Direction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.state.State$Direction r1 = (androidx.constraintlayout.core.state.State.Direction) r1
                return r1
        }

        public static androidx.constraintlayout.core.state.State.Direction[] values() {
                androidx.constraintlayout.core.state.State$Direction[] r0 = androidx.constraintlayout.core.state.State.Direction.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.state.State$Direction[] r0 = (androidx.constraintlayout.core.state.State.Direction[]) r0
                return r0
        }
    }

    public enum Helper extends java.lang.Enum<androidx.constraintlayout.core.state.State.Helper> {
        private static final /* synthetic */ androidx.constraintlayout.core.state.State.Helper[] $VALUES = null;
        public static final androidx.constraintlayout.core.state.State.Helper ALIGN_HORIZONTALLY = null;
        public static final androidx.constraintlayout.core.state.State.Helper ALIGN_VERTICALLY = null;
        public static final androidx.constraintlayout.core.state.State.Helper BARRIER = null;
        public static final androidx.constraintlayout.core.state.State.Helper FLOW = null;
        public static final androidx.constraintlayout.core.state.State.Helper HORIZONTAL_CHAIN = null;
        public static final androidx.constraintlayout.core.state.State.Helper LAYER = null;
        public static final androidx.constraintlayout.core.state.State.Helper VERTICAL_CHAIN = null;

        static {
                androidx.constraintlayout.core.state.State$Helper r0 = new androidx.constraintlayout.core.state.State$Helper
                java.lang.String r1 = "HORIZONTAL_CHAIN"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN = r0
                androidx.constraintlayout.core.state.State$Helper r1 = new androidx.constraintlayout.core.state.State$Helper
                java.lang.String r2 = "VERTICAL_CHAIN"
                r3 = 1
                r1.<init>(r2, r3)
                androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN = r1
                androidx.constraintlayout.core.state.State$Helper r2 = new androidx.constraintlayout.core.state.State$Helper
                java.lang.String r3 = "ALIGN_HORIZONTALLY"
                r4 = 2
                r2.<init>(r3, r4)
                androidx.constraintlayout.core.state.State.Helper.ALIGN_HORIZONTALLY = r2
                androidx.constraintlayout.core.state.State$Helper r3 = new androidx.constraintlayout.core.state.State$Helper
                java.lang.String r4 = "ALIGN_VERTICALLY"
                r5 = 3
                r3.<init>(r4, r5)
                androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY = r3
                androidx.constraintlayout.core.state.State$Helper r4 = new androidx.constraintlayout.core.state.State$Helper
                java.lang.String r5 = "BARRIER"
                r6 = 4
                r4.<init>(r5, r6)
                androidx.constraintlayout.core.state.State.Helper.BARRIER = r4
                androidx.constraintlayout.core.state.State$Helper r5 = new androidx.constraintlayout.core.state.State$Helper
                java.lang.String r6 = "LAYER"
                r7 = 5
                r5.<init>(r6, r7)
                androidx.constraintlayout.core.state.State.Helper.LAYER = r5
                androidx.constraintlayout.core.state.State$Helper r6 = new androidx.constraintlayout.core.state.State$Helper
                java.lang.String r7 = "FLOW"
                r8 = 6
                r6.<init>(r7, r8)
                androidx.constraintlayout.core.state.State.Helper.FLOW = r6
                androidx.constraintlayout.core.state.State$Helper[] r0 = new androidx.constraintlayout.core.state.State.Helper[]{r0, r1, r2, r3, r4, r5, r6}
                androidx.constraintlayout.core.state.State.Helper.$VALUES = r0
                return
        }

        Helper(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.state.State.Helper valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.state.State$Helper> r0 = androidx.constraintlayout.core.state.State.Helper.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.state.State$Helper r1 = (androidx.constraintlayout.core.state.State.Helper) r1
                return r1
        }

        public static androidx.constraintlayout.core.state.State.Helper[] values() {
                androidx.constraintlayout.core.state.State$Helper[] r0 = androidx.constraintlayout.core.state.State.Helper.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.state.State$Helper[] r0 = (androidx.constraintlayout.core.state.State.Helper[]) r0
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.constraintlayout.core.state.State.PARENT = r0
            return
    }

    public State() {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mReferences = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mHelperReferences = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mTags = r0
            androidx.constraintlayout.core.state.ConstraintReference r0 = new androidx.constraintlayout.core.state.ConstraintReference
            r0.<init>(r3)
            r3.mParent = r0
            r1 = 0
            r3.numHelpers = r1
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r1 = r3.mReferences
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            r1.put(r2, r0)
            return
    }

    private java.lang.String createHelperKey() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "__HELPER_KEY_"
            r0.<init>(r1)
            int r1 = r3.numHelpers
            int r2 = r1 + 1
            r3.numHelpers = r2
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "__"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void apply(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r8) {
            r7 = this;
            r8.removeAllChildren()
            androidx.constraintlayout.core.state.ConstraintReference r0 = r7.mParent
            androidx.constraintlayout.core.state.Dimension r0 = r0.getWidth()
            r1 = 0
            r0.apply(r7, r8, r1)
            androidx.constraintlayout.core.state.ConstraintReference r0 = r7.mParent
            androidx.constraintlayout.core.state.Dimension r0 = r0.getHeight()
            r1 = 1
            r0.apply(r7, r8, r1)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r0 = r7.mHelperReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r2 = r7.mHelperReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.HelperReference r2 = (androidx.constraintlayout.core.state.HelperReference) r2
            androidx.constraintlayout.core.widgets.HelperWidget r2 = r2.getHelperWidget()
            if (r2 == 0) goto L21
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r3 = r7.mReferences
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.core.state.Reference r3 = (androidx.constraintlayout.core.state.Reference) r3
            if (r3 != 0) goto L47
            androidx.constraintlayout.core.state.ConstraintReference r3 = r7.constraints(r1)
        L47:
            r3.setConstraintWidget(r2)
            goto L21
        L4b:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r7.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r2 = r7.mReferences
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
            androidx.constraintlayout.core.state.ConstraintReference r3 = r7.mParent
            if (r2 == r3) goto L55
            androidx.constraintlayout.core.state.helpers.Facade r3 = r2.getFacade()
            boolean r3 = r3 instanceof androidx.constraintlayout.core.state.HelperReference
            if (r3 == 0) goto L55
            androidx.constraintlayout.core.state.helpers.Facade r2 = r2.getFacade()
            androidx.constraintlayout.core.state.HelperReference r2 = (androidx.constraintlayout.core.state.HelperReference) r2
            androidx.constraintlayout.core.widgets.HelperWidget r2 = r2.getHelperWidget()
            if (r2 == 0) goto L55
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r3 = r7.mReferences
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.core.state.Reference r3 = (androidx.constraintlayout.core.state.Reference) r3
            if (r3 != 0) goto L8d
            androidx.constraintlayout.core.state.ConstraintReference r3 = r7.constraints(r1)
        L8d:
            r3.setConstraintWidget(r2)
            goto L55
        L91:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r7.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L9b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r2 = r7.mReferences
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.state.Reference r1 = (androidx.constraintlayout.core.state.Reference) r1
            androidx.constraintlayout.core.state.ConstraintReference r2 = r7.mParent
            if (r1 == r2) goto Ld3
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.getConstraintWidget()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = r3.toString()
            r2.setDebugName(r3)
            r3 = 0
            r2.setParent(r3)
            androidx.constraintlayout.core.state.helpers.Facade r3 = r1.getFacade()
            boolean r3 = r3 instanceof androidx.constraintlayout.core.state.helpers.GuidelineReference
            if (r3 == 0) goto Lcf
            r1.apply()
        Lcf:
            r8.add(r2)
            goto L9b
        Ld3:
            r1.setConstraintWidget(r8)
            goto L9b
        Ld7:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r8 = r7.mHelperReferences
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        Le1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L125
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r1 = r7.mHelperReferences
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.core.state.HelperReference r0 = (androidx.constraintlayout.core.state.HelperReference) r0
            androidx.constraintlayout.core.widgets.HelperWidget r1 = r0.getHelperWidget()
            if (r1 == 0) goto L121
            java.util.ArrayList<java.lang.Object> r1 = r0.mReferences
            java.util.Iterator r1 = r1.iterator()
        Lff:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L11d
            java.lang.Object r2 = r1.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r3 = r7.mReferences
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
            androidx.constraintlayout.core.widgets.HelperWidget r3 = r0.getHelperWidget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.getConstraintWidget()
            r3.add(r2)
            goto Lff
        L11d:
            r0.apply()
            goto Le1
        L121:
            r0.apply()
            goto Le1
        L125:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r8 = r7.mReferences
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L12f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L1a2
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r1 = r7.mReferences
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.core.state.Reference r0 = (androidx.constraintlayout.core.state.Reference) r0
            androidx.constraintlayout.core.state.ConstraintReference r1 = r7.mParent
            if (r0 == r1) goto L12f
            androidx.constraintlayout.core.state.helpers.Facade r1 = r0.getFacade()
            boolean r1 = r1 instanceof androidx.constraintlayout.core.state.HelperReference
            if (r1 == 0) goto L12f
            androidx.constraintlayout.core.state.helpers.Facade r1 = r0.getFacade()
            androidx.constraintlayout.core.state.HelperReference r1 = (androidx.constraintlayout.core.state.HelperReference) r1
            androidx.constraintlayout.core.widgets.HelperWidget r2 = r1.getHelperWidget()
            if (r2 == 0) goto L12f
            java.util.ArrayList<java.lang.Object> r1 = r1.mReferences
            java.util.Iterator r1 = r1.iterator()
        L15f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L19e
            java.lang.Object r3 = r1.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r4 = r7.mReferences
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.state.Reference r4 = (androidx.constraintlayout.core.state.Reference) r4
            if (r4 == 0) goto L17b
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r4.getConstraintWidget()
            r2.add(r3)
            goto L15f
        L17b:
            boolean r4 = r3 instanceof androidx.constraintlayout.core.state.Reference
            if (r4 == 0) goto L189
            androidx.constraintlayout.core.state.Reference r3 = (androidx.constraintlayout.core.state.Reference) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.getConstraintWidget()
            r2.add(r3)
            goto L15f
        L189:
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "couldn't find reference for "
            r5.<init>(r6)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.println(r3)
            goto L15f
        L19e:
            r0.apply()
            goto L12f
        L1a2:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r8 = r7.mReferences
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L1ac:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L1d0
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r1 = r7.mReferences
            java.lang.Object r1 = r1.get(r0)
            androidx.constraintlayout.core.state.Reference r1 = (androidx.constraintlayout.core.state.Reference) r1
            r1.apply()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getConstraintWidget()
            if (r1 == 0) goto L1ac
            if (r0 == 0) goto L1ac
            java.lang.String r0 = r0.toString()
            r1.stringId = r0
            goto L1ac
        L1d0:
            return
    }

    public androidx.constraintlayout.core.state.helpers.BarrierReference barrier(java.lang.Object r2, androidx.constraintlayout.core.state.State.Direction r3) {
            r1 = this;
            androidx.constraintlayout.core.state.ConstraintReference r2 = r1.constraints(r2)
            androidx.constraintlayout.core.state.helpers.Facade r0 = r2.getFacade()
            if (r0 == 0) goto L12
            androidx.constraintlayout.core.state.helpers.Facade r0 = r2.getFacade()
            boolean r0 = r0 instanceof androidx.constraintlayout.core.state.helpers.BarrierReference
            if (r0 != 0) goto L1d
        L12:
            androidx.constraintlayout.core.state.helpers.BarrierReference r0 = new androidx.constraintlayout.core.state.helpers.BarrierReference
            r0.<init>(r1)
            r0.setBarrierDirection(r3)
            r2.setFacade(r0)
        L1d:
            androidx.constraintlayout.core.state.helpers.Facade r2 = r2.getFacade()
            androidx.constraintlayout.core.state.helpers.BarrierReference r2 = (androidx.constraintlayout.core.state.helpers.BarrierReference) r2
            return r2
    }

    public androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference centerHorizontally(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.ALIGN_HORIZONTALLY
            androidx.constraintlayout.core.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference r0 = (androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference) r0
            r0.add(r3)
            return r0
    }

    public androidx.constraintlayout.core.state.helpers.AlignVerticallyReference centerVertically(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY
            androidx.constraintlayout.core.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.core.state.helpers.AlignVerticallyReference r0 = (androidx.constraintlayout.core.state.helpers.AlignVerticallyReference) r0
            r0.add(r3)
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference constraints(java.lang.Object r3) {
            r2 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r2.mReferences
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.core.state.Reference r0 = (androidx.constraintlayout.core.state.Reference) r0
            if (r0 != 0) goto L16
            androidx.constraintlayout.core.state.ConstraintReference r0 = r2.createConstraintReference(r3)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r1 = r2.mReferences
            r1.put(r3, r0)
            r0.setKey(r3)
        L16:
            boolean r3 = r0 instanceof androidx.constraintlayout.core.state.ConstraintReference
            if (r3 == 0) goto L1d
            androidx.constraintlayout.core.state.ConstraintReference r0 = (androidx.constraintlayout.core.state.ConstraintReference) r0
            return r0
        L1d:
            r3 = 0
            return r3
    }

    public int convertDimension(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto Lb
            java.lang.Float r2 = (java.lang.Float) r2
            int r2 = r2.intValue()
            return r2
        Lb:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L16
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L16:
            r2 = 0
            return r2
    }

    public androidx.constraintlayout.core.state.ConstraintReference createConstraintReference(java.lang.Object r1) {
            r0 = this;
            androidx.constraintlayout.core.state.ConstraintReference r1 = new androidx.constraintlayout.core.state.ConstraintReference
            r1.<init>(r0)
            return r1
    }

    public void directMapping() {
            r4 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r4.mReferences
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.state.ConstraintReference r2 = r4.constraints(r1)
            boolean r3 = r2 instanceof androidx.constraintlayout.core.state.ConstraintReference
            if (r3 != 0) goto L1d
            goto La
        L1d:
            r3 = r2
            androidx.constraintlayout.core.state.ConstraintReference r3 = (androidx.constraintlayout.core.state.ConstraintReference) r3
            r2.setView(r1)
            goto La
        L24:
            return
    }

    public java.util.ArrayList<java.lang.String> getIdsForTag(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r1.mTags
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r1.mTags
            java.lang.Object r2 = r0.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference guideline(java.lang.Object r3, int r4) {
            r2 = this;
            androidx.constraintlayout.core.state.ConstraintReference r0 = r2.constraints(r3)
            androidx.constraintlayout.core.state.helpers.Facade r1 = r0.getFacade()
            if (r1 == 0) goto L12
            androidx.constraintlayout.core.state.helpers.Facade r1 = r0.getFacade()
            boolean r1 = r1 instanceof androidx.constraintlayout.core.state.helpers.GuidelineReference
            if (r1 != 0) goto L20
        L12:
            androidx.constraintlayout.core.state.helpers.GuidelineReference r1 = new androidx.constraintlayout.core.state.helpers.GuidelineReference
            r1.<init>(r2)
            r1.setOrientation(r4)
            r1.setKey(r3)
            r0.setFacade(r1)
        L20:
            androidx.constraintlayout.core.state.helpers.Facade r3 = r0.getFacade()
            androidx.constraintlayout.core.state.helpers.GuidelineReference r3 = (androidx.constraintlayout.core.state.helpers.GuidelineReference) r3
            return r3
    }

    public androidx.constraintlayout.core.state.State height(androidx.constraintlayout.core.state.Dimension r1) {
            r0 = this;
            androidx.constraintlayout.core.state.State r1 = r0.setHeight(r1)
            return r1
    }

    public androidx.constraintlayout.core.state.HelperReference helper(java.lang.Object r3, androidx.constraintlayout.core.state.State.Helper r4) {
            r2 = this;
            if (r3 != 0) goto L6
            java.lang.String r3 = r2.createHelperKey()
        L6:
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r0 = r2.mHelperReferences
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.core.state.HelperReference r0 = (androidx.constraintlayout.core.state.HelperReference) r0
            if (r0 != 0) goto L53
            int[] r0 = androidx.constraintlayout.core.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Helper
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L45
            r1 = 2
            if (r0 == r1) goto L3f
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 == r1) goto L33
            r1 = 5
            if (r0 == r1) goto L2d
            androidx.constraintlayout.core.state.HelperReference r0 = new androidx.constraintlayout.core.state.HelperReference
            r0.<init>(r2, r4)
            goto L4b
        L2d:
            androidx.constraintlayout.core.state.helpers.BarrierReference r4 = new androidx.constraintlayout.core.state.helpers.BarrierReference
            r4.<init>(r2)
            goto L4a
        L33:
            androidx.constraintlayout.core.state.helpers.AlignVerticallyReference r4 = new androidx.constraintlayout.core.state.helpers.AlignVerticallyReference
            r4.<init>(r2)
            goto L4a
        L39:
            androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference r4 = new androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference
            r4.<init>(r2)
            goto L4a
        L3f:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r4 = new androidx.constraintlayout.core.state.helpers.VerticalChainReference
            r4.<init>(r2)
            goto L4a
        L45:
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r4 = new androidx.constraintlayout.core.state.helpers.HorizontalChainReference
            r4.<init>(r2)
        L4a:
            r0 = r4
        L4b:
            r0.setKey(r3)
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r4 = r2.mHelperReferences
            r4.put(r3, r0)
        L53:
            return r0
    }

    public androidx.constraintlayout.core.state.helpers.HorizontalChainReference horizontalChain() {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN
            androidx.constraintlayout.core.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r0 = (androidx.constraintlayout.core.state.helpers.HorizontalChainReference) r0
            return r0
    }

    public androidx.constraintlayout.core.state.helpers.HorizontalChainReference horizontalChain(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN
            androidx.constraintlayout.core.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r0 = (androidx.constraintlayout.core.state.helpers.HorizontalChainReference) r0
            r0.add(r3)
            return r0
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference horizontalGuideline(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.core.state.helpers.GuidelineReference r2 = r1.guideline(r2, r0)
            return r2
    }

    public void map(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            androidx.constraintlayout.core.state.ConstraintReference r2 = r1.constraints(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.core.state.ConstraintReference
            if (r0 == 0) goto Le
            r0 = r2
            androidx.constraintlayout.core.state.ConstraintReference r0 = (androidx.constraintlayout.core.state.ConstraintReference) r0
            r2.setView(r3)
        Le:
            return
    }

    androidx.constraintlayout.core.state.Reference reference(java.lang.Object r2) {
            r1 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r1.mReferences
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
            return r2
    }

    public void reset() {
            r1 = this;
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> r0 = r1.mHelperReferences
            r0.clear()
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r1.mTags
            r0.clear()
            return
    }

    public boolean sameFixedHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.mParent
            androidx.constraintlayout.core.state.Dimension r0 = r0.getHeight()
            boolean r2 = r0.equalsFixedValue(r2)
            return r2
    }

    public boolean sameFixedWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.mParent
            androidx.constraintlayout.core.state.Dimension r0 = r0.getWidth()
            boolean r2 = r0.equalsFixedValue(r2)
            return r2
    }

    public androidx.constraintlayout.core.state.State setHeight(androidx.constraintlayout.core.state.Dimension r2) {
            r1 = this;
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.mParent
            r0.setHeight(r2)
            return r1
    }

    public void setTag(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            androidx.constraintlayout.core.state.ConstraintReference r0 = r2.constraints(r3)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.state.ConstraintReference
            if (r1 == 0) goto L2d
            r1 = r0
            androidx.constraintlayout.core.state.ConstraintReference r1 = (androidx.constraintlayout.core.state.ConstraintReference) r1
            r0.setTag(r4)
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r2.mTags
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L21
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r2.mTags
            r1.put(r4, r0)
            goto L2a
        L21:
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r2.mTags
            java.lang.Object r4 = r0.get(r4)
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
        L2a:
            r0.add(r3)
        L2d:
            return
    }

    public androidx.constraintlayout.core.state.State setWidth(androidx.constraintlayout.core.state.Dimension r2) {
            r1 = this;
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.mParent
            r0.setWidth(r2)
            return r1
    }

    public androidx.constraintlayout.core.state.helpers.VerticalChainReference verticalChain() {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN
            androidx.constraintlayout.core.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r0 = (androidx.constraintlayout.core.state.helpers.VerticalChainReference) r0
            return r0
    }

    public androidx.constraintlayout.core.state.helpers.VerticalChainReference verticalChain(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            androidx.constraintlayout.core.state.State$Helper r1 = androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN
            androidx.constraintlayout.core.state.HelperReference r0 = r2.helper(r0, r1)
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r0 = (androidx.constraintlayout.core.state.helpers.VerticalChainReference) r0
            r0.add(r3)
            return r0
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference verticalGuideline(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            androidx.constraintlayout.core.state.helpers.GuidelineReference r2 = r1.guideline(r2, r0)
            return r2
    }

    public androidx.constraintlayout.core.state.State width(androidx.constraintlayout.core.state.Dimension r1) {
            r0 = this;
            androidx.constraintlayout.core.state.State r1 = r0.setWidth(r1)
            return r1
    }
}
