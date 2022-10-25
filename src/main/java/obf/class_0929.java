package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0929
extends class_1716 {
    private final ResourceLocation IIIllIIlIIIIIIlIlIIllIIlI = new ResourceLocation("client/dash-logo-54.png");
    private final ResourceLocation IllIIlllllllIIlIIlIIIIlIl = new ResourceLocation("client/icons/play-24.png");
    private final List IIIllIllIIlIlIlIlIllllIIl;
    private final class_0847 IllIIIllIIIIlIlIlIllIIlll = new class_0847(300L);
    private float lIIIIlIlIIlllllIIllIIlIII;
    private boolean llIIlllIllIllllIIIlIIIIII;
    private final class_1189 llIIllIllIlIIlIIllIllllll;
    private final class_1326 lllIIlIIIllllllIIIIlIlIlI;
    private final class_0869 IlIlllIIIIIIlIIllIIllIlll;
    private final class_0806 IlIlIIlIlIllIIlIlIIllIIIl;

    public class_0929() {
        this.llIIllIllIlIIlIIllIllllll = new class_1189(LunarClient.getInstance().getSettingsManager().llIIllIllIlIIlIIllIllllll);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_1326(this);
        this.IlIlllIIIIIIlIIllIIllIlll = new class_0869(this.lIllllIIlIIIlIllllllIIIll.robotoMedium13px, "Filter", -11842741, -11842741);
        this.IlIlIIlIlIllIIlIlIIllIIIl = new class_0806((Boolean)this.lIllllIIlIIIlIllllllIIIll.getSettingsManager().IlIlIIlIlIllIIlIlIIllIIIl.getValue() != false ? "Unpin" : "Pin");
        this.IIIllIllIIlIlIlIlIllllIIl = new ArrayList();
        for (class_1878 class_18782 : LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().lllIlIIlIIIlIlIIIllIlllIl()) {
            this.IIIllIllIIlIlIlIlIllllIIl.add(new class_0148(this, class_18782));
        }
    }

    public void IIIllIllIIlIlIlIlIllllIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0148 class_01482) {
        return this.IlIlllIIIIIIlIIllIIllIlll.IIIllIllIIlIlIlIlIllllIIl().equals("") || class_01482.IllIIlllllllIIlIIlIIIIlIl().IIIllIIlIIIIIIlIlIIllIIlI().toLowerCase().startsWith(this.IlIlllIIIIIIlIIllIIllIlll.IIIllIllIIlIlIlIlIllllIIl().toLowerCase()) || class_01482.IllIIlllllllIIlIIlIIIIlIl().IlIIIIIllllllIIlllIllllll().toLowerCase().startsWith(this.IlIlllIIIIIIlIIllIIllIlll.IIIllIllIIlIlIlIlIllllIIl().toLowerCase());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4) {
        super.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4);
        if (this.lIIIIlIlIIlllllIIllIIlIII == 0.0f) {
            this.lIIIIlIlIIlllllIIllIIlIII = f4;
        }
        this.IIIllIllIIlIlIlIlIllllIIl.sort((class_01482, class_01483) -> {
            if (class_01482.IllIIlllllllIIlIIlIIIIlIl().IllIIlllllllIIlIIlIIIIlIl() && !class_01483.IllIIlllllllIIlIIlIIIIlIl().IllIIlllllllIIlIIlIIIIlIl()) {
                return -1;
            }
            if (!class_01482.IllIIlllllllIIlIIlIIIIlIl().IllIIlllllllIIlIIlIIIIlIl() && class_01483.IllIIlllllllIIlIIlIIIIlIl().IllIIlllllllIIlIIlIIIIlIl()) {
                return 1;
            }
            return 0;
        });
        this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f, f2 + this.lIIIIlIlIIlllllIIllIIlIII, f3, 8.0f);
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(f, f2 + this.lIIIIlIlIIlllllIIllIIlIII + 8.0f, f3 - 30.0f, 13.0f);
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(f + f3 - 30.0f, f2 + this.lIIIIlIlIIlllllIIllIIlIII + 8.0f, 30.0f, 13.0f);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f + f3 - 5.0f, f2 + this.lIIIIlIlIIlllllIIllIIlIII + 21.0f, 5.0f, 99.0f);
        int n = 0;
        int n2 = 20;
        for (class_0148 class_01484 : this.IIIllIllIIlIlIlIlIllllIIl) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_01484)) continue;
            float f5 = f2 + 21.0f + this.lIIIIlIlIIlllllIIllIIlIII + (float)n;
            class_01484.lllIIIllIIIIlllIlIIllIIll(f, f5, f3 - 5.0f, 20.0f);
            n += 20;
        }
        this.lllIIlIIIllllllIIIIlIlIlI.IlIIIIIllllllIIlllIllllll(n);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(float f, float f2) {
        return f > this.lllIIIllIIIIlllIlIIllIIll && f < this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl && f2 > this.lllIlIIlIIIlIlIIIllIlllIl && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl(f, f2);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII, -14540254);
        class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll + this.lIIIIlIlIIlllllIIllIIlIII, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII, -1);
        class_1878 class_18782 = LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().IlIIIIIllllllIIlllIllllll();
        if (class_18782 != null) {
            if (class_18782.lllIIIllIIIIlllIlIIllIIll == null && !class_18782.llIIllIllIlIIlIIllIllllll().equals("")) {
                if (class_18782.lllIlIIlIIIlIlIIIllIlllIl != null) {
                    this.IlIIIIIllllllIIlllIllllll.llIIlIIllIIllIlIIllIIllII().IlIllllllIIlIIllllIIlIIIl(class_18782.lllIlIIlIIIlIlIIIllIlllIl);
                    class_18782.lllIlIIlIIIlIlIIIllIlllIl = null;
                }
                class_18782.lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("client/songs/" + class_18782.IllIIIllIIIIlIlIlIllIIlll());
                class_1085 class_10852 = new class_1085(null, class_18782.llIIllIllIlIIlIIllIllllll(), this.IIIllIIlIIIIIIlIlIIllIIlI, null);
                Minecraft.getMinecraft().IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_18782.lllIIIllIIIIlllIlIIllIIll, class_10852);
            }
            ResourceLocation class_17732 = class_18782.lllIIIllIIIIlllIlIIllIIll == null ? this.IIIllIIlIIIIIIlIlIIllIIlI : class_18782.lllIIIllIIIIlllIlIIllIIll;
            class_0857.lllIIIllIIIIlllIlIIllIIll(class_17732, this.lIIIIlIlIIlllllIIllIIlIII / 2.0f, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl);
            float f3 = this.lllIIIllIIIIlllIlIIllIIll + 50.0f;
            if (this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII == class_0713.IlIlllIIIIIIlIIllIIllIlll()) {
                boolean bl2;
                boolean bl3 = bl2 = this.lllIIIllIIIIlllIlIIllIIll(f, f2) && f > this.lllIIIllIIIIlllIlIIllIIll + 34.0f && f < this.lllIIIllIIIIlllIlIIllIIll + 44.0f && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII;
                if (!class_1868.IlIllllllIIlIIllllIIlIIIl()) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(bl2 ? 1.0f : 0.8f));
                    class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, 6.0f, this.lllIIIllIIIIlllIlIIllIIll + 34.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 7.5f);
                } else {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 36.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 9.0f, this.lllIIIllIIIIlllIlIIllIIll + 38.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII - 11.0f, bl2 ? -1 : -1342177281);
                    class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + 40.0f, this.lllIlIIlIIIlIlIIIllIlllIl + 9.0f, this.lllIIIllIIIIlllIlIIllIIll + 42.0f, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII - 11.0f, bl2 ? -1 : -1342177281);
                }
            } else {
                f3 = this.lllIIIllIIIIlllIlIIllIIll + 34.0f;
            }
            String string = class_18782.IllIIIllIIIIlIlIlIllIIlll();
            if ((float) LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl(string) > this.IlIllllllIIlIIllllIIlIIIl - 52.0f) {
                LunarClient.getInstance().robotoBold12px.lllIIIllIIIIlllIlIIllIIll(string, f3, this.lllIlIIlIIIlIlIIIllIlllIl + 4.0f, -1);
            } else {
                LunarClient.getInstance().robotoLight16px.lllIIIllIIIIlllIlIIllIIll(string, f3, this.lllIlIIlIIIlIlIIIllIlllIl + 4.0f, -1);
            }
            LunarClient.getInstance().robotoBold12px.lllIIIllIIIIlllIlIIllIIll(class_18782.lIIIIlIlIIlllllIIllIIlIII(), f3, this.lllIlIIlIIIlIlIIIllIlllIl + 14.0f, -1342177281);
        }
        float f4 = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl);
        if (this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI()) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIIIIlIlIIlllllIIllIIlIII + 120.0f * f4);
            this.llIIlllIllIllllIIIlIIIIII = true;
        } else if (!this.IllIIIllIIIIlIlIlIllIIlll.IIIllIIlIIIIIIlIlIIllIIlI() && !this.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.llIIlllIllIllllIIIlIIIIII = false;
        }
        if (this.llIIlllIllIllllIIIlIIIIII) {
            GL11.glPushMatrix();
            GL11.glEnable((int)3089);
            class_0713 class_07132 = class_0713.IlIlllIIIIIIlIIllIIllIlll();
            class_0857.lllIIIllIIIIlllIlIIllIIll((int)this.lllIIIllIIIIlllIlIIllIIll, (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII), (int)(this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl), (int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII + (this.lIlllIlllIIIIlIIlllIllIII - this.lIIIIlIlIIlllllIIllIIlIII) * f4), (float)((int)((float)class_07132.llIIlllIllIllllIIIlIIIIII().IlIIIIIllllllIIlllIllllll() * class_07132.IlIIIIIllllllIIlllIllllll())), (int)class_07132.IIIllIIlIIIIIIlIlIIllIIlI());
            class_0210.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII, this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, -14540254);
            this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl(f, f2, bl);
            for (class_0148 class_01482 : this.IIIllIllIIlIlIlIlIllllIIl) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_01482)) continue;
                class_01482.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl(), bl && !this.lllIIlIIIllllllIIIIlIlIlI.llIIlllIllIllllIIIlIIIIII() && !this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f, f2));
            }
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
            this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl(f, f2, bl);
            this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, bl);
            GL11.glDisable((int)3089);
            GL11.glPopMatrix();
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll();
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(c, n);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(c, n);
        if (this.IlIlllIIIIIIlIIllIIllIlll.lllllIlllIIllIlIIlIIIllII()) {
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n) {
        if (!this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(f, f2) && this.IlIlllIIIIIIlIIllIIllIlll.lllllIlllIIllIlIIlIIIllII()) {
            this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(false);
        }
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, boolean bl) {
        boolean bl2;
        this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
        if (this.IlIlllIIIIIIlIIllIIllIlll.lllllIlllIIllIlIIlIIIllII() && n == 1 && this.IlIlllIIIIIIlIIllIIllIlll.IIIllIllIIlIlIlIlIllllIIl().equals("")) {
            this.IIIllIllIIlIlIlIlIllllIIl();
        }
        if (!bl) {
            return false;
        }
        boolean bl3 = bl2 = this.lllIIIllIIIIlllIlIIllIIll(f, f2) && f > this.lllIIIllIIIIlllIlIIllIIll + 34.0f && f < this.lllIIIllIIIIlllIlIIllIIll + 44.0f && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII;
        if (bl2) {
            if (!class_1868.IlIllllllIIlIIllllIIlIIIl()) {
                LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll();
            } else {
                class_1868.lllIlIIlIIIlIlIIIllIlllIl();
            }
        }
        float f3 = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(f, f2) && bl);
        if (this.IllIIIllIIIIlIlIlIllIIlll.IlIIIlIIIIllIIIllIIIIIIll()) {
            boolean bl4;
            this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
            this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
            this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
            boolean bl5 = bl4 = f > (float)((int)this.lllIIIllIIIIlllIlIIllIIll) && f < (float)((int)(this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl)) && f2 > (float)((int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII + 21.0f)) && f2 < (float)((int)(this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII + 21.0f + (this.lIlllIlllIIIIlIIlllIllIII - this.lIIIIlIlIIlllllIIllIIlIII - 21.0f) * f3));
            if (bl4) {
                class_0148 class_01482;
                Iterator iterator = this.IIIllIllIIlIlIlIlIllllIIl.iterator();
                while (!(!iterator.hasNext() || this.lllIIIllIIIIlllIlIIllIIll(class_01482 = (class_0148)iterator.next()) && class_01482.lllIIIllIIIIlllIlIIllIIll(f, f2 - this.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl(), n, bl))) {
                }
            }
            if (this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
                this.lIllllIIlIIIlIllllllIIIll.getSettingsManager().IlIlIIlIlIllIIlIlIIllIIIl.setValue((Boolean)this.lIllllIIlIIIlIllllllIIIll.getSettingsManager().IlIlIIlIlIllIIlIlIIllIIIl.getValue() == false);
                this.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll((Boolean)this.lIllllIIlIIIlIllllllIIIll.getSettingsManager().IlIlIIlIlIllIIlIlIIllIIIl.getValue() != false ? "Unpin" : "Pin");
            }
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(f, f2) && f2 < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIIIIlIlIIlllllIIllIIlIII && !bl2 && !this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(f, f2) && !this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f, f2)) {
            this.IlIllllllIIlIIllllIIlIIIl(f, f2);
        }
        return super.lllIIIllIIIIlllIlIIllIIll(f, f2, n, bl);
    }
}

