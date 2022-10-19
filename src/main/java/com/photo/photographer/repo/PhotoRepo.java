package com.photo.photographer.repo;

import com.photo.photographer.dto.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepo extends CrudRepository<Photo, Long> {
}
