package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class DiffUtil {
    private static final java.util.Comparator<androidx.recyclerview.widget.DiffUtil.Diagonal> DIAGONAL_COMPARATOR = null;


    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean areContentsTheSame(int r1, int r2);

        public abstract boolean areItemsTheSame(int r1, int r2);

        public java.lang.Object getChangePayload(int r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        CenteredArray(int r1) {
                r0 = this;
                r0.<init>()
                int[] r1 = new int[r1]
                r0.mData = r1
                int r1 = r1.length
                int r1 = r1 / 2
                r0.mMid = r1
                return
        }

        int[] backingData() {
                r1 = this;
                int[] r0 = r1.mData
                return r0
        }

        public void fill(int r2) {
                r1 = this;
                int[] r0 = r1.mData
                java.util.Arrays.fill(r0, r2)
                return
        }

        int get(int r3) {
                r2 = this;
                int[] r0 = r2.mData
                int r1 = r2.mMid
                int r3 = r3 + r1
                r3 = r0[r3]
                return r3
        }

        void set(int r3, int r4) {
                r2 = this;
                int[] r0 = r2.mData
                int r1 = r2.mMid
                int r3 = r3 + r1
                r0[r3] = r4
                return
        }
    }

    static class Diagonal {
        public final int size;
        public final int x;
        public final int y;

        Diagonal(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.size = r3
                return
        }

        int endX() {
                r2 = this;
                int r0 = r2.x
                int r1 = r2.size
                int r0 = r0 + r1
                return r0
        }

        int endY() {
                r2 = this;
                int r0 = r2.y
                int r1 = r2.size
                int r0 = r0 + r1
                return r0
        }
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final androidx.recyclerview.widget.DiffUtil.Callback mCallback;
        private final boolean mDetectMoves;
        private final java.util.List<androidx.recyclerview.widget.DiffUtil.Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        DiffResult(androidx.recyclerview.widget.DiffUtil.Callback r1, java.util.List<androidx.recyclerview.widget.DiffUtil.Diagonal> r2, int[] r3, int[] r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.mDiagonals = r2
                r0.mOldItemStatuses = r3
                r0.mNewItemStatuses = r4
                r2 = 0
                java.util.Arrays.fill(r3, r2)
                java.util.Arrays.fill(r4, r2)
                r0.mCallback = r1
                int r2 = r1.getOldListSize()
                r0.mOldListSize = r2
                int r1 = r1.getNewListSize()
                r0.mNewListSize = r1
                r0.mDetectMoves = r5
                r0.addEdgeDiagonals()
                r0.findMatchingItems()
                return
        }

        private void addEdgeDiagonals() {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 == 0) goto Lb
                r0 = 0
                goto L13
            Lb:
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                java.lang.Object r0 = r0.get(r1)
                androidx.recyclerview.widget.DiffUtil$Diagonal r0 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r0
            L13:
                if (r0 == 0) goto L1d
                int r2 = r0.x
                if (r2 != 0) goto L1d
                int r0 = r0.y
                if (r0 == 0) goto L27
            L1d:
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                androidx.recyclerview.widget.DiffUtil$Diagonal r2 = new androidx.recyclerview.widget.DiffUtil$Diagonal
                r2.<init>(r1, r1, r1)
                r0.add(r1, r2)
            L27:
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                androidx.recyclerview.widget.DiffUtil$Diagonal r2 = new androidx.recyclerview.widget.DiffUtil$Diagonal
                int r3 = r5.mOldListSize
                int r4 = r5.mNewListSize
                r2.<init>(r3, r4, r1)
                r0.add(r2)
                return
        }

        private void findMatchingAddition(int r6) {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                int r0 = r0.size()
                r1 = 0
                r2 = r1
            L8:
                if (r1 >= r0) goto L49
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r3 = r5.mDiagonals
                java.lang.Object r3 = r3.get(r1)
                androidx.recyclerview.widget.DiffUtil$Diagonal r3 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r3
            L12:
                int r4 = r3.y
                if (r2 >= r4) goto L42
                int[] r4 = r5.mNewItemStatuses
                r4 = r4[r2]
                if (r4 != 0) goto L3f
                androidx.recyclerview.widget.DiffUtil$Callback r4 = r5.mCallback
                boolean r4 = r4.areItemsTheSame(r6, r2)
                if (r4 == 0) goto L3f
                androidx.recyclerview.widget.DiffUtil$Callback r0 = r5.mCallback
                boolean r0 = r0.areContentsTheSame(r6, r2)
                r1 = 4
                if (r0 == 0) goto L30
                r0 = 8
                goto L31
            L30:
                r0 = r1
            L31:
                int[] r3 = r5.mOldItemStatuses
                int r4 = r2 << 4
                r4 = r4 | r0
                r3[r6] = r4
                int[] r3 = r5.mNewItemStatuses
                int r6 = r6 << r1
                r6 = r6 | r0
                r3[r2] = r6
                return
            L3f:
                int r2 = r2 + 1
                goto L12
            L42:
                int r2 = r3.endY()
                int r1 = r1 + 1
                goto L8
            L49:
                return
        }

        private void findMatchingItems() {
                r8 = this;
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r8.mDiagonals
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.DiffUtil$Diagonal r1 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r1
                r2 = 0
            L13:
                int r3 = r1.size
                if (r2 >= r3) goto L6
                int r3 = r1.x
                int r3 = r3 + r2
                int r4 = r1.y
                int r4 = r4 + r2
                androidx.recyclerview.widget.DiffUtil$Callback r5 = r8.mCallback
                boolean r5 = r5.areContentsTheSame(r3, r4)
                if (r5 == 0) goto L27
                r5 = 1
                goto L28
            L27:
                r5 = 2
            L28:
                int[] r6 = r8.mOldItemStatuses
                int r7 = r4 << 4
                r7 = r7 | r5
                r6[r3] = r7
                int[] r6 = r8.mNewItemStatuses
                int r3 = r3 << 4
                r3 = r3 | r5
                r6[r4] = r3
                int r2 = r2 + 1
                goto L13
            L39:
                boolean r0 = r8.mDetectMoves
                if (r0 == 0) goto L40
                r8.findMoveMatches()
            L40:
                return
        }

        private void findMoveMatches() {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r4.mDiagonals
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L7:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L28
                java.lang.Object r2 = r0.next()
                androidx.recyclerview.widget.DiffUtil$Diagonal r2 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r2
            L13:
                int r3 = r2.x
                if (r1 >= r3) goto L23
                int[] r3 = r4.mOldItemStatuses
                r3 = r3[r1]
                if (r3 != 0) goto L20
                r4.findMatchingAddition(r1)
            L20:
                int r1 = r1 + 1
                goto L13
            L23:
                int r1 = r2.endX()
                goto L7
            L28:
                return
        }

        private static androidx.recyclerview.widget.DiffUtil.PostponedUpdate getPostponedUpdate(java.util.Collection<androidx.recyclerview.widget.DiffUtil.PostponedUpdate> r2, int r3, boolean r4) {
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1c
                java.lang.Object r0 = r2.next()
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r0 = (androidx.recyclerview.widget.DiffUtil.PostponedUpdate) r0
                int r1 = r0.posInOwnerList
                if (r1 != r3) goto L4
                boolean r1 = r0.removal
                if (r1 != r4) goto L4
                r2.remove()
                goto L1d
            L1c:
                r0 = 0
            L1d:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L39
                java.lang.Object r3 = r2.next()
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r3 = (androidx.recyclerview.widget.DiffUtil.PostponedUpdate) r3
                if (r4 == 0) goto L32
                int r1 = r3.currentPos
                int r1 = r1 + (-1)
                r3.currentPos = r1
                goto L1d
            L32:
                int r1 = r3.currentPos
                int r1 = r1 + 1
                r3.currentPos = r1
                goto L1d
            L39:
                return r0
        }

        public int convertNewPositionToOld(int r4) {
                r3 = this;
                if (r4 < 0) goto L13
                int r0 = r3.mNewListSize
                if (r4 >= r0) goto L13
                int[] r0 = r3.mNewItemStatuses
                r4 = r0[r4]
                r0 = r4 & 15
                if (r0 != 0) goto L10
                r4 = -1
                return r4
            L10:
                int r4 = r4 >> 4
                return r4
            L13:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Index out of bounds - passed position = "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r1 = ", new list size = "
                java.lang.StringBuilder r4 = r4.append(r1)
                int r1 = r3.mNewListSize
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public int convertOldPositionToNew(int r4) {
                r3 = this;
                if (r4 < 0) goto L13
                int r0 = r3.mOldListSize
                if (r4 >= r0) goto L13
                int[] r0 = r3.mOldItemStatuses
                r4 = r0[r4]
                r0 = r4 & 15
                if (r0 != 0) goto L10
                r4 = -1
                return r4
            L10:
                int r4 = r4 >> 4
                return r4
            L13:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Index out of bounds - passed position = "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r1 = ", old list size = "
                java.lang.StringBuilder r4 = r4.append(r1)
                int r1 = r3.mOldListSize
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public void dispatchUpdatesTo(androidx.recyclerview.widget.ListUpdateCallback r13) {
                r12 = this;
                boolean r0 = r13 instanceof androidx.recyclerview.widget.BatchingListUpdateCallback
                if (r0 == 0) goto L7
                androidx.recyclerview.widget.BatchingListUpdateCallback r13 = (androidx.recyclerview.widget.BatchingListUpdateCallback) r13
                goto Ld
            L7:
                androidx.recyclerview.widget.BatchingListUpdateCallback r0 = new androidx.recyclerview.widget.BatchingListUpdateCallback
                r0.<init>(r13)
                r13 = r0
            Ld:
                int r0 = r12.mOldListSize
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                int r2 = r12.mOldListSize
                int r3 = r12.mNewListSize
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r4 = r12.mDiagonals
                int r4 = r4.size()
                r5 = 1
                int r4 = r4 - r5
            L20:
                if (r4 < 0) goto Ld3
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r6 = r12.mDiagonals
                java.lang.Object r6 = r6.get(r4)
                androidx.recyclerview.widget.DiffUtil$Diagonal r6 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r6
                int r7 = r6.endX()
                int r8 = r6.endY()
            L32:
                r9 = 0
                if (r2 <= r7) goto L6f
                int r2 = r2 + (-1)
                int[] r10 = r12.mOldItemStatuses
                r10 = r10[r2]
                r11 = r10 & 12
                if (r11 == 0) goto L69
                int r11 = r10 >> 4
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r9 = getPostponedUpdate(r1, r11, r9)
                if (r9 == 0) goto L5d
                int r9 = r9.currentPos
                int r9 = r0 - r9
                int r9 = r9 - r5
                r13.onMoved(r2, r9)
                r10 = r10 & 4
                if (r10 == 0) goto L32
                androidx.recyclerview.widget.DiffUtil$Callback r10 = r12.mCallback
                java.lang.Object r10 = r10.getChangePayload(r2, r11)
                r13.onChanged(r9, r5, r10)
                goto L32
            L5d:
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r9 = new androidx.recyclerview.widget.DiffUtil$PostponedUpdate
                int r10 = r0 - r2
                int r10 = r10 - r5
                r9.<init>(r2, r10, r5)
                r1.add(r9)
                goto L32
            L69:
                r13.onRemoved(r2, r5)
                int r0 = r0 + (-1)
                goto L32
            L6f:
                if (r3 <= r8) goto Laa
                int r3 = r3 + (-1)
                int[] r7 = r12.mNewItemStatuses
                r7 = r7[r3]
                r10 = r7 & 12
                if (r10 == 0) goto La4
                int r10 = r7 >> 4
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r11 = getPostponedUpdate(r1, r10, r5)
                if (r11 != 0) goto L8e
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r7 = new androidx.recyclerview.widget.DiffUtil$PostponedUpdate
                int r10 = r0 - r2
                r7.<init>(r3, r10, r9)
                r1.add(r7)
                goto L6f
            L8e:
                int r11 = r11.currentPos
                int r11 = r0 - r11
                int r11 = r11 - r5
                r13.onMoved(r11, r2)
                r7 = r7 & 4
                if (r7 == 0) goto L6f
                androidx.recyclerview.widget.DiffUtil$Callback r7 = r12.mCallback
                java.lang.Object r7 = r7.getChangePayload(r10, r3)
                r13.onChanged(r2, r5, r7)
                goto L6f
            La4:
                r13.onInserted(r2, r5)
                int r0 = r0 + 1
                goto L6f
            Laa:
                int r2 = r6.x
                int r3 = r6.y
            Lae:
                int r7 = r6.size
                if (r9 >= r7) goto Lcb
                int[] r7 = r12.mOldItemStatuses
                r7 = r7[r2]
                r7 = r7 & 15
                r8 = 2
                if (r7 != r8) goto Lc4
                androidx.recyclerview.widget.DiffUtil$Callback r7 = r12.mCallback
                java.lang.Object r7 = r7.getChangePayload(r2, r3)
                r13.onChanged(r2, r5, r7)
            Lc4:
                int r2 = r2 + 1
                int r3 = r3 + 1
                int r9 = r9 + 1
                goto Lae
            Lcb:
                int r2 = r6.x
                int r3 = r6.y
                int r4 = r4 + (-1)
                goto L20
            Ld3:
                r13.dispatchLastEvent()
                return
        }

        public void dispatchUpdatesTo(androidx.recyclerview.widget.RecyclerView.Adapter r2) {
                r1 = this;
                androidx.recyclerview.widget.AdapterListUpdateCallback r0 = new androidx.recyclerview.widget.AdapterListUpdateCallback
                r0.<init>(r2)
                r1.dispatchUpdatesTo(r0)
                return
        }
    }

    public static abstract class ItemCallback<T> {
        public ItemCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean areContentsTheSame(T r1, T r2);

        public abstract boolean areItemsTheSame(T r1, T r2);

        public java.lang.Object getChangePayload(T r1, T r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    private static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        PostponedUpdate(int r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.posInOwnerList = r1
                r0.currentPos = r2
                r0.removal = r3
                return
        }
    }

    static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
                r0 = this;
                r0.<init>()
                return
        }

        public Range(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.oldListStart = r1
                r0.oldListEnd = r2
                r0.newListStart = r3
                r0.newListEnd = r4
                return
        }

        int newSize() {
                r2 = this;
                int r0 = r2.newListEnd
                int r1 = r2.newListStart
                int r0 = r0 - r1
                return r0
        }

        int oldSize() {
                r2 = this;
                int r0 = r2.oldListEnd
                int r1 = r2.oldListStart
                int r0 = r0 - r1
                return r0
        }
    }

    static class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        Snake() {
                r0 = this;
                r0.<init>()
                return
        }

        int diagonalSize() {
                r3 = this;
                int r0 = r3.endX
                int r1 = r3.startX
                int r0 = r0 - r1
                int r1 = r3.endY
                int r2 = r3.startY
                int r1 = r1 - r2
                int r0 = java.lang.Math.min(r0, r1)
                return r0
        }

        boolean hasAdditionOrRemoval() {
                r3 = this;
                int r0 = r3.endY
                int r1 = r3.startY
                int r0 = r0 - r1
                int r1 = r3.endX
                int r2 = r3.startX
                int r1 = r1 - r2
                if (r0 == r1) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        boolean isAddition() {
                r3 = this;
                int r0 = r3.endY
                int r1 = r3.startY
                int r0 = r0 - r1
                int r1 = r3.endX
                int r2 = r3.startX
                int r1 = r1 - r2
                if (r0 <= r1) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        androidx.recyclerview.widget.DiffUtil.Diagonal toDiagonal() {
                r4 = this;
                boolean r0 = r4.hasAdditionOrRemoval()
                if (r0 == 0) goto L3e
                boolean r0 = r4.reverse
                if (r0 == 0) goto L18
                androidx.recyclerview.widget.DiffUtil$Diagonal r0 = new androidx.recyclerview.widget.DiffUtil$Diagonal
                int r1 = r4.startX
                int r2 = r4.startY
                int r3 = r4.diagonalSize()
                r0.<init>(r1, r2, r3)
                return r0
            L18:
                boolean r0 = r4.isAddition()
                if (r0 == 0) goto L2e
                androidx.recyclerview.widget.DiffUtil$Diagonal r0 = new androidx.recyclerview.widget.DiffUtil$Diagonal
                int r1 = r4.startX
                int r2 = r4.startY
                int r2 = r2 + 1
                int r3 = r4.diagonalSize()
                r0.<init>(r1, r2, r3)
                return r0
            L2e:
                androidx.recyclerview.widget.DiffUtil$Diagonal r0 = new androidx.recyclerview.widget.DiffUtil$Diagonal
                int r1 = r4.startX
                int r1 = r1 + 1
                int r2 = r4.startY
                int r3 = r4.diagonalSize()
                r0.<init>(r1, r2, r3)
                return r0
            L3e:
                androidx.recyclerview.widget.DiffUtil$Diagonal r0 = new androidx.recyclerview.widget.DiffUtil$Diagonal
                int r1 = r4.startX
                int r2 = r4.startY
                int r3 = r4.endX
                int r3 = r3 - r1
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    static {
            androidx.recyclerview.widget.DiffUtil$1 r0 = new androidx.recyclerview.widget.DiffUtil$1
            r0.<init>()
            androidx.recyclerview.widget.DiffUtil.DIAGONAL_COMPARATOR = r0
            return
    }

    private DiffUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.recyclerview.widget.DiffUtil.Snake backward(androidx.recyclerview.widget.DiffUtil.Range r11, androidx.recyclerview.widget.DiffUtil.Callback r12, androidx.recyclerview.widget.DiffUtil.CenteredArray r13, androidx.recyclerview.widget.DiffUtil.CenteredArray r14, int r15) {
            int r0 = r11.oldSize()
            int r1 = r11.newSize()
            int r0 = r0 - r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = 0
        L11:
            int r2 = r11.oldSize()
            int r3 = r11.newSize()
            int r2 = r2 - r3
            int r3 = -r15
            r4 = r3
        L1c:
            if (r4 > r15) goto L8c
            if (r4 == r3) goto L3a
            if (r4 == r15) goto L31
            int r5 = r4 + 1
            int r5 = r14.get(r5)
            int r6 = r4 + (-1)
            int r6 = r14.get(r6)
            if (r5 >= r6) goto L31
            goto L3a
        L31:
            int r5 = r4 + (-1)
            int r5 = r14.get(r5)
            int r6 = r5 + (-1)
            goto L41
        L3a:
            int r5 = r4 + 1
            int r5 = r14.get(r5)
            r6 = r5
        L41:
            int r7 = r11.newListEnd
            int r8 = r11.oldListEnd
            int r8 = r8 - r6
            int r8 = r8 - r4
            int r7 = r7 - r8
            if (r15 == 0) goto L50
            if (r6 == r5) goto L4d
            goto L50
        L4d:
            int r8 = r7 + 1
            goto L51
        L50:
            r8 = r7
        L51:
            int r9 = r11.oldListStart
            if (r6 <= r9) goto L68
            int r9 = r11.newListStart
            if (r7 <= r9) goto L68
            int r9 = r6 + (-1)
            int r10 = r7 + (-1)
            boolean r9 = r12.areItemsTheSame(r9, r10)
            if (r9 == 0) goto L68
            int r6 = r6 + (-1)
            int r7 = r7 + (-1)
            goto L51
        L68:
            r14.set(r4, r6)
            if (r0 == 0) goto L89
            int r9 = r2 - r4
            if (r9 < r3) goto L89
            if (r9 > r15) goto L89
            int r9 = r13.get(r9)
            if (r9 < r6) goto L89
            androidx.recyclerview.widget.DiffUtil$Snake r11 = new androidx.recyclerview.widget.DiffUtil$Snake
            r11.<init>()
            r11.startX = r6
            r11.startY = r7
            r11.endX = r5
            r11.endY = r8
            r11.reverse = r1
            return r11
        L89:
            int r4 = r4 + 2
            goto L1c
        L8c:
            r11 = 0
            return r11
    }

    public static androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(androidx.recyclerview.widget.DiffUtil.Callback r1) {
            r0 = 1
            androidx.recyclerview.widget.DiffUtil$DiffResult r1 = calculateDiff(r1, r0)
            return r1
    }

    public static androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(androidx.recyclerview.widget.DiffUtil.Callback r9, boolean r10) {
            int r0 = r9.getOldListSize()
            int r1 = r9.getNewListSize()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.DiffUtil$Range r3 = new androidx.recyclerview.widget.DiffUtil$Range
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r0 = r0 + r1
            int r0 = r0 + 1
            int r0 = r0 / 2
            androidx.recyclerview.widget.DiffUtil$CenteredArray r1 = new androidx.recyclerview.widget.DiffUtil$CenteredArray
            int r0 = r0 * 2
            int r0 = r0 + 1
            r1.<init>(r0)
            androidx.recyclerview.widget.DiffUtil$CenteredArray r3 = new androidx.recyclerview.widget.DiffUtil$CenteredArray
            r3.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L33:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L9b
            int r5 = r2.size()
            int r5 = r5 + (-1)
            java.lang.Object r5 = r2.remove(r5)
            androidx.recyclerview.widget.DiffUtil$Range r5 = (androidx.recyclerview.widget.DiffUtil.Range) r5
            androidx.recyclerview.widget.DiffUtil$Snake r6 = midPoint(r5, r9, r1, r3)
            if (r6 == 0) goto L97
            int r7 = r6.diagonalSize()
            if (r7 <= 0) goto L58
            androidx.recyclerview.widget.DiffUtil$Diagonal r7 = r6.toDiagonal()
            r4.add(r7)
        L58:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L64
            androidx.recyclerview.widget.DiffUtil$Range r7 = new androidx.recyclerview.widget.DiffUtil$Range
            r7.<init>()
            goto L70
        L64:
            int r7 = r0.size()
            int r7 = r7 + (-1)
            java.lang.Object r7 = r0.remove(r7)
            androidx.recyclerview.widget.DiffUtil$Range r7 = (androidx.recyclerview.widget.DiffUtil.Range) r7
        L70:
            int r8 = r5.oldListStart
            r7.oldListStart = r8
            int r8 = r5.newListStart
            r7.newListStart = r8
            int r8 = r6.startX
            r7.oldListEnd = r8
            int r8 = r6.startY
            r7.newListEnd = r8
            r2.add(r7)
            int r7 = r5.oldListEnd
            r5.oldListEnd = r7
            int r7 = r5.newListEnd
            r5.newListEnd = r7
            int r7 = r6.endX
            r5.oldListStart = r7
            int r6 = r6.endY
            r5.newListStart = r6
            r2.add(r5)
            goto L33
        L97:
            r0.add(r5)
            goto L33
        L9b:
            java.util.Comparator<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = androidx.recyclerview.widget.DiffUtil.DIAGONAL_COMPARATOR
            java.util.Collections.sort(r4, r0)
            androidx.recyclerview.widget.DiffUtil$DiffResult r0 = new androidx.recyclerview.widget.DiffUtil$DiffResult
            int[] r5 = r1.backingData()
            int[] r6 = r3.backingData()
            r2 = r0
            r3 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }

    private static androidx.recyclerview.widget.DiffUtil.Snake forward(androidx.recyclerview.widget.DiffUtil.Range r11, androidx.recyclerview.widget.DiffUtil.Callback r12, androidx.recyclerview.widget.DiffUtil.CenteredArray r13, androidx.recyclerview.widget.DiffUtil.CenteredArray r14, int r15) {
            int r0 = r11.oldSize()
            int r1 = r11.newSize()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            int r0 = r11.oldSize()
            int r3 = r11.newSize()
            int r0 = r0 - r3
            int r3 = -r15
            r4 = r3
        L20:
            if (r4 > r15) goto L91
            if (r4 == r3) goto L3e
            if (r4 == r15) goto L35
            int r5 = r4 + 1
            int r5 = r13.get(r5)
            int r6 = r4 + (-1)
            int r6 = r13.get(r6)
            if (r5 <= r6) goto L35
            goto L3e
        L35:
            int r5 = r4 + (-1)
            int r5 = r13.get(r5)
            int r6 = r5 + 1
            goto L45
        L3e:
            int r5 = r4 + 1
            int r5 = r13.get(r5)
            r6 = r5
        L45:
            int r7 = r11.newListStart
            int r8 = r11.oldListStart
            int r8 = r6 - r8
            int r7 = r7 + r8
            int r7 = r7 - r4
            if (r15 == 0) goto L55
            if (r6 == r5) goto L52
            goto L55
        L52:
            int r8 = r7 + (-1)
            goto L56
        L55:
            r8 = r7
        L56:
            int r9 = r11.oldListEnd
            if (r6 >= r9) goto L69
            int r9 = r11.newListEnd
            if (r7 >= r9) goto L69
            boolean r9 = r12.areItemsTheSame(r6, r7)
            if (r9 == 0) goto L69
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L56
        L69:
            r13.set(r4, r6)
            if (r2 == 0) goto L8e
            int r9 = r0 - r4
            int r10 = r3 + 1
            if (r9 < r10) goto L8e
            int r10 = r15 + (-1)
            if (r9 > r10) goto L8e
            int r9 = r14.get(r9)
            if (r9 > r6) goto L8e
            androidx.recyclerview.widget.DiffUtil$Snake r11 = new androidx.recyclerview.widget.DiffUtil$Snake
            r11.<init>()
            r11.startX = r5
            r11.startY = r8
            r11.endX = r6
            r11.endY = r7
            r11.reverse = r1
            return r11
        L8e:
            int r4 = r4 + 2
            goto L20
        L91:
            r11 = 0
            return r11
    }

    private static androidx.recyclerview.widget.DiffUtil.Snake midPoint(androidx.recyclerview.widget.DiffUtil.Range r4, androidx.recyclerview.widget.DiffUtil.Callback r5, androidx.recyclerview.widget.DiffUtil.CenteredArray r6, androidx.recyclerview.widget.DiffUtil.CenteredArray r7) {
            int r0 = r4.oldSize()
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L39
            int r0 = r4.newSize()
            if (r0 >= r2) goto Lf
            goto L39
        Lf:
            int r0 = r4.oldSize()
            int r3 = r4.newSize()
            int r0 = r0 + r3
            int r0 = r0 + r2
            int r0 = r0 / 2
            int r3 = r4.oldListStart
            r6.set(r2, r3)
            int r3 = r4.oldListEnd
            r7.set(r2, r3)
            r2 = 0
        L26:
            if (r2 >= r0) goto L39
            androidx.recyclerview.widget.DiffUtil$Snake r3 = forward(r4, r5, r6, r7, r2)
            if (r3 == 0) goto L2f
            return r3
        L2f:
            androidx.recyclerview.widget.DiffUtil$Snake r3 = backward(r4, r5, r6, r7, r2)
            if (r3 == 0) goto L36
            return r3
        L36:
            int r2 = r2 + 1
            goto L26
        L39:
            return r1
    }
}
