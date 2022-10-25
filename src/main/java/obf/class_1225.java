package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.FileFilter;

final class class_1225
implements FileFilter {
    class_1225() {
    }

    @Override
    public boolean accept(File file) {
        boolean bl = file.isFile() && file.getName().endsWith(".zip");
        boolean bl2 = file.isDirectory() && new File(file, "pack.mcmeta").isFile();
        return bl || bl2;
    }
}

