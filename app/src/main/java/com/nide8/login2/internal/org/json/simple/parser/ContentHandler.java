package com.nide8.login2.internal.org.json.simple.parser;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/nide8auth.jar:com/nide8/login2/internal/org/json/simple/parser/ContentHandler.class */
public interface ContentHandler {
    void startJSON() throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;

    void endJSON() throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;

    boolean startObject() throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;

    boolean endObject() throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;

    boolean startObjectEntry(java.lang.String r1) throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;

    boolean endObjectEntry() throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;

    boolean startArray() throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;

    boolean endArray() throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;

    boolean primitive(java.lang.Object r1) throws com.nide8.login2.internal.org.json.simple.parser.ParseException, java.io.IOException;
}
