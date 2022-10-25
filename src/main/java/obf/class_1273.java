package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_1273
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "setblock";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.setblock.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length >= 4) {
            Object object;
            class_1334 class_13342;
            int n = class_19692.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll;
            int n2 = class_19692.lllIIlIIIllllllIIIIlIlIlI().lllIlIIlIIIlIlIIIllIlllIl;
            int n3 = class_19692.lllIIlIIIllllllIIIIlIlIlI().IlIllllllIIlIIllllIIlIIIl;
            n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_1273.lllIIIllIIIIlllIlIIllIIll(class_19692, n, arrstring[0]));
            n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_1273.lllIIIllIIIIlllIlIIllIIll(class_19692, n2, arrstring[1]));
            n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_1273.lllIIIllIIIIlllIlIIllIIll(class_19692, n3, arrstring[2]));
            Block class_05492 = class_1246.IIIllIIlIIIIIIlIlIIllIIlI(class_19692, arrstring[3]);
            int n4 = 0;
            if (arrstring.length >= 5) {
                n4 = class_1273.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[4], 0, 15);
            }
            if (!(class_13342 = class_19692.IIllIllIIllIIlllIIIlIlllI()).IlIIIIIllllllIIlllIllllll(n, n2, n3)) {
                throw new class_1953("commands.setblock.outOfWorld", new Object[0]);
            }
            class_0775 class_07752 = new class_0775();
            boolean bl = false;
            if (arrstring.length >= 7 && class_05492.lllIIlIIIllllllIIIIlIlIlI()) {
                object = class_1273.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 6).IlIllllllIIlIIllllIIlIIIl();
                try {
                    class_2037 class_20372 = class_0605.lllIIIllIIIIlllIlIIllIIll((String)object);
                    if (!(class_20372 instanceof class_0775)) {
                        throw new class_1953("commands.setblock.tagError", "Not a valid tag");
                    }
                    class_07752 = (class_0775)class_20372;
                    bl = true;
                }
                catch (class_1323 class_13232) {
                    throw new class_1953("commands.setblock.tagError", class_13232.getMessage());
                }
            }
            if (arrstring.length >= 6) {
                if (arrstring[5].equals("destroy")) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, true);
                } else if (arrstring[5].equals("keep") && !class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
                    throw new class_1953("commands.setblock.noChange", new Object[0]);
                }
            }
            if (!class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_05492, n4, 3)) {
                throw new class_1953("commands.setblock.noChange", new Object[0]);
            }
            if (bl && (object = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) != null) {
                class_07752.lllIIIllIIIIlllIlIIllIIll("x", n);
                class_07752.lllIIIllIIIIlllIlIIllIIll("y", n2);
                class_07752.lllIIIllIIIIlllIlIIllIIll("z", n3);
                ((class_1774)object).lllIIIllIIIIlllIlIIllIIll(class_07752);
            }
        } else {
            throw new class_0932("commands.setblock.usage", new Object[0]);
        }
        class_1273.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.setblock.success", new Object[0]);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 4 ? class_1273.lllIIIllIIIIlllIlIIllIIll(arrstring, Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl()) : (arrstring.length == 6 ? class_1273.lllIIIllIIIIlllIlIIllIIll(arrstring, "replace", "destroy", "keep") : null);
    }
}

