package com.yongsoo.bbs.simplecrudbbs.repository;

import com.yongsoo.bbs.simplecrudbbs.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
