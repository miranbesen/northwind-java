package kodlamaio.northwind.business.concrete;

import kodlamaio.northwind.business.abstracts.IUserService;
import kodlamaio.northwind.core.dataAccess.IUserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService {

    private IUserDao userDao;

    @Autowired
    public UserService(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Kullanıcı bulundu.");
    }
}
