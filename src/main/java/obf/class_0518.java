package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import net.minecraft.util.IChatComponent;

import java.util.Iterator;

final class class_0518
implements Function {
    class_0518() {
    }

    public Iterator lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        return class_22552.iterator();
    }

    public Object apply(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((IChatComponent)object);
    }
}

