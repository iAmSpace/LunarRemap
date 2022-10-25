package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

class class_2228
extends class_1660 {
    private class_1251 llIIllIllIlIIlIIllIllllll;
    final class_1661 lllIIIllIIIIlllIlIIllIIll;

    public class_2228(class_1661 class_16612) {
        super(Minecraft.getMinecraft(), class_16612.lIIIIlIlIIlllllIIllIIlIII(), class_16612.llIIlllIllIllllIIIlIIIIII(), class_16612.llIIlllIllIllllIIIlIIIIII() / 6 + 123 - 14, class_16612.llIIlllIllIllllIIIlIIIIII() / 6 + 164 + 3, 18);
        this.lllIIIllIIIIlllIlIIllIIll = class_16612;
        this.lIlllIlllIIIIlIIlllIllIII(175);
        this.IlIIIIIllllllIIlllIllllll((this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() - this.IIIllIIlIIIIIIlIlIIllIIlI) / 2);
        this.lllIIIllIIIIlllIlIIllIIll(false);
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IlIllllllIIlIIllllIIlIIIl(false);
        this.llIIllIllIlIIlIIllIllllll = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl();
        this.IlIllllllIIlIIllllIIlIIIl(this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll().indexOf(this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll((Integer)this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.first())) * this.IllIIlllllllIIlIIlIIIIlIl);
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll().size();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, boolean bl, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((class_1149)this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll().get(n));
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() / 2 - this.IIIllIIlIIIIIIlIlIIllIIlI / 2;
        int n5 = 4;
        int n6 = 16;
        int n7 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (this.IIIllIllIIlIlIlIlIllllIIl >= n4 + n7 - n6 - n5 && this.IIIllIllIIlIlIlIlIllllIIl <= n4 + n7) {
            this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll();
        } else if (bl) {
            Mouse.next();
            this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll();
            return;
        }
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return ((class_1149)this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll().get(n)).equals(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    protected int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll() * 18;
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl() {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0868 class_08682, int n5, int n6) {
        class_1149 class_11492 = (class_1149)this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll().get(n);
        String string = class_11492.lllIIIllIIIIlllIlIIllIIll;
        if (string.equals("notLoaded") || string.equals("failedToLoad")) {
            string = "dimension " + class_11492.lllIlIIlIIIlIlIIIllIlllIl + "(" + Minecraft.getMinecraft().theWorld.IlIlIIlllIIlIllIIIlllllIl.getClass().getSimpleName() + ")";
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI(), class_11492.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() / 2, n3 + 3, 0xFFFFFF);
        int n7 = 4;
        int n8 = 16;
        n2 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII() / 2 - this.IIIllIIlIIIIIIlIlIIllIIlI / 2;
        int n9 = this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (this.IIIllIllIIlIlIlIlIllllIIl >= n2 + n7 && this.IllIIIllIIIIlIlIlIllIIlll >= n3 && this.IIIllIllIIlIlIlIlIllllIIl <= n2 + n9 + n7 && this.IllIIIllIIIIlIlIlIllIIlll <= n3 + this.IllIIlllllllIIlIIlIIIIlIl) {
            String string2 = null;
            string2 = this.IIIllIllIIlIlIlIlIllllIIl >= n2 + n9 - n8 - n7 && this.IIIllIllIIlIlIlIlIllllIIl <= n2 + n9 ? (this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.contains(class_11492.lllIlIIlIIIlIlIIIllIlllIl) ? class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.dimension.applies") : class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.dimension.notapplies")) : null;
            class_1661.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, string2);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_2210.lllIIIllIIIIlllIlIIllIIll("textures/gui/container/beacon.png");
        int n10 = this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.contains(class_11492.lllIlIIlIIIlIlIIIllIlllIl) ? 91 : 113;
        int n11 = 222;
        class_1661.lllIIIllIIIIlllIlIIllIIll(n2 + n9 - n8, n3 - 2, n10, n11, 16, 16);
    }
}

