package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.UUID;

public class class_0946
extends Item {
    private static final String[] IllIIIllIIIIlIlIlIllIIlll = new String[]{"skeleton", "wither", "zombie", "char", "creeper"};
    public static final String[] IIIllIllIIlIlIlIlIllllIIl = new String[]{"skeleton", "wither", "zombie", "steve", "creeper"};
    private IIcon[] lIIIIlIlIIlllllIIllIIlIII;

    public class_0946() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
        this.IlIIIIIllllllIIlllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 == 0) {
            return false;
        }
        if (!class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
            return false;
        }
        if (n4 == 1) {
            ++n2;
        }
        if (n4 == 2) {
            --n3;
        }
        if (n4 == 3) {
            ++n3;
        }
        if (n4 == 4) {
            --n;
        }
        if (n4 == 5) {
            ++n;
        }
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_1774 class_17742;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.llllIllIIIlIllIllllllIlIl, n4, 2);
            int n5 = 0;
            if (n4 == 1) {
                n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_08142.IIIIlIllIlIIlIIlIllIlIlll * 16.0f / 360.0f) + 0.5) & 0xF;
            }
            if ((class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) != null && class_17742 instanceof class_0090) {
                if (class_08972.IllIIIllIIIIlIlIlIllIIlll() == 3) {
                    GameProfile gameProfile = null;
                    if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                        class_0775 class_07752 = class_08972.lllllIlllIIllIlIIlIIIllII();
                        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SkullOwner", 10)) {
                            gameProfile = class_0860.lllIIIllIIIIlllIlIIllIIll(class_07752.llIIllIllIlIIlIIllIllllll("SkullOwner"));
                        } else if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SkullOwner", 8) && class_07752.IllIIIllIIIIlIlIlIllIIlll("SkullOwner").length() > 0) {
                            gameProfile = new GameProfile((UUID)null, class_07752.IllIIIllIIIIlIlIlIllIIlll("SkullOwner"));
                        }
                    }
                    ((class_0090)class_17742).lllIIIllIIIIlllIlIIllIIll(gameProfile);
                } else {
                    ((class_0090)class_17742).lllIIIllIIIIlllIlIIllIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll());
                }
                ((class_0090)class_17742).lllIlIIlIIIlIlIIIllIlllIl(n5);
                ((class_1710) Blocks.llllIllIIIlIllIllllllIlIl).lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, (class_0090)class_17742);
            }
            --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        if (n < 0 || n >= IllIIIllIIIIlIlIlIllIIlll.length) {
            n = 0;
        }
        return this.lIIIIlIlIIlllllIIllIIlIII[n];
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(int n) {
        return n;
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        int n = class_08972.IllIIIllIIIIlIlIlIllIIlll();
        if (n < 0 || n >= IllIIIllIIIIlIlIlIllIIlll.length) {
            n = 0;
        }
        return super.IllIIIllIIIIlIlIlIllIIlll() + "." + IllIIIllIIIIlIlIlIllIIlll[n];
    }

    @Override
    public String IIIllIllIIlIlIlIlIllllIIl(ItemStack class_08972) {
        if (class_08972.IllIIIllIIIIlIlIlIllIIlll() == 3 && class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
            if (class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl("SkullOwner", 10)) {
                return class_1586.lllIIIllIIIIlllIlIIllIIll("item.skull.player.name", class_0860.lllIIIllIIIIlllIlIIllIIll(class_08972.lllllIlllIIllIlIIlIIIllII().llIIllIllIlIIlIIllIllllll("SkullOwner")).getName());
            }
            if (class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl("SkullOwner", 8)) {
                return class_1586.lllIIIllIIIIlllIlIIllIIll("item.skull.player.name", class_08972.lllllIlllIIllIlIIlIIIllII().IllIIIllIIIIlIlIlIllIIlll("SkullOwner"));
            }
        }
        return super.IIIllIllIIlIlIlIlIllllIIl(class_08972);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.lIIIIlIlIIlllllIIllIIlIII = new IIcon[IIIllIllIIlIlIlIlIllllIIl.length];
        for (int i = 0; i < IIIllIllIIlIlIlIlIllllIIl.length; ++i) {
            this.lIIIIlIlIIlllllIIllIIlIII[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_" + IIIllIllIIlIlIlIlIllllIIl[i]);
        }
    }
}

