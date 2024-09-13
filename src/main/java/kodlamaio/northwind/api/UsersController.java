package kodlamaio.northwind.api;


import kodlamaio.northwind.business.abstracts.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class UsersController {

    private IUserService userService;

    @Autowired
    public UsersController(IUserService userService) {
        this.userService = userService;
    }


}
