package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;

public class class_1927
extends class_0365 {
    public class_1927(File file, String string, boolean bl) {
        super(file, string, bl);
    }

    @Override
    public class_1831 lllIIIllIIIIlllIlIIllIIll(class_1163 class_11632) {
        File file = this.lIllllIIlIIIlIllllllIIIll();
        if (class_11632 instanceof class_1439) {
            File file2 = new File(file, "DIM-1");
            file2.mkdirs();
            return new class_1552(file2);
        }
        if (class_11632 instanceof class_1863) {
            File file3 = new File(file, "DIM1");
            file3.mkdirs();
            return new class_1552(file3);
        }
        return new class_1552(file);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0770 class_07702, class_0775 class_07752) {
        class_07702.lIlllIlllIIIIlIIlllIllIII(19133);
        super.lllIIIllIIIIlllIlIIllIIll(class_07702, class_07752);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        try {
            class_0829.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        class_1266.lllIIIllIIIIlllIlIIllIIll();
    }
}

