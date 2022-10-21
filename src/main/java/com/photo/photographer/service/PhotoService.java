package com.photo.photographer.service;

import com.photo.photographer.entity.Photo;
import com.photo.photographer.repo.PhotoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PhotoService {

    private final PhotoRepo photoRepo;

    public PhotoRepo getPhotoRepo() {
        return photoRepo;
    }

    public Photo getPhotoById(Long id) {
        return photoRepo.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    public Photo savePhoto(Photo photo) {
        return photoRepo.save(photo);
    }

    public void deletePhoto(Long id) {
        photoRepo.deleteById(id);
    }

}
