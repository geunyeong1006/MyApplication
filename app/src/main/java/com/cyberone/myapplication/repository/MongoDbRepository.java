package com.cyberone.myapplication.repository;//package com.cyberone.myapplication.repository;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.BasicDBObject;
//import org.bson.Document;
//import com.mongodb.client.FindIterable;
//
//
//public class MongoDbRepository {
//
//    private MongoClient mongoClient;
//    private MongoDatabase database;
//
//    public void mongoDbRepository() {
//        // MongoDB 연결 설정
//        mongoClient = MongoClients.create("mongodb://10.179.10.46:27017");
//        database = mongoClient.getDatabase("prom");
//    }
//
//    // MongoDB에서 데이터를 조회하는 메서드 예시
//    public FindIterable<Document> findList(String sCollectionName, BasicDBObject condition, BasicDBObject sort) throws Exception {
//        return database.getCollection(sCollectionName).find(condition).sort(sort);
//    }
//}
