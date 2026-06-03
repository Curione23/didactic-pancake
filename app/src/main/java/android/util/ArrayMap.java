package android.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/ArrayMap.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/ArrayMap.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/ArrayMap.class */
public final class ArrayMap<K, V> implements java.util.Map<K, V> {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArrayMap";
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    static final int[] EMPTY_IMMUTABLE_INTS = null;
    public static final android.util.ArrayMap EMPTY = null;
    static java.lang.Object[] mBaseCache;
    static int mBaseCacheSize;
    static java.lang.Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    int[] mHashes;
    java.lang.Object[] mArray;
    int mSize;
    android.util.MapCollections<K, V> mCollections;


    int indexOf(java.lang.Object r6, int r7) {
            r5 = this;
            r0 = r5
            int r0 = r0.mSize
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lb
            r0 = -1
            return r0
        Lb:
            r0 = r5
            int[] r0 = r0.mHashes
            r1 = r8
            r2 = r7
            int r0 = android.util.ContainerHelpers.binarySearch(r0, r1, r2)
            r9 = r0
            r0 = r9
            if (r0 >= 0) goto L1e
            r0 = r9
            return r0
        L1e:
            r0 = r6
            r1 = r5
            java.lang.Object[] r1 = r1.mArray
            r2 = r9
            r3 = 1
            int r2 = r2 << r3
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            r0 = r9
            return r0
        L31:
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
        L37:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L61
            r0 = r5
            int[] r0 = r0.mHashes
            r1 = r10
            r0 = r0[r1]
            r1 = r7
            if (r0 != r1) goto L61
            r0 = r6
            r1 = r5
            java.lang.Object[] r1 = r1.mArray
            r2 = r10
            r3 = 1
            int r2 = r2 << r3
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5b
            r0 = r10
            return r0
        L5b:
            int r10 = r10 + 1
            goto L37
        L61:
            r0 = r9
            r1 = 1
            int r0 = r0 - r1
            r11 = r0
        L67:
            r0 = r11
            if (r0 < 0) goto L90
            r0 = r5
            int[] r0 = r0.mHashes
            r1 = r11
            r0 = r0[r1]
            r1 = r7
            if (r0 != r1) goto L90
            r0 = r6
            r1 = r5
            java.lang.Object[] r1 = r1.mArray
            r2 = r11
            r3 = 1
            int r2 = r2 << r3
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8a
            r0 = r11
            return r0
        L8a:
            int r11 = r11 + (-1)
            goto L67
        L90:
            r0 = r10
            r1 = -1
            r0 = r0 ^ r1
            return r0
    }

    int indexOfNull() {
            r5 = this;
            r0 = r5
            int r0 = r0.mSize
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lb
            r0 = -1
            return r0
        Lb:
            r0 = r5
            int[] r0 = r0.mHashes
            r1 = r6
            r2 = 0
            int r0 = android.util.ContainerHelpers.binarySearch(r0, r1, r2)
            r7 = r0
            r0 = r7
            if (r0 >= 0) goto L1b
            r0 = r7
            return r0
        L1b:
            r0 = 0
            r1 = r5
            java.lang.Object[] r1 = r1.mArray
            r2 = r7
            r3 = 1
            int r2 = r2 << r3
            r1 = r1[r2]
            if (r0 != r1) goto L29
            r0 = r7
            return r0
        L29:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
        L2d:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L4f
            r0 = r5
            int[] r0 = r0.mHashes
            r1 = r8
            r0 = r0[r1]
            if (r0 != 0) goto L4f
            r0 = 0
            r1 = r5
            java.lang.Object[] r1 = r1.mArray
            r2 = r8
            r3 = 1
            int r2 = r2 << r3
            r1 = r1[r2]
            if (r0 != r1) goto L49
            r0 = r8
            return r0
        L49:
            int r8 = r8 + 1
            goto L2d
        L4f:
            r0 = r7
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
        L54:
            r0 = r9
            if (r0 < 0) goto L79
            r0 = r5
            int[] r0 = r0.mHashes
            r1 = r9
            r0 = r0[r1]
            if (r0 != 0) goto L79
            r0 = 0
            r1 = r5
            java.lang.Object[] r1 = r1.mArray
            r2 = r9
            r3 = 1
            int r2 = r2 << r3
            r1 = r1[r2]
            if (r0 != r1) goto L73
            r0 = r9
            return r0
        L73:
            int r9 = r9 + (-1)
            goto L54
        L79:
            r0 = r8
            r1 = -1
            r0 = r0 ^ r1
            return r0
    }

    private void allocArrays(int r8) {
            r7 = this;
            r0 = r7
            int[] r0 = r0.mHashes
            int[] r1 = android.util.ArrayMap.EMPTY_IMMUTABLE_INTS
            if (r0 != r1) goto L14
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "ArrayMap is immutable"
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r8
            r1 = 8
            if (r0 != r1) goto L63
            java.lang.Class<android.util.ArrayMap> r0 = android.util.ArrayMap.class
            r1 = r0
            r9 = r1
            monitor-enter(r0)
            java.lang.Object[] r0 = android.util.ArrayMap.mTwiceBaseCache     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L54
            java.lang.Object[] r0 = android.util.ArrayMap.mTwiceBaseCache     // Catch: java.lang.Throwable -> L59
            r10 = r0
            r0 = r7
            r1 = r10
            r0.mArray = r1     // Catch: java.lang.Throwable -> L59
            r0 = r10
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> L59
            android.util.ArrayMap.mTwiceBaseCache = r0     // Catch: java.lang.Throwable -> L59
            r0 = r7
            r1 = r10
            r2 = 1
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L59
            int[] r1 = (int[]) r1     // Catch: java.lang.Throwable -> L59
            r0.mHashes = r1     // Catch: java.lang.Throwable -> L59
            r0 = r10
            r1 = 0
            r2 = r10
            r3 = 1
            r4 = 0
            r5 = r4; r4 = r3; r3 = r2; r2 = r5;      // Catch: java.lang.Throwable -> L59
            r3[r4] = r5     // Catch: java.lang.Throwable -> L59
            r0[r1] = r2     // Catch: java.lang.Throwable -> L59
            int r0 = android.util.ArrayMap.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L59
            r1 = 1
            int r0 = r0 - r1
            android.util.ArrayMap.mTwiceBaseCacheSize = r0     // Catch: java.lang.Throwable -> L59
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return
        L54:
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            goto L60
        L59:
            r11 = move-exception
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            r0 = r11
            throw r0
        L60:
            goto Lae
        L63:
            r0 = r8
            r1 = 4
            if (r0 != r1) goto Lae
            java.lang.Class<android.util.ArrayMap> r0 = android.util.ArrayMap.class
            r1 = r0
            r9 = r1
            monitor-enter(r0)
            java.lang.Object[] r0 = android.util.ArrayMap.mBaseCache     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto La2
            java.lang.Object[] r0 = android.util.ArrayMap.mBaseCache     // Catch: java.lang.Throwable -> La7
            r10 = r0
            r0 = r7
            r1 = r10
            r0.mArray = r1     // Catch: java.lang.Throwable -> La7
            r0 = r10
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> La7
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.Throwable -> La7
            android.util.ArrayMap.mBaseCache = r0     // Catch: java.lang.Throwable -> La7
            r0 = r7
            r1 = r10
            r2 = 1
            r1 = r1[r2]     // Catch: java.lang.Throwable -> La7
            int[] r1 = (int[]) r1     // Catch: java.lang.Throwable -> La7
            r0.mHashes = r1     // Catch: java.lang.Throwable -> La7
            r0 = r10
            r1 = 0
            r2 = r10
            r3 = 1
            r4 = 0
            r5 = r4; r4 = r3; r3 = r2; r2 = r5;      // Catch: java.lang.Throwable -> La7
            r3[r4] = r5     // Catch: java.lang.Throwable -> La7
            r0[r1] = r2     // Catch: java.lang.Throwable -> La7
            int r0 = android.util.ArrayMap.mBaseCacheSize     // Catch: java.lang.Throwable -> La7
            r1 = 1
            int r0 = r0 - r1
            android.util.ArrayMap.mBaseCacheSize = r0     // Catch: java.lang.Throwable -> La7
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            return
        La2:
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            goto Lae
        La7:
            r12 = move-exception
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            r0 = r12
            throw r0
        Lae:
            r0 = r7
            r1 = r8
            int[] r1 = new int[r1]
            r0.mHashes = r1
            r0 = r7
            r1 = r8
            r2 = 1
            int r1 = r1 << r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.mArray = r1
            return
    }

    private static void freeArrays(int[] r4, java.lang.Object[] r5, int r6) {
            r0 = r4
            int r0 = r0.length
            r1 = 8
            if (r0 != r1) goto L51
            java.lang.Class<android.util.ArrayMap> r0 = android.util.ArrayMap.class
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            int r0 = android.util.ArrayMap.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L47
            r1 = 10
            if (r0 >= r1) goto L42
            r0 = r5
            r1 = 0
            java.lang.Object[] r2 = android.util.ArrayMap.mTwiceBaseCache     // Catch: java.lang.Throwable -> L47
            r0[r1] = r2     // Catch: java.lang.Throwable -> L47
            r0 = r5
            r1 = 1
            r2 = r4
            r0[r1] = r2     // Catch: java.lang.Throwable -> L47
            r0 = r6
            r1 = 1
            int r0 = r0 << r1
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
        L25:
            r0 = r8
            r1 = 2
            if (r0 < r1) goto L36
            r0 = r5
            r1 = r8
            r2 = 0
            r0[r1] = r2     // Catch: java.lang.Throwable -> L47
            int r8 = r8 + (-1)
            goto L25
        L36:
            r0 = r5
            android.util.ArrayMap.mTwiceBaseCache = r0     // Catch: java.lang.Throwable -> L47
            int r0 = android.util.ArrayMap.mTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L47
            r1 = 1
            int r0 = r0 + r1
            android.util.ArrayMap.mTwiceBaseCacheSize = r0     // Catch: java.lang.Throwable -> L47
        L42:
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            goto L4e
        L47:
            r9 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            r0 = r9
            throw r0
        L4e:
            goto L9e
        L51:
            r0 = r4
            int r0 = r0.length
            r1 = 4
            if (r0 != r1) goto L9e
            java.lang.Class<android.util.ArrayMap> r0 = android.util.ArrayMap.class
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            int r0 = android.util.ArrayMap.mBaseCacheSize     // Catch: java.lang.Throwable -> L97
            r1 = 10
            if (r0 >= r1) goto L92
            r0 = r5
            r1 = 0
            java.lang.Object[] r2 = android.util.ArrayMap.mBaseCache     // Catch: java.lang.Throwable -> L97
            r0[r1] = r2     // Catch: java.lang.Throwable -> L97
            r0 = r5
            r1 = 1
            r2 = r4
            r0[r1] = r2     // Catch: java.lang.Throwable -> L97
            r0 = r6
            r1 = 1
            int r0 = r0 << r1
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
        L75:
            r0 = r8
            r1 = 2
            if (r0 < r1) goto L86
            r0 = r5
            r1 = r8
            r2 = 0
            r0[r1] = r2     // Catch: java.lang.Throwable -> L97
            int r8 = r8 + (-1)
            goto L75
        L86:
            r0 = r5
            android.util.ArrayMap.mBaseCache = r0     // Catch: java.lang.Throwable -> L97
            int r0 = android.util.ArrayMap.mBaseCacheSize     // Catch: java.lang.Throwable -> L97
            r1 = 1
            int r0 = r0 + r1
            android.util.ArrayMap.mBaseCacheSize = r0     // Catch: java.lang.Throwable -> L97
        L92:
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            goto L9e
        L97:
            r10 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            r0 = r10
            throw r0
        L9e:
            return
    }

    public ArrayMap() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            int[] r1 = android.util.EmptyArray.INT
            r0.mHashes = r1
            r0 = r3
            java.lang.Object[] r1 = android.util.EmptyArray.OBJECT
            r0.mArray = r1
            r0 = r3
            r1 = 0
            r0.mSize = r1
            return
    }

    public ArrayMap(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r4
            if (r0 != 0) goto L19
            r0 = r3
            int[] r1 = android.util.EmptyArray.INT
            r0.mHashes = r1
            r0 = r3
            java.lang.Object[] r1 = android.util.EmptyArray.OBJECT
            r0.mArray = r1
            goto L1e
        L19:
            r0 = r3
            r1 = r4
            r0.allocArrays(r1)
        L1e:
            r0 = r3
            r1 = 0
            r0.mSize = r1
            return
    }

    private ArrayMap(boolean r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            if (r1 == 0) goto Lf
            int[] r1 = android.util.ArrayMap.EMPTY_IMMUTABLE_INTS
            goto L12
        Lf:
            int[] r1 = android.util.EmptyArray.INT
        L12:
            r0.mHashes = r1
            r0 = r3
            java.lang.Object[] r1 = android.util.EmptyArray.OBJECT
            r0.mArray = r1
            r0 = r3
            r1 = 0
            r0.mSize = r1
            return
    }

    public ArrayMap(android.util.ArrayMap<K, V> r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r4
            if (r0 == 0) goto Ld
            r0 = r3
            r1 = r4
            r0.putAll(r1)
        Ld:
            return
    }

    @Override // java.util.Map
    public void clear() {
            r4 = this;
            r0 = r4
            int r0 = r0.mSize
            if (r0 <= 0) goto L29
            r0 = r4
            int[] r0 = r0.mHashes
            r1 = r4
            java.lang.Object[] r1 = r1.mArray
            r2 = r4
            int r2 = r2.mSize
            freeArrays(r0, r1, r2)
            r0 = r4
            int[] r1 = android.util.EmptyArray.INT
            r0.mHashes = r1
            r0 = r4
            java.lang.Object[] r1 = android.util.EmptyArray.OBJECT
            r0.mArray = r1
            r0 = r4
            r1 = 0
            r0.mSize = r1
        L29:
            return
    }

    public void erase() {
            r4 = this;
            r0 = r4
            int r0 = r0.mSize
            if (r0 <= 0) goto L29
            r0 = r4
            int r0 = r0.mSize
            r1 = 1
            int r0 = r0 << r1
            r5 = r0
            r0 = r4
            java.lang.Object[] r0 = r0.mArray
            r6 = r0
            r0 = 0
            r7 = r0
        L15:
            r0 = r7
            r1 = r5
            if (r0 >= r1) goto L24
            r0 = r6
            r1 = r7
            r2 = 0
            r0[r1] = r2
            int r7 = r7 + 1
            goto L15
        L24:
            r0 = r4
            r1 = 0
            r0.mSize = r1
        L29:
            return
    }

    public void ensureCapacity(int r8) {
            r7 = this;
            r0 = r7
            int[] r0 = r0.mHashes
            int r0 = r0.length
            r1 = r8
            if (r0 >= r1) goto L46
            r0 = r7
            int[] r0 = r0.mHashes
            r9 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r10 = r0
            r0 = r7
            r1 = r8
            r0.allocArrays(r1)
            r0 = r7
            int r0 = r0.mSize
            if (r0 <= 0) goto L3d
            r0 = r9
            r1 = 0
            r2 = r7
            int[] r2 = r2.mHashes
            r3 = 0
            r4 = r7
            int r4 = r4.mSize
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = 0
            r2 = r7
            java.lang.Object[] r2 = r2.mArray
            r3 = 0
            r4 = r7
            int r4 = r4.mSize
            r5 = 1
            int r4 = r4 << r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L3d:
            r0 = r9
            r1 = r10
            r2 = r7
            int r2 = r2.mSize
            freeArrays(r0, r1, r2)
        L46:
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public int indexOfKey(java.lang.Object r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto Lb
            r0 = r4
            int r0 = r0.indexOfNull()
            goto L14
        Lb:
            r0 = r4
            r1 = r5
            r2 = r5
            int r2 = r2.hashCode()
            int r0 = r0.indexOf(r1, r2)
        L14:
            return r0
    }

    int indexOfValue(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.mSize
            r1 = 2
            int r0 = r0 * r1
            r6 = r0
            r0 = r4
            java.lang.Object[] r0 = r0.mArray
            r7 = r0
            r0 = r5
            if (r0 != 0) goto L2e
            r0 = 1
            r8 = r0
        L13:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L2b
            r0 = r7
            r1 = r8
            r0 = r0[r1]
            if (r0 != 0) goto L25
            r0 = r8
            r1 = 1
            int r0 = r0 >> r1
            return r0
        L25:
            int r8 = r8 + 2
            goto L13
        L2b:
            goto L4d
        L2e:
            r0 = 1
            r8 = r0
        L31:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L4d
            r0 = r5
            r1 = r7
            r2 = r8
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            r0 = r8
            r1 = 1
            int r0 = r0 >> r1
            return r0
        L47:
            int r8 = r8 + 2
            goto L31
        L4d:
            r0 = -1
            return r0
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.indexOfValue(r1)
            if (r0 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.indexOfKey(r1)
            r6 = r0
            r0 = r6
            if (r0 < 0) goto L17
            r0 = r4
            java.lang.Object[] r0 = r0.mArray
            r1 = r6
            r2 = 1
            int r1 = r1 << r2
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public K keyAt(int r5) {
            r4 = this;
            r0 = r4
            java.lang.Object[] r0 = r0.mArray
            r1 = r5
            r2 = 1
            int r1 = r1 << r2
            r0 = r0[r1]
            return r0
    }

    public V valueAt(int r5) {
            r4 = this;
            r0 = r4
            java.lang.Object[] r0 = r0.mArray
            r1 = r5
            r2 = 1
            int r1 = r1 << r2
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
    }

    public V setValueAt(int r5, V r6) {
            r4 = this;
            r0 = r5
            r1 = 1
            int r0 = r0 << r1
            r1 = 1
            int r0 = r0 + r1
            r5 = r0
            r0 = r4
            java.lang.Object[] r0 = r0.mArray
            r1 = r5
            r0 = r0[r1]
            r7 = r0
            r0 = r4
            java.lang.Object[] r0 = r0.mArray
            r1 = r5
            r2 = r6
            r0[r1] = r2
            r0 = r7
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r2 = this;
            r0 = r2
            int r0 = r0.mSize
            if (r0 > 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public V put(K r8, V r9) {
            r7 = this;
            r0 = r8
            if (r0 != 0) goto Lf
            r0 = 0
            r10 = r0
            r0 = r7
            int r0 = r0.indexOfNull()
            r11 = r0
            goto L1c
        Lf:
            r0 = r8
            int r0 = r0.hashCode()
            r10 = r0
            r0 = r7
            r1 = r8
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r11 = r0
        L1c:
            r0 = r11
            if (r0 < 0) goto L3d
            r0 = r11
            r1 = 1
            int r0 = r0 << r1
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r11
            r2 = r9
            r0[r1] = r2
            r0 = r12
            return r0
        L3d:
            r0 = r11
            r1 = -1
            r0 = r0 ^ r1
            r11 = r0
            r0 = r7
            int r0 = r0.mSize
            r1 = r7
            int[] r1 = r1.mHashes
            int r1 = r1.length
            if (r0 < r1) goto Lb7
            r0 = r7
            int r0 = r0.mSize
            r1 = 8
            if (r0 < r1) goto L66
            r0 = r7
            int r0 = r0.mSize
            r1 = r7
            int r1 = r1.mSize
            r2 = 1
            int r1 = r1 >> r2
            int r0 = r0 + r1
            goto L74
        L66:
            r0 = r7
            int r0 = r0.mSize
            r1 = 4
            if (r0 < r1) goto L73
            r0 = 8
            goto L74
        L73:
            r0 = 4
        L74:
            r12 = r0
            r0 = r7
            int[] r0 = r0.mHashes
            r13 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r14 = r0
            r0 = r7
            r1 = r12
            r0.allocArrays(r1)
            r0 = r7
            int[] r0 = r0.mHashes
            int r0 = r0.length
            if (r0 <= 0) goto Lac
            r0 = r13
            r1 = 0
            r2 = r7
            int[] r2 = r2.mHashes
            r3 = 0
            r4 = r13
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r14
            r1 = 0
            r2 = r7
            java.lang.Object[] r2 = r2.mArray
            r3 = 0
            r4 = r14
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        Lac:
            r0 = r13
            r1 = r14
            r2 = r7
            int r2 = r2.mSize
            freeArrays(r0, r1, r2)
        Lb7:
            r0 = r11
            r1 = r7
            int r1 = r1.mSize
            if (r0 >= r1) goto Lf6
            r0 = r7
            int[] r0 = r0.mHashes
            r1 = r11
            r2 = r7
            int[] r2 = r2.mHashes
            r3 = r11
            r4 = 1
            int r3 = r3 + r4
            r4 = r7
            int r4 = r4.mSize
            r5 = r11
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r11
            r2 = 1
            int r1 = r1 << r2
            r2 = r7
            java.lang.Object[] r2 = r2.mArray
            r3 = r11
            r4 = 1
            int r3 = r3 + r4
            r4 = 1
            int r3 = r3 << r4
            r4 = r7
            int r4 = r4.mSize
            r5 = r11
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 << r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        Lf6:
            r0 = r7
            int[] r0 = r0.mHashes
            r1 = r11
            r2 = r10
            r0[r1] = r2
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r11
            r2 = 1
            int r1 = r1 << r2
            r2 = r8
            r0[r1] = r2
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r11
            r2 = 1
            int r1 = r1 << r2
            r2 = 1
            int r1 = r1 + r2
            r2 = r9
            r0[r1] = r2
            r0 = r7
            r1 = r0
            int r1 = r1.mSize
            r2 = 1
            int r1 = r1 + r2
            r0.mSize = r1
            r0 = 0
            return r0
    }

    public void append(K r7, V r8) {
            r6 = this;
            r0 = r6
            int r0 = r0.mSize
            r9 = r0
            r0 = r7
            if (r0 != 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            r0 = r7
            int r0 = r0.hashCode()
        L11:
            r10 = r0
            r0 = r9
            r1 = r6
            int[] r1 = r1.mHashes
            int r1 = r1.length
            if (r0 < r1) goto L26
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Array is full"
            r1.<init>(r2)
            throw r0
        L26:
            r0 = r9
            if (r0 <= 0) goto L91
            r0 = r6
            int[] r0 = r0.mHashes
            r1 = r9
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = r10
            if (r0 <= r1) goto L91
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "here"
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            java.lang.Throwable r0 = r0.fillInStackTrace()
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "New hash "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is before end of array hash "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            int[] r2 = r2.mHashes
            r3 = r9
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " key "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r11
            r0.printStackTrace()
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            return
        L91:
            r0 = r6
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r0.mSize = r1
            r0 = r6
            int[] r0 = r0.mHashes
            r1 = r9
            r2 = r10
            r0[r1] = r2
            r0 = r9
            r1 = 1
            int r0 = r0 << r1
            r9 = r0
            r0 = r6
            java.lang.Object[] r0 = r0.mArray
            r1 = r9
            r2 = r7
            r0[r1] = r2
            r0 = r6
            java.lang.Object[] r0 = r0.mArray
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r8
            r0[r1] = r2
            return
    }

    public void validate() {
            r5 = this;
            r0 = r5
            int r0 = r0.mSize
            r6 = r0
            r0 = r6
            r1 = 1
            if (r0 > r1) goto Lb
            return
        Lb:
            r0 = r5
            int[] r0 = r0.mHashes
            r1 = 0
            r0 = r0[r1]
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 1
            r9 = r0
        L17:
            r0 = r9
            r1 = r6
            if (r0 >= r1) goto Lb6
            r0 = r5
            int[] r0 = r0.mHashes
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            r1 = r7
            if (r0 == r1) goto L35
            r0 = r10
            r7 = r0
            r0 = r9
            r8 = r0
            goto Lb0
        L35:
            r0 = r5
            java.lang.Object[] r0 = r0.mArray
            r1 = r9
            r2 = 1
            int r1 = r1 << r2
            r0 = r0[r1]
            r11 = r0
            r0 = r9
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
        L46:
            r0 = r12
            r1 = r8
            if (r0 < r1) goto Lb0
            r0 = r5
            java.lang.Object[] r0 = r0.mArray
            r1 = r12
            r2 = 1
            int r1 = r1 << r2
            r0 = r0[r1]
            r13 = r0
            r0 = r11
            r1 = r13
            if (r0 != r1) goto L7a
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Duplicate key in ArrayMap: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L7a:
            r0 = r11
            if (r0 == 0) goto Laa
            r0 = r13
            if (r0 == 0) goto Laa
            r0 = r11
            r1 = r13
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Laa
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Duplicate key in ArrayMap: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Laa:
            int r12 = r12 + (-1)
            goto L46
        Lb0:
            int r9 = r9 + 1
            goto L17
        Lb6:
            return
    }

    public void putAll(android.util.ArrayMap<? extends K, ? extends V> r8) {
            r7 = this;
            r0 = r8
            int r0 = r0.mSize
            r9 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.mSize
            r2 = r9
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            r0 = r7
            int r0 = r0.mSize
            if (r0 != 0) goto L40
            r0 = r9
            if (r0 <= 0) goto L5c
            r0 = r8
            int[] r0 = r0.mHashes
            r1 = 0
            r2 = r7
            int[] r2 = r2.mHashes
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            java.lang.Object[] r0 = r0.mArray
            r1 = 0
            r2 = r7
            java.lang.Object[] r2 = r2.mArray
            r3 = 0
            r4 = r9
            r5 = 1
            int r4 = r4 << r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = r9
            r0.mSize = r1
            goto L5c
        L40:
            r0 = 0
            r10 = r0
        L42:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L5c
            r0 = r7
            r1 = r8
            r2 = r10
            java.lang.Object r1 = r1.keyAt(r2)
            r2 = r8
            r3 = r10
            java.lang.Object r2 = r2.valueAt(r3)
            java.lang.Object r0 = r0.put(r1, r2)
            int r10 = r10 + 1
            goto L42
        L5c:
            return
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.indexOfKey(r1)
            r5 = r0
            r0 = r5
            if (r0 < 0) goto L10
            r0 = r3
            r1 = r5
            java.lang.Object r0 = r0.removeAt(r1)
            return r0
        L10:
            r0 = 0
            return r0
    }

    public V removeAt(int r8) {
            r7 = this;
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r8
            r2 = 1
            int r1 = r1 << r2
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r9 = r0
            r0 = r7
            int r0 = r0.mSize
            r1 = 1
            if (r0 > r1) goto L38
            r0 = r7
            int[] r0 = r0.mHashes
            r1 = r7
            java.lang.Object[] r1 = r1.mArray
            r2 = r7
            int r2 = r2.mSize
            freeArrays(r0, r1, r2)
            r0 = r7
            int[] r1 = android.util.EmptyArray.INT
            r0.mHashes = r1
            r0 = r7
            java.lang.Object[] r1 = android.util.EmptyArray.OBJECT
            r0.mArray = r1
            r0 = r7
            r1 = 0
            r0.mSize = r1
            goto L136
        L38:
            r0 = r7
            int[] r0 = r0.mHashes
            int r0 = r0.length
            r1 = 8
            if (r0 <= r1) goto Lda
            r0 = r7
            int r0 = r0.mSize
            r1 = r7
            int[] r1 = r1.mHashes
            int r1 = r1.length
            r2 = 3
            int r1 = r1 / r2
            if (r0 >= r1) goto Lda
            r0 = r7
            int r0 = r0.mSize
            r1 = 8
            if (r0 <= r1) goto L67
            r0 = r7
            int r0 = r0.mSize
            r1 = r7
            int r1 = r1.mSize
            r2 = 1
            int r1 = r1 >> r2
            int r0 = r0 + r1
            goto L69
        L67:
            r0 = 8
        L69:
            r10 = r0
            r0 = r7
            int[] r0 = r0.mHashes
            r11 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r12 = r0
            r0 = r7
            r1 = r10
            r0.allocArrays(r1)
            r0 = r7
            r1 = r0
            int r1 = r1.mSize
            r2 = 1
            int r1 = r1 - r2
            r0.mSize = r1
            r0 = r8
            if (r0 <= 0) goto La3
            r0 = r11
            r1 = 0
            r2 = r7
            int[] r2 = r2.mHashes
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r12
            r1 = 0
            r2 = r7
            java.lang.Object[] r2 = r2.mArray
            r3 = 0
            r4 = r8
            r5 = 1
            int r4 = r4 << r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        La3:
            r0 = r8
            r1 = r7
            int r1 = r1.mSize
            if (r0 >= r1) goto Ld7
            r0 = r11
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            int[] r2 = r2.mHashes
            r3 = r8
            r4 = r7
            int r4 = r4.mSize
            r5 = r8
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r12
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 << r2
            r2 = r7
            java.lang.Object[] r2 = r2.mArray
            r3 = r8
            r4 = 1
            int r3 = r3 << r4
            r4 = r7
            int r4 = r4.mSize
            r5 = r8
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 << r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        Ld7:
            goto L136
        Lda:
            r0 = r7
            r1 = r0
            int r1 = r1.mSize
            r2 = 1
            int r1 = r1 - r2
            r0.mSize = r1
            r0 = r8
            r1 = r7
            int r1 = r1.mSize
            if (r0 >= r1) goto L11c
            r0 = r7
            int[] r0 = r0.mHashes
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            int[] r2 = r2.mHashes
            r3 = r8
            r4 = r7
            int r4 = r4.mSize
            r5 = r8
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 << r2
            r2 = r7
            java.lang.Object[] r2 = r2.mArray
            r3 = r8
            r4 = 1
            int r3 = r3 << r4
            r4 = r7
            int r4 = r4.mSize
            r5 = r8
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 << r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L11c:
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r7
            int r1 = r1.mSize
            r2 = 1
            int r1 = r1 << r2
            r2 = 0
            r0[r1] = r2
            r0 = r7
            java.lang.Object[] r0 = r0.mArray
            r1 = r7
            int r1 = r1.mSize
            r2 = 1
            int r1 = r1 << r2
            r2 = 1
            int r1 = r1 + r2
            r2 = 0
            r0[r1] = r2
        L136:
            r0 = r9
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r2 = this;
            r0 = r2
            int r0 = r0.mSize
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto L78
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            r5 = r0
            r0 = r3
            int r0 = r0.size()
            r1 = r5
            int r1 = r1.size()
            if (r0 == r1) goto L22
            r0 = 0
            return r0
        L22:
            r0 = 0
            r6 = r0
        L24:
            r0 = r6
            r1 = r3
            int r1 = r1.mSize     // Catch: java.lang.NullPointerException -> L70 java.lang.ClassCastException -> L73
            if (r0 >= r1) goto L6d
            r0 = r3
            r1 = r6
            java.lang.Object r0 = r0.keyAt(r1)     // Catch: java.lang.NullPointerException -> L70 java.lang.ClassCastException -> L73
            r7 = r0
            r0 = r3
            r1 = r6
            java.lang.Object r0 = r0.valueAt(r1)     // Catch: java.lang.NullPointerException -> L70 java.lang.ClassCastException -> L73
            r8 = r0
            r0 = r5
            r1 = r7
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NullPointerException -> L70 java.lang.ClassCastException -> L73
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L5b
            r0 = r9
            if (r0 != 0) goto L59
            r0 = r5
            r1 = r7
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.NullPointerException -> L70 java.lang.ClassCastException -> L73
            if (r0 != 0) goto L67
        L59:
            r0 = 0
            return r0
        L5b:
            r0 = r8
            r1 = r9
            boolean r0 = r0.equals(r1)     // Catch: java.lang.NullPointerException -> L70 java.lang.ClassCastException -> L73
            if (r0 != 0) goto L67
            r0 = 0
            return r0
        L67:
            int r6 = r6 + 1
            goto L24
        L6d:
            goto L76
        L70:
            r6 = move-exception
            r0 = 0
            return r0
        L73:
            r6 = move-exception
            r0 = 0
            return r0
        L76:
            r0 = 1
            return r0
        L78:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r4 = this;
            r0 = r4
            int[] r0 = r0.mHashes
            r5 = r0
            r0 = r4
            java.lang.Object[] r0 = r0.mArray
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r4
            int r0 = r0.mSize
            r10 = r0
        L18:
            r0 = r8
            r1 = r10
            if (r0 >= r1) goto L44
            r0 = r6
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r7
            r1 = r5
            r2 = r8
            r1 = r1[r2]
            r2 = r11
            if (r2 != 0) goto L33
            r2 = 0
            goto L38
        L33:
            r2 = r11
            int r2 = r2.hashCode()
        L38:
            r1 = r1 ^ r2
            int r0 = r0 + r1
            r7 = r0
            int r8 = r8 + 1
            int r9 = r9 + 2
            goto L18
        L44:
            r0 = r7
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            java.lang.String r0 = "{}"
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r5
            int r2 = r2.mSize
            r3 = 28
            int r2 = r2 * r3
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r7 = r0
        L22:
            r0 = r7
            r1 = r5
            int r1 = r1.mSize
            if (r0 >= r1) goto L7b
            r0 = r7
            if (r0 <= 0) goto L35
            r0 = r6
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L35:
            r0 = r5
            r1 = r7
            java.lang.Object r0 = r0.keyAt(r1)
            r8 = r0
            r0 = r8
            r1 = r5
            if (r0 == r1) goto L49
            r0 = r6
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L50
        L49:
            r0 = r6
            java.lang.String r1 = "(this Map)"
            java.lang.StringBuilder r0 = r0.append(r1)
        L50:
            r0 = r6
            r1 = 61
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r7
            java.lang.Object r0 = r0.valueAt(r1)
            r9 = r0
            r0 = r9
            r1 = r5
            if (r0 == r1) goto L6e
            r0 = r6
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L75
        L6e:
            r0 = r6
            java.lang.String r1 = "(this Map)"
            java.lang.StringBuilder r0 = r0.append(r1)
        L75:
            int r7 = r7 + 1
            goto L22
        L7b:
            r0 = r6
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    private android.util.MapCollections<K, V> getCollection() {
            r5 = this;
            r0 = r5
            android.util.MapCollections<K, V> r0 = r0.mCollections
            if (r0 != 0) goto L13
            r0 = r5
            android.util.ArrayMap$1 r1 = new android.util.ArrayMap$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.mCollections = r1
        L13:
            r0 = r5
            android.util.MapCollections<K, V> r0 = r0.mCollections
            return r0
    }

    public boolean containsAll(java.util.Collection<?> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = android.util.MapCollections.containsAllHelper(r0, r1)
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            int r1 = r1.mSize
            r2 = r5
            int r2 = r2.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            r0 = r5
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L1b:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L42
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r7 = r0
            r0 = r4
            r1 = r7
            java.lang.Object r1 = r1.getKey()
            r2 = r7
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r0 = r0.put(r1, r2)
            goto L1b
        L42:
            return
    }

    public boolean removeAll(java.util.Collection<?> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = android.util.MapCollections.removeAllHelper(r0, r1)
            return r0
    }

    public boolean retainAll(java.util.Collection<?> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = android.util.MapCollections.retainAllHelper(r0, r1)
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            r0 = r2
            android.util.MapCollections r0 = r0.getCollection()
            java.util.Set r0 = r0.getEntrySet()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r2 = this;
            r0 = r2
            android.util.MapCollections r0 = r0.getCollection()
            java.util.Set r0 = r0.getKeySet()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r2 = this;
            r0 = r2
            android.util.MapCollections r0 = r0.getCollection()
            java.util.Collection r0 = r0.getValues()
            return r0
    }

    static {
            r0 = 0
            int[] r0 = new int[r0]
            android.util.ArrayMap.EMPTY_IMMUTABLE_INTS = r0
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            android.util.ArrayMap.EMPTY = r0
            return
    }
}
