package PersonalOrganizer;

import java.util.ArrayList;

import java.util.Scanner;


class Task {

    // Attribute

    private String title;
    private String description;


    // Constructor

    public Task(String title, String description) {

        this.title = title;

        this.description = description;

    }

    // Get title

    public String getTitle() {

        return title;

    }

    // Get description

    public String getDescription() {

        return description;

    }



    // Override method toString()

    @Override

    public String toString() {

        return "Judul: " + title + " | Deskripsi: " + description;

    }

}
