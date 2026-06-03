package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonReaderInternalAccess {
    public static volatile com.google.gson.internal.JsonReaderInternalAccess INSTANCE;

    public JsonReaderInternalAccess() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void promoteNameToValue(com.google.gson.stream.JsonReader r1) throws java.io.IOException;
}
