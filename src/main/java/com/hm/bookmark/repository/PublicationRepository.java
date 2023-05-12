package com.hm.bookmark.repository;

import com.hm.bookmark.domain.Publication;
import org.springframework.data.repository.CrudRepository;

public interface PublicationRepository extends CrudRepository<Publication,String> {
}
