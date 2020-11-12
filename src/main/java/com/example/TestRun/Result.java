package com.example.TestRun;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public String section = "movies";
    public String subsection = "";
    public String title = "Meet Maria Bakalova, the Breakout Star of the ‘Borat’ Sequel";

    // use this annotation during deserialization when the property
    // names of the JSON and the field names of the Java object do not match
    @JsonProperty("abstract")
    public String abstracted = "The actress, who plays the title character’s daughter, " +
            "Tutar, talks about body hair, her nonbiological father” Sacha Baron Cohen, and that scene with Rudy Giuliani.";

    public String url = "https://www.nytimes.com/2020/11/11/movies/maria-bakalova-borat.html";
    public String uri = "nyt://article/8c339e02-f9bc-568d-8cfc-f5796118ff37";
    public String byline = "By Dave Itzkoff";
    public String item_type = "Article";
    public String updated_date = "2020-11-11T13:36:06-05:00";
    public String created_date = "2020-11-11T09:04:46-05:00";
    public String published_date = "2020-11-11T09:04:46-05:00";
    public String material_type_facet = "";
    public String kicker = "";

    public String[] des_facet = {"Movies", "Actors and Actresses", "Borat Subsequent Moviefilm (Movie)"};
    public String[] org_facet = {"Amazon.com Inc"};
    public String[] per_facet = {"Maria Bakalova", "Cohen, Sacha Baron", "Giuliani, Rudolph W"};

    public List<Multimedia> multimedia;

    public Result() {

        multimedia = new ArrayList<>();

        Multimedia newMulti = new Multimedia();
        multimedia.add(newMulti);

    }


    public String getSection() {
        return section;
    }

    public String getSubsection() {
        return subsection;
    }

    public String getTitle() {
        return title;
    }

    public String getAbstracted() {
        return abstracted;
    }

    public String getUrl() {
        return url;
    }

    public String getUri() {
        return uri;
    }

    public String getByline() {
        return byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public String[] getDes_facet() {
        return des_facet;
    }

    public String[] getOrg_facet() {
        return org_facet;
    }

    public String[] getPer_facet() {
        return per_facet;
    }

    public List<Multimedia> getMultimedia() {
        return multimedia;
    }

    public class Multimedia {

        String url = "https://static01.nyt.com/images/2020/11/12/arts/11maria-bakalova2/11maria-bakalova2-superJumbo-v2.jpg";
        String format = "superJumbo";
        long height = 2048;
        long width = 1536;
        String type = "image";
        String subtype = "photo";
        String caption = "Bakalova in West Hollywood, Calif. In her native Bulgaria, she was a “super-disciplined” " +
                "child who hadn’t seen the original “Borat.”";
        String copyright = "Elizabeth Weinberg for The New York Times";

        public String getUrl() {
            return url;
        }

        public String getFormat() {
            return format;
        }

        public long getHeight() {
            return height;
        }

        public long getWidth() {
            return width;
        }

        public String getType() {
            return type;
        }

        public String getSubtype() {
            return subtype;
        }

        public String getCaption() {
            return caption;
        }

        public String getCopyright() {
            return copyright;
        }
    }
}


