package shop.mtcoding.blogv2.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board/1")
    public String detail() {
        System.out.println("글 상세보기");
        return "board/detail";
    }
}
