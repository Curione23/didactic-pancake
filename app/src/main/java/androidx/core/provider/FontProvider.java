package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class FontProvider {
    private static final java.util.Comparator<byte[]> sByteArrayComparator = null;

    private interface ContentQueryWrapper {
        static androidx.core.provider.FontProvider.ContentQueryWrapper make(android.content.Context r1, android.net.Uri r2) {
                androidx.core.provider.FontProvider$ContentQueryWrapperApi24Impl r0 = new androidx.core.provider.FontProvider$ContentQueryWrapperApi24Impl
                r0.<init>(r1, r2)
                return r0
        }

        void close();

        android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, android.os.CancellationSignal r6);
    }

    private static class ContentQueryWrapperApi16Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient mClient;

        ContentQueryWrapperApi16Impl(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                android.content.ContentResolver r1 = r1.getContentResolver()
                android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r2)
                r0.mClient = r1
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
                r1 = this;
                android.content.ContentProviderClient r0 = r1.mClient
                if (r0 == 0) goto L7
                r0.release()
            L7:
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor query(android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, android.os.CancellationSignal r14) {
                r8 = this;
                android.content.ContentProviderClient r0 = r8.mClient
                r7 = 0
                if (r0 != 0) goto L6
                return r7
            L6:
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L11
                return r9
            L11:
                r9 = move-exception
                java.lang.String r10 = "FontsProvider"
                java.lang.String r11 = "Unable to query the content provider"
                android.util.Log.w(r10, r11, r9)
                return r7
        }
    }

    private static class ContentQueryWrapperApi24Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient mClient;

        ContentQueryWrapperApi24Impl(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                android.content.ContentResolver r1 = r1.getContentResolver()
                android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r2)
                r0.mClient = r1
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
                r1 = this;
                android.content.ContentProviderClient r0 = r1.mClient
                if (r0 == 0) goto L7
                r0.close()
            L7:
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor query(android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, android.os.CancellationSignal r14) {
                r8 = this;
                android.content.ContentProviderClient r0 = r8.mClient
                r7 = 0
                if (r0 != 0) goto L6
                return r7
            L6:
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L11
                return r9
            L11:
                r9 = move-exception
                java.lang.String r10 = "FontsProvider"
                java.lang.String r11 = "Unable to query the content provider"
                android.util.Log.w(r10, r11, r9)
                return r7
        }
    }

    static {
            androidx.core.provider.FontProvider$$ExternalSyntheticLambda0 r0 = new androidx.core.provider.FontProvider$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.core.provider.FontProvider.sByteArrayComparator = r0
            return
    }

    private FontProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r4[r2]
            byte[] r3 = r3.toByteArray()
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    private static boolean equalsByteArrayList(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = r2
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r4 = 1
            return r4
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest r1, android.content.res.Resources r2) {
            java.util.List r0 = r1.getCertificates()
            if (r0 == 0) goto Lb
            java.util.List r1 = r1.getCertificates()
            return r1
        Lb:
            int r1 = r1.getCertificatesArrayResId()
            java.util.List r1 = androidx.core.content.res.FontResourcesParserCompat.readCerts(r2, r1)
            return r1
    }

    static androidx.core.provider.FontsContractCompat.FontFamilyResult getFontFamilyResult(android.content.Context r2, androidx.core.provider.FontRequest r3, android.os.CancellationSignal r4) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.res.Resources r1 = r2.getResources()
            android.content.pm.ProviderInfo r0 = getProvider(r0, r3, r1)
            if (r0 != 0) goto L15
            r2 = 1
            r3 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r2, r3)
            return r2
        L15:
            java.lang.String r0 = r0.authority
            androidx.core.provider.FontsContractCompat$FontInfo[] r2 = query(r2, r3, r0, r4)
            r3 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r3, r2)
            return r2
    }

    static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager r5, androidx.core.provider.FontRequest r6, android.content.res.Resources r7) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = r6.getProviderAuthority()
            r1 = 0
            android.content.pm.ProviderInfo r2 = r5.resolveContentProvider(r0, r1)
            if (r2 == 0) goto L73
            java.lang.String r3 = r2.packageName
            java.lang.String r4 = r6.getProviderPackage()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L50
            java.lang.String r0 = r2.packageName
            r3 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r3)
            android.content.pm.Signature[] r5 = r5.signatures
            java.util.List r5 = convertToByteArrayList(r5)
            java.util.Comparator<byte[]> r0 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r5, r0)
            java.util.List r6 = getCertificates(r6, r7)
        L2e:
            int r7 = r6.size()
            if (r1 >= r7) goto L4e
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r0 = r6.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            java.util.Comparator<byte[]> r0 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r7, r0)
            boolean r7 = equalsByteArrayList(r5, r7)
            if (r7 == 0) goto L4b
            return r2
        L4b:
            int r1 = r1 + 1
            goto L2e
        L4e:
            r5 = 0
            return r5
        L50:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Found content provider "
            r7.<init>(r1)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = ", but package was not "
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r6 = r6.getProviderPackage()
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L73:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "No package found for authority: "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    static /* synthetic */ int lambda$static$0(byte[] r4, byte[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L8
            int r4 = r4.length
            int r5 = r5.length
            int r4 = r4 - r5
            return r4
        L8:
            r0 = 0
            r1 = r0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L18
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L15
            int r2 = r2 - r3
            return r2
        L15:
            int r1 = r1 + 1
            goto La
        L18:
            return r0
    }

    static androidx.core.provider.FontsContractCompat.FontInfo[] query(android.content.Context r21, androidx.core.provider.FontRequest r22, java.lang.String r23, android.os.CancellationSignal r24) {
            r0 = r23
            java.lang.String r1 = "result_code"
            java.lang.String r2 = "font_italic"
            java.lang.String r3 = "font_weight"
            java.lang.String r4 = "font_ttc_index"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "_id"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            android.net.Uri$Builder r8 = new android.net.Uri$Builder
            r8.<init>()
            java.lang.String r9 = "content"
            android.net.Uri$Builder r8 = r8.scheme(r9)
            android.net.Uri$Builder r8 = r8.authority(r0)
            android.net.Uri r8 = r8.build()
            android.net.Uri$Builder r10 = new android.net.Uri$Builder
            r10.<init>()
            android.net.Uri$Builder r9 = r10.scheme(r9)
            android.net.Uri$Builder r0 = r9.authority(r0)
            java.lang.String r9 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r9)
            android.net.Uri r0 = r0.build()
            r9 = r21
            androidx.core.provider.FontProvider$ContentQueryWrapper r9 = androidx.core.provider.FontProvider.ContentQueryWrapper.make(r9, r8)
            r10 = 7
            r17 = 0
            java.lang.String[] r12 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L10b
            r15 = 0
            r12[r15] = r6     // Catch: java.lang.Throwable -> L10b
            r14 = 1
            r12[r14] = r5     // Catch: java.lang.Throwable -> L10b
            r10 = 2
            r12[r10] = r4     // Catch: java.lang.Throwable -> L10b
            java.lang.String r10 = "font_variation_settings"
            r11 = 3
            r12[r11] = r10     // Catch: java.lang.Throwable -> L10b
            r10 = 4
            r12[r10] = r3     // Catch: java.lang.Throwable -> L10b
            r10 = 5
            r12[r10] = r2     // Catch: java.lang.Throwable -> L10b
            r10 = 6
            r12[r10] = r1     // Catch: java.lang.Throwable -> L10b
            java.lang.String r13 = "query = ?"
            java.lang.String[] r11 = new java.lang.String[r14]     // Catch: java.lang.Throwable -> L10b
            java.lang.String r10 = r22.getQuery()     // Catch: java.lang.Throwable -> L10b
            r11[r15] = r10     // Catch: java.lang.Throwable -> L10b
            r16 = 0
            r10 = r9
            r18 = r11
            r11 = r8
            r19 = r7
            r7 = r14
            r14 = r18
            r15 = r16
            r16 = r24
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L10b
            if (r10 == 0) goto Lf7
            int r11 = r10.getCount()     // Catch: java.lang.Throwable -> Lf3
            if (r11 <= 0) goto Lf7
            int r1 = r10.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lf3
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf3
            r11.<init>()     // Catch: java.lang.Throwable -> Lf3
            int r6 = r10.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lf3
            int r5 = r10.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lf3
            int r4 = r10.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lf3
            int r3 = r10.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lf3
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lf3
        La1:
            boolean r12 = r10.moveToNext()     // Catch: java.lang.Throwable -> Lf3
            if (r12 == 0) goto Lf1
            r12 = -1
            if (r1 == r12) goto Laf
            int r15 = r10.getInt(r1)     // Catch: java.lang.Throwable -> Lf3
            goto Lb0
        Laf:
            r15 = 0
        Lb0:
            if (r4 == r12) goto Lb7
            int r13 = r10.getInt(r4)     // Catch: java.lang.Throwable -> Lf3
            goto Lb8
        Lb7:
            r13 = 0
        Lb8:
            if (r5 != r12) goto Lc4
            r14 = r13
            long r12 = r10.getLong(r6)     // Catch: java.lang.Throwable -> Lf3
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r8, r12)     // Catch: java.lang.Throwable -> Lf3
            goto Lcd
        Lc4:
            r14 = r13
            long r12 = r10.getLong(r5)     // Catch: java.lang.Throwable -> Lf3
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch: java.lang.Throwable -> Lf3
        Lcd:
            r13 = -1
            if (r3 == r13) goto Ld5
            int r16 = r10.getInt(r3)     // Catch: java.lang.Throwable -> Lf3
            goto Ld7
        Ld5:
            r16 = 400(0x190, float:5.6E-43)
        Ld7:
            r20 = r16
            if (r2 == r13) goto Le5
            int r13 = r10.getInt(r2)     // Catch: java.lang.Throwable -> Lf3
            if (r13 != r7) goto Le5
            r13 = r7
            r7 = r20
            goto Le8
        Le5:
            r7 = r20
            r13 = 0
        Le8:
            androidx.core.provider.FontsContractCompat$FontInfo r7 = androidx.core.provider.FontsContractCompat.FontInfo.create(r12, r14, r7, r13, r15)     // Catch: java.lang.Throwable -> Lf3
            r11.add(r7)     // Catch: java.lang.Throwable -> Lf3
            r7 = 1
            goto La1
        Lf1:
            r7 = r11
            goto Lf9
        Lf3:
            r0 = move-exception
            r17 = r10
            goto L10c
        Lf7:
            r7 = r19
        Lf9:
            if (r10 == 0) goto Lfe
            r10.close()
        Lfe:
            r9.close()
            r0 = 0
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0
            return r0
        L10b:
            r0 = move-exception
        L10c:
            if (r17 == 0) goto L111
            r17.close()
        L111:
            r9.close()
            throw r0
    }
}
