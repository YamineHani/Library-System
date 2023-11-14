/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
/**
 *
 * @author yasmi
 */
abstract class Database {
    private ArrayList<Information> records;
    private String fileName;

    public Database( String fileName) {
        records = new ArrayList<>();
        this.fileName = fileName;
    }


    public void readFromFile(){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line= br.readLine()) != null){
                insertRecord(createRecordFrom(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public abstract Information createRecordFrom(String line);


    public ArrayList<Information> returnAllRecords(){
        return records;
    }

    public boolean contains(String key){
//        Optional<String> id = records.stream()
//                .filter(r->r.getSearchKey().equals(key))
//                .map(r->r.getSearchKey()).findFirst();
//        if(id.isEmpty()) return false;
//        return true;
        for(int i = 0; i < records.size(); i++){
            if(records.get(i).getSearchKey().equals(key))
                return true;
        }
        return false;
    }

    public Information getRecord(String key){
        for(int i = 0; i < records.size(); i++){
            if(records.get(i).getSearchKey().equals(key)) {
                return records.get(i);
            }
        }
        return null;
    }

    public void insertRecord(Information record){
        if(contains(record.getSearchKey()))
            System.out.println("Used");
        else
            records.add(record);
    }


    public void deleteRecord(String key){
        records.remove(getRecord(key));
    }

    public void saveToFile()  {
        try{
            Formatter f = new Formatter(fileName);
            for (int i = 0; i < records.size() ; i++)
                f.format(records.get(i).lineRepresentation()+"\n");
            f.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
