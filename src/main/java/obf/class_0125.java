package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Throwables
 */
import com.google.common.base.Throwables;
import com.moonsworth.lunar.client.config.Setting;
import net.minecraft.client.Minecraft;

public class class_0125
extends AbstractModule {
    private Setting lllIIIllIIIIlllIlIIllIIll;
    private Setting lllIlIIlIIIlIlIIIllIlllIl;

    public class_0125() {
        super("Motion Blur");
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Amount").setValue(1).setMinMax((Object)1, (Object)10);
        this.lllIlIIlIIIlIlIIIllIlllIl = new Setting(this, "Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll("Motion Blur", 1.1f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        if (this.lIIlIIIIIlIlllIlIIlIlIlll.lllllIlllIIllIlIIlIIIllII == null && !this.lIIlIIIIIlIlllIlIIlIlIlll.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll()) {
            this.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll() {
        this.lIIlIIIIIlIlllIlIIlIlIlll.lIIlIIIIIlIlllIlIIlIlIlll.lIllllIIlIIIlIllllllIIIll();
        class_1711 class_17112 = Minecraft.getMinecraft().lIIlIIIIIlIlllIlIIlIlIlll.IllIIlllllllIIlIIlIIIIlIl();
        try {
            if (this.lIIlIIIIIlIlllIlIIlIlIlll.lIIlIIIIIlIlllIlIIlIlIlll.lllIIIllIIIIlllIlIIllIIll() && this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII != null) {
                for (class_1649 class_16492 : class_17112.IlIllllllIIlIIllllIIlIIIl()) {
                    class_0900 class_09002 = class_16492.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl("Phosphor");
                    if (class_09002 == null) continue;
                    float f = 0.7f + (float)((Integer)this.lllIIIllIIIIlllIlIIllIIll.getValue()).intValue() / 100.0f * 3.0f - 0.01f;
                    int n = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
                    float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
                    float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
                    float f4 = (float)(n & 0xFF) / 255.0f;
                    class_09002.lllIIIllIIIIlllIlIIllIIll(f * f2, f * f3, f * f4);
                }
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Throwables.propagate((Throwable)illegalArgumentException);
        }
    }
}

