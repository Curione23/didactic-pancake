package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class ClassPathUtils {
    @java.lang.Deprecated
    public ClassPathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String packageToPath(java.lang.String r2) {
            java.lang.String r0 = "path"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static java.lang.String pathToPackage(java.lang.String r2) {
            java.lang.String r0 = "path"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r0 = 47
            r1 = 46
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static java.lang.String toFullyQualifiedName(java.lang.Class<?> r1, java.lang.String r2) {
            java.lang.String r0 = "context"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "resourceName"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Package r1 = r1.getPackage()
            java.lang.String r1 = toFullyQualifiedName(r1, r2)
            return r1
    }

    public static java.lang.String toFullyQualifiedName(java.lang.Package r1, java.lang.String r2) {
            java.lang.String r0 = "context"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "resourceName"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "."
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String toFullyQualifiedPath(java.lang.Class<?> r1, java.lang.String r2) {
            java.lang.String r0 = "context"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "resourceName"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Package r1 = r1.getPackage()
            java.lang.String r1 = toFullyQualifiedPath(r1, r2)
            return r1
    }

    public static java.lang.String toFullyQualifiedPath(java.lang.Package r1, java.lang.String r2) {
            java.lang.String r0 = "context"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "resourceName"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = packageToPath(r1)
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = "/"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
