package bid.woou.wobootmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zwoou
 * @Date: 2018/6/30
 */
@SpringBootApplication
public class WobootmysqlApplicaton {

    public static void main(String[] args) {
        SpringApplication.run(WobootmysqlApplicaton.class, args);
        System.out.println("----启动成功---");
    }
}
