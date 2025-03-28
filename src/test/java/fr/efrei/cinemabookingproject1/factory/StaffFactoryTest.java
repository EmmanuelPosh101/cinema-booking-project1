package fr.efrei.cinemabookingproject1.factory;

import fr.efrei.cinemabookingproject1.domain.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffFactoryTest {
    @Test //Author: sinokhanyontantiso
    public void testCreateStaff() {
        //We are Arranging staff
        String name = "John Doe";
        String role = "Manager";
        String employeeId = "EMP12345";

        // Action
        Staff staff = StaffFactory.createStaff(name, role, employeeId);

        // We are Asserting staff here
        assertEquals(name, staff.getName());
        assertEquals(role, staff.getRole());
        assertEquals(employeeId, staff.getEmployeeId());
    }
}
