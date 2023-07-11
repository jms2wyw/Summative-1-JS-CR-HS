package com.company.summativeproject.model;

import java.util.Objects;

public class Definition {
    private int id;
    private String word;
    private String definition;
    public Definition(){


    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }



    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition that = (Definition) o;
        return getId() == that.getId() &&
                Objects.equals(getWord(), that.getWord()) &&
                Objects.equals(getDefinition(), that.getDefinition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWord(), getDefinition());
    }
}
