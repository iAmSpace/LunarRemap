package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.Options;
import org.lwjgl.opengl.GL11;

public class class_1474
extends class_1197 {
    private float lllIlIIlIIIlIlIIIllIlllIl = 1.0f;
    public boolean lllIIIllIIIIlllIlIIllIIll;
    private Options lllllIlllIIllIlIIlIIIllII;
    private final float IlIlIIlllIIlIllIIIlllllIl;
    private final float lIIlIIIIIlIlllIlIIlIlIlll;

    public class_1474(int n, int n2, int n3, Options class_07282) {
        this(n, n2, n3, class_07282, 0.0f, 1.0f);
    }

    public class_1474(int n, int n2, int n3, Options class_07282, float f, float f2) {
        super(n, n2, n3, 150, 20, "");
        this.lllllIlllIIllIlIIlIIIllII = class_07282;
        this.IlIlIIlllIIlIllIIIlllllIl = f;
        this.lIIlIIIIIlIlllIlIIlIlIlll = f2;
        Minecraft class_06672 = Minecraft.getMinecraft();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07282.normalizeValue(class_06672.gameSettings.lllIIIllIIIIlllIlIIllIIll(class_07282));
        this.IllIIlllllllIIlIIlIIIIlIl = class_06672.gameSettings.IlIllllllIIlIIllllIIlIIIl(class_07282);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        return 0;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            if (this.lllIIIllIIIIlllIlIIllIIll) {
                this.lllIlIIlIIIlIlIIIllIlllIl = (float)(n - (this.lIllllIIlIIIlIllllllIIIll + 4)) / (float)(this.lIlllIlllIIIIlIIlllIllIII - 8);
                if (this.lllIlIIlIIIlIlIIIllIlllIl < 0.0f) {
                    this.lllIlIIlIIIlIlIIIllIlllIl = 0.0f;
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl > 1.0f) {
                    this.lllIlIIlIIIlIlIIIllIlllIl = 1.0f;
                }
                float f = this.lllllIlllIIllIlIIlIIIllII.denormalizeValue(this.lllIlIIlIIIlIlIIIllIlllIl);
                class_06672.gameSettings.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, f);
                this.lllIlIIlIIIlIlIIIllIlllIl = this.lllllIlllIIllIlIIlIIIllII.normalizeValue(f);
                this.IllIIlllllllIIlIIlIIIIlIl = class_06672.gameSettings.IlIllllllIIlIIllllIIlIIIl(this.lllllIlllIIllIlIIlIIIllII);
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_1474.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + (int)(this.lllIlIIlIIIlIlIIIllIlllIl * (float)(this.lIlllIlllIIIIlIIlllIllIII - 8)), this.IIIllIIlIIIIIIlIlIIllIIlI, 0, 66, 4, 20);
            class_1474.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll + (int)(this.lllIlIIlIIIlIlIIIllIlllIl * (float)(this.lIlllIlllIIIIlIIlllIllIII - 8)) + 4, this.IIIllIIlIIIIIIlIlIIllIIlI, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(Minecraft class_06672, int n, int n2) {
        if (super.IlIllllllIIlIIllllIIlIIIl(class_06672, n, n2)) {
            this.lllIlIIlIIIlIlIIIllIlllIl = (float)(n - (this.lIllllIIlIIIlIllllllIIIll + 4)) / (float)(this.lIlllIlllIIIIlIIlllIllIII - 8);
            if (this.lllIlIIlIIIlIlIIIllIlllIl < 0.0f) {
                this.lllIlIIlIIIlIlIIIllIlllIl = 0.0f;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl > 1.0f) {
                this.lllIlIIlIIIlIlIIIllIlllIl = 1.0f;
            }
            class_06672.gameSettings.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.denormalizeValue(this.lllIlIIlIIIlIlIIIllIlllIl));
            this.IllIIlllllllIIlIIlIIIIlIl = class_06672.gameSettings.IlIllllllIIlIIllllIIlIIIl(this.lllllIlllIIllIlIIlIIIllII);
            this.lllIIIllIIIIlllIlIIllIIll = true;
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = false;
    }
}

