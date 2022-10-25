package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class class_1654 {
    private final int lllIIIllIIIIlllIlIIllIIll;
    private final Set lllIlIIlIIIlIlIIIllIlllIl = new HashSet(256);
    private final List IlIllllllIIlIIllllIIlIIIl = new ArrayList(256);
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private final int lIllllIIlIIIlIllllllIIIll;
    private final int IIIllIIlIIIIIIlIlIIllIIlI;
    private final boolean IllIIlllllllIIlIIlIIIIlIl;
    private final int IIIllIllIIlIlIlIlIllllIIl;

    public class_1654(int n, int n2, boolean bl, int n3, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll = n4;
        this.lIllllIIlIIIlIllllllIIIll = n;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n2;
        this.IllIIlllllllIIlIIlIIIIlIl = bl;
        this.IIIllIllIIlIlIlIlIllllIIl = n3;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1585 class_15852) {
        class_1797 class_17972 = new class_1797(class_15852, this.lllIIIllIIIIlllIlIIllIIll);
        if (this.IIIllIllIIlIlIlIlIllllIIl > 0) {
            class_17972.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.add(class_17972);
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        Object[] arrobject = this.lllIlIIlIIIlIlIIIllIlllIl.toArray(new class_1797[this.lllIlIIlIIIlIlIIIllIlllIl.size()]);
        Arrays.sort(arrobject);
        Object[] arrobject2 = arrobject;
        int n = arrobject.length;
        for (int i = 0; i < n; ++i) {
            Object object = arrobject2[i];
            if (this.lllIIIllIIIIlllIlIIllIIll((class_1797)object)) continue;
            String string = String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", ((class_1797)object).lllIIIllIIIIlllIlIIllIIll().IIIllIIlIIIIIIlIlIIllIIlI(), ((class_1797)object).lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(), ((class_1797)object).lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(), this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI);
            throw new class_0297((class_1797)object, string);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            this.lIlllIlllIIIIlIIlllIllIII = MathHelper.roundUpToPowerOfTwo(this.lIlllIlllIIIIlIIlllIllIII);
            this.IlIIIIIllllllIIlllIllllll = MathHelper.roundUpToPowerOfTwo(this.IlIIIIIllllllIIlllIllllll);
        }
    }

    public List lIlllIlllIIIIlIIlllIllIII() {
        Object object2;
        ArrayList arrayList = Lists.newArrayList();
        for (Object object2 : this.IlIllllllIIlIIllllIIlIIIl) {
            ((class_2024)object2).lllIIIllIIIIlllIlIIllIIll(arrayList);
        }
        object2 = Lists.newArrayList();
        for (class_2024 class_20242 : arrayList) {
            class_1797 class_17972 = class_20242.lllIIIllIIIIlllIlIIllIIll();
            class_1585 class_15852 = class_17972.lllIIIllIIIIlllIlIIllIIll();
            class_15852.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, class_20242.lllIlIIlIIIlIlIIIllIlllIl(), class_20242.IlIllllllIIlIIllllIIlIIIl(), class_17972.IlIIIIIllllllIIlllIllllll());
            ((ArrayList)object2).add(class_15852);
        }
        return object2;
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return (n >> n2) + ((n & (1 << n2) - 1) == 0 ? 0 : 1) << n2;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1797 class_17972) {
        for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
            if (((class_2024)this.IlIllllllIIlIIllllIIlIIIl.get(i)).lllIIIllIIIIlllIlIIllIIll(class_17972)) {
                return true;
            }
            class_17972.lIlllIlllIIIIlIIlllIllIII();
            if (((class_2024)this.IlIllllllIIlIIllllIIlIIIl.get(i)).lllIIIllIIIIlllIlIIllIIll(class_17972)) {
                return true;
            }
            class_17972.lIlllIlllIIIIlIIlllIllIII();
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_17972);
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_1797 class_17972) {
        class_2024 class_20242;
        boolean bl;
        int n;
        int n2;
        boolean bl2;
        int n3 = Math.min(class_17972.lllIlIIlIIIlIlIIIllIlllIl(), class_17972.IlIllllllIIlIIllllIIlIIIl());
        boolean bl3 = bl2 = this.lIlllIlllIIIIlIIlllIllIII == 0 && this.IlIIIIIllllllIIlllIllllll == 0;
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            boolean bl4;
            boolean bl5;
            n2 = MathHelper.roundUpToPowerOfTwo(this.lIlllIlllIIIIlIIlllIllIII);
            n = MathHelper.roundUpToPowerOfTwo(this.IlIIIIIllllllIIlllIllllll);
            int n4 = MathHelper.roundUpToPowerOfTwo(this.lIlllIlllIIIIlIIlllIllIII + n3);
            int n5 = MathHelper.roundUpToPowerOfTwo(this.IlIIIIIllllllIIlllIllllll + n3);
            boolean bl6 = n4 <= this.lIllllIIlIIIlIllllllIIIll;
            boolean bl7 = bl5 = n5 <= this.IIIllIIlIIIIIIlIlIIllIIlI;
            if (!bl6 && !bl5) {
                return false;
            }
            boolean bl8 = n2 != n4;
            boolean bl9 = bl4 = n != n5;
            bl = bl8 ^ bl4 ? !bl8 : bl6 && n2 <= n;
        } else {
            boolean bl10;
            n = this.lIlllIlllIIIIlIIlllIllIII + n3 <= this.lIllllIIlIIIlIllllllIIIll ? 1 : 0;
            boolean bl11 = bl10 = this.IlIIIIIllllllIIlllIllllll + n3 <= this.IIIllIIlIIIIIIlIlIIllIIlI;
            if (n == 0 && !bl10) {
                return false;
            }
            bl = n != 0 && (bl2 || this.lIlllIlllIIIIlIIlllIllIII <= this.IlIIIIIllllllIIlllIllllll);
        }
        n2 = Math.max(class_17972.lllIlIIlIIIlIlIIIllIlllIl(), class_17972.IlIllllllIIlIIllllIIlIIIl());
        if (MathHelper.roundUpToPowerOfTwo((!bl ? this.IlIIIIIllllllIIlllIllllll : this.lIlllIlllIIIIlIIlllIllIII) + n2) > (!bl ? this.IIIllIIlIIIIIIlIlIIllIIlI : this.lIllllIIlIIIlIllllllIIIll)) {
            return false;
        }
        if (bl) {
            if (class_17972.lllIlIIlIIIlIlIIIllIlllIl() > class_17972.IlIllllllIIlIIllllIIlIIIl()) {
                class_17972.lIlllIlllIIIIlIIlllIllIII();
            }
            if (this.IlIIIIIllllllIIlllIllllll == 0) {
                this.IlIIIIIllllllIIlllIllllll = class_17972.IlIllllllIIlIIllllIIlIIIl();
            }
            class_20242 = new class_2024(this.lIlllIlllIIIIlIIlllIllIII, 0, class_17972.lllIlIIlIIIlIlIIIllIlllIl(), this.IlIIIIIllllllIIlllIllllll);
            this.lIlllIlllIIIIlIIlllIllIII += class_17972.lllIlIIlIIIlIlIIIllIlllIl();
        } else {
            class_20242 = new class_2024(0, this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII, class_17972.IlIllllllIIlIIllllIIlIIIl());
            this.IlIIIIIllllllIIlllIllllll += class_17972.IlIllllllIIlIIllllIIlIIIl();
        }
        class_20242.lllIIIllIIIIlllIlIIllIIll(class_17972);
        this.IlIllllllIIlIIllllIIlIIIl.add(class_20242);
        return true;
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return class_1654.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
    }
}

