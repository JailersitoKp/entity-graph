package nssa.techtalk.jpaeg.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import nssa.techtalk.jpaeg.model.Album;

public class AlbumDto implements Serializable {

  // constantes
  private static final long serialVersionUID = 1L;

  // atributos
  private String description;
  private Integer publication;
  private String artistName;
  private String artistCountry;
  private Collection<SongDto> songs;

  // constructores
  public AlbumDto(Album album, boolean artist, boolean songs, boolean genre) {
    this.description = album.getDescription();
    this.publication = album.getPublication();
    if (artist) {
      this.artistName = album.getArtist().getName();
      this.artistCountry = album.getArtist().getCountry();
    }
    if (songs) {
      this.songs = new ArrayList<>();
      album.getSongs().forEach(song -> this.songs.add(new SongDto(song, genre)));
    }
  }

  // gets y sets
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPublication() {
    return publication;
  }

  public void setPublication(Integer publication) {
    this.publication = publication;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public String getArtistCountry() {
    return artistCountry;
  }

  public void setArtistCountry(String artistCountry) {
    this.artistCountry = artistCountry;
  }

  public Collection<SongDto> getSongs() {
    return songs;
  }

  public void setSongs(Collection<SongDto> songs) {
    this.songs = songs;
  }

}