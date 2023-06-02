package com.kodilla.dependency_injection.homework1;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService {
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            return false;
        }
        return true;
    }
}
