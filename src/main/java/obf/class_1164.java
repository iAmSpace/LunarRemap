package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.lwjgl.input.Keyboard;

public class class_1164
extends class_0229 {
    private static class_1785 lllIIIllIIIIlllIlIIllIIll = new class_1785();
    private static final List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private final class_0076 IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll;
    private class_2008 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1197 IllIIlllllllIIlIIlIIIIlIl;
    private class_0598 IIIllIllIIlIlIlIlIllllIIl;

    public class_1164(class_0076 class_00762) {
        this.IlIllllllIIlIIllllIIlIIIl = class_00762;
    }

    @Override
    public void n_() {
        this.lIlIlIIlIIIIlIIIIIlllIIII.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.lIlllIlllIIIIlIIlllIllIII = class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.presets.title", new Object[0]);
        this.IlIIIIIllllllIIlllIllllll = class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.presets.share", new Object[0]);
        this.lIllllIIlIIIlIllllllIIIll = class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.presets.list", new Object[0]);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0598(this.lIlIllIIlIIlIIlIIlIIlIIll, 50, 40, this.IlIlIIlllIIlIllIIIlllllIl - 100, 20);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_2008(this);
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll(1230);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.lIllllIIlIIIlIllllllIIIll());
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1197(0, this.IlIlIIlllIIlIllIIIlllllIl / 2 - 155, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("createWorld.customize.presets.select", new Object[0]));
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(this.IllIIlllllllIIlIIlIIIIlIl);
        this.lIlIlIIlIIIIlIIIIIlllIIII.add(new class_1197(1, this.IlIlIIlllIIlIllIIIlllllIl / 2 + 5, this.lIIlIIIIIlIlllIlIIlIlIlll - 28, 150, 20, class_0616.lllIIIllIIIIlllIlIIllIIll("gui.cancel", new Object[0])));
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void o_() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(char c, int n) {
        if (!this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(c, n)) {
            super.lllIIIllIIIIlllIlIIllIIll(c, n);
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 0 && this.IIIllIllIIlIlIlIlIllllIIl()) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl());
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        } else if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 1) {
            this.lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        this.llIIlIllIllllIlIIIIlIIlll();
        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIlllIlllIIIIlIIlllIllIII, this.IlIlIIlllIIlIllIIIlllllIl / 2, 8, 0xFFFFFF);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIIIIllllllIIlllIllllll, 50, 30, 0xA0A0A0);
        this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIllllIIlIIIlIllllllIIIll, 50, 70, 0xA0A0A0);
        this.IIIllIllIIlIlIlIlIllllIIl.lIllllIIlIIIlIllllllIIIll();
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll();
        super.IlIllllllIIlIIllllIIlIIIl();
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        boolean bl;
        this.IllIIlllllllIIlIIlIIIIlIl.IllIIIllIIIIlIlIlIllIIlll = bl = this.IIIllIllIIlIlIlIlIllllIIl();
    }

    private boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll > -1 && this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll < lllIlIIlIIIlIlIIIllIlllIl.size() || this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl().length() > 1;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(String string, Item class_06112, class_0672 class_06722, class_1324 ... arrclass_1324) {
        class_1164.lllIIIllIIIIlllIlIIllIIll(string, class_06112, class_06722, (List)null, arrclass_1324);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(String string, Item class_06112, class_0672 class_06722, List list, class_1324 ... arrclass_1324) {
        class_0326 class_03262 = new class_0326();
        for (int i = arrclass_1324.length - 1; i >= 0; --i) {
            class_03262.IlIllllllIIlIIllllIIlIIIl().add(arrclass_1324[i]);
        }
        class_03262.lllIIIllIIIIlllIlIIllIIll(class_06722.lIlIllIIllIIIIlllIlIlllIl);
        class_03262.lIlllIlllIIIIlIIlllIllIII();
        if (list != null) {
            for (String string2 : list) {
                class_03262.lllIlIIlIIIlIlIIIllIlllIl().put(string2, new HashMap());
            }
        }
        lllIlIIlIIIlIlIIIllIlllIl.add(new class_0530(class_06112, string, class_03262.toString()));
    }

    static /* synthetic */ class_1785 IIIllIIlIIIIIIlIlIIllIIlI() {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    static /* synthetic */ List IllIIlllllllIIlIIlIIIIlIl() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ class_2008 lllIIIllIIIIlllIlIIllIIll(class_1164 class_11642) {
        return class_11642.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    static /* synthetic */ class_0598 lllIlIIlIIIlIlIIIllIlllIl(class_1164 class_11642) {
        return class_11642.IIIllIllIIlIlIlIlIllllIIl;
    }

    static {
        class_1164.lllIIIllIIIIlllIlIIllIIll("Classic Flat", Item.getItemFromBlock(Blocks.IlIllllllIIlIIllllIIlIIIl), class_0672.IlIlIIlIlIllIIlIlIIllIIIl, Arrays.asList("village"), new class_1324(1, Blocks.IlIllllllIIlIIllllIIlIIIl), new class_1324(2, Blocks.lIlllIlllIIIIlIIlllIllIII), new class_1324(1, Blocks.IllIIlllllllIIlIIlIIIIlIl));
        class_1164.lllIIIllIIIIlllIlIIllIIll("Tunnelers' Dream", Item.getItemFromBlock(Blocks.lllIlIIlIIIlIlIIIllIlllIl), class_0672.IlIlIIlllIIlIllIIIlllllIl, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new class_1324(1, Blocks.IlIllllllIIlIIllllIIlIIIl), new class_1324(5, Blocks.lIlllIlllIIIIlIIlllIllIII), new class_1324(230, Blocks.lllIlIIlIIIlIlIIIllIlllIl), new class_1324(1, Blocks.IllIIlllllllIIlIIlIIIIlIl));
        class_1164.lllIIIllIIIIlllIlIIllIIll("Water World", Item.getItemFromBlock(Blocks.IIIllIllIIlIlIlIlIllllIIl), class_0672.IlIlIIlIlIllIIlIlIIllIIIl, Arrays.asList("village", "biome_1"), new class_1324(90, Blocks.IllIIIllIIIIlIlIlIllIIlll), new class_1324(5, Blocks.llIIllIllIlIIlIIllIllllll), new class_1324(5, Blocks.lIlllIlllIIIIlIIlllIllIII), new class_1324(5, Blocks.lllIlIIlIIIlIlIIIllIlllIl), new class_1324(1, Blocks.IllIIlllllllIIlIIlIIIIlIl));
        class_1164.lllIIIllIIIIlllIlIIllIIll("Overworld", Item.getItemFromBlock(Blocks.IlIlIIlllIllllllllIIIlIlI), class_0672.IlIlIIlIlIllIIlIlIIllIIIl, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new class_1324(1, Blocks.IlIllllllIIlIIllllIIlIIIl), new class_1324(3, Blocks.lIlllIlllIIIIlIIlllIllIII), new class_1324(59, Blocks.lllIlIIlIIIlIlIIIllIlllIl), new class_1324(1, Blocks.IllIIlllllllIIlIIlIIIIlIl));
        class_1164.lllIIIllIIIIlllIlIIllIIll("Snowy Kingdom", Item.getItemFromBlock(Blocks.lIIllIIlIIIlllIlllIIlIIlI), class_0672.IlIIlllllIIlIlIlllllIllll, Arrays.asList("village", "biome_1"), new class_1324(1, Blocks.lIIllIIlIIIlllIlllIIlIIlI), new class_1324(1, Blocks.IlIllllllIIlIIllllIIlIIIl), new class_1324(3, Blocks.lIlllIlllIIIIlIIlllIllIII), new class_1324(59, Blocks.lllIlIIlIIIlIlIIIllIlllIl), new class_1324(1, Blocks.IllIIlllllllIIlIIlIIIIlIl));
        class_1164.lllIIIllIIIIlllIlIIllIIll("Bottomless Pit", Items.IIIIlIllIlIIlIIlIllIlIlll, class_0672.IlIlIIlIlIllIIlIlIIllIIIl, Arrays.asList("village", "biome_1"), new class_1324(1, Blocks.IlIllllllIIlIIllllIIlIIIl), new class_1324(3, Blocks.lIlllIlllIIIIlIIlllIllIII), new class_1324(2, Blocks.IlIIIIIllllllIIlllIllllll));
        class_1164.lllIIIllIIIIlllIlIIllIIll("Desert", Item.getItemFromBlock(Blocks.llIIllIllIlIIlIIllIllllll), class_0672.lllllIlllIIllIlIIlIIIllII, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new class_1324(8, Blocks.llIIllIllIlIIlIIllIllllll), new class_1324(52, Blocks.IlIIlllllIIlIlIlllllIllll), new class_1324(3, Blocks.lllIlIIlIIIlIlIIIllIlllIl), new class_1324(1, Blocks.IllIIlllllllIIlIIlIIIIlIl));
        class_1164.lllIIIllIIIIlllIlIIllIIll("Redstone Ready", Items.lIIIlIIllIllIIlIIlIIIllII, class_0672.lllllIlllIIllIlIIlIIIllII, new class_1324(52, Blocks.IlIIlllllIIlIlIlllllIllll), new class_1324(3, Blocks.lllIlIIlIIIlIlIIIllIlllIl), new class_1324(1, Blocks.IllIIlllllllIIlIIlIIIIlIl));
    }
}

