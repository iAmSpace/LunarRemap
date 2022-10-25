package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class class_0963
extends class_0469 {
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public byte lIlllIlllIIIIlIIlllIllIII;
    public byte IlIIIIIllllllIIlllIllllll;
    public byte[] lIllllIIlIIIlIllllllIIIll = new byte[16384];
    public List IIIllIIlIIIIIIlIlIIllIIlI = new ArrayList();
    private Map IIIllIllIIlIlIlIlIllllIIl = new HashMap();
    public Map IllIIlllllllIIlIIlIIIIlIl = new LinkedHashMap();

    public class_0963(String string) {
        super(string);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIlllIlllIIIIlIIlllIllIII("dimension");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("xCenter");
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("zCenter");
        this.IlIIIIIllllllIIlllIllllll = class_07752.lIlllIlllIIIIlIIlllIllIII("scale");
        if (this.IlIIIIIllllllIIlllIllllll < 0) {
            this.IlIIIIIllllllIIlllIllllll = 0;
        }
        if (this.IlIIIIIllllllIIlllIllllll > 4) {
            this.IlIIIIIllllllIIlllIllllll = (byte)4;
        }
        int n = class_07752.IlIIIIIllllllIIlllIllllll("width");
        int n2 = class_07752.IlIIIIIllllllIIlllIllllll("height");
        if (n == 128 && n2 == 128) {
            this.lIllllIIlIIIlIllllllIIIll = class_07752.lIIIIlIlIIlllllIIllIIlIII("colors");
        } else {
            byte[] arrby = class_07752.lIIIIlIlIIlllllIIllIIlIII("colors");
            this.lIllllIIlIIIlIllllllIIIll = new byte[16384];
            int n3 = (128 - n) / 2;
            int n4 = (128 - n2) / 2;
            for (int i = 0; i < n2; ++i) {
                int n5 = i + n4;
                if (n5 < 0 && n5 >= 128) continue;
                for (int j = 0; j < n; ++j) {
                    int n6 = j + n3;
                    if (n6 < 0 && n6 >= 128) continue;
                    this.lIllllIIlIIIlIllllllIIIll[n6 + n5 * 128] = arrby[j + i * n];
                }
            }
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("dimension", this.lIlllIlllIIIIlIIlllIllIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("xCenter", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("zCenter", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("scale", this.IlIIIIIllllllIIlllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("width", (short)128);
        class_07752.lllIIIllIIIIlllIlIIllIIll("height", (short)128);
        class_07752.lllIIIllIIIIlllIlIIllIIll("colors", this.lIllllIIlIIIlIllllllIIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, ItemStack class_08972) {
        if (!this.IIIllIllIIlIlIlIlIllllIIl.containsKey(class_08142)) {
            class_1886 class_18862 = new class_1886(this, class_08142);
            this.IIIllIllIIlIlIlIlIllllIIl.put(class_08142, class_18862);
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(class_18862);
        }
        if (!class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl(class_08972)) {
            this.IllIIlllllllIIlIIlIIIIlIl.remove(class_08142.llllIIIIlIIIlIIIIIIlIllll());
        }
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++i) {
            class_1886 class_18863 = (class_1886)this.IIIllIIlIIIIIIlIlIIllIIlI.get(i);
            if (!class_18863.lllIIIllIIIIlllIlIIllIIll.IllllIIIIlIIlIIIIlllIIIIl && (class_18863.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl(class_08972) || class_08972.IlIIlllllIIlIlIlllllIllll())) {
                if (class_08972.IlIIlllllIIlIlIlllllIllll() || class_18863.lllIIIllIIIIlllIlIIllIIll.lIIllllllllIlIllllllllIlI != this.lIlllIlllIIIIlIIlllIllIII) continue;
                this.lllIIIllIIIIlllIlIIllIIll(0, class_18863.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, class_18863.lllIIIllIIIIlllIlIIllIIll.llllIIIIlIIIlIIIIIIlIllll(), class_18863.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll, class_18863.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl, class_18863.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll);
                continue;
            }
            this.IIIllIllIIlIlIlIlIllllIIl.remove(class_18863.lllIIIllIIIIlllIlIIllIIll);
            this.IIIllIIlIIIIIIlIlIIllIIlI.remove(class_18863);
        }
        if (class_08972.IlIIlllllIIlIlIlllllIllll()) {
            this.lllIIIllIIIIlllIlIIllIIll(1, class_08142.lIlIllIIlIIlIIlIIlIIlIIll, "frame-" + class_08972.llIIlIlIlllIIllIlIlllIllI().llllllIlIllllIlIlIlIIIIlI(), class_08972.llIIlIlIlllIIllIlIlllIllI().lllIlIIlIIIlIlIIIllIlllIl, class_08972.llIIlIlIlllIIllIlIlllIllI().lIlllIlllIIIIlIIlllIllIII, class_08972.llIIlIlIlllIIllIlIlllIllI().lllIIIllIIIIlllIlIIllIIll * 90);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, class_1334 class_13342, String string, double d, double d2, double d3) {
        byte by;
        int n2 = 1 << this.IlIIIIIllllllIIlllIllllll;
        float f = (float)(d - (double)this.lllIlIIlIIIlIlIIIllIlllIl) / (float)n2;
        float f2 = (float)(d2 - (double)this.IlIllllllIIlIIllllIIlIIIl) / (float)n2;
        byte by2 = (byte)((double)(f * 2.0f) + 0.5);
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.5);
        int n3 = 63;
        if (f >= (float)(-n3) && f2 >= (float)(-n3) && f <= (float)n3 && f2 <= (float)n3) {
            by = (byte)((d3 += d3 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.lIlllIlllIIIIlIIlllIllIII < 0) {
                int n4 = (int)(class_13342.lIlllIlllIlIIIIlllIlIlIIl().IIIllIIlIIIIIIlIlIIllIIlI() / 10L);
                by = (byte)(n4 * n4 * 34187121 + n4 * 121 >> 15 & 0xF);
            }
        } else {
            if (Math.abs(f) >= 320.0f || Math.abs(f2) >= 320.0f) {
                this.IllIIlllllllIIlIIlIIIIlIl.remove(string);
                return;
            }
            n = 6;
            by = 0;
            if (f <= (float)(-n3)) {
                by2 = (byte)((double)(n3 * 2) + 2.5);
            }
            if (f2 <= (float)(-n3)) {
                by3 = (byte)((double)(n3 * 2) + 2.5);
            }
            if (f >= (float)n3) {
                by2 = (byte)(n3 * 2 + 1);
            }
            if (f2 >= (float)n3) {
                by3 = (byte)(n3 * 2 + 1);
            }
        }
        this.IllIIlllllllIIlIIlIIIIlIl.put(string, new class_1739(this, (byte)n, by2, by3, by));
    }

    public byte[] lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_1886 class_18862 = (class_1886)this.IIIllIllIIlIlIlIlIllllIIl.get(class_08142);
        return class_18862 == null ? null : class_18862.lllIIIllIIIIlllIlIIllIIll(class_08972);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII();
        for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.size(); ++i) {
            class_1886 class_18862 = (class_1886)this.IIIllIIlIIIIIIlIlIIllIIlI.get(i);
            if (class_18862.lllIlIIlIIIlIlIIIllIlllIl[n] < 0 || class_18862.lllIlIIlIIIlIlIIIllIlllIl[n] > n2) {
                class_18862.lllIlIIlIIIlIlIIIllIlllIl[n] = n2;
            }
            if (class_18862.IlIllllllIIlIIllllIIlIIIl[n] >= 0 && class_18862.IlIllllllIIlIIllllIIlIIIl[n] >= n3) continue;
            class_18862.IlIllllllIIlIIllllIIlIIIl[n] = n3;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(byte[] arrby) {
        if (arrby[0] == 0) {
            int n = arrby[1] & 0xFF;
            int n2 = arrby[2] & 0xFF;
            for (int i = 0; i < arrby.length - 3; ++i) {
                this.lIllllIIlIIIlIllllllIIIll[(i + n2) * 128 + n] = arrby[i + 3];
            }
            this.lIlllIlllIIIIlIIlllIllIII();
        } else if (arrby[0] == 1) {
            this.IllIIlllllllIIlIIlIIIIlIl.clear();
            for (int i = 0; i < (arrby.length - 1) / 3; ++i) {
                byte by = (byte)(arrby[i * 3 + 1] >> 4);
                byte by2 = arrby[i * 3 + 2];
                byte by3 = arrby[i * 3 + 3];
                byte by4 = (byte)(arrby[i * 3 + 1] & 0xF);
                this.IllIIlllllllIIlIIlIIIIlIl.put("icon-" + i, new class_1739(this, by, by2, by3, by4));
            }
        } else if (arrby[0] == 2) {
            this.IlIIIIIllllllIIlllIllllll = arrby[1];
        }
    }

    public class_1886 lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        class_1886 class_18862 = (class_1886)this.IIIllIllIIlIlIlIlIllllIIl.get(class_08142);
        if (class_18862 == null) {
            class_18862 = new class_1886(this, class_08142);
            this.IIIllIllIIlIlIlIlIllllIIl.put(class_08142, class_18862);
            this.IIIllIIlIIIIIIlIlIIllIIlI.add(class_18862);
        }
        return class_18862;
    }
}

