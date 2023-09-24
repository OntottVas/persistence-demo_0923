package hu.progmatic.persistencedemo_0923.repository;

import hu.progmatic.persistencedemo_0923.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

}
