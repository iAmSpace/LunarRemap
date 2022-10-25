package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

import java.io.Serializable;
import java.util.TreeSet;

public class class_0368
implements Serializable,
Comparable {
    private static final long lIIlIIIIIlIlllIlIIlIlIlll = 8136790917447997951L;
    public String lllIIIllIIIIlllIlIIllIIll;
    public String lllIlIIlIIIlIlIIIllIlllIl = "";
    public String IlIllllllIIlIIllllIIlIIIl = "";
    public boolean lIlllIlllIIIIlIIlllIllIII = false;
    public String IlIIIIIllllllIIlllIllllll = "";
    public boolean lIllllIIlIIIlIllllllIIIll;
    public boolean IIIllIIlIIIIIIlIlIIllIIlI;
    public TreeSet IllIIlllllllIIlIIlIIIIlIl = new TreeSet();
    public int IIIllIllIIlIlIlIlIllllIIl;
    public int IllIIIllIIIIlIlIlIllIIlll;
    public int lIIIIlIlIIlllllIIllIIlIII;
    public boolean llIIlllIllIllllIIIlIIIIII;
    public boolean llIIllIllIlIIlIIllIllllll;
    public boolean lllIIlIIIllllllIIIIlIlIlI = true;
    public boolean IlIlllIIIIIIlIIllIIllIlll = true;
    public float IlIlIIlIlIllIIlIlIIllIIIl = 0.0f;
    public float lllllIlllIIllIlIIlIIIllII = 1.0f;
    public float IlIlIIlllIIlIllIIIlllllIl = 0.0f;

    public class_0368(String string, int n, int n2, int n3, boolean bl, float f, float f2, float f3, String string2, String string3, TreeSet treeSet, boolean bl2) {
        this(string, n, n2, n3, bl, f, f2, f3, string2, string3, treeSet);
        this.lIlllIlllIIIIlIIlllIllIII = bl2;
        if (!treeSet.contains(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI)) {
            this.IlIlllIIIIIIlIIllIIllIlll = false;
        }
    }

    public class_0368(String string, int n, int n2, int n3, boolean bl, float f, float f2, float f3, String string2, String string3, TreeSet treeSet, boolean bl2, boolean bl3) {
        this(string, n, n2, n3, bl, f, f2, f3, string2, string3, treeSet);
        this.lIlllIlllIIIIlIIlllIllIII = bl2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl3;
        if (!treeSet.contains(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI)) {
            this.IlIlllIIIIIIlIIllIIllIlll = false;
        }
    }

    public class_0368(String string, int n, int n2, int n3, boolean bl, float f, float f2, float f3, String string2, String string3, TreeSet treeSet) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
        this.IllIIIllIIIIlIlIlIllIIlll = n2;
        this.lIIIIlIlIIlllllIIllIIlIII = n3;
        this.llIIlllIllIllllIIIlIIIIII = bl;
        this.IlIlIIlIlIllIIlIlIIllIIIl = f;
        this.lllllIlllIIllIlIIlIIIllII = f2;
        this.IlIlIIlllIIlIllIIIlllllIl = f3;
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
        this.IlIllllllIIlIIllllIIlIIIl = string3;
        this.IllIIlllllllIIlIIlIIIIlIl = treeSet;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return -16777216 + ((int)(this.IlIlIIlIlIllIIlIlIIllIIIl * 255.0f) << 16) + ((int)(this.lllllIlllIIllIlIIlIIIllII * 255.0f) << 8) + (int)(this.IlIlIIlllIIlIllIIIlllllIl * 255.0f);
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.llIIlllIllIllllIIIlIIIIII && (this.IlIIIIIllllllIIlllIllllll.equals("") || this.IlIIIIIllllllIIlllIllllll.equals(LunarClient.getInstance().getNetworkManager().IIIllIllIIlIlIlIlIllllIIl())) && this.lllIIlIIIllllllIIIIlIlIlI && this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI == -1 && this.IlIIIIIllllllIIlllIllllll.equals("") ? this.IIIllIllIIlIlIlIlIllllIIl / 8 : this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI == -1 && this.IlIIIIIllllllIIlllIllllll.equals("") ? this.IllIIIllIIIIlIlIlIllIIlll / 8 : this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IIIllIllIIlIlIlIlIllllIIl = Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI == -1 && this.IlIIIIIllllllIIlllIllllll.equals("") ? n * 8 : n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IllIIIllIIIIlIlIlIllIIlll = Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI == -1 && this.IlIIIIIllllllIIlllIllllll.equals("") ? n * 8 : n;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.lIIIIlIlIIlllllIIllIIlIII = n;
    }

    public int compareTo(Object object) {
        double d = this.lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII);
        double d2 = ((class_0368)object).lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII);
        return Double.compare(d, d2);
    }

    public double lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        double d = (double)this.IlIllllllIIlIIllllIIlIIIl() - class_15212.IlIIlllllIIlIlIlllllIllll;
        double d2 = (double)this.IlIIIIIllllllIIlllIllllll() - class_15212.llIIlIlIlllIIllIlIlllIllI;
        double d3 = (double)this.lIlllIlllIIIIlIIlllIllIII() - class_15212.IllIIIIllIIllIllIlllIlIIl;
        return d * d + d2 * d2 + d3 * d3;
    }
}

