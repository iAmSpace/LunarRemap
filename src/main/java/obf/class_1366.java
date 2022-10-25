package obf;

import net.minecraft.util.ChatComponentTranslation;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1366
extends IllegalArgumentException {
    public class_1366(ChatComponentTranslation class_17902, String string) {
        super(String.format("Error parsing: %s: %s", class_17902, string));
    }

    public class_1366(ChatComponentTranslation class_17902, int n) {
        super(String.format("Invalid index %d requested for %s", n, class_17902));
    }

    public class_1366(ChatComponentTranslation class_17902, Throwable throwable) {
        super(String.format("Error while parsing: %s", class_17902), throwable);
    }
}

