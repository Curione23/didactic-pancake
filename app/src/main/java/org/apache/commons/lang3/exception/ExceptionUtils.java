package org.apache.commons.lang3.exception;

/* JADX INFO: loaded from: classes2.dex */
public class ExceptionUtils {
    private static final java.lang.String[] CAUSE_METHOD_NAMES = null;
    private static final int NOT_FOUND = -1;
    static final java.lang.String WRAPPED_MARKER = " [wrapped] ";

    public static /* synthetic */ void $r8$lambda$CIbmGnhBhhsXuHziHB6IK2UZJeM(java.io.PrintStream r0, java.lang.String r1) {
            r0.println(r1)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$Z3TzUy1JfXWpIlDR0bmLjsBu5Zg(java.lang.Object r0) {
            boolean r0 = java.util.Objects.nonNull(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$dQdEf-i3It1LJMJi12izfTlLc3M, reason: not valid java name */
    public static /* synthetic */ void m2668$r8$lambda$dQdEfi3It1LJMJi12izfTlLc3M(java.io.PrintWriter r0, java.lang.String r1) {
            r0.println(r1)
            return
    }

    static {
            r0 = 12
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "getCause"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "getNextException"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "getTargetException"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "getException"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "getSourceException"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "getRootCause"
            r0[r1] = r2
            r1 = 6
            java.lang.String r2 = "getCausedByException"
            r0[r1] = r2
            r1 = 7
            java.lang.String r2 = "getNested"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "getLinkedException"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "getNestedException"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "getLinkedCause"
            r0[r1] = r2
            r1 = 11
            java.lang.String r2 = "getThrowable"
            r0[r1] = r2
            org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES = r0
            return
    }

    @java.lang.Deprecated
    public ExceptionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends java.lang.RuntimeException> T asRuntimeException(java.lang.Throwable r0) {
            java.lang.Object r0 = eraseType(r0)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            return r0
    }

    private static <R, T extends java.lang.Throwable> R eraseType(java.lang.Throwable r0) throws java.lang.Throwable {
            throw r0
    }

    public static void forEach(java.lang.Throwable r0, java.util.function.Consumer<java.lang.Throwable> r1) {
            java.util.stream.Stream r0 = stream(r0)
            r0.forEach(r1)
            return
    }

    @java.lang.Deprecated
    public static java.lang.Throwable getCause(java.lang.Throwable r1) {
            r0 = 0
            java.lang.Throwable r1 = getCause(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.Throwable getCause(java.lang.Throwable r2, java.lang.String[] r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            if (r3 != 0) goto Lf
            java.lang.Throwable r3 = r2.getCause()
            if (r3 == 0) goto Ld
            return r3
        Ld:
            java.lang.String[] r3 = org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES
        Lf:
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            org.apache.commons.lang3.exception.ExceptionUtils$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.exception.ExceptionUtils$$ExternalSyntheticLambda0
            r1.<init>(r2)
            java.util.stream.Stream r2 = r3.map(r1)
            org.apache.commons.lang3.exception.ExceptionUtils$$ExternalSyntheticLambda1 r3 = new org.apache.commons.lang3.exception.ExceptionUtils$$ExternalSyntheticLambda1
            r3.<init>()
            java.util.stream.Stream r2 = r2.filter(r3)
            java.util.Optional r2 = r2.findFirst()
            java.lang.Object r2 = r2.orElse(r0)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
    }

    private static java.lang.Throwable getCauseUsingMethodName(java.lang.Throwable r3, java.lang.String r4) {
            if (r4 == 0) goto L24
            java.lang.Class r0 = r3.getClass()
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Method r4 = org.apache.commons.lang3.reflect.MethodUtils.getMethodObject(r0, r4, r2)
            if (r4 == 0) goto L24
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.Class r2 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L24
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L24
            java.lang.Object r3 = r4.invoke(r3, r0)     // Catch: java.lang.ReflectiveOperationException -> L24
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.ReflectiveOperationException -> L24
            return r3
        L24:
            r3 = 0
            return r3
    }

    @java.lang.Deprecated
    public static java.lang.String[] getDefaultCauseMethodNames() {
            java.lang.String[] r0 = org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.clone(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public static java.lang.String getMessage(java.lang.Throwable r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            r0 = 0
            java.lang.String r0 = org.apache.commons.lang3.ClassUtils.getShortClassName(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = org.apache.commons.lang3.StringUtils.defaultString(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.Throwable getRootCause(java.lang.Throwable r1) {
            java.util.List r1 = getThrowableList(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            r1 = 0
            goto L18
        Lc:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L18:
            return r1
    }

    public static java.lang.String getRootCauseMessage(java.lang.Throwable r1) {
            java.lang.Throwable r0 = getRootCause(r1)
            if (r0 != 0) goto L7
            goto L8
        L7:
            r1 = r0
        L8:
            java.lang.String r1 = getMessage(r1)
            return r1
    }

    public static java.lang.String[] getRootCauseStackTrace(java.lang.Throwable r1) {
            java.util.List r1 = getRootCauseStackTraceList(r1)
            java.lang.String[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    public static java.util.List<java.lang.String> getRootCauseStackTraceList(java.lang.Throwable r7) {
            if (r7 != 0) goto L7
            java.util.List r7 = java.util.Collections.emptyList()
            return r7
        L7:
            java.lang.Throwable[] r7 = getThrowables(r7)
            int r0 = r7.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0 + (-1)
            r3 = r7[r2]
            java.util.List r3 = getStackFrameList(r3)
        L19:
            int r4 = r0 + (-1)
            if (r4 < 0) goto L56
            if (r4 == 0) goto L2b
            int r0 = r0 + (-2)
            r0 = r7[r0]
            java.util.List r0 = getStackFrameList(r0)
            removeCommonFrames(r3, r0)
            goto L2c
        L2b:
            r0 = r3
        L2c:
            if (r4 != r2) goto L38
            r5 = r7[r4]
            java.lang.String r5 = r5.toString()
            r1.add(r5)
            goto L50
        L38:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " [wrapped] "
            r5.<init>(r6)
            r6 = r7[r4]
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.add(r5)
        L50:
            r1.addAll(r3)
            r3 = r0
            r0 = r4
            goto L19
        L56:
            return r1
    }

    static java.util.List<java.lang.String> getStackFrameList(java.lang.Throwable r6) {
            java.lang.String r6 = getStackTrace(r6)
            java.lang.String r0 = java.lang.System.lineSeparator()
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            r1.<init>(r6, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            r2 = r0
        L14:
            boolean r3 = r1.hasMoreTokens()
            if (r3 == 0) goto L3c
            java.lang.String r3 = r1.nextToken()
            java.lang.String r4 = "at"
            int r4 = r3.indexOf(r4)
            r5 = -1
            if (r4 == r5) goto L3a
            java.lang.String r4 = r3.substring(r0, r4)
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L3a
            r6.add(r3)
            r2 = 1
            goto L14
        L3a:
            if (r2 == 0) goto L14
        L3c:
            return r6
    }

    static java.lang.String[] getStackFrames(java.lang.String r2) {
            java.lang.String r0 = java.lang.System.lineSeparator()
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            r1.<init>(r2, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        Le:
            boolean r0 = r1.hasMoreTokens()
            if (r0 == 0) goto L1c
            java.lang.String r0 = r1.nextToken()
            r2.add(r0)
            goto Le
        L1c:
            java.lang.String[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    public static java.lang.String[] getStackFrames(java.lang.Throwable r0) {
            if (r0 != 0) goto L5
            java.lang.String[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r0
        L5:
            java.lang.String r0 = getStackTrace(r0)
            java.lang.String[] r0 = getStackFrames(r0)
            return r0
    }

    public static java.lang.String getStackTrace(java.lang.Throwable r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = 1
            r1.<init>(r0, r2)
            r3.printStackTrace(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static int getThrowableCount(java.lang.Throwable r0) {
            java.util.List r0 = getThrowableList(r0)
            int r0 = r0.size()
            return r0
    }

    public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L15
            boolean r1 = r0.contains(r2)
            if (r1 != 0) goto L15
            r0.add(r2)
            java.lang.Throwable r2 = r2.getCause()
            goto L5
        L15:
            return r0
    }

    public static java.lang.Throwable[] getThrowables(java.lang.Throwable r1) {
            java.util.List r1 = getThrowableList(r1)
            java.lang.Throwable[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_THROWABLE_ARRAY
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.Throwable[] r1 = (java.lang.Throwable[]) r1
            return r1
    }

    public static boolean hasCause(java.lang.Throwable r1, java.lang.Class<? extends java.lang.Throwable> r2) {
            boolean r0 = r1 instanceof java.lang.reflect.UndeclaredThrowableException
            if (r0 == 0) goto L8
            java.lang.Throwable r1 = r1.getCause()
        L8:
            boolean r1 = r2.isInstance(r1)
            return r1
    }

    private static int indexOf(java.lang.Throwable r2, java.lang.Class<? extends java.lang.Throwable> r3, int r4, boolean r5) {
            r0 = -1
            if (r2 == 0) goto L39
            if (r3 != 0) goto L6
            goto L39
        L6:
            if (r4 >= 0) goto L9
            r4 = 0
        L9:
            java.lang.Throwable[] r2 = getThrowables(r2)
            int r1 = r2.length
            if (r4 < r1) goto L11
            return r0
        L11:
            if (r5 == 0) goto L26
        L13:
            int r5 = r2.length
            if (r4 >= r5) goto L39
            r5 = r2[r4]
            java.lang.Class r5 = r5.getClass()
            boolean r5 = r3.isAssignableFrom(r5)
            if (r5 == 0) goto L23
            return r4
        L23:
            int r4 = r4 + 1
            goto L13
        L26:
            int r5 = r2.length
            if (r4 >= r5) goto L39
            r5 = r2[r4]
            java.lang.Class r5 = r5.getClass()
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L36
            return r4
        L36:
            int r4 = r4 + 1
            goto L26
        L39:
            return r0
    }

    public static int indexOfThrowable(java.lang.Throwable r1, java.lang.Class<? extends java.lang.Throwable> r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0, r0)
            return r1
    }

    public static int indexOfThrowable(java.lang.Throwable r1, java.lang.Class<? extends java.lang.Throwable> r2, int r3) {
            r0 = 0
            int r1 = indexOf(r1, r2, r3, r0)
            return r1
    }

    public static int indexOfType(java.lang.Throwable r2, java.lang.Class<? extends java.lang.Throwable> r3) {
            r0 = 0
            r1 = 1
            int r2 = indexOf(r2, r3, r0, r1)
            return r2
    }

    public static int indexOfType(java.lang.Throwable r1, java.lang.Class<? extends java.lang.Throwable> r2, int r3) {
            r0 = 1
            int r1 = indexOf(r1, r2, r3, r0)
            return r1
    }

    public static boolean isChecked(java.lang.Throwable r1) {
            if (r1 == 0) goto Lc
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto Lc
            boolean r1 = r1 instanceof java.lang.RuntimeException
            if (r1 != 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public static boolean isUnchecked(java.lang.Throwable r1) {
            if (r1 == 0) goto Lc
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto La
            boolean r1 = r1 instanceof java.lang.RuntimeException
            if (r1 == 0) goto Lc
        La:
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    static /* synthetic */ java.lang.Throwable lambda$getCause$0(java.lang.Throwable r0, java.lang.String r1) {
            java.lang.Throwable r0 = getCauseUsingMethodName(r0, r1)
            return r0
    }

    public static void printRootCauseStackTrace(java.lang.Throwable r1) {
            java.io.PrintStream r0 = java.lang.System.err
            printRootCauseStackTrace(r1, r0)
            return
    }

    public static void printRootCauseStackTrace(java.lang.Throwable r1, java.io.PrintStream r2) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "printStream"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.List r1 = getRootCauseStackTraceList(r1)
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.exception.ExceptionUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.exception.ExceptionUtils$$ExternalSyntheticLambda2
            r0.<init>(r2)
            r1.forEach(r0)
            r2.flush()
            return
    }

    public static void printRootCauseStackTrace(java.lang.Throwable r1, java.io.PrintWriter r2) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "printWriter"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.List r1 = getRootCauseStackTraceList(r1)
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.exception.ExceptionUtils$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.exception.ExceptionUtils$$ExternalSyntheticLambda3
            r0.<init>(r2)
            r1.forEach(r0)
            r2.flush()
            return
    }

    public static void removeCommonFrames(java.util.List<java.lang.String> r4, java.util.List<java.lang.String> r5) {
            java.lang.String r0 = "causeFrames"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "wrapperFrames"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r4.size()
            int r0 = r0 + (-1)
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L16:
            if (r0 < 0) goto L34
            if (r1 < 0) goto L34
            java.lang.Object r2 = r4.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2f
            r4.remove(r0)
        L2f:
            int r0 = r0 + (-1)
            int r1 = r1 + (-1)
            goto L16
        L34:
            return
    }

    public static <T> T rethrow(java.lang.Throwable r0) {
            java.lang.Object r0 = eraseType(r0)
            return r0
    }

    public static java.util.stream.Stream<java.lang.Throwable> stream(java.lang.Throwable r0) {
            java.util.List r0 = getThrowableList(r0)
            java.util.stream.Stream r0 = r0.stream()
            return r0
    }

    @java.lang.Deprecated
    public static <T> T throwUnchecked(T r1) {
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto Lc
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
        Lc:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
    }

    public static <T extends java.lang.Throwable> T throwUnchecked(T r1) {
            boolean r0 = isUnchecked(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.RuntimeException r1 = asRuntimeException(r1)
            throw r1
    }

    private static <T extends java.lang.Throwable> T throwableOf(java.lang.Throwable r2, java.lang.Class<T> r3, int r4, boolean r5) {
            r0 = 0
            if (r2 == 0) goto L49
            if (r3 != 0) goto L6
            goto L49
        L6:
            if (r4 >= 0) goto L9
            r4 = 0
        L9:
            java.lang.Throwable[] r2 = getThrowables(r2)
            int r1 = r2.length
            if (r4 < r1) goto L11
            return r0
        L11:
            if (r5 == 0) goto L2e
        L13:
            int r5 = r2.length
            if (r4 >= r5) goto L49
            r5 = r2[r4]
            java.lang.Class r5 = r5.getClass()
            boolean r5 = r3.isAssignableFrom(r5)
            if (r5 == 0) goto L2b
            r2 = r2[r4]
            java.lang.Object r2 = r3.cast(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L2b:
            int r4 = r4 + 1
            goto L13
        L2e:
            int r5 = r2.length
            if (r4 >= r5) goto L49
            r5 = r2[r4]
            java.lang.Class r5 = r5.getClass()
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L46
            r2 = r2[r4]
            java.lang.Object r2 = r3.cast(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L46:
            int r4 = r4 + 1
            goto L2e
        L49:
            return r0
    }

    public static <T extends java.lang.Throwable> T throwableOfThrowable(java.lang.Throwable r1, java.lang.Class<T> r2) {
            r0 = 0
            java.lang.Throwable r1 = throwableOf(r1, r2, r0, r0)
            return r1
    }

    public static <T extends java.lang.Throwable> T throwableOfThrowable(java.lang.Throwable r1, java.lang.Class<T> r2, int r3) {
            r0 = 0
            java.lang.Throwable r1 = throwableOf(r1, r2, r3, r0)
            return r1
    }

    public static <T extends java.lang.Throwable> T throwableOfType(java.lang.Throwable r2, java.lang.Class<T> r3) {
            r0 = 0
            r1 = 1
            java.lang.Throwable r2 = throwableOf(r2, r3, r0, r1)
            return r2
    }

    public static <T extends java.lang.Throwable> T throwableOfType(java.lang.Throwable r1, java.lang.Class<T> r2, int r3) {
            r0 = 1
            java.lang.Throwable r1 = throwableOf(r1, r2, r3, r0)
            return r1
    }

    public static <R> R wrapAndThrow(java.lang.Throwable r1) {
            java.lang.reflect.UndeclaredThrowableException r0 = new java.lang.reflect.UndeclaredThrowableException
            java.lang.Throwable r1 = throwUnchecked(r1)
            r0.<init>(r1)
            throw r0
    }
}
