package com.photo.photographer.service;

import com.photo.photographer.dto.Photo;
import com.photo.photographer.repo.PhotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
    @Autowired
    PhotoRepo photoRepo;

    public PhotoRepo getPhotoRepo() {
        return photoRepo;
    }
    public Photo savePhoto(Photo photo){
       return photoRepo.save(photo);
    }
    public void deletePhoto(Long id){
        photoRepo.deleteById(id);
    }

}
