package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

public class class_1771
extends class_1731 {
    public class_1771(File file) {
        super(file);
    }

    @Override
    protected class_1356 lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        return new class_0216(jsonObject);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        return this.lIlllIlllIIIIlIIlllIllIII((Object)gameProfile);
    }

    @Override
    public String[] lllIlIIlIIIlIlIIIllIlllIl() {
        String[] arrstring = new String[this.IlIllllllIIlIIllllIIlIIIl().size()];
        int n = 0;
        for (class_0216 class_02162 : this.IlIllllllIIlIIllllIIlIIIl().values()) {
            arrstring[n++] = ((GameProfile)class_02162.lIlllIlllIIIIlIIlllIllIII()).getName();
        }
        return arrstring;
    }

    protected String lllIlIIlIIIlIlIIIllIlllIl(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    public GameProfile lllIIIllIIIIlllIlIIllIIll(String string) {
        class_0216 class_02162;
        Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl().values().iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!string.equalsIgnoreCase(((GameProfile)(class_02162 = (class_0216)iterator.next()).lIlllIlllIIIIlIIlllIllIII()).getName()));
        return (GameProfile)class_02162.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    protected String IlIllllllIIlIIllllIIlIIIl(Object object) {
        return this.lllIlIIlIIIlIlIIIllIlllIl((GameProfile)object);
    }
}

