package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class class_0598
extends class_0210 {
    private final class_1854 lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;
    private final int IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll = "";
    private int IIIllIIlIIIIIIlIlIIllIIlI = 32;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl = true;
    private boolean IllIIIllIIIIlIlIlIllIIlll = true;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    private boolean IlIlIIlIlIllIIlIlIIllIIIl = true;
    private int lllllIlllIIllIlIIlIIIllII;
    private int IlIlIIlllIIlIllIIIlllllIl;
    private int lIIlIIIIIlIlllIlIIlIlIlll;
    private int lIlIlIIlIIIIlIIIIIlllIIII = 0xE0E0E0;
    private int IlIIIlIIIIllIIIllIIIIIIll = 0x707070;
    private boolean IIlllIlIlllIllIIIlllIIlIl = true;

    public class_0598(class_1854 class_18542, int n, int n2, int n3, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18542;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.IlIIIIIllllllIIlllIllllll = n4;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ++this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lIllllIIlIIIlIllllllIIIll = string.length() > this.IIIllIIlIIIIIIlIlIIllIIlI ? string.substring(0, this.IIIllIIlIIIIIIlIlIIllIIlI) : string;
        this.IlIIIIIllllllIIlllIllllll();
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        int n = this.IlIlIIlllIIlIllIIIlllllIl < this.lIIlIIIIIlIlllIlIIlIlIlll ? this.IlIlIIlllIIlIllIIIlllllIl : this.lIIlIIIIIlIlllIlIIlIlIlll;
        int n2 = this.IlIlIIlllIIlIllIIIlllllIl < this.lIIlIIIIIlIlllIlIIlIlIlll ? this.lIIlIIIIIlIlllIlIIlIlIlll : this.IlIlIIlllIIlIllIIIlllllIl;
        return this.lIllllIIlIIIlIllllllIIIll.substring(n, n2);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n;
        String string2 = "";
        String string3 = class_1395.lllIIIllIIIIlllIlIIllIIll(string);
        int n2 = this.IlIlIIlllIIlIllIIIlllllIl < this.lIIlIIIIIlIlllIlIIlIlIlll ? this.IlIlIIlllIIlIllIIIlllllIl : this.lIIlIIIIIlIlllIlIIlIlIlll;
        int n3 = this.IlIlIIlllIIlIllIIIlllllIl < this.lIIlIIIIIlIlllIlIIlIlIlll ? this.lIIlIIIIIlIlllIlIIlIlIlll : this.IlIlIIlllIIlIllIIIlllllIl;
        int n4 = this.IIIllIIlIIIIIIlIlIIllIIlI - this.lIllllIIlIIIlIllllllIIIll.length() - (n2 - this.lIIlIIIIIlIlllIlIIlIlIlll);
        boolean bl = false;
        if (this.lIllllIIlIIIlIllllllIIIll.length() > 0) {
            string2 = string2 + this.lIllllIIlIIIlIllllllIIIll.substring(0, n2);
        }
        if (n4 < string3.length()) {
            string2 = string2 + string3.substring(0, n4);
            n = n4;
        } else {
            string2 = string2 + string3;
            n = string3.length();
        }
        if (this.lIllllIIlIIIlIllllllIIIll.length() > 0 && n3 < this.lIllllIIlIIIlIllllllIIIll.length()) {
            string2 = string2 + this.lIllllIIlIIIlIllllllIIIll.substring(n3);
        }
        this.lIllllIIlIIIlIllllllIIIll = string2;
        this.lIlllIlllIIIIlIIlllIllIII(n2 - this.lIIlIIIIIlIlllIlIIlIlIlll + n);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lIllllIIlIIIlIllllllIIIll.length() != 0) {
            if (this.lIIlIIIIIlIlllIlIIlIlIlll != this.IlIlIIlllIIlIllIIIlllllIl) {
                this.lllIlIIlIIIlIlIIIllIlllIl("");
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl(n) - this.IlIlIIlllIIlIllIIIlllllIl);
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (this.lIllllIIlIIIlIllllllIIIll.length() != 0) {
            if (this.lIIlIIIIIlIlllIlIIlIlIlll != this.IlIlIIlllIIlIllIIIlllllIl) {
                this.lllIlIIlIIIlIlIIIllIlllIl("");
            } else {
                boolean bl = n < 0;
                int n2 = bl ? this.IlIlIIlllIIlIllIIIlllllIl + n : this.IlIlIIlllIIlIllIIIlllllIl;
                int n3 = bl ? this.IlIlIIlllIIlIllIIIlllllIl : this.IlIlIIlllIIlIllIIIlllllIl + n;
                String string = "";
                if (n2 >= 0) {
                    string = this.lIllllIIlIIIlIllllllIIIll.substring(0, n2);
                }
                if (n3 < this.lIllllIIlIIIlIllllllIIIll.length()) {
                    string = string + this.lIllllIIlIIIlIllllllIIIll.substring(n3);
                }
                this.lIllllIIlIIIlIllllllIIIll = string;
                if (bl) {
                    this.lIlllIlllIIIIlIIlllIllIII(n);
                }
            }
        }
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, this.IllIIlllllllIIlIIlIIIIlIl());
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, this.IllIIlllllllIIlIIlIIIIlIl(), true);
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl) {
        int n3 = n2;
        boolean bl2 = n < 0;
        int n4 = Math.abs(n);
        for (int i = 0; i < n4; ++i) {
            if (bl2) {
                while (bl && n3 > 0 && this.lIllllIIlIIIlIllllllIIIll.charAt(n3 - 1) == ' ') {
                    --n3;
                }
                while (n3 > 0 && this.lIllllIIlIIIlIllllllIIIll.charAt(n3 - 1) != ' ') {
                    --n3;
                }
                continue;
            }
            int n5 = this.lIllllIIlIIIlIllllllIIIll.length();
            if ((n3 = this.lIllllIIlIIIlIllllllIIIll.indexOf(32, n3)) == -1) {
                n3 = n5;
                continue;
            }
            while (bl && n3 < n5 && this.lIllllIIlIIIlIllllllIIIll.charAt(n3) == ' ') {
                ++n3;
            }
        }
        return n3;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n) {
        this.IlIIIIIllllllIIlllIllllll(this.lIIlIIIIIlIlllIlIIlIlIlll + n);
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.IlIlIIlllIIlIllIIIlllllIl = n;
        int n2 = this.lIllllIIlIIIlIllllllIIIll.length();
        if (this.IlIlIIlllIIlIllIIIlllllIl < 0) {
            this.IlIlIIlllIIlIllIIIlllllIl = 0;
        }
        if (this.IlIlIIlllIIlIllIIIlllllIl > n2) {
            this.IlIlIIlllIIlIllIIIlllllIl = n2;
        }
        this.IIIllIllIIlIlIlIlIllllIIl(this.IlIlIIlllIIlIllIIIlllllIl);
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        this.IlIIIIIllllllIIlllIllllll(0);
    }

    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIIIIIllllllIIlllIllllll(this.lIllllIIlIIIlIllllllIIIll.length());
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (!this.lIIIIlIlIIlllllIIllIIlIII) {
            return false;
        }
        switch (c) {
            case '\u0001': {
                this.IlIIIIIllllllIIlllIllllll();
                this.IIIllIllIIlIlIlIlIllllIIl(0);
                return true;
            }
            case '\u0003': {
                class_0229.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl());
                return true;
            }
            case '\u0016': {
                if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_0229.lIIlIIIIIlIlllIlIIlIlIlll());
                }
                return true;
            }
            case '\u0018': {
                class_0229.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl());
                if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                    this.lllIlIIlIIIlIlIIIllIlllIl("");
                }
                return true;
            }
        }
        switch (n) {
            case 14: {
                if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                    if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                        this.lllIIIllIIIIlllIlIIllIIll(-1);
                    }
                } else if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(-1);
                }
                return true;
            }
            case 199: {
                if (class_0229.lIlllIlllIlIIIIlllIlIlIIl()) {
                    this.IIIllIllIIlIlIlIlIllllIIl(0);
                } else {
                    this.lIlllIlllIIIIlIIlllIllIII();
                }
                return true;
            }
            case 203: {
                if (class_0229.lIlllIlllIlIIIIlllIlIlIIl()) {
                    if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                        this.IIIllIllIIlIlIlIlIllllIIl(this.lllIIIllIIIIlllIlIIllIIll(-1, this.lIIIIlIlIIlllllIIllIIlIII()));
                    } else {
                        this.IIIllIllIIlIlIlIlIllllIIl(this.lIIIIlIlIIlllllIIllIIlIII() - 1);
                    }
                } else if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                    this.IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl(-1));
                } else {
                    this.lIlllIlllIIIIlIIlllIllIII(-1);
                }
                return true;
            }
            case 205: {
                if (class_0229.lIlllIlllIlIIIIlllIlIlIIl()) {
                    if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                        this.IIIllIllIIlIlIlIlIllllIIl(this.lllIIIllIIIIlllIlIIllIIll(1, this.lIIIIlIlIIlllllIIllIIlIII()));
                    } else {
                        this.IIIllIllIIlIlIlIlIllllIIl(this.lIIIIlIlIIlllllIIllIIlIII() + 1);
                    }
                } else if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                    this.IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl(1));
                } else {
                    this.lIlllIlllIIIIlIIlllIllIII(1);
                }
                return true;
            }
            case 207: {
                if (class_0229.lIlllIlllIlIIIIlllIlIlIIl()) {
                    this.IIIllIllIIlIlIlIlIllllIIl(this.lIllllIIlIIIlIllllllIIIll.length());
                } else {
                    this.IlIIIIIllllllIIlllIllllll();
                }
                return true;
            }
            case 211: {
                if (class_0229.llIllllIlIllIIIlIllIIlIlI()) {
                    if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                        this.lllIIIllIIIIlllIlIIllIIll(1);
                    }
                } else if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(1);
                }
                return true;
            }
        }
        if (class_1395.lllIIIllIIIIlllIlIIllIIll(c)) {
            if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                this.lllIlIIlIIIlIlIIIllIlllIl(Character.toString(c));
            }
            return true;
        }
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = bl = n >= this.lllIlIIlIIIlIlIIIllIlllIl && n < this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII && n2 >= this.IlIllllllIIlIIllllIIlIIIl && n2 < this.IlIllllllIIlIIllllIIlIIIl + this.IlIIIIIllllllIIlllIllllll;
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.lllIlIIlIIIlIlIIIllIlllIl(bl);
        }
        if (this.lIIIIlIlIIlllllIIllIIlIII && n3 == 0) {
            int n4 = n - this.lllIlIIlIIIlIlIIIllIlllIl;
            if (this.IIIllIllIIlIlIlIlIllllIIl) {
                n4 -= 4;
            }
            String string = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll.substring(this.lllllIlllIIllIlIIlIIIllII), this.llIIlllIllIllllIIIlIIIIII());
            this.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string, n4).length() + this.lllllIlllIIllIlIIlIIIllII);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        if (this.llIIllIllIlIIlIIllIllllll()) {
            if (this.IIIllIllIIlIlIlIlIllllIIl()) {
                class_0598.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl - 1, this.IlIllllllIIlIIllllIIlIIIl - 1, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIllllllIIlIIllllIIlIIIl + this.IlIIIIIllllllIIlllIllllll + 1, -6250336);
                class_0598.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII, this.IlIllllllIIlIIllllIIlIIIl + this.IlIIIIIllllllIIlllIllllll, -16777216);
            }
            int n = this.IlIlIIlIlIllIIlIlIIllIIIl ? this.lIlIlIIlIIIIlIIIIIlllIIII : this.IlIIIlIIIIllIIIllIIIIIIll;
            int n2 = this.IlIlIIlllIIlIllIIIlllllIl - this.lllllIlllIIllIlIIlIIIllII;
            int n3 = this.lIIlIIIIIlIlllIlIIlIlIlll - this.lllllIlllIIllIlIIlIIIllII;
            String string = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll.substring(this.lllllIlllIIllIlIIlIIIllII), this.llIIlllIllIllllIIIlIIIIII());
            boolean bl = n2 >= 0 && n2 <= string.length();
            boolean bl2 = this.lIIIIlIlIIlllllIIllIIlIII && this.IllIIlllllllIIlIIlIIIIlIl / 6 % 2 == 0 && bl;
            int n4 = this.IIIllIllIIlIlIlIlIllllIIl ? this.lllIlIIlIIIlIlIIIllIlllIl + 4 : this.lllIlIIlIIIlIlIIIllIlllIl;
            int n5 = this.IIIllIllIIlIlIlIlIllllIIl ? this.IlIllllllIIlIIllllIIlIIIl + (this.IlIIIIIllllllIIlllIllllll - 8) / 2 : this.IlIllllllIIlIIllllIIlIIIl;
            int n6 = n4;
            if (n3 > string.length()) {
                n3 = string.length();
            }
            if (string.length() > 0) {
                String string2 = bl ? string.substring(0, n2) : string;
                n6 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string2, (float)n4, (float)n5, n);
            }
            boolean bl3 = this.IlIlIIlllIIlIllIIIlllllIl < this.lIllllIIlIIIlIllllllIIIll.length() || this.lIllllIIlIIIlIllllllIIIll.length() >= this.IIIllIIlIIIIIIlIlIIllIIlI();
            int n7 = n6;
            if (!bl) {
                n7 = n2 > 0 ? n4 + this.lIlllIlllIIIIlIIlllIllIII : n4;
            } else if (bl3) {
                n7 = n6 - 1;
                --n6;
            }
            if (string.length() > 0 && bl && n2 < string.length()) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string.substring(n2), (float)n6, (float)n5, n);
            }
            if (bl2) {
                if (bl3) {
                    class_0210.lllIIIllIIIIlllIlIIllIIll(n7, n5 - 1, n7 + 1, n5 + 1 + this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll, -3092272);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll("_", (float)n7, (float)n5, n);
                }
            }
            if (n3 != n2) {
                int n8 = n4 + this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string.substring(0, n3));
                this.IlIllllllIIlIIllllIIlIIIl(n7, n5 - 1, n8 - 1, n5 + 1 + this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll);
            }
        }
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        int n5;
        if (n < n3) {
            n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            n5 = n2;
            n2 = n4;
            n4 = n5;
        }
        if (n3 > this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII) {
            n3 = this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII;
        }
        if (n > this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII) {
            n = this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII;
        }
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)255.0f, (float)255.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3058);
        GL11.glLogicOp((int)5387);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)n, (double)n4, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)n3, (double)n4, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)n3, (double)n2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)n, (double)n2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glDisable((int)3058);
        GL11.glEnable((int)3553);
    }

    public void lIllllIIlIIIlIllllllIIIll(int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        if (this.lIllllIIlIIIlIllllllIIIll.length() > n) {
            this.lIllllIIlIIIlIllllllIIIll = this.lIllllIIlIIIlIllllllIIIll.substring(0, n);
        }
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIlIIlllIIlIllIIIlllllIl;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIIllIllIIlIlIlIlIllllIIl = bl;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        this.lIlIlIIlIIIIlIIIIIlllIIII = n;
    }

    public void IllIIlllllllIIlIIlIIIIlIl(int n) {
        this.IlIIIlIIIIllIIIllIIIIIIll = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        if (bl && !this.lIIIIlIlIIlllllIIllIIlIII) {
            this.IllIIlllllllIIlIIlIIIIlIl = 0;
        }
        this.lIIIIlIlIIlllllIIllIIlIII = bl;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = bl;
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.lIIlIIIIIlIlllIlIIlIlIlll;
    }

    public int llIIlllIllIllllIIIlIIIIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl() ? this.lIlllIlllIIIIlIIlllIllIII - 8 : this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(int n) {
        int n2 = this.lIllllIIlIIIlIllllllIIIll.length();
        if (n > n2) {
            n = n2;
        }
        if (n < 0) {
            n = 0;
        }
        this.lIIlIIIIIlIlllIlIIlIlIlll = n;
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            if (this.lllllIlllIIllIlIIlIIIllII > n2) {
                this.lllllIlllIIllIlIIlIIIllII = n2;
            }
            int n3 = this.llIIlllIllIllllIIIlIIIIII();
            String string = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll.substring(this.lllllIlllIIllIlIIlIIIllII), n3);
            int n4 = string.length() + this.lllllIlllIIllIlIIlIIIllII;
            if (n == this.lllllIlllIIllIlIIlIIIllII) {
                this.lllllIlllIIllIlIIlIIIllII -= this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, n3, true).length();
            }
            if (n > n4) {
                this.lllllIlllIIllIlIIlIIIllII += n - n4;
            } else if (n <= this.lllllIlllIIllIlIIlIIIllII) {
                this.lllllIlllIIllIlIIlIIIllII -= this.lllllIlllIIllIlIIlIIIllII - n;
            }
            if (this.lllllIlllIIllIlIIlIIIllII < 0) {
                this.lllllIlllIIllIlIIlIIIllII = 0;
            }
            if (this.lllllIlllIIllIlIIlIIIllII > n2) {
                this.lllllIlllIIllIlIIlIIIllII = n2;
            }
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.IllIIIllIIIIlIlIlIllIIlll = bl;
    }

    public boolean llIIllIllIlIIlIIllIllllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl;
    }

    public void IlIIIIIllllllIIlllIllllll(boolean bl) {
        this.IIlllIlIlllIllIIIlllIIlIl = bl;
    }
}

