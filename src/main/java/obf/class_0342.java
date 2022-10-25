package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C16PacketClientStatus;
import org.lwjgl.opengl.GL11;

public class class_0342
extends class_0229
implements class_1216 {
    private static class_1785 lIlllIlllIIIIlIIlllIllIII = new class_1785();
    protected class_0229 lllIlIIlIIIlIlIIIllIlllIl;
    protected String IlIllllllIIlIIllllIIlIIIl = "Select world";
    private class_1087 IlIIIIIllllllIIlllIllllll;
    private class_0696 lIllllIIlIIIlIllllllIIIll;
    private class_1159 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0996 IllIIlllllllIIlIIlIIIIlIl;
    private class_1707 IIIllIllIIlIlIlIlIllllIIl;
    private class_0579 IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII = true;

    public class_0342(class_0229 class_02292, class_1707 class_17072) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_02292;
        this.IIIllIllIIlIlIlIlIllllIIl = class_17072;
    }

    @Override
    public void n_() {
        this.IlIllllllIIlIIllllIIlIIIl = class_0616.lllIIIllIIIIlllIlIIllIIll("gui.stats", new Object[0]);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().lllIIIllIIIIlllIlIIllIIll(new C16PacketClientStatus(class_1297.lllIlIIlIIIlIlIIIllIlllIl));
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 4, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.done", new Object[0])));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 160, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 80, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("stat.generalButton", new Object[0])));
        class_1197 class_11972 = new class_1197(2, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 80, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 80, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("stat.blocksButton", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_11972);
        class_1197 class_11973 = new class_1197(3, this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 80, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("stat.itemsButton", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_11973);
        class_1197 class_11974 = new class_1197(4, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 80, this.lIIlIIIIIlIlllIlIIlIlIlll - 52, 80, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("stat.mobsButton", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(class_11974);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll() == 0) {
            class_11972.IllIIIllIIIIlIlIlIllIIlll = false;
        }
        if (this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll() == 0) {
            class_11973.IllIIIllIIIIlIlIlIllIIlll = false;
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll() == 0) {
            class_11974.IllIIIllIIIIlIlIlIllIIlll = false;
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
                this.IllIIIllIIIIlIlIlIllIIlll = this.IlIIIIIllllllIIlllIllllll;
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 3) {
                this.IllIIIllIIIIlIlIlIllIIlll = this.lIllllIIlIIIlIllllllIIIll;
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 2) {
                this.IllIIIllIIIIlIlIlIllIIlll = this.IIIllIIlIIIIIIlIlIIllIIlI;
            } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 4) {
                this.IllIIIllIIIIlIlIlIllIIlll = this.IllIIlllllllIIlIIlIIIIlIl;
            } else {
                this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(class_11972);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            this.llIIlIllIllllIlIIIIlIIlll();
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("multiplayer.downloadingStats", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2, 0xFFFFFF);
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, lllIIIllIIIIlllIlIIllIIll[(int)(Minecraft.getSystemTime() / 150L % (long)lllIIIllIIIIlllIlIIllIIll.length)], this.IlIlIIlllIIlIllIIIlllllIl / 2, this.lIIlIIIIIlIlllIlIIlIlIlll / 2 + this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll * 2, 0xFFFFFF);
        } else {
            this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIllllllIIlIIllllIIlIIIl, this.IlIlIIlllIIlIllIIIlllllIl / 2, 20, 0xFFFFFF);
            super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            this.IlIIIIIllllllIIlllIllllll = new class_1087(this);
            this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(1, 1);
            this.lIllllIIlIIIlIllllllIIIll = new class_0696(this);
            this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(1, 1);
            this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1159(this);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(1, 1);
            this.IllIIlllllllIIlIIlIIIIlIl = new class_0996(this);
            this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII(1, 1);
            this.IllIIIllIIIIlIlIlIllIIlll = this.IlIIIIIllllllIIlllIllllll;
            this.lIllllIIlIIIlIllllllIIIll();
            this.lIIIIlIlIIlllllIIllIIlIII = false;
        }
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return !this.lIIIIlIlIIlllllIIllIIlIII;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, Item class_06112) {
        this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1);
        GL11.glEnable((int)32826);
        class_0624.IlIllllllIIlIIllllIIlIIIl();
        lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), new ItemStack(class_06112, 1, 0), n + 2, n2 + 2);
        class_0624.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)32826);
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl(n, n2, 0, 0);
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(llIIllIllIlIIlIIllIllllll);
        float f = 0.0078125f;
        float f2 = 0.0078125f;
        boolean bl = true;
        boolean bl2 = true;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 18, IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 18, n2 + 18, IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 18, n2 + 0, IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 18) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 0) * 0.0078125f, (float)(n4 + 0) * 0.0078125f);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    static /* synthetic */ Minecraft lllIIIllIIIIlllIlIIllIIll(class_0342 class_03422) {
        return class_03422.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_0342 class_03422, int n, int n2, int n3, int n4) {
        class_03422.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n4);
    }

    static /* synthetic */ Minecraft lllIlIIlIIIlIlIIIllIlllIl(class_0342 class_03422) {
        return class_03422.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ class_1707 IlIllllllIIlIIllllIIlIIIl(class_0342 class_03422) {
        return class_03422.IIIllIllIIlIlIlIlIllllIIl;
    }

    static /* synthetic */ class_1854 lIlllIlllIIIIlIIlllIllIII(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IlIIIIIllllllIIlllIllllll(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 lIllllIIlIIIlIllllllIIIll(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IIIllIIlIIIIIIlIlIIllIIlI(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IllIIlllllllIIlIIlIIIIlIl(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IIIllIllIIlIlIlIlIllllIIl(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IllIIIllIIIIlIlIlIllIIlll(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 lIIIIlIlIIlllllIIllIIlIII(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ void lllIIIllIIIIlllIlIIllIIll(class_0342 class_03422, int n, int n2, Item class_06112) {
        class_03422.lllIIIllIIIIlllIlIIllIIll(n, n2, class_06112);
    }

    static /* synthetic */ Minecraft llIIlllIllIllllIIIlIIIIII(class_0342 class_03422) {
        return class_03422.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ class_1854 llIIllIllIlIIlIIllIllllll(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 lllIIlIIIllllllIIIIlIlIlI(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IlIlllIIIIIIlIIllIIllIlll(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ Minecraft IlIlIIlIlIllIIlIlIIllIIIl(class_0342 class_03422) {
        return class_03422.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ class_1854 lllllIlllIIllIlIIlIIIllII(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IlIlIIlllIIlIllIIIlllllIl(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 lIIlIIIIIlIlllIlIIlIlIlll(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 lIlIlIIlIIIIlIIIIIlllIIII(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IlIIIlIIIIllIIIllIIIIIIll(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 IIlllIlIlllIllIIIlllIIlIl(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    static /* synthetic */ class_1854 lIlIllIIlIIlIIlIIlIIlIIll(class_0342 class_03422) {
        return class_03422.lIlIllIIlIIlIIlIIlIIlIIll;
    }
}

