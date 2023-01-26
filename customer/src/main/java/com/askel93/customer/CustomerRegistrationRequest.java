package com.askel93.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
        ) {
}
