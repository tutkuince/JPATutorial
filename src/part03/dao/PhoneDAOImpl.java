package part03.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import part03.model.Phone;

public class PhoneDAOImpl implements PhoneDAO {

	private EntityManager entityManager;

	public PhoneDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void insertPhone(Phone phone) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(phone);
		transaction.commit();
	}

	@Override
	public Phone getPhoneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Phone> getPhoneListByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Phone> getPhoneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePhoneById(int id) {
		// TODO Auto-generated method stub

	}

}
