package repository;

import fr.efrei.cinemabookingproject1.domain.Staff;

import java.util.List;
//Sinokhanyo Ntantiso 222134763

public interface StaffRepository {
    void addStaff(Staff staff);
    List<Staff> getAllStaff();
}
