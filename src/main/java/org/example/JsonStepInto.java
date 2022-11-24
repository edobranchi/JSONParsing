package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import static org.example.Encoding.encoding;

public class JsonStepInto {

    //recursive Step into a JSONObject
    public JsonStepInto(JSONObject jsonObject, HashMap saveMap) throws NoSuchAlgorithmException {
        JSONArray jsonArray = jsonObject.names();
        System.out.println();
        for (int i = 0; i < jsonArray.length(); i++) {
            String key = jsonArray.getString(i); // Here's your key
            if(jsonObject.get(key) instanceof JSONObject){
                new JsonStepInto(jsonObject.getJSONObject(key),saveMap);
                continue;
            }
            if(jsonObject.get(key) instanceof JSONArray){
                new JsonStepInto(jsonObject.getJSONArray(key),saveMap);
                continue;
            }
            System.out.print(key + ": ");
            Object value = jsonObject.get(key);
            saveMap.put(key,encoding(value));
            System.out.println("'" + value + "'");
        }

    }


    //Recursive step into a JsonArray
    public JsonStepInto(JSONArray jsonArray,HashMap saveMap) throws NoSuchAlgorithmException {
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            jsonArray = jsonObject.names();
            System.out.println();
            for (int i = 0; i < jsonArray.length(); i++) {
                String key = jsonArray.getString(i); // Here's your key
                if(jsonObject.get(key) instanceof JSONObject){
                    new JsonStepInto(jsonObject.getJSONObject(key),saveMap);
                    continue;
                }
                if(jsonObject.get(key) instanceof JSONArray){
                    new JsonStepInto(jsonObject.getJSONArray(key),saveMap);
                    continue;
                }
                System.out.print(key + ": ");
                Object value = jsonObject.get(key);// Here's your value
                saveMap.put(key,encoding(value));
                System.out.println("'" + value + "'");

            }
        }
        }

