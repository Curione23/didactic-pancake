package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ByteArray.class */
public class ByteArray {
    public ByteArray() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int readU16bit(byte[] r5, int r6) {
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r5
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public static int readS16bit(byte[] r5, int r6) {
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r1 = 8
            int r0 = r0 << r1
            r1 = r5
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public static void write16bit(int r5, byte[] r6, int r7) {
            r0 = r6
            r1 = r7
            r2 = r5
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public static int read32bit(byte[] r5, int r6) {
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            r1 = 24
            int r0 = r0 << r1
            r1 = r5
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r5
            r2 = r6
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r5
            r2 = r6
            r3 = 3
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public static void write32bit(int r5, byte[] r6, int r7) {
            r0 = r6
            r1 = r7
            r2 = r5
            r3 = 24
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r7
            r2 = 1
            int r1 = r1 + r2
            r2 = r5
            r3 = 16
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r7
            r2 = 2
            int r1 = r1 + r2
            r2 = r5
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r6
            r1 = r7
            r2 = 3
            int r1 = r1 + r2
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    static void copy32bit(byte[] r6, int r7, byte[] r8, int r9) {
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r7
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r6
            r3 = r7
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            r1 = r9
            r2 = 2
            int r1 = r1 + r2
            r2 = r6
            r3 = r7
            r4 = 2
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r8
            r1 = r9
            r2 = 3
            int r1 = r1 + r2
            r2 = r6
            r3 = r7
            r4 = 3
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            return
    }
}
