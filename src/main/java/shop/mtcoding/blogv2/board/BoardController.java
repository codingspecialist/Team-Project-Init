package shop.mtcoding.blogv2.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

    // localhost:8080?page=1&keyword=바나나
    // index(), 홈페이지
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "0") Integer page,
                        @RequestParam(defaultValue = "") String keyword,
                        HttpServletRequest request) {

        Page<Board> boardPG = null;

        // 핵심로직
        if (keyword.isBlank()) { // Keyword가 없을때(공백 or Null값)
            request.setAttribute("keyword", keyword);
            boardPG = boardService.게시글목록보기(page);
            request.setAttribute("boardPG", boardPG);
            request.setAttribute("prevPage", boardPG.getNumber() - 1);
            request.setAttribute("nextPage", boardPG.getNumber() + 1);
        } else { // keyword가 있을때
            request.setAttribute("keyword", keyword);
            boardPG = boardService.게시글검색하기(keyword, page);
            request.setAttribute("boardPG", boardPG);
            request.setAttribute("prevPage", boardPG.getNumber() - 1);
            request.setAttribute("nextPage", boardPG.getNumber() + 1);
        }
        // boardPG = boardService.게시글목록보기(page);
        //
        // // 페이징
        // request.setAttribute("boardPG", boardPG);
        // request.setAttribute("prevPage", boardPG.getNumber() - 1);
        // request.setAttribute("nextPage", boardPG.getNumber() + 1);

        // 위의 방법 대신 DTO에 담아서 request에 DTO만 연결시키는게 관리하기 좋다.
        return "index";
    }

}
