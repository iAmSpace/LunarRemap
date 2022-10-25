package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.IChatComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ChatComponentTranslation;

import java.util.ArrayList;
import java.util.List;

public class class_1406 {
    private final List lllIIIllIIIIlllIlIIllIIll = new ArrayList();
    private final class_1965 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private String IllIIlllllllIIlIIlIIIIlIl;

    public class_1406(class_1965 class_19652) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_19652;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lIllllIIlIIIlIllllllIIIll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl.h_()) {
            Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl));
            if (class_05492 == Blocks.lIlIIllIllIIIIIlIllllIIIl) {
                this.IllIIlllllllIIlIIlIIIIlIl = "ladder";
            } else if (class_05492 == Blocks.lIIlIlllIIlIIIIlIlIIIIlll) {
                this.IllIIlllllllIIlIIlIIIIlIl = "vines";
            }
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl.llIlllIlIIllIlIIIIllIIlIl()) {
            this.IllIIlllllllIIlIIlIIIIlIl = "water";
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f, float f2) {
        this.lIlllIlllIIIIlIIlllIllIII();
        this.lllIIIllIIIIlllIlIIllIIll();
        class_0480 class_04802 = new class_0480(class_00582, this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIllllIIllIllIlIIlIl, f, f2, this.IllIIlllllllIIlIIlIIIIlIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIIIllIIIIIllllIlIlIllIll);
        this.lllIIIllIIIIlllIlIIllIIll.add(class_04802);
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIllllIIllIllIlIIlIl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = true;
        if (class_04802.IlIllllllIIlIIllllIIlIIIl() && !this.lIllllIIlIIIlIllllllIIIll && this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIlllllllIIllIlIllllI()) {
            this.lIllllIIlIIIlIllllllIIIll = true;
            this.IlIIIIIllllllIIlllIllllll = this.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIllllIIllIllIlIIlIl;
            this.lllIlIIlIIIlIlIIIllIlllIl.llIlllllIIlIIlIIllllIllll();
        }
    }

    public IChatComponent lllIlIIlIIIlIlIIIllIlllIl() {
        IChatComponent class_22552;
        if (this.lllIIIllIIIIlllIlIIllIIll.size() == 0) {
            return new ChatComponentTranslation("death.attack.generic", this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl());
        }
        class_0480 class_04802 = this.IlIIIIIllllllIIlllIllllll();
        class_0480 class_04803 = (class_0480)this.lllIIIllIIIIlllIlIIllIIll.get(this.lllIIIllIIIIlllIlIIllIIll.size() - 1);
        IChatComponent class_22553 = class_04803.IlIIIIIllllllIIlllIllllll();
        class_1521 class_15212 = class_04803.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll();
        if (class_04802 != null && class_04803.lllIIIllIIIIlllIlIIllIIll() == class_0058.IllIIlllllllIIlIIlIIIIlIl) {
            IChatComponent class_22554 = class_04802.IlIIIIIllllllIIlllIllllll();
            if (class_04802.lllIIIllIIIIlllIlIIllIIll() != class_0058.IllIIlllllllIIlIIlIIIIlIl && class_04802.lllIIIllIIIIlllIlIIllIIll() != class_0058.IIIllIllIIlIlIlIlIllllIIl) {
                if (!(class_22554 == null || class_22553 != null && class_22554.equals(class_22553))) {
                    ItemStack class_08972;
                    class_1521 class_15213 = class_04802.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll();
                    ItemStack class_08973 = class_08972 = class_15213 instanceof class_1965 ? ((class_1965)class_15213).lIIIIlIlIlIIIlIIllIIlIlIl() : null;
                    class_22552 = class_08972 != null && class_08972.IlIIIlIIIIllIIIllIIIIIIll() ? new ChatComponentTranslation("death.fell.assist.item", this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl(), class_22554, class_08972.IIlIIlIlIlIllIIlIlIIIIlll()) : new ChatComponentTranslation("death.fell.assist", this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl(), class_22554);
                } else if (class_22553 != null) {
                    ItemStack class_08974;
                    ItemStack class_08975 = class_08974 = class_15212 instanceof class_1965 ? ((class_1965)class_15212).lIIIIlIlIlIIIlIIllIIlIlIl() : null;
                    class_22552 = class_08974 != null && class_08974.IlIIIlIIIIllIIIllIIIIIIll() ? new ChatComponentTranslation("death.fell.finish.item", this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl(), class_22553, class_08974.IIlIIlIlIlIllIIlIlIIIIlll()) : new ChatComponentTranslation("death.fell.finish", this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl(), class_22553);
                } else {
                    class_22552 = new ChatComponentTranslation("death.fell.killer", this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl());
                }
            } else {
                class_22552 = new ChatComponentTranslation("death.fell.accident." + this.lllIIIllIIIIlllIlIIllIIll(class_04802), this.lllIlIIlIIIlIlIIIllIlllIl.llIIIIllIIIIIIIlIIIlIIIIl());
            }
        } else {
            class_22552 = class_04803.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        return class_22552;
    }

    public class_1965 IlIllllllIIlIIllllIIlIIIl() {
        class_1965 class_19652 = null;
        class_0814 class_08142 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        for (class_0480 class_04802 : this.lllIIIllIIIIlllIlIIllIIll) {
            if (class_04802.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll() instanceof class_0814 && (class_08142 == null || class_04802.lllIlIIlIIIlIlIIIllIlllIl() > f2)) {
                f2 = class_04802.lllIlIIlIIIlIlIIIllIlllIl();
                class_08142 = (class_0814)class_04802.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll();
            }
            if (!(class_04802.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll() instanceof class_1965) || class_19652 != null && !(class_04802.lllIlIIlIIIlIlIIIllIlllIl() > f)) continue;
            f = class_04802.lllIlIIlIIIlIlIIIllIlllIl();
            class_19652 = (class_1965)class_04802.lllIIIllIIIIlllIlIIllIIll().IllIIIllIIIIlIlIlIllIIlll();
        }
        if (class_08142 != null && f2 >= f / 3.0f) {
            return class_08142;
        }
        return class_19652;
    }

    private class_0480 IlIIIIIllllllIIlllIllllll() {
        class_0480 class_04802 = null;
        class_0480 class_04803 = null;
        int n = 0;
        float f = 0.0f;
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.size(); ++i) {
            class_0480 class_04804;
            class_0480 class_04805 = (class_0480)this.lllIIIllIIIIlllIlIIllIIll.get(i);
            class_0480 class_04806 = class_04804 = i > 0 ? (class_0480)this.lllIIIllIIIIlllIlIIllIIll.get(i - 1) : null;
            if ((class_04805.lllIIIllIIIIlllIlIIllIIll() == class_0058.IllIIlllllllIIlIIlIIIIlIl || class_04805.lllIIIllIIIIlllIlIIllIIll() == class_0058.IIIllIllIIlIlIlIlIllllIIl) && class_04805.lIllllIIlIIIlIllllllIIIll() > 0.0f && (class_04802 == null || class_04805.lIllllIIlIIIlIllllllIIIll() > f)) {
                class_04802 = i > 0 ? class_04804 : class_04805;
                f = class_04805.lIllllIIlIIIlIllllllIIIll();
            }
            if (class_04805.lIlllIlllIIIIlIIlllIllIII() == null || class_04803 != null && !(class_04805.lllIlIIlIIIlIlIIIllIlllIl() > (float)n)) continue;
            class_04803 = class_04805;
        }
        if (f > 5.0f && class_04802 != null) {
            return class_04802;
        }
        if (n > 5 && class_04803 != null) {
            return class_04803;
        }
        return null;
    }

    private String lllIIIllIIIIlllIlIIllIIll(class_0480 class_04802) {
        return class_04802.lIlllIlllIIIIlIIlllIllIII() == null ? "generic" : class_04802.lIlllIlllIIIIlIIlllIllIII();
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        this.IllIIlllllllIIlIIlIIIIlIl = null;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        int n;
        int n2 = n = this.lIllllIIlIIIlIllllllIIIll ? 300 : 100;
        if (this.IIIllIIlIIIIIIlIlIIllIIlI && (!this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIlllllllIIllIlIllllI() || this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIllllIIllIllIlIIlIl - this.IlIllllllIIlIIllllIIlIIIl > n)) {
            boolean bl = this.lIllllIIlIIIlIllllllIIIll;
            this.IIIllIIlIIIIIIlIlIIllIIlI = false;
            this.lIllllIIlIIIlIllllllIIIll = false;
            this.IlIIIIIllllllIIlllIllllll = this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIllllIIllIllIlIIlIl;
            if (bl) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lIllIlIlIIIIlIlIIlIlIlllI();
            }
            this.lllIIIllIIIIlllIlIIllIIll.clear();
        }
    }
}

