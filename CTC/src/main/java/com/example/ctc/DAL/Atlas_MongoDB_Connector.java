package com.example.ctc.DAL;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Atlas_MongoDB_Connector extends AbstractMongoDB_Connector implements IMongoDBConnector {

    public Atlas_MongoDB_Connector() {
        this.host = "cockster0.dg3xywk.mongodb.net";
        this.port = 27017;
        this.user = "fornitejimmy23";
        this.password = "bigcappy23";
        this.dbname = "ProjetDB";
        connect();
    }

    @Override
    public void connect() {
        String connectionString = "mongodb+srv://fornitejimmy23:<password>@cockster0.dg3xywk.mongodb.net/?retryWrites=true&w=majority";

        MongoClientURI uri = new MongoClientURI(connectionString);
        MongoClient mongoClient = new MongoClient(uri);

        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        this.database = mongoClient.getDatabase(dbname).withCodecRegistry(pojoCodecRegistry);
    }

    @Override
    public MongoDatabase getDatabase() {
        return this.database;
    }

}

