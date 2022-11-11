package ml.streaming.bkostream.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Singerdto {
 
    @Id
    private Long id;
    private String name;

    private String image;

    private Date createDate;
}
