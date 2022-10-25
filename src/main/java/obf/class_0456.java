package obf;

import net.minecraft.util.ResourceLocation;

/*
 * Decompiled with CFR 0.150.
 */
class class_0456
implements class_0951 {
    final ResourceLocation lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ String lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_2190 IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ class_1300 lIlllIlllIIIIlIIlllIllIII;

    class_0456(class_1300 class_13002, String string, class_2190 class_21902) {
        this.lIlllIlllIIIIlIIlllIllIII = class_13002;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = class_21902;
        this.lllIIIllIIIIlllIlIIllIIll = new ResourceLocation(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        class_1329 class_13292 = (class_1329)class_1300.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        return class_13292 == null ? 0 : class_13292.lllIIIllIIIIlllIlIIllIIll();
    }

    public class_1883 IlIllllllIIlIIllllIIlIIIl() {
        class_1329 class_13292 = (class_1329)class_1300.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        return class_13292 == null ? class_1300.lllIIIllIIIIlllIlIIllIIll : class_13292.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public /* synthetic */ Object lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl();
    }
}

