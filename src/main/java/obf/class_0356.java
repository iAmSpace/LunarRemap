package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0356
implements class_1923 {
    private final Random lllIIIllIIIIlllIlIIllIIll = new Random();
    private final Minecraft lllIlIIlIIIlIlIIIllIlllIl;
    private class_0308 IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII = 100;

    public class_0356(Minecraft class_06672) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06672;
    }

    @Override
    public void lIIIIlIlIIlllllIIllIIlIII() {
        class_0260 class_02602 = this.lllIlIIlIIIlIlIIIllIlllIl.llIlllIlIIllIlIIIIllIIlIl();
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            if (!class_02602.lllIIIllIIIIlllIlIIllIIll().equals(this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll())) {
                this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIlllllIlIlllIlllllII().lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl);
                this.lIlllIlllIIIIlIIlllIllIII = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 0, class_02602.lllIlIIlIIIlIlIIIllIlllIl() / 2);
            }
            if (!this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIlllllIlIlllIlllllII().IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl)) {
                this.IlIllllllIIlIIllllIIlIIIl = null;
                this.lIlllIlllIIIIlIIlllIllIII = Math.min(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_02602.lllIlIIlIIIlIlIIIllIlllIl(), class_02602.IlIllllllIIlIIllllIIlIIIl()), this.lIlllIlllIIIIlIIlllIllIII);
            }
        }
        if (this.IlIllllllIIlIIllllIIlIIIl == null && this.lIlllIlllIIIIlIIlllIllIII-- <= 0) {
            this.IlIllllllIIlIIllllIIlIIIl = class_0132.lllIIIllIIIIlllIlIIllIIll(class_02602.lllIIIllIIIIlllIlIIllIIll());
            this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
            this.lIlllIlllIIIIlIIlllIllIII = Integer.MAX_VALUE;
        }
    }
}

