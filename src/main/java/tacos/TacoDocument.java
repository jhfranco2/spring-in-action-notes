package tacos;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("tacos")
public class TacoDocument {

    @Id
    private String id;

    private String name;
    private Date createdAt;
    private List<Ingredient> ingredients;
}
