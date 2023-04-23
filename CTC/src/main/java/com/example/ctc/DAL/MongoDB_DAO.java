package com.example.ctc.DAL;

import com.mongodb.client.MongoCollection;

import com.example.ctc.BLL.Model.TaxBracket;

import java.util.ArrayList;
import java.util.List;

public class MongoDB_DAO implements ITaxBracket{

    IMongoDBConnector mongoDriver;

    public MongoDB_DAO() {
        this.mongoDriver = new Atlas_MongoDB_Connector();
    }

    @Override
    public List<TaxBracket> findAllBrackets() {
        MongoCollection<TaxBracket> collection = this.mongoDriver.getDatabase().getCollection("CanadaTaxBracket", TaxBracket.class);
        List<TaxBracket> brackets = collection.find().into(new ArrayList<TaxBracket>());
        return brackets;
    }
}
