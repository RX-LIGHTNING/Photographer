package com.photo.photographer.controller;

import com.photo.photographer.dto.Album;
import com.photo.photographer.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {
    @Autowired
    AlbumService albumService;

    @GetMapping("/album")
    Album getAlbum(@RequestParam Long id){
        return albumService.getAlbum(id);
    }
    @PostMapping("/album")
    Album postAlbum(Album album){
        return albumService.postAlbum(album);
    }
}
