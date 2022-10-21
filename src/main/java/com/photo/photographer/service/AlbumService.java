package com.photo.photographer.service;

import com.photo.photographer.entity.Album;
import com.photo.photographer.repo.AlbumRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepo albumRepo;

    public Album getAlbum(Long id){
        return albumRepo.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
    public Album postAlbum(Album album){
        return albumRepo.save(album);
    }
}
