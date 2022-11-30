import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GenerateHash {
    private static String hashedPassword = "";
    
    public static String generateHash(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] mdByteArray = md.digest(password.getBytes());
            BigInteger bigInt = new BigInteger(mdByteArray);
            hashedPassword = bigInt.toString(16);

            return hashedPassword;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return hashedPassword;
    }
}
