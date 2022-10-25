package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.ResourceIndex;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class class_0912
implements class_0449 {
    public static Set lllIIIllIIIIlllIlIIllIIll = null;
    private class_0942 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0513 IlIllllllIIlIIllllIIlIIIl;
    private class_1429 lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;

    public class_0912(String string) {
        this.IlIIIIIllllllIIlllIllllll = string;
        lllIIIllIIIIlllIlIIllIIll = ImmutableSet.of((Object)string);
        File file = (File)class_1736.lllIIIllIIIIlllIlIIllIIll(Minecraft.getMinecraft(), Minecraft.class, File.class, 2);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_0942(new ResourceIndex(file, string).func_152782_a(), string);
        this.IlIllllllIIlIIllllIIlIIIl = new class_0513(Minecraft.getMinecraft().mcDataDir);
        this.lIlllIlllIIIIlIIlllIllIII = new class_1429(Minecraft.getMinecraft().mcDataDir);
    }

    @Override
    public Set lllIIIllIIIIlllIlIIllIIll() {
        return lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public InputStream lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) {
        try {
            return this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(class_17732);
        }
        catch (IOException iOException) {
            try {
                return this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_17732);
            }
            catch (IOException iOException2) {
                return this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_17732);
            }
        }
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(class_17732) || this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(class_17732) || this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
    }

    @Override
    public class_1574 lllIIIllIIIIlllIlIIllIIll(class_0233 class_02332, String string) {
        return null;
    }

    @Override
    public BufferedImage lllIlIIlIIIlIlIIIllIlllIl() {
        return null;
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll + "ResourcePack";
    }
}

