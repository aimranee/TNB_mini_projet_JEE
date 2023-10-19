package com.example.tnb.service;

import com.example.tnb.dao.IDao;
import com.example.tnb.entity.Categrie;
import com.example.tnb.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategorieService implements IDao<Categrie> {

    @Autowired
    private CategorieRepository tr;

    @Override
    public Categrie save(Categrie o) {
        return tr.save(o);
    }

    @Override
    public void update(Categrie o) {
        tr.save(o);
    }

    @Override
    public void delete(Categrie id) {
        tr.delete(id);
    }

    @Override
    public Categrie findById(int id) {
        return tr.findById(id);
    }

    @Override
    public List<Categrie> findAll() {
        return tr.findAll();
    }
}
