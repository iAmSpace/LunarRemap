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

public class class_0716
extends class_1731 {
    public class_0716(File file) {
        super(file);
    }

    @Override
    protected class_1356 lllIIIllIIIIlllIlIIllIIll(JsonObject jsonObject) {
        return new class_1750(jsonObject);
    }

    @Override
    public String[] lllIlIIlIIIlIlIIIllIlllIl() {
        String[] arrstring = new String[this.IlIllllllIIlIIllllIIlIIIl().size()];
        int n = 0;
        for (class_1750 class_17502 : this.IlIllllllIIlIIllllIIlIIIl().values()) {
            arrstring[n++] = ((GameProfile)class_17502.lIlllIlllIIIIlIIlllIllIII()).getName();
        }
        return arrstring;
    }

    protected String lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    public GameProfile lllIIIllIIIIlllIlIIllIIll(String string) {
        class_1750 class_17502;
        Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl().values().iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!string.equalsIgnoreCase(((GameProfile)(class_17502 = (class_1750)iterator.next()).lIlllIlllIIIIlIIlllIllIII()).getName()));
        return (GameProfile)class_17502.lIlllIlllIIIIlIIlllIllIII();
    }

    @Override
    protected String IlIllllllIIlIIllllIIlIIIl(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((GameProfile)object);
    }
}

