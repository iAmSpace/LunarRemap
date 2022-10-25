package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0922
extends class_1469 {
    private static final String[] IIlIIlIlIlIllIIlIlIIIIlll = new String[]{"all", "undead", "arthropods"};
    private static final int[] llIIIlllIlllIlIllIIIIllIl = new int[]{1, 5, 5};
    private static final int[] IIIIlIllIlIIlIIlIllIlIlll = new int[]{11, 8, 8};
    private static final int[] IlIlIIlllIllllllllIIIlIlI = new int[]{20, 20, 20};
    public final int IIIIIIIIlIllIIllIIlllIllI;

    public class_0922(int n, int n2, int n3) {
        super(n, n2, class_0841.IIIllIIlIIIIIIlIlIIllIIlI);
        this.IIIIIIIIlIllIIllIIlllIllI = n3;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return llIIIlllIlllIlIllIIIIllIl[this.IIIIIIIIlIllIIllIIlllIllI] + (n - 1) * IIIIlIllIlIIlIIlIllIlIlll[this.IIIIIIIIlIllIIllIIlllIllI];
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(n) + IlIlIIlllIllllllllIIIlIlI[this.IIIIIIIIlIllIIllIIlllIllI];
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 5;
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(int n, class_0529 class_05292) {
        return this.IIIIIIIIlIllIIllIIlllIllI == 0 ? (float)n * 1.25f : (this.IIIIIIIIlIllIIllIIlllIllI == 1 && class_05292 == class_0529.lllIlIIlIIIlIlIIIllIlllIl ? (float)n * 2.5f : (this.IIIIIIIIlIllIIllIIlllIllI == 2 && class_05292 == class_0529.IlIllllllIIlIIllllIIlIIIl ? (float)n * 2.5f : 0.0f));
    }

    @Override
    public String lIlllIlllIIIIlIIlllIllIII() {
        return "enchantment.damage." + IIlIIlIlIlIllIIlIlIIIIlll[this.IIIIIIIIlIllIIllIIlllIllI];
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1469 class_14692) {
        return !(class_14692 instanceof class_0922);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_0948 ? true : super.lllIIIllIIIIlllIlIIllIIll(class_08972);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1521 class_15212, int n) {
        if (class_15212 instanceof class_1965) {
            class_1965 class_19653 = (class_1965)class_15212;
            if (this.IIIIIIIIlIllIIllIIlllIllI == 2 && class_19653.IIlllllIIlIIlIlIIlIIlIlII() == class_0529.IlIllllllIIlIIllllIIlIIIl) {
                int n2 = 20 + class_19652.IlllIIIlIIlIIIIllllIllllI().nextInt(10 * n);
                class_19653.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.lIlllIlllIIIIlIIlllIllIII.IlIlIIlllIllllllllIIIlIlI, n2, 3));
            }
        }
    }
}

