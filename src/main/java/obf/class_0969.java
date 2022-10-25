package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0969
extends class_1246 {
    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "netstat";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 0;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.players.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (class_19692 instanceof class_0814) {
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("Command is not available for players"));
        } else if (arrstring.length > 0 && arrstring[0].length() > 1) {
            if ("hottest-read".equals(arrstring[0])) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0800.IllIIlllllllIIlIIlIIIIlIl.IlIIIIIllllllIIlllIllllll().toString()));
            } else if ("hottest-write".equals(arrstring[0])) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0800.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI().toString()));
            } else if ("most-read".equals(arrstring[0])) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0800.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll().toString()));
            } else if ("most-write".equals(arrstring[0])) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_0800.IllIIlllllllIIlIIlIIIIlIl.IllIIlllllllIIlIIlIIIIlIl().toString()));
            } else if ("packet-read".equals(arrstring[0])) {
                if (arrstring.length > 1 && arrstring[1].length() > 0) {
                    try {
                        int n = Integer.parseInt(arrstring[1].trim());
                        class_2063 class_20632 = class_0800.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(n);
                        this.lllIIIllIIIIlllIlIIllIIll(class_19692, n, class_20632);
                    }
                    catch (Exception exception) {
                        class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("Packet " + arrstring[1] + " not found!"));
                    }
                } else {
                    class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("Packet id is missing"));
                }
            } else if ("packet-write".equals(arrstring[0])) {
                if (arrstring.length > 1 && arrstring[1].length() > 0) {
                    try {
                        int n = Integer.parseInt(arrstring[1].trim());
                        class_2063 class_20633 = class_0800.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(n);
                        this.lllIIIllIIIIlllIlIIllIIll(class_19692, n, class_20633);
                    }
                    catch (Exception exception) {
                        class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("Packet " + arrstring[1] + " not found!"));
                    }
                } else {
                    class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("Packet id is missing"));
                }
            } else if ("read-count".equals(arrstring[0])) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("total-read-count" + String.valueOf(class_0800.IllIIlllllllIIlIIlIIIIlIl.IlIllllllIIlIIllllIIlIIIl())));
            } else if ("write-count".equals(arrstring[0])) {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("total-write-count" + String.valueOf(class_0800.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII())));
            } else {
                class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("Unrecognized: " + arrstring[0]));
            }
        } else {
            String string = "reads: " + class_0800.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
            string = string + ", writes: " + class_0800.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl();
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(string));
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, int n, class_2063 class_20632) {
        if (class_20632 != null) {
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722(class_20632.toString()));
        } else {
            class_19692.lllIIIllIIIIlllIlIIllIIll(new class_0722("Packet " + n + " not found!"));
        }
    }
}

