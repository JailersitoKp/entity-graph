package nssa.techtalk.jpaeg.service;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nssa.techtalk.jpaeg.model.Album;
import nssa.techtalk.jpaeg.model.Artist;
import nssa.techtalk.jpaeg.repository.AlbumRepository;
import nssa.techtalk.jpaeg.repository.ArtistRepository;

@Service
public class BusinessService {

  // atributos
  @Autowired private ArtistRepository artistRepository;
  @Autowired private AlbumRepository albumRepository;

  // metodos
  @Transactional(readOnly = true)
  public Artist getArtistByName(String name) {
    return this.artistRepository.findByName(name);
  }

  @Transactional(readOnly = true)
  public Album getAlbumByDescription(String description) {
    Album album = this.albumRepository.findByDescription(description);
    return album;
  }

  @Transactional(readOnly = true)
  public Album getAlbumWithArtistByDescription(String description) {
    Album album = this.albumRepository.findByDescription(description);
    Hibernate.initialize(album.getArtist()); // o poner atributo: artist en EAGER
    return album;
  }

  @Transactional(readOnly = true)
  public Album getAlbumWithArtistAndSongsByDescription(String description) {
    Album album = this.albumRepository.findByDescription(description);
    Hibernate.initialize(album.getArtist()); // o poner atributo: artist en EAGER
    Hibernate.initialize(album.getSongs());  // o poner atributo: songs  en EAGER (Muy peligroso!)
    return album;
  }
}
