package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1886 {
    public final class_0814 lllIIIllIIIIlllIlIIllIIll;
    public int[] lllIlIIlIIIlIlIIIllIlllIl = new int[128];
    public int[] IlIllllllIIlIIllllIIlIIIl = new int[128];
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private byte[] IllIIlllllllIIlIIlIIIIlIl;
    public int lIlllIlllIIIIlIIlllIllIII;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    final /* synthetic */ class_0963 IlIIIIIllllllIIlllIllllll;

    public class_1886(class_0963 class_09632, class_0814 class_08142) {
        this.IlIIIIIllllllIIlllIllllll = class_09632;
        this.lllIIIllIIIIlllIlIIllIIll = class_08142;
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++i) {
            this.lllIlIIlIIIlIlIIIllIlllIl[i] = 0;
            this.IlIllllllIIlIIllllIIlIIIl[i] = 127;
        }
    }

    public byte[] lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        int n;
        int n2;
        int n3;
        if (!this.IIIllIllIIlIlIlIlIllllIIl) {
            byte[] arrby = new byte[]{2, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll};
            this.IIIllIllIIlIlIlIlIllllIIl = true;
            return arrby;
        }
        if (--this.IIIllIIlIIIIIIlIlIIllIIlI < 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = 4;
            byte[] arrby = new byte[this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.size() * 3 + 1];
            arrby[0] = 1;
            n3 = 0;
            for (class_1739 class_17392 : this.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.values()) {
                arrby[n3 * 3 + 1] = (byte)(class_17392.lllIIIllIIIIlllIlIIllIIll << 4 | class_17392.lIlllIlllIIIIlIIlllIllIII & 0xF);
                arrby[n3 * 3 + 2] = class_17392.lllIlIIlIIIlIlIIIllIlllIl;
                arrby[n3 * 3 + 3] = class_17392.IlIllllllIIlIIllllIIlIIIl;
                ++n3;
            }
            int n4 = n2 = !class_08972.IlIIlllllIIlIlIlllllIllll() ? 1 : 0;
            if (this.IllIIlllllllIIlIIlIIIIlIl != null && this.IllIIlllllllIIlIIlIIIIlIl.length == arrby.length) {
                for (n = 0; n < arrby.length; ++n) {
                    if (arrby[n] == this.IllIIlllllllIIlIIlIIIIlIl[n]) continue;
                    n2 = 0;
                    break;
                }
            } else {
                n2 = 0;
            }
            if (n2 == 0) {
                this.IllIIlllllllIIlIIlIIIIlIl = arrby;
                return arrby;
            }
        }
        for (n2 = 0; n2 < 1; ++n2) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl[n3 = this.lIllllIIlIIIlIllllllIIIll++ * 11 % 128] < 0) continue;
            int n5 = this.IlIllllllIIlIIllllIIlIIIl[n3] - this.lllIlIIlIIIlIlIIIllIlllIl[n3] + 1;
            n = this.lllIlIIlIIIlIlIIIllIlllIl[n3];
            byte[] arrby = new byte[n5 + 3];
            arrby[0] = 0;
            arrby[1] = (byte)n3;
            arrby[2] = (byte)n;
            for (int i = 0; i < arrby.length - 3; ++i) {
                arrby[i + 3] = this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll[(i + n) * 128 + n3];
            }
            this.IlIllllllIIlIIllllIIlIIIl[n3] = -1;
            this.lllIlIIlIIIlIlIIIllIlllIl[n3] = -1;
            return arrby;
        }
        return null;
    }
}

