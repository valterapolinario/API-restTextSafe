package com.example.apiRestBetlab.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
public class TextSafe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public TextSafe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextSafe textSafe = (TextSafe) o;
        return Objects.equals(id, textSafe.id) && Objects.equals(description, textSafe.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        return "TextSafe{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
