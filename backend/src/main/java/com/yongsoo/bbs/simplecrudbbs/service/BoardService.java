package com.yongsoo.bbs.simplecrudbbs.service;

import com.yongsoo.bbs.simplecrudbbs.domain.Board;
import java.util.List;

public interface BoardService {

    void register(Board board);
    Board read(Long boardNo);
    void modify(Board board);
    void remove(Long boardNo);
    List<Board> list();

}
