import com.mikemyzhao.microcloud.Dept8001_StartSpringCloudApplication;
import com.mikemyzhao.microcloud.service.IDeptService;
import com.mikemyzhao.vo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/11 17:01
 * @Description:
 */

@SpringBootTest(classes = Dept8001_StartSpringCloudApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class IDeptServiceTest {
    @Resource
    private IDeptService deptService;
    @Test
    public void testGet(){
        System.out.println(deptService.get(1));
    }

    @Test
    public void testList(){
        System.out.println(deptService.list());
    }

    @Test
    public void testAdd(){
        Dept dept = new Dept();
        dept.setDname("保洁部");
        System.out.println(this.deptService.add(dept));
    }
}
