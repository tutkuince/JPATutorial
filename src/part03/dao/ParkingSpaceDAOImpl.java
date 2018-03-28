package part03.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import part03.model.ParkingSpace;

public class ParkingSpaceDAOImpl implements ParkingSpaceDAO{

	private EntityManager entityManager;
	
	public ParkingSpaceDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void insertParkingSpace(ParkingSpace parkingSpace) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(parkingSpace);
		transaction.commit();
	}

	@Override
	public ParkingSpace getParkingSpaceById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ParkingSpace> getParkingSpaceList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteParkingSpace(int id) {
		// TODO Auto-generated method stub
		
	}

}
