package com.photo.photographer.repo;

import com.photo.photographer.entity.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepo extends CrudRepository<Photo, Long> {
}
