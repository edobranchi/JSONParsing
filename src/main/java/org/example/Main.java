package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;


class Main{
public static void main(String[] args) throws NoSuchAlgorithmException {

    //String json = getJsonFromUrl("https://mocki.io/v1/9da1680d-ce2b-4c70-981b-3c8c27453c5a");
    String response ="{\"service_uri\":\"http://www.disit.org/km4city/resource/iot/iotobsf/Organization/sssssssssss\",\"id\":\"sssssssssss\",\"type\":\"test\",\"kind\":\"sensor\",\"protocol\":\"ngsi\",\"format\":\"json\",\"macaddress\":\"\",\"model\":\"ModelTest\",\"producer\":\"\",\"latitude\":\"43.81055\",\"longitude\":\"11.43745\",\"frequency\":\"600\",\"organization\":\"Organization\",\"ownership\":\"private\",\"subnature\":\"\",\"broker\":{\"name\":\"iotobsf\",\"type\":\"ngsi\",\"ip\":\"orion\",\"port\":\"1026\",\"login\":\"\",\"password\":\"\",\"latitude\":\"43.81917\",\"longitude\":\"11.37085\",\"created\":\"2022-04-1411:08:14\"},\"attributes\":[{\"value_name\":\"temperature\",\"data_type\":\"json\",\"value_type\":\"temperature\",\"value_unit\":\"°F\",\"healthiness_criteria\":\"refresh_rate\",\"value_refresh_rate\":\"300\",\"order\":1}]}";
    //parsing + save in una mappa key/hash
    JSONObject jsonObject= new JSONObject(response);
    HashMap<String, Object> saveMap = new HashMap<String, Object>();
    System.out.println("--------------JSON DATA:----------------");
    new JsonStepInto(jsonObject,saveMap);
    System.out.println("--------------MAP PARAMETRO/HASH:----------------");
    System.out.println(saveMap);
    }
}
//    public static JSONObject getJsonFromUrl(String url) throws IOException {
//        URL urll = new URL(url);
//        HttpURLConnection conn = (HttpURLConnection) urll.openConnection();
//        conn.setRequestMethod("GET");
//        conn.setRequestProperty("Accept", "application/json");
//
//        if (conn.getResponseCode() != 200) {
//            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
//        }
//
//        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
//
//        String output;
//        StringBuilder stringa = new StringBuilder();
//        while ((output = br.readLine()) != null) {
//            stringa.append(output);
//        }
//
//        conn.disconnect();
//        return stringa.toString();
//    }



