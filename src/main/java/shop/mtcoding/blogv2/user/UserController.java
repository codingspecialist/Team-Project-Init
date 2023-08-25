package shop.mtcoding.blogv2.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpSession Session;

    @GetMapping("/loginForm")
    public String loginForm() {

        return "/user/loginForm";
    }

    @PostMapping("/login")
    public String login() {

        System.out.println("로그인완료");

        return "redirect:/";
    }

    @PostMapping("user/update")
    public String update() {
        return "redirect:/";
    }

}
