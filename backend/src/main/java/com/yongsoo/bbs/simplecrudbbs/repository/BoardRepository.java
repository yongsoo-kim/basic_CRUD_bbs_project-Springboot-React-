package com.yongsoo.bbs.simplecrudbbs.repository;

import com.yongsoo.bbs.simplecrudbbs.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:3000"})
@RepositoryRestResource
public interface BoardRepository extends JpaRepository<Board, Long> {

}
