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
import nssa.techtalk.jpaeg.service.BusinessEntityGraphService;

@RestController
@RequestMapping("/api/eg")
public class BusinessEntityGraphController {

  @Autowired private BusinessEntityGraphService businessEntityGraphService; 

  @GetMapping(path = "/findAlbumWithArtistByDescription/{albumDescription}")
  @ResponseBody
  public ResponseEntity<AlbumDto> findEgAlbumWithArtistByDescription(@PathVariable String albumDescription) {
    Album album = this.businessEntityGraphService.getAlbumWithArtistByDescription(albumDescription);
    AlbumDto albumDto = new AlbumDto(album, true, false, false);
    return ResponseEntity.ok(albumDto);
  }

  @GetMapping(path = "/findAlbumWithArtistAndSongsByDescription/{albumDescription}")
  @ResponseBody
  public ResponseEntity<AlbumDto> findEgAlbumWithArtistAndSongsByDescription(@PathVariable String albumDescription) {
    Album album = this.businessEntityGraphService.getAlbumWithArtistAndSongsByDescription(albumDescription);
    AlbumDto albumDto = new AlbumDto(album, true, true, false);
    return ResponseEntity.ok(albumDto);
  }

  @GetMapping(path = "/findAlbumWithArtistAndSongsGenreByDescription/{albumDescription}")
  @ResponseBody
  public ResponseEntity<AlbumDto> findEgAlbumWithArtistAndSongsGenreByDescription(@PathVariable String albumDescription) {
    Album album = this.businessEntityGraphService.getAlbumWithArtistAndSongsGenreByDescription(albumDescription);
    AlbumDto albumDto = new AlbumDto(album, true, true, true);
    return ResponseEntity.ok(albumDto);
  }
}
