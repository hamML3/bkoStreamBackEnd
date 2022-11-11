package ml.streaming.bkostream.dto;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.model.EnumRole;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Roledto {
    @Id
    private Long id;
    private EnumRole name;

}
