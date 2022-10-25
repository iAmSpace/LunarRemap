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

public class class_2146
extends class_0270 {
    private final List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private ResourceLocation IlIllllllIIlIIllllIIlIIIl = new ResourceLocation("client/icons/left.png");
    private ResourceLocation lIlllIlllIIIIlIIlllIllIII = new ResourceLocation("client/icons/right.png");
    private int IlIIIIIllllllIIlllIllllll = 0;

    public class_2146() {
        for (Cosmetic class_04332 : LunarClient.getInstance().IlIlIIlIlIllIIlIlIIllIIIl()) {
            this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_1826(class_04332, 1.0f));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (!LunarClient.getInstance().getWebsocket().isOpen()) {
            LunarClient.getInstance().robotoLight16px.IlIllllllIIlIIllllIIlIIIl("Unable to connect to the server.", this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 10, -1);
            LunarClient.getInstance().robotoLight16px.IlIllllllIIlIIllllIIlIIIl("Please try again later.", this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 4, -1);
        } else {
            class_0857.lllIIIllIIIIlllIlIIllIIll((double)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 80), (double)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 78), (double)(this.IlIlIIlllIIlIllIIIlllllIl / 2 + 80), (double)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 100), 14.0, -1342177281);
            if (this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
                LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl("You don't own any cosmetics.", this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 4, -6381922);
            } else {
                float f2 = this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 68;
                float f3 = this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 92;
                float f4 = this.IlIlIIlllIIlIllIIIlllllIl / 2 + 68;
                float f5 = this.IlIlIIlllIIlIllIIIlllllIl / 2 + 74;
                LunarClient.getInstance().robotoLight18px.lllIlIIlIIIlIlIIIllIlllIl("Cosmetics (" + this.lllIlIIlIIIlIlIIIllIlllIl.size() + ")", this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 90, -1);
                int n3 = 0;
                float f6 = 0.0f;
                for (class_1826 class_18262 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                    if (++n3 - 1 < this.IlIIIIIllllllIIlllIllllll * 5 || n3 - 1 >= (this.IlIIIIIllllllIIlllIllllll + 1) * 5) continue;
                    class_18262.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 76, (int)((float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 - 72) + f6), 152, class_18262.lllIIIllIIIIlllIlIIllIIll());
                    class_18262.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
                    f6 += (float)class_18262.lllIIIllIIIIlllIlIIllIIll();
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl.size() > 5) {
                    boolean bl = n > this.IlIlIIlllIIlIllIIIlllllIl / 2 - 40 && n < this.IlIlIIlllIIlIllIIIlllllIl / 2 - 1 && n2 > this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 80 && n2 < this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 100;
                    GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)(bl ? 0.45f : 0.25f));
                    class_0857.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 4.0f, (float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 - 10), (float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 84));
                    boolean bl2 = n > this.IlIlIIlllIIlIllIIIlllllIl / 2 + 1 && n < this.IlIlIIlllIIlIllIIIlllllIl / 2 + 40 && n2 > this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 80 && n2 < this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 100;
                    GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)(bl2 ? 0.45f : 0.25f));
                    class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, 4.0f, (float)(this.IlIlIIlllIIlIllIIIlllllIl / 2 + 10), (float)(this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 84));
                }
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4;
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.size() > 5) {
            boolean bl;
            n4 = n > this.IlIlIIlllIIlIllIIIlllllIl / 2 - 40 && n < this.IlIlIIlllIIlIllIIIlllllIl / 2 - 1 && n2 > this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 80 && n2 < this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 100 ? 1 : 0;
            boolean bl2 = bl = n > this.IlIlIIlllIIlIllIIIlllllIl / 2 + 1 && n < this.IlIlIIlllIIlIllIIIlllllIl / 2 + 40 && n2 > this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 80 && n2 < this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + 100;
            if (this.IlIIIIIllllllIIlllIllllll > 0 && n4 != 0) {
                --this.IlIIIIIllllllIIlllIllllll;
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            } else if (bl && (float)(this.IlIIIIIllllllIIlllIllllll + 1) < (float)this.lllIlIIlIIIlIlIIIllIlllIl.size() / 5.0f) {
                ++this.IlIIIIIllllllIIlllIllllll;
                Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            }
        }
        n4 = 0;
        for (class_1826 class_18262 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (++n4 - 1 < this.IlIIIIIllllllIIlllIllllll * 5 || n4 - 1 >= (this.IlIIIIIllllllIIlllIllllll + 1) * 5) continue;
            class_18262.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
    }
}

