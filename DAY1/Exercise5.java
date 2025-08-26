import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args){


        int[] RealArray = {1 ,2 ,3 ,4 , 5};
        System.out.println(Arrays.toString(RealArray));

        int[] referencecopy = RealArray;
        referencecopy[0] = 7;

        System.out.println(Arrays.toString(RealArray));
        System.out.println(Arrays.toString(referencecopy));



        int [] copycopy =  Arrays.copyOf(RealArray, RealArray.length);
        copycopy[0] = 1;

        System.out.println(Arrays.toString(RealArray));
        System.out.println(Arrays.toString(copycopy));
    }
}



/* note that reference copy change point towards the address while copy of copy the data in new address for ex ->
 * 
 @KAVYA-29-ai ➜ /workspaces/JavaClass (main) $  cd /workspaces/JavaClass ; /usr/bin/env /usr/local/sdkman/candidates/java/21.0.7-ms/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/2fd91a79/redhat.java/jdt_ws/JavaClass_e8512cb4/bin Exercise5 
[1, 2, 3, 4, 5]
[1000, 2, 3, 4, 5]
[1000, 2, 3, 4, 5]
@KAVYA-29-ai ➜ /workspaces/JavaClass (main) $ ^C
 */


 /*correct  way 
    int[] referencecopy = new int[RealArray.size];

    for(int i = 0,i<RealArray.length;i++){
    b[i]= realarray[i];
    }

        System.out.println(Arrays.toString(RealArray));
        System.out.println(Arrays.toString(referencecopy));
 */