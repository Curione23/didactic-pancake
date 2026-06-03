package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
public final class FilesUncheck {
    /* JADX INFO: renamed from: $r8$lambda$-9Fvv2gpyBberb7p6EYih1Kepgk, reason: not valid java name */
    public static /* synthetic */ java.nio.file.attribute.BasicFileAttributes m2574$r8$lambda$9Fvv2gpyBberb7p6EYih1Kepgk(java.nio.file.Path r0, java.lang.Class r1, java.nio.file.LinkOption[] r2) {
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$02PNNOFqIq8hwzLHFxHcSnnjltQ(java.nio.file.Path r0, java.lang.String r1, java.nio.file.LinkOption[] r2) {
            java.lang.Object r0 = java.nio.file.Files.getAttribute(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$2E5TAEf1flQUhnO6Io-uCDk9uoc, reason: not valid java name */
    public static /* synthetic */ java.nio.file.Path m2575$r8$lambda$2E5TAEf1flQUhnO6IouCDk9uoc(java.nio.file.Path r0, java.nio.file.attribute.FileAttribute[] r1) {
            java.nio.file.Path r0 = java.nio.file.Files.createDirectories(r0, r1)
            return r0
    }

    public static /* synthetic */ java.util.Set $r8$lambda$2_duLo4tqlbKAH6q_eAjUQgEhwU(java.nio.file.Path r0, java.nio.file.LinkOption[] r1) {
            java.util.Set r0 = java.nio.file.Files.getPosixFilePermissions(r0, r1)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$36J7y3eU_HowtLa6JqjBJazhceQ(java.nio.file.Path r0) {
            boolean r0 = java.nio.file.Files.isHidden(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$4EDZ-V-HhfYK0DSPxCGDfWc6DFc, reason: not valid java name */
    public static /* synthetic */ java.io.BufferedWriter m2576$r8$lambda$4EDZVHhfYK0DSPxCGDfWc6DFc(java.nio.file.Path r0, java.nio.file.OpenOption[] r1) {
            java.io.BufferedWriter r0 = java.nio.file.Files.newBufferedWriter(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$5aYWaY5vwU1U35JahyXhBpCymZE(java.lang.String r0, java.nio.file.attribute.FileAttribute[] r1) {
            java.nio.file.Path r0 = java.nio.file.Files.createTempDirectory(r0, r1)
            return r0
    }

    public static /* synthetic */ java.util.stream.Stream $r8$lambda$6bJmIuvMqFixsDhhClhW17QVZQY(java.nio.file.Path r0, java.nio.file.FileVisitOption[] r1) {
            java.util.stream.Stream r0 = java.nio.file.Files.walk(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.FileStore $r8$lambda$7YftDJ_ZeT6780qWA_tTi4sw7MA(java.nio.file.Path r0) {
            java.nio.file.FileStore r0 = java.nio.file.Files.getFileStore(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$9Ok-ZC90qgrHFcij_vo_S1_iyp4, reason: not valid java name */
    public static /* synthetic */ java.io.BufferedReader m2577$r8$lambda$9OkZC90qgrHFcij_vo_S1_iyp4(java.nio.file.Path r0) {
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r0)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$D9oBvBl8q0MpwzPzPttSzwZ5E8Q(java.nio.file.Path r0, java.nio.file.Path r1, java.nio.file.attribute.FileAttribute[] r2) {
            java.nio.file.Path r0 = java.nio.file.Files.createSymbolicLink(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.stream.Stream $r8$lambda$DZukrvjwzfiWKs3HFzc_fKTu2Pc(java.nio.file.Path r0) {
            java.util.stream.Stream r0 = java.nio.file.Files.list(r0)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$Df2QVwvx1Sf3ewp3E4u6ipHpTsg(java.nio.file.Path r0) {
            java.nio.file.Path r0 = java.nio.file.Files.readSymbolicLink(r0)
            return r0
    }

    public static /* synthetic */ java.util.stream.Stream $r8$lambda$E2BHaRl5wHL_SfGUzSndWXdaUa4(java.nio.file.Path r0) {
            java.util.stream.Stream r0 = java.nio.file.Files.lines(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$FyqZ9IPq0WWpKF7F8Gl3T-aTD1Q, reason: not valid java name */
    public static /* synthetic */ java.nio.file.Path m2578$r8$lambda$FyqZ9IPq0WWpKF7F8Gl3TaTD1Q(java.nio.file.Path r0, java.lang.Iterable r1, java.nio.file.OpenOption[] r2) {
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$GTw9iQEZnwcqnMX3fEL82josO5g(java.nio.file.Path r0) {
            boolean r0 = java.nio.file.Files.deleteIfExists(r0)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$I9rjKGDzvGx9CgdPiOcBhlzl7oM(java.nio.file.Path r0, java.nio.file.Path r1, java.nio.file.CopyOption[] r2) {
            java.nio.file.Path r0 = java.nio.file.Files.move(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.io.BufferedReader $r8$lambda$IETKydqeKpp_SOWjaXJ2pOwrv0E(java.nio.file.Path r0, java.nio.charset.Charset r1) {
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$KBnkwz3pvyK-WzJaVuL3-mVUkes, reason: not valid java name */
    public static /* synthetic */ java.io.InputStream m2579$r8$lambda$KBnkwz3pvyKWzJaVuL3mVUkes(java.nio.file.Path r0, java.nio.file.OpenOption[] r1) {
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$KOcmwBZglI13PMM36XOFViQLAag(java.nio.file.Path r0, java.nio.file.attribute.FileAttribute[] r1) {
            java.nio.file.Path r0 = java.nio.file.Files.createFile(r0, r1)
            return r0
    }

    public static /* synthetic */ long $r8$lambda$LmKLGVWdzsf8iLjyrBnkKBBRKu8(java.nio.file.Path r2) {
            long r0 = java.nio.file.Files.size(r2)
            return r0
    }

    public static /* synthetic */ java.util.stream.Stream $r8$lambda$MobEtUp0_O0kpyv2FeM1BcMBAzg(java.nio.file.Path r0, int r1, java.nio.file.FileVisitOption[] r2) {
            java.util.stream.Stream r0 = java.nio.file.Files.walk(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$MxR1NXJd1FWLMBZkXBRyD-wVKgE, reason: not valid java name */
    public static /* synthetic */ long m2580$r8$lambda$MxR1NXJd1FWLMBZkXBRyDwVKgE(java.nio.file.Path r0, java.io.OutputStream r1) {
            long r0 = java.nio.file.Files.copy(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$Nmi1nofiPwbWoBRRzZn-Hajqvgs, reason: not valid java name */
    public static /* synthetic */ long m2581$r8$lambda$Nmi1nofiPwbWoBRRzZnHajqvgs(java.io.InputStream r0, java.nio.file.Path r1, java.nio.file.CopyOption[] r2) {
            long r0 = java.nio.file.Files.copy(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.nio.channels.SeekableByteChannel $r8$lambda$PN1r4_FaFKDicKatDJYbgpcLaxc(java.nio.file.Path r0, java.nio.file.OpenOption[] r1) {
            java.nio.channels.SeekableByteChannel r0 = java.nio.file.Files.newByteChannel(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$QSQD571RSnnUw4QKdCXpKbGGG_M(java.nio.file.Path r0, java.nio.file.Path r1, java.nio.file.CopyOption[] r2) {
            java.nio.file.Path r0 = java.nio.file.Files.copy(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List $r8$lambda$TMva0Er4zdV25e7gVkLGGLyhNDQ(java.nio.file.Path r0) {
            java.util.List r0 = java.nio.file.Files.readAllLines(r0)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$UJT1EMNrW136MSL8oSSvI8Yj_XE(java.nio.file.Path r0, java.lang.String r1, java.lang.String r2, java.nio.file.attribute.FileAttribute[] r3) {
            java.nio.file.Path r0 = java.nio.file.Files.createTempFile(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$Ua79fijSwam4BoCswhtWgx88VeI(java.nio.file.Path r0, java.lang.String r1, java.nio.file.attribute.FileAttribute[] r2) {
            java.nio.file.Path r0 = java.nio.file.Files.createTempDirectory(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.io.BufferedWriter $r8$lambda$WR6w4gGkEnXP7nyTVK9TbmeLuIU(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2) {
            java.io.BufferedWriter r0 = java.nio.file.Files.newBufferedWriter(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$WgA9VEa6ep-VcB0vwFYCC_pRFr8, reason: not valid java name */
    public static /* synthetic */ java.util.List m2582$r8$lambda$WgA9VEa6epVcB0vwFYCC_pRFr8(java.nio.file.Path r0, java.nio.charset.Charset r1) {
            java.util.List r0 = java.nio.file.Files.readAllLines(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$Zsr8Pv1ktrG9pN3bj_eYIVPrJuI(java.nio.file.Path r0, byte[] r1, java.nio.file.OpenOption[] r2) {
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.nio.channels.SeekableByteChannel $r8$lambda$aL_gzpJAhCO6oN6aT50EyweAt7Q(java.nio.file.Path r0, java.util.Set r1, java.nio.file.attribute.FileAttribute[] r2) {
            java.nio.channels.SeekableByteChannel r0 = java.nio.file.Files.newByteChannel(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$c-dV0RFB0Q0cGO1ZAFOZxvah5sc, reason: not valid java name */
    public static /* synthetic */ java.nio.file.Path m2583$r8$lambda$cdV0RFB0Q0cGO1ZAFOZxvah5sc(java.nio.file.Path r0, java.nio.file.Path r1) {
            java.nio.file.Path r0 = java.nio.file.Files.createLink(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$ckR-rPT4vbMmZjIOp18FJgaWX78, reason: not valid java name */
    public static /* synthetic */ java.util.Map m2584$r8$lambda$ckRrPT4vbMmZjIOp18FJgaWX78(java.nio.file.Path r0, java.lang.String r1, java.nio.file.LinkOption[] r2) {
            java.util.Map r0 = java.nio.file.Files.readAttributes(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$e-QwdJeJPAg2vbt3U9rMGoFnVXY, reason: not valid java name */
    public static /* synthetic */ java.nio.file.Path m2585$r8$lambda$eQwdJeJPAg2vbt3U9rMGoFnVXY(java.nio.file.Path r0, java.lang.Iterable r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3) {
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$ehvkS5qJndijRMaA-LKWj18ncTU, reason: not valid java name */
    public static /* synthetic */ java.nio.file.Path m2586$r8$lambda$ehvkS5qJndijRMaALKWj18ncTU(java.nio.file.Path r0, java.lang.String r1, java.lang.Object r2, java.nio.file.LinkOption[] r3) {
            java.nio.file.Path r0 = java.nio.file.Files.setAttribute(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.nio.file.attribute.UserPrincipal $r8$lambda$hc5avC3AaY4EXg5cbhqj0ySVmoI(java.nio.file.Path r0, java.nio.file.LinkOption[] r1) {
            java.nio.file.attribute.UserPrincipal r0 = java.nio.file.Files.getOwner(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$hj2-j2h16XDygi5-joVRNcwK-bQ, reason: not valid java name */
    public static /* synthetic */ java.nio.file.Path m2587$r8$lambda$hj2j2h16XDygi5joVRNcwKbQ(java.nio.file.Path r0, java.util.Set r1) {
            java.nio.file.Path r0 = java.nio.file.Files.setPosixFilePermissions(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$jBi8WNAlZaLgucPkQp6LkFYKVe4(java.nio.file.Path r0, java.util.Set r1, int r2, java.nio.file.FileVisitor r3) {
            java.nio.file.Path r0 = java.nio.file.Files.walkFileTree(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.util.stream.Stream $r8$lambda$jIZCZMOZyUMDKXIRR9JWEF9ZPps(java.nio.file.Path r0, java.nio.charset.Charset r1) {
            java.util.stream.Stream r0 = java.nio.file.Files.lines(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$k4oDC19f7td7g421rBQfCQDfjKk(java.nio.file.Path r0, java.nio.file.attribute.FileTime r1) {
            java.nio.file.Path r0 = java.nio.file.Files.setLastModifiedTime(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.DirectoryStream $r8$lambda$m4STtJDPIs1pKuhDwnQCYhhKeoE(java.nio.file.Path r0) {
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0)
            return r0
    }

    public static /* synthetic */ java.io.OutputStream $r8$lambda$mKVbyQwtm4KahGQ0V4ZegwbNsrs(java.nio.file.Path r0, java.nio.file.OpenOption[] r1) {
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$pntzyJ-j1d26auDwOAEhBQGv3qE, reason: not valid java name */
    public static /* synthetic */ java.nio.file.Path m2588$r8$lambda$pntzyJj1d26auDwOAEhBQGv3qE(java.nio.file.Path r0, java.nio.file.attribute.FileAttribute[] r1) {
            java.nio.file.Path r0 = java.nio.file.Files.createDirectory(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$pphGIiI2_CzuVcemQO8k7Qdke4g(java.lang.String r0, java.lang.String r1, java.nio.file.attribute.FileAttribute[] r2) {
            java.nio.file.Path r0 = java.nio.file.Files.createTempFile(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$sSEplucOLqro0u8Lepml-1iLuts, reason: not valid java name */
    public static /* synthetic */ java.nio.file.DirectoryStream m2589$r8$lambda$sSEplucOLqro0u8Lepml1iLuts(java.nio.file.Path r0, java.lang.String r1) {
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$sisHNn-estjx2yVrzDO-zTVvjm0, reason: not valid java name */
    public static /* synthetic */ java.nio.file.attribute.FileTime m2590$r8$lambda$sisHNnestjx2yVrzDOzTVvjm0(java.nio.file.Path r0, java.nio.file.LinkOption[] r1) {
            java.nio.file.attribute.FileTime r0 = java.nio.file.Files.getLastModifiedTime(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String $r8$lambda$t_AU9XoYG5WVBBrVV4BFl8quOQI(java.nio.file.Path r0) {
            java.lang.String r0 = java.nio.file.Files.probeContentType(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$uW8AuxMwrvSXz9igUv7A-zqdt4k, reason: not valid java name */
    public static /* synthetic */ java.nio.file.Path m2591$r8$lambda$uW8AuxMwrvSXz9igUv7Azqdt4k(java.nio.file.Path r0, java.nio.file.attribute.UserPrincipal r1) {
            java.nio.file.Path r0 = java.nio.file.Files.setOwner(r0, r1)
            return r0
    }

    public static /* synthetic */ java.util.stream.Stream $r8$lambda$vbR9_nU_5u1C5YreEedqtTVDAko(java.nio.file.Path r0, int r1, java.util.function.BiPredicate r2, java.nio.file.FileVisitOption[] r3) {
            java.util.stream.Stream r0 = java.nio.file.Files.find(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$wOHnVhKf_uY2_f6DH-XtsaoRuCs, reason: not valid java name */
    public static /* synthetic */ void m2592$r8$lambda$wOHnVhKf_uY2_f6DHXtsaoRuCs(java.nio.file.Path r0) {
            java.nio.file.Files.delete(r0)
            return
    }

    public static /* synthetic */ byte[] $r8$lambda$wWCi45ukWNaEL5agFBfDOtUvFVQ(java.nio.file.Path r0) {
            byte[] r0 = java.nio.file.Files.readAllBytes(r0)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path $r8$lambda$wh8y8ttndffTL0yeqdmRsYRdRKY(java.nio.file.Path r0, java.nio.file.FileVisitor r1) {
            java.nio.file.Path r0 = java.nio.file.Files.walkFileTree(r0, r1)
            return r0
    }

    public static /* synthetic */ java.nio.file.DirectoryStream $r8$lambda$yJk_brWyM_0HIAn8wAZXOLF5mOg(java.nio.file.Path r0, java.nio.file.DirectoryStream.Filter r1) {
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0, r1)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$yexM3zObSDBZWUtoGLojVEA_2tc(java.nio.file.Path r0, java.nio.file.Path r1) {
            boolean r0 = java.nio.file.Files.isSameFile(r0, r1)
            return r0
    }

    private FilesUncheck() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long copy(java.io.InputStream r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda55 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda55
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            return r1
    }

    public static long copy(java.nio.file.Path r1, java.io.OutputStream r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda8 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda8
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            return r1
    }

    public static java.nio.file.Path copy(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda22 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda22
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createDirectories(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createDirectory(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda33 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda33
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createFile(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda37 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda37
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createLink(java.nio.file.Path r1, java.nio.file.Path r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda3
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createSymbolicLink(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.attribute.FileAttribute<?>... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda39 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda39
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createTempDirectory(java.lang.String r1, java.nio.file.attribute.FileAttribute<?>... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda46 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda46
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createTempDirectory(java.nio.file.Path r1, java.lang.String r2, java.nio.file.attribute.FileAttribute<?>... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda54 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda54
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createTempFile(java.lang.String r1, java.lang.String r2, java.nio.file.attribute.FileAttribute<?>... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda16 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda16
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path createTempFile(java.nio.file.Path r1, java.lang.String r2, java.lang.String r3, java.nio.file.attribute.FileAttribute<?>... r4) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda30 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda30
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3, r4)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static void delete(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda23 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda23
            r0.<init>()
            org.apache.commons.io.function.Uncheck.accept(r0, r1)
            return
    }

    public static boolean deleteIfExists(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda40 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda40
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static java.util.stream.Stream<java.nio.file.Path> find(java.nio.file.Path r1, int r2, java.util.function.BiPredicate<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes> r3, java.nio.file.FileVisitOption... r4) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda18 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda18
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3, r4)
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            return r1
    }

    public static java.lang.Object getAttribute(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda7 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda7
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            return r1
    }

    public static java.nio.file.FileStore getFileStore(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda44 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda44
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.nio.file.FileStore r1 = (java.nio.file.FileStore) r1
            return r1
    }

    public static java.nio.file.attribute.FileTime getLastModifiedTime(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda49 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda49
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.attribute.FileTime r1 = (java.nio.file.attribute.FileTime) r1
            return r1
    }

    public static java.nio.file.attribute.UserPrincipal getOwner(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda21 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda21
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.attribute.UserPrincipal r1 = (java.nio.file.attribute.UserPrincipal) r1
            return r1
    }

    public static java.util.Set<java.nio.file.attribute.PosixFilePermission> getPosixFilePermissions(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda14 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda14
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    public static boolean isHidden(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda38 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda38
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static boolean isSameFile(java.nio.file.Path r1, java.nio.file.Path r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda47 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda47
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static java.util.stream.Stream<java.lang.String> lines(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda45 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda45
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            return r1
    }

    public static java.util.stream.Stream<java.lang.String> lines(java.nio.file.Path r1, java.nio.charset.Charset r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda31 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda31
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            return r1
    }

    public static java.util.stream.Stream<java.nio.file.Path> list(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda4 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda4
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            return r1
    }

    public static java.nio.file.Path move(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda9 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda9
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.io.BufferedReader newBufferedReader(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda24 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda24
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            return r1
    }

    public static java.io.BufferedReader newBufferedReader(java.nio.file.Path r1, java.nio.charset.Charset r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda10 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda10
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            return r1
    }

    public static java.io.BufferedWriter newBufferedWriter(java.nio.file.Path r1, java.nio.charset.Charset r2, java.nio.file.OpenOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda17 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda17
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            return r1
    }

    public static java.io.BufferedWriter newBufferedWriter(java.nio.file.Path r1, java.nio.file.OpenOption... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda50 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda50
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            return r1
    }

    public static java.nio.channels.SeekableByteChannel newByteChannel(java.nio.file.Path r1, java.util.Set<? extends java.nio.file.OpenOption> r2, java.nio.file.attribute.FileAttribute<?>... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda35 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda35
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.channels.SeekableByteChannel r1 = (java.nio.channels.SeekableByteChannel) r1
            return r1
    }

    public static java.nio.channels.SeekableByteChannel newByteChannel(java.nio.file.Path r1, java.nio.file.OpenOption... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda32 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda32
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.channels.SeekableByteChannel r1 = (java.nio.channels.SeekableByteChannel) r1
            return r1
    }

    public static java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda48 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda48
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1
            return r1
    }

    public static java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream(java.nio.file.Path r1, java.lang.String r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda19 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda19
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1
            return r1
    }

    public static java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream(java.nio.file.Path r1, java.nio.file.DirectoryStream.Filter<? super java.nio.file.Path> r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda13 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda13
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1
            return r1
    }

    public static java.io.InputStream newInputStream(java.nio.file.Path r1, java.nio.file.OpenOption... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda42 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda42
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.io.InputStream r1 = (java.io.InputStream) r1
            return r1
    }

    public static java.io.OutputStream newOutputStream(java.nio.file.Path r1, java.nio.file.OpenOption... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda51 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda51
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.io.OutputStream r1 = (java.io.OutputStream) r1
            return r1
    }

    public static java.lang.String probeContentType(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda29 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda29
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static byte[] readAllBytes(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda6 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda6
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            byte[] r1 = (byte[]) r1
            return r1
    }

    public static java.util.List<java.lang.String> readAllLines(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda11 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda11
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static java.util.List<java.lang.String> readAllLines(java.nio.file.Path r1, java.nio.charset.Charset r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda27 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda27
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static <A extends java.nio.file.attribute.BasicFileAttributes> A readAttributes(java.nio.file.Path r1, java.lang.Class<A> r2, java.nio.file.LinkOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda12 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda12
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.file.attribute.BasicFileAttributes r1 = (java.nio.file.attribute.BasicFileAttributes) r1
            return r1
    }

    public static java.util.Map<java.lang.String, java.lang.Object> readAttributes(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda52 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda52
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.util.Map r1 = (java.util.Map) r1
            return r1
    }

    public static java.nio.file.Path readSymbolicLink(java.nio.file.Path r1) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda26 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda26
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path setAttribute(java.nio.file.Path r1, java.lang.String r2, java.lang.Object r3, java.nio.file.LinkOption... r4) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda25 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda25
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3, r4)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path setLastModifiedTime(java.nio.file.Path r1, java.nio.file.attribute.FileTime r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda20 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda20
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path setOwner(java.nio.file.Path r1, java.nio.file.attribute.UserPrincipal r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path setPosixFilePermissions(java.nio.file.Path r1, java.util.Set<java.nio.file.attribute.PosixFilePermission> r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda36 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda36
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static long size(java.nio.file.Path r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda15 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda15
            r0.<init>()
            java.lang.Object r2 = org.apache.commons.io.function.Uncheck.apply(r0, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            return r0
    }

    public static java.util.stream.Stream<java.nio.file.Path> walk(java.nio.file.Path r1, int r2, java.nio.file.FileVisitOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda5 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda5
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            return r1
    }

    public static java.util.stream.Stream<java.nio.file.Path> walk(java.nio.file.Path r1, java.nio.file.FileVisitOption... r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda43 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda43
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.util.stream.Stream r1 = (java.util.stream.Stream) r1
            return r1
    }

    public static java.nio.file.Path walkFileTree(java.nio.file.Path r1, java.nio.file.FileVisitor<? super java.nio.file.Path> r2) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda53 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda53
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path walkFileTree(java.nio.file.Path r1, java.util.Set<java.nio.file.FileVisitOption> r2, int r3, java.nio.file.FileVisitor<? super java.nio.file.Path> r4) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda41 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda41
            r0.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3, r4)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path write(java.nio.file.Path r1, java.lang.Iterable<? extends java.lang.CharSequence> r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda28 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda28
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3, r4)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path write(java.nio.file.Path r1, java.lang.Iterable<? extends java.lang.CharSequence> r2, java.nio.file.OpenOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda34 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda34
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }

    public static java.nio.file.Path write(java.nio.file.Path r1, byte[] r2, java.nio.file.OpenOption... r3) {
            org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda1
            r0.<init>()
            java.lang.Object r1 = org.apache.commons.io.function.Uncheck.apply(r0, r1, r2, r3)
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            return r1
    }
}
