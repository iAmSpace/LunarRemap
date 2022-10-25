package obf;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1196
extends class_0123 {
    private final class_1860 lIIIIlIlIIlllllIIllIIlIII;
    private float llIIlllIllIllllIIIlIIIIII = 0.0f;

    public class_1196(class_1860 class_18602) {
        super(new ResourceLocation("minecraft:minecart.base"));
        this.lIIIIlIlIIlllllIIllIIlIII = class_18602;
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        this.IIIllIllIIlIlIlIlIllllIIl = 0;
    }

    @Override
    public void lIIIIlIlIIlllllIIllIIlIII() {
        if (this.lIIIIlIlIIlllllIIllIIlIII.IllllIIIIlIIlIIIIlllIIIIl) {
            this.lllIIIllIIIIlllIlIIllIIll = true;
        } else {
            this.IlIIIIIllllllIIlllIllllll = (float)this.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll;
            this.lIllllIIlIIIlIllllllIIIll = (float)this.lIIIIlIlIIlllllIIllIIlIII.llIIlIlIlllIIllIlIlllIllI;
            this.IIIllIIlIIIIIIlIlIIllIIlI = (float)this.lIIIIlIlIIlllllIIllIIlIII.IllIIIIllIIllIllIlllIlIIl;
            float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII.IIIIIIIIlIllIIllIIlllIllI * this.lIIIIlIlIIlllllIIllIIlIII.IIIIIIIIlIllIIllIIlllIllI + this.lIIIIlIlIIlllllIIllIIlIII.llIIIlllIlllIlIllIIIIllIl * this.lIIIIlIlIIlllllIIllIIlIII.llIIIlllIlllIlIllIIIIllIl);
            if ((double)f >= 0.01) {
                this.llIIlllIllIllllIIIlIIIIII = MathHelper.clamp_float(this.llIIlllIllIllllIIIlIIIIII + 0.0025f, 0.0f, 1.0f);
                this.IlIllllllIIlIIllllIIlIIIl = 0.0f + MathHelper.clamp_float(f, 0.0f, 0.5f) * 0.7f;
            } else {
                this.llIIlllIllIllllIIIlIIIIII = 0.0f;
                this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
            }
        }
    }
}

