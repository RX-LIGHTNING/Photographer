package com.photo.photographer.controller;

import com.photo.photographer.dto.Photo;
import com.photo.photographer.repo.PhotoRepo;
import com.photo.photographer.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PhotoController {
    @Autowired
    PhotoService photoService;
    @GetMapping("/photos")
    Iterable<Photo> getPhotos(){
        return photoService.getPhotoRepo().findAll();
    }
    @GetMapping("/photos/")
    ResponseEntity<Photo> getPhoto(@RequestParam Long id) throws Exception {
        return photoService.getPhotoRepo().findById(id).map(value ->
        new ResponseEntity<>(value, HttpStatus.OK)).orElse(ResponseEntity.notFound().build());}
    @PostMapping("/photos")
    Photo putPhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }
    @DeleteMapping( "/photos")
    void deletePhoto(@RequestParam Long id){
        photoService.deletePhoto(id);
    }

}
