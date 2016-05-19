package com.is.sugar.domain;

import com.orm.SugarRecord;

/**
 * Created by George on 2016/5/19.
 */
public class Book extends SugarRecord {

    public String title;
    public String edition;

    public Book(){
    }

    public Book(String title, String edition){
        this.title = title;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", edition='" + edition + '\'' +
                '}';
    }
}