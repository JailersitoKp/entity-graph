package nssa.techtalk.jpaeg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import nssa.techtalk.jpaeg.dto.AlbumDto;
import nssa.techtalk.jpaeg.model.Album;
import nssa.techtalk.jpaeg.model.Artist;
import nssa.techtalk.jpaeg.service.BusinessService;

@RestController
@RequestMapping("/api")
public class BusinessController {

  @Autowired private BusinessService businessService; 

  @GetMapping(path = "/findArtistByName/{artistName}")
  @ResponseBody
  public ResponseEntity<Artist> findArtistByName(@PathVariable String artistName) {
    Artist artist = this.businessService.getArtistByName(artistName);
    return ResponseEntity.ok(artist);
  }

  @GetMapping(path = "/findAlbumByDescription/{albumDescription}")
  @ResponseBody
  public ResponseEntity<AlbumDto> findAlbumByDescription(@PathVariable String albumDescription) {
    Album album = this.businessService.getAlbumByDescription(albumDescription);
    AlbumDto albumDto = new AlbumDto(album, false, false, false);
    return ResponseEntity.ok(albumDto);
  }

  @GetMapping(path = "/findAlbumWithArtistByDescription/{albumDescription}")
  @ResponseBody
  public ResponseEntity<AlbumDto> findAlbumWithArtistByDescription(@PathVariable String albumDescription) {
    //Album album = this.businessService.getAlbumByDescription(albumDescription);
    Album album = this.businessService.getAlbumWithArtistByDescription(albumDescription);
    AlbumDto albumDto = new AlbumDto(album, true, false, false);
    return ResponseEntity.ok(albumDto);
  }

  @GetMapping(path = "/findAlbumWithArtistAndSongsByDescription/{albumDescription}")
  @ResponseBody
  public ResponseEntity<AlbumDto> findAlbumWithArtistAndSongsByDescription(@PathVariable String albumDescription) {
    Album album = this.businessService.getAlbumWithArtistAndSongsByDescription(albumDescription);
    AlbumDto albumDto = new AlbumDto(album, true, true, false);
    return ResponseEntity.ok(albumDto);
  }
}
