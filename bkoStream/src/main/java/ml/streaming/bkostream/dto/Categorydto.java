package ml.streaming.bkostream.dto;


import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorydto {
    
    @Id
    private Long id;
    
    private String name;
}
