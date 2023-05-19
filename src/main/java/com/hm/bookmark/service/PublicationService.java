package com.hm.bookmark.service;

import com.hm.bookmark.domain.Publication;
import com.hm.bookmark.repository.PublicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PublicationService {
  private final PublicationRepository repository;

  public Long savePublication(Publication publication) {
    return repository.save(publication).getId();
  }
}
