package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.Objects;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0036
extends class_2117 {
    private class_1665 lllIIIllIIIIlllIlIIllIIll;
    private class_0527 IllIIlllllllIIlIIlIIIIlIl;
    private class_0527 IIIllIllIIlIlIlIlIllllIIl;
    private class_0527 IllIIIllIIIIlIlIlIllIIlll;
    private class_1194 lIIIIlIlIIlllllIIllIIlIII;
    private final class_0730 llIIlllIllIllllIIIlIIIIII;
    private final class_0730 llIIllIllIlIIlIIllIllllll;

    public class_0036(class_1194 class_11942, class_1665 class_16652, float f) {
        super(f);
        this.lllIIIllIIIIlllIlIIllIIll = class_16652;
        this.lIIIIlIlIIlllllIIllIIlIII = class_11942;
        LCFontRenderer class_09542 = LunarClient.getInstance().robotoLight18px;
        LCFontRenderer class_09543 = LunarClient.getInstance().robotoMedium13px;
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0527(class_09542, null, "Options", this.lIlllIlllIIIIlIIlllIllIII + 4, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 20, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 4, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 6, -12418828, f);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0527(class_09543, null, class_16652.IlIlllIIIIIIlIIllIIllIlll() == null ? (class_16652.lllIIlIIIllllllIIIIlIlIlI() ? "Disable" : "Enable") : (class_16652.lllIIlIIIllllllIIIIlIlIlI() ? "Hide from HUD" : "Add to HUD"), this.lIlllIlllIIIIlIIlllIllIII + 4, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 38, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2 - 2, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 24, class_16652.lllIIlIIIllllllIIIIlIlIlI() ? -5756117 : -13916106, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_16652 != LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII && class_16652 != LunarClient.getInstance().getModuleManager().lIIIIlIlIIlllllIIllIIlIII);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0527(class_09543, null, class_16652.lIllllIIlIIIlIllllllIIIll() ? "Disable" : "Enable", this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2 + 2, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 38, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 4, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 24, class_16652.lIllllIIlIIIlIllllllIIIll() ? -5756117 : -13916106, f);
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(1000L, 0x4FFFFFFF, new Color(1.0f, 1.0f, 1.0f, 0.8f).getRGB());
        this.llIIllIllIlIIlIIllIllllll = new class_0730(1000L, new Color(0.3f, 0.0f, 0.0f, 0.4f).getRGB(), new Color(0.0f, 0.3f, 0.0f, 0.4f).getRGB());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        float f2;
        Object object;
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll();
        class_0857.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI, this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB(), this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB());
        LCFontRenderer class_09542 = LunarClient.getInstance().robotoLight18px;
        GL11.glPushMatrix();
        int n3 = 0;
        int n4 = 0;
        if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getModuleManager().IIIllIIlIIIIIIlIlIIllIIlI) {
            n3 = -10;
            object = "329/329";
            f2 = Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object);
            Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object, (float)((int)((float)(this.lIlllIlllIIIIlIIlllIllIII + 1 + this.lIllllIIlIIIlIllllllIIIll / 2) - f2 / 2.0f)), (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 18), -1);
        } else if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getModuleManager().lIllllIIlIIIlIllllllIIIll) {
            n4 = -30;
            Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("Speed II", (float)(this.lIlllIlllIIIIlIIlllIllIII + 8 + this.lIllllIIlIIIlIllllllIIIll / 2 - 20), (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 36), -1);
            Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("0:42", (float)(this.lIlllIlllIIIIlIIlllIllIII + 8 + this.lIllllIIlIIIlIllllllIIIll / 2 - 20), (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 26), -1);
        } else if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getModuleManager().IIIllIllIIlIlIlIlIllllIIl) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 20, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 44, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 20, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 6, 0x6F000000);
            Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("Score", this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 40, -1);
            Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("Steve", (float)(this.lIlllIlllIIIIlIIlllIllIII + 24), (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 28), -1);
            Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll("Alex", (float)(this.lIlllIlllIIIIlIIlllIllIII + 24), (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 18), -1);
            Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "0", this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 26, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 18, -1);
            Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.llIIllIllIlIIlIIllIllllll) + "1", this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 26, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 28, -1);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getModuleManager().IllIIIllIIIIlIlIlIllIIlll) {
            object = new class_0332("EnderPearl", 368, 9000L);
            ((class_0332)object).lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().getModuleManager().IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2 - 18, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 26 - 18, -1);
        } else if ((this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII() == null || this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII() == class_1528.lllIIIllIIIIlllIlIIllIIll) && this.lllIIIllIIIIlllIlIIllIIll != LunarClient.getInstance().getModuleManager().IIIllIllIIlIlIlIlIllllIIl) {
            object = "";
            if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII() == null) {
                f2 = 2.0f;
                for (String string : this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI().split(" ")) {
                    String string2 = string.substring(0, 1);
                    object = (String)object + (Objects.equals(object, "") ? string2 : string2.toLowerCase());
                }
            } else {
                f2 = this.lllIIIllIIIIlllIlIIllIIll.IIlllIlIlllIllIIIlllIIlIl();
                object = this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll();
            }
            GL11.glScalef((float)f2, (float)f2, (float)f2);
            float f3 = (float) Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object) * f2;
            if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII() == null) {
                Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl((String)object, (int)(((float)(this.lIlllIlllIIIIlIIlllIllIII + 1 + this.lIllllIIlIIIlIllllllIIIll / 2) - f3 / 2.0f) / f2), (int)((float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 32) / f2), -13750738);
            } else {
                Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll((String)object, (float)((int)(((float)(this.lIlllIlllIIIIlIIlllIllIII + 1 + this.lIllllIIlIIIlIllllllIIIll / 2) - f3 / 2.0f) / f2)), (float)((int)((float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 32) / f2)), -1);
            }
        } else if (this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII() == class_1528.lllIlIIlIIIlIlIIIllIlllIl) {
            float f4 = this.lllIIIllIIIIlllIlIIllIIll.lIIlIIIIIlIlllIlIIlIlIlll();
            f2 = this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIIlIllIIIlllllIl(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2) - f4 / 2.0f + (float)n4, (float)(this.IlIIIIIllllllIIlllIllllll + n3 + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 26) - f2 / 2.0f, f4, f2);
        }
        GL11.glPopMatrix();
        class_09542.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2) - 0.5f, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 4 + 1, 0x5F000000);
        class_09542.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI(), (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2) - 1.5f, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 4, -1);
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? "Disable" : "Enable";
        this.IllIIIllIIIIlIlIlIllIIlll.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
        int n5 = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? -5756117 : -13916106;
        this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll() == null ? (this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI() && this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? "Disable" : "Enable") : (this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI() && this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? "Hide from HUD" : "Add to HUD");
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI() && this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? -5756117 : -13916106;
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 4, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 20, this.lIllllIIlIIIlIllllllIIIll - 8, 16);
        this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 4, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 38, this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll ? this.lIllllIIlIIIlIllllllIIIll - 8 : this.lIllllIIlIIIlIllllllIIIll / 2 + 2, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 24 - (this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 38));
        this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl = this.IlIllllllIIlIIllllIIlIIIl;
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (!this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll) {
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2 + 8, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 38, this.lIllllIIlIIIlIllllllIIIll / 2 - 12, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 24 - (this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 38));
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            ((class_0914)class_0822.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll).IlIlllIIIIIIlIIllIIllIlll = false;
            ((class_0914)class_0822.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll).lllIIlIIIllllllIIIIlIlIlI = this.lIIIIlIlIIlllllIIllIIlIII;
            ((class_0914)class_0822.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll).IlIlIIlIlIllIIlIlIIllIIIl = this.lllIIIllIIIIlllIlIIllIIll;
            class_0822.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll = class_0822.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll;
        } else if (!this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll && this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(!this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll());
            this.IllIIIllIIIIlIlIlIllIIlll.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? "Disable" : "Enable";
            int n4 = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? -5756117 : -13916106;
            if (this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll()) {
                this.lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
            }
        } else if (this.IIIllIllIIlIlIlIlIllllIIl.IllIIIllIIIIlIlIlIllIIlll && this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            if (!this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll()) {
                this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(true);
                this.lllIlIIlIIIlIlIIIllIlllIl();
                if (this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll() == null) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
                } else {
                    Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_1998(class_0822.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll));
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(!this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI());
                if (this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI()) {
                    this.lllIlIIlIIIlIlIIIllIlllIl();
                    if (this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll() == null) {
                        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
                    } else {
                        Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_1998(class_0822.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll));
                    }
                } else if (this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll && this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll()) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(false);
                }
            }
            this.IIIllIllIIlIlIlIlIllllIIl.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll() == null ? (this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI() && this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? "Disable" : "Enable") : (this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI() && this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? "Hide from HUD" : "Add to HUD");
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI() && this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll() ? -5756117 : -13916106;
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll == LunarClient.getInstance().getModuleManager().llIIlllIllIllllIIIlIIIIII) {
            return;
        }
        for (class_1609 class_16092 : this.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII()) {
            if (class_16092.IllIIIllIIIIlIlIlIllIIlll() != class_1318.lIlllIlllIIIIlIIlllIllIII || !class_16092.lIllllIIlIIIlIllllllIIIll().toLowerCase().contains("color") || class_16092.lIllllIIlIIIlIllllllIIIll().toLowerCase().contains("background") || class_16092.lIllllIIlIIIlIllllllIIIll().toLowerCase().contains("pressed")) continue;
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            class_16092.lllIlIIlIIIlIlIIIllIlllIl(LunarClient.getInstance().getSettingsManager().lllIIIIIIlIlllIIlIlIIIllI.lIlllIlllIIIIlIIlllIllIII());
        }
    }
}

