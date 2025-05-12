package com.educandoweb.course.services.excpections;

public class ResourceNotFindExcpetion extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ResourceNotFindExcpetion(Object id) {
        super("Resource not found. Id "+id);
    }
}
