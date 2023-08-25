package shop.mtcoding.blogv2.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;


    // index(), 홈페이지
    @GetMapping("/")
    public String index() {
        System.out.println("홈페이지&게시글 목록123");
        return "index";
    }

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

    @GetMapping("/board/1")
    public String detail() {
        System.out.println("글 상세보기");
        return "board/detail";

    }
}
