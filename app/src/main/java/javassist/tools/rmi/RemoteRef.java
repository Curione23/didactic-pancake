package javassist.tools.rmi;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/rmi/RemoteRef.class */
public class RemoteRef implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    public int oid;
    public java.lang.String classname;

    public RemoteRef(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.oid = r1
            r0 = r3
            r1 = 0
            r0.classname = r1
            return
    }

    public RemoteRef(int r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.oid = r1
            r0 = r3
            r1 = r5
            r0.classname = r1
            return
    }
}
