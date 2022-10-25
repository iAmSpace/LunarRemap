package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class class_0513
extends class_0821
implements Closeable {
    public static final Splitter lllIlIIlIIIlIlIIIllIlllIl = Splitter.on((char)'/').omitEmptyStrings().limit(3);
    private ZipFile IlIllllllIIlIIllllIIlIIIl;

    public class_0513(File file) {
        super(file);
    }

    private ZipFile lIlllIlllIIIIlIIlllIllIII() {
        if (this.IlIllllllIIlIIllllIIlIIIl == null) {
            this.IlIllllllIIlIIllllIIlIIIl = new ZipFile(this.lllIIIllIIIIlllIlIIllIIll);
        }
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    protected InputStream lllIIIllIIIIlllIlIIllIIll(String string) {
        ZipFile zipFile = this.lIlllIlllIIIIlIIlllIllIII();
        ZipEntry zipEntry = zipFile.getEntry(string);
        if (zipEntry == null) {
            throw new class_1017(this.lllIIIllIIIIlllIlIIllIIll, string);
        }
        return zipFile.getInputStream(zipEntry);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        try {
            return this.lIlllIlllIIIIlIIlllIllIII().getEntry(string) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public Set lllIIIllIIIIlllIlIIllIIll() {
        ZipFile zipFile;
        try {
            zipFile = this.lIlllIlllIIIIlIIlllIllIII();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        HashSet hashSet = Sets.newHashSet();
        while (enumeration.hasMoreElements()) {
            ArrayList arrayList;
            ZipEntry zipEntry = enumeration.nextElement();
            String string = zipEntry.getName();
            if (!string.startsWith("assets/") || (arrayList = Lists.newArrayList((Iterable)lllIlIIlIIIlIlIIIllIlllIl.split((CharSequence)string))).size() <= 1) continue;
            String string2 = (String)arrayList.get(1);
            if (!string2.equals(string2.toLowerCase())) {
                this.IlIllllllIIlIIllllIIlIIIl(string2);
                continue;
            }
            hashSet.add(string2);
        }
        return hashSet;
    }

    protected void finalize() {
        this.close();
        super.finalize();
    }

    @Override
    public void close() {
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            this.IlIllllllIIlIIllllIIlIIIl.close();
            this.IlIllllllIIlIIllllIIlIIIl = null;
        }
    }
}

