package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import com.moonsworth.lunar.client.util.cosmetic.Cosmetic;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0252
extends class_1546 {
    private final List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private ResourceLocation lIllllIIlIIIlIllllllIIIll = new ResourceLocation("client/icons/left.png");
    private ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("client/icons/right.png");
    private final class_0944 IllIIlllllllIIlIIlIIIIlIl = new class_0944("BACK");
    private int IIIllIllIIlIlIlIlIllllIIl = 0;

    public class_0252() {
        for (Cosmetic class_04332 : LunarClient.getInstance().IlIlIIlIlIllIIlIlIIllIIIl()) {
            this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_1826(class_04332, 1.0f));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2);
        if (!LunarClient.getInstance().getWebsocket().isOpen()) {
            LunarClient.getInstance().robotoLight16px.IlIllllllIIlIIllllIIlIIIl("Unable to connect to the server.", this.lIllllIIlIIIlIllllllIIIll() / 2.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 10.0f, -1);
            LunarClient.getInstance().robotoLight16px.IlIllllllIIlIIllllIIlIIIl("Please try again later.", this.lIllllIIlIIIlIllllllIIIll() / 2.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 4.0f, -1);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 30.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 28.0f, 60.0f, 12.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
        } else {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 80.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 78.0f, this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 80.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 100.0f, 0x2F000000);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 30.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 105.0f, 60.0f, 12.0f);
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(f, f2, true);
            if (this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
                LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl("You don't own any cosmetics.", this.lIllllIIlIIIlIllllllIIIll() / 2.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 4.0f, -6381922);
            } else {
                float f3 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 68.0f;
                float f4 = this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 92.0f;
                float f5 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 68.0f;
                float f6 = this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 74.0f;
                LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl("Cosmetics (" + this.lllIlIIlIIIlIlIIIllIlllIl.size() + ")", this.lIllllIIlIIIlIllllllIIIll() / 2.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 90.0f, -1);
                int n = 0;
                float f7 = 0.0f;
                for (class_1826 class_18262 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                    if (++n - 1 < this.IIIllIllIIlIlIlIlIllllIIl * 5 || n - 1 >= (this.IIIllIllIIlIlIlIlIllllIIl + 1) * 5) continue;
                    class_18262.lllIIIllIIIIlllIlIIllIIll((int)this.lIllllIIlIIIlIllllllIIIll() / 2 - 76, (int)(this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f - 72.0f + f7), 152, class_18262.lllIIIllIIIIlllIlIIllIIll());
                    class_18262.lllIIIllIIIIlllIlIIllIIll((int)f, (int)f2, 1.0f);
                    f7 += (float)class_18262.lllIIIllIIIIlllIlIIllIIll();
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl.size() > 5) {
                    boolean bl = f > this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 40.0f && f < this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 1.0f && f2 > this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 80.0f && f2 < this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 100.0f;
                    GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)(bl ? 0.45f : 0.25f));
                    class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, 4.0f, this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 10.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 84.0f);
                    boolean bl2 = f > this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 1.0f && f < this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 40.0f && f2 > this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 80.0f && f2 < this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 100.0f;
                    GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)(bl2 ? 0.45f : 0.25f));
                    class_0857.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, 4.0f, this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 10.0f, this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 84.0f);
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, n);
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0909());
        } else {
            int n2;
            if (this.lllIlIIlIIIlIlIIIllIlllIl.size() > 5) {
                boolean bl;
                n2 = f > this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 40.0f && f < this.lIllllIIlIIIlIllllllIIIll() / 2.0f - 1.0f && f2 > this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 80.0f && f2 < this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 100.0f ? 1 : 0;
                boolean bl2 = bl = f > this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 1.0f && f < this.lIllllIIlIIIlIllllllIIIll() / 2.0f + 40.0f && f2 > this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 80.0f && f2 < this.IIIllIIlIIIIIIlIlIIllIIlI() / 2.0f + 100.0f;
                if (this.IIIllIllIIlIlIlIlIllllIIl > 0 && n2 != 0) {
                    --this.IIIllIllIIlIlIlIlIllllIIl;
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                } else if (bl && (float)(this.IIIllIllIIlIlIlIlIllllIIl + 1) < (float)this.lllIlIIlIIIlIlIIIllIlllIl.size() / 5.0f) {
                    ++this.IIIllIllIIlIlIlIlIllllIIl;
                    Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                }
            }
            n2 = 0;
            for (class_1826 class_18262 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                if (++n2 - 1 < this.IIIllIllIIlIlIlIlIllllIIl * 5 || n2 - 1 >= (this.IIIllIllIIlIlIlIlIllllIIl + 1) * 5) continue;
                class_18262.lllIIIllIIIIlllIlIIllIIll((int)f, (int)f2, n);
            }
        }
    }
}

