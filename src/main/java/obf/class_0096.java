package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.util.ArrayList;
import java.util.List;

public class class_0096 {
    private final List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private final class_1108 lIlllIlllIIIIlIIlllIllIII;
    private short[] IlIIIIIllllllIIlllIllllll = new short[64];
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private long IllIIlllllllIIlIIlIIIIlIl;
    public boolean lllIIIllIIIIlllIlIIllIIll = false;
    final /* synthetic */ class_0636 lllIlIIlIIIlIlIIIllIlllIl;

    public class_0096(class_0636 class_06362, int n, int n2) {
        this(class_06362, n, n2, false);
    }

    public class_0096(class_0636 class_06362, int n, int n2, boolean bl) {
        boolean bl2;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_06362;
        this.lIlllIlllIIIIlIIlllIllIII = new class_1108(n, n2);
        boolean bl3 = bl2 = bl && Config.IIIIIlllIIllllIlllIlllIIl();
        if (bl2 && !class_06362.lllIIIllIIIIlllIlIIllIIll().IlIlIIlllIllllllllIIIlIlI.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
            class_06362.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            this.lllIIIllIIIIlllIlIIllIIll = false;
        } else {
            class_06362.lllIIIllIIIIlllIlIIllIIll().IlIlIIlllIllllllllIIIlIlI.IlIllllllIIlIIllllIIlIIIl(n, n2);
            this.lllIIIllIIIIlllIlIIllIIll = true;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222) {
        if (this.IlIllllllIIlIIllllIIlIIIl.contains(class_18222)) {
            class_0636.IlIllllllIIlIIllllIIlIIIl().debug("Failed to add player. {} already is in chunk {}, {}", new Object[]{class_18222, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl});
        } else {
            if (this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) {
                this.IllIIlllllllIIlIIlIIIIlIl = class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIIIlIIIIllIIIllIIIIIIll();
            }
            this.IlIllllllIIlIIllllIIlIIIl.add(class_18222);
            class_18222.lIllllIIlIIIlIllllllIIIll.add(this.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1822 class_18222) {
        this.lllIIIllIIIIlllIlIIllIIll(class_18222, true);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222, boolean bl) {
        if (this.IlIllllllIIlIIllllIIlIIIl.contains(class_18222)) {
            class_0723 class_07232 = class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIIIIIllllllIIlllIllllll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl);
            if (bl && class_07232.IIIllIllIIlIlIlIlIllllIIl()) {
                class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0150(class_07232, true, 0));
            }
            this.IlIllllllIIlIIllllIIlIIIl.remove(class_18222);
            class_18222.lIllllIIlIIIlIllllllIIIll.remove(this.lIlllIlllIIIIlIIlllIllIII);
            if (this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) {
                long l = (long)this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll + Integer.MAX_VALUE | (long)this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl + Integer.MAX_VALUE << 32;
                this.lllIIIllIIIIlllIlIIllIIll(class_07232);
                class_0636.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl).lIlllIlllIIIIlIIlllIllIII(l);
                class_0636.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl).remove(this);
                if (this.lIllllIIlIIIlIllllllIIIll > 0) {
                    class_0636.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl).remove(this);
                }
                if (this.lllIIIllIIIIlllIlIIllIIll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll().IlIlIIlllIllllllllIIIlIlI.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl);
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIIIIIllllllIIlllIllllll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl));
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232) {
        class_07232.lIIlIIIIIlIlllIlIIlIlIlll += class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIIIlIIIIllIIIllIIIIIIll() - this.IllIIlllllllIIlIIlIIIIlIl;
        this.IllIIlllllllIIlIIlIIIIlIl = class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIIIlIIIIllIIIllIIIIIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.lIllllIIlIIIlIllllllIIIll == 0) {
            class_0636.lIlllIlllIIIIlIIlllIllIII(this.lllIlIIlIIIlIlIIIllIlllIl).add(this);
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI |= 1 << (n2 >> 4);
        if (this.lIllllIIlIIIlIllllllIIIll < 64) {
            short s = (short)(n << 12 | n3 << 8 | n2);
            for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll; ++i) {
                if (this.IlIIIIIllllllIIlllIllllll[i] != s) continue;
                return;
            }
            this.IlIIIIIllllllIIlllIllllll[this.lIllllIIlIIIlIllllllIIIll++] = s;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0703 class_07032) {
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            class_1822 class_18222 = (class_1822)this.IlIllllllIIlIIllllIIlIIIl.get(i);
            if (class_18222.lIllllIIlIIIlIllllllIIIll.contains(this.lIlllIlllIIIIlIIlllIllIII)) continue;
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lIllllIIlIIIlIllllllIIIll != 0) {
            if (this.lIllllIIlIIIlIllllllIIIll == 1) {
                int n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll * 16 + (this.IlIIIIIllllllIIlllIllllll[0] >> 12 & 0xF);
                int n2 = this.IlIIIIIllllllIIlllIllllll[0] & 0xFF;
                int n3 = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl * 16 + (this.IlIIIIIllllllIIlllIllllll[0] >> 8 & 0xF);
                this.lllIIIllIIIIlllIlIIllIIll(new class_2088(n, n2, n3, class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl)));
                if (class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).a_(n, n2, n3).lllIIlIIIllllllIIIIlIlIlI()) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3));
                }
            } else if (this.lIllllIIlIIIlIllllllIIIll == 64) {
                int n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll * 16;
                int n4 = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl * 16;
                this.lllIIIllIIIIlllIlIIllIIll(new class_0150(class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIIIIIllllllIIlllIllllll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl), false, this.IIIllIIlIIIIIIlIlIIllIIlI));
                for (int i = 0; i < 16; ++i) {
                    if ((this.IIIllIIlIIIIIIlIlIIllIIlI & 1 << i) == 0) continue;
                    int n5 = i << 4;
                    List list = class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(n, n5, n4, n + 16, n5 + 16, n4 + 16);
                    for (int j = 0; j < list.size(); ++j) {
                        this.lllIIIllIIIIlllIlIIllIIll((class_1774)list.get(j));
                    }
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(new class_1656(this.lIllllIIlIIIlIllllllIIIll, this.IlIIIIIllllllIIlllIllllll, class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).IlIIIIIllllllIIlllIllllll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl)));
                for (int i = 0; i < this.lIllllIIlIIIlIllllllIIIll; ++i) {
                    int n = this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll * 16 + (this.IlIIIIIllllllIIlllIllllll[i] >> 12 & 0xF);
                    int n6 = this.IlIIIIIllllllIIlllIllllll[i] & 0xFF;
                    int n7 = this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl * 16 + (this.IlIIIIIllllllIIlllIllllll[i] >> 8 & 0xF);
                    if (!class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).a_(n, n6, n7).lllIIlIIIllllllIIIIlIlIlI()) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_0636.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl).lllIlIIlIIIlIlIIIllIlllIl(n, n6, n7));
                }
            }
            this.lIllllIIlIIIlIllllllIIIll = 0;
            this.IIIllIIlIIIIIIlIlIIllIIlI = 0;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742) {
        class_0703 class_07032;
        if (class_17742 != null && (class_07032 = class_17742.IllIIlllllllIIlIIlIIIIlIl()) != null) {
            this.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            class_1822 class_18222 = (class_1822)this.IlIllllllIIlIIllllIIlIIIl.get(i);
            class_0723 class_07232 = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll().IlIIIIIllllllIIlllIllllll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl);
            ArrayList<class_0723> arrayList = new ArrayList<class_0723>(1);
            arrayList.add(class_07232);
            class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_2053(arrayList));
        }
    }

    static /* synthetic */ class_1108 lllIIIllIIIIlllIlIIllIIll(class_0096 class_00962) {
        return class_00962.lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ List lllIlIIlIIIlIlIIIllIlllIl(class_0096 class_00962) {
        return class_00962.IlIllllllIIlIIllllIIlIIIl;
    }
}

