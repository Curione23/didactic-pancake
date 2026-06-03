package com.google.gson.internal.sql;

/* JADX INFO: loaded from: classes2.dex */
final class SqlDateTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Date> {
    static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.text.DateFormat format;


    static {
            com.google.gson.internal.sql.SqlDateTypeAdapter$1 r0 = new com.google.gson.internal.sql.SqlDateTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.sql.SqlDateTypeAdapter.FACTORY = r0
            return
    }

    private SqlDateTypeAdapter() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MMM d, yyyy"
            r0.<init>(r1)
            r2.format = r0
            return
    }

    /* synthetic */ SqlDateTypeAdapter(com.google.gson.internal.sql.SqlDateTypeAdapter.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.sql.Date read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.sql.Date r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.sql.Date read2(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "Failed parsing '"
            com.google.gson.stream.JsonToken r1 = r8.peek()
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
            if (r1 != r2) goto Lf
            r8.nextNull()
            r8 = 0
            return r8
        Lf:
            java.lang.String r1 = r8.nextString()
            monitor-enter(r7)
            java.text.DateFormat r2 = r7.format     // Catch: java.lang.Throwable -> L5a
            java.util.TimeZone r2 = r2.getTimeZone()     // Catch: java.lang.Throwable -> L5a
            java.text.DateFormat r3 = r7.format     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            java.util.Date r3 = r3.parse(r1)     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            java.sql.Date r4 = new java.sql.Date     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            long r5 = r3.getTime()     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L30 java.text.ParseException -> L32
            java.text.DateFormat r8 = r7.format     // Catch: java.lang.Throwable -> L5a
            r8.setTimeZone(r2)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5a
            return r4
        L30:
            r8 = move-exception
            goto L54
        L32:
            r3 = move-exception
            com.google.gson.JsonSyntaxException r4 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r0 = r5.append(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "' as SQL Date; at path "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = r8.getPreviousPath()     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r8 = r0.append(r8)     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L30
            r4.<init>(r8, r3)     // Catch: java.lang.Throwable -> L30
            throw r4     // Catch: java.lang.Throwable -> L30
        L54:
            java.text.DateFormat r0 = r7.format     // Catch: java.lang.Throwable -> L5a
            r0.setTimeZone(r2)     // Catch: java.lang.Throwable -> L5a
            throw r8     // Catch: java.lang.Throwable -> L5a
        L5a:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5a
            throw r8
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.sql.Date r2) throws java.io.IOException {
            r0 = this;
            java.sql.Date r2 = (java.sql.Date) r2
            r0.write2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r2, java.sql.Date r3) throws java.io.IOException {
            r1 = this;
            if (r3 != 0) goto L6
            r2.nullValue()
            return
        L6:
            monitor-enter(r1)
            java.text.DateFormat r0 = r1.format     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            r2.value(r3)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }
}
