package repository;

import fr.efrei.cinemabookingproject1.domain.Staff;
import fr.efrei.cinemabookingproject1.repository.impl.StaffImplementation;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffRepositoryTest {
    @Test
    public void testAddAndRetrieveStaff() {
        // Arrange
        StaffRepository staffRepository = new StaffImplementation();
        Staff staff = new Staff.Builder()
                .setName("Alice Smith")
                .setRole("Manager")
                .setEmployeeId("EMP001")
                .build();

        // Act
        staffRepository.addStaff(staff);
        Staff retrievedStaff = staffRepository.getAllStaff().get(0);

        // Assert
        assertEquals(staff.getName(), retrievedStaff.getName());
        assertEquals(staff.getRole(), retrievedStaff.getRole());
        assertEquals(staff.getEmployeeId(), retrievedStaff.getEmployeeId());
    }

    @Test
    public void testFindStaffById() {
        // Arrange
        StaffRepository staffRepository = new StaffImplementation();
        Staff staff = new Staff.Builder()
                .setName("Bob Johnson")
                .setRole("Cashier")
                .setEmployeeId("EMP002")
                .build();
        staffRepository.addStaff(staff);

        // Act
        Staff foundStaff = staffRepository.findStaffById("EMP002");

        // Assert
        assertEquals(staff.getName(), foundStaff.getName());
    }

    public abstract class StaffImplementation implements StaffRepository {
        @Override
        public void addStaff(Staff staff) {

        }

        @Override
        public List<Staff> getAllStaff() {
            return List.of();
        }
    }
}