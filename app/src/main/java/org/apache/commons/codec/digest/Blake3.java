package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes2.dex */
public final class Blake3 {
    private static final int BLOCK_INTS = 16;
    private static final int BLOCK_LEN = 64;
    private static final int CHAINING_VALUE_INTS = 8;
    private static final int CHUNK_END = 2;
    private static final int CHUNK_LEN = 1024;
    private static final int CHUNK_START = 1;
    private static final int DERIVE_KEY_CONTEXT = 32;
    private static final int DERIVE_KEY_MATERIAL = 64;
    private static final int[] IV = null;
    private static final int KEYED_HASH = 16;
    private static final int KEY_INTS = 8;
    private static final int KEY_LEN = 32;
    private static final byte[][] MSG_SCHEDULE = null;
    private static final int OUT_LEN = 32;
    private static final int PARENT = 4;
    private static final int ROOT = 8;
    private final org.apache.commons.codec.digest.Blake3.EngineState engineState;

    /* JADX INFO: renamed from: org.apache.commons.codec.digest.Blake3$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class ChunkState {
        private final byte[] block;
        private int blockLength;
        private int blocksCompressed;
        private int[] chainingValue;
        private final long chunkCounter;
        private final int flags;

        private ChunkState(int[] r2, long r3, int r5) {
                r1 = this;
                r1.<init>()
                r0 = 64
                byte[] r0 = new byte[r0]
                r1.block = r0
                r1.chainingValue = r2
                r1.chunkCounter = r3
                r1.flags = r5
                return
        }

        /* synthetic */ ChunkState(int[] r1, long r2, int r4, org.apache.commons.codec.digest.Blake3.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                return
        }

        static /* synthetic */ int access$500(org.apache.commons.codec.digest.Blake3.ChunkState r0) {
                int r0 = r0.length()
                return r0
        }

        static /* synthetic */ org.apache.commons.codec.digest.Blake3.Output access$600(org.apache.commons.codec.digest.Blake3.ChunkState r0) {
                org.apache.commons.codec.digest.Blake3$Output r0 = r0.output()
                return r0
        }

        static /* synthetic */ long access$800(org.apache.commons.codec.digest.Blake3.ChunkState r2) {
                long r0 = r2.chunkCounter
                return r0
        }

        static /* synthetic */ void access$900(org.apache.commons.codec.digest.Blake3.ChunkState r0, byte[] r1, int r2, int r3) {
                r0.update(r1, r2, r3)
                return
        }

        private int length() {
                r2 = this;
                int r0 = r2.blocksCompressed
                int r0 = r0 * 64
                int r1 = r2.blockLength
                int r0 = r0 + r1
                return r0
        }

        private org.apache.commons.codec.digest.Blake3.Output output() {
                r10 = this;
                byte[] r0 = r10.block
                r1 = 16
                int[] r4 = org.apache.commons.codec.digest.Blake3.access$000(r0, r1)
                int r0 = r10.flags
                int r1 = r10.startFlag()
                r0 = r0 | r1
                r8 = r0 | 2
                org.apache.commons.codec.digest.Blake3$Output r0 = new org.apache.commons.codec.digest.Blake3$Output
                int[] r3 = r10.chainingValue
                long r5 = r10.chunkCounter
                int r7 = r10.blockLength
                r9 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r7, r8, r9)
                return r0
        }

        private int startFlag() {
                r1 = this;
                int r0 = r1.blocksCompressed
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        private void update(byte[] r10, int r11, int r12) {
                r9 = this;
            L0:
                if (r12 <= 0) goto L4e
                int r0 = r9.blockLength
                r1 = 64
                if (r0 != r1) goto L38
                byte[] r0 = r9.block
                r2 = 16
                int[] r4 = org.apache.commons.codec.digest.Blake3.access$000(r0, r2)
                int[] r3 = r9.chainingValue
                long r6 = r9.chunkCounter
                int r0 = r9.flags
                int r2 = r9.startFlag()
                r8 = r0 | r2
                r5 = 64
                int[] r0 = org.apache.commons.codec.digest.Blake3.access$200(r3, r4, r5, r6, r8)
                r2 = 8
                int[] r0 = java.util.Arrays.copyOf(r0, r2)
                r9.chainingValue = r0
                int r0 = r9.blocksCompressed
                int r0 = r0 + 1
                r9.blocksCompressed = r0
                r0 = 0
                r9.blockLength = r0
                byte[] r2 = r9.block
                java.util.Arrays.fill(r2, r0)
            L38:
                int r0 = r9.blockLength
                int r1 = r1 - r0
                int r0 = java.lang.Math.min(r1, r12)
                byte[] r1 = r9.block
                int r2 = r9.blockLength
                java.lang.System.arraycopy(r10, r11, r1, r2, r0)
                int r1 = r9.blockLength
                int r1 = r1 + r0
                r9.blockLength = r1
                int r11 = r11 + r0
                int r12 = r12 - r0
                goto L0
            L4e:
                return
        }
    }

    private static final class EngineState {
        private final int[][] cvStack;
        private final int flags;
        private final int[] key;
        private int stackLen;
        private org.apache.commons.codec.digest.Blake3.ChunkState state;

        private EngineState(int[] r8, int r9) {
                r7 = this;
                r7.<init>()
                r0 = 54
                int[][] r0 = new int[r0][]
                r7.cvStack = r0
                r7.key = r8
                r7.flags = r9
                org.apache.commons.codec.digest.Blake3$ChunkState r0 = new org.apache.commons.codec.digest.Blake3$ChunkState
                r3 = 0
                r6 = 0
                r1 = r0
                r2 = r8
                r5 = r9
                r1.<init>(r2, r3, r5, r6)
                r7.state = r0
                return
        }

        /* synthetic */ EngineState(int[] r1, int r2, org.apache.commons.codec.digest.Blake3.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ void access$1400(org.apache.commons.codec.digest.Blake3.EngineState r0, byte[] r1, int r2, int r3) {
                r0.inputData(r1, r2, r3)
                return
        }

        static /* synthetic */ void access$1500(org.apache.commons.codec.digest.Blake3.EngineState r0, byte[] r1, int r2, int r3) {
                r0.outputHash(r1, r2, r3)
                return
        }

        static /* synthetic */ void access$1600(org.apache.commons.codec.digest.Blake3.EngineState r0) {
                r0.reset()
                return
        }

        private void addChunkCV(int[] r5, long r6) {
                r4 = this;
            L0:
                r0 = 1
                long r0 = r0 & r6
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L18
                int[] r0 = r4.popCV()
                int[] r1 = r4.key
                int r2 = r4.flags
                int[] r5 = org.apache.commons.codec.digest.Blake3.access$400(r0, r5, r1, r2)
                r0 = 1
                long r6 = r6 >> r0
                goto L0
            L18:
                r4.pushCV(r5)
                return
        }

        private void inputData(byte[] r13, int r14, int r15) {
                r12 = this;
            L0:
                if (r15 <= 0) goto L43
                org.apache.commons.codec.digest.Blake3$ChunkState r0 = r12.state
                int r0 = org.apache.commons.codec.digest.Blake3.ChunkState.access$500(r0)
                r1 = 1024(0x400, float:1.435E-42)
                if (r0 != r1) goto L30
                org.apache.commons.codec.digest.Blake3$ChunkState r0 = r12.state
                org.apache.commons.codec.digest.Blake3$Output r0 = org.apache.commons.codec.digest.Blake3.ChunkState.access$600(r0)
                int[] r0 = org.apache.commons.codec.digest.Blake3.Output.access$700(r0)
                org.apache.commons.codec.digest.Blake3$ChunkState r2 = r12.state
                long r2 = org.apache.commons.codec.digest.Blake3.ChunkState.access$800(r2)
                r4 = 1
                long r8 = r2 + r4
                r12.addChunkCV(r0, r8)
                org.apache.commons.codec.digest.Blake3$ChunkState r0 = new org.apache.commons.codec.digest.Blake3$ChunkState
                int[] r7 = r12.key
                int r10 = r12.flags
                r11 = 0
                r6 = r0
                r6.<init>(r7, r8, r10, r11)
                r12.state = r0
            L30:
                org.apache.commons.codec.digest.Blake3$ChunkState r0 = r12.state
                int r0 = org.apache.commons.codec.digest.Blake3.ChunkState.access$500(r0)
                int r1 = r1 - r0
                int r0 = java.lang.Math.min(r1, r15)
                org.apache.commons.codec.digest.Blake3$ChunkState r1 = r12.state
                org.apache.commons.codec.digest.Blake3.ChunkState.access$900(r1, r13, r14, r0)
                int r14 = r14 + r0
                int r15 = r15 - r0
                goto L0
            L43:
                return
        }

        private void outputHash(byte[] r6, int r7, int r8) {
                r5 = this;
                org.apache.commons.codec.digest.Blake3$ChunkState r0 = r5.state
                org.apache.commons.codec.digest.Blake3$Output r0 = org.apache.commons.codec.digest.Blake3.ChunkState.access$600(r0)
                int r1 = r5.stackLen
            L8:
                int r2 = r1 + (-1)
                if (r1 <= 0) goto L1e
                int[][] r1 = r5.cvStack
                r1 = r1[r2]
                int[] r0 = org.apache.commons.codec.digest.Blake3.Output.access$700(r0)
                int[] r3 = r5.key
                int r4 = r5.flags
                org.apache.commons.codec.digest.Blake3$Output r0 = org.apache.commons.codec.digest.Blake3.access$1000(r1, r0, r3, r4)
                r1 = r2
                goto L8
            L1e:
                org.apache.commons.codec.digest.Blake3.Output.access$1100(r0, r6, r7, r8)
                return
        }

        private int[] popCV() {
                r2 = this;
                int[][] r0 = r2.cvStack
                int r1 = r2.stackLen
                int r1 = r1 + (-1)
                r2.stackLen = r1
                r0 = r0[r1]
                return r0
        }

        private void pushCV(int[] r4) {
                r3 = this;
                int[][] r0 = r3.cvStack
                int r1 = r3.stackLen
                int r2 = r1 + 1
                r3.stackLen = r2
                r0[r1] = r4
                return
        }

        private void reset() {
                r8 = this;
                r0 = 0
                r8.stackLen = r0
                int[][] r0 = r8.cvStack
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                org.apache.commons.codec.digest.Blake3$ChunkState r0 = new org.apache.commons.codec.digest.Blake3$ChunkState
                int[] r3 = r8.key
                int r6 = r8.flags
                r7 = 0
                r4 = 0
                r2 = r0
                r2.<init>(r3, r4, r6, r7)
                r8.state = r0
                return
        }
    }

    private static final class Output {
        private final int blockLength;
        private final int[] blockWords;
        private final long counter;
        private final int flags;
        private final int[] inputChainingValue;

        private Output(int[] r1, int[] r2, long r3, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.inputChainingValue = r1
                r0.blockWords = r2
                r0.counter = r3
                r0.blockLength = r5
                r0.flags = r6
                return
        }

        /* synthetic */ Output(int[] r1, int[] r2, long r3, int r5, int r6, org.apache.commons.codec.digest.Blake3.AnonymousClass1 r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r5, r6)
                return
        }

        static /* synthetic */ void access$1100(org.apache.commons.codec.digest.Blake3.Output r0, byte[] r1, int r2, int r3) {
                r0.rootOutputBytes(r1, r2, r3)
                return
        }

        static /* synthetic */ int[] access$700(org.apache.commons.codec.digest.Blake3.Output r0) {
                int[] r0 = r0.chainingValue()
                return r0
        }

        private int[] chainingValue() {
                r6 = this;
                int[] r0 = r6.inputChainingValue
                int[] r1 = r6.blockWords
                int r2 = r6.blockLength
                long r3 = r6.counter
                int r5 = r6.flags
                int[] r0 = org.apache.commons.codec.digest.Blake3.access$200(r0, r1, r2, r3, r5)
                r1 = 8
                int[] r0 = java.util.Arrays.copyOf(r0, r1)
                return r0
        }

        private void rootOutputBytes(byte[] r11, int r12, int r13) {
                r10 = this;
                r0 = 0
                r1 = r0
            L2:
                if (r13 <= 0) goto L31
                r2 = 64
                int r2 = java.lang.Math.min(r2, r13)
                int r13 = r13 - r2
                int[] r3 = r10.inputChainingValue
                int[] r4 = r10.blockWords
                int r5 = r10.blockLength
                int r9 = r1 + 1
                long r6 = (long) r1
                int r1 = r10.flags
                r8 = r1 | 8
                int[] r1 = org.apache.commons.codec.digest.Blake3.access$200(r3, r4, r5, r6, r8)
                r3 = r0
            L1d:
                if (r2 <= 0) goto L2f
                r4 = 4
                int r4 = java.lang.Math.min(r4, r2)
                int r5 = r3 + 1
                r3 = r1[r3]
                org.apache.commons.codec.digest.Blake3.access$1200(r3, r11, r12, r4)
                int r12 = r12 + r4
                int r2 = r2 - r4
                r3 = r5
                goto L1d
            L2f:
                r1 = r9
                goto L2
            L31:
                return
        }
    }

    static {
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0036: FILL_ARRAY_DATA , data: [1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225} // fill-array
            org.apache.commons.codec.digest.Blake3.IV = r0
            r0 = 16
            byte[] r1 = new byte[r0]
            r1 = {x004a: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15} // fill-array
            byte[] r2 = new byte[r0]
            r2 = {x0056: FILL_ARRAY_DATA , data: [2, 6, 3, 10, 7, 0, 4, 13, 1, 11, 12, 5, 9, 14, 15, 8} // fill-array
            byte[] r3 = new byte[r0]
            r3 = {x0062: FILL_ARRAY_DATA , data: [3, 4, 10, 12, 13, 2, 7, 14, 6, 5, 9, 0, 11, 15, 8, 1} // fill-array
            byte[] r4 = new byte[r0]
            r4 = {x006e: FILL_ARRAY_DATA , data: [10, 7, 12, 9, 14, 3, 13, 15, 4, 0, 11, 2, 5, 8, 1, 6} // fill-array
            byte[] r5 = new byte[r0]
            r5 = {x007a: FILL_ARRAY_DATA , data: [12, 13, 9, 11, 15, 10, 14, 8, 7, 2, 5, 3, 0, 1, 6, 4} // fill-array
            byte[] r6 = new byte[r0]
            r6 = {x0086: FILL_ARRAY_DATA , data: [9, 14, 11, 5, 8, 12, 15, 1, 13, 3, 0, 10, 2, 6, 4, 7} // fill-array
            byte[] r7 = new byte[r0]
            r7 = {x0092: FILL_ARRAY_DATA , data: [11, 15, 5, 0, 1, 9, 8, 6, 14, 10, 2, 12, 3, 4, 7, 13} // fill-array
            byte[][] r0 = new byte[][]{r1, r2, r3, r4, r5, r6, r7}
            org.apache.commons.codec.digest.Blake3.MSG_SCHEDULE = r0
            return
    }

    private Blake3(int[] r3, int r4) {
            r2 = this;
            r2.<init>()
            org.apache.commons.codec.digest.Blake3$EngineState r0 = new org.apache.commons.codec.digest.Blake3$EngineState
            r1 = 0
            r0.<init>(r3, r4, r1)
            r2.engineState = r0
            return
    }

    static /* synthetic */ int[] access$000(byte[] r0, int r1) {
            int[] r0 = unpackInts(r0, r1)
            return r0
    }

    static /* synthetic */ org.apache.commons.codec.digest.Blake3.Output access$1000(int[] r0, int[] r1, int[] r2, int r3) {
            org.apache.commons.codec.digest.Blake3$Output r0 = parentOutput(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ void access$1200(int r0, byte[] r1, int r2, int r3) {
            packInt(r0, r1, r2, r3)
            return
    }

    static /* synthetic */ int[] access$200(int[] r0, int[] r1, int r2, long r3, int r5) {
            int[] r0 = compress(r0, r1, r2, r3, r5)
            return r0
    }

    static /* synthetic */ int[] access$400(int[] r0, int[] r1, int[] r2, int r3) {
            int[] r0 = parentChainingValue(r0, r1, r2, r3)
            return r0
    }

    private static void checkBufferArgs(byte[] r3, int r4, int r5) {
            java.util.Objects.requireNonNull(r3)
            if (r4 < 0) goto L3e
            if (r5 < 0) goto L36
            int r3 = r3.length
            int r0 = r3 - r5
            if (r4 > r0) goto Ld
            return
        Ld:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Offset "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " and length "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " out of bounds with buffer length "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L36:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "Length must be non-negative"
            r3.<init>(r4)
            throw r3
        L3e:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "Offset must be non-negative"
            r3.<init>(r4)
            throw r3
    }

    private static int[] compress(int[] r5, int[] r6, int r7, long r8, int r10) {
            r0 = 16
            int[] r0 = java.util.Arrays.copyOf(r5, r0)
            int[] r1 = org.apache.commons.codec.digest.Blake3.IV
            r2 = 8
            r3 = 4
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r0, r2, r3)
            r1 = 12
            int r2 = (int) r8
            r0[r1] = r2
            r1 = 32
            long r8 = r8 >> r1
            int r8 = (int) r8
            r9 = 13
            r0[r9] = r8
            r8 = 14
            r0[r8] = r7
            r7 = 15
            r0[r7] = r10
            r7 = r4
        L25:
            r8 = 7
            if (r7 >= r8) goto L32
            byte[][] r8 = org.apache.commons.codec.digest.Blake3.MSG_SCHEDULE
            r8 = r8[r7]
            round(r0, r6, r8)
            int r7 = r7 + 1
            goto L25
        L32:
            int r6 = r0.length
            int r6 = r6 / 2
            if (r4 >= r6) goto L4a
            r6 = r0[r4]
            int r7 = r4 + 8
            r8 = r0[r7]
            r6 = r6 ^ r8
            r0[r4] = r6
            r6 = r0[r7]
            r8 = r5[r4]
            r6 = r6 ^ r8
            r0[r7] = r6
            int r4 = r4 + 1
            goto L32
        L4a:
            return r0
    }

    private static void g(int[] r2, int r3, int r4, int r5, int r6, int r7, int r8) {
            r0 = r2[r3]
            r1 = r2[r4]
            int r1 = r1 + r7
            int r0 = r0 + r1
            r2[r3] = r0
            r7 = r2[r6]
            r7 = r7 ^ r0
            r0 = 16
            int r7 = java.lang.Integer.rotateRight(r7, r0)
            r2[r6] = r7
            r0 = r2[r5]
            int r0 = r0 + r7
            r2[r5] = r0
            r7 = r2[r4]
            r7 = r7 ^ r0
            r0 = 12
            int r7 = java.lang.Integer.rotateRight(r7, r0)
            r2[r4] = r7
            r0 = r2[r3]
            int r7 = r7 + r8
            int r0 = r0 + r7
            r2[r3] = r0
            r3 = r2[r6]
            r3 = r3 ^ r0
            r7 = 8
            int r3 = java.lang.Integer.rotateRight(r3, r7)
            r2[r6] = r3
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            r3 = r2[r4]
            r3 = r3 ^ r6
            r5 = 7
            int r3 = java.lang.Integer.rotateRight(r3, r5)
            r2[r4] = r3
            return
    }

    public static byte[] hash(byte[] r1) {
            org.apache.commons.codec.digest.Blake3 r0 = initHash()
            org.apache.commons.codec.digest.Blake3 r1 = r0.update(r1)
            r0 = 32
            byte[] r1 = r1.doFinalize(r0)
            return r1
    }

    public static org.apache.commons.codec.digest.Blake3 initHash() {
            org.apache.commons.codec.digest.Blake3 r0 = new org.apache.commons.codec.digest.Blake3
            int[] r1 = org.apache.commons.codec.digest.Blake3.IV
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static org.apache.commons.codec.digest.Blake3 initKeyDerivationFunction(byte[] r4) {
            java.util.Objects.requireNonNull(r4)
            org.apache.commons.codec.digest.Blake3$EngineState r0 = new org.apache.commons.codec.digest.Blake3$EngineState
            int[] r1 = org.apache.commons.codec.digest.Blake3.IV
            r2 = 0
            r3 = 32
            r0.<init>(r1, r3, r2)
            int r1 = r4.length
            r2 = 0
            org.apache.commons.codec.digest.Blake3.EngineState.access$1400(r0, r4, r2, r1)
            byte[] r4 = new byte[r3]
            org.apache.commons.codec.digest.Blake3.EngineState.access$1500(r0, r4, r2, r3)
            org.apache.commons.codec.digest.Blake3 r0 = new org.apache.commons.codec.digest.Blake3
            r1 = 8
            int[] r4 = unpackInts(r4, r1)
            r1 = 64
            r0.<init>(r4, r1)
            return r0
    }

    public static org.apache.commons.codec.digest.Blake3 initKeyedHash(byte[] r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = r2.length
            r1 = 32
            if (r0 != r1) goto L16
            org.apache.commons.codec.digest.Blake3 r0 = new org.apache.commons.codec.digest.Blake3
            r1 = 8
            int[] r2 = unpackInts(r2, r1)
            r1 = 16
            r0.<init>(r2, r1)
            return r0
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Blake3 keys must be 32 bytes"
            r2.<init>(r0)
            throw r2
    }

    public static byte[] keyedHash(byte[] r0, byte[] r1) {
            org.apache.commons.codec.digest.Blake3 r0 = initKeyedHash(r0)
            org.apache.commons.codec.digest.Blake3 r0 = r0.update(r1)
            r1 = 32
            byte[] r0 = r0.doFinalize(r1)
            return r0
    }

    private static void packInt(int r3, byte[] r4, int r5, int r6) {
            r0 = 0
        L1:
            if (r0 >= r6) goto Lf
            int r1 = r5 + r0
            int r2 = r0 * 8
            int r2 = r3 >>> r2
            byte r2 = (byte) r2
            r4[r1] = r2
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    private static int[] parentChainingValue(int[] r0, int[] r1, int[] r2, int r3) {
            org.apache.commons.codec.digest.Blake3$Output r0 = parentOutput(r0, r1, r2, r3)
            int[] r0 = org.apache.commons.codec.digest.Blake3.Output.access$700(r0)
            return r0
    }

    private static org.apache.commons.codec.digest.Blake3.Output parentOutput(int[] r9, int[] r10, int[] r11, int r12) {
            r0 = 16
            int[] r3 = java.util.Arrays.copyOf(r9, r0)
            r9 = 0
            r0 = 8
            java.lang.System.arraycopy(r10, r9, r3, r0, r0)
            org.apache.commons.codec.digest.Blake3$Output r9 = new org.apache.commons.codec.digest.Blake3$Output
            java.lang.Object r10 = r11.clone()
            r2 = r10
            int[] r2 = (int[]) r2
            r7 = r12 | 4
            r8 = 0
            r4 = 0
            r6 = 64
            r1 = r9
            r1.<init>(r2, r3, r4, r6, r7, r8)
            return r9
    }

    private static void round(int[] r8, int[] r9, byte[] r10) {
            r0 = 0
            r0 = r10[r0]
            r6 = r9[r0]
            r0 = 1
            r0 = r10[r0]
            r7 = r9[r0]
            r2 = 0
            r3 = 4
            r4 = 8
            r5 = 12
            r1 = r8
            g(r1, r2, r3, r4, r5, r6, r7)
            r0 = 2
            r0 = r10[r0]
            r6 = r9[r0]
            r0 = 3
            r0 = r10[r0]
            r7 = r9[r0]
            r2 = 1
            r3 = 5
            r4 = 9
            r5 = 13
            g(r1, r2, r3, r4, r5, r6, r7)
            r0 = 4
            r0 = r10[r0]
            r6 = r9[r0]
            r0 = 5
            r0 = r10[r0]
            r7 = r9[r0]
            r2 = 2
            r3 = 6
            r4 = 10
            r5 = 14
            g(r1, r2, r3, r4, r5, r6, r7)
            r0 = 6
            r0 = r10[r0]
            r6 = r9[r0]
            r0 = 7
            r0 = r10[r0]
            r7 = r9[r0]
            r2 = 3
            r3 = 7
            r4 = 11
            r5 = 15
            g(r1, r2, r3, r4, r5, r6, r7)
            r0 = 8
            r0 = r10[r0]
            r6 = r9[r0]
            r0 = 9
            r0 = r10[r0]
            r7 = r9[r0]
            r2 = 0
            r3 = 5
            r4 = 10
            g(r1, r2, r3, r4, r5, r6, r7)
            r0 = 10
            r0 = r10[r0]
            r6 = r9[r0]
            r0 = 11
            r0 = r10[r0]
            r7 = r9[r0]
            r2 = 1
            r3 = 6
            r4 = 11
            r5 = 12
            g(r1, r2, r3, r4, r5, r6, r7)
            r0 = 12
            r0 = r10[r0]
            r6 = r9[r0]
            r0 = 13
            r0 = r10[r0]
            r7 = r9[r0]
            r2 = 2
            r3 = 7
            r4 = 8
            r5 = 13
            g(r1, r2, r3, r4, r5, r6, r7)
            r0 = 14
            r0 = r10[r0]
            r6 = r9[r0]
            r0 = 15
            r10 = r10[r0]
            r7 = r9[r10]
            r2 = 3
            r3 = 4
            r4 = 9
            r5 = 14
            g(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private static int unpackInt(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    private static int[] unpackInts(byte[] r4, int r5) {
            int[] r0 = new int[r5]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r5) goto L11
            int r3 = unpackInt(r4, r2)
            r0[r1] = r3
            int r1 = r1 + 1
            int r2 = r2 + 4
            goto L4
        L11:
            return r0
    }

    public org.apache.commons.codec.digest.Blake3 doFinalize(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            org.apache.commons.codec.digest.Blake3 r3 = r2.doFinalize(r3, r0, r1)
            return r3
    }

    public org.apache.commons.codec.digest.Blake3 doFinalize(byte[] r2, int r3, int r4) {
            r1 = this;
            checkBufferArgs(r2, r3, r4)
            org.apache.commons.codec.digest.Blake3$EngineState r0 = r1.engineState
            org.apache.commons.codec.digest.Blake3.EngineState.access$1500(r0, r2, r3, r4)
            return r1
    }

    public byte[] doFinalize(int r2) {
            r1 = this;
            if (r2 < 0) goto L8
            byte[] r2 = new byte[r2]
            r1.doFinalize(r2)
            return r2
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Requested bytes must be non-negative"
            r2.<init>(r0)
            throw r2
    }

    public org.apache.commons.codec.digest.Blake3 reset() {
            r1 = this;
            org.apache.commons.codec.digest.Blake3$EngineState r0 = r1.engineState
            org.apache.commons.codec.digest.Blake3.EngineState.access$1600(r0)
            return r1
    }

    public org.apache.commons.codec.digest.Blake3 update(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            org.apache.commons.codec.digest.Blake3 r3 = r2.update(r3, r0, r1)
            return r3
    }

    public org.apache.commons.codec.digest.Blake3 update(byte[] r2, int r3, int r4) {
            r1 = this;
            checkBufferArgs(r2, r3, r4)
            org.apache.commons.codec.digest.Blake3$EngineState r0 = r1.engineState
            org.apache.commons.codec.digest.Blake3.EngineState.access$1400(r0, r2, r3, r4)
            return r1
    }
}
