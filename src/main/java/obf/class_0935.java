package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public abstract class class_0935
extends class_0229 {
    private float lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;
    protected List IlIllllllIIlIIllllIIlIIIl;
    protected List lIlllIlllIIIIlIIlllIllIII;
    private class_0321 lIllllIIlIIIlIllllllIIIll;
    protected int IlIIIIIllllllIIlllIllllll = 0;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        this.lllllIlllIIllIlIIlIIIllII = class_06672;
        this.lIlIllIIlIIlIIlIIlIIlIIll = class_06672.IlIlllIIIIIIlIIllIIllIlll;
        this.IlIlIIlllIIlIllIIIlllllIl = n;
        this.lIIlIIIIIlIlllIlIIlIlIlll = n2;
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        this.lIllllIIlIIIlIllllllIIIll = new class_0321(this.lllllIlllIIllIlIIlIIIllII, this.lllllIlllIIllIlIIlIIIllII.displayWidth, this.lllllIlllIIllIlIIlIIIllII.displayHeight);
        float f = this.IlIIIIIllllllIIlllIllllll();
        this.lllIIIllIIIIlllIlIIllIIll = (float)n / f;
        this.lllIlIIlIIIlIlIIIllIlllIl = (float)n2 / f;
        this.n_();
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0759 ... arrclass_0759) {
        this.IlIllllllIIlIIllllIIlIIIl = new ArrayList();
        this.IlIllllllIIlIIllllIIlIIIl.addAll(Arrays.asList(arrclass_0759));
        this.IlIIIIIllllllIIlllIllllll = this.IlIllllllIIlIIllllIIlIIIl.size();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0759 ... arrclass_0759) {
        this.IlIllllllIIlIIllllIIlIIIl.addAll(Arrays.asList(arrclass_0759));
        this.n_();
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0759 ... arrclass_0759) {
        this.IlIllllllIIlIIllllIIlIIIl.removeAll(Arrays.asList(arrclass_0759));
        this.n_();
    }

    protected void lIlllIlllIIIIlIIlllIllIII(class_0759 ... arrclass_0759) {
        this.lIlllIlllIIIIlIIlllIllIII = new ArrayList();
        this.lIlllIlllIIIIlIIlllIllIII.addAll(Arrays.asList(arrclass_0759));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        float f2 = this.IlIIIIIllllllIIlllIllllll();
        GL11.glPushMatrix();
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        this.lllIIIllIIIIlllIlIIllIIll((float)n / f2, (float)n2 / f2);
        GL11.glPopMatrix();
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        float f = this.IlIIIIIllllllIIlllIllllll();
        this.lllIIIllIIIIlllIlIIllIIll((float)n / f, (float)n2 / f, n3);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        float f = this.IlIIIIIllllllIIlllIllllll();
        this.lllIlIIlIIIlIlIIIllIlllIl((float)n / f, (float)n2 / f, n3);
    }

    public abstract void lllIIIllIIIIlllIlIIllIIll(float var1, float var2);

    protected abstract void lllIIIllIIIIlllIlIIllIIll(float var1, float var2, int var3);

    public abstract void lllIlIIlIIIlIlIIIllIlllIl(float var1, float var2, int var3);

    public float IlIIIIIllllllIIlllIllllll() {
        float f;
        switch (this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll()) {
            case 1: {
                f = 0.5f;
                break;
            }
            case 2: {
                f = 1.0f;
                break;
            }
            case 3: {
                f = 1.5f;
                break;
            }
            case 4: {
                f = 2.0f;
                break;
            }
            default: {
                f = 1.0f;
            }
        }
        return 1.0f / f;
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    protected void IllIIlllllllIIlIIlIIIIlIl() {
        this.IlIllllllIIlIIllllIIlIIIl.forEach(class_0759::lllIlIIlIIIlIlIIIllIlllIl);
    }

    protected void IIIllIllIIlIlIlIlIllllIIl() {
        this.IlIllllllIIlIIllllIIlIIIl.forEach(class_0759::lllIIIllIIIIlllIlIIllIIll);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(char c, int n) {
        for (class_0759 class_07592 : this.IlIllllllIIlIIllllIIlIIIl) {
            class_07592.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
    }

    protected void IllIIIllIIIIlIlIlIllIIlll() {
        this.IlIllllllIIlIIllllIIlIIIl.forEach(class_0759::IlIllllllIIlIIllllIIlIIIl);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, class_0759 ... arrclass_0759) {
        List<class_0759> list = Arrays.asList(arrclass_0759);
        for (class_0759 class_07592 : this.IlIllllllIIlIIllllIIlIIIl) {
            if (list.contains(class_07592)) continue;
            class_07592.lllIlIIlIIIlIlIIIllIlllIl(f, f2, this.lllIIIllIIIIlllIlIIllIIll(class_07592, f, f2, new class_0759[0]));
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl(float f, float f2, int n) {
        class_0759 class_07592;
        Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl.iterator();
        while (!(!iterator.hasNext() || (class_07592 = (class_0759)iterator.next()).lllIIIllIIIIlllIlIIllIIll(f, f2) && class_07592.lllIlIIlIIIlIlIIIllIlllIl(f, f2, n, this.lllIIIllIIIIlllIlIIllIIll(class_07592, f, f2, new class_0759[0])))) {
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(float f, float f2, int n, class_0759 ... arrclass_0759) {
        class_0759 class_075922;
        List<class_0759> list = Arrays.asList(arrclass_0759);
        class_0759 class_07593 = null;
        boolean bl = false;
        for (class_0759 class_075922 : this.IlIllllllIIlIIllllIIlIIIl) {
            if (list.contains(class_075922) || !class_075922.lllIIIllIIIIlllIlIIllIIll(f, f2)) continue;
            if (!this.lIlllIlllIIIIlIIlllIllIII.contains(class_075922)) {
                class_07593 = class_075922;
            }
            if (!class_075922.lllIIIllIIIIlllIlIIllIIll(f, f2, n, this.lllIIIllIIIIlllIlIIllIIll(class_075922, f, f2, arrclass_0759))) continue;
            bl = true;
            break;
        }
        if (bl) {
            return;
        }
        if (class_07593 != null) {
            this.IlIllllllIIlIIllllIIlIIIl.add(this.IlIllllllIIlIIllllIIlIIIl.remove(this.IlIllllllIIlIIllllIIlIIIl.indexOf(class_07593)));
        }
        Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl.iterator();
        while (iterator.hasNext() && !(class_075922 = (class_0759)iterator.next()).lllIIIllIIIIlllIlIIllIIll(f, f2, n)) {
        }
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_0759 class_07592, float f, float f2, class_0759 ... arrclass_0759) {
        class_0759 class_07593;
        List<class_0759> list = Arrays.asList(arrclass_0759);
        boolean bl = true;
        for (int i = this.IlIllllllIIlIIllllIIlIIIl.size() - 1; i >= 0 && (class_07593 = (class_0759)this.IlIllllllIIlIIllllIIlIIIl.get(i)) != class_07592; --i) {
            if (list.contains(class_07593) || !class_07593.lllIIIllIIIIlllIlIIllIIll(f, f2)) continue;
            bl = false;
            break;
        }
        return bl;
    }

    public List lIIIIlIlIIlllllIIllIIlIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_0321 llIIlllIllIllllIIIlIIIIII() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0321 class_03212) {
        this.lIllllIIlIIIlIllllllIIIll = class_03212;
    }
}

