package obf;

import net.minecraft.network.play.client.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0376 {
    private final Minecraft lllIIIllIIIIlllIlIIllIIll;
    private final class_1764 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl = -1;
    private int lIlllIlllIIIIlIIlllIllIII = -1;
    private int IlIIIIIllllllIIlllIllllll = -1;
    private ItemStack lIllllIIlIIIlIllllllIIIll;
    private float IIIllIIlIIIIIIlIlIIllIIlI;
    private float IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private class_2243 lIIIIlIlIIlllllIIllIIlIII = class_2243.lllIlIIlIIIlIlIIIllIlllIl;
    private int llIIlllIllIllllIIIlIIIIII;

    public class_0376(Minecraft class_06672, class_1764 class_17642) {
        this.lllIIIllIIIIlllIlIIllIIll = class_06672;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_17642;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, class_0376 class_03762, int n, int n2, int n3, int n4) {
        if (!class_06672.theWorld.lllIIIllIIIIlllIlIIllIIll(class_06672.lIIIIlIlIIlllllIIllIIlIII, n, n2, n3, n4)) {
            class_03762.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_08142.lIIlIlIlIlIllIIlIIllllIll);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_22432;
        this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIlIlIlIlIllIIlIIllllIll);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        class_08142.IIIIlIllIlIIlIIlIllIlIlll = -180.0f;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII.IlIIIIIllllllIIlllIllllll();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        ItemStack class_08972;
        if (this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl() && !this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
            return false;
        }
        if (this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII() && this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIIIlIlIlIIIlIIllIIlIlIl() != null && this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIIIlIlIlIIIlIIllIIlIlIl().lllIIIllIIIIlllIlIIllIIll() instanceof class_1531) {
            return false;
        }
        class_0564 class_05642 = this.lllIIIllIIIIlllIlIIllIIll.theWorld;
        Block class_05492 = class_05642.a_(n, n2, n3);
        if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            return false;
        }
        class_05642.IlIllllllIIlIIllllIIlIIIl(2001, n, n2, n3, Block.lllIIIllIIIIlllIlIIllIIll(class_05492) + (class_05642.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) << 12));
        int n5 = class_05642.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl = class_05642.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        if (bl) {
            class_05492.lllIIIllIIIIlllIlIIllIIll((class_1334)class_05642, n, n2, n3, n5);
        }
        this.lIlllIlllIIIIlIIlllIllIII = -1;
        if (!this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII() && (class_08972 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.IllIlIlIIIlIllIlIlIIlllII()) != null) {
            class_08972.lllIIIllIIIIlllIlIIllIIll(class_05642, class_05492, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII);
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIIllIlIlIlIIIllIlIlIllI();
            }
        }
        return bl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        if (!this.lIIIIlIlIIlllllIIllIIlIII.IlIllllllIIlIIllllIIlIIIl() || this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
            if (this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII()) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C07PacketPlayerDigging(0, n, n2, n3, n4));
                class_0376.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this, n, n2, n3, n4);
                this.IIIllIllIIlIlIlIlIllllIIl = 5;
            } else if (!this.IllIIIllIIIIlIlIlIllIIlll || !this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3)) {
                boolean bl;
                if (this.IllIIIllIIIIlIlIlIllIIlll) {
                    this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C07PacketPlayerDigging(1, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, n4));
                }
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C07PacketPlayerDigging(0, n, n2, n3, n4));
                Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.theWorld.a_(n, n2, n3);
                boolean bl2 = bl = class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll;
                if (bl && this.IIIllIIlIIIIIIlIlIIllIIlI == 0.0f) {
                    class_05492.lllIIIllIIIIlllIlIIllIIll((class_1334)this.lllIIIllIIIIlllIlIIllIIll.theWorld, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII);
                }
                if (bl && class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII, this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3) >= 1.0f) {
                    this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
                } else {
                    this.IllIIIllIIIIlIlIlIllIIlll = true;
                    this.IlIllllllIIlIIllllIIlIIIl = n;
                    this.lIlllIlllIIIIlIIlllIllIII = n2;
                    this.IlIIIIIllllllIIlllIllllll = n3;
                    this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIIIlIlIlIIIlIIllIIlIlIl();
                    this.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
                    this.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
                    this.lllIIIllIIIIlllIlIIllIIll.theWorld.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI(), this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, (int)(this.IIIllIIlIIIIIIlIlIIllIIlI * 10.0f) - 1);
                }
            }
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C07PacketPlayerDigging(1, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, -1));
        }
        this.IllIIIllIIIIlIlIlIllIIlll = false;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        this.lllIIIllIIIIlllIlIIllIIll.theWorld.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI(), this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, -1);
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, int n4) {
        this.lIIIIlIlIIlllllIIllIIlIII();
        if (this.IIIllIllIIlIlIlIlIllllIIl > 0) {
            --this.IIIllIllIIlIlIlIlIllllIIl;
        } else if (this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII()) {
            this.IIIllIllIIlIlIlIlIllllIIl = 5;
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C07PacketPlayerDigging(0, n, n2, n3, n4));
            class_0376.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this, n, n2, n3, n4);
        } else if (this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3)) {
            Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.theWorld.a_(n, n2, n3);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                this.IllIIIllIIIIlIlIlIllIIlll = false;
                return;
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI += class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII, this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3);
            if (this.IllIIlllllllIIlIIlIIIIlIl % 4.0f == 0.0f) {
                this.lllIIIllIIIIlllIlIIllIIll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(new class_0132(new ResourceLocation(class_05492.llIIIlllIlllIlIllIIIIllIl.IlIIIIIllllllIIlllIllllll()), (class_05492.llIIIlllIlllIlIllIIIIllIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f) / 8.0f, class_05492.llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() * 0.5f, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f));
            }
            this.IllIIlllllllIIlIIlIIIIlIl += 1.0f;
            if (this.IIIllIIlIIIIIIlIlIIllIIlI >= 1.0f) {
                this.IllIIIllIIIIlIlIlIllIIlll = false;
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C07PacketPlayerDigging(2, n, n2, n3, n4));
                this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
                this.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
                this.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
                this.IIIllIllIIlIlIlIlIllllIIl = 5;
            }
            this.lllIIIllIIIIlllIlIIllIIll.theWorld.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.llllllIlIllllIlIlIlIIIIlI(), this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, (int)(this.IIIllIIlIIIIIIlIlIIllIIlI * 10.0f) - 1);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3, n4);
        }
    }

    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII() ? 5.0f : 4.5f;
    }

    public void IlIIIIIllllllIIlllIllllll() {
        this.lIIIIlIlIIlllllIIllIIlIII();
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl().lIlllIlllIIIIlIIlllIllIII()) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl().lllIIIllIIIIlllIlIIllIIll();
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl().lIllllIIlIIIlIllllllIIIll() != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl().IlIIIIIllllllIIlllIllllll().onDisconnect(this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl().lIllllIIlIIIlIllllllIIIll());
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl().IlIIIIIllllllIIlllIllllll().onDisconnect(new class_0722("Disconnected from server"));
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        boolean bl;
        ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIIIIlIlIlIIIlIIllIIlIlIl();
        boolean bl2 = bl = this.lIllllIIlIIIlIllllllIIIll == null && class_08972 == null;
        if (this.lIllllIIlIIIlIllllllIIIll != null && class_08972 != null) {
            bl = class_08972.lllIIIllIIIIlllIlIIllIIll() == this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll() && ItemStack.lllIIIllIIIIlllIlIIllIIll(class_08972, this.lIllllIIlIIIlIllllllIIIll) && (class_08972.lIllllIIlIIIlIllllllIIIll() || class_08972.IllIIIllIIIIlIlIlIllIIlll() == this.lIllllIIlIIIlIllllllIIIll.IllIIIllIIIIlIlIlIllIIlll());
        }
        return n == this.IlIllllllIIlIIllllIIlIIIl && n2 == this.lIlllIlllIIIIlIIlllIllIII && n3 == this.IlIIIIIllllllIIlllIllllll && bl;
    }

    private void lIIIIlIlIIlllllIIllIIlIII() {
        int n = this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl;
        if (n != this.llIIlllIllIllllIIIlIIIIII) {
            this.llIIlllIllIllllIIIlIIIIII = n;
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C09PacketHeldItemChange(this.llIIlllIllIllllIIIlIIIIII));
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, ItemStack class_08972, int n, int n2, int n3, int n4, class_0864 class_08642) {
        class_1272 class_12722;
        this.lIIIIlIlIIlllllIIllIIlIII();
        float f = (float)class_08642.lllIIIllIIIIlllIlIIllIIll - (float)n;
        float f2 = (float)class_08642.lllIlIIlIIIlIlIIIllIlllIl - (float)n2;
        float f3 = (float)class_08642.IlIllllllIIlIIllllIIlIIIl - (float)n3;
        boolean bl = false;
        if ((!class_08142.IIlIIlIlIlIllIIlIlIIIIlll() || class_08142.lIIIIlIlIlIIIlIIllIIlIlIl() == null) && class_13342.a_(n, n2, n3).lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142, n4, f, f2, f3)) {
            bl = true;
        }
        if (!bl && class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1272 && !(class_12722 = (class_1272)class_08972.lllIIIllIIIIlllIlIIllIIll()).lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, class_08142, class_08972)) {
            return false;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C08PacketPlayerBlockPlacement(n, n2, n3, n4, class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(), f, f2, f3));
        if (bl) {
            return true;
        }
        if (class_08972 == null) {
            return false;
        }
        if (this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII()) {
            int n5 = class_08972.IllIIIllIIIIlIlIlIllIIlll();
            int n6 = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            boolean bl2 = class_08972.lllIIIllIIIIlllIlIIllIIll(class_08142, class_13342, n, n2, n3, n4, f, f2, f3);
            class_08972.lllIlIIlIIIlIlIIIllIlllIl(n5);
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = n6;
            return bl2;
        }
        return class_08972.lllIIIllIIIIlllIlIIllIIll(class_08142, class_13342, n, n2, n3, n4, f, f2, f3);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1334 class_13342, ItemStack class_08972) {
        this.lIIIIlIlIIlllllIIllIIlIII();
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C08PacketPlayerBlockPlacement(-1, -1, -1, 255, class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(), 0.0f, 0.0f, 0.0f));
        int n = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        ItemStack class_08973 = class_08972.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142);
        if (class_08973 == class_08972 && (class_08973 == null || class_08973.lllIlIIlIIIlIlIIIllIlllIl == n)) {
            return false;
        }
        class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = class_08973;
        if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = null;
        }
        return true;
    }

    public class_1389 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_1707 class_17072) {
        return new class_1389(this.lllIIIllIIIIlllIlIIllIIll, class_13342, this.lllIIIllIIIIlllIlIIllIIll.getSession(), this.lllIlIIlIIIlIlIIIllIlllIl, class_17072);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, class_1521 class_15212) {
        this.lIIIIlIlIIlllllIIllIIlIII();
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C02PacketUseEntity(class_15212, class_2158.lllIlIIlIIIlIlIIIllIlllIl));
        class_08142.lllllIlllIIllIlIIlIIIllII(class_15212);
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142, class_1521 class_15212) {
        this.lIIIIlIlIIlllllIIllIIlIII();
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C02PacketUseEntity(class_15212, class_2158.lllIIIllIIIIlllIlIIllIIll));
        return class_08142.IlIlIIlIlIllIIlIlIIllIIIl(class_15212);
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0814 class_08142) {
        short s = class_08142.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(class_08142.lllIIlIIIllllllIIIIlIlIlI);
        ItemStack class_08972 = class_08142.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(n2, n3, n4, class_08142);
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C0EPacketClickWindow(n, n2, n3, n4, class_08972, s));
        return class_08972;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C11PacketEnchantItem(n, n2));
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        if (this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII()) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C10PacketCreativeInventoryAction(n, class_08972));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        if (this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII() && class_08972 != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C10PacketCreativeInventoryAction(-1, class_08972));
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0814 class_08142) {
        this.lIIIIlIlIIlllllIIllIIlIII();
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new C07PacketPlayerDigging(5, 0, 0, 0, 255));
        class_08142.llIIIlIIllIIllIllIIlIlllI();
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIIIIlIlIIlllllIIllIIlIII.IlIIIIIllllllIIlllIllllll();
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return !this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII();
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII();
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII();
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.lIlIlIIllIIIlllIllIIlIllI() && this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1627;
    }
}

