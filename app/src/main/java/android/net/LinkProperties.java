package android.net;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/LinkProperties.class */
public class LinkProperties {
    public LinkProperties() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.String getInterfaceName() {
            r2 = this;
            java.net.NetworkInterface r0 = findBestInterface()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto Ld
            r0 = r3
            java.lang.String r0 = r0.getName()
            return r0
        Ld:
            java.lang.String r0 = "wlan0"
            return r0
    }

    public java.util.List<android.net.LinkAddress> getLinkAddresses() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            java.net.NetworkInterface r0 = findBestInterface()     // Catch: java.lang.Throwable -> Lbc
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L42
            r0 = r7
            java.util.Enumeration r0 = r0.getInetAddresses()     // Catch: java.lang.Throwable -> Lbc
            r8 = r0
        L15:
            r0 = r8
            boolean r0 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L42
            r0 = r8
            java.lang.Object r0 = r0.nextElement()     // Catch: java.lang.Throwable -> Lbc
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch: java.lang.Throwable -> Lbc
            r9 = r0
            r0 = r9
            boolean r0 = isUsableAddress(r0)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L3f
            r0 = r6
            android.net.LinkAddress r1 = new android.net.LinkAddress     // Catch: java.lang.Throwable -> Lbc
            r2 = r1
            r3 = r9
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> Lbc
        L3f:
            goto L15
        L42:
            r0 = r6
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lb9
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> Lbc
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lb9
            r0 = r8
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lbc
            r9 = r0
        L5a:
            r0 = r9
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lb9
            r0 = r9
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lbc
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch: java.lang.Throwable -> Lbc
            r10 = r0
            r0 = r10
            boolean r0 = isUsableInterface(r0)     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
            if (r0 != 0) goto L7b
            goto L5a
        L7b:
            r0 = r10
            java.util.Enumeration r0 = r0.getInetAddresses()     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
            r11 = r0
        L82:
            r0 = r11
            boolean r0 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lb1
            r0 = r11
            java.lang.Object r0 = r0.nextElement()     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
            r12 = r0
            r0 = r12
            boolean r0 = isUsableAddress(r0)     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lae
            r0 = r6
            android.net.LinkAddress r1 = new android.net.LinkAddress     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
            r2 = r1
            r3 = r12
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> Lb4 java.lang.Throwable -> Lbc
        Lae:
            goto L82
        Lb1:
            goto Lb6
        Lb4:
            r11 = move-exception
        Lb6:
            goto L5a
        Lb9:
            goto Lbd
        Lbc:
            r7 = move-exception
        Lbd:
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld9
            r0 = r6
            android.net.LinkAddress r1 = new android.net.LinkAddress     // Catch: java.lang.Throwable -> Ld8
            r2 = r1
            java.lang.String r3 = "127.0.0.1"
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch: java.lang.Throwable -> Ld8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> Ld8
            goto Ld9
        Ld8:
            r7 = move-exception
        Ld9:
            r0 = r6
            return r0
    }

    private static java.net.NetworkInterface findBestInterface() {
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> Lc0
            r3 = r0
            r0 = r3
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = 0
            r4 = r0
            r0 = r3
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Throwable -> Lc0
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc0
            r5 = r0
        L14:
            r0 = r5
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto Lbe
            r0 = r5
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lc0
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch: java.lang.Throwable -> Lc0
            r6 = r0
            r0 = r6
            boolean r0 = isUsableInterface(r0)     // Catch: java.lang.Throwable -> Lc0
            if (r0 != 0) goto L31
            goto L14
        L31:
            r0 = 0
            r7 = r0
            r0 = r6
            java.util.Enumeration r0 = r0.getInetAddresses()     // Catch: java.lang.Throwable -> Lc0
            r8 = r0
        L3a:
            r0 = r8
            boolean r0 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L5a
            r0 = r8
            java.lang.Object r0 = r0.nextElement()     // Catch: java.lang.Throwable -> Lc0
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch: java.lang.Throwable -> Lc0
            boolean r0 = isUsableAddress(r0)     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L3a
            r0 = 1
            r7 = r0
            goto L5a
        L5a:
            r0 = r7
            if (r0 != 0) goto L62
            goto L14
        L62:
            r0 = r6
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lc0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Lb5
            r0 = r9
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> Lc0
            r10 = r0
            r0 = r10
            java.lang.String r1 = "wlan"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r0 != 0) goto Lb3
            r0 = r10
            java.lang.String r1 = "wifi"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r0 != 0) goto Lb3
            r0 = r10
            java.lang.String r1 = "eth"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r0 != 0) goto Lb3
            r0 = r10
            java.lang.String r1 = "rmnet"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r0 != 0) goto Lb3
            r0 = r10
            java.lang.String r1 = "ccmni"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r0 != 0) goto Lb3
            r0 = r10
            java.lang.String r1 = "usb"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto Lb5
        Lb3:
            r0 = r6
            return r0
        Lb5:
            r0 = r4
            if (r0 != 0) goto Lbb
            r0 = r6
            r4 = r0
        Lbb:
            goto L14
        Lbe:
            r0 = r4
            return r0
        Lc0:
            r3 = move-exception
            r0 = 0
            return r0
    }

    private static boolean isUsableInterface(java.net.NetworkInterface r2) {
            r0 = r2
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            boolean r0 = r0.isUp()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r2
            boolean r0 = r0.isLoopback()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L18
            r0 = 0
            return r0
        L18:
            r0 = r2
            boolean r0 = r0.isVirtual()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = 1
            return r0
        L23:
            r3 = move-exception
            r0 = 0
            return r0
    }

    private static boolean isUsableAddress(java.net.InetAddress r2) {
            r0 = r2
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            boolean r0 = r0.isAnyLocalAddress()
            if (r0 == 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r2
            boolean r0 = r0.isLoopbackAddress()
            if (r0 == 0) goto L18
            r0 = 0
            return r0
        L18:
            r0 = r2
            boolean r0 = r0.isLinkLocalAddress()
            if (r0 == 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r2
            boolean r0 = r0.isMulticastAddress()
            if (r0 == 0) goto L2a
            r0 = 0
            return r0
        L2a:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "DroidBridgeLinkProperties{iface="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getInterfaceName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", addresses="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.util.List r1 = r1.getLinkAddresses()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
