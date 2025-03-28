package repository;

import fr.efrei.cinemabookingproject1.domain.Staff;
import fr.efrei.cinemabookingproject1.repository.impl.StaffImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//222134763
public class StaffRepositoryTest {
    @Test
    public void testAddAndRetrieveStaff() {
        // Arrange
        StaffRepository staffRepository = new StaffImplementation();
        Staff staff = new Staff.Builder()
                .setName("Jane Doe")
                .setRole("Cashier")
                .setEmployeeId("EMP67890")
                .build();

        // Act
        staffRepository.addStaff(staff);
        Staff retrievedStaff = staffRepository.getAllStaff().get(0);

        // Assert
        assertEquals(staff.getName(), retrievedStaff.getName());
        assertEquals(staff.getRole(), retrievedStaff.getRole());
        assertEquals(staff.getEmployeeId(), retrievedStaff.getEmployeeId());
    }
}
