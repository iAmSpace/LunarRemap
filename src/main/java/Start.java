import obf.Main;

import java.io.File;
import java.util.Arrays;

public class Start {
    public static void main(String[] arrstring) {
        File file = new File(new File(System.getenv("APPDATA")), ".minecraft");
        System.loadLibrary("graphics-hook64");
        Main.lllIIIllIIIIlllIlIIllIIll(concat(arrstring, new String[] {
                "--version", "Lunar Client",
                "--accessToken", "0",
                "--assetIndex", "1.7.10",
                "--userProperties", "{}",
                "--gameDir", file.getAbsolutePath(),
                "--assetsDir", new File(file, "assets").getAbsolutePath()
        }));
    }

    private static String[] concat(String[] arrstring, String[] arrstring2) {
        String[] arrstring3 = Arrays.copyOf(arrstring, arrstring.length + arrstring2.length);
        System.arraycopy(arrstring2, 0, arrstring3, arrstring.length, arrstring2.length);
        return arrstring3;
    }
}

