package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class MultiReadOnlySeekableByteChannel implements java.nio.channels.SeekableByteChannel {
    private static final java.nio.file.Path[] EMPTY_PATH_ARRAY = null;
    private final java.util.List<java.nio.channels.SeekableByteChannel> channelList;
    private int currentChannelIdx;
    private long globalPosition;

    static {
            r0 = 0
            java.nio.file.Path[] r0 = new java.nio.file.Path[r0]
            org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.EMPTY_PATH_ARRAY = r0
            return
    }

    public MultiReadOnlySeekableByteChannel(java.util.List<java.nio.channels.SeekableByteChannel> r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "channels"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
            java.util.Collection r3 = (java.util.Collection) r3
            r0.<init>(r3)
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r2.channelList = r3
            return
    }

    public static java.nio.channels.SeekableByteChannel forFiles(java.io.File... r4) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "files"
            java.lang.Object r4 = java.util.Objects.requireNonNull(r4, r1)
            java.io.File[] r4 = (java.io.File[]) r4
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1d
            r3 = r4[r2]
            java.nio.file.Path r3 = r3.toPath()
            r0.add(r3)
            int r2 = r2 + 1
            goto Lf
        L1d:
            java.nio.file.Path[] r4 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.EMPTY_PATH_ARRAY
            java.lang.Object[] r4 = r0.toArray(r4)
            java.nio.file.Path[] r4 = (java.nio.file.Path[]) r4
            java.nio.channels.SeekableByteChannel r4 = forPaths(r4)
            return r4
    }

    public static java.nio.channels.SeekableByteChannel forPaths(java.nio.file.Path... r7) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "paths"
            java.lang.Object r7 = java.util.Objects.requireNonNull(r7, r1)
            java.nio.file.Path[] r7 = (java.nio.file.Path[]) r7
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L10:
            r4 = 1
            if (r3 >= r1) goto L25
            r5 = r7[r3]
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r4]
            java.nio.file.StandardOpenOption r6 = java.nio.file.StandardOpenOption.READ
            r4[r2] = r6
            java.nio.channels.SeekableByteChannel r4 = java.nio.file.Files.newByteChannel(r5, r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L10
        L25:
            int r7 = r0.size()
            if (r7 != r4) goto L32
            java.lang.Object r7 = r0.get(r2)
            java.nio.channels.SeekableByteChannel r7 = (java.nio.channels.SeekableByteChannel) r7
            return r7
        L32:
            org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel r7 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel
            r7.<init>(r0)
            return r7
    }

    public static java.nio.channels.SeekableByteChannel forSeekableByteChannels(java.nio.channels.SeekableByteChannel... r2) {
            java.lang.String r0 = "channels"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            java.nio.channels.SeekableByteChannel[] r0 = (java.nio.channels.SeekableByteChannel[]) r0
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L10
            r0 = 0
            r2 = r2[r0]
            return r2
        L10:
            org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel r0 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            return r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            java.util.List<java.nio.channels.SeekableByteChannel> r0 = r3.channelList
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            java.nio.channels.SeekableByteChannel r2 = (java.nio.channels.SeekableByteChannel) r2
            r2.close()     // Catch: java.io.IOException -> L17
            goto L7
        L17:
            r2 = move-exception
            if (r1 != 0) goto L7
            r1 = r2
            goto L7
        L1c:
            if (r1 != 0) goto L1f
            return
        L1f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "failed to close wrapped channel"
            r0.<init>(r2, r1)
            throw r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r2 = this;
            java.util.List<java.nio.channels.SeekableByteChannel> r0 = r2.channelList
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel$$ExternalSyntheticLambda0
            r1.<init>()
            boolean r0 = r0.allMatch(r1)
            return r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long position() {
            r2 = this;
            long r0 = r2.globalPosition
            return r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized java.nio.channels.SeekableByteChannel position(long r10) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "Negative position: "
            monitor-enter(r9)
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 < 0) goto L4a
            boolean r0 = r9.isOpen()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L42
            r9.globalPosition = r10     // Catch: java.lang.Throwable -> L48
            r0 = 0
        L12:
            java.util.List<java.nio.channels.SeekableByteChannel> r3 = r9.channelList     // Catch: java.lang.Throwable -> L48
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L48
            if (r0 >= r3) goto L40
            java.util.List<java.nio.channels.SeekableByteChannel> r3 = r9.channelList     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L48
            java.nio.channels.SeekableByteChannel r3 = (java.nio.channels.SeekableByteChannel) r3     // Catch: java.lang.Throwable -> L48
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L48
            r6 = -1
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 != 0) goto L2f
            r6 = r10
            r10 = r1
            goto L39
        L2f:
            int r8 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r8 > 0) goto L36
            r9.currentChannelIdx = r0     // Catch: java.lang.Throwable -> L48
            goto L39
        L36:
            long r10 = r10 - r4
            r6 = r10
            r10 = r4
        L39:
            r3.position(r10)     // Catch: java.lang.Throwable -> L48
            int r0 = r0 + 1
            r10 = r6
            goto L12
        L40:
            monitor-exit(r9)
            return r9
        L42:
            java.nio.channels.ClosedChannelException r10 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L48
            r10.<init>()     // Catch: java.lang.Throwable -> L48
            throw r10     // Catch: java.lang.Throwable -> L48
        L48:
            r10 = move-exception
            goto L5d
        L4a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r10 = r2.append(r10)     // Catch: java.lang.Throwable -> L48
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L48
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L48
            throw r1     // Catch: java.lang.Throwable -> L48
        L5d:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
    }

    public synchronized java.nio.channels.SeekableByteChannel position(long r4, long r6) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isOpen()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L23
            r0 = 0
        L8:
            long r1 = (long) r0     // Catch: java.lang.Throwable -> L29
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L1d
            java.util.List<java.nio.channels.SeekableByteChannel> r1 = r3.channelList     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L29
            java.nio.channels.SeekableByteChannel r1 = (java.nio.channels.SeekableByteChannel) r1     // Catch: java.lang.Throwable -> L29
            long r1 = r1.size()     // Catch: java.lang.Throwable -> L29
            long r6 = r6 + r1
            int r0 = r0 + 1
            goto L8
        L1d:
            java.nio.channels.SeekableByteChannel r4 = r3.position(r6)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)
            return r4
        L23:
            java.nio.channels.ClosedChannelException r4 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L29
            r4.<init>()     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L29:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r9) throws java.io.IOException {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.isOpen()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L58
            boolean r0 = r9.hasRemaining()     // Catch: java.lang.Throwable -> L5e
            r1 = 0
            if (r0 != 0) goto L10
            monitor-exit(r8)
            return r1
        L10:
            boolean r0 = r9.hasRemaining()     // Catch: java.lang.Throwable -> L5e
            r2 = -1
            if (r0 == 0) goto L4c
            int r0 = r8.currentChannelIdx     // Catch: java.lang.Throwable -> L5e
            java.util.List<java.nio.channels.SeekableByteChannel> r3 = r8.channelList     // Catch: java.lang.Throwable -> L5e
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5e
            if (r0 >= r3) goto L4c
            java.util.List<java.nio.channels.SeekableByteChannel> r0 = r8.channelList     // Catch: java.lang.Throwable -> L5e
            int r3 = r8.currentChannelIdx     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L5e
            java.nio.channels.SeekableByteChannel r0 = (java.nio.channels.SeekableByteChannel) r0     // Catch: java.lang.Throwable -> L5e
            int r3 = r0.read(r9)     // Catch: java.lang.Throwable -> L5e
            if (r3 != r2) goto L38
            int r0 = r8.currentChannelIdx     // Catch: java.lang.Throwable -> L5e
            int r0 = r0 + 1
            r8.currentChannelIdx = r0     // Catch: java.lang.Throwable -> L5e
            goto L10
        L38:
            long r4 = r0.position()     // Catch: java.lang.Throwable -> L5e
            long r6 = r0.size()     // Catch: java.lang.Throwable -> L5e
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L4a
            int r0 = r8.currentChannelIdx     // Catch: java.lang.Throwable -> L5e
            int r0 = r0 + 1
            r8.currentChannelIdx = r0     // Catch: java.lang.Throwable -> L5e
        L4a:
            int r1 = r1 + r3
            goto L10
        L4c:
            if (r1 <= 0) goto L56
            long r2 = r8.globalPosition     // Catch: java.lang.Throwable -> L5e
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L5e
            long r2 = r2 + r4
            r8.globalPosition = r2     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r8)
            return r1
        L56:
            monitor-exit(r8)
            return r2
        L58:
            java.nio.channels.ClosedChannelException r9 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L5e
            r9.<init>()     // Catch: java.lang.Throwable -> L5e
            throw r9     // Catch: java.lang.Throwable -> L5e
        L5e:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5e
            throw r9
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.isOpen()
            if (r0 == 0) goto L21
            java.util.List<java.nio.channels.SeekableByteChannel> r0 = r5.channelList
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Le:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.next()
            java.nio.channels.SeekableByteChannel r3 = (java.nio.channels.SeekableByteChannel) r3
            long r3 = r3.size()
            long r1 = r1 + r3
            goto Le
        L20:
            return r1
        L21:
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException
            r0.<init>()
            throw r0
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel truncate(long r1) {
            r0 = this;
            java.nio.channels.NonWritableChannelException r1 = new java.nio.channels.NonWritableChannelException
            r1.<init>()
            throw r1
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r1) {
            r0 = this;
            java.nio.channels.NonWritableChannelException r1 = new java.nio.channels.NonWritableChannelException
            r1.<init>()
            throw r1
    }
}
