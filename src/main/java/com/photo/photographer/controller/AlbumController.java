package com.photo.photographer.controller;

import com.photo.photographer.entity.Album;
import com.photo.photographer.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/v1/albums")
@RequiredArgsConstructor
@RestController
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping("/{id}")
    public Album findBy(@PathVariable Long id) {
        return albumService.getAlbum(id);
    }

    @PostMapping
    public Album create(@RequestBody Album album) {
        return albumService.postAlbum(album);
    }
}
