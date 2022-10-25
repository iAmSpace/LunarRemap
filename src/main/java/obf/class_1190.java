package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1190
extends class_1006 {
    public final class_0775 lllIIIllIIIIlllIlIIllIIll;
    public final String lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0526 IlIllllllIIlIIllllIIlIIIl;

    public class_1190(class_0526 class_05262, class_0775 class_07752) {
        this.IlIllllllIIlIIllllIIlIIIl = class_05262;
        super(class_07752.lIllllIIlIIIlIllllllIIIll("Weight"));
        class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Properties");
        String string = class_07752.IllIIIllIIIIlIlIlIllIIlll("Type");
        if (string.equals("Minecart")) {
            if (class_07753 != null) {
                switch (class_07753.lIllllIIlIIIlIllllllIIIll("Type")) {
                    case 0: {
                        string = "MinecartRideable";
                        break;
                    }
                    case 1: {
                        string = "MinecartChest";
                        break;
                    }
                    case 2: {
                        string = "MinecartFurnace";
                    }
                }
            } else {
                string = "MinecartRideable";
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll = class_07753;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public class_1190(class_0526 class_05262, class_0775 class_07752, String string) {
        this.IlIllllllIIlIIllllIIlIIIl = class_05262;
        super(1);
        if (string.equals("Minecart")) {
            if (class_07752 != null) {
                switch (class_07752.lIllllIIlIIIlIllllllIIIll("Type")) {
                    case 0: {
                        string = "MinecartRideable";
                        break;
                    }
                    case 1: {
                        string = "MinecartChest";
                        break;
                    }
                    case 2: {
                        string = "MinecartFurnace";
                    }
                }
            } else {
                string = "MinecartRideable";
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll = class_07752;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public class_0775 lllIIIllIIIIlllIlIIllIIll() {
        class_0775 class_07752 = new class_0775();
        class_07752.lllIIIllIIIIlllIlIIllIIll("Properties", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Type", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Weight", this.lIlllIlllIIIIlIIlllIllIII);
        return class_07752;
    }
}

