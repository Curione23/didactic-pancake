package ca.dnamobile.javalauncher.storage;

/* JADX INFO: loaded from: classes.dex */
public final class SafMinecraftMirror {
    private static final int BUFFER_SIZE = 65536;
    private static final java.lang.String TAG = "SafMinecraftMirror";

    private static final class DocumentEntry {
        final boolean directory;
        final java.lang.String displayName;
        final long size;
        final android.net.Uri uri;

        DocumentEntry(android.net.Uri r1, java.lang.String r2, boolean r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.uri = r1
                r0.displayName = r2
                r0.directory = r3
                r0.size = r4
                return
        }
    }

    public interface Progress {
        void onProgress(int r1, java.lang.String r2);
    }

    private SafMinecraftMirror() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String cleanRelativePath(java.lang.String r4) {
            r0 = 92
            r1 = 47
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.String r4 = r4.trim()
        Lc:
            java.lang.String r0 = "/"
            boolean r1 = r4.startsWith(r0)
            r2 = 1
            if (r1 == 0) goto L1a
            java.lang.String r4 = r4.substring(r2)
            goto Lc
        L1a:
            boolean r1 = r4.endsWith(r0)
            if (r1 == 0) goto L2b
            int r1 = r4.length()
            int r1 = r1 - r2
            r3 = 0
            java.lang.String r4 = r4.substring(r3, r1)
            goto L1a
        L2b:
            return r4
    }

    private static void copy(java.io.InputStream r3, java.io.OutputStream r4) throws java.lang.Exception {
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L10
            r2 = 0
            r4.write(r0, r2, r1)
            goto L4
        L10:
            return
    }

    private static void copyDocumentDirectoryToLocal(android.content.Context r8, android.net.Uri r9, java.io.File r10, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r11, java.lang.String r12) throws java.lang.Exception {
            boolean r0 = r10.exists()
            if (r0 != 0) goto L26
            boolean r0 = r10.mkdirs()
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Unable to create local mirror directory: "
            r9.<init>(r11)
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L26:
            java.util.ArrayList r9 = listChildren(r8, r9)
            java.util.Iterator r9 = r9.iterator()
        L2e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r9.next()
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror$DocumentEntry r0 = (ca.dnamobile.javalauncher.storage.SafMinecraftMirror.DocumentEntry) r0
            java.lang.String r1 = r0.displayName
            if (r1 == 0) goto L2e
            java.lang.String r1 = r0.displayName
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4b
            goto L2e
        L4b:
            java.io.File r4 = new java.io.File
            java.lang.String r1 = r0.displayName
            r4.<init>(r10, r1)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L5b
            java.lang.String r1 = r0.displayName
            goto L74
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r0.displayName
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L74:
            r7 = r1
            boolean r1 = r0.directory
            if (r1 == 0) goto L7f
            android.net.Uri r0 = r0.uri
            copyDocumentDirectoryToLocal(r8, r0, r4, r11, r7)
            goto L2e
        L7f:
            if (r11 == 0) goto L94
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Reading scoped storage: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r2 = 3
            r11.onProgress(r2, r1)
        L94:
            android.net.Uri r3 = r0.uri
            long r5 = r0.size
            r2 = r8
            copyDocumentFileToLocal(r2, r3, r4, r5, r7)
            goto L2e
        L9d:
            return
    }

    private static void copyDocumentFileToLocal(android.content.Context r6, android.net.Uri r7, java.io.File r8) throws java.lang.Exception {
            long r3 = queryDocumentSize(r6, r7)
            java.lang.String r5 = r8.getName()
            r0 = r6
            r1 = r7
            r2 = r8
            copyDocumentFileToLocal(r0, r1, r2, r3, r5)
            return
    }

    private static void copyDocumentFileToLocal(android.content.Context r3, android.net.Uri r4, java.io.File r5, long r6, java.lang.String r8) throws java.lang.Exception {
            java.lang.String r0 = "Unable to open SAF input: "
            java.io.File r1 = r5.getParentFile()
            if (r1 == 0) goto L2e
            boolean r2 = r1.exists()
            if (r2 != 0) goto L2e
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L15
            goto L2e
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to create local mirror parent: "
            r4.<init>(r5)
            java.lang.String r5 = r1.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2e:
            boolean r6 = shouldSkipExistingLocalWrite(r5, r6, r8)
            if (r6 == 0) goto L35
            return
        L35:
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.io.InputStream r3 = r3.openInputStream(r4)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6f
            r7 = 0
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L53
            copy(r3, r6)     // Catch: java.lang.Throwable -> L51
            r6.close()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L50
            r3.close()
        L50:
            return
        L51:
            r4 = move-exception
            goto L66
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r4 = r7.append(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L51
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L51
            throw r5     // Catch: java.lang.Throwable -> L51
        L66:
            r6.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.Throwable -> L6f
        L6e:
            throw r4     // Catch: java.lang.Throwable -> L6f
        L6f:
            r4 = move-exception
            if (r3 == 0) goto L7a
            r3.close()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r3 = move-exception
            r4.addSuppressed(r3)
        L7a:
            throw r4
    }

    private static void copyDocumentMetadataToLocal(android.content.Context r8, android.net.Uri r9, java.io.File r10, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r11, java.lang.String r12) throws java.lang.Exception {
            boolean r0 = r10.exists()
            if (r0 != 0) goto L26
            boolean r0 = r10.mkdirs()
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Unable to create local metadata mirror directory: "
            r9.<init>(r11)
            java.lang.String r10 = r10.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L26:
            java.util.ArrayList r9 = listChildren(r8, r9)
            java.util.Iterator r9 = r9.iterator()
        L2e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r9.next()
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror$DocumentEntry r0 = (ca.dnamobile.javalauncher.storage.SafMinecraftMirror.DocumentEntry) r0
            java.lang.String r1 = r0.displayName
            if (r1 == 0) goto L2e
            java.lang.String r1 = r0.displayName
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4b
            goto L2e
        L4b:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L54
            java.lang.String r1 = r0.displayName
            goto L6d
        L54:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r0.displayName
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L6d:
            r7 = r1
            java.lang.String r1 = normalizeMetadataPath(r7)
            boolean r2 = r0.directory
            if (r2 == 0) goto L8a
            boolean r1 = shouldDescendForLauncherMetadata(r1)
            if (r1 != 0) goto L7d
            goto L2e
        L7d:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.displayName
            r1.<init>(r10, r2)
            android.net.Uri r0 = r0.uri
            copyDocumentMetadataToLocal(r8, r0, r1, r11, r7)
            goto L2e
        L8a:
            boolean r1 = shouldCopyLauncherMetadataFile(r1)
            if (r1 == 0) goto L2e
            if (r11 == 0) goto La5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Reading launcher metadata: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r2 = 3
            r11.onProgress(r2, r1)
        La5:
            android.net.Uri r3 = r0.uri
            java.io.File r4 = new java.io.File
            java.lang.String r1 = r0.displayName
            r4.<init>(r10, r1)
            long r5 = r0.size
            r2 = r8
            copyDocumentFileToLocal(r2, r3, r4, r5, r7)
            goto L2e
        Lb6:
            return
    }

    private static void copyLocalDirectoryToDocument(android.content.Context r17, java.io.File r18, android.net.Uri r19, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r20, java.io.File r21) throws java.lang.Exception {
            r7 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            java.io.File[] r11 = r18.listFiles()
            if (r11 != 0) goto Lf
            return
        Lf:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.ArrayList r0 = listChildren(r7, r8)
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror$DocumentEntry r1 = (ca.dnamobile.javalauncher.storage.SafMinecraftMirror.DocumentEntry) r1
            boolean r2 = r1.directory
            if (r2 == 0) goto L3e
            java.lang.String r2 = r1.displayName
            android.net.Uri r1 = r1.uri
            r12.put(r2, r1)
            goto L26
        L3e:
            java.lang.String r2 = r1.displayName
            android.net.Uri r3 = r1.uri
            r13.put(r2, r3)
            java.lang.String r2 = r1.displayName
            long r3 = r1.size
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r14.put(r2, r1)
            goto L26
        L51:
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.storage.SafMinecraftMirror$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.Arrays.sort(r11, r0)
            int r15 = r11.length
            r0 = 0
            r6 = r0
        L5c:
            if (r6 >= r15) goto Ldb
            r1 = r11[r6]
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = "launcher_log"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L70
        L6c:
            r16 = r6
            goto Ld8
        L70:
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = ".java_launcher_saf_tmp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7d
            goto L6c
        L7d:
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = ".scoped_storage_metadata_loaded"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8a
            goto L6c
        L8a:
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = ".pending_delete"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L97
            goto L6c
        L97:
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto La9
            java.lang.String r0 = r1.getName()
            android.net.Uri r0 = ensureDirectory(r7, r8, r0, r12)
            copyLocalDirectoryToDocument(r7, r1, r0, r9, r10)
            goto L6c
        La9:
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L6c
            java.lang.String r4 = relativePath(r10, r1)
            if (r9 == 0) goto Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Syncing scoped storage: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2 = 99
            r9.onProgress(r2, r0)
        Lc9:
            java.lang.String r3 = r1.getName()
            r0 = r17
            r2 = r19
            r5 = r13
            r16 = r6
            r6 = r14
            copyLocalFileToDocument(r0, r1, r2, r3, r4, r5, r6)
        Ld8:
            int r6 = r16 + 1
            goto L5c
        Ldb:
            return
    }

    private static void copyLocalFileToDocument(android.content.Context r7, java.io.File r8, android.net.Uri r9, java.lang.String r10, java.lang.String r11) throws java.lang.Exception {
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            copyLocalFileToDocument(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    private static void copyLocalFileToDocument(android.content.Context r15, java.io.File r16, android.net.Uri r17, java.lang.String r18, java.lang.String r19, java.util.HashMap<java.lang.String, android.net.Uri> r20, java.util.HashMap<java.lang.String, java.lang.Long> r21) throws java.lang.Exception {
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            java.lang.String r4 = "Unable to open SAF output: "
            if (r2 == 0) goto L14
            java.lang.Object r5 = r2.get(r1)
            android.net.Uri r5 = (android.net.Uri) r5
            r12 = r15
            goto L1a
        L14:
            r5 = 0
            r12 = r15
            android.net.Uri r5 = findChild(r15, r0, r1, r5)
        L1a:
            r13 = -1
            if (r5 == 0) goto L44
            if (r3 == 0) goto L36
            boolean r6 = r3.containsKey(r1)
            if (r6 == 0) goto L36
            java.lang.Object r6 = r3.get(r1)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto L30
            r6 = r13
            goto L34
        L30:
            long r6 = r6.longValue()
        L34:
            r9 = r6
            goto L37
        L36:
            r9 = r13
        L37:
            r6 = r15
            r7 = r16
            r8 = r5
            r11 = r19
            boolean r6 = shouldSkipExistingSafWrite(r6, r7, r8, r9, r11)
            if (r6 == 0) goto L44
            return
        L44:
            if (r5 != 0) goto L60
            android.content.ContentResolver r5 = r15.getContentResolver()
            java.lang.String r6 = "application/octet-stream"
            android.net.Uri r5 = android.provider.DocumentsContract.createDocument(r5, r0, r6, r1)
            if (r5 == 0) goto L60
            if (r2 == 0) goto L60
            r2.put(r1, r5)
            if (r3 == 0) goto L60
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r3.put(r1, r0)
        L60:
            if (r5 == 0) goto Laf
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r0 = r16
            r2.<init>(r0)
            android.content.ContentResolver r0 = r15.getContentResolver()     // Catch: java.lang.Throwable -> La3
            java.lang.String r3 = "wt"
            java.io.OutputStream r3 = r0.openOutputStream(r5, r3)     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L84
            copy(r2, r3)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.lang.Throwable -> La3
        L7d:
            r2.close()
            return
        L81:
            r0 = move-exception
            r1 = r0
            goto L97
        L84:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r1 = r5.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L81
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L81
        L97:
            if (r3 == 0) goto La2
            r3.close()     // Catch: java.lang.Throwable -> L9d
            goto La2
        L9d:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch: java.lang.Throwable -> La3
        La2:
            throw r1     // Catch: java.lang.Throwable -> La3
        La3:
            r0 = move-exception
            r1 = r0
            r2.close()     // Catch: java.lang.Throwable -> La9
            goto Lae
        La9:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        Lae:
            throw r1
        Laf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create SAF file: "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static void copyLocalLauncherHomeToTree(android.content.Context r2, java.io.File r3, android.net.Uri r4, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r5) throws java.lang.Exception {
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L7
            return
        L7:
            android.net.Uri r4 = getRootDocumentUri(r4)
            if (r4 == 0) goto L1a
            if (r5 == 0) goto L16
            r0 = 98
            java.lang.String r1 = "Syncing scoped storage..."
            r5.onProgress(r0, r1)
        L16:
            copyLocalDirectoryToDocument(r2, r3, r4, r5, r3)
            return
        L1a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unable to resolve scoped storage root."
            r2.<init>(r3)
            throw r2
    }

    public static void copyRelativePathToLocalLauncherHome(android.content.Context r6, android.net.Uri r7, java.io.File r8, java.lang.String r9, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r10) throws java.lang.Exception {
            android.net.Uri r7 = getRootDocumentUri(r7)
            if (r7 != 0) goto L7
            return
        L7:
            java.lang.String r5 = cleanRelativePath(r9)
            boolean r9 = r5.isEmpty()
            if (r9 == 0) goto L17
            java.lang.String r9 = ""
            copyDocumentDirectoryToLocal(r6, r7, r8, r10, r9)
            return
        L17:
            android.net.Uri r1 = findDescendant(r6, r7, r5)
            if (r1 != 0) goto L32
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Scoped relative restore target not found: "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "SafMinecraftMirror"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
        L32:
            java.io.File r2 = new java.io.File
            r7 = 47
            char r9 = java.io.File.separatorChar
            java.lang.String r7 = r5.replace(r7, r9)
            r2.<init>(r8, r7)
            boolean r7 = isDirectory(r6, r1)
            if (r7 == 0) goto L49
            copyDocumentDirectoryToLocal(r6, r1, r2, r10, r5)
            goto L66
        L49:
            if (r10 == 0) goto L5e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Reading scoped storage: "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r8 = 3
            r10.onProgress(r8, r7)
        L5e:
            long r3 = queryDocumentSize(r6, r1)
            r0 = r6
            copyDocumentFileToLocal(r0, r1, r2, r3, r5)
        L66:
            return
    }

    public static void copyTreeMetadataToLocalLauncherHome(android.content.Context r2, android.net.Uri r3, java.io.File r4, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r5) throws java.lang.Exception {
            android.net.Uri r3 = getRootDocumentUri(r3)
            if (r3 != 0) goto L7
            return
        L7:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L2d
            boolean r0 = r4.mkdirs()
            if (r0 == 0) goto L14
            goto L2d
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to create scoped storage metadata mirror: "
            r3.<init>(r5)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2d:
            if (r5 == 0) goto L35
            r0 = 2
            java.lang.String r1 = "Reading launcher metadata..."
            r5.onProgress(r0, r1)
        L35:
            java.lang.String r0 = ""
            copyDocumentMetadataToLocal(r2, r3, r4, r5, r0)
            return
    }

    public static void copyTreeToLocalLauncherHome(android.content.Context r2, android.net.Uri r3, java.io.File r4, ca.dnamobile.javalauncher.storage.SafMinecraftMirror.Progress r5) throws java.lang.Exception {
            android.net.Uri r3 = getRootDocumentUri(r3)
            if (r3 != 0) goto L7
            return
        L7:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L2d
            boolean r0 = r4.mkdirs()
            if (r0 == 0) goto L14
            goto L2d
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to create scoped storage mirror: "
            r3.<init>(r5)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2d:
            if (r5 == 0) goto L35
            r0 = 2
            java.lang.String r1 = "Reading scoped storage mirror..."
            r5.onProgress(r0, r1)
        L35:
            java.lang.String r0 = ""
            copyDocumentDirectoryToLocal(r2, r3, r4, r5, r0)
            return
    }

    private static boolean deleteDocumentFast(android.content.Context r1, android.net.Uri r2) {
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L9
            boolean r1 = android.provider.DocumentsContract.deleteDocument(r1, r2)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Fast SAF delete failed, falling back to recursive delete: "
            r2.<init>(r0)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SafMinecraftMirror"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
            r1 = 0
            return r1
    }

    private static void deleteDocumentRecursively(android.content.Context r2, android.net.Uri r3) throws java.lang.Exception {
            boolean r0 = isDirectory(r2, r3)
            if (r0 == 0) goto L20
            java.util.ArrayList r0 = listChildren(r2, r3)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror$DocumentEntry r1 = (ca.dnamobile.javalauncher.storage.SafMinecraftMirror.DocumentEntry) r1
            android.net.Uri r1 = r1.uri
            deleteDocumentRecursively(r2, r1)
            goto Le
        L20:
            android.content.ContentResolver r2 = r2.getContentResolver()
            boolean r2 = android.provider.DocumentsContract.deleteDocument(r2, r3)
            if (r2 == 0) goto L2b
            return
        L2b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to delete SAF document: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static boolean deleteRelativePathFromTree(android.content.Context r3, android.net.Uri r4, java.lang.String r5) throws java.lang.Exception {
            android.net.Uri r4 = getRootDocumentUri(r4)
            if (r4 == 0) goto L56
            android.net.Uri r4 = findDescendant(r3, r4, r5)
            java.lang.String r0 = "SafMinecraftMirror"
            if (r4 != 0) goto L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Scoped delete target not found: "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)
            r3 = 0
            return r3
        L22:
            java.lang.String r5 = cleanRelativePath(r5)
            boolean r1 = deleteDocumentFast(r3, r4)
            r2 = 1
            if (r1 == 0) goto L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Deleted scoped storage path: "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)
            return r2
        L40:
            deleteDocumentRecursively(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Deleted scoped storage path recursively: "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)
            return r2
        L56:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to resolve scoped storage root."
            r3.<init>(r4)
            throw r3
    }

    private static android.net.Uri ensureDirectory(android.content.Context r1, android.net.Uri r2, java.lang.String r3) throws java.lang.Exception {
            r0 = 0
            android.net.Uri r1 = ensureDirectory(r1, r2, r3, r0)
            return r1
    }

    private static android.net.Uri ensureDirectory(android.content.Context r1, android.net.Uri r2, java.lang.String r3, java.util.HashMap<java.lang.String, android.net.Uri> r4) throws java.lang.Exception {
            if (r4 == 0) goto L9
            java.lang.Object r0 = r4.get(r3)
            android.net.Uri r0 = (android.net.Uri) r0
            goto Le
        L9:
            r0 = 1
            android.net.Uri r0 = findChild(r1, r2, r3, r0)
        Le:
            if (r0 == 0) goto L11
            return r0
        L11:
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = "vnd.android.document/directory"
            android.net.Uri r1 = android.provider.DocumentsContract.createDocument(r1, r2, r0, r3)
            if (r1 == 0) goto L23
            if (r4 == 0) goto L22
            r4.put(r3, r1)
        L22:
            return r1
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to create SAF directory: "
            r2.<init>(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static android.net.Uri findChild(android.content.Context r1, android.net.Uri r2, java.lang.String r3, boolean r4) {
            java.util.ArrayList r1 = listChildren(r1, r2)     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        L8:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror$DocumentEntry r2 = (ca.dnamobile.javalauncher.storage.SafMinecraftMirror.DocumentEntry) r2     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r2.displayName     // Catch: java.lang.Throwable -> L23
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L8
            boolean r0 = r2.directory     // Catch: java.lang.Throwable -> L23
            if (r0 != r4) goto L8
            android.net.Uri r1 = r2.uri     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "findChild failed: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SafMinecraftMirror"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
        L3c:
            r1 = 0
            return r1
    }

    private static android.net.Uri findChildAny(android.content.Context r1, android.net.Uri r2, java.lang.String r3) {
            java.util.ArrayList r1 = listChildren(r1, r2)     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
        L8:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1f
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror$DocumentEntry r2 = (ca.dnamobile.javalauncher.storage.SafMinecraftMirror.DocumentEntry) r2     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r2.displayName     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L8
            android.net.Uri r1 = r2.uri     // Catch: java.lang.Throwable -> L1f
            return r1
        L1f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "findChildAny failed: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SafMinecraftMirror"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)
        L38:
            r1 = 0
            return r1
    }

    private static android.net.Uri findDescendant(android.content.Context r4, android.net.Uri r5, java.lang.String r6) throws java.lang.Exception {
            r0 = 92
            r1 = 47
            java.lang.String r6 = r6.replace(r0, r1)
            java.lang.String r6 = r6.trim()
        Lc:
            java.lang.String r0 = "/"
            boolean r1 = r6.startsWith(r0)
            r2 = 1
            if (r1 == 0) goto L1a
            java.lang.String r6 = r6.substring(r2)
            goto Lc
        L1a:
            boolean r1 = r6.endsWith(r0)
            r3 = 0
            if (r1 == 0) goto L2b
            int r1 = r6.length()
            int r1 = r1 - r2
            java.lang.String r6 = r6.substring(r3, r1)
            goto L1a
        L2b:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L32
            return r5
        L32:
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
        L37:
            if (r3 >= r0) goto L5e
            r1 = r6[r3]
            if (r1 != 0) goto L40
            java.lang.String r1 = ""
            goto L44
        L40:
            java.lang.String r1 = r1.trim()
        L44:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5b
            java.lang.String r2 = "."
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L53
            goto L5b
        L53:
            android.net.Uri r5 = findChildAny(r4, r5, r1)
            if (r5 != 0) goto L5b
            r4 = 0
            return r4
        L5b:
            int r3 = r3 + 1
            goto L37
        L5e:
            return r5
    }

    public static android.net.Uri findRelativePathInTree(android.content.Context r2, android.net.Uri r3, java.lang.String r4) {
            r0 = 0
            android.net.Uri r3 = getRootDocumentUri(r3)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L8
            return r0
        L8:
            if (r4 != 0) goto Ld
            java.lang.String r1 = ""
            goto L11
        Ld:
            java.lang.String r1 = cleanRelativePath(r4)     // Catch: java.lang.Throwable -> L16
        L11:
            android.net.Uri r2 = findDescendant(r2, r3, r1)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to resolve SAF relative path "
            r3.<init>(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "SafMinecraftMirror"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r3, r2)
            return r0
    }

    private static android.net.Uri getRootDocumentUri(android.net.Uri r2) {
            java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r2)     // Catch: java.lang.Throwable -> L9
            android.net.Uri r2 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r2, r0)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to build root document URI: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "SafMinecraftMirror"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r2)
            r2 = 0
            return r2
    }

    private static boolean isDirectory(android.content.Context r7, android.net.Uri r8) {
            android.content.ContentResolver r0 = r7.getContentResolver()
            r7 = 1
            r6 = 0
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r7 = "mime_type"
            r2[r6] = r7     // Catch: java.lang.Throwable -> L3f
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r8
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L3f
            if (r7 == 0) goto L39
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L2d
            if (r8 != 0) goto L1d
            goto L39
        L1d:
            java.lang.String r8 = r7.getString(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "vnd.android.document/directory"
            boolean r8 = r0.equals(r8)     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L2c
            r7.close()     // Catch: java.lang.Throwable -> L3f
        L2c:
            return r8
        L2d:
            r8 = move-exception
            if (r7 == 0) goto L38
            r7.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> L3f
        L38:
            throw r8     // Catch: java.lang.Throwable -> L3f
        L39:
            if (r7 == 0) goto L3e
            r7.close()     // Catch: java.lang.Throwable -> L3f
        L3e:
            return r6
        L3f:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to inspect SAF document type: "
            r8.<init>(r0)
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "SafMinecraftMirror"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r7)
            return r6
    }

    private static boolean isImmutableMinecraftPayload(java.lang.String r3) {
            java.lang.String r3 = cleanRelativePath(r3)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = ".minecraft"
            boolean r0 = r3.equals(r0)
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            java.lang.String r0 = ".minecraft/"
            boolean r2 = r3.startsWith(r0)
            if (r2 == 0) goto L24
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
        L24:
            java.lang.String r0 = "assets/objects/"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "libraries/"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "versions/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L45
            java.lang.String r0 = ".jar"
            boolean r3 = r3.endsWith(r0)
            if (r3 == 0) goto L45
        L44:
            r1 = 1
        L45:
            return r1
    }

    static /* synthetic */ int lambda$copyLocalDirectoryToDocument$0(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    private static java.util.ArrayList<ca.dnamobile.javalauncher.storage.SafMinecraftMirror.DocumentEntry> listChildren(android.content.Context r18, android.net.Uri r19) throws java.lang.Exception {
            r0 = r19
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.ContentResolver r2 = r18.getContentResolver()
            java.lang.String r3 = android.provider.DocumentsContract.getDocumentId(r19)
            android.net.Uri r3 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r3)
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = "document_id"
            r8 = 0
            r4[r8] = r5
            java.lang.String r5 = "_display_name"
            r9 = 1
            r4[r9] = r5
            java.lang.String r5 = "mime_type"
            r10 = 2
            r4[r10] = r5
            java.lang.String r5 = "_size"
            r11 = 3
            r4[r11] = r5
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L39
            if (r2 == 0) goto L38
            r2.close()
        L38:
            return r1
        L39:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L73
            java.lang.String r3 = r2.getString(r8)     // Catch: java.lang.Throwable -> L79
            java.lang.String r14 = r2.getString(r9)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r2.getString(r10)     // Catch: java.lang.Throwable -> L79
            boolean r5 = r2.isNull(r11)     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L54
            r5 = -1
            goto L58
        L54:
            long r5 = r2.getLong(r11)     // Catch: java.lang.Throwable -> L79
        L58:
            r16 = r5
            if (r3 == 0) goto L39
            if (r14 != 0) goto L5f
            goto L39
        L5f:
            android.net.Uri r13 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r0, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "vnd.android.document/directory"
            boolean r15 = r3.equals(r4)     // Catch: java.lang.Throwable -> L79
            ca.dnamobile.javalauncher.storage.SafMinecraftMirror$DocumentEntry r3 = new ca.dnamobile.javalauncher.storage.SafMinecraftMirror$DocumentEntry     // Catch: java.lang.Throwable -> L79
            r12 = r3
            r12.<init>(r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L79
            r1.add(r3)     // Catch: java.lang.Throwable -> L79
            goto L39
        L73:
            if (r2 == 0) goto L78
            r2.close()
        L78:
            return r1
        L79:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto L86
            r2.close()     // Catch: java.lang.Throwable -> L81
            goto L86
        L81:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L86:
            throw r1
    }

    private static java.lang.String normalizeMetadataPath(java.lang.String r2) {
            java.lang.String r2 = cleanRelativePath(r2)
            java.lang.String r0 = ".minecraft"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r2 = ""
            return r2
        Lf:
            java.lang.String r0 = ".minecraft/"
            boolean r1 = r2.startsWith(r0)
            if (r1 == 0) goto L1f
            int r0 = r0.length()
            java.lang.String r2 = r2.substring(r0)
        L1f:
            return r2
    }

    private static long queryDocumentSize(android.content.Context r9, android.net.Uri r10) {
            r0 = -1
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L43
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L43
            java.lang.String r9 = "_size"
            r8 = 0
            r4[r8] = r9     // Catch: java.lang.Throwable -> L43
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r10
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L3d
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L31
            if (r10 != 0) goto L1f
            goto L3d
        L1f:
            boolean r10 = r9.isNull(r8)     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L27
            r2 = r0
            goto L2b
        L27:
            long r2 = r9.getLong(r8)     // Catch: java.lang.Throwable -> L31
        L2b:
            if (r9 == 0) goto L30
            r9.close()     // Catch: java.lang.Throwable -> L43
        L30:
            return r2
        L31:
            r10 = move-exception
            if (r9 == 0) goto L3c
            r9.close()     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch: java.lang.Throwable -> L43
        L3c:
            throw r10     // Catch: java.lang.Throwable -> L43
        L3d:
            if (r9 == 0) goto L42
            r9.close()     // Catch: java.lang.Throwable -> L43
        L42:
            return r0
        L43:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to read SAF document size: "
            r10.<init>(r2)
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "SafMinecraftMirror"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r10, r9)
            return r0
    }

    private static java.lang.String relativePath(java.io.File r2, java.io.File r3) {
            java.lang.String r2 = r2.getCanonicalPath()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L25
            boolean r1 = r0.startsWith(r2)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L25
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r0.substring(r2)     // Catch: java.lang.Throwable -> L25
        L16:
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Throwable -> L25
            boolean r0 = r2.startsWith(r0)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L24
            r0 = 1
            java.lang.String r2 = r2.substring(r0)     // Catch: java.lang.Throwable -> L25
            goto L16
        L24:
            return r2
        L25:
            java.lang.String r2 = r3.getName()
            return r2
    }

    private static boolean shouldCopyLauncherMetadataFile(java.lang.String r7) {
            java.lang.String r0 = "launcher_profiles.json"
            boolean r0 = r7.equals(r0)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = "/"
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            java.lang.String r2 = "instances"
            r3 = 2
            r4 = 3
            r5 = 0
            if (r0 != r4) goto L2b
            r0 = r7[r5]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "instance.json"
            r6 = r7[r3]
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L2b
            return r1
        L2b:
            int r0 = r7.length
            if (r0 != r4) goto L41
            r0 = r7[r5]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L41
            r0 = r7[r3]
            java.lang.String r6 = "icon"
            boolean r0 = r0.startsWith(r6)
            if (r0 == 0) goto L41
            return r1
        L41:
            int r0 = r7.length
            r6 = 4
            if (r0 != r6) goto L62
            r0 = r7[r5]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L62
            java.lang.String r0 = "game"
            r2 = r7[r3]
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L62
            java.lang.String r0 = "options.txt"
            r2 = r7[r4]
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L62
            return r1
        L62:
            int r0 = r7.length
            if (r0 != r4) goto L7a
            java.lang.String r0 = "versions"
            r2 = r7[r5]
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7a
            r7 = r7[r3]
            java.lang.String r0 = ".json"
            boolean r7 = r7.endsWith(r0)
            if (r7 == 0) goto L7a
            goto L7b
        L7a:
            r1 = r5
        L7b:
            return r1
    }

    private static boolean shouldDescendForLauncherMetadata(java.lang.String r5) {
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "/"
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            if (r0 != 0) goto L12
            return r1
        L12:
            java.lang.String r0 = "instances"
            r2 = 0
            r3 = r5[r2]
            boolean r0 = r0.equals(r3)
            r3 = 2
            if (r0 == 0) goto L33
            int r0 = r5.length
            if (r0 > r3) goto L22
            return r1
        L22:
            int r0 = r5.length
            r4 = 3
            if (r0 != r4) goto L31
            java.lang.String r0 = "game"
            r5 = r5[r3]
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            return r1
        L33:
            java.lang.String r0 = "versions"
            r4 = r5[r2]
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L43
            int r5 = r5.length
            if (r5 > r3) goto L41
            goto L42
        L41:
            r1 = r2
        L42:
            return r1
        L43:
            java.lang.String r0 = ".minecraft"
            r5 = r5[r2]
            boolean r5 = r0.equals(r5)
            return r5
    }

    private static boolean shouldSkipExistingLocalWrite(java.io.File r2, long r3, java.lang.String r5) {
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L1c
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L1c
            long r0 = r2.length()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L1c
            boolean r2 = isImmutableMinecraftPayload(r5)
            if (r2 == 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    private static boolean shouldSkipExistingSafWrite(android.content.Context r5, java.io.File r6, android.net.Uri r7, long r8, java.lang.String r10) {
            boolean r10 = isImmutableMinecraftPayload(r10)
            r0 = 0
            if (r10 != 0) goto L8
            return r0
        L8:
            long r1 = r6.length()
            r3 = 0
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 < 0) goto L13
            goto L17
        L13:
            long r8 = queryDocumentSize(r5, r7)
        L17:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L20
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 != 0) goto L20
            r0 = 1
        L20:
            return r0
    }
}
