package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.awt.Color;

class class_1026 {
    private String IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll;
    private Color IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1515 IllIIlllllllIIlIIlIIIIlIl;
    private class_1515 IIIllIllIIlIlIlIlIllllIIl;
    private class_1515 IllIIIllIIIIlIlIlIllIIlll;
    private class_1515 lIIIIlIlIIlllllIIllIIlIII;
    private class_1515 llIIlllIllIllllIIIlIIIIII;
    private class_1515 llIIllIllIlIIlIIllIllllll;
    private boolean lllIIlIIIllllllIIIIlIlIlI;
    private boolean IlIlllIIIIIIlIIllIIllIlll;
    private int IlIlIIlIlIllIIlIlIIllIIIl;
    private int lllllIlllIIllIlIIlIIIllII;
    class_1974 lllIIIllIIIIlllIlIIllIIll;
    class_1974 lllIlIIlIIIlIlIIIllIlllIl;
    class_1974 IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ class_1130 lIlllIlllIIIIlIIlllIllIII;

    class_1026(class_1130 class_11302, String string, String string2, int n, double d, double d2, double d3, double d4, boolean bl, boolean bl2) {
        this.lIlllIlllIIIIlIIlllIllIII = class_11302;
        this.IlIIIIIllllllIIlllIllllll = string;
        this.lIllllIIlIIIlIllllllIIIll = string2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = new Color(n, true);
        this.lllIIlIIIllllllIIIIlIlIlI = bl;
        this.IlIlllIIIIIIlIIllIIllIlll = bl2;
        this.IllIIIllIIIIlIlIlIllIIlll = this.IllIIlllllllIIlIIlIIIIlIl = new class_1515(d, d2);
        this.lIIIIlIlIIlllllIIllIIlIII = this.IIIllIllIIlIlIlIlIllllIIl = new class_1515(d3, d4);
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIIIllIIIIlllIlIIllIIll = new class_1974(this.IIIllIIlIIIIIIlIlIIllIIlI(), 0.0, this.IllIIlllllllIIlIIlIIIIlIl(), this.IlIIIIIllllllIIlllIllllll(), 255.0, this.lIllllIIlIIIlIllllllIIIll());
        class_1389 class_13892 = class_1130.lllIIIllIIIIlllIlIIllIIll((class_1130)this.lIlllIlllIIIIlIIlllIllIII).lIIIIlIlIIlllllIIllIIlIII;
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13892.IlIIlllllIIlIlIlllllIllll, class_13892.IllIIIIllIIllIllIlllIlIIl)) {
            this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(2.0, 0.0, 2.0);
            this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(1.0, 0.0, 1.0);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(1.0, 0.0, 1.0);
            this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII += 1.0;
        this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll += 1.0;
    }

    boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIlIIIllllllIIIIlIlIlI && this.lllllIlllIIllIlIIlIIIllII != 0 && this.IlIlIIlIlIllIIlIlIIllIIIl < this.lllllIlllIIllIlIIlIIIllII;
    }

    boolean lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        return !this.IlIlllIIIIIIlIIllIIllIlll || !this.lIllllIIlIIIlIllllllIIIll.equals(class_1130.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII).getNetworkManager().IIIllIllIIlIlIlIlIllllIIl()) || d + 1.0 > this.IIIllIIlIIIIIIlIlIIllIIlI() && d < this.IlIIIIIllllllIIlllIllllll() && d2 + 1.0 > this.IllIIlllllllIIlIIlIIIIlIl() && d2 < this.lIllllIIlIIIlIllllllIIIll();
    }

    boolean lllIlIIlIIIlIlIIIllIlllIl(double d, double d2) {
        class_0864 class_08642 = new class_0864(d, 1.0, d2);
        return this.IlIlllIIIIIIlIIllIIllIlll && this.lIllllIIlIIIlIllllllIIIll.equals(LunarClient.getInstance().getNetworkManager().IIIllIllIIlIlIlIlIllllIIl()) && this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_08642) && !this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_08642);
    }

    void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            double d = this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll - this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll;
            double d2 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll - this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll;
            double d3 = this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl - this.llIIlllIllIllllIIIlIIIIII.lllIlIIlIIIlIlIIIllIlllIl;
            double d4 = this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl - this.llIIllIllIlIIlIIllIllllll.lllIlIIlIIIlIlIIIllIlllIl;
            double d5 = (float)this.IlIlIIlIlIllIIlIlIIllIIIl / (float)this.lllllIlllIIllIlIIlIIIllII;
            double d6 = this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll - d * d5;
            double d7 = this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll - d2 * d5;
            double d8 = this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl - d3 * d5;
            double d9 = this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl - d4 * d5;
            this.IllIIIllIIIIlIlIlIllIIlll = new class_1515(d6, d8);
            this.lIIIIlIlIIlllllIIllIIlIII = new class_1515(d7, d9);
            ++this.IlIlIIlIlIllIIlIlIIllIIIl;
        } else if (this.IIIllIllIIlIlIlIlIllllIIl != this.lIIIIlIlIIlllllIIllIIlIII || this.IllIIlllllllIIlIIlIIIIlIl != this.IllIIIllIIIIlIlIlIllIIlll) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IllIIIllIIIIlIlIlIllIIlll;
            this.IIIllIllIIlIlIlIlIllllIIl = this.lIIIIlIlIIlllllIIllIIlIII;
            this.lIIIIlIlIIlllllIIllIIlIII = this.llIIllIllIlIIlIIllIllllll;
            this.IllIIIllIIIIlIlIlIllIIlll = this.llIIlllIllIllllIIIlIIIIII;
            this.lllllIlllIIllIlIIlIIIllII = 0;
            this.IlIlIIlIlIllIIlIlIIllIIIl = 0;
        }
    }

    boolean lIlllIlllIIIIlIIlllIllIII() {
        return LunarClient.getInstance().getNetworkManager().IIIllIllIIlIlIlIlIllllIIl().equals(this.lIllllIIlIIIlIllllllIIIll);
    }

    double IlIIIIIllllllIIlllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll;
    }

    double lIllllIIlIIIlIllllllIIIll() {
        return this.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl;
    }

    double IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll;
    }

    double IllIIlllllllIIlIIlIIIIlIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll.lllIlIIlIIIlIlIIIllIlllIl;
    }

    double IlIllllllIIlIIllllIIlIIIl(double d, double d2) {
        double d3 = d2 - this.IllIIlllllllIIlIIlIIIIlIl();
        double d4 = this.lIllllIIlIIIlIllllllIIIll() - d2;
        double d5 = d - this.IIIllIIlIIIIIIlIlIIllIIlI();
        double d6 = this.IlIIIIIllllllIIlllIllllll() - d;
        double d7 = Math.min(d5, d6);
        d7 = Math.min(d7, d3);
        return Math.min(d7, d4);
    }

    double lIlllIlllIIIIlIIlllIllIII(double d, double d2) {
        double d3 = d2 - this.IllIIlllllllIIlIIlIIIIlIl();
        double d4 = this.lIllllIIlIIIlIllllllIIIll() - d2;
        return Math.min(d3, d4);
    }

    double IlIIIIIllllllIIlllIllllll(double d, double d2) {
        double d3 = d - this.IIIllIIlIIIIIIlIlIIllIIlI();
        double d4 = this.IlIIIIIllllllIIlllIllllll() - d;
        return Math.min(d3, d4);
    }

    public String IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public String IllIIIllIIIIlIlIlIllIIlll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public Color lIIIIlIlIIlllllIIllIIlIII() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public class_1515 llIIlllIllIllllIIIlIIIIII() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public class_1515 llIIllIllIlIIlIIllIllllll() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public class_1515 lllIIlIIIllllllIIIIlIlIlI() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public class_1515 IlIlllIIIIIIlIIllIIllIlll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public class_1515 IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public class_1515 lllllIlllIIllIlIIlIIIllII() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public boolean IlIlIIlllIIlIllIIIlllllIl() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public boolean lIIlIIIIIlIlllIlIIlIlIlll() {
        return this.IlIlllIIIIIIlIIllIIllIlll;
    }

    public int lIlIlIIlIIIIlIIIIIlllIIII() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    public int IlIIIlIIIIllIIIllIIIIIIll() {
        return this.lllllIlllIIllIlIIlIIIllII;
    }

    public class_1974 IIlllIlIlllIllIIIlllIIlIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public class_1974 lIlIllIIlIIlIIlIIlIIlIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_1974 llIIlIllIllllIlIIIIlIIlll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ String lllIIIllIIIIlllIlIIllIIll(class_1026 class_10262) {
        return class_10262.lIllllIIlIIIlIllllllIIIll;
    }

    static /* synthetic */ class_1515 lllIIIllIIIIlllIlIIllIIll(class_1026 class_10262, class_1515 class_15152) {
        class_10262.llIIlllIllIllllIIIlIIIIII = class_15152;
        return class_10262.llIIlllIllIllllIIIlIIIIII;
    }

    static /* synthetic */ class_1515 lllIlIIlIIIlIlIIIllIlllIl(class_1026 class_10262, class_1515 class_15152) {
        class_10262.IllIIIllIIIIlIlIlIllIIlll = class_15152;
        return class_10262.IllIIIllIIIIlIlIlIllIIlll;
    }

    static /* synthetic */ class_1515 IlIllllllIIlIIllllIIlIIIl(class_1026 class_10262, class_1515 class_15152) {
        class_10262.llIIllIllIlIIlIIllIllllll = class_15152;
        return class_10262.llIIllIllIlIIlIIllIllllll;
    }

    static /* synthetic */ class_1515 lIlllIlllIIIIlIIlllIllIII(class_1026 class_10262, class_1515 class_15152) {
        class_10262.lIIIIlIlIIlllllIIllIIlIII = class_15152;
        return class_10262.lIIIIlIlIIlllllIIllIIlIII;
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(class_1026 class_10262, int n) {
        class_10262.IlIlIIlIlIllIIlIlIIllIIIl = n;
        return class_10262.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(class_1026 class_10262, int n) {
        class_10262.lllllIlllIIllIlIIlIIIllII = n;
        return class_10262.lllllIlllIIllIlIIlIIIllII;
    }

    static /* synthetic */ String lllIlIIlIIIlIlIIIllIlllIl(class_1026 class_10262) {
        return class_10262.IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ boolean IlIllllllIIlIIllllIIlIIIl(class_1026 class_10262) {
        return class_10262.lllIIlIIIllllllIIIIlIlIlI;
    }

    static /* synthetic */ Color lIlllIlllIIIIlIIlllIllIII(class_1026 class_10262) {
        return class_10262.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

