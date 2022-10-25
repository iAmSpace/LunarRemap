package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import net.minecraft.util.ResourceLocation;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class_0030 {
    public static final ResourceLocation lllIIIllIIIIlllIlIIllIIll = new ResourceLocation("textures/entity/steve.png");
    private static final ExecutorService lllIlIIlIIIlIlIIIllIlllIl = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    private final class_1682 IlIllllllIIlIIllllIIlIIIl;
    private final File lIlllIlllIIIIlIIlllIllIII;
    private final MinecraftSessionService IlIIIIIllllllIIlllIllllll;
    private final LoadingCache lIllllIIlIIIlIllllllIIIll;

    public class_0030(class_1682 class_16822, File file, MinecraftSessionService minecraftSessionService) {
        this.IlIllllllIIlIIllllIIlIIIl = class_16822;
        this.lIlllIlllIIIIlIIlllIllIII = file;
        this.IlIIIIIllllllIIlllIllllll = minecraftSessionService;
        this.lIllllIIlIIIlIllllllIIIll = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new class_1881(this));
    }

    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type) {
        return this.lllIIIllIIIIlllIlIIllIIll(minecraftProfileTexture, type, null);
    }

    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type, class_0169 class_01692) {
        ResourceLocation class_17732 = new ResourceLocation("skins/" + minecraftProfileTexture.getHash());
        class_0211 class_02112 = this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(class_17732);
        if (class_02112 != null) {
            if (class_01692 != null) {
                class_01692.lllIIIllIIIIlllIlIIllIIll(type, class_17732);
            }
        } else {
            File file = new File(this.lIlllIlllIIIIlIIlllIllIII, minecraftProfileTexture.getHash().substring(0, 2));
            File file2 = new File(file, minecraftProfileTexture.getHash());
            class_1193 class_11932 = type == MinecraftProfileTexture.Type.SKIN ? new class_1193() : null;
            class_1085 class_10852 = new class_1085(file2, minecraftProfileTexture.getUrl(), lllIIIllIIIIlllIlIIllIIll, new class_1926(this, class_11932, class_01692, type, class_17732));
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_17732, class_10852);
        }
        return class_17732;
    }

    public void lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile, class_0169 class_01692, boolean bl) {
        lllIlIIlIIIlIlIIIllIlllIl.submit(new class_1895(this, gameProfile, bl, class_01692));
    }

    public Map lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        return (Map)this.lIllllIIlIIIlIllllllIIIll.getUnchecked((Object)gameProfile);
    }

    static /* synthetic */ MinecraftSessionService lllIIIllIIIIlllIlIIllIIll(class_0030 class_00302) {
        return class_00302.IlIIIIIllllllIIlllIllllll;
    }
}

