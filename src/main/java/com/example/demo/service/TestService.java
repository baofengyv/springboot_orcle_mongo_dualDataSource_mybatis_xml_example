package com.example.demo.service;

import com.example.demo.dao.xxt.EncounterMapper;
import com.mongodb.MongoClient;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    @Resource
    EncounterMapper encounterMapper;

    @Autowired
    MongoClient mongoClient;

    public Map x() {

        Document d = new Document();
        d.append("field","value");

        mongoClient
                .getDatabase("db1")
                .getCollection("t1")
                .insertOne(d);

        Map r = new HashMap();
        r.put("x", encounterMapper.selectByPrimaryKey(1L));
        r.put("x2", mongoClient.listDatabaseNames());
        return r;
    }
}
