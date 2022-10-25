package obf;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1735
extends class_0123 {
    private final class_0814 lIIIIlIlIIlllllIIllIIlIII;
    private final class_1860 llIIlllIllIllllIIIlIIIIII;

    public class_1735(class_0814 class_08142, class_1860 class_18602) {
        super(new ResourceLocation("minecraft:minecart.inside"));
        this.lIIIIlIlIIlllllIIllIIlIII = class_08142;
        this.llIIlllIllIllllIIIlIIIIII = class_18602;
        this.IllIIIllIIIIlIlIlIllIIlll = AttenuationType.NONE;
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        this.IIIllIllIIlIlIlIlIllllIIl = 0;
    }

    @Override
    public void lIIIIlIlIIlllllIIllIIlIII() {
        if (!this.llIIlllIllIllllIIIlIIIIII.IllllIIIIlIIlIIIIlllIIIIl && this.lIIIIlIlIIlllllIIllIIlIII.lIlIlIIllIIIlllIllIIlIllI() && this.lIIIIlIlIIlllllIIllIIlIII.IlIIIlIIIIllIIIllIIIIIIll == this.llIIlllIllIllllIIIlIIIIII) {
            float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII.IIIIIIIIlIllIIllIIlllIllI * this.llIIlllIllIllllIIIlIIIIII.IIIIIIIIlIllIIllIIlllIllI + this.llIIlllIllIllllIIIlIIIIII.llIIIlllIlllIlIllIIIIllIl * this.llIIlllIllIllllIIIlIIIIII.llIIIlllIlllIlIllIIIIllIl);
            this.IlIllllllIIlIIllllIIlIIIl = (double)f >= 0.01 ? 0.0f + MathHelper.clamp_float(f, 0.0f, 1.0f) * 0.75f : 0.0f;
        } else {
            this.lllIIIllIIIIlllIlIIllIIll = true;
        }
    }
}

