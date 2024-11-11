package vttp.batchb.ssf.day11lesson.day11Lesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(path = {"/","index.html"})
public class RandomPictureController {

    // List of image filenames
    private final List<String> images = List.of(
            "image1.jpg",
            "image2.jpg",
            "image3.jpg",
            "image4.jpg",
            "image5.jpg",
            "image6.jpg",
            "image7.jpg" // Add all your images here
    );

    @GetMapping
    public String getPicture(Model model) {
        // Select a random image
        String randomImage = images.get(new Random().nextInt(images.size()));

        // Add the selected image to the model
        model.addAttribute("imageFile", "/images/" + randomImage);
        return "index";
    }
}
