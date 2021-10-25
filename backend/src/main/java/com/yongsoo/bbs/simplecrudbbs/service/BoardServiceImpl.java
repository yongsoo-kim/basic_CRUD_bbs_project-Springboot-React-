package com.yongsoo.bbs.simplecrudbbs.service;

import com.yongsoo.bbs.simplecrudbbs.domain.Board;
import com.yongsoo.bbs.simplecrudbbs.repository.BoardRepository;
import java.time.LocalDateTime;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;

    @Override
    @Transactional
    public void register(Board board) {
        repository.save(board);
    }

    @Override
    public Board read(Long boardNo) {
        return repository.getById(boardNo);
    }

    @Override
    @Transactional
    public void modify(Board board) {
        Board boardEntity = repository.getById(board.getBoardNo());
        boardEntity.setTitle(board.getTitle());
        boardEntity.setContent(board.getContent());
        boardEntity.setWriter(board.getWriter());
        boardEntity.setUptDate(LocalDateTime.now());
    }

    @Override
    public void remove(Long boardNo) {
        repository.deleteById(boardNo);
    }

    @Override
    public List<Board> list() {
        return repository.findAll(Sort.by(Direction.DESC, "boardNo"));
    }
}
