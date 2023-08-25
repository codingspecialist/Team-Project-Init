package shop.mtcoding.blogv2.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    // 회원가입 페이지 불러오기
    @GetMapping("/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }

    // 회원가입
    @PostMapping("/join")
    public String join(){
        System.out.println("회원가입완료");
        return "redirect:/login";
    }

}
