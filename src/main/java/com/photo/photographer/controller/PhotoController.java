package com.photo.photographer.controller;

import com.photo.photographer.entity.Photo;
import com.photo.photographer.service.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/photos")
@RequiredArgsConstructor
public class PhotoController {
    private final PhotoService photoService;

    @GetMapping("/{id}")
    Photo get(@PathVariable Long id) {
        return photoService.getPhotoById(id);
    }

    @PostMapping
    Photo create(@RequestBody Photo photo) {
        return photoService.savePhoto(photo);
    }

    @DeleteMapping("/{id}")
    void deletePhoto(@PathVariable Long id) {
        photoService.deletePhoto(id);
    }

}
