package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @ManyToMany(mappedBy = "skills")
    List<Job> jobs = new ArrayList<>();

    @Size(max = 500, message = "Description must be less than 500 characters.")
    private String description;

    public Skill(){};

    public Skill(String description){
        super();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}