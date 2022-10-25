package obf;

import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0379
extends class_0388 {
    private boolean IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;

    public class_0379(class_1334 class_13342) {
        super(class_13342);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        ++this.lIllllIIlIIIlIllllllIIIll;
        long l = this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll();
        long l2 = l / 24000L + 1L;
        if (!this.IlIllllllIIlIIllllIIlIIIl && this.lIllllIIlIIIlIllllllIIIll > 20) {
            this.IlIllllllIIlIIllllIIlIIIl = true;
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(5, 0.0f));
        }
        boolean bl = this.lIlllIlllIIIIlIIlllIllIII = l > 120500L;
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            ++this.IlIIIIIllllllIIlllIllllll;
        }
        if (l % 24000L == 500L) {
            if (l2 <= 6L) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("demo.day." + l2, new Object[0]));
            }
        } else if (l2 == 1L) {
            if (l == 100L) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(5, 101.0f));
            } else if (l == 175L) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(5, 102.0f));
            } else if (l == 250L) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new S2BPacketChangeGameState(5, 103.0f));
            }
        } else if (l2 == 5L && l % 24000L == 22000L) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("demo.day.warning", new Object[0]));
        }
    }

    private void lIlllIlllIIIIlIIlllIllIII() {
        if (this.IlIIIIIllllllIIlllIllllll > 100) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new ChatComponentTranslation("demo.reminder", new Object[0]));
            this.IlIIIIIllllllIIlllIllllll = 0;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (!this.lIlllIlllIIIIlIIlllIllIII) {
            super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        }
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        return this.lIlllIlllIIIIlIIlllIllIII ? false : super.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, ItemStack class_08972) {
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII();
            return false;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_08142, class_13342, class_08972);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, ItemStack class_08972, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII();
            return false;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_08142, class_13342, class_08972, n, n2, n3, n4, f, f2, f3);
    }
}

