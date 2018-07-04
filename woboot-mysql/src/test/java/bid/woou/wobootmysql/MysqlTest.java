package bid.woou.wobootmysql;

import bid.woou.wobootmysql.entity.User;
import bid.woou.wobootmysql.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Author: zwoou
 * @Date: 2018/5/26
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlTest {
    @Autowired
    private UserRepository userDao;

    @Test
    public void initData() {
        User user = new User();
        user.setUsername("admin");
        user.setCreateDate(new Date());
        userDao.save(user);
    }
}
