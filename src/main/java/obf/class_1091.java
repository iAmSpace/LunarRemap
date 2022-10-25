package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Observable;

public class class_1091
extends Observable
implements class_0165 {
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232) {
        this.setChanged();
        this.notifyObservers(class_07232);
    }
}

