package bid.woou.wobootmysql.repository;

import bid.woou.wobootmysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: zwoou
 * @Date: 2018/5/26
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUsername(String username);

}
