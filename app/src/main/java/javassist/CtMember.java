package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtMember.class */
public abstract class CtMember {
    javassist.CtMember next;
    protected javassist.CtClass declaringClass;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtMember$Cache.class */
    static class Cache extends javassist.CtMember {
        private javassist.CtMember methodTail;
        private javassist.CtMember consTail;
        private javassist.CtMember fieldTail;

        @Override // javassist.CtMember
        protected void extendToString(java.lang.StringBuilder r2) {
                r1 = this;
                return
        }

        @Override // javassist.CtMember
        public boolean hasAnnotation(java.lang.String r3) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public java.lang.Object getAnnotation(java.lang.Class<?> r3) throws java.lang.ClassNotFoundException {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public java.lang.Object[] getAnnotations() throws java.lang.ClassNotFoundException {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public byte[] getAttribute(java.lang.String r3) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public java.lang.Object[] getAvailableAnnotations() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public int getModifiers() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public java.lang.String getName() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public java.lang.String getSignature() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public void setAttribute(java.lang.String r2, byte[] r3) {
                r1 = this;
                return
        }

        @Override // javassist.CtMember
        public void setModifiers(int r2) {
                r1 = this;
                return
        }

        @Override // javassist.CtMember
        public java.lang.String getGenericSignature() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.CtMember
        public void setGenericSignature(java.lang.String r2) {
                r1 = this;
                return
        }

        Cache(javassist.CtClassType r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r3
                r0.methodTail = r1
                r0 = r3
                r1 = r3
                r0.consTail = r1
                r0 = r3
                r1 = r3
                r0.fieldTail = r1
                r0 = r3
                javassist.CtMember r0 = r0.fieldTail
                r1 = r3
                r0.next = r1
                return
        }

        javassist.CtMember methodHead() {
                r2 = this;
                r0 = r2
                return r0
        }

        javassist.CtMember lastMethod() {
                r2 = this;
                r0 = r2
                javassist.CtMember r0 = r0.methodTail
                return r0
        }

        javassist.CtMember consHead() {
                r2 = this;
                r0 = r2
                javassist.CtMember r0 = r0.methodTail
                return r0
        }

        javassist.CtMember lastCons() {
                r2 = this;
                r0 = r2
                javassist.CtMember r0 = r0.consTail
                return r0
        }

        javassist.CtMember fieldHead() {
                r2 = this;
                r0 = r2
                javassist.CtMember r0 = r0.consTail
                return r0
        }

        javassist.CtMember lastField() {
                r2 = this;
                r0 = r2
                javassist.CtMember r0 = r0.fieldTail
                return r0
        }

        void addMethod(javassist.CtMember r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                javassist.CtMember r1 = r1.methodTail
                javassist.CtMember r1 = r1.next
                r0.next = r1
                r0 = r3
                javassist.CtMember r0 = r0.methodTail
                r1 = r4
                r0.next = r1
                r0 = r3
                javassist.CtMember r0 = r0.methodTail
                r1 = r3
                javassist.CtMember r1 = r1.consTail
                if (r0 != r1) goto L33
                r0 = r3
                r1 = r4
                r0.consTail = r1
                r0 = r3
                javassist.CtMember r0 = r0.methodTail
                r1 = r3
                javassist.CtMember r1 = r1.fieldTail
                if (r0 != r1) goto L33
                r0 = r3
                r1 = r4
                r0.fieldTail = r1
            L33:
                r0 = r3
                r1 = r4
                r0.methodTail = r1
                return
        }

        void addConstructor(javassist.CtMember r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                javassist.CtMember r1 = r1.consTail
                javassist.CtMember r1 = r1.next
                r0.next = r1
                r0 = r3
                javassist.CtMember r0 = r0.consTail
                r1 = r4
                r0.next = r1
                r0 = r3
                javassist.CtMember r0 = r0.consTail
                r1 = r3
                javassist.CtMember r1 = r1.fieldTail
                if (r0 != r1) goto L23
                r0 = r3
                r1 = r4
                r0.fieldTail = r1
            L23:
                r0 = r3
                r1 = r4
                r0.consTail = r1
                return
        }

        void addField(javassist.CtMember r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                r0.next = r1
                r0 = r3
                javassist.CtMember r0 = r0.fieldTail
                r1 = r4
                r0.next = r1
                r0 = r3
                r1 = r4
                r0.fieldTail = r1
                return
        }

        static int count(javassist.CtMember r3, javassist.CtMember r4) {
                r0 = 0
                r5 = r0
            L2:
                r0 = r3
                r1 = r4
                if (r0 == r1) goto L12
                int r5 = r5 + 1
                r0 = r3
                javassist.CtMember r0 = r0.next
                r3 = r0
                goto L2
            L12:
                r0 = r5
                return r0
        }

        void remove(javassist.CtMember r4) {
                r3 = this;
                r0 = r3
                r5 = r0
            L2:
                r0 = r5
                javassist.CtMember r0 = r0.next
                r1 = r0
                r6 = r1
                r1 = r3
                if (r0 == r1) goto L4b
                r0 = r6
                r1 = r4
                if (r0 != r1) goto L43
                r0 = r5
                r1 = r6
                javassist.CtMember r1 = r1.next
                r0.next = r1
                r0 = r6
                r1 = r3
                javassist.CtMember r1 = r1.methodTail
                if (r0 != r1) goto L26
                r0 = r3
                r1 = r5
                r0.methodTail = r1
            L26:
                r0 = r6
                r1 = r3
                javassist.CtMember r1 = r1.consTail
                if (r0 != r1) goto L33
                r0 = r3
                r1 = r5
                r0.consTail = r1
            L33:
                r0 = r6
                r1 = r3
                javassist.CtMember r1 = r1.fieldTail
                if (r0 != r1) goto L4b
                r0 = r3
                r1 = r5
                r0.fieldTail = r1
                goto L4b
            L43:
                r0 = r5
                javassist.CtMember r0 = r0.next
                r5 = r0
                goto L2
            L4b:
                return
        }
    }

    protected CtMember(javassist.CtClass r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.declaringClass = r1
            r0 = r3
            r1 = 0
            r0.next = r1
            return
    }

    final javassist.CtMember next() {
            r2 = this;
            r0 = r2
            javassist.CtMember r0 = r0.next
            return r0
    }

    void nameReplaced() {
            r1 = this;
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.getModifiers()
            java.lang.String r1 = javassist.Modifier.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r5
            r0.extendToString(r1)
            r0 = r5
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected abstract void extendToString(java.lang.StringBuilder r1);

    public javassist.CtClass getDeclaringClass() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.declaringClass
            return r0
    }

    public boolean visibleFrom(javassist.CtClass r4) {
            r3 = this;
            r0 = r3
            int r0 = r0.getModifiers()
            r5 = r0
            r0 = r5
            boolean r0 = javassist.Modifier.isPublic(r0)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = r5
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 == 0) goto L23
            r0 = r4
            r1 = r3
            javassist.CtClass r1 = r1.declaringClass
            if (r0 != r1) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
        L23:
            r0 = r3
            javassist.CtClass r0 = r0.declaringClass
            java.lang.String r0 = r0.getPackageName()
            r6 = r0
            r0 = r4
            java.lang.String r0 = r0.getPackageName()
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L44
            r0 = r7
            if (r0 != 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r8 = r0
            goto L4c
        L44:
            r0 = r6
            r1 = r7
            boolean r0 = r0.equals(r1)
            r8 = r0
        L4c:
            r0 = r8
            if (r0 != 0) goto L61
            r0 = r5
            boolean r0 = javassist.Modifier.isProtected(r0)
            if (r0 == 0) goto L61
            r0 = r4
            r1 = r3
            javassist.CtClass r1 = r1.declaringClass
            boolean r0 = r0.subclassOf(r1)
            return r0
        L61:
            r0 = r8
            return r0
    }

    public abstract int getModifiers();

    public abstract void setModifiers(int r1);

    public boolean hasAnnotation(java.lang.Class<?> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.hasAnnotation(r1)
            return r0
    }

    public abstract boolean hasAnnotation(java.lang.String r1);

    public abstract java.lang.Object getAnnotation(java.lang.Class<?> r1) throws java.lang.ClassNotFoundException;

    public abstract java.lang.Object[] getAnnotations() throws java.lang.ClassNotFoundException;

    public abstract java.lang.Object[] getAvailableAnnotations();

    public abstract java.lang.String getName();

    public abstract java.lang.String getSignature();

    public abstract java.lang.String getGenericSignature();

    public abstract void setGenericSignature(java.lang.String r1);

    public abstract byte[] getAttribute(java.lang.String r1);

    public abstract void setAttribute(java.lang.String r1, byte[] r2);
}
