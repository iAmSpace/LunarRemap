package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.StringTokenizer;

public class class_2254 {
    public static boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2, char c, char c2) {
        if (string2 != null && string != null) {
            String string3;
            if (string2.indexOf(c) < 0) {
                return string2.indexOf(c2) < 0 ? string2.equals(string) : class_2254.lllIlIIlIIIlIlIIIllIlllIl(string, string2, c2);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            String string4 = "" + c;
            if (string2.startsWith(string4)) {
                arrayList.add("");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string2, string4);
            while (stringTokenizer.hasMoreElements()) {
                arrayList.add(stringTokenizer.nextToken());
            }
            if (string2.endsWith(string4)) {
                arrayList.add("");
            }
            if (!class_2254.lIlllIlllIIIIlIIlllIllIII(string, string3 = (String)arrayList.get(0), c2)) {
                return false;
            }
            String string5 = (String)arrayList.get(arrayList.size() - 1);
            if (!class_2254.IlIllllllIIlIIllllIIlIIIl(string, string5, c2)) {
                return false;
            }
            int n = 0;
            for (int i = 0; i < arrayList.size(); ++i) {
                String string6 = (String)arrayList.get(i);
                if (string6.length() <= 0) continue;
                int n2 = class_2254.lllIIIllIIIIlllIlIIllIIll(string, string6, n, c2);
                if (n2 < 0) {
                    return false;
                }
                n = n2 + string6.length();
            }
            return true;
        }
        return string2 == string;
    }

    private static boolean lllIlIIlIIIlIlIIIllIlllIl(String string, String string2, char c) {
        if (string != null && string2 != null) {
            if (string.length() != string2.length()) {
                return false;
            }
            for (int i = 0; i < string2.length(); ++i) {
                char c2 = string2.charAt(i);
                if (c2 == c || string.charAt(i) == c2) continue;
                return false;
            }
            return true;
        }
        return string == string2;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(String string, String string2, int n, char c) {
        if (string != null && string2 != null) {
            if (n >= 0 && n <= string.length()) {
                if (string.length() < n + string2.length()) {
                    return -1;
                }
                int n2 = n;
                while (n2 + string2.length() <= string.length()) {
                    String string3 = string.substring(n2, n2 + string2.length());
                    if (class_2254.lllIlIIlIIIlIlIIIllIlllIl(string3, string2, c)) {
                        return n2;
                    }
                    ++n2;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    private static boolean IlIllllllIIlIIllllIIlIIIl(String string, String string2, char c) {
        if (string != null && string2 != null) {
            if (string.length() < string2.length()) {
                return false;
            }
            String string3 = string.substring(string.length() - string2.length(), string.length());
            return class_2254.lllIlIIlIIIlIlIIIllIlllIl(string3, string2, c);
        }
        return string == string2;
    }

    private static boolean lIlllIlllIIIIlIIlllIllIII(String string, String string2, char c) {
        if (string != null && string2 != null) {
            if (string.length() < string2.length()) {
                return false;
            }
            String string3 = string.substring(0, string2.length());
            return class_2254.lllIlIIlIIIlIlIIIllIlllIl(string3, string2, c);
        }
        return string == string2;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string, String[] arrstring, char c) {
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (!class_2254.lllIIIllIIIIlllIlIIllIIll(string, string2, c)) continue;
            return true;
        }
        return false;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2, char c) {
        if (string2 != null && string != null) {
            String string3;
            if (string2.indexOf(c) < 0) {
                return string2.equals(string);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            String string4 = "" + c;
            if (string2.startsWith(string4)) {
                arrayList.add("");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string2, string4);
            while (stringTokenizer.hasMoreElements()) {
                arrayList.add(stringTokenizer.nextToken());
            }
            if (string2.endsWith(string4)) {
                arrayList.add("");
            }
            if (!string.startsWith(string3 = (String)arrayList.get(0))) {
                return false;
            }
            String string5 = (String)arrayList.get(arrayList.size() - 1);
            if (!string.endsWith(string5)) {
                return false;
            }
            int n = 0;
            for (int i = 0; i < arrayList.size(); ++i) {
                String string6 = (String)arrayList.get(i);
                if (string6.length() <= 0) continue;
                int n2 = string.indexOf(string6, n);
                if (n2 < 0) {
                    return false;
                }
                n = n2 + string6.length();
            }
            return true;
        }
        return string2 == string;
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        if (string != null && string.length() > 0) {
            if (string2 == null) {
                return new String[]{string};
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            int n = 0;
            for (int i = 0; i < string.length(); ++i) {
                char c = string.charAt(i);
                if (!class_2254.lllIIIllIIIIlllIlIIllIIll(c, string2)) continue;
                arrayList.add(string.substring(n, i));
                n = i + 1;
            }
            arrayList.add(string.substring(n, string.length()));
            return arrayList.toArray(new String[arrayList.size()]);
        }
        return new String[0];
    }

    private static boolean lllIIIllIIIIlllIlIIllIIll(char c, String string) {
        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) != c) continue;
            return true;
        }
        return false;
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(String string, String string2) {
        if (string != null) {
            string = string.trim();
        }
        if (string2 != null) {
            string2 = string2.trim();
        }
        return class_2254.lllIIIllIIIIlllIlIIllIIll((Object)string, (Object)string2);
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        return string == null ? true : string.trim().length() <= 0;
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n = class_2254.lllIIIllIIIIlllIlIIllIIll(string, -1);
        if (n == -1) {
            return "";
        }
        String string2 = "" + ++n;
        return string2.length() > string.length() ? "" : class_2254.lllIIIllIIIIlllIlIIllIIll("" + n, string.length(), '0');
    }

    public static int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        if (string == null) {
            return n;
        }
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl(String string) {
        return !class_2254.lllIIIllIIIIlllIlIIllIIll(string);
    }

    public static String IlIllllllIIlIIllllIIlIIIl(String string, String string2) {
        for (int i = 0; i < string2.length(); ++i) {
            if (string.indexOf(string2.charAt(i)) >= 0) continue;
            string = string + string2.charAt(i);
        }
        return string;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string, int n, char c) {
        if (string == null) {
            string = "";
        }
        if (string.length() >= n) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        while (stringBuffer.length() < n) {
            stringBuffer.insert(0, c);
        }
        return stringBuffer.toString();
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(String string, int n, char c) {
        if (string == null) {
            string = "";
        }
        if (string.length() >= n) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        while (stringBuffer.length() < n) {
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(Object object, Object object2) {
        return object == object2 ? true : (object != null && object.equals(object2) ? true : object2 != null && object2.equals(object));
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string, String[] arrstring) {
        if (string == null) {
            return false;
        }
        if (arrstring == null) {
            return false;
        }
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (!string.startsWith(string2)) continue;
            return true;
        }
        return false;
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(String string, String[] arrstring) {
        if (string == null) {
            return false;
        }
        if (arrstring == null) {
            return false;
        }
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (!string.endsWith(string2)) continue;
            return true;
        }
        return false;
    }

    public static String lIlllIlllIIIIlIIlllIllIII(String string, String string2) {
        if (string != null && string2 != null) {
            if (string.startsWith(string2)) {
                string = string.substring(string2.length());
            }
            return string;
        }
        return string;
    }

    public static String IlIIIIIllllllIIlllIllllll(String string, String string2) {
        if (string != null && string2 != null) {
            if (string.endsWith(string2)) {
                string = string.substring(0, string.length() - string2.length());
            }
            return string;
        }
        return string;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string, String string2, String string3) {
        if (string != null && string2 != null) {
            if (!string.endsWith(string2)) {
                return string;
            }
            if (string3 == null) {
                string3 = "";
            }
            string = string.substring(0, string.length() - string2.length());
            return string + string3;
        }
        return string;
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(String string, String string2, String string3) {
        if (string != null && string2 != null) {
            if (!string.startsWith(string2)) {
                return string;
            }
            if (string3 == null) {
                string3 = "";
            }
            string = string.substring(string2.length());
            return string3 + string;
        }
        return string;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(String[] arrstring, String string) {
        if (arrstring != null && string != null) {
            for (int i = 0; i < arrstring.length; ++i) {
                String string2 = arrstring[i];
                if (!string2.startsWith(string)) continue;
                return i;
            }
            return -1;
        }
        return -1;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(String[] arrstring, String string) {
        if (arrstring != null && string != null) {
            for (int i = 0; i < arrstring.length; ++i) {
                String string2 = arrstring[i];
                if (!string2.endsWith(string)) continue;
                return i;
            }
            return -1;
        }
        return -1;
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n, int n2) {
        if (arrstring == null) {
            return arrstring;
        }
        if (n2 > 0 && n < arrstring.length) {
            if (n >= n2) {
                return arrstring;
            }
            ArrayList<String> arrayList = new ArrayList<String>(arrstring.length);
            for (int i = 0; i < arrstring.length; ++i) {
                String string = arrstring[i];
                if (i >= n && i < n2) continue;
                arrayList.add(string);
            }
            String[] arrstring2 = arrayList.toArray(new String[arrayList.size()]);
            return arrstring2;
        }
        return arrstring;
    }

    public static String IlIllllllIIlIIllllIIlIIIl(String string, String[] arrstring) {
        if (string != null && arrstring != null) {
            String string2;
            int n = string.length();
            for (int i = 0; i < arrstring.length && (string = class_2254.IlIIIIIllllllIIlllIllllll(string, string2 = arrstring[i])).length() == n; ++i) {
            }
            return string;
        }
        return string;
    }

    public static String lIlllIlllIIIIlIIlllIllIII(String string, String[] arrstring) {
        if (string != null && arrstring != null) {
            String string2;
            int n = string.length();
            for (int i = 0; i < arrstring.length && (string = class_2254.lIlllIlllIIIIlIIlllIllIII(string, string2 = arrstring[i])).length() == n; ++i) {
            }
            return string;
        }
        return string;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string, String[] arrstring, String[] arrstring2) {
        string = class_2254.lIlllIlllIIIIlIIlllIllIII(string, arrstring);
        string = class_2254.IlIllllllIIlIIllllIIlIIIl(string, arrstring2);
        return string;
    }

    public static String IlIllllllIIlIIllllIIlIIIl(String string, String string2, String string3) {
        return class_2254.lllIIIllIIIIlllIlIIllIIll(string, new String[]{string2}, new String[]{string3});
    }

    public static String lIlllIlllIIIIlIIlllIllIII(String string, String string2, String string3) {
        if (string != null && string2 != null && string3 != null) {
            int n = string.indexOf(string2);
            if (n < 0) {
                return null;
            }
            int n2 = string.indexOf(string3, n);
            return n2 < 0 ? null : string.substring(n, n2 + string3.length());
        }
        return null;
    }
}

