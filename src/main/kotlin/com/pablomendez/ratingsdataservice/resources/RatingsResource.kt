package com.pablomendez.ratingsdataservice.resources

import com.pablomendez.ratingsdataservice.models.Rating
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ratings")
class RatingsResource {
    @GetMapping("/{movieId}")
    fun getRating(@PathVariable movieId: String): Rating {
        return Rating(movieId, 4)
    }
}