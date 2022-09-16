package nssa.techtalk.jpaeg.dto;

import nssa.techtalk.jpaeg.model.Song;

public class SongDto {

  // atributos
  private String title;
  private Integer duration;
  private String genreDescription;
 
  // constructores
  public SongDto(Song song, boolean genre) {
    this.title = song.getTitle();
    this.duration = song.getDuration();
    if (genre) {
      this.genreDescription = song.getGenre().getDescription();
    }
  }

  // gets y sets
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
  
  public String getGenreDescription() {
    return genreDescription;
  }
  
  public void setGenreDescription(String genreDescription) {
    this.genreDescription = genreDescription;
  }

}
