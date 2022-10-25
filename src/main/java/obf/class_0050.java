package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ChatComponentTranslation;

import java.util.Iterator;
import java.util.List;

public class class_0050
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "testforblock";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 2;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.testforblock.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        int n;
        int n2;
        int n3;
        if (arrstring.length >= 4) {
            int n4;
            Object object;
            Object object2;
            class_1334 class_13342;
            n3 = class_19692.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll;
            n2 = class_19692.lllIIlIIIllllllIIIIlIlIlI().lllIlIIlIIIlIlIIIllIlllIl;
            n = class_19692.lllIIlIIIllllllIIIIlIlIlI().IlIllllllIIlIIllllIIlIIIl;
            n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_0050.lllIIIllIIIIlllIlIIllIIll(class_19692, n3, arrstring[0]));
            n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_0050.lllIIIllIIIIlllIlIIllIIll(class_19692, n2, arrstring[1]));
            n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_0050.lllIIIllIIIIlllIlIIllIIll(class_19692, n, arrstring[2]));
            Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(arrstring[3]);
            if (class_05492 == null) {
                throw new class_1956("commands.setblock.notFound", arrstring[3]);
            }
            int n5 = -1;
            if (arrstring.length >= 5) {
                n5 = class_0050.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring[4], -1, 15);
            }
            if (!(class_13342 = class_19692.IIllIllIIllIIlllIIIlIlllI()).IlIIIIIllllllIIlllIllllll(n3, n2, n)) {
                throw new class_1953("commands.testforblock.outOfWorld", new Object[0]);
            }
            class_0775 class_07752 = new class_0775();
            boolean bl = false;
            if (arrstring.length >= 6 && class_05492.lllIIlIIIllllllIIIIlIlIlI()) {
                object2 = class_0050.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, 5).IlIllllllIIlIIllllIIlIIIl();
                try {
                    object = class_0605.lllIIIllIIIIlllIlIIllIIll((String)object2);
                    if (!(object instanceof class_0775)) {
                        throw new class_1953("commands.setblock.tagError", "Not a valid tag");
                    }
                    class_07752 = (class_0775)object;
                    bl = true;
                }
                catch (class_1323 class_13232) {
                    throw new class_1953("commands.setblock.tagError", class_13232.getMessage());
                }
            }
            if ((object2 = class_13342.a_(n3, n2, n)) != class_05492) {
                throw new class_1953("commands.testforblock.failed.tile", n3, n2, n, ((Block)object2).llIIlIlIlllIIllIlIlllIllI(), class_05492.llIIlIlIlllIIllIlIlllIllI());
            }
            if (n5 > -1 && (n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n3, n2, n)) != n5) {
                throw new class_1953("commands.testforblock.failed.data", n3, n2, n, n4, n5);
            }
            if (bl) {
                object = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n3, n2, n);
                if (object == null) {
                    throw new class_1953("commands.testforblock.failed.tileEntity", n3, n2, n);
                }
                class_0775 class_07753 = new class_0775();
                ((class_1774)object).lllIlIIlIIIlIlIIIllIlllIl(class_07753);
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_07752, class_07753)) {
                    throw new class_1953("commands.testforblock.failed.nbt", n3, n2, n);
                }
            }
        } else {
            throw new class_0932("commands.testforblock.usage", new Object[0]);
        }
        class_19692.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("commands.testforblock.success", n3, n2, n));
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_2037 class_20372, class_2037 class_20373) {
        if (class_20372 == class_20373) {
            return true;
        }
        if (class_20372 == null) {
            return true;
        }
        if (class_20373 == null) {
            return false;
        }
        if (!class_20372.getClass().equals(class_20373.getClass())) {
            return false;
        }
        if (class_20372 instanceof class_0775) {
            String string;
            class_2037 class_20374;
            class_0775 class_07752 = (class_0775)class_20372;
            class_0775 class_07753 = (class_0775)class_20373;
            Iterator iterator = class_07752.lIlllIlllIIIIlIIlllIllIII().iterator();
            do {
                if (iterator.hasNext()) continue;
                return true;
            } while (this.lllIIIllIIIIlllIlIIllIIll(class_20374 = class_07752.lllIIIllIIIIlllIlIIllIIll(string = (String)iterator.next()), class_07753.lllIIIllIIIIlllIlIIllIIll(string)));
            return false;
        }
        return class_20372.equals(class_20373);
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 4 ? class_0050.lllIIIllIIIIlllIlIIllIIll(arrstring, Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl()) : null;
    }
}

