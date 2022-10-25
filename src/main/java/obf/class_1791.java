package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.realms.RealmsButton
 *  net.minecraft.realms.RealmsScreen
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.item.ItemStack;

public class class_1791
extends class_0229 {
    private static RealmsScreen lllIIIllIIIIlllIlIIllIIll;

    public class_1791(RealmsScreen realmsScreen) {
        lllIIIllIIIIlllIlIIllIIll = realmsScreen;
        this.lIlIlIIlIIIIlIIIIIlllIIII = Collections.synchronizedList(new ArrayList());
    }

    public RealmsScreen lIllllIIlIIIlIllllllIIIll() {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void n_() {
        lllIIIllIIIIlllIlIIllIIll.init();
        super.n_();
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3) {
        super.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, string, n, n2, n3);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string, int n, int n2, int n3) {
        super.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, string, n, n2, n3);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, n5, n6);
        class_0210.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, n5, n6);
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4, int n5, int n6) {
        class_0229.lllIIIllIIIIlllIlIIllIIll((float)n, (float)n2, (float)n3, (float)n4, n5, n6);
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return super.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        super.lllIlIIlIIIlIlIIIllIlllIl(n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        lllIIIllIIIIlllIlIIllIIll.render(n, n2, f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n, int n2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08972, n, n2);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(String string, int n, int n2) {
        super.lllIlIIlIIIlIlIIIllIlllIl(string, n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(List list, int n, int n2) {
        super.lllIIIllIIIIlllIlIIllIIll(list, n, n2);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        lllIIIllIIIIlllIlIIllIIll.tick();
        super.IlIllllllIIlIIllllIIlIIIl();
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string);
    }

    public void IlIllllllIIlIIllllIIlIIIl(String string, int n, int n2, int n3) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, (float)n, (float)n2, n3);
    }

    public List lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(string, n);
    }

    @Override
    public final void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        lllIIIllIIIIlllIlIIllIIll.buttonClicked(((class_0797)class_11972).IIIllIllIIlIlIlIlIllllIIl());
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
    }

    public void lllIIIllIIIIlllIlIIllIIll(RealmsButton realmsButton) {
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(realmsButton.lllIIIllIIIIlllIlIIllIIll());
    }

    public List IIIllIllIIlIlIlIlIllllIIl() {
        ArrayList<RealmsButton> arrayList = new ArrayList<RealmsButton>(this.lIlIlIIlIIIIlIIIIIlllIIII.size());
        for (class_1197 class_11972 : this.lIlIlIIlIIIIlIIIIIlllIIII) {
            arrayList.add(((class_0797)class_11972).IIIllIllIIlIlIlIlIllllIIl());
        }
        return arrayList;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(RealmsButton realmsButton) {
        this.lIlIlIIlIIIIlIIIIIlllIIII.remove((Object)realmsButton);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        lllIIIllIIIIlllIlIIllIIll.mouseClicked(n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void a_() {
        lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl();
        super.a_();
    }

    @Override
    public void IIlllIlIlllIllIIIlllIIlIl() {
        lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll();
        super.IIlllIlIlllIllIIIlllIIlIl();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, long l) {
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, l);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        lllIIIllIIIIlllIlIIllIIll.keyPressed(c, n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        lllIIIllIIIIlllIlIIllIIll.confirmResult(bl, n);
    }

    @Override
    public void o_() {
        lllIIIllIIIIlllIlIIllIIll.removed();
        super.o_();
    }
}

