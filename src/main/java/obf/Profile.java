package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class Profile {
    private String name;
    private boolean editable;
    public int index = 0;

    public Profile(String string, boolean bl) {
        this.name = string;
        this.editable = bl;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEditable() {
        return this.editable;
    }

    public void setName(String string) {
        this.name = string;
    }
}

