package myname;

import com.google.gson.Gson;


public class App {
    public static void main(String[] args) {
        String name = "Yuliia";
        String lastName = "Duliepova";

        DTO dto = new DTO(name, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(dto);

        System.out.println(json);
    }
}