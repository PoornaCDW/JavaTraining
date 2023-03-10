package Exercise9.DAO;

import java.util.Collection;

import Exercise9.DTO.ItemMasterDTO;

public abstract class ItemMasterDAO {
	public abstract ItemMasterDTO findByID(int itemNumber);
	public abstract Collection<ItemMasterDTO> findAll();
	abstract public ItemMasterDTO update(ItemMasterDTO itemMasterDTO);
	abstract public int deleteItem(ItemMasterDTO itemMasterDTO);
}