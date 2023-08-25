package shop.mtcoding.blogv2.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    // 게시글 작성 화면 보여주기
    @GetMapping("/board/saveForm")
    public String saveForm(){
        return "board/saveForm";
    }

    // 게시글 작성하기 기능
    @PostMapping("/board/save")
    public String save() {
        System.out.println("게시글 작성 완료");
        return "redirect:/";
    }
}
