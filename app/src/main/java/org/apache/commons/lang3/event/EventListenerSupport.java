package org.apache.commons.lang3.event;

/* JADX INFO: loaded from: classes2.dex */
public class EventListenerSupport<L> implements java.io.Serializable {
    private static final long serialVersionUID = 3593265990380473632L;
    private java.util.List<L> listeners;
    private transient L[] prototypeArray;
    private transient L proxy;

    protected class ProxyInvocationHandler implements java.lang.reflect.InvocationHandler {
        private final org.apache.commons.lang3.function.FailableConsumer<java.lang.Throwable, java.lang.IllegalAccessException> handler;
        final /* synthetic */ org.apache.commons.lang3.event.EventListenerSupport this$0;

        public ProxyInvocationHandler(org.apache.commons.lang3.event.EventListenerSupport r2) {
                r1 = this;
                org.apache.commons.lang3.event.EventListenerSupport$ProxyInvocationHandler$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.event.EventListenerSupport$ProxyInvocationHandler$$ExternalSyntheticLambda0
                r0.<init>()
                r1.<init>(r2, r0)
                return
        }

        public ProxyInvocationHandler(org.apache.commons.lang3.event.EventListenerSupport r1, org.apache.commons.lang3.function.FailableConsumer<java.lang.Throwable, java.lang.IllegalAccessException> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = java.util.Objects.requireNonNull(r2)
                org.apache.commons.lang3.function.FailableConsumer r1 = (org.apache.commons.lang3.function.FailableConsumer) r1
                r0.handler = r1
                return
        }

        protected void handle(java.lang.Throwable r2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
                r1 = this;
                org.apache.commons.lang3.function.FailableConsumer<java.lang.Throwable, java.lang.IllegalAccessException> r0 = r1.handler
                r0.accept(r2)
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object[] r4) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
                r1 = this;
                org.apache.commons.lang3.event.EventListenerSupport r2 = r1.this$0
                java.util.List r2 = org.apache.commons.lang3.event.EventListenerSupport.access$000(r2)
                java.util.Iterator r2 = r2.iterator()
            La:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1d
                java.lang.Object r0 = r2.next()
                r3.invoke(r0, r4)     // Catch: java.lang.Throwable -> L18
                goto La
            L18:
                r0 = move-exception
                r1.handle(r0)
                goto La
            L1d:
                r2 = 0
                return r2
        }
    }

    private EventListenerSupport() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.listeners = r0
            return
    }

    public EventListenerSupport(java.lang.Class<L> r2) {
            r1 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1.<init>(r2, r0)
            return
    }

    public EventListenerSupport(java.lang.Class<L> r4, java.lang.ClassLoader r5) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "listenerInterface"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "classLoader"
            java.util.Objects.requireNonNull(r5, r0)
            boolean r0 = r4.isInterface()
            java.lang.String r1 = r4.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Class %s is not an interface"
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            r3.initializeTransientFields(r4, r5)
            return
    }

    static /* synthetic */ java.util.List access$000(org.apache.commons.lang3.event.EventListenerSupport r0) {
            java.util.List<L> r0 = r0.listeners
            return r0
    }

    public static <T> org.apache.commons.lang3.event.EventListenerSupport<T> create(java.lang.Class<T> r1) {
            org.apache.commons.lang3.event.EventListenerSupport r0 = new org.apache.commons.lang3.event.EventListenerSupport
            r0.<init>(r1)
            return r0
    }

    private void createProxy(java.lang.Class<L> r3, java.lang.ClassLoader r4) {
            r2 = this;
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.reflect.InvocationHandler r1 = r2.createInvocationHandler()
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r4, r0, r1)
            java.lang.Object r3 = r3.cast(r4)
            r2.proxy = r3
            return
    }

    private void initializeTransientFields(java.lang.Class<L> r2, java.lang.ClassLoader r3) {
            r1 = this;
            r0 = 0
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.newInstance(r2, r0)
            r1.prototypeArray = r0
            r1.createProxy(r2, r3)
            return
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.Object r2 = r2.readObject()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r2)
            r1.listeners = r0
            java.lang.Class r2 = org.apache.commons.lang3.ArrayUtils.getComponentType(r2)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1.initializeTransientFields(r2, r0)
            return
    }

    private void writeObject(java.io.ObjectOutputStream r5) throws java.io.IOException {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r1.<init>(r2)
            java.util.List<L> r2 = r4.listeners
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            r1.writeObject(r3)     // Catch: java.io.IOException -> L26
            r0.add(r3)     // Catch: java.io.IOException -> L26
            goto L15
        L26:
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r1.<init>(r3)
            goto L15
        L31:
            L[] r1 = r4.prototypeArray
            java.lang.Object[] r0 = r0.toArray(r1)
            r5.writeObject(r0)
            return
    }

    public void addListener(L r2) {
            r1 = this;
            r0 = 1
            r1.addListener(r2, r0)
            return
    }

    public void addListener(L r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "listener"
            java.util.Objects.requireNonNull(r2, r0)
            if (r3 != 0) goto Lf
            java.util.List<L> r3 = r1.listeners
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L14
        Lf:
            java.util.List<L> r3 = r1.listeners
            r3.add(r2)
        L14:
            return
    }

    protected java.lang.reflect.InvocationHandler createInvocationHandler() {
            r1 = this;
            org.apache.commons.lang3.event.EventListenerSupport$ProxyInvocationHandler r0 = new org.apache.commons.lang3.event.EventListenerSupport$ProxyInvocationHandler
            r0.<init>(r1)
            return r0
    }

    public L fire() {
            r1 = this;
            L r0 = r1.proxy
            return r0
    }

    int getListenerCount() {
            r1 = this;
            java.util.List<L> r0 = r1.listeners
            int r0 = r0.size()
            return r0
    }

    public L[] getListeners() {
            r2 = this;
            java.util.List<L> r0 = r2.listeners
            L[] r1 = r2.prototypeArray
            java.lang.Object[] r0 = r0.toArray(r1)
            return r0
    }

    public void removeListener(L r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.List<L> r0 = r1.listeners
            r0.remove(r2)
            return
    }
}
