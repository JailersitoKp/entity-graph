package nssa.techtalk.jpaeg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nssa.techtalk.jpaeg.model.Album;
import nssa.techtalk.jpaeg.repository.AlbumRepository;

@Service
public class BusinessEntityGraphService {

  @Autowired private AlbumRepository albumRepository;

  @Transactional(readOnly = true)
  public Album getAlbumWithArtistByDescription(String description) {
    return this.albumRepository.findWithArtistByDescription(description);
  }

  @Transactional(readOnly = true)
  public Album getAlbumWithArtistAndSongsByDescription(String description) {
    return this.albumRepository.findWithArtistAndSongsByDescription(description);
  }

  @Transactional(readOnly = true)
  public Album getAlbumWithArtistAndSongsGenreByDescription(String description) {
    return this.albumRepository.findWithArtistAndSongsGenreByDescription(description);
  }
}
