package com.labibliotheque.la_bibliotheque.models;

import lombok.Data;
import java.util.Date;

@Data
public class Comment {
    private int id;
    private Date commentDate;
    private int ratting;
}
