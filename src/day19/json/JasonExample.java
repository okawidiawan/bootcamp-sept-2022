package day19.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class JasonExample {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Foo");
        user.setNum(100);
        user.setBalance(1000.21d);
        user.setIsVip(Boolean.TRUE);

        try {

            // Generating Object to JSON
            ObjectMapper mapper = new JsonMapper();
            String userJson = mapper.writeValueAsString(user);
            System.out.println(userJson);

            // Parsing String JSON to java Object
            String userJsonPlain = "{\"name\":\"Foo\",\"num\":100,\"balance\":1000.21,\"isVip\":true}";
            User userParsedFromJson = mapper.readValue(userJsonPlain, User.class);
            System.out.println(userParsedFromJson);

        } catch (JsonProcessingException e) {
            System.out.println(e);
        }
    }

}
