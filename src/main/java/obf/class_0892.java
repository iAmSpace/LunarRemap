package obf;

import net.minecraft.crash.CrashReport;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0892
extends RuntimeException {
    private final CrashReport lllIIIllIIIIlllIlIIllIIll;

    public class_0892(CrashReport class_02232) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02232;
    }

    public CrashReport lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public Throwable getCause() {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public String getMessage() {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
    }
}

