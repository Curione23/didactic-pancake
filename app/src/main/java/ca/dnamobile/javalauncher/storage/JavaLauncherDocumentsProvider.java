package ca.dnamobile.javalauncher.storage;

/* JADX INFO: loaded from: classes.dex */
public class JavaLauncherDocumentsProvider extends android.provider.DocumentsProvider {
    public static final java.lang.String AUTHORITY_SUFFIX = ".documents";
    private static final java.lang.String[] DEFAULT_DOCUMENT_PROJECTION = null;
    private static final java.lang.String[] DEFAULT_ROOT_PROJECTION = null;
    public static final java.lang.String ROOT_DOCUMENT_ID = "root";
    public static final java.lang.String ROOT_ID = "javalauncher_root";

    static {
            r0 = 6
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "root_id"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "document_id"
            r1[r2] = r4
            java.lang.String r5 = "title"
            r6 = 2
            r1[r6] = r5
            r5 = 3
            java.lang.String r7 = "flags"
            r1[r5] = r7
            java.lang.String r8 = "icon"
            r9 = 4
            r1[r9] = r8
            java.lang.String r8 = "available_bytes"
            r10 = 5
            r1[r10] = r8
            ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.DEFAULT_ROOT_PROJECTION = r1
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r3] = r4
            java.lang.String r1 = "_display_name"
            r0[r2] = r1
            java.lang.String r1 = "mime_type"
            r0[r6] = r1
            r0[r5] = r7
            java.lang.String r1 = "_size"
            r0[r9] = r1
            java.lang.String r1 = "last_modified"
            r0[r10] = r1
            ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.DEFAULT_DOCUMENT_PROJECTION = r0
            return
    }

    public JavaLauncherDocumentsProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.ArrayList<java.lang.String> buildDocumentIdPathFromParent(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.ArrayList r0 = r2.buildDocumentIdPathFromRoot(r4)
            java.lang.String r3 = r2.normalizeDocumentId(r3)
            int r1 = r0.indexOf(r3)
            if (r1 >= 0) goto L24
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r3)
            java.lang.String r4 = r2.normalizeDocumentId(r4)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L23
            r0.add(r4)
        L23:
            return r0
        L24:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            java.util.List r4 = r0.subList(r1, r4)
            r3.<init>(r4)
            return r3
    }

    private java.util.ArrayList<java.lang.String> buildDocumentIdPathFromRoot(java.lang.String r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "root"
            r0.add(r1)
            boolean r2 = r1.equals(r8)
            if (r2 == 0) goto L11
            return r0
        L11:
            java.lang.String r8 = r7.normalizeDocumentId(r8)
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L1c
            return r0
        L1c:
            r1 = 92
            r2 = 47
            java.lang.String r8 = r8.replace(r1, r2)
            java.lang.String r1 = "/"
            java.lang.String[] r8 = r8.split(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r8.length
            r4 = 0
        L31:
            if (r4 >= r3) goto L52
            r5 = r8[r4]
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L3c
            goto L4f
        L3c:
            int r6 = r1.length()
            if (r6 <= 0) goto L45
            r1.append(r2)
        L45:
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.add(r5)
        L4f:
            int r4 = r4 + 1
            goto L31
        L52:
            return r0
    }

    public static android.net.Uri buildDocumentUriForFile(android.content.Context r1, java.io.File r2) {
            java.lang.String r0 = getAuthority(r1)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = getDocumentIdForFile(r1, r2)     // Catch: java.lang.Throwable -> Ld
            android.net.Uri r1 = android.provider.DocumentsContract.buildDocumentUri(r0, r1)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static android.net.Uri buildRootUri(android.content.Context r1) {
            java.lang.String r1 = getAuthority(r1)
            java.lang.String r0 = "javalauncher_root"
            android.net.Uri r1 = android.provider.DocumentsContract.buildRootUri(r1, r0)
            return r1
    }

    public static android.net.Uri buildTreeUriForFile(android.content.Context r1, java.io.File r2) {
            java.lang.String r0 = getAuthority(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = getDocumentIdForFile(r1, r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "root"
            android.net.Uri r2 = android.provider.DocumentsContract.buildTreeDocumentUri(r0, r2)     // Catch: java.lang.Throwable -> L13
            android.net.Uri r1 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r2, r1)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = 0
            return r1
    }

    private java.io.File buildUniqueFile(java.io.File r6, java.lang.String r7, boolean r8) {
            r5 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r6, r7)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            if (r8 != 0) goto L22
            r8 = 46
            int r8 = r7.lastIndexOf(r8)
            if (r8 <= 0) goto L22
            r0 = 0
            java.lang.String r0 = r7.substring(r0, r8)
            java.lang.String r7 = r7.substring(r8)
            r8 = r7
            r7 = r0
            goto L24
        L22:
            java.lang.String r8 = ""
        L24:
            r0 = 1
            r1 = r0
        L26:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = " ("
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = ")"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.<init>(r6, r3)
            int r1 = r1 + r0
            boolean r3 = r2.exists()
            if (r3 != 0) goto L26
            return r2
    }

    private void deleteRecursively(java.io.File r5) throws java.io.FileNotFoundException {
            r4 = this;
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L18
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto L18
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            r4.deleteRecursively(r3)
            int r2 = r2 + 1
            goto Le
        L18:
            boolean r0 = r5.exists()
            if (r0 == 0) goto L3e
            boolean r0 = r5.delete()
            if (r0 == 0) goto L25
            goto L3e
        L25:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to delete: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L3e:
            return
    }

    public static java.lang.String getAuthority(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getPackageName()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = ".documents"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String getDocumentIdForFile(android.content.Context r4, java.io.File r5) throws java.io.FileNotFoundException {
            java.lang.String r0 = "File is outside launcher document root: "
            java.io.File r4 = getRootDirectoryForContext(r4)     // Catch: java.io.IOException -> L5a
            java.io.File r4 = r4.getCanonicalFile()     // Catch: java.io.IOException -> L5a
            java.io.File r1 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L5a
            boolean r2 = r4.equals(r1)     // Catch: java.io.IOException -> L5a
            if (r2 == 0) goto L17
            java.lang.String r4 = "root"
            return r4
        L17:
            java.lang.String r4 = r4.getPath()     // Catch: java.io.IOException -> L5a
            java.lang.String r1 = r1.getPath()     // Catch: java.io.IOException -> L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5a
            r2.<init>()     // Catch: java.io.IOException -> L5a
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.io.IOException -> L5a
            java.lang.String r3 = java.io.File.separator     // Catch: java.io.IOException -> L5a
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.io.IOException -> L5a
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L5a
            boolean r2 = r1.startsWith(r2)     // Catch: java.io.IOException -> L5a
            if (r2 == 0) goto L43
            int r4 = r4.length()     // Catch: java.io.IOException -> L5a
            int r4 = r4 + 1
            java.lang.String r4 = r1.substring(r4)     // Catch: java.io.IOException -> L5a
            return r4
        L43:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch: java.io.IOException -> L5a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5a
            r1.<init>(r0)     // Catch: java.io.IOException -> L5a
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.io.IOException -> L5a
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.io.IOException -> L5a
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L5a
            r4.<init>(r5)     // Catch: java.io.IOException -> L5a
            throw r4     // Catch: java.io.IOException -> L5a
        L5a:
            r4 = move-exception
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r0 = r4.getMessage()
            r5.<init>(r0)
            r5.initCause(r4)
            throw r5
    }

    private java.lang.String getDocumentIdForFile(java.io.File r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto Lb
            java.lang.String r2 = getDocumentIdForFile(r0, r2)     // Catch: java.io.FileNotFoundException -> Lb
            return r2
        Lb:
            java.lang.String r2 = r2.getName()
            return r2
    }

    private java.io.File getFileForDocumentId(java.lang.String r6) throws java.io.FileNotFoundException {
            r5 = this;
            java.lang.String r0 = "Invalid document path: "
            java.io.File r1 = r5.getRootDirectory()
            java.lang.String r2 = "root"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto Lf
            return r1
        Lf:
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L58
            r2.<init>(r1, r6)     // Catch: java.io.IOException -> L58
            java.io.File r2 = r2.getCanonicalFile()     // Catch: java.io.IOException -> L58
            java.io.File r1 = r1.getCanonicalFile()     // Catch: java.io.IOException -> L58
            java.lang.String r1 = r1.getPath()     // Catch: java.io.IOException -> L58
            java.lang.String r3 = r2.getPath()     // Catch: java.io.IOException -> L58
            boolean r4 = r3.equals(r1)     // Catch: java.io.IOException -> L58
            if (r4 != 0) goto L57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L58
            r4.<init>()     // Catch: java.io.IOException -> L58
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch: java.io.IOException -> L58
            java.lang.String r4 = java.io.File.separator     // Catch: java.io.IOException -> L58
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.io.IOException -> L58
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L58
            boolean r1 = r3.startsWith(r1)     // Catch: java.io.IOException -> L58
            if (r1 == 0) goto L44
            goto L57
        L44:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.IOException -> L58
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L58
            r2.<init>(r0)     // Catch: java.io.IOException -> L58
            java.lang.StringBuilder r6 = r2.append(r6)     // Catch: java.io.IOException -> L58
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L58
            r1.<init>(r6)     // Catch: java.io.IOException -> L58
            throw r1     // Catch: java.io.IOException -> L58
        L57:
            return r2
        L58:
            r6 = move-exception
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = r6.getMessage()
            r0.<init>(r1)
            r0.initCause(r6)
            throw r0
    }

    private java.lang.String getLauncherTitle() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "JavaLauncher"
            if (r0 != 0) goto L9
            return r1
        L9:
            int r2 = ca.dnamobile.javalauncher.R.string.app_name     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    private java.lang.String getMimeType(java.io.File r3) {
            r2 = this;
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L9
            java.lang.String r3 = "vnd.android.document/directory"
            return r3
        L9:
            java.lang.String r3 = r3.getName()
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            if (r0 < 0) goto L38
            int r1 = r3.length()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L38
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L38
            return r3
        L38:
            java.lang.String r3 = "application/octet-stream"
            return r3
    }

    private java.io.File getRootDirectory() throws java.io.FileNotFoundException {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto Lb
            java.io.File r0 = getRootDirectoryForContext(r0)
            return r0
        Lb:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "Provider context is null"
            r0.<init>(r1)
            throw r0
    }

    public static java.io.File getRootDirectoryForContext(android.content.Context r3) throws java.io.FileNotFoundException {
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.getDefaultLauncherHome(r3)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L2a
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L11
            goto L2a
        L11:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create launcher home: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2a:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".minecraft"
            r0.<init>(r3, r1)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L57
            boolean r3 = r0.mkdirs()
            if (r3 == 0) goto L3e
            goto L57
        L3e:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create .minecraft folder: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L57:
            return r0
    }

    private void includeFile(android.database.MatrixCursor r4, java.lang.String r5, java.io.File r6) {
            r3 = this;
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L9
            r0 = 8
            goto La
        L9:
            r0 = 0
        La:
            boolean r1 = r6.canWrite()
            java.lang.String r2 = "root"
            if (r1 == 0) goto L1a
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L1a
            r0 = r0 | 68
        L1a:
            boolean r1 = r6.isFile()
            if (r1 == 0) goto L28
            boolean r1 = r6.canWrite()
            if (r1 == 0) goto L28
            r0 = r0 | 2
        L28:
            android.database.MatrixCursor$RowBuilder r4 = r4.newRow()
            java.lang.String r1 = "document_id"
            r4.add(r1, r5)
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3c
            java.lang.String r5 = r3.getLauncherTitle()
            goto L40
        L3c:
            java.lang.String r5 = r6.getName()
        L40:
            java.lang.String r1 = "_display_name"
            r4.add(r1, r5)
            java.lang.String r5 = "mime_type"
            java.lang.String r1 = r3.getMimeType(r6)
            r4.add(r5, r1)
            java.lang.String r5 = "flags"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r5, r0)
            boolean r5 = r6.isFile()
            if (r5 == 0) goto L62
            long r0 = r6.length()
            goto L64
        L62:
            r0 = 0
        L64:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "_size"
            r4.add(r0, r5)
            long r5 = r6.lastModified()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "last_modified"
            r4.add(r6, r5)
            return
    }

    private boolean isSameOrChild(java.io.File r3, java.io.File r4) {
            r2 = this;
            r0 = 0
            java.io.File r3 = r3.getCanonicalFile()     // Catch: java.io.IOException -> L31
            java.io.File r4 = r4.getCanonicalFile()     // Catch: java.io.IOException -> L31
            java.lang.String r3 = r3.getPath()     // Catch: java.io.IOException -> L31
            java.lang.String r4 = r4.getPath()     // Catch: java.io.IOException -> L31
            boolean r1 = r4.equals(r3)     // Catch: java.io.IOException -> L31
            if (r1 != 0) goto L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L31
            r1.<init>()     // Catch: java.io.IOException -> L31
            java.lang.StringBuilder r3 = r1.append(r3)     // Catch: java.io.IOException -> L31
            java.lang.String r1 = java.io.File.separator     // Catch: java.io.IOException -> L31
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.io.IOException -> L31
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L31
            boolean r3 = r4.startsWith(r3)     // Catch: java.io.IOException -> L31
            if (r3 == 0) goto L31
        L30:
            r0 = 1
        L31:
            return r0
    }

    private java.lang.String normalizeDocumentId(java.lang.String r6) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = "root"
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r6 = r6.trim()
            r0 = 92
            r2 = 47
            java.lang.String r6 = r6.replace(r0, r2)
        L15:
            java.lang.String r0 = "/"
            boolean r2 = r6.startsWith(r0)
            r3 = 1
            if (r2 == 0) goto L23
            java.lang.String r6 = r6.substring(r3)
            goto L15
        L23:
            boolean r2 = r6.endsWith(r0)
            if (r2 == 0) goto L3a
            int r2 = r6.length()
            if (r2 <= r3) goto L3a
            int r2 = r6.length()
            int r2 = r2 - r3
            r4 = 0
            java.lang.String r6 = r6.substring(r4, r2)
            goto L23
        L3a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L41
            goto L42
        L41:
            r1 = r6
        L42:
            return r1
    }

    private int parseMode(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "w"
            boolean r0 = r4.contains(r0)
            java.lang.String r1 = "t"
            boolean r1 = r4.contains(r1)
            java.lang.String r2 = "a"
            boolean r4 = r4.contains(r2)
            if (r0 == 0) goto L21
            if (r1 == 0) goto L19
            r0 = 1006632960(0x3c000000, float:0.0078125)
            goto L1b
        L19:
            r0 = 939524096(0x38000000, float:3.0517578E-5)
        L1b:
            if (r4 == 0) goto L20
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r4
        L20:
            return r0
        L21:
            r4 = 268435456(0x10000000, float:2.524355E-29)
            return r4
    }

    private java.lang.String[] resolveDocumentProjection(java.lang.String[] r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String[] r1 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.DEFAULT_DOCUMENT_PROJECTION
        L5:
            return r1
    }

    private java.lang.String[] resolveRootProjection(java.lang.String[] r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String[] r1 = ca.dnamobile.javalauncher.storage.JavaLauncherDocumentsProvider.DEFAULT_ROOT_PROJECTION
        L5:
            return r1
    }

    private void searchRecursively(android.database.MatrixCursor r7, java.io.File r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = 8
            if (r10 > r0) goto L46
            int r0 = r7.getCount()
            r1 = 50
            if (r0 < r1) goto Ld
            goto L46
        Ld:
            java.io.File[] r8 = r8.listFiles()
            if (r8 != 0) goto L14
            return
        L14:
            int r0 = r8.length
            r2 = 0
        L16:
            if (r2 >= r0) goto L46
            r3 = r8[r2]
            java.lang.String r4 = r3.getName()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            boolean r4 = r4.contains(r9)
            if (r4 == 0) goto L31
            java.lang.String r4 = r6.getDocumentIdForFile(r3)
            r6.includeFile(r7, r4, r3)
        L31:
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L3c
            int r4 = r10 + 1
            r6.searchRecursively(r7, r3, r9, r4)
        L3c:
            int r3 = r7.getCount()
            if (r3 < r1) goto L43
            return
        L43:
            int r2 = r2 + 1
            goto L16
        L46:
            return
    }

    @Override // android.provider.DocumentsProvider
    public java.lang.String createDocument(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.io.FileNotFoundException {
            r2 = this;
            java.io.File r0 = r2.getFileForDocumentId(r3)
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L5f
            java.lang.String r3 = "vnd.android.document/directory"
            boolean r1 = r3.equals(r4)
            java.io.File r5 = r2.buildUniqueFile(r0, r5, r1)
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L51
            if (r3 == 0) goto L2f
            boolean r3 = r5.mkdirs()     // Catch: java.io.IOException -> L51
            if (r3 != 0) goto L44
            boolean r3 = r5.isDirectory()     // Catch: java.io.IOException -> L51
            if (r3 == 0) goto L27
            goto L44
        L27:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.io.IOException -> L51
            java.lang.String r4 = "Unable to create directory"
            r3.<init>(r4)     // Catch: java.io.IOException -> L51
            throw r3     // Catch: java.io.IOException -> L51
        L2f:
            java.io.File r3 = r5.getParentFile()     // Catch: java.io.IOException -> L51
            if (r3 == 0) goto L3e
            boolean r4 = r3.exists()     // Catch: java.io.IOException -> L51
            if (r4 != 0) goto L3e
            r3.mkdirs()     // Catch: java.io.IOException -> L51
        L3e:
            boolean r3 = r5.createNewFile()     // Catch: java.io.IOException -> L51
            if (r3 == 0) goto L49
        L44:
            java.lang.String r3 = r2.getDocumentIdForFile(r5)     // Catch: java.io.IOException -> L51
            return r3
        L49:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.io.IOException -> L51
            java.lang.String r4 = "Unable to create file"
            r3.<init>(r4)     // Catch: java.io.IOException -> L51
            throw r3     // Catch: java.io.IOException -> L51
        L51:
            r3 = move-exception
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = r3.getMessage()
            r4.<init>(r5)
            r4.initCause(r3)
            throw r4
        L5f:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Parent is not a directory: "
            r5.<init>(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // android.provider.DocumentsProvider
    public void deleteDocument(java.lang.String r3) throws java.io.FileNotFoundException {
            r2 = this;
            java.io.File r0 = r2.getFileForDocumentId(r3)
            java.lang.String r1 = "root"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L10
            r2.deleteRecursively(r0)
            return
        L10:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r0 = "Refusing to delete launcher root"
            r3.<init>(r0)
            throw r3
    }

    @Override // android.provider.DocumentsProvider
    public android.provider.DocumentsContract.Path findDocumentPath(java.lang.String r5, java.lang.String r6) throws java.io.FileNotFoundException {
            r4 = this;
            java.lang.String r6 = r4.normalizeDocumentId(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "root"
            if (r0 != 0) goto L11
            java.lang.String r5 = r4.normalizeDocumentId(r5)
            goto L12
        L11:
            r5 = r1
        L12:
            java.io.File r2 = r4.getFileForDocumentId(r6)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L5b
            if (r0 != 0) goto L44
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L44
            java.io.File r1 = r4.getFileForDocumentId(r5)
            boolean r1 = r4.isSameOrChild(r1, r2)
            if (r1 == 0) goto L2f
            goto L44
        L2f:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Document is outside requested parent: "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L44:
            if (r0 != 0) goto L4b
            java.util.ArrayList r5 = r4.buildDocumentIdPathFromParent(r5, r6)
            goto L4f
        L4b:
            java.util.ArrayList r5 = r4.buildDocumentIdPathFromRoot(r6)
        L4f:
            if (r0 != 0) goto L53
            r6 = 0
            goto L55
        L53:
            java.lang.String r6 = "javalauncher_root"
        L55:
            android.provider.DocumentsContract$Path r0 = new android.provider.DocumentsContract$Path
            r0.<init>(r6, r5)
            return r0
        L5b:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Document does not exist: "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // android.provider.DocumentsProvider
    public boolean isChildDocument(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            java.io.File r3 = r2.getFileForDocumentId(r3)     // Catch: java.lang.Throwable -> L39
            java.io.File r3 = r3.getCanonicalFile()     // Catch: java.lang.Throwable -> L39
            java.io.File r4 = r2.getFileForDocumentId(r4)     // Catch: java.lang.Throwable -> L39
            java.io.File r4 = r4.getCanonicalFile()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Throwable -> L39
            boolean r1 = r4.equals(r3)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r3 = r1.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L39
            boolean r3 = r4.startsWith(r3)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L39
        L38:
            r0 = 1
        L39:
            return r0
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L11
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_GAME_HOME
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L11
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r0)
        L11:
            r0 = 1
            return r0
    }

    @Override // android.provider.DocumentsProvider
    public android.os.ParcelFileDescriptor openDocument(java.lang.String r2, java.lang.String r3, android.os.CancellationSignal r4) throws java.io.FileNotFoundException {
            r1 = this;
            java.io.File r4 = r1.getFileForDocumentId(r2)
            boolean r0 = r4.isDirectory()
            if (r0 != 0) goto L13
            int r2 = r1.parseMode(r3)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r4, r2)
            return r2
        L13:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot open directory: "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // android.provider.DocumentsProvider
    public android.content.res.AssetFileDescriptor openDocumentThumbnail(java.lang.String r1, android.graphics.Point r2, android.os.CancellationSignal r3) throws java.io.FileNotFoundException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = super.openDocumentThumbnail(r1, r2, r3)
            return r1
    }

    @Override // android.provider.DocumentsProvider
    public android.database.Cursor queryChildDocuments(java.lang.String r4, java.lang.String[] r5, java.lang.String r6) throws java.io.FileNotFoundException {
            r3 = this;
            android.database.MatrixCursor r6 = new android.database.MatrixCursor
            java.lang.String[] r5 = r3.resolveDocumentProjection(r5)
            r6.<init>(r5)
            java.io.File r4 = r3.getFileForDocumentId(r4)
            java.io.File[] r4 = r4.listFiles()
            if (r4 != 0) goto L14
            return r6
        L14:
            int r5 = r4.length
            r0 = 0
        L16:
            if (r0 >= r5) goto L24
            r1 = r4[r0]
            java.lang.String r2 = r3.getDocumentIdForFile(r1)
            r3.includeFile(r6, r2, r1)
            int r0 = r0 + 1
            goto L16
        L24:
            return r6
    }

    @Override // android.provider.DocumentsProvider
    public android.database.Cursor queryDocument(java.lang.String r2, java.lang.String[] r3) throws java.io.FileNotFoundException {
            r1 = this;
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r3 = r1.resolveDocumentProjection(r3)
            r0.<init>(r3)
            java.io.File r3 = r1.getFileForDocumentId(r2)
            r1.includeFile(r0, r2, r3)
            return r0
    }

    @Override // android.provider.DocumentsProvider
    public android.database.Cursor queryRoots(java.lang.String[] r5) throws java.io.FileNotFoundException {
            r4 = this;
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r5 = r4.resolveRootProjection(r5)
            r0.<init>(r5)
            java.io.File r5 = r4.getRootDirectory()
            android.database.MatrixCursor$RowBuilder r1 = r0.newRow()
            java.lang.String r2 = "root_id"
            java.lang.String r3 = "javalauncher_root"
            r1.add(r2, r3)
            java.lang.String r2 = "document_id"
            java.lang.String r3 = "root"
            r1.add(r2, r3)
            java.lang.String r2 = "title"
            java.lang.String r3 = r4.getLauncherTitle()
            r1.add(r2, r3)
            r2 = 29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "flags"
            r1.add(r3, r2)
            int r2 = ca.dnamobile.javalauncher.R.mipmap.ic_launcher
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "icon"
            r1.add(r3, r2)
            long r2 = r5.getFreeSpace()
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "available_bytes"
            r1.add(r2, r5)
            return r0
    }

    @Override // android.provider.DocumentsProvider
    public android.database.Cursor querySearchDocuments(java.lang.String r2, java.lang.String r3, java.lang.String[] r4) throws java.io.FileNotFoundException {
            r1 = this;
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r4 = r1.resolveDocumentProjection(r4)
            r0.<init>(r4)
            java.lang.String r4 = "javalauncher_root"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L12
            return r0
        L12:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r3.toLowerCase(r2)
            java.io.File r3 = r1.getRootDirectory()
            r4 = 0
            r1.searchRecursively(r0, r3, r2, r4)
            return r0
    }

    @Override // android.provider.DocumentsProvider
    public java.lang.String renameDocument(java.lang.String r4, java.lang.String r5) throws java.io.FileNotFoundException {
            r3 = this;
            java.io.File r0 = r3.getFileForDocumentId(r4)
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L32
            boolean r2 = r0.isDirectory()
            java.io.File r5 = r3.buildUniqueFile(r1, r5, r2)
            boolean r0 = r0.renameTo(r5)
            if (r0 == 0) goto L1d
            java.lang.String r4 = r3.getDocumentIdForFile(r5)
            return r4
        L1d:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to rename: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L32:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No parent for: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }
}
