package baisc;

public class gani {
	   int[] studentIds = {101, 102, 103, 104, 105}; // Example student IDs
       int maxId = studentIds[0];
       for (int id : studentIds) {
           if (id > maxId) {
               maxId = id;
           }
       }
       System.out.println("Largest student ID: " + maxId);
   }