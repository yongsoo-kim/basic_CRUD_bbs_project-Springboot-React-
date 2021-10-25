package com.yongsoo.bbs.simplecrudbbs.controller;

import com.yongsoo.bbs.simplecrudbbs.domain.Board;
import com.yongsoo.bbs.simplecrudbbs.repository.BoardRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@RepositoryRestController
public class BoardController {

    private final BoardRepository boardRepository;

    @GetMapping("/boards")
    public ResponseEntity<CollectionModel<EntityModel<Board>>> list() throws Exception {
        log.info("list");

        List<Board> boards = boardRepository.findAll();

        CollectionModel<EntityModel<Board>> boardModels = CollectionModel.wrap(boards);

        for(EntityModel<Board> entityModel: boardModels) {
            log.info(entityModel.toString());
        }

        return new ResponseEntity<>(boardModels, HttpStatus.OK);
    }

}
