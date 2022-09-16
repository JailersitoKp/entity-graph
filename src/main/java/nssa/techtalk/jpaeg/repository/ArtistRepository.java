package nssa.techtalk.jpaeg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nssa.techtalk.jpaeg.model.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

  public Artist findByName(String name);

}
