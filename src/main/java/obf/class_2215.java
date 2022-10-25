package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.beans.ConstructorProperties;

public class class_2215
extends class_0688 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private String IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII;
    private String IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeStringToBuffer(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeStringToBuffer(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeStringToBuffer(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeStringToBuffer(this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(100);
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readStringFromBuffer(100);
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readStringFromBuffer(500);
        this.IlIIIIIllllllIIlllIllllll = class_01812.readStringFromBuffer(500);
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readStringFromBuffer(10000);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
    }

    public class_2215() {
    }

    @ConstructorProperties(value={"crashId", "version", "osInfo", "memoryInfo", "stackTrace"})
    public class_2215(String string, String string2, String string3, String string4, String string5) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.IlIllllllIIlIIllllIIlIIIl = string2;
        this.lIlllIlllIIIIlIIlllIllIII = string3;
        this.IlIIIIIllllllIIlllIllllll = string4;
        this.lIllllIIlIIIlIllllllIIIll = string5;
    }
}

