package part03.dao;

import java.util.List;

import part03.model.Phone;

public interface PhoneDAO {
	public void insertPhone(Phone phone);
	public Phone getPhoneById(int id);
	public List<Phone> getPhoneListByEmployeeId(int employeeId);
	public List<Phone> getPhoneList();
	public void deletePhoneById(int id);
}
