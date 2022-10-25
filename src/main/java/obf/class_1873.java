package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_1873
extends class_0759 {
    private final class_0115 IIIllIIlIIIIIIlIlIIllIIlI;
    private final class_1746 IllIIlllllllIIlIIlIIIIlIl;
    private final class_0894 IIIllIllIIlIlIlIlIllllIIl;
    private static final ResourceLocation IllIIIllIIIIlIlIlIllIIlll = new ResourceLocation("client/icons/garbage-26.png");
    private static final ResourceLocation lIIIIlIlIIlllllIIllIIlIII = new ResourceLocation("client/logo_32.png");

    public class_1873(class_0115 class_01152) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01152;
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1746(1500L);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0894(200L);
        this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        Object object;
        if (bl && this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -13750738);
        }
        GL11.glPushMatrix();
        class_0064 class_00642 = LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI();
        if (class_00642.lIlllIlllIIIIlIIlllIllIII().containsKey(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl())) {
            object = (List)class_00642.lIlllIlllIIIIlIIlllIllIII().get(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl());
            if (object != null && object.size() > 0) {
                if (!this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII()) {
                    this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
                }
                class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, new Color(0.89f, 0.54f, 0.05f, 0.65f * (0.154f + this.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl())).getRGB());
                LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl(object.size() + "", this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 15.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 6.0f, -1);
            } else if (this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII() && this.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll()) {
                this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll();
            }
        }
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl - 0.5f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, -1357572843);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + 0.5f, -1357572843);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 3.0f, this.lllIIIllIIIIlllIlIIllIIll + 20.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 19.0f, this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI() ? class_0115.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIllIIlIlIlIlIllllIIl()) : -13158601);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII().startsWith(EnumChatFormatting.RED.toString())) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(lIIIIlIlIIlllllIIllIIlIII, 6.5f, this.lllIIIllIIIIlllIlIIllIIll + 24.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 4.0f);
            LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll + 40.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 2.0f, -1);
            LunarClient.getInstance().robotoBold12px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.lllIIIllIIIIlllIlIIllIIll + 40.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 11.0f, -5460820);
        } else {
            LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(), this.lllIIIllIIIIlllIlIIllIIll + 24.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 2.0f, -1);
            LunarClient.getInstance().robotoBold12px.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), this.lllIIIllIIIIlllIlIIllIIll + 24.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 11.0f, -5460820);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        object = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.getTextWithoutFormattingCodes(this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII()), this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl());
        class_0857.lllIIIllIIIIlllIlIIllIIll((ResourceLocation)object, 7.0f, this.lllIIIllIIIIlllIlIIllIIll + 5.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 4.0f);
        boolean bl2 = bl && this.lllIIIllIIIIlllIlIIllIIll(f, f2) && f > this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 20.0f;
        float f3 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(bl2);
        float f4 = this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 20.5f * f3;
        class_0210.lllIIIllIIIIlllIlIIllIIll(f4, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -52429);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.9f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(IllIIIllIIIIlIlIlIllIIlll, f4 + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 5.0f, 12.0f, 12.0f);
        GL11.glPopMatrix();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        boolean bl2;
        if (!bl) {
            return false;
        }
        boolean bl3 = bl2 = this.lllIIIllIIIIlllIlIIllIIll(f, f2) && f > this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 20.0f && bl;
        if (bl2 && this.IIIllIllIIlIlIlIlIllllIIl.IlIIIIIllllllIIlllIllllll()) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll((class_0688)new class_1375(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl()));
            class_0713.IlIlllIIIIIIlIIllIIllIlll().IlIlIIlIlIllIIlIlIIllIIIl().IllIIIllIIIIlIlIlIllIIlll().add(this);
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll().remove(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl());
            return true;
        }
        if (!bl2 && this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            class_0713.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
            LunarClient.getInstance().llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI.IlIllllllIIlIIllllIIlIIIl());
            return true;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
    }

    public class_0115 IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

