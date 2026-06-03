package javassist.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/HotSwapper.class */
public class HotSwapper {
    private com.sun.jdi.VirtualMachine jvm;
    private com.sun.jdi.request.MethodEntryRequest request;
    private java.util.Map<com.sun.jdi.ReferenceType, byte[]> newClassFiles;
    private javassist.util.Trigger trigger;
    private static final java.lang.String HOST_NAME = "localhost";
    private static final java.lang.String TRIGGER_NAME = null;


    public HotSwapper(int r4) throws java.io.IOException, com.sun.jdi.connect.IllegalConnectorArgumentsException {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.<init>(r1)
            return
    }

    public HotSwapper(java.lang.String r5) throws java.io.IOException, com.sun.jdi.connect.IllegalConnectorArgumentsException {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.jvm = r1
            r0 = r4
            r1 = 0
            r0.request = r1
            r0 = r4
            r1 = 0
            r0.newClassFiles = r1
            r0 = r4
            javassist.util.Trigger r1 = new javassist.util.Trigger
            r2 = r1
            r2.<init>()
            r0.trigger = r1
            r0 = r4
            java.lang.String r1 = "com.sun.jdi.SocketAttach"
            com.sun.jdi.connect.Connector r0 = r0.findConnector(r1)
            com.sun.jdi.connect.AttachingConnector r0 = (com.sun.jdi.connect.AttachingConnector) r0
            r6 = r0
            r0 = r6
            java.util.Map r0 = r0.defaultArguments()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "hostname"
            java.lang.Object r0 = r0.get(r1)
            com.sun.jdi.connect.Connector$Argument r0 = (com.sun.jdi.connect.Connector.Argument) r0
            java.lang.String r1 = "localhost"
            r0.setValue(r1)
            r0 = r7
            java.lang.String r1 = "port"
            java.lang.Object r0 = r0.get(r1)
            com.sun.jdi.connect.Connector$Argument r0 = (com.sun.jdi.connect.Connector.Argument) r0
            r1 = r5
            r0.setValue(r1)
            r0 = r4
            r1 = r6
            r2 = r7
            com.sun.jdi.VirtualMachine r1 = r1.attach(r2)
            r0.jvm = r1
            r0 = r4
            com.sun.jdi.VirtualMachine r0 = r0.jvm
            com.sun.jdi.request.EventRequestManager r0 = r0.eventRequestManager()
            r8 = r0
            r0 = r4
            r1 = r8
            java.lang.String r2 = javassist.util.HotSwapper.TRIGGER_NAME
            com.sun.jdi.request.MethodEntryRequest r1 = methodEntryRequests(r1, r2)
            r0.request = r1
            return
    }

    private com.sun.jdi.connect.Connector findConnector(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            com.sun.jdi.VirtualMachineManager r0 = com.sun.jdi.Bootstrap.virtualMachineManager()
            java.util.List r0 = r0.allConnectors()
            r7 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L10:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L38
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.sun.jdi.connect.Connector r0 = (com.sun.jdi.connect.Connector) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.name()
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r9
            return r0
        L35:
            goto L10
        L38:
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Not found: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static com.sun.jdi.request.MethodEntryRequest methodEntryRequests(com.sun.jdi.request.EventRequestManager r3, java.lang.String r4) {
            r0 = r3
            com.sun.jdi.request.MethodEntryRequest r0 = r0.createMethodEntryRequest()
            r5 = r0
            r0 = r5
            r1 = r4
            r0.addClassFilter(r1)
            r0 = r5
            r1 = 1
            r0.setSuspendPolicy(r1)
            r0 = r5
            return r0
    }

    private void deleteEventRequest(com.sun.jdi.request.EventRequestManager r4, com.sun.jdi.request.MethodEntryRequest r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            r0.deleteEventRequest(r1)
            return
    }

    public void reload(java.lang.String r5, byte[] r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            com.sun.jdi.ReferenceType r0 = r0.toRefType(r1)
            r7 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            r1 = r8
            r2 = r5
            r0.reload2(r1, r2)
            return
    }

    public void reload(java.util.Map<java.lang.String, byte[]> r6) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L17:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L51
            r0 = r9
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r10 = r0
            r0 = r10
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r7
            r1 = r5
            r2 = r8
            com.sun.jdi.ReferenceType r1 = r1.toRefType(r2)
            r2 = r10
            java.lang.Object r2 = r2.getValue()
            byte[] r2 = (byte[]) r2
            java.lang.Object r0 = r0.put(r1, r2)
            goto L17
        L51:
            r0 = r8
            if (r0 == 0) goto L6d
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " etc."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.reload2(r1, r2)
        L6d:
            return
    }

    private com.sun.jdi.ReferenceType toRefType(java.lang.String r6) {
            r5 = this;
            r0 = r5
            com.sun.jdi.VirtualMachine r0 = r0.jvm
            r1 = r6
            java.util.List r0 = r0.classesByName(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L18
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L33
        L18:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no such class: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.sun.jdi.ReferenceType r0 = (com.sun.jdi.ReferenceType) r0
            return r0
    }

    private void reload2(java.util.Map<com.sun.jdi.ReferenceType, byte[]> r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            javassist.util.Trigger r0 = r0.trigger
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            r0 = r5
            r0.startDaemon()     // Catch: java.lang.Throwable -> L59
            r0 = r5
            r1 = r6
            r0.newClassFiles = r1     // Catch: java.lang.Throwable -> L59
            r0 = r5
            com.sun.jdi.request.MethodEntryRequest r0 = r0.request     // Catch: java.lang.Throwable -> L59
            r0.enable()     // Catch: java.lang.Throwable -> L59
            r0 = r5
            javassist.util.Trigger r0 = r0.trigger     // Catch: java.lang.Throwable -> L59
            r0.doSwap()     // Catch: java.lang.Throwable -> L59
            r0 = r5
            com.sun.jdi.request.MethodEntryRequest r0 = r0.request     // Catch: java.lang.Throwable -> L59
            r0.disable()     // Catch: java.lang.Throwable -> L59
            r0 = r5
            java.util.Map<com.sun.jdi.ReferenceType, byte[]> r0 = r0.newClassFiles     // Catch: java.lang.Throwable -> L59
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L54
            r0 = r5
            r1 = 0
            r0.newClassFiles = r1     // Catch: java.lang.Throwable -> L59
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L59
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "failed to reload: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L59
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L59
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L59
            throw r0     // Catch: java.lang.Throwable -> L59
        L54:
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            goto L60
        L59:
            r10 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            r0 = r10
            throw r0
        L60:
            return
    }

    private void startDaemon() {
            r4 = this;
            javassist.util.HotSwapper$1 r0 = new javassist.util.HotSwapper$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r0.start()
            return
    }

    com.sun.jdi.event.EventSet waitEvent() throws java.lang.InterruptedException {
            r2 = this;
            r0 = r2
            com.sun.jdi.VirtualMachine r0 = r0.jvm
            com.sun.jdi.event.EventQueue r0 = r0.eventQueue()
            r3 = r0
            r0 = r3
            com.sun.jdi.event.EventSet r0 = r0.remove()
            return r0
    }

    void hotswap() {
            r3 = this;
            r0 = r3
            java.util.Map<com.sun.jdi.ReferenceType, byte[]> r0 = r0.newClassFiles
            r4 = r0
            r0 = r3
            com.sun.jdi.VirtualMachine r0 = r0.jvm
            r1 = r4
            r0.redefineClasses(r1)
            r0 = r3
            r1 = 0
            r0.newClassFiles = r1
            return
    }

    static {
            java.lang.Class<javassist.util.Trigger> r0 = javassist.util.Trigger.class
            java.lang.String r0 = r0.getName()
            javassist.util.HotSwapper.TRIGGER_NAME = r0
            return
    }
}
