package com.LIKELION.learnspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.LIKELION.learnspring.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository <Board, Integer>{
}