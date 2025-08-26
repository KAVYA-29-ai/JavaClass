public class Exercise8 {
    public static void main(String[] args){
        String[] names = {"abc", "bcd", "cde", "def", "efg"};
        String target = "cde";  

        boolean found = false;

        for(String s : names){
            if(s.equals(target)){   
                System.out.println("The value is present");
                found = true;
                break;  
            }
        }

        if(!found){
            System.out.println("The value is not present");
        }
    }
}
