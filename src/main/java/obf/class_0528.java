package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class class_0528
extends class_1338 {
    private static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
    private static class_1749 lllIlIIlIIIlIlIIIllIlllIl = new class_1749("tmp", true, 45);
    private static int IlIllllllIIlIIllllIIlIIIl = class_0931.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll();
    private float lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private class_0598 IIIllIIlIIIIIIlIlIIllIIlI;
    private List IllIIlllllllIIlIIlIIIIlIl;
    private class_1291 IIlIIlIlIlIllIIlIlIIIIlll;
    private boolean llIIIlllIlllIlIllIIIIllIl;
    private class_1153 IIIIlIllIlIIlIIlIllIlIlll;

    public class_0528(class_0814 class_08142) {
        super(new class_0751(class_08142));
        class_08142.lIIIlIllllIlllIIIIIllIIIl = this.lIlllIlllIlIIIIlllIlIlIIl;
        this.IIlllIlIlllIllIIIlllIIlIl = true;
        this.lIIIIlIlIIlllllIIllIIlIII = 136;
        this.IllIIIllIIIIlIlIlIllIIlll = 195;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (!this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl()) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2085(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII));
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1291 class_12912, int n, int n2, int n3) {
        this.llIIIlllIlllIlIllIIIIllIl = true;
        boolean bl = n3 == 1;
        int n4 = n3 = n == -999 && n3 == 0 ? 4 : n3;
        if (class_12912 == null && IlIllllllIIlIIllllIIlIIIl != class_0931.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll() && n3 != 5) {
            class_0503 class_05032 = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI;
            if (class_05032.IllIIlllllllIIlIIlIIIIlIl() != null) {
                if (n2 == 0) {
                    this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_05032.IllIIlllllllIIlIIlIIIIlIl(), true);
                    this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_05032.IllIIlllllllIIlIIlIIIIlIl());
                    class_05032.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
                }
                if (n2 == 1) {
                    ItemStack class_08972 = class_05032.IllIIlllllllIIlIIlIIIIlIl().lllIIIllIIIIlllIlIIllIIll(1);
                    this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_08972, true);
                    this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_08972);
                    if (class_05032.IllIIlllllllIIlIIlIIIIlIl().lllIlIIlIIIlIlIIIllIlllIl == 0) {
                        class_05032.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
                    }
                }
            }
        } else if (class_12912 == this.IIlIIlIlIlIllIIlIlIIIIlll && bl) {
            for (int i = 0; i < this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl().size(); ++i) {
                this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll((ItemStack)null, i);
            }
        } else if (IlIllllllIIlIIllllIIlIIIl == class_0931.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll()) {
            if (class_12912 == this.IIlIIlIlIlIllIIlIlIIIIlll) {
                this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
            } else if (n3 == 4 && class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
                ItemStack class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll(n2 == 0 ? 1 : class_12912.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII());
                this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_08973, true);
                this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_08973);
            } else if (n3 == 4 && this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl() != null) {
                this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl(), true);
                this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl());
                this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
            } else {
                this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_12912 == null ? n : class_1325.lllIIIllIIIIlllIlIIllIIll((class_1325)((class_1325)class_12912)).IIIllIIlIIIIIIlIlIIllIIlI, n2, n3, (class_0814)this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
                this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl();
            }
        } else if (n3 != 5 && class_12912.lIllllIIlIIIlIllllllIIIll == lllIlIIlIIIlIlIIIllIlllIl) {
            class_0503 class_05033 = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI;
            ItemStack class_08974 = class_05033.IllIIlllllllIIlIIlIIIIlIl();
            ItemStack class_08975 = class_12912.lllIIIllIIIIlllIlIIllIIll();
            if (n3 == 2) {
                if (class_08975 != null && n2 >= 0 && n2 < 9) {
                    ItemStack class_08976 = class_08975.llIIlllIllIllllIIIlIIIIII();
                    class_08976.lllIlIIlIIIlIlIIIllIlllIl = class_08976.lIlllIlllIIIIlIIlllIllIII();
                    this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(n2, class_08976);
                    this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIlllIIIIIIlIIllIIllIlll.IlIllllllIIlIIllllIIlIIIl();
                }
                return;
            }
            if (n3 == 3) {
                if (class_05033.IllIIlllllllIIlIIlIIIIlIl() == null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
                    ItemStack class_08977 = class_12912.lllIIIllIIIIlllIlIIllIIll().llIIlllIllIllllIIIlIIIIII();
                    class_08977.lllIlIIlIIIlIlIIIllIlllIl = class_08977.lIlllIlllIIIIlIIlllIllIII();
                    class_05033.lllIlIIlIIIlIlIIIllIlllIl(class_08977);
                }
                return;
            }
            if (n3 == 4) {
                if (class_08975 != null) {
                    ItemStack class_08978 = class_08975.llIIlllIllIllllIIIlIIIIII();
                    class_08978.lllIlIIlIIIlIlIIIllIlllIl = n2 == 0 ? 1 : class_08978.lIlllIlllIIIIlIIlllIllIII();
                    this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(class_08978, true);
                    this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_08978);
                }
                return;
            }
            if (class_08974 != null && class_08975 != null && class_08974.lllIIIllIIIIlllIlIIllIIll(class_08975)) {
                if (n2 == 0) {
                    if (bl) {
                        class_08974.lllIlIIlIIIlIlIIIllIlllIl = class_08974.lIlllIlllIIIIlIIlllIllIII();
                    } else if (class_08974.lllIlIIlIIIlIlIIIllIlllIl < class_08974.lIlllIlllIIIIlIIlllIllIII()) {
                        ++class_08974.lllIlIIlIIIlIlIIIllIlllIl;
                    }
                } else if (class_08974.lllIlIIlIIIlIlIIIllIlllIl <= 1) {
                    class_05033.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
                } else {
                    --class_08974.lllIlIIlIIIlIlIIIllIlllIl;
                }
            } else if (class_08975 != null && class_08974 == null) {
                class_05033.lllIlIIlIIIlIlIIIllIlllIl(ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_08975));
                class_08974 = class_05033.IllIIlllllllIIlIIlIIIIlIl();
                if (bl) {
                    class_08974.lllIlIIlIIIlIlIIIllIlllIl = class_08974.lIlllIlllIIIIlIIlllIllIII();
                }
            } else {
                class_05033.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
            }
        } else {
            this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(class_12912 == null ? n : class_12912.IIIllIIlIIIIIIlIlIIllIIlI, n2, n3, (class_0814)this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
            if (class_1071.IlIllllllIIlIIllllIIlIIIl(n2) == 2) {
                for (int i = 0; i < 9; ++i) {
                    this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(45 + i).lllIIIllIIIIlllIlIIllIIll(), 36 + i);
                }
            } else if (class_12912 != null) {
                ItemStack class_08979 = this.lIlllIlllIlIIIIlllIlIlIIl.lllIIIllIIIIlllIlIIllIIll(class_12912.IIIllIIlIIIIIIlIlIIllIIlI).lllIIIllIIIIlllIlIIllIIll();
                this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(class_08979, class_12912.IIIllIIlIIIIIIlIlIIllIIlI - this.lIlllIlllIlIIIIlllIlIlIIl.IlIllllllIIlIIllllIIlIIIl.size() + 9 + 36);
            }
        }
    }

    @Override
    public void n_() {
        if (this.lllllIlllIIllIlIIlIIIllII.lIllllIIlIIIlIllllllIIIll.IllIIlllllllIIlIIlIIIIlIl()) {
            super.n_();
            this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
            Keyboard.enableRepeatEvents((boolean)true);
            this.IIIllIIlIIIIIIlIlIIllIIlI = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll + 82, this.llIIlIlIlllIIllIlIlllIllI + 6, 89, this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll(15);
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(false);
            this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(false);
            this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI(0xFFFFFF);
            int n = IlIllllllIIlIIllllIIlIIIl;
            IlIllllllIIlIIllllIIlIIIl = -1;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_0931.lllIIIllIIIIlllIlIIllIIll[n]);
            this.IIIIlIllIlIIlIIlIllIlIlll = new class_1153(this.lllllIlllIIllIlIIlIIIllII);
            this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll);
        } else {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_2085(this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII));
        }
    }

    @Override
    public void o_() {
        super.o_();
        if (this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII != null && this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIIlIIIllllllIIIIlIlIlI != null) {
            this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll);
        }
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (IlIllllllIIlIIllllIIlIIIl != class_0931.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll()) {
            if (GameSettings.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII.gameSettings.IlIlIIllIlIlIIIIIlIlllllI)) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_0931.IIIllIIlIIIIIIlIlIIllIIlI);
            } else {
                super.lllIIIllIIIIlllIlIIllIIll(c, n);
            }
        } else {
            if (this.llIIIlllIlllIlIllIIIIllIl) {
                this.llIIIlllIlllIlIllIIIIllIl = false;
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("");
            }
            if (!this.lllIIIllIIIIlllIlIIllIIll(n)) {
                if (this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(c, n)) {
                    this.IllIIlllllllIIlIIlIIIIlIl();
                } else {
                    super.lllIIIllIIIIlllIlIIllIIll(c, n);
                }
            }
        }
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        class_0751 class_07512 = (class_0751)this.lIlllIlllIlIIIIlllIlIlIIl;
        class_07512.lllIIIllIIIIlllIlIIllIIll.clear();
        for (Object object : Item.lllIIIllIIIIlllIlIIllIIll) {
            if (object == null || ((Item)object).lllllIlllIIllIlIIlIIIllII() == null) continue;
            ((Item)object).lllIIIllIIIIlllIlIIllIIll((Item)object, (class_0931)null, class_07512.lllIIIllIIIIlllIlIIllIIll);
        }
        for (class_1469 object : class_1469.lllIIIllIIIIlllIlIIllIIll) {
            if (object == null || object.llIIlIlIlllIIllIlIlllIllI == null) continue;
            Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(object, class_07512.lllIIIllIIIIlllIlIIllIIll);
        }
        Iterator iterator = class_07512.lllIIIllIIIIlllIlIIllIIll.iterator();
        String string = this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl().toLowerCase();
        while (iterator.hasNext()) {
            ItemStack class_08972 = (ItemStack)iterator.next();
            boolean bl = false;
            for (String string2 : class_08972.lllIIIllIIIIlllIlIIllIIll((class_0814)this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII, this.lllllIlllIIllIlIIlIIIllII.gameSettings.lIIllllIllIlllllIIllIllIl)) {
                if (!string2.toLowerCase().contains(string)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            iterator.remove();
        }
        this.lIlllIlllIIIIlIIlllIllIII = 0.0f;
        class_07512.lllIIIllIIIIlllIlIIllIIll(0.0f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        class_0931 class_09312 = class_0931.lllIIIllIIIIlllIlIIllIIll[IlIllllllIIlIIllllIIlIIIl];
        if (class_09312.IllIIlllllllIIlIIlIIIIlIl()) {
            GL11.glDisable((int)3042);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll(class_09312.IlIllllllIIlIIllllIIlIIIl(), new Object[0]), 8, 6, 0x404040);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (n3 == 0) {
            int n4 = n - this.IlIIlllllIIlIlIlllllIllll;
            int n5 = n2 - this.llIIlIlIlllIIllIlIlllIllI;
            for (class_0931 class_09312 : class_0931.lllIIIllIIIIlllIlIIllIIll) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_09312, n4, n5)) continue;
                return;
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        if (n3 == 0) {
            int n4 = n - this.IlIIlllllIIlIlIlllllIllll;
            int n5 = n2 - this.llIIlIlIlllIIllIlIlllIllI;
            for (class_0931 class_09312 : class_0931.lllIIIllIIIIlllIlIIllIIll) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_09312, n4, n5)) continue;
                this.lllIlIIlIIIlIlIIIllIlllIl(class_09312);
                return;
            }
        }
        super.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }

    private boolean IIIllIllIIlIlIlIlIllllIIl() {
        return IlIllllllIIlIIllllIIlIIIl != class_0931.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll() && class_0931.lllIIIllIIIIlllIlIIllIIll[IlIllllllIIlIIllllIIlIIIl].IllIIIllIIIIlIlIlIllIIlll() && ((class_0751)this.lIlllIlllIlIIIIlllIlIlIIl).lllIIIllIIIIlllIlIIllIIll();
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_0931 class_09312) {
        int n = IlIllllllIIlIIllllIIlIIIl;
        IlIllllllIIlIIllllIIlIIIl = class_09312.lllIIIllIIIIlllIlIIllIIll();
        class_0751 class_07512 = (class_0751)this.lIlllIlllIlIIIIlllIlIlIIl;
        this.IllIIIIllIIllIllIlllIlIIl.clear();
        class_07512.lllIIIllIIIIlllIlIIllIIll.clear();
        class_09312.lllIIIllIIIIlllIlIIllIIll(class_07512.lllIIIllIIIIlllIlIIllIIll);
        if (class_09312 == class_0931.llIIllIllIlIIlIIllIllllll) {
            class_1071 class_10712 = this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIlllIIIIIIlIIllIIllIlll;
            if (this.IllIIlllllllIIlIIlIIIIlIl == null) {
                this.IllIIlllllllIIlIIlIIIIlIl = class_07512.IlIllllllIIlIIllllIIlIIIl;
            }
            class_07512.IlIllllllIIlIIllllIIlIIIl = new ArrayList();
            for (int i = 0; i < class_10712.IlIllllllIIlIIllllIIlIIIl.size(); ++i) {
                int n2;
                int n3;
                int n4;
                class_1325 class_13252 = new class_1325(this, (class_1291)class_10712.IlIllllllIIlIIllllIIlIIIl.get(i), i);
                class_07512.IlIllllllIIlIIllllIIlIIIl.add(class_13252);
                if (i >= 5 && i < 9) {
                    n4 = i - 5;
                    n3 = n4 / 2;
                    n2 = n4 % 2;
                    class_13252.IllIIlllllllIIlIIlIIIIlIl = 9 + n3 * 54;
                    class_13252.IIIllIllIIlIlIlIlIllllIIl = 6 + n2 * 27;
                    continue;
                }
                if (i >= 0 && i < 5) {
                    class_13252.IIIllIllIIlIlIlIlIllllIIl = -2000;
                    class_13252.IllIIlllllllIIlIIlIIIIlIl = -2000;
                    continue;
                }
                if (i >= class_10712.IlIllllllIIlIIllllIIlIIIl.size()) continue;
                n4 = i - 9;
                n3 = n4 % 9;
                n2 = n4 / 9;
                class_13252.IllIIlllllllIIlIIlIIIIlIl = 9 + n3 * 18;
                class_13252.IIIllIllIIlIlIlIlIllllIIl = i >= 36 ? 112 : 54 + n2 * 18;
            }
            this.IIlIIlIlIlIllIIlIlIIIIlll = new class_1291(lllIlIIlIIIlIlIIIllIlllIl, 0, 173, 112);
            class_07512.IlIllllllIIlIIllllIIlIIIl.add(this.IIlIIlIlIlIllIIlIlIIIIlll);
        } else if (n == class_0931.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll()) {
            class_07512.IlIllllllIIlIIllllIIlIIIl = this.IllIIlllllllIIlIIlIIIIlIl;
            this.IllIIlllllllIIlIIlIIIIlIl = null;
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI != null) {
            if (class_09312 == class_0931.IIIllIIlIIIIIIlIlIIllIIlI) {
                this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(true);
                this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(false);
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(true);
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll("");
                this.IllIIlllllllIIlIIlIIIIlIl();
            } else {
                this.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(false);
                this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(true);
                this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(false);
            }
        }
        this.lIlllIlllIIIIlIIlllIllIII = 0.0f;
        class_07512.lllIIIllIIIIlllIlIIllIIll(0.0f);
    }

    @Override
    public void a_() {
        super.a_();
        int n = Mouse.getEventDWheel();
        if (n != 0 && this.IIIllIllIIlIlIlIlIllllIIl()) {
            int n2 = ((class_0751)this.lIlllIlllIlIIIIlllIlIlIIl).lllIIIllIIIIlllIlIIllIIll.size() / 9 - 5 + 1;
            if (n > 0) {
                n = 1;
            }
            if (n < 0) {
                n = -1;
            }
            this.lIlllIlllIIIIlIIlllIllIII = (float)((double)this.lIlllIlllIIIIlIIlllIllIII - (double)n / (double)n2);
            if (this.lIlllIlllIIIIlIIlllIllIII < 0.0f) {
                this.lIlllIlllIIIIlIIlllIllIII = 0.0f;
            }
            if (this.lIlllIlllIIIIlIIlllIllIII > 1.0f) {
                this.lIlllIlllIIIIlIIlllIllIII = 1.0f;
            }
            ((class_0751)this.lIlllIlllIlIIIIlllIlIlIIl).lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        boolean bl = Mouse.isButtonDown((int)0);
        int n3 = this.IlIIlllllIIlIlIlllllIllll;
        int n4 = this.llIIlIlIlllIIllIlIlllIllI;
        int n5 = n3 + 175;
        int n6 = n4 + 18;
        int n7 = n5 + 14;
        int n8 = n6 + 112;
        if (!this.lIllllIIlIIIlIllllllIIIll && bl && n >= n5 && n2 >= n6 && n < n7 && n2 < n8) {
            this.IlIIIIIllllllIIlllIllllll = this.IIIllIllIIlIlIlIlIllllIIl();
        }
        if (!bl) {
            this.IlIIIIIllllllIIlllIllllll = false;
        }
        this.lIllllIIlIIIlIllllllIIIll = bl;
        if (this.IlIIIIIllllllIIlllIllllll) {
            this.lIlllIlllIIIIlIIlllIllIII = ((float)(n2 - n6) - 7.5f) / ((float)(n8 - n6) - 15.0f);
            if (this.lIlllIlllIIIIlIIlllIllIII < 0.0f) {
                this.lIlllIlllIIIIlIIlllIllIII = 0.0f;
            }
            if (this.lIlllIlllIIIIlIIlllIllIII > 1.0f) {
                this.lIlllIlllIIIIlIIlllIllIII = 1.0f;
            }
            ((class_0751)this.lIlllIlllIlIIIIlllIlIlIIl).lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
        }
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        for (class_0931 class_09312 : class_0931.lllIIIllIIIIlllIlIIllIIll) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl(class_09312, n, n2)) break;
        }
        if (this.IIlIIlIlIlIllIIlIlIIIIlll != null && IlIllllllIIlIIllllIIlIIIl == class_0931.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll() && this.lllIlIIlIIIlIlIIIllIlllIl(this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIlllllllIIlIIlIIIIlIl, this.IIlIIlIlIlIllIIlIlIIIIlll.IIIllIllIIlIlIlIlIllllIIl, 16, 16, n, n2)) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll("inventory.binSlot", new Object[0]), n, n2);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n, int n2) {
        if (IlIllllllIIlIIllllIIlIIIl == class_0931.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll()) {
            Map map;
            List list = class_08972.lllIIIllIIIIlllIlIIllIIll((class_0814)this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII, this.lllllIlllIIllIlIIlIIIllII.gameSettings.lIIllllIllIlllllIIllIllIl);
            class_0931 class_09312 = class_08972.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII();
            if (class_09312 == null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIllIlIlIIIIlIlIIlIlIlllI && (map = class_1250.lllIIIllIIIIlllIlIIllIIll(class_08972)).size() == 1) {
                class_1469 class_14692 = class_1469.lllIIIllIIIIlllIlIIllIIll[(Integer)map.keySet().iterator().next()];
                for (class_0931 class_09313 : class_0931.lllIIIllIIIIlllIlIIllIIll) {
                    if (!class_09313.lllIIIllIIIIlllIlIIllIIll(class_14692.llIIlIlIlllIIllIlIlllIllI)) continue;
                    class_09312 = class_09313;
                    break;
                }
            }
            if (class_09312 != null) {
                list.add(1, "" + (Object)((Object) EnumChatFormatting.BOLD) + (Object)((Object) EnumChatFormatting.BLUE) + class_0616.lllIIIllIIIIlllIlIIllIIll(class_09312.IlIllllllIIlIIllllIIlIIIl(), new Object[0]));
            }
            for (int i = 0; i < list.size(); ++i) {
                if (i == 0) {
                    list.set(i, (Object)((Object)class_08972.lIlIllIIlIIlIIlIIlIIlIIll().rarityColor) + (String)list.get(i));
                    continue;
                }
                list.set(i, (Object)((Object) EnumChatFormatting.GRAY) + (String)list.get(i));
            }
            this.lllIIIllIIIIlllIlIIllIIll(list, n, n2);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_08972, n, n2);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_0624.IlIllllllIIlIIllllIIlIIIl();
        class_0931 class_09312 = class_0931.lllIIIllIIIIlllIlIIllIIll[IlIllllllIIlIIllllIIlIIIl];
        for (class_0931 class_09313 : class_0931.lllIIIllIIIIlllIlIIllIIll) {
            this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
            if (class_09313.lllIIIllIIIIlllIlIIllIIll() == IlIllllllIIlIIllllIIlIIIl) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_09313);
        }
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("textures/gui/container/creative_inventory/tab_" + class_09312.IIIllIIlIIIIIIlIlIIllIIlI()));
        class_0528.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, 0, 0, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII);
        this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        int n3 = this.IlIIlllllIIlIlIlllllIllll + 175;
        int n4 = this.llIIlIlIlllIIllIlIlllIllI + 18;
        int n5 = n4 + 112;
        this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        if (class_09312.IllIIIllIIIIlIlIlIllIIlll()) {
            class_0528.lllIIIllIIIIlllIlIIllIIll(n3, n4 + (int)((float)(n5 - n4 - 17) * this.lIlllIlllIIIIlIIlllIllIII), 232 + (this.IIIllIllIIlIlIlIlIllllIIl() ? 0 : 12), 0, 12, 15);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_09312);
        if (class_09312 == class_0931.llIIllIllIlIIlIIllIllllll) {
            class_2085.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + 43, this.llIIlIlIlllIIllIlIlllIllI + 45, 20, (float)(this.IlIIlllllIIlIlIlllllIllll + 43 - n), (float)(this.llIIlIlIlllIIllIlIlllIllI + 45 - 30 - n2), this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII);
        }
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_0931 class_09312, int n, int n2) {
        int n3 = class_09312.llIIlllIllIllllIIIlIIIIII();
        int n4 = 28 * n3;
        int n5 = 0;
        if (n3 == 5) {
            n4 = this.IllIIIllIIIIlIlIlIllIIlll - 28 + 2;
        } else if (n3 > 0) {
            n4 += n3;
        }
        int n6 = class_09312.llIIllIllIlIIlIIllIllllll() ? n5 - 32 : n5 + this.lIIIIlIlIIlllllIIllIIlIII;
        return n >= n4 && n <= n4 + 28 && n2 >= n6 && n2 <= n6 + 32;
    }

    protected boolean lllIlIIlIIIlIlIIIllIlllIl(class_0931 class_09312, int n, int n2) {
        int n3 = class_09312.llIIlllIllIllllIIIlIIIIII();
        int n4 = 28 * n3;
        int n5 = 0;
        if (n3 == 5) {
            n4 = this.IllIIIllIIIIlIlIlIllIIlll - 28 + 2;
        } else if (n3 > 0) {
            n4 += n3;
        }
        int n6 = class_09312.llIIllIllIlIIlIIllIllllll() ? n5 - 32 : n5 + this.lIIIIlIlIIlllllIIllIIlIII;
        if (this.lllIlIIlIIIlIlIIIllIlllIl(n4 + 3, n6 + 3, 23, 27, n, n2)) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_0616.lllIIIllIIIIlllIlIIllIIll(class_09312.IlIllllllIIlIIllllIIlIIIl(), new Object[0]), n, n2);
            return true;
        }
        return false;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0931 class_09312) {
        boolean bl = class_09312.lllIIIllIIIIlllIlIIllIIll() == IlIllllllIIlIIllllIIlIIIl;
        boolean bl2 = class_09312.llIIllIllIlIIlIIllIllllll();
        int n = class_09312.llIIlllIllIllllIIIlIIIIII();
        int n2 = n * 28;
        int n3 = 0;
        int n4 = this.IlIIlllllIIlIlIlllllIllll + 28 * n;
        int n5 = this.llIIlIlIlllIIllIlIlllIllI;
        int n6 = 32;
        if (bl) {
            n3 += 32;
        }
        if (n == 5) {
            n4 = this.IlIIlllllIIlIlIlllllIllll + this.IllIIIllIIIIlIlIlIllIIlll - 28;
        } else if (n > 0) {
            n4 += n;
        }
        if (bl2) {
            n5 -= 28;
        } else {
            n3 += 64;
            n5 += this.lIIIIlIlIIlllllIIllIIlIII - 4;
        }
        GL11.glDisable((int)2896);
        class_0528.lllIIIllIIIIlllIlIIllIIll(n4, n5, n2, n3, 28, n6);
        IlIlllIIIIIIlIIllIIllIlll = 100.0f;
        class_0528.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 100.0f;
        int n7 = bl2 ? 1 : -1;
        GL11.glEnable((int)2896);
        GL11.glEnable((int)32826);
        ItemStack class_08972 = class_09312.lIlllIlllIIIIlIIlllIllIII();
        IlIlIIlIlIllIIlIlIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n4 += 6, n5 += 8 + n7);
        IlIlIIlIlIllIIlIlIIllIIIl.IlIllllllIIlIIllllIIlIIIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lllllIlllIIllIlIIlIIIllII.llIIlIIllIIllIlIIllIIllII(), class_08972, n4, n5);
        GL11.glDisable((int)2896);
        class_0528.IlIlIIlIlIllIIlIlIIllIIIl.lIllllIIlIIIlIllllllIIIll = 0.0f;
        IlIlllIIIIIIlIIllIIllIlll = 0.0f;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0699(this, this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll()));
        }
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(new class_0342(this, this.lllllIlllIIllIlIIlIIIllII.lIIIIlIlIIlllllIIllIIlIII.IlIIlllllIIlIlIlllllIllll()));
        }
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return IlIllllllIIlIIllllIIlIIIl;
    }

    static /* synthetic */ class_1749 IIIllIIlIIIIIIlIlIIllIIlI() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }
}

