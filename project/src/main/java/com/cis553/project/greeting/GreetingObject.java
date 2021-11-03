package com.cis553.project.greeting;

public class GreetingObject {
    private final long id;
    private final String content;

    public GreetingObject(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
