package obf;

import net.minecraft.item.Item;

/*
 * Decompiled with CFR 0.150.
 */
public enum class_0841 {
    lllIIIllIIIIlllIlIIllIIll,
    lllIlIIlIIIlIlIIIllIlllIl,
    IlIllllllIIlIIllllIIlIIIl,
    lIlllIlllIIIIlIIlllIllIII,
    IlIIIIIllllllIIlllIllllll,
    lIllllIIlIIIlIllllllIIIll,
    IIIllIIlIIIIIIlIlIIllIIlI,
    IllIIlllllllIIlIIlIIIIlIl,
    IIIllIllIIlIlIlIlIllllIIl,
    IllIIIllIIIIlIlIlIllIIlll,
    lIIIIlIlIIlllllIIllIIlIII;


    public boolean lllIIIllIIIIlllIlIIllIIll(Item class_06112) {
        if (this == lllIIIllIIIIlllIlIIllIIll) {
            return true;
        }
        if (this == IllIIIllIIIIlIlIlIllIIlll && class_06112.lIllllIIlIIIlIllllllIIIll()) {
            return true;
        }
        if (class_06112 instanceof class_0981) {
            if (this == lllIlIIlIIIlIlIIIllIlllIl) {
                return true;
            }
            class_0981 class_09812 = (class_0981)class_06112;
            return class_09812.IllIIIllIIIIlIlIlIllIIlll == 0 ? this == lIllllIIlIIIlIllllllIIIll : (class_09812.IllIIIllIIIIlIlIlIllIIlll == 2 ? this == lIlllIlllIIIIlIIlllIllIII : (class_09812.IllIIIllIIIIlIlIlIllIIlll == 1 ? this == IlIIIIIllllllIIlllIllllll : (class_09812.IllIIIllIIIIlIlIlIllIIlll == 3 ? this == IlIllllllIIlIIllllIIlIIIl : false)));
        }
        return class_06112 instanceof class_1531 ? this == IIIllIIlIIIIIIlIlIIllIIlI : (class_06112 instanceof class_1578 ? this == IllIIlllllllIIlIIlIIIIlIl : (class_06112 instanceof class_1964 ? this == lIIIIlIlIIlllllIIllIIlIII : (class_06112 instanceof class_1748 ? this == IIIllIllIIlIlIlIlIllllIIl : false)));
    }
}

