package part03.dao;

import java.util.List;

import part03.model.ParkingSpace;

public interface ParkingSpaceDAO {
	public void insertParkingSpace(ParkingSpace parkingSpace);
	public ParkingSpace getParkingSpaceById(int id);
	public List<ParkingSpace> getParkingSpaceList();
	public void deleteParkingSpace(int id);
}
