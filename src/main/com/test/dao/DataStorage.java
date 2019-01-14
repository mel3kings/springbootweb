package com.test.dao;

import com.test.data.Data;

public interface DataStorage {
    boolean save(Integer id, Data data);
    Data fetch(Integer id);
    Integer getCurrentId();
}
