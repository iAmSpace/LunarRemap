package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.function.Supplier;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import com.moonsworth.lunar.client.font.LCFontRenderer;
import org.lwjgl.opengl.GL11;

public class class_0980
extends class_0759 {
    private ResourceLocation IllIIlllllllIIlIIlIIIIlIl;
    private String IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private final class_0730 lIIIIlIlIIlllllIIllIIlIII;
    private final class_0730 llIIlllIllIllllIIIlIIIIII;
    private final class_0730 llIIllIllIlIIlIIllIllllll;
    private LCFontRenderer lllIIlIIIllllllIIIIlIlIlI;
    private float IlIlllIIIIIIlIIllIIllIlll;
    public Supplier IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0980(ResourceLocation class_17732) {
        this.lllIIlIIIllllllIIIIlIlIlI = LunarClient.getInstance().robotoRegular13px;
        this.IlIlllIIIIIIlIIllIIllIlll = 4.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = () -> false;
        this.IllIIlllllllIIlIIlIIIIlIl = class_17732;
        this.IlIlllIIIIIIlIIllIIllIlll = 4.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(0x4FFFFFFF, -1);
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(0x40000000, 444958085);
        this.llIIllIllIlIIlIIllIllllll = new class_0730(0x40000000, 444958085);
    }

    public class_0980(float f, ResourceLocation class_17732) {
        this.lllIIlIIIllllllIIIIlIlIlI = LunarClient.getInstance().robotoRegular13px;
        this.IlIlllIIIIIIlIIllIIllIlll = 4.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = () -> false;
        this.IllIIlllllllIIlIIlIIIIlIl = class_17732;
        this.IlIlllIIIIIIlIIllIIllIlll = f;
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(0x4FFFFFFF, -1);
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(0x40000000, 444958085);
        this.llIIllIllIlIIlIIllIllllll = new class_0730(0x40000000, 444958085);
    }

    public class_0980(String string) {
        this(string, LunarClient.getInstance().robotoRegular13px);
    }

    public class_0980(String string, LCFontRenderer class_09542) {
        this.lllIIlIIIllllllIIIIlIlIlI = LunarClient.getInstance().robotoRegular13px;
        this.IlIlllIIIIIIlIIllIIllIlll = 4.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = () -> false;
        this.IIIllIllIIlIlIlIlIllllIIl = string;
        this.IllIIIllIIIIlIlIlIllIIlll = true;
        this.lllIIlIIIllllllIIIIlIlIlI = class_09542;
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(0x4FFFFFFF, -1);
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(0x40000000, 444958085);
        this.llIIllIllIlIIlIIllIllllll = new class_0730(0x40000000, 444958085);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = bl && this.lllIIIllIIIIlllIlIIllIIll(f, f2);
        if (((Boolean)this.IIIllIIlIIIIIIlIlIIllIIlI.get()).booleanValue()) {
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(bl2).darker().darker().getRGB(), this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(bl2).darker().darker().getRGB(), this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(bl2).darker().darker().getRGB());
        } else {
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB());
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIllIIlIlIlIlIllllIIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 3.0f, (Boolean)this.IIIllIIlIIIIIIlIlIIllIIlI.get() != false ? Color.LIGHT_GRAY.darker().getRGB() : -1);
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.8f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, this.IlIlllIIIIIIlIIllIIllIlll, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f - this.IlIlllIIIIIIlIIllIIllIlll, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII / 2.0f - this.IlIlllIIIIIIlIIllIIllIlll);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_17732;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IIIllIllIIlIlIlIlIllllIIl = string;
    }
}

