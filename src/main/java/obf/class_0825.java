package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_0825
extends class_0759 {
    private final class_0642 IllIIlllllllIIlIIlIIIIlIl;
    public static byte[] IIIllIIlIIIIIIlIlIIllIIlI = new byte[]{107, -20, -16, 107, 16, 12, 30, 82, -34, -44, -106, 14, 91, -126, 45, -85, -63, 42, 106, -17, 19, 94, -92, -48, 91, 77, 116, -15, -116, 20, 36, -123};

    public class_0825(class_0642 class_06422) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_06422;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        boolean bl2;
        if (bl && this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -13750738);
        }
        GL11.glPushMatrix();
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl - 0.5f, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl, -1357572843);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + 0.5f, -1357572843);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 3.0f, this.lllIIIllIIIIlllIlIIllIIll + 20.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 19.0f, -16747106);
        LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), this.lllIIIllIIIIlllIlIIllIIll + 24.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 2.0f, -1);
        if (this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl()) {
            bl2 = f > this.lllIIIllIIIIlllIlIIllIIll + 24.0f && f < this.lllIIIllIIIIlllIlIIllIIll + 84.0f && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII && f2 > this.lllIlIIlIIIlIlIIIllIlllIl + 10.0f && bl;
            LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("CANCEL", this.lllIIIllIIIIlllIlIIllIIll + 24.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 11.0f, bl2 ? -52429 : 0x7FFF3333);
        } else {
            bl2 = f > this.lllIIIllIIIIlllIlIIllIIll + 24.0f && f < this.lllIIIllIIIIlllIlIIllIIll + 52.0f && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII && f2 > this.lllIlIIlIIIlIlIIIllIlllIl + 10.0f && bl;
            boolean bl3 = f > this.lllIIIllIIIIlllIlIIllIIll + 52.0f && f < this.lllIIIllIIIIlllIlIIllIIll + 84.0f && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII && f2 > this.lllIlIIlIIIlIlIIIllIlllIl + 10.0f && bl;
            LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("ACCEPT", this.lllIIIllIIIIlllIlIIllIIll + 24.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 11.0f, bl2 ? -13369549 : 0x7F33FF33);
            LunarClient.getInstance().robotoMedium13px.lllIIIllIIIIlllIlIIllIIll("DENY", this.lllIIIllIIIIlllIlIIllIIll + 56.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 11.0f, bl3 ? -52429 : 0x7FFF3333);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation class_17732 = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(class_1227.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll()), this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl());
        class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, 7.0f, this.lllIIIllIIIIlllIlIIllIIll + 5.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 4.0f);
        GL11.glPopMatrix();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl()) {
            boolean bl2;
            boolean bl3 = bl2 = f > this.lllIIIllIIIIlllIlIIllIIll + 24.0f && f < this.lllIIIllIIIIlllIlIIllIIll + 84.0f && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII && f2 > this.lllIlIIlIIIlIlIIIllIlllIl + 10.0f && bl;
            if (bl2) {
                this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll((class_0688)new class_0383(false, this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl()));
                class_0713.IlIlllIIIIIIlIIllIIllIlll().lllllIlllIIllIlIIlIIIllII().llIIlllIllIllllIIIlIIIIII().add(this);
            }
        } else {
            boolean bl4;
            boolean bl5 = f > this.lllIIIllIIIIlllIlIIllIIll + 24.0f && f < this.lllIIIllIIIIlllIlIIllIIll + 52.0f && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII && f2 > this.lllIlIIlIIIlIlIIIllIlllIl + 10.0f;
            boolean bl6 = bl4 = f > this.lllIIIllIIIIlllIlIIllIIll + 52.0f && f < this.lllIIIllIIIIlllIlIIllIIll + 84.0f && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII && f2 > this.lllIlIIlIIIlIlIIIllIlllIl + 10.0f;
            if (bl5) {
                this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll((class_0688)new class_0383(true, this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl()));
                class_0713.IlIlllIIIIIIlIIllIIllIlll().lllllIlllIIllIlIIlIIIllII().llIIlllIllIllllIIIlIIIIII().add(this);
            } else if (bl4) {
                this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
                LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll((class_0688)new class_0383(false, this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl()));
                class_0713.IlIlllIIIIIIlIIllIIllIlll().lllllIlllIIllIlIIlIIIllII().llIIlllIllIllllIIIlIIIIII().add(this);
            }
        }
        return super.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
    }

    public class_0642 IllIIlllllllIIlIIlIIIIlIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

