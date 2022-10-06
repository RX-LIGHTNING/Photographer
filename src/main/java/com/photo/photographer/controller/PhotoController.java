package com.photo.photographer.controller;

import com.photo.photographer.dto.Photo;
import com.photo.photographer.repo.PhotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotoController {
    @Autowired
    PhotoRepo photoRepo;
    @GetMapping("/photo")
    Iterable<Photo> getPhoto(){
        return photoRepo.findAll();
    }
}
