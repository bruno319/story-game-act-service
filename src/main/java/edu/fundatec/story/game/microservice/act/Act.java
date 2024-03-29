package edu.fundatec.story.game.microservice.act;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Document
@Getter
public class Act {

    @Id
    private String id;

    @NotNull
    @NotEmpty
    private String storyId;

    @NotNull
    @NotEmpty
    private String title;

    @NotNull
    @NotEmpty
    private String description;

    private String cover;

    @Setter
    private boolean intro;

    private List<Choice> choices;

    public Act () {
        this.choices = new ArrayList<>();
    }

    public void addChoice(Choice choice) {
        choices.add(choice);
    }


}
