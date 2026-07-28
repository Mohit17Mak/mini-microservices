package com.campus.course_service;

public record EnrollmentEvent(Long courseId, Long studentId, String studentName) { }