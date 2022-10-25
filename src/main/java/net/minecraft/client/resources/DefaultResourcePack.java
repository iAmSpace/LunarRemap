package net.minecraft.client.resources;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import net.minecraft.util.ResourceLocation;
import obf.*;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.imageio.ImageIO;

public class DefaultResourcePack
implements class_0449 {
    public static final Set lllIlIIlIIIlIlIIIllIlllIl = ImmutableSet.of((Object)"minecraft", (Object)"realms");
    private final Map lllIIIllIIIIlllIlIIllIIll;

    public DefaultResourcePack(Map map) {
        this.lllIIIllIIIIlllIlIIllIIll = map;
    }

    @Override
    public InputStream lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732) throws FileNotFoundException {
        InputStream inputStream = this.lIlllIlllIIIIlIIlllIllIII(class_17732);
        if (inputStream != null) {
            return inputStream;
        }
        InputStream inputStream2 = this.IlIllllllIIlIIllllIIlIIIl(class_17732);
        if (inputStream2 != null) {
            return inputStream2;
        }
        if (class_0298.IlIllllllIIlIIllllIIlIIIl(class_17732.lllIIIllIIIIlllIlIIllIIll())) {
            return new ByteArrayInputStream(class_0298.lllIIIllIIIIlllIlIIllIIll(class_17732.lllIIIllIIIIlllIlIIllIIll()));
        }
        throw new FileNotFoundException(class_17732.lllIIIllIIIIlllIlIIllIIll());
    }

    public InputStream IlIllllllIIlIIllllIIlIIIl(ResourceLocation class_17732) throws FileNotFoundException {
        File file = (File)this.lllIIIllIIIIlllIlIIllIIll.get(class_17732.toString());
        return file != null && file.isFile() ? new FileInputStream(file) : null;
    }

    public InputStream lIlllIlllIIIIlIIlllIllIII(ResourceLocation class_17732) {
        if (class_0298.IlIllllllIIlIIllllIIlIIIl("assets/" + class_17732.lllIlIIlIIIlIlIIIllIlllIl() + "/" + class_17732.lllIIIllIIIIlllIlIIllIIll())) {
            return new ByteArrayInputStream(class_0298.lllIIIllIIIIlllIlIIllIIll("assets/" + class_17732.lllIlIIlIIIlIlIIIllIlllIl() + "/" + class_17732.lllIIIllIIIIlllIlIIllIIll()));
        }
        return DefaultResourcePack.class.getResourceAsStream("/assets/" + class_17732.lllIlIIlIIIlIlIIIllIlllIl() + "/" + class_17732.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732) {
        return this.lIlllIlllIIIIlIIlllIllIII(class_17732) != null || this.lllIIIllIIIIlllIlIIllIIll.containsKey(class_17732.toString());
    }

    @Override
    public Set lllIIIllIIIIlllIlIIllIIll() {
        return lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public class_1574 lllIIIllIIIIlllIlIIllIIll(class_0233 class_02332, String string) {
        try {
            FileInputStream fileInputStream = new FileInputStream((File)this.lllIIIllIIIIlllIlIIllIIll.get("pack.mcmeta"));
            return class_0821.lllIIIllIIIIlllIlIIllIIll(class_02332, fileInputStream, string);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    @Override
    public BufferedImage lllIlIIlIIIlIlIIIllIlllIl() throws IOException {
        if (class_0298.IlIllllllIIlIIllllIIlIIIl("pack.png")) {
            return ImageIO.read(new ByteArrayInputStream(class_0298.lllIIIllIIIIlllIlIIllIIll("pack.png")));
        }
        return ImageIO.read(Objects.requireNonNull(DefaultResourcePack.class.getResourceAsStream("/" + new ResourceLocation("pack.png").lllIIIllIIIIlllIlIIllIIll())));
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl() {
        return "Default";
    }
}

