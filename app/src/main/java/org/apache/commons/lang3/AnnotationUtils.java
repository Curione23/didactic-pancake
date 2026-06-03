package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotationUtils {
    private static final org.apache.commons.lang3.builder.ToStringStyle TO_STRING_STYLE = null;

    /* JADX INFO: renamed from: org.apache.commons.lang3.AnnotationUtils$1, reason: invalid class name */
    class AnonymousClass1 extends org.apache.commons.lang3.builder.ToStringStyle {
        private static final long serialVersionUID = 1;

        public static /* synthetic */ boolean $r8$lambda$eKSki7DueQh73q73lL9lQ6PsxFo(java.lang.Class r0, java.lang.Class r1) {
                boolean r0 = r0.isAssignableFrom(r1)
                return r0
        }

        AnonymousClass1() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.setDefaultFullDetail(r0)
                r1.setArrayContentDetail(r0)
                r1.setUseClassName(r0)
                r1.setUseShortClassName(r0)
                r0 = 0
                r1.setUseIdentityHashCode(r0)
                java.lang.String r0 = "("
                r1.setContentStart(r0)
                java.lang.String r0 = ")"
                r1.setContentEnd(r0)
                java.lang.String r0 = ", "
                r1.setFieldSeparator(r0)
                java.lang.String r0 = "["
                r1.setArrayStart(r0)
                java.lang.String r0 = "]"
                r1.setArrayEnd(r0)
                return
        }

        static /* synthetic */ java.lang.String lambda$getShortClassName$0(java.lang.Class r2) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "@"
                r0.<init>(r1)
                java.lang.String r2 = r2.getName()
                java.lang.StringBuilder r2 = r0.append(r2)
                java.lang.String r2 = r2.toString()
                return r2
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        protected void appendDetail(java.lang.StringBuffer r2, java.lang.String r3, java.lang.Object r4) {
                r1 = this;
                boolean r0 = r4 instanceof java.lang.annotation.Annotation
                if (r0 == 0) goto La
                java.lang.annotation.Annotation r4 = (java.lang.annotation.Annotation) r4
                java.lang.String r4 = org.apache.commons.lang3.AnnotationUtils.toString(r4)
            La:
                super.appendDetail(r2, r3, r4)
                return
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        protected java.lang.String getShortClassName(java.lang.Class<?> r3) {
                r2 = this;
                java.util.List r3 = org.apache.commons.lang3.ClassUtils.getAllInterfaces(r3)
                java.util.stream.Stream r3 = r3.stream()
                java.lang.Class<java.lang.annotation.Annotation> r0 = java.lang.annotation.Annotation.class
                java.util.Objects.requireNonNull(r0)
                org.apache.commons.lang3.AnnotationUtils$1$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.AnnotationUtils$1$$ExternalSyntheticLambda0
                r1.<init>(r0)
                java.util.stream.Stream r3 = r3.filter(r1)
                java.util.Optional r3 = r3.findFirst()
                org.apache.commons.lang3.AnnotationUtils$1$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.AnnotationUtils$1$$ExternalSyntheticLambda1
                r0.<init>()
                java.util.Optional r3 = r3.map(r0)
                java.lang.String r0 = ""
                java.lang.Object r3 = r3.orElse(r0)
                java.lang.String r3 = (java.lang.String) r3
                return r3
        }
    }

    static {
            org.apache.commons.lang3.AnnotationUtils$1 r0 = new org.apache.commons.lang3.AnnotationUtils$1
            r0.<init>()
            org.apache.commons.lang3.AnnotationUtils.TO_STRING_STYLE = r0
            return
    }

    @java.lang.Deprecated
    public AnnotationUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean annotationArrayMemberEquals(java.lang.annotation.Annotation[] r4, java.lang.annotation.Annotation[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            r2 = 0
            if (r0 == r1) goto L6
            return r2
        L6:
            r0 = r2
        L7:
            int r1 = r4.length
            if (r0 >= r1) goto L18
            r1 = r4[r0]
            r3 = r5[r0]
            boolean r1 = equals(r1, r3)
            if (r1 != 0) goto L15
            return r2
        L15:
            int r0 = r0 + 1
            goto L7
        L18:
            r4 = 1
            return r4
    }

    private static boolean arrayMemberEquals(java.lang.Class<?> r1, java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r1.isAnnotation()
            if (r0 == 0) goto Lf
            java.lang.annotation.Annotation[] r2 = (java.lang.annotation.Annotation[]) r2
            java.lang.annotation.Annotation[] r3 = (java.lang.annotation.Annotation[]) r3
            boolean r1 = annotationArrayMemberEquals(r2, r3)
            return r1
        Lf:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
        L20:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L31
            short[] r2 = (short[]) r2
            short[] r3 = (short[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
        L31:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L42
            int[] r2 = (int[]) r2
            int[] r3 = (int[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
        L42:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L53
            char[] r2 = (char[]) r2
            char[] r3 = (char[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
        L53:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
            long[] r2 = (long[]) r2
            long[] r3 = (long[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
        L64:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
            float[] r2 = (float[]) r2
            float[] r3 = (float[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
        L75:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L86
            double[] r2 = (double[]) r2
            double[] r3 = (double[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
        L86:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L97
            boolean[] r2 = (boolean[]) r2
            boolean[] r3 = (boolean[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
        L97:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r1 = java.util.Arrays.equals(r2, r3)
            return r1
    }

    private static int arrayMemberHash(java.lang.Class<?> r1, java.lang.Object r2) {
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            byte[] r2 = (byte[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
        Lf:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            short[] r2 = (short[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
        L1e:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2d
            int[] r2 = (int[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
        L2d:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            char[] r2 = (char[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
        L3c:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4b
            long[] r2 = (long[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
        L4b:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5a
            float[] r2 = (float[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
        L5a:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L69
            double[] r2 = (double[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
        L69:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L78
            boolean[] r2 = (boolean[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
        L78:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r1 = java.util.Arrays.hashCode(r2)
            return r1
    }

    public static boolean equals(java.lang.annotation.Annotation r8, java.lang.annotation.Annotation r9) {
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L5f
            if (r9 != 0) goto La
            goto L5f
        La:
            java.lang.Class r2 = r8.annotationType()
            java.lang.Class r3 = r9.annotationType()
            java.lang.Object[] r4 = new java.lang.Object[]{r8}
            java.lang.String r5 = "Annotation %s with null annotationType()"
            org.apache.commons.lang3.Validate.notNull(r2, r5, r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r9}
            org.apache.commons.lang3.Validate.notNull(r3, r5, r4)
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L29
            return r1
        L29:
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()     // Catch: java.lang.ReflectiveOperationException -> L5f
            int r3 = r2.length     // Catch: java.lang.ReflectiveOperationException -> L5f
            r4 = r1
        L2f:
            if (r4 >= r3) goto L5e
            r5 = r2[r4]     // Catch: java.lang.ReflectiveOperationException -> L5f
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.ReflectiveOperationException -> L5f
            int r6 = r6.length     // Catch: java.lang.ReflectiveOperationException -> L5f
            if (r6 != 0) goto L5b
            java.lang.Class r6 = r5.getReturnType()     // Catch: java.lang.ReflectiveOperationException -> L5f
            boolean r6 = isValidAnnotationMemberType(r6)     // Catch: java.lang.ReflectiveOperationException -> L5f
            if (r6 == 0) goto L5b
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L5f
            java.lang.Object r6 = r5.invoke(r8, r6)     // Catch: java.lang.ReflectiveOperationException -> L5f
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L5f
            java.lang.Object r7 = r5.invoke(r9, r7)     // Catch: java.lang.ReflectiveOperationException -> L5f
            java.lang.Class r5 = r5.getReturnType()     // Catch: java.lang.ReflectiveOperationException -> L5f
            boolean r5 = memberEquals(r5, r6, r7)     // Catch: java.lang.ReflectiveOperationException -> L5f
            if (r5 != 0) goto L5b
            return r1
        L5b:
            int r4 = r4 + 1
            goto L2f
        L5e:
            return r0
        L5f:
            return r1
    }

    public static int hashCode(java.lang.annotation.Annotation r7) {
            java.lang.Class r0 = r7.annotationType()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r3 >= r1) goto L3b
            r5 = r0[r3]
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.ReflectiveOperationException -> L34
            java.lang.Object r6 = r5.invoke(r7, r6)     // Catch: java.lang.ReflectiveOperationException -> L34
            if (r6 == 0) goto L24
            java.lang.String r5 = r5.getName()     // Catch: java.lang.ReflectiveOperationException -> L34
            int r5 = hashMember(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L34
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto Lc
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.ReflectiveOperationException -> L34
            java.lang.String r0 = "Annotation method %s returned null"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch: java.lang.ReflectiveOperationException -> L34
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: java.lang.ReflectiveOperationException -> L34
            r7.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L34
            throw r7     // Catch: java.lang.ReflectiveOperationException -> L34
        L34:
            r7 = move-exception
            org.apache.commons.lang3.exception.UncheckedException r0 = new org.apache.commons.lang3.exception.UncheckedException
            r0.<init>(r7)
            throw r0
        L3b:
            return r4
    }

    private static int hashMember(java.lang.String r1, java.lang.Object r2) {
            int r1 = r1.hashCode()
            int r1 = r1 * 127
            boolean r0 = org.apache.commons.lang3.ObjectUtils.isArray(r2)
            if (r0 == 0) goto L1a
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r2 = arrayMemberHash(r0, r2)
        L18:
            r1 = r1 ^ r2
            return r1
        L1a:
            boolean r0 = r2 instanceof java.lang.annotation.Annotation
            if (r0 == 0) goto L25
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            int r2 = hashCode(r2)
            goto L18
        L25:
            int r2 = r2.hashCode()
            goto L18
    }

    public static boolean isValidAnnotationMemberType(java.lang.Class<?> r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.isArray()
            if (r1 == 0) goto Le
            java.lang.Class r2 = r2.getComponentType()
        Le:
            boolean r1 = r2.isPrimitive()
            if (r1 != 0) goto L30
            boolean r1 = r2.isEnum()
            if (r1 != 0) goto L30
            boolean r1 = r2.isAnnotation()
            if (r1 != 0) goto L30
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L30
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L31
        L30:
            r0 = 1
        L31:
            return r0
    }

    private static boolean memberEquals(java.lang.Class<?> r1, java.lang.Object r2, java.lang.Object r3) {
            if (r2 != r3) goto L4
            r1 = 1
            return r1
        L4:
            if (r2 == 0) goto L2c
            if (r3 != 0) goto L9
            goto L2c
        L9:
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L18
            java.lang.Class r1 = r1.getComponentType()
            boolean r1 = arrayMemberEquals(r1, r2, r3)
            return r1
        L18:
            boolean r1 = r1.isAnnotation()
            if (r1 == 0) goto L27
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            boolean r1 = equals(r2, r3)
            return r1
        L27:
            boolean r1 = r2.equals(r3)
            return r1
        L2c:
            r1 = 0
            return r1
    }

    public static java.lang.String toString(java.lang.annotation.Annotation r8) {
            org.apache.commons.lang3.builder.ToStringBuilder r0 = new org.apache.commons.lang3.builder.ToStringBuilder
            org.apache.commons.lang3.builder.ToStringStyle r1 = org.apache.commons.lang3.AnnotationUtils.TO_STRING_STYLE
            r0.<init>(r8, r1)
            java.lang.Class r1 = r8.annotationType()
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto L35
            r5 = r1[r4]
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 <= 0) goto L1e
            goto L2b
        L1e:
            java.lang.String r6 = r5.getName()     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.Object r5 = r5.invoke(r8, r7)     // Catch: java.lang.ReflectiveOperationException -> L2e
            r0.append(r6, r5)     // Catch: java.lang.ReflectiveOperationException -> L2e
        L2b:
            int r4 = r4 + 1
            goto L12
        L2e:
            r8 = move-exception
            org.apache.commons.lang3.exception.UncheckedException r0 = new org.apache.commons.lang3.exception.UncheckedException
            r0.<init>(r8)
            throw r0
        L35:
            java.lang.String r8 = r0.build2()
            return r8
    }
}
