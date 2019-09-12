import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/12 14:19
 * @Description:
 */
public class TestHeaders {
    @Test
    public void testHeaders(){
        //生成一个头信息
        String auth = "mikemyzhao:123321";
        byte[] encodeAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic" + new String(encodeAuth);
        System.out.println(authHeader);
    }
}
