package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
final class CloseableURLConnection extends java.net.URLConnection implements java.lang.AutoCloseable {
    private final java.net.URLConnection urlConnection;

    CloseableURLConnection(java.net.URLConnection r2) {
            r1 = this;
            java.lang.String r0 = "urlConnection"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            java.net.URLConnection r0 = (java.net.URLConnection) r0
            java.net.URL r0 = r0.getURL()
            r1.<init>(r0)
            r1.urlConnection = r2
            return
    }

    static org.apache.commons.io.CloseableURLConnection open(java.net.URI r1) throws java.io.IOException {
            java.lang.String r0 = "uri"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.net.URI r1 = (java.net.URI) r1
            java.net.URL r1 = r1.toURL()
            org.apache.commons.io.CloseableURLConnection r1 = open(r1)
            return r1
    }

    static org.apache.commons.io.CloseableURLConnection open(java.net.URL r1) throws java.io.IOException {
            org.apache.commons.io.CloseableURLConnection r0 = new org.apache.commons.io.CloseableURLConnection
            java.net.URLConnection r1 = r1.openConnection()
            r0.<init>(r1)
            return r0
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.addRequestProperty(r2, r3)
            return
    }

    @Override // java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            org.apache.commons.io.IOUtils.close(r0)
            return
    }

    @Override // java.net.URLConnection
    public void connect() throws java.io.IOException {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.connect()
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            boolean r0 = r0.getAllowUserInteraction()
            return r0
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            int r0 = r0.getConnectTimeout()
            return r0
    }

    @Override // java.net.URLConnection
    public java.lang.Object getContent() throws java.io.IOException {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.Object r0 = r0.getContent()
            return r0
    }

    @Override // java.net.URLConnection
    public java.lang.Object getContent(java.lang.Class[] r2) throws java.io.IOException {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.Object r2 = r0.getContent(r2)
            return r2
    }

    @Override // java.net.URLConnection
    public java.lang.String getContentEncoding() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.String r0 = r0.getContentEncoding()
            return r0
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            int r0 = r0.getContentLength()
            return r0
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
            r2 = this;
            java.net.URLConnection r0 = r2.urlConnection
            long r0 = r0.getContentLengthLong()
            return r0
    }

    @Override // java.net.URLConnection
    public java.lang.String getContentType() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.String r0 = r0.getContentType()
            return r0
    }

    @Override // java.net.URLConnection
    public long getDate() {
            r2 = this;
            java.net.URLConnection r0 = r2.urlConnection
            long r0 = r0.getDate()
            return r0
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            boolean r0 = r0.getDefaultUseCaches()
            return r0
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            boolean r0 = r0.getDoInput()
            return r0
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            boolean r0 = r0.getDoOutput()
            return r0
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
            r2 = this;
            java.net.URLConnection r0 = r2.urlConnection
            long r0 = r0.getExpiration()
            return r0
    }

    @Override // java.net.URLConnection
    public java.lang.String getHeaderField(int r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.String r2 = r0.getHeaderField(r2)
            return r2
    }

    @Override // java.net.URLConnection
    public java.lang.String getHeaderField(java.lang.String r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.String r2 = r0.getHeaderField(r2)
            return r2
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldDate(java.lang.String r2, long r3) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            long r2 = r0.getHeaderFieldDate(r2, r3)
            return r2
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(java.lang.String r2, int r3) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            int r2 = r0.getHeaderFieldInt(r2, r3)
            return r2
    }

    @Override // java.net.URLConnection
    public java.lang.String getHeaderFieldKey(int r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.String r2 = r0.getHeaderFieldKey(r2)
            return r2
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(java.lang.String r2, long r3) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            long r2 = r0.getHeaderFieldLong(r2, r3)
            return r2
    }

    @Override // java.net.URLConnection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderFields() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.util.Map r0 = r0.getHeaderFields()
            return r0
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
            r2 = this;
            java.net.URLConnection r0 = r2.urlConnection
            long r0 = r0.getIfModifiedSince()
            return r0
    }

    @Override // java.net.URLConnection
    public java.io.InputStream getInputStream() throws java.io.IOException {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.io.InputStream r0 = r0.getInputStream()
            return r0
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
            r2 = this;
            java.net.URLConnection r0 = r2.urlConnection
            long r0 = r0.getLastModified()
            return r0
    }

    @Override // java.net.URLConnection
    public java.io.OutputStream getOutputStream() throws java.io.IOException {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.io.OutputStream r0 = r0.getOutputStream()
            return r0
    }

    @Override // java.net.URLConnection
    public java.security.Permission getPermission() throws java.io.IOException {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.security.Permission r0 = r0.getPermission()
            return r0
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            int r0 = r0.getReadTimeout()
            return r0
    }

    @Override // java.net.URLConnection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.util.Map r0 = r0.getRequestProperties()
            return r0
    }

    @Override // java.net.URLConnection
    public java.lang.String getRequestProperty(java.lang.String r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.String r2 = r0.getRequestProperty(r2)
            return r2
    }

    @Override // java.net.URLConnection
    public java.net.URL getURL() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.net.URL r0 = r0.getURL()
            return r0
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            boolean r0 = r0.getUseCaches()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setAllowUserInteraction(r2)
            return
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setConnectTimeout(r2)
            return
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setDefaultUseCaches(r2)
            return
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setDoInput(r2)
            return
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setDoOutput(r2)
            return
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setIfModifiedSince(r2)
            return
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setReadTimeout(r2)
            return
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setRequestProperty(r2, r3)
            return
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean r2) {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            r0.setUseCaches(r2)
            return
    }

    @Override // java.net.URLConnection
    public java.lang.String toString() {
            r1 = this;
            java.net.URLConnection r0 = r1.urlConnection
            java.lang.String r0 = r0.toString()
            return r0
    }
}
