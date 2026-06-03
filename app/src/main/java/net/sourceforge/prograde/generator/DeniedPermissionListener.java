package net.sourceforge.prograde.generator;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/pro-grade.jar:net/sourceforge/prograde/generator/DeniedPermissionListener.class */
public interface DeniedPermissionListener {
    void permissionDenied(java.security.ProtectionDomain r1, java.security.Permission r2);

    void policyRefreshed();
}
