package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.apache.http.HttpEntity
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.StringEntity
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 *  org.apache.http.util.EntityUtils
 */
import com.google.gson.JsonObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class class_0202 {
    public static void lllIIIllIIIIlllIlIIllIIll(String[] arrstring) {
        String string = arrstring[0];
        byte[] arrby = Files.readAllBytes(Paths.get("mappings.txt", new String[0]));
        String string2 = new String(Base64.getEncoder().encode(arrby));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("gitHash", string);
        jsonObject.addProperty("mapping", string2);
        String string3 = jsonObject.toString();
        System.out.println("Making upload request for " + string + "...");
        try {
            CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost("http://clientassets.lunar.gg:4567/api/uploadVersionMapping");
            httpPost.setHeader("Authorization", "R82xLFUrkQqL9pBQYhp8");
            httpPost.setEntity((HttpEntity)new StringEntity(string3));
            HttpResponse httpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
            String string4 = EntityUtils.toString((HttpEntity)httpResponse.getEntity());
            if (string4.equals("Created mapping.")) {
                System.out.println("Mapping for " + string + " created!");
            } else if (string4.equals("Mapping for this git hash already exists.")) {
                System.out.println("Skipped creating mapping for " + string + " because it already exists.");
            } else {
                System.out.println("Failed to create mapping! Response: " + string4);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

