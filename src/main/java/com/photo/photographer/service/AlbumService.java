package com.photo.photographer.service;

import com.photo.photographer.dto.Album;
import com.photo.photographer.repo.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {
    @Autowired
    AlbumRepo albumRepo;

    public AlbumRepo getAlbumRepo() {
        return albumRepo;
    }
    public Album getAlbum(Long id){
        return albumRepo.findById(id).get();
    }
    public Album postAlbum(Album album){
        return albumRepo.save(album);
    }
}
