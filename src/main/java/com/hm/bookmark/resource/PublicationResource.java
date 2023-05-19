package com.hm.bookmark.resource;

import com.hm.bookmark.domain.Publication;
import com.hm.bookmark.service.PublicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookmark/pub")
@AllArgsConstructor
public class PublicationResource {

  private final PublicationService service;

  @PostMapping("/v1/add-pub")
  public ResponseEntity<Long> addPublication(@RequestBody Publication publication) {
    final Long pubId = service.savePublication(publication);
    return ResponseEntity.ok(pubId);
  }
}
