package ra.model.serviceImp;

import ra.model.dao.CatalogDao;
import ra.model.daoImp.CatalogDaoImp;
import ra.model.entity.CatalogCombobox;
import ra.model.entity.CatalogInfo;
import ra.model.service.CatalogService;

import java.util.List;

public class CatalogServiceImp implements CatalogService<CatalogInfo,Integer> {
    private CatalogDao<CatalogInfo,Integer> catalogDao = new CatalogDaoImp();
    @Override
    public List<CatalogInfo> findAll() {
        return catalogDao.findAll() ;
    }

    @Override
    public CatalogInfo findById(Integer id) {
        return catalogDao.findById(id);
    }

    @Override
    public boolean save(CatalogInfo catalogInfo) {
        return catalogDao.save(catalogInfo);
    }

    @Override
    public boolean update(CatalogInfo catalogInfo) {
        return catalogDao.update(catalogInfo);
    }

    @Override
    public boolean delete(Integer id) {
        return catalogDao.delete(id);
    }

    @Override
    public List<CatalogInfo> searchByName(String name) {
        return catalogDao.searchByName(name);
    }

    @Override
    public List<CatalogCombobox> findCatalogCombobox() {
        return catalogDao.findCatalogCombobox();
    }
}
