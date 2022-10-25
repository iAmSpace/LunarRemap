package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class class_0968
extends class_0759 {
    public static final class_1354 IIIllIIlIIIIIIlIlIIllIIlI = LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll();
    private ResourceLocation IllIIlllllllIIlIIlIIIIlIl;
    private String IIIllIllIIlIlIlIlIllllIIl;
    private final class_0730 IllIIIllIIIIlIlIlIllIIlll;
    private final class_0730 lIIIIlIlIIlllllIIllIIlIII;
    private final class_0730 llIIlllIllIllllIIIlIIIIII;
    private final class_0730 llIIllIllIlIIlIIllIllllll;
    private final class_0730 lllIIlIIIllllllIIIIlIlIlI;
    private final class_0730 IlIlllIIIIIIlIIllIIllIlll;
    private final class_0847 IlIlIIlIlIllIIlIlIIllIIIl;
    private float lllllIlllIIllIlIIlIIIllII;
    private boolean IlIlIIlllIIlIllIIIlllllIl;
    private final class_1546 lIIlIIIIIlIlllIlIIlIlIlll;
    private final class_1326 lIlIlIIlIIIIlIIIIIlllIIII;
    private float IlIIIlIIIIllIIIllIIIIIIll;

    public class_0968(class_1546 class_15462, String string, ResourceLocation class_17732) {
        this.lIIlIIIIIlIlllIlIIlIlIlll = class_15462;
        this.IllIIlllllllIIlIIlIIIIlIl = class_17732;
        this.IIIllIllIIlIlIlIlIllllIIl = string;
        this.lIlIlIIlIIIIlIIIIIlllIIII = new class_1326(this);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0730(0x4FFFFFFF, -1);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(0x40000000, 444958085);
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(0x40000000, 444958085);
        this.llIIllIllIlIIlIIllIllllll = new class_0730(0x4FFFFFFF, -1);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0730(new Color(0.8f, 0.15f, 0.15f, 0.25f).getRGB(), new Color(0.8f, 0.15f, 0.15f, 0.15f).getRGB());
        this.IlIlllIIIIIIlIIllIIllIlll = new class_0730(new Color(0.8f, 0.15f, 0.15f, 0.25f).getRGB(), new Color(0.8f, 0.15f, 0.15f, 0.15f).getRGB());
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_0847(300L);
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
        Keyboard.enableRepeatEvents((boolean)true);
        if (this.lllllIlllIIllIlIIlIIIllII == 0.0f) {
            this.lllllIlllIIllIlIIlIIIllII = f4;
        }
        this.IlIIIlIIIIllIIIllIIIIIIll = Math.min((IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll().size() + 1) * 16 + 12, 120);
        this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(f + f3 - 5.0f, f2 + this.lllllIlllIIllIlIIlIIIllII + 6.0f, 4.0f, this.IlIIIlIIIIllIIIllIIIIIIll - 7.0f);
        this.lIlIlIIlIIIIlIIIIIlllIIII.IlIIIIIllllllIIlllIllllll((IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll().size() + 1) * 16 + 4);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = bl && this.lllIIIllIIIIlllIlIIllIIll(f, f2);
        if (!IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl()) {
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII, this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB());
        } else {
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII, this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB());
        }
        float f3 = 6.0f;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, f3, this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII / 2.0f - f3);
        LunarClient.getInstance().robotoRegular13px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, this.lllIIIllIIIIlllIlIIllIIll + 22.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 4.5f, -1342177281);
        float f4 = this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl);
        if (this.IlIlIIlIlIllIIlIlIIllIIIl.IIIllIIlIIIIIIlIlIIllIIlI()) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lllllIlllIIllIlIIlIIIllII + this.IlIIIlIIIIllIIIllIIIIIIll * f4);
            this.IlIlIIlllIIlIllIIIlllllIl = true;
        } else if (!this.IlIlIIlIlIllIIlIlIIllIIIl.IIIllIIlIIIIIIlIlIIllIIlI() && !this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IlIlIIlllIIlIllIIIlllllIl = false;
        }
        if (this.IlIlIIlllIIlIllIIIlllllIl) {
            boolean bl4;
            float f5 = 0.5f;
            float f6 = this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + f5;
            float f7 = this.lllIlIIlIIIlIlIIIllIlllIl + 5.0f + this.lllllIlllIIllIlIIlIIIllII;
            if (f6 > f7) {
                class_0210.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll + 1.0f, f7, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 1.0f, f6, f5, 0x4FFFFFFF, 444958085);
            }
            GL11.glPushMatrix();
            GL11.glEnable((int)3089);
            class_0857.lllIIIllIIIIlllIlIIllIIll((int)this.lllIIIllIIIIlllIlIIllIIll, (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII), (int)(this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII + 7.0f + (this.lIlllIlllIIIIlIIlllIllIII - this.lllllIlllIIllIlIIlIIIllII - 6.0f) * f4), (float)((int)((float)this.lIIlIIIIIlIlllIlIIlIlIlll.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * this.lIIlIIIIIlIlllIlIIlIlIlll.IlIIIIIllllllIIlllIllllll())), (int)this.lIIlIIIIIlIlllIlIIlIlIlll.IIIllIIlIIIIIIlIlIIllIIlI());
            this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl(f, f2, bl);
            int n = 1;
            for (class_2051 class_20512 : LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll()) {
                if (class_20512.IlIIIIIllllllIIlllIllllll() == null) continue;
                bl4 = class_20512.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl() == null;
                float f8 = this.lllIIIllIIIIlllIlIIllIIll;
                float f9 = this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl;
                float f10 = this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII + (float)(n * 16) - 8.0f;
                float f11 = f10 + 16.0f;
                boolean bl5 = f > f8 && f < f9 && f2 - this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIlllllllIIlIIlIIIIlIl() > f10 && f2 - this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIlllllllIIlIIlIIIIlIl() < f11 && bl && !this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(f, f2) && !this.lIlIlIIlIIIIlIIIIIlllIIII.llIIlllIllIllllIIIlIIIIII();
                GL11.glColor4f((float)(bl4 ? 0.8f : 1.0f), (float)(bl4 ? 0.15f : 1.0f), (float)(bl4 ? 0.15f : 1.0f), (float)(bl5 ? 0.5f : 0.3f));
                class_0857.lllIIIllIIIIlllIlIIllIIll(class_20512.lIllllIIlIIIlIllllllIIIll(), f3, this.lllIIIllIIIIlllIlIIllIIll + 4.0f, f10 + 8.0f - f3);
                LunarClient.getInstance().robotoRegular13px.lllIIIllIIIIlllIlIIllIIll(class_20512.IlIIIIIllllllIIlllIllllll().lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll + 22.0f, f10 + 4.0f, bl5 ? (bl4 ? -2130771968 : -1) : (bl4 ? 452919296 : -1342177281));
                ++n;
            }
            float f12 = this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII + (float)(n * 16) - 8.0f;
            float f13 = f12 + 16.0f;
            bl4 = f > this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f - 3.0f && f < this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f + 3.0f && f2 - this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIlllllllIIlIIlIIIIlIl() > f12 && f2 - this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIlllllllIIlIIlIIIIlIl() < f13 && bl && !this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(f, f2) && !this.lIlIlIIlIIIIlIIIIIlllIIII.llIIlllIllIllllIIIlIIIIII();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(bl4 ? 1.0f : 0.7f));
            class_0857.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/plus-64.png"), 4.0f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl / 2.0f - 3.0f, f12 + f3 / 2.0f);
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
            GL11.glDisable((int)3089);
            GL11.glPopMatrix();
        }
    }

    public float IlIIIIIllllllIIlllIllllll(float f) {
        return 22.0f + f + 10.0f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl.IlIIIlIIIIllIIIllIIIIIIll()) {
            boolean bl2;
            float f3;
            float f4;
            this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
            int n2 = 1;
            for (class_2051 class_20512 : LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll()) {
                boolean bl3;
                f4 = this.lllIIIllIIIIlllIlIIllIIll;
                f3 = this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl;
                float f5 = this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII + (float)(n2 * 16) - 8.0f;
                float f6 = f5 + 16.0f;
                boolean bl4 = bl3 = f > f4 && f < f3 && f2 - this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIlllllllIIlIIlIIIIlIl() > f5 && f2 - this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIlllllllIIlIIlIIIIlIl() < f6 && !this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(f, f2) && !this.lIlIlIIlIIIIlIIIIIlllIIII.llIIlllIllIllllIIIlIIIIII();
                if (bl3) {
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                    if (LunarClient.getInstance().IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll(class_20512)) {
                        this.IIIllIllIIlIlIlIlIllllIIl();
                    } else {
                        Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_1893(false, class_20512.IlIIIIIllllllIIlllIllllll().lllIlIIlIIIlIlIIIllIlllIl(), true));
                        return false;
                    }
                }
                ++n2;
            }
            float f7 = this.lllIIIllIIIIlllIlIIllIIll;
            float f8 = this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl;
            f4 = this.lllIlIIlIIIlIlIIIllIlllIl + this.lllllIlllIIllIlIIlIIIllII + (float)(n2 * 16) - 8.0f;
            f3 = f4 + 16.0f;
            boolean bl5 = bl2 = f > f7 && f < f8 && f2 - this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIlllllllIIlIIlIIIIlIl() > f4 && f2 - this.lIlIlIIlIIIIlIIIIIlllIIII.IllIIlllllllIIlIIlIIIIlIl() < f3 && !this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(f, f2) && !this.lIlIlIIlIIIIlIIIIIlllIIII.llIIlllIllIllllIIIlIIIIII();
            if (bl2) {
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_1893(false, "", false));
            }
        }
        return false;
    }

    private void IIIllIllIIlIlIlIlIllllIIl() {
        class_2051 class_20512 = IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_20512.lIllllIIlIIIlIllllllIIIll());
        this.IIIllIllIIlIlIlIlIllllIIl = class_20512.IlIIIIIllllllIIlllIllllll().lIlllIlllIIIIlIIlllIllIII();
    }

    public void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_17732;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IIIllIllIIlIlIlIlIllllIIl = string;
    }
}

