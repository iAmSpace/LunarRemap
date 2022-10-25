package obf;

import optifine.Config;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1363 {
    public int lllIIIllIIIIlllIlIIllIIll = 1;
    public boolean lllIlIIlIIIlIlIIIllIlllIl = false;

    public class_1363(String string) {
        if (string.equals("4")) {
            this.lllIIIllIIIIlllIlIIllIIll = 4;
        } else if (string.equals("2")) {
            this.lllIIIllIIIIlllIlIIllIIll = 2;
        } else if (string.equals("F")) {
            this.lllIlIIlIIIlIlIIIllIlllIl = true;
        } else if (string.equals("4F")) {
            this.lllIIIllIIIIlllIlIIllIIll = 4;
            this.lllIlIIlIIIlIlIIIllIlllIl = true;
        } else if (string.equals("2F")) {
            this.lllIIIllIIIIlllIlIIllIIll = 2;
            this.lllIlIIlIIIlIlIIIllIlllIl = true;
        } else {
            Config.lllIlIIlIIIlIlIIIllIlllIl("NaturalTextures: Unknown type: " + string);
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll != 2 && this.lllIIIllIIIIlllIlIIllIIll != 4 ? this.lllIlIIlIIIlIlIIIllIlllIl : true;
    }
}

