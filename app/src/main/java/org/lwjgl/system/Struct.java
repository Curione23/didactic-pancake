package org.lwjgl.system;

import org.lwjgl.system.Struct;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct.class */
public abstract class Struct<SELF extends org.lwjgl.system.Struct<SELF>> extends org.lwjgl.system.Pointer.Default {
    protected static final int DEFAULT_PACK_ALIGNMENT = 0;
    protected static final int DEFAULT_ALIGN_AS = 0;

    @javax.annotation.Nullable
    protected java.nio.ByteBuffer container;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$Layout.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$Layout.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$Layout.class */
    protected static class Layout extends org.lwjgl.system.Struct.Member {
        final org.lwjgl.system.Struct.Member[] members;

        Layout(int r6, int r7, boolean r8, org.lwjgl.system.Struct.Member[] r9) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3)
                r0 = r5
                r1 = r9
                r0.members = r1
                return
        }

        public int offsetof(int r4) {
                r3 = this;
                r0 = r3
                org.lwjgl.system.Struct$Member[] r0 = r0.members
                r1 = r4
                r0 = r0[r1]
                int r0 = r0.offset
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$Member.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$Member.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$Member.class */
    protected static class Member {
        final int size;
        final int alignment;
        final boolean forcedAlignment;
        int offset;

        Member(int r4, int r5, boolean r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.size = r1
                r0 = r3
                r1 = r5
                r0.alignment = r1
                r0 = r3
                r1 = r6
                r0.forcedAlignment = r1
                return
        }

        public int getSize() {
                r2 = this;
                r0 = r2
                int r0 = r0.size
                return r0
        }

        public int getAlignment() {
                r2 = this;
                r0 = r2
                int r0 = r0.alignment
                return r0
        }

        public int getAlignment(int r4) {
                r3 = this;
                r0 = r3
                boolean r0 = r0.forcedAlignment
                if (r0 == 0) goto Le
                r0 = r3
                int r0 = r0.alignment
                goto L16
            Le:
                r0 = r3
                int r0 = r0.alignment
                r1 = r4
                int r0 = java.lang.Math.min(r0, r1)
            L16:
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$StructValidation.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$StructValidation.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Struct$StructValidation.class */
    @java.lang.FunctionalInterface
    public interface StructValidation {
        void validate(long r1);
    }

    protected Struct(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            r1 = r7
            r0.container = r1
            return
    }

    protected abstract SELF create(long r1, @javax.annotation.Nullable java.nio.ByteBuffer r3);

    public abstract int sizeof();

    public void clear() {
            r6 = this;
            r0 = r6
            long r0 = r0.address()
            r1 = 0
            r2 = r6
            int r2 = r2.sizeof()
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memSet(r0, r1, r2)
            return
    }

    public void free() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.MemoryUtil.nmemFree(r0)
            return
    }

    public boolean isNull(int r6) {
            r5 = this;
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = r6
            r0.checkMemberOffset(r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    private void checkMemberOffset(int r5) {
            r4 = this;
            r0 = r5
            if (r0 < 0) goto L10
            r0 = r4
            int r0 = r0.sizeof()
            r1 = r5
            int r0 = r0 - r1
            int r1 = org.lwjgl.system.Struct.POINTER_SIZE
            if (r0 >= r1) goto L1a
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Invalid member offset."
            r1.<init>(r2)
            throw r0
        L1a:
            return
    }

    protected static java.nio.ByteBuffer __checkContainer(java.nio.ByteBuffer r3, int r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = r4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            return r0
    }

    private static long getBytes(int r5, int r6) {
            r0 = r5
            long r0 = (long) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r1 = r6
            long r1 = (long) r1
            long r0 = r0 * r1
            return r0
    }

    protected static long __checkMalloc(int r5, int r6) {
            r0 = r5
            long r0 = (long) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r1 = r6
            long r1 = (long) r1
            long r0 = r0 * r1
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L36
            r0 = r5
            if (r0 >= 0) goto L1e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Invalid number of elements"
            r1.<init>(r2)
            throw r0
        L1e:
            boolean r0 = org.lwjgl.system.Struct.BITS32
            if (r0 == 0) goto L36
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L36
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The request allocation is too large"
            r1.<init>(r2)
            throw r0
        L36:
            r0 = r7
            return r0
    }

    protected static java.nio.ByteBuffer __create(int r6, int r7) {
            r0 = r6
            r1 = r6
            r2 = r7
            long r1 = getBytes(r1, r2)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = org.lwjgl.system.APIUtil.apiCheckAllocation(r0, r1, r2)
            r0 = r6
            r1 = r7
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            return r0
    }

    @javax.annotation.Nullable
    protected static <T extends org.lwjgl.system.Struct<T>> java.nio.ByteBuffer __getContainer(T r2) {
            r0 = r2
            java.nio.ByteBuffer r0 = r0.container
            return r0
    }

    @javax.annotation.Nullable
    protected static java.nio.ByteBuffer __getContainer(org.lwjgl.system.StructBuffer<?, ?> r2) {
            r0 = r2
            java.nio.ByteBuffer r0 = r0.container
            return r0
    }

    public static void validate(long r8, int r10, int r11, org.lwjgl.system.Struct.StructValidation r12) {
            r0 = 0
            r13 = r0
        L3:
            r0 = r13
            r1 = r10
            if (r0 >= r1) goto L20
            r0 = r12
            r1 = r8
            r2 = r13
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r11
            long r3 = (long) r3
            long r2 = r2 * r3
            long r1 = r1 + r2
            r0.validate(r1)
            int r13 = r13 + 1
            goto L3
        L20:
            return
    }

    protected static org.lwjgl.system.Struct.Member __padding(int r4, boolean r5) {
            r0 = r4
            r1 = 1
            r2 = r5
            org.lwjgl.system.Struct$Member r0 = __padding(r0, r1, r2)
            return r0
    }

    protected static org.lwjgl.system.Struct.Member __padding(int r3, int r4, boolean r5) {
            r0 = r5
            if (r0 == 0) goto La
            r0 = r3
            r1 = r4
            int r0 = r0 * r1
            goto Lb
        La:
            r0 = 0
        Lb:
            r1 = r4
            org.lwjgl.system.Struct$Member r0 = __member(r0, r1)
            return r0
    }

    protected static org.lwjgl.system.Struct.Member __member(int r3) {
            r0 = r3
            r1 = r3
            org.lwjgl.system.Struct$Member r0 = __member(r0, r1)
            return r0
    }

    protected static org.lwjgl.system.Struct.Member __member(int r4, int r5) {
            r0 = r4
            r1 = r5
            r2 = 0
            org.lwjgl.system.Struct$Member r0 = __member(r0, r1, r2)
            return r0
    }

    protected static org.lwjgl.system.Struct.Member __member(int r6, int r7, boolean r8) {
            org.lwjgl.system.Struct$Member r0 = new org.lwjgl.system.Struct$Member
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    protected static org.lwjgl.system.Struct.Member __array(int r4, int r5) {
            r0 = r4
            r1 = r4
            r2 = r5
            org.lwjgl.system.Struct$Member r0 = __array(r0, r1, r2)
            return r0
    }

    protected static org.lwjgl.system.Struct.Member __array(int r6, int r7, int r8) {
            org.lwjgl.system.Struct$Member r0 = new org.lwjgl.system.Struct$Member
            r1 = r0
            r2 = r6
            r3 = r8
            int r2 = r2 * r3
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            return r0
    }

    protected static org.lwjgl.system.Struct.Member __array(int r6, int r7, boolean r8, int r9) {
            org.lwjgl.system.Struct$Member r0 = new org.lwjgl.system.Struct$Member
            r1 = r0
            r2 = r6
            r3 = r9
            int r2 = r2 * r3
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    protected static org.lwjgl.system.Struct.Layout __union(org.lwjgl.system.Struct.Member... r4) {
            int r0 = org.lwjgl.system.Struct.DEFAULT_PACK_ALIGNMENT
            r1 = 0
            r2 = r4
            org.lwjgl.system.Struct$Layout r0 = __union(r0, r1, r2)
            return r0
    }

    protected static org.lwjgl.system.Struct.Layout __union(int r8, int r9, org.lwjgl.system.Struct.Member... r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r10
            int r2 = r2.length
            r1.<init>(r2)
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r9
            r13 = r0
            r0 = r10
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r16 = r0
        L1b:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L66
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            r0 = r12
            r1 = r17
            int r1 = r1.size
            int r0 = java.lang.Math.max(r0, r1)
            r12 = r0
            r0 = r13
            r1 = r17
            r2 = r8
            int r1 = r1.getAlignment(r2)
            int r0 = java.lang.Math.max(r0, r1)
            r13 = r0
            r0 = r17
            r1 = 0
            r0.offset = r1
            r0 = r11
            r1 = r17
            boolean r0 = r0.add(r1)
            r0 = r17
            boolean r0 = r0 instanceof org.lwjgl.system.Struct.Layout
            if (r0 == 0) goto L60
            r0 = r17
            r1 = r11
            r2 = 0
            addNestedMembers(r0, r1, r2)
        L60:
            int r16 = r16 + 1
            goto L1b
        L66:
            org.lwjgl.system.Struct$Layout r0 = new org.lwjgl.system.Struct$Layout
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r9
            if (r4 == 0) goto L76
            r4 = 1
            goto L77
        L76:
            r4 = 0
        L77:
            r5 = r11
            r6 = 0
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.lwjgl.system.Struct$Member[] r5 = (org.lwjgl.system.Struct.Member[]) r5
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    protected static org.lwjgl.system.Struct.Layout __struct(org.lwjgl.system.Struct.Member... r4) {
            int r0 = org.lwjgl.system.Struct.DEFAULT_PACK_ALIGNMENT
            r1 = 0
            r2 = r4
            org.lwjgl.system.Struct$Layout r0 = __struct(r0, r1, r2)
            return r0
    }

    protected static org.lwjgl.system.Struct.Layout __struct(int r8, int r9, org.lwjgl.system.Struct.Member... r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r10
            int r2 = r2.length
            r1.<init>(r2)
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r9
            r13 = r0
            r0 = r10
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r16 = r0
        L1b:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L75
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            r1 = r8
            int r0 = r0.getAlignment(r1)
            r18 = r0
            r0 = r17
            r1 = r12
            r2 = r18
            int r1 = align(r1, r2)
            r0.offset = r1
            r0 = r17
            int r0 = r0.offset
            r1 = r17
            int r1 = r1.size
            int r0 = r0 + r1
            r12 = r0
            r0 = r13
            r1 = r18
            int r0 = java.lang.Math.max(r0, r1)
            r13 = r0
            r0 = r11
            r1 = r17
            boolean r0 = r0.add(r1)
            r0 = r17
            boolean r0 = r0 instanceof org.lwjgl.system.Struct.Layout
            if (r0 == 0) goto L6f
            r0 = r17
            r1 = r11
            r2 = r17
            int r2 = r2.offset
            addNestedMembers(r0, r1, r2)
        L6f:
            int r16 = r16 + 1
            goto L1b
        L75:
            r0 = r12
            r1 = r13
            int r0 = align(r0, r1)
            r12 = r0
            org.lwjgl.system.Struct$Layout r0 = new org.lwjgl.system.Struct$Layout
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r9
            if (r4 == 0) goto L8e
            r4 = 1
            goto L8f
        L8e:
            r4 = 0
        L8f:
            r5 = r11
            r6 = 0
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            org.lwjgl.system.Struct$Member[] r5 = (org.lwjgl.system.Struct.Member[]) r5
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private static void addNestedMembers(org.lwjgl.system.Struct.Member r4, java.util.List<org.lwjgl.system.Struct.Member> r5, int r6) {
            r0 = r4
            org.lwjgl.system.Struct$Layout r0 = (org.lwjgl.system.Struct.Layout) r0
            r7 = r0
            r0 = r7
            org.lwjgl.system.Struct$Member[] r0 = r0.members
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L13:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L3b
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r1 = r0
            int r1 = r1.offset
            r2 = r6
            int r1 = r1 + r2
            r0.offset = r1
            r0 = r5
            r1 = r11
            boolean r0 = r0.add(r1)
            int r10 = r10 + 1
            goto L13
        L3b:
            return
    }

    private static int align(int r4, int r5) {
            r0 = r4
            r1 = 1
            int r0 = r0 - r1
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            r0 = r0 | r1
            r1 = 1
            int r0 = r0 + r1
            return r0
    }

    static {
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS
            if (r0 != r1) goto Le
            r0 = 8
            goto L10
        Le:
            r0 = 1073741824(0x40000000, float:2.0)
        L10:
            org.lwjgl.system.Struct.DEFAULT_PACK_ALIGNMENT = r0
            org.lwjgl.system.Library.initialize()
            return
    }
}
