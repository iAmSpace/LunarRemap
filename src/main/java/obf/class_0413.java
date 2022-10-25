package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;

final class class_0413
implements class_1690,
Map.Entry {
    int lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1427 lllIlIIlIIIlIlIIIllIlllIl;

    class_0413(class_1427 class_14272, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_14272;
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    class_0413(class_1427 class_14272) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_14272;
    }

    public Object getKey() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll[this.lllIIIllIIIIlllIlIIllIIll];
    }

    public Object getValue() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll];
    }

    public Object setValue(Object object) {
        Object object2 = this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll];
        this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll] = object;
        return object2;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        return (this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll[this.lllIIIllIIIIlllIlIIllIIll] == null ? entry.getKey() == null : this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll[this.lllIIIllIIIIlllIlIIllIIll].equals(entry.getKey())) && (this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll] == null ? entry.getValue() == null : this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll].equals(entry.getValue()));
    }

    @Override
    public int hashCode() {
        return (this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll[this.lllIIIllIIIIlllIlIIllIIll] == null ? 0 : this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll[this.lllIIIllIIIIlllIlIIllIIll].hashCode()) ^ (this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll] == null ? 0 : this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll].hashCode());
    }

    public String toString() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIllIIIIlIlIlIllIIlll[this.lllIIIllIIIIlllIlIIllIIll] + "=>" + this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll];
    }
}

