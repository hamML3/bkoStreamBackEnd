package ml.streaming.bkostream.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document

public class Singer {
    
    @Id
    private Long id;
    private String name;

    private String image;

    private Date createDate;
}
