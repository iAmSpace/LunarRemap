package net.minecraft.item;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.stats.StatList;
import net.minecraft.util.IChatComponent;
import obf.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class ItemStack {
    public static final DecimalFormat lllIIIllIIIIlllIlIIllIIll = new DecimalFormat("#.###");
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    private Item IlIIIIIllllllIIlllIllllll;
    public class_0775 lIlllIlllIIIIlIIlllIllIII;
    private int lIllllIIlIIIlIllllllIIIll;
    private class_1094 IIIllIIlIIIIIIlIlIIllIIlI;

    public ItemStack(Block class_05492) {
        this(class_05492, 1);
    }

    public ItemStack(Block class_05492, int n) {
        this(class_05492, n, 0);
    }

    public ItemStack(Block class_05492, int n, int n2) {
        this(Item.getItemFromBlock(class_05492), n, n2);
    }

    public ItemStack(Item class_06112) {
        this(class_06112, 1);
    }

    public ItemStack(Item class_06112, int n) {
        this(class_06112, n, 0);
    }

    public ItemStack(Item class_06112, int n, int n2) {
        this.IlIIIIIllllllIIlllIllllll = class_06112;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.lIllllIIlIIIlIllllllIIIll = n2;
        if (this.lIllllIIlIIIlIllllllIIIll < 0) {
            this.lIllllIIlIIIlIllllllIIIll = 0;
        }
    }

    public static ItemStack lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        ItemStack class_08972 = new ItemStack();
        class_08972.IlIllllllIIlIIllllIIlIIIl(class_07752);
        return class_08972.lllIIIllIIIIlllIlIIllIIll() != null ? class_08972 : null;
    }

    private ItemStack() {
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n) {
        ItemStack class_08972 = new ItemStack(this.IlIIIIIllllllIIlllIllllll, n, this.lIllllIIlIIIlIllllllIIIll);
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            class_08972.lIlllIlllIIIIlIIlllIllIII = (class_0775)this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl -= n;
        return class_08972;
    }

    public Item lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public IIcon lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this, class_08142, class_13342, n, n2, n3, n4, f, f2, f3);
        if (bl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IIlIIlIlIlIllIIlIlIIIIlll[Item.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll)], 1);
        }
        return bl;
    }

    public float lllIIIllIIIIlllIlIIllIIll(Block class_05492) {
        return this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this, class_05492);
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this, class_13342, class_08142);
    }

    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(this, class_13342, class_08142);
    }

    public class_0775 lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("id", (short) Item.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll));
        class_07752.lllIIIllIIIIlllIlIIllIIll("Count", (byte)this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Damage", (short)this.lIllllIIlIIIlIllllllIIIll);
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("tag", this.lIlllIlllIIIIlIIlllIllIII);
        }
        return class_07752;
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0775 class_07752) {
        this.IlIIIIIllllllIIlllIllllll = Item.lllIIIllIIIIlllIlIIllIIll(class_07752.IlIIIIIllllllIIlllIllllll("id"));
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIlllIlllIIIIlIIlllIllIII("Count");
        this.lIllllIIlIIIlIllllllIIIll = class_07752.IlIIIIIllllllIIlllIllllll("Damage");
        if (this.lIllllIIlIIIlIllllllIIIll < 0) {
            this.lIllllIIlIIIlIllllllIIIll = 0;
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("tag", 10)) {
            this.lIlllIlllIIIIlIIlllIllIII = class_07752.llIIllIllIlIIlIIllIllllll("tag");
        }
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl();
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII() > 1 && (!this.lIllllIIlIIIlIllllllIIIll() || !this.IllIIlllllllIIlIIlIIIIlIl());
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll() <= 0 ? false : !this.IlIlIIlIlIllIIlIlIIllIIIl() || !this.lllllIlllIIllIlIIlIIIllII().lllIIlIIIllllllIIIIlIlIlI("Unbreakable");
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII();
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll() && this.lIllllIIlIIIlIllllllIIIll > 0;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int IllIIIllIIIIlIlIlIllIIlll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.lIllllIIlIIIlIllllllIIIll = n;
        if (this.lIllllIIlIIIlIllllllIIIll < 0) {
            this.lIllllIIlIIIlIllllllIIIll = 0;
        }
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, Random random) {
        if (!this.lIllllIIlIIIlIllllllIIIll()) {
            return false;
        }
        if (n > 0) {
            int n2 = class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lIIlIIIIIlIlllIlIIlIlIlll.IlIIlllllIIlIlIlllllIllll, this);
            int n3 = 0;
            for (int i = 0; n2 > 0 && i < n; ++i) {
                if (!class_1733.lllIIIllIIIIlllIlIIllIIll(this, n2, random)) continue;
                ++n3;
            }
            if ((n -= n3) <= 0) {
                return false;
            }
        }
        this.lIllllIIlIIIlIllllllIIIll += n;
        return this.lIllllIIlIIIlIllllllIIIll > this.lIIIIlIlIIlllllIIllIIlIII();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, class_1965 class_19652) {
        if ((!(class_19652 instanceof class_0814) || !((class_0814)class_19652).lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) && this.lIllllIIlIIIlIllllllIIIll() && this.lllIIIllIIIIlllIlIIllIIll(n, class_19652.IlllIIIlIIlIIIIllllIllllI())) {
            class_19652.lllIlIIlIIIlIlIIIllIlllIl(this);
            --this.lllIlIIlIIIlIlIIIllIlllIl;
            if (class_19652 instanceof class_0814) {
                class_0814 class_08142 = (class_0814)class_19652;
                class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.llIIIlllIlllIlIllIIIIllIl[Item.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll)], 1);
                if (this.lllIlIIlIIIlIlIIIllIlllIl == 0 && this.lllIIIllIIIIlllIlIIllIIll() instanceof class_1964) {
                    class_08142.lIIIllIlIlIlIIIllIlIlIllI();
                }
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl < 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl = 0;
            }
            this.lIllllIIlIIIlIllllllIIIll = 0;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_0814 class_08142) {
        boolean bl = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this, class_19652, (class_1965)class_08142);
        if (bl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IIlIIlIlIlIllIIlIlIIIIlll[Item.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll)], 1);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Block class_05492, int n, int n2, int n3, class_0814 class_08142) {
        boolean bl = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this, class_13342, class_05492, n, n2, n3, class_08142);
        if (bl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IIlIIlIlIlIllIIlIlIIIIlll[Item.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll)], 1);
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(class_05492);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1965 class_19652) {
        return this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this, class_08142, class_19652);
    }

    public ItemStack llIIlllIllIllllIIIlIIIIII() {
        ItemStack class_08972 = new ItemStack(this.IlIIIIIllllllIIlllIllllll, this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll);
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            class_08972.lIlllIlllIIIIlIIlllIllIII = (class_0775)this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
        }
        return class_08972;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973) {
        return class_08972 == null && class_08973 == null ? true : (class_08972 != null && class_08973 != null ? (class_08972.lIlllIlllIIIIlIIlllIllIII == null && class_08973.lIlllIlllIIIIlIIlllIllIII != null ? false : class_08972.lIlllIlllIIIIlIIlllIllIII == null || class_08972.lIlllIlllIIIIlIIlllIllIII.equals(class_08973.lIlllIlllIIIIlIIlllIllIII)) : false);
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, ItemStack class_08973) {
        return class_08972 == null && class_08973 == null ? true : (class_08972 != null && class_08973 != null ? class_08972.IlIllllllIIlIIllllIIlIIIl(class_08973) : false);
    }

    private boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return this.lllIlIIlIIIlIlIIIllIlllIl != class_08972.lllIlIIlIIIlIlIIIllIlllIl ? false : (this.IlIIIIIllllllIIlllIllllll != class_08972.IlIIIIIllllllIIlllIllllll ? false : (this.lIllllIIlIIIlIllllllIIIll != class_08972.lIllllIIlIIIlIllllllIIIll ? false : (this.lIlllIlllIIIIlIIlllIllIII == null && class_08972.lIlllIlllIIIIlIIlllIllIII != null ? false : this.lIlllIlllIIIIlIIlllIllIII == null || this.lIlllIlllIIIIlIIlllIllIII.equals(class_08972.lIlllIlllIIIIlIIlllIllIII))));
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return this.IlIIIIIllllllIIlllIllllll == class_08972.IlIIIIIllllllIIlllIllllll && this.lIllllIIlIIIlIllllllIIIll == class_08972.lIllllIIlIIIlIllllllIIIll;
    }

    public String llIIllIllIlIIlIIllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(this);
    }

    public static ItemStack lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        return class_08972 == null ? null : class_08972.llIIlllIllIllllIIIlIIIIII();
    }

    public String toString() {
        return this.lllIlIIlIIIlIlIIIllIlllIl + "x" + this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll() + "@" + this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_1521 class_15212, int n, boolean bl) {
        if (this.IlIllllllIIlIIllllIIlIIIl > 0) {
            --this.IlIllllllIIlIIllllIIlIIIl;
        }
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this, class_13342, class_15212, n, bl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n) {
        class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IIIIIIIIlIllIIllIIlllIllI[Item.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll)], n);
        this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl(this, class_13342, class_08142);
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.lllIIIllIIIIlllIlIIllIIll().lIllllIIlIIIlIllllllIIIll(this);
    }

    public class_1484 IlIlllIIIIIIlIIllIIllIlll() {
        return this.lllIIIllIIIIlllIlIIllIIll().IlIIIIIllllllIIlllIllllll(this);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, class_0814 class_08142, int n) {
        this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this, class_13342, class_08142, n);
    }

    public boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII != null;
    }

    public class_0775 lllllIlllIIllIlIIlIIIllII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public class_2145 IlIlIIlllIIlIllIIIlllllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII == null ? null : this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl("ench", 10);
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_0775 class_07752) {
        this.lIlllIlllIIIIlIIlllIllIII = class_07752;
    }

    public String lIIlIIIIIlIlllIlIIlIlIlll() {
        class_0775 class_07752;
        String string = this.lllIIIllIIIIlllIlIIllIIll().IIIllIllIIlIlIlIlIllllIIl(this);
        if (this.lIlllIlllIIIIlIIlllIllIII != null && this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("display", 10) && (class_07752 = this.lIlllIlllIIIIlIIlllIllIII.llIIllIllIlIIlIIllIllllll("display")).lllIlIIlIIIlIlIIIllIlllIl("Name", 8)) {
            string = class_07752.IllIIIllIIIIlIlIlIllIIlll("Name");
        }
        return string;
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(String string) {
        if (this.lIlllIlllIIIIlIIlllIllIII == null) {
            this.lIlllIlllIIIIlIIlllIllIII = new class_0775();
        }
        if (!this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("display", 10)) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll("display", new class_0775());
        }
        this.lIlllIlllIIIIlIIlllIllIII.llIIllIllIlIIlIIllIllllll("display").lllIIIllIIIIlllIlIIllIIll("Name", string);
        return this;
    }

    public void lIlIlIIlIIIIlIIIIIlllIIII() {
        if (this.lIlllIlllIIIIlIIlllIllIII != null && this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("display", 10)) {
            class_0775 class_07752 = this.lIlllIlllIIIIlIIlllIllIII.llIIllIllIlIIlIIllIllllll("display");
            class_07752.IlIlllIIIIIIlIIllIIllIlll("Name");
            if (class_07752.IlIIIIIllllllIIlllIllllll()) {
                this.lIlllIlllIIIIlIIlllIllIII.IlIlllIIIIIIlIIllIIllIlll("display");
                if (this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll()) {
                    this.lIlllIlllIIIIlIIlllIllIII(null);
                }
            }
        }
    }

    public boolean IlIIIlIIIIllIIIllIIIIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII == null ? false : (!this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("display", 10) ? false : this.lIlllIlllIIIIlIIlllIllIII.llIIllIllIlIIlIIllIllllll("display").lllIlIIlIIIlIlIIIllIlllIl("Name", 8));
    }

    public List lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, boolean bl) {
        int n;
        Object object;
        Object object2;
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0541.lllIIIllIIIIlllIlIIllIIll)) {
            object2 = this.lIIlIIIIIlIlllIlIIlIlIlll();
            if (this.IlIIIlIIIIllIIIllIIIIIIll()) {
                object2 = (Object)((Object) EnumChatFormatting.ITALIC) + (String)object2 + (Object)((Object) EnumChatFormatting.RESET);
            }
            if (bl) {
                object = "";
                if (((String)object2).length() > 0) {
                    object2 = (String)object2 + " (";
                    object = ")";
                }
                n = Item.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
                object2 = this.IIIllIIlIIIIIIlIlIIllIIlI() ? (String)object2 + String.format("#%04d/%d%s", n, this.lIllllIIlIIIlIllllllIIIll, object) : (String)object2 + String.format("#%04d%s", n, object);
            } else if (!this.IlIIIlIIIIllIIIllIIIIIIll() && this.IlIIIIIllllllIIlllIllllll == Items.IIIIIlllIIllllIlllIlllIIl) {
                object2 = (String)object2 + " #" + this.lIllllIIlIIIlIllllllIIIll;
            }
            arrayList.add((String)object2);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0541.lllIlIIlIIIlIlIIIllIlllIl)) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this, class_08142, arrayList, bl);
        }
        if (this.IlIlIIlIlIllIIlIlIIllIIIl()) {
            int n2;
            if (this.lllIIIllIIIIlllIlIIllIIll(class_0541.IlIllllllIIlIIllllIIlIIIl) && (object2 = this.IlIlIIlllIIlIllIIIlllllIl()) != null) {
                for (n = 0; n < ((class_2145)object2).lIlllIlllIIIIlIIlllIllIII(); ++n) {
                    short s = ((class_2145)object2).lllIlIIlIIIlIlIIIllIlllIl(n).IlIIIIIllllllIIlllIllllll("id");
                    n2 = ((class_2145)object2).lllIlIIlIIIlIlIIIllIlllIl(n).IlIIIIIllllllIIlllIllllll("lvl");
                    if (class_1469.lllIIIllIIIIlllIlIIllIIll[s] == null) continue;
                    arrayList.add(class_1469.lllIIIllIIIIlllIlIIllIIll[s].IlIllllllIIlIIllllIIlIIIl(n2));
                }
            }
            if (this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("display", 10)) {
                object2 = this.lIlllIlllIIIIlIIlllIllIII.llIIllIllIlIIlIIllIllllll("display");
                if (this.lllIIIllIIIIlllIlIIllIIll(class_0541.lIlllIlllIIIIlIIlllIllIII) && ((class_0775)object2).lllIlIIlIIIlIlIIIllIlllIl("color", 3)) {
                    if (bl) {
                        arrayList.add("Color: #" + Integer.toHexString(((class_0775)object2).lIllllIIlIIIlIllllllIIIll("color")).toUpperCase());
                    } else {
                        arrayList.add((Object)((Object) EnumChatFormatting.ITALIC) + class_1586.lllIIIllIIIIlllIlIIllIIll("item.dyed"));
                    }
                }
                if (this.lllIIIllIIIIlllIlIIllIIll(class_0541.IlIIIIIllllllIIlllIllllll) && ((class_0775)object2).lllIlIIlIIIlIlIIIllIlllIl("Lore") == 9 && ((class_2145)(object = ((class_0775)object2).IlIllllllIIlIIllllIIlIIIl("Lore", 8))).lIlllIlllIIIIlIIlllIllIII() > 0) {
                    for (n2 = 0; n2 < ((class_2145)object).lIlllIlllIIIIlIIlllIllIII(); ++n2) {
                        arrayList.add((Object)((Object) EnumChatFormatting.DARK_PURPLE) + "" + (Object)((Object) EnumChatFormatting.ITALIC) + ((class_2145)object).lIllllIIlIIIlIllllllIIIll(n2));
                    }
                }
            }
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0541.lIllllIIlIIIlIllllllIIIll) && !(object2 = this.IIIIIIIIlIllIIllIIlllIllI()).isEmpty() && LunarClient.getInstance().getSettingsManager().lIIIIlIlIIlllllIIllIIlIII) {
            arrayList.add("");
            for (Map.Entry entry : object2.entries()) {
                class_1256 class_12562 = (class_1256)entry.getValue();
                double d = class_12562.lIlllIlllIIIIlIIlllIllIII();
                if (class_12562.lllIIIllIIIIlllIlIIllIIll() == Item.lllIlIIlIIIlIlIIIllIlllIl) {
                    d += (double)class_1250.lllIIIllIIIIlllIlIIllIIll(this, class_0529.lllIIIllIIIIlllIlIIllIIll);
                }
                double d2 = class_12562.IlIllllllIIlIIllllIIlIIIl() != 1 && class_12562.IlIllllllIIlIIllllIIlIIIl() != 2 ? d : d * 100.0;
                if (d > 0.0) {
                    arrayList.add((Object)((Object) EnumChatFormatting.BLUE) + class_1586.lllIIIllIIIIlllIlIIllIIll("attribute.modifier.plus." + class_12562.IlIllllllIIlIIllllIIlIIIl(), lllIIIllIIIIlllIlIIllIIll.format(d2), class_1586.lllIIIllIIIIlllIlIIllIIll("attribute.name." + (String)entry.getKey())));
                    continue;
                }
                if (!(d < 0.0)) continue;
                arrayList.add((Object)((Object) EnumChatFormatting.RED) + class_1586.lllIIIllIIIIlllIlIIllIIll("attribute.modifier.take." + class_12562.IlIllllllIIlIIllllIIlIIIl(), lllIIIllIIIIlllIlIIllIIll.format(d2 *= -1.0), class_1586.lllIIIllIIIIlllIlIIllIIll("attribute.name." + (String)entry.getKey())));
            }
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0541.IIIllIIlIIIIIIlIlIIllIIlI) && this.IlIlIIlIlIllIIlIlIIllIIIl() && this.lllllIlllIIllIlIIlIIIllII().lllIIlIIIllllllIIIIlIlIlI("Unbreakable")) {
            arrayList.add((Object)((Object) EnumChatFormatting.BLUE) + class_1586.lllIIIllIIIIlllIlIIllIIll("item.unbreakable"));
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0541.IllIIlllllllIIlIIlIIIIlIl) && bl && this.IllIIlllllllIIlIIlIIIIlIl()) {
            arrayList.add("Durability: " + (this.lIIIIlIlIIlllllIIllIIlIII() - this.IIIllIllIIlIlIlIlIllllIIl()) + " / " + this.lIIIIlIlIIlllllIIllIIlIII());
        }
        return arrayList;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0541 class_05412) {
        if (!this.IlIlIIlIlIllIIlIlIIllIIIl()) {
            return true;
        }
        if (!this.lllllIlllIIllIlIIlIIIllII().IlIllllllIIlIIllllIIlIIIl("hidden")) {
            return true;
        }
        class_0775 class_07752 = this.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("hidden");
        return !class_07752.IlIllllllIIlIIllllIIlIIIl(class_05412.name()) || class_07752.lIlllIlllIIIIlIIlllIllIII(class_05412.name()) != 1;
    }

    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll(this);
    }

    public EnumRarity lIlIllIIlIIlIIlIIlIIlIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll().lIIIIlIlIIlllllIIllIIlIII(this);
    }

    public boolean llIIlIllIllllIlIIIIlIIlll() {
        return !this.lllIIIllIIIIlllIlIIllIIll().llIIlllIllIllllIIIlIIIIII(this) ? false : !this.llIllllIlIllIIIlIllIIlIlI();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1469 class_14692, int n) {
        if (this.lIlllIlllIIIIlIIlllIllIII == null) {
            this.lIlllIlllIIIIlIIlllIllIII(new class_0775());
        }
        if (!this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("ench", 9)) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll("ench", new class_2145());
        }
        class_2145 class_21452 = this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl("ench", 10);
        class_0775 class_07752 = new class_0775();
        class_07752.lllIIIllIIIIlllIlIIllIIll("id", (short)class_14692.IlIIlllllIIlIlIlllllIllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("lvl", (short)((byte)n));
        class_21452.lllIIIllIIIIlllIlIIllIIll(class_07752);
    }

    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return this.lIlllIlllIIIIlIIlllIllIII != null && this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("ench", 9);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, class_2037 class_20372) {
        if (this.lIlllIlllIIIIlIIlllIllIII == null) {
            this.lIlllIlllIIIIlIIlllIllIII(new class_0775());
        }
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(string, class_20372);
    }

    public boolean lIlllIlllIlIIIIlllIlIlIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll().IlIlIIlllIIlIllIIIlllllIl();
    }

    public boolean IlIIlllllIIlIlIlllllIllll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI != null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1094 class_10942) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_10942;
    }

    public class_1094 llIIlIlIlllIIllIlIlllIllI() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public int IllIIIIllIIllIllIlllIlIIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl() && this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("RepairCost", 3) ? this.lIlllIlllIIIIlIIlllIllIII.lIllllIIlIIIlIllllllIIIll("RepairCost") : 0;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        if (!this.IlIlIIlIlIllIIlIlIIllIIIl()) {
            this.lIlllIlllIIIIlIIlllIllIII = new class_0775();
        }
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll("RepairCost", n);
    }

    public Multimap IIIIIIIIlIllIIllIIlllIllI() {
        Multimap multimap;
        if (this.IlIlIIlIlIllIIlIlIIllIIIl() && this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("AttributeModifiers", 9)) {
            multimap = HashMultimap.create();
            class_2145 class_21452 = this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl("AttributeModifiers", 10);
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
                class_1256 class_12562 = class_1152.lllIIIllIIIIlllIlIIllIIll(class_07752);
                if (class_12562.lllIIIllIIIIlllIlIIllIIll().getLeastSignificantBits() == 0L || class_12562.lllIIIllIIIIlllIlIIllIIll().getMostSignificantBits() == 0L) continue;
                multimap.put((Object)class_07752.IllIIIllIIIIlIlIlIllIIlll("AttributeName"), (Object)class_12562);
            }
        } else {
            multimap = this.lllIIIllIIIIlllIlIIllIIll().lIIlIIIIIlIlllIlIIlIlIlll();
        }
        return multimap;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112) {
        this.IlIIIIIllllllIIlllIllllll = class_06112;
    }

    public IChatComponent IIlIIlIlIlIllIIlIlIIIIlll() {
        IChatComponent class_22552 = new class_0722("[").lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIIIlIlllIlIIlIlIlll()).lllIIIllIIIIlllIlIIllIIll("]");
        if (this.IlIIIIIllllllIIlllIllllll != null) {
            class_0775 class_07752 = new class_0775();
            this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
            class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0015(class_0248.SHOW_ITEM, new class_0722(class_07752.toString())));
            class_22552.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll().rarityColor);
        }
        return class_22552;
    }
}

