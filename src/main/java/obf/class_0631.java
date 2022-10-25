package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Iterator;
import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0631
extends class_1071 {
    private static final Logger lIllllIIlIIIlIllllllIIIll = LogManager.getLogger();
    private class_0850 IIIllIIlIIIIIIlIlIIllIIlI = new class_0971();
    private class_0850 IllIIlllllllIIlIIlIIIIlIl = new class_1192(this, "Repair", true, 2);
    private class_1334 IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlllIllIllllIIIlIIIIII;
    public int lllIIIllIIIIlllIlIIllIIll;
    private int llIIllIllIlIIlIIllIllllll;
    private String lllIIlIIIllllllIIIIlIlIlI;
    private final class_0814 IlIlllIIIIIIlIIllIIllIlll;

    public class_0631(class_0503 class_05032, class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
        int n4;
        this.IIIllIllIIlIlIlIlIllllIIl = class_13342;
        this.IllIIIllIIIIlIlIlIllIIlll = n;
        this.lIIIIlIlIIlllllIIllIIlIII = n2;
        this.llIIlllIllIllllIIIlIIIIII = n3;
        this.IlIlllIIIIIIlIIllIIllIlll = class_08142;
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(this.IllIIlllllllIIlIIlIIIIlIl, 0, 27, 47));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(this.IllIIlllllllIIlIIlIIIIlIl, 1, 76, 47));
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1694(this, this.IIIllIIlIIIIIIlIlIIllIIlI, 2, 134, 47, class_13342, n, n2, n3));
        for (n4 = 0; n4 < 3; ++n4) {
            for (int i = 0; i < 9; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, i + n4 * 9 + 9, 8 + i * 18, 84 + n4 * 18));
            }
        }
        for (n4 = 0; n4 < 9; ++n4) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n4, 8 + n4 * 18, 142));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08502);
        if (class_08502 == this.IllIIlllllllIIlIIlIIIIlIl) {
            this.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl.llIIllIllIlIIlIIllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll = 0;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (class_08972 == null) {
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(0, null);
            this.lllIIIllIIIIlllIlIIllIIll = 0;
        } else {
            int n4;
            class_1469 class_14692;
            Iterator iterator;
            int n5;
            int n6;
            int n7;
            int n8;
            ItemStack class_08973 = class_08972.llIIlllIllIllllIIIlIIIIII();
            ItemStack class_08974 = this.IllIIlllllllIIlIIlIIIIlIl.llIIllIllIlIIlIIllIllllll(1);
            Map map = class_1250.lllIIIllIIIIlllIlIIllIIll(class_08973);
            boolean bl = false;
            int n9 = n2 + class_08972.IllIIIIllIIllIllIlllIlIIl() + (class_08974 == null ? 0 : class_08974.IllIIIIllIIllIllIlllIlIIl());
            this.llIIllIllIlIIlIIllIllllll = 0;
            if (class_08974 != null) {
                boolean bl2 = bl = class_08974.lllIIIllIIIIlllIlIIllIIll() == Items.lIllIlIlIIIIlIlIIlIlIlllI && Items.lIllIlIlIIIIlIlIIlIlIlllI.llIIllIllIlIIlIIllIllllll(class_08974).lIlllIlllIIIIlIIlllIllIII() > 0;
                if (class_08973.lIllllIIlIIIlIllllllIIIll() && class_08973.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972, class_08974)) {
                    n8 = Math.min(class_08973.IIIllIllIIlIlIlIlIllllIIl(), class_08973.lIIIIlIlIIlllllIIllIIlIII() / 4);
                    if (n8 <= 0) {
                        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(0, null);
                        this.lllIIIllIIIIlllIlIIllIIll = 0;
                        return;
                    }
                    for (n7 = 0; n8 > 0 && n7 < class_08974.lllIlIIlIIIlIlIIIllIlllIl; ++n7) {
                        n6 = class_08973.IIIllIllIIlIlIlIlIllllIIl() - n8;
                        class_08973.lllIlIIlIIIlIlIIIllIlllIl(n6);
                        n += Math.max(1, n8 / 100) + map.size();
                        n8 = Math.min(class_08973.IIIllIllIIlIlIlIlIllllIIl(), class_08973.lIIIIlIlIIlllllIIllIIlIII() / 4);
                    }
                    this.llIIllIllIlIIlIIllIllllll = n7;
                } else {
                    if (!(bl || class_08973.lllIIIllIIIIlllIlIIllIIll() == class_08974.lllIIIllIIIIlllIlIIllIIll() && class_08973.lIllllIIlIIIlIllllllIIIll())) {
                        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(0, null);
                        this.lllIIIllIIIIlllIlIIllIIll = 0;
                        return;
                    }
                    if (class_08973.lIllllIIlIIIlIllllllIIIll() && !bl) {
                        n8 = class_08972.lIIIIlIlIIlllllIIllIIlIII() - class_08972.IIIllIllIIlIlIlIlIllllIIl();
                        n7 = class_08974.lIIIIlIlIIlllllIIllIIlIII() - class_08974.IIIllIllIIlIlIlIlIllllIIl();
                        n6 = n7 + class_08973.lIIIIlIlIIlllllIIllIIlIII() * 12 / 100;
                        int n10 = n8 + n6;
                        n5 = class_08973.lIIIIlIlIIlllllIIllIIlIII() - n10;
                        if (n5 < 0) {
                            n5 = 0;
                        }
                        if (n5 < class_08973.IllIIIllIIIIlIlIlIllIIlll()) {
                            class_08973.lllIlIIlIIIlIlIIIllIlllIl(n5);
                            n += Math.max(1, n6 / 100);
                        }
                    }
                    Map map2 = class_1250.lllIIIllIIIIlllIlIIllIIll(class_08974);
                    iterator = map2.keySet().iterator();
                    while (iterator.hasNext()) {
                        int n11;
                        n6 = (Integer)iterator.next();
                        class_14692 = class_1469.lllIIIllIIIIlllIlIIllIIll[n6];
                        n5 = map.containsKey(n6) ? (Integer)map.get(n6) : 0;
                        n4 = (Integer)map2.get(n6);
                        int n12 = n5 == n4 ? ++n4 : Math.max(n4, n5);
                        n4 = n12;
                        int n13 = n4 - n5;
                        boolean bl3 = class_14692.lllIIIllIIIIlllIlIIllIIll(class_08972);
                        if (this.IlIlllIIIIIIlIIllIIllIlll.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIllIlIlIIIIlIlIIlIlIlllI) {
                            bl3 = true;
                        }
                        Iterator iterator2 = map.keySet().iterator();
                        while (iterator2.hasNext()) {
                            n11 = (Integer)iterator2.next();
                            if (n11 == n6 || class_14692.lllIIIllIIIIlllIlIIllIIll(class_1469.lllIIIllIIIIlllIlIIllIIll[n11])) continue;
                            bl3 = false;
                            n += n13;
                        }
                        if (!bl3) continue;
                        if (n4 > class_14692.IlIllllllIIlIIllllIIlIIIl()) {
                            n4 = class_14692.IlIllllllIIlIIllllIIlIIIl();
                        }
                        map.put(n6, n4);
                        n11 = 0;
                        switch (class_14692.lllIIIllIIIIlllIlIIllIIll()) {
                            case 1: {
                                n11 = 8;
                                break;
                            }
                            case 2: {
                                n11 = 4;
                            }
                            default: {
                                break;
                            }
                            case 5: {
                                n11 = 2;
                                break;
                            }
                            case 10: {
                                n11 = 1;
                            }
                        }
                        if (bl) {
                            n11 = Math.max(1, n11 / 2);
                        }
                        n += n11 * n13;
                    }
                }
            }
            if (StringUtils.isBlank((CharSequence)this.lllIIlIIIllllllIIIIlIlIlI)) {
                if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
                    n3 = class_08972.lIllllIIlIIIlIllllllIIIll() ? 7 : class_08972.lllIlIIlIIIlIlIIIllIlllIl * 5;
                    n += n3;
                    class_08973.lIlIlIIlIIIIlIIIIIlllIIII();
                }
            } else if (!this.lllIIlIIIllllllIIIIlIlIlI.equals(class_08972.lIIlIIIIIlIlllIlIIlIlIlll())) {
                n3 = class_08972.lIllllIIlIIIlIllllllIIIll() ? 7 : class_08972.lllIlIIlIIIlIlIIIllIlllIl * 5;
                n += n3;
                if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
                    n9 += n3 / 2;
                }
                class_08973.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI);
            }
            n8 = 0;
            iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                n6 = (Integer)iterator.next();
                class_14692 = class_1469.lllIIIllIIIIlllIlIIllIIll[n6];
                n5 = (Integer)map.get(n6);
                n4 = 0;
                ++n8;
                switch (class_14692.lllIIIllIIIIlllIlIIllIIll()) {
                    case 1: {
                        n4 = 8;
                        break;
                    }
                    case 2: {
                        n4 = 4;
                    }
                    default: {
                        break;
                    }
                    case 5: {
                        n4 = 2;
                        break;
                    }
                    case 10: {
                        n4 = 1;
                    }
                }
                if (bl) {
                    n4 = Math.max(1, n4 / 2);
                }
                n9 += n8 + n5 * n4;
            }
            if (bl) {
                n9 = Math.max(1, n9 / 2);
            }
            this.lllIIIllIIIIlllIlIIllIIll = n9 + n;
            if (n <= 0) {
                class_08973 = null;
            }
            if (n3 == n && n3 > 0 && this.lllIIIllIIIIlllIlIIllIIll >= 40) {
                this.lllIIIllIIIIlllIlIIllIIll = 39;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll >= 40 && !this.IlIlllIIIIIIlIIllIIllIlll.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                class_08973 = null;
            }
            if (class_08973 != null) {
                n7 = class_08973.IllIIIIllIIllIllIlllIlIIl();
                if (class_08974 != null && n7 < class_08974.IllIIIIllIIllIllIlllIlIIl()) {
                    n7 = class_08974.IllIIIIllIIllIllIlllIlIIl();
                }
                if (class_08973.IlIIIlIIIIllIIIllIIIIIIll()) {
                    n7 -= 9;
                }
                if (n7 < 0) {
                    n7 = 0;
                }
                class_08973.IlIllllllIIlIIllllIIlIIIl(n7 += 2);
                class_1250.lllIIIllIIIIlllIlIIllIIll(map, class_08973);
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(0, class_08973);
            this.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1283 class_12832) {
        super.lllIIIllIIIIlllIlIIllIIll(class_12832);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 0, this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n == 0) {
            this.lllIIIllIIIIlllIlIIllIIll = n2;
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_08142);
        if (!this.IIIllIllIIlIlIlIlIllllIIl.IllIIIIllIIllIllIlllIlIIl) {
            for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll(); ++i) {
                ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl.lllIIlIIIllllllIIIIlIlIlI(i);
                if (class_08972 == null) continue;
                class_08142.lllIIIllIIIIlllIlIIllIIll(class_08972, false);
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return this.IIIllIllIIlIlIlIlIllllIIl.a_(this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII) != Blocks.llIlllllIIlIIlIIllllIllll ? false : class_08142.lIllllIIlIIIlIllllllIIIll((double)this.IllIIIllIIIIlIlIlIllIIlll + 0.5, (double)this.lIIIIlIlIIlllllIIllIIlIII + 0.5, (double)this.llIIlllIllIllllIIIlIIIIII + 0.5) <= 64.0;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        ItemStack class_08972 = null;
        class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
            ItemStack class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
            class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
            if (n == 2) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 39, true)) {
                    return null;
                }
                class_12912.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972);
            } else if (n != 0 && n != 1 ? n >= 3 && n < 39 && !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0, 2, false) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 3, 39, false)) {
                return null;
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                class_12912.lllIlIIlIIIlIlIIIllIlllIl(null);
            } else {
                class_12912.IlIllllllIIlIIllllIIlIIIl();
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                return null;
            }
            class_12912.lllIIIllIIIIlllIlIIllIIll(class_08142, class_08973);
        }
        return class_08972;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIlIIIllllllIIIIlIlIlI = string;
        if (this.lllIIIllIIIIlllIlIIllIIll(2).lllIlIIlIIIlIlIIIllIlllIl()) {
            ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll(2).lllIIIllIIIIlllIlIIllIIll();
            if (StringUtils.isBlank((CharSequence)string)) {
                class_08972.lIlIlIIlIIIIlIIIIIlllIIII();
            } else {
                class_08972.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    static /* synthetic */ class_0850 lllIIIllIIIIlllIlIIllIIll(class_0631 class_06312) {
        return class_06312.IllIIlllllllIIlIIlIIIIlIl;
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(class_0631 class_06312) {
        return class_06312.llIIllIllIlIIlIIllIllllll;
    }
}

