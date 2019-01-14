package com.test.dao;

import com.test.data.Data;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class LocalDataStorage implements DataStorage {
    /** Pseudo local data storage */
    private final HashMap<Integer, Data> LOCAL_DATA = new HashMap<>();
    private static int ID = 0;


    public boolean save(Integer id, Data data){
        try{
            LOCAL_DATA.put(++ID, data);
            return true;
        } catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    public Data fetch(Integer id){
        return LOCAL_DATA.get(id);
    }

    public Integer getCurrentId(){
        return ID;
    }

}
