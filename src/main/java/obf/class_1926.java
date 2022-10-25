package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.awt.image.BufferedImage;

class class_1926
implements class_0702 {
    final /* synthetic */ class_1193 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_0169 lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ MinecraftProfileTexture.Type IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ ResourceLocation lIlllIlllIIIIlIIlllIllIII;
    final /* synthetic */ class_0030 IlIIIIIllllllIIlllIllllll;

    class_1926(class_0030 class_00302, class_1193 class_11932, class_0169 class_01692, MinecraftProfileTexture.Type type, ResourceLocation class_17732) {
        this.IlIIIIIllllllIIlllIllllll = class_00302;
        this.lllIIIllIIIIlllIlIIllIIll = class_11932;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01692;
        this.IlIllllllIIlIIllllIIlIIIl = type;
        this.lIlllIlllIIIIlIIlllIllIII = class_17732;
    }

    @Override
    public BufferedImage lllIIIllIIIIlllIlIIllIIll(BufferedImage bufferedImage) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            bufferedImage = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(bufferedImage);
        }
        return bufferedImage;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
        }
    }
}

