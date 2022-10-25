package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class class_1599 {
    private static class_1599 lllIIIllIIIIlllIlIIllIIll = null;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;
    private final int IlIIIIIllllllIIlllIllllll;
    private final int lIllllIIlIIIlIllllllIIIll;
    private final boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private final boolean IllIIlllllllIIlIIlIIIIlIl;

    private class_1599(boolean bl, boolean bl2, int n, int n2, int n3, int n4, int n5) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.IlIIIIIllllllIIlllIllllll = n4;
        this.IllIIlllllllIIlIIlIIIIlIl = bl2;
        this.lIllllIIlIIIlIllllllIIIll = n5;
    }

    public class_1599() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    public class_1599(int n, int n2, int n3) {
        this(false, false, n, n2, n, n2, n3);
    }

    public class_1599(int n, int n2, int n3, int n4, int n5) {
        this(true, false, n, n2, n3, n4, n5);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        if (!this.equals(lllIIIllIIIIlllIlIIllIIll)) {
            if (lllIIIllIIIIlllIlIIllIIll == null || this.IllIIlllllllIIlIIlIIIIlIl != lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl()) {
                lllIIIllIIIIlllIlIIllIIll = this;
                if (this.IllIIlllllllIIlIIlIIIIlIl) {
                    GL11.glDisable((int)3042);
                    return;
                }
                GL11.glEnable((int)3042);
            }
            GL14.glBlendEquation((int)this.lIllllIIlIIIlIllllllIIIll);
            if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
                GL14.glBlendFuncSeparate((int)this.lllIlIIlIIIlIlIIIllIlllIl, (int)this.lIlllIlllIIIIlIIlllIllIII, (int)this.IlIllllllIIlIIllllIIlIIIl, (int)this.IlIIIIIllllllIIlllIllllll);
            } else {
                GL11.glBlendFunc((int)this.lllIlIIlIIIlIlIIIllIlllIl, (int)this.lIlllIlllIIIIlIIlllIllIII);
            }
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class_1599)) {
            return false;
        }
        class_1599 class_15992 = (class_1599)object;
        return this.lIllllIIlIIIlIllllllIIIll != class_15992.lIllllIIlIIIlIllllllIIIll ? false : (this.IlIIIIIllllllIIlllIllllll != class_15992.IlIIIIIllllllIIlllIllllll ? false : (this.lIlllIlllIIIIlIIlllIllIII != class_15992.lIlllIlllIIIIlIIlllIllIII ? false : (this.IllIIlllllllIIlIIlIIIIlIl != class_15992.IllIIlllllllIIlIIlIIIIlIl ? false : (this.IIIllIIlIIIIIIlIlIIllIIlI != class_15992.IIIllIIlIIIIIIlIlIIllIIlI ? false : (this.IlIllllllIIlIIllllIIlIIIl != class_15992.IlIllllllIIlIIllllIIlIIIl ? false : this.lllIlIIlIIIlIlIIIllIlllIl == class_15992.lllIlIIlIIIlIlIIIllIlllIl)))));
    }

    public int hashCode() {
        int n = this.lllIlIIlIIIlIlIIIllIlllIl;
        n = 31 * n + this.IlIllllllIIlIIllllIIlIIIl;
        n = 31 * n + this.lIlllIlllIIIIlIIlllIllIII;
        n = 31 * n + this.IlIIIIIllllllIIlllIllllll;
        n = 31 * n + this.lIllllIIlIIIlIllllllIIIll;
        n = 31 * n + (this.IIIllIIlIIIIIIlIlIIllIIlI ? 1 : 0);
        n = 31 * n + (this.IllIIlllllllIIlIIlIIIIlIl ? 1 : 0);
        return n;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public static class_1599 lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        if (jsonObject == null) {
            return new class_1599();
        }
        int n = 32774;
        int n2 = 1;
        int n3 = 0;
        int n4 = 1;
        int n5 = 0;
        boolean bl = true;
        boolean bl2 = false;
        if (class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "func") && (n = class_1599.lllIIIllIIIIlllIlIIllIIll(jsonObject.get("func").getAsString())) != 32774) {
            bl = false;
        }
        if (class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "srcrgb") && (n2 = class_1599.lllIlIIlIIIlIlIIIllIlllIl(jsonObject.get("srcrgb").getAsString())) != 1) {
            bl = false;
        }
        if (class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "dstrgb") && (n3 = class_1599.lllIlIIlIIIlIlIIIllIlllIl(jsonObject.get("dstrgb").getAsString())) != 0) {
            bl = false;
        }
        if (class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "srcalpha")) {
            n4 = class_1599.lllIlIIlIIIlIlIIIllIlllIl(jsonObject.get("srcalpha").getAsString());
            if (n4 != 1) {
                bl = false;
            }
            bl2 = true;
        }
        if (class_0463.lllIIIllIIIIlllIlIIllIIll(jsonObject, "dstalpha")) {
            n5 = class_1599.lllIlIIlIIIlIlIIIllIlllIl(jsonObject.get("dstalpha").getAsString());
            if (n5 != 0) {
                bl = false;
            }
            bl2 = true;
        }
        return bl ? new class_1599() : (bl2 ? new class_1599(n2, n3, n4, n5, n) : new class_1599(n2, n3, n));
    }

    private static int lllIIIllIIIIlllIlIIllIIll(String string) {
        String string2 = string.trim().toLowerCase();
        return string2.equals("add") ? 32774 : (string2.equals("subtract") ? 32778 : (string2.equals("reversesubtract") ? 32779 : (string2.equals("reverse_subtract") ? 32779 : (string2.equals("min") ? 32775 : (string2.equals("max") ? 32776 : 32774)))));
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(String string) {
        String string2 = string.trim().toLowerCase();
        string2 = string2.replaceAll("_", "");
        string2 = string2.replaceAll("one", "1");
        string2 = string2.replaceAll("zero", "0");
        return (string2 = string2.replaceAll("minus", "-")).equals("0") ? 0 : (string2.equals("1") ? 1 : (string2.equals("srccolor") ? 768 : (string2.equals("1-srccolor") ? 769 : (string2.equals("dstcolor") ? 774 : (string2.equals("1-dstcolor") ? 775 : (string2.equals("srcalpha") ? 770 : (string2.equals("1-srcalpha") ? 771 : (string2.equals("dstalpha") ? 772 : (string2.equals("1-dstalpha") ? 773 : -1)))))))));
    }
}

