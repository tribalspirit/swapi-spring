package com.example.swapispring.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(long id) {
        super("Could not found resource " + id);
    }
}
