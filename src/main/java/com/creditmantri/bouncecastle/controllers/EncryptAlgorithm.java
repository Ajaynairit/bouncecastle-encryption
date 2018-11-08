package com.creditmantri.bouncecastle.controllers;

public class Greeting {

    private final long id;
    private final String content;
	
    @AutoWired
    General general;

    public encryptAlgorithm(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return general.shaHashing(content);
    }
}
