package com.kushal.backend.controllers;

import com.kushal.backend.constants.Constant;
import com.kushal.backend.services.ImageService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("api/v1/images")
public class ServeController {

    @Autowired
    private ImageService imageService;

    @GetMapping(value = "/{name}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_GIF_VALUE})
    public void getImageUsingName(
            @PathVariable("name") String imageName,
            HttpServletResponse response
    ) throws IOException {
        InputStream resource = imageService.getInputStreamUsingPath(Constant.IMAGE_BASE_URL, imageName);
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(resource, response.getOutputStream());
    }

}
