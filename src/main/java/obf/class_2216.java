package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class class_2216
extends class_1197 {
    private final class_0617 IlIlIIlllIIlIllIIIlllllIl;
    private final String lIIlIIIIIlIlllIlIIlIlIlll;
    public float lllIIIllIIIIlllIlIIllIIll;
    public boolean lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_0329 lllllIlllIIllIlIIlIIIllII;

    public class_2216(class_0329 class_03292, int n, int n2, int n3, class_0617 class_06172, boolean bl) {
        this.lllllIlllIIllIlIIlIIIllII = class_03292;
        super(n, n2, n3, bl ? 310 : 150, 20, "");
        this.lllIIIllIIIIlllIlIIllIIll = 1.0f;
        this.IlIlIIlllIIlIllIIIlllllIl = class_06172;
        this.lIIlIIIIIlIlllIlIIlIlIlll = class_0616.lllIIIllIIIIlllIlIIllIIll("soundCategory." + class_06172.lllIIIllIIIIlllIlIIllIIll(), new Object[0]);
        this.IllIIlllllllIIlIIlIIIIlIl = this.lIIlIIIIIlIlllIlIIlIlIlll + ": " + class_03292.lllIIIllIIIIlllIlIIllIIll(class_06172);
        this.lllIIIllIIIIlllIlIIllIIll = class_0329.lllIIIllIIIIlllIlIIllIIll(class_03292).lllIIIllIIIIlllIlIIllIIll(class_06172);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        return 0;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl) {
                this.lllIIIllIIIIlllIlIIllIIll = (float)(n - (this.lIllllIIlIIIlIllllllIIIll + 4)) / (float)(this.lIlllIlllIIIIlIIlllIllIII - 8);
                if (this.lllIIIllIIIIlllIlIIllIIll < 0.0f) {
                    this.lllIIIllIIIIlllIlIIllIIll = 0.0f;
                }
                if (this.lllIIIllIIIIlllIlIIllIIll > 1.0f) {
                    this.lllIIIllIIIIlllIlIIllIIll = 1.0f;
                }
                class_06672.gameSettings.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, this.lllIIIllIIIIlllIlIIllIIll);
                class_06672.gameSettings.IlIllllllIIlIIllllIIlIIIl();
                this.IllIIlllllllIIlIIlIIIIlIl = this.lIIlIIIIIlIlllIlIIlIlIlll + ": " + this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl);
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_2216.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + (int)(this.lllIIIllIIIIlllIlIIllIIll * (float)(this.lIlllIlllIIIIlIIlllIllIII - 8)), this.IIIllIIlIIIIIIlIlIIllIIlI, 0, 66, 4, 20);
            class_2216.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + (int)(this.lllIIIllIIIIlllIlIIllIIll * (float)(this.lIlllIlllIIIIlIIlllIllIII - 8)) + 4, this.IIIllIIlIIIIIIlIlIIllIIlI, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(Minecraft class_06672, int n, int n2) {
        if (super.IlIllllllIIlIIllllIIlIIIl(class_06672, n, n2)) {
            this.lllIIIllIIIIlllIlIIllIIll = (float)(n - (this.lIllllIIlIIIlIllllllIIIll + 4)) / (float)(this.lIlllIlllIIIIlIIlllIllIII - 8);
            if (this.lllIIIllIIIIlllIlIIllIIll < 0.0f) {
                this.lllIIIllIIIIlllIlIIllIIll = 0.0f;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll > 1.0f) {
                this.lllIIIllIIIIlllIlIIllIIll = 1.0f;
            }
            class_06672.gameSettings.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, this.lllIIIllIIIIlllIlIIllIIll);
            class_06672.gameSettings.IlIllllllIIlIIllllIIlIIIl();
            this.IllIIlllllllIIlIIlIIIIlIl = this.lIIlIIIIIlIlllIlIIlIlIlll + ": " + this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl);
            this.lllIlIIlIIIlIlIIIllIlllIl = true;
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1300 class_13002) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (this.IlIlIIlllIIlIllIIIlllllIl == class_0617.lllIIIllIIIIlllIlIIllIIll) {
                float f = 1.0f;
            } else {
                class_0329.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII).lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl);
            }
            this.lllllIlllIIllIlIIlIIIllII.lllllIlllIIllIlIIlIIIllII.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = false;
    }
}

