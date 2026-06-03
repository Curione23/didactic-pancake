package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SerializationDelegatingTypeAdapter<T> extends com.google.gson.TypeAdapter<T> {
    public SerializationDelegatingTypeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.google.gson.TypeAdapter<T> getSerializationDelegate();
}
