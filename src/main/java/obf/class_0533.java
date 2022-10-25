package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_0533
extends class_0229
implements class_0945 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl = false;

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        if (this.lllllIlllIIllIlIIlIIIllII.theWorld.lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII()) {
            if (this.lllllIlllIIllIlIIlIIIllII.IIIIlIllIlIIlIIlIllIlIlll()) {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96, class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.deleteWorld", new Object[0])));
            } else {
                this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96, class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.leaveServer", new Object[0])));
            }
        } else {
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 72, class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.respawn", new Object[0])));
            this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 100, this.lIIlIIIIIlIlllIlIIlIlIlll / 4 + 96, class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.titleScreen", new Object[0])));
            if (this.lllllIlllIIllIlIIlIIIllII.getSession() == null) {
                ((class_1197)this.lIlIlIIlIIIIlIIIIIlllIIII.get((int)1)).IllIIIllIIIIlIlIlIllIIlll = false;
            }
        }
        for (class_1197 class_11972 : this.lIlIlIIlIIIIlIIIIIlllIIII) {
            class_11972.IllIIIllIIIIlIlIlIllIIlll = false;
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        switch (class_11972.IIIllIllIIlIlIlIlIllllIIl) {
            case 0: {
                this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIlIlIIlIIIIlIIIIIlllIIII();
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                break;
            }
            case 1: {
                class_0923 class_09232 = new class_0923(this, class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.quit.confirm", new Object[0]), "", class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.titleScreen", new Object[0]), class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.respawn", new Object[0]), 0);
                this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(class_09232);
                class_09232.lllIIIllIIIIlllIlIIllIIll(20);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        if (bl) {
            this.lllllIlllIIllIlIIlIIIllII.theWorld.q_();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0564)null);
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2097());
        } else {
            this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lIlIlIIlIIIIlIIIIIlllIIII();
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        class_0533.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, (float)this.IlIlIIlllIIlIllIIIlllllIl, (float)this.lIIlIIIIIlIlllIlIIlIlIlll, 0x60500000, -1602211792);
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        boolean bl = this.lllllIlllIIllIlIIlIIIllII.theWorld.lIlllIlllIlIIIIlllIlIlIIl().lIlIlIIlIIIIlIIIIIlllIIII();
        String string = bl ? class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.title.hardcore", new Object[0]) : class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.title", new Object[0]);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, string, this.IlIlIIlllIIlIllIIIlllllIl / 2 / 2, 30, 0xFFFFFF);
        GL11.glPopMatrix();
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.hardcoreInfo", new Object[0]), this.IlIlIIlllIIlIllIIIlllllIl / 2, 144, 0xFFFFFF);
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_0616.lllIIIllIIIIlllIlIIllIIll("deathScreen.score", new Object[0]) + ": " + (Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IIIIIlllIIllllIlllIlllIIl(), this.IlIlIIlllIIlIllIIIlllllIl / 2, 100, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        ++this.lllIIIllIIIIlllIlIIllIIll;
        if (this.lllIIIllIIIIlllIlIIllIIll == 20) {
            for (class_1197 class_11972 : this.lIlIlIIlIIIIlIIIIIlllIIII) {
                class_11972.IllIIIllIIIIlIlIlIllIIlll = true;
            }
        }
    }
}

