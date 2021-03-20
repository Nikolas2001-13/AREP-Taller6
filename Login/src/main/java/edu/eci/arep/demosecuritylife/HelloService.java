package edu.eci.arep.demosecuritylife;

import static spark.Spark.*;

public class HelloService 
{
    public static void main(String... args) {
        port(getPort());
        secure ("keyscerts/ecikeystore.p12", "123456", null, null);
        get("/helloservice", (req, res)->"Hello from secure service");
    }

    public static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost) 
    }
}
