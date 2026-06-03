package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class ClassConstantPool {
    private final java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> entries;
    protected java.util.HashSet<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> entriesContainsSet;
    protected java.util.Map<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry, java.lang.Integer> indexCache;
    private final java.util.HashSet<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> mustStartClassPool;
    private final java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> others;
    protected java.util.HashSet<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> othersContainsSet;
    private boolean resolved;

    public ClassConstantPool() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.entriesContainsSet = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.othersContainsSet = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.mustStartClassPool = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r1)
            r2.others = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.entries = r0
            return
    }

    private void initialSort() {
            r7 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda2 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda2
            r1.<init>()
            java.util.Comparator r1 = java.util.Comparator.comparingInt(r1)
            r0.<init>(r1)
            java.util.TreeSet r1 = new java.util.TreeSet
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda3 r2 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda3
            r2.<init>()
            java.util.Comparator r2 = java.util.Comparator.comparing(r2)
            r1.<init>(r2)
            java.util.TreeSet r2 = new java.util.TreeSet
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda4 r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda4
            r3.<init>()
            java.util.Comparator r3 = java.util.Comparator.comparing(r3)
            r2.<init>(r3)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r7.entries
            java.util.Iterator r3 = r3.iterator()
        L30:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r3.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r4
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry) r4
            int r5 = r4.getGlobalIndex()
            r6 = -1
            if (r5 != r6) goto L5d
            boolean r5 = r4 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8
            if (r5 == 0) goto L4d
            r1.add(r4)
            goto L30
        L4d:
            boolean r5 = r4 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPClass
            if (r5 == 0) goto L55
            r2.add(r4)
            goto L30
        L55:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "error"
            r0.<init>(r1)
            throw r0
        L5d:
            r0.add(r4)
            goto L30
        L61:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r7.entries
            r3.clear()
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r7.entries
            r3.addAll(r0)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r7.entries
            r0.addAll(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r7.entries
            r0.addAll(r2)
            return
    }

    static /* synthetic */ int lambda$initialSort$0(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry) r0
            int r0 = r0.getGlobalIndex()
            return r0
    }

    static /* synthetic */ java.lang.String lambda$initialSort$1(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r0
            java.lang.String r0 = r0.underlyingString()
            return r0
    }

    static /* synthetic */ java.lang.String lambda$initialSort$2(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass) r0
            java.lang.String r0 = r0.getName()
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry add(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r0 = r2 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry
            if (r0 == 0) goto L18
            java.util.HashSet<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r1.entriesContainsSet
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L25
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r1.entries
            r0.add(r2)
            goto L25
        L18:
            java.util.HashSet<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r1.othersContainsSet
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L25
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r1.others
            r0.add(r2)
        L25:
            return r2
    }

    public void addNestedEntries() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r1 = r10.entries
            r0.addAll(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r1 = r10.others
            r0.addAll(r1)
            r1 = 1
            r3 = r1
        L18:
            if (r3 != 0) goto L22
            int r3 = r0.size()
            if (r3 <= 0) goto L21
            goto L22
        L21:
            return
        L22:
            r2.clear()
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r10.entries
            int r3 = r3.size()
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r4 = r10.others
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L33:
            int r7 = r0.size()
            if (r6 >= r7) goto L6b
            java.lang.Object r7 = r0.get(r6)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r7 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r7
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r8 = r7.getNestedClassFileEntries()
            java.util.List r9 = java.util.Arrays.asList(r8)
            r2.addAll(r9)
            boolean r9 = r7 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode
            if (r9 == 0) goto L59
            r9 = r7
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r9 = (org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode) r9
            boolean r9 = r9.nestedMustStartClassPool()
            if (r9 == 0) goto L59
            r9 = r1
            goto L5a
        L59:
            r9 = r5
        L5a:
            if (r9 == 0) goto L65
            java.util.HashSet<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r9 = r10.mustStartClassPool
            java.util.List r8 = java.util.Arrays.asList(r8)
            r9.addAll(r8)
        L65:
            r10.add(r7)
            int r6 = r6 + 1
            goto L33
        L6b:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r6 = r10.entries
            int r6 = r6.size()
            if (r6 != r3) goto L7e
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r10.others
            int r3 = r3.size()
            if (r3 == r4) goto L7c
            goto L7e
        L7c:
            r3 = r5
            goto L7f
        L7e:
            r3 = r1
        L7f:
            r0.clear()
            r0.addAll(r2)
            goto L18
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry addWithNestedEntries(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r5) {
            r4 = this;
            r4.add(r5)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = r5.getNestedClassFileEntries()
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L13
            r3 = r0[r2]
            r4.addWithNestedEntries(r3)
            int r2 = r2 + 1
            goto L9
        L13:
            return r5
    }

    public java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> entries() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r1.entries
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry get(int r2) {
            r1 = this;
            boolean r0 = r1.resolved
            if (r0 == 0) goto Lf
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r1.entries
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.get(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r2
            return r2
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Constant pool is not yet resolved; this does not make any sense"
            r2.<init>(r0)
            throw r2
    }

    public int indexOf(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r2) {
            r1 = this;
            boolean r0 = r1.resolved
            if (r0 == 0) goto L21
            java.util.Map<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry, java.lang.Integer> r0 = r1.indexCache
            if (r0 == 0) goto L19
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L17
            int r2 = r2.intValue()
            int r2 = r2 + 1
            return r2
        L17:
            r2 = -1
            return r2
        L19:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Index cache is not initialized!"
            r2.<init>(r0)
            throw r2
        L21:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Constant pool is not yet resolved; this does not make any sense"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: lambda$resolve$3$org-apache-commons-compress-harmony-unpack200-bytecode-ClassConstantPool, reason: not valid java name */
    /* synthetic */ void m2568xce19110a(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r1) {
            r0 = this;
            r1.resolve(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$resolve$4$org-apache-commons-compress-harmony-unpack200-bytecode-ClassConstantPool, reason: not valid java name */
    /* synthetic */ void m2569xe88a0a29(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r1) {
            r0 = this;
            r1.resolve(r0)
            return
    }

    public void resolve(org.apache.commons.compress.harmony.unpack200.Segment r2) {
            r1 = this;
            r1.initialSort()
            r1.sortClassPool()
            r2 = 1
            r1.resolved = r2
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r2 = r1.entries
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r2.forEach(r0)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r2 = r1.others
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool$$ExternalSyntheticLambda1
            r0.<init>(r1)
            r2.forEach(r0)
            return
    }

    public int size() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r0 = r1.entries
            int r0 = r0.size()
            return r0
    }

    protected void sortClassPool() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r1 = r6.entries
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r2 = r6.entries
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r2 = r6.entries
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r2.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r3
            java.util.HashSet<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r4 = r6.mustStartClassPool
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L34
            r0.add(r3)
            goto L1c
        L34:
            r1.add(r3)
            goto L1c
        L38:
            java.util.HashMap r2 = new java.util.HashMap
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r6.entries
            int r3 = r3.size()
            r2.<init>(r3)
            r6.indexCache = r2
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r2 = r6.entries
            r2.clear()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L4f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r0.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r3
            java.util.Map<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry, java.lang.Integer> r4 = r6.indexCache
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.put(r3, r5)
            boolean r4 = r3 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPLong
            if (r4 != 0) goto L75
            boolean r4 = r3 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r4 = r6.entries
            r4.add(r3)
            int r2 = r2 + 1
            goto L4f
        L75:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r4 = r6.entries
            r4.add(r3)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r4 = r6.entries
            r4.add(r3)
            int r2 = r2 + 2
            goto L4f
        L82:
            java.util.Iterator r0 = r1.iterator()
        L86:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r1
            java.util.Map<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry, java.lang.Integer> r3 = r6.indexCache
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.put(r1, r4)
            boolean r3 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPLong
            if (r3 != 0) goto Lac
            boolean r3 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble
            if (r3 == 0) goto La4
            goto Lac
        La4:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r6.entries
            r3.add(r1)
            int r2 = r2 + 1
            goto L86
        Lac:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r6.entries
            r3.add(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry> r3 = r6.entries
            r3.add(r1)
            int r2 = r2 + 2
            goto L86
        Lb9:
            return
    }
}
