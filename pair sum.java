import java.io.*;
import java.util.*;
class TestCaseGenerator{
    public static void main(String[] args)throws IOException {

        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random rm = new Random();
        
        /* Write Your Code Here. */
        
        for(int ii=0;ii<2;ii++){
            String in="";
            String out="";


            int n=rm.nextInt(1000)+10;
            
            int arr[]=new int[n];
            
            in=randomIntArray(arr,1,1000);Arrays.sort(arr);

            int l=0,r=n-1;
            int ele=0;

            ele=arr[rm.nextInt(n)]+arr[rm.nextInt(n)];
            //ele=rm.nextInt(1000);
            
            in=in+"\n"+ele;
            
            boolean flag=true;
        
            while(l<r){
                if(arr[l]+arr[r]==ele){
                    out=arr[l]+" and "+arr[r];
                    flag=false;
                    break;
                }
                else if(arr[l]+arr[r]>ele)     r--;
                else    l++;
        }


            if(flag)    out="-1";

            System.out.println(Arrays.toString(arr));
            System.out.println(out);

            //input.add(in);
            //output.add(out);
        }//for 
        
        try{
            for(int i = 0; i < input.size(); i++){
                String count = String.valueOf(i);
                if(i / 10 == 0) count = "0" + count;
                FileWriter fw = new FileWriter("Result/input/input" + count + ".txt");
                fw.write(input.get(i));
                fw.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            for(int i = 0; i < output.size(); i++){
                String count = String.valueOf(i);
                if(i / 10 == 0) count = "0" + count;
                FileWriter fw = new FileWriter("Result/output/output" + count + ".txt");
                fw.write(output.get(i));
                fw.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    static String binaryString(int n){
        String s="";
        for(int i = 0; i < n; i++)
            {
                int x = (1 + (int)(Math.random() * 100)) % 2;
                s = s + String.valueOf(x);
            }
        return s;
    }

    static String randomIntArray(int[] arr,int l, int r){
        Random rand = new Random();
        String str = "";
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.ints(l, (r + 1)).findFirst().getAsInt();
            str += (String.valueOf(arr[i]) + " ");
        }
        return str;
    }

}

/*randomize array
for (int i=0; i<arr.length; i++) {
		        int randomPosition = rm.nextInt(arr.length);
		        int temp = arr[i];
		        arr[i] = arr[randomPosition];
		        arr[randomPosition] = temp;
		}
*/
