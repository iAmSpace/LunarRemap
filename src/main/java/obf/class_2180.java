package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.FilenameFilter;

class class_2180
implements FilenameFilter {
    final /* synthetic */ class_0720 lllIIIllIIIIlllIlIIllIIll;

    class_2180(class_0720 class_07202) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07202;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".mcr");
    }
}

