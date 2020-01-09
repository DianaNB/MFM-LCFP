package MFM.LCFP.models.data;

import MFM.LCFP.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User,Integer> {
    User findByUsername(String username);
}