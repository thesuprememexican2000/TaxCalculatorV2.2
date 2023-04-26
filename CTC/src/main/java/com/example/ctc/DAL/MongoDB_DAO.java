//package com.example.ctc.DAL;
//
//import com.mongodb.client.MongoCollection;
//import com.example.ctc.BLL.Model.TaxBracket;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MongoDB_DAO implements ITaxBracket{
//    private static MongoDB_DAO instance = null;
//    IMongoDBConnector mongoDriver;
//
//    public MongoDB_DAO() {
//        this.mongoDriver = new Atlas_MongoDB_Connector();
//    }
//
//    public static MongoDB_DAO getInstance(){
//        if(instance==null)
//            instance = new MongoDB_DAO();
//        return instance;
//    }
//
//    @Override
//    public List<TaxBracket> findAllBrackets() {
//        MongoCollection<TaxBracket> collection = this.mongoDriver.getDatabase().getCollection("CanadaTaxBracket", TaxBracket.class);
//        List<TaxBracket> brackets = collection.find().into(new ArrayList<TaxBracket>());
//        return brackets;
//    }
//}
