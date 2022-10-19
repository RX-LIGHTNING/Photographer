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
        System.out.println(2);
        return photoRepo.findAll();
    }
    @PostMapping("/photo/add")
    Photo putPhoto(@RequestBody Photo photo){
        return photoRepo.save(photo);
    }
}
