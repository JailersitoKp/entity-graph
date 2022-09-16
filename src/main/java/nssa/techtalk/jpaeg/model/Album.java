package nssa.techtalk.jpaeg.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedSubgraph;
import javax.persistence.OneToMany;

@Entity
@NamedEntityGraph(name = "AlbumWithArtist", 
  attributeNodes = @NamedAttributeNode("artist")
)
@NamedEntityGraph(name = "AlbumWithArtistAndSongs", 
  attributeNodes = {
    @NamedAttributeNode("artist"), 
    @NamedAttributeNode("songs"), 
  }
)
@NamedEntityGraph(name = "AlbumWithArtistAndSongsGenre", 
attributeNodes = {
  @NamedAttributeNode("artist"), 
  @NamedAttributeNode(value="songs", subgraph="songs-subgraph"), 
}, 
subgraphs = {
    @NamedSubgraph(
      name = "songs-subgraph",
      attributeNodes = {
        @NamedAttributeNode("genre")
      }
    )
  }
)
public class Album {

  // atributos
  @Id private Integer id;
  private String description;
  private Integer publication;

  @ManyToOne(fetch = FetchType.LAZY) /*FetchType por default de ManyToOne es EAGER*/
  @JoinColumn(name = "artist_id")
  private Artist artist;

  @OneToMany(mappedBy = "album") /*FetchType por default de OneToMany es LAZY*/
  private Set<Song> songs;

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

  public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    this.artist = artist;
  }

  public Set<Song> getSongs() {
    return songs;
  }

  public void setSongs(Set<Song> songs) {
    this.songs = songs;
  }

}
