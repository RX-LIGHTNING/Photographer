package com.photo.photographer.repo;

import com.photo.photographer.entity.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepo extends CrudRepository<Album,Long> {
}
