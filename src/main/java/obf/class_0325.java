package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;

import java.awt.Color;

public class class_0325
extends class_2117 {
    private Setting lllIIIllIIIIlllIlIIllIIll;

    public class_0325(Setting class_16092, float f) {
        super(f);
        this.lllIIIllIIIIlllIlIIllIIll = class_16092;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 12;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        LunarClient.getInstance().ubuntuMedium16px.lllIIIllIIIIlllIlIIllIIll(((String)this.lllIIIllIIIIlllIlIIllIIll.getValue()).toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + 2, (float)(this.IlIIIIIllllllIIlllIllllll + 2), new Color(1.0f, 1.0f, 1.0f, 0.9f).getRGB());
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 2, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2 - 20, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + 1, 0x1F2F2F2F);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
    }
}

