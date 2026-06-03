package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtils {
    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getXmlAttributeString(java.lang.String r4, java.lang.String r5, android.content.Context r6, android.util.AttributeSet r7, boolean r8, boolean r9, java.lang.String r10) {
            java.lang.String r0 = ":string/"
            if (r7 != 0) goto L6
            r4 = 0
            goto La
        L6:
            java.lang.String r4 = r7.getAttributeValue(r4, r5)
        La:
            if (r4 == 0) goto Lb7
            java.lang.String r7 = "@string/"
            boolean r7 = r4.startsWith(r7)
            if (r7 == 0) goto Lb7
            if (r8 == 0) goto Lb7
            r7 = 8
            java.lang.String r8 = r4.substring(r7)
            java.lang.String r1 = r6.getPackageName()
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources r6 = r6.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L52
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: android.content.res.Resources.NotFoundException -> L52
            int r3 = r3.length()     // Catch: android.content.res.Resources.NotFoundException -> L52
            int r3 = r3 + r7
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: android.content.res.Resources.NotFoundException -> L52
            int r7 = r7.length()     // Catch: android.content.res.Resources.NotFoundException -> L52
            int r3 = r3 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L52
            r7.<init>(r3)     // Catch: android.content.res.Resources.NotFoundException -> L52
            r7.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L52
            r7.append(r0)     // Catch: android.content.res.Resources.NotFoundException -> L52
            r7.append(r8)     // Catch: android.content.res.Resources.NotFoundException -> L52
            java.lang.String r7 = r7.toString()     // Catch: android.content.res.Resources.NotFoundException -> L52
            r8 = 1
            r6.getValue(r7, r2, r8)     // Catch: android.content.res.Resources.NotFoundException -> L52
            goto L7d
        L52:
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 30
            int r7 = r4.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = "Could not find resource for "
            r8.append(r6)
            r8.append(r5)
            java.lang.String r6 = ": "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r6 = r8.toString()
            android.util.Log.w(r10, r6)
        L7d:
            java.lang.CharSequence r6 = r2.string
            if (r6 == 0) goto L88
            java.lang.CharSequence r4 = r2.string
            java.lang.String r4 = r4.toString()
            goto Lb7
        L88:
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r7 = r7 + 28
            int r8 = r6.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r7 = r7 + r8
            r0.<init>(r7)
            java.lang.String r7 = "Resource "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = " was not a string: "
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r10, r6)
        Lb7:
            if (r9 == 0) goto Lde
            if (r4 != 0) goto Lde
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 33
            r7.<init>(r6)
            java.lang.String r6 = "Required XML attribute \""
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = "\" missing"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.w(r10, r5)
        Lde:
            return r4
    }
}
