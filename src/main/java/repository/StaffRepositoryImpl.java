package repository;

import fr.efrei.cinemabookingproject1.domain.Staff;
import fr.efrei.cinemabookingproject1.repository.StaffRepository;

import java.util.ArrayList;
import java.util.List;
//222134763
public class StaffRepositoryImpl implements StaffRepository{
    private final List<Staff> staffList = new ArrayList<>();

    @Override
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    @Override
    public List<Staff> getAllStaff() {
        return new ArrayList<>(staffList);
    }
}
