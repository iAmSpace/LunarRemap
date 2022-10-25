package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_0527
extends class_2117 {
    public int lllIIIllIIIIlllIlIIllIIll;
    public String IllIIlllllllIIlIIlIIIIlIl;
    public final class_1194 IIIllIllIIlIlIlIlIllllIIl;
    private LCFontRenderer lIIIIlIlIIlllllIIllIIlIII;
    public boolean IllIIIllIIIIlIlIlIllIIlll = true;
    private final class_0730 llIIlllIllIllllIIIlIIIIII;
    private final class_0730 llIIllIllIlIIlIIllIllllll;
    private final class_0730 lllIIlIIIllllllIIIIlIlIlI;
    private int IlIlllIIIIIIlIIllIIllIlll = 0;

    public class_0527(LCFontRenderer class_09542, class_1194 class_11942, String string, int n, int n2, int n3, int n4, int n5, float f) {
        super(f);
        this.IllIIlllllllIIlIIlIIIIlIl = string;
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        this.lllIIIllIIIIlllIlIIllIIll = n5;
        this.IIIllIllIIlIlIlIlIllllIIl = class_11942;
        this.lIIIIlIlIIlllllIIllIIlIII = class_09542;
        this.llIIlllIllIllllIIIlIIIIII = new class_0730(0x4FFFFFFF, -1);
        this.llIIllIllIlIIlIIllIllllll = new class_0730(0x40000000, 444958085);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_0730(0x40000000, 444958085);
    }

    public class_0527(class_1194 class_11942, String string, int n, int n2, int n3, int n4, int n5, float f) {
        this(LunarClient.getInstance().robotoBold22px, class_11942, string, n, n2, n3, n4, n5, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll(n, n2);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll + this.IIIllIIlIIIIIIlIlIIllIIlI, this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB(), this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB(), this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(bl).getRGB());
        if (this.IllIIlllllllIIlIIlIIIIlIl.contains(".png")) {
            GL11.glPushMatrix();
            GL11.glColor4f((float)255.0f, (float)255.0f, (float)255.0f, (float)0.9f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/" + this.IllIIlllllllIIlIIlIIIIlIl), 8.0f, (float)(this.lIlllIlllIIIIlIIlllIllIII + 6), (float)(this.IlIIIIIllllllIIlllIllllll + 6));
            GL11.glPopMatrix();
        } else {
            boolean bl2 = this.lIIIIlIlIIlllllIIllIIlIII != LunarClient.getInstance().robotoBold22px;
            this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIlllllllIIlIIlIIIIlIl.toUpperCase(), this.lIlllIlllIIIIlIIlllIllIII + this.lIllllIIlIIIlIllllllIIIll / 2, (float)this.IlIIIIIllllllIIlllIllllll + (float)this.IIIllIIlIIIIIIlIlIIllIIlI / 4.0f - (float)bl2, 0xFFFFFF);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IllIIIllIIIIlIlIlIllIIlll = bl;
    }
}

