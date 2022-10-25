package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;

import java.util.List;

public abstract class class_1789
extends class_0079 {
    protected final Minecraft lllIIIllIIIIlllIlIIllIIll;
    protected List lllIlIIlIIIlIlIIIllIlllIl;

    public class_1789(Minecraft class_06672, int n, int n2, List list) {
        super(class_06672, n, n2, 32, n2 - 55 + 4, 36);
        this.lllIIIllIIIIlllIlIIllIIll = class_06672;
        this.lllIlIIlIIIlIlIIIllIlllIl = list;
        this.lIIIIlIlIIlllllIIllIIlIII = false;
        this.lllIIIllIIIIlllIlIIllIIll(true, (int)((float)class_06672.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll * 1.5f));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_0868 class_08682) {
        String string = (Object)((Object) EnumChatFormatting.UNDERLINE) + "" + (Object)((Object) EnumChatFormatting.BOLD) + this.lIllllIIlIIIlIllllllIIIll();
        this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(string, n + this.IlIllllllIIlIIllllIIlIIIl / 2 - this.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) / 2, Math.min(this.lIlllIlllIIIIlIIlllIllIII + 3, n2), 0xFFFFFF);
    }

    protected abstract String lIllllIIlIIIlIllllllIIIll();

    public List IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    protected int lllIIIllIIIIlllIlIIllIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI().size();
    }

    public class_1924 IlIllllllIIlIIllllIIlIIIl(int n) {
        return (class_1924)this.IIIllIIlIIIIIIlIlIIllIIlI().get(n);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    protected int lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll - 6;
    }

    @Override
    public /* synthetic */ class_0677 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.IlIllllllIIlIIllllIIlIIIl(n);
    }
}

