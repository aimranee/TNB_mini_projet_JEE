package com.example.tnb.service;

import com.example.tnb.dao.IDao;
import com.example.tnb.entity.Redevable;
import com.example.tnb.repository.RedevableRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RedevableService implements IDao<Redevable> {
    @Autowired
    private RedevableRepository tr;

    @Override
    public Redevable save(Redevable o) {
        return tr.save(o);
    }

    @Override
    public void update(Redevable o) {
        tr.save(o);
    }

    @Override
    public void delete(Redevable id) {
        tr.delete(id);
    }

    @Override
    public Redevable findById(int id) {
        return tr.findById(id);
    }

    @Override
    public List<Redevable> findAll() {
        return tr.findAll();
    }
}
