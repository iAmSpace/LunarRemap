package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import org.lwjgl.opengl.GL11;

public class class_1339
extends class_0759 {
    private ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI;
    private String IllIIlllllllIIlIIlIIIIlIl;
    private final class_0730 IIIllIllIIlIlIlIlIllllIIl;
    private final class_0730 IllIIIllIIIIlIlIlIllIIlll;
    private final class_0730 lIIIIlIlIIlllllIIllIIlIII;
    private final class_0847 llIIlllIllIllllIIIlIIIIII;
    private float llIIllIllIlIIlIIllIllllll;
    private boolean lllIIlIIIllllllIIIIlIlIlI;
    private final class_1546 IlIlllIIIIIIlIIllIIllIlll;
    private final class_1326 IlIlIIlIlIllIIlIlIIllIIIl;
    private float lllllIlllIIllIlIIlIIIllII;

    public class_1339(class_1546 class_15462, String string, ResourceLocation class_17732) {
        this.IlIlllIIIIIIlIIllIIllIlll = class_15462;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_17732;
        this.IllIIlllllllIIlIIlIIIIlIl = string;
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_1326(this);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0730(0x4FFFFFFF, -1);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_0730(0x40000000, 444958085);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_0730(0x40000000, 444958085);
        this.llIIlllIllIllllIIIlIIIIII = new class_0847(300L);
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
        if (this.llIIllIllIlIIlIIllIllllll == 0.0f) {
            this.llIIllIllIlIIlIIllIllllll = f4;
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIlIIlIlIllIIlIlIIllIIIl.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        boolean bl2 = bl && this.lllIIIllIIIIlllIlIIllIIll(f, f2);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.llIIllIllIlIIlIIllIllllll, this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB(), this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl(bl2).getRGB());
        float f3 = 6.0f;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, f3, this.lllIIIllIIIIlllIlIIllIIll + 4.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.llIIllIllIlIIlIIllIllllll / 2.0f - f3);
        LunarClient.getInstance().robotoRegular13px.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, this.lllIIIllIIIIlllIlIIllIIll + 22.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 4.5f, -1342177281);
        float f4 = this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl);
        if (this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI()) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.llIIllIllIlIIlIIllIllllll + this.lllllIlllIIllIlIIlIIIllII * f4);
            this.lllIIlIIIllllllIIIIlIlIlI = true;
        } else if (!this.llIIlllIllIllllIIIlIIIIII.IIIllIIlIIIIIIlIlIIllIIlI() && !this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.lllIIlIIIllllllIIIIlIlIlI = false;
        }
        if (this.lllIIlIIIllllllIIIIlIlIlI) {
            float f5 = 0.5f;
            float f6 = this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + f5;
            float f7 = this.lllIlIIlIIIlIlIIIllIlllIl + 5.0f + this.llIIllIllIlIIlIIllIllllll;
            if (f6 > f7) {
                class_0210.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll + 1.0f, f7, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl - 1.0f, f6, f5, 0x4FFFFFFF, 444958085);
            }
            GL11.glPushMatrix();
            GL11.glEnable((int)3089);
            class_0857.lllIIIllIIIIlllIlIIllIIll((int)this.lllIIIllIIIIlllIlIIllIIll, (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.llIIllIllIlIIlIIllIllllll), (int)(this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.llIIllIllIlIIlIIllIllllll + 7.0f + (this.lIlllIlllIIIIlIIlllIllIII - this.llIIllIllIlIIlIIllIllllll - 6.0f) * f4), (float)((int)((float)this.IlIlllIIIIIIlIIllIIllIlll.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * this.IlIlllIIIIIIlIIllIIllIlll.IlIIIIIllllllIIlllIllllll())), (int)this.IlIlllIIIIIIlIIllIIllIlll.IIIllIIlIIIIIIlIlIIllIIlI());
            this.IlIlIIlIlIllIIlIlIIllIIIl.IlIllllllIIlIIllllIIlIIIl(f, f2, bl);
            boolean bl3 = true;
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
            GL11.glDisable((int)3089);
            GL11.glPopMatrix();
        }
    }

    public float IlIIIIIllllllIIlllIllllll(float f) {
        return 22.0f + f + 10.0f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        if (!bl) {
            return false;
        }
        if (this.llIIlllIllIllllIIIlIIIIII.IlIIIlIIIIllIIIllIIIIIIll()) {
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
            boolean bl2 = true;
        }
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_17732;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IllIIlllllllIIlIIlIIIIlIl = string;
    }
}

