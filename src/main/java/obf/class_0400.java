package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class_0400 {
    private static final class_0400 lllIIIllIIIIlllIlIIllIIll = new class_0400();
    private Map lllIlIIlIIIlIlIIIllIlllIl = new HashMap();
    private Map IlIllllllIIlIIllllIIlIIIl = new HashMap();

    public static class_0400 lllIIIllIIIIlllIlIIllIIll() {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    private class_0400() {
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIlIIlIlIllIIlIlIIllIIIl, new ItemStack(Items.iron_ingot), 0.7f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIlllIIIIIIlIIllIIllIlll, new ItemStack(Items.lIIIIlIlIIlllllIIllIIlIII), 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.diamond_ore, new ItemStack(Items.diamond), 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIllIllIlIIlIIllIllllll, new ItemStack(Blocks.lIlIllIIlIIlIIlIIlIIlIIll), 0.1f);
        this.lllIIIllIIIIlllIlIIllIIll(Items.IIIIlIllIlIIIIIllllIIlllI, new ItemStack(Items.llllIlIIllIIlllllIIllIIll), 0.35f);
        this.lllIIIllIIIIlllIlIIllIIll(Items.lIIlIlllIIlIIIIlIlIIIIlll, new ItemStack(Items.IIIlIIllIIlIlIIlIIllIIIIl), 0.35f);
        this.lllIIIllIIIIlllIlIIllIIll(Items.IIIIlIIIllIIIlIIlIIIIIlll, new ItemStack(Items.lIIIIIlIllIllIlIlIIllllll), 0.35f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.IlIIIIIllllllIIlllIllllll, new ItemStack(Blocks.lllIlIIlIIIlIlIIIllIlllIl), 0.1f);
        this.lllIIIllIIIIlllIlIIllIIll(Items.IllIIllIlIlllIllIllIlIIIl, new ItemStack(Items.lIIllIIlIIIlllIlllIIlIIlI), 0.3f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIllIlIIlIIlllllIlIIllIl, new ItemStack(Blocks.IllIlIIllIIllIlIIlIllIlIl), 0.35f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.IIIIIllIlIllIlIlIIlIllIIl, new ItemStack(Items.dye, 1, 2), 0.2f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.log, new ItemStack(Items.IllIIlllllllIIlIIlIIIIlIl, 1, 1), 0.15f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIlIIIIIlIlllIlIIlIlIlll, new ItemStack(Items.IllIIlllllllIIlIIlIIIIlIl, 1, 1), 0.15f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIIIlIIIIllIlIIllllIlIII, new ItemStack(Items.IIllllIIlIlIlIlllIIIllIIl), 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(Items.IIlllllIIlIIlIlIIlIIlIlII, new ItemStack(Items.IIlIlIIIIlIlllIlIlIIIIIlI), 0.35f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.lllllllIlIIlIlIIIlIlIIlll, new ItemStack(Items.IIlIlIIIIlIlllIIlIIlIIIII), 0.1f);
        for (FishType class_18182 : FishType.values()) {
            if (!class_18182.IIIllIllIIlIlIlIlIllllIIl()) continue;
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IllIlllIIIlllllIllIIlIlIl, 1, class_18182.lllIIIllIIIIlllIlIIllIIll()), new ItemStack(Items.cooked_fished, 1, class_18182.lllIIIllIIIIlllIlIIllIIll()), 0.35f);
        }
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.lllllIlllIIllIlIIlIIIllII, new ItemStack(Items.IllIIlllllllIIlIIlIIIIlIl), 0.1f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIIlIIllIllIIlIIlIIIllII, new ItemStack(Items.lIIIlIIllIllIIlIIlIIIllII), 0.7f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIlIllIllllIlIIIIlIIlll, new ItemStack(Items.dye, 1, 4), 0.2f);
        this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIlIIllIlIIIIIlIIlllIlI, new ItemStack(Items.lIllIIlllIIIlIlIIIlllIlIl), 0.2f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, ItemStack class_08972, float f) {
        this.lllIIIllIIIIlllIlIIllIIll(Item.getItemFromBlock(class_05492), class_08972, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, ItemStack class_08972, float f) {
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(class_06112, 1, 32767), class_08972, f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl.put(class_08972, class_08973);
        this.IlIllllllIIlIIllllIIlIIIl.put(class_08973, Float.valueOf(f));
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        Map.Entry entry;
        Iterator iterator = this.lllIlIIlIIIlIlIIIllIlllIl.entrySet().iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!this.lllIIIllIIIIlllIlIIllIIll(class_08972, (ItemStack)(entry = iterator.next()).getKey()));
        return (ItemStack)entry.getValue();
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973) {
        return class_08973.lllIIIllIIIIlllIlIIllIIll() == class_08972.lllIIIllIIIIlllIlIIllIIll() && (class_08973.IllIIIllIIIIlIlIlIllIIlll() == 32767 || class_08973.IllIIIllIIIIlIlIlIllIIlll() == class_08972.IllIIIllIIIIlIlIlIllIIlll());
    }

    public Map lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        Map.Entry entry;
        Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl.entrySet().iterator();
        do {
            if (iterator.hasNext()) continue;
            return 0.0f;
        } while (!this.lllIIIllIIIIlllIlIIllIIll(class_08972, (ItemStack)(entry = iterator.next()).getKey()));
        return ((Float)entry.getValue()).floatValue();
    }
}

