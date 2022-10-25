package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import net.minecraft.client.resources.DefaultResourcePack;

import java.util.Map;
import java.util.Set;

public class class_0942
extends DefaultResourcePack {
    public static Set lllIIIllIIIIlllIlIIllIIll = null;
    private final Map IlIllllllIIlIIllllIIlIIIl;

    public class_0942(Map map, String string) {
        super(map);
        lllIIIllIIIIlllIlIIllIIll = ImmutableSet.of((Object)string);
        this.IlIllllllIIlIIllllIIlIIIl = map;
    }
}

