package android.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/Objects.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/Objects.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/Objects.class */
public final class Objects {
    private Objects() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean equal(java.lang.Object r3, java.lang.Object r4) {
            r0 = r3
            r1 = r4
            if (r0 == r1) goto L11
            r0 = r3
            if (r0 == 0) goto L15
            r0 = r3
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
        L11:
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public static int hashCode(java.lang.Object r2) {
            r0 = r2
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r2
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    public static java.lang.String toString(java.lang.Object r4) {
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r7 = r0
            r0 = r5
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L2b:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L1b8
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            int r0 = r0.getModifiers()
            r1 = 136(0x88, float:1.9E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L48
            goto L1b2
        L48:
            r0 = r11
            r1 = 1
            r0.setAccessible(r1)
            r0 = r11
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            r12 = r0
            r0 = r7
            int r7 = r7 + 1
            if (r0 <= 0) goto L64
            r0 = r6
            r1 = 44
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
        L64:
            r0 = r6
            r1 = r11
            java.lang.String r1 = r1.getName()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            r0 = r6
            r1 = 61
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            boolean r0 = r0.isArray()     // Catch: java.lang.IllegalAccessException -> L1a6
            if (r0 == 0) goto L160
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<boolean[]> r1 = boolean[].class
            if (r0 != r1) goto L9a
            r0 = r6
            r1 = r12
            boolean[] r1 = (boolean[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        L9a:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<byte[]> r1 = byte[].class
            if (r0 != r1) goto Lb4
            r0 = r6
            r1 = r12
            byte[] r1 = (byte[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        Lb4:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<char[]> r1 = char[].class
            if (r0 != r1) goto Lce
            r0 = r6
            r1 = r12
            char[] r1 = (char[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        Lce:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<double[]> r1 = double[].class
            if (r0 != r1) goto Le8
            r0 = r6
            r1 = r12
            double[] r1 = (double[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        Le8:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<float[]> r1 = float[].class
            if (r0 != r1) goto L102
            r0 = r6
            r1 = r12
            float[] r1 = (float[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        L102:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<int[]> r1 = int[].class
            if (r0 != r1) goto L11c
            r0 = r6
            r1 = r12
            int[] r1 = (int[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        L11c:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<long[]> r1 = long[].class
            if (r0 != r1) goto L136
            r0 = r6
            r1 = r12
            long[] r1 = (long[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        L136:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<short[]> r1 = short[].class
            if (r0 != r1) goto L150
            r0 = r6
            r1 = r12
            short[] r1 = (short[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        L150:
            r0 = r6
            r1 = r12
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        L160:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            if (r0 != r1) goto L17e
            r0 = r6
            r1 = 39
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            r1 = 39
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        L17e:
            r0 = r12
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L1a6
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L19c
            r0 = r6
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
            goto L1a3
        L19c:
            r0 = r6
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalAccessException -> L1a6
        L1a3:
            goto L1b2
        L1a6:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        L1b2:
            int r10 = r10 + 1
            goto L2b
        L1b8:
            r0 = r6
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }
}
