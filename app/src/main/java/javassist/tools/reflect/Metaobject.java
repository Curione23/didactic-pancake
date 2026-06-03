package javassist.tools.reflect;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/reflect/Metaobject.class */
public class Metaobject implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    protected javassist.tools.reflect.ClassMetaobject classmetaobject;
    protected javassist.tools.reflect.Metalevel baseobject;
    protected java.lang.reflect.Method[] methods;

    public Metaobject(java.lang.Object r4, java.lang.Object[] r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            javassist.tools.reflect.Metalevel r1 = (javassist.tools.reflect.Metalevel) r1
            r0.baseobject = r1
            r0 = r3
            r1 = r3
            javassist.tools.reflect.Metalevel r1 = r1.baseobject
            javassist.tools.reflect.ClassMetaobject r1 = r1._getClass()
            r0.classmetaobject = r1
            r0 = r3
            r1 = r3
            javassist.tools.reflect.ClassMetaobject r1 = r1.classmetaobject
            java.lang.reflect.Method[] r1 = r1.getReflectiveMethods()
            r0.methods = r1
            return
    }

    protected Metaobject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.baseobject = r1
            r0 = r3
            r1 = 0
            r0.classmetaobject = r1
            r0 = r3
            r1 = 0
            r0.methods = r1
            return
    }

    private void writeObject(java.io.ObjectOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r3
            javassist.tools.reflect.Metalevel r1 = r1.baseobject
            r0.writeObject(r1)
            return
    }

    private void readObject(java.io.ObjectInputStream r4) throws java.io.IOException, java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r1 = r1.readObject()
            javassist.tools.reflect.Metalevel r1 = (javassist.tools.reflect.Metalevel) r1
            r0.baseobject = r1
            r0 = r3
            r1 = r3
            javassist.tools.reflect.Metalevel r1 = r1.baseobject
            javassist.tools.reflect.ClassMetaobject r1 = r1._getClass()
            r0.classmetaobject = r1
            r0 = r3
            r1 = r3
            javassist.tools.reflect.ClassMetaobject r1 = r1.classmetaobject
            java.lang.reflect.Method[] r1 = r1.getReflectiveMethods()
            r0.methods = r1
            return
    }

    public final javassist.tools.reflect.ClassMetaobject getClassMetaobject() {
            r2 = this;
            r0 = r2
            javassist.tools.reflect.ClassMetaobject r0 = r0.classmetaobject
            return r0
    }

    public final java.lang.Object getObject() {
            r2 = this;
            r0 = r2
            javassist.tools.reflect.Metalevel r0 = r0.baseobject
            return r0
    }

    public final void setObject(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.tools.reflect.Metalevel r1 = (javassist.tools.reflect.Metalevel) r1
            r0.baseobject = r1
            r0 = r3
            r1 = r3
            javassist.tools.reflect.Metalevel r1 = r1.baseobject
            javassist.tools.reflect.ClassMetaobject r1 = r1._getClass()
            r0.classmetaobject = r1
            r0 = r3
            r1 = r3
            javassist.tools.reflect.ClassMetaobject r1 = r1.classmetaobject
            java.lang.reflect.Method[] r1 = r1.getReflectiveMethods()
            r0.methods = r1
            r0 = r3
            javassist.tools.reflect.Metalevel r0 = r0.baseobject
            r1 = r3
            r0._setMetaobject(r1)
            return
    }

    public final java.lang.String getMethodName(int r4) {
            r3 = this;
            r0 = r3
            java.lang.reflect.Method[] r0 = r0.methods
            r1 = r4
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = 3
            r6 = r0
        Lc:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 48
            if (r0 < r1) goto L2a
            r0 = 57
            r1 = r7
            if (r0 >= r1) goto L27
            goto L2a
        L27:
            goto Lc
        L2a:
            r0 = r5
            r1 = r6
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    public final java.lang.Class<?>[] getParameterTypes(int r4) {
            r3 = this;
            r0 = r3
            java.lang.reflect.Method[] r0 = r0.methods
            r1 = r4
            r0 = r0[r1]
            java.lang.Class[] r0 = r0.getParameterTypes()
            return r0
    }

    public final java.lang.Class<?> getReturnType(int r4) {
            r3 = this;
            r0 = r3
            java.lang.reflect.Method[] r0 = r0.methods
            r1 = r4
            r0 = r0[r1]
            java.lang.Class r0 = r0.getReturnType()
            return r0
    }

    public java.lang.Object trapFieldRead(java.lang.String r5) {
            r4 = this;
            r0 = r4
            javassist.tools.reflect.ClassMetaobject r0 = r0.getClassMetaobject()
            java.lang.Class r0 = r0.getJavaClass()
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.NoSuchFieldException -> L15 java.lang.IllegalAccessException -> L22
            r1 = r4
            java.lang.Object r1 = r1.getObject()     // Catch: java.lang.NoSuchFieldException -> L15 java.lang.IllegalAccessException -> L22
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NoSuchFieldException -> L15 java.lang.IllegalAccessException -> L22
            return r0
        L15:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L22:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public void trapFieldWrite(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            javassist.tools.reflect.ClassMetaobject r0 = r0.getClassMetaobject()
            java.lang.Class r0 = r0.getJavaClass()
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.NoSuchFieldException -> L18 java.lang.IllegalAccessException -> L27
            r1 = r4
            java.lang.Object r1 = r1.getObject()     // Catch: java.lang.NoSuchFieldException -> L18 java.lang.IllegalAccessException -> L27
            r2 = r6
            r0.set(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L18 java.lang.IllegalAccessException -> L27
            goto L36
        L18:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L27:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L36:
            return
    }

    public java.lang.Object trapMethodcall(int r5, java.lang.Object[] r6) throws java.lang.Throwable {
            r4 = this;
            r0 = r4
            java.lang.reflect.Method[] r0 = r0.methods     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L15
            r1 = r5
            r0 = r0[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L15
            r1 = r4
            java.lang.Object r1 = r1.getObject()     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L15
            r2 = r6
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L15
            return r0
        Lf:
            r7 = move-exception
            r0 = r7
            java.lang.Throwable r0 = r0.getTargetException()
            throw r0
        L15:
            r7 = move-exception
            javassist.tools.reflect.CannotInvokeException r0 = new javassist.tools.reflect.CannotInvokeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
    }
}
