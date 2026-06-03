package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MultiReleaseTextDecoding.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MultiReleaseTextDecoding.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MultiReleaseTextDecoding.class */
final class MultiReleaseTextDecoding {
    private MultiReleaseTextDecoding() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static java.lang.String decodeUTF8(long r7, int r9) {
            r0 = r9
            if (r0 > 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L3e
            r0 = r9
            int r1 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_SIZE
            if (r0 > r1) goto L20
            java.lang.ThreadLocal<byte[]> r0 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_BYTE
            java.lang.Object r0 = r0.get()
            byte[] r0 = (byte[]) r0
            goto L23
        L20:
            r0 = r9
            byte[] r0 = new byte[r0]
        L23:
            r10 = r0
            r0 = r7
            r1 = r9
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            r1 = r10
            r2 = 0
            r3 = r9
            java.nio.ByteBuffer r0 = r0.get(r1, r2, r3)
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r10
            r3 = 0
            r4 = r9
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r2, r3, r4, r5)
            return r0
        L3e:
            r0 = r9
            int r1 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_SIZE
            if (r0 > r1) goto L51
            java.lang.ThreadLocal<char[]> r0 = org.lwjgl.system.MemoryUtil.ARRAY_TLC_CHAR
            java.lang.Object r0 = r0.get()
            char[] r0 = (char[]) r0
            goto L54
        L51:
            r0 = r9
            char[] r0 = new char[r0]
        L54:
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
        L5b:
            r0 = r12
            r1 = r9
            if (r0 >= r1) goto L14f
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r12
            int r12 = r12 + 1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r14 = r0
            r0 = r14
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L86
            r0 = r14
            char r0 = (char) r0
            r13 = r0
            goto L13d
        L86:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r12
            int r12 = r12 + 1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            r1 = 63
            r0 = r0 & r1
            r15 = r0
            r0 = r14
            r1 = 224(0xe0, float:3.14E-43)
            r0 = r0 & r1
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto Lb7
            r0 = r14
            r1 = 31
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 << r1
            r1 = r15
            r0 = r0 | r1
            char r0 = (char) r0
            r13 = r0
            goto L13d
        Lb7:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r12
            int r12 = r12 + 1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            r1 = 63
            r0 = r0 & r1
            r16 = r0
            r0 = r14
            r1 = 240(0xf0, float:3.36E-43)
            r0 = r0 & r1
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 != r1) goto Lee
            r0 = r14
            r1 = 15
            r0 = r0 & r1
            r1 = 12
            int r0 = r0 << r1
            r1 = r15
            r2 = 6
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r16
            r0 = r0 | r1
            char r0 = (char) r0
            r13 = r0
            goto L13d
        Lee:
            sun.misc.Unsafe r0 = org.lwjgl.system.MemoryUtil.UNSAFE
            r1 = 0
            r2 = r7
            r3 = r12
            int r12 = r12 + 1
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            r1 = 63
            r0 = r0 & r1
            r17 = r0
            r0 = r14
            r1 = 7
            r0 = r0 & r1
            r1 = 18
            int r0 = r0 << r1
            r1 = r15
            r2 = 12
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r16
            r2 = 6
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r17
            r0 = r0 | r1
            r18 = r0
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L131
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            r2 = r18
            r3 = 10
            int r2 = r2 >>> r3
            r3 = 55232(0xd7c0, float:7.7397E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
        L131:
            r0 = r18
            r1 = 1023(0x3ff, float:1.434E-42)
            r0 = r0 & r1
            r1 = 56320(0xdc00, float:7.8921E-41)
            int r0 = r0 + r1
            char r0 = (char) r0
            r13 = r0
        L13d:
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L14c
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            r2 = r13
            r0[r1] = r2
        L14c:
            goto L5b
        L14f:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r10
            r3 = 0
            r4 = r11
            r5 = r9
            int r4 = java.lang.Math.min(r4, r5)
            r1.<init>(r2, r3, r4)
            return r0
    }
}
