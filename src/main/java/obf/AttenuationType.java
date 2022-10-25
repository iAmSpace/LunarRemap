package obf;

/*
 * Decompiled with CFR 0.150.
 */
public enum AttenuationType {
    NONE("NONE", 0, 0),
    LINEAR("LINEAR", 1, 2);

    private final int field_148589_c;
    private static final AttenuationType[] $VALUES;

    private AttenuationType(String p_i45110_1_, int p_i45110_2_, int p_i45110_3_) {
        this.field_148589_c = p_i45110_3_;
    }

    public int func_148586_a() {
        return this.field_148589_c;
    }

    static {
        $VALUES = new AttenuationType[]{NONE, LINEAR};
    }
}

