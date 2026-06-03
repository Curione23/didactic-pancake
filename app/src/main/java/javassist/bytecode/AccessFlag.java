package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/AccessFlag.class */
public class AccessFlag {
    public static final int PUBLIC = 1;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;
    public static final int STATIC = 8;
    public static final int FINAL = 16;
    public static final int SYNCHRONIZED = 32;
    public static final int VOLATILE = 64;
    public static final int BRIDGE = 64;
    public static final int TRANSIENT = 128;
    public static final int VARARGS = 128;
    public static final int NATIVE = 256;
    public static final int INTERFACE = 512;
    public static final int ABSTRACT = 1024;
    public static final int STRICT = 2048;
    public static final int SYNTHETIC = 4096;
    public static final int ANNOTATION = 8192;
    public static final int ENUM = 16384;
    public static final int MANDATED = 32768;
    public static final int SUPER = 32;
    public static final int MODULE = 32768;

    public AccessFlag() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int setPublic(int r3) {
            r0 = r3
            r1 = -7
            r0 = r0 & r1
            r1 = 1
            r0 = r0 | r1
            return r0
    }

    public static int setProtected(int r3) {
            r0 = r3
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            r0 = r0 | r1
            return r0
    }

    public static int setPrivate(int r3) {
            r0 = r3
            r1 = -6
            r0 = r0 & r1
            r1 = 2
            r0 = r0 | r1
            return r0
    }

    public static int setPackage(int r3) {
            r0 = r3
            r1 = -8
            r0 = r0 & r1
            return r0
    }

    public static boolean isPublic(int r3) {
            r0 = r3
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean isProtected(int r3) {
            r0 = r3
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean isPrivate(int r3) {
            r0 = r3
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean isPackage(int r3) {
            r0 = r3
            r1 = 7
            r0 = r0 & r1
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static int clear(int r4, int r5) {
            r0 = r4
            r1 = r5
            r2 = -1
            r1 = r1 ^ r2
            r0 = r0 & r1
            return r0
    }

    public static int of(int r2) {
            r0 = r2
            return r0
    }

    public static int toModifier(int r2) {
            r0 = r2
            return r0
    }
}
