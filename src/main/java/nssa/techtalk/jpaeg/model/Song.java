package nssa.techtalk.jpaeg.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Song {

  // atributos
  @Id private Integer id;
  private String title;
  private Integer duration;

  @ManyToOne(fetch = FetchType.LAZY) /*FetchType por default de ManyToOne es EAGER*/
  @JoinColumn(name = "album_id")
  private Album album;

  @ManyToOne(fetch = FetchType.LAZY) /*FetchType por default de ManyToOne es EAGER*/
  @JoinColumn(name = "genre_id")
  private Genre genre;

  // gets y sets
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

}
