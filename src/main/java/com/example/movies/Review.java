package com.example.movies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    private ObjectId id;

    private String ReviewBody;

    public Review(String ReviewBody) {
        this.ReviewBody = ReviewBody;
    }
}
