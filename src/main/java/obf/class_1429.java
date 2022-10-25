package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.commons.io.filefilter.DirectoryFileFilter
 */
import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

public class class_1429
extends class_0821 {
    public class_1429(File file) {
        super(file);
    }

    @Override
    protected InputStream lllIIIllIIIIlllIlIIllIIll(String string) {
        return new BufferedInputStream(new FileInputStream(new File(this.lllIIIllIIIIlllIlIIllIIll, string)));
    }

    @Override
    protected boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return new File(this.lllIIIllIIIIlllIlIIllIIll, string).isFile();
    }

    @Override
    public Set lllIIIllIIIIlllIlIIllIIll() {
        HashSet hashSet = Sets.newHashSet();
        File file = new File(this.lllIIIllIIIIlllIlIIllIIll, "assets/");
        if (file.isDirectory()) {
            for (File file2 : file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY)) {
                String string = class_1429.lllIIIllIIIIlllIlIIllIIll(file, file2);
                if (!string.equals(string.toLowerCase())) {
                    this.IlIllllllIIlIIllllIIlIIIl(string);
                    continue;
                }
                hashSet.add(string.substring(0, string.length() - 1));
            }
        }
        return hashSet;
    }
}

