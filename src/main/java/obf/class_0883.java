package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.io.File;
import java.util.Collections;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0883
extends class_2117 {
    private final int IllIIlllllllIIlIIlIIIIlIl;
    public final class_1165 lllIIIllIIIIlllIlIIllIIll;
    private final class_1194 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0730 IllIIIllIIIIlIlIlIllIIlll;
    private final class_0730 lIIIIlIlIIlllllIIllIIlIII;
    private final class_0730 llIIlllIllIllllIIIlIIIIII;
    private int llIIllIllIlIIlIIllIllllll = 0;
    private final ResourceLocation lllIIlIIIllllllIIIIlIlIlI = new ResourceLocation("client/icons/delete-64.png");
    private final ResourceLocation IlIlllIIIIIIlIIllIIllIlll = new ResourceLocation("client/icons/checkmark-64.png");
    private ResourceLocation IlIlIIlIlIllIIlIlIIllIIIl = new ResourceLocation("client/icons/right.png");
    private ResourceLocation lllllIlllIIllIlIIlIIIllII = new ResourceLocation("client/icons/pencil-64.png");

    public class_0883(class_1194 class_11942, int n, class_1165 class_11652, float f) {
        super(f);
        this.IIIllIllIIlIlIlIlIllllIIl = class_11942;
        this.IllIIlllllllIIlIIlIIIIlIl = n;
        this.lllIIIllIIIIlllIlIIllIIll = class_11652;
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0730(0x4FFFFFFF, -1);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(0x40000000, 444958085);
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(0x40000000, 444958085);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl;
        boolean bl2;
        float f2;
        boolean bl3 = n > this.lIlllIlllIIIIlIIlllIllIII + 12 && this.lllIIIllIIIIlllIlIIllIIll(n, n2);
        int n3 = 75;
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI - 1, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI, 452326901);
        if (bl3) {
            if (this.llIIllIllIlIIlIIllIllllll < n3) {
                f2 = class_0822.lllIIIllIIIIlllIlIIllIIll(790.0f);
                this.llIIllIllIlIIlIIllIllllll = (int)((float)this.llIIllIllIlIIlIIllIllllll + f2);
                if (this.llIIllIllIlIIlIIllIllllll > n3) {
                    this.llIIllIllIlIIlIIllIllllll = n3;
                }
            }
        } else if (this.llIIllIllIlIIlIIllIllllll > 0) {
            f2 = class_0822.lllIIIllIIIIlllIlIIllIIll(790.0f);
            this.llIIllIllIlIIlIIllIllllll = (float)this.llIIllIllIlIIlIIllIllllll - f2 < 0.0f ? 0 : (int)((float)this.llIIllIllIlIIlIIllIllllll - f2);
        }
        boolean bl4 = this.lllIIIllIIIIlllIlIIllIIll(n, n2);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(bl4).getRGB(), this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(bl4).getRGB(), this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(bl4).getRGB());
        boolean bl5 = (float)n > (float)this.lIlllIlllIIIIlIIlllIllIII * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + 12) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 >= (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 <= (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl6 = (float)n > (float)this.lIlllIlllIIIIlIIlllIllIII * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + 12) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.35f);
        float f3 = 2.5f;
        if (!this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl()) {
            bl2 = false;
            bl = false;
            class_1319 class_13192 = (class_1319)this.IIIllIllIIlIlIlIlIllllIIl;
            if (class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this) != 0 && class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this) > 1) {
                bl2 = true;
                GL11.glPushMatrix();
                if (bl5) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.65f);
                }
                GL11.glTranslatef((float)((float)(this.lIlllIlllIIIIlIIlllIllIII + 6) - f3), (float)((float)this.IlIIIIIllllllIIlllIllllll + 7.0f), (float)0.0f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, f3, -1.0f, 0.0f);
                GL11.glPopMatrix();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.35f);
            }
            if (class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this) != class_13192.lllIIIllIIIIlllIlIIllIIll.size() - 1) {
                bl = true;
                GL11.glPushMatrix();
                if (bl6) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.65f);
                }
                GL11.glTranslatef((float)((float)(this.lIlllIlllIIIIlIIlllIllIII + 6) + f3), (float)((float)this.IlIIIIIllllllIIlllIllllll + 7.0f), (float)0.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, f3, 2.0f, 0.0f);
                GL11.glPopMatrix();
            }
            if (!bl2 && !bl) {
                class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, 2.5f, (float)(this.lIlllIlllIIIIlIIlllIllIII + 4), (float)this.IlIIIIIllllllIIlllIllllll + 6.0f);
            }
        } else {
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, 2.5f, (float)(this.lIlllIlllIIIIlIIlllIllIII + 4), (float)this.IlIIIIIllllllIIlllIllllll + 6.0f);
        }
        if (LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl == this.lllIIIllIIIIlllIlIIllIIll) {
            LunarClient.getInstance().robotoLight18px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().toUpperCase(), (float)this.lIlllIlllIIIIlIIlllIllIII + 16.0f, (float)(this.IlIIIIIllllllIIlllIllllll + 3), -419430401);
        } else {
            LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().toUpperCase(), (float)this.lIlllIlllIIIIlIIlllIllIII + 16.0f, (float)this.IlIIIIIllllllIIlllIllllll + 3.5f, -419430401);
        }
        if (LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl == this.lllIIIllIIIIlllIlIIllIIll) {
            LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll(" (Active)", (float)this.lIlllIlllIIIIlIIlllIllIII + 17.0f + (float) LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().toUpperCase()), (float)this.IlIIIIIllllllIIlllIllllll + 4.0f, -419430401);
        }
        if (!this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl()) {
            bl2 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 30) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 13) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
            GL11.glColor4f((float)(bl2 ? 0.0f : 0.75f), (float)(bl2 ? 0.0f : 0.75f), (float)(bl2 ? 0.5f : 0.75f), (float)0.65f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, 5.0f, (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 26), (float)this.IlIIIIIllllllIIlllIllllll + 3.5f);
            bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 17) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 2) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
            GL11.glColor4f((float)(bl ? 0.8f : 0.75f), (float)(bl ? 0.0f : 0.75f), (float)(bl ? 0.0f : 0.75f), (float)0.65f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, 5.0f, (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 13), (float)this.IlIIIIIllllllIIlllIllllll + 3.5f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 17) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 2) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl2 = (float)n > (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 30) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll - 13) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl3 = (float)n > (float)this.lIlllIlllIIIIlIIlllIllIII * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + 12) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 >= (float)(this.IlIIIIIllllllIIlllIllllll + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 <= (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl4 = (float)n > (float)this.lIlllIlllIIIIlIIlllIllIII * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n < (float)(this.lIlllIlllIIIIlIIlllIllIII + 12) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 > (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl && (float)n2 < (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIllllllIIlIIllllIIlIIIl) * this.lllIlIIlIIIlIlIIIllIlllIl;
        class_1319 class_13192 = (class_1319)this.IIIllIllIIlIlIlIlIllllIIl;
        if (!this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl() && (bl3 || bl4)) {
            if (bl3 && ((class_1319)this.IIIllIllIIlIlIlIlIllllIIl).lllIIIllIIIIlllIlIIllIIll.indexOf(this) != 0 && ((class_1319)this.IIIllIllIIlIlIlIlIllllIIl).lllIIIllIIIIlllIlIIllIIll.indexOf(this) > 1) {
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this) - 1;
                ((class_0883)class_13192.lllIIIllIIIIlllIlIIllIIll.get((int)(class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf((Object)this) - 1))).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this);
                Collections.swap(class_13192.lllIIIllIIIIlllIlIIllIIll, class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this), class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this) - 1);
            }
            if (bl4 && class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this) != class_13192.lllIIIllIIIIlllIlIIllIIll.size() - 1) {
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this) + 1;
                ((class_0883)class_13192.lllIIIllIIIIlllIlIIllIIll.get((int)(class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf((Object)this) + 1))).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll = class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this);
                Collections.swap(class_13192.lllIIIllIIIIlllIlIIllIIll, class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this), class_13192.lllIIIllIIIIlllIlIIllIIll.indexOf(this) + 1);
            }
        } else if (!this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl() && bl) {
            File file;
            File file2;
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            if (LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl == this.lllIIIllIIIIlllIlIIllIIll) {
                LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl = (class_1165) LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll.get(0);
                LunarClient.getInstance().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
                LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
            }
            if (!this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl() && (file2 = (file = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles")).exists() || file.mkdirs() ? new File(file + File.separator + this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll().toLowerCase() + ".cfg") : null).exists() && file2.delete()) {
                LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll.removeIf(class_11652 -> class_11652 == this.lllIIIllIIIIlllIlIIllIIll);
                class_13192.lllIIIllIIIIlllIlIIllIIll.removeIf(class_08832 -> class_08832 == this);
            }
        } else if (!this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl() && bl2) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(new class_1151(this.lllIIIllIIIIlllIlIIllIIll, class_0822.lllIIIllIIIIlllIlIIllIIll, (class_1319)this.IIIllIllIIlIlIlIlIllllIIl, this.IllIIlllllllIIlIIlIIIIlIl, this.lllIlIIlIIIlIlIIIllIlllIl));
        } else if (LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl != this.lllIIIllIIIIlllIlIIllIIll) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            LunarClient.getInstance().lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
            LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll;
            LunarClient.getInstance().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
            LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        }
    }
}

