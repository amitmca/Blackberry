package com.srcsys;
import net.rim.device.api.system.Application;
import net.rim.device.api.database.*;
import net.rim.device.api.io.*;

public class CreateDatabase extends Application
{
    public static void main(String[] args)
    {
        CreateDatabase app = new CreateDatabase();
        try
        {
            URI strURI = URI.create("file:///SDCard/test.db"); 
            DatabaseFactory.create(strURI);
            System.out.println("Database Created");
        }
        catch ( Exception e ) 
        {         
            System.out.println( e.getMessage() );
        }  
    } 
}