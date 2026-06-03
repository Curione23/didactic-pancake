package javassist.tools.rmi;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/rmi/Sample.class */
public class Sample {
    private javassist.tools.rmi.ObjectImporter importer;
    private int objectId;

    public Sample() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.Object forward(java.lang.Object[] r6, int r7) {
            r5 = this;
            r0 = r5
            javassist.tools.rmi.ObjectImporter r0 = r0.importer
            r1 = r5
            int r1 = r1.objectId
            r2 = r7
            r3 = r6
            java.lang.Object r0 = r0.call(r1, r2, r3)
            return r0
    }

    public static java.lang.Object forwardStatic(java.lang.Object[] r4, int r5) throws javassist.tools.rmi.RemoteException {
            javassist.tools.rmi.RemoteException r0 = new javassist.tools.rmi.RemoteException
            r1 = r0
            java.lang.String r2 = "cannot call a static method."
            r1.<init>(r2)
            throw r0
    }
}
