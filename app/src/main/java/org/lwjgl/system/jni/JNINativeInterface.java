package org.lwjgl.system.jni;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jni/JNINativeInterface.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jni/JNINativeInterface.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jni/JNINativeInterface.class */
public class JNINativeInterface {
    public static final int JNI_VERSION_1_1 = 65537;
    public static final int JNI_VERSION_1_2 = 65538;
    public static final int JNI_VERSION_1_4 = 65540;
    public static final int JNI_VERSION_1_6 = 65542;
    public static final int JNI_VERSION_1_8 = 65544;
    public static final int JNI_VERSION_9 = 589824;
    public static final int JNI_VERSION_10 = 655360;
    public static final int JNI_VERSION_19 = 1245184;
    public static final int JNI_VERSION_20 = 1310720;
    public static final int JNI_VERSION_21 = 1376256;
    public static final int JNIInvalidRefType = 0;
    public static final int JNILocalRefType = 1;
    public static final int JNIGlobalRefType = 2;
    public static final int JNIWeakGlobalRefType = 3;
    public static final int JNI_FALSE = 0;
    public static final int JNI_TRUE = 1;
    public static final int JNI_OK = 0;
    public static final int JNI_ERR = -1;
    public static final int JNI_EDETACHED = -2;
    public static final int JNI_EVERSION = -3;
    public static final int JNI_ENOMEM = -4;
    public static final int JNI_EEXIST = -5;
    public static final int JNI_EINVAL = -6;
    public static final int JNI_COMMIT = 1;
    public static final int JNI_ABORT = 2;

    protected JNINativeInterface() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("jint")
    public static native int GetVersion();

    @org.lwjgl.system.NativeType("jmethodID")
    public static native long FromReflectedMethod(@org.lwjgl.system.NativeType("jobject") java.lang.reflect.Method r0);

    @org.lwjgl.system.NativeType("jfieldID")
    public static native long FromReflectedField(@org.lwjgl.system.NativeType("jobject") java.lang.reflect.Field r0);

    @javax.annotation.Nullable
    public static native java.lang.reflect.Method nToReflectedMethod(java.lang.Class<?> r0, long r1, boolean r3);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jobject")
    public static java.lang.reflect.Method ToReflectedMethod(@org.lwjgl.system.NativeType("jclass") java.lang.Class<?> r5, @org.lwjgl.system.NativeType("jmethodID") long r6, @org.lwjgl.system.NativeType("jboolean") boolean r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r8
            java.lang.reflect.Method r0 = nToReflectedMethod(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static native java.lang.reflect.Field nToReflectedField(java.lang.Class<?> r0, long r1, boolean r3);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jobject")
    public static java.lang.reflect.Field ToReflectedField(@org.lwjgl.system.NativeType("jclass") java.lang.Class<?> r5, @org.lwjgl.system.NativeType("jfieldID") long r6, @org.lwjgl.system.NativeType("jboolean") boolean r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r8
            java.lang.reflect.Field r0 = nToReflectedField(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static native long NewGlobalRef(@org.lwjgl.system.NativeType("jobject") java.lang.Object r0);

    public static native void nDeleteGlobalRef(long r0);

    public static void DeleteGlobalRef(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nDeleteGlobalRef(r0)
            return
    }

    public static native long nGetBooleanArrayElements(byte[] r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jboolean *")
    public static java.nio.ByteBuffer GetBooleanArrayElements(@org.lwjgl.system.NativeType("jbooleanArray") byte[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nGetBooleanArrayElements(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void nReleaseBooleanArrayElements(byte[] r0, long r1, int r3);

    public static void ReleaseBooleanArrayElements(@org.lwjgl.system.NativeType("jbooleanArray") byte[] r5, @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("jint") int r7) {
            r0 = r5
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nReleaseBooleanArrayElements(r0, r1, r2)
            return
    }

    public static native long nGetByteArrayElements(byte[] r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jbyte *")
    public static java.nio.ByteBuffer GetByteArrayElements(@org.lwjgl.system.NativeType("jbyteArray") byte[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nGetByteArrayElements(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void nReleaseByteArrayElements(byte[] r0, long r1, int r3);

    public static void ReleaseByteArrayElements(@org.lwjgl.system.NativeType("jbyteArray") byte[] r5, @org.lwjgl.system.NativeType("jbyte *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("jint") int r7) {
            r0 = r5
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nReleaseByteArrayElements(r0, r1, r2)
            return
    }

    public static native long nGetCharArrayElements(char[] r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jchar *")
    public static java.nio.ShortBuffer GetCharArrayElements(@org.lwjgl.system.NativeType("jcharArray") char[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nGetCharArrayElements(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    public static native void nReleaseCharArrayElements(char[] r0, long r1, int r3);

    public static void ReleaseCharArrayElements(@org.lwjgl.system.NativeType("jcharArray") char[] r5, @org.lwjgl.system.NativeType("jchar *") java.nio.ShortBuffer r6, @org.lwjgl.system.NativeType("jint") int r7) {
            r0 = r5
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nReleaseCharArrayElements(r0, r1, r2)
            return
    }

    public static native long nGetShortArrayElements(short[] r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jshort *")
    public static java.nio.ShortBuffer GetShortArrayElements(@org.lwjgl.system.NativeType("jshortArray") short[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nGetShortArrayElements(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBufferSafe(r0, r1)
            return r0
    }

    public static native void nReleaseShortArrayElements(short[] r0, long r1, int r3);

    public static void ReleaseShortArrayElements(@org.lwjgl.system.NativeType("jshortArray") short[] r5, @org.lwjgl.system.NativeType("jshort *") java.nio.ShortBuffer r6, @org.lwjgl.system.NativeType("jint") int r7) {
            r0 = r5
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nReleaseShortArrayElements(r0, r1, r2)
            return
    }

    public static native long nGetIntArrayElements(int[] r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jint *")
    public static java.nio.IntBuffer GetIntArrayElements(@org.lwjgl.system.NativeType("jintArray") int[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nGetIntArrayElements(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static native void nReleaseIntArrayElements(int[] r0, long r1, int r3);

    public static void ReleaseIntArrayElements(@org.lwjgl.system.NativeType("jintArray") int[] r5, @org.lwjgl.system.NativeType("jint *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("jint") int r7) {
            r0 = r5
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nReleaseIntArrayElements(r0, r1, r2)
            return
    }

    public static native long nGetLongArrayElements(long[] r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jlong *")
    public static java.nio.LongBuffer GetLongArrayElements(@org.lwjgl.system.NativeType("jlongArray") long[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nGetLongArrayElements(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static native void nReleaseLongArrayElements(long[] r0, long r1, int r3);

    public static void ReleaseLongArrayElements(@org.lwjgl.system.NativeType("jlongArray") long[] r5, @org.lwjgl.system.NativeType("jlong *") java.nio.LongBuffer r6, @org.lwjgl.system.NativeType("jint") int r7) {
            r0 = r5
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nReleaseLongArrayElements(r0, r1, r2)
            return
    }

    public static native long nGetFloatArrayElements(float[] r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jfloat *")
    public static java.nio.FloatBuffer GetFloatArrayElements(@org.lwjgl.system.NativeType("jfloatArray") float[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nGetFloatArrayElements(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBufferSafe(r0, r1)
            return r0
    }

    public static native void nReleaseFloatArrayElements(float[] r0, long r1, int r3);

    public static void ReleaseFloatArrayElements(@org.lwjgl.system.NativeType("jfloatArray") float[] r5, @org.lwjgl.system.NativeType("jfloat *") java.nio.FloatBuffer r6, @org.lwjgl.system.NativeType("jint") int r7) {
            r0 = r5
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nReleaseFloatArrayElements(r0, r1, r2)
            return
    }

    public static native long nGetDoubleArrayElements(double[] r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jdouble *")
    public static java.nio.DoubleBuffer GetDoubleArrayElements(@org.lwjgl.system.NativeType("jdoubleArray") double[] r4, @javax.annotation.Nullable @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nGetDoubleArrayElements(r0, r1)
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.length
            java.nio.DoubleBuffer r0 = org.lwjgl.system.MemoryUtil.memDoubleBufferSafe(r0, r1)
            return r0
    }

    public static native void nReleaseDoubleArrayElements(double[] r0, long r1, int r3);

    public static void ReleaseDoubleArrayElements(@org.lwjgl.system.NativeType("jdoubleArray") double[] r5, @org.lwjgl.system.NativeType("jdouble *") java.nio.DoubleBuffer r6, @org.lwjgl.system.NativeType("jint") int r7) {
            r0 = r5
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            nReleaseDoubleArrayElements(r0, r1, r2)
            return
    }

    public static native void nGetBooleanArrayRegion(byte[] r0, int r1, int r2, long r3);

    public static void GetBooleanArrayRegion(@org.lwjgl.system.NativeType("jbooleanArray") byte[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jboolean *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetBooleanArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nSetBooleanArrayRegion(byte[] r0, int r1, int r2, long r3);

    public static void SetBooleanArrayRegion(@org.lwjgl.system.NativeType("jbooleanArray") byte[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jboolean const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nSetBooleanArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nGetByteArrayRegion(byte[] r0, int r1, int r2, long r3);

    public static void GetByteArrayRegion(@org.lwjgl.system.NativeType("jbyteArray") byte[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jbyte *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetByteArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nSetByteArrayRegion(byte[] r0, int r1, int r2, long r3);

    public static void SetByteArrayRegion(@org.lwjgl.system.NativeType("jbyteArray") byte[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jbyte const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nSetByteArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nGetCharArrayRegion(char[] r0, int r1, int r2, long r3);

    public static void GetCharArrayRegion(@org.lwjgl.system.NativeType("jcharArray") char[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jchar *") java.nio.ShortBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetCharArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nSetCharArrayRegion(char[] r0, int r1, int r2, long r3);

    public static void SetCharArrayRegion(@org.lwjgl.system.NativeType("jcharArray") char[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jchar const *") java.nio.ShortBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nSetCharArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nGetShortArrayRegion(short[] r0, int r1, int r2, long r3);

    public static void GetShortArrayRegion(@org.lwjgl.system.NativeType("jshortArray") short[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jshort *") java.nio.ShortBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetShortArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nSetShortArrayRegion(short[] r0, int r1, int r2, long r3);

    public static void SetShortArrayRegion(@org.lwjgl.system.NativeType("jshortArray") short[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jshort const *") java.nio.ShortBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nSetShortArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nGetIntArrayRegion(int[] r0, int r1, int r2, long r3);

    public static void GetIntArrayRegion(@org.lwjgl.system.NativeType("jintArray") int[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jint *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetIntArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nSetIntArrayRegion(int[] r0, int r1, int r2, long r3);

    public static void SetIntArrayRegion(@org.lwjgl.system.NativeType("jintArray") int[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nSetIntArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nGetLongArrayRegion(long[] r0, int r1, int r2, long r3);

    public static void GetLongArrayRegion(@org.lwjgl.system.NativeType("jlongArray") long[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jlong *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetLongArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nSetLongArrayRegion(long[] r0, int r1, int r2, long r3);

    public static void SetLongArrayRegion(@org.lwjgl.system.NativeType("jlongArray") long[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jlong const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nSetLongArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nGetFloatArrayRegion(float[] r0, int r1, int r2, long r3);

    public static void GetFloatArrayRegion(@org.lwjgl.system.NativeType("jfloatArray") float[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jfloat *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetFloatArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nSetFloatArrayRegion(float[] r0, int r1, int r2, long r3);

    public static void SetFloatArrayRegion(@org.lwjgl.system.NativeType("jfloatArray") float[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nSetFloatArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nGetDoubleArrayRegion(double[] r0, int r1, int r2, long r3);

    public static void GetDoubleArrayRegion(@org.lwjgl.system.NativeType("jdoubleArray") double[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jdouble *") java.nio.DoubleBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetDoubleArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native void nSetDoubleArrayRegion(double[] r0, int r1, int r2, long r3);

    public static void SetDoubleArrayRegion(@org.lwjgl.system.NativeType("jdoubleArray") double[] r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jdouble const *") java.nio.DoubleBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nSetDoubleArrayRegion(r0, r1, r2, r3)
            return
    }

    public static native int nRegisterNatives(java.lang.Class<?> r0, long r1, int r3);

    @org.lwjgl.system.NativeType("jint")
    public static int RegisterNatives(@org.lwjgl.system.NativeType("jclass") java.lang.Class<?> r6, @org.lwjgl.system.NativeType("JNINativeMethod const *") org.lwjgl.system.jni.JNINativeMethod.Buffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r7
            long r0 = r0.address()
            r1 = r7
            int r1 = r1.remaining()
            int r2 = org.lwjgl.system.jni.JNINativeMethod.SIZEOF
            int r3 = org.lwjgl.system.jni.JNINativeMethod::validate
            org.lwjgl.system.Struct.validate(r0, r1, r2, r3)
        L19:
            r0 = r6
            r1 = r7
            long r1 = r1.address()
            r2 = r7
            int r2 = r2.remaining()
            int r0 = nRegisterNatives(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("jint")
    public static native int UnregisterNatives(@org.lwjgl.system.NativeType("jclass") java.lang.Class<?> r0);

    public static native int nGetJavaVM(long r0);

    @org.lwjgl.system.NativeType("jint")
    public static int GetJavaVM(@org.lwjgl.system.NativeType("JavaVM **") org.lwjgl.PointerBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nGetJavaVM(r0)
            return r0
    }

    public static native void nGetStringRegion(java.lang.String r0, int r1, int r2, long r3);

    public static void GetStringRegion(@org.lwjgl.system.NativeType("jstring") java.lang.String r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jchar *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetStringRegion(r0, r1, r2, r3)
            return
    }

    public static native void nGetStringUTFRegion(java.lang.String r0, int r1, int r2, long r3);

    public static void GetStringUTFRegion(@org.lwjgl.system.NativeType("jstring") java.lang.String r6, @org.lwjgl.system.NativeType("jsize") int r7, @org.lwjgl.system.NativeType("jsize") int r8, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = r8
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nGetStringUTFRegion(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void *")
    public static native long NewWeakGlobalRef(@org.lwjgl.system.NativeType("jobject") java.lang.Object r0);

    public static native void nDeleteWeakGlobalRef(long r0);

    public static void DeleteWeakGlobalRef(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nDeleteWeakGlobalRef(r0)
            return
    }

    @javax.annotation.Nullable
    public static native java.nio.ByteBuffer nNewDirectByteBuffer(long r0, long r2);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("jobject")
    public static java.nio.ByteBuffer NewDirectByteBuffer(@org.lwjgl.system.NativeType("void *") long r5, @org.lwjgl.system.NativeType("jlong") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            java.nio.ByteBuffer r0 = nNewDirectByteBuffer(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static native long GetDirectBufferAddress(@org.lwjgl.system.NativeType("jobject") java.nio.Buffer r0);

    @org.lwjgl.system.NativeType("jobjectRefType")
    public static native int GetObjectRefType(@org.lwjgl.system.NativeType("jobject") java.lang.Object r0);

    public static native void noop();

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
