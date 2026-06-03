package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/Modifier.class */
public class Modifier {
    public static final int PUBLIC = 1;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;
    public static final int STATIC = 8;
    public static final int FINAL = 16;
    public static final int SYNCHRONIZED = 32;
    public static final int VOLATILE = 64;
    public static final int VARARGS = 128;
    public static final int TRANSIENT = 128;
    public static final int NATIVE = 256;
    public static final int INTERFACE = 512;
    public static final int ABSTRACT = 1024;
    public static final int STRICT = 2048;
    public static final int ANNOTATION = 8192;
    public static final int ENUM = 16384;

    public Modifier() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
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

    public static boolean isStatic(int r3) {
            r0 = r3
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static boolean isFinal(int r3) {
            r0 = r3
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static boolean isSynchronized(int r3) {
            r0 = r3
            r1 = 32
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static boolean isVolatile(int r3) {
            r0 = r3
            r1 = 64
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public static boolean isTransient(int r3) {
            r0 = r3
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isNative(int r3) {
            r0 = r3
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isInterface(int r3) {
            r0 = r3
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isAnnotation(int r3) {
            r0 = r3
            r1 = 8192(0x2000, float:1.148E-41)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isEnum(int r3) {
            r0 = r3
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isAbstract(int r3) {
            r0 = r3
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isStrict(int r3) {
            r0 = r3
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isVarArgs(int r3) {
            r0 = r3
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 & r1
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
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

    public static int clear(int r4, int r5) {
            r0 = r4
            r1 = r5
            r2 = -1
            r1 = r1 ^ r2
            r0 = r0 & r1
            return r0
    }

    public static java.lang.String toString(int r2) {
            r0 = r2
            java.lang.String r0 = java.lang.reflect.Modifier.toString(r0)
            return r0
    }
}
