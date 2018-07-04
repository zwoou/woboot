package bid.woou.wobootlogin.service;

import bid.woou.wobootmysql.entity.User;
import bid.woou.wobootmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author: zwoou
 * @Date: 2018/6/21
 */
@Service
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //这里可以通过数据库来查找到实际的用户信息，这里我们先模拟下,后续我们用数据库来实现
        User user = userRepository.findByUsername(username);
        if (user ==null){
            throw new UsernameNotFoundException("UserName:"+username+"not Found");
        }
        return new SecurityUser(user);
    }
}
