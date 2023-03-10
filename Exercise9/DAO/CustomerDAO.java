package Exercise9.DAO;

import java.util.Collection;

import Exercise9.DTO.CustomerDTO;

public abstract class CustomerDAO {
    public abstract CustomerDTO findByID(int customerId);
	public abstract CustomerDTO findByName(String customerName);
	public abstract Collection<CustomerDTO> findAll();
	public abstract CustomerDTO updateUser(CustomerDTO customerDTO);
	public abstract int deleteUserByID(int customerId);
}