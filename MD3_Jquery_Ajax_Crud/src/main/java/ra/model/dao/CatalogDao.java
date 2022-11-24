package ra.model.dao;

import ra.model.entity.CatalogCombobox;

import java.util.List;

public interface CatalogDao<T,V> extends AppDao<T,V>{
    List<T> searchByName(String name);
    List<CatalogCombobox> findCatalogCombobox();
}
