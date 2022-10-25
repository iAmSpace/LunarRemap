package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1826
extends class_2117 {
    private final Cosmetic lllIIIllIIIIlllIlIIllIIll;
    private ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("client/icons/checkmark-32.png");

    public class_1826(Cosmetic class_04332, float f) {
        super(f);
        this.IIIllIIlIIIIIIlIlIIllIIlI = 30;
        this.lllIIIllIIIIlllIlIIllIIll = class_04332;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl;
        boolean bl2 = bl = n > this.lIlllIlllIIIIlIIlllIllIII && n < this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll && n2 > this.IlIIIIIllllllIIlllIllllll && n2 < this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (bl) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI, 0x2F000000);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().equals("cape")) {
            Minecraft.getMinecraft().IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getLocation());
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(this.lIlllIlllIIIIlIIlllIllIII + 20), (float)(this.IlIIIIIllllllIIlllIllllll + 7), (float)0.0f);
            GL11.glScalef((float)0.25f, (float)0.13f, (float)0.25f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 2.0f, 7.0f, 44, 120);
            GL11.glPopMatrix();
        } else {
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getPreviewLocation(), 8.0f, (float)(this.lIlllIlllIIIIlIIlllIllIII + 20), (float)(this.IlIIIIIllllllIIlllIllllll + 7));
        }
        LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(), this.lIlllIlllIIIIlIIlllIllIII + 42, (float)(this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2 - 5), -1342177281);
        if (this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl()) {
            GL11.glColor4f((float)0.0f, (float)0.8f, (float)0.0f, (float)0.45f);
        } else {
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.25f);
        }
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII + 8, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI / 2, 3.0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = bl = n > this.lIlllIlllIIIIlIIlllIllIII && n < this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll && n2 > this.IlIIIIIllllllIIlllIllllll && n2 < this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (bl) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
            if (this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl()) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(false);
            } else if (this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().equals("cape")) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
                for (Cosmetic class_04332 : LunarClient.getInstance().IlIlIIlIlIllIIlIlIIllIIIl()) {
                    if (class_04332 == this.lllIIIllIIIIlllIlIIllIIll || !class_04332.lIlllIlllIIIIlIIlllIllIII().equals("cape")) continue;
                    class_04332.lllIIIllIIIIlllIlIIllIIll(false);
                }
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
                for (Cosmetic class_04333 : LunarClient.getInstance().IlIlIIlIlIllIIlIlIIllIIIl()) {
                    if (class_04333 == this.lllIIIllIIIIlllIlIIllIIll || class_04333.lIlllIlllIIIIlIIlllIllIII().equals("cape")) continue;
                    class_04333.lllIIIllIIIIlllIlIIllIIll(false);
                }
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(true);
            }
            LunarClient.getInstance().getWebsocket().lllIlIIlIIIlIlIIIllIlllIl();
        }
    }
}

