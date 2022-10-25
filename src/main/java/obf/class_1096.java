package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;

import java.awt.Color;

public class class_1096
extends class_2117 {
    private final int lllIIIllIIIIlllIlIIllIIll;
    private final class_1194 IllIIlllllllIIlIIlIIIIlIl;
    private final class_0730 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0730 IllIIIllIIIIlIlIlIllIIlll;
    private final class_0730 lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlllIllIllllIIIlIIIIII = 0;
    private ResourceLocation llIIllIllIlIIlIIllIllllll = new ResourceLocation("client/icons/right.png");

    public class_1096(class_1194 class_11942, int n, float f) {
        super(f);
        this.IllIIlllllllIIlIIlIIIIlIl = class_11942;
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0730(0x4FFFFFFF, -1);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0730(0x40000000, 444958085);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(0x40000000, 444958085);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll(n, n2);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI, this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB(), this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB(), this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB());
        LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll("Settings | Shout out @strokedketchup @NonoTv_ | Cucklord.pro".toUpperCase(), (float)this.lIlllIlllIIIIlIIlllIllIII + 14.0f, (float)this.IlIIIIIllllllIIlllIllllll + 3.0f, Color.WHITE.getRGB());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
    }
}

