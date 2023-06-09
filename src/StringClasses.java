public class StringClasses {
    public static void main(String[] args) {
        // try catch문 사용
       try {
           String name = "Ara JO";
           name.equalsIgnoreCase("Ara JO"); // true
           name.equalsIgnoreCase("Ara ");// false
          
           String name_second = new String("Friend Jane !");
            name_second.equals("Friend Jane !");    //true
            name_second.length();   //13   
            name_second = name_second.replaceAll("e", "a"); //"Friand Jana !"
            String[] arrays = name_second.split(" ");
            String name_substring = name_second.substring(3, 11);   //"and Jana"
            System.out.println();
            //arrayList.set(1,5);

        } catch (Exception e) {
           // TODO: handle exception
       } 
       
       System.out.println();
      // return 0; 
   }
} 

