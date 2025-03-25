package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Staff;

public class StaffFactory {
    public static Staff createStaff(String name, String role, String employeeId) {
        return new Staff.Builder()
                .setName(name)
                .setRole(role)
                .setEmployeeId(employeeId)
                .build();
    }
}
