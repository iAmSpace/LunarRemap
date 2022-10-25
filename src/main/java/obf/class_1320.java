package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.util.Comparator;

public class class_1320
implements Comparator {
    public int compare(Object object, Object object2) {
        class_0698 class_06982 = (class_0698)object;
        class_0698 class_06983 = (class_0698)object2;
        return class_06982.lIIlIIIIIlIlllIlIIlIlIlll != class_06983.lIIlIIIIIlIlllIlIIlIlIlll ? class_06983.lIIlIIIIIlIlllIlIIlIlIlll - class_06982.lIIlIIIIIlIlllIlIIlIlIlll : (!Config.lllIIIllIIIIlllIlIIllIIll((Object)class_06982.lllIlIIlIIIlIlIIIllIlllIl, (Object)class_06983.lllIlIIlIIIlIlIIIllIlllIl) ? class_06982.lllIlIIlIIIlIlIIIllIlllIl.compareTo(class_06983.lllIlIIlIIIlIlIIIllIlllIl) : class_06982.lllIIIllIIIIlllIlIIllIIll.compareTo(class_06983.lllIIIllIIIIlllIlIIllIIll));
    }
}

