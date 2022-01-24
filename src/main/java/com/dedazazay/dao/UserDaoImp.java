package com.dedazazay.dao;

import com.dedazazay.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDaoImp implements UserDao{

    @PersistenceContext
    public EntityManager em;
    
    @Override
    public List<User> list() {
        TypedQuery<User> namedQuery = em.createNamedQuery("User.getAll", User.class);
        return namedQuery.getResultList();
    }

    @Override
    public User show(int id) {
        return em.find(User.class, id);
    }

    @Override
    @Transactional
    public void save(User user) {
        em.merge(user);
    }


    @Override
    @Transactional
    public void delete(int id) {
        em.remove(show(id));
    }
}
