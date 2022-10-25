package net.minecraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockFire;
import net.minecraft.item.Item;
import net.minecraft.stats.StatList;
import obf.*;

public class Bootstrap {
    private static boolean field_151355_a = false;

    static void func_151353_a() {
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.arrow, new class_1645());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.egg, new class_0853());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.snowball, new class_0170());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.experience_bottle, new class_0035());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.potionitem, new class_0360());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.spawn_egg, new class_1691());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.fireworks, new class_2262());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.fire_charge, new class_1173());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.boat, new class_1805());
        class_0863 behaviordefaultdispenseitem = new class_0863();
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.lava_bucket, behaviordefaultdispenseitem);
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.water_bucket, behaviordefaultdispenseitem);
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.bucket, new class_0911());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.flint_and_steel, new class_0591());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Items.dye, new class_1591());
        BlockDispenser.dispenseBehaviorRegistry.putObject(Item.getItemFromBlock(Blocks.tnt), new class_2150());
    }

    public static void func_151354_b() {
        if (!field_151355_a) {
            field_151355_a = true;
            Block.registerBlocks();
            BlockFire.func_149843_e();
            Item.registerItems();
            StatList.func_151178_a();
            func_151353_a();
        }
    }
}

