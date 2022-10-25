package obf;

import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0285 {
    private ResourceLocation IlIllllllIIlIIllllIIlIIIl = null;
    private int[] lIlllIlllIIIIlIIlllIllIII = null;
    private ResourceLocation[] IlIIIIIllllllIIlllIllllll = null;
    private int[] lIllllIIlIIIlIllllllIIIll = null;
    private class_0672[] IIIllIIlIIIIIIlIlIIllIIlI = null;
    private class_1475 IllIIlllllllIIlIIlIIIIlIl = null;
    public int[] lllIIIllIIIIlllIlIIllIIll = null;
    public int lllIlIIlIIIlIlIIIllIlllIl = 1;

    public class_0285(ResourceLocation class_17732, int[] arrn, int[] arrn2, class_0672[] arrclass_0672, class_1475 class_14752) {
        this.IlIllllllIIlIIllllIIlIIIl = class_17732;
        this.lIlllIlllIIIIlIIlllIllIII = arrn;
        this.lIllllIIlIIIlIllllllIIIll = arrn2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = arrclass_0672;
        this.IllIIlllllllIIlIIlIIIIlIl = class_14752;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        Object object;
        int n;
        int n2;
        this.IlIIIIIllllllIIlllIllllll = new ResourceLocation[this.lIlllIlllIIIIlIIlllIllIII.length];
        ResourceLocation class_17732 = class_1630.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl);
        if (class_17732 == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid path: " + this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
            return false;
        }
        for (n2 = 0; n2 < this.IlIIIIIllllllIIlllIllllll.length; ++n2) {
            n = this.lIlllIlllIIIIlIIlllIllIII[n2];
            if (n <= 1) {
                this.IlIIIIIllllllIIlllIllllll[n2] = this.IlIllllllIIlIIllllIIlIIIl;
                continue;
            }
            object = class_1630.lllIIIllIIIIlllIlIIllIIll(class_17732, n);
            if (object == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid path: " + this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll());
                return false;
            }
            if (!Config.IlIllllllIIlIIllllIIlIIIl((ResourceLocation)object)) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Texture not found: " + ((ResourceLocation)object).lllIIIllIIIIlllIlIIllIIll());
                return false;
            }
            this.IlIIIIIllllllIIlllIllllll[n2] = object;
        }
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            if (this.lIllllIIlIIIlIllllllIIIll.length > this.IlIIIIIllllllIIlllIllllll.length) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("More weights defined than skins, trimming weights: " + string);
                object = new int[this.IlIIIIIllllllIIlllIllllll.length];
                System.arraycopy(this.lIllllIIlIIIlIllllllIIIll, 0, object, 0, ((Object)object).length);
                this.lIllllIIlIIIlIllllllIIIll = (int[])object;
            }
            if (this.lIllllIIlIIIlIllllllIIIll.length < this.IlIIIIIllllllIIlllIllllll.length) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Less weights defined than skins, expanding weights: " + string);
                object = new int[this.IlIIIIIllllllIIlllIllllll.length];
                System.arraycopy(this.lIllllIIlIIIlIllllllIIIll, 0, object, 0, this.lIllllIIlIIIlIllllllIIIll.length);
                n = class_0127.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
                for (int i = this.lIllllIIlIIIlIllllllIIIll.length; i < ((Object)object).length; ++i) {
                    object[i] = n;
                }
                this.lIllllIIlIIIlIllllllIIIll = (int[])object;
            }
            this.lllIIIllIIIIlllIlIIllIIll = new int[this.lIllllIIlIIIlIllllllIIIll.length];
            n2 = 0;
            for (n = 0; n < this.lIllllIIlIIIlIllllllIIIll.length; ++n) {
                if (this.lIllllIIlIIIlIllllllIIIll[n] < 0) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid weight: " + this.lIllllIIlIIIlIllllllIIIll[n]);
                    return false;
                }
                this.lllIIIllIIIIlllIlIIllIIll[n] = n2 += this.lIllllIIlIIIlIllllllIIIll[n];
            }
            this.lllIlIIlIIIlIlIIIllIlllIl = n2;
            if (this.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid sum of all weights: " + n2);
                this.lllIlIIlIIIlIlIIIllIlllIl = 1;
            }
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392) {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI != null) {
            class_0672 class_06722 = class_03392.lllIIlIIIllllllIIIIlIlIlI;
            boolean bl = false;
            for (int i = 0; i < this.IIIllIIlIIIIIIlIlIIllIIlI.length; ++i) {
                class_0672 class_06723 = this.IIIllIIlIIIIIIlIlIIllIIlI[i];
                if (class_06723 != class_06722) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return false;
            }
        }
        return this.IllIIlllllllIIlIIlIIIIlIl != null && class_03392.IlIlllIIIIIIlIIllIIllIlll != null ? this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(class_03392.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl()) : true;
    }

    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, int n) {
        int n2 = 0;
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            n2 = n % this.IlIIIIIllllllIIlllIllllll.length;
        } else {
            int n3 = n % this.lllIlIIlIIIlIlIIIllIlllIl;
            for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
                if (this.lllIIIllIIIIlllIlIIllIIll[i] <= n3) continue;
                n2 = i;
                break;
            }
        }
        return this.IlIIIIIllllllIIlllIllllll[n2];
    }
}

