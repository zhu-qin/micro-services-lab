package com.example.songsapi.repository;

import com.example.songsapi.model.Song;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
  List<Song> findByTitleContaining(String title);
  List<Song> findByLengthBetween(int min, int max);
  List<Song> findByContentContaining(String content);
}