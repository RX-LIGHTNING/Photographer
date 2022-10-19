package com.photo.photographer.controller;

import com.photo.photographer.dto.Photo;
import com.photo.photographer.repo.PhotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PhotoController {
    @Autowired
    PhotoRepo photoRepo;
    @GetMapping("/photos")
    Iterable<Photo> getPhotos(){
        return photoRepo.findAll();
    }
    @GetMapping("/photos/")
    Photo getPhoto(@RequestParam Long id) {
        return photoRepo.findById(id).get();
    }
    @PostMapping("/photos")
    Photo putPhoto(@RequestBody Photo photo){
        return photoRepo.save(photo);
    }
    @DeleteMapping( "/photos")
    void deletePhoto(@RequestParam Long id){
        System.out.println(1);
        photoRepo.deleteById(id);
    }

}
