package com.example.lunar.model;

public class EnglishMultipleChoice {
    private String analysis;
    private String choice_a;
    private String choice_b;
    private String choice_c;
    private String choice_d;
    private String correct_choice;
    private String topic;

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getChoice_a() {
        return choice_a;
    }

    public void setChoice_a(String choice_a) {
        this.choice_a = choice_a;
    }

    public String getChoice_b() {
        return choice_b;
    }

    public void setChoice_b(String choice_b) {
        this.choice_b = choice_b;
    }

    public String getChoice_c() {
        return choice_c;
    }

    public void setChoice_c(String choice_c) {
        this.choice_c = choice_c;
    }

    public String getChoice_d() {
        return choice_d;
    }

    public void setChoice_d(String choice_d) {
        this.choice_d = choice_d;
    }

    public String getCorrect_choice() {
        return correct_choice;
    }

    public void setCorrect_choice(String correct_choice) {
        this.correct_choice = correct_choice;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "EnglishMutipleChoice{" +
                "analysis='" + analysis + '\'' +
                ", choice_a='" + choice_a + '\'' +
                ", choice_b='" + choice_b + '\'' +
                ", choice_c='" + choice_c + '\'' +
                ", choice_d='" + choice_d + '\'' +
                ", correct_choice='" + correct_choice + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
