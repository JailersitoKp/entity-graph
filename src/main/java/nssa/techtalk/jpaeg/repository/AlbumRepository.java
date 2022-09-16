package nssa.techtalk.jpaeg.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nssa.techtalk.jpaeg.model.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {

  public Album findByDescription(String description);

  @EntityGraph(value = "AlbumWithArtist")
  public Album findWithArtistByDescription(String description);

  @EntityGraph(value = "AlbumWithArtistAndSongs")
  public Album findWithArtistAndSongsByDescription(String description);

  @EntityGraph(value = "AlbumWithArtistAndSongsGenre")
  public Album findWithArtistAndSongsGenreByDescription(String description);
}
